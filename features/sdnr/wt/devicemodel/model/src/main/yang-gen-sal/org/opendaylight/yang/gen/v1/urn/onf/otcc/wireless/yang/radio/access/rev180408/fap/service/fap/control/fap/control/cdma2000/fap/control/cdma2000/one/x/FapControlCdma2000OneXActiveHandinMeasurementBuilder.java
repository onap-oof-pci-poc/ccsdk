package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement
 *
 */
public class FapControlCdma2000OneXActiveHandinMeasurementBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement> {

    private java.lang.Integer _activeHandInMeasurementDuration;
    private java.lang.Long _measurementReportThreshold;
    private java.lang.Boolean _activeHandinMeasurementEnable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>> augmentation = Collections.emptyMap();

    public FapControlCdma2000OneXActiveHandinMeasurementBuilder() {
    }
    public FapControlCdma2000OneXActiveHandinMeasurementBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXActiveHandinMeasurementG arg) {
        this._activeHandinMeasurementEnable = arg.isActiveHandinMeasurementEnable();
        this._activeHandInMeasurementDuration = arg.getActiveHandInMeasurementDuration();
        this._measurementReportThreshold = arg.getMeasurementReportThreshold();
    }

    public FapControlCdma2000OneXActiveHandinMeasurementBuilder(FapControlCdma2000OneXActiveHandinMeasurement base) {
        this._activeHandInMeasurementDuration = base.getActiveHandInMeasurementDuration();
        this._measurementReportThreshold = base.getMeasurementReportThreshold();
        this._activeHandinMeasurementEnable = base.isActiveHandinMeasurementEnable();
        if (base instanceof FapControlCdma2000OneXActiveHandinMeasurementImpl) {
            FapControlCdma2000OneXActiveHandinMeasurementImpl impl = (FapControlCdma2000OneXActiveHandinMeasurementImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXActiveHandinMeasurementG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXActiveHandinMeasurementG) {
            this._activeHandinMeasurementEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXActiveHandinMeasurementG)arg).isActiveHandinMeasurementEnable();
            this._activeHandInMeasurementDuration = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXActiveHandinMeasurementG)arg).getActiveHandInMeasurementDuration();
            this._measurementReportThreshold = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXActiveHandinMeasurementG)arg).getMeasurementReportThreshold();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXActiveHandinMeasurementG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getActiveHandInMeasurementDuration() {
        return _activeHandInMeasurementDuration;
    }
    
    public java.lang.Long getMeasurementReportThreshold() {
        return _measurementReportThreshold;
    }
    
    public java.lang.Boolean isActiveHandinMeasurementEnable() {
        return _activeHandinMeasurementEnable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkActiveHandInMeasurementDurationRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public FapControlCdma2000OneXActiveHandinMeasurementBuilder setActiveHandInMeasurementDuration(final java.lang.Integer value) {
    if (value != null) {
        checkActiveHandInMeasurementDurationRange(value);
    }
        this._activeHandInMeasurementDuration = value;
        return this;
    }
    
     
    public FapControlCdma2000OneXActiveHandinMeasurementBuilder setMeasurementReportThreshold(final java.lang.Long value) {
        this._measurementReportThreshold = value;
        return this;
    }
    
     
    public FapControlCdma2000OneXActiveHandinMeasurementBuilder setActiveHandinMeasurementEnable(final java.lang.Boolean value) {
        this._activeHandinMeasurementEnable = value;
        return this;
    }
    
    public FapControlCdma2000OneXActiveHandinMeasurementBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlCdma2000OneXActiveHandinMeasurementBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControlCdma2000OneXActiveHandinMeasurement build() {
        return new FapControlCdma2000OneXActiveHandinMeasurementImpl(this);
    }

    private static final class FapControlCdma2000OneXActiveHandinMeasurementImpl implements FapControlCdma2000OneXActiveHandinMeasurement {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement.class;
        }

        private final java.lang.Integer _activeHandInMeasurementDuration;
        private final java.lang.Long _measurementReportThreshold;
        private final java.lang.Boolean _activeHandinMeasurementEnable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>> augmentation = Collections.emptyMap();

        private FapControlCdma2000OneXActiveHandinMeasurementImpl(FapControlCdma2000OneXActiveHandinMeasurementBuilder base) {
            this._activeHandInMeasurementDuration = base.getActiveHandInMeasurementDuration();
            this._measurementReportThreshold = base.getMeasurementReportThreshold();
            this._activeHandinMeasurementEnable = base.isActiveHandinMeasurementEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getActiveHandInMeasurementDuration() {
            return _activeHandInMeasurementDuration;
        }
        
        @Override
        public java.lang.Long getMeasurementReportThreshold() {
            return _measurementReportThreshold;
        }
        
        @Override
        public java.lang.Boolean isActiveHandinMeasurementEnable() {
            return _activeHandinMeasurementEnable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_activeHandInMeasurementDuration);
            result = prime * result + Objects.hashCode(_measurementReportThreshold);
            result = prime * result + Objects.hashCode(_activeHandinMeasurementEnable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement)obj;
            if (!Objects.equals(_activeHandInMeasurementDuration, other.getActiveHandInMeasurementDuration())) {
                return false;
            }
            if (!Objects.equals(_measurementReportThreshold, other.getMeasurementReportThreshold())) {
                return false;
            }
            if (!Objects.equals(_activeHandinMeasurementEnable, other.isActiveHandinMeasurementEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FapControlCdma2000OneXActiveHandinMeasurementImpl otherImpl = (FapControlCdma2000OneXActiveHandinMeasurementImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControlCdma2000OneXActiveHandinMeasurement [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_activeHandInMeasurementDuration != null) {
                builder.append("_activeHandInMeasurementDuration=");
                builder.append(_activeHandInMeasurementDuration);
                builder.append(", ");
            }
            if (_measurementReportThreshold != null) {
                builder.append("_measurementReportThreshold=");
                builder.append(_measurementReportThreshold);
                builder.append(", ");
            }
            if (_activeHandinMeasurementEnable != null) {
                builder.append("_activeHandinMeasurementEnable=");
                builder.append(_activeHandinMeasurementEnable);
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
