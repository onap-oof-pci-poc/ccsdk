package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.Generaldirectives;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.Operationidentifiers;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.operation.envelope.OperationSet;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope
 *
 */
public class OperationEnvelopeBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope> {

    private Generaldirectives _generaldirectives;
    private List<OperationSet> _operationSet;
    private Operationidentifiers _operationidentifiers;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>> augmentation = Collections.emptyMap();

    public OperationEnvelopeBuilder() {
    }

    public OperationEnvelopeBuilder(OperationEnvelope base) {
        this._generaldirectives = base.getGeneraldirectives();
        this._operationSet = base.getOperationSet();
        this._operationidentifiers = base.getOperationidentifiers();
        if (base instanceof OperationEnvelopeImpl) {
            OperationEnvelopeImpl impl = (OperationEnvelopeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Generaldirectives getGeneraldirectives() {
        return _generaldirectives;
    }
    
    public List<OperationSet> getOperationSet() {
        return _operationSet;
    }
    
    public Operationidentifiers getOperationidentifiers() {
        return _operationidentifiers;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public OperationEnvelopeBuilder setGeneraldirectives(final Generaldirectives value) {
        this._generaldirectives = value;
        return this;
    }
    
     
    public OperationEnvelopeBuilder setOperationSet(final List<OperationSet> value) {
        this._operationSet = value;
        return this;
    }
    
     
    public OperationEnvelopeBuilder setOperationidentifiers(final Operationidentifiers value) {
        this._operationidentifiers = value;
        return this;
    }
    
    public OperationEnvelopeBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public OperationEnvelopeBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public OperationEnvelope build() {
        return new OperationEnvelopeImpl(this);
    }

    private static final class OperationEnvelopeImpl implements OperationEnvelope {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope.class;
        }

        private final Generaldirectives _generaldirectives;
        private final List<OperationSet> _operationSet;
        private final Operationidentifiers _operationidentifiers;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>> augmentation = Collections.emptyMap();

        private OperationEnvelopeImpl(OperationEnvelopeBuilder base) {
            this._generaldirectives = base.getGeneraldirectives();
            this._operationSet = base.getOperationSet();
            this._operationidentifiers = base.getOperationidentifiers();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Generaldirectives getGeneraldirectives() {
            return _generaldirectives;
        }
        
        @Override
        public List<OperationSet> getOperationSet() {
            return _operationSet;
        }
        
        @Override
        public Operationidentifiers getOperationidentifiers() {
            return _operationidentifiers;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_generaldirectives);
            result = prime * result + Objects.hashCode(_operationSet);
            result = prime * result + Objects.hashCode(_operationidentifiers);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope)obj;
            if (!Objects.equals(_generaldirectives, other.getGeneraldirectives())) {
                return false;
            }
            if (!Objects.equals(_operationSet, other.getOperationSet())) {
                return false;
            }
            if (!Objects.equals(_operationidentifiers, other.getOperationidentifiers())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OperationEnvelopeImpl otherImpl = (OperationEnvelopeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationEnvelope>> e : augmentation.entrySet()) {
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
            java.lang.String name = "OperationEnvelope [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_generaldirectives != null) {
                builder.append("_generaldirectives=");
                builder.append(_generaldirectives);
                builder.append(", ");
            }
            if (_operationSet != null) {
                builder.append("_operationSet=");
                builder.append(_operationSet);
                builder.append(", ");
            }
            if (_operationidentifiers != null) {
                builder.append("_operationidentifiers=");
                builder.append(_operationidentifiers);
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
