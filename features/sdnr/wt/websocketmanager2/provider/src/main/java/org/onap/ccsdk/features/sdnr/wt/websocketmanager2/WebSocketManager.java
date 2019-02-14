/*******************************************************************************
 * ============LICENSE_START========================================================================
 * ONAP : ccsdk feature sdnr wt
 * =================================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property. All rights reserved.
 * =================================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * ============LICENSE_END==========================================================================
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.wt.websocketmanager2;

import com.google.common.util.concurrent.ListenableFuture;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;
import org.json.JSONObject;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.WebSocketManagerSocket.EventInputCallback;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.utils.AkkaConfig;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.utils.AkkaConfig.ClusterConfig;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.utils.AkkaConfig.ClusterNodeInfo;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.websocket.SyncWebSocketClient;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.rev150105.WebsocketEventInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.rev150105.WebsocketEventOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.rev150105.WebsocketEventOutputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.rev150105.WebsocketmanagerService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;
import org.opendaylight.yangtools.yang.common.RpcError.ErrorType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebSocketManager extends WebSocketServlet implements WebsocketmanagerService {

	private static final long serialVersionUID = -681665669062744439L;

	private static final Logger LOG = LoggerFactory.getLogger(WebSocketManager.class.getName());
	private static final String APPLICATION_NAME = WebSocketManager.class.getName();
	private static final int PORT = 8181;
	private final EventInputCallback rpcEventInputCallback;
	private final AkkaConfig akkaConfig;
	/**
	 * timeout for websocket with no messages in ms
	 */
	private static final long IDLE_TIMEOUT = 5 * 60 * 1000L;

	private final ArrayList<URI> clusterNodeClients = new ArrayList<>();

	public WebSocketManager() {
		this(null,null);
	}

	public WebSocketManager(AkkaConfig akkaconfig, EventInputCallback cb) {
		super();
		this.akkaConfig = akkaconfig;
		if (cb != null) {
			this.rpcEventInputCallback = cb;
		} else {
			this.rpcEventInputCallback = message -> {
				LOG.debug("onMessagePushed: " + message);
				SyncWebSocketClient client;
				for (URI clientURI : WebSocketManager.this.clusterNodeClients) {
					client = new SyncWebSocketClient(clientURI);
					LOG.debug("try to push message to " + client.getURI());
					client.openAndSendAndCloseSync(message);
				}
			};
		}
		LOG.info("Create servlet for {}", APPLICATION_NAME);
	}

	@Override
	public void configure(WebSocketServletFactory factory) {
		LOG.info("Configure provider for {}", APPLICATION_NAME);
		// set a second timeout
		factory.getPolicy().setIdleTimeout(IDLE_TIMEOUT);
		factory.getPolicy().setMaxBinaryMessageSize(1);
		factory.getPolicy().setMaxTextMessageSize(64 * 1024);

		// register Socket as the WebSocket to create on Upgrade
		factory.register(WebSocketManagerSocket.class);

		AkkaConfig cfg = this.akkaConfig;
		if (cfg == null) {
			try {
				cfg = AkkaConfig.load();
			} catch (Exception e) {
				LOG.warn("problem loading akka config: " + e.getMessage());
			}
		}
		if (cfg != null && cfg.isCluster()) {
			this.initWSClients(cfg.getClusterConfig());
		}
	}

	// ODL in Dublin version generates ListenableFuture that is child of Future.
	@Override
	public ListenableFuture<RpcResult<WebsocketEventOutput>> websocketEvent(WebsocketEventInput input) {
		LOG.debug("Send message '{}'", input);
		RpcResultBuilder<WebsocketEventOutput> result;
		try {
			WebsocketEventOutputBuilder outputBuilder = new WebsocketEventOutputBuilder();
			final String s = input.getXmlEvent();
			WebSocketManagerSocket.broadCast(input.getNodeName(), input.getEventType(), s);
			outputBuilder.setResponse("OK");
			try {
				JSONObject o = new JSONObject();
				o.put(WebSocketManagerSocket.KEY_NODENAME, input.getNodeName());
				o.put(WebSocketManagerSocket.KEY_EVENTTYPE, input.getEventType());
				o.put(WebSocketManagerSocket.KEY_XMLEVENT, input.getXmlEvent());
				this.rpcEventInputCallback.onMessagePushed(o.toString());
			} catch (Exception err) {
				LOG.warn("problem pushing messsage to other nodes: " + err.getMessage());
			}
			result = RpcResultBuilder.success(outputBuilder);
		} catch (Exception e) {
			LOG.warn("Socketproblem: {}", e);
			result = RpcResultBuilder.failed();
			result.withError(ErrorType.APPLICATION, "Exception", e);
		}
		return result.buildFuture();
	}

	/**********************************************************
	 * Private functions
	 */

	private void initWSClients(ClusterConfig clusterConfig) {
		for (ClusterNodeInfo nodeConfig : clusterConfig.getSeedNodes()) {
			if (clusterConfig.isMe(nodeConfig)) {
				continue;
			}
			String url = String.format("ws://%s:%d/websocket", nodeConfig.getRemoteAddress(), PORT);
			try {
				LOG.debug("registering ws client for " + url);
				clusterNodeClients.add(new URI(url));
			} catch (URISyntaxException e) {
				LOG.warn("problem instantiating wsclient for url: " + url);
			}
		}
	}
}
