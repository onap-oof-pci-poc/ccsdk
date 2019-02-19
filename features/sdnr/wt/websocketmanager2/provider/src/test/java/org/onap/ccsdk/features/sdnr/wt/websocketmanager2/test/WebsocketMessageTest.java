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
import static org.mockito.Mockito.*;

import java.net.InetSocketAddress;

import org.eclipse.jetty.websocket.api.Session;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.WebSocketManagerSocket;

public class WebsocketMessageTest {

    private static final String MSG1 = "{\"data\":\"scopes\",\"scopes\":[\"scope1\"]}";
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
        sess.close();

    }
    public void test2() {
        //message from devmgr (notification)
//        this.expectAnswer = MSG2;
//        socketToTest.onWebSocketText(MSG2);
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
