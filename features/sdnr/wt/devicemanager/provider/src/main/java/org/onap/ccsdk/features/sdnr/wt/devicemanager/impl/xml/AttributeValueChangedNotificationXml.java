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

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InternalDateAndTime;

@XmlRootElement(name = "AttributeValueChangedNotification")
public class AttributeValueChangedNotificationXml extends MwtNotificationBase implements GetEventType {

    private static String EVENTTYPE =  "AttributeValueChangedNotification";

    @XmlElement(name = "attributeName")
    private String attributeName;

    @XmlElement(name = "newValue")
    private String newValue;

    public AttributeValueChangedNotificationXml() {

    }

    /**
     * Normalized notification
     * @param nodeName name of mountpoint
     * @param counter of notification
     * @param timeStamp from ne
     * @param objectIdRef from ne
     * @param attributeName from ne
     * @param newValue from ne
     */
    public AttributeValueChangedNotificationXml(String nodeName, String counter, InternalDateAndTime timeStamp, String objectIdRef,
            String attributeName, String newValue) {
        super(nodeName, counter, timeStamp, objectIdRef);
        this.attributeName = attributeName;
        this.newValue = newValue;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public String getNewValue() {
        return newValue;
    }

    @Override
    public String getEventType() {
        return EVENTTYPE;
    }

}
