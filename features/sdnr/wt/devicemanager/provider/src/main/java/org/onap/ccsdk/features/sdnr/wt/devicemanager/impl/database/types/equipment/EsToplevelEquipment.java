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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.types.equipment;

import java.util.ArrayList;
import java.util.List;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.EsObject;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.ONFCoreNetworkElement12Equipment;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class EsToplevelEquipment extends EsObject {

    public static final String ESDATATYPENAME = "inventorytoplevel";

    String mountpoint;
	List<String> uuidList;

	public EsToplevelEquipment set(ONFCoreNetworkElement12Equipment coreEquipment) {

		mountpoint = coreEquipment.getMountpoint();
		this.setEsId(mountpoint);

		uuidList = new ArrayList<>();
		for (UniversalId uuid : coreEquipment.getTopLevelEqUuidList()) {
			uuidList.add(uuid.getValue());
		}

		return(this);
	}

}
