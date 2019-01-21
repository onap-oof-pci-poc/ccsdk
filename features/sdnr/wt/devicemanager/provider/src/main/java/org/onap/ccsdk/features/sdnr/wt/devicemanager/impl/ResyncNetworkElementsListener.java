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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface ResyncNetworkElementsListener
{
    /**
     * Handle API Request and clean up current alarms according to the list of mountpoint id's/devices
     * Implement RPC function "clear-current-fault-by-nodename"
     * @return List with
     * @throws IllegalStateException Illegal state exception
     */
    public @Nonnull List<String> doClearCurrentFaultByNodename(@Nullable List<String> nodeNamesInput) throws IllegalStateException;

}
