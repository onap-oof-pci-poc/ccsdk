package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionCurrentProblems;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionCurrentPerformance;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionCapability;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionHistoricalPerformances;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac
 *
 */
public class OtnOduConnectionPacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac> {

    private OtnOduConnectionPacKey _key;
    private UniversalId _layerProtocol;
    private OtnOduConnectionCapability _otnOduConnectionCapability;
    private OtnOduConnectionConfiguration _otnOduConnectionConfiguration;
    private OtnOduConnectionCurrentPerformance _otnOduConnectionCurrentPerformance;
    private OtnOduConnectionCurrentProblems _otnOduConnectionCurrentProblems;
    private OtnOduConnectionHistoricalPerformances _otnOduConnectionHistoricalPerformances;
    private OtnOduConnectionStatus _otnOduConnectionStatus;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>> augmentation = Collections.emptyMap();

    public OtnOduConnectionPacBuilder() {
    }

    public OtnOduConnectionPacBuilder(OtnOduConnectionPac base) {
        if (base.getKey() == null) {
            this._key = new OtnOduConnectionPacKey(
                base.getLayerProtocol()
            );
            this._layerProtocol = base.getLayerProtocol();
        } else {
            this._key = base.getKey();
            this._layerProtocol = _key.getLayerProtocol();
        }
        this._otnOduConnectionCapability = base.getOtnOduConnectionCapability();
        this._otnOduConnectionConfiguration = base.getOtnOduConnectionConfiguration();
        this._otnOduConnectionCurrentPerformance = base.getOtnOduConnectionCurrentPerformance();
        this._otnOduConnectionCurrentProblems = base.getOtnOduConnectionCurrentProblems();
        this._otnOduConnectionHistoricalPerformances = base.getOtnOduConnectionHistoricalPerformances();
        this._otnOduConnectionStatus = base.getOtnOduConnectionStatus();
        if (base instanceof OtnOduConnectionPacImpl) {
            OtnOduConnectionPacImpl impl = (OtnOduConnectionPacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public OtnOduConnectionPacKey getKey() {
        return _key;
    }
    
    public UniversalId getLayerProtocol() {
        return _layerProtocol;
    }
    
    public OtnOduConnectionCapability getOtnOduConnectionCapability() {
        return _otnOduConnectionCapability;
    }
    
    public OtnOduConnectionConfiguration getOtnOduConnectionConfiguration() {
        return _otnOduConnectionConfiguration;
    }
    
    public OtnOduConnectionCurrentPerformance getOtnOduConnectionCurrentPerformance() {
        return _otnOduConnectionCurrentPerformance;
    }
    
    public OtnOduConnectionCurrentProblems getOtnOduConnectionCurrentProblems() {
        return _otnOduConnectionCurrentProblems;
    }
    
    public OtnOduConnectionHistoricalPerformances getOtnOduConnectionHistoricalPerformances() {
        return _otnOduConnectionHistoricalPerformances;
    }
    
    public OtnOduConnectionStatus getOtnOduConnectionStatus() {
        return _otnOduConnectionStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public OtnOduConnectionPacBuilder setKey(final OtnOduConnectionPacKey value) {
        this._key = value;
        return this;
    }
    
     
    public OtnOduConnectionPacBuilder setLayerProtocol(final UniversalId value) {
        this._layerProtocol = value;
        return this;
    }
    
     
    public OtnOduConnectionPacBuilder setOtnOduConnectionCapability(final OtnOduConnectionCapability value) {
        this._otnOduConnectionCapability = value;
        return this;
    }
    
     
    public OtnOduConnectionPacBuilder setOtnOduConnectionConfiguration(final OtnOduConnectionConfiguration value) {
        this._otnOduConnectionConfiguration = value;
        return this;
    }
    
     
    public OtnOduConnectionPacBuilder setOtnOduConnectionCurrentPerformance(final OtnOduConnectionCurrentPerformance value) {
        this._otnOduConnectionCurrentPerformance = value;
        return this;
    }
    
     
    public OtnOduConnectionPacBuilder setOtnOduConnectionCurrentProblems(final OtnOduConnectionCurrentProblems value) {
        this._otnOduConnectionCurrentProblems = value;
        return this;
    }
    
     
    public OtnOduConnectionPacBuilder setOtnOduConnectionHistoricalPerformances(final OtnOduConnectionHistoricalPerformances value) {
        this._otnOduConnectionHistoricalPerformances = value;
        return this;
    }
    
     
    public OtnOduConnectionPacBuilder setOtnOduConnectionStatus(final OtnOduConnectionStatus value) {
        this._otnOduConnectionStatus = value;
        return this;
    }
    
    public OtnOduConnectionPacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public OtnOduConnectionPacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public OtnOduConnectionPac build() {
        return new OtnOduConnectionPacImpl(this);
    }

    private static final class OtnOduConnectionPacImpl implements OtnOduConnectionPac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac.class;
        }

        private final OtnOduConnectionPacKey _key;
        private final UniversalId _layerProtocol;
        private final OtnOduConnectionCapability _otnOduConnectionCapability;
        private final OtnOduConnectionConfiguration _otnOduConnectionConfiguration;
        private final OtnOduConnectionCurrentPerformance _otnOduConnectionCurrentPerformance;
        private final OtnOduConnectionCurrentProblems _otnOduConnectionCurrentProblems;
        private final OtnOduConnectionHistoricalPerformances _otnOduConnectionHistoricalPerformances;
        private final OtnOduConnectionStatus _otnOduConnectionStatus;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>> augmentation = Collections.emptyMap();

        private OtnOduConnectionPacImpl(OtnOduConnectionPacBuilder base) {
            if (base.getKey() == null) {
                this._key = new OtnOduConnectionPacKey(
                    base.getLayerProtocol()
                );
                this._layerProtocol = base.getLayerProtocol();
            } else {
                this._key = base.getKey();
                this._layerProtocol = _key.getLayerProtocol();
            }
            this._otnOduConnectionCapability = base.getOtnOduConnectionCapability();
            this._otnOduConnectionConfiguration = base.getOtnOduConnectionConfiguration();
            this._otnOduConnectionCurrentPerformance = base.getOtnOduConnectionCurrentPerformance();
            this._otnOduConnectionCurrentProblems = base.getOtnOduConnectionCurrentProblems();
            this._otnOduConnectionHistoricalPerformances = base.getOtnOduConnectionHistoricalPerformances();
            this._otnOduConnectionStatus = base.getOtnOduConnectionStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public OtnOduConnectionPacKey getKey() {
            return _key;
        }
        
        @Override
        public UniversalId getLayerProtocol() {
            return _layerProtocol;
        }
        
        @Override
        public OtnOduConnectionCapability getOtnOduConnectionCapability() {
            return _otnOduConnectionCapability;
        }
        
        @Override
        public OtnOduConnectionConfiguration getOtnOduConnectionConfiguration() {
            return _otnOduConnectionConfiguration;
        }
        
        @Override
        public OtnOduConnectionCurrentPerformance getOtnOduConnectionCurrentPerformance() {
            return _otnOduConnectionCurrentPerformance;
        }
        
        @Override
        public OtnOduConnectionCurrentProblems getOtnOduConnectionCurrentProblems() {
            return _otnOduConnectionCurrentProblems;
        }
        
        @Override
        public OtnOduConnectionHistoricalPerformances getOtnOduConnectionHistoricalPerformances() {
            return _otnOduConnectionHistoricalPerformances;
        }
        
        @Override
        public OtnOduConnectionStatus getOtnOduConnectionStatus() {
            return _otnOduConnectionStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_layerProtocol);
            result = prime * result + Objects.hashCode(_otnOduConnectionCapability);
            result = prime * result + Objects.hashCode(_otnOduConnectionConfiguration);
            result = prime * result + Objects.hashCode(_otnOduConnectionCurrentPerformance);
            result = prime * result + Objects.hashCode(_otnOduConnectionCurrentProblems);
            result = prime * result + Objects.hashCode(_otnOduConnectionHistoricalPerformances);
            result = prime * result + Objects.hashCode(_otnOduConnectionStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_layerProtocol, other.getLayerProtocol())) {
                return false;
            }
            if (!Objects.equals(_otnOduConnectionCapability, other.getOtnOduConnectionCapability())) {
                return false;
            }
            if (!Objects.equals(_otnOduConnectionConfiguration, other.getOtnOduConnectionConfiguration())) {
                return false;
            }
            if (!Objects.equals(_otnOduConnectionCurrentPerformance, other.getOtnOduConnectionCurrentPerformance())) {
                return false;
            }
            if (!Objects.equals(_otnOduConnectionCurrentProblems, other.getOtnOduConnectionCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_otnOduConnectionHistoricalPerformances, other.getOtnOduConnectionHistoricalPerformances())) {
                return false;
            }
            if (!Objects.equals(_otnOduConnectionStatus, other.getOtnOduConnectionStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OtnOduConnectionPacImpl otherImpl = (OtnOduConnectionPacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "OtnOduConnectionPac [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_layerProtocol != null) {
                builder.append("_layerProtocol=");
                builder.append(_layerProtocol);
                builder.append(", ");
            }
            if (_otnOduConnectionCapability != null) {
                builder.append("_otnOduConnectionCapability=");
                builder.append(_otnOduConnectionCapability);
                builder.append(", ");
            }
            if (_otnOduConnectionConfiguration != null) {
                builder.append("_otnOduConnectionConfiguration=");
                builder.append(_otnOduConnectionConfiguration);
                builder.append(", ");
            }
            if (_otnOduConnectionCurrentPerformance != null) {
                builder.append("_otnOduConnectionCurrentPerformance=");
                builder.append(_otnOduConnectionCurrentPerformance);
                builder.append(", ");
            }
            if (_otnOduConnectionCurrentProblems != null) {
                builder.append("_otnOduConnectionCurrentProblems=");
                builder.append(_otnOduConnectionCurrentProblems);
                builder.append(", ");
            }
            if (_otnOduConnectionHistoricalPerformances != null) {
                builder.append("_otnOduConnectionHistoricalPerformances=");
                builder.append(_otnOduConnectionHistoricalPerformances);
                builder.append(", ");
            }
            if (_otnOduConnectionStatus != null) {
                builder.append("_otnOduConnectionStatus=");
                builder.append(_otnOduConnectionStatus);
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
