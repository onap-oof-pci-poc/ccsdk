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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.devicemonitor.impl;

public interface DeviceMonitor extends AutoCloseable {

    /**
     * Referesh database by raising all alarms again.
     */
	void refreshAlarmsInDb();

    /**
     * removeMountpointIndication deregisters a mountpoint for registration services
     * @param mountPointNodeName to deregister
     */
	void removeMountpointIndication(String mountPointNodeName);

	   /**
	    * Notify of device state change to "disconnected"
	    * Mount point supervision
	    * @param mountPointNodeName to deregister
	    */
	void deviceDisconnectIndication(String mountPointNodeName);

    /**
     * Notify of device state changes to "connected"
     * @param mountPointNodeName name of mount point
     * @param ne to monitor
     */
	void deviceConnectMasterIndication(String mountPointNodeName, DeviceMonitoredNe ne);

    /**
     * Notify of device state changes to "connected" for slave nodes
     * @param mountPointNodeName name of mount point
     */
	void deviceConnectSlaveIndication(String mountPointNodeName);

}
