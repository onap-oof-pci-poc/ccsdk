package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class LteEpcQoSKey
 implements Identifier<LteEpcQoS> {
    private static final long serialVersionUID = 4094602155326509466L;
    private final java.lang.Short _qci;


    public LteEpcQoSKey(java.lang.Short _qci) {
    
    
        this._qci = _qci;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LteEpcQoSKey(LteEpcQoSKey source) {
        this._qci = source._qci;
    }


    public java.lang.Short getQci() {
        return _qci;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_qci);
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
        LteEpcQoSKey other = (LteEpcQoSKey) obj;
        if (!Objects.equals(_qci, other._qci)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcQoSKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_qci != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_qci=");
            builder.append(_qci);
        }
        return builder.append(']').toString();
    }
}

