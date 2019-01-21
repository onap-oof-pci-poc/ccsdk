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
 *
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.devicemonitor.impl;

/**
 * @author herbert
 *
 */
public interface DeviceMonitoredNe {

    /**
     * Prepare subsequent check calls
     */
    public void prepareCheck();

    /**
     * Test connection to mediator, by getting data that have to be called from NE
     * @return true if connection working, false if not
     */
    public boolean checkIfConnectionToMediatorIsOk();

    /**
     * Test connection to NE via mediator, by getting data that have to be called from NE
     * @return true if connection working, false if not
     */
    public boolean checkIfConnectionToNeIsOk();


}
