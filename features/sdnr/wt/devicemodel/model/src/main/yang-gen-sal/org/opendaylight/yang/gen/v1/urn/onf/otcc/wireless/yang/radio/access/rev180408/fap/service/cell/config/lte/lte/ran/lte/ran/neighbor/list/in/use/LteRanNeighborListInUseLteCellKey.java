package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class LteRanNeighborListInUseLteCellKey
 implements Identifier<LteRanNeighborListInUseLteCell> {
    private static final long serialVersionUID = -2578115355240363693L;
    private final java.lang.String _plmnid;
    private final java.lang.Long _cid;


    public LteRanNeighborListInUseLteCellKey(java.lang.Long _cid, java.lang.String _plmnid) {
    
    
        this._plmnid = _plmnid;
        this._cid = _cid;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LteRanNeighborListInUseLteCellKey(LteRanNeighborListInUseLteCellKey source) {
        this._plmnid = source._plmnid;
        this._cid = source._cid;
    }


    public java.lang.String getPlmnid() {
        return _plmnid;
    }
    
    public java.lang.Long getCid() {
        return _cid;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_plmnid);
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
        LteRanNeighborListInUseLteCellKey other = (LteRanNeighborListInUseLteCellKey) obj;
        if (!Objects.equals(_plmnid, other._plmnid)) {
            return false;
        }
        if (!Objects.equals(_cid, other._cid)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCellKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_plmnid != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_plmnid=");
            builder.append(_plmnid);
        }
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

