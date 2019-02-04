/*-
 * ============LICENSE_START=======================================================
 * ONAP : CCSDK
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights
 *                      reserved.
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
 */

package org.onap.ccsdk.features.sdnr.northbound.helloworld;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.RpcRegistration;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.HelloworldService;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

public class HelloworldProvider implements HelloworldService, AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(HelloworldProvider.class);

    private final String appName = "Helloworld";

    private final DataBroker dataBroker;
    private final RpcProviderRegistry rpcProviderRegistry;
    private RpcRegistration<HelloworldService> serviceRegistration;


    public HelloworldProvider(final DataBroker dataBroker, RpcProviderRegistry rpcProviderRegistry) {
        this.dataBroker = dataBroker;
        this.rpcProviderRegistry = rpcProviderRegistry;
    }

    /**
     * Method called when the blueprint container is created.
     */
    public void init() {
        serviceRegistration = rpcProviderRegistry.addRpcImplementation(HelloworldService.class, this);
        LOG.info("Initializing provider for " + appName);
        Preconditions.checkNotNull(dataBroker, "dataBroker must be set");
        LOG.info("Initialization complete for " + appName);
    }

    /**
     * Method called when the blueprint container is destroyed.
     */
    @Override
    public void close() {
        LOG.info("HelloworldProvider Closed");
    }

    @Override
    public ListenableFuture<RpcResult<GreetingOutput>> greeting(GreetingInput input) {

        // Assume success
        Boolean soFarSoGood = true;

        // Build the result now so error messages can be included in the response
        GreetingOutputBuilder responseBuilder = new GreetingOutputBuilder();

        if (input == null) {
            LOG.error("Input is null");
            responseBuilder.setResponse("Input is null");
            soFarSoGood = false;
        } else {
            try {
                GreetingInputBuilder inputBuilder = new GreetingInputBuilder(input);
                input = inputBuilder.build();
                LOG.info("Received payload: " + input.getSalutation());
            } catch (Exception e) {
                LOG.error("Cannot build input");
                responseBuilder.setResponse(e.toString() + " : " + e.getMessage());
                soFarSoGood = false;
            }
        }

        if (soFarSoGood) {
            responseBuilder.setResponse("Hello " + input.getSalutation());

            return Futures.immediateFuture(
                    RpcResultBuilder.<GreetingOutput>success().withResult(responseBuilder.build()).build());
        }
        return Futures
                .immediateFuture(RpcResultBuilder.<GreetingOutput>failed().withResult(responseBuilder.build()).build());

    }
}
