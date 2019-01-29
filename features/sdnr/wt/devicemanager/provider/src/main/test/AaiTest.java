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
import java.util.ArrayList;
import java.util.List;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.aaiConnector.impl.AaiProviderClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InventoryInformation;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.HtDevicemanagerConfiguration;

public class AaiTest {

    public static void main(String[] args)
    {
        HtDevicemanagerConfiguration cfg=HtDevicemanagerConfiguration.getTestConfiguration();

        AaiProviderClient provider = new AaiProviderClient(cfg, null);

        String mountPointName = "testDevice 01";
        String type="Unit";
        String model="Horizon Compact+";
        String vendor="DragonWave-X";
        String ipv4="127.0.0.1";
        String ipv6="::1";
        List<String> ifInfos = new ArrayList<>();
        ifInfos.add("LP-MWPS-RADIO");
        InventoryInformation ii=new InventoryInformation(type, model, vendor, ipv4, ipv6, ifInfos);
        System.out.println("registering device");
        provider.onDeviceRegistered(mountPointName,ii);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("unregistering device");
        provider.onDeviceUnregistered(mountPointName);
        System.out.println("finished");
        try {
            provider.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
