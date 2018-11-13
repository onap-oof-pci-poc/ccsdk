package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ProblemKindSeverityList;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.SegmentId;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration
 *
 */
public class TdmContainerConfigurationBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration> {

    private java.lang.String _containerId;
    private ContainerType _containerType;
    private List<ProblemKindSeverityList> _problemKindSeverityList;
    private SegmentId _segmentId;
    private java.lang.Boolean _performanceMonitoringCollectionIsOn;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>> augmentation = Collections.emptyMap();

    public TdmContainerConfigurationBuilder() {
    }
    public TdmContainerConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerConfigurationG arg) {
        this._containerId = arg.getContainerId();
        this._containerType = arg.getContainerType();
        this._segmentId = arg.getSegmentId();
        this._performanceMonitoringCollectionIsOn = arg.isPerformanceMonitoringCollectionIsOn();
        this._problemKindSeverityList = arg.getProblemKindSeverityList();
    }

    public TdmContainerConfigurationBuilder(TdmContainerConfiguration base) {
        this._containerId = base.getContainerId();
        this._containerType = base.getContainerType();
        this._problemKindSeverityList = base.getProblemKindSeverityList();
        this._segmentId = base.getSegmentId();
        this._performanceMonitoringCollectionIsOn = base.isPerformanceMonitoringCollectionIsOn();
        if (base instanceof TdmContainerConfigurationImpl) {
            TdmContainerConfigurationImpl impl = (TdmContainerConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerConfigurationG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerConfigurationG) {
            this._containerId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerConfigurationG)arg).getContainerId();
            this._containerType = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerConfigurationG)arg).getContainerType();
            this._segmentId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerConfigurationG)arg).getSegmentId();
            this._performanceMonitoringCollectionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerConfigurationG)arg).isPerformanceMonitoringCollectionIsOn();
            this._problemKindSeverityList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerConfigurationG)arg).getProblemKindSeverityList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerConfigurationG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getContainerId() {
        return _containerId;
    }
    
    public ContainerType getContainerType() {
        return _containerType;
    }
    
    public List<ProblemKindSeverityList> getProblemKindSeverityList() {
        return _problemKindSeverityList;
    }
    
    public SegmentId getSegmentId() {
        return _segmentId;
    }
    
    public java.lang.Boolean isPerformanceMonitoringCollectionIsOn() {
        return _performanceMonitoringCollectionIsOn;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TdmContainerConfigurationBuilder setContainerId(final java.lang.String value) {
        this._containerId = value;
        return this;
    }
    
     
    public TdmContainerConfigurationBuilder setContainerType(final ContainerType value) {
        this._containerType = value;
        return this;
    }
    
     
    public TdmContainerConfigurationBuilder setProblemKindSeverityList(final List<ProblemKindSeverityList> value) {
        this._problemKindSeverityList = value;
        return this;
    }
    
     
    public TdmContainerConfigurationBuilder setSegmentId(final SegmentId value) {
        this._segmentId = value;
        return this;
    }
    
     
    public TdmContainerConfigurationBuilder setPerformanceMonitoringCollectionIsOn(final java.lang.Boolean value) {
        this._performanceMonitoringCollectionIsOn = value;
        return this;
    }
    
    public TdmContainerConfigurationBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TdmContainerConfigurationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TdmContainerConfiguration build() {
        return new TdmContainerConfigurationImpl(this);
    }

    private static final class TdmContainerConfigurationImpl implements TdmContainerConfiguration {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration.class;
        }

        private final java.lang.String _containerId;
        private final ContainerType _containerType;
        private final List<ProblemKindSeverityList> _problemKindSeverityList;
        private final SegmentId _segmentId;
        private final java.lang.Boolean _performanceMonitoringCollectionIsOn;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>> augmentation = Collections.emptyMap();

        private TdmContainerConfigurationImpl(TdmContainerConfigurationBuilder base) {
            this._containerId = base.getContainerId();
            this._containerType = base.getContainerType();
            this._problemKindSeverityList = base.getProblemKindSeverityList();
            this._segmentId = base.getSegmentId();
            this._performanceMonitoringCollectionIsOn = base.isPerformanceMonitoringCollectionIsOn();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getContainerId() {
            return _containerId;
        }
        
        @Override
        public ContainerType getContainerType() {
            return _containerType;
        }
        
        @Override
        public List<ProblemKindSeverityList> getProblemKindSeverityList() {
            return _problemKindSeverityList;
        }
        
        @Override
        public SegmentId getSegmentId() {
            return _segmentId;
        }
        
        @Override
        public java.lang.Boolean isPerformanceMonitoringCollectionIsOn() {
            return _performanceMonitoringCollectionIsOn;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_containerId);
            result = prime * result + Objects.hashCode(_containerType);
            result = prime * result + Objects.hashCode(_problemKindSeverityList);
            result = prime * result + Objects.hashCode(_segmentId);
            result = prime * result + Objects.hashCode(_performanceMonitoringCollectionIsOn);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration)obj;
            if (!Objects.equals(_containerId, other.getContainerId())) {
                return false;
            }
            if (!Objects.equals(_containerType, other.getContainerType())) {
                return false;
            }
            if (!Objects.equals(_problemKindSeverityList, other.getProblemKindSeverityList())) {
                return false;
            }
            if (!Objects.equals(_segmentId, other.getSegmentId())) {
                return false;
            }
            if (!Objects.equals(_performanceMonitoringCollectionIsOn, other.isPerformanceMonitoringCollectionIsOn())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TdmContainerConfigurationImpl otherImpl = (TdmContainerConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.tdm.container.pac.TdmContainerConfiguration>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TdmContainerConfiguration [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_containerId != null) {
                builder.append("_containerId=");
                builder.append(_containerId);
                builder.append(", ");
            }
            if (_containerType != null) {
                builder.append("_containerType=");
                builder.append(_containerType);
                builder.append(", ");
            }
            if (_problemKindSeverityList != null) {
                builder.append("_problemKindSeverityList=");
                builder.append(_problemKindSeverityList);
                builder.append(", ");
            }
            if (_segmentId != null) {
                builder.append("_segmentId=");
                builder.append(_segmentId);
                builder.append(", ");
            }
            if (_performanceMonitoringCollectionIsOn != null) {
                builder.append("_performanceMonitoringCollectionIsOn=");
                builder.append(_performanceMonitoringCollectionIsOn);
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
