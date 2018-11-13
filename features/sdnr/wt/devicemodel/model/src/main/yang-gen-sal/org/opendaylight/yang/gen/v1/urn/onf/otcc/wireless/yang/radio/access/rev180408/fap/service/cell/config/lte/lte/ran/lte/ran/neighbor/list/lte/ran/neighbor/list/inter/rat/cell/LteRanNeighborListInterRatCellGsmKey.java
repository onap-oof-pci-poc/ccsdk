package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.lte.ran.neighbor.list.inter.rat.cell;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class LteRanNeighborListInterRatCellGsmKey
 implements Identifier<LteRanNeighborListInterRatCellGsm> {
    private static final long serialVersionUID = 810017754219753989L;
    private final java.lang.String _plmnid;
    private final java.lang.Integer _lac;
    private final java.lang.Integer _ci;


    public LteRanNeighborListInterRatCellGsmKey(java.lang.Integer _ci, java.lang.Integer _lac, java.lang.String _plmnid) {
    
    
        this._plmnid = _plmnid;
        this._lac = _lac;
        this._ci = _ci;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LteRanNeighborListInterRatCellGsmKey(LteRanNeighborListInterRatCellGsmKey source) {
        this._plmnid = source._plmnid;
        this._lac = source._lac;
        this._ci = source._ci;
    }


    public java.lang.String getPlmnid() {
        return _plmnid;
    }
    
    public java.lang.Integer getLac() {
        return _lac;
    }
    
    public java.lang.Integer getCi() {
        return _ci;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_plmnid);
        result = prime * result + Objects.hashCode(_lac);
        result = prime * result + Objects.hashCode(_ci);
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
        LteRanNeighborListInterRatCellGsmKey other = (LteRanNeighborListInterRatCellGsmKey) obj;
        if (!Objects.equals(_plmnid, other._plmnid)) {
            return false;
        }
        if (!Objects.equals(_lac, other._lac)) {
            return false;
        }
        if (!Objects.equals(_ci, other._ci)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.lte.ran.neighbor.list.inter.rat.cell.LteRanNeighborListInterRatCellGsmKey.class.getSimpleName()).append(" [");
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
        if (_lac != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_lac=");
            builder.append(_lac);
        }
        if (_ci != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ci=");
            builder.append(_ci);
        }
        return builder.append(']').toString();
    }
}

