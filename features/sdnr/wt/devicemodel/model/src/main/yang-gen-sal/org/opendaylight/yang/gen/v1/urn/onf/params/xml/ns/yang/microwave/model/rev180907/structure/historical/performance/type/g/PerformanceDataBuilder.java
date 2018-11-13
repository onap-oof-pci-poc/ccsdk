package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData
 *
 */
public class PerformanceDataBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData> {

    private java.lang.Integer _cses;
    private java.lang.Integer _es;
    private java.lang.Byte _rxLevelAvg;
    private java.lang.Byte _rxLevelMax;
    private java.lang.Byte _rxLevelMin;
    private java.lang.Integer _ses;
    private java.lang.Integer _timePeriod;
    private java.lang.Integer _unavailability;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>> augmentation = Collections.emptyMap();

    public PerformanceDataBuilder() {
    }
    public PerformanceDataBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructurePerformanceTypeG arg) {
        this._timePeriod = arg.getTimePeriod();
        this._es = arg.getEs();
        this._ses = arg.getSes();
        this._cses = arg.getCses();
        this._unavailability = arg.getUnavailability();
        this._rxLevelMin = arg.getRxLevelMin();
        this._rxLevelMax = arg.getRxLevelMax();
        this._rxLevelAvg = arg.getRxLevelAvg();
    }

    public PerformanceDataBuilder(PerformanceData base) {
        this._cses = base.getCses();
        this._es = base.getEs();
        this._rxLevelAvg = base.getRxLevelAvg();
        this._rxLevelMax = base.getRxLevelMax();
        this._rxLevelMin = base.getRxLevelMin();
        this._ses = base.getSes();
        this._timePeriod = base.getTimePeriod();
        this._unavailability = base.getUnavailability();
        if (base instanceof PerformanceDataImpl) {
            PerformanceDataImpl impl = (PerformanceDataImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructurePerformanceTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructurePerformanceTypeG) {
            this._timePeriod = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructurePerformanceTypeG)arg).getTimePeriod();
            this._es = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructurePerformanceTypeG)arg).getEs();
            this._ses = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructurePerformanceTypeG)arg).getSes();
            this._cses = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructurePerformanceTypeG)arg).getCses();
            this._unavailability = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructurePerformanceTypeG)arg).getUnavailability();
            this._rxLevelMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructurePerformanceTypeG)arg).getRxLevelMin();
            this._rxLevelMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructurePerformanceTypeG)arg).getRxLevelMax();
            this._rxLevelAvg = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructurePerformanceTypeG)arg).getRxLevelAvg();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructurePerformanceTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getCses() {
        return _cses;
    }
    
    public java.lang.Integer getEs() {
        return _es;
    }
    
    public java.lang.Byte getRxLevelAvg() {
        return _rxLevelAvg;
    }
    
    public java.lang.Byte getRxLevelMax() {
        return _rxLevelMax;
    }
    
    public java.lang.Byte getRxLevelMin() {
        return _rxLevelMin;
    }
    
    public java.lang.Integer getSes() {
        return _ses;
    }
    
    public java.lang.Integer getTimePeriod() {
        return _timePeriod;
    }
    
    public java.lang.Integer getUnavailability() {
        return _unavailability;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PerformanceDataBuilder setCses(final java.lang.Integer value) {
        this._cses = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setEs(final java.lang.Integer value) {
        this._es = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setRxLevelAvg(final java.lang.Byte value) {
        this._rxLevelAvg = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setRxLevelMax(final java.lang.Byte value) {
        this._rxLevelMax = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setRxLevelMin(final java.lang.Byte value) {
        this._rxLevelMin = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setSes(final java.lang.Integer value) {
        this._ses = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTimePeriod(final java.lang.Integer value) {
        this._timePeriod = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setUnavailability(final java.lang.Integer value) {
        this._unavailability = value;
        return this;
    }
    
    public PerformanceDataBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PerformanceDataBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PerformanceData build() {
        return new PerformanceDataImpl(this);
    }

    private static final class PerformanceDataImpl implements PerformanceData {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData.class;
        }

        private final java.lang.Integer _cses;
        private final java.lang.Integer _es;
        private final java.lang.Byte _rxLevelAvg;
        private final java.lang.Byte _rxLevelMax;
        private final java.lang.Byte _rxLevelMin;
        private final java.lang.Integer _ses;
        private final java.lang.Integer _timePeriod;
        private final java.lang.Integer _unavailability;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>> augmentation = Collections.emptyMap();

        private PerformanceDataImpl(PerformanceDataBuilder base) {
            this._cses = base.getCses();
            this._es = base.getEs();
            this._rxLevelAvg = base.getRxLevelAvg();
            this._rxLevelMax = base.getRxLevelMax();
            this._rxLevelMin = base.getRxLevelMin();
            this._ses = base.getSes();
            this._timePeriod = base.getTimePeriod();
            this._unavailability = base.getUnavailability();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getCses() {
            return _cses;
        }
        
        @Override
        public java.lang.Integer getEs() {
            return _es;
        }
        
        @Override
        public java.lang.Byte getRxLevelAvg() {
            return _rxLevelAvg;
        }
        
        @Override
        public java.lang.Byte getRxLevelMax() {
            return _rxLevelMax;
        }
        
        @Override
        public java.lang.Byte getRxLevelMin() {
            return _rxLevelMin;
        }
        
        @Override
        public java.lang.Integer getSes() {
            return _ses;
        }
        
        @Override
        public java.lang.Integer getTimePeriod() {
            return _timePeriod;
        }
        
        @Override
        public java.lang.Integer getUnavailability() {
            return _unavailability;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cses);
            result = prime * result + Objects.hashCode(_es);
            result = prime * result + Objects.hashCode(_rxLevelAvg);
            result = prime * result + Objects.hashCode(_rxLevelMax);
            result = prime * result + Objects.hashCode(_rxLevelMin);
            result = prime * result + Objects.hashCode(_ses);
            result = prime * result + Objects.hashCode(_timePeriod);
            result = prime * result + Objects.hashCode(_unavailability);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData)obj;
            if (!Objects.equals(_cses, other.getCses())) {
                return false;
            }
            if (!Objects.equals(_es, other.getEs())) {
                return false;
            }
            if (!Objects.equals(_rxLevelAvg, other.getRxLevelAvg())) {
                return false;
            }
            if (!Objects.equals(_rxLevelMax, other.getRxLevelMax())) {
                return false;
            }
            if (!Objects.equals(_rxLevelMin, other.getRxLevelMin())) {
                return false;
            }
            if (!Objects.equals(_ses, other.getSes())) {
                return false;
            }
            if (!Objects.equals(_timePeriod, other.getTimePeriod())) {
                return false;
            }
            if (!Objects.equals(_unavailability, other.getUnavailability())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PerformanceDataImpl otherImpl = (PerformanceDataImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.historical.performance.type.g.PerformanceData>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PerformanceData [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cses != null) {
                builder.append("_cses=");
                builder.append(_cses);
                builder.append(", ");
            }
            if (_es != null) {
                builder.append("_es=");
                builder.append(_es);
                builder.append(", ");
            }
            if (_rxLevelAvg != null) {
                builder.append("_rxLevelAvg=");
                builder.append(_rxLevelAvg);
                builder.append(", ");
            }
            if (_rxLevelMax != null) {
                builder.append("_rxLevelMax=");
                builder.append(_rxLevelMax);
                builder.append(", ");
            }
            if (_rxLevelMin != null) {
                builder.append("_rxLevelMin=");
                builder.append(_rxLevelMin);
                builder.append(", ");
            }
            if (_ses != null) {
                builder.append("_ses=");
                builder.append(_ses);
                builder.append(", ");
            }
            if (_timePeriod != null) {
                builder.append("_timePeriod=");
                builder.append(_timePeriod);
                builder.append(", ");
            }
            if (_unavailability != null) {
                builder.append("_unavailability=");
                builder.append(_unavailability);
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
