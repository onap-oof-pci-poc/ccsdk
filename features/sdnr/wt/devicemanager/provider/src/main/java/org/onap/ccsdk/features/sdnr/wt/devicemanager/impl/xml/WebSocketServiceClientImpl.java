/**
 *
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml;

import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.listener.ODLEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Wrapper for forwarding websocket notifications to the websocket service, that is running as container.
 * @author herbert
 */
public class WebSocketServiceClientImpl implements WebSocketServiceClient {

    private static final Logger LOG = LoggerFactory.getLogger(ODLEventListener.class);

    /*
    private final WebsocketmanagerService websocketmanagerService;
    private final XmlMapper xmlMapper;

    /**
     * @param websocketmanagerService object
     * @param xmlMapper object
     */
    /*
    public WebSocketServiceClientImpl(WebsocketmanagerService websocketmanagerService,
            XmlMapper xmlMapper) {
        super();
        this.websocketmanagerService = websocketmanagerService;
        this.xmlMapper = xmlMapper;
    }
    */

    public WebSocketServiceClientImpl() {
    }

    @Override
    public <T extends MwtNotificationBase & GetEventType> void sendViaWebsockets(String nodeName, T notificationXml) {
        LOG.info("Dummy to send websocket event {} for mountpoint {}", notificationXml.getClass().getSimpleName(), nodeName);

        /*
        try {
            WebsocketEventInputBuilder wsBuilder = new WebsocketEventInputBuilder();
            wsBuilder.setNodeName(nodeName);
            wsBuilder.setEventType(notificationXml.getEventType());
            wsBuilder.setXmlEvent(xmlMapper.getXmlString(notificationXml));
            Future<RpcResult<WebsocketEventOutput>> result = websocketmanagerService.websocketEvent(wsBuilder.build());
            LOG.info("Send websocket result: {}", result.get().getResult().getResponse());
        } catch (Exception e) {
            LOG.warn("Can not send websocket event {} for mountpoint {} {}",
                    notificationXml.getClass().getSimpleName(), nodeName, e.toString());
        }
        */
    }
}
