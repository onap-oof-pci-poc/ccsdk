package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OduNamedPayloadType;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType
 *
 */
public class AcceptedPayloadTypeBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType> {

    private BigInteger _hexPayloadType;
    private OduNamedPayloadType _namedPayloadType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>> augmentation = Collections.emptyMap();

    public AcceptedPayloadTypeBuilder() {
    }
    public AcceptedPayloadTypeBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OduPayloadTypeG arg) {
        this._namedPayloadType = arg.getNamedPayloadType();
        this._hexPayloadType = arg.getHexPayloadType();
    }

    public AcceptedPayloadTypeBuilder(AcceptedPayloadType base) {
        this._hexPayloadType = base.getHexPayloadType();
        this._namedPayloadType = base.getNamedPayloadType();
        if (base instanceof AcceptedPayloadTypeImpl) {
            AcceptedPayloadTypeImpl impl = (AcceptedPayloadTypeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OduPayloadTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OduPayloadTypeG) {
            this._namedPayloadType = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OduPayloadTypeG)arg).getNamedPayloadType();
            this._hexPayloadType = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OduPayloadTypeG)arg).getHexPayloadType();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OduPayloadTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getHexPayloadType() {
        return _hexPayloadType;
    }
    
    public OduNamedPayloadType getNamedPayloadType() {
        return _namedPayloadType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKHEXPAYLOADTYPERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKHEXPAYLOADTYPERANGE_RANGES = a;
     }
     private static void checkHexPayloadTypeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKHEXPAYLOADTYPERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKHEXPAYLOADTYPERANGE_RANGES)));
     }
    
    public AcceptedPayloadTypeBuilder setHexPayloadType(final BigInteger value) {
    if (value != null) {
        checkHexPayloadTypeRange(value);
    }
        this._hexPayloadType = value;
        return this;
    }
    
     
    public AcceptedPayloadTypeBuilder setNamedPayloadType(final OduNamedPayloadType value) {
        this._namedPayloadType = value;
        return this;
    }
    
    public AcceptedPayloadTypeBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AcceptedPayloadTypeBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AcceptedPayloadType build() {
        return new AcceptedPayloadTypeImpl(this);
    }

    private static final class AcceptedPayloadTypeImpl implements AcceptedPayloadType {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType.class;
        }

        private final BigInteger _hexPayloadType;
        private final OduNamedPayloadType _namedPayloadType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>> augmentation = Collections.emptyMap();

        private AcceptedPayloadTypeImpl(AcceptedPayloadTypeBuilder base) {
            this._hexPayloadType = base.getHexPayloadType();
            this._namedPayloadType = base.getNamedPayloadType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getHexPayloadType() {
            return _hexPayloadType;
        }
        
        @Override
        public OduNamedPayloadType getNamedPayloadType() {
            return _namedPayloadType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_hexPayloadType);
            result = prime * result + Objects.hashCode(_namedPayloadType);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType)obj;
            if (!Objects.equals(_hexPayloadType, other.getHexPayloadType())) {
                return false;
            }
            if (!Objects.equals(_namedPayloadType, other.getNamedPayloadType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AcceptedPayloadTypeImpl otherImpl = (AcceptedPayloadTypeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.capability.g.AcceptedPayloadType>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "AcceptedPayloadType [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_hexPayloadType != null) {
                builder.append("_hexPayloadType=");
                builder.append(_hexPayloadType);
                builder.append(", ");
            }
            if (_namedPayloadType != null) {
                builder.append("_namedPayloadType=");
                builder.append(_namedPayloadType);
            }
            final int builderLength = builder.length();
            final int builderAdditionalLength = builder.substring(name.length(), builderLength).length();
            if (builderAdditionalLength > 2 && !builder.substring(builderLength - 2, builderLength).equals(", ")) {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
