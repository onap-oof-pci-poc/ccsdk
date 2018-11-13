package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType
 *
 */
public class SpatialPropertiesOfTypeBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType> {

    private ToBeDefined _height;
    private ToBeDefined _length;
    private ToBeDefined _width;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>> augmentation = Collections.emptyMap();

    public SpatialPropertiesOfTypeBuilder() {
    }
    public SpatialPropertiesOfTypeBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.SpatialPropertiesOfTypeG arg) {
        this._height = arg.getHeight();
        this._width = arg.getWidth();
        this._length = arg.getLength();
    }

    public SpatialPropertiesOfTypeBuilder(SpatialPropertiesOfType base) {
        this._height = base.getHeight();
        this._length = base.getLength();
        this._width = base.getWidth();
        if (base instanceof SpatialPropertiesOfTypeImpl) {
            SpatialPropertiesOfTypeImpl impl = (SpatialPropertiesOfTypeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.SpatialPropertiesOfTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.SpatialPropertiesOfTypeG) {
            this._height = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.SpatialPropertiesOfTypeG)arg).getHeight();
            this._width = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.SpatialPropertiesOfTypeG)arg).getWidth();
            this._length = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.SpatialPropertiesOfTypeG)arg).getLength();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.SpatialPropertiesOfTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public ToBeDefined getHeight() {
        return _height;
    }
    
    public ToBeDefined getLength() {
        return _length;
    }
    
    public ToBeDefined getWidth() {
        return _width;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SpatialPropertiesOfTypeBuilder setHeight(final ToBeDefined value) {
        this._height = value;
        return this;
    }
    
     
    public SpatialPropertiesOfTypeBuilder setLength(final ToBeDefined value) {
        this._length = value;
        return this;
    }
    
     
    public SpatialPropertiesOfTypeBuilder setWidth(final ToBeDefined value) {
        this._width = value;
        return this;
    }
    
    public SpatialPropertiesOfTypeBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SpatialPropertiesOfTypeBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SpatialPropertiesOfType build() {
        return new SpatialPropertiesOfTypeImpl(this);
    }

    private static final class SpatialPropertiesOfTypeImpl implements SpatialPropertiesOfType {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType.class;
        }

        private final ToBeDefined _height;
        private final ToBeDefined _length;
        private final ToBeDefined _width;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>> augmentation = Collections.emptyMap();

        private SpatialPropertiesOfTypeImpl(SpatialPropertiesOfTypeBuilder base) {
            this._height = base.getHeight();
            this._length = base.getLength();
            this._width = base.getWidth();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ToBeDefined getHeight() {
            return _height;
        }
        
        @Override
        public ToBeDefined getLength() {
            return _length;
        }
        
        @Override
        public ToBeDefined getWidth() {
            return _width;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_height);
            result = prime * result + Objects.hashCode(_length);
            result = prime * result + Objects.hashCode(_width);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType)obj;
            if (!Objects.equals(_height, other.getHeight())) {
                return false;
            }
            if (!Objects.equals(_length, other.getLength())) {
                return false;
            }
            if (!Objects.equals(_width, other.getWidth())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SpatialPropertiesOfTypeImpl otherImpl = (SpatialPropertiesOfTypeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SpatialPropertiesOfType [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_height != null) {
                builder.append("_height=");
                builder.append(_height);
                builder.append(", ");
            }
            if (_length != null) {
                builder.append("_length=");
                builder.append(_length);
                builder.append(", ");
            }
            if (_width != null) {
                builder.append("_width=");
                builder.append(_width);
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
