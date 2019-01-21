/*******************************************************************************
 * ============LICENSE_START=======================================================
 * ONAP : ccsdk feature sdnr wt
 *  ================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property.
 * All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 ******************************************************************************/
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
