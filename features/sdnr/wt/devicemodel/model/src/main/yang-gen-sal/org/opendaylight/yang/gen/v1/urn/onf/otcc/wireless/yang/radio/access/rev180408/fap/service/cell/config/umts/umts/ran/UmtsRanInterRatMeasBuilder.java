package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.inter.rat.meas.UmtsRanInterRatMeasInstance;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas
 *
 */
public class UmtsRanInterRatMeasBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas> {

    private java.lang.Short _gsmFilterCoefficient;
    private java.lang.Short _hysteresis;
    private BigInteger _instanceNumberOfEntries;
    private java.lang.Long _thresholdOtherSystem;
    private java.lang.Long _thresholdOwnSystem;
    private java.lang.Integer _timeToTrigger;
    private List<UmtsRanInterRatMeasInstance> _umtsRanInterRatMeasInstance;
    private java.lang.Short _weightingFactor;
    private java.lang.Boolean _bsicVerificationRequired;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>> augmentation = Collections.emptyMap();

    public UmtsRanInterRatMeasBuilder() {
    }
    public UmtsRanInterRatMeasBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasG arg) {
        this._gsmFilterCoefficient = arg.getGsmFilterCoefficient();
        this._bsicVerificationRequired = arg.isBsicVerificationRequired();
        this._weightingFactor = arg.getWeightingFactor();
        this._hysteresis = arg.getHysteresis();
        this._timeToTrigger = arg.getTimeToTrigger();
        this._thresholdOwnSystem = arg.getThresholdOwnSystem();
        this._thresholdOtherSystem = arg.getThresholdOtherSystem();
        this._instanceNumberOfEntries = arg.getInstanceNumberOfEntries();
    }

    public UmtsRanInterRatMeasBuilder(UmtsRanInterRatMeas base) {
        this._gsmFilterCoefficient = base.getGsmFilterCoefficient();
        this._hysteresis = base.getHysteresis();
        this._instanceNumberOfEntries = base.getInstanceNumberOfEntries();
        this._thresholdOtherSystem = base.getThresholdOtherSystem();
        this._thresholdOwnSystem = base.getThresholdOwnSystem();
        this._timeToTrigger = base.getTimeToTrigger();
        this._umtsRanInterRatMeasInstance = base.getUmtsRanInterRatMeasInstance();
        this._weightingFactor = base.getWeightingFactor();
        this._bsicVerificationRequired = base.isBsicVerificationRequired();
        if (base instanceof UmtsRanInterRatMeasImpl) {
            UmtsRanInterRatMeasImpl impl = (UmtsRanInterRatMeasImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasG) {
            this._gsmFilterCoefficient = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasG)arg).getGsmFilterCoefficient();
            this._bsicVerificationRequired = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasG)arg).isBsicVerificationRequired();
            this._weightingFactor = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasG)arg).getWeightingFactor();
            this._hysteresis = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasG)arg).getHysteresis();
            this._timeToTrigger = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasG)arg).getTimeToTrigger();
            this._thresholdOwnSystem = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasG)arg).getThresholdOwnSystem();
            this._thresholdOtherSystem = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasG)arg).getThresholdOtherSystem();
            this._instanceNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasG)arg).getInstanceNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanInterRatMeasG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getGsmFilterCoefficient() {
        return _gsmFilterCoefficient;
    }
    
    public java.lang.Short getHysteresis() {
        return _hysteresis;
    }
    
    public BigInteger getInstanceNumberOfEntries() {
        return _instanceNumberOfEntries;
    }
    
    public java.lang.Long getThresholdOtherSystem() {
        return _thresholdOtherSystem;
    }
    
    public java.lang.Long getThresholdOwnSystem() {
        return _thresholdOwnSystem;
    }
    
    public java.lang.Integer getTimeToTrigger() {
        return _timeToTrigger;
    }
    
    public List<UmtsRanInterRatMeasInstance> getUmtsRanInterRatMeasInstance() {
        return _umtsRanInterRatMeasInstance;
    }
    
    public java.lang.Short getWeightingFactor() {
        return _weightingFactor;
    }
    
    public java.lang.Boolean isBsicVerificationRequired() {
        return _bsicVerificationRequired;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkGsmFilterCoefficientRange(final short value) {
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
    
    public UmtsRanInterRatMeasBuilder setGsmFilterCoefficient(final java.lang.Short value) {
    if (value != null) {
        checkGsmFilterCoefficientRange(value);
    }
        this._gsmFilterCoefficient = value;
        return this;
    }
    
     
     private static void checkHysteresisRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public UmtsRanInterRatMeasBuilder setHysteresis(final java.lang.Short value) {
    if (value != null) {
        checkHysteresisRange(value);
    }
        this._hysteresis = value;
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
    
    public UmtsRanInterRatMeasBuilder setInstanceNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkInstanceNumberOfEntriesRange(value);
    }
        this._instanceNumberOfEntries = value;
        return this;
    }
    
     
    public UmtsRanInterRatMeasBuilder setThresholdOtherSystem(final java.lang.Long value) {
        this._thresholdOtherSystem = value;
        return this;
    }
    
     
    public UmtsRanInterRatMeasBuilder setThresholdOwnSystem(final java.lang.Long value) {
        this._thresholdOwnSystem = value;
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
    
    public UmtsRanInterRatMeasBuilder setTimeToTrigger(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerRange(value);
    }
        this._timeToTrigger = value;
        return this;
    }
    
     
    public UmtsRanInterRatMeasBuilder setUmtsRanInterRatMeasInstance(final List<UmtsRanInterRatMeasInstance> value) {
        this._umtsRanInterRatMeasInstance = value;
        return this;
    }
    
     
     private static void checkWeightingFactorRange(final short value) {
         if (value >= (short)0 && value <= (short)20) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..20]].", value));
     }
    
    public UmtsRanInterRatMeasBuilder setWeightingFactor(final java.lang.Short value) {
    if (value != null) {
        checkWeightingFactorRange(value);
    }
        this._weightingFactor = value;
        return this;
    }
    
     
    public UmtsRanInterRatMeasBuilder setBsicVerificationRequired(final java.lang.Boolean value) {
        this._bsicVerificationRequired = value;
        return this;
    }
    
    public UmtsRanInterRatMeasBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanInterRatMeasBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanInterRatMeas build() {
        return new UmtsRanInterRatMeasImpl(this);
    }

    private static final class UmtsRanInterRatMeasImpl implements UmtsRanInterRatMeas {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas.class;
        }

        private final java.lang.Short _gsmFilterCoefficient;
        private final java.lang.Short _hysteresis;
        private final BigInteger _instanceNumberOfEntries;
        private final java.lang.Long _thresholdOtherSystem;
        private final java.lang.Long _thresholdOwnSystem;
        private final java.lang.Integer _timeToTrigger;
        private final List<UmtsRanInterRatMeasInstance> _umtsRanInterRatMeasInstance;
        private final java.lang.Short _weightingFactor;
        private final java.lang.Boolean _bsicVerificationRequired;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>> augmentation = Collections.emptyMap();

        private UmtsRanInterRatMeasImpl(UmtsRanInterRatMeasBuilder base) {
            this._gsmFilterCoefficient = base.getGsmFilterCoefficient();
            this._hysteresis = base.getHysteresis();
            this._instanceNumberOfEntries = base.getInstanceNumberOfEntries();
            this._thresholdOtherSystem = base.getThresholdOtherSystem();
            this._thresholdOwnSystem = base.getThresholdOwnSystem();
            this._timeToTrigger = base.getTimeToTrigger();
            this._umtsRanInterRatMeasInstance = base.getUmtsRanInterRatMeasInstance();
            this._weightingFactor = base.getWeightingFactor();
            this._bsicVerificationRequired = base.isBsicVerificationRequired();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getGsmFilterCoefficient() {
            return _gsmFilterCoefficient;
        }
        
        @Override
        public java.lang.Short getHysteresis() {
            return _hysteresis;
        }
        
        @Override
        public BigInteger getInstanceNumberOfEntries() {
            return _instanceNumberOfEntries;
        }
        
        @Override
        public java.lang.Long getThresholdOtherSystem() {
            return _thresholdOtherSystem;
        }
        
        @Override
        public java.lang.Long getThresholdOwnSystem() {
            return _thresholdOwnSystem;
        }
        
        @Override
        public java.lang.Integer getTimeToTrigger() {
            return _timeToTrigger;
        }
        
        @Override
        public List<UmtsRanInterRatMeasInstance> getUmtsRanInterRatMeasInstance() {
            return _umtsRanInterRatMeasInstance;
        }
        
        @Override
        public java.lang.Short getWeightingFactor() {
            return _weightingFactor;
        }
        
        @Override
        public java.lang.Boolean isBsicVerificationRequired() {
            return _bsicVerificationRequired;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_gsmFilterCoefficient);
            result = prime * result + Objects.hashCode(_hysteresis);
            result = prime * result + Objects.hashCode(_instanceNumberOfEntries);
            result = prime * result + Objects.hashCode(_thresholdOtherSystem);
            result = prime * result + Objects.hashCode(_thresholdOwnSystem);
            result = prime * result + Objects.hashCode(_timeToTrigger);
            result = prime * result + Objects.hashCode(_umtsRanInterRatMeasInstance);
            result = prime * result + Objects.hashCode(_weightingFactor);
            result = prime * result + Objects.hashCode(_bsicVerificationRequired);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas)obj;
            if (!Objects.equals(_gsmFilterCoefficient, other.getGsmFilterCoefficient())) {
                return false;
            }
            if (!Objects.equals(_hysteresis, other.getHysteresis())) {
                return false;
            }
            if (!Objects.equals(_instanceNumberOfEntries, other.getInstanceNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_thresholdOtherSystem, other.getThresholdOtherSystem())) {
                return false;
            }
            if (!Objects.equals(_thresholdOwnSystem, other.getThresholdOwnSystem())) {
                return false;
            }
            if (!Objects.equals(_timeToTrigger, other.getTimeToTrigger())) {
                return false;
            }
            if (!Objects.equals(_umtsRanInterRatMeasInstance, other.getUmtsRanInterRatMeasInstance())) {
                return false;
            }
            if (!Objects.equals(_weightingFactor, other.getWeightingFactor())) {
                return false;
            }
            if (!Objects.equals(_bsicVerificationRequired, other.isBsicVerificationRequired())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanInterRatMeasImpl otherImpl = (UmtsRanInterRatMeasImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanInterRatMeas>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanInterRatMeas [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_gsmFilterCoefficient != null) {
                builder.append("_gsmFilterCoefficient=");
                builder.append(_gsmFilterCoefficient);
                builder.append(", ");
            }
            if (_hysteresis != null) {
                builder.append("_hysteresis=");
                builder.append(_hysteresis);
                builder.append(", ");
            }
            if (_instanceNumberOfEntries != null) {
                builder.append("_instanceNumberOfEntries=");
                builder.append(_instanceNumberOfEntries);
                builder.append(", ");
            }
            if (_thresholdOtherSystem != null) {
                builder.append("_thresholdOtherSystem=");
                builder.append(_thresholdOtherSystem);
                builder.append(", ");
            }
            if (_thresholdOwnSystem != null) {
                builder.append("_thresholdOwnSystem=");
                builder.append(_thresholdOwnSystem);
                builder.append(", ");
            }
            if (_timeToTrigger != null) {
                builder.append("_timeToTrigger=");
                builder.append(_timeToTrigger);
                builder.append(", ");
            }
            if (_umtsRanInterRatMeasInstance != null) {
                builder.append("_umtsRanInterRatMeasInstance=");
                builder.append(_umtsRanInterRatMeasInstance);
                builder.append(", ");
            }
            if (_weightingFactor != null) {
                builder.append("_weightingFactor=");
                builder.append(_weightingFactor);
                builder.append(", ");
            }
            if (_bsicVerificationRequired != null) {
                builder.append("_bsicVerificationRequired=");
                builder.append(_bsicVerificationRequired);
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
