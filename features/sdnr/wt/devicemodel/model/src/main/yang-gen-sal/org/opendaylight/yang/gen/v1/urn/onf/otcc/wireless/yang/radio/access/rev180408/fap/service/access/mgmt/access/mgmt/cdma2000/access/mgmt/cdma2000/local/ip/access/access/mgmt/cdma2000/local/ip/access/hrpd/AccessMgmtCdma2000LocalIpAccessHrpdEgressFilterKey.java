package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv4Address;

public class AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey
 implements Identifier<AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter> {
    private static final long serialVersionUID = -1879655596442272322L;
    private final Ipv4Address _subnet;
    private final java.lang.Short _subnetMask;


    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey(Ipv4Address _subnet, java.lang.Short _subnetMask) {
    
    
        this._subnet = _subnet;
        this._subnetMask = _subnetMask;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey(AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey source) {
        this._subnet = source._subnet;
        this._subnetMask = source._subnetMask;
    }


    public Ipv4Address getSubnet() {
        return _subnet;
    }
    
    public java.lang.Short getSubnetMask() {
        return _subnetMask;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_subnet);
        result = prime * result + Objects.hashCode(_subnetMask);
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
        AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey other = (AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey) obj;
        if (!Objects.equals(_subnet, other._subnet)) {
            return false;
        }
        if (!Objects.equals(_subnetMask, other._subnetMask)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_subnet != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_subnet=");
            builder.append(_subnet);
        }
        if (_subnetMask != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_subnetMask=");
            builder.append(_subnetMask);
        }
        return builder.append(']').toString();
    }
}

