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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.container;

import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.util.LinkIdentifyingObject;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.GranularityPeriodType;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.ObjectIdentifier;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnHistoryDataG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceConfigurationG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceHistoricalPerformanceTypeG;
import org.opendaylight.yangtools.yang.binding.DataContainer;

public class ExtendedAirInterfaceHistoricalPerformanceType1211 implements OtnHistoryDataG, LinkIdentifyingObject {

    private final AirInterfaceHistoricalPerformanceTypeG airInterfaceHistoricalPerformanceType;
    private final AirInterfaceConfigurationG airInterfaceConfiguration;

    public ExtendedAirInterfaceHistoricalPerformanceType1211(AirInterfaceHistoricalPerformanceTypeG data, AirInterfaceConfigurationG conf) {
        this.airInterfaceHistoricalPerformanceType = data;
        this.airInterfaceConfiguration = conf;
    }


    public AirInterfaceHistoricalPerformanceTypeG getAirInterfaceHistoricalPerformanceType() {
        return airInterfaceHistoricalPerformanceType;
    }


    public AirInterfaceConfigurationG getAirInterfaceConfiguration() {
        return airInterfaceConfiguration;
    }


    @Override
    public Class<? extends DataContainer> getImplementedInterface() {
        return airInterfaceHistoricalPerformanceType.getImplementedInterface();
    }

    @Override
    public String getHistoryDataId() {
        return airInterfaceHistoricalPerformanceType.getHistoryDataId();
    }

    @Override
    public DateAndTime getPeriodEndTime() {
        return airInterfaceHistoricalPerformanceType.getPeriodEndTime();
    }


    @Override
    public GranularityPeriodType getGranularityPeriod() {
        return airInterfaceHistoricalPerformanceType.getGranularityPeriod();
    }


     @Override
    public ObjectIdentifier getObjectClass() {
        return airInterfaceHistoricalPerformanceType.getObjectClass();
    }


    @Override
    public ObjectIdentifier getNameBinding() {
        return airInterfaceHistoricalPerformanceType.getNameBinding();
    }

    @Override
    public Boolean isSuspectIntervalFlag() {
        return airInterfaceHistoricalPerformanceType.isSuspectIntervalFlag();
    }

    @SuppressWarnings("deprecation")
    @Override
    public String getSignalId() {
        return airInterfaceConfiguration.getRadioSignalId();
    }


    @Override
    public String toString() {
        return "ExtendedAirInterfaceHistoricalPerformanceType [airInterfaceHistoricalPerformanceType="
                + airInterfaceHistoricalPerformanceType + ", airInterfaceConfiguration=" + airInterfaceConfiguration
                + "]";
    }





}
