package org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput
 *
 */
public class GreetingInputBuilder implements Builder<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput> {

    private java.lang.String _salutation;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>>, Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>> augmentation = Collections.emptyMap();

    public GreetingInputBuilder() {
    }

    public GreetingInputBuilder(GreetingInput base) {
        this._salutation = base.getSalutation();
        if (base instanceof GreetingInputImpl) {
            GreetingInputImpl impl = (GreetingInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getSalutation() {
        return _salutation;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public GreetingInputBuilder setSalutation(final java.lang.String value) {
        this._salutation = value;
        return this;
    }
    
    public GreetingInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GreetingInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GreetingInput build() {
        return new GreetingInputImpl(this);
    }

    private static final class GreetingInputImpl implements GreetingInput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput.class;
        }

        private final java.lang.String _salutation;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>>, Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>> augmentation = Collections.emptyMap();

        private GreetingInputImpl(GreetingInputBuilder base) {
            this._salutation = base.getSalutation();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>>, Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>>, Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getSalutation() {
            return _salutation;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_salutation);
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
            if (!org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput other = (org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput)obj;
            if (!Objects.equals(_salutation, other.getSalutation())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GreetingInputImpl otherImpl = (GreetingInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>>, Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "GreetingInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_salutation != null) {
                builder.append("_salutation=");
                builder.append(_salutation);
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
