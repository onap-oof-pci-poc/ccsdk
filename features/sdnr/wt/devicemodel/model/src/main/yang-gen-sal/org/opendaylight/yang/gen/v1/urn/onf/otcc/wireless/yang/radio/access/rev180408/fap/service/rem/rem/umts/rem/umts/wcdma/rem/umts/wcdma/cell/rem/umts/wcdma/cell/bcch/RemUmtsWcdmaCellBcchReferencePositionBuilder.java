package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition
 *
 */
public class RemUmtsWcdmaCellBcchReferencePositionBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition> {

    private java.lang.Short _confidence;
    private java.lang.Long _latitude;
    private java.lang.Long _longitude;
    private java.lang.Short _orientationOfMajorAxis;
    private java.lang.Short _uncertaintySemiMajor;
    private java.lang.Short _uncertaintySemiMinor;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>> augmentation = Collections.emptyMap();

    public RemUmtsWcdmaCellBcchReferencePositionBuilder() {
    }
    public RemUmtsWcdmaCellBcchReferencePositionBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchReferencePositionG arg) {
        this._latitude = arg.getLatitude();
        this._longitude = arg.getLongitude();
        this._uncertaintySemiMajor = arg.getUncertaintySemiMajor();
        this._uncertaintySemiMinor = arg.getUncertaintySemiMinor();
        this._orientationOfMajorAxis = arg.getOrientationOfMajorAxis();
        this._confidence = arg.getConfidence();
    }

    public RemUmtsWcdmaCellBcchReferencePositionBuilder(RemUmtsWcdmaCellBcchReferencePosition base) {
        this._confidence = base.getConfidence();
        this._latitude = base.getLatitude();
        this._longitude = base.getLongitude();
        this._orientationOfMajorAxis = base.getOrientationOfMajorAxis();
        this._uncertaintySemiMajor = base.getUncertaintySemiMajor();
        this._uncertaintySemiMinor = base.getUncertaintySemiMinor();
        if (base instanceof RemUmtsWcdmaCellBcchReferencePositionImpl) {
            RemUmtsWcdmaCellBcchReferencePositionImpl impl = (RemUmtsWcdmaCellBcchReferencePositionImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchReferencePositionG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchReferencePositionG) {
            this._latitude = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchReferencePositionG)arg).getLatitude();
            this._longitude = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchReferencePositionG)arg).getLongitude();
            this._uncertaintySemiMajor = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchReferencePositionG)arg).getUncertaintySemiMajor();
            this._uncertaintySemiMinor = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchReferencePositionG)arg).getUncertaintySemiMinor();
            this._orientationOfMajorAxis = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchReferencePositionG)arg).getOrientationOfMajorAxis();
            this._confidence = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchReferencePositionG)arg).getConfidence();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchReferencePositionG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getConfidence() {
        return _confidence;
    }
    
    public java.lang.Long getLatitude() {
        return _latitude;
    }
    
    public java.lang.Long getLongitude() {
        return _longitude;
    }
    
    public java.lang.Short getOrientationOfMajorAxis() {
        return _orientationOfMajorAxis;
    }
    
    public java.lang.Short getUncertaintySemiMajor() {
        return _uncertaintySemiMajor;
    }
    
    public java.lang.Short getUncertaintySemiMinor() {
        return _uncertaintySemiMinor;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkConfidenceRange(final short value) {
         if (value >= (short)0 && value <= (short)100) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..100]].", value));
     }
    
    public RemUmtsWcdmaCellBcchReferencePositionBuilder setConfidence(final java.lang.Short value) {
    if (value != null) {
        checkConfidenceRange(value);
    }
        this._confidence = value;
        return this;
    }
    
     
    public RemUmtsWcdmaCellBcchReferencePositionBuilder setLatitude(final java.lang.Long value) {
        this._latitude = value;
        return this;
    }
    
     
    public RemUmtsWcdmaCellBcchReferencePositionBuilder setLongitude(final java.lang.Long value) {
        this._longitude = value;
        return this;
    }
    
     
     private static void checkOrientationOfMajorAxisRange(final short value) {
         if (value >= (short)0 && value <= (short)89) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..89]].", value));
     }
    
    public RemUmtsWcdmaCellBcchReferencePositionBuilder setOrientationOfMajorAxis(final java.lang.Short value) {
    if (value != null) {
        checkOrientationOfMajorAxisRange(value);
    }
        this._orientationOfMajorAxis = value;
        return this;
    }
    
     
     private static void checkUncertaintySemiMajorRange(final short value) {
         if (value >= (short)0 && value <= (short)127) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..127]].", value));
     }
    
    public RemUmtsWcdmaCellBcchReferencePositionBuilder setUncertaintySemiMajor(final java.lang.Short value) {
    if (value != null) {
        checkUncertaintySemiMajorRange(value);
    }
        this._uncertaintySemiMajor = value;
        return this;
    }
    
     
     private static void checkUncertaintySemiMinorRange(final short value) {
         if (value >= (short)0 && value <= (short)127) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..127]].", value));
     }
    
    public RemUmtsWcdmaCellBcchReferencePositionBuilder setUncertaintySemiMinor(final java.lang.Short value) {
    if (value != null) {
        checkUncertaintySemiMinorRange(value);
    }
        this._uncertaintySemiMinor = value;
        return this;
    }
    
    public RemUmtsWcdmaCellBcchReferencePositionBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemUmtsWcdmaCellBcchReferencePositionBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemUmtsWcdmaCellBcchReferencePosition build() {
        return new RemUmtsWcdmaCellBcchReferencePositionImpl(this);
    }

    private static final class RemUmtsWcdmaCellBcchReferencePositionImpl implements RemUmtsWcdmaCellBcchReferencePosition {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition.class;
        }

        private final java.lang.Short _confidence;
        private final java.lang.Long _latitude;
        private final java.lang.Long _longitude;
        private final java.lang.Short _orientationOfMajorAxis;
        private final java.lang.Short _uncertaintySemiMajor;
        private final java.lang.Short _uncertaintySemiMinor;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>> augmentation = Collections.emptyMap();

        private RemUmtsWcdmaCellBcchReferencePositionImpl(RemUmtsWcdmaCellBcchReferencePositionBuilder base) {
            this._confidence = base.getConfidence();
            this._latitude = base.getLatitude();
            this._longitude = base.getLongitude();
            this._orientationOfMajorAxis = base.getOrientationOfMajorAxis();
            this._uncertaintySemiMajor = base.getUncertaintySemiMajor();
            this._uncertaintySemiMinor = base.getUncertaintySemiMinor();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getConfidence() {
            return _confidence;
        }
        
        @Override
        public java.lang.Long getLatitude() {
            return _latitude;
        }
        
        @Override
        public java.lang.Long getLongitude() {
            return _longitude;
        }
        
        @Override
        public java.lang.Short getOrientationOfMajorAxis() {
            return _orientationOfMajorAxis;
        }
        
        @Override
        public java.lang.Short getUncertaintySemiMajor() {
            return _uncertaintySemiMajor;
        }
        
        @Override
        public java.lang.Short getUncertaintySemiMinor() {
            return _uncertaintySemiMinor;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_confidence);
            result = prime * result + Objects.hashCode(_latitude);
            result = prime * result + Objects.hashCode(_longitude);
            result = prime * result + Objects.hashCode(_orientationOfMajorAxis);
            result = prime * result + Objects.hashCode(_uncertaintySemiMajor);
            result = prime * result + Objects.hashCode(_uncertaintySemiMinor);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition)obj;
            if (!Objects.equals(_confidence, other.getConfidence())) {
                return false;
            }
            if (!Objects.equals(_latitude, other.getLatitude())) {
                return false;
            }
            if (!Objects.equals(_longitude, other.getLongitude())) {
                return false;
            }
            if (!Objects.equals(_orientationOfMajorAxis, other.getOrientationOfMajorAxis())) {
                return false;
            }
            if (!Objects.equals(_uncertaintySemiMajor, other.getUncertaintySemiMajor())) {
                return false;
            }
            if (!Objects.equals(_uncertaintySemiMinor, other.getUncertaintySemiMinor())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemUmtsWcdmaCellBcchReferencePositionImpl otherImpl = (RemUmtsWcdmaCellBcchReferencePositionImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchReferencePosition>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemUmtsWcdmaCellBcchReferencePosition [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_confidence != null) {
                builder.append("_confidence=");
                builder.append(_confidence);
                builder.append(", ");
            }
            if (_latitude != null) {
                builder.append("_latitude=");
                builder.append(_latitude);
                builder.append(", ");
            }
            if (_longitude != null) {
                builder.append("_longitude=");
                builder.append(_longitude);
                builder.append(", ");
            }
            if (_orientationOfMajorAxis != null) {
                builder.append("_orientationOfMajorAxis=");
                builder.append(_orientationOfMajorAxis);
                builder.append(", ");
            }
            if (_uncertaintySemiMajor != null) {
                builder.append("_uncertaintySemiMajor=");
                builder.append(_uncertaintySemiMajor);
                builder.append(", ");
            }
            if (_uncertaintySemiMinor != null) {
                builder.append("_uncertaintySemiMinor=");
                builder.append(_uncertaintySemiMinor);
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
