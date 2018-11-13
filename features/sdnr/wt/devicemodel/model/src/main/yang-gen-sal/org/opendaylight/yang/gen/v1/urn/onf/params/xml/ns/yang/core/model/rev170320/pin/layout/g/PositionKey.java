package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.pin.layout.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined;
import java.util.Objects;

public class PositionKey
 implements Identifier<Position> {
    private static final long serialVersionUID = -4978231395131313067L;
    private final ToBeDefined _relativePosition;


    public PositionKey(ToBeDefined _relativePosition) {
    
    
        this._relativePosition = _relativePosition;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PositionKey(PositionKey source) {
        this._relativePosition = source._relativePosition;
    }


    public ToBeDefined getRelativePosition() {
        return _relativePosition;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_relativePosition);
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
        PositionKey other = (PositionKey) obj;
        if (!Objects.equals(_relativePosition, other._relativePosition)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.pin.layout.g.PositionKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_relativePosition != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_relativePosition=");
            builder.append(_relativePosition);
        }
        return builder.append(']').toString();
    }
}

