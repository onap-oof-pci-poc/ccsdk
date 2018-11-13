package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class NecessaryInitialconditionConstraintsKey
 implements Identifier<NecessaryInitialconditionConstraints> {
    private static final long serialVersionUID = -2379791933105532312L;
    private final java.lang.Boolean _isNot;


    public NecessaryInitialconditionConstraintsKey(java.lang.Boolean _isNot) {
    
    
        this._isNot = _isNot;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NecessaryInitialconditionConstraintsKey(NecessaryInitialconditionConstraintsKey source) {
        this._isNot = source._isNot;
    }


    public java.lang.Boolean isIsNot() {
        return _isNot;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_isNot);
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
        NecessaryInitialconditionConstraintsKey other = (NecessaryInitialconditionConstraintsKey) obj;
        if (!Objects.equals(_isNot, other._isNot)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraintsKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_isNot != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_isNot=");
            builder.append(_isNot);
        }
        return builder.append(']').toString();
    }
}

