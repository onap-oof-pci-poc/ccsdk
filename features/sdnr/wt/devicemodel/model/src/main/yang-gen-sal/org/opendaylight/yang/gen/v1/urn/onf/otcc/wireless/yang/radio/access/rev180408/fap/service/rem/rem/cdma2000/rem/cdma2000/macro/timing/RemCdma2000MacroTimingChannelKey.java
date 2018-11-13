package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import java.math.BigInteger;

public class RemCdma2000MacroTimingChannelKey
 implements Identifier<RemCdma2000MacroTimingChannel> {
    private static final long serialVersionUID = 7920577889704853662L;
    private final java.lang.Short _bandClass;
    private final BigInteger _channelNumber;


    public RemCdma2000MacroTimingChannelKey(java.lang.Short _bandClass, BigInteger _channelNumber) {
    
    
        this._bandClass = _bandClass;
        this._channelNumber = _channelNumber;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RemCdma2000MacroTimingChannelKey(RemCdma2000MacroTimingChannelKey source) {
        this._bandClass = source._bandClass;
        this._channelNumber = source._channelNumber;
    }


    public java.lang.Short getBandClass() {
        return _bandClass;
    }
    
    public BigInteger getChannelNumber() {
        return _channelNumber;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_bandClass);
        result = prime * result + Objects.hashCode(_channelNumber);
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
        RemCdma2000MacroTimingChannelKey other = (RemCdma2000MacroTimingChannelKey) obj;
        if (!Objects.equals(_bandClass, other._bandClass)) {
            return false;
        }
        if (!Objects.equals(_channelNumber, other._channelNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannelKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_bandClass != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_bandClass=");
            builder.append(_bandClass);
        }
        if (_channelNumber != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_channelNumber=");
            builder.append(_channelNumber);
        }
        return builder.append(']').toString();
    }
}

