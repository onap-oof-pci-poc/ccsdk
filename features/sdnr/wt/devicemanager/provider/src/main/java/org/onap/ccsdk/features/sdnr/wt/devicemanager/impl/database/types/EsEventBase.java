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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.types;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.EsObject;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.MwtNotificationBase;

/**
 *
 * Event from Network to be recorded in the database
 *
 */

public class EsEventBase extends EsObject {

    public static final String ESDATATYPENAME = "eventlog";

    private static final String EVENTLOG_FIELD_TIMESTAMP = "event.timeStamp";


    private MwtNotificationBase event;

    public MwtNotificationBase getProblem() {
        return event;
    }

    public void setProblem(MwtNotificationBase event) {
        this.event = event;
    }

    /**
     * Query to get older Elements
     * @param netconfTimeStamp to identify older Elements
     * @return QueryBuilder for older elements related to timestamp
     */
    public static QueryBuilder getQueryForTimeStamp(String netconfTimeStamp) {
      return new RangeQueryBuilder(EVENTLOG_FIELD_TIMESTAMP).lt(netconfTimeStamp);
    }

 }
