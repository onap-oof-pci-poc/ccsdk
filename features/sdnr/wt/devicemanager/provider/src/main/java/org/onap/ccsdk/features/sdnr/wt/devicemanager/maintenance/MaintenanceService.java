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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance;

public interface MaintenanceService {

	/**
	 * Verify maintenance state of given object according to the filter settings.
	 * The object is specified by the criteria provided in the parameters.
	 * The data _id (uuid) is equal to the mountpointReference.
	 * @param mountpointReference used as reference, to query the data from database.
	 * @param objectIdRef first level id in onf core model, delivered by notification objectid
	 * @param problem problem name of device, delivered in problem notification
	 * @return boolean indication
	 */
	boolean isONFObjectInMaintenance(String mountpointReference, String objectIdRef, String problem);

}
