package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.hybrid.mw.structure.capability.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class SupportedTdmStructureTypesListKey
 implements Identifier<SupportedTdmStructureTypesList> {
    private static final long serialVersionUID = 2579820346197797635L;
    private final java.lang.String _tdmStructureName;


    public SupportedTdmStructureTypesListKey(java.lang.String _tdmStructureName) {
    
    
        this._tdmStructureName = _tdmStructureName;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportedTdmStructureTypesListKey(SupportedTdmStructureTypesListKey source) {
        this._tdmStructureName = source._tdmStructureName;
    }


    public java.lang.String getTdmStructureName() {
        return _tdmStructureName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_tdmStructureName);
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
        SupportedTdmStructureTypesListKey other = (SupportedTdmStructureTypesListKey) obj;
        if (!Objects.equals(_tdmStructureName, other._tdmStructureName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_tdmStructureName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_tdmStructureName=");
            builder.append(_tdmStructureName);
        }
        return builder.append(']').toString();
    }
}

