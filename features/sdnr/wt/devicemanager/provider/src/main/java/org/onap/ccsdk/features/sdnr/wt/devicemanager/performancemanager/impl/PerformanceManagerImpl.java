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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.performancemanager.impl;

import javax.annotation.Nullable;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.ONFCoreNetworkElementRepresentation;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.performancemanager.impl.database.service.MicrowaveHistoricalPerformanceWriterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PerformanceManagerImpl implements AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(PerformanceManagerImpl.class);

    private @Nullable PerformanceManagerTask task;

    public PerformanceManagerImpl(long seconds, MicrowaveHistoricalPerformanceWriterService databaseService) {

        LOG.info("Construct begin {} with {} Seconds",PerformanceManagerImpl.class.getSimpleName(), seconds);

        if (MicrowaveHistoricalPerformanceWriterService.isAvailable(databaseService)) {

            LOG.info("Do start of PM task");
            task = new PerformanceManagerTask(seconds, databaseService);
            task.start();
            LOG.info("PM task scheduled");

        } else {
            LOG.info("Database not available. Do not start PM task");
        }

        LOG.info("Construct end {}",PerformanceManagerImpl.class.getSimpleName());
    }

    @Override
	public void close() {
        LOG.info("Close {}", PerformanceManagerImpl.class.getSimpleName());
        if (task != null) {
            task.stop();
        }
    }

    public void registration(String mountPointNodeName, ONFCoreNetworkElementRepresentation ne) {
        LOG.debug("Register {}",mountPointNodeName);
        if (task != null) {
			task.registration(mountPointNodeName, ne);
		}
    }

    public void deRegistration(String mountPointNodeName) {
        LOG.debug("Deregister {}",mountPointNodeName);
        if (task != null) {
			task.deRegistration(mountPointNodeName);
		}
    }

}
