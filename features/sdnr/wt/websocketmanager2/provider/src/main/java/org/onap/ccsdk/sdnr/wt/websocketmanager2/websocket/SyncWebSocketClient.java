package org.onap.ccsdk.sdnr.wt.websocketmanager2.websocket;

import java.net.URI;
import java.net.URISyntaxException;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SyncWebSocketClient extends WebSocketClient {

	private static final Logger LOG = LoggerFactory.getLogger(SyncWebSocketClient.class.getName());
	private String messageToSend;

	public SyncWebSocketClient(URI serverUri) {
		super(serverUri);
	}

	public SyncWebSocketClient(String uri) throws URISyntaxException {
		this(new URI(uri));
	}

	@Override
	public void onClose(int arg0, String arg1, boolean arg2) {
		LOG.debug("socket closed: {} {} {}", arg0, arg1, arg2);

	}

	@Override
	public void onError(Exception arg0) {
		LOG.warn("error on socket: {}", arg0.getMessage());

	}

	@Override
	public void onMessage(String arg0) {
		LOG.debug("received message: {}", arg0);

	}

	@Override
	public void onOpen(ServerHandshake arg0) {
		LOG.debug("socket opened");
		if (this.messageToSend != null) {
			LOG.debug("try to send: " + this.messageToSend);
			this.send(this.messageToSend);
			this.messageToSend = null;
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
		}
		this.send(message);
		try {
			this.closeBlocking();
		} catch (InterruptedException e) {
			LOG.warn("problem disconnecting:" + e.getMessage());

		}
	}

}
