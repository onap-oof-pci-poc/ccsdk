/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test;

import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtMapper;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.performancemanager.impl.database.types.EsHistoricalPerformance15Minutes;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.LpBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.historical.performances.g.HistoricalPerformanceDataListBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceHistoricalPerformancesBuilder;

public class TestMapper {

    @Test
    public void test() {

        int t = 0;
        System.out.println(t++);

        HtMapper<EsHistoricalPerformance15Minutes> mapper = new HtMapper<>(EsHistoricalPerformance15Minutes.class);
        System.out.println(t++);


        Lp layerProtocol = new LpBuilder().setUuid(new UniversalId("TestId")).setLayerProtocolName(new LayerProtocolName("LayprotcolTest")).build();
        System.out.println(t++);
        EsHistoricalPerformance15Minutes pmData = new EsHistoricalPerformance15Minutes("Testnode", layerProtocol);
        System.out.println(t++);

        AirInterfaceHistoricalPerformancesBuilder builder1 = new AirInterfaceHistoricalPerformancesBuilder();
        System.out.println(t++);

        HistoricalPerformanceDataListBuilder builder2 = new HistoricalPerformanceDataListBuilder();
        System.out.println(t++);
        builder2.setPeriodEndTime(new DateAndTime("2019-06-06T12:12:12.1Z"));
        System.out.println(t++);

        String json = mapper.objectToJson(pmData);

        System.out.println("Result: "+pmData);
        System.out.println("Result: "+json);

        //fail("Not yet implemented");
    }

}
