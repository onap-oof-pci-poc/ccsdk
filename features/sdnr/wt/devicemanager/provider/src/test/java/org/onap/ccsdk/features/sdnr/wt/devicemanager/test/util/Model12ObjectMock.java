/*
 * Copyright (c) 2019 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InternalDateAndTime;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.container.ONFLayerProtocolName;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.wrapperc.WrapperMicrowaveModelRev170324;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NetworkElement;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NetworkElementBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.extension.g.Extension;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.extension.g.ExtensionBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.LpBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.LpKey;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.network.element.Ltp;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.network.element.LtpBuilder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.network.element.LtpKey;
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
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.available.capabilities.AvailableCapability;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.available.capabilities.AvailableCapabilityBuilder;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.common.QName;

public class Model12ObjectMock {

    public static NetconfNode getNetconfNode() {

        AvailableCapabilitiesBuilder availableCapabilitiesBuilder =
                getAvailableCababilitiesList(NetworkElement.QNAME, WrapperMicrowaveModelRev170324.QNAME);

        NetconfNodeBuilder nNodeBuilder = new NetconfNodeBuilder();
        nNodeBuilder.setAvailableCapabilities(availableCapabilitiesBuilder.build());
        nNodeBuilder.setConnectionStatus(ConnectionStatus.Connected);

        // build
        NetconfNode nNode = nNodeBuilder.build();
        return nNode;
    }

    public static NetworkElement getNetworkElement() {

        NetworkElementBuilder networkElementBuilder = new NetworkElementBuilder();

        // ---- LTP List
        networkElementBuilder.setLtp(Arrays.asList(
                getLtp(MwAirInterfacePac.class, MwAirInterfacePac.QNAME, ONFLayerProtocolName.MWAirInterface),
                getLtp(MwEthernetContainerPac.class, MwEthernetContainerPac.QNAME,
                        ONFLayerProtocolName.EthernetContainer12),
                getLtp(MwTdmContainerPac.class, MwTdmContainerPac.QNAME, ONFLayerProtocolName.TDMContainer),
                getLtp(MwHybridMwStructurePac.class, MwHybridMwStructurePac.QNAME, ONFLayerProtocolName.Structure),
                getLtp(MwAirInterfaceDiversityPac.class, MwAirInterfaceDiversityPac.QNAME, ONFLayerProtocolName.Structure),
                getLtp(MwPureEthernetStructurePac.class, MwPureEthernetStructurePac.QNAME, ONFLayerProtocolName.Structure)
                ));
        // build
        NetworkElement networkElement = networkElementBuilder.build();
        return networkElement;
    }

    public static AirInterfaceCurrentProblems getMwAirInterfacePacCurrentProblems() {
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

    public static <R, RB extends Builder<R>, PLB extends Builder<?>> R getCurrentProblems(Class<PLB> plbClazz,
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

    /******************************************************************************
     * Helper functions
     */

    static private AvailableCapabilitiesBuilder getAvailableCababilitiesList(QName... qNames) {
        return getAvailableCababilitiesList(null, qNames);
    }

    static private AvailableCapabilitiesBuilder getAvailableCababilitiesList(AvailableCapabilitiesBuilder valueBuilder,
            QName... qNames) {
        if (valueBuilder == null) {
            valueBuilder = new AvailableCapabilitiesBuilder();
        }
        List<AvailableCapability> capabilites = new ArrayList<>();
        for (QName s : qNames) {
            AvailableCapabilityBuilder capabilityBuilder = new AvailableCapabilityBuilder();
            capabilityBuilder.setCapability(s.toString());
            capabilites.add(capabilityBuilder.build());
        }
        valueBuilder.setAvailableCapability(capabilites);
        return valueBuilder;
    }

    private static Extension getExtension(String valueName, String value) {
        ExtensionBuilder lpExtension = new ExtensionBuilder();
        lpExtension.setValueName(valueName);
        lpExtension.setValue(value);
        return lpExtension.build();
    }

    private static Ltp getLtp(Class<?> clazz, QName qname, ONFLayerProtocolName onflayerProtocolName) {
        String baseName = clazz.getSimpleName();
        LpBuilder lpBuilder = new LpBuilder();
        lpBuilder.withKey(new LpKey(new UniversalId(baseName + "LpKey")));
        lpBuilder.setLayerProtocolName(new LayerProtocolName(onflayerProtocolName.getValue()));
        lpBuilder.setExtension(Arrays.asList(getExtension("capability", qname.getNamespace().toString()),
                getExtension("revision", qname.getRevision().get().toString()),
                getExtension("conditional-package", qname.getLocalName())));

        LtpBuilder ltpBuilder = new LtpBuilder();
        ltpBuilder.setUuid(new UniversalId(baseName));
        ltpBuilder.setLp(Arrays.asList(lpBuilder.build()));
        ltpBuilder.withKey(new LtpKey(new UniversalId(baseName + "LtpKey")));
        return ltpBuilder.build();
    }
}
