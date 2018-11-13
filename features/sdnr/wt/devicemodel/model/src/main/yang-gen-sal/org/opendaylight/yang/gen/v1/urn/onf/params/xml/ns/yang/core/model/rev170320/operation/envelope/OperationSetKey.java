package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ActionEffort;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class OperationSetKey
 implements Identifier<OperationSet> {
    private static final long serialVersionUID = -4446028912879684406L;
    private final ActionEffort _effortAndAction;


    public OperationSetKey(ActionEffort _effortAndAction) {
    
    
        this._effortAndAction = _effortAndAction;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public OperationSetKey(OperationSetKey source) {
        this._effortAndAction = source._effortAndAction;
    }


    public ActionEffort getEffortAndAction() {
        return _effortAndAction;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_effortAndAction);
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
        OperationSetKey other = (OperationSetKey) obj;
        if (!Objects.equals(_effortAndAction, other._effortAndAction)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSetKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_effortAndAction != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_effortAndAction=");
            builder.append(_effortAndAction);
        }
        return builder.append(']').toString();
    }
}

