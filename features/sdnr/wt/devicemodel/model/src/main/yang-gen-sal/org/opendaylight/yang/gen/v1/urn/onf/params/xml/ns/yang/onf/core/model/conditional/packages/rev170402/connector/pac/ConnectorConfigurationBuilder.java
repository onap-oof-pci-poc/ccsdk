package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.configuration.g.ProblemTypeSeverityList;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration
 *
 */
public class ConnectorConfigurationBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration> {

    private List<ProblemTypeSeverityList> _problemTypeSeverityList;
    private java.lang.String _remoteEndPoint;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>> augmentation = Collections.emptyMap();

    public ConnectorConfigurationBuilder() {
    }
    public ConnectorConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorConfigurationG arg) {
        this._problemTypeSeverityList = arg.getProblemTypeSeverityList();
        this._remoteEndPoint = arg.getRemoteEndPoint();
    }

    public ConnectorConfigurationBuilder(ConnectorConfiguration base) {
        this._problemTypeSeverityList = base.getProblemTypeSeverityList();
        this._remoteEndPoint = base.getRemoteEndPoint();
        if (base instanceof ConnectorConfigurationImpl) {
            ConnectorConfigurationImpl impl = (ConnectorConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorConfigurationG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorConfigurationG) {
            this._problemTypeSeverityList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorConfigurationG)arg).getProblemTypeSeverityList();
            this._remoteEndPoint = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorConfigurationG)arg).getRemoteEndPoint();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorConfigurationG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<ProblemTypeSeverityList> getProblemTypeSeverityList() {
        return _problemTypeSeverityList;
    }
    
    public java.lang.String getRemoteEndPoint() {
        return _remoteEndPoint;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ConnectorConfigurationBuilder setProblemTypeSeverityList(final List<ProblemTypeSeverityList> value) {
        this._problemTypeSeverityList = value;
        return this;
    }
    
     
    public ConnectorConfigurationBuilder setRemoteEndPoint(final java.lang.String value) {
        this._remoteEndPoint = value;
        return this;
    }
    
    public ConnectorConfigurationBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConnectorConfigurationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConnectorConfiguration build() {
        return new ConnectorConfigurationImpl(this);
    }

    private static final class ConnectorConfigurationImpl implements ConnectorConfiguration {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration.class;
        }

        private final List<ProblemTypeSeverityList> _problemTypeSeverityList;
        private final java.lang.String _remoteEndPoint;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>> augmentation = Collections.emptyMap();

        private ConnectorConfigurationImpl(ConnectorConfigurationBuilder base) {
            this._problemTypeSeverityList = base.getProblemTypeSeverityList();
            this._remoteEndPoint = base.getRemoteEndPoint();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<ProblemTypeSeverityList> getProblemTypeSeverityList() {
            return _problemTypeSeverityList;
        }
        
        @Override
        public java.lang.String getRemoteEndPoint() {
            return _remoteEndPoint;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_problemTypeSeverityList);
            result = prime * result + Objects.hashCode(_remoteEndPoint);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration)obj;
            if (!Objects.equals(_problemTypeSeverityList, other.getProblemTypeSeverityList())) {
                return false;
            }
            if (!Objects.equals(_remoteEndPoint, other.getRemoteEndPoint())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConnectorConfigurationImpl otherImpl = (ConnectorConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ConnectorConfiguration [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_problemTypeSeverityList != null) {
                builder.append("_problemTypeSeverityList=");
                builder.append(_problemTypeSeverityList);
                builder.append(", ");
            }
            if (_remoteEndPoint != null) {
                builder.append("_remoteEndPoint=");
                builder.append(_remoteEndPoint);
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
