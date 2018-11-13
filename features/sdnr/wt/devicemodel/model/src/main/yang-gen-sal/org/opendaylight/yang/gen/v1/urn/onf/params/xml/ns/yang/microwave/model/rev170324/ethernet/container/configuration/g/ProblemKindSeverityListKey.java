package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ethernet.container.configuration.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class ProblemKindSeverityListKey
 implements Identifier<ProblemKindSeverityList> {
    private static final long serialVersionUID = 3272997561613329590L;
    private final java.lang.String _problemKindName;


    public ProblemKindSeverityListKey(java.lang.String _problemKindName) {
    
    
        this._problemKindName = _problemKindName;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ProblemKindSeverityListKey(ProblemKindSeverityListKey source) {
        this._problemKindName = source._problemKindName;
    }


    public java.lang.String getProblemKindName() {
        return _problemKindName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_problemKindName);
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
        ProblemKindSeverityListKey other = (ProblemKindSeverityListKey) obj;
        if (!Objects.equals(_problemKindName, other._problemKindName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ethernet.container.configuration.g.ProblemKindSeverityListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_problemKindName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_problemKindName=");
            builder.append(_problemKindName);
        }
        return builder.append(']').toString();
    }
}

