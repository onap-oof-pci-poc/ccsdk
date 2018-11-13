package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.performance.type.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class TimeXStatesListKey
 implements Identifier<TimeXStatesList> {
    private static final long serialVersionUID = -1551604186022243941L;
    private final UniversalId _transmissionMode;


    public TimeXStatesListKey(UniversalId _transmissionMode) {
    
    
        this._transmissionMode = _transmissionMode;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TimeXStatesListKey(TimeXStatesListKey source) {
        this._transmissionMode = source._transmissionMode;
    }


    public UniversalId getTransmissionMode() {
        return _transmissionMode;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_transmissionMode);
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
        TimeXStatesListKey other = (TimeXStatesListKey) obj;
        if (!Objects.equals(_transmissionMode, other._transmissionMode)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.performance.type.g.TimeXStatesListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_transmissionMode != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_transmissionMode=");
            builder.append(_transmissionMode);
        }
        return builder.append(']').toString();
    }
}

