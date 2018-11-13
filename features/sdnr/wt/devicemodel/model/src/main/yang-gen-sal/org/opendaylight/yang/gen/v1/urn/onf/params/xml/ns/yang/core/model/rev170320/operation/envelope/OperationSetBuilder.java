package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ActionEffort;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.set.g.OperationDetails;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PauseResumeRule;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet
 *
 */
public class OperationSetBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet> {

    private List<ActionEffort> _afterOperationSet;
    private List<ActionEffort> _beforeOperationSet;
    private ActionEffort _effortAndAction;
    private OperationSetKey _key;
    private List<OperationDetails> _operationDetails;
    private List<ActionEffort> _operationset;
    private PauseResumeRule _pauseResumeRule;
    private java.lang.Boolean _isShortLived;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>> augmentation = Collections.emptyMap();

    public OperationSetBuilder() {
    }
    public OperationSetBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationSetG arg) {
        this._afterOperationSet = arg.getAfterOperationSet();
        this._beforeOperationSet = arg.getBeforeOperationSet();
        this._effortAndAction = arg.getEffortAndAction();
        this._pauseResumeRule = arg.getPauseResumeRule();
        this._operationset = arg.getOperationset();
        this._isShortLived = arg.isIsShortLived();
        this._operationDetails = arg.getOperationDetails();
    }

    public OperationSetBuilder(OperationSet base) {
        if (base.getKey() == null) {
            this._key = new OperationSetKey(
                base.getEffortAndAction()
            );
            this._effortAndAction = base.getEffortAndAction();
        } else {
            this._key = base.getKey();
            this._effortAndAction = _key.getEffortAndAction();
        }
        this._afterOperationSet = base.getAfterOperationSet();
        this._beforeOperationSet = base.getBeforeOperationSet();
        this._operationDetails = base.getOperationDetails();
        this._operationset = base.getOperationset();
        this._pauseResumeRule = base.getPauseResumeRule();
        this._isShortLived = base.isIsShortLived();
        if (base instanceof OperationSetImpl) {
            OperationSetImpl impl = (OperationSetImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationSetG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationSetG) {
            this._afterOperationSet = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationSetG)arg).getAfterOperationSet();
            this._beforeOperationSet = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationSetG)arg).getBeforeOperationSet();
            this._effortAndAction = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationSetG)arg).getEffortAndAction();
            this._pauseResumeRule = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationSetG)arg).getPauseResumeRule();
            this._operationset = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationSetG)arg).getOperationset();
            this._isShortLived = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationSetG)arg).isIsShortLived();
            this._operationDetails = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationSetG)arg).getOperationDetails();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationSetG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<ActionEffort> getAfterOperationSet() {
        return _afterOperationSet;
    }
    
    public List<ActionEffort> getBeforeOperationSet() {
        return _beforeOperationSet;
    }
    
    public ActionEffort getEffortAndAction() {
        return _effortAndAction;
    }
    
    public OperationSetKey getKey() {
        return _key;
    }
    
    public List<OperationDetails> getOperationDetails() {
        return _operationDetails;
    }
    
    public List<ActionEffort> getOperationset() {
        return _operationset;
    }
    
    public PauseResumeRule getPauseResumeRule() {
        return _pauseResumeRule;
    }
    
    public java.lang.Boolean isIsShortLived() {
        return _isShortLived;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public OperationSetBuilder setAfterOperationSet(final List<ActionEffort> value) {
        this._afterOperationSet = value;
        return this;
    }
    
     
    public OperationSetBuilder setBeforeOperationSet(final List<ActionEffort> value) {
        this._beforeOperationSet = value;
        return this;
    }
    
     
    public OperationSetBuilder setEffortAndAction(final ActionEffort value) {
        this._effortAndAction = value;
        return this;
    }
    
     
    public OperationSetBuilder setKey(final OperationSetKey value) {
        this._key = value;
        return this;
    }
    
     
    public OperationSetBuilder setOperationDetails(final List<OperationDetails> value) {
        this._operationDetails = value;
        return this;
    }
    
     
    public OperationSetBuilder setOperationset(final List<ActionEffort> value) {
        this._operationset = value;
        return this;
    }
    
     
    public OperationSetBuilder setPauseResumeRule(final PauseResumeRule value) {
        this._pauseResumeRule = value;
        return this;
    }
    
     
    public OperationSetBuilder setIsShortLived(final java.lang.Boolean value) {
        this._isShortLived = value;
        return this;
    }
    
    public OperationSetBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public OperationSetBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public OperationSet build() {
        return new OperationSetImpl(this);
    }

    private static final class OperationSetImpl implements OperationSet {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet.class;
        }

        private final List<ActionEffort> _afterOperationSet;
        private final List<ActionEffort> _beforeOperationSet;
        private final ActionEffort _effortAndAction;
        private final OperationSetKey _key;
        private final List<OperationDetails> _operationDetails;
        private final List<ActionEffort> _operationset;
        private final PauseResumeRule _pauseResumeRule;
        private final java.lang.Boolean _isShortLived;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>> augmentation = Collections.emptyMap();

        private OperationSetImpl(OperationSetBuilder base) {
            if (base.getKey() == null) {
                this._key = new OperationSetKey(
                    base.getEffortAndAction()
                );
                this._effortAndAction = base.getEffortAndAction();
            } else {
                this._key = base.getKey();
                this._effortAndAction = _key.getEffortAndAction();
            }
            this._afterOperationSet = base.getAfterOperationSet();
            this._beforeOperationSet = base.getBeforeOperationSet();
            this._operationDetails = base.getOperationDetails();
            this._operationset = base.getOperationset();
            this._pauseResumeRule = base.getPauseResumeRule();
            this._isShortLived = base.isIsShortLived();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<ActionEffort> getAfterOperationSet() {
            return _afterOperationSet;
        }
        
        @Override
        public List<ActionEffort> getBeforeOperationSet() {
            return _beforeOperationSet;
        }
        
        @Override
        public ActionEffort getEffortAndAction() {
            return _effortAndAction;
        }
        
        @Override
        public OperationSetKey getKey() {
            return _key;
        }
        
        @Override
        public List<OperationDetails> getOperationDetails() {
            return _operationDetails;
        }
        
        @Override
        public List<ActionEffort> getOperationset() {
            return _operationset;
        }
        
        @Override
        public PauseResumeRule getPauseResumeRule() {
            return _pauseResumeRule;
        }
        
        @Override
        public java.lang.Boolean isIsShortLived() {
            return _isShortLived;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_afterOperationSet);
            result = prime * result + Objects.hashCode(_beforeOperationSet);
            result = prime * result + Objects.hashCode(_effortAndAction);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_operationDetails);
            result = prime * result + Objects.hashCode(_operationset);
            result = prime * result + Objects.hashCode(_pauseResumeRule);
            result = prime * result + Objects.hashCode(_isShortLived);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet)obj;
            if (!Objects.equals(_afterOperationSet, other.getAfterOperationSet())) {
                return false;
            }
            if (!Objects.equals(_beforeOperationSet, other.getBeforeOperationSet())) {
                return false;
            }
            if (!Objects.equals(_effortAndAction, other.getEffortAndAction())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_operationDetails, other.getOperationDetails())) {
                return false;
            }
            if (!Objects.equals(_operationset, other.getOperationset())) {
                return false;
            }
            if (!Objects.equals(_pauseResumeRule, other.getPauseResumeRule())) {
                return false;
            }
            if (!Objects.equals(_isShortLived, other.isIsShortLived())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OperationSetImpl otherImpl = (OperationSetImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet>> e : augmentation.entrySet()) {
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
            java.lang.String name = "OperationSet [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_afterOperationSet != null) {
                builder.append("_afterOperationSet=");
                builder.append(_afterOperationSet);
                builder.append(", ");
            }
            if (_beforeOperationSet != null) {
                builder.append("_beforeOperationSet=");
                builder.append(_beforeOperationSet);
                builder.append(", ");
            }
            if (_effortAndAction != null) {
                builder.append("_effortAndAction=");
                builder.append(_effortAndAction);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_operationDetails != null) {
                builder.append("_operationDetails=");
                builder.append(_operationDetails);
                builder.append(", ");
            }
            if (_operationset != null) {
                builder.append("_operationset=");
                builder.append(_operationset);
                builder.append(", ");
            }
            if (_pauseResumeRule != null) {
                builder.append("_pauseResumeRule=");
                builder.append(_pauseResumeRule);
                builder.append(", ");
            }
            if (_isShortLived != null) {
                builder.append("_isShortLived=");
                builder.append(_isShortLived);
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
