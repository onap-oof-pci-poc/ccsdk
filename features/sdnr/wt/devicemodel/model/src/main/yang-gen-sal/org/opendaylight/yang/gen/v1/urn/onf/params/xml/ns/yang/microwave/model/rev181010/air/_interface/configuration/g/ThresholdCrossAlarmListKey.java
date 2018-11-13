package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.configuration.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.GranularityPeriodType;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.G826Type;

public class ThresholdCrossAlarmListKey
 implements Identifier<ThresholdCrossAlarmList> {
    private static final long serialVersionUID = -2446113630528250237L;
    private final G826Type _g826ValueKind;
    private final GranularityPeriodType _granularityPeriod;


    public ThresholdCrossAlarmListKey(G826Type _g826ValueKind, GranularityPeriodType _granularityPeriod) {
    
    
        this._g826ValueKind = _g826ValueKind;
        this._granularityPeriod = _granularityPeriod;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ThresholdCrossAlarmListKey(ThresholdCrossAlarmListKey source) {
        this._g826ValueKind = source._g826ValueKind;
        this._granularityPeriod = source._granularityPeriod;
    }


    public G826Type getG826ValueKind() {
        return _g826ValueKind;
    }
    
    public GranularityPeriodType getGranularityPeriod() {
        return _granularityPeriod;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_g826ValueKind);
        result = prime * result + Objects.hashCode(_granularityPeriod);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ThresholdCrossAlarmListKey other = (ThresholdCrossAlarmListKey) obj;
        if (!Objects.equals(_g826ValueKind, other._g826ValueKind)) {
            return false;
        }
        if (!Objects.equals(_granularityPeriod, other._granularityPeriod)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.configuration.g.ThresholdCrossAlarmListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_g826ValueKind != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_g826ValueKind=");
            builder.append(_g826ValueKind);
        }
        if (_granularityPeriod != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_granularityPeriod=");
            builder.append(_granularityPeriod);
        }
        return builder.append(']').toString();
    }
}

