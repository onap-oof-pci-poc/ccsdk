package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach
 *
 */
public class LteRanPhyPrachBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach> {

    private List<java.lang.String> _configurationIndex;
    private List<java.lang.String> _freqOffset;
    private List<java.lang.String> _rootSequenceIndex;
    private List<java.lang.String> _zeroCorrelationZoneConfig;
    private java.lang.Boolean _highSpeedFlag;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>> augmentation = Collections.emptyMap();

    public LteRanPhyPrachBuilder() {
    }
    public LteRanPhyPrachBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrachG arg) {
        this._rootSequenceIndex = arg.getRootSequenceIndex();
        this._configurationIndex = arg.getConfigurationIndex();
        this._highSpeedFlag = arg.isHighSpeedFlag();
        this._zeroCorrelationZoneConfig = arg.getZeroCorrelationZoneConfig();
        this._freqOffset = arg.getFreqOffset();
    }

    public LteRanPhyPrachBuilder(LteRanPhyPrach base) {
        this._configurationIndex = base.getConfigurationIndex();
        this._freqOffset = base.getFreqOffset();
        this._rootSequenceIndex = base.getRootSequenceIndex();
        this._zeroCorrelationZoneConfig = base.getZeroCorrelationZoneConfig();
        this._highSpeedFlag = base.isHighSpeedFlag();
        if (base instanceof LteRanPhyPrachImpl) {
            LteRanPhyPrachImpl impl = (LteRanPhyPrachImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrachG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrachG) {
            this._rootSequenceIndex = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrachG)arg).getRootSequenceIndex();
            this._configurationIndex = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrachG)arg).getConfigurationIndex();
            this._highSpeedFlag = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrachG)arg).isHighSpeedFlag();
            this._zeroCorrelationZoneConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrachG)arg).getZeroCorrelationZoneConfig();
            this._freqOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrachG)arg).getFreqOffset();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrachG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.String> getConfigurationIndex() {
        return _configurationIndex;
    }
    
    public List<java.lang.String> getFreqOffset() {
        return _freqOffset;
    }
    
    public List<java.lang.String> getRootSequenceIndex() {
        return _rootSequenceIndex;
    }
    
    public List<java.lang.String> getZeroCorrelationZoneConfig() {
        return _zeroCorrelationZoneConfig;
    }
    
    public java.lang.Boolean isHighSpeedFlag() {
        return _highSpeedFlag;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanPhyPrachBuilder setConfigurationIndex(final List<java.lang.String> value) {
        this._configurationIndex = value;
        return this;
    }
    
     
    public LteRanPhyPrachBuilder setFreqOffset(final List<java.lang.String> value) {
        this._freqOffset = value;
        return this;
    }
    
     
    public LteRanPhyPrachBuilder setRootSequenceIndex(final List<java.lang.String> value) {
        this._rootSequenceIndex = value;
        return this;
    }
    
     
    public LteRanPhyPrachBuilder setZeroCorrelationZoneConfig(final List<java.lang.String> value) {
        this._zeroCorrelationZoneConfig = value;
        return this;
    }
    
     
    public LteRanPhyPrachBuilder setHighSpeedFlag(final java.lang.Boolean value) {
        this._highSpeedFlag = value;
        return this;
    }
    
    public LteRanPhyPrachBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanPhyPrachBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanPhyPrach build() {
        return new LteRanPhyPrachImpl(this);
    }

    private static final class LteRanPhyPrachImpl implements LteRanPhyPrach {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach.class;
        }

        private final List<java.lang.String> _configurationIndex;
        private final List<java.lang.String> _freqOffset;
        private final List<java.lang.String> _rootSequenceIndex;
        private final List<java.lang.String> _zeroCorrelationZoneConfig;
        private final java.lang.Boolean _highSpeedFlag;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>> augmentation = Collections.emptyMap();

        private LteRanPhyPrachImpl(LteRanPhyPrachBuilder base) {
            this._configurationIndex = base.getConfigurationIndex();
            this._freqOffset = base.getFreqOffset();
            this._rootSequenceIndex = base.getRootSequenceIndex();
            this._zeroCorrelationZoneConfig = base.getZeroCorrelationZoneConfig();
            this._highSpeedFlag = base.isHighSpeedFlag();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.String> getConfigurationIndex() {
            return _configurationIndex;
        }
        
        @Override
        public List<java.lang.String> getFreqOffset() {
            return _freqOffset;
        }
        
        @Override
        public List<java.lang.String> getRootSequenceIndex() {
            return _rootSequenceIndex;
        }
        
        @Override
        public List<java.lang.String> getZeroCorrelationZoneConfig() {
            return _zeroCorrelationZoneConfig;
        }
        
        @Override
        public java.lang.Boolean isHighSpeedFlag() {
            return _highSpeedFlag;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_configurationIndex);
            result = prime * result + Objects.hashCode(_freqOffset);
            result = prime * result + Objects.hashCode(_rootSequenceIndex);
            result = prime * result + Objects.hashCode(_zeroCorrelationZoneConfig);
            result = prime * result + Objects.hashCode(_highSpeedFlag);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach)obj;
            if (!Objects.equals(_configurationIndex, other.getConfigurationIndex())) {
                return false;
            }
            if (!Objects.equals(_freqOffset, other.getFreqOffset())) {
                return false;
            }
            if (!Objects.equals(_rootSequenceIndex, other.getRootSequenceIndex())) {
                return false;
            }
            if (!Objects.equals(_zeroCorrelationZoneConfig, other.getZeroCorrelationZoneConfig())) {
                return false;
            }
            if (!Objects.equals(_highSpeedFlag, other.isHighSpeedFlag())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanPhyPrachImpl otherImpl = (LteRanPhyPrachImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanPhyPrach [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_configurationIndex != null) {
                builder.append("_configurationIndex=");
                builder.append(_configurationIndex);
                builder.append(", ");
            }
            if (_freqOffset != null) {
                builder.append("_freqOffset=");
                builder.append(_freqOffset);
                builder.append(", ");
            }
            if (_rootSequenceIndex != null) {
                builder.append("_rootSequenceIndex=");
                builder.append(_rootSequenceIndex);
                builder.append(", ");
            }
            if (_zeroCorrelationZoneConfig != null) {
                builder.append("_zeroCorrelationZoneConfig=");
                builder.append(_zeroCorrelationZoneConfig);
                builder.append(", ");
            }
            if (_highSpeedFlag != null) {
                builder.append("_highSpeedFlag=");
                builder.append(_highSpeedFlag);
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
