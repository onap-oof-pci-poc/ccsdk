package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import java.util.Arrays;

public class Cdma2000OneXPcfpdsnKey
 implements Identifier<Cdma2000OneXPcfpdsn> {
    private static final long serialVersionUID = 5977322471096413301L;
    private final java.lang.Long _pdsnNumber;
    private final java.lang.Long _securityParameterIndex;
    private final byte[] _securityKey;


    public Cdma2000OneXPcfpdsnKey(java.lang.Long _pdsnNumber, byte[] _securityKey, java.lang.Long _securityParameterIndex) {
    
    
        this._pdsnNumber = _pdsnNumber;
        this._securityParameterIndex = _securityParameterIndex;
        this._securityKey = _securityKey == null ? null : _securityKey.clone();
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Cdma2000OneXPcfpdsnKey(Cdma2000OneXPcfpdsnKey source) {
        this._pdsnNumber = source._pdsnNumber;
        this._securityParameterIndex = source._securityParameterIndex;
        this._securityKey = source._securityKey;
    }


    public java.lang.Long getPdsnNumber() {
        return _pdsnNumber;
    }
    
    public java.lang.Long getSecurityParameterIndex() {
        return _securityParameterIndex;
    }
    
    public byte[] getSecurityKey() {
        return _securityKey == null ? null : _securityKey.clone();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_pdsnNumber);
        result = prime * result + Objects.hashCode(_securityParameterIndex);
        result = prime * result + Arrays.hashCode(_securityKey);
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
        Cdma2000OneXPcfpdsnKey other = (Cdma2000OneXPcfpdsnKey) obj;
        if (!Objects.equals(_pdsnNumber, other._pdsnNumber)) {
            return false;
        }
        if (!Objects.equals(_securityParameterIndex, other._securityParameterIndex)) {
            return false;
        }
        if (!Arrays.equals(_securityKey, other._securityKey)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsnKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_pdsnNumber != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_pdsnNumber=");
            builder.append(_pdsnNumber);
        }
        if (_securityParameterIndex != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_securityParameterIndex=");
            builder.append(_securityParameterIndex);
        }
        if (_securityKey != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_securityKey=");
            builder.append(Arrays.toString(_securityKey));
        }
        return builder.append(']').toString();
    }
}

