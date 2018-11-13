package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway
 *
 */
public class FapControlCdma2000GatewayBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway> {

    private java.lang.String _secGwServer1;
    private java.lang.String _secGwServer2;
    private java.lang.String _secGwServer3;
    private BigInteger _secGwSwitchoverCount;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>> augmentation = Collections.emptyMap();

    public FapControlCdma2000GatewayBuilder() {
    }
    public FapControlCdma2000GatewayBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000GatewayG arg) {
        this._secGwServer1 = arg.getSecGwServer1();
        this._secGwServer2 = arg.getSecGwServer2();
        this._secGwServer3 = arg.getSecGwServer3();
        this._secGwSwitchoverCount = arg.getSecGwSwitchoverCount();
    }

    public FapControlCdma2000GatewayBuilder(FapControlCdma2000Gateway base) {
        this._secGwServer1 = base.getSecGwServer1();
        this._secGwServer2 = base.getSecGwServer2();
        this._secGwServer3 = base.getSecGwServer3();
        this._secGwSwitchoverCount = base.getSecGwSwitchoverCount();
        if (base instanceof FapControlCdma2000GatewayImpl) {
            FapControlCdma2000GatewayImpl impl = (FapControlCdma2000GatewayImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000GatewayG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000GatewayG) {
            this._secGwServer1 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000GatewayG)arg).getSecGwServer1();
            this._secGwServer2 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000GatewayG)arg).getSecGwServer2();
            this._secGwServer3 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000GatewayG)arg).getSecGwServer3();
            this._secGwSwitchoverCount = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000GatewayG)arg).getSecGwSwitchoverCount();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000GatewayG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getSecGwServer1() {
        return _secGwServer1;
    }
    
    public java.lang.String getSecGwServer2() {
        return _secGwServer2;
    }
    
    public java.lang.String getSecGwServer3() {
        return _secGwServer3;
    }
    
    public BigInteger getSecGwSwitchoverCount() {
        return _secGwSwitchoverCount;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void check_secGwServer1Length(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public FapControlCdma2000GatewayBuilder setSecGwServer1(final java.lang.String value) {
    if (value != null) {
        check_secGwServer1Length(value);
    }
        this._secGwServer1 = value;
        return this;
    }
    
     
     private static void check_secGwServer2Length(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public FapControlCdma2000GatewayBuilder setSecGwServer2(final java.lang.String value) {
    if (value != null) {
        check_secGwServer2Length(value);
    }
        this._secGwServer2 = value;
        return this;
    }
    
     
     private static void check_secGwServer3Length(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public FapControlCdma2000GatewayBuilder setSecGwServer3(final java.lang.String value) {
    if (value != null) {
        check_secGwServer3Length(value);
    }
        this._secGwServer3 = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSECGWSWITCHOVERCOUNTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSECGWSWITCHOVERCOUNTRANGE_RANGES = a;
     }
     private static void checkSecGwSwitchoverCountRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSECGWSWITCHOVERCOUNTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSECGWSWITCHOVERCOUNTRANGE_RANGES)));
     }
    
    public FapControlCdma2000GatewayBuilder setSecGwSwitchoverCount(final BigInteger value) {
    if (value != null) {
        checkSecGwSwitchoverCountRange(value);
    }
        this._secGwSwitchoverCount = value;
        return this;
    }
    
    public FapControlCdma2000GatewayBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlCdma2000GatewayBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControlCdma2000Gateway build() {
        return new FapControlCdma2000GatewayImpl(this);
    }

    private static final class FapControlCdma2000GatewayImpl implements FapControlCdma2000Gateway {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway.class;
        }

        private final java.lang.String _secGwServer1;
        private final java.lang.String _secGwServer2;
        private final java.lang.String _secGwServer3;
        private final BigInteger _secGwSwitchoverCount;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>> augmentation = Collections.emptyMap();

        private FapControlCdma2000GatewayImpl(FapControlCdma2000GatewayBuilder base) {
            this._secGwServer1 = base.getSecGwServer1();
            this._secGwServer2 = base.getSecGwServer2();
            this._secGwServer3 = base.getSecGwServer3();
            this._secGwSwitchoverCount = base.getSecGwSwitchoverCount();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getSecGwServer1() {
            return _secGwServer1;
        }
        
        @Override
        public java.lang.String getSecGwServer2() {
            return _secGwServer2;
        }
        
        @Override
        public java.lang.String getSecGwServer3() {
            return _secGwServer3;
        }
        
        @Override
        public BigInteger getSecGwSwitchoverCount() {
            return _secGwSwitchoverCount;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_secGwServer1);
            result = prime * result + Objects.hashCode(_secGwServer2);
            result = prime * result + Objects.hashCode(_secGwServer3);
            result = prime * result + Objects.hashCode(_secGwSwitchoverCount);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway)obj;
            if (!Objects.equals(_secGwServer1, other.getSecGwServer1())) {
                return false;
            }
            if (!Objects.equals(_secGwServer2, other.getSecGwServer2())) {
                return false;
            }
            if (!Objects.equals(_secGwServer3, other.getSecGwServer3())) {
                return false;
            }
            if (!Objects.equals(_secGwSwitchoverCount, other.getSecGwSwitchoverCount())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FapControlCdma2000GatewayImpl otherImpl = (FapControlCdma2000GatewayImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControlCdma2000Gateway [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_secGwServer1 != null) {
                builder.append("_secGwServer1=");
                builder.append(_secGwServer1);
                builder.append(", ");
            }
            if (_secGwServer2 != null) {
                builder.append("_secGwServer2=");
                builder.append(_secGwServer2);
                builder.append(", ");
            }
            if (_secGwServer3 != null) {
                builder.append("_secGwServer3=");
                builder.append(_secGwServer3);
                builder.append(", ");
            }
            if (_secGwSwitchoverCount != null) {
                builder.append("_secGwSwitchoverCount=");
                builder.append(_secGwSwitchoverCount);
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
