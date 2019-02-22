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

import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import java.util.Optional;
import org.opendaylight.mdsal.binding.api.NotificationService;
import org.opendaylight.mdsal.binding.api.ReadTransaction;
import org.opendaylight.mdsal.common.api.LogicalDatastoreType;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NetworkElement;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MicrowaveModelListener;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNode;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.NodeBuilder;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.NotificationListener;

/**
 * @author herbert
 *
 */
public class ReadOnlyTransactionMountpoint1211Mock implements ReadTransaction, NotificationService {

    private final Model1211ObjectMock mock = new Model1211ObjectMock();
    private MicrowaveModelListener modelListener;

    @Override
    public Object getIdentifier() {
        return null;
    }

    public Model1211ObjectMock getMock() {
        return mock;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends DataObject> FluentFuture<Optional<T>> read(LogicalDatastoreType store,
            InstanceIdentifier<T> path) {

        System.out.println("READ: " + path + " Store: " + store);

        Optional<T> res1;

        if (path.getTargetType().equals(Node.class)) {
            System.out.println("Deliver " + path.getTargetType());
            NetconfNode nNode = mock.getNetconfNode();
            NodeBuilder nodeBuilder = new NodeBuilder();
            nodeBuilder.addAugmentation(NetconfNode.class, nNode);
            Node node = nodeBuilder.build();
            res1 = (Optional<T>) Optional.of(node);

        } else if (path.getTargetType().equals(NetworkElement.class)) {
            System.out.println("Deliver " + path.getTargetType());
            NetworkElement ne = mock.getNetworkElement();
            res1 = (Optional<T>) Optional.of(ne);

        } else if (path.getTargetType().equals(
                org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCurrentProblems.class)) {
            // MwAirInterfacePac
            System.out.println("Deliver " + path.getTargetType());
            res1 = (Optional<T>) Optional.of(mock.getCurrentProblems(
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.current.problems.g.CurrentProblemListBuilder.class,
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCurrentProblemsBuilder.class));

        } else if (path.getTargetType().equals(
                org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityCurrentProblems.class)) {
            // MwAirInterfaceDiversityPac
            System.out.println("Deliver " + path.getTargetType());
            res1 = (Optional<T>) Optional.of(mock.getCurrentProblems(
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.current.problems.g.CurrentProblemListBuilder.class,
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityCurrentProblemsBuilder.class));

        } else if (path.getTargetType().equals(
                org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCurrentProblems.class)) {
            // MwHybridMwStructurePac
            System.out.println("Deliver " + path.getTargetType());
            res1 = (Optional<T>) Optional.of(mock.getCurrentProblems(
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.current.problems.g.CurrentProblemListBuilder.class,
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureCurrentProblemsBuilder.class));

        } else if (path.getTargetType().equals(
                org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityCurrentProblems.class)) {
            // MwAirInterfaceDiversityPac
            System.out.println("Deliver " + path.getTargetType());
            res1 = (Optional<T>) Optional.of(mock.getCurrentProblems(
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.current.problems.g.CurrentProblemListBuilder.class,
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityCurrentProblemsBuilder.class));

        } else if (path.getTargetType().equals(
                org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureCurrentProblems.class)) {
            // MwPureEthernetStructurePac
            System.out.println("Deliver " + path.getTargetType());
            res1 = (Optional<T>) Optional.of(mock.getCurrentProblems(
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.current.problems.g.CurrentProblemListBuilder.class,
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureCurrentProblemsBuilder.class));

        } else if (path.getTargetType().equals(
                org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCurrentProblems.class)) {
            //EthernetContainerCurrentProblems
            System.out.println("Deliver " + path.getTargetType());
            res1 = (Optional<T>) Optional.of(mock.getCurrentProblems(
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ethernet.container.current.problems.g.CurrentProblemListBuilder.class,
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCurrentProblemsBuilder.class));

        } else if (path.getTargetType().equals(
                org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerCurrentProblems.class)) {
            // TdmContainerCurrentProblems
            System.out.println("Deliver " + path.getTargetType());
            res1 = (Optional<T>) Optional.of(mock.getCurrentProblems(
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.tdm.container.current.problems.g.CurrentProblemListBuilder.class,
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerCurrentProblemsBuilder.class));

        } else {
            System.err.println("Nothing to deliver for" + path.getTargetType());
            res1 = Optional.empty();
        }

        FluentFuture<Optional<T>> res = FluentFuture.from(Futures.immediateFuture(res1));
        return res;

    }


    @Override
    public void close() {}

    @Override
    public <T extends NotificationListener> ListenerRegistration<T> registerNotificationListener(T listener) {
        this.modelListener = (MicrowaveModelListener)listener;
        return null;
    }


    public void sendProblemNotification() {
        System.out.println("Send out Problemnotification");
        modelListener.onProblemNotification(mock.getProblemNotification());
    }


}
