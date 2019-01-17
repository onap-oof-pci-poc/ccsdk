/**
 *
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml;

/**
 * Wrapper for forwarding websocket notifications to the websocket service, that is running as container.
 * @author herbert
 */
public interface WebSocketServiceClient {

    public <T extends MwtNotificationBase & GetEventType> void sendViaWebsockets(String nodeName, T notificationXml);

}
