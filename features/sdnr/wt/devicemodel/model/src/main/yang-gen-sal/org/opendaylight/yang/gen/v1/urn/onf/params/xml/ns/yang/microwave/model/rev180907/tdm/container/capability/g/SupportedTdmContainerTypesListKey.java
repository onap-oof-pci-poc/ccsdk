package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.tdm.container.capability.g;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class SupportedTdmContainerTypesListKey
 implements Identifier<SupportedTdmContainerTypesList> {
    private static final long serialVersionUID = 511821587369263564L;
    private final java.lang.String _tdmContainerName;


    public SupportedTdmContainerTypesListKey(java.lang.String _tdmContainerName) {
    
    
        this._tdmContainerName = _tdmContainerName;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportedTdmContainerTypesListKey(SupportedTdmContainerTypesListKey source) {
        this._tdmContainerName = source._tdmContainerName;
    }


    public java.lang.String getTdmContainerName() {
        return _tdmContainerName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_tdmContainerName);
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
        SupportedTdmContainerTypesListKey other = (SupportedTdmContainerTypesListKey) obj;
        if (!Objects.equals(_tdmContainerName, other._tdmContainerName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.tdm.container.capability.g.SupportedTdmContainerTypesListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_tdmContainerName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_tdmContainerName=");
            builder.append(_tdmContainerName);
        }
        return builder.append(']').toString();
    }
}

