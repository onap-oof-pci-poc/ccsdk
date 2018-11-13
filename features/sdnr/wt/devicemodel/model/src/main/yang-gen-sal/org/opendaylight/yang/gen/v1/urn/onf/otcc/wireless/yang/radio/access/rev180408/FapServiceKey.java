package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class FapServiceKey
 implements Identifier<FapService> {
    private static final long serialVersionUID = 1553806071752656918L;
    private final java.lang.String _alias;


    public FapServiceKey(java.lang.String _alias) {
    
    
        this._alias = _alias;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public FapServiceKey(FapServiceKey source) {
        this._alias = source._alias;
    }


    public java.lang.String getAlias() {
        return _alias;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_alias);
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
        FapServiceKey other = (FapServiceKey) obj;
        if (!Objects.equals(_alias, other._alias)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapServiceKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_alias != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_alias=");
            builder.append(_alias);
        }
        return builder.append(']').toString();
    }
}

