/*******************************************************************************
 * ============LICENSE_START========================================================================
 * ONAP : ccsdk feature sdnr wt
 * =================================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property. All rights reserved.
 * =================================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * ============LICENSE_END==========================================================================
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf;

import com.google.common.base.Optional;
import com.google.common.util.concurrent.CheckedFuture;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.container.Capabilities;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.toggleAlarmFilter.NotificationDelayService;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.ProviderClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.service.HtDatabaseEventsService;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ProblemNotificationXml;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.WebSocketServiceClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance.MaintenanceService;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.ReadOnlyTransaction;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;
import org.opendaylight.controller.md.sal.common.api.data.ReadFailedException;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNodeConnectionStatus.ConnectionStatus;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Create a Network Element representation according to the capability
 * information. The capabilities are more than an ODL-QName. After the ? other
 * terms than "revision" are provided.
 *
 */
@SuppressWarnings("deprecation")
public class ONFCoreNetworkElementFactory {

    private static final Logger LOG = LoggerFactory.getLogger(ONFCoreNetworkElementFactory.class);

    @SuppressWarnings("deprecation")
    public static @Nonnull ONFCoreNetworkElementRepresentation create(String mountPointNodeName, DataBroker dataBroker,
            WebSocketServiceClient webSocketService, HtDatabaseEventsService databaseService,
            InstanceIdentifier<Node> instanceIdentifier, DataBroker mountpointDataBroker, ProviderClient dcaeProvider,
            @Nullable ProviderClient aotsmClient, MaintenanceService maintenanceService,
            NotificationDelayService<ProblemNotificationXml> notificationDelayService) {

        ONFCoreNetworkElementRepresentation res = null;
        try (ReadOnlyTransaction tx = dataBroker.newReadOnlyTransaction();){
            CheckedFuture<Optional<Node>, ReadFailedException> checkedFuture = tx.read(LogicalDatastoreType.OPERATIONAL, instanceIdentifier);
            Optional<Node> nodeOption = tx.read(LogicalDatastoreType.OPERATIONAL, instanceIdentifier).checkedGet();
            if (nodeOption.isPresent()) {
                Node node = nodeOption.get();
                NetconfNode nnode = node.getAugmentation(NetconfNode.class);
                if (nnode != null) {
                    ConnectionStatus csts = nnode.getConnectionStatus();
                    if (csts == ConnectionStatus.Connected) {
                        Capabilities capabilities = Capabilities.getAvailableCapabilities(nnode);
                        LOG.info("Mountpoint {} capabilities {}", mountPointNodeName, capabilities);
                        res = ONFCoreNetworkElement12.build(mountPointNodeName, capabilities, mountpointDataBroker,
                                webSocketService, databaseService, dcaeProvider, aotsmClient, maintenanceService,
                                notificationDelayService);
                        LOG.info("ONFCoreNetworkElementRepresentation12 value is not null? " + (res != null));
                    }
                }
            }
            tx.close();
        } catch (ReadFailedException | IllegalArgumentException e) {
            LOG.warn("Can not generate specific NE Version representation. ", e);
        }
        if (res == null) {
            res = new ONFCoreEmpty(mountPointNodeName);
        }
        LOG.info("Mointpoint {} started as {}", mountPointNodeName, res.getClass().getSimpleName());
        return res;
    }

}
