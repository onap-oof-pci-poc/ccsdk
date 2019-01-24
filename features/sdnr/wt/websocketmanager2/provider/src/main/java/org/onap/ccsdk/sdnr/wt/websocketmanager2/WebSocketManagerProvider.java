/*******************************************************************************
 * ============LICENSE_START=======================================================
 * ONAP : ccsdk feature sdnr wt websocketmanager2
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
package org.onap.ccsdk.sdnr.wt.websocketmanager2;

import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.RpcRegistration;
import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.websocketmanager.rev150105.WebsocketmanagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebSocketManagerProvider extends Blueprint {

    private static final Logger LOG = LoggerFactory.getLogger(WebSocketManagerProvider.class);
    private static final String APPLICATION_NAME = WebSocketManagerProvider.class.getName();

    private WebSocketManager wsServlet = null;
    private RpcRegistration<WebsocketmanagerService> websocketService = null;


    public WebSocketManagerProvider() {
        LOG.info( "Creating provider for {}", APPLICATION_NAME);
    }

    @Override
    public void init() {
        LOG.info( "Init provider for {}", APPLICATION_NAME);
        RpcProviderRegistry rpcProviderRegistry = this.getRpcProviderRegistry();
        if (rpcProviderRegistry != null) {
            if (wsServlet != null) {
				this.websocketService = rpcProviderRegistry.addRpcImplementation(WebsocketmanagerService.class, wsServlet);
			} else {
                LOG.error("wsServlet not provided");
            }
        } else {
            LOG.error("rpcProviderRegistry not provided");
        }
    }

    @Override
    public void close() throws Exception {
        LOG.info( "Close provider for {}", APPLICATION_NAME);
        if (websocketService != null) {
            websocketService.close();
        }
    }

    public WebSocketManager getWsServlet() {
        return wsServlet;
    }

    public void setWsServlet(WebSocketManager wsServlet) {
        this.wsServlet = wsServlet;
    }
}
