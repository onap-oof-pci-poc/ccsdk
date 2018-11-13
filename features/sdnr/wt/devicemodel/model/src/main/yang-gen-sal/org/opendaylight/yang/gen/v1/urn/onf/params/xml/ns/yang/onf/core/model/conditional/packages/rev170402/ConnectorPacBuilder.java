package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorCapability;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorCurrentProblems;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac
 *
 */
public class ConnectorPacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac> {

    private UniversalId _connector;
    private ConnectorCapability _connectorCapability;
    private ConnectorConfiguration _connectorConfiguration;
    private ConnectorCurrentProblems _connectorCurrentProblems;
    private ConnectorStatus _connectorStatus;
    private ConnectorPacKey _key;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>> augmentation = Collections.emptyMap();

    public ConnectorPacBuilder() {
    }

    public ConnectorPacBuilder(ConnectorPac base) {
        if (base.getKey() == null) {
            this._key = new ConnectorPacKey(
                base.getConnector()
            );
            this._connector = base.getConnector();
        } else {
            this._key = base.getKey();
            this._connector = _key.getConnector();
        }
        this._connectorCapability = base.getConnectorCapability();
        this._connectorConfiguration = base.getConnectorConfiguration();
        this._connectorCurrentProblems = base.getConnectorCurrentProblems();
        this._connectorStatus = base.getConnectorStatus();
        if (base instanceof ConnectorPacImpl) {
            ConnectorPacImpl impl = (ConnectorPacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public UniversalId getConnector() {
        return _connector;
    }
    
    public ConnectorCapability getConnectorCapability() {
        return _connectorCapability;
    }
    
    public ConnectorConfiguration getConnectorConfiguration() {
        return _connectorConfiguration;
    }
    
    public ConnectorCurrentProblems getConnectorCurrentProblems() {
        return _connectorCurrentProblems;
    }
    
    public ConnectorStatus getConnectorStatus() {
        return _connectorStatus;
    }
    
    public ConnectorPacKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ConnectorPacBuilder setConnector(final UniversalId value) {
        this._connector = value;
        return this;
    }
    
     
    public ConnectorPacBuilder setConnectorCapability(final ConnectorCapability value) {
        this._connectorCapability = value;
        return this;
    }
    
     
    public ConnectorPacBuilder setConnectorConfiguration(final ConnectorConfiguration value) {
        this._connectorConfiguration = value;
        return this;
    }
    
     
    public ConnectorPacBuilder setConnectorCurrentProblems(final ConnectorCurrentProblems value) {
        this._connectorCurrentProblems = value;
        return this;
    }
    
     
    public ConnectorPacBuilder setConnectorStatus(final ConnectorStatus value) {
        this._connectorStatus = value;
        return this;
    }
    
     
    public ConnectorPacBuilder setKey(final ConnectorPacKey value) {
        this._key = value;
        return this;
    }
    
    public ConnectorPacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConnectorPacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConnectorPac build() {
        return new ConnectorPacImpl(this);
    }

    private static final class ConnectorPacImpl implements ConnectorPac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac.class;
        }

        private final UniversalId _connector;
        private final ConnectorCapability _connectorCapability;
        private final ConnectorConfiguration _connectorConfiguration;
        private final ConnectorCurrentProblems _connectorCurrentProblems;
        private final ConnectorStatus _connectorStatus;
        private final ConnectorPacKey _key;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>> augmentation = Collections.emptyMap();

        private ConnectorPacImpl(ConnectorPacBuilder base) {
            if (base.getKey() == null) {
                this._key = new ConnectorPacKey(
                    base.getConnector()
                );
                this._connector = base.getConnector();
            } else {
                this._key = base.getKey();
                this._connector = _key.getConnector();
            }
            this._connectorCapability = base.getConnectorCapability();
            this._connectorConfiguration = base.getConnectorConfiguration();
            this._connectorCurrentProblems = base.getConnectorCurrentProblems();
            this._connectorStatus = base.getConnectorStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public UniversalId getConnector() {
            return _connector;
        }
        
        @Override
        public ConnectorCapability getConnectorCapability() {
            return _connectorCapability;
        }
        
        @Override
        public ConnectorConfiguration getConnectorConfiguration() {
            return _connectorConfiguration;
        }
        
        @Override
        public ConnectorCurrentProblems getConnectorCurrentProblems() {
            return _connectorCurrentProblems;
        }
        
        @Override
        public ConnectorStatus getConnectorStatus() {
            return _connectorStatus;
        }
        
        @Override
        public ConnectorPacKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_connector);
            result = prime * result + Objects.hashCode(_connectorCapability);
            result = prime * result + Objects.hashCode(_connectorConfiguration);
            result = prime * result + Objects.hashCode(_connectorCurrentProblems);
            result = prime * result + Objects.hashCode(_connectorStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac)obj;
            if (!Objects.equals(_connector, other.getConnector())) {
                return false;
            }
            if (!Objects.equals(_connectorCapability, other.getConnectorCapability())) {
                return false;
            }
            if (!Objects.equals(_connectorConfiguration, other.getConnectorConfiguration())) {
                return false;
            }
            if (!Objects.equals(_connectorCurrentProblems, other.getConnectorCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_connectorStatus, other.getConnectorStatus())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConnectorPacImpl otherImpl = (ConnectorPacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ConnectorPac [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_connector != null) {
                builder.append("_connector=");
                builder.append(_connector);
                builder.append(", ");
            }
            if (_connectorCapability != null) {
                builder.append("_connectorCapability=");
                builder.append(_connectorCapability);
                builder.append(", ");
            }
            if (_connectorConfiguration != null) {
                builder.append("_connectorConfiguration=");
                builder.append(_connectorConfiguration);
                builder.append(", ");
            }
            if (_connectorCurrentProblems != null) {
                builder.append("_connectorCurrentProblems=");
                builder.append(_connectorCurrentProblems);
                builder.append(", ");
            }
            if (_connectorStatus != null) {
                builder.append("_connectorStatus=");
                builder.append(_connectorStatus);
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
