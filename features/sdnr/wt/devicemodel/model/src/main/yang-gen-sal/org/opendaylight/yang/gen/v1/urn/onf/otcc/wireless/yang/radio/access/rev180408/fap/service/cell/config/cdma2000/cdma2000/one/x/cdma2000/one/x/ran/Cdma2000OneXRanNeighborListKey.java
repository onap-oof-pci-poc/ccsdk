package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class Cdma2000OneXRanNeighborListKey
 implements Identifier<Cdma2000OneXRanNeighborList> {
    private static final long serialVersionUID = -7115816332013165788L;
    private final java.lang.Long _oneXNeighborIndex;
    private final java.lang.Long _neighborPn;


    public Cdma2000OneXRanNeighborListKey(java.lang.Long _neighborPn, java.lang.Long _oneXNeighborIndex) {
    
    
        this._oneXNeighborIndex = _oneXNeighborIndex;
        this._neighborPn = _neighborPn;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Cdma2000OneXRanNeighborListKey(Cdma2000OneXRanNeighborListKey source) {
        this._oneXNeighborIndex = source._oneXNeighborIndex;
        this._neighborPn = source._neighborPn;
    }


    public java.lang.Long getOneXNeighborIndex() {
        return _oneXNeighborIndex;
    }
    
    public java.lang.Long getNeighborPn() {
        return _neighborPn;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_oneXNeighborIndex);
        result = prime * result + Objects.hashCode(_neighborPn);
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
        Cdma2000OneXRanNeighborListKey other = (Cdma2000OneXRanNeighborListKey) obj;
        if (!Objects.equals(_oneXNeighborIndex, other._oneXNeighborIndex)) {
            return false;
        }
        if (!Objects.equals(_neighborPn, other._neighborPn)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNeighborListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_oneXNeighborIndex != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_oneXNeighborIndex=");
            builder.append(_oneXNeighborIndex);
        }
        if (_neighborPn != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_neighborPn=");
            builder.append(_neighborPn);
        }
        return builder.append(']').toString();
    }
}

