package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.intra.freq.meas.UmtsRanIntraFreqMeasInstance;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG.TriggeringCondition1Event1f;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG.TriggeringCondition2Event1e;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG.TriggeringCondition1Event1b;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG.TriggeringCondition2Event1a;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG.MeasurementQuantity;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas
 *
 */
public class UmtsRanIntraFreqMeasBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas> {

    private java.lang.Short _filterCoefficient;
    private java.lang.Short _hysteresisEvent1a;
    private java.lang.Short _hysteresisEvent1b;
    private java.lang.Short _hysteresisEvent1c;
    private java.lang.Short _hysteresisEvent1d;
    private java.lang.Short _hysteresisEvent1e;
    private java.lang.Short _hysteresisEvent1f;
    private BigInteger _instanceNumberOfEntries;
    private List<java.lang.String> _intraFrequencyEventIdentity;
    private MeasurementQuantity _measurementQuantity;
    private java.lang.Short _replacementActivationThresholdEvent1c;
    private java.lang.Short _reportDeactivationThresholdEvent1a;
    private java.lang.Long _reportingAmountEvent1a;
    private java.lang.Long _reportingAmountEvent1c;
    private java.lang.Integer _reportingIntervalEvent1a;
    private java.lang.Integer _reportingIntervalEvent1c;
    private java.lang.Short _reportingRangeEvent1a;
    private java.lang.Short _reportingRangeEvent1b;
    private java.lang.Long _thresholdUsedFrequencyEvent1e;
    private java.lang.Long _thresholdUsedFrequencyEvent1f;
    private java.lang.Integer _timeToTriggerEvent1a;
    private java.lang.Integer _timeToTriggerEvent1b;
    private java.lang.Integer _timeToTriggerEvent1c;
    private java.lang.Integer _timeToTriggerEvent1d;
    private java.lang.Integer _timeToTriggerEvent1e;
    private java.lang.Integer _timeToTriggerEvent1f;
    private List<TriggeringCondition1Event1b> _triggeringCondition1Event1b;
    private List<TriggeringCondition1Event1f> _triggeringCondition1Event1f;
    private List<TriggeringCondition2Event1a> _triggeringCondition2Event1a;
    private List<TriggeringCondition2Event1e> _triggeringCondition2Event1e;
    private List<UmtsRanIntraFreqMeasInstance> _umtsRanIntraFreqMeasInstance;
    private java.lang.Short _weightingFactorEvent1a;
    private java.lang.Short _weightingFactorEvent1b;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>> augmentation = Collections.emptyMap();

    public UmtsRanIntraFreqMeasBuilder() {
    }
    public UmtsRanIntraFreqMeasBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG arg) {
        this._measurementQuantity = arg.getMeasurementQuantity();
        this._filterCoefficient = arg.getFilterCoefficient();
        this._intraFrequencyEventIdentity = arg.getIntraFrequencyEventIdentity();
        this._triggeringCondition2Event1a = arg.getTriggeringCondition2Event1a();
        this._triggeringCondition1Event1b = arg.getTriggeringCondition1Event1b();
        this._triggeringCondition2Event1e = arg.getTriggeringCondition2Event1e();
        this._triggeringCondition1Event1f = arg.getTriggeringCondition1Event1f();
        this._reportingRangeEvent1a = arg.getReportingRangeEvent1a();
        this._reportingRangeEvent1b = arg.getReportingRangeEvent1b();
        this._weightingFactorEvent1a = arg.getWeightingFactorEvent1a();
        this._weightingFactorEvent1b = arg.getWeightingFactorEvent1b();
        this._reportDeactivationThresholdEvent1a = arg.getReportDeactivationThresholdEvent1a();
        this._reportingAmountEvent1a = arg.getReportingAmountEvent1a();
        this._reportingAmountEvent1c = arg.getReportingAmountEvent1c();
        this._reportingIntervalEvent1a = arg.getReportingIntervalEvent1a();
        this._reportingIntervalEvent1c = arg.getReportingIntervalEvent1c();
        this._hysteresisEvent1a = arg.getHysteresisEvent1a();
        this._hysteresisEvent1b = arg.getHysteresisEvent1b();
        this._hysteresisEvent1c = arg.getHysteresisEvent1c();
        this._hysteresisEvent1d = arg.getHysteresisEvent1d();
        this._hysteresisEvent1e = arg.getHysteresisEvent1e();
        this._hysteresisEvent1f = arg.getHysteresisEvent1f();
        this._timeToTriggerEvent1a = arg.getTimeToTriggerEvent1a();
        this._timeToTriggerEvent1b = arg.getTimeToTriggerEvent1b();
        this._timeToTriggerEvent1c = arg.getTimeToTriggerEvent1c();
        this._timeToTriggerEvent1d = arg.getTimeToTriggerEvent1d();
        this._timeToTriggerEvent1e = arg.getTimeToTriggerEvent1e();
        this._timeToTriggerEvent1f = arg.getTimeToTriggerEvent1f();
        this._thresholdUsedFrequencyEvent1e = arg.getThresholdUsedFrequencyEvent1e();
        this._thresholdUsedFrequencyEvent1f = arg.getThresholdUsedFrequencyEvent1f();
        this._replacementActivationThresholdEvent1c = arg.getReplacementActivationThresholdEvent1c();
        this._instanceNumberOfEntries = arg.getInstanceNumberOfEntries();
    }

    public UmtsRanIntraFreqMeasBuilder(UmtsRanIntraFreqMeas base) {
        this._filterCoefficient = base.getFilterCoefficient();
        this._hysteresisEvent1a = base.getHysteresisEvent1a();
        this._hysteresisEvent1b = base.getHysteresisEvent1b();
        this._hysteresisEvent1c = base.getHysteresisEvent1c();
        this._hysteresisEvent1d = base.getHysteresisEvent1d();
        this._hysteresisEvent1e = base.getHysteresisEvent1e();
        this._hysteresisEvent1f = base.getHysteresisEvent1f();
        this._instanceNumberOfEntries = base.getInstanceNumberOfEntries();
        this._intraFrequencyEventIdentity = base.getIntraFrequencyEventIdentity();
        this._measurementQuantity = base.getMeasurementQuantity();
        this._replacementActivationThresholdEvent1c = base.getReplacementActivationThresholdEvent1c();
        this._reportDeactivationThresholdEvent1a = base.getReportDeactivationThresholdEvent1a();
        this._reportingAmountEvent1a = base.getReportingAmountEvent1a();
        this._reportingAmountEvent1c = base.getReportingAmountEvent1c();
        this._reportingIntervalEvent1a = base.getReportingIntervalEvent1a();
        this._reportingIntervalEvent1c = base.getReportingIntervalEvent1c();
        this._reportingRangeEvent1a = base.getReportingRangeEvent1a();
        this._reportingRangeEvent1b = base.getReportingRangeEvent1b();
        this._thresholdUsedFrequencyEvent1e = base.getThresholdUsedFrequencyEvent1e();
        this._thresholdUsedFrequencyEvent1f = base.getThresholdUsedFrequencyEvent1f();
        this._timeToTriggerEvent1a = base.getTimeToTriggerEvent1a();
        this._timeToTriggerEvent1b = base.getTimeToTriggerEvent1b();
        this._timeToTriggerEvent1c = base.getTimeToTriggerEvent1c();
        this._timeToTriggerEvent1d = base.getTimeToTriggerEvent1d();
        this._timeToTriggerEvent1e = base.getTimeToTriggerEvent1e();
        this._timeToTriggerEvent1f = base.getTimeToTriggerEvent1f();
        this._triggeringCondition1Event1b = base.getTriggeringCondition1Event1b();
        this._triggeringCondition1Event1f = base.getTriggeringCondition1Event1f();
        this._triggeringCondition2Event1a = base.getTriggeringCondition2Event1a();
        this._triggeringCondition2Event1e = base.getTriggeringCondition2Event1e();
        this._umtsRanIntraFreqMeasInstance = base.getUmtsRanIntraFreqMeasInstance();
        this._weightingFactorEvent1a = base.getWeightingFactorEvent1a();
        this._weightingFactorEvent1b = base.getWeightingFactorEvent1b();
        if (base instanceof UmtsRanIntraFreqMeasImpl) {
            UmtsRanIntraFreqMeasImpl impl = (UmtsRanIntraFreqMeasImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG) {
            this._measurementQuantity = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getMeasurementQuantity();
            this._filterCoefficient = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getFilterCoefficient();
            this._intraFrequencyEventIdentity = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getIntraFrequencyEventIdentity();
            this._triggeringCondition2Event1a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getTriggeringCondition2Event1a();
            this._triggeringCondition1Event1b = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getTriggeringCondition1Event1b();
            this._triggeringCondition2Event1e = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getTriggeringCondition2Event1e();
            this._triggeringCondition1Event1f = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getTriggeringCondition1Event1f();
            this._reportingRangeEvent1a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getReportingRangeEvent1a();
            this._reportingRangeEvent1b = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getReportingRangeEvent1b();
            this._weightingFactorEvent1a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getWeightingFactorEvent1a();
            this._weightingFactorEvent1b = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getWeightingFactorEvent1b();
            this._reportDeactivationThresholdEvent1a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getReportDeactivationThresholdEvent1a();
            this._reportingAmountEvent1a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getReportingAmountEvent1a();
            this._reportingAmountEvent1c = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getReportingAmountEvent1c();
            this._reportingIntervalEvent1a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getReportingIntervalEvent1a();
            this._reportingIntervalEvent1c = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getReportingIntervalEvent1c();
            this._hysteresisEvent1a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getHysteresisEvent1a();
            this._hysteresisEvent1b = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getHysteresisEvent1b();
            this._hysteresisEvent1c = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getHysteresisEvent1c();
            this._hysteresisEvent1d = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getHysteresisEvent1d();
            this._hysteresisEvent1e = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getHysteresisEvent1e();
            this._hysteresisEvent1f = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getHysteresisEvent1f();
            this._timeToTriggerEvent1a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getTimeToTriggerEvent1a();
            this._timeToTriggerEvent1b = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getTimeToTriggerEvent1b();
            this._timeToTriggerEvent1c = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getTimeToTriggerEvent1c();
            this._timeToTriggerEvent1d = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getTimeToTriggerEvent1d();
            this._timeToTriggerEvent1e = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getTimeToTriggerEvent1e();
            this._timeToTriggerEvent1f = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getTimeToTriggerEvent1f();
            this._thresholdUsedFrequencyEvent1e = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getThresholdUsedFrequencyEvent1e();
            this._thresholdUsedFrequencyEvent1f = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getThresholdUsedFrequencyEvent1f();
            this._replacementActivationThresholdEvent1c = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getReplacementActivationThresholdEvent1c();
            this._instanceNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG)arg).getInstanceNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanIntraFreqMeasG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getFilterCoefficient() {
        return _filterCoefficient;
    }
    
    public java.lang.Short getHysteresisEvent1a() {
        return _hysteresisEvent1a;
    }
    
    public java.lang.Short getHysteresisEvent1b() {
        return _hysteresisEvent1b;
    }
    
    public java.lang.Short getHysteresisEvent1c() {
        return _hysteresisEvent1c;
    }
    
    public java.lang.Short getHysteresisEvent1d() {
        return _hysteresisEvent1d;
    }
    
    public java.lang.Short getHysteresisEvent1e() {
        return _hysteresisEvent1e;
    }
    
    public java.lang.Short getHysteresisEvent1f() {
        return _hysteresisEvent1f;
    }
    
    public BigInteger getInstanceNumberOfEntries() {
        return _instanceNumberOfEntries;
    }
    
    public List<java.lang.String> getIntraFrequencyEventIdentity() {
        return _intraFrequencyEventIdentity;
    }
    
    public MeasurementQuantity getMeasurementQuantity() {
        return _measurementQuantity;
    }
    
    public java.lang.Short getReplacementActivationThresholdEvent1c() {
        return _replacementActivationThresholdEvent1c;
    }
    
    public java.lang.Short getReportDeactivationThresholdEvent1a() {
        return _reportDeactivationThresholdEvent1a;
    }
    
    public java.lang.Long getReportingAmountEvent1a() {
        return _reportingAmountEvent1a;
    }
    
    public java.lang.Long getReportingAmountEvent1c() {
        return _reportingAmountEvent1c;
    }
    
    public java.lang.Integer getReportingIntervalEvent1a() {
        return _reportingIntervalEvent1a;
    }
    
    public java.lang.Integer getReportingIntervalEvent1c() {
        return _reportingIntervalEvent1c;
    }
    
    public java.lang.Short getReportingRangeEvent1a() {
        return _reportingRangeEvent1a;
    }
    
    public java.lang.Short getReportingRangeEvent1b() {
        return _reportingRangeEvent1b;
    }
    
    public java.lang.Long getThresholdUsedFrequencyEvent1e() {
        return _thresholdUsedFrequencyEvent1e;
    }
    
    public java.lang.Long getThresholdUsedFrequencyEvent1f() {
        return _thresholdUsedFrequencyEvent1f;
    }
    
    public java.lang.Integer getTimeToTriggerEvent1a() {
        return _timeToTriggerEvent1a;
    }
    
    public java.lang.Integer getTimeToTriggerEvent1b() {
        return _timeToTriggerEvent1b;
    }
    
    public java.lang.Integer getTimeToTriggerEvent1c() {
        return _timeToTriggerEvent1c;
    }
    
    public java.lang.Integer getTimeToTriggerEvent1d() {
        return _timeToTriggerEvent1d;
    }
    
    public java.lang.Integer getTimeToTriggerEvent1e() {
        return _timeToTriggerEvent1e;
    }
    
    public java.lang.Integer getTimeToTriggerEvent1f() {
        return _timeToTriggerEvent1f;
    }
    
    public List<TriggeringCondition1Event1b> getTriggeringCondition1Event1b() {
        return _triggeringCondition1Event1b;
    }
    
    public List<TriggeringCondition1Event1f> getTriggeringCondition1Event1f() {
        return _triggeringCondition1Event1f;
    }
    
    public List<TriggeringCondition2Event1a> getTriggeringCondition2Event1a() {
        return _triggeringCondition2Event1a;
    }
    
    public List<TriggeringCondition2Event1e> getTriggeringCondition2Event1e() {
        return _triggeringCondition2Event1e;
    }
    
    public List<UmtsRanIntraFreqMeasInstance> getUmtsRanIntraFreqMeasInstance() {
        return _umtsRanIntraFreqMeasInstance;
    }
    
    public java.lang.Short getWeightingFactorEvent1a() {
        return _weightingFactorEvent1a;
    }
    
    public java.lang.Short getWeightingFactorEvent1b() {
        return _weightingFactorEvent1b;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
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
    
    public UmtsRanIntraFreqMeasBuilder setFilterCoefficient(final java.lang.Short value) {
    if (value != null) {
        checkFilterCoefficientRange(value);
    }
        this._filterCoefficient = value;
        return this;
    }
    
     
     private static void checkHysteresisEvent1aRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public UmtsRanIntraFreqMeasBuilder setHysteresisEvent1a(final java.lang.Short value) {
    if (value != null) {
        checkHysteresisEvent1aRange(value);
    }
        this._hysteresisEvent1a = value;
        return this;
    }
    
     
     private static void checkHysteresisEvent1bRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public UmtsRanIntraFreqMeasBuilder setHysteresisEvent1b(final java.lang.Short value) {
    if (value != null) {
        checkHysteresisEvent1bRange(value);
    }
        this._hysteresisEvent1b = value;
        return this;
    }
    
     
     private static void checkHysteresisEvent1cRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public UmtsRanIntraFreqMeasBuilder setHysteresisEvent1c(final java.lang.Short value) {
    if (value != null) {
        checkHysteresisEvent1cRange(value);
    }
        this._hysteresisEvent1c = value;
        return this;
    }
    
     
     private static void checkHysteresisEvent1dRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public UmtsRanIntraFreqMeasBuilder setHysteresisEvent1d(final java.lang.Short value) {
    if (value != null) {
        checkHysteresisEvent1dRange(value);
    }
        this._hysteresisEvent1d = value;
        return this;
    }
    
     
     private static void checkHysteresisEvent1eRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public UmtsRanIntraFreqMeasBuilder setHysteresisEvent1e(final java.lang.Short value) {
    if (value != null) {
        checkHysteresisEvent1eRange(value);
    }
        this._hysteresisEvent1e = value;
        return this;
    }
    
     
     private static void checkHysteresisEvent1fRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public UmtsRanIntraFreqMeasBuilder setHysteresisEvent1f(final java.lang.Short value) {
    if (value != null) {
        checkHysteresisEvent1fRange(value);
    }
        this._hysteresisEvent1f = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKINSTANCENUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKINSTANCENUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkInstanceNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKINSTANCENUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKINSTANCENUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public UmtsRanIntraFreqMeasBuilder setInstanceNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkInstanceNumberOfEntriesRange(value);
    }
        this._instanceNumberOfEntries = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasBuilder setIntraFrequencyEventIdentity(final List<java.lang.String> value) {
        this._intraFrequencyEventIdentity = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasBuilder setMeasurementQuantity(final MeasurementQuantity value) {
        this._measurementQuantity = value;
        return this;
    }
    
     
     private static void checkReplacementActivationThresholdEvent1cRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public UmtsRanIntraFreqMeasBuilder setReplacementActivationThresholdEvent1c(final java.lang.Short value) {
    if (value != null) {
        checkReplacementActivationThresholdEvent1cRange(value);
    }
        this._replacementActivationThresholdEvent1c = value;
        return this;
    }
    
     
     private static void checkReportDeactivationThresholdEvent1aRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public UmtsRanIntraFreqMeasBuilder setReportDeactivationThresholdEvent1a(final java.lang.Short value) {
    if (value != null) {
        checkReportDeactivationThresholdEvent1aRange(value);
    }
        this._reportDeactivationThresholdEvent1a = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasBuilder setReportingAmountEvent1a(final java.lang.Long value) {
        this._reportingAmountEvent1a = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasBuilder setReportingAmountEvent1c(final java.lang.Long value) {
        this._reportingAmountEvent1c = value;
        return this;
    }
    
     
     private static void checkReportingIntervalEvent1aRange(final int value) {
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
    
    public UmtsRanIntraFreqMeasBuilder setReportingIntervalEvent1a(final java.lang.Integer value) {
    if (value != null) {
        checkReportingIntervalEvent1aRange(value);
    }
        this._reportingIntervalEvent1a = value;
        return this;
    }
    
     
     private static void checkReportingIntervalEvent1cRange(final int value) {
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
    
    public UmtsRanIntraFreqMeasBuilder setReportingIntervalEvent1c(final java.lang.Integer value) {
    if (value != null) {
        checkReportingIntervalEvent1cRange(value);
    }
        this._reportingIntervalEvent1c = value;
        return this;
    }
    
     
     private static void checkReportingRangeEvent1aRange(final short value) {
         if (value >= (short)0 && value <= (short)29) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..29]].", value));
     }
    
    public UmtsRanIntraFreqMeasBuilder setReportingRangeEvent1a(final java.lang.Short value) {
    if (value != null) {
        checkReportingRangeEvent1aRange(value);
    }
        this._reportingRangeEvent1a = value;
        return this;
    }
    
     
     private static void checkReportingRangeEvent1bRange(final short value) {
         if (value >= (short)0 && value <= (short)29) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..29]].", value));
     }
    
    public UmtsRanIntraFreqMeasBuilder setReportingRangeEvent1b(final java.lang.Short value) {
    if (value != null) {
        checkReportingRangeEvent1bRange(value);
    }
        this._reportingRangeEvent1b = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasBuilder setThresholdUsedFrequencyEvent1e(final java.lang.Long value) {
        this._thresholdUsedFrequencyEvent1e = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasBuilder setThresholdUsedFrequencyEvent1f(final java.lang.Long value) {
        this._thresholdUsedFrequencyEvent1f = value;
        return this;
    }
    
     
     private static void checkTimeToTriggerEvent1aRange(final int value) {
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
    
    public UmtsRanIntraFreqMeasBuilder setTimeToTriggerEvent1a(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerEvent1aRange(value);
    }
        this._timeToTriggerEvent1a = value;
        return this;
    }
    
     
     private static void checkTimeToTriggerEvent1bRange(final int value) {
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
    
    public UmtsRanIntraFreqMeasBuilder setTimeToTriggerEvent1b(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerEvent1bRange(value);
    }
        this._timeToTriggerEvent1b = value;
        return this;
    }
    
     
     private static void checkTimeToTriggerEvent1cRange(final int value) {
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
    
    public UmtsRanIntraFreqMeasBuilder setTimeToTriggerEvent1c(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerEvent1cRange(value);
    }
        this._timeToTriggerEvent1c = value;
        return this;
    }
    
     
     private static void checkTimeToTriggerEvent1dRange(final int value) {
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
    
    public UmtsRanIntraFreqMeasBuilder setTimeToTriggerEvent1d(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerEvent1dRange(value);
    }
        this._timeToTriggerEvent1d = value;
        return this;
    }
    
     
     private static void checkTimeToTriggerEvent1eRange(final int value) {
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
    
    public UmtsRanIntraFreqMeasBuilder setTimeToTriggerEvent1e(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerEvent1eRange(value);
    }
        this._timeToTriggerEvent1e = value;
        return this;
    }
    
     
     private static void checkTimeToTriggerEvent1fRange(final int value) {
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
    
    public UmtsRanIntraFreqMeasBuilder setTimeToTriggerEvent1f(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerEvent1fRange(value);
    }
        this._timeToTriggerEvent1f = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasBuilder setTriggeringCondition1Event1b(final List<TriggeringCondition1Event1b> value) {
        this._triggeringCondition1Event1b = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasBuilder setTriggeringCondition1Event1f(final List<TriggeringCondition1Event1f> value) {
        this._triggeringCondition1Event1f = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasBuilder setTriggeringCondition2Event1a(final List<TriggeringCondition2Event1a> value) {
        this._triggeringCondition2Event1a = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasBuilder setTriggeringCondition2Event1e(final List<TriggeringCondition2Event1e> value) {
        this._triggeringCondition2Event1e = value;
        return this;
    }
    
     
    public UmtsRanIntraFreqMeasBuilder setUmtsRanIntraFreqMeasInstance(final List<UmtsRanIntraFreqMeasInstance> value) {
        this._umtsRanIntraFreqMeasInstance = value;
        return this;
    }
    
     
     private static void checkWeightingFactorEvent1aRange(final short value) {
         if (value >= (short)0 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..20]].", value));
     }
    
    public UmtsRanIntraFreqMeasBuilder setWeightingFactorEvent1a(final java.lang.Short value) {
    if (value != null) {
        checkWeightingFactorEvent1aRange(value);
    }
        this._weightingFactorEvent1a = value;
        return this;
    }
    
     
     private static void checkWeightingFactorEvent1bRange(final short value) {
         if (value >= (short)0 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..20]].", value));
     }
    
    public UmtsRanIntraFreqMeasBuilder setWeightingFactorEvent1b(final java.lang.Short value) {
    if (value != null) {
        checkWeightingFactorEvent1bRange(value);
    }
        this._weightingFactorEvent1b = value;
        return this;
    }
    
    public UmtsRanIntraFreqMeasBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanIntraFreqMeasBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanIntraFreqMeas build() {
        return new UmtsRanIntraFreqMeasImpl(this);
    }

    private static final class UmtsRanIntraFreqMeasImpl implements UmtsRanIntraFreqMeas {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas.class;
        }

        private final java.lang.Short _filterCoefficient;
        private final java.lang.Short _hysteresisEvent1a;
        private final java.lang.Short _hysteresisEvent1b;
        private final java.lang.Short _hysteresisEvent1c;
        private final java.lang.Short _hysteresisEvent1d;
        private final java.lang.Short _hysteresisEvent1e;
        private final java.lang.Short _hysteresisEvent1f;
        private final BigInteger _instanceNumberOfEntries;
        private final List<java.lang.String> _intraFrequencyEventIdentity;
        private final MeasurementQuantity _measurementQuantity;
        private final java.lang.Short _replacementActivationThresholdEvent1c;
        private final java.lang.Short _reportDeactivationThresholdEvent1a;
        private final java.lang.Long _reportingAmountEvent1a;
        private final java.lang.Long _reportingAmountEvent1c;
        private final java.lang.Integer _reportingIntervalEvent1a;
        private final java.lang.Integer _reportingIntervalEvent1c;
        private final java.lang.Short _reportingRangeEvent1a;
        private final java.lang.Short _reportingRangeEvent1b;
        private final java.lang.Long _thresholdUsedFrequencyEvent1e;
        private final java.lang.Long _thresholdUsedFrequencyEvent1f;
        private final java.lang.Integer _timeToTriggerEvent1a;
        private final java.lang.Integer _timeToTriggerEvent1b;
        private final java.lang.Integer _timeToTriggerEvent1c;
        private final java.lang.Integer _timeToTriggerEvent1d;
        private final java.lang.Integer _timeToTriggerEvent1e;
        private final java.lang.Integer _timeToTriggerEvent1f;
        private final List<TriggeringCondition1Event1b> _triggeringCondition1Event1b;
        private final List<TriggeringCondition1Event1f> _triggeringCondition1Event1f;
        private final List<TriggeringCondition2Event1a> _triggeringCondition2Event1a;
        private final List<TriggeringCondition2Event1e> _triggeringCondition2Event1e;
        private final List<UmtsRanIntraFreqMeasInstance> _umtsRanIntraFreqMeasInstance;
        private final java.lang.Short _weightingFactorEvent1a;
        private final java.lang.Short _weightingFactorEvent1b;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>> augmentation = Collections.emptyMap();

        private UmtsRanIntraFreqMeasImpl(UmtsRanIntraFreqMeasBuilder base) {
            this._filterCoefficient = base.getFilterCoefficient();
            this._hysteresisEvent1a = base.getHysteresisEvent1a();
            this._hysteresisEvent1b = base.getHysteresisEvent1b();
            this._hysteresisEvent1c = base.getHysteresisEvent1c();
            this._hysteresisEvent1d = base.getHysteresisEvent1d();
            this._hysteresisEvent1e = base.getHysteresisEvent1e();
            this._hysteresisEvent1f = base.getHysteresisEvent1f();
            this._instanceNumberOfEntries = base.getInstanceNumberOfEntries();
            this._intraFrequencyEventIdentity = base.getIntraFrequencyEventIdentity();
            this._measurementQuantity = base.getMeasurementQuantity();
            this._replacementActivationThresholdEvent1c = base.getReplacementActivationThresholdEvent1c();
            this._reportDeactivationThresholdEvent1a = base.getReportDeactivationThresholdEvent1a();
            this._reportingAmountEvent1a = base.getReportingAmountEvent1a();
            this._reportingAmountEvent1c = base.getReportingAmountEvent1c();
            this._reportingIntervalEvent1a = base.getReportingIntervalEvent1a();
            this._reportingIntervalEvent1c = base.getReportingIntervalEvent1c();
            this._reportingRangeEvent1a = base.getReportingRangeEvent1a();
            this._reportingRangeEvent1b = base.getReportingRangeEvent1b();
            this._thresholdUsedFrequencyEvent1e = base.getThresholdUsedFrequencyEvent1e();
            this._thresholdUsedFrequencyEvent1f = base.getThresholdUsedFrequencyEvent1f();
            this._timeToTriggerEvent1a = base.getTimeToTriggerEvent1a();
            this._timeToTriggerEvent1b = base.getTimeToTriggerEvent1b();
            this._timeToTriggerEvent1c = base.getTimeToTriggerEvent1c();
            this._timeToTriggerEvent1d = base.getTimeToTriggerEvent1d();
            this._timeToTriggerEvent1e = base.getTimeToTriggerEvent1e();
            this._timeToTriggerEvent1f = base.getTimeToTriggerEvent1f();
            this._triggeringCondition1Event1b = base.getTriggeringCondition1Event1b();
            this._triggeringCondition1Event1f = base.getTriggeringCondition1Event1f();
            this._triggeringCondition2Event1a = base.getTriggeringCondition2Event1a();
            this._triggeringCondition2Event1e = base.getTriggeringCondition2Event1e();
            this._umtsRanIntraFreqMeasInstance = base.getUmtsRanIntraFreqMeasInstance();
            this._weightingFactorEvent1a = base.getWeightingFactorEvent1a();
            this._weightingFactorEvent1b = base.getWeightingFactorEvent1b();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getFilterCoefficient() {
            return _filterCoefficient;
        }
        
        @Override
        public java.lang.Short getHysteresisEvent1a() {
            return _hysteresisEvent1a;
        }
        
        @Override
        public java.lang.Short getHysteresisEvent1b() {
            return _hysteresisEvent1b;
        }
        
        @Override
        public java.lang.Short getHysteresisEvent1c() {
            return _hysteresisEvent1c;
        }
        
        @Override
        public java.lang.Short getHysteresisEvent1d() {
            return _hysteresisEvent1d;
        }
        
        @Override
        public java.lang.Short getHysteresisEvent1e() {
            return _hysteresisEvent1e;
        }
        
        @Override
        public java.lang.Short getHysteresisEvent1f() {
            return _hysteresisEvent1f;
        }
        
        @Override
        public BigInteger getInstanceNumberOfEntries() {
            return _instanceNumberOfEntries;
        }
        
        @Override
        public List<java.lang.String> getIntraFrequencyEventIdentity() {
            return _intraFrequencyEventIdentity;
        }
        
        @Override
        public MeasurementQuantity getMeasurementQuantity() {
            return _measurementQuantity;
        }
        
        @Override
        public java.lang.Short getReplacementActivationThresholdEvent1c() {
            return _replacementActivationThresholdEvent1c;
        }
        
        @Override
        public java.lang.Short getReportDeactivationThresholdEvent1a() {
            return _reportDeactivationThresholdEvent1a;
        }
        
        @Override
        public java.lang.Long getReportingAmountEvent1a() {
            return _reportingAmountEvent1a;
        }
        
        @Override
        public java.lang.Long getReportingAmountEvent1c() {
            return _reportingAmountEvent1c;
        }
        
        @Override
        public java.lang.Integer getReportingIntervalEvent1a() {
            return _reportingIntervalEvent1a;
        }
        
        @Override
        public java.lang.Integer getReportingIntervalEvent1c() {
            return _reportingIntervalEvent1c;
        }
        
        @Override
        public java.lang.Short getReportingRangeEvent1a() {
            return _reportingRangeEvent1a;
        }
        
        @Override
        public java.lang.Short getReportingRangeEvent1b() {
            return _reportingRangeEvent1b;
        }
        
        @Override
        public java.lang.Long getThresholdUsedFrequencyEvent1e() {
            return _thresholdUsedFrequencyEvent1e;
        }
        
        @Override
        public java.lang.Long getThresholdUsedFrequencyEvent1f() {
            return _thresholdUsedFrequencyEvent1f;
        }
        
        @Override
        public java.lang.Integer getTimeToTriggerEvent1a() {
            return _timeToTriggerEvent1a;
        }
        
        @Override
        public java.lang.Integer getTimeToTriggerEvent1b() {
            return _timeToTriggerEvent1b;
        }
        
        @Override
        public java.lang.Integer getTimeToTriggerEvent1c() {
            return _timeToTriggerEvent1c;
        }
        
        @Override
        public java.lang.Integer getTimeToTriggerEvent1d() {
            return _timeToTriggerEvent1d;
        }
        
        @Override
        public java.lang.Integer getTimeToTriggerEvent1e() {
            return _timeToTriggerEvent1e;
        }
        
        @Override
        public java.lang.Integer getTimeToTriggerEvent1f() {
            return _timeToTriggerEvent1f;
        }
        
        @Override
        public List<TriggeringCondition1Event1b> getTriggeringCondition1Event1b() {
            return _triggeringCondition1Event1b;
        }
        
        @Override
        public List<TriggeringCondition1Event1f> getTriggeringCondition1Event1f() {
            return _triggeringCondition1Event1f;
        }
        
        @Override
        public List<TriggeringCondition2Event1a> getTriggeringCondition2Event1a() {
            return _triggeringCondition2Event1a;
        }
        
        @Override
        public List<TriggeringCondition2Event1e> getTriggeringCondition2Event1e() {
            return _triggeringCondition2Event1e;
        }
        
        @Override
        public List<UmtsRanIntraFreqMeasInstance> getUmtsRanIntraFreqMeasInstance() {
            return _umtsRanIntraFreqMeasInstance;
        }
        
        @Override
        public java.lang.Short getWeightingFactorEvent1a() {
            return _weightingFactorEvent1a;
        }
        
        @Override
        public java.lang.Short getWeightingFactorEvent1b() {
            return _weightingFactorEvent1b;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_filterCoefficient);
            result = prime * result + Objects.hashCode(_hysteresisEvent1a);
            result = prime * result + Objects.hashCode(_hysteresisEvent1b);
            result = prime * result + Objects.hashCode(_hysteresisEvent1c);
            result = prime * result + Objects.hashCode(_hysteresisEvent1d);
            result = prime * result + Objects.hashCode(_hysteresisEvent1e);
            result = prime * result + Objects.hashCode(_hysteresisEvent1f);
            result = prime * result + Objects.hashCode(_instanceNumberOfEntries);
            result = prime * result + Objects.hashCode(_intraFrequencyEventIdentity);
            result = prime * result + Objects.hashCode(_measurementQuantity);
            result = prime * result + Objects.hashCode(_replacementActivationThresholdEvent1c);
            result = prime * result + Objects.hashCode(_reportDeactivationThresholdEvent1a);
            result = prime * result + Objects.hashCode(_reportingAmountEvent1a);
            result = prime * result + Objects.hashCode(_reportingAmountEvent1c);
            result = prime * result + Objects.hashCode(_reportingIntervalEvent1a);
            result = prime * result + Objects.hashCode(_reportingIntervalEvent1c);
            result = prime * result + Objects.hashCode(_reportingRangeEvent1a);
            result = prime * result + Objects.hashCode(_reportingRangeEvent1b);
            result = prime * result + Objects.hashCode(_thresholdUsedFrequencyEvent1e);
            result = prime * result + Objects.hashCode(_thresholdUsedFrequencyEvent1f);
            result = prime * result + Objects.hashCode(_timeToTriggerEvent1a);
            result = prime * result + Objects.hashCode(_timeToTriggerEvent1b);
            result = prime * result + Objects.hashCode(_timeToTriggerEvent1c);
            result = prime * result + Objects.hashCode(_timeToTriggerEvent1d);
            result = prime * result + Objects.hashCode(_timeToTriggerEvent1e);
            result = prime * result + Objects.hashCode(_timeToTriggerEvent1f);
            result = prime * result + Objects.hashCode(_triggeringCondition1Event1b);
            result = prime * result + Objects.hashCode(_triggeringCondition1Event1f);
            result = prime * result + Objects.hashCode(_triggeringCondition2Event1a);
            result = prime * result + Objects.hashCode(_triggeringCondition2Event1e);
            result = prime * result + Objects.hashCode(_umtsRanIntraFreqMeasInstance);
            result = prime * result + Objects.hashCode(_weightingFactorEvent1a);
            result = prime * result + Objects.hashCode(_weightingFactorEvent1b);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas)obj;
            if (!Objects.equals(_filterCoefficient, other.getFilterCoefficient())) {
                return false;
            }
            if (!Objects.equals(_hysteresisEvent1a, other.getHysteresisEvent1a())) {
                return false;
            }
            if (!Objects.equals(_hysteresisEvent1b, other.getHysteresisEvent1b())) {
                return false;
            }
            if (!Objects.equals(_hysteresisEvent1c, other.getHysteresisEvent1c())) {
                return false;
            }
            if (!Objects.equals(_hysteresisEvent1d, other.getHysteresisEvent1d())) {
                return false;
            }
            if (!Objects.equals(_hysteresisEvent1e, other.getHysteresisEvent1e())) {
                return false;
            }
            if (!Objects.equals(_hysteresisEvent1f, other.getHysteresisEvent1f())) {
                return false;
            }
            if (!Objects.equals(_instanceNumberOfEntries, other.getInstanceNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_intraFrequencyEventIdentity, other.getIntraFrequencyEventIdentity())) {
                return false;
            }
            if (!Objects.equals(_measurementQuantity, other.getMeasurementQuantity())) {
                return false;
            }
            if (!Objects.equals(_replacementActivationThresholdEvent1c, other.getReplacementActivationThresholdEvent1c())) {
                return false;
            }
            if (!Objects.equals(_reportDeactivationThresholdEvent1a, other.getReportDeactivationThresholdEvent1a())) {
                return false;
            }
            if (!Objects.equals(_reportingAmountEvent1a, other.getReportingAmountEvent1a())) {
                return false;
            }
            if (!Objects.equals(_reportingAmountEvent1c, other.getReportingAmountEvent1c())) {
                return false;
            }
            if (!Objects.equals(_reportingIntervalEvent1a, other.getReportingIntervalEvent1a())) {
                return false;
            }
            if (!Objects.equals(_reportingIntervalEvent1c, other.getReportingIntervalEvent1c())) {
                return false;
            }
            if (!Objects.equals(_reportingRangeEvent1a, other.getReportingRangeEvent1a())) {
                return false;
            }
            if (!Objects.equals(_reportingRangeEvent1b, other.getReportingRangeEvent1b())) {
                return false;
            }
            if (!Objects.equals(_thresholdUsedFrequencyEvent1e, other.getThresholdUsedFrequencyEvent1e())) {
                return false;
            }
            if (!Objects.equals(_thresholdUsedFrequencyEvent1f, other.getThresholdUsedFrequencyEvent1f())) {
                return false;
            }
            if (!Objects.equals(_timeToTriggerEvent1a, other.getTimeToTriggerEvent1a())) {
                return false;
            }
            if (!Objects.equals(_timeToTriggerEvent1b, other.getTimeToTriggerEvent1b())) {
                return false;
            }
            if (!Objects.equals(_timeToTriggerEvent1c, other.getTimeToTriggerEvent1c())) {
                return false;
            }
            if (!Objects.equals(_timeToTriggerEvent1d, other.getTimeToTriggerEvent1d())) {
                return false;
            }
            if (!Objects.equals(_timeToTriggerEvent1e, other.getTimeToTriggerEvent1e())) {
                return false;
            }
            if (!Objects.equals(_timeToTriggerEvent1f, other.getTimeToTriggerEvent1f())) {
                return false;
            }
            if (!Objects.equals(_triggeringCondition1Event1b, other.getTriggeringCondition1Event1b())) {
                return false;
            }
            if (!Objects.equals(_triggeringCondition1Event1f, other.getTriggeringCondition1Event1f())) {
                return false;
            }
            if (!Objects.equals(_triggeringCondition2Event1a, other.getTriggeringCondition2Event1a())) {
                return false;
            }
            if (!Objects.equals(_triggeringCondition2Event1e, other.getTriggeringCondition2Event1e())) {
                return false;
            }
            if (!Objects.equals(_umtsRanIntraFreqMeasInstance, other.getUmtsRanIntraFreqMeasInstance())) {
                return false;
            }
            if (!Objects.equals(_weightingFactorEvent1a, other.getWeightingFactorEvent1a())) {
                return false;
            }
            if (!Objects.equals(_weightingFactorEvent1b, other.getWeightingFactorEvent1b())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanIntraFreqMeasImpl otherImpl = (UmtsRanIntraFreqMeasImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanIntraFreqMeas>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanIntraFreqMeas [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_filterCoefficient != null) {
                builder.append("_filterCoefficient=");
                builder.append(_filterCoefficient);
                builder.append(", ");
            }
            if (_hysteresisEvent1a != null) {
                builder.append("_hysteresisEvent1a=");
                builder.append(_hysteresisEvent1a);
                builder.append(", ");
            }
            if (_hysteresisEvent1b != null) {
                builder.append("_hysteresisEvent1b=");
                builder.append(_hysteresisEvent1b);
                builder.append(", ");
            }
            if (_hysteresisEvent1c != null) {
                builder.append("_hysteresisEvent1c=");
                builder.append(_hysteresisEvent1c);
                builder.append(", ");
            }
            if (_hysteresisEvent1d != null) {
                builder.append("_hysteresisEvent1d=");
                builder.append(_hysteresisEvent1d);
                builder.append(", ");
            }
            if (_hysteresisEvent1e != null) {
                builder.append("_hysteresisEvent1e=");
                builder.append(_hysteresisEvent1e);
                builder.append(", ");
            }
            if (_hysteresisEvent1f != null) {
                builder.append("_hysteresisEvent1f=");
                builder.append(_hysteresisEvent1f);
                builder.append(", ");
            }
            if (_instanceNumberOfEntries != null) {
                builder.append("_instanceNumberOfEntries=");
                builder.append(_instanceNumberOfEntries);
                builder.append(", ");
            }
            if (_intraFrequencyEventIdentity != null) {
                builder.append("_intraFrequencyEventIdentity=");
                builder.append(_intraFrequencyEventIdentity);
                builder.append(", ");
            }
            if (_measurementQuantity != null) {
                builder.append("_measurementQuantity=");
                builder.append(_measurementQuantity);
                builder.append(", ");
            }
            if (_replacementActivationThresholdEvent1c != null) {
                builder.append("_replacementActivationThresholdEvent1c=");
                builder.append(_replacementActivationThresholdEvent1c);
                builder.append(", ");
            }
            if (_reportDeactivationThresholdEvent1a != null) {
                builder.append("_reportDeactivationThresholdEvent1a=");
                builder.append(_reportDeactivationThresholdEvent1a);
                builder.append(", ");
            }
            if (_reportingAmountEvent1a != null) {
                builder.append("_reportingAmountEvent1a=");
                builder.append(_reportingAmountEvent1a);
                builder.append(", ");
            }
            if (_reportingAmountEvent1c != null) {
                builder.append("_reportingAmountEvent1c=");
                builder.append(_reportingAmountEvent1c);
                builder.append(", ");
            }
            if (_reportingIntervalEvent1a != null) {
                builder.append("_reportingIntervalEvent1a=");
                builder.append(_reportingIntervalEvent1a);
                builder.append(", ");
            }
            if (_reportingIntervalEvent1c != null) {
                builder.append("_reportingIntervalEvent1c=");
                builder.append(_reportingIntervalEvent1c);
                builder.append(", ");
            }
            if (_reportingRangeEvent1a != null) {
                builder.append("_reportingRangeEvent1a=");
                builder.append(_reportingRangeEvent1a);
                builder.append(", ");
            }
            if (_reportingRangeEvent1b != null) {
                builder.append("_reportingRangeEvent1b=");
                builder.append(_reportingRangeEvent1b);
                builder.append(", ");
            }
            if (_thresholdUsedFrequencyEvent1e != null) {
                builder.append("_thresholdUsedFrequencyEvent1e=");
                builder.append(_thresholdUsedFrequencyEvent1e);
                builder.append(", ");
            }
            if (_thresholdUsedFrequencyEvent1f != null) {
                builder.append("_thresholdUsedFrequencyEvent1f=");
                builder.append(_thresholdUsedFrequencyEvent1f);
                builder.append(", ");
            }
            if (_timeToTriggerEvent1a != null) {
                builder.append("_timeToTriggerEvent1a=");
                builder.append(_timeToTriggerEvent1a);
                builder.append(", ");
            }
            if (_timeToTriggerEvent1b != null) {
                builder.append("_timeToTriggerEvent1b=");
                builder.append(_timeToTriggerEvent1b);
                builder.append(", ");
            }
            if (_timeToTriggerEvent1c != null) {
                builder.append("_timeToTriggerEvent1c=");
                builder.append(_timeToTriggerEvent1c);
                builder.append(", ");
            }
            if (_timeToTriggerEvent1d != null) {
                builder.append("_timeToTriggerEvent1d=");
                builder.append(_timeToTriggerEvent1d);
                builder.append(", ");
            }
            if (_timeToTriggerEvent1e != null) {
                builder.append("_timeToTriggerEvent1e=");
                builder.append(_timeToTriggerEvent1e);
                builder.append(", ");
            }
            if (_timeToTriggerEvent1f != null) {
                builder.append("_timeToTriggerEvent1f=");
                builder.append(_timeToTriggerEvent1f);
                builder.append(", ");
            }
            if (_triggeringCondition1Event1b != null) {
                builder.append("_triggeringCondition1Event1b=");
                builder.append(_triggeringCondition1Event1b);
                builder.append(", ");
            }
            if (_triggeringCondition1Event1f != null) {
                builder.append("_triggeringCondition1Event1f=");
                builder.append(_triggeringCondition1Event1f);
                builder.append(", ");
            }
            if (_triggeringCondition2Event1a != null) {
                builder.append("_triggeringCondition2Event1a=");
                builder.append(_triggeringCondition2Event1a);
                builder.append(", ");
            }
            if (_triggeringCondition2Event1e != null) {
                builder.append("_triggeringCondition2Event1e=");
                builder.append(_triggeringCondition2Event1e);
                builder.append(", ");
            }
            if (_umtsRanIntraFreqMeasInstance != null) {
                builder.append("_umtsRanIntraFreqMeasInstance=");
                builder.append(_umtsRanIntraFreqMeasInstance);
                builder.append(", ");
            }
            if (_weightingFactorEvent1a != null) {
                builder.append("_weightingFactorEvent1a=");
                builder.append(_weightingFactorEvent1a);
                builder.append(", ");
            }
            if (_weightingFactorEvent1b != null) {
                builder.append("_weightingFactorEvent1b=");
                builder.append(_weightingFactorEvent1b);
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
