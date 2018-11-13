package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG.IntraFrequencyEventIdentity;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG.MeasurementQuantity;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance
 *
 */
public class UmtsRanInterFreqMeasInstanceBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance> {

    private java.lang.String _alias;
    private java.lang.String _eventDescription;
    private java.lang.Short _filterCoefficient;
    private java.lang.Short _hysteresis;
    private IntraFrequencyEventIdentity _intraFrequencyEventIdentity;
    private UmtsRanInterFreqMeasInstanceKey _key;
    private MeasurementQuantity _measurementQuantity;
    private java.lang.Long _thresholdNonUsedFrequency;
    private java.lang.Long _thresholdUsedFrequency;
    private java.lang.Integer _timeToTrigger;
    private java.lang.Short _weightingFactor;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>> augmentation = Collections.emptyMap();

    public UmtsRanInterFreqMeasInstanceBuilder() {
    }
    public UmtsRanInterFreqMeasInstanceBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._intraFrequencyEventIdentity = arg.getIntraFrequencyEventIdentity();
        this._eventDescription = arg.getEventDescription();
        this._measurementQuantity = arg.getMeasurementQuantity();
        this._filterCoefficient = arg.getFilterCoefficient();
        this._weightingFactor = arg.getWeightingFactor();
        this._hysteresis = arg.getHysteresis();
        this._timeToTrigger = arg.getTimeToTrigger();
        this._thresholdUsedFrequency = arg.getThresholdUsedFrequency();
        this._thresholdNonUsedFrequency = arg.getThresholdNonUsedFrequency();
    }

    public UmtsRanInterFreqMeasInstanceBuilder(UmtsRanInterFreqMeasInstance base) {
        if (base.getKey() == null) {
            this._key = new UmtsRanInterFreqMeasInstanceKey(
                base.getIntraFrequencyEventIdentity()
            );
            this._intraFrequencyEventIdentity = base.getIntraFrequencyEventIdentity();
        } else {
            this._key = base.getKey();
            this._intraFrequencyEventIdentity = _key.getIntraFrequencyEventIdentity();
        }
        this._alias = base.getAlias();
        this._eventDescription = base.getEventDescription();
        this._filterCoefficient = base.getFilterCoefficient();
        this._hysteresis = base.getHysteresis();
        this._measurementQuantity = base.getMeasurementQuantity();
        this._thresholdNonUsedFrequency = base.getThresholdNonUsedFrequency();
        this._thresholdUsedFrequency = base.getThresholdUsedFrequency();
        this._timeToTrigger = base.getTimeToTrigger();
        this._weightingFactor = base.getWeightingFactor();
        this._enable = base.isEnable();
        if (base instanceof UmtsRanInterFreqMeasInstanceImpl) {
            UmtsRanInterFreqMeasInstanceImpl impl = (UmtsRanInterFreqMeasInstanceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG)arg).getAlias();
            this._intraFrequencyEventIdentity = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG)arg).getIntraFrequencyEventIdentity();
            this._eventDescription = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG)arg).getEventDescription();
            this._measurementQuantity = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG)arg).getMeasurementQuantity();
            this._filterCoefficient = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG)arg).getFilterCoefficient();
            this._weightingFactor = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG)arg).getWeightingFactor();
            this._hysteresis = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG)arg).getHysteresis();
            this._timeToTrigger = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG)arg).getTimeToTrigger();
            this._thresholdUsedFrequency = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG)arg).getThresholdUsedFrequency();
            this._thresholdNonUsedFrequency = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG)arg).getThresholdNonUsedFrequency();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasInstanceG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public java.lang.String getEventDescription() {
        return _eventDescription;
    }
    
    public java.lang.Short getFilterCoefficient() {
        return _filterCoefficient;
    }
    
    public java.lang.Short getHysteresis() {
        return _hysteresis;
    }
    
    public IntraFrequencyEventIdentity getIntraFrequencyEventIdentity() {
        return _intraFrequencyEventIdentity;
    }
    
    public UmtsRanInterFreqMeasInstanceKey getKey() {
        return _key;
    }
    
    public MeasurementQuantity getMeasurementQuantity() {
        return _measurementQuantity;
    }
    
    public java.lang.Long getThresholdNonUsedFrequency() {
        return _thresholdNonUsedFrequency;
    }
    
    public java.lang.Long getThresholdUsedFrequency() {
        return _thresholdUsedFrequency;
    }
    
    public java.lang.Integer getTimeToTrigger() {
        return _timeToTrigger;
    }
    
    public java.lang.Short getWeightingFactor() {
        return _weightingFactor;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void check_aliasLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..64]].", value));
     }
    
    public UmtsRanInterFreqMeasInstanceBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
     private static void check_eventDescriptionLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public UmtsRanInterFreqMeasInstanceBuilder setEventDescription(final java.lang.String value) {
    if (value != null) {
        check_eventDescriptionLength(value);
    }
        this._eventDescription = value;
        return this;
    }
    
     
     private static void checkFilterCoefficientRange(final short value) {
         if (value >= (short)0 && value <= (short)9) {
             return;
         }
         if (value >= (short)11 && value <= (short)11) {
             return;
         }
         if (value >= (short)13 && value <= (short)13) {
             return;
         }
         if (value >= (short)15 && value <= (short)15) {
             return;
         }
         if (value >= (short)17 && value <= (short)17) {
             return;
         }
         if (value >= (short)19 && value <= (short)19) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..9], [11..11], [13..13], [15..15], [17..17], [19..19]].", value));
     }
    
    public UmtsRanInterFreqMeasInstanceBuilder setFilterCoefficient(final java.lang.Short value) {
    if (value != null) {
        checkFilterCoefficientRange(value);
    }
        this._filterCoefficient = value;
        return this;
    }
    
     
     private static void checkHysteresisRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public UmtsRanInterFreqMeasInstanceBuilder setHysteresis(final java.lang.Short value) {
    if (value != null) {
        checkHysteresisRange(value);
    }
        this._hysteresis = value;
        return this;
    }
    
     
    public UmtsRanInterFreqMeasInstanceBuilder setIntraFrequencyEventIdentity(final IntraFrequencyEventIdentity value) {
        this._intraFrequencyEventIdentity = value;
        return this;
    }
    
     
    public UmtsRanInterFreqMeasInstanceBuilder setKey(final UmtsRanInterFreqMeasInstanceKey value) {
        this._key = value;
        return this;
    }
    
     
    public UmtsRanInterFreqMeasInstanceBuilder setMeasurementQuantity(final MeasurementQuantity value) {
        this._measurementQuantity = value;
        return this;
    }
    
     
    public UmtsRanInterFreqMeasInstanceBuilder setThresholdNonUsedFrequency(final java.lang.Long value) {
        this._thresholdNonUsedFrequency = value;
        return this;
    }
    
     
    public UmtsRanInterFreqMeasInstanceBuilder setThresholdUsedFrequency(final java.lang.Long value) {
        this._thresholdUsedFrequency = value;
        return this;
    }
    
     
     private static void checkTimeToTriggerRange(final int value) {
         if (value >= 0 && value <= 0) {
             return;
         }
         if (value >= 10 && value <= 10) {
             return;
         }
         if (value >= 20 && value <= 20) {
             return;
         }
         if (value >= 40 && value <= 40) {
             return;
         }
         if (value >= 60 && value <= 60) {
             return;
         }
         if (value >= 80 && value <= 80) {
             return;
         }
         if (value >= 100 && value <= 100) {
             return;
         }
         if (value >= 120 && value <= 120) {
             return;
         }
         if (value >= 160 && value <= 160) {
             return;
         }
         if (value >= 200 && value <= 200) {
             return;
         }
         if (value >= 240 && value <= 240) {
             return;
         }
         if (value >= 320 && value <= 320) {
             return;
         }
         if (value >= 640 && value <= 640) {
             return;
         }
         if (value >= 1280 && value <= 1280) {
             return;
         }
         if (value >= 2560 && value <= 2560) {
             return;
         }
         if (value >= 5000 && value <= 5000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..0], [10..10], [20..20], [40..40], [60..60], [80..80], [100..100], [120..120], [160..160], [200..200], [240..240], [320..320], [640..640], [1280..1280], [2560..2560], [5000..5000]].", value));
     }
    
    public UmtsRanInterFreqMeasInstanceBuilder setTimeToTrigger(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerRange(value);
    }
        this._timeToTrigger = value;
        return this;
    }
    
     
     private static void checkWeightingFactorRange(final short value) {
         if (value >= (short)0 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..20]].", value));
     }
    
    public UmtsRanInterFreqMeasInstanceBuilder setWeightingFactor(final java.lang.Short value) {
    if (value != null) {
        checkWeightingFactorRange(value);
    }
        this._weightingFactor = value;
        return this;
    }
    
     
    public UmtsRanInterFreqMeasInstanceBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public UmtsRanInterFreqMeasInstanceBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanInterFreqMeasInstanceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanInterFreqMeasInstance build() {
        return new UmtsRanInterFreqMeasInstanceImpl(this);
    }

    private static final class UmtsRanInterFreqMeasInstanceImpl implements UmtsRanInterFreqMeasInstance {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance.class;
        }

        private final java.lang.String _alias;
        private final java.lang.String _eventDescription;
        private final java.lang.Short _filterCoefficient;
        private final java.lang.Short _hysteresis;
        private final IntraFrequencyEventIdentity _intraFrequencyEventIdentity;
        private final UmtsRanInterFreqMeasInstanceKey _key;
        private final MeasurementQuantity _measurementQuantity;
        private final java.lang.Long _thresholdNonUsedFrequency;
        private final java.lang.Long _thresholdUsedFrequency;
        private final java.lang.Integer _timeToTrigger;
        private final java.lang.Short _weightingFactor;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>> augmentation = Collections.emptyMap();

        private UmtsRanInterFreqMeasInstanceImpl(UmtsRanInterFreqMeasInstanceBuilder base) {
            if (base.getKey() == null) {
                this._key = new UmtsRanInterFreqMeasInstanceKey(
                    base.getIntraFrequencyEventIdentity()
                );
                this._intraFrequencyEventIdentity = base.getIntraFrequencyEventIdentity();
            } else {
                this._key = base.getKey();
                this._intraFrequencyEventIdentity = _key.getIntraFrequencyEventIdentity();
            }
            this._alias = base.getAlias();
            this._eventDescription = base.getEventDescription();
            this._filterCoefficient = base.getFilterCoefficient();
            this._hysteresis = base.getHysteresis();
            this._measurementQuantity = base.getMeasurementQuantity();
            this._thresholdNonUsedFrequency = base.getThresholdNonUsedFrequency();
            this._thresholdUsedFrequency = base.getThresholdUsedFrequency();
            this._timeToTrigger = base.getTimeToTrigger();
            this._weightingFactor = base.getWeightingFactor();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getAlias() {
            return _alias;
        }
        
        @Override
        public java.lang.String getEventDescription() {
            return _eventDescription;
        }
        
        @Override
        public java.lang.Short getFilterCoefficient() {
            return _filterCoefficient;
        }
        
        @Override
        public java.lang.Short getHysteresis() {
            return _hysteresis;
        }
        
        @Override
        public IntraFrequencyEventIdentity getIntraFrequencyEventIdentity() {
            return _intraFrequencyEventIdentity;
        }
        
        @Override
        public UmtsRanInterFreqMeasInstanceKey getKey() {
            return _key;
        }
        
        @Override
        public MeasurementQuantity getMeasurementQuantity() {
            return _measurementQuantity;
        }
        
        @Override
        public java.lang.Long getThresholdNonUsedFrequency() {
            return _thresholdNonUsedFrequency;
        }
        
        @Override
        public java.lang.Long getThresholdUsedFrequency() {
            return _thresholdUsedFrequency;
        }
        
        @Override
        public java.lang.Integer getTimeToTrigger() {
            return _timeToTrigger;
        }
        
        @Override
        public java.lang.Short getWeightingFactor() {
            return _weightingFactor;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_alias);
            result = prime * result + Objects.hashCode(_eventDescription);
            result = prime * result + Objects.hashCode(_filterCoefficient);
            result = prime * result + Objects.hashCode(_hysteresis);
            result = prime * result + Objects.hashCode(_intraFrequencyEventIdentity);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_measurementQuantity);
            result = prime * result + Objects.hashCode(_thresholdNonUsedFrequency);
            result = prime * result + Objects.hashCode(_thresholdUsedFrequency);
            result = prime * result + Objects.hashCode(_timeToTrigger);
            result = prime * result + Objects.hashCode(_weightingFactor);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_eventDescription, other.getEventDescription())) {
                return false;
            }
            if (!Objects.equals(_filterCoefficient, other.getFilterCoefficient())) {
                return false;
            }
            if (!Objects.equals(_hysteresis, other.getHysteresis())) {
                return false;
            }
            if (!Objects.equals(_intraFrequencyEventIdentity, other.getIntraFrequencyEventIdentity())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_measurementQuantity, other.getMeasurementQuantity())) {
                return false;
            }
            if (!Objects.equals(_thresholdNonUsedFrequency, other.getThresholdNonUsedFrequency())) {
                return false;
            }
            if (!Objects.equals(_thresholdUsedFrequency, other.getThresholdUsedFrequency())) {
                return false;
            }
            if (!Objects.equals(_timeToTrigger, other.getTimeToTrigger())) {
                return false;
            }
            if (!Objects.equals(_weightingFactor, other.getWeightingFactor())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanInterFreqMeasInstanceImpl otherImpl = (UmtsRanInterFreqMeasInstanceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanInterFreqMeasInstance [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_eventDescription != null) {
                builder.append("_eventDescription=");
                builder.append(_eventDescription);
                builder.append(", ");
            }
            if (_filterCoefficient != null) {
                builder.append("_filterCoefficient=");
                builder.append(_filterCoefficient);
                builder.append(", ");
            }
            if (_hysteresis != null) {
                builder.append("_hysteresis=");
                builder.append(_hysteresis);
                builder.append(", ");
            }
            if (_intraFrequencyEventIdentity != null) {
                builder.append("_intraFrequencyEventIdentity=");
                builder.append(_intraFrequencyEventIdentity);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_measurementQuantity != null) {
                builder.append("_measurementQuantity=");
                builder.append(_measurementQuantity);
                builder.append(", ");
            }
            if (_thresholdNonUsedFrequency != null) {
                builder.append("_thresholdNonUsedFrequency=");
                builder.append(_thresholdNonUsedFrequency);
                builder.append(", ");
            }
            if (_thresholdUsedFrequency != null) {
                builder.append("_thresholdUsedFrequency=");
                builder.append(_thresholdUsedFrequency);
                builder.append(", ");
            }
            if (_timeToTrigger != null) {
                builder.append("_timeToTrigger=");
                builder.append(_timeToTrigger);
                builder.append(", ");
            }
            if (_weightingFactor != null) {
                builder.append("_weightingFactor=");
                builder.append(_weightingFactor);
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
