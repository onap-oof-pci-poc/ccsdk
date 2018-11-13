package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class AddressElementKey
 implements Identifier<AddressElement> {
    private static final long serialVersionUID = -7014406859674371530L;
    private final UniversalId _uuid;


    public AddressElementKey(UniversalId _uuid) {
    
    
        this._uuid = _uuid;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AddressElementKey(AddressElementKey source) {
        this._uuid = source._uuid;
    }


    public UniversalId getUuid() {
        return _uuid;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_uuid);
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
        AddressElementKey other = (AddressElementKey) obj;
        if (!Objects.equals(_uuid, other._uuid)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElementKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_uuid != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_uuid=");
            builder.append(_uuid);
        }
        return builder.append(']').toString();
    }
}

