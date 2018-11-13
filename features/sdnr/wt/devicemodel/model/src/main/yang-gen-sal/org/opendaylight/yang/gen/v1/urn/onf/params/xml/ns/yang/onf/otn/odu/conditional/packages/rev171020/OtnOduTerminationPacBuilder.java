package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationCapability;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationCurrentProblems;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationStatus;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationConfiguration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationHistoricalPerformances;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationCurrentPerformance;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac
 *
 */
public class OtnOduTerminationPacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac> {

    private OtnOduTerminationPacKey _key;
    private UniversalId _layerProtocol;
    private OtnOduTerminationCapability _otnOduTerminationCapability;
    private OtnOduTerminationConfiguration _otnOduTerminationConfiguration;
    private OtnOduTerminationCurrentPerformance _otnOduTerminationCurrentPerformance;
    private OtnOduTerminationCurrentProblems _otnOduTerminationCurrentProblems;
    private OtnOduTerminationHistoricalPerformances _otnOduTerminationHistoricalPerformances;
    private OtnOduTerminationStatus _otnOduTerminationStatus;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>> augmentation = Collections.emptyMap();

    public OtnOduTerminationPacBuilder() {
    }

    public OtnOduTerminationPacBuilder(OtnOduTerminationPac base) {
        if (base.getKey() == null) {
            this._key = new OtnOduTerminationPacKey(
                base.getLayerProtocol()
            );
            this._layerProtocol = base.getLayerProtocol();
        } else {
            this._key = base.getKey();
            this._layerProtocol = _key.getLayerProtocol();
        }
        this._otnOduTerminationCapability = base.getOtnOduTerminationCapability();
        this._otnOduTerminationConfiguration = base.getOtnOduTerminationConfiguration();
        this._otnOduTerminationCurrentPerformance = base.getOtnOduTerminationCurrentPerformance();
        this._otnOduTerminationCurrentProblems = base.getOtnOduTerminationCurrentProblems();
        this._otnOduTerminationHistoricalPerformances = base.getOtnOduTerminationHistoricalPerformances();
        this._otnOduTerminationStatus = base.getOtnOduTerminationStatus();
        if (base instanceof OtnOduTerminationPacImpl) {
            OtnOduTerminationPacImpl impl = (OtnOduTerminationPacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public OtnOduTerminationPacKey getKey() {
        return _key;
    }
    
    public UniversalId getLayerProtocol() {
        return _layerProtocol;
    }
    
    public OtnOduTerminationCapability getOtnOduTerminationCapability() {
        return _otnOduTerminationCapability;
    }
    
    public OtnOduTerminationConfiguration getOtnOduTerminationConfiguration() {
        return _otnOduTerminationConfiguration;
    }
    
    public OtnOduTerminationCurrentPerformance getOtnOduTerminationCurrentPerformance() {
        return _otnOduTerminationCurrentPerformance;
    }
    
    public OtnOduTerminationCurrentProblems getOtnOduTerminationCurrentProblems() {
        return _otnOduTerminationCurrentProblems;
    }
    
    public OtnOduTerminationHistoricalPerformances getOtnOduTerminationHistoricalPerformances() {
        return _otnOduTerminationHistoricalPerformances;
    }
    
    public OtnOduTerminationStatus getOtnOduTerminationStatus() {
        return _otnOduTerminationStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public OtnOduTerminationPacBuilder setKey(final OtnOduTerminationPacKey value) {
        this._key = value;
        return this;
    }
    
     
    public OtnOduTerminationPacBuilder setLayerProtocol(final UniversalId value) {
        this._layerProtocol = value;
        return this;
    }
    
     
    public OtnOduTerminationPacBuilder setOtnOduTerminationCapability(final OtnOduTerminationCapability value) {
        this._otnOduTerminationCapability = value;
        return this;
    }
    
     
    public OtnOduTerminationPacBuilder setOtnOduTerminationConfiguration(final OtnOduTerminationConfiguration value) {
        this._otnOduTerminationConfiguration = value;
        return this;
    }
    
     
    public OtnOduTerminationPacBuilder setOtnOduTerminationCurrentPerformance(final OtnOduTerminationCurrentPerformance value) {
        this._otnOduTerminationCurrentPerformance = value;
        return this;
    }
    
     
    public OtnOduTerminationPacBuilder setOtnOduTerminationCurrentProblems(final OtnOduTerminationCurrentProblems value) {
        this._otnOduTerminationCurrentProblems = value;
        return this;
    }
    
     
    public OtnOduTerminationPacBuilder setOtnOduTerminationHistoricalPerformances(final OtnOduTerminationHistoricalPerformances value) {
        this._otnOduTerminationHistoricalPerformances = value;
        return this;
    }
    
     
    public OtnOduTerminationPacBuilder setOtnOduTerminationStatus(final OtnOduTerminationStatus value) {
        this._otnOduTerminationStatus = value;
        return this;
    }
    
    public OtnOduTerminationPacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public OtnOduTerminationPacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public OtnOduTerminationPac build() {
        return new OtnOduTerminationPacImpl(this);
    }

    private static final class OtnOduTerminationPacImpl implements OtnOduTerminationPac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac.class;
        }

        private final OtnOduTerminationPacKey _key;
        private final UniversalId _layerProtocol;
        private final OtnOduTerminationCapability _otnOduTerminationCapability;
        private final OtnOduTerminationConfiguration _otnOduTerminationConfiguration;
        private final OtnOduTerminationCurrentPerformance _otnOduTerminationCurrentPerformance;
        private final OtnOduTerminationCurrentProblems _otnOduTerminationCurrentProblems;
        private final OtnOduTerminationHistoricalPerformances _otnOduTerminationHistoricalPerformances;
        private final OtnOduTerminationStatus _otnOduTerminationStatus;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>> augmentation = Collections.emptyMap();

        private OtnOduTerminationPacImpl(OtnOduTerminationPacBuilder base) {
            if (base.getKey() == null) {
                this._key = new OtnOduTerminationPacKey(
                    base.getLayerProtocol()
                );
                this._layerProtocol = base.getLayerProtocol();
            } else {
                this._key = base.getKey();
                this._layerProtocol = _key.getLayerProtocol();
            }
            this._otnOduTerminationCapability = base.getOtnOduTerminationCapability();
            this._otnOduTerminationConfiguration = base.getOtnOduTerminationConfiguration();
            this._otnOduTerminationCurrentPerformance = base.getOtnOduTerminationCurrentPerformance();
            this._otnOduTerminationCurrentProblems = base.getOtnOduTerminationCurrentProblems();
            this._otnOduTerminationHistoricalPerformances = base.getOtnOduTerminationHistoricalPerformances();
            this._otnOduTerminationStatus = base.getOtnOduTerminationStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public OtnOduTerminationPacKey getKey() {
            return _key;
        }
        
        @Override
        public UniversalId getLayerProtocol() {
            return _layerProtocol;
        }
        
        @Override
        public OtnOduTerminationCapability getOtnOduTerminationCapability() {
            return _otnOduTerminationCapability;
        }
        
        @Override
        public OtnOduTerminationConfiguration getOtnOduTerminationConfiguration() {
            return _otnOduTerminationConfiguration;
        }
        
        @Override
        public OtnOduTerminationCurrentPerformance getOtnOduTerminationCurrentPerformance() {
            return _otnOduTerminationCurrentPerformance;
        }
        
        @Override
        public OtnOduTerminationCurrentProblems getOtnOduTerminationCurrentProblems() {
            return _otnOduTerminationCurrentProblems;
        }
        
        @Override
        public OtnOduTerminationHistoricalPerformances getOtnOduTerminationHistoricalPerformances() {
            return _otnOduTerminationHistoricalPerformances;
        }
        
        @Override
        public OtnOduTerminationStatus getOtnOduTerminationStatus() {
            return _otnOduTerminationStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_otnOduTerminationCapability);
            result = prime * result + Objects.hashCode(_otnOduTerminationConfiguration);
            result = prime * result + Objects.hashCode(_otnOduTerminationCurrentPerformance);
            result = prime * result + Objects.hashCode(_otnOduTerminationCurrentProblems);
            result = prime * result + Objects.hashCode(_otnOduTerminationHistoricalPerformances);
            result = prime * result + Objects.hashCode(_otnOduTerminationStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_layerProtocol, other.getLayerProtocol())) {
                return false;
            }
            if (!Objects.equals(_otnOduTerminationCapability, other.getOtnOduTerminationCapability())) {
                return false;
            }
            if (!Objects.equals(_otnOduTerminationConfiguration, other.getOtnOduTerminationConfiguration())) {
                return false;
            }
            if (!Objects.equals(_otnOduTerminationCurrentPerformance, other.getOtnOduTerminationCurrentPerformance())) {
                return false;
            }
            if (!Objects.equals(_otnOduTerminationCurrentProblems, other.getOtnOduTerminationCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_otnOduTerminationHistoricalPerformances, other.getOtnOduTerminationHistoricalPerformances())) {
                return false;
            }
            if (!Objects.equals(_otnOduTerminationStatus, other.getOtnOduTerminationStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OtnOduTerminationPacImpl otherImpl = (OtnOduTerminationPacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "OtnOduTerminationPac [";
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
            if (_otnOduTerminationCapability != null) {
                builder.append("_otnOduTerminationCapability=");
                builder.append(_otnOduTerminationCapability);
                builder.append(", ");
            }
            if (_otnOduTerminationConfiguration != null) {
                builder.append("_otnOduTerminationConfiguration=");
                builder.append(_otnOduTerminationConfiguration);
                builder.append(", ");
            }
            if (_otnOduTerminationCurrentPerformance != null) {
                builder.append("_otnOduTerminationCurrentPerformance=");
                builder.append(_otnOduTerminationCurrentPerformance);
                builder.append(", ");
            }
            if (_otnOduTerminationCurrentProblems != null) {
                builder.append("_otnOduTerminationCurrentProblems=");
                builder.append(_otnOduTerminationCurrentProblems);
                builder.append(", ");
            }
            if (_otnOduTerminationHistoricalPerformances != null) {
                builder.append("_otnOduTerminationHistoricalPerformances=");
                builder.append(_otnOduTerminationHistoricalPerformances);
                builder.append(", ");
            }
            if (_otnOduTerminationStatus != null) {
                builder.append("_otnOduTerminationStatus=");
                builder.append(_otnOduTerminationStatus);
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
