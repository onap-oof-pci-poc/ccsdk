package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac
 *
 */
public class MwAirInterfaceHsbEndPointPacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac> {

    private UniversalId _endpoint;
    private MwAirInterfaceHsbEndPointPacKey _key;
    private RoleType _role;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>> augmentation = Collections.emptyMap();

    public MwAirInterfaceHsbEndPointPacBuilder() {
    }

    public MwAirInterfaceHsbEndPointPacBuilder(MwAirInterfaceHsbEndPointPac base) {
        if (base.getKey() == null) {
            this._key = new MwAirInterfaceHsbEndPointPacKey(
                base.getEndpoint()
            );
            this._endpoint = base.getEndpoint();
        } else {
            this._key = base.getKey();
            this._endpoint = _key.getEndpoint();
        }
        this._role = base.getRole();
        if (base instanceof MwAirInterfaceHsbEndPointPacImpl) {
            MwAirInterfaceHsbEndPointPacImpl impl = (MwAirInterfaceHsbEndPointPacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public UniversalId getEndpoint() {
        return _endpoint;
    }
    
    public MwAirInterfaceHsbEndPointPacKey getKey() {
        return _key;
    }
    
    public RoleType getRole() {
        return _role;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MwAirInterfaceHsbEndPointPacBuilder setEndpoint(final UniversalId value) {
        this._endpoint = value;
        return this;
    }
    
     
    public MwAirInterfaceHsbEndPointPacBuilder setKey(final MwAirInterfaceHsbEndPointPacKey value) {
        this._key = value;
        return this;
    }
    
     
    public MwAirInterfaceHsbEndPointPacBuilder setRole(final RoleType value) {
        this._role = value;
        return this;
    }
    
    public MwAirInterfaceHsbEndPointPacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MwAirInterfaceHsbEndPointPacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MwAirInterfaceHsbEndPointPac build() {
        return new MwAirInterfaceHsbEndPointPacImpl(this);
    }

    private static final class MwAirInterfaceHsbEndPointPacImpl implements MwAirInterfaceHsbEndPointPac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac.class;
        }

        private final UniversalId _endpoint;
        private final MwAirInterfaceHsbEndPointPacKey _key;
        private final RoleType _role;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>> augmentation = Collections.emptyMap();

        private MwAirInterfaceHsbEndPointPacImpl(MwAirInterfaceHsbEndPointPacBuilder base) {
            if (base.getKey() == null) {
                this._key = new MwAirInterfaceHsbEndPointPacKey(
                    base.getEndpoint()
                );
                this._endpoint = base.getEndpoint();
            } else {
                this._key = base.getKey();
                this._endpoint = _key.getEndpoint();
            }
            this._role = base.getRole();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public UniversalId getEndpoint() {
            return _endpoint;
        }
        
        @Override
        public MwAirInterfaceHsbEndPointPacKey getKey() {
            return _key;
        }
        
        @Override
        public RoleType getRole() {
            return _role;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_endpoint);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_role);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac)obj;
            if (!Objects.equals(_endpoint, other.getEndpoint())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_role, other.getRole())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MwAirInterfaceHsbEndPointPacImpl otherImpl = (MwAirInterfaceHsbEndPointPacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceHsbEndPointPac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MwAirInterfaceHsbEndPointPac [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_endpoint != null) {
                builder.append("_endpoint=");
                builder.append(_endpoint);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_role != null) {
                builder.append("_role=");
                builder.append(_role);
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
