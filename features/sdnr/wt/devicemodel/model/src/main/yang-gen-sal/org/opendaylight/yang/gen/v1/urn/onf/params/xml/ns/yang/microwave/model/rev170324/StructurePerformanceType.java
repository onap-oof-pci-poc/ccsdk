package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import java.util.Objects;

public class StructurePerformanceType
 implements Serializable {
    private static final long serialVersionUID = 7186019711348232764L;
    private final java.lang.Integer _value;

    private static void check_valueRange(final int value) {
    }

    @ConstructorProperties("value")
    public StructurePerformanceType(java.lang.Integer _value) {
        if (_value != null) {
            check_valueRange(_value);
        }
    
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public StructurePerformanceType(StructurePerformanceType source) {
        this._value = source._value;
    }

    public static StructurePerformanceType getDefaultInstance(String defaultValue) {
        return new StructurePerformanceType(java.lang.Integer.valueOf(defaultValue));
    }

    public java.lang.Integer getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_value);
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
        StructurePerformanceType other = (StructurePerformanceType) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.StructurePerformanceType.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
        }
        return builder.append(']').toString();
    }
}

