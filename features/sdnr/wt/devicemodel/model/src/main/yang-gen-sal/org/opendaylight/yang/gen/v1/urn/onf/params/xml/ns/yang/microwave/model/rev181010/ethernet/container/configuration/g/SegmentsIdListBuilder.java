package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList
 *
 */
public class SegmentsIdListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList> {

    private SegmentsIdListKey _key;
    private java.lang.Short _segmentIdRef;
    private UniversalId _structureIdRef;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>> augmentation = Collections.emptyMap();

    public SegmentsIdListBuilder() {
    }
    public SegmentsIdListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SegmentIdTypeG arg) {
        this._structureIdRef = arg.getStructureIdRef();
        this._segmentIdRef = arg.getSegmentIdRef();
    }

    public SegmentsIdListBuilder(SegmentsIdList base) {
        if (base.getKey() == null) {
            this._key = new SegmentsIdListKey(
                base.getSegmentIdRef(), 
                base.getStructureIdRef()
            );
            this._segmentIdRef = base.getSegmentIdRef();
            this._structureIdRef = base.getStructureIdRef();
        } else {
            this._key = base.getKey();
            this._segmentIdRef = _key.getSegmentIdRef();
            this._structureIdRef = _key.getStructureIdRef();
        }
        if (base instanceof SegmentsIdListImpl) {
            SegmentsIdListImpl impl = (SegmentsIdListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SegmentIdTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SegmentIdTypeG) {
            this._structureIdRef = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SegmentIdTypeG)arg).getStructureIdRef();
            this._segmentIdRef = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SegmentIdTypeG)arg).getSegmentIdRef();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SegmentIdTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public SegmentsIdListKey getKey() {
        return _key;
    }
    
    public java.lang.Short getSegmentIdRef() {
        return _segmentIdRef;
    }
    
    public UniversalId getStructureIdRef() {
        return _structureIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SegmentsIdListBuilder setKey(final SegmentsIdListKey value) {
        this._key = value;
        return this;
    }
    
     
    public SegmentsIdListBuilder setSegmentIdRef(final java.lang.Short value) {
        this._segmentIdRef = value;
        return this;
    }
    
     
    public SegmentsIdListBuilder setStructureIdRef(final UniversalId value) {
        this._structureIdRef = value;
        return this;
    }
    
    public SegmentsIdListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SegmentsIdListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SegmentsIdList build() {
        return new SegmentsIdListImpl(this);
    }

    private static final class SegmentsIdListImpl implements SegmentsIdList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList.class;
        }

        private final SegmentsIdListKey _key;
        private final java.lang.Short _segmentIdRef;
        private final UniversalId _structureIdRef;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>> augmentation = Collections.emptyMap();

        private SegmentsIdListImpl(SegmentsIdListBuilder base) {
            if (base.getKey() == null) {
                this._key = new SegmentsIdListKey(
                    base.getSegmentIdRef(), 
                    base.getStructureIdRef()
                );
                this._segmentIdRef = base.getSegmentIdRef();
                this._structureIdRef = base.getStructureIdRef();
            } else {
                this._key = base.getKey();
                this._segmentIdRef = _key.getSegmentIdRef();
                this._structureIdRef = _key.getStructureIdRef();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public SegmentsIdListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Short getSegmentIdRef() {
            return _segmentIdRef;
        }
        
        @Override
        public UniversalId getStructureIdRef() {
            return _structureIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_segmentIdRef);
            result = prime * result + Objects.hashCode(_structureIdRef);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_segmentIdRef, other.getSegmentIdRef())) {
                return false;
            }
            if (!Objects.equals(_structureIdRef, other.getStructureIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SegmentsIdListImpl otherImpl = (SegmentsIdListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SegmentsIdList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_segmentIdRef != null) {
                builder.append("_segmentIdRef=");
                builder.append(_segmentIdRef);
                builder.append(", ");
            }
            if (_structureIdRef != null) {
                builder.append("_structureIdRef=");
                builder.append(_structureIdRef);
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
