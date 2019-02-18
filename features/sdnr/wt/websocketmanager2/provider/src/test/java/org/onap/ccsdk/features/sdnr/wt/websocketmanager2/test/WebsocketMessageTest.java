package org.onap.ccsdk.features.sdnr.wt.websocketmanager2.test;

import static org.junit.Assert.*;

import java.net.URISyntaxException;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.java_websocket.handshake.ServerHandshake;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.WebSocketManager;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.websocket.SyncWebSocketClient;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.websocket.SyncWebSocketClient.WebsocketEventHandler;

public class WebsocketMessageTest {

	private static final String MSG1 = "{\"data\":{\"sopes\":[]}}";
	private static final int PORT = 54321;
	private Server server;
	private SyncWebSocketClient client1=null;
	private boolean fin=false;
	@Before
	public void init() {
		
		server=new Server(PORT);
		assertNotNull("unable to initialize server");
		ServletContextHandler handlerV1 = new ServletContextHandler(server, "");
		handlerV1.addServlet(WebSocketManager.class,"/websocket");
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { handlerV1 });
		server.setHandler(handlers);
		server.setStopTimeout(2000);
		try {
			server.start();
			System.out.println("server started");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	@After
	public void deinit() {
		
		try {
			server.stop();
			System.out.println("server stopped");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void test() {
		System.out.println("starting test");
		try {
			client1 =new SyncWebSocketClient(String.format("ws://localhost:%d/websocket",PORT));
		} catch (URISyntaxException e) {
			fail(e.getMessage());
		}
		
		
		client1.addEventHandler(new WebsocketEventHandler() {			
			@Override
			public void onOpen(ServerHandshake arg0) {
				System.out.println("sending message");
				client1.send(MSG1);
				
			}
			
			@Override
			public void onMessageReceived(String message) {
				assertTrue(message.contains(MSG1));
				
			}
			
			@Override
			public void onError(Exception e) {
				fail(e.getMessage());
				
			}
			
			@Override
			public void onClose(int arg0, String arg1, boolean arg2) {
				System.out.println(String.format("session closed with code=%d, msg=%s",arg0,arg1));
				fin=true;
				
			}
		});
		client1.connect();
		
	
		while(!fin)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
		client1.close();
	}
	
}
