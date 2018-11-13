package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementStatus;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementConfiguration;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCapability;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac
 *
 */
public class NetworkElementPacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac> {

    private UniversalId _networkElement;
    private NetworkElementCapability _networkElementCapability;
    private NetworkElementConfiguration _networkElementConfiguration;
    private NetworkElementCurrentProblems _networkElementCurrentProblems;
    private NetworkElementStatus _networkElementStatus;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>> augmentation = Collections.emptyMap();

    public NetworkElementPacBuilder() {
    }

    public NetworkElementPacBuilder(NetworkElementPac base) {
        this._networkElement = base.getNetworkElement();
        this._networkElementCapability = base.getNetworkElementCapability();
        this._networkElementConfiguration = base.getNetworkElementConfiguration();
        this._networkElementCurrentProblems = base.getNetworkElementCurrentProblems();
        this._networkElementStatus = base.getNetworkElementStatus();
        if (base instanceof NetworkElementPacImpl) {
            NetworkElementPacImpl impl = (NetworkElementPacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public UniversalId getNetworkElement() {
        return _networkElement;
    }
    
    public NetworkElementCapability getNetworkElementCapability() {
        return _networkElementCapability;
    }
    
    public NetworkElementConfiguration getNetworkElementConfiguration() {
        return _networkElementConfiguration;
    }
    
    public NetworkElementCurrentProblems getNetworkElementCurrentProblems() {
        return _networkElementCurrentProblems;
    }
    
    public NetworkElementStatus getNetworkElementStatus() {
        return _networkElementStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NetworkElementPacBuilder setNetworkElement(final UniversalId value) {
        this._networkElement = value;
        return this;
    }
    
     
    public NetworkElementPacBuilder setNetworkElementCapability(final NetworkElementCapability value) {
        this._networkElementCapability = value;
        return this;
    }
    
     
    public NetworkElementPacBuilder setNetworkElementConfiguration(final NetworkElementConfiguration value) {
        this._networkElementConfiguration = value;
        return this;
    }
    
     
    public NetworkElementPacBuilder setNetworkElementCurrentProblems(final NetworkElementCurrentProblems value) {
        this._networkElementCurrentProblems = value;
        return this;
    }
    
     
    public NetworkElementPacBuilder setNetworkElementStatus(final NetworkElementStatus value) {
        this._networkElementStatus = value;
        return this;
    }
    
    public NetworkElementPacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetworkElementPacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NetworkElementPac build() {
        return new NetworkElementPacImpl(this);
    }

    private static final class NetworkElementPacImpl implements NetworkElementPac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac.class;
        }

        private final UniversalId _networkElement;
        private final NetworkElementCapability _networkElementCapability;
        private final NetworkElementConfiguration _networkElementConfiguration;
        private final NetworkElementCurrentProblems _networkElementCurrentProblems;
        private final NetworkElementStatus _networkElementStatus;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>> augmentation = Collections.emptyMap();

        private NetworkElementPacImpl(NetworkElementPacBuilder base) {
            this._networkElement = base.getNetworkElement();
            this._networkElementCapability = base.getNetworkElementCapability();
            this._networkElementConfiguration = base.getNetworkElementConfiguration();
            this._networkElementCurrentProblems = base.getNetworkElementCurrentProblems();
            this._networkElementStatus = base.getNetworkElementStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public UniversalId getNetworkElement() {
            return _networkElement;
        }
        
        @Override
        public NetworkElementCapability getNetworkElementCapability() {
            return _networkElementCapability;
        }
        
        @Override
        public NetworkElementConfiguration getNetworkElementConfiguration() {
            return _networkElementConfiguration;
        }
        
        @Override
        public NetworkElementCurrentProblems getNetworkElementCurrentProblems() {
            return _networkElementCurrentProblems;
        }
        
        @Override
        public NetworkElementStatus getNetworkElementStatus() {
            return _networkElementStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_networkElement);
            result = prime * result + Objects.hashCode(_networkElementCapability);
            result = prime * result + Objects.hashCode(_networkElementConfiguration);
            result = prime * result + Objects.hashCode(_networkElementCurrentProblems);
            result = prime * result + Objects.hashCode(_networkElementStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac)obj;
            if (!Objects.equals(_networkElement, other.getNetworkElement())) {
                return false;
            }
            if (!Objects.equals(_networkElementCapability, other.getNetworkElementCapability())) {
                return false;
            }
            if (!Objects.equals(_networkElementConfiguration, other.getNetworkElementConfiguration())) {
                return false;
            }
            if (!Objects.equals(_networkElementCurrentProblems, other.getNetworkElementCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_networkElementStatus, other.getNetworkElementStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkElementPacImpl otherImpl = (NetworkElementPacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NetworkElementPac [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_networkElement != null) {
                builder.append("_networkElement=");
                builder.append(_networkElement);
                builder.append(", ");
            }
            if (_networkElementCapability != null) {
                builder.append("_networkElementCapability=");
                builder.append(_networkElementCapability);
                builder.append(", ");
            }
            if (_networkElementConfiguration != null) {
                builder.append("_networkElementConfiguration=");
                builder.append(_networkElementConfiguration);
                builder.append(", ");
            }
            if (_networkElementCurrentProblems != null) {
                builder.append("_networkElementCurrentProblems=");
                builder.append(_networkElementCurrentProblems);
                builder.append(", ");
            }
            if (_networkElementStatus != null) {
                builder.append("_networkElementStatus=");
                builder.append(_networkElementStatus);
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
