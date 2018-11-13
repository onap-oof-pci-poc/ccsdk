package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import java.util.Collections;
import java.util.Arrays;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp
 *
 */
public class FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp> {

    private IpAddress _a13IpAddress;
    private java.lang.String _alias;
    private byte[] _hrpdSubnet;
    private java.lang.Short _hrpdSubnetLength;
    private FapControlCdma2000HrpdA13HrpdSubnetToIpKey _key;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>> augmentation = Collections.emptyMap();

    public FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder() {
    }
    public FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13HrpdSubnetToIpG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._hrpdSubnetLength = arg.getHrpdSubnetLength();
        this._hrpdSubnet = arg.getHrpdSubnet();
        this._a13IpAddress = arg.getA13IpAddress();
    }

    public FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder(FapControlCdma2000HrpdA13HrpdSubnetToIp base) {
        if (base.getKey() == null) {
            this._key = new FapControlCdma2000HrpdA13HrpdSubnetToIpKey(
                base.getA13IpAddress()
            );
            this._a13IpAddress = base.getA13IpAddress();
        } else {
            this._key = base.getKey();
            this._a13IpAddress = _key.getA13IpAddress();
        }
        this._alias = base.getAlias();
        this._hrpdSubnet = base.getHrpdSubnet();
        this._hrpdSubnetLength = base.getHrpdSubnetLength();
        this._enable = base.isEnable();
        if (base instanceof FapControlCdma2000HrpdA13HrpdSubnetToIpImpl) {
            FapControlCdma2000HrpdA13HrpdSubnetToIpImpl impl = (FapControlCdma2000HrpdA13HrpdSubnetToIpImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13HrpdSubnetToIpG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13HrpdSubnetToIpG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13HrpdSubnetToIpG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13HrpdSubnetToIpG)arg).getAlias();
            this._hrpdSubnetLength = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13HrpdSubnetToIpG)arg).getHrpdSubnetLength();
            this._hrpdSubnet = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13HrpdSubnetToIpG)arg).getHrpdSubnet();
            this._a13IpAddress = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13HrpdSubnetToIpG)arg).getA13IpAddress();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13HrpdSubnetToIpG] \n" +
              "but was: " + arg
            );
        }
    }

    public IpAddress getA13IpAddress() {
        return _a13IpAddress;
    }
    
    public java.lang.String getAlias() {
        return _alias;
    }
    
    public byte[] getHrpdSubnet() {
        return _hrpdSubnet == null ? null : _hrpdSubnet.clone();
    }
    
    public java.lang.Short getHrpdSubnetLength() {
        return _hrpdSubnetLength;
    }
    
    public FapControlCdma2000HrpdA13HrpdSubnetToIpKey getKey() {
        return _key;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder setA13IpAddress(final IpAddress value) {
        this._a13IpAddress = value;
        return this;
    }
    
     
     private static void check_aliasLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..64]].", value));
     }
    
    public FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
     private static void check_hrpdSubnetLength(final byte[] value) {
         final int length = value.length;
         if (length >= 0 && length <= 13) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..13]].", java.util.Arrays.toString(value)));
     }
    
    public FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder setHrpdSubnet(final byte[] value) {
    if (value != null) {
        check_hrpdSubnetLength(value);
    }
        this._hrpdSubnet = value;
        return this;
    }
    
     
     private static void checkHrpdSubnetLengthRange(final short value) {
         if (value >= (short)1 && value <= (short)104) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..104]].", value));
     }
    
    public FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder setHrpdSubnetLength(final java.lang.Short value) {
    if (value != null) {
        checkHrpdSubnetLengthRange(value);
    }
        this._hrpdSubnetLength = value;
        return this;
    }
    
     
    public FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder setKey(final FapControlCdma2000HrpdA13HrpdSubnetToIpKey value) {
        this._key = value;
        return this;
    }
    
     
    public FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControlCdma2000HrpdA13HrpdSubnetToIp build() {
        return new FapControlCdma2000HrpdA13HrpdSubnetToIpImpl(this);
    }

    private static final class FapControlCdma2000HrpdA13HrpdSubnetToIpImpl implements FapControlCdma2000HrpdA13HrpdSubnetToIp {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp.class;
        }

        private final IpAddress _a13IpAddress;
        private final java.lang.String _alias;
        private final byte[] _hrpdSubnet;
        private final java.lang.Short _hrpdSubnetLength;
        private final FapControlCdma2000HrpdA13HrpdSubnetToIpKey _key;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>> augmentation = Collections.emptyMap();

        private FapControlCdma2000HrpdA13HrpdSubnetToIpImpl(FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder base) {
            if (base.getKey() == null) {
                this._key = new FapControlCdma2000HrpdA13HrpdSubnetToIpKey(
                    base.getA13IpAddress()
                );
                this._a13IpAddress = base.getA13IpAddress();
            } else {
                this._key = base.getKey();
                this._a13IpAddress = _key.getA13IpAddress();
            }
            this._alias = base.getAlias();
            this._hrpdSubnet = base.getHrpdSubnet();
            this._hrpdSubnetLength = base.getHrpdSubnetLength();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public IpAddress getA13IpAddress() {
            return _a13IpAddress;
        }
        
        @Override
        public java.lang.String getAlias() {
            return _alias;
        }
        
        @Override
        public byte[] getHrpdSubnet() {
            return _hrpdSubnet == null ? null : _hrpdSubnet.clone();
        }
        
        @Override
        public java.lang.Short getHrpdSubnetLength() {
            return _hrpdSubnetLength;
        }
        
        @Override
        public FapControlCdma2000HrpdA13HrpdSubnetToIpKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_a13IpAddress);
            result = prime * result + Objects.hashCode(_alias);
            result = prime * result + Arrays.hashCode(_hrpdSubnet);
            result = prime * result + Objects.hashCode(_hrpdSubnetLength);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_enable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp)obj;
            if (!Objects.equals(_a13IpAddress, other.getA13IpAddress())) {
                return false;
            }
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Arrays.equals(_hrpdSubnet, other.getHrpdSubnet())) {
                return false;
            }
            if (!Objects.equals(_hrpdSubnetLength, other.getHrpdSubnetLength())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FapControlCdma2000HrpdA13HrpdSubnetToIpImpl otherImpl = (FapControlCdma2000HrpdA13HrpdSubnetToIpImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControlCdma2000HrpdA13HrpdSubnetToIp [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_a13IpAddress != null) {
                builder.append("_a13IpAddress=");
                builder.append(_a13IpAddress);
                builder.append(", ");
            }
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_hrpdSubnet != null) {
                builder.append("_hrpdSubnet=");
                builder.append(Arrays.toString(_hrpdSubnet));
                builder.append(", ");
            }
            if (_hrpdSubnetLength != null) {
                builder.append("_hrpdSubnetLength=");
                builder.append(_hrpdSubnetLength);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_enable != null) {
                builder.append("_enable=");
                builder.append(_enable);
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
