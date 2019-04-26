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
/**
 * @author herbert
 *
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes;

import javax.annotation.Nullable;

public enum InternalSeverity {

        NonAlarmed,
        Warning,
        Minor,
        Major,
        Critical;

    public boolean isNoAlarmIndication() {
        return this == NonAlarmed;
    }

    public String getValueAsString() {
        return this.name();
    }

    @Override
    public String toString() {
        return this.name();
    }

    public String toNetconfString()
    {
        switch(this)
        {
        case NonAlarmed:
            return "non-alarmed";
        case Warning:
            return "warning";
        case Minor:
            return "minor";
        case Major:
            return "major";
        case Critical:
            return "critical";
        }
        return "not-specified";
    }

    /**
     * convert ONF 1.2 Severity
     * @param severity as input
     * @return String with related output
     */
    public static InternalSeverity valueOf(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.SeverityType severity ) {
        switch( severity ) {
            case NonAlarmed:
                return InternalSeverity.NonAlarmed;
            case Warning:
                return InternalSeverity.Warning;
            case Minor:
                return InternalSeverity.Minor;
            case Major:
                return InternalSeverity.Major;
            case Critical:
                return InternalSeverity.Critical;
        }
        return null;
    }

    /**
     * convert ONF 1.2.1.1 Severity
     * @param severity as input
     * @return String with related output
     */
    public static InternalSeverity valueOf(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SeverityType severity ) {
        switch( severity ) {
            case NonAlarmed:
                return InternalSeverity.NonAlarmed;
            case Warning:
                return InternalSeverity.Warning;
            case Minor:
                return InternalSeverity.Minor;
            case Major:
                return InternalSeverity.Major;
            case Critical:
                return InternalSeverity.Critical;
        }
        return null;
    }

    /**
     * convert ONF 1.2.1.1p Severity
     * @param severity as input
     * @return String with related output
     */
    public static InternalSeverity valueOf(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SeverityType severity ) {
        switch( severity ) {
            case NonAlarmed:
                return InternalSeverity.NonAlarmed;
            case Warning:
                return InternalSeverity.Warning;
            case Minor:
                return InternalSeverity.Minor;
            case Major:
                return InternalSeverity.Major;
            case Critical:
                return InternalSeverity.Critical;
        }
        return null;
    }

    /**
     * convert a text string into Severity
     * @param severityString with textes non[-]alarmed, warning minor major critical
     * @return related enum or null
     */
    public static @Nullable InternalSeverity valueOfString(String severityString) {

    	switch( severityString.toLowerCase().trim() ) {
    	case "non-alarmed":
    	case "nonalarmed":
    		return InternalSeverity.NonAlarmed;
    	case "warning":
    		return InternalSeverity.Warning;
    	case "minor":
    		return InternalSeverity.Minor;
    	case "major":
    		return InternalSeverity.Major;
    	case "critical":
    		return InternalSeverity.Critical;
    	}
    	return null;

    }
}
