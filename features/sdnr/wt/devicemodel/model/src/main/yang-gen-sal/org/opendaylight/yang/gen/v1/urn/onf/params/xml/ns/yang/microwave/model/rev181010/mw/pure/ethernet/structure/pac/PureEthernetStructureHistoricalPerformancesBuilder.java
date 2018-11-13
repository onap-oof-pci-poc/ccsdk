package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.pure.ethernet.structure.historical.performances.g.HistoricalPerformanceDataList;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances
 *
 */
public class PureEthernetStructureHistoricalPerformancesBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances> {

    private List<HistoricalPerformanceDataList> _historicalPerformanceDataList;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>> augmentation = Collections.emptyMap();

    public PureEthernetStructureHistoricalPerformancesBuilder() {
    }
    public PureEthernetStructureHistoricalPerformancesBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.PureEthernetStructureHistoricalPerformancesG arg) {
        this._historicalPerformanceDataList = arg.getHistoricalPerformanceDataList();
    }

    public PureEthernetStructureHistoricalPerformancesBuilder(PureEthernetStructureHistoricalPerformances base) {
        this._historicalPerformanceDataList = base.getHistoricalPerformanceDataList();
        if (base instanceof PureEthernetStructureHistoricalPerformancesImpl) {
            PureEthernetStructureHistoricalPerformancesImpl impl = (PureEthernetStructureHistoricalPerformancesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.PureEthernetStructureHistoricalPerformancesG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.PureEthernetStructureHistoricalPerformancesG) {
            this._historicalPerformanceDataList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.PureEthernetStructureHistoricalPerformancesG)arg).getHistoricalPerformanceDataList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.PureEthernetStructureHistoricalPerformancesG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<HistoricalPerformanceDataList> getHistoricalPerformanceDataList() {
        return _historicalPerformanceDataList;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PureEthernetStructureHistoricalPerformancesBuilder setHistoricalPerformanceDataList(final List<HistoricalPerformanceDataList> value) {
        this._historicalPerformanceDataList = value;
        return this;
    }
    
    public PureEthernetStructureHistoricalPerformancesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PureEthernetStructureHistoricalPerformancesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PureEthernetStructureHistoricalPerformances build() {
        return new PureEthernetStructureHistoricalPerformancesImpl(this);
    }

    private static final class PureEthernetStructureHistoricalPerformancesImpl implements PureEthernetStructureHistoricalPerformances {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances.class;
        }

        private final List<HistoricalPerformanceDataList> _historicalPerformanceDataList;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>> augmentation = Collections.emptyMap();

        private PureEthernetStructureHistoricalPerformancesImpl(PureEthernetStructureHistoricalPerformancesBuilder base) {
            this._historicalPerformanceDataList = base.getHistoricalPerformanceDataList();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>>singletonMap(e.getKey(), e.getValue());
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances)obj;
            if (!Objects.equals(_historicalPerformanceDataList, other.getHistoricalPerformanceDataList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PureEthernetStructureHistoricalPerformancesImpl otherImpl = (PureEthernetStructureHistoricalPerformancesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PureEthernetStructureHistoricalPerformances [";
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
