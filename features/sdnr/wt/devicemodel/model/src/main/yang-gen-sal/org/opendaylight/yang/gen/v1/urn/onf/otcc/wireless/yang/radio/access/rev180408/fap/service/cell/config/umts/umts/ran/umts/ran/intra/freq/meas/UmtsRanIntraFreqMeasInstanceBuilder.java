package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG.IntraFrequencyEventIdentity;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG.TriggeringCondition;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG.MeasurementQuantity;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance
 *
 */
public class UmtsRanIntraFreqMeasInstanceBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance> {

    private java.lang.String _alias;
    private java.lang.String _eventDescription;
    private java.lang.Short _filterCoefficient;
    private java.lang.Short _hysteresis;
    private IntraFrequencyEventIdentity _intraFrequencyEventIdentity;
    private UmtsRanIntraFreqMeasInstanceKey _key;
    private MeasurementQuantity _measurementQuantity;
    private java.lang.Short _replacementActivationThreshold;
    private java.lang.Short _reportDeactivationThreshold;
    private java.lang.Long _reportingAmount;
    private java.lang.Integer _reportingInterval;
    private java.lang.Short _reportingRange;
    private java.lang.Long _thresholdUsedFrequency;
    private java.lang.Integer _timeToTrigger;
    private List<TriggeringCondition> _triggeringCondition;
    private java.lang.Short _weightingFactor;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>> augmentation = Collections.emptyMap();

    public UmtsRanIntraFreqMeasInstanceBuilder() {
    }
    public UmtsRanIntraFreqMeasInstanceBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._intraFrequencyEventIdentity = arg.getIntraFrequencyEventIdentity();
        this._eventDescription = arg.getEventDescription();
        this._measurementQuantity = arg.getMeasurementQuantity();
        this._filterCoefficient = arg.getFilterCoefficient();
        this._triggeringCondition = arg.getTriggeringCondition();
        this._reportingRange = arg.getReportingRange();
        this._weightingFactor = arg.getWeightingFactor();
        this._reportDeactivationThreshold = arg.getReportDeactivationThreshold();
        this._reportingAmount = arg.getReportingAmount();
        this._reportingInterval = arg.getReportingInterval();
        this._hysteresis = arg.getHysteresis();
        this._timeToTrigger = arg.getTimeToTrigger();
        this._thresholdUsedFrequency = arg.getThresholdUsedFrequency();
        this._replacementActivationThreshold = arg.getReplacementActivationThreshold();
    }

    public UmtsRanIntraFreqMeasInstanceBuilder(UmtsRanIntraFreqMeasInstance base) {
        if (base.getKey() == null) {
            this._key = new UmtsRanIntraFreqMeasInstanceKey(
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
        this._replacementActivationThreshold = base.getReplacementActivationThreshold();
        this._reportDeactivationThreshold = base.getReportDeactivationThreshold();
        this._reportingAmount = base.getReportingAmount();
        this._reportingInterval = base.getReportingInterval();
        this._reportingRange = base.getReportingRange();
        this._thresholdUsedFrequency = base.getThresholdUsedFrequency();
        this._timeToTrigger = base.getTimeToTrigger();
        this._triggeringCondition = base.getTriggeringCondition();
        this._weightingFactor = base.getWeightingFactor();
        this._enable = base.isEnable();
        if (base instanceof UmtsRanIntraFreqMeasInstanceImpl) {
            UmtsRanIntraFreqMeasInstanceImpl impl = (UmtsRanIntraFreqMeasInstanceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getAlias();
            this._intraFrequencyEventIdentity = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getIntraFrequencyEventIdentity();
            this._eventDescription = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getEventDescription();
            this._measurementQuantity = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getMeasurementQuantity();
            this._filterCoefficient = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getFilterCoefficient();
            this._triggeringCondition = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getTriggeringCondition();
            this._reportingRange = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getReportingRange();
            this._weightingFactor = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getWeightingFactor();
            this._reportDeactivationThreshold = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getReportDeactivationThreshold();
            this._reportingAmount = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getReportingAmount();
            this._reportingInterval = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getReportingInterval();
            this._hysteresis = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getHysteresis();
            this._timeToTrigger = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getTimeToTrigger();
            this._thresholdUsedFrequency = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getThresholdUsedFrequency();
            this._replacementActivationThreshold = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG)arg).getReplacementActivationThreshold();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasInstanceG] \n" +
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
    
    public UmtsRanIntraFreqMeasInstanceKey getKey() {
        return _key;
    }
    
    public MeasurementQuantity getMeasurementQuantity() {
        return _measurementQuantity;
    }
    
    public java.lang.Short getReplacementActivationThreshold() {
        return _replacementActivationThreshold;
    }
    
    public java.lang.Short getReportDeactivationThreshold() {
        return _reportDeactivationThreshold;
    }
    
    public java.lang.Long getReportingAmount() {
        return _reportingAmount;
    }
    
    public java.lang.Integer getReportingInterval() {
        return _reportingInterval;
    }
    
    public java.lang.Short getReportingRange() {
        return _reportingRange;
    }
    
    public java.lang.Long getThresholdUsedFrequency() {
        return _thresholdUsedFrequency;
    }
    
    public java.lang.Integer getTimeToTrigger() {
        return _timeToTrigger;
    }
    
    public List<TriggeringCondition> getTriggeringCondition() {
        return _triggeringCondition;
    }
    
    public java.lang.Short getWeightingFactor() {
        return _weightingFactor;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public UmtsRanIntraFreqMeasInstanceBuilder setAlias(final java.lang.String value) {
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
    
    public UmtsRanIntraFreqMeasInstanceBuilder setEventDescription(final java.lang.String value) {
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
    
    public UmtsRanIntraFreqMeasInstanceBuilder setFilterCoefficient(final java.lang.Short value) {
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
    
    public UmtsRanIntraFreqMeasInstanceBuilder setHysteresis(final java.lang.Short value) {
    if (value != null) {
        checkHysteresisRange(value);
    }
        this._hysteresis = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasInstanceBuilder setIntraFrequencyEventIdentity(final IntraFrequencyEventIdentity value) {
        this._intraFrequencyEventIdentity = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasInstanceBuilder setKey(final UmtsRanIntraFreqMeasInstanceKey value) {
        this._key = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasInstanceBuilder setMeasurementQuantity(final MeasurementQuantity value) {
        this._measurementQuantity = value;
        return this;
    }
    
     
     private static void checkReplacementActivationThresholdRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public UmtsRanIntraFreqMeasInstanceBuilder setReplacementActivationThreshold(final java.lang.Short value) {
    if (value != null) {
        checkReplacementActivationThresholdRange(value);
    }
        this._replacementActivationThreshold = value;
        return this;
    }
    
     
     private static void checkReportDeactivationThresholdRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public UmtsRanIntraFreqMeasInstanceBuilder setReportDeactivationThreshold(final java.lang.Short value) {
    if (value != null) {
        checkReportDeactivationThresholdRange(value);
    }
        this._reportDeactivationThreshold = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasInstanceBuilder setReportingAmount(final java.lang.Long value) {
        this._reportingAmount = value;
        return this;
    }
    
     
     private static void checkReportingIntervalRange(final int value) {
         if (value >= 0 && value <= 0) {
             return;
         }
         if (value >= 250 && value <= 250) {
             return;
         }
         if (value >= 500 && value <= 500) {
             return;
         }
         if (value >= 1000 && value <= 1000) {
             return;
         }
         if (value >= 2000 && value <= 2000) {
             return;
         }
         if (value >= 4000 && value <= 4000) {
             return;
         }
         if (value >= 8000 && value <= 8000) {
             return;
         }
         if (value >= 16000 && value <= 16000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..0], [250..250], [500..500], [1000..1000], [2000..2000], [4000..4000], [8000..8000], [16000..16000]].", value));
     }
    
    public UmtsRanIntraFreqMeasInstanceBuilder setReportingInterval(final java.lang.Integer value) {
    if (value != null) {
        checkReportingIntervalRange(value);
    }
        this._reportingInterval = value;
        return this;
    }
    
     
     private static void checkReportingRangeRange(final short value) {
         if (value >= (short)0 && value <= (short)29) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..29]].", value));
     }
    
    public UmtsRanIntraFreqMeasInstanceBuilder setReportingRange(final java.lang.Short value) {
    if (value != null) {
        checkReportingRangeRange(value);
    }
        this._reportingRange = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasInstanceBuilder setThresholdUsedFrequency(final java.lang.Long value) {
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
    
    public UmtsRanIntraFreqMeasInstanceBuilder setTimeToTrigger(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerRange(value);
    }
        this._timeToTrigger = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasInstanceBuilder setTriggeringCondition(final List<TriggeringCondition> value) {
        this._triggeringCondition = value;
        return this;
    }
    
     
     private static void checkWeightingFactorRange(final short value) {
         if (value >= (short)0 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..20]].", value));
     }
    
    public UmtsRanIntraFreqMeasInstanceBuilder setWeightingFactor(final java.lang.Short value) {
    if (value != null) {
        checkWeightingFactorRange(value);
    }
        this._weightingFactor = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasInstanceBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public UmtsRanIntraFreqMeasInstanceBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanIntraFreqMeasInstanceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanIntraFreqMeasInstance build() {
        return new UmtsRanIntraFreqMeasInstanceImpl(this);
    }

    private static final class UmtsRanIntraFreqMeasInstanceImpl implements UmtsRanIntraFreqMeasInstance {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance.class;
        }

        private final java.lang.String _alias;
        private final java.lang.String _eventDescription;
        private final java.lang.Short _filterCoefficient;
        private final java.lang.Short _hysteresis;
        private final IntraFrequencyEventIdentity _intraFrequencyEventIdentity;
        private final UmtsRanIntraFreqMeasInstanceKey _key;
        private final MeasurementQuantity _measurementQuantity;
        private final java.lang.Short _replacementActivationThreshold;
        private final java.lang.Short _reportDeactivationThreshold;
        private final java.lang.Long _reportingAmount;
        private final java.lang.Integer _reportingInterval;
        private final java.lang.Short _reportingRange;
        private final java.lang.Long _thresholdUsedFrequency;
        private final java.lang.Integer _timeToTrigger;
        private final List<TriggeringCondition> _triggeringCondition;
        private final java.lang.Short _weightingFactor;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>> augmentation = Collections.emptyMap();

        private UmtsRanIntraFreqMeasInstanceImpl(UmtsRanIntraFreqMeasInstanceBuilder base) {
            if (base.getKey() == null) {
                this._key = new UmtsRanIntraFreqMeasInstanceKey(
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
            this._replacementActivationThreshold = base.getReplacementActivationThreshold();
            this._reportDeactivationThreshold = base.getReportDeactivationThreshold();
            this._reportingAmount = base.getReportingAmount();
            this._reportingInterval = base.getReportingInterval();
            this._reportingRange = base.getReportingRange();
            this._thresholdUsedFrequency = base.getThresholdUsedFrequency();
            this._timeToTrigger = base.getTimeToTrigger();
            this._triggeringCondition = base.getTriggeringCondition();
            this._weightingFactor = base.getWeightingFactor();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>>singletonMap(e.getKey(), e.getValue());
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
        public UmtsRanIntraFreqMeasInstanceKey getKey() {
            return _key;
        }
        
        @Override
        public MeasurementQuantity getMeasurementQuantity() {
            return _measurementQuantity;
        }
        
        @Override
        public java.lang.Short getReplacementActivationThreshold() {
            return _replacementActivationThreshold;
        }
        
        @Override
        public java.lang.Short getReportDeactivationThreshold() {
            return _reportDeactivationThreshold;
        }
        
        @Override
        public java.lang.Long getReportingAmount() {
            return _reportingAmount;
        }
        
        @Override
        public java.lang.Integer getReportingInterval() {
            return _reportingInterval;
        }
        
        @Override
        public java.lang.Short getReportingRange() {
            return _reportingRange;
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
        public List<TriggeringCondition> getTriggeringCondition() {
            return _triggeringCondition;
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_replacementActivationThreshold);
            result = prime * result + Objects.hashCode(_reportDeactivationThreshold);
            result = prime * result + Objects.hashCode(_reportingAmount);
            result = prime * result + Objects.hashCode(_reportingInterval);
            result = prime * result + Objects.hashCode(_reportingRange);
            result = prime * result + Objects.hashCode(_thresholdUsedFrequency);
            result = prime * result + Objects.hashCode(_timeToTrigger);
            result = prime * result + Objects.hashCode(_triggeringCondition);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance)obj;
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
            if (!Objects.equals(_replacementActivationThreshold, other.getReplacementActivationThreshold())) {
                return false;
            }
            if (!Objects.equals(_reportDeactivationThreshold, other.getReportDeactivationThreshold())) {
                return false;
            }
            if (!Objects.equals(_reportingAmount, other.getReportingAmount())) {
                return false;
            }
            if (!Objects.equals(_reportingInterval, other.getReportingInterval())) {
                return false;
            }
            if (!Objects.equals(_reportingRange, other.getReportingRange())) {
                return false;
            }
            if (!Objects.equals(_thresholdUsedFrequency, other.getThresholdUsedFrequency())) {
                return false;
            }
            if (!Objects.equals(_timeToTrigger, other.getTimeToTrigger())) {
                return false;
            }
            if (!Objects.equals(_triggeringCondition, other.getTriggeringCondition())) {
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
                UmtsRanIntraFreqMeasInstanceImpl otherImpl = (UmtsRanIntraFreqMeasInstanceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanIntraFreqMeasInstance [";
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
            if (_replacementActivationThreshold != null) {
                builder.append("_replacementActivationThreshold=");
                builder.append(_replacementActivationThreshold);
                builder.append(", ");
            }
            if (_reportDeactivationThreshold != null) {
                builder.append("_reportDeactivationThreshold=");
                builder.append(_reportDeactivationThreshold);
                builder.append(", ");
            }
            if (_reportingAmount != null) {
                builder.append("_reportingAmount=");
                builder.append(_reportingAmount);
                builder.append(", ");
            }
            if (_reportingInterval != null) {
                builder.append("_reportingInterval=");
                builder.append(_reportingInterval);
                builder.append(", ");
            }
            if (_reportingRange != null) {
                builder.append("_reportingRange=");
                builder.append(_reportingRange);
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
            if (_triggeringCondition != null) {
                builder.append("_triggeringCondition=");
                builder.append(_triggeringCondition);
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
