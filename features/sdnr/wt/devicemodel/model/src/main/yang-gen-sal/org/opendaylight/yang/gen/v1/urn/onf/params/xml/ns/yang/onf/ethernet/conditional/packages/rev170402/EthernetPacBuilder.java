package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetCapability;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetConfiguration;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetHistoricalPerformances;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetCurrentProblems;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetCurrentPerformance;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac
 *
 */
public class EthernetPacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac> {

    private EthernetCapability _ethernetCapability;
    private EthernetConfiguration _ethernetConfiguration;
    private EthernetCurrentPerformance _ethernetCurrentPerformance;
    private EthernetCurrentProblems _ethernetCurrentProblems;
    private EthernetHistoricalPerformances _ethernetHistoricalPerformances;
    private EthernetStatus _ethernetStatus;
    private EthernetPacKey _key;
    private UniversalId _layerProtocol;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>> augmentation = Collections.emptyMap();

    public EthernetPacBuilder() {
    }

    public EthernetPacBuilder(EthernetPac base) {
        if (base.getKey() == null) {
            this._key = new EthernetPacKey(
                base.getLayerProtocol()
            );
            this._layerProtocol = base.getLayerProtocol();
        } else {
            this._key = base.getKey();
            this._layerProtocol = _key.getLayerProtocol();
        }
        this._ethernetCapability = base.getEthernetCapability();
        this._ethernetConfiguration = base.getEthernetConfiguration();
        this._ethernetCurrentPerformance = base.getEthernetCurrentPerformance();
        this._ethernetCurrentProblems = base.getEthernetCurrentProblems();
        this._ethernetHistoricalPerformances = base.getEthernetHistoricalPerformances();
        this._ethernetStatus = base.getEthernetStatus();
        if (base instanceof EthernetPacImpl) {
            EthernetPacImpl impl = (EthernetPacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public EthernetCapability getEthernetCapability() {
        return _ethernetCapability;
    }
    
    public EthernetConfiguration getEthernetConfiguration() {
        return _ethernetConfiguration;
    }
    
    public EthernetCurrentPerformance getEthernetCurrentPerformance() {
        return _ethernetCurrentPerformance;
    }
    
    public EthernetCurrentProblems getEthernetCurrentProblems() {
        return _ethernetCurrentProblems;
    }
    
    public EthernetHistoricalPerformances getEthernetHistoricalPerformances() {
        return _ethernetHistoricalPerformances;
    }
    
    public EthernetStatus getEthernetStatus() {
        return _ethernetStatus;
    }
    
    public EthernetPacKey getKey() {
        return _key;
    }
    
    public UniversalId getLayerProtocol() {
        return _layerProtocol;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public EthernetPacBuilder setEthernetCapability(final EthernetCapability value) {
        this._ethernetCapability = value;
        return this;
    }
    
     
    public EthernetPacBuilder setEthernetConfiguration(final EthernetConfiguration value) {
        this._ethernetConfiguration = value;
        return this;
    }
    
     
    public EthernetPacBuilder setEthernetCurrentPerformance(final EthernetCurrentPerformance value) {
        this._ethernetCurrentPerformance = value;
        return this;
    }
    
     
    public EthernetPacBuilder setEthernetCurrentProblems(final EthernetCurrentProblems value) {
        this._ethernetCurrentProblems = value;
        return this;
    }
    
     
    public EthernetPacBuilder setEthernetHistoricalPerformances(final EthernetHistoricalPerformances value) {
        this._ethernetHistoricalPerformances = value;
        return this;
    }
    
     
    public EthernetPacBuilder setEthernetStatus(final EthernetStatus value) {
        this._ethernetStatus = value;
        return this;
    }
    
     
    public EthernetPacBuilder setKey(final EthernetPacKey value) {
        this._key = value;
        return this;
    }
    
     
    public EthernetPacBuilder setLayerProtocol(final UniversalId value) {
        this._layerProtocol = value;
        return this;
    }
    
    public EthernetPacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public EthernetPacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public EthernetPac build() {
        return new EthernetPacImpl(this);
    }

    private static final class EthernetPacImpl implements EthernetPac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac.class;
        }

        private final EthernetCapability _ethernetCapability;
        private final EthernetConfiguration _ethernetConfiguration;
        private final EthernetCurrentPerformance _ethernetCurrentPerformance;
        private final EthernetCurrentProblems _ethernetCurrentProblems;
        private final EthernetHistoricalPerformances _ethernetHistoricalPerformances;
        private final EthernetStatus _ethernetStatus;
        private final EthernetPacKey _key;
        private final UniversalId _layerProtocol;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>> augmentation = Collections.emptyMap();

        private EthernetPacImpl(EthernetPacBuilder base) {
            if (base.getKey() == null) {
                this._key = new EthernetPacKey(
                    base.getLayerProtocol()
                );
                this._layerProtocol = base.getLayerProtocol();
            } else {
                this._key = base.getKey();
                this._layerProtocol = _key.getLayerProtocol();
            }
            this._ethernetCapability = base.getEthernetCapability();
            this._ethernetConfiguration = base.getEthernetConfiguration();
            this._ethernetCurrentPerformance = base.getEthernetCurrentPerformance();
            this._ethernetCurrentProblems = base.getEthernetCurrentProblems();
            this._ethernetHistoricalPerformances = base.getEthernetHistoricalPerformances();
            this._ethernetStatus = base.getEthernetStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public EthernetCapability getEthernetCapability() {
            return _ethernetCapability;
        }
        
        @Override
        public EthernetConfiguration getEthernetConfiguration() {
            return _ethernetConfiguration;
        }
        
        @Override
        public EthernetCurrentPerformance getEthernetCurrentPerformance() {
            return _ethernetCurrentPerformance;
        }
        
        @Override
        public EthernetCurrentProblems getEthernetCurrentProblems() {
            return _ethernetCurrentProblems;
        }
        
        @Override
        public EthernetHistoricalPerformances getEthernetHistoricalPerformances() {
            return _ethernetHistoricalPerformances;
        }
        
        @Override
        public EthernetStatus getEthernetStatus() {
            return _ethernetStatus;
        }
        
        @Override
        public EthernetPacKey getKey() {
            return _key;
        }
        
        @Override
        public UniversalId getLayerProtocol() {
            return _layerProtocol;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ethernetCapability);
            result = prime * result + Objects.hashCode(_ethernetConfiguration);
            result = prime * result + Objects.hashCode(_ethernetCurrentPerformance);
            result = prime * result + Objects.hashCode(_ethernetCurrentProblems);
            result = prime * result + Objects.hashCode(_ethernetHistoricalPerformances);
            result = prime * result + Objects.hashCode(_ethernetStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac)obj;
            if (!Objects.equals(_ethernetCapability, other.getEthernetCapability())) {
                return false;
            }
            if (!Objects.equals(_ethernetConfiguration, other.getEthernetConfiguration())) {
                return false;
            }
            if (!Objects.equals(_ethernetCurrentPerformance, other.getEthernetCurrentPerformance())) {
                return false;
            }
            if (!Objects.equals(_ethernetCurrentProblems, other.getEthernetCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_ethernetHistoricalPerformances, other.getEthernetHistoricalPerformances())) {
                return false;
            }
            if (!Objects.equals(_ethernetStatus, other.getEthernetStatus())) {
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
                EthernetPacImpl otherImpl = (EthernetPacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "EthernetPac [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_ethernetCapability != null) {
                builder.append("_ethernetCapability=");
                builder.append(_ethernetCapability);
                builder.append(", ");
            }
            if (_ethernetConfiguration != null) {
                builder.append("_ethernetConfiguration=");
                builder.append(_ethernetConfiguration);
                builder.append(", ");
            }
            if (_ethernetCurrentPerformance != null) {
                builder.append("_ethernetCurrentPerformance=");
                builder.append(_ethernetCurrentPerformance);
                builder.append(", ");
            }
            if (_ethernetCurrentProblems != null) {
                builder.append("_ethernetCurrentProblems=");
                builder.append(_ethernetCurrentProblems);
                builder.append(", ");
            }
            if (_ethernetHistoricalPerformances != null) {
                builder.append("_ethernetHistoricalPerformances=");
                builder.append(_ethernetHistoricalPerformances);
                builder.append(", ");
            }
            if (_ethernetStatus != null) {
                builder.append("_ethernetStatus=");
                builder.append(_ethernetStatus);
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
