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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.types.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database.HtMapper;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.base.netconf.ONFCoreNetworkElement12Equipment;
import org.onap.ccsdk.features.sdnr.wt.devicemanager.impl.database.service.HtDatabaseEventsService;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeState;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentCategory;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.CategoryBuilder;

public class TestMappEquipment<T> {



	public static void main(String[] args) {

		/*
		MyEquipmentBuilder eb = new MyEquipmentBuilder();
		eb.setAdministrativeState(AdministrativeState.Unlocked);
		eb.setCategory((new CategoryBuilder()).setCategory(EquipmentCategory.Rack).build());

		Equipment e2 = eb.build();

		String inspect = HtDatabaseEventsService.inspect(e2,0);
		System.out.println("Inspect: "+inspect);

		String json = HtDatabaseEventsService.toJson(e2);
		System.out.println("JSON: "+json);
		 */

	}


}
