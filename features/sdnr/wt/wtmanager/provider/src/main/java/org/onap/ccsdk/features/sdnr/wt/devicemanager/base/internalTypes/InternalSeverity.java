/**
 * @author herbert
 *
 */
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.internalTypes;

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
}
