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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.toggleAlarmFilter;

import java.util.HashMap;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.HtDevicemanagerConfiguration;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.IConfigChangedListener;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.config.impl.ToggleAlarmConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationDelayService<T> implements AutoCloseable {
    private static final Logger LOG = LoggerFactory.getLogger(NotificationDelayService.class);

    private final HashMap<String, NotificationDelayFilter<T>> filters;

    public NotificationDelayFilter<T> getInstance(String nodeName, NotificationDelayedListener<T> eventListener) {
        NotificationDelayFilter<T> filter = filters.getOrDefault(nodeName, null);

        LOG.trace("nodeName={}, filter!=null? {}", nodeName, filter != null);
        if (filter == null) {
            filter = new NotificationDelayFilter<>(nodeName, eventListener);
            this.filters.put(nodeName, filter);
        }
        return filter;
    }

    public NotificationDelayService(HtDevicemanagerConfiguration htconfig) {
        this.filters = new HashMap<>();
        htconfig.registerConfigChangedListener(configChangedListener);
        NotificationDelayFilter.setDelay(htconfig.getToggleAlarm().getDelay());
        NotificationDelayFilter.setEnabled(htconfig.getToggleAlarm().isEnabled());
    }

    private final IConfigChangedListener configChangedListener = () -> {
        ToggleAlarmConfig cfg = ToggleAlarmConfig.reload();
        NotificationDelayFilter.setDelay(cfg.getDelay());
        NotificationDelayFilter.setEnabled(cfg.isEnabled());
    };

    @Override
    public void close() throws Exception {
        // close all filters
        for (NotificationDelayFilter<T> filter : this.filters.values()) {
            filter.close();
        }
    }

}
