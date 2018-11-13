package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class RemCdma2000OneXCellKey
 implements Identifier<RemCdma2000OneXCell> {
    private static final long serialVersionUID = 8738381264232074153L;
    private final java.lang.String _remCdma2000OneXCellKey;


    public RemCdma2000OneXCellKey(java.lang.String _remCdma2000OneXCellKey) {
    
    
        this._remCdma2000OneXCellKey = _remCdma2000OneXCellKey;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RemCdma2000OneXCellKey(RemCdma2000OneXCellKey source) {
        this._remCdma2000OneXCellKey = source._remCdma2000OneXCellKey;
    }


    public java.lang.String getRemCdma2000OneXCellKey() {
        return _remCdma2000OneXCellKey;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_remCdma2000OneXCellKey);
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
        RemCdma2000OneXCellKey other = (RemCdma2000OneXCellKey) obj;
        if (!Objects.equals(_remCdma2000OneXCellKey, other._remCdma2000OneXCellKey)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCellKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_remCdma2000OneXCellKey != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_remCdma2000OneXCellKey=");
            builder.append(_remCdma2000OneXCellKey);
        }
        return builder.append(']').toString();
    }
}

