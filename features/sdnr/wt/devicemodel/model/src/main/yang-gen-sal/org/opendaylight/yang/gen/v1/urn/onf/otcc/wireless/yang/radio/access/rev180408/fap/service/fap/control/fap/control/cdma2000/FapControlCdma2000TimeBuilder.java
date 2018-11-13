package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time
 *
 */
public class FapControlCdma2000TimeBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time> {

    private java.lang.String _currentLocalTime;
    private java.lang.Long _leapSeconds;
    private java.lang.String _localTimeZone;
    private java.lang.Boolean _daylightSavingsUsed;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>> augmentation = Collections.emptyMap();

    public FapControlCdma2000TimeBuilder() {
    }
    public FapControlCdma2000TimeBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000TimeG arg) {
        this._localTimeZone = arg.getLocalTimeZone();
        this._currentLocalTime = arg.getCurrentLocalTime();
        this._leapSeconds = arg.getLeapSeconds();
        this._daylightSavingsUsed = arg.isDaylightSavingsUsed();
    }

    public FapControlCdma2000TimeBuilder(FapControlCdma2000Time base) {
        this._currentLocalTime = base.getCurrentLocalTime();
        this._leapSeconds = base.getLeapSeconds();
        this._localTimeZone = base.getLocalTimeZone();
        this._daylightSavingsUsed = base.isDaylightSavingsUsed();
        if (base instanceof FapControlCdma2000TimeImpl) {
            FapControlCdma2000TimeImpl impl = (FapControlCdma2000TimeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000TimeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000TimeG) {
            this._localTimeZone = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000TimeG)arg).getLocalTimeZone();
            this._currentLocalTime = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000TimeG)arg).getCurrentLocalTime();
            this._leapSeconds = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000TimeG)arg).getLeapSeconds();
            this._daylightSavingsUsed = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000TimeG)arg).isDaylightSavingsUsed();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000TimeG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getCurrentLocalTime() {
        return _currentLocalTime;
    }
    
    public java.lang.Long getLeapSeconds() {
        return _leapSeconds;
    }
    
    public java.lang.String getLocalTimeZone() {
        return _localTimeZone;
    }
    
    public java.lang.Boolean isDaylightSavingsUsed() {
        return _daylightSavingsUsed;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void check_currentLocalTimeLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..64]].", value));
     }
    
    public FapControlCdma2000TimeBuilder setCurrentLocalTime(final java.lang.String value) {
    if (value != null) {
        check_currentLocalTimeLength(value);
    }
        this._currentLocalTime = value;
        return this;
    }
    
     
    public FapControlCdma2000TimeBuilder setLeapSeconds(final java.lang.Long value) {
        this._leapSeconds = value;
        return this;
    }
    
     
     private static void check_localTimeZoneLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public FapControlCdma2000TimeBuilder setLocalTimeZone(final java.lang.String value) {
    if (value != null) {
        check_localTimeZoneLength(value);
    }
        this._localTimeZone = value;
        return this;
    }
    
     
    public FapControlCdma2000TimeBuilder setDaylightSavingsUsed(final java.lang.Boolean value) {
        this._daylightSavingsUsed = value;
        return this;
    }
    
    public FapControlCdma2000TimeBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlCdma2000TimeBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControlCdma2000Time build() {
        return new FapControlCdma2000TimeImpl(this);
    }

    private static final class FapControlCdma2000TimeImpl implements FapControlCdma2000Time {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time.class;
        }

        private final java.lang.String _currentLocalTime;
        private final java.lang.Long _leapSeconds;
        private final java.lang.String _localTimeZone;
        private final java.lang.Boolean _daylightSavingsUsed;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>> augmentation = Collections.emptyMap();

        private FapControlCdma2000TimeImpl(FapControlCdma2000TimeBuilder base) {
            this._currentLocalTime = base.getCurrentLocalTime();
            this._leapSeconds = base.getLeapSeconds();
            this._localTimeZone = base.getLocalTimeZone();
            this._daylightSavingsUsed = base.isDaylightSavingsUsed();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getCurrentLocalTime() {
            return _currentLocalTime;
        }
        
        @Override
        public java.lang.Long getLeapSeconds() {
            return _leapSeconds;
        }
        
        @Override
        public java.lang.String getLocalTimeZone() {
            return _localTimeZone;
        }
        
        @Override
        public java.lang.Boolean isDaylightSavingsUsed() {
            return _daylightSavingsUsed;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_currentLocalTime);
            result = prime * result + Objects.hashCode(_leapSeconds);
            result = prime * result + Objects.hashCode(_localTimeZone);
            result = prime * result + Objects.hashCode(_daylightSavingsUsed);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time)obj;
            if (!Objects.equals(_currentLocalTime, other.getCurrentLocalTime())) {
                return false;
            }
            if (!Objects.equals(_leapSeconds, other.getLeapSeconds())) {
                return false;
            }
            if (!Objects.equals(_localTimeZone, other.getLocalTimeZone())) {
                return false;
            }
            if (!Objects.equals(_daylightSavingsUsed, other.isDaylightSavingsUsed())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FapControlCdma2000TimeImpl otherImpl = (FapControlCdma2000TimeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControlCdma2000Time [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_currentLocalTime != null) {
                builder.append("_currentLocalTime=");
                builder.append(_currentLocalTime);
                builder.append(", ");
            }
            if (_leapSeconds != null) {
                builder.append("_leapSeconds=");
                builder.append(_leapSeconds);
                builder.append(", ");
            }
            if (_localTimeZone != null) {
                builder.append("_localTimeZone=");
                builder.append(_localTimeZone);
                builder.append(", ");
            }
            if (_daylightSavingsUsed != null) {
                builder.append("_daylightSavingsUsed=");
                builder.append(_daylightSavingsUsed);
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
