package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.rat.meas;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasInstanceG.InterRatEventIdentity;
import java.util.Objects;

public class UmtsRanInterRatMeasInstanceKey
 implements Identifier<UmtsRanInterRatMeasInstance> {
    private static final long serialVersionUID = 6786482652830669199L;
    private final InterRatEventIdentity _interRatEventIdentity;


    public UmtsRanInterRatMeasInstanceKey(InterRatEventIdentity _interRatEventIdentity) {
    
    
        this._interRatEventIdentity = _interRatEventIdentity;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public UmtsRanInterRatMeasInstanceKey(UmtsRanInterRatMeasInstanceKey source) {
        this._interRatEventIdentity = source._interRatEventIdentity;
    }


    public InterRatEventIdentity getInterRatEventIdentity() {
        return _interRatEventIdentity;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_interRatEventIdentity);
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
        UmtsRanInterRatMeasInstanceKey other = (UmtsRanInterRatMeasInstanceKey) obj;
        if (!Objects.equals(_interRatEventIdentity, other._interRatEventIdentity)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.rat.meas.UmtsRanInterRatMeasInstanceKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_interRatEventIdentity != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_interRatEventIdentity=");
            builder.append(_interRatEventIdentity);
        }
        return builder.append(']').toString();
    }
}

