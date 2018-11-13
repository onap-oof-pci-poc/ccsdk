package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

public class EquipmentPacKey
 implements Identifier<EquipmentPac> {
    private static final long serialVersionUID = 4694904315170713652L;
    private final UniversalId _equipment;


    public EquipmentPacKey(UniversalId _equipment) {
    
    
        this._equipment = _equipment;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public EquipmentPacKey(EquipmentPacKey source) {
        this._equipment = source._equipment;
    }


    public UniversalId getEquipment() {
        return _equipment;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_equipment);
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
        EquipmentPacKey other = (EquipmentPacKey) obj;
        if (!Objects.equals(_equipment, other._equipment)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPacKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_equipment != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_equipment=");
            builder.append(_equipment);
        }
        return builder.append(']').toString();
    }
}

