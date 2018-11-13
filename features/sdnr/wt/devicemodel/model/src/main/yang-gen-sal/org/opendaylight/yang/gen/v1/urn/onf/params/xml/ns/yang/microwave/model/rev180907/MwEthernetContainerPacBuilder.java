package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCurrentPerformance;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCurrentProblems;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerConfiguration;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerHistoricalPerformances;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerStatus;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac
 *
 */
public class MwEthernetContainerPacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac> {

    private EthernetContainerCapability _ethernetContainerCapability;
    private EthernetContainerConfiguration _ethernetContainerConfiguration;
    private EthernetContainerCurrentPerformance _ethernetContainerCurrentPerformance;
    private EthernetContainerCurrentProblems _ethernetContainerCurrentProblems;
    private EthernetContainerHistoricalPerformances _ethernetContainerHistoricalPerformances;
    private EthernetContainerStatus _ethernetContainerStatus;
    private MwEthernetContainerPacKey _key;
    private UniversalId _layerProtocol;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>> augmentation = Collections.emptyMap();

    public MwEthernetContainerPacBuilder() {
    }

    public MwEthernetContainerPacBuilder(MwEthernetContainerPac base) {
        if (base.getKey() == null) {
            this._key = new MwEthernetContainerPacKey(
                base.getLayerProtocol()
            );
            this._layerProtocol = base.getLayerProtocol();
        } else {
            this._key = base.getKey();
            this._layerProtocol = _key.getLayerProtocol();
        }
        this._ethernetContainerCapability = base.getEthernetContainerCapability();
        this._ethernetContainerConfiguration = base.getEthernetContainerConfiguration();
        this._ethernetContainerCurrentPerformance = base.getEthernetContainerCurrentPerformance();
        this._ethernetContainerCurrentProblems = base.getEthernetContainerCurrentProblems();
        this._ethernetContainerHistoricalPerformances = base.getEthernetContainerHistoricalPerformances();
        this._ethernetContainerStatus = base.getEthernetContainerStatus();
        if (base instanceof MwEthernetContainerPacImpl) {
            MwEthernetContainerPacImpl impl = (MwEthernetContainerPacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public EthernetContainerCapability getEthernetContainerCapability() {
        return _ethernetContainerCapability;
    }
    
    public EthernetContainerConfiguration getEthernetContainerConfiguration() {
        return _ethernetContainerConfiguration;
    }
    
    public EthernetContainerCurrentPerformance getEthernetContainerCurrentPerformance() {
        return _ethernetContainerCurrentPerformance;
    }
    
    public EthernetContainerCurrentProblems getEthernetContainerCurrentProblems() {
        return _ethernetContainerCurrentProblems;
    }
    
    public EthernetContainerHistoricalPerformances getEthernetContainerHistoricalPerformances() {
        return _ethernetContainerHistoricalPerformances;
    }
    
    public EthernetContainerStatus getEthernetContainerStatus() {
        return _ethernetContainerStatus;
    }
    
    public MwEthernetContainerPacKey getKey() {
        return _key;
    }
    
    public UniversalId getLayerProtocol() {
        return _layerProtocol;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MwEthernetContainerPacBuilder setEthernetContainerCapability(final EthernetContainerCapability value) {
        this._ethernetContainerCapability = value;
        return this;
    }
    
     
    public MwEthernetContainerPacBuilder setEthernetContainerConfiguration(final EthernetContainerConfiguration value) {
        this._ethernetContainerConfiguration = value;
        return this;
    }
    
     
    public MwEthernetContainerPacBuilder setEthernetContainerCurrentPerformance(final EthernetContainerCurrentPerformance value) {
        this._ethernetContainerCurrentPerformance = value;
        return this;
    }
    
     
    public MwEthernetContainerPacBuilder setEthernetContainerCurrentProblems(final EthernetContainerCurrentProblems value) {
        this._ethernetContainerCurrentProblems = value;
        return this;
    }
    
     
    public MwEthernetContainerPacBuilder setEthernetContainerHistoricalPerformances(final EthernetContainerHistoricalPerformances value) {
        this._ethernetContainerHistoricalPerformances = value;
        return this;
    }
    
     
    public MwEthernetContainerPacBuilder setEthernetContainerStatus(final EthernetContainerStatus value) {
        this._ethernetContainerStatus = value;
        return this;
    }
    
     
    public MwEthernetContainerPacBuilder setKey(final MwEthernetContainerPacKey value) {
        this._key = value;
        return this;
    }
    
     
    public MwEthernetContainerPacBuilder setLayerProtocol(final UniversalId value) {
        this._layerProtocol = value;
        return this;
    }
    
    public MwEthernetContainerPacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MwEthernetContainerPacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MwEthernetContainerPac build() {
        return new MwEthernetContainerPacImpl(this);
    }

    private static final class MwEthernetContainerPacImpl implements MwEthernetContainerPac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac.class;
        }

        private final EthernetContainerCapability _ethernetContainerCapability;
        private final EthernetContainerConfiguration _ethernetContainerConfiguration;
        private final EthernetContainerCurrentPerformance _ethernetContainerCurrentPerformance;
        private final EthernetContainerCurrentProblems _ethernetContainerCurrentProblems;
        private final EthernetContainerHistoricalPerformances _ethernetContainerHistoricalPerformances;
        private final EthernetContainerStatus _ethernetContainerStatus;
        private final MwEthernetContainerPacKey _key;
        private final UniversalId _layerProtocol;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>> augmentation = Collections.emptyMap();

        private MwEthernetContainerPacImpl(MwEthernetContainerPacBuilder base) {
            if (base.getKey() == null) {
                this._key = new MwEthernetContainerPacKey(
                    base.getLayerProtocol()
                );
                this._layerProtocol = base.getLayerProtocol();
            } else {
                this._key = base.getKey();
                this._layerProtocol = _key.getLayerProtocol();
            }
            this._ethernetContainerCapability = base.getEthernetContainerCapability();
            this._ethernetContainerConfiguration = base.getEthernetContainerConfiguration();
            this._ethernetContainerCurrentPerformance = base.getEthernetContainerCurrentPerformance();
            this._ethernetContainerCurrentProblems = base.getEthernetContainerCurrentProblems();
            this._ethernetContainerHistoricalPerformances = base.getEthernetContainerHistoricalPerformances();
            this._ethernetContainerStatus = base.getEthernetContainerStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public EthernetContainerCapability getEthernetContainerCapability() {
            return _ethernetContainerCapability;
        }
        
        @Override
        public EthernetContainerConfiguration getEthernetContainerConfiguration() {
            return _ethernetContainerConfiguration;
        }
        
        @Override
        public EthernetContainerCurrentPerformance getEthernetContainerCurrentPerformance() {
            return _ethernetContainerCurrentPerformance;
        }
        
        @Override
        public EthernetContainerCurrentProblems getEthernetContainerCurrentProblems() {
            return _ethernetContainerCurrentProblems;
        }
        
        @Override
        public EthernetContainerHistoricalPerformances getEthernetContainerHistoricalPerformances() {
            return _ethernetContainerHistoricalPerformances;
        }
        
        @Override
        public EthernetContainerStatus getEthernetContainerStatus() {
            return _ethernetContainerStatus;
        }
        
        @Override
        public MwEthernetContainerPacKey getKey() {
            return _key;
        }
        
        @Override
        public UniversalId getLayerProtocol() {
            return _layerProtocol;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ethernetContainerCapability);
            result = prime * result + Objects.hashCode(_ethernetContainerConfiguration);
            result = prime * result + Objects.hashCode(_ethernetContainerCurrentPerformance);
            result = prime * result + Objects.hashCode(_ethernetContainerCurrentProblems);
            result = prime * result + Objects.hashCode(_ethernetContainerHistoricalPerformances);
            result = prime * result + Objects.hashCode(_ethernetContainerStatus);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_layerProtocol);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac)obj;
            if (!Objects.equals(_ethernetContainerCapability, other.getEthernetContainerCapability())) {
                return false;
            }
            if (!Objects.equals(_ethernetContainerConfiguration, other.getEthernetContainerConfiguration())) {
                return false;
            }
            if (!Objects.equals(_ethernetContainerCurrentPerformance, other.getEthernetContainerCurrentPerformance())) {
                return false;
            }
            if (!Objects.equals(_ethernetContainerCurrentProblems, other.getEthernetContainerCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_ethernetContainerHistoricalPerformances, other.getEthernetContainerHistoricalPerformances())) {
                return false;
            }
            if (!Objects.equals(_ethernetContainerStatus, other.getEthernetContainerStatus())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_layerProtocol, other.getLayerProtocol())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MwEthernetContainerPacImpl otherImpl = (MwEthernetContainerPacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwEthernetContainerPac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MwEthernetContainerPac [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_ethernetContainerCapability != null) {
                builder.append("_ethernetContainerCapability=");
                builder.append(_ethernetContainerCapability);
                builder.append(", ");
            }
            if (_ethernetContainerConfiguration != null) {
                builder.append("_ethernetContainerConfiguration=");
                builder.append(_ethernetContainerConfiguration);
                builder.append(", ");
            }
            if (_ethernetContainerCurrentPerformance != null) {
                builder.append("_ethernetContainerCurrentPerformance=");
                builder.append(_ethernetContainerCurrentPerformance);
                builder.append(", ");
            }
            if (_ethernetContainerCurrentProblems != null) {
                builder.append("_ethernetContainerCurrentProblems=");
                builder.append(_ethernetContainerCurrentProblems);
                builder.append(", ");
            }
            if (_ethernetContainerHistoricalPerformances != null) {
                builder.append("_ethernetContainerHistoricalPerformances=");
                builder.append(_ethernetContainerHistoricalPerformances);
                builder.append(", ");
            }
            if (_ethernetContainerStatus != null) {
                builder.append("_ethernetContainerStatus=");
                builder.append(_ethernetContainerStatus);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_layerProtocol != null) {
                builder.append("_layerProtocol=");
                builder.append(_layerProtocol);
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
