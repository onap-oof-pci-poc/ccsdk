package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd
 *
 */
public class CapabilitiesCdma2000HrpdBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd> {

    private CapabilitiesCdma2000HrpdSelfConfig _capabilitiesCdma2000HrpdSelfConfig;
    private java.lang.Boolean _a13SessionTransferCapable;
    private java.lang.Boolean _a16SessionTransferCapable;
    private java.lang.Boolean _dedicatedHrpdBeacon;
    private java.lang.Boolean _localIpAccessCapable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>> augmentation = Collections.emptyMap();

    public CapabilitiesCdma2000HrpdBuilder() {
    }
    public CapabilitiesCdma2000HrpdBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdG arg) {
        this._a13SessionTransferCapable = arg.isA13SessionTransferCapable();
        this._a16SessionTransferCapable = arg.isA16SessionTransferCapable();
        this._localIpAccessCapable = arg.isLocalIpAccessCapable();
        this._dedicatedHrpdBeacon = arg.isDedicatedHrpdBeacon();
    }

    public CapabilitiesCdma2000HrpdBuilder(CapabilitiesCdma2000Hrpd base) {
        this._capabilitiesCdma2000HrpdSelfConfig = base.getCapabilitiesCdma2000HrpdSelfConfig();
        this._a13SessionTransferCapable = base.isA13SessionTransferCapable();
        this._a16SessionTransferCapable = base.isA16SessionTransferCapable();
        this._dedicatedHrpdBeacon = base.isDedicatedHrpdBeacon();
        this._localIpAccessCapable = base.isLocalIpAccessCapable();
        if (base instanceof CapabilitiesCdma2000HrpdImpl) {
            CapabilitiesCdma2000HrpdImpl impl = (CapabilitiesCdma2000HrpdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdG) {
            this._a13SessionTransferCapable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdG)arg).isA13SessionTransferCapable();
            this._a16SessionTransferCapable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdG)arg).isA16SessionTransferCapable();
            this._localIpAccessCapable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdG)arg).isLocalIpAccessCapable();
            this._dedicatedHrpdBeacon = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdG)arg).isDedicatedHrpdBeacon();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdG] \n" +
              "but was: " + arg
            );
        }
    }

    public CapabilitiesCdma2000HrpdSelfConfig getCapabilitiesCdma2000HrpdSelfConfig() {
        return _capabilitiesCdma2000HrpdSelfConfig;
    }
    
    public java.lang.Boolean isA13SessionTransferCapable() {
        return _a13SessionTransferCapable;
    }
    
    public java.lang.Boolean isA16SessionTransferCapable() {
        return _a16SessionTransferCapable;
    }
    
    public java.lang.Boolean isDedicatedHrpdBeacon() {
        return _dedicatedHrpdBeacon;
    }
    
    public java.lang.Boolean isLocalIpAccessCapable() {
        return _localIpAccessCapable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CapabilitiesCdma2000HrpdBuilder setCapabilitiesCdma2000HrpdSelfConfig(final CapabilitiesCdma2000HrpdSelfConfig value) {
        this._capabilitiesCdma2000HrpdSelfConfig = value;
        return this;
    }
    
     
    public CapabilitiesCdma2000HrpdBuilder setA13SessionTransferCapable(final java.lang.Boolean value) {
        this._a13SessionTransferCapable = value;
        return this;
    }
    
     
    public CapabilitiesCdma2000HrpdBuilder setA16SessionTransferCapable(final java.lang.Boolean value) {
        this._a16SessionTransferCapable = value;
        return this;
    }
    
     
    public CapabilitiesCdma2000HrpdBuilder setDedicatedHrpdBeacon(final java.lang.Boolean value) {
        this._dedicatedHrpdBeacon = value;
        return this;
    }
    
     
    public CapabilitiesCdma2000HrpdBuilder setLocalIpAccessCapable(final java.lang.Boolean value) {
        this._localIpAccessCapable = value;
        return this;
    }
    
    public CapabilitiesCdma2000HrpdBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CapabilitiesCdma2000HrpdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CapabilitiesCdma2000Hrpd build() {
        return new CapabilitiesCdma2000HrpdImpl(this);
    }

    private static final class CapabilitiesCdma2000HrpdImpl implements CapabilitiesCdma2000Hrpd {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd.class;
        }

        private final CapabilitiesCdma2000HrpdSelfConfig _capabilitiesCdma2000HrpdSelfConfig;
        private final java.lang.Boolean _a13SessionTransferCapable;
        private final java.lang.Boolean _a16SessionTransferCapable;
        private final java.lang.Boolean _dedicatedHrpdBeacon;
        private final java.lang.Boolean _localIpAccessCapable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>> augmentation = Collections.emptyMap();

        private CapabilitiesCdma2000HrpdImpl(CapabilitiesCdma2000HrpdBuilder base) {
            this._capabilitiesCdma2000HrpdSelfConfig = base.getCapabilitiesCdma2000HrpdSelfConfig();
            this._a13SessionTransferCapable = base.isA13SessionTransferCapable();
            this._a16SessionTransferCapable = base.isA16SessionTransferCapable();
            this._dedicatedHrpdBeacon = base.isDedicatedHrpdBeacon();
            this._localIpAccessCapable = base.isLocalIpAccessCapable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public CapabilitiesCdma2000HrpdSelfConfig getCapabilitiesCdma2000HrpdSelfConfig() {
            return _capabilitiesCdma2000HrpdSelfConfig;
        }
        
        @Override
        public java.lang.Boolean isA13SessionTransferCapable() {
            return _a13SessionTransferCapable;
        }
        
        @Override
        public java.lang.Boolean isA16SessionTransferCapable() {
            return _a16SessionTransferCapable;
        }
        
        @Override
        public java.lang.Boolean isDedicatedHrpdBeacon() {
            return _dedicatedHrpdBeacon;
        }
        
        @Override
        public java.lang.Boolean isLocalIpAccessCapable() {
            return _localIpAccessCapable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_capabilitiesCdma2000HrpdSelfConfig);
            result = prime * result + Objects.hashCode(_a13SessionTransferCapable);
            result = prime * result + Objects.hashCode(_a16SessionTransferCapable);
            result = prime * result + Objects.hashCode(_dedicatedHrpdBeacon);
            result = prime * result + Objects.hashCode(_localIpAccessCapable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd)obj;
            if (!Objects.equals(_capabilitiesCdma2000HrpdSelfConfig, other.getCapabilitiesCdma2000HrpdSelfConfig())) {
                return false;
            }
            if (!Objects.equals(_a13SessionTransferCapable, other.isA13SessionTransferCapable())) {
                return false;
            }
            if (!Objects.equals(_a16SessionTransferCapable, other.isA16SessionTransferCapable())) {
                return false;
            }
            if (!Objects.equals(_dedicatedHrpdBeacon, other.isDedicatedHrpdBeacon())) {
                return false;
            }
            if (!Objects.equals(_localIpAccessCapable, other.isLocalIpAccessCapable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CapabilitiesCdma2000HrpdImpl otherImpl = (CapabilitiesCdma2000HrpdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>> e : augmentation.entrySet()) {
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
            java.lang.String name = "CapabilitiesCdma2000Hrpd [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_capabilitiesCdma2000HrpdSelfConfig != null) {
                builder.append("_capabilitiesCdma2000HrpdSelfConfig=");
                builder.append(_capabilitiesCdma2000HrpdSelfConfig);
                builder.append(", ");
            }
            if (_a13SessionTransferCapable != null) {
                builder.append("_a13SessionTransferCapable=");
                builder.append(_a13SessionTransferCapable);
                builder.append(", ");
            }
            if (_a16SessionTransferCapable != null) {
                builder.append("_a16SessionTransferCapable=");
                builder.append(_a16SessionTransferCapable);
                builder.append(", ");
            }
            if (_dedicatedHrpdBeacon != null) {
                builder.append("_dedicatedHrpdBeacon=");
                builder.append(_dedicatedHrpdBeacon);
                builder.append(", ");
            }
            if (_localIpAccessCapable != null) {
                builder.append("_localIpAccessCapable=");
                builder.append(_localIpAccessCapable);
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
