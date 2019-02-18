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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InternalDateAndTime;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.container.ONFLayerProtocolName;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.wrapperc.WrapperMicrowaveModelRev170324;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NetworkElement;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NetworkElementBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceDiversityPac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwEthernetContainerPac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwPureEthernetStructurePac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwTdmContainerPac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.SeverityType;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.current.problems.g.CurrentProblemListBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceCurrentProblems;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceCurrentProblemsBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNodeBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNodeConnectionStatus.ConnectionStatus;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.AvailableCapabilitiesBuilder;
import org.opendaylight.yangtools.concepts.Builder;

public class Model12ObjectMock {

    public NetconfNode getNetconfNode() {

        AvailableCapabilitiesBuilder availableCapabilitiesBuilder =
                ObjectBuilder.getAvailableCababilitiesList(NetworkElement.QNAME, WrapperMicrowaveModelRev170324.QNAME);

        NetconfNodeBuilder nNodeBuilder = new NetconfNodeBuilder();
        nNodeBuilder.setAvailableCapabilities(availableCapabilitiesBuilder.build());
        nNodeBuilder.setConnectionStatus(ConnectionStatus.Connected);

        // build
        NetconfNode nNode = nNodeBuilder.build();
        return nNode;
    }

    public NetworkElement getNetworkElement() {

        NetworkElementBuilder networkElementBuilder = new NetworkElementBuilder();

        // ---- LTP List
        networkElementBuilder.setLtp(Arrays.asList(
                ObjectBuilder.getLtp(MwAirInterfacePac.class, MwAirInterfacePac.QNAME, ONFLayerProtocolName.MWAirInterface),
                ObjectBuilder.getLtp(MwEthernetContainerPac.class, MwEthernetContainerPac.QNAME,
                        ONFLayerProtocolName.EthernetContainer12),
                ObjectBuilder.getLtp(MwTdmContainerPac.class, MwTdmContainerPac.QNAME, ONFLayerProtocolName.TDMContainer),
                ObjectBuilder.getLtp(MwHybridMwStructurePac.class, MwHybridMwStructurePac.QNAME, ONFLayerProtocolName.Structure),
                ObjectBuilder.getLtp(MwAirInterfaceDiversityPac.class, MwAirInterfaceDiversityPac.QNAME, ONFLayerProtocolName.Structure),
                ObjectBuilder.getLtp(MwPureEthernetStructurePac.class, MwPureEthernetStructurePac.QNAME, ONFLayerProtocolName.Structure)
                ));
        // build
        NetworkElement networkElement = networkElementBuilder.build();
        return networkElement;
    }

    public AirInterfaceCurrentProblems getMwAirInterfacePacCurrentProblems() {
        /*
         * CurrentProblemListBuilder currentProblemListBuilder = new CurrentProblemListBuilder();
         * currentProblemListBuilder.setProblemName("Problem1");
         * currentProblemListBuilder.setProblemSeverity(SeverityType.Critical);
         * currentProblemListBuilder.setSequenceNumber(1); currentProblemListBuilder.setTimeStamp(new
         * DateAndTime(InternalDateAndTime.getTestpattern().getValue()));
         *
         * AirInterfaceCurrentProblemsBuilder airInterfaceCurrentProblemsBuilder = new
         * AirInterfaceCurrentProblemsBuilder();
         * airInterfaceCurrentProblemsBuilder.setCurrentProblemList(Arrays.asList(currentProblemListBuilder.
         * build()));
         *
         * return airInterfaceCurrentProblemsBuilder.build();
         */
        return getCurrentProblems(CurrentProblemListBuilder.class, AirInterfaceCurrentProblemsBuilder.class);
    }

    public <R, RB extends Builder<R>, PLB extends Builder<?>> R getCurrentProblems(Class<PLB> plbClazz,
            Class<RB> rbClazz) {

        try {
            PLB currentProblemListBuilder = plbClazz.newInstance();

            // currentProblemListBuilder.setProblemName("Problem1");
            Method setProblemName = plbClazz.getDeclaredMethod("setProblemName", String.class);
            setProblemName.setAccessible(true);
            setProblemName.invoke(currentProblemListBuilder, "Problem1");

            // currentProblemListBuilder.setProblemSeverity(SeverityType.Critical);
            Method setProblemSeverity = plbClazz.getDeclaredMethod("setProblemSeverity", SeverityType.class);
            setProblemSeverity.setAccessible(true);
            setProblemSeverity.invoke(currentProblemListBuilder, SeverityType.Critical);

            // currentProblemListBuilder.setSequenceNumber(1);
            Method setSequenceNumber = plbClazz.getDeclaredMethod("setSequenceNumber", Integer.class);
            setSequenceNumber.setAccessible(true);
            setSequenceNumber.invoke(currentProblemListBuilder, 1);

            // currentProblemListBuilder.setTimeStamp(new
            // DateAndTime(InternalDateAndTime.getTestpattern().getValue()));
            Method setTimeStamp = plbClazz.getDeclaredMethod("setTimeStamp", DateAndTime.class);
            setTimeStamp.setAccessible(true);
            setTimeStamp.invoke(currentProblemListBuilder,
                    new DateAndTime(InternalDateAndTime.getTestpattern().getValue()));

            // AirInterfaceCurrentProblemsBuilder airInterfaceCurrentProblemsBuilder = new
            // AirInterfaceCurrentProblemsBuilder();
            Builder<R> airInterfaceCurrentProblemsBuilder = rbClazz.newInstance();
            // airInterfaceCurrentProblemsBuilder.setCurrentProblemList(Arrays.asList(currentProblemListBuilder.build()));
            Method setCurrentProblemList = rbClazz.getDeclaredMethod("setCurrentProblemList", List.class);
            setCurrentProblemList.setAccessible(true);
            setCurrentProblemList.invoke(airInterfaceCurrentProblemsBuilder,
                    Arrays.asList(currentProblemListBuilder.build()));

            return airInterfaceCurrentProblemsBuilder.build();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException
                | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

}
