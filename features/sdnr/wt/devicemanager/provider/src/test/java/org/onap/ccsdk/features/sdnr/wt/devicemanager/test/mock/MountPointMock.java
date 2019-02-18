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
import org.opendaylight.controller.md.sal.binding.api.BindingService;
import org.opendaylight.controller.md.sal.binding.api.MountPoint;
import org.opendaylight.controller.md.sal.binding.api.ReadOnlyTransaction;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.network.topology.topology.topology.types.TopologyNetconf;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NetworkTopology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.Topology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.TopologyKey;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

/**
 * @author herbert
 *
 */
public class MountPointMock implements MountPoint {

    private boolean databrokerAbsent = true;
    private final DataBrokerMountpointMock dataBroker = new DataBrokerMountpointMock();
    private final NotificationServiceMock notificationService = new NotificationServiceMock();

    private static final InstanceIdentifier<Topology> NETCONF_TOPO_IID =
            InstanceIdentifier.create(NetworkTopology.class).child(Topology.class,
                    new TopologyKey(new TopologyId(TopologyNetconf.QNAME.getLocalName())));

    @Override
    public InstanceIdentifier<?> getIdentifier() {
        return NETCONF_TOPO_IID;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends BindingService> Optional<T> getService(Class<T> service) {

        System.out.println("Requested mountpoint service: "+service.getSimpleName()+" databrokerAbsent state: "+databrokerAbsent);

        Optional<?> res;
        if (service.isInstance(dataBroker)) {
            res =  databrokerAbsent ? Optional.absent() : Optional.of(dataBroker);
        } else if (service.isInstance(org.opendaylight.controller.sal.binding.api.RpcConsumerRegistry.class)) {
            res = Optional.of(new RpcConsumerRegistryMock());
        } else if (service.isInstance(notificationService)) {
            res = Optional.of(notificationService);
        } else {
            res = Optional.absent();
        }
        return (Optional<T>)res;
    }

    public void setDatabrokerAbsent( boolean state) {
        this.databrokerAbsent = state;
    }

    public void setReadOnlyTransaction(ReadOnlyTransaction readOnlyTransaction) {
        dataBroker.setReadOnlyTransaction(readOnlyTransaction);
    }
}
