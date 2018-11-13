package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData
 *
 */
public class PerformanceDataBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData> {

    private java.lang.Byte _snirAvg;
    private java.lang.Byte _snirMax;
    private java.lang.Byte _snirMin;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>> augmentation = Collections.emptyMap();

    public PerformanceDataBuilder() {
    }
    public PerformanceDataBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceDiversityPerformanceTypeG arg) {
        this._snirMin = arg.getSnirMin();
        this._snirMax = arg.getSnirMax();
        this._snirAvg = arg.getSnirAvg();
    }

    public PerformanceDataBuilder(PerformanceData base) {
        this._snirAvg = base.getSnirAvg();
        this._snirMax = base.getSnirMax();
        this._snirMin = base.getSnirMin();
        if (base instanceof PerformanceDataImpl) {
            PerformanceDataImpl impl = (PerformanceDataImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceDiversityPerformanceTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceDiversityPerformanceTypeG) {
            this._snirMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceDiversityPerformanceTypeG)arg).getSnirMin();
            this._snirMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceDiversityPerformanceTypeG)arg).getSnirMax();
            this._snirAvg = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceDiversityPerformanceTypeG)arg).getSnirAvg();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceDiversityPerformanceTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Byte getSnirAvg() {
        return _snirAvg;
    }
    
    public java.lang.Byte getSnirMax() {
        return _snirMax;
    }
    
    public java.lang.Byte getSnirMin() {
        return _snirMin;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PerformanceDataBuilder setSnirAvg(final java.lang.Byte value) {
        this._snirAvg = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setSnirMax(final java.lang.Byte value) {
        this._snirMax = value;
        return this;
    }
    
     
    public PerformanceDataBuilder setSnirMin(final java.lang.Byte value) {
        this._snirMin = value;
        return this;
    }
    
    public PerformanceDataBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PerformanceDataBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>> augmentationType) {
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
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData.class;
        }

        private final java.lang.Byte _snirAvg;
        private final java.lang.Byte _snirMax;
        private final java.lang.Byte _snirMin;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>> augmentation = Collections.emptyMap();

        private PerformanceDataImpl(PerformanceDataBuilder base) {
            this._snirAvg = base.getSnirAvg();
            this._snirMax = base.getSnirMax();
            this._snirMin = base.getSnirMin();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Byte getSnirAvg() {
            return _snirAvg;
        }
        
        @Override
        public java.lang.Byte getSnirMax() {
            return _snirMax;
        }
        
        @Override
        public java.lang.Byte getSnirMin() {
            return _snirMin;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_snirAvg);
            result = prime * result + Objects.hashCode(_snirMax);
            result = prime * result + Objects.hashCode(_snirMin);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData)obj;
            if (!Objects.equals(_snirAvg, other.getSnirAvg())) {
                return false;
            }
            if (!Objects.equals(_snirMax, other.getSnirMax())) {
                return false;
            }
            if (!Objects.equals(_snirMin, other.getSnirMin())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.historical.performance.type.g.PerformanceData>> e : augmentation.entrySet()) {
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
            if (_snirAvg != null) {
                builder.append("_snirAvg=");
                builder.append(_snirAvg);
                builder.append(", ");
            }
            if (_snirMax != null) {
                builder.append("_snirMax=");
                builder.append(_snirMax);
                builder.append(", ");
            }
            if (_snirMin != null) {
                builder.append("_snirMin=");
                builder.append(_snirMin);
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
