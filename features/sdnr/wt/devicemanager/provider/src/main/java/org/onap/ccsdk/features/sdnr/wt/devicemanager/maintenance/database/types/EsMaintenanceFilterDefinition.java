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
package org.onap.ccsdk.features.sdnr.wt.devicemanager.maintenance.database.types;

import java.util.Collections;
import java.util.Map;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.rev190109.maintenance.mode.g.filter.Definition;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EsMaintenanceFilterDefinition implements Definition {

    private static final Logger LOG = LoggerFactory.getLogger(EsMaintenanceFilterDefinition.class);
    private static final String ALL = "";

    //yang tools
    @JsonIgnore
    private final Map<java.lang.Class<? extends Augmentation<Definition>>, Augmentation<Definition>> augmentation = Collections.emptyMap();

    private String objectIdRef = ALL;
    private String problem = ALL;

    public EsMaintenanceFilterDefinition() {
    }

    public EsMaintenanceFilterDefinition(Definition definition) {
        objectIdRef = definition.getObjectIdRef();
        problem = definition.getProblem();
    }

    @Override
    @JsonProperty("object-id-ref")
    public String getObjectIdRef() {
        return objectIdRef;
    }

    @JsonProperty("object-id-ref")
    public void setObjectIdRef(String objectIdRef) {
        this.objectIdRef = objectIdRef == null ? ALL : objectIdRef;
    }

    @Override
    @JsonProperty("problem")
    public String getProblem() {
        return problem;
    }

    @JsonProperty("problem")
    public void setProblem(String pProblem) {
        this.problem = pProblem == null ? ALL : pProblem;
    }

    public boolean appliesToObjectReference(String pObjectIdRef, String pProblem) {
        boolean res = (pObjectIdRef.isEmpty() || pObjectIdRef.contains(pObjectIdRef)) && (pProblem.isEmpty() || pProblem.contains(pProblem));
        LOG.debug("Check result applies {}: {} {} against: {}",res, pObjectIdRef, pProblem, this);
        return res;
    }

    @Override
    public String toString() {
        return "EsMaintenanceFilterDefinition [objectIdRef=" + objectIdRef + ", problem=" + problem + "]";
    }

    @Override
    public Class<? extends DataContainer> getImplementedInterface() {
        return Definition.class;
    }

    @Override
    public <E extends Augmentation<Definition>> @Nullable E augmentation(Class<E> augmentationType) {
        return null;
    }



}
