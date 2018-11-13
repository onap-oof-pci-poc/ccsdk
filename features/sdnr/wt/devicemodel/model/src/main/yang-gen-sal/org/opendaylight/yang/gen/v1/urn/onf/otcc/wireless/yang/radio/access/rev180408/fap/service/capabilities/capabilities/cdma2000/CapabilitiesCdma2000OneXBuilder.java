package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.one.x.CapabilitiesCdma2000OneXSelfConfig;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX
 *
 */
public class CapabilitiesCdma2000OneXBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX> {

    private java.lang.String _bandClassSupportedfap;
    private CapabilitiesCdma2000OneXSelfConfig _capabilitiesCdma2000OneXSelfConfig;
    private java.lang.Boolean _activeHandinCapable;
    private java.lang.Boolean _femtoOverheadMessagesCapable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>> augmentation = Collections.emptyMap();

    public CapabilitiesCdma2000OneXBuilder() {
    }
    public CapabilitiesCdma2000OneXBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000OneXG arg) {
        this._bandClassSupportedfap = arg.getBandClassSupportedfap();
        this._activeHandinCapable = arg.isActiveHandinCapable();
        this._femtoOverheadMessagesCapable = arg.isFemtoOverheadMessagesCapable();
    }

    public CapabilitiesCdma2000OneXBuilder(CapabilitiesCdma2000OneX base) {
        this._bandClassSupportedfap = base.getBandClassSupportedfap();
        this._capabilitiesCdma2000OneXSelfConfig = base.getCapabilitiesCdma2000OneXSelfConfig();
        this._activeHandinCapable = base.isActiveHandinCapable();
        this._femtoOverheadMessagesCapable = base.isFemtoOverheadMessagesCapable();
        if (base instanceof CapabilitiesCdma2000OneXImpl) {
            CapabilitiesCdma2000OneXImpl impl = (CapabilitiesCdma2000OneXImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000OneXG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000OneXG) {
            this._bandClassSupportedfap = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000OneXG)arg).getBandClassSupportedfap();
            this._activeHandinCapable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000OneXG)arg).isActiveHandinCapable();
            this._femtoOverheadMessagesCapable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000OneXG)arg).isFemtoOverheadMessagesCapable();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000OneXG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getBandClassSupportedfap() {
        return _bandClassSupportedfap;
    }
    
    public CapabilitiesCdma2000OneXSelfConfig getCapabilitiesCdma2000OneXSelfConfig() {
        return _capabilitiesCdma2000OneXSelfConfig;
    }
    
    public java.lang.Boolean isActiveHandinCapable() {
        return _activeHandinCapable;
    }
    
    public java.lang.Boolean isFemtoOverheadMessagesCapable() {
        return _femtoOverheadMessagesCapable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void check_bandClassSupportedfapLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 32) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..32]].", value));
     }
    
    public CapabilitiesCdma2000OneXBuilder setBandClassSupportedfap(final java.lang.String value) {
    if (value != null) {
        check_bandClassSupportedfapLength(value);
    }
        this._bandClassSupportedfap = value;
        return this;
    }
    
     
    public CapabilitiesCdma2000OneXBuilder setCapabilitiesCdma2000OneXSelfConfig(final CapabilitiesCdma2000OneXSelfConfig value) {
        this._capabilitiesCdma2000OneXSelfConfig = value;
        return this;
    }
    
     
    public CapabilitiesCdma2000OneXBuilder setActiveHandinCapable(final java.lang.Boolean value) {
        this._activeHandinCapable = value;
        return this;
    }
    
     
    public CapabilitiesCdma2000OneXBuilder setFemtoOverheadMessagesCapable(final java.lang.Boolean value) {
        this._femtoOverheadMessagesCapable = value;
        return this;
    }
    
    public CapabilitiesCdma2000OneXBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CapabilitiesCdma2000OneXBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CapabilitiesCdma2000OneX build() {
        return new CapabilitiesCdma2000OneXImpl(this);
    }

    private static final class CapabilitiesCdma2000OneXImpl implements CapabilitiesCdma2000OneX {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX.class;
        }

        private final java.lang.String _bandClassSupportedfap;
        private final CapabilitiesCdma2000OneXSelfConfig _capabilitiesCdma2000OneXSelfConfig;
        private final java.lang.Boolean _activeHandinCapable;
        private final java.lang.Boolean _femtoOverheadMessagesCapable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>> augmentation = Collections.emptyMap();

        private CapabilitiesCdma2000OneXImpl(CapabilitiesCdma2000OneXBuilder base) {
            this._bandClassSupportedfap = base.getBandClassSupportedfap();
            this._capabilitiesCdma2000OneXSelfConfig = base.getCapabilitiesCdma2000OneXSelfConfig();
            this._activeHandinCapable = base.isActiveHandinCapable();
            this._femtoOverheadMessagesCapable = base.isFemtoOverheadMessagesCapable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getBandClassSupportedfap() {
            return _bandClassSupportedfap;
        }
        
        @Override
        public CapabilitiesCdma2000OneXSelfConfig getCapabilitiesCdma2000OneXSelfConfig() {
            return _capabilitiesCdma2000OneXSelfConfig;
        }
        
        @Override
        public java.lang.Boolean isActiveHandinCapable() {
            return _activeHandinCapable;
        }
        
        @Override
        public java.lang.Boolean isFemtoOverheadMessagesCapable() {
            return _femtoOverheadMessagesCapable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bandClassSupportedfap);
            result = prime * result + Objects.hashCode(_capabilitiesCdma2000OneXSelfConfig);
            result = prime * result + Objects.hashCode(_activeHandinCapable);
            result = prime * result + Objects.hashCode(_femtoOverheadMessagesCapable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX)obj;
            if (!Objects.equals(_bandClassSupportedfap, other.getBandClassSupportedfap())) {
                return false;
            }
            if (!Objects.equals(_capabilitiesCdma2000OneXSelfConfig, other.getCapabilitiesCdma2000OneXSelfConfig())) {
                return false;
            }
            if (!Objects.equals(_activeHandinCapable, other.isActiveHandinCapable())) {
                return false;
            }
            if (!Objects.equals(_femtoOverheadMessagesCapable, other.isFemtoOverheadMessagesCapable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CapabilitiesCdma2000OneXImpl otherImpl = (CapabilitiesCdma2000OneXImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>> e : augmentation.entrySet()) {
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
            java.lang.String name = "CapabilitiesCdma2000OneX [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bandClassSupportedfap != null) {
                builder.append("_bandClassSupportedfap=");
                builder.append(_bandClassSupportedfap);
                builder.append(", ");
            }
            if (_capabilitiesCdma2000OneXSelfConfig != null) {
                builder.append("_capabilitiesCdma2000OneXSelfConfig=");
                builder.append(_capabilitiesCdma2000OneXSelfConfig);
                builder.append(", ");
            }
            if (_activeHandinCapable != null) {
                builder.append("_activeHandinCapable=");
                builder.append(_activeHandinCapable);
                builder.append(", ");
            }
            if (_femtoOverheadMessagesCapable != null) {
                builder.append("_femtoOverheadMessagesCapable=");
                builder.append(_femtoOverheadMessagesCapable);
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
