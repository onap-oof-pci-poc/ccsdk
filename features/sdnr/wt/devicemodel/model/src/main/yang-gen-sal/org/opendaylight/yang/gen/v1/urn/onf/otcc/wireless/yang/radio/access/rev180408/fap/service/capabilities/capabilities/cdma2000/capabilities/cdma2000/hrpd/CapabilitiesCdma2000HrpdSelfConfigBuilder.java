package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig
 *
 */
public class CapabilitiesCdma2000HrpdSelfConfigBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig> {

    private java.lang.Boolean _maxfapBeaconTxPowerConfig;
    private java.lang.Boolean _maxfapTxPowerConfig;
    private java.lang.Boolean _pilotPnConfig;
    private java.lang.Boolean _rfcnflConfig;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>> augmentation = Collections.emptyMap();

    public CapabilitiesCdma2000HrpdSelfConfigBuilder() {
    }
    public CapabilitiesCdma2000HrpdSelfConfigBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdSelfConfigG arg) {
        this._rfcnflConfig = arg.isRfcnflConfig();
        this._pilotPnConfig = arg.isPilotPnConfig();
        this._maxfapTxPowerConfig = arg.isMaxfapTxPowerConfig();
        this._maxfapBeaconTxPowerConfig = arg.isMaxfapBeaconTxPowerConfig();
    }

    public CapabilitiesCdma2000HrpdSelfConfigBuilder(CapabilitiesCdma2000HrpdSelfConfig base) {
        this._maxfapBeaconTxPowerConfig = base.isMaxfapBeaconTxPowerConfig();
        this._maxfapTxPowerConfig = base.isMaxfapTxPowerConfig();
        this._pilotPnConfig = base.isPilotPnConfig();
        this._rfcnflConfig = base.isRfcnflConfig();
        if (base instanceof CapabilitiesCdma2000HrpdSelfConfigImpl) {
            CapabilitiesCdma2000HrpdSelfConfigImpl impl = (CapabilitiesCdma2000HrpdSelfConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdSelfConfigG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdSelfConfigG) {
            this._rfcnflConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdSelfConfigG)arg).isRfcnflConfig();
            this._pilotPnConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdSelfConfigG)arg).isPilotPnConfig();
            this._maxfapTxPowerConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdSelfConfigG)arg).isMaxfapTxPowerConfig();
            this._maxfapBeaconTxPowerConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdSelfConfigG)arg).isMaxfapBeaconTxPowerConfig();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdSelfConfigG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Boolean isMaxfapBeaconTxPowerConfig() {
        return _maxfapBeaconTxPowerConfig;
    }
    
    public java.lang.Boolean isMaxfapTxPowerConfig() {
        return _maxfapTxPowerConfig;
    }
    
    public java.lang.Boolean isPilotPnConfig() {
        return _pilotPnConfig;
    }
    
    public java.lang.Boolean isRfcnflConfig() {
        return _rfcnflConfig;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CapabilitiesCdma2000HrpdSelfConfigBuilder setMaxfapBeaconTxPowerConfig(final java.lang.Boolean value) {
        this._maxfapBeaconTxPowerConfig = value;
        return this;
    }
    
     
    public CapabilitiesCdma2000HrpdSelfConfigBuilder setMaxfapTxPowerConfig(final java.lang.Boolean value) {
        this._maxfapTxPowerConfig = value;
        return this;
    }
    
     
    public CapabilitiesCdma2000HrpdSelfConfigBuilder setPilotPnConfig(final java.lang.Boolean value) {
        this._pilotPnConfig = value;
        return this;
    }
    
     
    public CapabilitiesCdma2000HrpdSelfConfigBuilder setRfcnflConfig(final java.lang.Boolean value) {
        this._rfcnflConfig = value;
        return this;
    }
    
    public CapabilitiesCdma2000HrpdSelfConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CapabilitiesCdma2000HrpdSelfConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CapabilitiesCdma2000HrpdSelfConfig build() {
        return new CapabilitiesCdma2000HrpdSelfConfigImpl(this);
    }

    private static final class CapabilitiesCdma2000HrpdSelfConfigImpl implements CapabilitiesCdma2000HrpdSelfConfig {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig.class;
        }

        private final java.lang.Boolean _maxfapBeaconTxPowerConfig;
        private final java.lang.Boolean _maxfapTxPowerConfig;
        private final java.lang.Boolean _pilotPnConfig;
        private final java.lang.Boolean _rfcnflConfig;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>> augmentation = Collections.emptyMap();

        private CapabilitiesCdma2000HrpdSelfConfigImpl(CapabilitiesCdma2000HrpdSelfConfigBuilder base) {
            this._maxfapBeaconTxPowerConfig = base.isMaxfapBeaconTxPowerConfig();
            this._maxfapTxPowerConfig = base.isMaxfapTxPowerConfig();
            this._pilotPnConfig = base.isPilotPnConfig();
            this._rfcnflConfig = base.isRfcnflConfig();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Boolean isMaxfapBeaconTxPowerConfig() {
            return _maxfapBeaconTxPowerConfig;
        }
        
        @Override
        public java.lang.Boolean isMaxfapTxPowerConfig() {
            return _maxfapTxPowerConfig;
        }
        
        @Override
        public java.lang.Boolean isPilotPnConfig() {
            return _pilotPnConfig;
        }
        
        @Override
        public java.lang.Boolean isRfcnflConfig() {
            return _rfcnflConfig;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_maxfapBeaconTxPowerConfig);
            result = prime * result + Objects.hashCode(_maxfapTxPowerConfig);
            result = prime * result + Objects.hashCode(_pilotPnConfig);
            result = prime * result + Objects.hashCode(_rfcnflConfig);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig)obj;
            if (!Objects.equals(_maxfapBeaconTxPowerConfig, other.isMaxfapBeaconTxPowerConfig())) {
                return false;
            }
            if (!Objects.equals(_maxfapTxPowerConfig, other.isMaxfapTxPowerConfig())) {
                return false;
            }
            if (!Objects.equals(_pilotPnConfig, other.isPilotPnConfig())) {
                return false;
            }
            if (!Objects.equals(_rfcnflConfig, other.isRfcnflConfig())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CapabilitiesCdma2000HrpdSelfConfigImpl otherImpl = (CapabilitiesCdma2000HrpdSelfConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>> e : augmentation.entrySet()) {
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
            java.lang.String name = "CapabilitiesCdma2000HrpdSelfConfig [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_maxfapBeaconTxPowerConfig != null) {
                builder.append("_maxfapBeaconTxPowerConfig=");
                builder.append(_maxfapBeaconTxPowerConfig);
                builder.append(", ");
            }
            if (_maxfapTxPowerConfig != null) {
                builder.append("_maxfapTxPowerConfig=");
                builder.append(_maxfapTxPowerConfig);
                builder.append(", ");
            }
            if (_pilotPnConfig != null) {
                builder.append("_pilotPnConfig=");
                builder.append(_pilotPnConfig);
                builder.append(", ");
            }
            if (_rfcnflConfig != null) {
                builder.append("_rfcnflConfig=");
                builder.append(_rfcnflConfig);
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
