package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class RemCdma2000HrpdChannelKey
 implements Identifier<RemCdma2000HrpdChannel> {
    private static final long serialVersionUID = 774497232661127725L;
    private final java.lang.Short _sniffingBandClass;
    private final java.lang.Integer _sniffingChannelNumber;


    public RemCdma2000HrpdChannelKey(java.lang.Short _sniffingBandClass, java.lang.Integer _sniffingChannelNumber) {
    
    
        this._sniffingBandClass = _sniffingBandClass;
        this._sniffingChannelNumber = _sniffingChannelNumber;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RemCdma2000HrpdChannelKey(RemCdma2000HrpdChannelKey source) {
        this._sniffingBandClass = source._sniffingBandClass;
        this._sniffingChannelNumber = source._sniffingChannelNumber;
    }


    public java.lang.Short getSniffingBandClass() {
        return _sniffingBandClass;
    }
    
    public java.lang.Integer getSniffingChannelNumber() {
        return _sniffingChannelNumber;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_sniffingBandClass);
        result = prime * result + Objects.hashCode(_sniffingChannelNumber);
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
        RemCdma2000HrpdChannelKey other = (RemCdma2000HrpdChannelKey) obj;
        if (!Objects.equals(_sniffingBandClass, other._sniffingBandClass)) {
            return false;
        }
        if (!Objects.equals(_sniffingChannelNumber, other._sniffingChannelNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdChannelKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_sniffingBandClass != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_sniffingBandClass=");
            builder.append(_sniffingBandClass);
        }
        if (_sniffingChannelNumber != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_sniffingChannelNumber=");
            builder.append(_sniffingChannelNumber);
        }
        return builder.append(']').toString();
    }
}

