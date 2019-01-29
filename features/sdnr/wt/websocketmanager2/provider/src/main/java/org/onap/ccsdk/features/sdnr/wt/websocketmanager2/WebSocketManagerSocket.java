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
package org.onap.ccsdk.features.sdnr.wt.websocketmanager2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketAdapter;
import org.json.JSONObject;
import org.onap.ccsdk.features.sdnr.wt.websocketmanager2.utils.UserScopes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebSocketManagerSocket extends WebSocketAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(WebSocketManagerSocket.class.getName());

    public static final String MSG_KEY_DATA = "data";
    public static final String MSG_KEY_SCOPES = "scopes";
    public static final String MSG_KEY_PARAM = "param";
    public static final String MSG_KEY_VALUE = "value";
    public static final String MSG_KEY_SCOPE = "scope";

    public static final String KEY_NODENAME = "nodename";
    public static final String KEY_EVENTTYPE = "eventtype";
    public static final String KEY_XMLEVENT = "xmlevent";

    private static final Random RND = new Random();


    /**
     * list of all sessionids
     */
    private static final List<String> sessionIds = new ArrayList<>();
    /**
     * map of sessionid <=> UserScopes
     */
    private static final HashMap<String, UserScopes> userScopesList = new HashMap<>();
    /**
     * map of class.hashCode <=> class
     */
    private static final HashMap<String, WebSocketManagerSocket> clientList = new HashMap<>();
    private final String myUniqueSessionId;

    private Session session = null;

    public interface EventInputCallback {
        void onMessagePushed(final String message) throws Exception;
    }

    public WebSocketManagerSocket() {
        this.myUniqueSessionId = _genSessionId();
    }

    @Override
    protected void finalize() throws Throwable {
        sessionIds.remove(this.myUniqueSessionId);
    }

    private static String _genSessionId() {
        String sid = String.valueOf(RND.nextLong());
        while (sessionIds.contains(sid)) {
            sid = String.valueOf(RND.nextLong());
        }
        sessionIds.add(sid);
        return sid;
    }

    @Override
    public void onWebSocketText(String message) {
        LOG.info(this.getRemoteAdr() + " has sent " + message);
        if (!this.manageClientRequest(message)) {
            this.manageClientRequest2(message);
        }

    }

    @Override
    public void onWebSocketBinary(byte[] payload, int offset, int len) {

    }

    @Override
    public void onWebSocketConnect(Session sess) {
        this.session = sess;
        clientList.put(String.valueOf(this.hashCode()), this);
        LOG.debug("client connected from " + this.getRemoteAdr());
    }

    @Override
    public void onWebSocketClose(int statusCode, String reason) {
        clientList.remove(String.valueOf(this.hashCode()));
        LOG.debug("client disconnected from " + this.getRemoteAdr());
    }

    @Override
    public void onWebSocketError(Throwable cause) {

        LOG.debug("error caused on " + this.getRemoteAdr() + " :" + cause.getMessage());
        // super.onWebSocketError(cause);
    }

    private String getRemoteAdr() {
        String adr = "unknown";
        try {
            adr = this.session.getRemoteAddress().toString();
        } catch (Exception e) {
            LOG.debug("error resolving adr: {}", e.getMessage());
        }
        return adr;
    }

    /**
     *
     * @param request is a json object
     *                {"data":"scopes","scopes":["scope1","scope2",...]}
     * @return if handled
     */
    private boolean manageClientRequest(String request) {
        boolean ret = false;
        try {
            JSONObject jsonMessage = new JSONObject(request);
            if (jsonMessage.has(MSG_KEY_DATA)) {
                String data = jsonMessage.getString(MSG_KEY_DATA);
                if (data.equals(MSG_KEY_SCOPES)) {
                    ret = true;
                    String sessionId = this.getSessionId();
                    UserScopes clientDto = new UserScopes();
                    clientDto.setScopes(jsonMessage.getJSONArray(MSG_KEY_SCOPES));
                    userScopesList.put(sessionId, clientDto);
                    this.send(
                            "You are connected to the Opendaylight Websocket server and scopes are : " + request + "");
                }
            }
        } catch (Exception e) {
            LOG.warn("problem set scope: " + e.getMessage());
            this.send("Your request to the Opendaylight Websocket server is >> " + request
                    + " << which failed because of following exception >> " + e.toString());
        }
        return ret;
    }

    /*
     * broadcast message to all your clients
     */
    private void manageClientRequest2(String request) {
        try {
            JSONObject o = new JSONObject(request);
            if (o.has(KEY_NODENAME) && o.has(KEY_EVENTTYPE)) {
                broadCast(o.getString(KEY_NODENAME), o.getString(KEY_EVENTTYPE), o.getString(KEY_XMLEVENT));
            }
        } catch (Exception e) {
            LOG.warn("handle ws request failed:" + e.getMessage());
        }
    }

    private void send(String msg) {
        try {
            LOG.trace("sending {}", msg);
            this.session.getRemote().sendString(msg);
        } catch (Exception e) {
            LOG.warn("problem sending message: " + e.getMessage());
        }
    }

    private String getSessionId() {
        return this.myUniqueSessionId;
    }

    public static void broadCast(String nodeName, String eventType, String xmlEvent) {
        if (clientList != null && clientList.size() > 0) {
            for (Map.Entry<String, WebSocketManagerSocket> entry : clientList.entrySet()) {
                WebSocketManagerSocket socket = entry.getValue();
                if (socket != null) {
                    try {

                        UserScopes clientScopes = userScopesList.get(socket.getSessionId());
                        if (clientScopes != null) {
                            if (clientScopes.hasScope(eventType)) {
                                socket.send(xmlEvent);
                            } else {
                                LOG.debug("client has not scope {}", eventType);
                            }
                        } else {
                            LOG.debug("no scopes for notifications registered");
                        }
                    } catch (Exception ioe) {
                        LOG.warn(ioe.getMessage());
                    }
                } else {
                    LOG.debug("cannot broadcast. socket is null");
                }
            }
        }
    }

}
