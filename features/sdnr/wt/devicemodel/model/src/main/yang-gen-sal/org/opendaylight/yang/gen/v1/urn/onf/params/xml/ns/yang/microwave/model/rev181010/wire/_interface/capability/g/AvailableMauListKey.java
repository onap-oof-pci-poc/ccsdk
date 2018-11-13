package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class AvailableMauListKey
 implements Identifier<AvailableMauList> {
    private static final long serialVersionUID = 3207435536535811294L;
    private final UniversalId _mauId;


    public AvailableMauListKey(UniversalId _mauId) {
    
    
        this._mauId = _mauId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AvailableMauListKey(AvailableMauListKey source) {
        this._mauId = source._mauId;
    }


    public UniversalId getMauId() {
        return _mauId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_mauId);
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
        AvailableMauListKey other = (AvailableMauListKey) obj;
        if (!Objects.equals(_mauId, other._mauId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_mauId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_mauId=");
            builder.append(_mauId);
        }
        return builder.append(']').toString();
    }
}

