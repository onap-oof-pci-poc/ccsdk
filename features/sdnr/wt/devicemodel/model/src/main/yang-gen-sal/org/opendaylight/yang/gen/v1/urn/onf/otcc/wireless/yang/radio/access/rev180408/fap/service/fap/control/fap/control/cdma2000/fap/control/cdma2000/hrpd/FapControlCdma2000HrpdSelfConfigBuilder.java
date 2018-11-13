package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig
 *
 */
public class FapControlCdma2000HrpdSelfConfigBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig> {

    private java.lang.Boolean _maxHrpdBeaconTxPowerSelfConfigEnable;
    private java.lang.Boolean _maxfapTxPowerSelfConfigEnable;
    private java.lang.Boolean _pilotPnSelfConfigEnable;
    private java.lang.Boolean _rfcnflSelfConfigEnable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>> augmentation = Collections.emptyMap();

    public FapControlCdma2000HrpdSelfConfigBuilder() {
    }
    public FapControlCdma2000HrpdSelfConfigBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdSelfConfigG arg) {
        this._rfcnflSelfConfigEnable = arg.isRfcnflSelfConfigEnable();
        this._pilotPnSelfConfigEnable = arg.isPilotPnSelfConfigEnable();
        this._maxfapTxPowerSelfConfigEnable = arg.isMaxfapTxPowerSelfConfigEnable();
        this._maxHrpdBeaconTxPowerSelfConfigEnable = arg.isMaxHrpdBeaconTxPowerSelfConfigEnable();
    }

    public FapControlCdma2000HrpdSelfConfigBuilder(FapControlCdma2000HrpdSelfConfig base) {
        this._maxHrpdBeaconTxPowerSelfConfigEnable = base.isMaxHrpdBeaconTxPowerSelfConfigEnable();
        this._maxfapTxPowerSelfConfigEnable = base.isMaxfapTxPowerSelfConfigEnable();
        this._pilotPnSelfConfigEnable = base.isPilotPnSelfConfigEnable();
        this._rfcnflSelfConfigEnable = base.isRfcnflSelfConfigEnable();
        if (base instanceof FapControlCdma2000HrpdSelfConfigImpl) {
            FapControlCdma2000HrpdSelfConfigImpl impl = (FapControlCdma2000HrpdSelfConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdSelfConfigG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdSelfConfigG) {
            this._rfcnflSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdSelfConfigG)arg).isRfcnflSelfConfigEnable();
            this._pilotPnSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdSelfConfigG)arg).isPilotPnSelfConfigEnable();
            this._maxfapTxPowerSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdSelfConfigG)arg).isMaxfapTxPowerSelfConfigEnable();
            this._maxHrpdBeaconTxPowerSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdSelfConfigG)arg).isMaxHrpdBeaconTxPowerSelfConfigEnable();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdSelfConfigG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Boolean isMaxHrpdBeaconTxPowerSelfConfigEnable() {
        return _maxHrpdBeaconTxPowerSelfConfigEnable;
    }
    
    public java.lang.Boolean isMaxfapTxPowerSelfConfigEnable() {
        return _maxfapTxPowerSelfConfigEnable;
    }
    
    public java.lang.Boolean isPilotPnSelfConfigEnable() {
        return _pilotPnSelfConfigEnable;
    }
    
    public java.lang.Boolean isRfcnflSelfConfigEnable() {
        return _rfcnflSelfConfigEnable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FapControlCdma2000HrpdSelfConfigBuilder setMaxHrpdBeaconTxPowerSelfConfigEnable(final java.lang.Boolean value) {
        this._maxHrpdBeaconTxPowerSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlCdma2000HrpdSelfConfigBuilder setMaxfapTxPowerSelfConfigEnable(final java.lang.Boolean value) {
        this._maxfapTxPowerSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlCdma2000HrpdSelfConfigBuilder setPilotPnSelfConfigEnable(final java.lang.Boolean value) {
        this._pilotPnSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlCdma2000HrpdSelfConfigBuilder setRfcnflSelfConfigEnable(final java.lang.Boolean value) {
        this._rfcnflSelfConfigEnable = value;
        return this;
    }
    
    public FapControlCdma2000HrpdSelfConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlCdma2000HrpdSelfConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControlCdma2000HrpdSelfConfig build() {
        return new FapControlCdma2000HrpdSelfConfigImpl(this);
    }

    private static final class FapControlCdma2000HrpdSelfConfigImpl implements FapControlCdma2000HrpdSelfConfig {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig.class;
        }

        private final java.lang.Boolean _maxHrpdBeaconTxPowerSelfConfigEnable;
        private final java.lang.Boolean _maxfapTxPowerSelfConfigEnable;
        private final java.lang.Boolean _pilotPnSelfConfigEnable;
        private final java.lang.Boolean _rfcnflSelfConfigEnable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>> augmentation = Collections.emptyMap();

        private FapControlCdma2000HrpdSelfConfigImpl(FapControlCdma2000HrpdSelfConfigBuilder base) {
            this._maxHrpdBeaconTxPowerSelfConfigEnable = base.isMaxHrpdBeaconTxPowerSelfConfigEnable();
            this._maxfapTxPowerSelfConfigEnable = base.isMaxfapTxPowerSelfConfigEnable();
            this._pilotPnSelfConfigEnable = base.isPilotPnSelfConfigEnable();
            this._rfcnflSelfConfigEnable = base.isRfcnflSelfConfigEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Boolean isMaxHrpdBeaconTxPowerSelfConfigEnable() {
            return _maxHrpdBeaconTxPowerSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isMaxfapTxPowerSelfConfigEnable() {
            return _maxfapTxPowerSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isPilotPnSelfConfigEnable() {
            return _pilotPnSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isRfcnflSelfConfigEnable() {
            return _rfcnflSelfConfigEnable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_maxHrpdBeaconTxPowerSelfConfigEnable);
            result = prime * result + Objects.hashCode(_maxfapTxPowerSelfConfigEnable);
            result = prime * result + Objects.hashCode(_pilotPnSelfConfigEnable);
            result = prime * result + Objects.hashCode(_rfcnflSelfConfigEnable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig)obj;
            if (!Objects.equals(_maxHrpdBeaconTxPowerSelfConfigEnable, other.isMaxHrpdBeaconTxPowerSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_maxfapTxPowerSelfConfigEnable, other.isMaxfapTxPowerSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_pilotPnSelfConfigEnable, other.isPilotPnSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_rfcnflSelfConfigEnable, other.isRfcnflSelfConfigEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FapControlCdma2000HrpdSelfConfigImpl otherImpl = (FapControlCdma2000HrpdSelfConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControlCdma2000HrpdSelfConfig [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_maxHrpdBeaconTxPowerSelfConfigEnable != null) {
                builder.append("_maxHrpdBeaconTxPowerSelfConfigEnable=");
                builder.append(_maxHrpdBeaconTxPowerSelfConfigEnable);
                builder.append(", ");
            }
            if (_maxfapTxPowerSelfConfigEnable != null) {
                builder.append("_maxfapTxPowerSelfConfigEnable=");
                builder.append(_maxfapTxPowerSelfConfigEnable);
                builder.append(", ");
            }
            if (_pilotPnSelfConfigEnable != null) {
                builder.append("_pilotPnSelfConfigEnable=");
                builder.append(_pilotPnSelfConfigEnable);
                builder.append(", ");
            }
            if (_rfcnflSelfConfigEnable != null) {
                builder.append("_rfcnflSelfConfigEnable=");
                builder.append(_rfcnflSelfConfigEnable);
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
