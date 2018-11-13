package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class RemCdma2000HrpdCellKey
 implements Identifier<RemCdma2000HrpdCell> {
    private static final long serialVersionUID = -1850495827444288200L;
    private final java.lang.String _remCdma2000HrpdCellKey;


    public RemCdma2000HrpdCellKey(java.lang.String _remCdma2000HrpdCellKey) {
    
    
        this._remCdma2000HrpdCellKey = _remCdma2000HrpdCellKey;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RemCdma2000HrpdCellKey(RemCdma2000HrpdCellKey source) {
        this._remCdma2000HrpdCellKey = source._remCdma2000HrpdCellKey;
    }


    public java.lang.String getRemCdma2000HrpdCellKey() {
        return _remCdma2000HrpdCellKey;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_remCdma2000HrpdCellKey);
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
        RemCdma2000HrpdCellKey other = (RemCdma2000HrpdCellKey) obj;
        if (!Objects.equals(_remCdma2000HrpdCellKey, other._remCdma2000HrpdCellKey)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCellKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_remCdma2000HrpdCellKey != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_remCdma2000HrpdCellKey=");
            builder.append(_remCdma2000HrpdCellKey);
        }
        return builder.append(']').toString();
    }
}

