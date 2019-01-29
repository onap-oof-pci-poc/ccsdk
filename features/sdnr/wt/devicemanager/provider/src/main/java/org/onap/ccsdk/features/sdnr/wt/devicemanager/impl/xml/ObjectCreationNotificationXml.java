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

import javax.xml.bind.annotation.XmlRootElement;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes.InternalDateAndTime;

@XmlRootElement(name = "ObjectCreationNotification")
public class ObjectCreationNotificationXml extends MwtNotificationBase implements GetEventType {

    private static String EVENTTYPE =  "ObjectCreationNotification";

    public ObjectCreationNotificationXml() {

    }

    /**
     * Normalized notification
     * @param nodeName name of mountpoint or instance that owns the problem
     * @param counter of notification
     * @param timeStamp from ne
     * @param objectIdRef from ne
     */
    public ObjectCreationNotificationXml(String nodeName, String counter, InternalDateAndTime timeStamp, String objectIdRef) {
        super(nodeName, counter, timeStamp,  objectIdRef);
    }

    /*public ObjectCreationNotificationXml(String nodeName, org.opendaylight.yang.gen.v1.uri.onf.microwavemodel.notifications.rev160809.ObjectCreationNotification notification) {
        super(nodeName, notification.getCounter().toString(), InternalDateAndTime.valueOf(notification.getTimeStamp()),
                notification.getObjectIdRef().getValue());
    }

    public ObjectCreationNotificationXml(String nodeName, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ObjectCreationNotification notification) {
        super(nodeName, notification.getCounter().toString(), InternalDateAndTime.valueOf(notification.getTimeStamp()),
                notification.getObjectIdRef().getValue());
    }*/

    @Override
    public String getEventType() {
        return EVENTTYPE;
    }

}
