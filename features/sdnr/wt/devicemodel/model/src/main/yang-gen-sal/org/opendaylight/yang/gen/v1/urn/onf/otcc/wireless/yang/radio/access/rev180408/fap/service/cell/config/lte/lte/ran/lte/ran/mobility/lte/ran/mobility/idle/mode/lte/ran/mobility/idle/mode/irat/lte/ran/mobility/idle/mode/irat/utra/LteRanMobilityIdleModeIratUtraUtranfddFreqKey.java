package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class LteRanMobilityIdleModeIratUtraUtranfddFreqKey
 implements Identifier<LteRanMobilityIdleModeIratUtraUtranfddFreq> {
    private static final long serialVersionUID = 7536524112844026366L;
    private final java.lang.Integer _utraCarrierArfcn;


    public LteRanMobilityIdleModeIratUtraUtranfddFreqKey(java.lang.Integer _utraCarrierArfcn) {
    
    
        this._utraCarrierArfcn = _utraCarrierArfcn;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LteRanMobilityIdleModeIratUtraUtranfddFreqKey(LteRanMobilityIdleModeIratUtraUtranfddFreqKey source) {
        this._utraCarrierArfcn = source._utraCarrierArfcn;
    }


    public java.lang.Integer getUtraCarrierArfcn() {
        return _utraCarrierArfcn;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_utraCarrierArfcn);
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
        LteRanMobilityIdleModeIratUtraUtranfddFreqKey other = (LteRanMobilityIdleModeIratUtraUtranfddFreqKey) obj;
        if (!Objects.equals(_utraCarrierArfcn, other._utraCarrierArfcn)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreqKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_utraCarrierArfcn != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_utraCarrierArfcn=");
            builder.append(_utraCarrierArfcn);
        }
        return builder.append(']').toString();
    }
}

