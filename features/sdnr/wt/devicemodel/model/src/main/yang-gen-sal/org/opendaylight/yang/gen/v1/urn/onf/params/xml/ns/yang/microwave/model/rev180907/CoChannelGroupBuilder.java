package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup
 *
 */
public class CoChannelGroupBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup> {

    private List<UniversalId> _airInterfaceList;
    private UniversalId _coChannelGroupId;
    private CoChannelGroupKey _key;
    private List<UniversalId> _logicalTerminationPoint;
    private java.lang.String _sortOfCoChannelGroup;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>> augmentation = Collections.emptyMap();

    public CoChannelGroupBuilder() {
    }
    public CoChannelGroupBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroupG arg) {
        this._coChannelGroupId = arg.getCoChannelGroupId();
        this._airInterfaceList = arg.getAirInterfaceList();
        this._sortOfCoChannelGroup = arg.getSortOfCoChannelGroup();
        this._logicalTerminationPoint = arg.getLogicalTerminationPoint();
    }

    public CoChannelGroupBuilder(CoChannelGroup base) {
        if (base.getKey() == null) {
            this._key = new CoChannelGroupKey(
                base.getCoChannelGroupId()
            );
            this._coChannelGroupId = base.getCoChannelGroupId();
        } else {
            this._key = base.getKey();
            this._coChannelGroupId = _key.getCoChannelGroupId();
        }
        this._airInterfaceList = base.getAirInterfaceList();
        this._logicalTerminationPoint = base.getLogicalTerminationPoint();
        this._sortOfCoChannelGroup = base.getSortOfCoChannelGroup();
        if (base instanceof CoChannelGroupImpl) {
            CoChannelGroupImpl impl = (CoChannelGroupImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroupG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroupG) {
            this._coChannelGroupId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroupG)arg).getCoChannelGroupId();
            this._airInterfaceList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroupG)arg).getAirInterfaceList();
            this._sortOfCoChannelGroup = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroupG)arg).getSortOfCoChannelGroup();
            this._logicalTerminationPoint = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroupG)arg).getLogicalTerminationPoint();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroupG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<UniversalId> getAirInterfaceList() {
        return _airInterfaceList;
    }
    
    public UniversalId getCoChannelGroupId() {
        return _coChannelGroupId;
    }
    
    public CoChannelGroupKey getKey() {
        return _key;
    }
    
    public List<UniversalId> getLogicalTerminationPoint() {
        return _logicalTerminationPoint;
    }
    
    public java.lang.String getSortOfCoChannelGroup() {
        return _sortOfCoChannelGroup;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CoChannelGroupBuilder setAirInterfaceList(final List<UniversalId> value) {
        this._airInterfaceList = value;
        return this;
    }
    
     
    public CoChannelGroupBuilder setCoChannelGroupId(final UniversalId value) {
        this._coChannelGroupId = value;
        return this;
    }
    
     
    public CoChannelGroupBuilder setKey(final CoChannelGroupKey value) {
        this._key = value;
        return this;
    }
    
     
    public CoChannelGroupBuilder setLogicalTerminationPoint(final List<UniversalId> value) {
        this._logicalTerminationPoint = value;
        return this;
    }
    
     
    public CoChannelGroupBuilder setSortOfCoChannelGroup(final java.lang.String value) {
        this._sortOfCoChannelGroup = value;
        return this;
    }
    
    public CoChannelGroupBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CoChannelGroupBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CoChannelGroup build() {
        return new CoChannelGroupImpl(this);
    }

    private static final class CoChannelGroupImpl implements CoChannelGroup {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup.class;
        }

        private final List<UniversalId> _airInterfaceList;
        private final UniversalId _coChannelGroupId;
        private final CoChannelGroupKey _key;
        private final List<UniversalId> _logicalTerminationPoint;
        private final java.lang.String _sortOfCoChannelGroup;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>> augmentation = Collections.emptyMap();

        private CoChannelGroupImpl(CoChannelGroupBuilder base) {
            if (base.getKey() == null) {
                this._key = new CoChannelGroupKey(
                    base.getCoChannelGroupId()
                );
                this._coChannelGroupId = base.getCoChannelGroupId();
            } else {
                this._key = base.getKey();
                this._coChannelGroupId = _key.getCoChannelGroupId();
            }
            this._airInterfaceList = base.getAirInterfaceList();
            this._logicalTerminationPoint = base.getLogicalTerminationPoint();
            this._sortOfCoChannelGroup = base.getSortOfCoChannelGroup();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<UniversalId> getAirInterfaceList() {
            return _airInterfaceList;
        }
        
        @Override
        public UniversalId getCoChannelGroupId() {
            return _coChannelGroupId;
        }
        
        @Override
        public CoChannelGroupKey getKey() {
            return _key;
        }
        
        @Override
        public List<UniversalId> getLogicalTerminationPoint() {
            return _logicalTerminationPoint;
        }
        
        @Override
        public java.lang.String getSortOfCoChannelGroup() {
            return _sortOfCoChannelGroup;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_airInterfaceList);
            result = prime * result + Objects.hashCode(_coChannelGroupId);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_logicalTerminationPoint);
            result = prime * result + Objects.hashCode(_sortOfCoChannelGroup);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup)obj;
            if (!Objects.equals(_airInterfaceList, other.getAirInterfaceList())) {
                return false;
            }
            if (!Objects.equals(_coChannelGroupId, other.getCoChannelGroupId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_logicalTerminationPoint, other.getLogicalTerminationPoint())) {
                return false;
            }
            if (!Objects.equals(_sortOfCoChannelGroup, other.getSortOfCoChannelGroup())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CoChannelGroupImpl otherImpl = (CoChannelGroupImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.CoChannelGroup>> e : augmentation.entrySet()) {
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
            java.lang.String name = "CoChannelGroup [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_airInterfaceList != null) {
                builder.append("_airInterfaceList=");
                builder.append(_airInterfaceList);
                builder.append(", ");
            }
            if (_coChannelGroupId != null) {
                builder.append("_coChannelGroupId=");
                builder.append(_coChannelGroupId);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_logicalTerminationPoint != null) {
                builder.append("_logicalTerminationPoint=");
                builder.append(_logicalTerminationPoint);
                builder.append(", ");
            }
            if (_sortOfCoChannelGroup != null) {
                builder.append("_sortOfCoChannelGroup=");
                builder.append(_sortOfCoChannelGroup);
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
