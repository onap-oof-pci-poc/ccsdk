package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import java.util.Arrays;

public class Cdma2000HrpdBatchPcfpdsnKey
 implements Identifier<Cdma2000HrpdBatchPcfpdsn> {
    private static final long serialVersionUID = -3469475027925365834L;
    private final java.lang.Long _batchTableNumber;
    private final java.lang.Long _batchTableSecurityParameterIndex;
    private final byte[] _batchTableSecretKey;


    public Cdma2000HrpdBatchPcfpdsnKey(java.lang.Long _batchTableNumber, byte[] _batchTableSecretKey, java.lang.Long _batchTableSecurityParameterIndex) {
    
    
        this._batchTableNumber = _batchTableNumber;
        this._batchTableSecurityParameterIndex = _batchTableSecurityParameterIndex;
        this._batchTableSecretKey = _batchTableSecretKey == null ? null : _batchTableSecretKey.clone();
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Cdma2000HrpdBatchPcfpdsnKey(Cdma2000HrpdBatchPcfpdsnKey source) {
        this._batchTableNumber = source._batchTableNumber;
        this._batchTableSecurityParameterIndex = source._batchTableSecurityParameterIndex;
        this._batchTableSecretKey = source._batchTableSecretKey;
    }


    public java.lang.Long getBatchTableNumber() {
        return _batchTableNumber;
    }
    
    public java.lang.Long getBatchTableSecurityParameterIndex() {
        return _batchTableSecurityParameterIndex;
    }
    
    public byte[] getBatchTableSecretKey() {
        return _batchTableSecretKey == null ? null : _batchTableSecretKey.clone();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_batchTableNumber);
        result = prime * result + Objects.hashCode(_batchTableSecurityParameterIndex);
        result = prime * result + Arrays.hashCode(_batchTableSecretKey);
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
        Cdma2000HrpdBatchPcfpdsnKey other = (Cdma2000HrpdBatchPcfpdsnKey) obj;
        if (!Objects.equals(_batchTableNumber, other._batchTableNumber)) {
            return false;
        }
        if (!Objects.equals(_batchTableSecurityParameterIndex, other._batchTableSecurityParameterIndex)) {
            return false;
        }
        if (!Arrays.equals(_batchTableSecretKey, other._batchTableSecretKey)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsnKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_batchTableNumber != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_batchTableNumber=");
            builder.append(_batchTableNumber);
        }
        if (_batchTableSecurityParameterIndex != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_batchTableSecurityParameterIndex=");
            builder.append(_batchTableSecurityParameterIndex);
        }
        if (_batchTableSecretKey != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_batchTableSecretKey=");
            builder.append(Arrays.toString(_batchTableSecretKey));
        }
        return builder.append(']').toString();
    }
}

