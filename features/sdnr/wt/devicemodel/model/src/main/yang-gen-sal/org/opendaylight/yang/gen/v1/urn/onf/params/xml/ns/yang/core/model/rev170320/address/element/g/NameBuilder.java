package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name
 *
 */
public class NameBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name> {

    private java.lang.String _classOfInstance;
    private org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.and._class.g.Name _name;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>> augmentation = Collections.emptyMap();

    public NameBuilder() {
    }
    public NameBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameAndClassG arg) {
        this._classOfInstance = arg.getClassOfInstance();
        this._name = arg.getName();
    }

    public NameBuilder(Name base) {
        this._classOfInstance = base.getClassOfInstance();
        this._name = base.getName();
        if (base instanceof NameImpl) {
            NameImpl impl = (NameImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameAndClassG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameAndClassG) {
            this._classOfInstance = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameAndClassG)arg).getClassOfInstance();
            this._name = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameAndClassG)arg).getName();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameAndClassG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getClassOfInstance() {
        return _classOfInstance;
    }
    
    public org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.and._class.g.Name getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NameBuilder setClassOfInstance(final java.lang.String value) {
        this._classOfInstance = value;
        return this;
    }
    
     
    public NameBuilder setName(final org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.and._class.g.Name value) {
        this._name = value;
        return this;
    }
    
    public NameBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NameBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Name build() {
        return new NameImpl(this);
    }

    private static final class NameImpl implements Name {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name.class;
        }

        private final java.lang.String _classOfInstance;
        private final org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.and._class.g.Name _name;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>> augmentation = Collections.emptyMap();

        private NameImpl(NameBuilder base) {
            this._classOfInstance = base.getClassOfInstance();
            this._name = base.getName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getClassOfInstance() {
            return _classOfInstance;
        }
        
        @Override
        public org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.and._class.g.Name getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_classOfInstance);
            result = prime * result + Objects.hashCode(_name);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name)obj;
            if (!Objects.equals(_classOfInstance, other.getClassOfInstance())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NameImpl otherImpl = (NameImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Name [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_classOfInstance != null) {
                builder.append("_classOfInstance=");
                builder.append(_classOfInstance);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
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
