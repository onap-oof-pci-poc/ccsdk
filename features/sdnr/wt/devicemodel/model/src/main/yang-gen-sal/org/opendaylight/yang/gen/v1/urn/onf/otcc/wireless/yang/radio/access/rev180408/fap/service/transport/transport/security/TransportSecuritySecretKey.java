package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.security;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class TransportSecuritySecretKey
 implements Identifier<TransportSecuritySecret> {
    private static final long serialVersionUID = -2506599963265574983L;
    private final java.lang.String _uiccCardId;


    public TransportSecuritySecretKey(java.lang.String _uiccCardId) {
    
    
        this._uiccCardId = _uiccCardId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TransportSecuritySecretKey(TransportSecuritySecretKey source) {
        this._uiccCardId = source._uiccCardId;
    }


    public java.lang.String getUiccCardId() {
        return _uiccCardId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_uiccCardId);
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
        TransportSecuritySecretKey other = (TransportSecuritySecretKey) obj;
        if (!Objects.equals(_uiccCardId, other._uiccCardId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.security.TransportSecuritySecretKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_uiccCardId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_uiccCardId=");
            builder.append(_uiccCardId);
        }
        return builder.append(']').toString();
    }
}

