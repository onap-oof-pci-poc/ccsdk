package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureCurrentPerformance;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureCurrentProblems;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureCapability;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureStatus;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureConfiguration;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac
 *
 */
public class MwPureEthernetStructurePacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac> {

    private MwPureEthernetStructurePacKey _key;
    private UniversalId _layerProtocol;
    private PureEthernetStructureCapability _pureEthernetStructureCapability;
    private PureEthernetStructureConfiguration _pureEthernetStructureConfiguration;
    private PureEthernetStructureCurrentPerformance _pureEthernetStructureCurrentPerformance;
    private PureEthernetStructureCurrentProblems _pureEthernetStructureCurrentProblems;
    private PureEthernetStructureHistoricalPerformances _pureEthernetStructureHistoricalPerformances;
    private PureEthernetStructureStatus _pureEthernetStructureStatus;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>> augmentation = Collections.emptyMap();

    public MwPureEthernetStructurePacBuilder() {
    }

    public MwPureEthernetStructurePacBuilder(MwPureEthernetStructurePac base) {
        if (base.getKey() == null) {
            this._key = new MwPureEthernetStructurePacKey(
                base.getLayerProtocol()
            );
            this._layerProtocol = base.getLayerProtocol();
        } else {
            this._key = base.getKey();
            this._layerProtocol = _key.getLayerProtocol();
        }
        this._pureEthernetStructureCapability = base.getPureEthernetStructureCapability();
        this._pureEthernetStructureConfiguration = base.getPureEthernetStructureConfiguration();
        this._pureEthernetStructureCurrentPerformance = base.getPureEthernetStructureCurrentPerformance();
        this._pureEthernetStructureCurrentProblems = base.getPureEthernetStructureCurrentProblems();
        this._pureEthernetStructureHistoricalPerformances = base.getPureEthernetStructureHistoricalPerformances();
        this._pureEthernetStructureStatus = base.getPureEthernetStructureStatus();
        if (base instanceof MwPureEthernetStructurePacImpl) {
            MwPureEthernetStructurePacImpl impl = (MwPureEthernetStructurePacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public MwPureEthernetStructurePacKey getKey() {
        return _key;
    }
    
    public UniversalId getLayerProtocol() {
        return _layerProtocol;
    }
    
    public PureEthernetStructureCapability getPureEthernetStructureCapability() {
        return _pureEthernetStructureCapability;
    }
    
    public PureEthernetStructureConfiguration getPureEthernetStructureConfiguration() {
        return _pureEthernetStructureConfiguration;
    }
    
    public PureEthernetStructureCurrentPerformance getPureEthernetStructureCurrentPerformance() {
        return _pureEthernetStructureCurrentPerformance;
    }
    
    public PureEthernetStructureCurrentProblems getPureEthernetStructureCurrentProblems() {
        return _pureEthernetStructureCurrentProblems;
    }
    
    public PureEthernetStructureHistoricalPerformances getPureEthernetStructureHistoricalPerformances() {
        return _pureEthernetStructureHistoricalPerformances;
    }
    
    public PureEthernetStructureStatus getPureEthernetStructureStatus() {
        return _pureEthernetStructureStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MwPureEthernetStructurePacBuilder setKey(final MwPureEthernetStructurePacKey value) {
        this._key = value;
        return this;
    }
    
     
    public MwPureEthernetStructurePacBuilder setLayerProtocol(final UniversalId value) {
        this._layerProtocol = value;
        return this;
    }
    
     
    public MwPureEthernetStructurePacBuilder setPureEthernetStructureCapability(final PureEthernetStructureCapability value) {
        this._pureEthernetStructureCapability = value;
        return this;
    }
    
     
    public MwPureEthernetStructurePacBuilder setPureEthernetStructureConfiguration(final PureEthernetStructureConfiguration value) {
        this._pureEthernetStructureConfiguration = value;
        return this;
    }
    
     
    public MwPureEthernetStructurePacBuilder setPureEthernetStructureCurrentPerformance(final PureEthernetStructureCurrentPerformance value) {
        this._pureEthernetStructureCurrentPerformance = value;
        return this;
    }
    
     
    public MwPureEthernetStructurePacBuilder setPureEthernetStructureCurrentProblems(final PureEthernetStructureCurrentProblems value) {
        this._pureEthernetStructureCurrentProblems = value;
        return this;
    }
    
     
    public MwPureEthernetStructurePacBuilder setPureEthernetStructureHistoricalPerformances(final PureEthernetStructureHistoricalPerformances value) {
        this._pureEthernetStructureHistoricalPerformances = value;
        return this;
    }
    
     
    public MwPureEthernetStructurePacBuilder setPureEthernetStructureStatus(final PureEthernetStructureStatus value) {
        this._pureEthernetStructureStatus = value;
        return this;
    }
    
    public MwPureEthernetStructurePacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MwPureEthernetStructurePacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MwPureEthernetStructurePac build() {
        return new MwPureEthernetStructurePacImpl(this);
    }

    private static final class MwPureEthernetStructurePacImpl implements MwPureEthernetStructurePac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac.class;
        }

        private final MwPureEthernetStructurePacKey _key;
        private final UniversalId _layerProtocol;
        private final PureEthernetStructureCapability _pureEthernetStructureCapability;
        private final PureEthernetStructureConfiguration _pureEthernetStructureConfiguration;
        private final PureEthernetStructureCurrentPerformance _pureEthernetStructureCurrentPerformance;
        private final PureEthernetStructureCurrentProblems _pureEthernetStructureCurrentProblems;
        private final PureEthernetStructureHistoricalPerformances _pureEthernetStructureHistoricalPerformances;
        private final PureEthernetStructureStatus _pureEthernetStructureStatus;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>> augmentation = Collections.emptyMap();

        private MwPureEthernetStructurePacImpl(MwPureEthernetStructurePacBuilder base) {
            if (base.getKey() == null) {
                this._key = new MwPureEthernetStructurePacKey(
                    base.getLayerProtocol()
                );
                this._layerProtocol = base.getLayerProtocol();
            } else {
                this._key = base.getKey();
                this._layerProtocol = _key.getLayerProtocol();
            }
            this._pureEthernetStructureCapability = base.getPureEthernetStructureCapability();
            this._pureEthernetStructureConfiguration = base.getPureEthernetStructureConfiguration();
            this._pureEthernetStructureCurrentPerformance = base.getPureEthernetStructureCurrentPerformance();
            this._pureEthernetStructureCurrentProblems = base.getPureEthernetStructureCurrentProblems();
            this._pureEthernetStructureHistoricalPerformances = base.getPureEthernetStructureHistoricalPerformances();
            this._pureEthernetStructureStatus = base.getPureEthernetStructureStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public MwPureEthernetStructurePacKey getKey() {
            return _key;
        }
        
        @Override
        public UniversalId getLayerProtocol() {
            return _layerProtocol;
        }
        
        @Override
        public PureEthernetStructureCapability getPureEthernetStructureCapability() {
            return _pureEthernetStructureCapability;
        }
        
        @Override
        public PureEthernetStructureConfiguration getPureEthernetStructureConfiguration() {
            return _pureEthernetStructureConfiguration;
        }
        
        @Override
        public PureEthernetStructureCurrentPerformance getPureEthernetStructureCurrentPerformance() {
            return _pureEthernetStructureCurrentPerformance;
        }
        
        @Override
        public PureEthernetStructureCurrentProblems getPureEthernetStructureCurrentProblems() {
            return _pureEthernetStructureCurrentProblems;
        }
        
        @Override
        public PureEthernetStructureHistoricalPerformances getPureEthernetStructureHistoricalPerformances() {
            return _pureEthernetStructureHistoricalPerformances;
        }
        
        @Override
        public PureEthernetStructureStatus getPureEthernetStructureStatus() {
            return _pureEthernetStructureStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_pureEthernetStructureCapability);
            result = prime * result + Objects.hashCode(_pureEthernetStructureConfiguration);
            result = prime * result + Objects.hashCode(_pureEthernetStructureCurrentPerformance);
            result = prime * result + Objects.hashCode(_pureEthernetStructureCurrentProblems);
            result = prime * result + Objects.hashCode(_pureEthernetStructureHistoricalPerformances);
            result = prime * result + Objects.hashCode(_pureEthernetStructureStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_layerProtocol, other.getLayerProtocol())) {
                return false;
            }
            if (!Objects.equals(_pureEthernetStructureCapability, other.getPureEthernetStructureCapability())) {
                return false;
            }
            if (!Objects.equals(_pureEthernetStructureConfiguration, other.getPureEthernetStructureConfiguration())) {
                return false;
            }
            if (!Objects.equals(_pureEthernetStructureCurrentPerformance, other.getPureEthernetStructureCurrentPerformance())) {
                return false;
            }
            if (!Objects.equals(_pureEthernetStructureCurrentProblems, other.getPureEthernetStructureCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_pureEthernetStructureHistoricalPerformances, other.getPureEthernetStructureHistoricalPerformances())) {
                return false;
            }
            if (!Objects.equals(_pureEthernetStructureStatus, other.getPureEthernetStructureStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MwPureEthernetStructurePacImpl otherImpl = (MwPureEthernetStructurePacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MwPureEthernetStructurePac [";
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
            if (_pureEthernetStructureCapability != null) {
                builder.append("_pureEthernetStructureCapability=");
                builder.append(_pureEthernetStructureCapability);
                builder.append(", ");
            }
            if (_pureEthernetStructureConfiguration != null) {
                builder.append("_pureEthernetStructureConfiguration=");
                builder.append(_pureEthernetStructureConfiguration);
                builder.append(", ");
            }
            if (_pureEthernetStructureCurrentPerformance != null) {
                builder.append("_pureEthernetStructureCurrentPerformance=");
                builder.append(_pureEthernetStructureCurrentPerformance);
                builder.append(", ");
            }
            if (_pureEthernetStructureCurrentProblems != null) {
                builder.append("_pureEthernetStructureCurrentProblems=");
                builder.append(_pureEthernetStructureCurrentProblems);
                builder.append(", ");
            }
            if (_pureEthernetStructureHistoricalPerformances != null) {
                builder.append("_pureEthernetStructureHistoricalPerformances=");
                builder.append(_pureEthernetStructureHistoricalPerformances);
                builder.append(", ");
            }
            if (_pureEthernetStructureStatus != null) {
                builder.append("_pureEthernetStructureStatus=");
                builder.append(_pureEthernetStructureStatus);
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
