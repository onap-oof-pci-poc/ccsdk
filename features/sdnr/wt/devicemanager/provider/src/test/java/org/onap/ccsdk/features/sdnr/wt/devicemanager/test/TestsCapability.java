/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test;

import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.container.Capabilities;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.wrapperc.WrapperMicrowaveModelRev170324;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.test.util.ModelObjectMock;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NetworkElement;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNode;

public class TestsCapability {

    private static NetconfNode nNode;

    @BeforeClass
    public static void before() {
        nNode = ModelObjectMock.getNetconfNode();
    }

    @Test
    public void test1() {

        Capabilities capabilities = Capabilities.getAvailableCapabilities(nNode);
        assertTrue(capabilities.isSupportingNamespaceAndRevision(NetworkElement.QNAME));

    }

    @Test
    public void test2() {

        Capabilities capabilities = Capabilities.getAvailableCapabilities(nNode);
        assertTrue(capabilities.isSupportingNamespaceAndRevision(WrapperMicrowaveModelRev170324.QNAME));

    }


}
