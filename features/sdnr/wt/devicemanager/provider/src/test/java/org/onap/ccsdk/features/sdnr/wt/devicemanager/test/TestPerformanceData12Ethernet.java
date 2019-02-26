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
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.container.historical.performance.type.g.PerformanceDataBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ethernet.container.historical.performances.g.HistoricalPerformanceDataListBuilder;

public class TestPerformanceData12Ethernet {

    @Test
    public void test1() {
        PerformanceDataBuilder p = new PerformanceDataBuilder();
        p.setTimePeriod(1);
        p.setTxEthernetBytesMaxM(2L);
        p.setTxEthernetBytesMaxS(3);
        p.setTxEthernetBytesSum(4L);

        HistoricalPerformanceDataListBuilder pmElement = new HistoricalPerformanceDataListBuilder();
        pmElement.setPerformanceData(p.build());

        //EthernetContainerHistoricalPerformancesBuilder pmList = new EthernetContainerHistoricalPerformancesBuilder();
        //pmList.setHistoricalPerformanceDataList(Arrays.asList(pmElement.build()));

        EsPerformanceData pmData = new EsPerformanceData(pmElement.build());

        assertTrue("Verify value", pmData.getEs() == null);
        assertTrue("Verify value", pmData.getTxEthernetBytesSum() == 4L);

        System.out.println(pmData.toString());
    }

}
