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

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import org.opendaylight.controller.md.sal.binding.api.NotificationPublishService;
import org.opendaylight.yangtools.yang.binding.Notification;

/**
 * @author herbert
 *
 */
@SuppressWarnings("deprecation")
public class NotificationPublishServiceMock implements NotificationPublishService {

    @Override
    public ListenableFuture<?> offerNotification(Notification notification) {
        return null;
    }

   @Override
    public ListenableFuture<?> offerNotification(Notification notification, int timeout, TimeUnit unit)
            throws InterruptedException {
        return null;
    }

    @Override
    public void putNotification(Notification notification) throws InterruptedException {
   }

}
