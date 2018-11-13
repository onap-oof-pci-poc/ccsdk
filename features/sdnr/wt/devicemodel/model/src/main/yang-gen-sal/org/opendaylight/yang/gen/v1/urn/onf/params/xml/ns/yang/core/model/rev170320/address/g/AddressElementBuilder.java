package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.LocalId;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement
 *
 */
public class AddressElementBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement> {

    private java.lang.String _addressElementName;
    private java.lang.String _arbitraryElement;
    private AddressElementKey _key;
    private LocalId _localId;
    private Name _name;
    private UniversalId _uuid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>> augmentation = Collections.emptyMap();

    public AddressElementBuilder() {
    }
    public AddressElementBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressElementG arg) {
        this._addressElementName = arg.getAddressElementName();
        this._localId = arg.getLocalId();
        this._uuid = arg.getUuid();
        this._name = arg.getName();
        this._arbitraryElement = arg.getArbitraryElement();
    }

    public AddressElementBuilder(AddressElement base) {
        if (base.getKey() == null) {
            this._key = new AddressElementKey(
                base.getUuid()
            );
            this._uuid = base.getUuid();
        } else {
            this._key = base.getKey();
            this._uuid = _key.getUuid();
        }
        this._addressElementName = base.getAddressElementName();
        this._arbitraryElement = base.getArbitraryElement();
        this._localId = base.getLocalId();
        this._name = base.getName();
        if (base instanceof AddressElementImpl) {
            AddressElementImpl impl = (AddressElementImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressElementG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressElementG) {
            this._addressElementName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressElementG)arg).getAddressElementName();
            this._localId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressElementG)arg).getLocalId();
            this._uuid = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressElementG)arg).getUuid();
            this._name = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressElementG)arg).getName();
            this._arbitraryElement = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressElementG)arg).getArbitraryElement();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressElementG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAddressElementName() {
        return _addressElementName;
    }
    
    public java.lang.String getArbitraryElement() {
        return _arbitraryElement;
    }
    
    public AddressElementKey getKey() {
        return _key;
    }
    
    public LocalId getLocalId() {
        return _localId;
    }
    
    public Name getName() {
        return _name;
    }
    
    public UniversalId getUuid() {
        return _uuid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AddressElementBuilder setAddressElementName(final java.lang.String value) {
        this._addressElementName = value;
        return this;
    }
    
     
    public AddressElementBuilder setArbitraryElement(final java.lang.String value) {
        this._arbitraryElement = value;
        return this;
    }
    
     
    public AddressElementBuilder setKey(final AddressElementKey value) {
        this._key = value;
        return this;
    }
    
     
    public AddressElementBuilder setLocalId(final LocalId value) {
        this._localId = value;
        return this;
    }
    
     
    public AddressElementBuilder setName(final Name value) {
        this._name = value;
        return this;
    }
    
     
    public AddressElementBuilder setUuid(final UniversalId value) {
        this._uuid = value;
        return this;
    }
    
    public AddressElementBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AddressElementBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AddressElement build() {
        return new AddressElementImpl(this);
    }

    private static final class AddressElementImpl implements AddressElement {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement.class;
        }

        private final java.lang.String _addressElementName;
        private final java.lang.String _arbitraryElement;
        private final AddressElementKey _key;
        private final LocalId _localId;
        private final Name _name;
        private final UniversalId _uuid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>> augmentation = Collections.emptyMap();

        private AddressElementImpl(AddressElementBuilder base) {
            if (base.getKey() == null) {
                this._key = new AddressElementKey(
                    base.getUuid()
                );
                this._uuid = base.getUuid();
            } else {
                this._key = base.getKey();
                this._uuid = _key.getUuid();
            }
            this._addressElementName = base.getAddressElementName();
            this._arbitraryElement = base.getArbitraryElement();
            this._localId = base.getLocalId();
            this._name = base.getName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getAddressElementName() {
            return _addressElementName;
        }
        
        @Override
        public java.lang.String getArbitraryElement() {
            return _arbitraryElement;
        }
        
        @Override
        public AddressElementKey getKey() {
            return _key;
        }
        
        @Override
        public LocalId getLocalId() {
            return _localId;
        }
        
        @Override
        public Name getName() {
            return _name;
        }
        
        @Override
        public UniversalId getUuid() {
            return _uuid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_addressElementName);
            result = prime * result + Objects.hashCode(_arbitraryElement);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_localId);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_uuid);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement)obj;
            if (!Objects.equals(_addressElementName, other.getAddressElementName())) {
                return false;
            }
            if (!Objects.equals(_arbitraryElement, other.getArbitraryElement())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_localId, other.getLocalId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_uuid, other.getUuid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AddressElementImpl otherImpl = (AddressElementImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AddressElement [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_addressElementName != null) {
                builder.append("_addressElementName=");
                builder.append(_addressElementName);
                builder.append(", ");
            }
            if (_arbitraryElement != null) {
                builder.append("_arbitraryElement=");
                builder.append(_arbitraryElement);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_localId != null) {
                builder.append("_localId=");
                builder.append(_localId);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_uuid != null) {
                builder.append("_uuid=");
                builder.append(_uuid);
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
