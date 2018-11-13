package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG.MeasurementQuantity;
import java.util.Objects;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.freq.meas.UmtsRanInterFreqMeasInstance;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas
 *
 */
public class UmtsRanInterFreqMeasBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas> {

    private java.lang.Short _filterCoefficient;
    private java.lang.Short _hysteresisEvent2a;
    private java.lang.Short _hysteresisEvent2b;
    private java.lang.Short _hysteresisEvent2d;
    private java.lang.Short _hysteresisEvent2f;
    private BigInteger _instanceNumberOfEntries;
    private List<java.lang.String> _interFrequencyEventIdentity;
    private MeasurementQuantity _measurementQuantity;
    private java.lang.Long _thresholdUsedFrequencyEvent2b;
    private java.lang.Long _thresholdUsedFrequencyEvent2d;
    private java.lang.Long _thresholdUsedFrequencyEvent2f;
    private java.lang.Integer _timeToTriggerEvent2a;
    private java.lang.Integer _timeToTriggerEvent2b;
    private java.lang.Integer _timeToTriggerEvent2d;
    private java.lang.Integer _timeToTriggerEvent2f;
    private List<UmtsRanInterFreqMeasInstance> _umtsRanInterFreqMeasInstance;
    private java.lang.Short _weightingFactorEvent2a;
    private java.lang.Short _weightingFactorEvent2b;
    private java.lang.Short _weightingFactorEvent2d;
    private java.lang.Short _weightingFactorEvent2f;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>> augmentation = Collections.emptyMap();

    public UmtsRanInterFreqMeasBuilder() {
    }
    public UmtsRanInterFreqMeasBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG arg) {
        this._measurementQuantity = arg.getMeasurementQuantity();
        this._filterCoefficient = arg.getFilterCoefficient();
        this._interFrequencyEventIdentity = arg.getInterFrequencyEventIdentity();
        this._weightingFactorEvent2a = arg.getWeightingFactorEvent2a();
        this._weightingFactorEvent2b = arg.getWeightingFactorEvent2b();
        this._weightingFactorEvent2d = arg.getWeightingFactorEvent2d();
        this._weightingFactorEvent2f = arg.getWeightingFactorEvent2f();
        this._hysteresisEvent2a = arg.getHysteresisEvent2a();
        this._hysteresisEvent2b = arg.getHysteresisEvent2b();
        this._hysteresisEvent2d = arg.getHysteresisEvent2d();
        this._hysteresisEvent2f = arg.getHysteresisEvent2f();
        this._timeToTriggerEvent2a = arg.getTimeToTriggerEvent2a();
        this._timeToTriggerEvent2b = arg.getTimeToTriggerEvent2b();
        this._timeToTriggerEvent2d = arg.getTimeToTriggerEvent2d();
        this._timeToTriggerEvent2f = arg.getTimeToTriggerEvent2f();
        this._thresholdUsedFrequencyEvent2b = arg.getThresholdUsedFrequencyEvent2b();
        this._thresholdUsedFrequencyEvent2d = arg.getThresholdUsedFrequencyEvent2d();
        this._thresholdUsedFrequencyEvent2f = arg.getThresholdUsedFrequencyEvent2f();
        this._instanceNumberOfEntries = arg.getInstanceNumberOfEntries();
    }

    public UmtsRanInterFreqMeasBuilder(UmtsRanInterFreqMeas base) {
        this._filterCoefficient = base.getFilterCoefficient();
        this._hysteresisEvent2a = base.getHysteresisEvent2a();
        this._hysteresisEvent2b = base.getHysteresisEvent2b();
        this._hysteresisEvent2d = base.getHysteresisEvent2d();
        this._hysteresisEvent2f = base.getHysteresisEvent2f();
        this._instanceNumberOfEntries = base.getInstanceNumberOfEntries();
        this._interFrequencyEventIdentity = base.getInterFrequencyEventIdentity();
        this._measurementQuantity = base.getMeasurementQuantity();
        this._thresholdUsedFrequencyEvent2b = base.getThresholdUsedFrequencyEvent2b();
        this._thresholdUsedFrequencyEvent2d = base.getThresholdUsedFrequencyEvent2d();
        this._thresholdUsedFrequencyEvent2f = base.getThresholdUsedFrequencyEvent2f();
        this._timeToTriggerEvent2a = base.getTimeToTriggerEvent2a();
        this._timeToTriggerEvent2b = base.getTimeToTriggerEvent2b();
        this._timeToTriggerEvent2d = base.getTimeToTriggerEvent2d();
        this._timeToTriggerEvent2f = base.getTimeToTriggerEvent2f();
        this._umtsRanInterFreqMeasInstance = base.getUmtsRanInterFreqMeasInstance();
        this._weightingFactorEvent2a = base.getWeightingFactorEvent2a();
        this._weightingFactorEvent2b = base.getWeightingFactorEvent2b();
        this._weightingFactorEvent2d = base.getWeightingFactorEvent2d();
        this._weightingFactorEvent2f = base.getWeightingFactorEvent2f();
        if (base instanceof UmtsRanInterFreqMeasImpl) {
            UmtsRanInterFreqMeasImpl impl = (UmtsRanInterFreqMeasImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG) {
            this._measurementQuantity = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getMeasurementQuantity();
            this._filterCoefficient = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getFilterCoefficient();
            this._interFrequencyEventIdentity = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getInterFrequencyEventIdentity();
            this._weightingFactorEvent2a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getWeightingFactorEvent2a();
            this._weightingFactorEvent2b = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getWeightingFactorEvent2b();
            this._weightingFactorEvent2d = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getWeightingFactorEvent2d();
            this._weightingFactorEvent2f = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getWeightingFactorEvent2f();
            this._hysteresisEvent2a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getHysteresisEvent2a();
            this._hysteresisEvent2b = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getHysteresisEvent2b();
            this._hysteresisEvent2d = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getHysteresisEvent2d();
            this._hysteresisEvent2f = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getHysteresisEvent2f();
            this._timeToTriggerEvent2a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getTimeToTriggerEvent2a();
            this._timeToTriggerEvent2b = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getTimeToTriggerEvent2b();
            this._timeToTriggerEvent2d = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getTimeToTriggerEvent2d();
            this._timeToTriggerEvent2f = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getTimeToTriggerEvent2f();
            this._thresholdUsedFrequencyEvent2b = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getThresholdUsedFrequencyEvent2b();
            this._thresholdUsedFrequencyEvent2d = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getThresholdUsedFrequencyEvent2d();
            this._thresholdUsedFrequencyEvent2f = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getThresholdUsedFrequencyEvent2f();
            this._instanceNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG)arg).getInstanceNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterFreqMeasG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getFilterCoefficient() {
        return _filterCoefficient;
    }
    
    public java.lang.Short getHysteresisEvent2a() {
        return _hysteresisEvent2a;
    }
    
    public java.lang.Short getHysteresisEvent2b() {
        return _hysteresisEvent2b;
    }
    
    public java.lang.Short getHysteresisEvent2d() {
        return _hysteresisEvent2d;
    }
    
    public java.lang.Short getHysteresisEvent2f() {
        return _hysteresisEvent2f;
    }
    
    public BigInteger getInstanceNumberOfEntries() {
        return _instanceNumberOfEntries;
    }
    
    public List<java.lang.String> getInterFrequencyEventIdentity() {
        return _interFrequencyEventIdentity;
    }
    
    public MeasurementQuantity getMeasurementQuantity() {
        return _measurementQuantity;
    }
    
    public java.lang.Long getThresholdUsedFrequencyEvent2b() {
        return _thresholdUsedFrequencyEvent2b;
    }
    
    public java.lang.Long getThresholdUsedFrequencyEvent2d() {
        return _thresholdUsedFrequencyEvent2d;
    }
    
    public java.lang.Long getThresholdUsedFrequencyEvent2f() {
        return _thresholdUsedFrequencyEvent2f;
    }
    
    public java.lang.Integer getTimeToTriggerEvent2a() {
        return _timeToTriggerEvent2a;
    }
    
    public java.lang.Integer getTimeToTriggerEvent2b() {
        return _timeToTriggerEvent2b;
    }
    
    public java.lang.Integer getTimeToTriggerEvent2d() {
        return _timeToTriggerEvent2d;
    }
    
    public java.lang.Integer getTimeToTriggerEvent2f() {
        return _timeToTriggerEvent2f;
    }
    
    public List<UmtsRanInterFreqMeasInstance> getUmtsRanInterFreqMeasInstance() {
        return _umtsRanInterFreqMeasInstance;
    }
    
    public java.lang.Short getWeightingFactorEvent2a() {
        return _weightingFactorEvent2a;
    }
    
    public java.lang.Short getWeightingFactorEvent2b() {
        return _weightingFactorEvent2b;
    }
    
    public java.lang.Short getWeightingFactorEvent2d() {
        return _weightingFactorEvent2d;
    }
    
    public java.lang.Short getWeightingFactorEvent2f() {
        return _weightingFactorEvent2f;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public UmtsRanInterFreqMeasBuilder setFilterCoefficient(final java.lang.Short value) {
    if (value != null) {
        checkFilterCoefficientRange(value);
    }
        this._filterCoefficient = value;
        return this;
    }
    
     
     private static void checkHysteresisEvent2aRange(final short value) {
         if (value >= (short)0 && value <= (short)29) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..29]].", value));
     }
    
    public UmtsRanInterFreqMeasBuilder setHysteresisEvent2a(final java.lang.Short value) {
    if (value != null) {
        checkHysteresisEvent2aRange(value);
    }
        this._hysteresisEvent2a = value;
        return this;
    }
    
     
     private static void checkHysteresisEvent2bRange(final short value) {
         if (value >= (short)0 && value <= (short)29) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..29]].", value));
     }
    
    public UmtsRanInterFreqMeasBuilder setHysteresisEvent2b(final java.lang.Short value) {
    if (value != null) {
        checkHysteresisEvent2bRange(value);
    }
        this._hysteresisEvent2b = value;
        return this;
    }
    
     
     private static void checkHysteresisEvent2dRange(final short value) {
         if (value >= (short)0 && value <= (short)29) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..29]].", value));
     }
    
    public UmtsRanInterFreqMeasBuilder setHysteresisEvent2d(final java.lang.Short value) {
    if (value != null) {
        checkHysteresisEvent2dRange(value);
    }
        this._hysteresisEvent2d = value;
        return this;
    }
    
     
     private static void checkHysteresisEvent2fRange(final short value) {
         if (value >= (short)0 && value <= (short)29) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..29]].", value));
     }
    
    public UmtsRanInterFreqMeasBuilder setHysteresisEvent2f(final java.lang.Short value) {
    if (value != null) {
        checkHysteresisEvent2fRange(value);
    }
        this._hysteresisEvent2f = value;
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
    
    public UmtsRanInterFreqMeasBuilder setInstanceNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkInstanceNumberOfEntriesRange(value);
    }
        this._instanceNumberOfEntries = value;
        return this;
    }
    
     
    public UmtsRanInterFreqMeasBuilder setInterFrequencyEventIdentity(final List<java.lang.String> value) {
        this._interFrequencyEventIdentity = value;
        return this;
    }
    
     
    public UmtsRanInterFreqMeasBuilder setMeasurementQuantity(final MeasurementQuantity value) {
        this._measurementQuantity = value;
        return this;
    }
    
     
    public UmtsRanInterFreqMeasBuilder setThresholdUsedFrequencyEvent2b(final java.lang.Long value) {
        this._thresholdUsedFrequencyEvent2b = value;
        return this;
    }
    
     
    public UmtsRanInterFreqMeasBuilder setThresholdUsedFrequencyEvent2d(final java.lang.Long value) {
        this._thresholdUsedFrequencyEvent2d = value;
        return this;
    }
    
     
    public UmtsRanInterFreqMeasBuilder setThresholdUsedFrequencyEvent2f(final java.lang.Long value) {
        this._thresholdUsedFrequencyEvent2f = value;
        return this;
    }
    
     
     private static void checkTimeToTriggerEvent2aRange(final int value) {
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
    
    public UmtsRanInterFreqMeasBuilder setTimeToTriggerEvent2a(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerEvent2aRange(value);
    }
        this._timeToTriggerEvent2a = value;
        return this;
    }
    
     
     private static void checkTimeToTriggerEvent2bRange(final int value) {
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
    
    public UmtsRanInterFreqMeasBuilder setTimeToTriggerEvent2b(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerEvent2bRange(value);
    }
        this._timeToTriggerEvent2b = value;
        return this;
    }
    
     
     private static void checkTimeToTriggerEvent2dRange(final int value) {
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
    
    public UmtsRanInterFreqMeasBuilder setTimeToTriggerEvent2d(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerEvent2dRange(value);
    }
        this._timeToTriggerEvent2d = value;
        return this;
    }
    
     
     private static void checkTimeToTriggerEvent2fRange(final int value) {
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
    
    public UmtsRanInterFreqMeasBuilder setTimeToTriggerEvent2f(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerEvent2fRange(value);
    }
        this._timeToTriggerEvent2f = value;
        return this;
    }
    
     
    public UmtsRanInterFreqMeasBuilder setUmtsRanInterFreqMeasInstance(final List<UmtsRanInterFreqMeasInstance> value) {
        this._umtsRanInterFreqMeasInstance = value;
        return this;
    }
    
     
     private static void checkWeightingFactorEvent2aRange(final short value) {
         if (value >= (short)0 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..20]].", value));
     }
    
    public UmtsRanInterFreqMeasBuilder setWeightingFactorEvent2a(final java.lang.Short value) {
    if (value != null) {
        checkWeightingFactorEvent2aRange(value);
    }
        this._weightingFactorEvent2a = value;
        return this;
    }
    
     
     private static void checkWeightingFactorEvent2bRange(final short value) {
         if (value >= (short)0 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..20]].", value));
     }
    
    public UmtsRanInterFreqMeasBuilder setWeightingFactorEvent2b(final java.lang.Short value) {
    if (value != null) {
        checkWeightingFactorEvent2bRange(value);
    }
        this._weightingFactorEvent2b = value;
        return this;
    }
    
     
     private static void checkWeightingFactorEvent2dRange(final short value) {
         if (value >= (short)0 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..20]].", value));
     }
    
    public UmtsRanInterFreqMeasBuilder setWeightingFactorEvent2d(final java.lang.Short value) {
    if (value != null) {
        checkWeightingFactorEvent2dRange(value);
    }
        this._weightingFactorEvent2d = value;
        return this;
    }
    
     
     private static void checkWeightingFactorEvent2fRange(final short value) {
         if (value >= (short)0 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..20]].", value));
     }
    
    public UmtsRanInterFreqMeasBuilder setWeightingFactorEvent2f(final java.lang.Short value) {
    if (value != null) {
        checkWeightingFactorEvent2fRange(value);
    }
        this._weightingFactorEvent2f = value;
        return this;
    }
    
    public UmtsRanInterFreqMeasBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanInterFreqMeasBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanInterFreqMeas build() {
        return new UmtsRanInterFreqMeasImpl(this);
    }

    private static final class UmtsRanInterFreqMeasImpl implements UmtsRanInterFreqMeas {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas.class;
        }

        private final java.lang.Short _filterCoefficient;
        private final java.lang.Short _hysteresisEvent2a;
        private final java.lang.Short _hysteresisEvent2b;
        private final java.lang.Short _hysteresisEvent2d;
        private final java.lang.Short _hysteresisEvent2f;
        private final BigInteger _instanceNumberOfEntries;
        private final List<java.lang.String> _interFrequencyEventIdentity;
        private final MeasurementQuantity _measurementQuantity;
        private final java.lang.Long _thresholdUsedFrequencyEvent2b;
        private final java.lang.Long _thresholdUsedFrequencyEvent2d;
        private final java.lang.Long _thresholdUsedFrequencyEvent2f;
        private final java.lang.Integer _timeToTriggerEvent2a;
        private final java.lang.Integer _timeToTriggerEvent2b;
        private final java.lang.Integer _timeToTriggerEvent2d;
        private final java.lang.Integer _timeToTriggerEvent2f;
        private final List<UmtsRanInterFreqMeasInstance> _umtsRanInterFreqMeasInstance;
        private final java.lang.Short _weightingFactorEvent2a;
        private final java.lang.Short _weightingFactorEvent2b;
        private final java.lang.Short _weightingFactorEvent2d;
        private final java.lang.Short _weightingFactorEvent2f;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>> augmentation = Collections.emptyMap();

        private UmtsRanInterFreqMeasImpl(UmtsRanInterFreqMeasBuilder base) {
            this._filterCoefficient = base.getFilterCoefficient();
            this._hysteresisEvent2a = base.getHysteresisEvent2a();
            this._hysteresisEvent2b = base.getHysteresisEvent2b();
            this._hysteresisEvent2d = base.getHysteresisEvent2d();
            this._hysteresisEvent2f = base.getHysteresisEvent2f();
            this._instanceNumberOfEntries = base.getInstanceNumberOfEntries();
            this._interFrequencyEventIdentity = base.getInterFrequencyEventIdentity();
            this._measurementQuantity = base.getMeasurementQuantity();
            this._thresholdUsedFrequencyEvent2b = base.getThresholdUsedFrequencyEvent2b();
            this._thresholdUsedFrequencyEvent2d = base.getThresholdUsedFrequencyEvent2d();
            this._thresholdUsedFrequencyEvent2f = base.getThresholdUsedFrequencyEvent2f();
            this._timeToTriggerEvent2a = base.getTimeToTriggerEvent2a();
            this._timeToTriggerEvent2b = base.getTimeToTriggerEvent2b();
            this._timeToTriggerEvent2d = base.getTimeToTriggerEvent2d();
            this._timeToTriggerEvent2f = base.getTimeToTriggerEvent2f();
            this._umtsRanInterFreqMeasInstance = base.getUmtsRanInterFreqMeasInstance();
            this._weightingFactorEvent2a = base.getWeightingFactorEvent2a();
            this._weightingFactorEvent2b = base.getWeightingFactorEvent2b();
            this._weightingFactorEvent2d = base.getWeightingFactorEvent2d();
            this._weightingFactorEvent2f = base.getWeightingFactorEvent2f();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.Short getHysteresisEvent2a() {
            return _hysteresisEvent2a;
        }
        
        @Override
        public java.lang.Short getHysteresisEvent2b() {
            return _hysteresisEvent2b;
        }
        
        @Override
        public java.lang.Short getHysteresisEvent2d() {
            return _hysteresisEvent2d;
        }
        
        @Override
        public java.lang.Short getHysteresisEvent2f() {
            return _hysteresisEvent2f;
        }
        
        @Override
        public BigInteger getInstanceNumberOfEntries() {
            return _instanceNumberOfEntries;
        }
        
        @Override
        public List<java.lang.String> getInterFrequencyEventIdentity() {
            return _interFrequencyEventIdentity;
        }
        
        @Override
        public MeasurementQuantity getMeasurementQuantity() {
            return _measurementQuantity;
        }
        
        @Override
        public java.lang.Long getThresholdUsedFrequencyEvent2b() {
            return _thresholdUsedFrequencyEvent2b;
        }
        
        @Override
        public java.lang.Long getThresholdUsedFrequencyEvent2d() {
            return _thresholdUsedFrequencyEvent2d;
        }
        
        @Override
        public java.lang.Long getThresholdUsedFrequencyEvent2f() {
            return _thresholdUsedFrequencyEvent2f;
        }
        
        @Override
        public java.lang.Integer getTimeToTriggerEvent2a() {
            return _timeToTriggerEvent2a;
        }
        
        @Override
        public java.lang.Integer getTimeToTriggerEvent2b() {
            return _timeToTriggerEvent2b;
        }
        
        @Override
        public java.lang.Integer getTimeToTriggerEvent2d() {
            return _timeToTriggerEvent2d;
        }
        
        @Override
        public java.lang.Integer getTimeToTriggerEvent2f() {
            return _timeToTriggerEvent2f;
        }
        
        @Override
        public List<UmtsRanInterFreqMeasInstance> getUmtsRanInterFreqMeasInstance() {
            return _umtsRanInterFreqMeasInstance;
        }
        
        @Override
        public java.lang.Short getWeightingFactorEvent2a() {
            return _weightingFactorEvent2a;
        }
        
        @Override
        public java.lang.Short getWeightingFactorEvent2b() {
            return _weightingFactorEvent2b;
        }
        
        @Override
        public java.lang.Short getWeightingFactorEvent2d() {
            return _weightingFactorEvent2d;
        }
        
        @Override
        public java.lang.Short getWeightingFactorEvent2f() {
            return _weightingFactorEvent2f;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_hysteresisEvent2a);
            result = prime * result + Objects.hashCode(_hysteresisEvent2b);
            result = prime * result + Objects.hashCode(_hysteresisEvent2d);
            result = prime * result + Objects.hashCode(_hysteresisEvent2f);
            result = prime * result + Objects.hashCode(_instanceNumberOfEntries);
            result = prime * result + Objects.hashCode(_interFrequencyEventIdentity);
            result = prime * result + Objects.hashCode(_measurementQuantity);
            result = prime * result + Objects.hashCode(_thresholdUsedFrequencyEvent2b);
            result = prime * result + Objects.hashCode(_thresholdUsedFrequencyEvent2d);
            result = prime * result + Objects.hashCode(_thresholdUsedFrequencyEvent2f);
            result = prime * result + Objects.hashCode(_timeToTriggerEvent2a);
            result = prime * result + Objects.hashCode(_timeToTriggerEvent2b);
            result = prime * result + Objects.hashCode(_timeToTriggerEvent2d);
            result = prime * result + Objects.hashCode(_timeToTriggerEvent2f);
            result = prime * result + Objects.hashCode(_umtsRanInterFreqMeasInstance);
            result = prime * result + Objects.hashCode(_weightingFactorEvent2a);
            result = prime * result + Objects.hashCode(_weightingFactorEvent2b);
            result = prime * result + Objects.hashCode(_weightingFactorEvent2d);
            result = prime * result + Objects.hashCode(_weightingFactorEvent2f);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas)obj;
            if (!Objects.equals(_filterCoefficient, other.getFilterCoefficient())) {
                return false;
            }
            if (!Objects.equals(_hysteresisEvent2a, other.getHysteresisEvent2a())) {
                return false;
            }
            if (!Objects.equals(_hysteresisEvent2b, other.getHysteresisEvent2b())) {
                return false;
            }
            if (!Objects.equals(_hysteresisEvent2d, other.getHysteresisEvent2d())) {
                return false;
            }
            if (!Objects.equals(_hysteresisEvent2f, other.getHysteresisEvent2f())) {
                return false;
            }
            if (!Objects.equals(_instanceNumberOfEntries, other.getInstanceNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_interFrequencyEventIdentity, other.getInterFrequencyEventIdentity())) {
                return false;
            }
            if (!Objects.equals(_measurementQuantity, other.getMeasurementQuantity())) {
                return false;
            }
            if (!Objects.equals(_thresholdUsedFrequencyEvent2b, other.getThresholdUsedFrequencyEvent2b())) {
                return false;
            }
            if (!Objects.equals(_thresholdUsedFrequencyEvent2d, other.getThresholdUsedFrequencyEvent2d())) {
                return false;
            }
            if (!Objects.equals(_thresholdUsedFrequencyEvent2f, other.getThresholdUsedFrequencyEvent2f())) {
                return false;
            }
            if (!Objects.equals(_timeToTriggerEvent2a, other.getTimeToTriggerEvent2a())) {
                return false;
            }
            if (!Objects.equals(_timeToTriggerEvent2b, other.getTimeToTriggerEvent2b())) {
                return false;
            }
            if (!Objects.equals(_timeToTriggerEvent2d, other.getTimeToTriggerEvent2d())) {
                return false;
            }
            if (!Objects.equals(_timeToTriggerEvent2f, other.getTimeToTriggerEvent2f())) {
                return false;
            }
            if (!Objects.equals(_umtsRanInterFreqMeasInstance, other.getUmtsRanInterFreqMeasInstance())) {
                return false;
            }
            if (!Objects.equals(_weightingFactorEvent2a, other.getWeightingFactorEvent2a())) {
                return false;
            }
            if (!Objects.equals(_weightingFactorEvent2b, other.getWeightingFactorEvent2b())) {
                return false;
            }
            if (!Objects.equals(_weightingFactorEvent2d, other.getWeightingFactorEvent2d())) {
                return false;
            }
            if (!Objects.equals(_weightingFactorEvent2f, other.getWeightingFactorEvent2f())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanInterFreqMeasImpl otherImpl = (UmtsRanInterFreqMeasImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterFreqMeas>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanInterFreqMeas [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_filterCoefficient != null) {
                builder.append("_filterCoefficient=");
                builder.append(_filterCoefficient);
                builder.append(", ");
            }
            if (_hysteresisEvent2a != null) {
                builder.append("_hysteresisEvent2a=");
                builder.append(_hysteresisEvent2a);
                builder.append(", ");
            }
            if (_hysteresisEvent2b != null) {
                builder.append("_hysteresisEvent2b=");
                builder.append(_hysteresisEvent2b);
                builder.append(", ");
            }
            if (_hysteresisEvent2d != null) {
                builder.append("_hysteresisEvent2d=");
                builder.append(_hysteresisEvent2d);
                builder.append(", ");
            }
            if (_hysteresisEvent2f != null) {
                builder.append("_hysteresisEvent2f=");
                builder.append(_hysteresisEvent2f);
                builder.append(", ");
            }
            if (_instanceNumberOfEntries != null) {
                builder.append("_instanceNumberOfEntries=");
                builder.append(_instanceNumberOfEntries);
                builder.append(", ");
            }
            if (_interFrequencyEventIdentity != null) {
                builder.append("_interFrequencyEventIdentity=");
                builder.append(_interFrequencyEventIdentity);
                builder.append(", ");
            }
            if (_measurementQuantity != null) {
                builder.append("_measurementQuantity=");
                builder.append(_measurementQuantity);
                builder.append(", ");
            }
            if (_thresholdUsedFrequencyEvent2b != null) {
                builder.append("_thresholdUsedFrequencyEvent2b=");
                builder.append(_thresholdUsedFrequencyEvent2b);
                builder.append(", ");
            }
            if (_thresholdUsedFrequencyEvent2d != null) {
                builder.append("_thresholdUsedFrequencyEvent2d=");
                builder.append(_thresholdUsedFrequencyEvent2d);
                builder.append(", ");
            }
            if (_thresholdUsedFrequencyEvent2f != null) {
                builder.append("_thresholdUsedFrequencyEvent2f=");
                builder.append(_thresholdUsedFrequencyEvent2f);
                builder.append(", ");
            }
            if (_timeToTriggerEvent2a != null) {
                builder.append("_timeToTriggerEvent2a=");
                builder.append(_timeToTriggerEvent2a);
                builder.append(", ");
            }
            if (_timeToTriggerEvent2b != null) {
                builder.append("_timeToTriggerEvent2b=");
                builder.append(_timeToTriggerEvent2b);
                builder.append(", ");
            }
            if (_timeToTriggerEvent2d != null) {
                builder.append("_timeToTriggerEvent2d=");
                builder.append(_timeToTriggerEvent2d);
                builder.append(", ");
            }
            if (_timeToTriggerEvent2f != null) {
                builder.append("_timeToTriggerEvent2f=");
                builder.append(_timeToTriggerEvent2f);
                builder.append(", ");
            }
            if (_umtsRanInterFreqMeasInstance != null) {
                builder.append("_umtsRanInterFreqMeasInstance=");
                builder.append(_umtsRanInterFreqMeasInstance);
                builder.append(", ");
            }
            if (_weightingFactorEvent2a != null) {
                builder.append("_weightingFactorEvent2a=");
                builder.append(_weightingFactorEvent2a);
                builder.append(", ");
            }
            if (_weightingFactorEvent2b != null) {
                builder.append("_weightingFactorEvent2b=");
                builder.append(_weightingFactorEvent2b);
                builder.append(", ");
            }
            if (_weightingFactorEvent2d != null) {
                builder.append("_weightingFactorEvent2d=");
                builder.append(_weightingFactorEvent2d);
                builder.append(", ");
            }
            if (_weightingFactorEvent2f != null) {
                builder.append("_weightingFactorEvent2f=");
                builder.append(_weightingFactorEvent2f);
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
