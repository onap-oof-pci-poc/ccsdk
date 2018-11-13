package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class RemUmtsGsmCellKey
 implements Identifier<RemUmtsGsmCell> {
    private static final long serialVersionUID = -2928326115649351692L;
    private final java.lang.Integer _arfcn;
    private final java.lang.Short _bsic;


    public RemUmtsGsmCellKey(java.lang.Integer _arfcn, java.lang.Short _bsic) {
    
    
        this._arfcn = _arfcn;
        this._bsic = _bsic;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RemUmtsGsmCellKey(RemUmtsGsmCellKey source) {
        this._arfcn = source._arfcn;
        this._bsic = source._bsic;
    }


    public java.lang.Integer getArfcn() {
        return _arfcn;
    }
    
    public java.lang.Short getBsic() {
        return _bsic;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_arfcn);
        result = prime * result + Objects.hashCode(_bsic);
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
        RemUmtsGsmCellKey other = (RemUmtsGsmCellKey) obj;
        if (!Objects.equals(_arfcn, other._arfcn)) {
            return false;
        }
        if (!Objects.equals(_bsic, other._bsic)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCellKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_arfcn != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_arfcn=");
            builder.append(_arfcn);
        }
        if (_bsic != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_bsic=");
            builder.append(_bsic);
        }
        return builder.append(']').toString();
    }
}

