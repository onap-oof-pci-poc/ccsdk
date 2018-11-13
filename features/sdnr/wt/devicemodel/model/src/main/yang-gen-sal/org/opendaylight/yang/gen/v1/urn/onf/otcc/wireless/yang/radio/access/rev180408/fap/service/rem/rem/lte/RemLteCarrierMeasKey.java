package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class RemLteCarrierMeasKey
 implements Identifier<RemLteCarrierMeas> {
    private static final long serialVersionUID = -868016480808475586L;
    private final java.lang.Long _carrierArfcndl;
    private final java.lang.Long _carrierChWidth;


    public RemLteCarrierMeasKey(java.lang.Long _carrierArfcndl, java.lang.Long _carrierChWidth) {
    
    
        this._carrierArfcndl = _carrierArfcndl;
        this._carrierChWidth = _carrierChWidth;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RemLteCarrierMeasKey(RemLteCarrierMeasKey source) {
        this._carrierArfcndl = source._carrierArfcndl;
        this._carrierChWidth = source._carrierChWidth;
    }


    public java.lang.Long getCarrierArfcndl() {
        return _carrierArfcndl;
    }
    
    public java.lang.Long getCarrierChWidth() {
        return _carrierChWidth;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_carrierArfcndl);
        result = prime * result + Objects.hashCode(_carrierChWidth);
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
        RemLteCarrierMeasKey other = (RemLteCarrierMeasKey) obj;
        if (!Objects.equals(_carrierArfcndl, other._carrierArfcndl)) {
            return false;
        }
        if (!Objects.equals(_carrierChWidth, other._carrierChWidth)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeasKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_carrierArfcndl != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_carrierArfcndl=");
            builder.append(_carrierArfcndl);
        }
        if (_carrierChWidth != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_carrierChWidth=");
            builder.append(_carrierChWidth);
        }
        return builder.append(']').toString();
    }
}

