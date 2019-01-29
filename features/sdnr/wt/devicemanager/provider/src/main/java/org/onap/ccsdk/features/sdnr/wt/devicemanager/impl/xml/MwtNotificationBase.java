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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.XmlElement;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InternalDateAndTime;

public class MwtNotificationBase {

    private static String EMPTY = "empty";

    private String nodeName;
    private String counter;
    private String timeStamp;
    private String objectId;

    public MwtNotificationBase() {
        // For Jaxb
    }

    public MwtNotificationBase(String nodeName, String counter, InternalDateAndTime timeStamp, String objectId) {
        this.nodeName = nodeName;
        this.counter = counter;
        this.timeStamp = timeStamp.getValue();
        this.objectId = objectId;
        if (this.objectId == null) {
            this.objectId = EMPTY;
        }
    }

    @XmlElement(name = "nodeName")
    public String getNodeName() {
        return nodeName;
    }

    @XmlElement(name = "counter")
    public String getCounter() {
        return counter;
    }

    @XmlElement(name = "timeStamp")
    public String getTimeStamp() {
        return timeStamp;
    }

    @XmlElement(name = "objectId")
    public String getObjectId() {
        return objectId;
    }

    /**
     * Type for the Database to document the the same name that is used in the websockets.
     * @return String with type name of child class
     */
    @JsonProperty("type")
    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "MwtNotificationBase [getType()="+ getType() + ", nodeName=" + nodeName + ", counter=" + counter + ", timeStamp=" + timeStamp
                + ", objectId=" + objectId + "]";
    }


}
