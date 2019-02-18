/*******************************************************************************
rev170324 * ============LICENSE_START======================================================= ONAP : ccsdk
 * feature sdnr wt sdnr-wt-devicemanager-provider
 * ================================================================================ Copyright (C)
 * 2019 highstreet technologies GmbH Intellectual Property. All rights reserved.
 * ================================================================================ Licensed under
 * the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License. ============LICENSE_END=========================================================
 ******************************************************************************/

package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.util;

import com.google.common.base.Optional;
import com.google.common.util.concurrent.CheckedFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.opendaylight.controller.md.sal.binding.api.ReadOnlyTransaction;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;
import org.opendaylight.controller.md.sal.common.api.data.ReadFailedException;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NetworkElement;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNode;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.NodeBuilder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

/**
 * @author herbert
 *
 */
@SuppressWarnings("deprecation")
public class ReadOnlyTransactionMountpoint1211pMock implements ReadOnlyTransaction {


    @Override
    public Object getIdentifier() {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends DataObject> CheckedFuture<Optional<T>, ReadFailedException> read(LogicalDatastoreType store,
            InstanceIdentifier<T> path) {

        System.out.println("READ: " + path + " Store: " + store);

        Optional<T> res1;

        if (path.getTargetType().equals(Node.class)) {
            System.out.println("Deliver " + path.getTargetType());
            NetconfNode nNode = Model1211pObjectMock.getNetconfNode();
            NodeBuilder nodeBuilder = new NodeBuilder();
            nodeBuilder.addAugmentation(NetconfNode.class, nNode);
            Node node = nodeBuilder.build();
            res1 = (Optional<T>) Optional.of(node);

        } else if (path.getTargetType().equals(NetworkElement.class)) {
            System.out.println("Deliver " + path.getTargetType());
            NetworkElement ne = Model1211pObjectMock.getNetworkElement();
            res1 = (Optional<T>) Optional.of(ne);

        } else if (path.getTargetType().equals(
                org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceCurrentProblems.class)) {
            // MwAirInterfacePac
            System.out.println("Deliver " + path.getTargetType());
            res1 = (Optional<T>) Optional.of(Model1211pObjectMock.getCurrentProblems(
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.current.problems.g.CurrentProblemListBuilder.class,
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceCurrentProblemsBuilder.class));

        } else if (path.getTargetType().equals(
                org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCurrentProblems.class)) {
            // MwAirInterfaceDiversityPac
            System.out.println("Deliver " + path.getTargetType());
            res1 = (Optional<T>) Optional.of(Model1211pObjectMock.getCurrentProblems(
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.current.problems.g.CurrentProblemListBuilder.class,
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCurrentProblemsBuilder.class));

        } else if (path.getTargetType().equals(
                org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerCurrentProblems.class)) {
            //EthernetContainerCurrentProblems
            System.out.println("Deliver " + path.getTargetType());
            res1 = (Optional<T>) Optional.of(Model1211pObjectMock.getCurrentProblems(
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.current.problems.g.CurrentProblemListBuilder.class,
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerCurrentProblemsBuilder.class));

        } else if (path.getTargetType().equals(
                org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerCurrentProblems.class)) {
            // TdmContainerCurrentProblems
            System.out.println("Deliver " + path.getTargetType());
            res1 = (Optional<T>) Optional.of(Model1211pObjectMock.getCurrentProblems(
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.current.problems.g.CurrentProblemListBuilder.class,
                    org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerCurrentProblemsBuilder.class));

        } else {
            System.err.println("Nothing to deliver for" + path.getTargetType());
            res1 = Optional.absent();
        }


        CheckedFuture<Optional<T>, ReadFailedException> res = new CheckedFuture<Optional<T>, ReadFailedException>() {

            @Override
            public void addListener(Runnable arg0, Executor arg1) {}

            @Override
            public boolean cancel(boolean mayInterruptIfRunning) {
                return false;
            }

            @Override
            public Optional<T> get() throws InterruptedException, ExecutionException {
                return res1;
            }

            @Override
            public Optional<T> get(long timeout, TimeUnit unit)
                    throws InterruptedException, ExecutionException, TimeoutException {
                return null;
            }

            @Override
            public boolean isCancelled() {
                return false;
            }

            @Override
            public boolean isDone() {
                return false;
            }

            @Override
            public Optional<T> checkedGet() throws ReadFailedException {
                return res1;
            }

            @Override
            public Optional<T> checkedGet(long arg0, TimeUnit arg1) throws TimeoutException, ReadFailedException {
                return null;
            }

        };
        return res;

    }


    @Override
    public void close() {}

}