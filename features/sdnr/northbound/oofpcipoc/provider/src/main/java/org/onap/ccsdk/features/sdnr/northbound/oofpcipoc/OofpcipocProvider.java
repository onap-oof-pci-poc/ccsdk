/*-
 * ============LICENSE_START=======================================================
 * openECOMP : SDN-C
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights
 *             reserved.
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

 package org.onap.ccsdk.features.sdnr.northbound.oofpcipoc;

import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.onap.ccsdk.sli.core.sli.provider.MdsalHelper;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.NotificationPublishService;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker;
import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.oofpcipoc.rev181127.GreetingInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.oofpcipoc.rev181127.GreetingInputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.oofpcipoc.rev181127.GreetingOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.oofpcipoc.rev181127.GreetingOutputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.oofpcipoc.rev181127.OofpcipocService;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.oofpcipoc.rev181127.ConfigurationPhyCellIdInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.oofpcipoc.rev181127.ConfigurationPhyCellIdInputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.oofpcipoc.rev181127.ConfigurationPhyCellIdOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.oofpcipoc.rev181127.ConfigurationPhyCellIdOutputBuilder;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/**
 * Defines a base implementation for your provider. This class extends from a helper class
 * which provides storage for the most commonly used components of the MD-SAL. Additionally the
 * base class provides some basic logging and initialization / clean up methods.
 *
 */
public class OofpcipocProvider implements AutoCloseable, OofpcipocService {

    private static final Logger LOG = LoggerFactory.getLogger(OofpcipocProvider.class);

    private static final String APPLICATION_NAME = "Oofpcipoc";

    private final ExecutorService executor;

    protected DataBroker dataBroker;
    protected NotificationPublishService notificationService;
    protected RpcProviderRegistry rpcRegistry;
    protected BindingAwareBroker.RpcRegistration<OofpcipocService> rpcRegistration;
    private final OofpcipocClient OofpcipocClient;


    public OofpcipocProvider(final DataBroker dataBroker,
                              final NotificationPublishService notificationPublishService,
                              final RpcProviderRegistry rpcProviderRegistry,
                              final OofpcipocClient OofpcipocClient) {

        this.LOG.info( "Creating provider for {}", APPLICATION_NAME);
        executor = Executors.newFixedThreadPool(1);
            this.dataBroker = dataBroker;
            this.notificationService = notificationPublishService;
            this.rpcRegistry = rpcProviderRegistry;
            this.OofpcipocClient = OofpcipocClient;
            initialize();
    }

    public void initialize(){
        LOG.info( "Initializing provider for {}", APPLICATION_NAME);
        rpcRegistration = rpcRegistry.addRpcImplementation(OofpcipocService.class, this);
        LOG.info( "Initialization complete for {}", APPLICATION_NAME);
    }

    protected void initializeChild() {
        //Override if you have custom initialization intelligence
    }

    @Override
    public void close() throws Exception {
        LOG.info( "Closing provider for {}", APPLICATION_NAME);
        executor.shutdown();
        rpcRegistration.close();
        LOG.info( "Successfully closed provider for {}", APPLICATION_NAME);
    }

    @Override
    public ListenableFuture<RpcResult<GreetingOutput>> greeting(
            GreetingInput input) {
        final String svcOperation = "greeting";

        Properties parms = new Properties();
        GreetingOutputBuilder serviceDataBuilder = new GreetingOutputBuilder();

    LOG.info( "Reached RPC greeting");

        LOG.info( svcOperation +" called." );

        if(input == null ) {
            LOG.debug("exiting " +svcOperation+ " because of invalid input");
            serviceDataBuilder.setResponse("Input is null");
            RpcResult<GreetingOutput> rpcResult =
                RpcResultBuilder.<GreetingOutput> status(true).withResult(serviceDataBuilder.build()).build();
            return Futures.immediateFuture(rpcResult);
        }

        // add input to parms
        LOG.info("Adding INPUT data for "+svcOperation+" input: " + input);
        GreetingInputBuilder inputBuilder = new GreetingInputBuilder(input);
        MdsalHelper.toProperties(parms, inputBuilder.build());

        // Call SLI sync method
        try
        {
            if (OofpcipocClient.hasGraph("Oofpcipoc", svcOperation , null, "sync"))
            {
        LOG.info( "OofpcipocClient has a Directed Graph for '" + svcOperation + "'");
                try
                {
          OofpcipocClient.execute("Oofpcipoc", svcOperation, null, "sync", serviceDataBuilder, parms);
                }
                catch (Exception e)
                {
                    LOG.error("Caught exception executing service logic for "+ svcOperation, e);
                    serviceDataBuilder.setResponse("500");
                }
            } else {
                LOG.error("No service logic active for Oofpcipoc: '" + svcOperation + "'");
                serviceDataBuilder.setResponse("503");
            }
        }
        catch (Exception e)
        {
            LOG.error("Caught exception looking for service logic", e);
            serviceDataBuilder.setResponse("500");
        }

        String errorCode = serviceDataBuilder.getResponse();

        if (!("0".equals(errorCode) || "200".equals(errorCode))) {
            LOG.error("Returned FAILED for "+svcOperation+" error code: '" + errorCode + "'");
        } else {
            LOG.info("Returned SUCCESS for "+svcOperation+" ");
      serviceDataBuilder.setResponse("Welcome OOF POC " + input.getSalutation());
        }

        RpcResult<GreetingOutput> rpcResult =
                RpcResultBuilder.<GreetingOutput> status(true).withResult(serviceDataBuilder.build()).build();

    LOG.info("Successful exit from greeting ");

        return Futures.immediateFuture(rpcResult);
    }

// RPC configuration-phy-cell-id
  @Override
    public ListenableFuture<RpcResult<ConfigurationPhyCellIdOutput>> configurationPhyCellId(
            ConfigurationPhyCellIdInput input) {
        final String svcOperation = "configuration-phy-cell-id";

        Properties parms = new Properties();
        ConfigurationPhyCellIdOutputBuilder serviceDataBuilder = new ConfigurationPhyCellIdOutputBuilder();

    LOG.info( "Reached RPC configurationPhyCellId");

        LOG.info( svcOperation +" called." );

        if(input == null ) {
            LOG.debug("exiting " +svcOperation+ " because of invalid input");
            serviceDataBuilder.setResponseCode("Input is null");
            RpcResult<ConfigurationPhyCellIdOutput> rpcResult =
                RpcResultBuilder.<ConfigurationPhyCellIdOutput> status(true).withResult(serviceDataBuilder.build()).build();
            return Futures.immediateFuture(rpcResult);
        }

        // add input to parms
        LOG.info("Adding INPUT data for "+svcOperation+" input: " + input);
        ConfigurationPhyCellIdInputBuilder inputBuilder = new ConfigurationPhyCellIdInputBuilder(input);
        MdsalHelper.toProperties(parms, inputBuilder.build());

        // Call SLI sync method
        try
        {

            if (OofpcipocClient.hasGraph("Oofpcipoc", svcOperation , null, "sync"))
            {
        LOG.info( "OofpcipocClient has a Directed Graph for '" + svcOperation + "'");

                try
                {
                    OofpcipocClient.execute("Oofpcipoc", svcOperation, null, "sync", serviceDataBuilder, parms);
                }
                catch (Exception e)
                {
                    LOG.error("Caught exception executing service logic for "+ svcOperation, e);
                    serviceDataBuilder.setResponseCode("500");
                }
            } else {
                LOG.error("No service logic active for Oofpcipoc: '" + svcOperation + "'");
                serviceDataBuilder.setResponseCode("503");
            }
        }
        catch (Exception e)
        {
            LOG.error("Caught exception looking for service logic", e);
            serviceDataBuilder.setResponseCode("500");
        }

        String errorCode = serviceDataBuilder.getResponseCode();

        if (!("0".equals(errorCode) || "200".equals(errorCode))) {
            LOG.error("Returned FAILED for "+svcOperation+" error code: '" + errorCode + "'");
        } else {
            LOG.info("Returned SUCCESS for "+svcOperation+" ");
      serviceDataBuilder.setResponseCode("Welcome OOF POC. Number of FAP entries " + input.getFapServiceNumberOfEntries());
        }

        RpcResult<ConfigurationPhyCellIdOutput> rpcResult =
                RpcResultBuilder.<ConfigurationPhyCellIdOutput> status(true).withResult(serviceDataBuilder.build()).build();

        return Futures.immediateFuture(rpcResult);
    }

}
