package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import java.util.Objects;

public class TimeIntervalType
 implements Serializable {
    private static final long serialVersionUID = -4981193521620352836L;
    private final java.lang.Long _value;

    private static void check_valueRange(final long value) {
    }

    @ConstructorProperties("value")
    public TimeIntervalType(java.lang.Long _value) {
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
    public TimeIntervalType(TimeIntervalType source) {
        this._value = source._value;
    }

    public static TimeIntervalType getDefaultInstance(String defaultValue) {
        return new TimeIntervalType(java.lang.Long.valueOf(defaultValue));
    }

    public java.lang.Long getValue() {
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
        TimeIntervalType other = (TimeIntervalType) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimeIntervalType.class.getSimpleName()).append(" [");
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

