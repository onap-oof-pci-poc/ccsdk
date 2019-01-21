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

import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.xml.ProblemNotificationXml;

public interface ProviderClient extends AutoCloseable {

	/**
	 * Send out problem notification, that was created by a device/ or NE
	 * @param mountPointName related
	 * @param notification xml description
	 */
    public void sendProblemNotification(String mountPointName, ProblemNotificationXml notification);

	/**
	 * Send out problem notification
	 * @param mountPointName related
	 * @param notification xml description
	 * @param neDeviceAlarm  true indicates an NE originated alarm, false an sdncontroller generated alarm
	 */
	public void sendProblemNotification(String mountPointName, ProblemNotificationXml notification, boolean neDeviceAlarm);

}
