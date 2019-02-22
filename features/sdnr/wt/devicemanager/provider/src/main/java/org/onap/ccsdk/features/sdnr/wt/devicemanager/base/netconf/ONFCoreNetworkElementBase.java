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
/**
 *
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf;

import java.util.List;
import javax.annotation.Nonnull;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InventoryInformation;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.container.Capabilities;
import org.opendaylight.mdsal.binding.api.DataBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author herbert
 *
 */
public abstract class ONFCoreNetworkElementBase implements AutoCloseable, ONFCoreNetworkElementRepresentation {

    private static final Logger LOG = LoggerFactory.getLogger(ONFCoreNetworkElementBase.class);

    protected static final String EMPTY = "";

    private final String mountPointNodeName;
    private final DataBroker netconfNodeDataBroker;
    private final Capabilities capabilities;
    private final boolean isNetworkElementCurrentProblemsSupporting10;

    private @Nonnull InventoryInformation inventoryInformation = new InventoryInformation();


    protected ONFCoreNetworkElementBase(String mountPointNodeName, DataBroker netconfNodeDataBroker,
            Capabilities capabilities) {
        LOG.info("Create ONFCoreNetworkElementBase");
        this.mountPointNodeName = mountPointNodeName;
        this.netconfNodeDataBroker = netconfNodeDataBroker;
        this.capabilities = capabilities;

        this.isNetworkElementCurrentProblemsSupporting10 = false;

    }

    @Override
    public String getMountPointNodeName() {
        return mountPointNodeName;
    }

    /**
     * @return the netconfNodeDataBroker
     */
    public DataBroker getNetconfNodeDataBroker() {
        return netconfNodeDataBroker;
    }

    /**
     * @return the capabilities
     */
    public Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * @return the isNetworkElementCurrentProblemsSupporting10
     */
    public boolean isNetworkElementCurrentProblemsSupporting10() {
        return isNetworkElementCurrentProblemsSupporting10;
    }

    public void setInventoryInformation(InventoryInformation newInventoryInformation) {
        this.inventoryInformation = newInventoryInformation;
    }

    @Override
    public InventoryInformation getInventoryInformation() {
        return getInventoryInformation(null);
    }

    @Override
    public InventoryInformation getInventoryInformation(String layerProtocolFilter) {
        InventoryInformation res = new InventoryInformation(inventoryInformation);
        res.setInterfaceUuidList(getFilteredInterfaceUuidsAsStringList(layerProtocolFilter));

        return res;
    }

    @Override
    public void close() throws Exception {}

    /*---------------------------------------------------------------
     * Getter/ Setter
     */

    public String getMountpoint() {
        return mountPointNodeName;
    }

    public DataBroker getDataBroker() {
        return netconfNodeDataBroker;
    }

    /*-----------------------------------------------------------------------------
     * Sychronization
     */

    @Override
    public void initSynchronizationExtension() {}

    protected @Nonnull abstract List<String> getFilteredInterfaceUuidsAsStringList(String layerProtocolFilter);

}
