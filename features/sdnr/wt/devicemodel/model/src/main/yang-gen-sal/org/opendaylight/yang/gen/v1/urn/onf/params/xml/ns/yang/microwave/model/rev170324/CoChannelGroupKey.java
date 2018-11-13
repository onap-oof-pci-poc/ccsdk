package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class CoChannelGroupKey
 implements Identifier<CoChannelGroup> {
    private static final long serialVersionUID = 6478529281343266280L;
    private final UniversalId _coChannelGroupId;


    public CoChannelGroupKey(UniversalId _coChannelGroupId) {
    
    
        this._coChannelGroupId = _coChannelGroupId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public CoChannelGroupKey(CoChannelGroupKey source) {
        this._coChannelGroupId = source._coChannelGroupId;
    }


    public UniversalId getCoChannelGroupId() {
        return _coChannelGroupId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_coChannelGroupId);
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
        CoChannelGroupKey other = (CoChannelGroupKey) obj;
        if (!Objects.equals(_coChannelGroupId, other._coChannelGroupId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.CoChannelGroupKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_coChannelGroupId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_coChannelGroupId=");
            builder.append(_coChannelGroupId);
        }
        return builder.append(']').toString();
    }
}

