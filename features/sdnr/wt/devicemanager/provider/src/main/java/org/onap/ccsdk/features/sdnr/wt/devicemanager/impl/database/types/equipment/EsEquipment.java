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
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.EquipmentInstance;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.EquipmentType;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.ManufacturerProperties;

public class EsEquipment extends EsObject {

    public static final String ESDATATYPENAME = "inventoryequipment";

	int treeLevel;
	String parentUuid;
    String mountpoint;
	String uuid;
	List<String> containedHolder;
	String manufacturerName;
	String manufacturerIdentifier;
	String serial;
	String date;
	String version;
	String description;
	String partTypeId;
	String modelIdentifier;
	String typeName;


	public EsEquipment set( String mountpoint, ExtendedEquipment extendedEquipment ) {

		Equipment equipment = extendedEquipment.getEquipment();

		this.parentUuid = extendedEquipment.getParentUuid();
		this.treeLevel = extendedEquipment.getTreeLevel();
		this.mountpoint = mountpoint;
		this.uuid = equipment.getUuid().getValue();
		this.setEsId(this.mountpoint+"/"+this.uuid);

		this.containedHolder = new ArrayList<>();
		List<ContainedHolder> containedHolderList = equipment.getContainedHolder();
		if (containedHolderList != null && !containedHolderList.isEmpty()) {
			for (ContainedHolder containedHolderElement: containedHolderList) {
				this.containedHolder.add(containedHolderElement.getKey().getUuid().getValue());
			}
		}
		ManufacturedThing manufacturedThing = equipment.getManufacturedThing();
		if (manufacturedThing != null) {
			ManufacturerProperties manufacturedProperties = manufacturedThing.getManufacturerProperties();
			if (manufacturedProperties != null) {
				this.manufacturerName = manufacturedProperties.getManufacturerName();
				this.manufacturerIdentifier = manufacturedProperties.getManufacturerIdentifier();
			}
			EquipmentInstance equipmentInstance = manufacturedThing.getEquipmentInstance();
			if (equipmentInstance != null) {
				this.serial = equipmentInstance.getSerialNumber();
				this.date = equipmentInstance.getManufactureDate();
			}
			EquipmentType equipmentType = manufacturedThing.getEquipmentType();
			if (equipmentType != null) {
				this.version = equipmentType.getVersion();
				this.description = equipmentType.getDescription();
				this.partTypeId = equipmentType.getPartTypeIdentifier();
				this.modelIdentifier = equipmentType.getModelIdentifier();
				this.typeName = equipmentType.getTypeName();
			}
		}

		return(this);
	}

}
