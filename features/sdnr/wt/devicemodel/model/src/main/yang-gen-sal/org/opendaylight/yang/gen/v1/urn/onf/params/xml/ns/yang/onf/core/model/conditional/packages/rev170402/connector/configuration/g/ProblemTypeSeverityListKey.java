package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.configuration.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class ProblemTypeSeverityListKey
 implements Identifier<ProblemTypeSeverityList> {
    private static final long serialVersionUID = -3093168478983519695L;
    private final java.lang.String _problemTypeName;


    public ProblemTypeSeverityListKey(java.lang.String _problemTypeName) {
    
    
        this._problemTypeName = _problemTypeName;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ProblemTypeSeverityListKey(ProblemTypeSeverityListKey source) {
        this._problemTypeName = source._problemTypeName;
    }


    public java.lang.String getProblemTypeName() {
        return _problemTypeName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_problemTypeName);
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
        ProblemTypeSeverityListKey other = (ProblemTypeSeverityListKey) obj;
        if (!Objects.equals(_problemTypeName, other._problemTypeName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.configuration.g.ProblemTypeSeverityListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_problemTypeName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_problemTypeName=");
            builder.append(_problemTypeName);
        }
        return builder.append(']').toString();
    }
}

