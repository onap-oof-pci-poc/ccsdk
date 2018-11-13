package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.GranularityPeriodType;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.G826Type;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList
 *
 */
public class ThresholdCrossAlarmListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList> {

    private java.lang.Integer _alarmClearingThreshold;
    private java.lang.Integer _alarmRaisingThreshold;
    private G826Type _g826ValueKind;
    private GranularityPeriodType _granularityPeriod;
    private ThresholdCrossAlarmListKey _key;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>> augmentation = Collections.emptyMap();

    public ThresholdCrossAlarmListBuilder() {
    }
    public ThresholdCrossAlarmListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ThresholdCrossAlarmTypeG arg) {
        this._g826ValueKind = arg.getG826ValueKind();
        this._granularityPeriod = arg.getGranularityPeriod();
        this._alarmRaisingThreshold = arg.getAlarmRaisingThreshold();
        this._alarmClearingThreshold = arg.getAlarmClearingThreshold();
    }

    public ThresholdCrossAlarmListBuilder(ThresholdCrossAlarmList base) {
        if (base.getKey() == null) {
            this._key = new ThresholdCrossAlarmListKey(
                base.getG826ValueKind(), 
                base.getGranularityPeriod()
            );
            this._g826ValueKind = base.getG826ValueKind();
            this._granularityPeriod = base.getGranularityPeriod();
        } else {
            this._key = base.getKey();
            this._g826ValueKind = _key.getG826ValueKind();
            this._granularityPeriod = _key.getGranularityPeriod();
        }
        this._alarmClearingThreshold = base.getAlarmClearingThreshold();
        this._alarmRaisingThreshold = base.getAlarmRaisingThreshold();
        if (base instanceof ThresholdCrossAlarmListImpl) {
            ThresholdCrossAlarmListImpl impl = (ThresholdCrossAlarmListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ThresholdCrossAlarmTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ThresholdCrossAlarmTypeG) {
            this._g826ValueKind = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ThresholdCrossAlarmTypeG)arg).getG826ValueKind();
            this._granularityPeriod = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ThresholdCrossAlarmTypeG)arg).getGranularityPeriod();
            this._alarmRaisingThreshold = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ThresholdCrossAlarmTypeG)arg).getAlarmRaisingThreshold();
            this._alarmClearingThreshold = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ThresholdCrossAlarmTypeG)arg).getAlarmClearingThreshold();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ThresholdCrossAlarmTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getAlarmClearingThreshold() {
        return _alarmClearingThreshold;
    }
    
    public java.lang.Integer getAlarmRaisingThreshold() {
        return _alarmRaisingThreshold;
    }
    
    public G826Type getG826ValueKind() {
        return _g826ValueKind;
    }
    
    public GranularityPeriodType getGranularityPeriod() {
        return _granularityPeriod;
    }
    
    public ThresholdCrossAlarmListKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ThresholdCrossAlarmListBuilder setAlarmClearingThreshold(final java.lang.Integer value) {
        this._alarmClearingThreshold = value;
        return this;
    }
    
     
    public ThresholdCrossAlarmListBuilder setAlarmRaisingThreshold(final java.lang.Integer value) {
        this._alarmRaisingThreshold = value;
        return this;
    }
    
     
    public ThresholdCrossAlarmListBuilder setG826ValueKind(final G826Type value) {
        this._g826ValueKind = value;
        return this;
    }
    
     
    public ThresholdCrossAlarmListBuilder setGranularityPeriod(final GranularityPeriodType value) {
        this._granularityPeriod = value;
        return this;
    }
    
     
    public ThresholdCrossAlarmListBuilder setKey(final ThresholdCrossAlarmListKey value) {
        this._key = value;
        return this;
    }
    
    public ThresholdCrossAlarmListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ThresholdCrossAlarmListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ThresholdCrossAlarmList build() {
        return new ThresholdCrossAlarmListImpl(this);
    }

    private static final class ThresholdCrossAlarmListImpl implements ThresholdCrossAlarmList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList.class;
        }

        private final java.lang.Integer _alarmClearingThreshold;
        private final java.lang.Integer _alarmRaisingThreshold;
        private final G826Type _g826ValueKind;
        private final GranularityPeriodType _granularityPeriod;
        private final ThresholdCrossAlarmListKey _key;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>> augmentation = Collections.emptyMap();

        private ThresholdCrossAlarmListImpl(ThresholdCrossAlarmListBuilder base) {
            if (base.getKey() == null) {
                this._key = new ThresholdCrossAlarmListKey(
                    base.getG826ValueKind(), 
                    base.getGranularityPeriod()
                );
                this._g826ValueKind = base.getG826ValueKind();
                this._granularityPeriod = base.getGranularityPeriod();
            } else {
                this._key = base.getKey();
                this._g826ValueKind = _key.getG826ValueKind();
                this._granularityPeriod = _key.getGranularityPeriod();
            }
            this._alarmClearingThreshold = base.getAlarmClearingThreshold();
            this._alarmRaisingThreshold = base.getAlarmRaisingThreshold();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getAlarmClearingThreshold() {
            return _alarmClearingThreshold;
        }
        
        @Override
        public java.lang.Integer getAlarmRaisingThreshold() {
            return _alarmRaisingThreshold;
        }
        
        @Override
        public G826Type getG826ValueKind() {
            return _g826ValueKind;
        }
        
        @Override
        public GranularityPeriodType getGranularityPeriod() {
            return _granularityPeriod;
        }
        
        @Override
        public ThresholdCrossAlarmListKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_alarmClearingThreshold);
            result = prime * result + Objects.hashCode(_alarmRaisingThreshold);
            result = prime * result + Objects.hashCode(_g826ValueKind);
            result = prime * result + Objects.hashCode(_granularityPeriod);
            result = prime * result + Objects.hashCode(_key);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList)obj;
            if (!Objects.equals(_alarmClearingThreshold, other.getAlarmClearingThreshold())) {
                return false;
            }
            if (!Objects.equals(_alarmRaisingThreshold, other.getAlarmRaisingThreshold())) {
                return false;
            }
            if (!Objects.equals(_g826ValueKind, other.getG826ValueKind())) {
                return false;
            }
            if (!Objects.equals(_granularityPeriod, other.getGranularityPeriod())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ThresholdCrossAlarmListImpl otherImpl = (ThresholdCrossAlarmListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ThresholdCrossAlarmList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alarmClearingThreshold != null) {
                builder.append("_alarmClearingThreshold=");
                builder.append(_alarmClearingThreshold);
                builder.append(", ");
            }
            if (_alarmRaisingThreshold != null) {
                builder.append("_alarmRaisingThreshold=");
                builder.append(_alarmRaisingThreshold);
                builder.append(", ");
            }
            if (_g826ValueKind != null) {
                builder.append("_g826ValueKind=");
                builder.append(_g826ValueKind);
                builder.append(", ");
            }
            if (_granularityPeriod != null) {
                builder.append("_granularityPeriod=");
                builder.append(_granularityPeriod);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
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
