package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import java.util.Objects;
import java.util.Arrays;
import com.google.common.io.BaseEncoding;

public class ClockIdentityType
 implements Serializable {
    private static final long serialVersionUID = -5017409254441176962L;
    private final byte[] _value;

    private static void check_valueLength(final byte[] value) {
        final int length = value.length;
        if (length >= 8 && length <= 8) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[8..8]].", java.util.Arrays.toString(value)));
    }

    @ConstructorProperties("value")
    public ClockIdentityType(byte[] _value) {
        if (_value != null) {
            check_valueLength(_value);
        }
    
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
    
        this._value = _value.clone();
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ClockIdentityType(ClockIdentityType source) {
        this._value = source._value;
    }

    public static ClockIdentityType getDefaultInstance(String defaultValue) {
        BaseEncoding baseEncoding = BaseEncoding.base64();
        return new ClockIdentityType(baseEncoding.decode(defaultValue));
    }

    public byte[] getValue() {
        return _value == null ? null : _value.clone();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(_value);
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
        ClockIdentityType other = (ClockIdentityType) obj;
        if (!Arrays.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ClockIdentityType.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(Arrays.toString(_value));
        }
        return builder.append(']').toString();
    }
}

