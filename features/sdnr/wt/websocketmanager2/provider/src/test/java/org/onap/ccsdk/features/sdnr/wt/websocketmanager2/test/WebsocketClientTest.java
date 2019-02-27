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
import org.java_websocket.handshake.ServerHandshake;
import org.junit.Test;
import org.mockito.Mockito;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.websocket.SyncWebSocketClient;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.websocket.SyncWebSocketClient.WebsocketEventHandler;

public class WebsocketClientTest extends Mockito {

    @Test
    public void test() {

        WebsocketEventHandler clientHandlerMock = mock(WebsocketEventHandler.class);
        ServerHandshake serverHandshakeMock = mock(ServerHandshake.class);

        try {
            SyncWebSocketClient client = new SyncWebSocketClient("url");

            client.addEventHandler(clientHandlerMock);
            client.onMessage("TestMessage");
            client.onOpen(serverHandshakeMock);
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception "+e.getMessage());
        }
    }

}
