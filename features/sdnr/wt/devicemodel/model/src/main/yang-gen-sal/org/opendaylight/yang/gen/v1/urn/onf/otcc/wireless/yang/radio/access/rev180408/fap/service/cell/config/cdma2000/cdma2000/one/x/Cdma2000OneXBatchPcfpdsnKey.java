package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class Cdma2000OneXBatchPcfpdsnKey
 implements Identifier<Cdma2000OneXBatchPcfpdsn> {
    private static final long serialVersionUID = -4150269134455684497L;
    private final java.lang.Long _batchTableNumber;


    public Cdma2000OneXBatchPcfpdsnKey(java.lang.Long _batchTableNumber) {
    
    
        this._batchTableNumber = _batchTableNumber;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Cdma2000OneXBatchPcfpdsnKey(Cdma2000OneXBatchPcfpdsnKey source) {
        this._batchTableNumber = source._batchTableNumber;
    }


    public java.lang.Long getBatchTableNumber() {
        return _batchTableNumber;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_batchTableNumber);
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
        Cdma2000OneXBatchPcfpdsnKey other = (Cdma2000OneXBatchPcfpdsnKey) obj;
        if (!Objects.equals(_batchTableNumber, other._batchTableNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXBatchPcfpdsnKey.class.getSimpleName()).append(" [");
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
        return builder.append(']').toString();
    }
}

