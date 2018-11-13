package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas
 *
 */
public class UmtsRanUeInternalMeasBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas> {

    private java.lang.Short _filterCoefficient;
    private java.lang.Integer _timeToTriggerEvent6a;
    private java.lang.Integer _timeToTriggerEvent6b;
    private java.lang.Long _ueTxPwrThresholdEvent6a;
    private java.lang.Long _ueTxPwrThresholdEvent6b;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>> augmentation = Collections.emptyMap();

    public UmtsRanUeInternalMeasBuilder() {
    }
    public UmtsRanUeInternalMeasBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanUeInternalMeasG arg) {
        this._filterCoefficient = arg.getFilterCoefficient();
        this._ueTxPwrThresholdEvent6a = arg.getUeTxPwrThresholdEvent6a();
        this._timeToTriggerEvent6a = arg.getTimeToTriggerEvent6a();
        this._ueTxPwrThresholdEvent6b = arg.getUeTxPwrThresholdEvent6b();
        this._timeToTriggerEvent6b = arg.getTimeToTriggerEvent6b();
    }

    public UmtsRanUeInternalMeasBuilder(UmtsRanUeInternalMeas base) {
        this._filterCoefficient = base.getFilterCoefficient();
        this._timeToTriggerEvent6a = base.getTimeToTriggerEvent6a();
        this._timeToTriggerEvent6b = base.getTimeToTriggerEvent6b();
        this._ueTxPwrThresholdEvent6a = base.getUeTxPwrThresholdEvent6a();
        this._ueTxPwrThresholdEvent6b = base.getUeTxPwrThresholdEvent6b();
        if (base instanceof UmtsRanUeInternalMeasImpl) {
            UmtsRanUeInternalMeasImpl impl = (UmtsRanUeInternalMeasImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanUeInternalMeasG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanUeInternalMeasG) {
            this._filterCoefficient = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanUeInternalMeasG)arg).getFilterCoefficient();
            this._ueTxPwrThresholdEvent6a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanUeInternalMeasG)arg).getUeTxPwrThresholdEvent6a();
            this._timeToTriggerEvent6a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanUeInternalMeasG)arg).getTimeToTriggerEvent6a();
            this._ueTxPwrThresholdEvent6b = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanUeInternalMeasG)arg).getUeTxPwrThresholdEvent6b();
            this._timeToTriggerEvent6b = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanUeInternalMeasG)arg).getTimeToTriggerEvent6b();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanUeInternalMeasG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getFilterCoefficient() {
        return _filterCoefficient;
    }
    
    public java.lang.Integer getTimeToTriggerEvent6a() {
        return _timeToTriggerEvent6a;
    }
    
    public java.lang.Integer getTimeToTriggerEvent6b() {
        return _timeToTriggerEvent6b;
    }
    
    public java.lang.Long getUeTxPwrThresholdEvent6a() {
        return _ueTxPwrThresholdEvent6a;
    }
    
    public java.lang.Long getUeTxPwrThresholdEvent6b() {
        return _ueTxPwrThresholdEvent6b;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public UmtsRanUeInternalMeasBuilder setFilterCoefficient(final java.lang.Short value) {
    if (value != null) {
        checkFilterCoefficientRange(value);
    }
        this._filterCoefficient = value;
        return this;
    }
    
     
     private static void checkTimeToTriggerEvent6aRange(final int value) {
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
    
    public UmtsRanUeInternalMeasBuilder setTimeToTriggerEvent6a(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerEvent6aRange(value);
    }
        this._timeToTriggerEvent6a = value;
        return this;
    }
    
     
     private static void checkTimeToTriggerEvent6bRange(final int value) {
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
    
    public UmtsRanUeInternalMeasBuilder setTimeToTriggerEvent6b(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToTriggerEvent6bRange(value);
    }
        this._timeToTriggerEvent6b = value;
        return this;
    }
    
     
    public UmtsRanUeInternalMeasBuilder setUeTxPwrThresholdEvent6a(final java.lang.Long value) {
        this._ueTxPwrThresholdEvent6a = value;
        return this;
    }
    
     
    public UmtsRanUeInternalMeasBuilder setUeTxPwrThresholdEvent6b(final java.lang.Long value) {
        this._ueTxPwrThresholdEvent6b = value;
        return this;
    }
    
    public UmtsRanUeInternalMeasBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanUeInternalMeasBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanUeInternalMeas build() {
        return new UmtsRanUeInternalMeasImpl(this);
    }

    private static final class UmtsRanUeInternalMeasImpl implements UmtsRanUeInternalMeas {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas.class;
        }

        private final java.lang.Short _filterCoefficient;
        private final java.lang.Integer _timeToTriggerEvent6a;
        private final java.lang.Integer _timeToTriggerEvent6b;
        private final java.lang.Long _ueTxPwrThresholdEvent6a;
        private final java.lang.Long _ueTxPwrThresholdEvent6b;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>> augmentation = Collections.emptyMap();

        private UmtsRanUeInternalMeasImpl(UmtsRanUeInternalMeasBuilder base) {
            this._filterCoefficient = base.getFilterCoefficient();
            this._timeToTriggerEvent6a = base.getTimeToTriggerEvent6a();
            this._timeToTriggerEvent6b = base.getTimeToTriggerEvent6b();
            this._ueTxPwrThresholdEvent6a = base.getUeTxPwrThresholdEvent6a();
            this._ueTxPwrThresholdEvent6b = base.getUeTxPwrThresholdEvent6b();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.Integer getTimeToTriggerEvent6a() {
            return _timeToTriggerEvent6a;
        }
        
        @Override
        public java.lang.Integer getTimeToTriggerEvent6b() {
            return _timeToTriggerEvent6b;
        }
        
        @Override
        public java.lang.Long getUeTxPwrThresholdEvent6a() {
            return _ueTxPwrThresholdEvent6a;
        }
        
        @Override
        public java.lang.Long getUeTxPwrThresholdEvent6b() {
            return _ueTxPwrThresholdEvent6b;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_timeToTriggerEvent6a);
            result = prime * result + Objects.hashCode(_timeToTriggerEvent6b);
            result = prime * result + Objects.hashCode(_ueTxPwrThresholdEvent6a);
            result = prime * result + Objects.hashCode(_ueTxPwrThresholdEvent6b);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas)obj;
            if (!Objects.equals(_filterCoefficient, other.getFilterCoefficient())) {
                return false;
            }
            if (!Objects.equals(_timeToTriggerEvent6a, other.getTimeToTriggerEvent6a())) {
                return false;
            }
            if (!Objects.equals(_timeToTriggerEvent6b, other.getTimeToTriggerEvent6b())) {
                return false;
            }
            if (!Objects.equals(_ueTxPwrThresholdEvent6a, other.getUeTxPwrThresholdEvent6a())) {
                return false;
            }
            if (!Objects.equals(_ueTxPwrThresholdEvent6b, other.getUeTxPwrThresholdEvent6b())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanUeInternalMeasImpl otherImpl = (UmtsRanUeInternalMeasImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanUeInternalMeas>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanUeInternalMeas [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_filterCoefficient != null) {
                builder.append("_filterCoefficient=");
                builder.append(_filterCoefficient);
                builder.append(", ");
            }
            if (_timeToTriggerEvent6a != null) {
                builder.append("_timeToTriggerEvent6a=");
                builder.append(_timeToTriggerEvent6a);
                builder.append(", ");
            }
            if (_timeToTriggerEvent6b != null) {
                builder.append("_timeToTriggerEvent6b=");
                builder.append(_timeToTriggerEvent6b);
                builder.append(", ");
            }
            if (_ueTxPwrThresholdEvent6a != null) {
                builder.append("_ueTxPwrThresholdEvent6a=");
                builder.append(_ueTxPwrThresholdEvent6a);
                builder.append(", ");
            }
            if (_ueTxPwrThresholdEvent6b != null) {
                builder.append("_ueTxPwrThresholdEvent6b=");
                builder.append(_ueTxPwrThresholdEvent6b);
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
