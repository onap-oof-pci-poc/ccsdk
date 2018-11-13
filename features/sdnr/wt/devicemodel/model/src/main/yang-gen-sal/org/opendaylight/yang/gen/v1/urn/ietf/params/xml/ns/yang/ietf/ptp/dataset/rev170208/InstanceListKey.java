package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class InstanceListKey
 implements Identifier<InstanceList> {
    private static final long serialVersionUID = 2815168666357383117L;
    private final java.lang.Integer _instanceNumber;


    public InstanceListKey(java.lang.Integer _instanceNumber) {
    
    
        this._instanceNumber = _instanceNumber;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InstanceListKey(InstanceListKey source) {
        this._instanceNumber = source._instanceNumber;
    }


    public java.lang.Integer getInstanceNumber() {
        return _instanceNumber;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_instanceNumber);
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
        InstanceListKey other = (InstanceListKey) obj;
        if (!Objects.equals(_instanceNumber, other._instanceNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_instanceNumber != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_instanceNumber=");
            builder.append(_instanceNumber);
        }
        return builder.append(']').toString();
    }
}

