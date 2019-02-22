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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.mock;

import com.google.common.base.Optional;
import org.opendaylight.mdsal.binding.api.MountPoint;
import org.opendaylight.mdsal.binding.api.MountPointService;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

/**
 * @author herbert
 *
 */
public class MountPointServiceMock implements MountPointService {

    private final MountPointMock mountpoint;

    public MountPointServiceMock(MountPointMock mountpoint) {
        this.mountpoint = mountpoint;
    }

    @Override
    public Optional<MountPoint> getMountPoint(InstanceIdentifier<?> mountPoint) {

        Optional<MountPoint> optional = Optional.of(mountpoint);
        return optional;
    }

    @Override
    public <T extends MountPointListener> ListenerRegistration<T> registerListener(InstanceIdentifier<?> path,
            T listener) {
        return null;
    }

}
