/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.util;

import java.util.ArrayList;
import java.util.List;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.wrapperc.WrapperMicrowaveModelRev170324;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NetworkElement;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNodeBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNodeConnectionStatus.ConnectionStatus;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.AvailableCapabilitiesBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.available.capabilities.AvailableCapability;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.available.capabilities.AvailableCapabilityBuilder;

public class TestNetconfNode {

    public static NetconfNode get() {

        //Capabilities create input list
        List<AvailableCapability> availableCapabilitiesList = new ArrayList<>();
        availableCapabilitiesList.add(new AvailableCapabilityBuilder().setCapability(NetworkElement.QNAME.toString()).build());
        availableCapabilitiesList.add(new AvailableCapabilityBuilder().setCapability(WrapperMicrowaveModelRev170324.QNAME.toString()).build());

        //Move list into AvailableCapabilities
        AvailableCapabilitiesBuilder availableCapabilitiesBuilder = new AvailableCapabilitiesBuilder();
        availableCapabilitiesBuilder.setAvailableCapability(availableCapabilitiesList);

        //Assemble netconfNode and assign attributes
        NetconfNodeBuilder nNodeBuilder = new NetconfNodeBuilder();
        nNodeBuilder.setAvailableCapabilities(availableCapabilitiesBuilder.build());
        nNodeBuilder.setConnectionStatus(ConnectionStatus.Connected);

        //build
        NetconfNode nNode = nNodeBuilder.build();

        return nNode;
    }

}
