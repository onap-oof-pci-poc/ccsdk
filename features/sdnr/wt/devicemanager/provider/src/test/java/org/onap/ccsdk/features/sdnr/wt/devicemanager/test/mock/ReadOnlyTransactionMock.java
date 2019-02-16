/*******************************************************************************
 * ============LICENSE_START=======================================================
 * ONAP : ccsdk feature sdnr wt sdnr-wt-devicemanager-provider
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

package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.mock;

import com.google.common.base.Optional;
import com.google.common.util.concurrent.CheckedFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.test.util.TestNetconfNode;
import org.opendaylight.controller.md.sal.binding.api.ReadOnlyTransaction;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;
import org.opendaylight.controller.md.sal.common.api.data.ReadFailedException;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.AvailableCapabilitiesBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.available.capabilities.AvailableCapability;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.netconf.node.connection.status.available.capabilities.AvailableCapabilityBuilder;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.NodeBuilder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

/**
 * @author herbert
 *
 */
@SuppressWarnings("deprecation")
public class ReadOnlyTransactionMock implements ReadOnlyTransaction {


    @Override
    public Object getIdentifier() {
        return null;
    }

    @Override
    public <T extends DataObject> CheckedFuture<Optional<T>, ReadFailedException> read(LogicalDatastoreType store,
            InstanceIdentifier<T> path) {

        /*
        NetconfNodeBuilder netconfNodeBuilder = new NetconfNodeBuilder();
        netconfNodeBuilder.setConnectionStatus(ConnectionStatus.Connected);
        netconfNodeBuilder.setAvailableCapabilities(getCababilitiesList(WrapperMicrowaveModelRev181010.QNAME.toString()).build());
        NetconfNode nnode = netconfNodeBuilder.build();
        */
        NetconfNode nNode = TestNetconfNode.get();
        NodeBuilder nodeBuilder = new NodeBuilder();
        nodeBuilder.addAugmentation(NetconfNode.class, nNode);
        Node node = nodeBuilder.build();

        @SuppressWarnings("unchecked")
        Optional<T> res1 = (Optional<T>) Optional.of(node);
        CheckedFuture<Optional<T>, ReadFailedException> res = new CheckedFuture<Optional<T>, ReadFailedException>() {

            @Override
            public void addListener(Runnable arg0, Executor arg1) {
            }

            @Override
            public boolean cancel(boolean mayInterruptIfRunning) {
                return false;
            }

            @Override
            public Optional<T> get() throws InterruptedException, ExecutionException {
                return null;
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

    private AvailableCapabilitiesBuilder getCababilitiesList(String ... strings) {
        return getCababilitiesList(null, strings);
    }

    private AvailableCapabilitiesBuilder getCababilitiesList(AvailableCapabilitiesBuilder valueBuilder, String ... strings) {
        if (valueBuilder == null) {
            valueBuilder = new AvailableCapabilitiesBuilder();
        }
        List<AvailableCapability> capabilites = new ArrayList<>();
        for (String s : strings) {
            AvailableCapabilityBuilder capabilityBuilder = new AvailableCapabilityBuilder();
            capabilityBuilder.setCapability(s);
            capabilites.add(capabilityBuilder.build());
        }
        valueBuilder.setAvailableCapability(capabilites);
        return valueBuilder;
    }

    @Override
    public void close() {
    }

}
