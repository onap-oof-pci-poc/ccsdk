package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class ConnectorPacKey
 implements Identifier<ConnectorPac> {
    private static final long serialVersionUID = 3723386912449451364L;
    private final UniversalId _connector;


    public ConnectorPacKey(UniversalId _connector) {
    
    
        this._connector = _connector;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ConnectorPacKey(ConnectorPacKey source) {
        this._connector = source._connector;
    }


    public UniversalId getConnector() {
        return _connector;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_connector);
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
        ConnectorPacKey other = (ConnectorPacKey) obj;
        if (!Objects.equals(_connector, other._connector)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPacKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_connector != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_connector=");
            builder.append(_connector);
        }
        return builder.append(']').toString();
    }
}

