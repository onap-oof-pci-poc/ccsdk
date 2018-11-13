package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SeverityType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList
 *
 */
public class ProblemTypeSeverityListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList> {

    private ProblemTypeSeverityListKey _key;
    private java.lang.String _problemTypeName;
    private SeverityType _problemTypeSeverity;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>> augmentation = Collections.emptyMap();

    public ProblemTypeSeverityListBuilder() {
    }
    public ProblemTypeSeverityListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ProblemSeverityTypeG arg) {
        this._problemTypeName = arg.getProblemTypeName();
        this._problemTypeSeverity = arg.getProblemTypeSeverity();
    }

    public ProblemTypeSeverityListBuilder(ProblemTypeSeverityList base) {
        if (base.getKey() == null) {
            this._key = new ProblemTypeSeverityListKey(
                base.getProblemTypeName()
            );
            this._problemTypeName = base.getProblemTypeName();
        } else {
            this._key = base.getKey();
            this._problemTypeName = _key.getProblemTypeName();
        }
        this._problemTypeSeverity = base.getProblemTypeSeverity();
        if (base instanceof ProblemTypeSeverityListImpl) {
            ProblemTypeSeverityListImpl impl = (ProblemTypeSeverityListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ProblemSeverityTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ProblemSeverityTypeG) {
            this._problemTypeName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ProblemSeverityTypeG)arg).getProblemTypeName();
            this._problemTypeSeverity = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ProblemSeverityTypeG)arg).getProblemTypeSeverity();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ProblemSeverityTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public ProblemTypeSeverityListKey getKey() {
        return _key;
    }
    
    public java.lang.String getProblemTypeName() {
        return _problemTypeName;
    }
    
    public SeverityType getProblemTypeSeverity() {
        return _problemTypeSeverity;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ProblemTypeSeverityListBuilder setKey(final ProblemTypeSeverityListKey value) {
        this._key = value;
        return this;
    }
    
     
    public ProblemTypeSeverityListBuilder setProblemTypeName(final java.lang.String value) {
        this._problemTypeName = value;
        return this;
    }
    
     
    public ProblemTypeSeverityListBuilder setProblemTypeSeverity(final SeverityType value) {
        this._problemTypeSeverity = value;
        return this;
    }
    
    public ProblemTypeSeverityListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ProblemTypeSeverityListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ProblemTypeSeverityList build() {
        return new ProblemTypeSeverityListImpl(this);
    }

    private static final class ProblemTypeSeverityListImpl implements ProblemTypeSeverityList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList.class;
        }

        private final ProblemTypeSeverityListKey _key;
        private final java.lang.String _problemTypeName;
        private final SeverityType _problemTypeSeverity;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>> augmentation = Collections.emptyMap();

        private ProblemTypeSeverityListImpl(ProblemTypeSeverityListBuilder base) {
            if (base.getKey() == null) {
                this._key = new ProblemTypeSeverityListKey(
                    base.getProblemTypeName()
                );
                this._problemTypeName = base.getProblemTypeName();
            } else {
                this._key = base.getKey();
                this._problemTypeName = _key.getProblemTypeName();
            }
            this._problemTypeSeverity = base.getProblemTypeSeverity();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ProblemTypeSeverityListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getProblemTypeName() {
            return _problemTypeName;
        }
        
        @Override
        public SeverityType getProblemTypeSeverity() {
            return _problemTypeSeverity;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_problemTypeName);
            result = prime * result + Objects.hashCode(_problemTypeSeverity);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_problemTypeName, other.getProblemTypeName())) {
                return false;
            }
            if (!Objects.equals(_problemTypeSeverity, other.getProblemTypeSeverity())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ProblemTypeSeverityListImpl otherImpl = (ProblemTypeSeverityListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ProblemTypeSeverityList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_problemTypeName != null) {
                builder.append("_problemTypeName=");
                builder.append(_problemTypeName);
                builder.append(", ");
            }
            if (_problemTypeSeverity != null) {
                builder.append("_problemTypeSeverity=");
                builder.append(_problemTypeSeverity);
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
