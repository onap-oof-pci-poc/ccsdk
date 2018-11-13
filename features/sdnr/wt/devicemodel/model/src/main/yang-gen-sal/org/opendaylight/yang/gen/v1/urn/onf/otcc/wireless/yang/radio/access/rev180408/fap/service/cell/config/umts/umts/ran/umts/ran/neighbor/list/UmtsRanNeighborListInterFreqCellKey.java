package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class UmtsRanNeighborListInterFreqCellKey
 implements Identifier<UmtsRanNeighborListInterFreqCell> {
    private static final long serialVersionUID = -7119094977247728264L;
    private final java.lang.Integer _uarfcndl;
    private final java.lang.Integer _pcpichScramblingCode;


    public UmtsRanNeighborListInterFreqCellKey(java.lang.Integer _pcpichScramblingCode, java.lang.Integer _uarfcndl) {
    
    
        this._uarfcndl = _uarfcndl;
        this._pcpichScramblingCode = _pcpichScramblingCode;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public UmtsRanNeighborListInterFreqCellKey(UmtsRanNeighborListInterFreqCellKey source) {
        this._uarfcndl = source._uarfcndl;
        this._pcpichScramblingCode = source._pcpichScramblingCode;
    }


    public java.lang.Integer getUarfcndl() {
        return _uarfcndl;
    }
    
    public java.lang.Integer getPcpichScramblingCode() {
        return _pcpichScramblingCode;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_uarfcndl);
        result = prime * result + Objects.hashCode(_pcpichScramblingCode);
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
        UmtsRanNeighborListInterFreqCellKey other = (UmtsRanNeighborListInterFreqCellKey) obj;
        if (!Objects.equals(_uarfcndl, other._uarfcndl)) {
            return false;
        }
        if (!Objects.equals(_pcpichScramblingCode, other._pcpichScramblingCode)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.UmtsRanNeighborListInterFreqCellKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_uarfcndl != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_uarfcndl=");
            builder.append(_uarfcndl);
        }
        if (_pcpichScramblingCode != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_pcpichScramblingCode=");
            builder.append(_pcpichScramblingCode);
        }
        return builder.append(']').toString();
    }
}

