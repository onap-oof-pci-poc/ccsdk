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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.test.util;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InternalDateAndTime;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InternalSeverity;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.util.NetconfTimeStamp;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.DeviceManagerImpl;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.service.HtDatabaseEventsService;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ObjectCreationNotificationXml;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ProblemNotificationXml;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.index.database.types.EsEventOdluxLog;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.index.impl.IndexMwtnService;

public class DBCleanServiceHelper {

    private static final NetconfTimeStamp NETCONFTIME_CONVERTER = NetconfTimeStamp.getConverter();

    private final HtDatabaseEventsService databaseEventService;
    private final IndexMwtnService mwtnService;

    /**
     * Helper to fill data into the database
     * @param deviceManager devicemanger to get services
     */
    public DBCleanServiceHelper(DeviceManagerImpl deviceManager) {
        this.databaseEventService = deviceManager.getDatabaseClientEvents();
        this.mwtnService = deviceManager.getMwtnService();
    }

    /**
     * Write data into database with specific date and content profile.
     * @param number of data to be written for each log
     * @param days starting day, relative to actual date
     * @param hours starting hour ... increased by one hour for each write
     * @return integer with the amount of written data
     */
    public int writeDataToLogs(int number, int days, int hours) {
        int res = 0;
        for (Integer t=0; t < number; t++) { //Test "sdnevents", "eventlog"
            ObjectCreationNotificationXml notificationXml = new ObjectCreationNotificationXml(
                    "Testpoint"+t, t.toString(), getInternalDateAndTime(days, hours+t), "ObjectId"+t);
            databaseEventService.writeEventLog(notificationXml);
            res++;
        }

        for (Integer t=0; t < number; t++) { //Test "sdnevents", "faultlog"
            ProblemNotificationXml fault = new ProblemNotificationXml(
                    "ProblemNode"+t, "Problemuuid", "Problemname", InternalSeverity.Major, t.toString(), getInternalDateAndTime(days, hours+t));
            databaseEventService.writeFaultLog(fault);
            res++;
        }

        for (Integer t=0; t < number; t++) { //Test "mwtn", "log"
            EsEventOdluxLog odluxEvent = new EsEventOdluxLog("Odluxevent"+t, "Problemuuid", "Message", getInternalDateAndTime(days, hours+t));
            mwtnService.writeOdluxEventForTestpurpose(odluxEvent);
            res++;
        }

        return res;
    }

    /**************************************************************
     * Private section
     */

    private InternalDateAndTime getInternalDateAndTime(int days, int hours) {
        Date actual = new Date(new Date().getTime() - TimeUnit.MILLISECONDS.convert(days, TimeUnit.DAYS) - TimeUnit.MILLISECONDS.convert(hours, TimeUnit.HOURS));
        InternalDateAndTime timeStamp = InternalDateAndTime.valueOf(NETCONFTIME_CONVERTER.getTimeStamp(actual));
        return timeStamp;
    }


}
