package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ActionVerbs;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.details.g.NecessaryInitialconditionConstraints;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails
 *
 */
public class OperationDetailsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails> {

    private ActionVerbs _actionVerb;
    private OperationDetailsKey _key;
    private List<NecessaryInitialconditionConstraints> _necessaryInitialconditionConstraints;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>> augmentation = Collections.emptyMap();

    public OperationDetailsBuilder() {
    }
    public OperationDetailsBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationDetailsG arg) {
        this._actionVerb = arg.getActionVerb();
        this._necessaryInitialconditionConstraints = arg.getNecessaryInitialconditionConstraints();
    }

    public OperationDetailsBuilder(OperationDetails base) {
        if (base.getKey() == null) {
            this._key = new OperationDetailsKey(
                base.getActionVerb()
            );
            this._actionVerb = base.getActionVerb();
        } else {
            this._key = base.getKey();
            this._actionVerb = _key.getActionVerb();
        }
        this._necessaryInitialconditionConstraints = base.getNecessaryInitialconditionConstraints();
        if (base instanceof OperationDetailsImpl) {
            OperationDetailsImpl impl = (OperationDetailsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationDetailsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationDetailsG) {
            this._actionVerb = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationDetailsG)arg).getActionVerb();
            this._necessaryInitialconditionConstraints = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationDetailsG)arg).getNecessaryInitialconditionConstraints();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationDetailsG] \n" +
              "but was: " + arg
            );
        }
    }

    public ActionVerbs getActionVerb() {
        return _actionVerb;
    }
    
    public OperationDetailsKey getKey() {
        return _key;
    }
    
    public List<NecessaryInitialconditionConstraints> getNecessaryInitialconditionConstraints() {
        return _necessaryInitialconditionConstraints;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public OperationDetailsBuilder setActionVerb(final ActionVerbs value) {
        this._actionVerb = value;
        return this;
    }
    
     
    public OperationDetailsBuilder setKey(final OperationDetailsKey value) {
        this._key = value;
        return this;
    }
    
     
    public OperationDetailsBuilder setNecessaryInitialconditionConstraints(final List<NecessaryInitialconditionConstraints> value) {
        this._necessaryInitialconditionConstraints = value;
        return this;
    }
    
    public OperationDetailsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public OperationDetailsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public OperationDetails build() {
        return new OperationDetailsImpl(this);
    }

    private static final class OperationDetailsImpl implements OperationDetails {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails.class;
        }

        private final ActionVerbs _actionVerb;
        private final OperationDetailsKey _key;
        private final List<NecessaryInitialconditionConstraints> _necessaryInitialconditionConstraints;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>> augmentation = Collections.emptyMap();

        private OperationDetailsImpl(OperationDetailsBuilder base) {
            if (base.getKey() == null) {
                this._key = new OperationDetailsKey(
                    base.getActionVerb()
                );
                this._actionVerb = base.getActionVerb();
            } else {
                this._key = base.getKey();
                this._actionVerb = _key.getActionVerb();
            }
            this._necessaryInitialconditionConstraints = base.getNecessaryInitialconditionConstraints();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ActionVerbs getActionVerb() {
            return _actionVerb;
        }
        
        @Override
        public OperationDetailsKey getKey() {
            return _key;
        }
        
        @Override
        public List<NecessaryInitialconditionConstraints> getNecessaryInitialconditionConstraints() {
            return _necessaryInitialconditionConstraints;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_actionVerb);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_necessaryInitialconditionConstraints);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails)obj;
            if (!Objects.equals(_actionVerb, other.getActionVerb())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_necessaryInitialconditionConstraints, other.getNecessaryInitialconditionConstraints())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OperationDetailsImpl otherImpl = (OperationDetailsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails>> e : augmentation.entrySet()) {
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
            java.lang.String name = "OperationDetails [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_actionVerb != null) {
                builder.append("_actionVerb=");
                builder.append(_actionVerb);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_necessaryInitialconditionConstraints != null) {
                builder.append("_necessaryInitialconditionConstraints=");
                builder.append(_necessaryInitialconditionConstraints);
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
