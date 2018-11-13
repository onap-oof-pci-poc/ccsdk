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
 * Class that builds {@link org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput
 *
 */
public class GreetingOutputBuilder implements Builder<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput> {

    private java.lang.String _response;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>>, Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>> augmentation = Collections.emptyMap();

    public GreetingOutputBuilder() {
    }

    public GreetingOutputBuilder(GreetingOutput base) {
        this._response = base.getResponse();
        if (base instanceof GreetingOutputImpl) {
            GreetingOutputImpl impl = (GreetingOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getResponse() {
        return _response;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public GreetingOutputBuilder setResponse(final java.lang.String value) {
        this._response = value;
        return this;
    }
    
    public GreetingOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GreetingOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GreetingOutput build() {
        return new GreetingOutputImpl(this);
    }

    private static final class GreetingOutputImpl implements GreetingOutput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput.class;
        }

        private final java.lang.String _response;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>>, Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>> augmentation = Collections.emptyMap();

        private GreetingOutputImpl(GreetingOutputBuilder base) {
            this._response = base.getResponse();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>>, Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>>, Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getResponse() {
            return _response;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_response);
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
            if (!org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput other = (org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput)obj;
            if (!Objects.equals(_response, other.getResponse())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GreetingOutputImpl otherImpl = (GreetingOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>>, Augmentation<org.opendaylight.yang.gen.v1.org.onap.ccsdk.features.sdnr.northbound.helloworld.rev150105.GreetingOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "GreetingOutput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_response != null) {
                builder.append("_response=");
                builder.append(_response);
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
