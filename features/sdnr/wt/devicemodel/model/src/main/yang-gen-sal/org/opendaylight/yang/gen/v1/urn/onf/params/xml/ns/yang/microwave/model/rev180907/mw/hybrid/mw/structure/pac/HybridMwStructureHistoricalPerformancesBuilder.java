package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.hybrid.mw.structure.historical.performances.g.HistoricalPerformanceDataList;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances
 *
 */
public class HybridMwStructureHistoricalPerformancesBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances> {

    private List<HistoricalPerformanceDataList> _historicalPerformanceDataList;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>> augmentation = Collections.emptyMap();

    public HybridMwStructureHistoricalPerformancesBuilder() {
    }
    public HybridMwStructureHistoricalPerformancesBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureHistoricalPerformancesG arg) {
        this._historicalPerformanceDataList = arg.getHistoricalPerformanceDataList();
    }

    public HybridMwStructureHistoricalPerformancesBuilder(HybridMwStructureHistoricalPerformances base) {
        this._historicalPerformanceDataList = base.getHistoricalPerformanceDataList();
        if (base instanceof HybridMwStructureHistoricalPerformancesImpl) {
            HybridMwStructureHistoricalPerformancesImpl impl = (HybridMwStructureHistoricalPerformancesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureHistoricalPerformancesG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureHistoricalPerformancesG) {
            this._historicalPerformanceDataList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureHistoricalPerformancesG)arg).getHistoricalPerformanceDataList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureHistoricalPerformancesG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<HistoricalPerformanceDataList> getHistoricalPerformanceDataList() {
        return _historicalPerformanceDataList;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public HybridMwStructureHistoricalPerformancesBuilder setHistoricalPerformanceDataList(final List<HistoricalPerformanceDataList> value) {
        this._historicalPerformanceDataList = value;
        return this;
    }
    
    public HybridMwStructureHistoricalPerformancesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HybridMwStructureHistoricalPerformancesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HybridMwStructureHistoricalPerformances build() {
        return new HybridMwStructureHistoricalPerformancesImpl(this);
    }

    private static final class HybridMwStructureHistoricalPerformancesImpl implements HybridMwStructureHistoricalPerformances {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances.class;
        }

        private final List<HistoricalPerformanceDataList> _historicalPerformanceDataList;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>> augmentation = Collections.emptyMap();

        private HybridMwStructureHistoricalPerformancesImpl(HybridMwStructureHistoricalPerformancesBuilder base) {
            this._historicalPerformanceDataList = base.getHistoricalPerformanceDataList();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<HistoricalPerformanceDataList> getHistoricalPerformanceDataList() {
            return _historicalPerformanceDataList;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_historicalPerformanceDataList);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances)obj;
            if (!Objects.equals(_historicalPerformanceDataList, other.getHistoricalPerformanceDataList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HybridMwStructureHistoricalPerformancesImpl otherImpl = (HybridMwStructureHistoricalPerformancesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>> e : augmentation.entrySet()) {
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
            java.lang.String name = "HybridMwStructureHistoricalPerformances [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_historicalPerformanceDataList != null) {
                builder.append("_historicalPerformanceDataList=");
                builder.append(_historicalPerformanceDataList);
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
