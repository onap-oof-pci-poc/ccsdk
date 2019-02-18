/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.performancemanager.impl.database.types.EsPerformanceData;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performance.type.g.PerformanceDataBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.historical.performances.g.HistoricalPerformanceDataListBuilder;

public class TestPerformanceData12 {

    @Test
    public void test() {

        PerformanceDataBuilder p = new PerformanceDataBuilder();
        byte b=100;
        short s=100;
        p.setEs(100);
        p.setCses(100);
        p.setEs(100);
        p.setSes(100);
        p.setCses(100);
        p.setUnavailability(100);
        p.setTxLevelMin(b);
        p.setTxLevelMax(b);
        p.setTxLevelAvg(b);
        p.setRxLevelMin(b);
        p.setRxLevelMax(b);
        p.setRxLevelAvg(b);
        p.setTime2States(100);
        p.setTime4StatesS(100);
        p.setTime4States(100);
        p.setTime8States(100);
        p.setTime16StatesS(100);
        p.setTime16States(100);
        p.setTime32States(100);
        p.setTime64States(100);
        p.setTime128States(100);
        p.setTime256States(100);
        p.setTime512States(100);
        p.setTime512StatesL(100);
        p.setTime1024States(100);
        p.setTime1024StatesL(100);
        p.setTime2048States(100);
        p.setTime2048StatesL(100);
        p.setTime4096States(100);
        p.setTime4096StatesL(100);
        p.setTime8192States(100);
        p.setTime8192StatesL(100);
        p.setSnirMin(b);
        p.setSnirMax(b);
        p.setSnirAvg(b);
        p.setXpdMin(b);
        p.setXpdMax(b);
        p.setXpdAvg(b);
        p.setRfTempMin(b);
        p.setRfTempMax(b);
        p.setRfTempAvg(b);
        p.setDefectBlocksSum(s);
        p.setTimePeriod(100);

        HistoricalPerformanceDataListBuilder pmList = new HistoricalPerformanceDataListBuilder();
        pmList.setPerformanceData(p.build());

        EsPerformanceData pmData = new EsPerformanceData(pmList.build());

        assertTrue("Verify value", pmData.getEs() == 100);

        System.out.println(pmData.toString());
    }

}
