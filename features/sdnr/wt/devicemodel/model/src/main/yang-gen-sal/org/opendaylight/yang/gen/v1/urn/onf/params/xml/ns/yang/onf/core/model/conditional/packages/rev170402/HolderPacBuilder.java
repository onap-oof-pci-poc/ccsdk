package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderConfiguration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderCapability;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderCurrentProblems;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.pac.HolderStatus;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac
 *
 */
public class HolderPacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac> {

    private UniversalId _holder;
    private HolderCapability _holderCapability;
    private HolderConfiguration _holderConfiguration;
    private HolderCurrentProblems _holderCurrentProblems;
    private HolderStatus _holderStatus;
    private HolderPacKey _key;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>> augmentation = Collections.emptyMap();

    public HolderPacBuilder() {
    }

    public HolderPacBuilder(HolderPac base) {
        if (base.getKey() == null) {
            this._key = new HolderPacKey(
                base.getHolder()
            );
            this._holder = base.getHolder();
        } else {
            this._key = base.getKey();
            this._holder = _key.getHolder();
        }
        this._holderCapability = base.getHolderCapability();
        this._holderConfiguration = base.getHolderConfiguration();
        this._holderCurrentProblems = base.getHolderCurrentProblems();
        this._holderStatus = base.getHolderStatus();
        if (base instanceof HolderPacImpl) {
            HolderPacImpl impl = (HolderPacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public UniversalId getHolder() {
        return _holder;
    }
    
    public HolderCapability getHolderCapability() {
        return _holderCapability;
    }
    
    public HolderConfiguration getHolderConfiguration() {
        return _holderConfiguration;
    }
    
    public HolderCurrentProblems getHolderCurrentProblems() {
        return _holderCurrentProblems;
    }
    
    public HolderStatus getHolderStatus() {
        return _holderStatus;
    }
    
    public HolderPacKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public HolderPacBuilder setHolder(final UniversalId value) {
        this._holder = value;
        return this;
    }
    
     
    public HolderPacBuilder setHolderCapability(final HolderCapability value) {
        this._holderCapability = value;
        return this;
    }
    
     
    public HolderPacBuilder setHolderConfiguration(final HolderConfiguration value) {
        this._holderConfiguration = value;
        return this;
    }
    
     
    public HolderPacBuilder setHolderCurrentProblems(final HolderCurrentProblems value) {
        this._holderCurrentProblems = value;
        return this;
    }
    
     
    public HolderPacBuilder setHolderStatus(final HolderStatus value) {
        this._holderStatus = value;
        return this;
    }
    
     
    public HolderPacBuilder setKey(final HolderPacKey value) {
        this._key = value;
        return this;
    }
    
    public HolderPacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HolderPacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HolderPac build() {
        return new HolderPacImpl(this);
    }

    private static final class HolderPacImpl implements HolderPac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac.class;
        }

        private final UniversalId _holder;
        private final HolderCapability _holderCapability;
        private final HolderConfiguration _holderConfiguration;
        private final HolderCurrentProblems _holderCurrentProblems;
        private final HolderStatus _holderStatus;
        private final HolderPacKey _key;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>> augmentation = Collections.emptyMap();

        private HolderPacImpl(HolderPacBuilder base) {
            if (base.getKey() == null) {
                this._key = new HolderPacKey(
                    base.getHolder()
                );
                this._holder = base.getHolder();
            } else {
                this._key = base.getKey();
                this._holder = _key.getHolder();
            }
            this._holderCapability = base.getHolderCapability();
            this._holderConfiguration = base.getHolderConfiguration();
            this._holderCurrentProblems = base.getHolderCurrentProblems();
            this._holderStatus = base.getHolderStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public UniversalId getHolder() {
            return _holder;
        }
        
        @Override
        public HolderCapability getHolderCapability() {
            return _holderCapability;
        }
        
        @Override
        public HolderConfiguration getHolderConfiguration() {
            return _holderConfiguration;
        }
        
        @Override
        public HolderCurrentProblems getHolderCurrentProblems() {
            return _holderCurrentProblems;
        }
        
        @Override
        public HolderStatus getHolderStatus() {
            return _holderStatus;
        }
        
        @Override
        public HolderPacKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_holder);
            result = prime * result + Objects.hashCode(_holderCapability);
            result = prime * result + Objects.hashCode(_holderConfiguration);
            result = prime * result + Objects.hashCode(_holderCurrentProblems);
            result = prime * result + Objects.hashCode(_holderStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac)obj;
            if (!Objects.equals(_holder, other.getHolder())) {
                return false;
            }
            if (!Objects.equals(_holderCapability, other.getHolderCapability())) {
                return false;
            }
            if (!Objects.equals(_holderConfiguration, other.getHolderConfiguration())) {
                return false;
            }
            if (!Objects.equals(_holderCurrentProblems, other.getHolderCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_holderStatus, other.getHolderStatus())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HolderPacImpl otherImpl = (HolderPacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderPac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "HolderPac [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_holder != null) {
                builder.append("_holder=");
                builder.append(_holder);
                builder.append(", ");
            }
            if (_holderCapability != null) {
                builder.append("_holderCapability=");
                builder.append(_holderCapability);
                builder.append(", ");
            }
            if (_holderConfiguration != null) {
                builder.append("_holderConfiguration=");
                builder.append(_holderConfiguration);
                builder.append(", ");
            }
            if (_holderCurrentProblems != null) {
                builder.append("_holderCurrentProblems=");
                builder.append(_holderCurrentProblems);
                builder.append(", ");
            }
            if (_holderStatus != null) {
                builder.append("_holderStatus=");
                builder.append(_holderStatus);
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
