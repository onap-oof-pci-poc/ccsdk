package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.OperatorAugmentedEquipmentType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.ManufacturerProperties;
import java.util.Objects;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.EquipmentType;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.EquipmentInstance;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing
 *
 */
public class ManufacturedThingBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing> {

    private EquipmentInstance _equipmentInstance;
    private EquipmentType _equipmentType;
    private ManufacturerProperties _manufacturerProperties;
    private OperatorAugmentedEquipmentType _operatorAugmentedEquipmentType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>> augmentation = Collections.emptyMap();

    public ManufacturedThingBuilder() {
    }
    public ManufacturedThingBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturedThingG arg) {
        this._manufacturerProperties = arg.getManufacturerProperties();
        this._equipmentType = arg.getEquipmentType();
        this._equipmentInstance = arg.getEquipmentInstance();
        this._operatorAugmentedEquipmentType = arg.getOperatorAugmentedEquipmentType();
    }

    public ManufacturedThingBuilder(ManufacturedThing base) {
        this._equipmentInstance = base.getEquipmentInstance();
        this._equipmentType = base.getEquipmentType();
        this._manufacturerProperties = base.getManufacturerProperties();
        this._operatorAugmentedEquipmentType = base.getOperatorAugmentedEquipmentType();
        if (base instanceof ManufacturedThingImpl) {
            ManufacturedThingImpl impl = (ManufacturedThingImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturedThingG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturedThingG) {
            this._manufacturerProperties = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturedThingG)arg).getManufacturerProperties();
            this._equipmentType = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturedThingG)arg).getEquipmentType();
            this._equipmentInstance = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturedThingG)arg).getEquipmentInstance();
            this._operatorAugmentedEquipmentType = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturedThingG)arg).getOperatorAugmentedEquipmentType();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturedThingG] \n" +
              "but was: " + arg
            );
        }
    }

    public EquipmentInstance getEquipmentInstance() {
        return _equipmentInstance;
    }
    
    public EquipmentType getEquipmentType() {
        return _equipmentType;
    }
    
    public ManufacturerProperties getManufacturerProperties() {
        return _manufacturerProperties;
    }
    
    public OperatorAugmentedEquipmentType getOperatorAugmentedEquipmentType() {
        return _operatorAugmentedEquipmentType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ManufacturedThingBuilder setEquipmentInstance(final EquipmentInstance value) {
        this._equipmentInstance = value;
        return this;
    }
    
     
    public ManufacturedThingBuilder setEquipmentType(final EquipmentType value) {
        this._equipmentType = value;
        return this;
    }
    
     
    public ManufacturedThingBuilder setManufacturerProperties(final ManufacturerProperties value) {
        this._manufacturerProperties = value;
        return this;
    }
    
     
    public ManufacturedThingBuilder setOperatorAugmentedEquipmentType(final OperatorAugmentedEquipmentType value) {
        this._operatorAugmentedEquipmentType = value;
        return this;
    }
    
    public ManufacturedThingBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ManufacturedThingBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ManufacturedThing build() {
        return new ManufacturedThingImpl(this);
    }

    private static final class ManufacturedThingImpl implements ManufacturedThing {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing.class;
        }

        private final EquipmentInstance _equipmentInstance;
        private final EquipmentType _equipmentType;
        private final ManufacturerProperties _manufacturerProperties;
        private final OperatorAugmentedEquipmentType _operatorAugmentedEquipmentType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>> augmentation = Collections.emptyMap();

        private ManufacturedThingImpl(ManufacturedThingBuilder base) {
            this._equipmentInstance = base.getEquipmentInstance();
            this._equipmentType = base.getEquipmentType();
            this._manufacturerProperties = base.getManufacturerProperties();
            this._operatorAugmentedEquipmentType = base.getOperatorAugmentedEquipmentType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public EquipmentInstance getEquipmentInstance() {
            return _equipmentInstance;
        }
        
        @Override
        public EquipmentType getEquipmentType() {
            return _equipmentType;
        }
        
        @Override
        public ManufacturerProperties getManufacturerProperties() {
            return _manufacturerProperties;
        }
        
        @Override
        public OperatorAugmentedEquipmentType getOperatorAugmentedEquipmentType() {
            return _operatorAugmentedEquipmentType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_equipmentInstance);
            result = prime * result + Objects.hashCode(_equipmentType);
            result = prime * result + Objects.hashCode(_manufacturerProperties);
            result = prime * result + Objects.hashCode(_operatorAugmentedEquipmentType);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing)obj;
            if (!Objects.equals(_equipmentInstance, other.getEquipmentInstance())) {
                return false;
            }
            if (!Objects.equals(_equipmentType, other.getEquipmentType())) {
                return false;
            }
            if (!Objects.equals(_manufacturerProperties, other.getManufacturerProperties())) {
                return false;
            }
            if (!Objects.equals(_operatorAugmentedEquipmentType, other.getOperatorAugmentedEquipmentType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ManufacturedThingImpl otherImpl = (ManufacturedThingImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ManufacturedThing [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_equipmentInstance != null) {
                builder.append("_equipmentInstance=");
                builder.append(_equipmentInstance);
                builder.append(", ");
            }
            if (_equipmentType != null) {
                builder.append("_equipmentType=");
                builder.append(_equipmentType);
                builder.append(", ");
            }
            if (_manufacturerProperties != null) {
                builder.append("_manufacturerProperties=");
                builder.append(_manufacturerProperties);
                builder.append(", ");
            }
            if (_operatorAugmentedEquipmentType != null) {
                builder.append("_operatorAugmentedEquipmentType=");
                builder.append(_operatorAugmentedEquipmentType);
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
