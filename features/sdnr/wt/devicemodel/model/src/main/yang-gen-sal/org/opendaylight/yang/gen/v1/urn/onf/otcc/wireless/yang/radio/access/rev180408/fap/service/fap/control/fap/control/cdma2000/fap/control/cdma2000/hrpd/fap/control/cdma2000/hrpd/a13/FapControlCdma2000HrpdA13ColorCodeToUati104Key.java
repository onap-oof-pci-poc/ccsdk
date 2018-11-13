package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import java.util.Arrays;

public class FapControlCdma2000HrpdA13ColorCodeToUati104Key
 implements Identifier<FapControlCdma2000HrpdA13ColorCodeToUati104> {
    private static final long serialVersionUID = -4617762636147841182L;
    private final java.lang.Integer _colorCode;
    private final byte[] _uati104;


    public FapControlCdma2000HrpdA13ColorCodeToUati104Key(java.lang.Integer _colorCode, byte[] _uati104) {
    
    
        this._colorCode = _colorCode;
        this._uati104 = _uati104 == null ? null : _uati104.clone();
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public FapControlCdma2000HrpdA13ColorCodeToUati104Key(FapControlCdma2000HrpdA13ColorCodeToUati104Key source) {
        this._colorCode = source._colorCode;
        this._uati104 = source._uati104;
    }


    public java.lang.Integer getColorCode() {
        return _colorCode;
    }
    
    public byte[] getUati104() {
        return _uati104 == null ? null : _uati104.clone();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_colorCode);
        result = prime * result + Arrays.hashCode(_uati104);
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
        FapControlCdma2000HrpdA13ColorCodeToUati104Key other = (FapControlCdma2000HrpdA13ColorCodeToUati104Key) obj;
        if (!Objects.equals(_colorCode, other._colorCode)) {
            return false;
        }
        if (!Arrays.equals(_uati104, other._uati104)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13ColorCodeToUati104Key.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_colorCode != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_colorCode=");
            builder.append(_colorCode);
        }
        if (_uati104 != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_uati104=");
            builder.append(Arrays.toString(_uati104));
        }
        return builder.append(']').toString();
    }
}

