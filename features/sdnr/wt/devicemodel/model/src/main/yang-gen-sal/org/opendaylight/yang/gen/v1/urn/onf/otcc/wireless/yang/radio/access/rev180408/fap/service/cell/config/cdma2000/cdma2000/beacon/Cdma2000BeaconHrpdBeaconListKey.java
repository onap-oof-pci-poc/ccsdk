package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class Cdma2000BeaconHrpdBeaconListKey
 implements Identifier<Cdma2000BeaconHrpdBeaconList> {
    private static final long serialVersionUID = -1835946450020851113L;
    private final java.lang.Long _beaconIndex;


    public Cdma2000BeaconHrpdBeaconListKey(java.lang.Long _beaconIndex) {
    
    
        this._beaconIndex = _beaconIndex;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Cdma2000BeaconHrpdBeaconListKey(Cdma2000BeaconHrpdBeaconListKey source) {
        this._beaconIndex = source._beaconIndex;
    }


    public java.lang.Long getBeaconIndex() {
        return _beaconIndex;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_beaconIndex);
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
        Cdma2000BeaconHrpdBeaconListKey other = (Cdma2000BeaconHrpdBeaconListKey) obj;
        if (!Objects.equals(_beaconIndex, other._beaconIndex)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.beacon.Cdma2000BeaconHrpdBeaconListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_beaconIndex != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_beaconIndex=");
            builder.append(_beaconIndex);
        }
        return builder.append(']').toString();
    }
}

