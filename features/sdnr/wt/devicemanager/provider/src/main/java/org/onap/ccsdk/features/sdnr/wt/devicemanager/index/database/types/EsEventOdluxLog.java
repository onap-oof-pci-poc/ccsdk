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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.index.database.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.EsObject;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InternalDateAndTime;

/**
 * Event log, used by Odlux client.
 * Not used for writing any data by devicemanager.
 * Type introduced to implement IndexCleanService
 */

public class EsEventOdluxLog extends EsObject {

    public static final String ESDATATYPENAME = "log";

    private static final String LOG_FIELD_TIMESTAMP = "timestamp";

    private String type;
    private String component;
    private String message;
    private String timestamp;

    /**
     * For jackson
     */
    protected EsEventOdluxLog() {
    }
    /**
     * Constructor
     * @param type string
     * @param component string
     * @param message string
     * @param timestamp string with netconf format string
     */
    public EsEventOdluxLog(String type, String component, String message, InternalDateAndTime timestamp) {
        super();
        this.type = type;
        this.component = component;
        this.message = message;
        this.timestamp = timestamp.getValue();
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("component")
    public String getComponent() {
        return component;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty(LOG_FIELD_TIMESTAMP)
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Query to get older Elements
     * @param netconfTimeStamp to identify older Elements
     * @return QueryBuilder for older elements related to timestamp
     */
    public static QueryBuilder getQueryForTimeStamp(String netconfTimeStamp) {
      return new RangeQueryBuilder(LOG_FIELD_TIMESTAMP).lt(netconfTimeStamp);
    }

 }
