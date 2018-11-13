package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined;
import java.util.Objects;

public class PinKey
 implements Identifier<Pin> {
    private static final long serialVersionUID = -978916706388725273L;
    private final ToBeDefined _position;


    public PinKey(ToBeDefined _position) {
    
    
        this._position = _position;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PinKey(PinKey source) {
        this._position = source._position;
    }


    public ToBeDefined getPosition() {
        return _position;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_position);
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
        PinKey other = (PinKey) obj;
        if (!Objects.equals(_position, other._position)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.PinKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_position != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_position=");
            builder.append(_position);
        }
        return builder.append(']').toString();
    }
}

