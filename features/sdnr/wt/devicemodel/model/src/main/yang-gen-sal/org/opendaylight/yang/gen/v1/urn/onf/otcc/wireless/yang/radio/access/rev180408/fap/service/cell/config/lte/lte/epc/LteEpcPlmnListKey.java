package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class LteEpcPlmnListKey
 implements Identifier<LteEpcPlmnList> {
    private static final long serialVersionUID = 9025760447006581315L;
    private final java.lang.String _plmnid;


    public LteEpcPlmnListKey(java.lang.String _plmnid) {
    
    
        this._plmnid = _plmnid;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LteEpcPlmnListKey(LteEpcPlmnListKey source) {
        this._plmnid = source._plmnid;
    }


    public java.lang.String getPlmnid() {
        return _plmnid;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_plmnid);
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
        LteEpcPlmnListKey other = (LteEpcPlmnListKey) obj;
        if (!Objects.equals(_plmnid, other._plmnid)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnListKey.class.getSimpleName()).append(" [");
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
        return builder.append(']').toString();
    }
}

