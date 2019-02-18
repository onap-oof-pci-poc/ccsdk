/*******************************************************************************
 * ============LICENSE_START=======================================================
 * ONAP : ccsdk feature sdnr wt
 *  ================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property.
 * All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.performancemanager.impl.database.types.EsPerformanceData;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.historical.performance.type.g.PerformanceDataBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.historical.performances.g.HistoricalPerformanceDataListBuilder;

public class TestPerformanceData1211 {

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
