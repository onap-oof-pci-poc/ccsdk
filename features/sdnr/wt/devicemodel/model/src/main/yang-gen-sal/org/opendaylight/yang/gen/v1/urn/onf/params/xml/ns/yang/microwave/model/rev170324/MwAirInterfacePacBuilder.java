package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceCurrentPerformance;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceCapability;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceCurrentProblems;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceConfiguration;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceHistoricalPerformances;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac
 *
 */
public class MwAirInterfacePacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac> {

    private AirInterfaceCapability _airInterfaceCapability;
    private AirInterfaceConfiguration _airInterfaceConfiguration;
    private AirInterfaceCurrentPerformance _airInterfaceCurrentPerformance;
    private AirInterfaceCurrentProblems _airInterfaceCurrentProblems;
    private AirInterfaceHistoricalPerformances _airInterfaceHistoricalPerformances;
    private AirInterfaceStatus _airInterfaceStatus;
    private MwAirInterfacePacKey _key;
    private UniversalId _layerProtocol;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>> augmentation = Collections.emptyMap();

    public MwAirInterfacePacBuilder() {
    }

    public MwAirInterfacePacBuilder(MwAirInterfacePac base) {
        if (base.getKey() == null) {
            this._key = new MwAirInterfacePacKey(
                base.getLayerProtocol()
            );
            this._layerProtocol = base.getLayerProtocol();
        } else {
            this._key = base.getKey();
            this._layerProtocol = _key.getLayerProtocol();
        }
        this._airInterfaceCapability = base.getAirInterfaceCapability();
        this._airInterfaceConfiguration = base.getAirInterfaceConfiguration();
        this._airInterfaceCurrentPerformance = base.getAirInterfaceCurrentPerformance();
        this._airInterfaceCurrentProblems = base.getAirInterfaceCurrentProblems();
        this._airInterfaceHistoricalPerformances = base.getAirInterfaceHistoricalPerformances();
        this._airInterfaceStatus = base.getAirInterfaceStatus();
        if (base instanceof MwAirInterfacePacImpl) {
            MwAirInterfacePacImpl impl = (MwAirInterfacePacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public AirInterfaceCapability getAirInterfaceCapability() {
        return _airInterfaceCapability;
    }
    
    public AirInterfaceConfiguration getAirInterfaceConfiguration() {
        return _airInterfaceConfiguration;
    }
    
    public AirInterfaceCurrentPerformance getAirInterfaceCurrentPerformance() {
        return _airInterfaceCurrentPerformance;
    }
    
    public AirInterfaceCurrentProblems getAirInterfaceCurrentProblems() {
        return _airInterfaceCurrentProblems;
    }
    
    public AirInterfaceHistoricalPerformances getAirInterfaceHistoricalPerformances() {
        return _airInterfaceHistoricalPerformances;
    }
    
    public AirInterfaceStatus getAirInterfaceStatus() {
        return _airInterfaceStatus;
    }
    
    public MwAirInterfacePacKey getKey() {
        return _key;
    }
    
    public UniversalId getLayerProtocol() {
        return _layerProtocol;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MwAirInterfacePacBuilder setAirInterfaceCapability(final AirInterfaceCapability value) {
        this._airInterfaceCapability = value;
        return this;
    }
    
     
    public MwAirInterfacePacBuilder setAirInterfaceConfiguration(final AirInterfaceConfiguration value) {
        this._airInterfaceConfiguration = value;
        return this;
    }
    
     
    public MwAirInterfacePacBuilder setAirInterfaceCurrentPerformance(final AirInterfaceCurrentPerformance value) {
        this._airInterfaceCurrentPerformance = value;
        return this;
    }
    
     
    public MwAirInterfacePacBuilder setAirInterfaceCurrentProblems(final AirInterfaceCurrentProblems value) {
        this._airInterfaceCurrentProblems = value;
        return this;
    }
    
     
    public MwAirInterfacePacBuilder setAirInterfaceHistoricalPerformances(final AirInterfaceHistoricalPerformances value) {
        this._airInterfaceHistoricalPerformances = value;
        return this;
    }
    
     
    public MwAirInterfacePacBuilder setAirInterfaceStatus(final AirInterfaceStatus value) {
        this._airInterfaceStatus = value;
        return this;
    }
    
     
    public MwAirInterfacePacBuilder setKey(final MwAirInterfacePacKey value) {
        this._key = value;
        return this;
    }
    
     
    public MwAirInterfacePacBuilder setLayerProtocol(final UniversalId value) {
        this._layerProtocol = value;
        return this;
    }
    
    public MwAirInterfacePacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MwAirInterfacePacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MwAirInterfacePac build() {
        return new MwAirInterfacePacImpl(this);
    }

    private static final class MwAirInterfacePacImpl implements MwAirInterfacePac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac.class;
        }

        private final AirInterfaceCapability _airInterfaceCapability;
        private final AirInterfaceConfiguration _airInterfaceConfiguration;
        private final AirInterfaceCurrentPerformance _airInterfaceCurrentPerformance;
        private final AirInterfaceCurrentProblems _airInterfaceCurrentProblems;
        private final AirInterfaceHistoricalPerformances _airInterfaceHistoricalPerformances;
        private final AirInterfaceStatus _airInterfaceStatus;
        private final MwAirInterfacePacKey _key;
        private final UniversalId _layerProtocol;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>> augmentation = Collections.emptyMap();

        private MwAirInterfacePacImpl(MwAirInterfacePacBuilder base) {
            if (base.getKey() == null) {
                this._key = new MwAirInterfacePacKey(
                    base.getLayerProtocol()
                );
                this._layerProtocol = base.getLayerProtocol();
            } else {
                this._key = base.getKey();
                this._layerProtocol = _key.getLayerProtocol();
            }
            this._airInterfaceCapability = base.getAirInterfaceCapability();
            this._airInterfaceConfiguration = base.getAirInterfaceConfiguration();
            this._airInterfaceCurrentPerformance = base.getAirInterfaceCurrentPerformance();
            this._airInterfaceCurrentProblems = base.getAirInterfaceCurrentProblems();
            this._airInterfaceHistoricalPerformances = base.getAirInterfaceHistoricalPerformances();
            this._airInterfaceStatus = base.getAirInterfaceStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AirInterfaceCapability getAirInterfaceCapability() {
            return _airInterfaceCapability;
        }
        
        @Override
        public AirInterfaceConfiguration getAirInterfaceConfiguration() {
            return _airInterfaceConfiguration;
        }
        
        @Override
        public AirInterfaceCurrentPerformance getAirInterfaceCurrentPerformance() {
            return _airInterfaceCurrentPerformance;
        }
        
        @Override
        public AirInterfaceCurrentProblems getAirInterfaceCurrentProblems() {
            return _airInterfaceCurrentProblems;
        }
        
        @Override
        public AirInterfaceHistoricalPerformances getAirInterfaceHistoricalPerformances() {
            return _airInterfaceHistoricalPerformances;
        }
        
        @Override
        public AirInterfaceStatus getAirInterfaceStatus() {
            return _airInterfaceStatus;
        }
        
        @Override
        public MwAirInterfacePacKey getKey() {
            return _key;
        }
        
        @Override
        public UniversalId getLayerProtocol() {
            return _layerProtocol;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_airInterfaceCapability);
            result = prime * result + Objects.hashCode(_airInterfaceConfiguration);
            result = prime * result + Objects.hashCode(_airInterfaceCurrentPerformance);
            result = prime * result + Objects.hashCode(_airInterfaceCurrentProblems);
            result = prime * result + Objects.hashCode(_airInterfaceHistoricalPerformances);
            result = prime * result + Objects.hashCode(_airInterfaceStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac)obj;
            if (!Objects.equals(_airInterfaceCapability, other.getAirInterfaceCapability())) {
                return false;
            }
            if (!Objects.equals(_airInterfaceConfiguration, other.getAirInterfaceConfiguration())) {
                return false;
            }
            if (!Objects.equals(_airInterfaceCurrentPerformance, other.getAirInterfaceCurrentPerformance())) {
                return false;
            }
            if (!Objects.equals(_airInterfaceCurrentProblems, other.getAirInterfaceCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_airInterfaceHistoricalPerformances, other.getAirInterfaceHistoricalPerformances())) {
                return false;
            }
            if (!Objects.equals(_airInterfaceStatus, other.getAirInterfaceStatus())) {
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
                MwAirInterfacePacImpl otherImpl = (MwAirInterfacePacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MwAirInterfacePac [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_airInterfaceCapability != null) {
                builder.append("_airInterfaceCapability=");
                builder.append(_airInterfaceCapability);
                builder.append(", ");
            }
            if (_airInterfaceConfiguration != null) {
                builder.append("_airInterfaceConfiguration=");
                builder.append(_airInterfaceConfiguration);
                builder.append(", ");
            }
            if (_airInterfaceCurrentPerformance != null) {
                builder.append("_airInterfaceCurrentPerformance=");
                builder.append(_airInterfaceCurrentPerformance);
                builder.append(", ");
            }
            if (_airInterfaceCurrentProblems != null) {
                builder.append("_airInterfaceCurrentProblems=");
                builder.append(_airInterfaceCurrentProblems);
                builder.append(", ");
            }
            if (_airInterfaceHistoricalPerformances != null) {
                builder.append("_airInterfaceHistoricalPerformances=");
                builder.append(_airInterfaceHistoricalPerformances);
                builder.append(", ");
            }
            if (_airInterfaceStatus != null) {
                builder.append("_airInterfaceStatus=");
                builder.append(_airInterfaceStatus);
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
