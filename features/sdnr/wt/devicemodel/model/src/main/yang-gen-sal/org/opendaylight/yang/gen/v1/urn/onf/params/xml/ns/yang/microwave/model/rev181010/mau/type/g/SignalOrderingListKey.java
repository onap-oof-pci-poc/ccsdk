package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class SignalOrderingListKey
 implements Identifier<SignalOrderingList> {
    private static final long serialVersionUID = -7775392511312425034L;
    private final java.lang.String _signalOrderingKindName;


    public SignalOrderingListKey(java.lang.String _signalOrderingKindName) {
    
    
        this._signalOrderingKindName = _signalOrderingKindName;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SignalOrderingListKey(SignalOrderingListKey source) {
        this._signalOrderingKindName = source._signalOrderingKindName;
    }


    public java.lang.String getSignalOrderingKindName() {
        return _signalOrderingKindName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_signalOrderingKindName);
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
        SignalOrderingListKey other = (SignalOrderingListKey) obj;
        if (!Objects.equals(_signalOrderingKindName, other._signalOrderingKindName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_signalOrderingKindName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_signalOrderingKindName=");
            builder.append(_signalOrderingKindName);
        }
        return builder.append(']').toString();
    }
}

