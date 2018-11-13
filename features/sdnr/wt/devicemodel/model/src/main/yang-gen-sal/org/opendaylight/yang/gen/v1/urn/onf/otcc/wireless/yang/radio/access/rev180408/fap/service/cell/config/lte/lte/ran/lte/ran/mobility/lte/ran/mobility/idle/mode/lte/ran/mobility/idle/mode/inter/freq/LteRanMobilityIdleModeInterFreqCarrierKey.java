package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class LteRanMobilityIdleModeInterFreqCarrierKey
 implements Identifier<LteRanMobilityIdleModeInterFreqCarrier> {
    private static final long serialVersionUID = -765429329895820923L;
    private final java.lang.Integer _eutraCarrierArfcn;


    public LteRanMobilityIdleModeInterFreqCarrierKey(java.lang.Integer _eutraCarrierArfcn) {
    
    
        this._eutraCarrierArfcn = _eutraCarrierArfcn;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LteRanMobilityIdleModeInterFreqCarrierKey(LteRanMobilityIdleModeInterFreqCarrierKey source) {
        this._eutraCarrierArfcn = source._eutraCarrierArfcn;
    }


    public java.lang.Integer getEutraCarrierArfcn() {
        return _eutraCarrierArfcn;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_eutraCarrierArfcn);
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
        LteRanMobilityIdleModeInterFreqCarrierKey other = (LteRanMobilityIdleModeInterFreqCarrierKey) obj;
        if (!Objects.equals(_eutraCarrierArfcn, other._eutraCarrierArfcn)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrierKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_eutraCarrierArfcn != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_eutraCarrierArfcn=");
            builder.append(_eutraCarrierArfcn);
        }
        return builder.append(']').toString();
    }
}

