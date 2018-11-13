package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationalState;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList
 *
 */
public class SegmentStatusListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList> {

    private SegmentStatusListKey _key;
    private java.lang.Short _obsoleteDropOrderRank;
    private java.lang.Byte _obsoletePriorityClass;
    private OperationalState _operationalStatus;
    private java.lang.Short _segmentStatusTypeId;
    private java.lang.Boolean _segmentIsReservedForTdm;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>> augmentation = Collections.emptyMap();

    public SegmentStatusListBuilder() {
    }
    public SegmentStatusListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SegmentStatusTypeG arg) {
        this._segmentStatusTypeId = arg.getSegmentStatusTypeId();
        this._segmentIsReservedForTdm = arg.isSegmentIsReservedForTdm();
        this._operationalStatus = arg.getOperationalStatus();
        this._obsoletePriorityClass = arg.getObsoletePriorityClass();
        this._obsoleteDropOrderRank = arg.getObsoleteDropOrderRank();
    }

    public SegmentStatusListBuilder(SegmentStatusList base) {
        if (base.getKey() == null) {
            this._key = new SegmentStatusListKey(
                base.getSegmentStatusTypeId()
            );
            this._segmentStatusTypeId = base.getSegmentStatusTypeId();
        } else {
            this._key = base.getKey();
            this._segmentStatusTypeId = _key.getSegmentStatusTypeId();
        }
        this._obsoleteDropOrderRank = base.getObsoleteDropOrderRank();
        this._obsoletePriorityClass = base.getObsoletePriorityClass();
        this._operationalStatus = base.getOperationalStatus();
        this._segmentIsReservedForTdm = base.isSegmentIsReservedForTdm();
        if (base instanceof SegmentStatusListImpl) {
            SegmentStatusListImpl impl = (SegmentStatusListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SegmentStatusTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SegmentStatusTypeG) {
            this._segmentStatusTypeId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SegmentStatusTypeG)arg).getSegmentStatusTypeId();
            this._segmentIsReservedForTdm = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SegmentStatusTypeG)arg).isSegmentIsReservedForTdm();
            this._operationalStatus = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SegmentStatusTypeG)arg).getOperationalStatus();
            this._obsoletePriorityClass = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SegmentStatusTypeG)arg).getObsoletePriorityClass();
            this._obsoleteDropOrderRank = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SegmentStatusTypeG)arg).getObsoleteDropOrderRank();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SegmentStatusTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public SegmentStatusListKey getKey() {
        return _key;
    }
    
    public java.lang.Short getObsoleteDropOrderRank() {
        return _obsoleteDropOrderRank;
    }
    
    public java.lang.Byte getObsoletePriorityClass() {
        return _obsoletePriorityClass;
    }
    
    public OperationalState getOperationalStatus() {
        return _operationalStatus;
    }
    
    public java.lang.Short getSegmentStatusTypeId() {
        return _segmentStatusTypeId;
    }
    
    public java.lang.Boolean isSegmentIsReservedForTdm() {
        return _segmentIsReservedForTdm;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SegmentStatusListBuilder setKey(final SegmentStatusListKey value) {
        this._key = value;
        return this;
    }
    
     
    public SegmentStatusListBuilder setObsoleteDropOrderRank(final java.lang.Short value) {
        this._obsoleteDropOrderRank = value;
        return this;
    }
    
     
    public SegmentStatusListBuilder setObsoletePriorityClass(final java.lang.Byte value) {
        this._obsoletePriorityClass = value;
        return this;
    }
    
     
    public SegmentStatusListBuilder setOperationalStatus(final OperationalState value) {
        this._operationalStatus = value;
        return this;
    }
    
     
    public SegmentStatusListBuilder setSegmentStatusTypeId(final java.lang.Short value) {
        this._segmentStatusTypeId = value;
        return this;
    }
    
     
    public SegmentStatusListBuilder setSegmentIsReservedForTdm(final java.lang.Boolean value) {
        this._segmentIsReservedForTdm = value;
        return this;
    }
    
    public SegmentStatusListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SegmentStatusListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SegmentStatusList build() {
        return new SegmentStatusListImpl(this);
    }

    private static final class SegmentStatusListImpl implements SegmentStatusList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList.class;
        }

        private final SegmentStatusListKey _key;
        private final java.lang.Short _obsoleteDropOrderRank;
        private final java.lang.Byte _obsoletePriorityClass;
        private final OperationalState _operationalStatus;
        private final java.lang.Short _segmentStatusTypeId;
        private final java.lang.Boolean _segmentIsReservedForTdm;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>> augmentation = Collections.emptyMap();

        private SegmentStatusListImpl(SegmentStatusListBuilder base) {
            if (base.getKey() == null) {
                this._key = new SegmentStatusListKey(
                    base.getSegmentStatusTypeId()
                );
                this._segmentStatusTypeId = base.getSegmentStatusTypeId();
            } else {
                this._key = base.getKey();
                this._segmentStatusTypeId = _key.getSegmentStatusTypeId();
            }
            this._obsoleteDropOrderRank = base.getObsoleteDropOrderRank();
            this._obsoletePriorityClass = base.getObsoletePriorityClass();
            this._operationalStatus = base.getOperationalStatus();
            this._segmentIsReservedForTdm = base.isSegmentIsReservedForTdm();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public SegmentStatusListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Short getObsoleteDropOrderRank() {
            return _obsoleteDropOrderRank;
        }
        
        @Override
        public java.lang.Byte getObsoletePriorityClass() {
            return _obsoletePriorityClass;
        }
        
        @Override
        public OperationalState getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public java.lang.Short getSegmentStatusTypeId() {
            return _segmentStatusTypeId;
        }
        
        @Override
        public java.lang.Boolean isSegmentIsReservedForTdm() {
            return _segmentIsReservedForTdm;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_obsoleteDropOrderRank);
            result = prime * result + Objects.hashCode(_obsoletePriorityClass);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_segmentStatusTypeId);
            result = prime * result + Objects.hashCode(_segmentIsReservedForTdm);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_obsoleteDropOrderRank, other.getObsoleteDropOrderRank())) {
                return false;
            }
            if (!Objects.equals(_obsoletePriorityClass, other.getObsoletePriorityClass())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_segmentStatusTypeId, other.getSegmentStatusTypeId())) {
                return false;
            }
            if (!Objects.equals(_segmentIsReservedForTdm, other.isSegmentIsReservedForTdm())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SegmentStatusListImpl otherImpl = (SegmentStatusListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.status.g.SegmentStatusList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SegmentStatusList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_obsoleteDropOrderRank != null) {
                builder.append("_obsoleteDropOrderRank=");
                builder.append(_obsoleteDropOrderRank);
                builder.append(", ");
            }
            if (_obsoletePriorityClass != null) {
                builder.append("_obsoletePriorityClass=");
                builder.append(_obsoletePriorityClass);
                builder.append(", ");
            }
            if (_operationalStatus != null) {
                builder.append("_operationalStatus=");
                builder.append(_operationalStatus);
                builder.append(", ");
            }
            if (_segmentStatusTypeId != null) {
                builder.append("_segmentStatusTypeId=");
                builder.append(_segmentStatusTypeId);
                builder.append(", ");
            }
            if (_segmentIsReservedForTdm != null) {
                builder.append("_segmentIsReservedForTdm=");
                builder.append(_segmentIsReservedForTdm);
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
