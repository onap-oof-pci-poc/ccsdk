package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderCategory;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure
 *
 */
public class HolderStructureBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure> {

    private HolderCategory _holderCategory;
    private java.lang.Boolean _isCaptive;
    private java.lang.Boolean _isGuided;
    private java.lang.Boolean _isQuantizedSpace;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>> augmentation = Collections.emptyMap();

    public HolderStructureBuilder() {
    }
    public HolderStructureBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderStructureG arg) {
        this._holderCategory = arg.getHolderCategory();
        this._isCaptive = arg.isIsCaptive();
        this._isGuided = arg.isIsGuided();
        this._isQuantizedSpace = arg.isIsQuantizedSpace();
    }

    public HolderStructureBuilder(HolderStructure base) {
        this._holderCategory = base.getHolderCategory();
        this._isCaptive = base.isIsCaptive();
        this._isGuided = base.isIsGuided();
        this._isQuantizedSpace = base.isIsQuantizedSpace();
        if (base instanceof HolderStructureImpl) {
            HolderStructureImpl impl = (HolderStructureImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderStructureG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderStructureG) {
            this._holderCategory = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderStructureG)arg).getHolderCategory();
            this._isCaptive = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderStructureG)arg).isIsCaptive();
            this._isGuided = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderStructureG)arg).isIsGuided();
            this._isQuantizedSpace = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderStructureG)arg).isIsQuantizedSpace();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderStructureG] \n" +
              "but was: " + arg
            );
        }
    }

    public HolderCategory getHolderCategory() {
        return _holderCategory;
    }
    
    public java.lang.Boolean isIsCaptive() {
        return _isCaptive;
    }
    
    public java.lang.Boolean isIsGuided() {
        return _isGuided;
    }
    
    public java.lang.Boolean isIsQuantizedSpace() {
        return _isQuantizedSpace;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public HolderStructureBuilder setHolderCategory(final HolderCategory value) {
        this._holderCategory = value;
        return this;
    }
    
     
    public HolderStructureBuilder setIsCaptive(final java.lang.Boolean value) {
        this._isCaptive = value;
        return this;
    }
    
     
    public HolderStructureBuilder setIsGuided(final java.lang.Boolean value) {
        this._isGuided = value;
        return this;
    }
    
     
    public HolderStructureBuilder setIsQuantizedSpace(final java.lang.Boolean value) {
        this._isQuantizedSpace = value;
        return this;
    }
    
    public HolderStructureBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HolderStructureBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HolderStructure build() {
        return new HolderStructureImpl(this);
    }

    private static final class HolderStructureImpl implements HolderStructure {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure.class;
        }

        private final HolderCategory _holderCategory;
        private final java.lang.Boolean _isCaptive;
        private final java.lang.Boolean _isGuided;
        private final java.lang.Boolean _isQuantizedSpace;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>> augmentation = Collections.emptyMap();

        private HolderStructureImpl(HolderStructureBuilder base) {
            this._holderCategory = base.getHolderCategory();
            this._isCaptive = base.isIsCaptive();
            this._isGuided = base.isIsGuided();
            this._isQuantizedSpace = base.isIsQuantizedSpace();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public HolderCategory getHolderCategory() {
            return _holderCategory;
        }
        
        @Override
        public java.lang.Boolean isIsCaptive() {
            return _isCaptive;
        }
        
        @Override
        public java.lang.Boolean isIsGuided() {
            return _isGuided;
        }
        
        @Override
        public java.lang.Boolean isIsQuantizedSpace() {
            return _isQuantizedSpace;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_holderCategory);
            result = prime * result + Objects.hashCode(_isCaptive);
            result = prime * result + Objects.hashCode(_isGuided);
            result = prime * result + Objects.hashCode(_isQuantizedSpace);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure)obj;
            if (!Objects.equals(_holderCategory, other.getHolderCategory())) {
                return false;
            }
            if (!Objects.equals(_isCaptive, other.isIsCaptive())) {
                return false;
            }
            if (!Objects.equals(_isGuided, other.isIsGuided())) {
                return false;
            }
            if (!Objects.equals(_isQuantizedSpace, other.isIsQuantizedSpace())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HolderStructureImpl otherImpl = (HolderStructureImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure>> e : augmentation.entrySet()) {
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
            java.lang.String name = "HolderStructure [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_holderCategory != null) {
                builder.append("_holderCategory=");
                builder.append(_holderCategory);
                builder.append(", ");
            }
            if (_isCaptive != null) {
                builder.append("_isCaptive=");
                builder.append(_isCaptive);
                builder.append(", ");
            }
            if (_isGuided != null) {
                builder.append("_isGuided=");
                builder.append(_isGuided);
                builder.append(", ");
            }
            if (_isQuantizedSpace != null) {
                builder.append("_isQuantizedSpace=");
                builder.append(_isQuantizedSpace);
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
