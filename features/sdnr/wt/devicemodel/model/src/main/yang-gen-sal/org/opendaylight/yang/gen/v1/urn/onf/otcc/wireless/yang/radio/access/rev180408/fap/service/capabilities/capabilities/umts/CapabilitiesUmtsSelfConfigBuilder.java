package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig
 *
 */
public class CapabilitiesUmtsSelfConfigBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig> {

    private java.lang.Boolean _cellReSelectionConfig;
    private java.lang.Boolean _interFreqMeasConfig;
    private java.lang.Boolean _interRatMeasConfig;
    private java.lang.Boolean _intraFreqMeasConfig;
    private java.lang.Boolean _lacracuraConfig;
    private java.lang.Boolean _maxUlTxPowerConfig;
    private java.lang.Boolean _maxfapTxPowerExpandedConfig;
    private java.lang.Boolean _neighborListConfig;
    private java.lang.Boolean _noiseRiseLimitConfig;
    private java.lang.Boolean _pcpichPowerConfig;
    private java.lang.Boolean _primaryScramblingCodeConfig;
    private java.lang.Boolean _uarfcnConfig;
    private java.lang.Boolean _ueInternalMeasConfig;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>> augmentation = Collections.emptyMap();

    public CapabilitiesUmtsSelfConfigBuilder() {
    }
    public CapabilitiesUmtsSelfConfigBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG arg) {
        this._uarfcnConfig = arg.isUarfcnConfig();
        this._primaryScramblingCodeConfig = arg.isPrimaryScramblingCodeConfig();
        this._maxfapTxPowerExpandedConfig = arg.isMaxfapTxPowerExpandedConfig();
        this._pcpichPowerConfig = arg.isPcpichPowerConfig();
        this._maxUlTxPowerConfig = arg.isMaxUlTxPowerConfig();
        this._lacracuraConfig = arg.isLacracuraConfig();
        this._neighborListConfig = arg.isNeighborListConfig();
        this._cellReSelectionConfig = arg.isCellReSelectionConfig();
        this._intraFreqMeasConfig = arg.isIntraFreqMeasConfig();
        this._interFreqMeasConfig = arg.isInterFreqMeasConfig();
        this._interRatMeasConfig = arg.isInterRatMeasConfig();
        this._ueInternalMeasConfig = arg.isUeInternalMeasConfig();
        this._noiseRiseLimitConfig = arg.isNoiseRiseLimitConfig();
    }

    public CapabilitiesUmtsSelfConfigBuilder(CapabilitiesUmtsSelfConfig base) {
        this._cellReSelectionConfig = base.isCellReSelectionConfig();
        this._interFreqMeasConfig = base.isInterFreqMeasConfig();
        this._interRatMeasConfig = base.isInterRatMeasConfig();
        this._intraFreqMeasConfig = base.isIntraFreqMeasConfig();
        this._lacracuraConfig = base.isLacracuraConfig();
        this._maxUlTxPowerConfig = base.isMaxUlTxPowerConfig();
        this._maxfapTxPowerExpandedConfig = base.isMaxfapTxPowerExpandedConfig();
        this._neighborListConfig = base.isNeighborListConfig();
        this._noiseRiseLimitConfig = base.isNoiseRiseLimitConfig();
        this._pcpichPowerConfig = base.isPcpichPowerConfig();
        this._primaryScramblingCodeConfig = base.isPrimaryScramblingCodeConfig();
        this._uarfcnConfig = base.isUarfcnConfig();
        this._ueInternalMeasConfig = base.isUeInternalMeasConfig();
        if (base instanceof CapabilitiesUmtsSelfConfigImpl) {
            CapabilitiesUmtsSelfConfigImpl impl = (CapabilitiesUmtsSelfConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG) {
            this._uarfcnConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG)arg).isUarfcnConfig();
            this._primaryScramblingCodeConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG)arg).isPrimaryScramblingCodeConfig();
            this._maxfapTxPowerExpandedConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG)arg).isMaxfapTxPowerExpandedConfig();
            this._pcpichPowerConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG)arg).isPcpichPowerConfig();
            this._maxUlTxPowerConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG)arg).isMaxUlTxPowerConfig();
            this._lacracuraConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG)arg).isLacracuraConfig();
            this._neighborListConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG)arg).isNeighborListConfig();
            this._cellReSelectionConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG)arg).isCellReSelectionConfig();
            this._intraFreqMeasConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG)arg).isIntraFreqMeasConfig();
            this._interFreqMeasConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG)arg).isInterFreqMeasConfig();
            this._interRatMeasConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG)arg).isInterRatMeasConfig();
            this._ueInternalMeasConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG)arg).isUeInternalMeasConfig();
            this._noiseRiseLimitConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG)arg).isNoiseRiseLimitConfig();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Boolean isCellReSelectionConfig() {
        return _cellReSelectionConfig;
    }
    
    public java.lang.Boolean isInterFreqMeasConfig() {
        return _interFreqMeasConfig;
    }
    
    public java.lang.Boolean isInterRatMeasConfig() {
        return _interRatMeasConfig;
    }
    
    public java.lang.Boolean isIntraFreqMeasConfig() {
        return _intraFreqMeasConfig;
    }
    
    public java.lang.Boolean isLacracuraConfig() {
        return _lacracuraConfig;
    }
    
    public java.lang.Boolean isMaxUlTxPowerConfig() {
        return _maxUlTxPowerConfig;
    }
    
    public java.lang.Boolean isMaxfapTxPowerExpandedConfig() {
        return _maxfapTxPowerExpandedConfig;
    }
    
    public java.lang.Boolean isNeighborListConfig() {
        return _neighborListConfig;
    }
    
    public java.lang.Boolean isNoiseRiseLimitConfig() {
        return _noiseRiseLimitConfig;
    }
    
    public java.lang.Boolean isPcpichPowerConfig() {
        return _pcpichPowerConfig;
    }
    
    public java.lang.Boolean isPrimaryScramblingCodeConfig() {
        return _primaryScramblingCodeConfig;
    }
    
    public java.lang.Boolean isUarfcnConfig() {
        return _uarfcnConfig;
    }
    
    public java.lang.Boolean isUeInternalMeasConfig() {
        return _ueInternalMeasConfig;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CapabilitiesUmtsSelfConfigBuilder setCellReSelectionConfig(final java.lang.Boolean value) {
        this._cellReSelectionConfig = value;
        return this;
    }
    
     
    public CapabilitiesUmtsSelfConfigBuilder setInterFreqMeasConfig(final java.lang.Boolean value) {
        this._interFreqMeasConfig = value;
        return this;
    }
    
     
    public CapabilitiesUmtsSelfConfigBuilder setInterRatMeasConfig(final java.lang.Boolean value) {
        this._interRatMeasConfig = value;
        return this;
    }
    
     
    public CapabilitiesUmtsSelfConfigBuilder setIntraFreqMeasConfig(final java.lang.Boolean value) {
        this._intraFreqMeasConfig = value;
        return this;
    }
    
     
    public CapabilitiesUmtsSelfConfigBuilder setLacracuraConfig(final java.lang.Boolean value) {
        this._lacracuraConfig = value;
        return this;
    }
    
     
    public CapabilitiesUmtsSelfConfigBuilder setMaxUlTxPowerConfig(final java.lang.Boolean value) {
        this._maxUlTxPowerConfig = value;
        return this;
    }
    
     
    public CapabilitiesUmtsSelfConfigBuilder setMaxfapTxPowerExpandedConfig(final java.lang.Boolean value) {
        this._maxfapTxPowerExpandedConfig = value;
        return this;
    }
    
     
    public CapabilitiesUmtsSelfConfigBuilder setNeighborListConfig(final java.lang.Boolean value) {
        this._neighborListConfig = value;
        return this;
    }
    
     
    public CapabilitiesUmtsSelfConfigBuilder setNoiseRiseLimitConfig(final java.lang.Boolean value) {
        this._noiseRiseLimitConfig = value;
        return this;
    }
    
     
    public CapabilitiesUmtsSelfConfigBuilder setPcpichPowerConfig(final java.lang.Boolean value) {
        this._pcpichPowerConfig = value;
        return this;
    }
    
     
    public CapabilitiesUmtsSelfConfigBuilder setPrimaryScramblingCodeConfig(final java.lang.Boolean value) {
        this._primaryScramblingCodeConfig = value;
        return this;
    }
    
     
    public CapabilitiesUmtsSelfConfigBuilder setUarfcnConfig(final java.lang.Boolean value) {
        this._uarfcnConfig = value;
        return this;
    }
    
     
    public CapabilitiesUmtsSelfConfigBuilder setUeInternalMeasConfig(final java.lang.Boolean value) {
        this._ueInternalMeasConfig = value;
        return this;
    }
    
    public CapabilitiesUmtsSelfConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CapabilitiesUmtsSelfConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CapabilitiesUmtsSelfConfig build() {
        return new CapabilitiesUmtsSelfConfigImpl(this);
    }

    private static final class CapabilitiesUmtsSelfConfigImpl implements CapabilitiesUmtsSelfConfig {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig.class;
        }

        private final java.lang.Boolean _cellReSelectionConfig;
        private final java.lang.Boolean _interFreqMeasConfig;
        private final java.lang.Boolean _interRatMeasConfig;
        private final java.lang.Boolean _intraFreqMeasConfig;
        private final java.lang.Boolean _lacracuraConfig;
        private final java.lang.Boolean _maxUlTxPowerConfig;
        private final java.lang.Boolean _maxfapTxPowerExpandedConfig;
        private final java.lang.Boolean _neighborListConfig;
        private final java.lang.Boolean _noiseRiseLimitConfig;
        private final java.lang.Boolean _pcpichPowerConfig;
        private final java.lang.Boolean _primaryScramblingCodeConfig;
        private final java.lang.Boolean _uarfcnConfig;
        private final java.lang.Boolean _ueInternalMeasConfig;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>> augmentation = Collections.emptyMap();

        private CapabilitiesUmtsSelfConfigImpl(CapabilitiesUmtsSelfConfigBuilder base) {
            this._cellReSelectionConfig = base.isCellReSelectionConfig();
            this._interFreqMeasConfig = base.isInterFreqMeasConfig();
            this._interRatMeasConfig = base.isInterRatMeasConfig();
            this._intraFreqMeasConfig = base.isIntraFreqMeasConfig();
            this._lacracuraConfig = base.isLacracuraConfig();
            this._maxUlTxPowerConfig = base.isMaxUlTxPowerConfig();
            this._maxfapTxPowerExpandedConfig = base.isMaxfapTxPowerExpandedConfig();
            this._neighborListConfig = base.isNeighborListConfig();
            this._noiseRiseLimitConfig = base.isNoiseRiseLimitConfig();
            this._pcpichPowerConfig = base.isPcpichPowerConfig();
            this._primaryScramblingCodeConfig = base.isPrimaryScramblingCodeConfig();
            this._uarfcnConfig = base.isUarfcnConfig();
            this._ueInternalMeasConfig = base.isUeInternalMeasConfig();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Boolean isCellReSelectionConfig() {
            return _cellReSelectionConfig;
        }
        
        @Override
        public java.lang.Boolean isInterFreqMeasConfig() {
            return _interFreqMeasConfig;
        }
        
        @Override
        public java.lang.Boolean isInterRatMeasConfig() {
            return _interRatMeasConfig;
        }
        
        @Override
        public java.lang.Boolean isIntraFreqMeasConfig() {
            return _intraFreqMeasConfig;
        }
        
        @Override
        public java.lang.Boolean isLacracuraConfig() {
            return _lacracuraConfig;
        }
        
        @Override
        public java.lang.Boolean isMaxUlTxPowerConfig() {
            return _maxUlTxPowerConfig;
        }
        
        @Override
        public java.lang.Boolean isMaxfapTxPowerExpandedConfig() {
            return _maxfapTxPowerExpandedConfig;
        }
        
        @Override
        public java.lang.Boolean isNeighborListConfig() {
            return _neighborListConfig;
        }
        
        @Override
        public java.lang.Boolean isNoiseRiseLimitConfig() {
            return _noiseRiseLimitConfig;
        }
        
        @Override
        public java.lang.Boolean isPcpichPowerConfig() {
            return _pcpichPowerConfig;
        }
        
        @Override
        public java.lang.Boolean isPrimaryScramblingCodeConfig() {
            return _primaryScramblingCodeConfig;
        }
        
        @Override
        public java.lang.Boolean isUarfcnConfig() {
            return _uarfcnConfig;
        }
        
        @Override
        public java.lang.Boolean isUeInternalMeasConfig() {
            return _ueInternalMeasConfig;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cellReSelectionConfig);
            result = prime * result + Objects.hashCode(_interFreqMeasConfig);
            result = prime * result + Objects.hashCode(_interRatMeasConfig);
            result = prime * result + Objects.hashCode(_intraFreqMeasConfig);
            result = prime * result + Objects.hashCode(_lacracuraConfig);
            result = prime * result + Objects.hashCode(_maxUlTxPowerConfig);
            result = prime * result + Objects.hashCode(_maxfapTxPowerExpandedConfig);
            result = prime * result + Objects.hashCode(_neighborListConfig);
            result = prime * result + Objects.hashCode(_noiseRiseLimitConfig);
            result = prime * result + Objects.hashCode(_pcpichPowerConfig);
            result = prime * result + Objects.hashCode(_primaryScramblingCodeConfig);
            result = prime * result + Objects.hashCode(_uarfcnConfig);
            result = prime * result + Objects.hashCode(_ueInternalMeasConfig);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig)obj;
            if (!Objects.equals(_cellReSelectionConfig, other.isCellReSelectionConfig())) {
                return false;
            }
            if (!Objects.equals(_interFreqMeasConfig, other.isInterFreqMeasConfig())) {
                return false;
            }
            if (!Objects.equals(_interRatMeasConfig, other.isInterRatMeasConfig())) {
                return false;
            }
            if (!Objects.equals(_intraFreqMeasConfig, other.isIntraFreqMeasConfig())) {
                return false;
            }
            if (!Objects.equals(_lacracuraConfig, other.isLacracuraConfig())) {
                return false;
            }
            if (!Objects.equals(_maxUlTxPowerConfig, other.isMaxUlTxPowerConfig())) {
                return false;
            }
            if (!Objects.equals(_maxfapTxPowerExpandedConfig, other.isMaxfapTxPowerExpandedConfig())) {
                return false;
            }
            if (!Objects.equals(_neighborListConfig, other.isNeighborListConfig())) {
                return false;
            }
            if (!Objects.equals(_noiseRiseLimitConfig, other.isNoiseRiseLimitConfig())) {
                return false;
            }
            if (!Objects.equals(_pcpichPowerConfig, other.isPcpichPowerConfig())) {
                return false;
            }
            if (!Objects.equals(_primaryScramblingCodeConfig, other.isPrimaryScramblingCodeConfig())) {
                return false;
            }
            if (!Objects.equals(_uarfcnConfig, other.isUarfcnConfig())) {
                return false;
            }
            if (!Objects.equals(_ueInternalMeasConfig, other.isUeInternalMeasConfig())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CapabilitiesUmtsSelfConfigImpl otherImpl = (CapabilitiesUmtsSelfConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>> e : augmentation.entrySet()) {
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
            java.lang.String name = "CapabilitiesUmtsSelfConfig [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cellReSelectionConfig != null) {
                builder.append("_cellReSelectionConfig=");
                builder.append(_cellReSelectionConfig);
                builder.append(", ");
            }
            if (_interFreqMeasConfig != null) {
                builder.append("_interFreqMeasConfig=");
                builder.append(_interFreqMeasConfig);
                builder.append(", ");
            }
            if (_interRatMeasConfig != null) {
                builder.append("_interRatMeasConfig=");
                builder.append(_interRatMeasConfig);
                builder.append(", ");
            }
            if (_intraFreqMeasConfig != null) {
                builder.append("_intraFreqMeasConfig=");
                builder.append(_intraFreqMeasConfig);
                builder.append(", ");
            }
            if (_lacracuraConfig != null) {
                builder.append("_lacracuraConfig=");
                builder.append(_lacracuraConfig);
                builder.append(", ");
            }
            if (_maxUlTxPowerConfig != null) {
                builder.append("_maxUlTxPowerConfig=");
                builder.append(_maxUlTxPowerConfig);
                builder.append(", ");
            }
            if (_maxfapTxPowerExpandedConfig != null) {
                builder.append("_maxfapTxPowerExpandedConfig=");
                builder.append(_maxfapTxPowerExpandedConfig);
                builder.append(", ");
            }
            if (_neighborListConfig != null) {
                builder.append("_neighborListConfig=");
                builder.append(_neighborListConfig);
                builder.append(", ");
            }
            if (_noiseRiseLimitConfig != null) {
                builder.append("_noiseRiseLimitConfig=");
                builder.append(_noiseRiseLimitConfig);
                builder.append(", ");
            }
            if (_pcpichPowerConfig != null) {
                builder.append("_pcpichPowerConfig=");
                builder.append(_pcpichPowerConfig);
                builder.append(", ");
            }
            if (_primaryScramblingCodeConfig != null) {
                builder.append("_primaryScramblingCodeConfig=");
                builder.append(_primaryScramblingCodeConfig);
                builder.append(", ");
            }
            if (_uarfcnConfig != null) {
                builder.append("_uarfcnConfig=");
                builder.append(_uarfcnConfig);
                builder.append(", ");
            }
            if (_ueInternalMeasConfig != null) {
                builder.append("_ueInternalMeasConfig=");
                builder.append(_ueInternalMeasConfig);
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
