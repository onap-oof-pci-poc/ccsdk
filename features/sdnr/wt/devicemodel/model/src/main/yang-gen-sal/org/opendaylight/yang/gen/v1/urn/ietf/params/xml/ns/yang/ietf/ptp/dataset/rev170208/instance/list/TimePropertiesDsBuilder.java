package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs
 *
 */
public class TimePropertiesDsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs> {

    private java.lang.Short _currentUtcOffset;
    private java.lang.Short _timeSource;
    private java.lang.Boolean _currentUtcOffsetValid;
    private java.lang.Boolean _frequencyTraceable;
    private java.lang.Boolean _leap59;
    private java.lang.Boolean _leap61;
    private java.lang.Boolean _ptpTimescale;
    private java.lang.Boolean _timeTraceable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>> augmentation = Collections.emptyMap();

    public TimePropertiesDsBuilder() {
    }
    public TimePropertiesDsBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimePropertiesDsEntry arg) {
        this._currentUtcOffsetValid = arg.isCurrentUtcOffsetValid();
        this._currentUtcOffset = arg.getCurrentUtcOffset();
        this._leap59 = arg.isLeap59();
        this._leap61 = arg.isLeap61();
        this._timeTraceable = arg.isTimeTraceable();
        this._frequencyTraceable = arg.isFrequencyTraceable();
        this._ptpTimescale = arg.isPtpTimescale();
        this._timeSource = arg.getTimeSource();
    }

    public TimePropertiesDsBuilder(TimePropertiesDs base) {
        this._currentUtcOffset = base.getCurrentUtcOffset();
        this._timeSource = base.getTimeSource();
        this._currentUtcOffsetValid = base.isCurrentUtcOffsetValid();
        this._frequencyTraceable = base.isFrequencyTraceable();
        this._leap59 = base.isLeap59();
        this._leap61 = base.isLeap61();
        this._ptpTimescale = base.isPtpTimescale();
        this._timeTraceable = base.isTimeTraceable();
        if (base instanceof TimePropertiesDsImpl) {
            TimePropertiesDsImpl impl = (TimePropertiesDsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimePropertiesDsEntry</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimePropertiesDsEntry) {
            this._currentUtcOffsetValid = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimePropertiesDsEntry)arg).isCurrentUtcOffsetValid();
            this._currentUtcOffset = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimePropertiesDsEntry)arg).getCurrentUtcOffset();
            this._leap59 = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimePropertiesDsEntry)arg).isLeap59();
            this._leap61 = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimePropertiesDsEntry)arg).isLeap61();
            this._timeTraceable = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimePropertiesDsEntry)arg).isTimeTraceable();
            this._frequencyTraceable = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimePropertiesDsEntry)arg).isFrequencyTraceable();
            this._ptpTimescale = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimePropertiesDsEntry)arg).isPtpTimescale();
            this._timeSource = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimePropertiesDsEntry)arg).getTimeSource();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimePropertiesDsEntry] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getCurrentUtcOffset() {
        return _currentUtcOffset;
    }
    
    public java.lang.Short getTimeSource() {
        return _timeSource;
    }
    
    public java.lang.Boolean isCurrentUtcOffsetValid() {
        return _currentUtcOffsetValid;
    }
    
    public java.lang.Boolean isFrequencyTraceable() {
        return _frequencyTraceable;
    }
    
    public java.lang.Boolean isLeap59() {
        return _leap59;
    }
    
    public java.lang.Boolean isLeap61() {
        return _leap61;
    }
    
    public java.lang.Boolean isPtpTimescale() {
        return _ptpTimescale;
    }
    
    public java.lang.Boolean isTimeTraceable() {
        return _timeTraceable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TimePropertiesDsBuilder setCurrentUtcOffset(final java.lang.Short value) {
        this._currentUtcOffset = value;
        return this;
    }
    
     
     private static void checkTimeSourceRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public TimePropertiesDsBuilder setTimeSource(final java.lang.Short value) {
    if (value != null) {
        checkTimeSourceRange(value);
    }
        this._timeSource = value;
        return this;
    }
    
     
    public TimePropertiesDsBuilder setCurrentUtcOffsetValid(final java.lang.Boolean value) {
        this._currentUtcOffsetValid = value;
        return this;
    }
    
     
    public TimePropertiesDsBuilder setFrequencyTraceable(final java.lang.Boolean value) {
        this._frequencyTraceable = value;
        return this;
    }
    
     
    public TimePropertiesDsBuilder setLeap59(final java.lang.Boolean value) {
        this._leap59 = value;
        return this;
    }
    
     
    public TimePropertiesDsBuilder setLeap61(final java.lang.Boolean value) {
        this._leap61 = value;
        return this;
    }
    
     
    public TimePropertiesDsBuilder setPtpTimescale(final java.lang.Boolean value) {
        this._ptpTimescale = value;
        return this;
    }
    
     
    public TimePropertiesDsBuilder setTimeTraceable(final java.lang.Boolean value) {
        this._timeTraceable = value;
        return this;
    }
    
    public TimePropertiesDsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TimePropertiesDsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TimePropertiesDs build() {
        return new TimePropertiesDsImpl(this);
    }

    private static final class TimePropertiesDsImpl implements TimePropertiesDs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs.class;
        }

        private final java.lang.Short _currentUtcOffset;
        private final java.lang.Short _timeSource;
        private final java.lang.Boolean _currentUtcOffsetValid;
        private final java.lang.Boolean _frequencyTraceable;
        private final java.lang.Boolean _leap59;
        private final java.lang.Boolean _leap61;
        private final java.lang.Boolean _ptpTimescale;
        private final java.lang.Boolean _timeTraceable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>> augmentation = Collections.emptyMap();

        private TimePropertiesDsImpl(TimePropertiesDsBuilder base) {
            this._currentUtcOffset = base.getCurrentUtcOffset();
            this._timeSource = base.getTimeSource();
            this._currentUtcOffsetValid = base.isCurrentUtcOffsetValid();
            this._frequencyTraceable = base.isFrequencyTraceable();
            this._leap59 = base.isLeap59();
            this._leap61 = base.isLeap61();
            this._ptpTimescale = base.isPtpTimescale();
            this._timeTraceable = base.isTimeTraceable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getCurrentUtcOffset() {
            return _currentUtcOffset;
        }
        
        @Override
        public java.lang.Short getTimeSource() {
            return _timeSource;
        }
        
        @Override
        public java.lang.Boolean isCurrentUtcOffsetValid() {
            return _currentUtcOffsetValid;
        }
        
        @Override
        public java.lang.Boolean isFrequencyTraceable() {
            return _frequencyTraceable;
        }
        
        @Override
        public java.lang.Boolean isLeap59() {
            return _leap59;
        }
        
        @Override
        public java.lang.Boolean isLeap61() {
            return _leap61;
        }
        
        @Override
        public java.lang.Boolean isPtpTimescale() {
            return _ptpTimescale;
        }
        
        @Override
        public java.lang.Boolean isTimeTraceable() {
            return _timeTraceable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_currentUtcOffset);
            result = prime * result + Objects.hashCode(_timeSource);
            result = prime * result + Objects.hashCode(_currentUtcOffsetValid);
            result = prime * result + Objects.hashCode(_frequencyTraceable);
            result = prime * result + Objects.hashCode(_leap59);
            result = prime * result + Objects.hashCode(_leap61);
            result = prime * result + Objects.hashCode(_ptpTimescale);
            result = prime * result + Objects.hashCode(_timeTraceable);
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
            if (!org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs other = (org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs)obj;
            if (!Objects.equals(_currentUtcOffset, other.getCurrentUtcOffset())) {
                return false;
            }
            if (!Objects.equals(_timeSource, other.getTimeSource())) {
                return false;
            }
            if (!Objects.equals(_currentUtcOffsetValid, other.isCurrentUtcOffsetValid())) {
                return false;
            }
            if (!Objects.equals(_frequencyTraceable, other.isFrequencyTraceable())) {
                return false;
            }
            if (!Objects.equals(_leap59, other.isLeap59())) {
                return false;
            }
            if (!Objects.equals(_leap61, other.isLeap61())) {
                return false;
            }
            if (!Objects.equals(_ptpTimescale, other.isPtpTimescale())) {
                return false;
            }
            if (!Objects.equals(_timeTraceable, other.isTimeTraceable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TimePropertiesDsImpl otherImpl = (TimePropertiesDsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TimePropertiesDs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_currentUtcOffset != null) {
                builder.append("_currentUtcOffset=");
                builder.append(_currentUtcOffset);
                builder.append(", ");
            }
            if (_timeSource != null) {
                builder.append("_timeSource=");
                builder.append(_timeSource);
                builder.append(", ");
            }
            if (_currentUtcOffsetValid != null) {
                builder.append("_currentUtcOffsetValid=");
                builder.append(_currentUtcOffsetValid);
                builder.append(", ");
            }
            if (_frequencyTraceable != null) {
                builder.append("_frequencyTraceable=");
                builder.append(_frequencyTraceable);
                builder.append(", ");
            }
            if (_leap59 != null) {
                builder.append("_leap59=");
                builder.append(_leap59);
                builder.append(", ");
            }
            if (_leap61 != null) {
                builder.append("_leap61=");
                builder.append(_leap61);
                builder.append(", ");
            }
            if (_ptpTimescale != null) {
                builder.append("_ptpTimescale=");
                builder.append(_ptpTimescale);
                builder.append(", ");
            }
            if (_timeTraceable != null) {
                builder.append("_timeTraceable=");
                builder.append(_timeTraceable);
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
