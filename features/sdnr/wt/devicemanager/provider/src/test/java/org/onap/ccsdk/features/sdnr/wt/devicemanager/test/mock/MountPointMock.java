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
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

/**
 * @author herbert
 *
 */
public class MountPointMock implements MountPoint {

    private boolean databrokerAbsent = true;
    private final DataBrokerMountpointMock dataBroker = new DataBrokerMountpointMock();

    @Override
    public InstanceIdentifier<?> getIdentifier() {
        return null;
    }

    @Override
    public <T extends BindingService> Optional<T> getService(Class<T> service) {

        System.out.println("Requested mountpoint service: "+service.getSimpleName()+" databrokerAbsent state: "+databrokerAbsent);

        Optional<?> res = Optional.absent();
        if (service.isInstance(dataBroker)) {
            res =  databrokerAbsent ? Optional.absent() : Optional.of(dataBroker);
        } else if (service.isInstance(org.opendaylight.controller.sal.binding.api.RpcConsumerRegistry.class)) {
            res = Optional.of(new RpcConsumerRegistryMock());
        }
        return (Optional<T>)res;
    }

    public void setDatabrokerAbsent( boolean state) {
        this.databrokerAbsent = state;
    }

}
