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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf;

import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InventoryInformation;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.container.AllPm;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.devicemonitor.impl.DeviceMonitoredNe;
import org.opendaylight.mdsal.binding.api.MountPoint;

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
