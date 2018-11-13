package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class AccessMgmtCdma2000MemberDetailKey
 implements Identifier<AccessMgmtCdma2000MemberDetail> {
    private static final long serialVersionUID = -7012891761846616059L;
    private final java.lang.String _imsi;


    public AccessMgmtCdma2000MemberDetailKey(java.lang.String _imsi) {
    
    
        this._imsi = _imsi;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AccessMgmtCdma2000MemberDetailKey(AccessMgmtCdma2000MemberDetailKey source) {
        this._imsi = source._imsi;
    }


    public java.lang.String getImsi() {
        return _imsi;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_imsi);
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
        AccessMgmtCdma2000MemberDetailKey other = (AccessMgmtCdma2000MemberDetailKey) obj;
        if (!Objects.equals(_imsi, other._imsi)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetailKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_imsi != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_imsi=");
            builder.append(_imsi);
        }
        return builder.append(']').toString();
    }
}

