/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test;

import org.junit.Test;
import org.mockito.Mockito;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.types.equipment.ExtendedEquipment;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class TestEquipment extends Mockito {

    @Test
    public void test() {


        EquipmentBuilder equipmentBuilder = new EquipmentBuilder();
        equipmentBuilder.setUuid( new UniversalId("EquipmentId"));
        ExtendedEquipment extendedEquipment = new ExtendedEquipment("Parent",equipmentBuilder.build(),1);

        String extendedEquipmentString = extendedEquipment.toString();
        System.out.println(extendedEquipmentString);
    }

}
