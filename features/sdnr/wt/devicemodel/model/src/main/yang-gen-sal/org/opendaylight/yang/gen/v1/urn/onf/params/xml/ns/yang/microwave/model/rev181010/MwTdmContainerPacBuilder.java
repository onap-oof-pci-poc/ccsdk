package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerHistoricalPerformances;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerCurrentProblems;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerStatus;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerCurrentPerformance;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerCapability;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac
 *
 */
public class MwTdmContainerPacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac> {

    private MwTdmContainerPacKey _key;
    private UniversalId _layerProtocol;
    private TdmContainerCapability _tdmContainerCapability;
    private TdmContainerConfiguration _tdmContainerConfiguration;
    private TdmContainerCurrentPerformance _tdmContainerCurrentPerformance;
    private TdmContainerCurrentProblems _tdmContainerCurrentProblems;
    private TdmContainerHistoricalPerformances _tdmContainerHistoricalPerformances;
    private TdmContainerStatus _tdmContainerStatus;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>> augmentation = Collections.emptyMap();

    public MwTdmContainerPacBuilder() {
    }

    public MwTdmContainerPacBuilder(MwTdmContainerPac base) {
        if (base.getKey() == null) {
            this._key = new MwTdmContainerPacKey(
                base.getLayerProtocol()
            );
            this._layerProtocol = base.getLayerProtocol();
        } else {
            this._key = base.getKey();
            this._layerProtocol = _key.getLayerProtocol();
        }
        this._tdmContainerCapability = base.getTdmContainerCapability();
        this._tdmContainerConfiguration = base.getTdmContainerConfiguration();
        this._tdmContainerCurrentPerformance = base.getTdmContainerCurrentPerformance();
        this._tdmContainerCurrentProblems = base.getTdmContainerCurrentProblems();
        this._tdmContainerHistoricalPerformances = base.getTdmContainerHistoricalPerformances();
        this._tdmContainerStatus = base.getTdmContainerStatus();
        if (base instanceof MwTdmContainerPacImpl) {
            MwTdmContainerPacImpl impl = (MwTdmContainerPacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public MwTdmContainerPacKey getKey() {
        return _key;
    }
    
    public UniversalId getLayerProtocol() {
        return _layerProtocol;
    }
    
    public TdmContainerCapability getTdmContainerCapability() {
        return _tdmContainerCapability;
    }
    
    public TdmContainerConfiguration getTdmContainerConfiguration() {
        return _tdmContainerConfiguration;
    }
    
    public TdmContainerCurrentPerformance getTdmContainerCurrentPerformance() {
        return _tdmContainerCurrentPerformance;
    }
    
    public TdmContainerCurrentProblems getTdmContainerCurrentProblems() {
        return _tdmContainerCurrentProblems;
    }
    
    public TdmContainerHistoricalPerformances getTdmContainerHistoricalPerformances() {
        return _tdmContainerHistoricalPerformances;
    }
    
    public TdmContainerStatus getTdmContainerStatus() {
        return _tdmContainerStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MwTdmContainerPacBuilder setKey(final MwTdmContainerPacKey value) {
        this._key = value;
        return this;
    }
    
     
    public MwTdmContainerPacBuilder setLayerProtocol(final UniversalId value) {
        this._layerProtocol = value;
        return this;
    }
    
     
    public MwTdmContainerPacBuilder setTdmContainerCapability(final TdmContainerCapability value) {
        this._tdmContainerCapability = value;
        return this;
    }
    
     
    public MwTdmContainerPacBuilder setTdmContainerConfiguration(final TdmContainerConfiguration value) {
        this._tdmContainerConfiguration = value;
        return this;
    }
    
     
    public MwTdmContainerPacBuilder setTdmContainerCurrentPerformance(final TdmContainerCurrentPerformance value) {
        this._tdmContainerCurrentPerformance = value;
        return this;
    }
    
     
    public MwTdmContainerPacBuilder setTdmContainerCurrentProblems(final TdmContainerCurrentProblems value) {
        this._tdmContainerCurrentProblems = value;
        return this;
    }
    
     
    public MwTdmContainerPacBuilder setTdmContainerHistoricalPerformances(final TdmContainerHistoricalPerformances value) {
        this._tdmContainerHistoricalPerformances = value;
        return this;
    }
    
     
    public MwTdmContainerPacBuilder setTdmContainerStatus(final TdmContainerStatus value) {
        this._tdmContainerStatus = value;
        return this;
    }
    
    public MwTdmContainerPacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MwTdmContainerPacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MwTdmContainerPac build() {
        return new MwTdmContainerPacImpl(this);
    }

    private static final class MwTdmContainerPacImpl implements MwTdmContainerPac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac.class;
        }

        private final MwTdmContainerPacKey _key;
        private final UniversalId _layerProtocol;
        private final TdmContainerCapability _tdmContainerCapability;
        private final TdmContainerConfiguration _tdmContainerConfiguration;
        private final TdmContainerCurrentPerformance _tdmContainerCurrentPerformance;
        private final TdmContainerCurrentProblems _tdmContainerCurrentProblems;
        private final TdmContainerHistoricalPerformances _tdmContainerHistoricalPerformances;
        private final TdmContainerStatus _tdmContainerStatus;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>> augmentation = Collections.emptyMap();

        private MwTdmContainerPacImpl(MwTdmContainerPacBuilder base) {
            if (base.getKey() == null) {
                this._key = new MwTdmContainerPacKey(
                    base.getLayerProtocol()
                );
                this._layerProtocol = base.getLayerProtocol();
            } else {
                this._key = base.getKey();
                this._layerProtocol = _key.getLayerProtocol();
            }
            this._tdmContainerCapability = base.getTdmContainerCapability();
            this._tdmContainerConfiguration = base.getTdmContainerConfiguration();
            this._tdmContainerCurrentPerformance = base.getTdmContainerCurrentPerformance();
            this._tdmContainerCurrentProblems = base.getTdmContainerCurrentProblems();
            this._tdmContainerHistoricalPerformances = base.getTdmContainerHistoricalPerformances();
            this._tdmContainerStatus = base.getTdmContainerStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public MwTdmContainerPacKey getKey() {
            return _key;
        }
        
        @Override
        public UniversalId getLayerProtocol() {
            return _layerProtocol;
        }
        
        @Override
        public TdmContainerCapability getTdmContainerCapability() {
            return _tdmContainerCapability;
        }
        
        @Override
        public TdmContainerConfiguration getTdmContainerConfiguration() {
            return _tdmContainerConfiguration;
        }
        
        @Override
        public TdmContainerCurrentPerformance getTdmContainerCurrentPerformance() {
            return _tdmContainerCurrentPerformance;
        }
        
        @Override
        public TdmContainerCurrentProblems getTdmContainerCurrentProblems() {
            return _tdmContainerCurrentProblems;
        }
        
        @Override
        public TdmContainerHistoricalPerformances getTdmContainerHistoricalPerformances() {
            return _tdmContainerHistoricalPerformances;
        }
        
        @Override
        public TdmContainerStatus getTdmContainerStatus() {
            return _tdmContainerStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_tdmContainerCapability);
            result = prime * result + Objects.hashCode(_tdmContainerConfiguration);
            result = prime * result + Objects.hashCode(_tdmContainerCurrentPerformance);
            result = prime * result + Objects.hashCode(_tdmContainerCurrentProblems);
            result = prime * result + Objects.hashCode(_tdmContainerHistoricalPerformances);
            result = prime * result + Objects.hashCode(_tdmContainerStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_layerProtocol, other.getLayerProtocol())) {
                return false;
            }
            if (!Objects.equals(_tdmContainerCapability, other.getTdmContainerCapability())) {
                return false;
            }
            if (!Objects.equals(_tdmContainerConfiguration, other.getTdmContainerConfiguration())) {
                return false;
            }
            if (!Objects.equals(_tdmContainerCurrentPerformance, other.getTdmContainerCurrentPerformance())) {
                return false;
            }
            if (!Objects.equals(_tdmContainerCurrentProblems, other.getTdmContainerCurrentProblems())) {
                return false;
            }
            if (!Objects.equals(_tdmContainerHistoricalPerformances, other.getTdmContainerHistoricalPerformances())) {
                return false;
            }
            if (!Objects.equals(_tdmContainerStatus, other.getTdmContainerStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MwTdmContainerPacImpl otherImpl = (MwTdmContainerPacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwTdmContainerPac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MwTdmContainerPac [";
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
            if (_tdmContainerCapability != null) {
                builder.append("_tdmContainerCapability=");
                builder.append(_tdmContainerCapability);
                builder.append(", ");
            }
            if (_tdmContainerConfiguration != null) {
                builder.append("_tdmContainerConfiguration=");
                builder.append(_tdmContainerConfiguration);
                builder.append(", ");
            }
            if (_tdmContainerCurrentPerformance != null) {
                builder.append("_tdmContainerCurrentPerformance=");
                builder.append(_tdmContainerCurrentPerformance);
                builder.append(", ");
            }
            if (_tdmContainerCurrentProblems != null) {
                builder.append("_tdmContainerCurrentProblems=");
                builder.append(_tdmContainerCurrentProblems);
                builder.append(", ");
            }
            if (_tdmContainerHistoricalPerformances != null) {
                builder.append("_tdmContainerHistoricalPerformances=");
                builder.append(_tdmContainerHistoricalPerformances);
                builder.append(", ");
            }
            if (_tdmContainerStatus != null) {
                builder.append("_tdmContainerStatus=");
                builder.append(_tdmContainerStatus);
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
