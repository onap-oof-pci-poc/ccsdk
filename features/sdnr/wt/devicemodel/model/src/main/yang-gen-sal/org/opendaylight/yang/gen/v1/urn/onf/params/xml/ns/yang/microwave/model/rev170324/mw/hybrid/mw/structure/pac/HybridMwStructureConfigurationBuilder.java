package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.hybrid.mw.structure.configuration.g.ProblemKindSeverityList;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.hybrid.mw.structure.configuration.g.StructureType;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration
 *
 */
public class HybridMwStructureConfigurationBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration> {

    private java.lang.Short _numberOfTdmSegmentsToBeReserved;
    private List<ProblemKindSeverityList> _problemKindSeverityList;
    private StructureType _structureType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>> augmentation = Collections.emptyMap();

    public HybridMwStructureConfigurationBuilder() {
    }
    public HybridMwStructureConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.HybridMwStructureConfigurationG arg) {
        this._structureType = arg.getStructureType();
        this._numberOfTdmSegmentsToBeReserved = arg.getNumberOfTdmSegmentsToBeReserved();
        this._problemKindSeverityList = arg.getProblemKindSeverityList();
    }

    public HybridMwStructureConfigurationBuilder(HybridMwStructureConfiguration base) {
        this._numberOfTdmSegmentsToBeReserved = base.getNumberOfTdmSegmentsToBeReserved();
        this._problemKindSeverityList = base.getProblemKindSeverityList();
        this._structureType = base.getStructureType();
        if (base instanceof HybridMwStructureConfigurationImpl) {
            HybridMwStructureConfigurationImpl impl = (HybridMwStructureConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.HybridMwStructureConfigurationG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.HybridMwStructureConfigurationG) {
            this._structureType = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.HybridMwStructureConfigurationG)arg).getStructureType();
            this._numberOfTdmSegmentsToBeReserved = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.HybridMwStructureConfigurationG)arg).getNumberOfTdmSegmentsToBeReserved();
            this._problemKindSeverityList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.HybridMwStructureConfigurationG)arg).getProblemKindSeverityList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.HybridMwStructureConfigurationG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getNumberOfTdmSegmentsToBeReserved() {
        return _numberOfTdmSegmentsToBeReserved;
    }
    
    public List<ProblemKindSeverityList> getProblemKindSeverityList() {
        return _problemKindSeverityList;
    }
    
    public StructureType getStructureType() {
        return _structureType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public HybridMwStructureConfigurationBuilder setNumberOfTdmSegmentsToBeReserved(final java.lang.Short value) {
        this._numberOfTdmSegmentsToBeReserved = value;
        return this;
    }
    
     
    public HybridMwStructureConfigurationBuilder setProblemKindSeverityList(final List<ProblemKindSeverityList> value) {
        this._problemKindSeverityList = value;
        return this;
    }
    
     
    public HybridMwStructureConfigurationBuilder setStructureType(final StructureType value) {
        this._structureType = value;
        return this;
    }
    
    public HybridMwStructureConfigurationBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HybridMwStructureConfigurationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HybridMwStructureConfiguration build() {
        return new HybridMwStructureConfigurationImpl(this);
    }

    private static final class HybridMwStructureConfigurationImpl implements HybridMwStructureConfiguration {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration.class;
        }

        private final java.lang.Short _numberOfTdmSegmentsToBeReserved;
        private final List<ProblemKindSeverityList> _problemKindSeverityList;
        private final StructureType _structureType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>> augmentation = Collections.emptyMap();

        private HybridMwStructureConfigurationImpl(HybridMwStructureConfigurationBuilder base) {
            this._numberOfTdmSegmentsToBeReserved = base.getNumberOfTdmSegmentsToBeReserved();
            this._problemKindSeverityList = base.getProblemKindSeverityList();
            this._structureType = base.getStructureType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getNumberOfTdmSegmentsToBeReserved() {
            return _numberOfTdmSegmentsToBeReserved;
        }
        
        @Override
        public List<ProblemKindSeverityList> getProblemKindSeverityList() {
            return _problemKindSeverityList;
        }
        
        @Override
        public StructureType getStructureType() {
            return _structureType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_numberOfTdmSegmentsToBeReserved);
            result = prime * result + Objects.hashCode(_problemKindSeverityList);
            result = prime * result + Objects.hashCode(_structureType);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration)obj;
            if (!Objects.equals(_numberOfTdmSegmentsToBeReserved, other.getNumberOfTdmSegmentsToBeReserved())) {
                return false;
            }
            if (!Objects.equals(_problemKindSeverityList, other.getProblemKindSeverityList())) {
                return false;
            }
            if (!Objects.equals(_structureType, other.getStructureType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HybridMwStructureConfigurationImpl otherImpl = (HybridMwStructureConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration>> e : augmentation.entrySet()) {
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
            java.lang.String name = "HybridMwStructureConfiguration [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_numberOfTdmSegmentsToBeReserved != null) {
                builder.append("_numberOfTdmSegmentsToBeReserved=");
                builder.append(_numberOfTdmSegmentsToBeReserved);
                builder.append(", ");
            }
            if (_problemKindSeverityList != null) {
                builder.append("_problemKindSeverityList=");
                builder.append(_problemKindSeverityList);
                builder.append(", ");
            }
            if (_structureType != null) {
                builder.append("_structureType=");
                builder.append(_structureType);
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
