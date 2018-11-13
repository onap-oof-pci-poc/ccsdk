package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class RemUmtsWcdmaCellKey
 implements Identifier<RemUmtsWcdmaCell> {
    private static final long serialVersionUID = -8335653733501146537L;
    private final java.lang.String _remUmtsWcdmaCellKey;


    public RemUmtsWcdmaCellKey(java.lang.String _remUmtsWcdmaCellKey) {
    
    
        this._remUmtsWcdmaCellKey = _remUmtsWcdmaCellKey;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RemUmtsWcdmaCellKey(RemUmtsWcdmaCellKey source) {
        this._remUmtsWcdmaCellKey = source._remUmtsWcdmaCellKey;
    }


    public java.lang.String getRemUmtsWcdmaCellKey() {
        return _remUmtsWcdmaCellKey;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_remUmtsWcdmaCellKey);
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
        RemUmtsWcdmaCellKey other = (RemUmtsWcdmaCellKey) obj;
        if (!Objects.equals(_remUmtsWcdmaCellKey, other._remUmtsWcdmaCellKey)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCellKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_remUmtsWcdmaCellKey != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_remUmtsWcdmaCellKey=");
            builder.append(_remUmtsWcdmaCellKey);
        }
        return builder.append(']').toString();
    }
}

