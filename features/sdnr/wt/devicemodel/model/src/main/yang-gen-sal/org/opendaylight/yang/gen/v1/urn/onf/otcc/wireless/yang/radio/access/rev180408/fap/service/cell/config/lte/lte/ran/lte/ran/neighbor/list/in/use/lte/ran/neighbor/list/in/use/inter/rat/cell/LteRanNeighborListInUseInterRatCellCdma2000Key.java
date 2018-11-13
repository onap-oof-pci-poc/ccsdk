package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class LteRanNeighborListInUseInterRatCellCdma2000Key
 implements Identifier<LteRanNeighborListInUseInterRatCellCdma2000> {
    private static final long serialVersionUID = -6635708567221106151L;
    private final java.lang.String _cid;


    public LteRanNeighborListInUseInterRatCellCdma2000Key(java.lang.String _cid) {
    
    
        this._cid = _cid;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LteRanNeighborListInUseInterRatCellCdma2000Key(LteRanNeighborListInUseInterRatCellCdma2000Key source) {
        this._cid = source._cid;
    }


    public java.lang.String getCid() {
        return _cid;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_cid);
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
        LteRanNeighborListInUseInterRatCellCdma2000Key other = (LteRanNeighborListInUseInterRatCellCdma2000Key) obj;
        if (!Objects.equals(_cid, other._cid)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000Key.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_cid != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_cid=");
            builder.append(_cid);
        }
        return builder.append(']').toString();
    }
}

