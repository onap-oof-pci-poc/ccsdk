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
package org.onap.ccsdk.features.sdnr.wt.websocketmanager2.websocket;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SyncWebSocketClient extends WebSocketClient {

	public interface WebsocketEventHandler{
		void onMessageReceived(String message);
		void onOpen(ServerHandshake arg0);
		void onClose(int arg0, String arg1, boolean arg2);
		void onError(Exception e);
	}
	
	private static final Logger LOG = LoggerFactory.getLogger(SyncWebSocketClient.class.getName());
	private String messageToSend;
	private final List<WebsocketEventHandler> handlers;
	public SyncWebSocketClient(URI serverUri) {
		super(serverUri);
		this.handlers = new ArrayList<WebsocketEventHandler>();
	}

	public SyncWebSocketClient(String uri) throws URISyntaxException {
		this(new URI(uri));
	}
	public void addEventHandler(WebsocketEventHandler h) {
		this.handlers.add(h);
	}
	public void removeEventHandler(WebsocketEventHandler h) {
		this.handlers.remove(h);
	}
	
	@Override
	public void onClose(int arg0, String arg1, boolean arg2) {
		LOG.debug("socket closed: {} {} {}", arg0, arg1, arg2);
		for(WebsocketEventHandler h:this.handlers) {
			h.onClose(arg0,arg1,arg2);
		}
	}

	@Override
	public void onError(Exception arg0) {
		LOG.warn("error on socket: {}", arg0.getMessage());
		for(WebsocketEventHandler h:this.handlers) {
			h.onError(arg0);
		}
	}

	@Override
	public void onMessage(String arg0) {
		LOG.debug("received message: {}", arg0);
		for(WebsocketEventHandler h:this.handlers) {
			h.onMessageReceived(arg0);
		}
	}

	@Override
	public void onOpen(ServerHandshake arg0) {
		LOG.debug("socket opened");
		if (this.messageToSend != null) {
			LOG.debug("try to send: " + this.messageToSend);
			this.send(this.messageToSend);
			this.messageToSend = null;
		}
		for(WebsocketEventHandler h:this.handlers) {
			h.onOpen(arg0);
		}
	}

	public void openAndSendAsync(String message) {
		this.messageToSend = message;
		this.connect();
	}

	public void openAndSendAndCloseSync(String message) {
		try {
			this.connectBlocking();
		} catch (InterruptedException e) {
			LOG.warn("problem connecting:" + e.getMessage());
			Thread.currentThread().interrupt();
		}
		this.send(message);
		try {
			this.closeBlocking();
		} catch (InterruptedException e) {
			LOG.warn("problem disconnecting:" + e.getMessage());
            Thread.currentThread().interrupt();
		}
	}

}
