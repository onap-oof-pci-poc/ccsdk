package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.SeverityType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList
 *
 */
public class ProblemKindSeverityListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList> {

    private ProblemKindSeverityListKey _key;
    private java.lang.String _problemKindName;
    private SeverityType _problemKindSeverity;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>> augmentation = Collections.emptyMap();

    public ProblemKindSeverityListBuilder() {
    }
    public ProblemKindSeverityListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructureProblemSeverityTypeG arg) {
        this._problemKindName = arg.getProblemKindName();
        this._problemKindSeverity = arg.getProblemKindSeverity();
    }

    public ProblemKindSeverityListBuilder(ProblemKindSeverityList base) {
        if (base.getKey() == null) {
            this._key = new ProblemKindSeverityListKey(
                base.getProblemKindName()
            );
            this._problemKindName = base.getProblemKindName();
        } else {
            this._key = base.getKey();
            this._problemKindName = _key.getProblemKindName();
        }
        this._problemKindSeverity = base.getProblemKindSeverity();
        if (base instanceof ProblemKindSeverityListImpl) {
            ProblemKindSeverityListImpl impl = (ProblemKindSeverityListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructureProblemSeverityTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructureProblemSeverityTypeG) {
            this._problemKindName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructureProblemSeverityTypeG)arg).getProblemKindName();
            this._problemKindSeverity = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructureProblemSeverityTypeG)arg).getProblemKindSeverity();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructureProblemSeverityTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public ProblemKindSeverityListKey getKey() {
        return _key;
    }
    
    public java.lang.String getProblemKindName() {
        return _problemKindName;
    }
    
    public SeverityType getProblemKindSeverity() {
        return _problemKindSeverity;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ProblemKindSeverityListBuilder setKey(final ProblemKindSeverityListKey value) {
        this._key = value;
        return this;
    }
    
     
    public ProblemKindSeverityListBuilder setProblemKindName(final java.lang.String value) {
        this._problemKindName = value;
        return this;
    }
    
     
    public ProblemKindSeverityListBuilder setProblemKindSeverity(final SeverityType value) {
        this._problemKindSeverity = value;
        return this;
    }
    
    public ProblemKindSeverityListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ProblemKindSeverityListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ProblemKindSeverityList build() {
        return new ProblemKindSeverityListImpl(this);
    }

    private static final class ProblemKindSeverityListImpl implements ProblemKindSeverityList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList.class;
        }

        private final ProblemKindSeverityListKey _key;
        private final java.lang.String _problemKindName;
        private final SeverityType _problemKindSeverity;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>> augmentation = Collections.emptyMap();

        private ProblemKindSeverityListImpl(ProblemKindSeverityListBuilder base) {
            if (base.getKey() == null) {
                this._key = new ProblemKindSeverityListKey(
                    base.getProblemKindName()
                );
                this._problemKindName = base.getProblemKindName();
            } else {
                this._key = base.getKey();
                this._problemKindName = _key.getProblemKindName();
            }
            this._problemKindSeverity = base.getProblemKindSeverity();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ProblemKindSeverityListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getProblemKindName() {
            return _problemKindName;
        }
        
        @Override
        public SeverityType getProblemKindSeverity() {
            return _problemKindSeverity;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_problemKindName);
            result = prime * result + Objects.hashCode(_problemKindSeverity);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_problemKindName, other.getProblemKindName())) {
                return false;
            }
            if (!Objects.equals(_problemKindSeverity, other.getProblemKindSeverity())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ProblemKindSeverityListImpl otherImpl = (ProblemKindSeverityListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ProblemKindSeverityList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_problemKindName != null) {
                builder.append("_problemKindName=");
                builder.append(_problemKindName);
                builder.append(", ");
            }
            if (_problemKindSeverity != null) {
                builder.append("_problemKindSeverity=");
                builder.append(_problemKindSeverity);
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
