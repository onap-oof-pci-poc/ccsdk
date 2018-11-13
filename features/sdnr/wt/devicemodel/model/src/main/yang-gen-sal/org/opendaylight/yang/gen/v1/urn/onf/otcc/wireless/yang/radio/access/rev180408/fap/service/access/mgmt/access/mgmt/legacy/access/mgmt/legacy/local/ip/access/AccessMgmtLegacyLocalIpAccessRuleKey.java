package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

public class AccessMgmtLegacyLocalIpAccessRuleKey
 implements Identifier<AccessMgmtLegacyLocalIpAccessRule> {
    private static final long serialVersionUID = -3323429541939536331L;
    private final IpAddress _destIpAddress;
    private final IpAddress _destSubnetMask;
    private final java.lang.Long _protocol;


    public AccessMgmtLegacyLocalIpAccessRuleKey(IpAddress _destIpAddress, IpAddress _destSubnetMask, java.lang.Long _protocol) {
    
    
        this._destIpAddress = _destIpAddress;
        this._destSubnetMask = _destSubnetMask;
        this._protocol = _protocol;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AccessMgmtLegacyLocalIpAccessRuleKey(AccessMgmtLegacyLocalIpAccessRuleKey source) {
        this._destIpAddress = source._destIpAddress;
        this._destSubnetMask = source._destSubnetMask;
        this._protocol = source._protocol;
    }


    public IpAddress getDestIpAddress() {
        return _destIpAddress;
    }
    
    public IpAddress getDestSubnetMask() {
        return _destSubnetMask;
    }
    
    public java.lang.Long getProtocol() {
        return _protocol;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_destIpAddress);
        result = prime * result + Objects.hashCode(_destSubnetMask);
        result = prime * result + Objects.hashCode(_protocol);
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
        AccessMgmtLegacyLocalIpAccessRuleKey other = (AccessMgmtLegacyLocalIpAccessRuleKey) obj;
        if (!Objects.equals(_destIpAddress, other._destIpAddress)) {
            return false;
        }
        if (!Objects.equals(_destSubnetMask, other._destSubnetMask)) {
            return false;
        }
        if (!Objects.equals(_protocol, other._protocol)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRuleKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_destIpAddress != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_destIpAddress=");
            builder.append(_destIpAddress);
        }
        if (_destSubnetMask != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_destSubnetMask=");
            builder.append(_destSubnetMask);
        }
        if (_protocol != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_protocol=");
            builder.append(_protocol);
        }
        return builder.append(']').toString();
    }
}

