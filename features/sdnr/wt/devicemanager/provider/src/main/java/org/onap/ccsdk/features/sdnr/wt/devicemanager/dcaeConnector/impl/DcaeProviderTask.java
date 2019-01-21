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
/**
 * Event provider to ECOMP for heartbeat message
 *
 * @author herbert
 *
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.dcaeConnector.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class DcaeProviderTask  implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(DcaeProviderTask.class);

    private int t = 0;
    private final DcaeMessages dcaeMessages;

    DcaeProviderTask(DcaeMessages dcaeMessages) {
        LOG.info("Create eventprovider task");
        this.dcaeMessages = dcaeMessages;
    }

    private void sendHeartbeat() {
         dcaeMessages.postHeartBeat();
    }

    @Override
    public void run() {
        LOG.debug("DCAE provider heartbeat tick start {}", t++);
        sendHeartbeat();
    }
}
