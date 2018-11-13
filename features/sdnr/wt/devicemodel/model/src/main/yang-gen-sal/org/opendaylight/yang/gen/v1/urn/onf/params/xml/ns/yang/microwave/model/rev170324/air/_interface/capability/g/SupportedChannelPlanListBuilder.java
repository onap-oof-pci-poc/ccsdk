package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.channel.plan.type.g.TransmissionModeList;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList
 *
 */
public class SupportedChannelPlanListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList> {

    private java.lang.Integer _duplexDistance;
    private SupportedChannelPlanListKey _key;
    private java.lang.String _supportedChannelPlan;
    private List<TransmissionModeList> _transmissionModeList;
    private java.lang.Boolean _autoFreqSelectIsAvail;
    private java.lang.Boolean _duplexDistanceIsVariable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>> augmentation = Collections.emptyMap();

    public SupportedChannelPlanListBuilder() {
    }
    public SupportedChannelPlanListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ChannelPlanTypeG arg) {
        this._supportedChannelPlan = arg.getSupportedChannelPlan();
        this._duplexDistanceIsVariable = arg.isDuplexDistanceIsVariable();
        this._duplexDistance = arg.getDuplexDistance();
        this._autoFreqSelectIsAvail = arg.isAutoFreqSelectIsAvail();
        this._transmissionModeList = arg.getTransmissionModeList();
    }

    public SupportedChannelPlanListBuilder(SupportedChannelPlanList base) {
        if (base.getKey() == null) {
            this._key = new SupportedChannelPlanListKey(
                base.getSupportedChannelPlan()
            );
            this._supportedChannelPlan = base.getSupportedChannelPlan();
        } else {
            this._key = base.getKey();
            this._supportedChannelPlan = _key.getSupportedChannelPlan();
        }
        this._duplexDistance = base.getDuplexDistance();
        this._transmissionModeList = base.getTransmissionModeList();
        this._autoFreqSelectIsAvail = base.isAutoFreqSelectIsAvail();
        this._duplexDistanceIsVariable = base.isDuplexDistanceIsVariable();
        if (base instanceof SupportedChannelPlanListImpl) {
            SupportedChannelPlanListImpl impl = (SupportedChannelPlanListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ChannelPlanTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ChannelPlanTypeG) {
            this._supportedChannelPlan = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ChannelPlanTypeG)arg).getSupportedChannelPlan();
            this._duplexDistanceIsVariable = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ChannelPlanTypeG)arg).isDuplexDistanceIsVariable();
            this._duplexDistance = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ChannelPlanTypeG)arg).getDuplexDistance();
            this._autoFreqSelectIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ChannelPlanTypeG)arg).isAutoFreqSelectIsAvail();
            this._transmissionModeList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ChannelPlanTypeG)arg).getTransmissionModeList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ChannelPlanTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getDuplexDistance() {
        return _duplexDistance;
    }
    
    public SupportedChannelPlanListKey getKey() {
        return _key;
    }
    
    public java.lang.String getSupportedChannelPlan() {
        return _supportedChannelPlan;
    }
    
    public List<TransmissionModeList> getTransmissionModeList() {
        return _transmissionModeList;
    }
    
    public java.lang.Boolean isAutoFreqSelectIsAvail() {
        return _autoFreqSelectIsAvail;
    }
    
    public java.lang.Boolean isDuplexDistanceIsVariable() {
        return _duplexDistanceIsVariable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SupportedChannelPlanListBuilder setDuplexDistance(final java.lang.Integer value) {
        this._duplexDistance = value;
        return this;
    }
    
     
    public SupportedChannelPlanListBuilder setKey(final SupportedChannelPlanListKey value) {
        this._key = value;
        return this;
    }
    
     
    public SupportedChannelPlanListBuilder setSupportedChannelPlan(final java.lang.String value) {
        this._supportedChannelPlan = value;
        return this;
    }
    
     
    public SupportedChannelPlanListBuilder setTransmissionModeList(final List<TransmissionModeList> value) {
        this._transmissionModeList = value;
        return this;
    }
    
     
    public SupportedChannelPlanListBuilder setAutoFreqSelectIsAvail(final java.lang.Boolean value) {
        this._autoFreqSelectIsAvail = value;
        return this;
    }
    
     
    public SupportedChannelPlanListBuilder setDuplexDistanceIsVariable(final java.lang.Boolean value) {
        this._duplexDistanceIsVariable = value;
        return this;
    }
    
    public SupportedChannelPlanListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SupportedChannelPlanListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SupportedChannelPlanList build() {
        return new SupportedChannelPlanListImpl(this);
    }

    private static final class SupportedChannelPlanListImpl implements SupportedChannelPlanList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList.class;
        }

        private final java.lang.Integer _duplexDistance;
        private final SupportedChannelPlanListKey _key;
        private final java.lang.String _supportedChannelPlan;
        private final List<TransmissionModeList> _transmissionModeList;
        private final java.lang.Boolean _autoFreqSelectIsAvail;
        private final java.lang.Boolean _duplexDistanceIsVariable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>> augmentation = Collections.emptyMap();

        private SupportedChannelPlanListImpl(SupportedChannelPlanListBuilder base) {
            if (base.getKey() == null) {
                this._key = new SupportedChannelPlanListKey(
                    base.getSupportedChannelPlan()
                );
                this._supportedChannelPlan = base.getSupportedChannelPlan();
            } else {
                this._key = base.getKey();
                this._supportedChannelPlan = _key.getSupportedChannelPlan();
            }
            this._duplexDistance = base.getDuplexDistance();
            this._transmissionModeList = base.getTransmissionModeList();
            this._autoFreqSelectIsAvail = base.isAutoFreqSelectIsAvail();
            this._duplexDistanceIsVariable = base.isDuplexDistanceIsVariable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getDuplexDistance() {
            return _duplexDistance;
        }
        
        @Override
        public SupportedChannelPlanListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getSupportedChannelPlan() {
            return _supportedChannelPlan;
        }
        
        @Override
        public List<TransmissionModeList> getTransmissionModeList() {
            return _transmissionModeList;
        }
        
        @Override
        public java.lang.Boolean isAutoFreqSelectIsAvail() {
            return _autoFreqSelectIsAvail;
        }
        
        @Override
        public java.lang.Boolean isDuplexDistanceIsVariable() {
            return _duplexDistanceIsVariable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_duplexDistance);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_supportedChannelPlan);
            result = prime * result + Objects.hashCode(_transmissionModeList);
            result = prime * result + Objects.hashCode(_autoFreqSelectIsAvail);
            result = prime * result + Objects.hashCode(_duplexDistanceIsVariable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList)obj;
            if (!Objects.equals(_duplexDistance, other.getDuplexDistance())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_supportedChannelPlan, other.getSupportedChannelPlan())) {
                return false;
            }
            if (!Objects.equals(_transmissionModeList, other.getTransmissionModeList())) {
                return false;
            }
            if (!Objects.equals(_autoFreqSelectIsAvail, other.isAutoFreqSelectIsAvail())) {
                return false;
            }
            if (!Objects.equals(_duplexDistanceIsVariable, other.isDuplexDistanceIsVariable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SupportedChannelPlanListImpl otherImpl = (SupportedChannelPlanListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.capability.g.SupportedChannelPlanList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SupportedChannelPlanList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_duplexDistance != null) {
                builder.append("_duplexDistance=");
                builder.append(_duplexDistance);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_supportedChannelPlan != null) {
                builder.append("_supportedChannelPlan=");
                builder.append(_supportedChannelPlan);
                builder.append(", ");
            }
            if (_transmissionModeList != null) {
                builder.append("_transmissionModeList=");
                builder.append(_transmissionModeList);
                builder.append(", ");
            }
            if (_autoFreqSelectIsAvail != null) {
                builder.append("_autoFreqSelectIsAvail=");
                builder.append(_autoFreqSelectIsAvail);
                builder.append(", ");
            }
            if (_duplexDistanceIsVariable != null) {
                builder.append("_duplexDistanceIsVariable=");
                builder.append(_duplexDistanceIsVariable);
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
