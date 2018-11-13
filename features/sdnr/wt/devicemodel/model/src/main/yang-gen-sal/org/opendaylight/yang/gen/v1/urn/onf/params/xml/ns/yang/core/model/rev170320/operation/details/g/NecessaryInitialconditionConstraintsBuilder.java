package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints
 *
 */
public class NecessaryInitialconditionConstraintsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints> {

    private NecessaryInitialconditionConstraintsKey _key;
    private java.lang.Boolean _isNot;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>> augmentation = Collections.emptyMap();

    public NecessaryInitialconditionConstraintsBuilder() {
    }
    public NecessaryInitialconditionConstraintsBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NecessaryInitialConditionConstraintsG arg) {
        this._isNot = arg.isIsNot();
    }

    public NecessaryInitialconditionConstraintsBuilder(NecessaryInitialconditionConstraints base) {
        if (base.getKey() == null) {
            this._key = new NecessaryInitialconditionConstraintsKey(
                base.isIsNot()
            );
            this._isNot = base.isIsNot();
        } else {
            this._key = base.getKey();
            this._isNot = _key.isIsNot();
        }
        if (base instanceof NecessaryInitialconditionConstraintsImpl) {
            NecessaryInitialconditionConstraintsImpl impl = (NecessaryInitialconditionConstraintsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NecessaryInitialConditionConstraintsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NecessaryInitialConditionConstraintsG) {
            this._isNot = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NecessaryInitialConditionConstraintsG)arg).isIsNot();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NecessaryInitialConditionConstraintsG] \n" +
              "but was: " + arg
            );
        }
    }

    public NecessaryInitialconditionConstraintsKey getKey() {
        return _key;
    }
    
    public java.lang.Boolean isIsNot() {
        return _isNot;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NecessaryInitialconditionConstraintsBuilder setKey(final NecessaryInitialconditionConstraintsKey value) {
        this._key = value;
        return this;
    }
    
     
    public NecessaryInitialconditionConstraintsBuilder setIsNot(final java.lang.Boolean value) {
        this._isNot = value;
        return this;
    }
    
    public NecessaryInitialconditionConstraintsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NecessaryInitialconditionConstraintsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NecessaryInitialconditionConstraints build() {
        return new NecessaryInitialconditionConstraintsImpl(this);
    }

    private static final class NecessaryInitialconditionConstraintsImpl implements NecessaryInitialconditionConstraints {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints.class;
        }

        private final NecessaryInitialconditionConstraintsKey _key;
        private final java.lang.Boolean _isNot;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>> augmentation = Collections.emptyMap();

        private NecessaryInitialconditionConstraintsImpl(NecessaryInitialconditionConstraintsBuilder base) {
            if (base.getKey() == null) {
                this._key = new NecessaryInitialconditionConstraintsKey(
                    base.isIsNot()
                );
                this._isNot = base.isIsNot();
            } else {
                this._key = base.getKey();
                this._isNot = _key.isIsNot();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NecessaryInitialconditionConstraintsKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Boolean isIsNot() {
            return _isNot;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_isNot);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_isNot, other.isIsNot())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NecessaryInitialconditionConstraintsImpl otherImpl = (NecessaryInitialconditionConstraintsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NecessaryInitialconditionConstraints [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_isNot != null) {
                builder.append("_isNot=");
                builder.append(_isNot);
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
