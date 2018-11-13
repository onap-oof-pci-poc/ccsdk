package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class HolderPacKey
 implements Identifier<HolderPac> {
    private static final long serialVersionUID = 1661186007487711408L;
    private final UniversalId _holder;


    public HolderPacKey(UniversalId _holder) {
    
    
        this._holder = _holder;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public HolderPacKey(HolderPacKey source) {
        this._holder = source._holder;
    }


    public UniversalId getHolder() {
        return _holder;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_holder);
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
        HolderPacKey other = (HolderPacKey) obj;
        if (!Objects.equals(_holder, other._holder)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPacKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_holder != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_holder=");
            builder.append(_holder);
        }
        return builder.append(']').toString();
    }
}

