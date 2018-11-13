package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class UmtsRanNeighborListInUseIntraFreqCellKey
 implements Identifier<UmtsRanNeighborListInUseIntraFreqCell> {
    private static final long serialVersionUID = 4334456219543255359L;
    private final java.lang.Integer _pcpichScramblingCode;


    public UmtsRanNeighborListInUseIntraFreqCellKey(java.lang.Integer _pcpichScramblingCode) {
    
    
        this._pcpichScramblingCode = _pcpichScramblingCode;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public UmtsRanNeighborListInUseIntraFreqCellKey(UmtsRanNeighborListInUseIntraFreqCellKey source) {
        this._pcpichScramblingCode = source._pcpichScramblingCode;
    }


    public java.lang.Integer getPcpichScramblingCode() {
        return _pcpichScramblingCode;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        UmtsRanNeighborListInUseIntraFreqCellKey other = (UmtsRanNeighborListInUseIntraFreqCellKey) obj;
        if (!Objects.equals(_pcpichScramblingCode, other._pcpichScramblingCode)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseIntraFreqCellKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
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

