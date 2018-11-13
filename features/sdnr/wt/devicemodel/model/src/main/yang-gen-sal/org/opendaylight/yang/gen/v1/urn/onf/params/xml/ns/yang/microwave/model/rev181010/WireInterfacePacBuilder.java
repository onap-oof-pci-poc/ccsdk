package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceHistoricalPerformances;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCurrentPerformance;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCurrentProblems;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac
 *
 */
public class WireInterfacePacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac> {

    private WireInterfacePacKey _key;
    private UniversalId _layerProtocol;
    private WirebasedInterfaceCapability _wirebasedInterfaceCapability;
    private WirebasedInterfaceConfiguration _wirebasedInterfaceConfiguration;
    private WirebasedInterfaceCurrentPerformance _wirebasedInterfaceCurrentPerformance;
    private WirebasedInterfaceCurrentProblems _wirebasedInterfaceCurrentProblems;
    private WirebasedInterfaceHistoricalPerformances _wirebasedInterfaceHistoricalPerformances;
    private WirebasedInterfaceStatus _wirebasedInterfaceStatus;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>> augmentation = Collections.emptyMap();

    public WireInterfacePacBuilder() {
    }

    public WireInterfacePacBuilder(WireInterfacePac base) {
        if (base.getKey() == null) {
            this._key = new WireInterfacePacKey(
                base.getLayerProtocol()
            );
            this._layerProtocol = base.getLayerProtocol();
        } else {
            this._key = base.getKey();
            this._layerProtocol = _key.getLayerProtocol();
        }
        this._wirebasedInterfaceCapability = base.getWirebasedInterfaceCapability();
        this._wirebasedInterfaceConfiguration = base.getWirebasedInterfaceConfiguration();
        this._wirebasedInterfaceCurrentPerformance = base.getWirebasedInterfaceCurrentPerformance();
        this._wirebasedInterfaceCurrentProblems = base.getWirebasedInterfaceCurrentProblems();
        this._wirebasedInterfaceHistoricalPerformances = base.getWirebasedInterfaceHistoricalPerformances();
        this._wirebasedInterfaceStatus = base.getWirebasedInterfaceStatus();
        if (base instanceof WireInterfacePacImpl) {
            WireInterfacePacImpl impl = (WireInterfacePacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public WireInterfacePacKey getKey() {
        return _key;
    }
    
    public UniversalId getLayerProtocol() {
        return _layerProtocol;
    }
    
    public WirebasedInterfaceCapability getWirebasedInterfaceCapability() {
        return _wirebasedInterfaceCapability;
    }
    
    public WirebasedInterfaceConfiguration getWirebasedInterfaceConfiguration() {
        return _wirebasedInterfaceConfiguration;
    }
    
    public WirebasedInterfaceCurrentPerformance getWirebasedInterfaceCurrentPerformance() {
        return _wirebasedInterfaceCurrentPerformance;
    }
    
    public WirebasedInterfaceCurrentProblems getWirebasedInterfaceCurrentProblems() {
        return _wirebasedInterfaceCurrentProblems;
    }
    
    public WirebasedInterfaceHistoricalPerformances getWirebasedInterfaceHistoricalPerformances() {
        return _wirebasedInterfaceHistoricalPerformances;
    }
    
    public WirebasedInterfaceStatus getWirebasedInterfaceStatus() {
        return _wirebasedInterfaceStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public WireInterfacePacBuilder setKey(final WireInterfacePacKey value) {
        this._key = value;
        return this;
    }
    
     
    public WireInterfacePacBuilder setLayerProtocol(final UniversalId value) {
        this._layerProtocol = value;
        return this;
    }
    
     
    public WireInterfacePacBuilder setWirebasedInterfaceCapability(final WirebasedInterfaceCapability value) {
        this._wirebasedInterfaceCapability = value;
        return this;
    }
    
     
    public WireInterfacePacBuilder setWirebasedInterfaceConfiguration(final WirebasedInterfaceConfiguration value) {
        this._wirebasedInterfaceConfiguration = value;
        return this;
    }
    
     
    public WireInterfacePacBuilder setWirebasedInterfaceCurrentPerformance(final WirebasedInterfaceCurrentPerformance value) {
        this._wirebasedInterfaceCurrentPerformance = value;
        return this;
    }
    
     
    public WireInterfacePacBuilder setWirebasedInterfaceCurrentProblems(final WirebasedInterfaceCurrentProblems value) {
        this._wirebasedInterfaceCurrentProblems = value;
        return this;
    }
    
     
    public WireInterfacePacBuilder setWirebasedInterfaceHistoricalPerformances(final WirebasedInterfaceHistoricalPerformances value) {
        this._wirebasedInterfaceHistoricalPerformances = value;
        return this;
    }
    
     
    public WireInterfacePacBuilder setWirebasedInterfaceStatus(final WirebasedInterfaceStatus value) {
        this._wirebasedInterfaceStatus = value;
        return this;
    }
    
    public WireInterfacePacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public WireInterfacePacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public WireInterfacePac build() {
        return new WireInterfacePacImpl(this);
    }

    private static final class WireInterfacePacImpl implements WireInterfacePac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac.class;
        }

        private final WireInterfacePacKey _key;
        private final UniversalId _layerProtocol;
        private final WirebasedInterfaceCapability _wirebasedInterfaceCapability;
        private final WirebasedInterfaceConfiguration _wirebasedInterfaceConfiguration;
        private final WirebasedInterfaceCurrentPerformance _wirebasedInterfaceCurrentPerformance;
        private final WirebasedInterfaceCurrentProblems _wirebasedInterfaceCurrentProblems;
        private final WirebasedInterfaceHistoricalPerformances _wirebasedInterfaceHistoricalPerformances;
        private final WirebasedInterfaceStatus _wirebasedInterfaceStatus;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>> augmentation = Collections.emptyMap();

        private WireInterfacePacImpl(WireInterfacePacBuilder base) {
            if (base.getKey() == null) {
                this._key = new WireInterfacePacKey(
                    base.getLayerProtocol()
                );
                this._layerProtocol = base.getLayerProtocol();
            } else {
                this._key = base.getKey();
                this._layerProtocol = _key.getLayerProtocol();
            }
            this._wirebasedInterfaceCapability = base.getWirebasedInterfaceCapability();
            this._wirebasedInterfaceConfiguration = base.getWirebasedInterfaceConfiguration();
            this._wirebasedInterfaceCurrentPerformance = base.getWirebasedInterfaceCurrentPerformance();
            this._wirebasedInterfaceCurrentProblems = base.getWirebasedInterfaceCurrentProblems();
            this._wirebasedInterfaceHistoricalPerformances = base.getWirebasedInterfaceHistoricalPerformances();
            this._wirebasedInterfaceStatus = base.getWirebasedInterfaceStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public WireInterfacePacKey getKey() {
            return _key;
        }
        
        @Override
        public UniversalId getLayerProtocol() {
            return _layerProtocol;
        }
        
        @Override
        public WirebasedInterfaceCapability getWirebasedInterfaceCapability() {
            return _wirebasedInterfaceCapability;
        }
        
        @Override
        public WirebasedInterfaceConfiguration getWirebasedInterfaceConfiguration() {
            return _wirebasedInterfaceConfiguration;
        }
        
        @Override
        public WirebasedInterfaceCurrentPerformance getWirebasedInterfaceCurrentPerformance() {
            return _wirebasedInterfaceCurrentPerformance;
        }
        
        @Override
        public WirebasedInterfaceCurrentProblems getWirebasedInterfaceCurrentProblems() {
            return _wirebasedInterfaceCurrentProblems;
        }
        
        @Override
        public WirebasedInterfaceHistoricalPerformances getWirebasedInterfaceHistoricalPerformances() {
            return _wirebasedInterfaceHistoricalPerformances;
        }
        
        @Override
        public WirebasedInterfaceStatus getWirebasedInterfaceStatus() {
            return _wirebasedInterfaceStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_wirebasedInterfaceCapability);
            result = prime * result + Objects.hashCode(_wirebasedInterfaceConfiguration);
            result = prime * result + Objects.hashCode(_wirebasedInterfaceCurrentPerformance);
            result = prime * result + Objects.hashCode(_wirebasedInterfaceCurrentProblems);
            result = prime * result + Objects.hashCode(_wirebasedInterfaceHistoricalPerformances);
            result = prime * result + Objects.hashCode(_wirebasedInterfaceStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_layerProtocol, other.getLayerProtocol())) {
                return false;
            }
            if (!Objects.equals(_wirebasedInterfaceCapability, other.getWirebasedInterfaceCapability())) {
                return false;
            }
            if (!Objects.equals(_wirebasedInterfaceConfiguration, other.getWirebasedInterfaceConfiguration())) {
                return false;
            }
            if (!Objects.equals(_wirebasedInterfaceCurrentPerformance, other.getWirebasedInterfaceCurrentPerformance())) {
                return false;
            }
            if (!Objects.equals(_wirebasedInterfaceCurrentProblems, other.getWirebasedInterfaceCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_wirebasedInterfaceHistoricalPerformances, other.getWirebasedInterfaceHistoricalPerformances())) {
                return false;
            }
            if (!Objects.equals(_wirebasedInterfaceStatus, other.getWirebasedInterfaceStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                WireInterfacePacImpl otherImpl = (WireInterfacePacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "WireInterfacePac [";
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
            if (_wirebasedInterfaceCapability != null) {
                builder.append("_wirebasedInterfaceCapability=");
                builder.append(_wirebasedInterfaceCapability);
                builder.append(", ");
            }
            if (_wirebasedInterfaceConfiguration != null) {
                builder.append("_wirebasedInterfaceConfiguration=");
                builder.append(_wirebasedInterfaceConfiguration);
                builder.append(", ");
            }
            if (_wirebasedInterfaceCurrentPerformance != null) {
                builder.append("_wirebasedInterfaceCurrentPerformance=");
                builder.append(_wirebasedInterfaceCurrentPerformance);
                builder.append(", ");
            }
            if (_wirebasedInterfaceCurrentProblems != null) {
                builder.append("_wirebasedInterfaceCurrentProblems=");
                builder.append(_wirebasedInterfaceCurrentProblems);
                builder.append(", ");
            }
            if (_wirebasedInterfaceHistoricalPerformances != null) {
                builder.append("_wirebasedInterfaceHistoricalPerformances=");
                builder.append(_wirebasedInterfaceHistoricalPerformances);
                builder.append(", ");
            }
            if (_wirebasedInterfaceStatus != null) {
                builder.append("_wirebasedInterfaceStatus=");
                builder.append(_wirebasedInterfaceStatus);
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
