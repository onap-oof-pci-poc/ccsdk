package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000
 *
 */
public class CapabilitiesCdma2000Builder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000> {

    private List<java.lang.String> _bandClassSupportedfapBeacon;
    private CapabilitiesCdma2000Hrpd _capabilitiesCdma2000Hrpd;
    private CapabilitiesCdma2000OneX _capabilitiesCdma2000OneX;
    private java.lang.Boolean _remoteIpAccessCapable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>> augmentation = Collections.emptyMap();

    public CapabilitiesCdma2000Builder() {
    }
    public CapabilitiesCdma2000Builder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000G arg) {
        this._remoteIpAccessCapable = arg.isRemoteIpAccessCapable();
        this._bandClassSupportedfapBeacon = arg.getBandClassSupportedfapBeacon();
    }

    public CapabilitiesCdma2000Builder(CapabilitiesCdma2000 base) {
        this._bandClassSupportedfapBeacon = base.getBandClassSupportedfapBeacon();
        this._capabilitiesCdma2000Hrpd = base.getCapabilitiesCdma2000Hrpd();
        this._capabilitiesCdma2000OneX = base.getCapabilitiesCdma2000OneX();
        this._remoteIpAccessCapable = base.isRemoteIpAccessCapable();
        if (base instanceof CapabilitiesCdma2000Impl) {
            CapabilitiesCdma2000Impl impl = (CapabilitiesCdma2000Impl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000G</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000G) {
            this._remoteIpAccessCapable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000G)arg).isRemoteIpAccessCapable();
            this._bandClassSupportedfapBeacon = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000G)arg).getBandClassSupportedfapBeacon();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000G] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.String> getBandClassSupportedfapBeacon() {
        return _bandClassSupportedfapBeacon;
    }
    
    public CapabilitiesCdma2000Hrpd getCapabilitiesCdma2000Hrpd() {
        return _capabilitiesCdma2000Hrpd;
    }
    
    public CapabilitiesCdma2000OneX getCapabilitiesCdma2000OneX() {
        return _capabilitiesCdma2000OneX;
    }
    
    public java.lang.Boolean isRemoteIpAccessCapable() {
        return _remoteIpAccessCapable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CapabilitiesCdma2000Builder setBandClassSupportedfapBeacon(final List<java.lang.String> value) {
        this._bandClassSupportedfapBeacon = value;
        return this;
    }
    
     
    public CapabilitiesCdma2000Builder setCapabilitiesCdma2000Hrpd(final CapabilitiesCdma2000Hrpd value) {
        this._capabilitiesCdma2000Hrpd = value;
        return this;
    }
    
     
    public CapabilitiesCdma2000Builder setCapabilitiesCdma2000OneX(final CapabilitiesCdma2000OneX value) {
        this._capabilitiesCdma2000OneX = value;
        return this;
    }
    
     
    public CapabilitiesCdma2000Builder setRemoteIpAccessCapable(final java.lang.Boolean value) {
        this._remoteIpAccessCapable = value;
        return this;
    }
    
    public CapabilitiesCdma2000Builder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CapabilitiesCdma2000Builder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CapabilitiesCdma2000 build() {
        return new CapabilitiesCdma2000Impl(this);
    }

    private static final class CapabilitiesCdma2000Impl implements CapabilitiesCdma2000 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000.class;
        }

        private final List<java.lang.String> _bandClassSupportedfapBeacon;
        private final CapabilitiesCdma2000Hrpd _capabilitiesCdma2000Hrpd;
        private final CapabilitiesCdma2000OneX _capabilitiesCdma2000OneX;
        private final java.lang.Boolean _remoteIpAccessCapable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>> augmentation = Collections.emptyMap();

        private CapabilitiesCdma2000Impl(CapabilitiesCdma2000Builder base) {
            this._bandClassSupportedfapBeacon = base.getBandClassSupportedfapBeacon();
            this._capabilitiesCdma2000Hrpd = base.getCapabilitiesCdma2000Hrpd();
            this._capabilitiesCdma2000OneX = base.getCapabilitiesCdma2000OneX();
            this._remoteIpAccessCapable = base.isRemoteIpAccessCapable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.String> getBandClassSupportedfapBeacon() {
            return _bandClassSupportedfapBeacon;
        }
        
        @Override
        public CapabilitiesCdma2000Hrpd getCapabilitiesCdma2000Hrpd() {
            return _capabilitiesCdma2000Hrpd;
        }
        
        @Override
        public CapabilitiesCdma2000OneX getCapabilitiesCdma2000OneX() {
            return _capabilitiesCdma2000OneX;
        }
        
        @Override
        public java.lang.Boolean isRemoteIpAccessCapable() {
            return _remoteIpAccessCapable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bandClassSupportedfapBeacon);
            result = prime * result + Objects.hashCode(_capabilitiesCdma2000Hrpd);
            result = prime * result + Objects.hashCode(_capabilitiesCdma2000OneX);
            result = prime * result + Objects.hashCode(_remoteIpAccessCapable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000 other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000)obj;
            if (!Objects.equals(_bandClassSupportedfapBeacon, other.getBandClassSupportedfapBeacon())) {
                return false;
            }
            if (!Objects.equals(_capabilitiesCdma2000Hrpd, other.getCapabilitiesCdma2000Hrpd())) {
                return false;
            }
            if (!Objects.equals(_capabilitiesCdma2000OneX, other.getCapabilitiesCdma2000OneX())) {
                return false;
            }
            if (!Objects.equals(_remoteIpAccessCapable, other.isRemoteIpAccessCapable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CapabilitiesCdma2000Impl otherImpl = (CapabilitiesCdma2000Impl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>> e : augmentation.entrySet()) {
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
            java.lang.String name = "CapabilitiesCdma2000 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bandClassSupportedfapBeacon != null) {
                builder.append("_bandClassSupportedfapBeacon=");
                builder.append(_bandClassSupportedfapBeacon);
                builder.append(", ");
            }
            if (_capabilitiesCdma2000Hrpd != null) {
                builder.append("_capabilitiesCdma2000Hrpd=");
                builder.append(_capabilitiesCdma2000Hrpd);
                builder.append(", ");
            }
            if (_capabilitiesCdma2000OneX != null) {
                builder.append("_capabilitiesCdma2000OneX=");
                builder.append(_capabilitiesCdma2000OneX);
                builder.append(", ");
            }
            if (_remoteIpAccessCapable != null) {
                builder.append("_remoteIpAccessCapable=");
                builder.append(_remoteIpAccessCapable);
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
