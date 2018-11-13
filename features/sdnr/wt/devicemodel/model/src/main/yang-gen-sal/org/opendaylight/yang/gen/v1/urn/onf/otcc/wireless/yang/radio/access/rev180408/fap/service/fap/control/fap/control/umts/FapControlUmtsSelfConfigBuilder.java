package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig
 *
 */
public class FapControlUmtsSelfConfigBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig> {

    private java.lang.Boolean _cellReSelectionSelfConfigEnable;
    private java.lang.Boolean _interFreqMeasSelfConfigEnable;
    private java.lang.Boolean _interRatMeasSelfConfigEnable;
    private java.lang.Boolean _intraFreqMeasSelfConfigEnable;
    private java.lang.Boolean _lacracuraSelfConfigEnable;
    private java.lang.Boolean _maxUlTxPowerSelfConfigEnable;
    private java.lang.Boolean _maxfapTxPowerExpandedSelfConfigEnable;
    private java.lang.Boolean _neighborListSelfConfigEnable;
    private java.lang.Boolean _noiseRiseLimitConfigEnable;
    private java.lang.Boolean _pcpichPowerSelfConfigEnable;
    private java.lang.Boolean _primaryScramblingCodeSelfConfigEnable;
    private java.lang.Boolean _uarfcnSelfConfigEnable;
    private java.lang.Boolean _ueInternalMeasConfigEnable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>> augmentation = Collections.emptyMap();

    public FapControlUmtsSelfConfigBuilder() {
    }
    public FapControlUmtsSelfConfigBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG arg) {
        this._uarfcnSelfConfigEnable = arg.isUarfcnSelfConfigEnable();
        this._primaryScramblingCodeSelfConfigEnable = arg.isPrimaryScramblingCodeSelfConfigEnable();
        this._maxfapTxPowerExpandedSelfConfigEnable = arg.isMaxfapTxPowerExpandedSelfConfigEnable();
        this._pcpichPowerSelfConfigEnable = arg.isPcpichPowerSelfConfigEnable();
        this._maxUlTxPowerSelfConfigEnable = arg.isMaxUlTxPowerSelfConfigEnable();
        this._lacracuraSelfConfigEnable = arg.isLacracuraSelfConfigEnable();
        this._neighborListSelfConfigEnable = arg.isNeighborListSelfConfigEnable();
        this._cellReSelectionSelfConfigEnable = arg.isCellReSelectionSelfConfigEnable();
        this._intraFreqMeasSelfConfigEnable = arg.isIntraFreqMeasSelfConfigEnable();
        this._interFreqMeasSelfConfigEnable = arg.isInterFreqMeasSelfConfigEnable();
        this._interRatMeasSelfConfigEnable = arg.isInterRatMeasSelfConfigEnable();
        this._ueInternalMeasConfigEnable = arg.isUeInternalMeasConfigEnable();
        this._noiseRiseLimitConfigEnable = arg.isNoiseRiseLimitConfigEnable();
    }

    public FapControlUmtsSelfConfigBuilder(FapControlUmtsSelfConfig base) {
        this._cellReSelectionSelfConfigEnable = base.isCellReSelectionSelfConfigEnable();
        this._interFreqMeasSelfConfigEnable = base.isInterFreqMeasSelfConfigEnable();
        this._interRatMeasSelfConfigEnable = base.isInterRatMeasSelfConfigEnable();
        this._intraFreqMeasSelfConfigEnable = base.isIntraFreqMeasSelfConfigEnable();
        this._lacracuraSelfConfigEnable = base.isLacracuraSelfConfigEnable();
        this._maxUlTxPowerSelfConfigEnable = base.isMaxUlTxPowerSelfConfigEnable();
        this._maxfapTxPowerExpandedSelfConfigEnable = base.isMaxfapTxPowerExpandedSelfConfigEnable();
        this._neighborListSelfConfigEnable = base.isNeighborListSelfConfigEnable();
        this._noiseRiseLimitConfigEnable = base.isNoiseRiseLimitConfigEnable();
        this._pcpichPowerSelfConfigEnable = base.isPcpichPowerSelfConfigEnable();
        this._primaryScramblingCodeSelfConfigEnable = base.isPrimaryScramblingCodeSelfConfigEnable();
        this._uarfcnSelfConfigEnable = base.isUarfcnSelfConfigEnable();
        this._ueInternalMeasConfigEnable = base.isUeInternalMeasConfigEnable();
        if (base instanceof FapControlUmtsSelfConfigImpl) {
            FapControlUmtsSelfConfigImpl impl = (FapControlUmtsSelfConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG) {
            this._uarfcnSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG)arg).isUarfcnSelfConfigEnable();
            this._primaryScramblingCodeSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG)arg).isPrimaryScramblingCodeSelfConfigEnable();
            this._maxfapTxPowerExpandedSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG)arg).isMaxfapTxPowerExpandedSelfConfigEnable();
            this._pcpichPowerSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG)arg).isPcpichPowerSelfConfigEnable();
            this._maxUlTxPowerSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG)arg).isMaxUlTxPowerSelfConfigEnable();
            this._lacracuraSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG)arg).isLacracuraSelfConfigEnable();
            this._neighborListSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG)arg).isNeighborListSelfConfigEnable();
            this._cellReSelectionSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG)arg).isCellReSelectionSelfConfigEnable();
            this._intraFreqMeasSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG)arg).isIntraFreqMeasSelfConfigEnable();
            this._interFreqMeasSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG)arg).isInterFreqMeasSelfConfigEnable();
            this._interRatMeasSelfConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG)arg).isInterRatMeasSelfConfigEnable();
            this._ueInternalMeasConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG)arg).isUeInternalMeasConfigEnable();
            this._noiseRiseLimitConfigEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG)arg).isNoiseRiseLimitConfigEnable();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsSelfConfigG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Boolean isCellReSelectionSelfConfigEnable() {
        return _cellReSelectionSelfConfigEnable;
    }
    
    public java.lang.Boolean isInterFreqMeasSelfConfigEnable() {
        return _interFreqMeasSelfConfigEnable;
    }
    
    public java.lang.Boolean isInterRatMeasSelfConfigEnable() {
        return _interRatMeasSelfConfigEnable;
    }
    
    public java.lang.Boolean isIntraFreqMeasSelfConfigEnable() {
        return _intraFreqMeasSelfConfigEnable;
    }
    
    public java.lang.Boolean isLacracuraSelfConfigEnable() {
        return _lacracuraSelfConfigEnable;
    }
    
    public java.lang.Boolean isMaxUlTxPowerSelfConfigEnable() {
        return _maxUlTxPowerSelfConfigEnable;
    }
    
    public java.lang.Boolean isMaxfapTxPowerExpandedSelfConfigEnable() {
        return _maxfapTxPowerExpandedSelfConfigEnable;
    }
    
    public java.lang.Boolean isNeighborListSelfConfigEnable() {
        return _neighborListSelfConfigEnable;
    }
    
    public java.lang.Boolean isNoiseRiseLimitConfigEnable() {
        return _noiseRiseLimitConfigEnable;
    }
    
    public java.lang.Boolean isPcpichPowerSelfConfigEnable() {
        return _pcpichPowerSelfConfigEnable;
    }
    
    public java.lang.Boolean isPrimaryScramblingCodeSelfConfigEnable() {
        return _primaryScramblingCodeSelfConfigEnable;
    }
    
    public java.lang.Boolean isUarfcnSelfConfigEnable() {
        return _uarfcnSelfConfigEnable;
    }
    
    public java.lang.Boolean isUeInternalMeasConfigEnable() {
        return _ueInternalMeasConfigEnable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FapControlUmtsSelfConfigBuilder setCellReSelectionSelfConfigEnable(final java.lang.Boolean value) {
        this._cellReSelectionSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlUmtsSelfConfigBuilder setInterFreqMeasSelfConfigEnable(final java.lang.Boolean value) {
        this._interFreqMeasSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlUmtsSelfConfigBuilder setInterRatMeasSelfConfigEnable(final java.lang.Boolean value) {
        this._interRatMeasSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlUmtsSelfConfigBuilder setIntraFreqMeasSelfConfigEnable(final java.lang.Boolean value) {
        this._intraFreqMeasSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlUmtsSelfConfigBuilder setLacracuraSelfConfigEnable(final java.lang.Boolean value) {
        this._lacracuraSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlUmtsSelfConfigBuilder setMaxUlTxPowerSelfConfigEnable(final java.lang.Boolean value) {
        this._maxUlTxPowerSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlUmtsSelfConfigBuilder setMaxfapTxPowerExpandedSelfConfigEnable(final java.lang.Boolean value) {
        this._maxfapTxPowerExpandedSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlUmtsSelfConfigBuilder setNeighborListSelfConfigEnable(final java.lang.Boolean value) {
        this._neighborListSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlUmtsSelfConfigBuilder setNoiseRiseLimitConfigEnable(final java.lang.Boolean value) {
        this._noiseRiseLimitConfigEnable = value;
        return this;
    }
    
     
    public FapControlUmtsSelfConfigBuilder setPcpichPowerSelfConfigEnable(final java.lang.Boolean value) {
        this._pcpichPowerSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlUmtsSelfConfigBuilder setPrimaryScramblingCodeSelfConfigEnable(final java.lang.Boolean value) {
        this._primaryScramblingCodeSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlUmtsSelfConfigBuilder setUarfcnSelfConfigEnable(final java.lang.Boolean value) {
        this._uarfcnSelfConfigEnable = value;
        return this;
    }
    
     
    public FapControlUmtsSelfConfigBuilder setUeInternalMeasConfigEnable(final java.lang.Boolean value) {
        this._ueInternalMeasConfigEnable = value;
        return this;
    }
    
    public FapControlUmtsSelfConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlUmtsSelfConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControlUmtsSelfConfig build() {
        return new FapControlUmtsSelfConfigImpl(this);
    }

    private static final class FapControlUmtsSelfConfigImpl implements FapControlUmtsSelfConfig {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig.class;
        }

        private final java.lang.Boolean _cellReSelectionSelfConfigEnable;
        private final java.lang.Boolean _interFreqMeasSelfConfigEnable;
        private final java.lang.Boolean _interRatMeasSelfConfigEnable;
        private final java.lang.Boolean _intraFreqMeasSelfConfigEnable;
        private final java.lang.Boolean _lacracuraSelfConfigEnable;
        private final java.lang.Boolean _maxUlTxPowerSelfConfigEnable;
        private final java.lang.Boolean _maxfapTxPowerExpandedSelfConfigEnable;
        private final java.lang.Boolean _neighborListSelfConfigEnable;
        private final java.lang.Boolean _noiseRiseLimitConfigEnable;
        private final java.lang.Boolean _pcpichPowerSelfConfigEnable;
        private final java.lang.Boolean _primaryScramblingCodeSelfConfigEnable;
        private final java.lang.Boolean _uarfcnSelfConfigEnable;
        private final java.lang.Boolean _ueInternalMeasConfigEnable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>> augmentation = Collections.emptyMap();

        private FapControlUmtsSelfConfigImpl(FapControlUmtsSelfConfigBuilder base) {
            this._cellReSelectionSelfConfigEnable = base.isCellReSelectionSelfConfigEnable();
            this._interFreqMeasSelfConfigEnable = base.isInterFreqMeasSelfConfigEnable();
            this._interRatMeasSelfConfigEnable = base.isInterRatMeasSelfConfigEnable();
            this._intraFreqMeasSelfConfigEnable = base.isIntraFreqMeasSelfConfigEnable();
            this._lacracuraSelfConfigEnable = base.isLacracuraSelfConfigEnable();
            this._maxUlTxPowerSelfConfigEnable = base.isMaxUlTxPowerSelfConfigEnable();
            this._maxfapTxPowerExpandedSelfConfigEnable = base.isMaxfapTxPowerExpandedSelfConfigEnable();
            this._neighborListSelfConfigEnable = base.isNeighborListSelfConfigEnable();
            this._noiseRiseLimitConfigEnable = base.isNoiseRiseLimitConfigEnable();
            this._pcpichPowerSelfConfigEnable = base.isPcpichPowerSelfConfigEnable();
            this._primaryScramblingCodeSelfConfigEnable = base.isPrimaryScramblingCodeSelfConfigEnable();
            this._uarfcnSelfConfigEnable = base.isUarfcnSelfConfigEnable();
            this._ueInternalMeasConfigEnable = base.isUeInternalMeasConfigEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Boolean isCellReSelectionSelfConfigEnable() {
            return _cellReSelectionSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isInterFreqMeasSelfConfigEnable() {
            return _interFreqMeasSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isInterRatMeasSelfConfigEnable() {
            return _interRatMeasSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isIntraFreqMeasSelfConfigEnable() {
            return _intraFreqMeasSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isLacracuraSelfConfigEnable() {
            return _lacracuraSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isMaxUlTxPowerSelfConfigEnable() {
            return _maxUlTxPowerSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isMaxfapTxPowerExpandedSelfConfigEnable() {
            return _maxfapTxPowerExpandedSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isNeighborListSelfConfigEnable() {
            return _neighborListSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isNoiseRiseLimitConfigEnable() {
            return _noiseRiseLimitConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isPcpichPowerSelfConfigEnable() {
            return _pcpichPowerSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isPrimaryScramblingCodeSelfConfigEnable() {
            return _primaryScramblingCodeSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isUarfcnSelfConfigEnable() {
            return _uarfcnSelfConfigEnable;
        }
        
        @Override
        public java.lang.Boolean isUeInternalMeasConfigEnable() {
            return _ueInternalMeasConfigEnable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cellReSelectionSelfConfigEnable);
            result = prime * result + Objects.hashCode(_interFreqMeasSelfConfigEnable);
            result = prime * result + Objects.hashCode(_interRatMeasSelfConfigEnable);
            result = prime * result + Objects.hashCode(_intraFreqMeasSelfConfigEnable);
            result = prime * result + Objects.hashCode(_lacracuraSelfConfigEnable);
            result = prime * result + Objects.hashCode(_maxUlTxPowerSelfConfigEnable);
            result = prime * result + Objects.hashCode(_maxfapTxPowerExpandedSelfConfigEnable);
            result = prime * result + Objects.hashCode(_neighborListSelfConfigEnable);
            result = prime * result + Objects.hashCode(_noiseRiseLimitConfigEnable);
            result = prime * result + Objects.hashCode(_pcpichPowerSelfConfigEnable);
            result = prime * result + Objects.hashCode(_primaryScramblingCodeSelfConfigEnable);
            result = prime * result + Objects.hashCode(_uarfcnSelfConfigEnable);
            result = prime * result + Objects.hashCode(_ueInternalMeasConfigEnable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig)obj;
            if (!Objects.equals(_cellReSelectionSelfConfigEnable, other.isCellReSelectionSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_interFreqMeasSelfConfigEnable, other.isInterFreqMeasSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_interRatMeasSelfConfigEnable, other.isInterRatMeasSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_intraFreqMeasSelfConfigEnable, other.isIntraFreqMeasSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_lacracuraSelfConfigEnable, other.isLacracuraSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_maxUlTxPowerSelfConfigEnable, other.isMaxUlTxPowerSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_maxfapTxPowerExpandedSelfConfigEnable, other.isMaxfapTxPowerExpandedSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_neighborListSelfConfigEnable, other.isNeighborListSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_noiseRiseLimitConfigEnable, other.isNoiseRiseLimitConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_pcpichPowerSelfConfigEnable, other.isPcpichPowerSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_primaryScramblingCodeSelfConfigEnable, other.isPrimaryScramblingCodeSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_uarfcnSelfConfigEnable, other.isUarfcnSelfConfigEnable())) {
                return false;
            }
            if (!Objects.equals(_ueInternalMeasConfigEnable, other.isUeInternalMeasConfigEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FapControlUmtsSelfConfigImpl otherImpl = (FapControlUmtsSelfConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControlUmtsSelfConfig [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cellReSelectionSelfConfigEnable != null) {
                builder.append("_cellReSelectionSelfConfigEnable=");
                builder.append(_cellReSelectionSelfConfigEnable);
                builder.append(", ");
            }
            if (_interFreqMeasSelfConfigEnable != null) {
                builder.append("_interFreqMeasSelfConfigEnable=");
                builder.append(_interFreqMeasSelfConfigEnable);
                builder.append(", ");
            }
            if (_interRatMeasSelfConfigEnable != null) {
                builder.append("_interRatMeasSelfConfigEnable=");
                builder.append(_interRatMeasSelfConfigEnable);
                builder.append(", ");
            }
            if (_intraFreqMeasSelfConfigEnable != null) {
                builder.append("_intraFreqMeasSelfConfigEnable=");
                builder.append(_intraFreqMeasSelfConfigEnable);
                builder.append(", ");
            }
            if (_lacracuraSelfConfigEnable != null) {
                builder.append("_lacracuraSelfConfigEnable=");
                builder.append(_lacracuraSelfConfigEnable);
                builder.append(", ");
            }
            if (_maxUlTxPowerSelfConfigEnable != null) {
                builder.append("_maxUlTxPowerSelfConfigEnable=");
                builder.append(_maxUlTxPowerSelfConfigEnable);
                builder.append(", ");
            }
            if (_maxfapTxPowerExpandedSelfConfigEnable != null) {
                builder.append("_maxfapTxPowerExpandedSelfConfigEnable=");
                builder.append(_maxfapTxPowerExpandedSelfConfigEnable);
                builder.append(", ");
            }
            if (_neighborListSelfConfigEnable != null) {
                builder.append("_neighborListSelfConfigEnable=");
                builder.append(_neighborListSelfConfigEnable);
                builder.append(", ");
            }
            if (_noiseRiseLimitConfigEnable != null) {
                builder.append("_noiseRiseLimitConfigEnable=");
                builder.append(_noiseRiseLimitConfigEnable);
                builder.append(", ");
            }
            if (_pcpichPowerSelfConfigEnable != null) {
                builder.append("_pcpichPowerSelfConfigEnable=");
                builder.append(_pcpichPowerSelfConfigEnable);
                builder.append(", ");
            }
            if (_primaryScramblingCodeSelfConfigEnable != null) {
                builder.append("_primaryScramblingCodeSelfConfigEnable=");
                builder.append(_primaryScramblingCodeSelfConfigEnable);
                builder.append(", ");
            }
            if (_uarfcnSelfConfigEnable != null) {
                builder.append("_uarfcnSelfConfigEnable=");
                builder.append(_uarfcnSelfConfigEnable);
                builder.append(", ");
            }
            if (_ueInternalMeasConfigEnable != null) {
                builder.append("_ueInternalMeasConfigEnable=");
                builder.append(_ueInternalMeasConfigEnable);
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
