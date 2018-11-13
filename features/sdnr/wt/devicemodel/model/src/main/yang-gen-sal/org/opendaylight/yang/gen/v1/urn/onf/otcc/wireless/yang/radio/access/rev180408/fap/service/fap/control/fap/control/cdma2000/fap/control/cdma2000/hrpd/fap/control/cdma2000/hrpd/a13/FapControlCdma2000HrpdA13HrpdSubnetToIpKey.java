package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

public class FapControlCdma2000HrpdA13HrpdSubnetToIpKey
 implements Identifier<FapControlCdma2000HrpdA13HrpdSubnetToIp> {
    private static final long serialVersionUID = 4594761987385272445L;
    private final IpAddress _a13IpAddress;


    public FapControlCdma2000HrpdA13HrpdSubnetToIpKey(IpAddress _a13IpAddress) {
    
    
        this._a13IpAddress = _a13IpAddress;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public FapControlCdma2000HrpdA13HrpdSubnetToIpKey(FapControlCdma2000HrpdA13HrpdSubnetToIpKey source) {
        this._a13IpAddress = source._a13IpAddress;
    }


    public IpAddress getA13IpAddress() {
        return _a13IpAddress;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_a13IpAddress);
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
        FapControlCdma2000HrpdA13HrpdSubnetToIpKey other = (FapControlCdma2000HrpdA13HrpdSubnetToIpKey) obj;
        if (!Objects.equals(_a13IpAddress, other._a13IpAddress)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIpKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_a13IpAddress != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_a13IpAddress=");
            builder.append(_a13IpAddress);
        }
        return builder.append(']').toString();
    }
}

