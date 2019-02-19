package org.onap.ccsdk.features.sdnr.wt.websocketmanager2.test;

import static org.junit.Assert.*;
import java.net.InetSocketAddress;
import java.net.URISyntaxException;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletContextHandler;
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
					System.out.println(String.format("received message: %s",message));
					
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
			

			clientToTest.connect();
			
		}

	}

	@Before
	public void init() {
		this.server = new Server(new InetSocketAddress("127.0.0.1",PORT));
		WebSocketHandler wshandler1 = new org.eclipse.jetty.websocket.server.WebSocketHandler() {
			@Override
			public void configure(WebSocketServletFactory factory) {
				factory.setCreator(new WebSocketCreator() {
					@Override
					public Object createWebSocket(ServletUpgradeRequest req, ServletUpgradeResponse resp) {
						if (req.getSubProtocols().size() > 0) {
							resp.setAcceptedSubProtocol(req.getSubProtocols().get(0));
						}
						return new WebSocketManagerSocket();
					}
				});
			}
		};
		HandlerList handlers = new HandlerList();
		ServletContextHandler wshandler2 = new ServletContextHandler(server, "/");
		wshandler2.addServlet(WebSocketManager.class, "/websocket");
		handlers.setHandlers(new Handler[] { wshandler1, wshandler2 });
		server.setHandler(handlers);
		try {
			server.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
