/**
 * Copyright (c) 2017 highstreet technologies GmbH
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.topology.rev150114.NetconfNode;

import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;

public interface DeviceManagerService {

    public enum Action {
        ADD,
        REMOVE,
        UPDATE
    }
    /**
     * Managed device is connected to node/mountpoint.
     * @param action provide action
     * @param nNodeId id of the mountpoint
     * @param nNode mountpoint contents
     */
    void startListenerOnNodeForConnectedState(Action action, NodeId nNodeId, NetconfNode nNode);

    /**
     * Managed device is disconnected from node/mountpoint.
     * @param nNodeId id of the mountpoint
     * @param nNode mountpoint contents
     */
    void leaveConnectedState(NodeId nNodeId, NetconfNode nNode);

    /**
     * Removal indication of node/mountpoint.
     * @param nNodeId id of the mountpoint
     */
    void mountpointNodeRemoved(NodeId nNodeId);
}
