package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl;

import java.util.List;
import java.util.concurrent.Future;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance.MaintenanceRPCServiceAPI;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance.impl.MaintenanceServiceImpl;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.RpcRegistration;
import org.opendaylight.controller.sal.binding.api.RpcProviderRegistry;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.ClearCurrentFaultByNodenameInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.ClearCurrentFaultByNodenameOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.ClearCurrentFaultByNodenameOutputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GetMaintenanceModeInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GetMaintenanceModeOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GetMaintenanceModeOutputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GetRequiredNetworkElementKeysOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GetRequiredNetworkElementKeysOutputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GreetingInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GreetingOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.SetMaintenanceModeInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.SetMaintenanceModeOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.SetMaintenanceModeOutputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.ShowRequiredNetworkElementInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.ShowRequiredNetworkElementOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.ShowRequiredNetworkElementOutputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.TestMaintenanceModeInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.TestMaintenanceModeOutput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.TestMaintenanceModeOutputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.WtmanagerService;
import org.opendaylight.yangtools.yang.common.RpcError.ErrorType;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeviceManagerApiServiceImpl implements WtmanagerService, AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(WtmanagerService.class);

    private final RpcRegistration<WtmanagerService> rpcReg;

    private MaintenanceRPCServiceAPI maintenanceService;
    private ResyncNetworkElementsListener resyncCallbackListener;

    DeviceManagerApiServiceImpl(final RpcProviderRegistry rpcProviderRegistry) {
        // Register ourselves as the REST API RPC implementation
        LOG.info("Register RPC Service "+WtmanagerService.class.getSimpleName());
        this.maintenanceService = null;
        this.rpcReg = rpcProviderRegistry.addRpcImplementation(WtmanagerService.class, this);
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

    @Override
    public Future<RpcResult<GetRequiredNetworkElementKeysOutput>> getRequiredNetworkElementKeys() {

        LOG.info("RPC Request: getRequiredNetworkElementKeys");
        RpcResultBuilder<GetRequiredNetworkElementKeysOutput> result;
        try {
            GetRequiredNetworkElementKeysOutputBuilder outputBuilder = execMaintanceService().getRequiredNetworkElementKeys();
            result =  RpcResultBuilder.success(outputBuilder);
        } catch (Exception e) {
            result = RpcResultBuilder.failed();
            result.withError(ErrorType.APPLICATION, "Exception", e);
        }
        return result.buildFuture();
    }

    @Override
    public Future<RpcResult<ShowRequiredNetworkElementOutput>> showRequiredNetworkElement(
            ShowRequiredNetworkElementInput input) {

        LOG.info("RPC Request: showRequiredNetworkElement input: {}", input.getMountpointName());
        RpcResultBuilder<ShowRequiredNetworkElementOutput> result;

        try {
            ShowRequiredNetworkElementOutputBuilder outputBuilder = execMaintanceService().showRequiredNetworkElement(input);
            result =  RpcResultBuilder.success(outputBuilder);
        } catch (Exception e) {
            result = RpcResultBuilder.failed();
            result.withError(ErrorType.APPLICATION, "Exception", e);
        }
        return result.buildFuture();
    }

    @Override
    public Future<RpcResult<SetMaintenanceModeOutput>> setMaintenanceMode(SetMaintenanceModeInput input) {

        LOG.info("RPC Request: setMaintenanceMode input: {}", input.getMountpointName());
        RpcResultBuilder<SetMaintenanceModeOutput> result;

        try {
            SetMaintenanceModeOutputBuilder outputBuilder = execMaintanceService().setMaintenanceMode(input);
            result =  RpcResultBuilder.success(outputBuilder);
        } catch (Exception e) {
            result = RpcResultBuilder.failed();
            result.withError(ErrorType.APPLICATION, "Exception", e);
        }
        return result.buildFuture();

    }



    @Override
    public Future<RpcResult<GetMaintenanceModeOutput>> getMaintenanceMode(GetMaintenanceModeInput input) {

        LOG.info("RPC Request: getMaintenanceMode input: {}", input.getMountpointName());
        RpcResultBuilder<GetMaintenanceModeOutput> result;

        try {
            GetMaintenanceModeOutputBuilder outputBuilder = execMaintanceService().getMaintenanceMode(input);
            result =  RpcResultBuilder.success(outputBuilder);
        } catch (Exception e) {
            result = RpcResultBuilder.failed();
            result.withError(ErrorType.APPLICATION, "Exception", e);
        }
        return result.buildFuture();

    }

    @Override
    public Future<RpcResult<TestMaintenanceModeOutput>> testMaintenanceMode(TestMaintenanceModeInput input) {
        LOG.info("RPC Request: getMaintenanceMode input: {}", input.getMountpointName());
        RpcResultBuilder<TestMaintenanceModeOutput> result;

        try {
            TestMaintenanceModeOutputBuilder outputBuilder = execMaintanceService().testMaintenanceMode(input);
            result =  RpcResultBuilder.success(outputBuilder);
        } catch (Exception e) {
            result = RpcResultBuilder.failed();
            result.withError(ErrorType.APPLICATION, "Exception", e);
        }
        return result.buildFuture();

    }


    @Override
    public Future<RpcResult<ClearCurrentFaultByNodenameOutput>> clearCurrentFaultByNodename(
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

    @Override
    public Future<RpcResult<GreetingOutput>> greeting(GreetingInput input) {
        return null;
    }

    private MaintenanceRPCServiceAPI execMaintanceService() {
        if (maintenanceService == null) {
            throw new IllegalStateException("Maintenanceservice not available");
        } else {
			return maintenanceService;
		}
    };

}
