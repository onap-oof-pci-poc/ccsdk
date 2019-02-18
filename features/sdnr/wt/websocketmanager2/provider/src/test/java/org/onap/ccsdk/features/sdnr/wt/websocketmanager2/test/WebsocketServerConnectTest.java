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
package org.onap.ccsdk.features.sdnr.wt.websocketmanager2.test;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.websocket.api.WebSocketPolicy;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;
import org.json.JSONObject;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.WebSocketManager;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.WebSocketManagerSocket;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.WebSocketManagerSocket.EventInputCallback;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.utils.AkkaConfig;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.rev150105.WebsocketEventInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.rev150105.WebsocketEventOutput;
import org.opendaylight.yangtools.yang.common.RpcResult;

import com.google.common.util.concurrent.ListenableFuture;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.concurrent.ExecutionException;

public class WebsocketServerConnectTest {

	private static final String XML1 = "<notification></notification>";
	private static final String NODENAME = "abc";
	private static final String EVENTTYPE = "test";
	protected boolean responseReceived;

	@Test
	public void test() {
		responseReceived = false;
		AkkaConfig config = null;
		try {
			// config = AkkaConfig.load("akka-singlenode.cfg", true);
			config = AkkaConfig.loadContent(AkkaConfigTest.loadResourceContentAsString("akka-cluster-local.cfg"));
		} catch (Exception e) {
			e.printStackTrace();
			fail("error loading singlenode config");
		}
		EventInputCallback callback = new EventInputCallback() {

			@Override
			public void onMessagePushed(String message) throws Exception {
				JSONObject o = new JSONObject(message);
				assertEquals("message which was pushed is not as expected", XML1,
						o.get(WebSocketManagerSocket.KEY_XMLEVENT));
				assertEquals("nodename which was pushed is not as expected", NODENAME,
						o.get(WebSocketManagerSocket.KEY_NODENAME));
				assertEquals("eventtype which was pushed is not as expected", EVENTTYPE,
						o.get(WebSocketManagerSocket.KEY_EVENTTYPE));
				responseReceived = true;
			}
		};
		WebSocketManager servlet = new WebSocketManager(config, callback);
		WebsocketEventInput input = mock(WebsocketEventInput.class);
		when(input.getXmlEvent()).thenReturn(XML1);
		when(input.getNodeName()).thenReturn(NODENAME);
		when(input.getEventType()).thenReturn(EVENTTYPE);
		ListenableFuture<RpcResult<WebsocketEventOutput>> result = servlet.websocketEvent(input);
		assertNotNull(result);
		RpcResult<WebsocketEventOutput> rpc = null;
		try {
			rpc = result.get();
		} catch (InterruptedException | ExecutionException e) {
			fail(e.getMessage());
		}
		assertNotNull(rpc);
		assertTrue("rpc result was not successful", rpc.isSuccessful());
		assertTrue(rpc.getResult().getResponse().equals("OK"));
		while (!responseReceived) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		WebSocketServletFactory factory = mock(WebSocketServletFactory.class);
		WebSocketPolicy wspolicy = mock(WebSocketPolicy.class);
		when(factory.getPolicy()).thenReturn(wspolicy);
		servlet.configure(factory);

	}

}
