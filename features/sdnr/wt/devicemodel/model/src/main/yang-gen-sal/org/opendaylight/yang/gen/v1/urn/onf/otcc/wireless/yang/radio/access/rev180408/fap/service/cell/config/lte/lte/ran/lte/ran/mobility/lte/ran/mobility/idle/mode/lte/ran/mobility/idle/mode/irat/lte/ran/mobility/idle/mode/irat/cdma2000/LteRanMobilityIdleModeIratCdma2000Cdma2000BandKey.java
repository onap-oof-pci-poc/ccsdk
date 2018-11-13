package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey
 implements Identifier<LteRanMobilityIdleModeIratCdma2000Cdma2000Band> {
    private static final long serialVersionUID = 5240861949439660461L;
    private final java.lang.Short _bandClass;


    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey(java.lang.Short _bandClass) {
    
    
        this._bandClass = _bandClass;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey(LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey source) {
        this._bandClass = source._bandClass;
    }


    public java.lang.Short getBandClass() {
        return _bandClass;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_bandClass);
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
        LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey other = (LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey) obj;
        if (!Objects.equals(_bandClass, other._bandClass)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_bandClass != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_bandClass=");
            builder.append(_bandClass);
        }
        return builder.append(']').toString();
    }
}

