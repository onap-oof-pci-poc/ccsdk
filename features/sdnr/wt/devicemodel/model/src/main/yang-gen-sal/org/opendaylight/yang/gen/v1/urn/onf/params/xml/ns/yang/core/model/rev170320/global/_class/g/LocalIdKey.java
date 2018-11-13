package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.global._class.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class LocalIdKey
 implements Identifier<LocalId> {
    private static final long serialVersionUID = -1616212469806578593L;
    private final java.lang.String _valueName;


    public LocalIdKey(java.lang.String _valueName) {
    
    
        this._valueName = _valueName;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LocalIdKey(LocalIdKey source) {
        this._valueName = source._valueName;
    }


    public java.lang.String getValueName() {
        return _valueName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_valueName);
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
        LocalIdKey other = (LocalIdKey) obj;
        if (!Objects.equals(_valueName, other._valueName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.global._class.g.LocalIdKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_valueName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_valueName=");
            builder.append(_valueName);
        }
        return builder.append(']').toString();
    }
}

