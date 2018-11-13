package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ActionVerbs;
import java.util.Objects;

public class OperationDetailsKey
 implements Identifier<OperationDetails> {
    private static final long serialVersionUID = -2938773878185832923L;
    private final ActionVerbs _actionVerb;


    public OperationDetailsKey(ActionVerbs _actionVerb) {
    
    
        this._actionVerb = _actionVerb;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public OperationDetailsKey(OperationDetailsKey source) {
        this._actionVerb = source._actionVerb;
    }


    public ActionVerbs getActionVerb() {
        return _actionVerb;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_actionVerb);
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
        OperationDetailsKey other = (OperationDetailsKey) obj;
        if (!Objects.equals(_actionVerb, other._actionVerb)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetailsKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_actionVerb != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_actionVerb=");
            builder.append(_actionVerb);
        }
        return builder.append(']').toString();
    }
}

