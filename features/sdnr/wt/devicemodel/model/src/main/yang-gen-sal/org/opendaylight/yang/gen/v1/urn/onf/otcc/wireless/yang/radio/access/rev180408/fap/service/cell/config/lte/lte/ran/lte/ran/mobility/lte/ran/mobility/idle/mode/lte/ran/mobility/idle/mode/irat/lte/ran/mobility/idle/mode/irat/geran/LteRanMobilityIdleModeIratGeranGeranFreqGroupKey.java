package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class LteRanMobilityIdleModeIratGeranGeranFreqGroupKey
 implements Identifier<LteRanMobilityIdleModeIratGeranGeranFreqGroup> {
    private static final long serialVersionUID = -9003047876917290819L;
    private final java.lang.Integer _bccharfcn;


    public LteRanMobilityIdleModeIratGeranGeranFreqGroupKey(java.lang.Integer _bccharfcn) {
    
    
        this._bccharfcn = _bccharfcn;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LteRanMobilityIdleModeIratGeranGeranFreqGroupKey(LteRanMobilityIdleModeIratGeranGeranFreqGroupKey source) {
        this._bccharfcn = source._bccharfcn;
    }


    public java.lang.Integer getBccharfcn() {
        return _bccharfcn;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_bccharfcn);
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
        LteRanMobilityIdleModeIratGeranGeranFreqGroupKey other = (LteRanMobilityIdleModeIratGeranGeranFreqGroupKey) obj;
        if (!Objects.equals(_bccharfcn, other._bccharfcn)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroupKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_bccharfcn != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_bccharfcn=");
            builder.append(_bccharfcn);
        }
        return builder.append(']').toString();
    }
}

