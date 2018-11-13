package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityCurrentProblems;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityCurrentPerformance;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityHistoricalPerformances;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac
 *
 */
public class MwAirInterfaceDiversityPacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac> {

    private AirInterfaceDiversityCapability _airInterfaceDiversityCapability;
    private AirInterfaceDiversityConfiguration _airInterfaceDiversityConfiguration;
    private AirInterfaceDiversityCurrentPerformance _airInterfaceDiversityCurrentPerformance;
    private AirInterfaceDiversityCurrentProblems _airInterfaceDiversityCurrentProblems;
    private AirInterfaceDiversityHistoricalPerformances _airInterfaceDiversityHistoricalPerformances;
    private AirInterfaceDiversityStatus _airInterfaceDiversityStatus;
    private MwAirInterfaceDiversityPacKey _key;
    private UniversalId _layerProtocol;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>> augmentation = Collections.emptyMap();

    public MwAirInterfaceDiversityPacBuilder() {
    }

    public MwAirInterfaceDiversityPacBuilder(MwAirInterfaceDiversityPac base) {
        if (base.getKey() == null) {
            this._key = new MwAirInterfaceDiversityPacKey(
                base.getLayerProtocol()
            );
            this._layerProtocol = base.getLayerProtocol();
        } else {
            this._key = base.getKey();
            this._layerProtocol = _key.getLayerProtocol();
        }
        this._airInterfaceDiversityCapability = base.getAirInterfaceDiversityCapability();
        this._airInterfaceDiversityConfiguration = base.getAirInterfaceDiversityConfiguration();
        this._airInterfaceDiversityCurrentPerformance = base.getAirInterfaceDiversityCurrentPerformance();
        this._airInterfaceDiversityCurrentProblems = base.getAirInterfaceDiversityCurrentProblems();
        this._airInterfaceDiversityHistoricalPerformances = base.getAirInterfaceDiversityHistoricalPerformances();
        this._airInterfaceDiversityStatus = base.getAirInterfaceDiversityStatus();
        if (base instanceof MwAirInterfaceDiversityPacImpl) {
            MwAirInterfaceDiversityPacImpl impl = (MwAirInterfaceDiversityPacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public AirInterfaceDiversityCapability getAirInterfaceDiversityCapability() {
        return _airInterfaceDiversityCapability;
    }
    
    public AirInterfaceDiversityConfiguration getAirInterfaceDiversityConfiguration() {
        return _airInterfaceDiversityConfiguration;
    }
    
    public AirInterfaceDiversityCurrentPerformance getAirInterfaceDiversityCurrentPerformance() {
        return _airInterfaceDiversityCurrentPerformance;
    }
    
    public AirInterfaceDiversityCurrentProblems getAirInterfaceDiversityCurrentProblems() {
        return _airInterfaceDiversityCurrentProblems;
    }
    
    public AirInterfaceDiversityHistoricalPerformances getAirInterfaceDiversityHistoricalPerformances() {
        return _airInterfaceDiversityHistoricalPerformances;
    }
    
    public AirInterfaceDiversityStatus getAirInterfaceDiversityStatus() {
        return _airInterfaceDiversityStatus;
    }
    
    public MwAirInterfaceDiversityPacKey getKey() {
        return _key;
    }
    
    public UniversalId getLayerProtocol() {
        return _layerProtocol;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MwAirInterfaceDiversityPacBuilder setAirInterfaceDiversityCapability(final AirInterfaceDiversityCapability value) {
        this._airInterfaceDiversityCapability = value;
        return this;
    }
    
     
    public MwAirInterfaceDiversityPacBuilder setAirInterfaceDiversityConfiguration(final AirInterfaceDiversityConfiguration value) {
        this._airInterfaceDiversityConfiguration = value;
        return this;
    }
    
     
    public MwAirInterfaceDiversityPacBuilder setAirInterfaceDiversityCurrentPerformance(final AirInterfaceDiversityCurrentPerformance value) {
        this._airInterfaceDiversityCurrentPerformance = value;
        return this;
    }
    
     
    public MwAirInterfaceDiversityPacBuilder setAirInterfaceDiversityCurrentProblems(final AirInterfaceDiversityCurrentProblems value) {
        this._airInterfaceDiversityCurrentProblems = value;
        return this;
    }
    
     
    public MwAirInterfaceDiversityPacBuilder setAirInterfaceDiversityHistoricalPerformances(final AirInterfaceDiversityHistoricalPerformances value) {
        this._airInterfaceDiversityHistoricalPerformances = value;
        return this;
    }
    
     
    public MwAirInterfaceDiversityPacBuilder setAirInterfaceDiversityStatus(final AirInterfaceDiversityStatus value) {
        this._airInterfaceDiversityStatus = value;
        return this;
    }
    
     
    public MwAirInterfaceDiversityPacBuilder setKey(final MwAirInterfaceDiversityPacKey value) {
        this._key = value;
        return this;
    }
    
     
    public MwAirInterfaceDiversityPacBuilder setLayerProtocol(final UniversalId value) {
        this._layerProtocol = value;
        return this;
    }
    
    public MwAirInterfaceDiversityPacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MwAirInterfaceDiversityPacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MwAirInterfaceDiversityPac build() {
        return new MwAirInterfaceDiversityPacImpl(this);
    }

    private static final class MwAirInterfaceDiversityPacImpl implements MwAirInterfaceDiversityPac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac.class;
        }

        private final AirInterfaceDiversityCapability _airInterfaceDiversityCapability;
        private final AirInterfaceDiversityConfiguration _airInterfaceDiversityConfiguration;
        private final AirInterfaceDiversityCurrentPerformance _airInterfaceDiversityCurrentPerformance;
        private final AirInterfaceDiversityCurrentProblems _airInterfaceDiversityCurrentProblems;
        private final AirInterfaceDiversityHistoricalPerformances _airInterfaceDiversityHistoricalPerformances;
        private final AirInterfaceDiversityStatus _airInterfaceDiversityStatus;
        private final MwAirInterfaceDiversityPacKey _key;
        private final UniversalId _layerProtocol;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>> augmentation = Collections.emptyMap();

        private MwAirInterfaceDiversityPacImpl(MwAirInterfaceDiversityPacBuilder base) {
            if (base.getKey() == null) {
                this._key = new MwAirInterfaceDiversityPacKey(
                    base.getLayerProtocol()
                );
                this._layerProtocol = base.getLayerProtocol();
            } else {
                this._key = base.getKey();
                this._layerProtocol = _key.getLayerProtocol();
            }
            this._airInterfaceDiversityCapability = base.getAirInterfaceDiversityCapability();
            this._airInterfaceDiversityConfiguration = base.getAirInterfaceDiversityConfiguration();
            this._airInterfaceDiversityCurrentPerformance = base.getAirInterfaceDiversityCurrentPerformance();
            this._airInterfaceDiversityCurrentProblems = base.getAirInterfaceDiversityCurrentProblems();
            this._airInterfaceDiversityHistoricalPerformances = base.getAirInterfaceDiversityHistoricalPerformances();
            this._airInterfaceDiversityStatus = base.getAirInterfaceDiversityStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AirInterfaceDiversityCapability getAirInterfaceDiversityCapability() {
            return _airInterfaceDiversityCapability;
        }
        
        @Override
        public AirInterfaceDiversityConfiguration getAirInterfaceDiversityConfiguration() {
            return _airInterfaceDiversityConfiguration;
        }
        
        @Override
        public AirInterfaceDiversityCurrentPerformance getAirInterfaceDiversityCurrentPerformance() {
            return _airInterfaceDiversityCurrentPerformance;
        }
        
        @Override
        public AirInterfaceDiversityCurrentProblems getAirInterfaceDiversityCurrentProblems() {
            return _airInterfaceDiversityCurrentProblems;
        }
        
        @Override
        public AirInterfaceDiversityHistoricalPerformances getAirInterfaceDiversityHistoricalPerformances() {
            return _airInterfaceDiversityHistoricalPerformances;
        }
        
        @Override
        public AirInterfaceDiversityStatus getAirInterfaceDiversityStatus() {
            return _airInterfaceDiversityStatus;
        }
        
        @Override
        public MwAirInterfaceDiversityPacKey getKey() {
            return _key;
        }
        
        @Override
        public UniversalId getLayerProtocol() {
            return _layerProtocol;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_airInterfaceDiversityCapability);
            result = prime * result + Objects.hashCode(_airInterfaceDiversityConfiguration);
            result = prime * result + Objects.hashCode(_airInterfaceDiversityCurrentPerformance);
            result = prime * result + Objects.hashCode(_airInterfaceDiversityCurrentProblems);
            result = prime * result + Objects.hashCode(_airInterfaceDiversityHistoricalPerformances);
            result = prime * result + Objects.hashCode(_airInterfaceDiversityStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac)obj;
            if (!Objects.equals(_airInterfaceDiversityCapability, other.getAirInterfaceDiversityCapability())) {
                return false;
            }
            if (!Objects.equals(_airInterfaceDiversityConfiguration, other.getAirInterfaceDiversityConfiguration())) {
                return false;
            }
            if (!Objects.equals(_airInterfaceDiversityCurrentPerformance, other.getAirInterfaceDiversityCurrentPerformance())) {
                return false;
            }
            if (!Objects.equals(_airInterfaceDiversityCurrentProblems, other.getAirInterfaceDiversityCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_airInterfaceDiversityHistoricalPerformances, other.getAirInterfaceDiversityHistoricalPerformances())) {
                return false;
            }
            if (!Objects.equals(_airInterfaceDiversityStatus, other.getAirInterfaceDiversityStatus())) {
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
                MwAirInterfaceDiversityPacImpl otherImpl = (MwAirInterfaceDiversityPacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfaceDiversityPac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MwAirInterfaceDiversityPac [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_airInterfaceDiversityCapability != null) {
                builder.append("_airInterfaceDiversityCapability=");
                builder.append(_airInterfaceDiversityCapability);
                builder.append(", ");
            }
            if (_airInterfaceDiversityConfiguration != null) {
                builder.append("_airInterfaceDiversityConfiguration=");
                builder.append(_airInterfaceDiversityConfiguration);
                builder.append(", ");
            }
            if (_airInterfaceDiversityCurrentPerformance != null) {
                builder.append("_airInterfaceDiversityCurrentPerformance=");
                builder.append(_airInterfaceDiversityCurrentPerformance);
                builder.append(", ");
            }
            if (_airInterfaceDiversityCurrentProblems != null) {
                builder.append("_airInterfaceDiversityCurrentProblems=");
                builder.append(_airInterfaceDiversityCurrentProblems);
                builder.append(", ");
            }
            if (_airInterfaceDiversityHistoricalPerformances != null) {
                builder.append("_airInterfaceDiversityHistoricalPerformances=");
                builder.append(_airInterfaceDiversityHistoricalPerformances);
                builder.append(", ");
            }
            if (_airInterfaceDiversityStatus != null) {
                builder.append("_airInterfaceDiversityStatus=");
                builder.append(_airInterfaceDiversityStatus);
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
