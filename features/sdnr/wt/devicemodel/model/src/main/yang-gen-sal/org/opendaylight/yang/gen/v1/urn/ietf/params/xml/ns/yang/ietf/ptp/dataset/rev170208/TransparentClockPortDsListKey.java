package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class TransparentClockPortDsListKey
 implements Identifier<TransparentClockPortDsList> {
    private static final long serialVersionUID = 1414737701859717626L;
    private final java.lang.Integer _portNumber;


    public TransparentClockPortDsListKey(java.lang.Integer _portNumber) {
    
    
        this._portNumber = _portNumber;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TransparentClockPortDsListKey(TransparentClockPortDsListKey source) {
        this._portNumber = source._portNumber;
    }


    public java.lang.Integer getPortNumber() {
        return _portNumber;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_portNumber);
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
        TransparentClockPortDsListKey other = (TransparentClockPortDsListKey) obj;
        if (!Objects.equals(_portNumber, other._portNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_portNumber != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_portNumber=");
            builder.append(_portNumber);
        }
        return builder.append(']').toString();
    }
}

