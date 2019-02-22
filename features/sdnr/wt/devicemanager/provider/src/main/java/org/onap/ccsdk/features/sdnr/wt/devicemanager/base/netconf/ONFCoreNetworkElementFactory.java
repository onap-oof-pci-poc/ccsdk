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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.container.Capabilities;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.util.GenericTransactionUtils;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.toggleAlarmFilter.NotificationDelayService;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.ProviderClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.service.HtDatabaseEventsService;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ProblemNotificationXml;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.WebSocketServiceClient;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance.MaintenanceService;
import org.opendaylight.mdsal.binding.api.DataBroker;
import org.opendaylight.mdsal.common.api.LogicalDatastoreType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNodeConnectionStatus.ConnectionStatus;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Create a Network Element representation according to the capability information. The capabilities
 * are more than an ODL-QName. After the ? other terms than "revision" are provided.
 *
 */
public class ONFCoreNetworkElementFactory {

    private static final Logger LOG = LoggerFactory.getLogger(ONFCoreNetworkElementFactory.class);

    public static @Nonnull ONFCoreNetworkElementRepresentation create(String mountPointNodeName, DataBroker dataBroker,
            WebSocketServiceClient webSocketService, HtDatabaseEventsService databaseService,
            InstanceIdentifier<Node> instanceIdentifier, DataBroker mountpointDataBroker, ProviderClient dcaeProvider,
            @Nullable ProviderClient aotsmClient, MaintenanceService maintenanceService,
            NotificationDelayService<ProblemNotificationXml> notificationDelayService) {

        ONFCoreNetworkElementRepresentation res = null;
        Node nodeOption =
                GenericTransactionUtils.readData(dataBroker, LogicalDatastoreType.OPERATIONAL, instanceIdentifier);
        if (nodeOption != null) {
            NetconfNode nnode = nodeOption.augmentation(NetconfNode.class);
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
        if (res == null) {
            res = new ONFCoreEmpty(mountPointNodeName);
        }
        LOG.info("Mointpoint {} started as {}", mountPointNodeName, res.getClass().getSimpleName());
        return res;
    }

}
