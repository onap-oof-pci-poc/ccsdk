package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG.IntraFrequencyEventIdentity;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class UmtsRanInterFreqMeasInstanceKey
 implements Identifier<UmtsRanInterFreqMeasInstance> {
    private static final long serialVersionUID = 8559807481908187869L;
    private final IntraFrequencyEventIdentity _intraFrequencyEventIdentity;


    public UmtsRanInterFreqMeasInstanceKey(IntraFrequencyEventIdentity _intraFrequencyEventIdentity) {
    
    
        this._intraFrequencyEventIdentity = _intraFrequencyEventIdentity;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public UmtsRanInterFreqMeasInstanceKey(UmtsRanInterFreqMeasInstanceKey source) {
        this._intraFrequencyEventIdentity = source._intraFrequencyEventIdentity;
    }


    public IntraFrequencyEventIdentity getIntraFrequencyEventIdentity() {
        return _intraFrequencyEventIdentity;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_intraFrequencyEventIdentity);
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
        UmtsRanInterFreqMeasInstanceKey other = (UmtsRanInterFreqMeasInstanceKey) obj;
        if (!Objects.equals(_intraFrequencyEventIdentity, other._intraFrequencyEventIdentity)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstanceKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_intraFrequencyEventIdentity != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_intraFrequencyEventIdentity=");
            builder.append(_intraFrequencyEventIdentity);
        }
        return builder.append(']').toString();
    }
}

