package org.onap.ccsdk.features.sdnr.wt.websocketmanager2.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.net.InetSocketAddress;

import org.eclipse.jetty.websocket.api.Session;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.WebSocketManagerSocket;

public class WebsocketMessageTest {

	private static final String MSG1 = "{\"data\":\"scopes\",\"scopes\":[\"scope1\"]}";
	private static final String MSG2 = "{\"nodename\":\"n1\",\"eventtype\":\"scope1\",\"xmlevent\":\"eventdesc\"}";
	public String expectAnswer;

	@Test
	public void test() {
		MyWebSocketManagerSocket socketToTest = new MyWebSocketManagerSocket();
		Session sess = mock(Session.class);
		InetSocketAddress remoteAdr = new InetSocketAddress("127.0.0.1", 4444);
		when(sess.getRemoteAddress()).thenReturn(remoteAdr);
		socketToTest.onWebSocketConnect(sess);
		// message from client
		this.expectAnswer = MSG1;
		socketToTest.onWebSocketText(MSG1);
		socketToTest.onWebSocketClose(0, "by default");

	}
	public void test2() {
		//message from devmgr (notification)
//		this.expectAnswer = MSG2;
//		socketToTest.onWebSocketText(MSG2);
	}
	private class MyWebSocketManagerSocket extends WebSocketManagerSocket {

		public MyWebSocketManagerSocket() {

		}

		@Override
		public void send(String msg) {
			assertTrue(msg.contains(expectAnswer));
		}

	}
}
