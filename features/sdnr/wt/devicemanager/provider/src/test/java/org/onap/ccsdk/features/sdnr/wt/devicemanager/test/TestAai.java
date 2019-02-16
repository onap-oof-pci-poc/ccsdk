/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.aaiconnector.impl.AaiProviderClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InventoryInformation;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.HtDevicemanagerConfiguration;

public class TestAai {

    @Test
    public void test() {
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
            e.printStackTrace();
        }
        System.out.println("unregistering device");
        provider.onDeviceUnregistered(mountPointName);
        System.out.println("finished");
        try {
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
