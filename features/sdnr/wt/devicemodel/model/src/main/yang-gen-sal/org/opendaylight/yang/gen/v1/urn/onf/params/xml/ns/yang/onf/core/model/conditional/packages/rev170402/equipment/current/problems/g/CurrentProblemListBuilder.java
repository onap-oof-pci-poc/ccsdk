package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SeverityType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList
 *
 */
public class CurrentProblemListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList> {

    private CurrentProblemListKey _key;
    private java.lang.String _problemName;
    private SeverityType _problemSeverity;
    private java.lang.Integer _sequenceNumber;
    private DateAndTime _timeStamp;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>> augmentation = Collections.emptyMap();

    public CurrentProblemListBuilder() {
    }
    public CurrentProblemListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.CurrentProblemTypeG arg) {
        this._problemName = arg.getProblemName();
        this._sequenceNumber = arg.getSequenceNumber();
        this._timeStamp = arg.getTimeStamp();
        this._problemSeverity = arg.getProblemSeverity();
    }
    public CurrentProblemListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwCurrentProblemG arg) {
        this._sequenceNumber = arg.getSequenceNumber();
        this._timeStamp = arg.getTimeStamp();
        this._problemSeverity = arg.getProblemSeverity();
    }

    public CurrentProblemListBuilder(CurrentProblemList base) {
        if (base.getKey() == null) {
            this._key = new CurrentProblemListKey(
                base.getSequenceNumber()
            );
            this._sequenceNumber = base.getSequenceNumber();
        } else {
            this._key = base.getKey();
            this._sequenceNumber = _key.getSequenceNumber();
        }
        this._problemName = base.getProblemName();
        this._problemSeverity = base.getProblemSeverity();
        this._timeStamp = base.getTimeStamp();
        if (base instanceof CurrentProblemListImpl) {
            CurrentProblemListImpl impl = (CurrentProblemListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.CurrentProblemTypeG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwCurrentProblemG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.CurrentProblemTypeG) {
            this._problemName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.CurrentProblemTypeG)arg).getProblemName();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwCurrentProblemG) {
            this._sequenceNumber = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwCurrentProblemG)arg).getSequenceNumber();
            this._timeStamp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwCurrentProblemG)arg).getTimeStamp();
            this._problemSeverity = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwCurrentProblemG)arg).getProblemSeverity();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.CurrentProblemTypeG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwCurrentProblemG] \n" +
              "but was: " + arg
            );
        }
    }

    public CurrentProblemListKey getKey() {
        return _key;
    }
    
    public java.lang.String getProblemName() {
        return _problemName;
    }
    
    public SeverityType getProblemSeverity() {
        return _problemSeverity;
    }
    
    public java.lang.Integer getSequenceNumber() {
        return _sequenceNumber;
    }
    
    public DateAndTime getTimeStamp() {
        return _timeStamp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CurrentProblemListBuilder setKey(final CurrentProblemListKey value) {
        this._key = value;
        return this;
    }
    
     
    public CurrentProblemListBuilder setProblemName(final java.lang.String value) {
        this._problemName = value;
        return this;
    }
    
     
    public CurrentProblemListBuilder setProblemSeverity(final SeverityType value) {
        this._problemSeverity = value;
        return this;
    }
    
     
    public CurrentProblemListBuilder setSequenceNumber(final java.lang.Integer value) {
        this._sequenceNumber = value;
        return this;
    }
    
     
    public CurrentProblemListBuilder setTimeStamp(final DateAndTime value) {
        this._timeStamp = value;
        return this;
    }
    
    public CurrentProblemListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CurrentProblemListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CurrentProblemList build() {
        return new CurrentProblemListImpl(this);
    }

    private static final class CurrentProblemListImpl implements CurrentProblemList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList.class;
        }

        private final CurrentProblemListKey _key;
        private final java.lang.String _problemName;
        private final SeverityType _problemSeverity;
        private final java.lang.Integer _sequenceNumber;
        private final DateAndTime _timeStamp;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>> augmentation = Collections.emptyMap();

        private CurrentProblemListImpl(CurrentProblemListBuilder base) {
            if (base.getKey() == null) {
                this._key = new CurrentProblemListKey(
                    base.getSequenceNumber()
                );
                this._sequenceNumber = base.getSequenceNumber();
            } else {
                this._key = base.getKey();
                this._sequenceNumber = _key.getSequenceNumber();
            }
            this._problemName = base.getProblemName();
            this._problemSeverity = base.getProblemSeverity();
            this._timeStamp = base.getTimeStamp();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public CurrentProblemListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getProblemName() {
            return _problemName;
        }
        
        @Override
        public SeverityType getProblemSeverity() {
            return _problemSeverity;
        }
        
        @Override
        public java.lang.Integer getSequenceNumber() {
            return _sequenceNumber;
        }
        
        @Override
        public DateAndTime getTimeStamp() {
            return _timeStamp;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_problemName);
            result = prime * result + Objects.hashCode(_problemSeverity);
            result = prime * result + Objects.hashCode(_sequenceNumber);
            result = prime * result + Objects.hashCode(_timeStamp);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_problemName, other.getProblemName())) {
                return false;
            }
            if (!Objects.equals(_problemSeverity, other.getProblemSeverity())) {
                return false;
            }
            if (!Objects.equals(_sequenceNumber, other.getSequenceNumber())) {
                return false;
            }
            if (!Objects.equals(_timeStamp, other.getTimeStamp())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CurrentProblemListImpl otherImpl = (CurrentProblemListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.current.problems.g.CurrentProblemList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "CurrentProblemList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_problemName != null) {
                builder.append("_problemName=");
                builder.append(_problemName);
                builder.append(", ");
            }
            if (_problemSeverity != null) {
                builder.append("_problemSeverity=");
                builder.append(_problemSeverity);
                builder.append(", ");
            }
            if (_sequenceNumber != null) {
                builder.append("_sequenceNumber=");
                builder.append(_sequenceNumber);
                builder.append(", ");
            }
            if (_timeStamp != null) {
                builder.append("_timeStamp=");
                builder.append(_timeStamp);
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
