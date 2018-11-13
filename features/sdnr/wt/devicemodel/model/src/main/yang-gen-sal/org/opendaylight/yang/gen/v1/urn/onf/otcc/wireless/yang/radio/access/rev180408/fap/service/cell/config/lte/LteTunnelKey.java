package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class LteTunnelKey
 implements Identifier<LteTunnel> {
    private static final long serialVersionUID = -1221606801754830112L;
    private final java.lang.String _tunnelRef;


    public LteTunnelKey(java.lang.String _tunnelRef) {
    
    
        this._tunnelRef = _tunnelRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LteTunnelKey(LteTunnelKey source) {
        this._tunnelRef = source._tunnelRef;
    }


    public java.lang.String getTunnelRef() {
        return _tunnelRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_tunnelRef);
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
        LteTunnelKey other = (LteTunnelKey) obj;
        if (!Objects.equals(_tunnelRef, other._tunnelRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteTunnelKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_tunnelRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_tunnelRef=");
            builder.append(_tunnelRef);
        }
        return builder.append(']').toString();
    }
}

