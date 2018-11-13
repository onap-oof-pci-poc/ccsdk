package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.capability.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class AvailableKindsOfDiversityKey
 implements Identifier<AvailableKindsOfDiversity> {
    private static final long serialVersionUID = -8909859521131846457L;
    private final java.lang.String _diversityName;


    public AvailableKindsOfDiversityKey(java.lang.String _diversityName) {
    
    
        this._diversityName = _diversityName;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AvailableKindsOfDiversityKey(AvailableKindsOfDiversityKey source) {
        this._diversityName = source._diversityName;
    }


    public java.lang.String getDiversityName() {
        return _diversityName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_diversityName);
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
        AvailableKindsOfDiversityKey other = (AvailableKindsOfDiversityKey) obj;
        if (!Objects.equals(_diversityName, other._diversityName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.capability.g.AvailableKindsOfDiversityKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_diversityName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_diversityName=");
            builder.append(_diversityName);
        }
        return builder.append(']').toString();
    }
}

