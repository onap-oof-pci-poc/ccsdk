package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentStatus;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentCurrentProblems;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentConfiguration;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.equipment.pac.EquipmentCapability;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac
 *
 */
public class EquipmentPacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac> {

    private UniversalId _equipment;
    private EquipmentCapability _equipmentCapability;
    private EquipmentConfiguration _equipmentConfiguration;
    private EquipmentCurrentProblems _equipmentCurrentProblems;
    private EquipmentStatus _equipmentStatus;
    private EquipmentPacKey _key;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>> augmentation = Collections.emptyMap();

    public EquipmentPacBuilder() {
    }

    public EquipmentPacBuilder(EquipmentPac base) {
        if (base.getKey() == null) {
            this._key = new EquipmentPacKey(
                base.getEquipment()
            );
            this._equipment = base.getEquipment();
        } else {
            this._key = base.getKey();
            this._equipment = _key.getEquipment();
        }
        this._equipmentCapability = base.getEquipmentCapability();
        this._equipmentConfiguration = base.getEquipmentConfiguration();
        this._equipmentCurrentProblems = base.getEquipmentCurrentProblems();
        this._equipmentStatus = base.getEquipmentStatus();
        if (base instanceof EquipmentPacImpl) {
            EquipmentPacImpl impl = (EquipmentPacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public UniversalId getEquipment() {
        return _equipment;
    }
    
    public EquipmentCapability getEquipmentCapability() {
        return _equipmentCapability;
    }
    
    public EquipmentConfiguration getEquipmentConfiguration() {
        return _equipmentConfiguration;
    }
    
    public EquipmentCurrentProblems getEquipmentCurrentProblems() {
        return _equipmentCurrentProblems;
    }
    
    public EquipmentStatus getEquipmentStatus() {
        return _equipmentStatus;
    }
    
    public EquipmentPacKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public EquipmentPacBuilder setEquipment(final UniversalId value) {
        this._equipment = value;
        return this;
    }
    
     
    public EquipmentPacBuilder setEquipmentCapability(final EquipmentCapability value) {
        this._equipmentCapability = value;
        return this;
    }
    
     
    public EquipmentPacBuilder setEquipmentConfiguration(final EquipmentConfiguration value) {
        this._equipmentConfiguration = value;
        return this;
    }
    
     
    public EquipmentPacBuilder setEquipmentCurrentProblems(final EquipmentCurrentProblems value) {
        this._equipmentCurrentProblems = value;
        return this;
    }
    
     
    public EquipmentPacBuilder setEquipmentStatus(final EquipmentStatus value) {
        this._equipmentStatus = value;
        return this;
    }
    
     
    public EquipmentPacBuilder setKey(final EquipmentPacKey value) {
        this._key = value;
        return this;
    }
    
    public EquipmentPacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public EquipmentPacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public EquipmentPac build() {
        return new EquipmentPacImpl(this);
    }

    private static final class EquipmentPacImpl implements EquipmentPac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac.class;
        }

        private final UniversalId _equipment;
        private final EquipmentCapability _equipmentCapability;
        private final EquipmentConfiguration _equipmentConfiguration;
        private final EquipmentCurrentProblems _equipmentCurrentProblems;
        private final EquipmentStatus _equipmentStatus;
        private final EquipmentPacKey _key;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>> augmentation = Collections.emptyMap();

        private EquipmentPacImpl(EquipmentPacBuilder base) {
            if (base.getKey() == null) {
                this._key = new EquipmentPacKey(
                    base.getEquipment()
                );
                this._equipment = base.getEquipment();
            } else {
                this._key = base.getKey();
                this._equipment = _key.getEquipment();
            }
            this._equipmentCapability = base.getEquipmentCapability();
            this._equipmentConfiguration = base.getEquipmentConfiguration();
            this._equipmentCurrentProblems = base.getEquipmentCurrentProblems();
            this._equipmentStatus = base.getEquipmentStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public UniversalId getEquipment() {
            return _equipment;
        }
        
        @Override
        public EquipmentCapability getEquipmentCapability() {
            return _equipmentCapability;
        }
        
        @Override
        public EquipmentConfiguration getEquipmentConfiguration() {
            return _equipmentConfiguration;
        }
        
        @Override
        public EquipmentCurrentProblems getEquipmentCurrentProblems() {
            return _equipmentCurrentProblems;
        }
        
        @Override
        public EquipmentStatus getEquipmentStatus() {
            return _equipmentStatus;
        }
        
        @Override
        public EquipmentPacKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_equipment);
            result = prime * result + Objects.hashCode(_equipmentCapability);
            result = prime * result + Objects.hashCode(_equipmentConfiguration);
            result = prime * result + Objects.hashCode(_equipmentCurrentProblems);
            result = prime * result + Objects.hashCode(_equipmentStatus);
            result = prime * result + Objects.hashCode(_key);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac)obj;
            if (!Objects.equals(_equipment, other.getEquipment())) {
                return false;
            }
            if (!Objects.equals(_equipmentCapability, other.getEquipmentCapability())) {
                return false;
            }
            if (!Objects.equals(_equipmentConfiguration, other.getEquipmentConfiguration())) {
                return false;
            }
            if (!Objects.equals(_equipmentCurrentProblems, other.getEquipmentCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_equipmentStatus, other.getEquipmentStatus())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EquipmentPacImpl otherImpl = (EquipmentPacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.EquipmentPac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "EquipmentPac [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_equipment != null) {
                builder.append("_equipment=");
                builder.append(_equipment);
                builder.append(", ");
            }
            if (_equipmentCapability != null) {
                builder.append("_equipmentCapability=");
                builder.append(_equipmentCapability);
                builder.append(", ");
            }
            if (_equipmentConfiguration != null) {
                builder.append("_equipmentConfiguration=");
                builder.append(_equipmentConfiguration);
                builder.append(", ");
            }
            if (_equipmentCurrentProblems != null) {
                builder.append("_equipmentCurrentProblems=");
                builder.append(_equipmentCurrentProblems);
                builder.append(", ");
            }
            if (_equipmentStatus != null) {
                builder.append("_equipmentStatus=");
                builder.append(_equipmentStatus);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
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
