package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf;

import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InventoryInformation;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.container.AllPm;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.devicemonitor.impl.DeviceMonitoredNe;
import org.opendaylight.controller.md.sal.binding.api.MountPoint;

public interface ONFCoreNetworkElementRepresentation extends DeviceMonitoredNe {

       /**
        * Read during startup all relevant structure and status parameters from device.
        * Remove all currentAlarms, read structure from networkElement with all interfacePacs, read current alarm status
        */
       public void initialReadFromNetworkElement();

       public String getMountPointNodeName();

       public void resetPMIterator();

       public boolean hasNext();

       public void next();

       public AllPm getHistoricalPM();

       public String pmStatusToString();

       public int removeAllCurrentProblemsOfNode();

       public void doRegisterMicrowaveEventListener(MountPoint mountPoint);

       public void initSynchronizationExtension();

       public InventoryInformation getInventoryInformation();

       public InventoryInformation getInventoryInformation(String layerProtocolFilter);

}
