package org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance;

import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GetMaintenanceModeInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GetMaintenanceModeOutputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.GetRequiredNetworkElementKeysOutputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.SetMaintenanceModeInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.SetMaintenanceModeOutputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.ShowRequiredNetworkElementInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.ShowRequiredNetworkElementOutputBuilder;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.TestMaintenanceModeInput;
import org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.wt.wtmanager.rev190109.TestMaintenanceModeOutputBuilder;

public interface MaintenanceRPCServiceAPI {

    public GetRequiredNetworkElementKeysOutputBuilder getRequiredNetworkElementKeys();

    public ShowRequiredNetworkElementOutputBuilder showRequiredNetworkElement(ShowRequiredNetworkElementInput input);

    public GetMaintenanceModeOutputBuilder getMaintenanceMode(GetMaintenanceModeInput input);

    public SetMaintenanceModeOutputBuilder setMaintenanceMode(SetMaintenanceModeInput input);

    public TestMaintenanceModeOutputBuilder testMaintenanceMode(TestMaintenanceModeInput input);

}
