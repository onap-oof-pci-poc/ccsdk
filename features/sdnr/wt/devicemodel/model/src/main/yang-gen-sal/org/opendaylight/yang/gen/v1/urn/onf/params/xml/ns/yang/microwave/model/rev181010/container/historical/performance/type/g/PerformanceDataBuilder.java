package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData
 *
 */
public class PerformanceDataBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData> {

    private java.lang.Integer _timePeriod;
    private java.lang.Long _txEthernetBytesMaxM;
    private java.lang.Integer _txEthernetBytesMaxS;
    private java.lang.Long _txEthernetBytesSum;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>> augmentation = Collections.emptyMap();

    public PerformanceDataBuilder() {
    }
    public PerformanceDataBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ContainerPerformanceTypeG arg) {
        this._txEthernetBytesMaxS = arg.getTxEthernetBytesMaxS();
        this._txEthernetBytesMaxM = arg.getTxEthernetBytesMaxM();
        this._txEthernetBytesSum = arg.getTxEthernetBytesSum();
        this._timePeriod = arg.getTimePeriod();
    }

    public PerformanceDataBuilder(PerformanceData base) {
        this._timePeriod = base.getTimePeriod();
        this._txEthernetBytesMaxM = base.getTxEthernetBytesMaxM();
        this._txEthernetBytesMaxS = base.getTxEthernetBytesMaxS();
        this._txEthernetBytesSum = base.getTxEthernetBytesSum();
        if (base instanceof PerformanceDataImpl) {
            PerformanceDataImpl impl = (PerformanceDataImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ContainerPerformanceTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ContainerPerformanceTypeG) {
            this._txEthernetBytesMaxS = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ContainerPerformanceTypeG)arg).getTxEthernetBytesMaxS();
            this._txEthernetBytesMaxM = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ContainerPerformanceTypeG)arg).getTxEthernetBytesMaxM();
            this._txEthernetBytesSum = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ContainerPerformanceTypeG)arg).getTxEthernetBytesSum();
            this._timePeriod = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ContainerPerformanceTypeG)arg).getTimePeriod();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ContainerPerformanceTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getTimePeriod() {
        return _timePeriod;
    }
    
    public java.lang.Long getTxEthernetBytesMaxM() {
        return _txEthernetBytesMaxM;
    }
    
    public java.lang.Integer getTxEthernetBytesMaxS() {
        return _txEthernetBytesMaxS;
    }
    
    public java.lang.Long getTxEthernetBytesSum() {
        return _txEthernetBytesSum;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PerformanceDataBuilder setTimePeriod(final java.lang.Integer value) {
        this._timePeriod = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTxEthernetBytesMaxM(final java.lang.Long value) {
        this._txEthernetBytesMaxM = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTxEthernetBytesMaxS(final java.lang.Integer value) {
        this._txEthernetBytesMaxS = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setTxEthernetBytesSum(final java.lang.Long value) {
        this._txEthernetBytesSum = value;
        return this;
    }
    
    public PerformanceDataBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PerformanceDataBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>> augmentationType) {
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
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData.class;
        }

        private final java.lang.Integer _timePeriod;
        private final java.lang.Long _txEthernetBytesMaxM;
        private final java.lang.Integer _txEthernetBytesMaxS;
        private final java.lang.Long _txEthernetBytesSum;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>> augmentation = Collections.emptyMap();

        private PerformanceDataImpl(PerformanceDataBuilder base) {
            this._timePeriod = base.getTimePeriod();
            this._txEthernetBytesMaxM = base.getTxEthernetBytesMaxM();
            this._txEthernetBytesMaxS = base.getTxEthernetBytesMaxS();
            this._txEthernetBytesSum = base.getTxEthernetBytesSum();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getTimePeriod() {
            return _timePeriod;
        }
        
        @Override
        public java.lang.Long getTxEthernetBytesMaxM() {
            return _txEthernetBytesMaxM;
        }
        
        @Override
        public java.lang.Integer getTxEthernetBytesMaxS() {
            return _txEthernetBytesMaxS;
        }
        
        @Override
        public java.lang.Long getTxEthernetBytesSum() {
            return _txEthernetBytesSum;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_timePeriod);
            result = prime * result + Objects.hashCode(_txEthernetBytesMaxM);
            result = prime * result + Objects.hashCode(_txEthernetBytesMaxS);
            result = prime * result + Objects.hashCode(_txEthernetBytesSum);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData)obj;
            if (!Objects.equals(_timePeriod, other.getTimePeriod())) {
                return false;
            }
            if (!Objects.equals(_txEthernetBytesMaxM, other.getTxEthernetBytesMaxM())) {
                return false;
            }
            if (!Objects.equals(_txEthernetBytesMaxS, other.getTxEthernetBytesMaxS())) {
                return false;
            }
            if (!Objects.equals(_txEthernetBytesSum, other.getTxEthernetBytesSum())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.container.historical.performance.type.g.PerformanceData>> e : augmentation.entrySet()) {
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
            if (_timePeriod != null) {
                builder.append("_timePeriod=");
                builder.append(_timePeriod);
                builder.append(", ");
            }
            if (_txEthernetBytesMaxM != null) {
                builder.append("_txEthernetBytesMaxM=");
                builder.append(_txEthernetBytesMaxM);
                builder.append(", ");
            }
            if (_txEthernetBytesMaxS != null) {
                builder.append("_txEthernetBytesMaxS=");
                builder.append(_txEthernetBytesMaxS);
                builder.append(", ");
            }
            if (_txEthernetBytesSum != null) {
                builder.append("_txEthernetBytesSum=");
                builder.append(_txEthernetBytesSum);
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
