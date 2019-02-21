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

import static org.junit.Assert.*;
import java.net.InetSocketAddress;
import java.net.URISyntaxException;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.websocket.server.WebSocketHandler;
import org.eclipse.jetty.websocket.servlet.ServletUpgradeRequest;
import org.eclipse.jetty.websocket.servlet.ServletUpgradeResponse;
import org.eclipse.jetty.websocket.servlet.WebSocketCreator;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;
import org.java_websocket.handshake.ServerHandshake;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.WebSocketManager;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.WebSocketManagerSocket;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.websocket.SyncWebSocketClient;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.websocket.SyncWebSocketClient.WebsocketEventHandler;

public class TestWebsocketClient {

	private static final int PORT = 44242;
	Server server;
	SyncWebSocketClient clientToTest = null;

	@Test
	public void test() {
		try {
			clientToTest = new SyncWebSocketClient(String.format("ws://127.0.0.1:%d/websocket", PORT));

		} catch (URISyntaxException e) {
			fail(e.getMessage());
		}
		if (clientToTest != null) {
			clientToTest.addEventHandler(new WebsocketEventHandler() {

				@Override
				public void onOpen(ServerHandshake arg0) {
					System.out.println("channel opened");
					clientToTest.send("abc");
				}

				@Override
				public void onMessageReceived(String message) {
					System.out.println(String.format("received message: %s", message));

				}

				@Override
				public void onError(Exception e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void onClose(int arg0, String arg1, boolean arg2) {
					System.out.println("channel closed");

				}
			});

			// clientToTest.connect();

		}
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			Thread.interrupted();
		}
	}

	@Before
	public void init() {
		this.server = new Server();
		ServerConnector connector = new ServerConnector(server);
		connector.setPort(PORT);
		server.addConnector(connector);
		WebSocketHandler wshandler1 = new org.eclipse.jetty.websocket.server.WebSocketHandler() {
			@Override
			public void configure(WebSocketServletFactory factory) {
				factory.setCreator((req, resp) -> {
					if (req.getSubProtocols().size() > 0) {
						resp.setAcceptedSubProtocol(req.getSubProtocols().get(0));
					}
					return new WebSocketManagerSocket();
				});
			}
		};
//		HandlerList handlers = new HandlerList();
//		ServletContextHandler wshandler2 = new ServletContextHandler(server, "/");
//		wshandler2.addServlet(WebSocketManager.class, "/websocket");
//		handlers.setHandlers(new Handler[] { wshandler2 });
//		server.setHandler(handlers);
		try
        {
            WebSocketHandler wsHandler = new WebSocketHandler()
            {
                @Override
                public void configure(WebSocketServletFactory factory)
                {
                    factory.getPolicy().setIdleTimeout(1500);
                    factory.setCreator(new WebSocketCreator()
                    {
                        @Override
                        public Object createWebSocket(ServletUpgradeRequest req, ServletUpgradeResponse resp)
                        {
                            return new WebSocketManagerSocket();
                        }
                    });
                }
            };

            server.setHandler(wsHandler);
            server.start();
            server.join();
        }
        catch (Throwable t)
        {
            t.printStackTrace(System.err);
        }
		
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//
//				try {
//					server.start();
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//
//		}).start();

	}

	@After
	public void deinit() {
		if (server != null) {
			try {
				server.stop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
