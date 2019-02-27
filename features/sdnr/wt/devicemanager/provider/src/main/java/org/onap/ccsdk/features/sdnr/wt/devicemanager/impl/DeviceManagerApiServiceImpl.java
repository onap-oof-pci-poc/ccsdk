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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.RpcRegistration;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance.MaintenanceRPCServiceAPI;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance.impl.MaintenanceServiceImpl;
import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.ClearCurrentFaultByNodenameInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.ClearCurrentFaultByNodenameOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.ClearCurrentFaultByNodenameOutputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.DevicemanagerService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.GetMaintenanceModeInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.GetMaintenanceModeOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.GetMaintenanceModeOutputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.GetRequiredNetworkElementKeysOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.GetRequiredNetworkElementKeysOutputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.SetMaintenanceModeInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.SetMaintenanceModeOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.SetMaintenanceModeOutputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.ShowRequiredNetworkElementInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.ShowRequiredNetworkElementOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.ShowRequiredNetworkElementOutputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.TestMaintenanceModeInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.TestMaintenanceModeOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.TestMaintenanceModeOutputBuilder;
import org.opendaylight.yangtools.yang.common.RpcError.ErrorType;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("deprecation")
public class DeviceManagerApiServiceImpl implements DevicemanagerService, AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(DevicemanagerService.class);

    private final RpcRegistration<DevicemanagerService> rpcReg;

    private MaintenanceRPCServiceAPI maintenanceService;
    private ResyncNetworkElementsListener resyncCallbackListener;

    DeviceManagerApiServiceImpl(final RpcProviderRegistry rpcProviderRegistry) {
        // Register ourselves as the REST API RPC implementation
        LOG.info("Register RPC Service "+DevicemanagerService.class.getSimpleName());
        this.maintenanceService = null;
        this.rpcReg = rpcProviderRegistry.addRpcImplementation(DevicemanagerService.class, this);
    }

    public void setMaintenanceService(MaintenanceServiceImpl maintenanceService2) {
        this.maintenanceService = maintenanceService2;
    }

    @Override
    public void close() throws Exception {
        LOG.info("Close RPC Service");
        if (rpcReg != null) {
            rpcReg.close();
        }
    }

    /*-------------------------------
     * Interfaces for MaintenanceService
     */

    // For casablanca version no input was generated.
   @Override
    public ListenableFuture<RpcResult<GetRequiredNetworkElementKeysOutput>> getRequiredNetworkElementKeys() {

        LOG.info("RPC Request: getRequiredNetworkElementKeys");
        RpcResultBuilder<GetRequiredNetworkElementKeysOutput> result;
        try {
            GetRequiredNetworkElementKeysOutputBuilder outputBuilder = maintenanceService.getRequiredNetworkElementKeys();
            result =  RpcResultBuilder.success(outputBuilder);
        } catch (Exception e) {
            result = RpcResultBuilder.failed();
            result.withError(ErrorType.APPLICATION, "Exception", e);
        }
        return result.buildFuture();
    }

    @Override
    public ListenableFuture<RpcResult<ShowRequiredNetworkElementOutput>> showRequiredNetworkElement(
            ShowRequiredNetworkElementInput input) {

        LOG.info("RPC Request: showRequiredNetworkElement input: {}", input.getMountpointName());
        RpcResultBuilder<ShowRequiredNetworkElementOutput> result;

        try {
            ShowRequiredNetworkElementOutputBuilder outputBuilder = maintenanceService.showRequiredNetworkElement(input);
            result =  RpcResultBuilder.success(outputBuilder);
        } catch (Exception e) {
            result = RpcResultBuilder.failed();
            result.withError(ErrorType.APPLICATION, "Exception", e);
        }
        return result.buildFuture();
    }

    @Override
    public ListenableFuture<RpcResult<SetMaintenanceModeOutput>> setMaintenanceMode(SetMaintenanceModeInput input) {

        LOG.info("RPC Request: setMaintenanceMode input: {}", input.getMountpointName());
        RpcResultBuilder<SetMaintenanceModeOutput> result;

        try {
            SetMaintenanceModeOutputBuilder outputBuilder = maintenanceService.setMaintenanceMode(input);
            result =  RpcResultBuilder.success(outputBuilder);
        } catch (Exception e) {
            result = RpcResultBuilder.failed();
            result.withError(ErrorType.APPLICATION, "Exception", e);
        }
        return result.buildFuture();

    }



    @Override
    public ListenableFuture<RpcResult<GetMaintenanceModeOutput>> getMaintenanceMode(GetMaintenanceModeInput input) {

        LOG.info("RPC Request: getMaintenanceMode input: {}", input.getMountpointName());
        RpcResultBuilder<GetMaintenanceModeOutput> result;

        try {
            GetMaintenanceModeOutputBuilder outputBuilder = maintenanceService.getMaintenanceMode(input);
            result =  RpcResultBuilder.success(outputBuilder);
        } catch (Exception e) {
            result = RpcResultBuilder.failed();
            result.withError(ErrorType.APPLICATION, "Exception", e);
        }
        return result.buildFuture();

    }

    @Override
    public ListenableFuture<RpcResult<TestMaintenanceModeOutput>> testMaintenanceMode(TestMaintenanceModeInput input) {
        LOG.info("RPC Request: getMaintenanceMode input: {}", input.getMountpointName());
        RpcResultBuilder<TestMaintenanceModeOutput> result;

        try {
            TestMaintenanceModeOutputBuilder outputBuilder = maintenanceService.testMaintenanceMode(input);
            result =  RpcResultBuilder.success(outputBuilder);
        } catch (Exception e) {
            result = RpcResultBuilder.failed();
            result.withError(ErrorType.APPLICATION, "Exception", e);
        }
        return result.buildFuture();

    }


    @Override
    public ListenableFuture<RpcResult<ClearCurrentFaultByNodenameOutput>> clearCurrentFaultByNodename(
            ClearCurrentFaultByNodenameInput input) {
        LOG.info("RPC Request: clearNetworkElementAlarms input: {}", input.getNodenames());
        RpcResultBuilder<ClearCurrentFaultByNodenameOutput> result;
        try {
            if(this.resyncCallbackListener!=null) {
                List<String> nodeNames= this.resyncCallbackListener.doClearCurrentFaultByNodename(input.getNodenames());
                ClearCurrentFaultByNodenameOutputBuilder outputBuilder = new ClearCurrentFaultByNodenameOutputBuilder();
                outputBuilder.setNodenames(nodeNames);
                result =  RpcResultBuilder.success(outputBuilder);
            } else {
                result = RpcResultBuilder.failed();
                result.withError(ErrorType.APPLICATION, "Startup running" );
            }
        } catch(Exception e) {
            result = RpcResultBuilder.failed();
            result.withError(ErrorType.APPLICATION, "Exception", e);
        }
        return result.buildFuture();
    }

    public void setResyncListener(ResyncNetworkElementsListener listener) {
        this.resyncCallbackListener = listener;
    }

}
