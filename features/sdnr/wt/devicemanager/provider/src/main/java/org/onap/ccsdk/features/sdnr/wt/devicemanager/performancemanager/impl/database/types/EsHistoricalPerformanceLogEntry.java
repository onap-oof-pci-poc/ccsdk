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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.performancemanager.impl.database.types;

import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.EsObject;

/**
 *
 * Event from Network to be recorded in the database
 *
 */

public class EsHistoricalPerformanceLogEntry extends EsObject {

    public static final String ESDATATYPENAME = "performancelog";

    private String mountpoint;
    private String interfaceIdx;
    private String timeStamp;
    private String logText;

    /**
     * Create Log entry for NE/Interfaceproblems during PM execution
     * @param mountpoint Name of
     * @param interfaceIdx Name of
     * @param timeStamp Time and date of occurence
     * @param logText to write
     */
    public EsHistoricalPerformanceLogEntry(String mountpoint, String interfaceIdx, String timeStamp, String logText) {
        super();
        this.mountpoint = mountpoint;
        this.interfaceIdx = interfaceIdx;
        this.timeStamp = timeStamp;
        this.logText = logText;
    }

    /**
     * For jackson purpose
     */
    EsHistoricalPerformanceLogEntry() {
    }

    /**
     * @return the mountpoint
     */
    public String getMountpoint() {
        return mountpoint;
    }

    /**
     * @return the interfaceIdx
     */
    public String getInterfaceIdx() {
        return interfaceIdx;
    }

    /**
     * @return the timeStamp
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * @return the logText
     */
    public String getLogText() {
        return logText;
    }



    public static String getEsdatatypename() {
        return ESDATATYPENAME;
    }

 }
