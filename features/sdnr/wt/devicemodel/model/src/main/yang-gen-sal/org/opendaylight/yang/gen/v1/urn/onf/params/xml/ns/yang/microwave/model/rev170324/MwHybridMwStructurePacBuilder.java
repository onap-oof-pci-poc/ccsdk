package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureCurrentProblems;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureCurrentPerformance;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureCapability;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac
 *
 */
public class MwHybridMwStructurePacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac> {

    private HybridMwStructureCapability _hybridMwStructureCapability;
    private HybridMwStructureConfiguration _hybridMwStructureConfiguration;
    private HybridMwStructureCurrentPerformance _hybridMwStructureCurrentPerformance;
    private HybridMwStructureCurrentProblems _hybridMwStructureCurrentProblems;
    private HybridMwStructureHistoricalPerformances _hybridMwStructureHistoricalPerformances;
    private HybridMwStructureStatus _hybridMwStructureStatus;
    private MwHybridMwStructurePacKey _key;
    private UniversalId _layerProtocol;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>> augmentation = Collections.emptyMap();

    public MwHybridMwStructurePacBuilder() {
    }

    public MwHybridMwStructurePacBuilder(MwHybridMwStructurePac base) {
        if (base.getKey() == null) {
            this._key = new MwHybridMwStructurePacKey(
                base.getLayerProtocol()
            );
            this._layerProtocol = base.getLayerProtocol();
        } else {
            this._key = base.getKey();
            this._layerProtocol = _key.getLayerProtocol();
        }
        this._hybridMwStructureCapability = base.getHybridMwStructureCapability();
        this._hybridMwStructureConfiguration = base.getHybridMwStructureConfiguration();
        this._hybridMwStructureCurrentPerformance = base.getHybridMwStructureCurrentPerformance();
        this._hybridMwStructureCurrentProblems = base.getHybridMwStructureCurrentProblems();
        this._hybridMwStructureHistoricalPerformances = base.getHybridMwStructureHistoricalPerformances();
        this._hybridMwStructureStatus = base.getHybridMwStructureStatus();
        if (base instanceof MwHybridMwStructurePacImpl) {
            MwHybridMwStructurePacImpl impl = (MwHybridMwStructurePacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public HybridMwStructureCapability getHybridMwStructureCapability() {
        return _hybridMwStructureCapability;
    }
    
    public HybridMwStructureConfiguration getHybridMwStructureConfiguration() {
        return _hybridMwStructureConfiguration;
    }
    
    public HybridMwStructureCurrentPerformance getHybridMwStructureCurrentPerformance() {
        return _hybridMwStructureCurrentPerformance;
    }
    
    public HybridMwStructureCurrentProblems getHybridMwStructureCurrentProblems() {
        return _hybridMwStructureCurrentProblems;
    }
    
    public HybridMwStructureHistoricalPerformances getHybridMwStructureHistoricalPerformances() {
        return _hybridMwStructureHistoricalPerformances;
    }
    
    public HybridMwStructureStatus getHybridMwStructureStatus() {
        return _hybridMwStructureStatus;
    }
    
    public MwHybridMwStructurePacKey getKey() {
        return _key;
    }
    
    public UniversalId getLayerProtocol() {
        return _layerProtocol;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MwHybridMwStructurePacBuilder setHybridMwStructureCapability(final HybridMwStructureCapability value) {
        this._hybridMwStructureCapability = value;
        return this;
    }
    
     
    public MwHybridMwStructurePacBuilder setHybridMwStructureConfiguration(final HybridMwStructureConfiguration value) {
        this._hybridMwStructureConfiguration = value;
        return this;
    }
    
     
    public MwHybridMwStructurePacBuilder setHybridMwStructureCurrentPerformance(final HybridMwStructureCurrentPerformance value) {
        this._hybridMwStructureCurrentPerformance = value;
        return this;
    }
    
     
    public MwHybridMwStructurePacBuilder setHybridMwStructureCurrentProblems(final HybridMwStructureCurrentProblems value) {
        this._hybridMwStructureCurrentProblems = value;
        return this;
    }
    
     
    public MwHybridMwStructurePacBuilder setHybridMwStructureHistoricalPerformances(final HybridMwStructureHistoricalPerformances value) {
        this._hybridMwStructureHistoricalPerformances = value;
        return this;
    }
    
     
    public MwHybridMwStructurePacBuilder setHybridMwStructureStatus(final HybridMwStructureStatus value) {
        this._hybridMwStructureStatus = value;
        return this;
    }
    
     
    public MwHybridMwStructurePacBuilder setKey(final MwHybridMwStructurePacKey value) {
        this._key = value;
        return this;
    }
    
     
    public MwHybridMwStructurePacBuilder setLayerProtocol(final UniversalId value) {
        this._layerProtocol = value;
        return this;
    }
    
    public MwHybridMwStructurePacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MwHybridMwStructurePacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MwHybridMwStructurePac build() {
        return new MwHybridMwStructurePacImpl(this);
    }

    private static final class MwHybridMwStructurePacImpl implements MwHybridMwStructurePac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac.class;
        }

        private final HybridMwStructureCapability _hybridMwStructureCapability;
        private final HybridMwStructureConfiguration _hybridMwStructureConfiguration;
        private final HybridMwStructureCurrentPerformance _hybridMwStructureCurrentPerformance;
        private final HybridMwStructureCurrentProblems _hybridMwStructureCurrentProblems;
        private final HybridMwStructureHistoricalPerformances _hybridMwStructureHistoricalPerformances;
        private final HybridMwStructureStatus _hybridMwStructureStatus;
        private final MwHybridMwStructurePacKey _key;
        private final UniversalId _layerProtocol;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>> augmentation = Collections.emptyMap();

        private MwHybridMwStructurePacImpl(MwHybridMwStructurePacBuilder base) {
            if (base.getKey() == null) {
                this._key = new MwHybridMwStructurePacKey(
                    base.getLayerProtocol()
                );
                this._layerProtocol = base.getLayerProtocol();
            } else {
                this._key = base.getKey();
                this._layerProtocol = _key.getLayerProtocol();
            }
            this._hybridMwStructureCapability = base.getHybridMwStructureCapability();
            this._hybridMwStructureConfiguration = base.getHybridMwStructureConfiguration();
            this._hybridMwStructureCurrentPerformance = base.getHybridMwStructureCurrentPerformance();
            this._hybridMwStructureCurrentProblems = base.getHybridMwStructureCurrentProblems();
            this._hybridMwStructureHistoricalPerformances = base.getHybridMwStructureHistoricalPerformances();
            this._hybridMwStructureStatus = base.getHybridMwStructureStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public HybridMwStructureCapability getHybridMwStructureCapability() {
            return _hybridMwStructureCapability;
        }
        
        @Override
        public HybridMwStructureConfiguration getHybridMwStructureConfiguration() {
            return _hybridMwStructureConfiguration;
        }
        
        @Override
        public HybridMwStructureCurrentPerformance getHybridMwStructureCurrentPerformance() {
            return _hybridMwStructureCurrentPerformance;
        }
        
        @Override
        public HybridMwStructureCurrentProblems getHybridMwStructureCurrentProblems() {
            return _hybridMwStructureCurrentProblems;
        }
        
        @Override
        public HybridMwStructureHistoricalPerformances getHybridMwStructureHistoricalPerformances() {
            return _hybridMwStructureHistoricalPerformances;
        }
        
        @Override
        public HybridMwStructureStatus getHybridMwStructureStatus() {
            return _hybridMwStructureStatus;
        }
        
        @Override
        public MwHybridMwStructurePacKey getKey() {
            return _key;
        }
        
        @Override
        public UniversalId getLayerProtocol() {
            return _layerProtocol;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_hybridMwStructureCapability);
            result = prime * result + Objects.hashCode(_hybridMwStructureConfiguration);
            result = prime * result + Objects.hashCode(_hybridMwStructureCurrentPerformance);
            result = prime * result + Objects.hashCode(_hybridMwStructureCurrentProblems);
            result = prime * result + Objects.hashCode(_hybridMwStructureHistoricalPerformances);
            result = prime * result + Objects.hashCode(_hybridMwStructureStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac)obj;
            if (!Objects.equals(_hybridMwStructureCapability, other.getHybridMwStructureCapability())) {
                return false;
            }
            if (!Objects.equals(_hybridMwStructureConfiguration, other.getHybridMwStructureConfiguration())) {
                return false;
            }
            if (!Objects.equals(_hybridMwStructureCurrentPerformance, other.getHybridMwStructureCurrentPerformance())) {
                return false;
            }
            if (!Objects.equals(_hybridMwStructureCurrentProblems, other.getHybridMwStructureCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_hybridMwStructureHistoricalPerformances, other.getHybridMwStructureHistoricalPerformances())) {
                return false;
            }
            if (!Objects.equals(_hybridMwStructureStatus, other.getHybridMwStructureStatus())) {
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
                MwHybridMwStructurePacImpl otherImpl = (MwHybridMwStructurePacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MwHybridMwStructurePac [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_hybridMwStructureCapability != null) {
                builder.append("_hybridMwStructureCapability=");
                builder.append(_hybridMwStructureCapability);
                builder.append(", ");
            }
            if (_hybridMwStructureConfiguration != null) {
                builder.append("_hybridMwStructureConfiguration=");
                builder.append(_hybridMwStructureConfiguration);
                builder.append(", ");
            }
            if (_hybridMwStructureCurrentPerformance != null) {
                builder.append("_hybridMwStructureCurrentPerformance=");
                builder.append(_hybridMwStructureCurrentPerformance);
                builder.append(", ");
            }
            if (_hybridMwStructureCurrentProblems != null) {
                builder.append("_hybridMwStructureCurrentProblems=");
                builder.append(_hybridMwStructureCurrentProblems);
                builder.append(", ");
            }
            if (_hybridMwStructureHistoricalPerformances != null) {
                builder.append("_hybridMwStructureHistoricalPerformances=");
                builder.append(_hybridMwStructureHistoricalPerformances);
                builder.append(", ");
            }
            if (_hybridMwStructureStatus != null) {
                builder.append("_hybridMwStructureStatus=");
                builder.append(_hybridMwStructureStatus);
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
