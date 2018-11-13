package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performance.type.g.PerformanceData;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.GranularityPeriodType;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.ObjectIdentifier;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList
 *
 */
public class HistoricalPerformanceDataListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList> {

    private GranularityPeriodType _granularityPeriod;
    private java.lang.String _historyDataId;
    private HistoricalPerformanceDataListKey _key;
    private ObjectIdentifier _nameBinding;
    private ObjectIdentifier _objectClass;
    private PerformanceData _performanceData;
    private DateAndTime _periodEndTime;
    private java.lang.Boolean _suspectIntervalFlag;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>> augmentation = Collections.emptyMap();

    public HistoricalPerformanceDataListBuilder() {
    }
    public HistoricalPerformanceDataListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityHistoricalPerformanceTypeG arg) {
        this._performanceData = arg.getPerformanceData();
        this._suspectIntervalFlag = arg.isSuspectIntervalFlag();
        this._historyDataId = arg.getHistoryDataId();
        this._periodEndTime = arg.getPeriodEndTime();
        this._granularityPeriod = arg.getGranularityPeriod();
        this._objectClass = arg.getObjectClass();
        this._nameBinding = arg.getNameBinding();
    }
    public HistoricalPerformanceDataListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnHistoryDataG arg) {
        this._suspectIntervalFlag = arg.isSuspectIntervalFlag();
        this._historyDataId = arg.getHistoryDataId();
        this._periodEndTime = arg.getPeriodEndTime();
        this._granularityPeriod = arg.getGranularityPeriod();
        this._objectClass = arg.getObjectClass();
        this._nameBinding = arg.getNameBinding();
    }
    public HistoricalPerformanceDataListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.Q822HistoryDataG arg) {
        this._historyDataId = arg.getHistoryDataId();
        this._periodEndTime = arg.getPeriodEndTime();
        this._granularityPeriod = arg.getGranularityPeriod();
        this._objectClass = arg.getObjectClass();
        this._nameBinding = arg.getNameBinding();
    }
    public HistoricalPerformanceDataListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X721TopG arg) {
        this._objectClass = arg.getObjectClass();
        this._nameBinding = arg.getNameBinding();
    }

    public HistoricalPerformanceDataListBuilder(HistoricalPerformanceDataList base) {
        if (base.getKey() == null) {
            this._key = new HistoricalPerformanceDataListKey(
                base.getHistoryDataId()
            );
            this._historyDataId = base.getHistoryDataId();
        } else {
            this._key = base.getKey();
            this._historyDataId = _key.getHistoryDataId();
        }
        this._granularityPeriod = base.getGranularityPeriod();
        this._nameBinding = base.getNameBinding();
        this._objectClass = base.getObjectClass();
        this._performanceData = base.getPerformanceData();
        this._periodEndTime = base.getPeriodEndTime();
        this._suspectIntervalFlag = base.isSuspectIntervalFlag();
        if (base instanceof HistoricalPerformanceDataListImpl) {
            HistoricalPerformanceDataListImpl impl = (HistoricalPerformanceDataListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityHistoricalPerformanceTypeG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.Q822HistoryDataG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnHistoryDataG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X721TopG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityHistoricalPerformanceTypeG) {
            this._performanceData = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityHistoricalPerformanceTypeG)arg).getPerformanceData();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.Q822HistoryDataG) {
            this._historyDataId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.Q822HistoryDataG)arg).getHistoryDataId();
            this._periodEndTime = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.Q822HistoryDataG)arg).getPeriodEndTime();
            this._granularityPeriod = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.Q822HistoryDataG)arg).getGranularityPeriod();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnHistoryDataG) {
            this._suspectIntervalFlag = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnHistoryDataG)arg).isSuspectIntervalFlag();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X721TopG) {
            this._objectClass = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X721TopG)arg).getObjectClass();
            this._nameBinding = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X721TopG)arg).getNameBinding();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityHistoricalPerformanceTypeG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.Q822HistoryDataG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnHistoryDataG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X721TopG] \n" +
              "but was: " + arg
            );
        }
    }

    public GranularityPeriodType getGranularityPeriod() {
        return _granularityPeriod;
    }
    
    public java.lang.String getHistoryDataId() {
        return _historyDataId;
    }
    
    public HistoricalPerformanceDataListKey getKey() {
        return _key;
    }
    
    public ObjectIdentifier getNameBinding() {
        return _nameBinding;
    }
    
    public ObjectIdentifier getObjectClass() {
        return _objectClass;
    }
    
    public PerformanceData getPerformanceData() {
        return _performanceData;
    }
    
    public DateAndTime getPeriodEndTime() {
        return _periodEndTime;
    }
    
    public java.lang.Boolean isSuspectIntervalFlag() {
        return _suspectIntervalFlag;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public HistoricalPerformanceDataListBuilder setGranularityPeriod(final GranularityPeriodType value) {
        this._granularityPeriod = value;
        return this;
    }
    
     
    public HistoricalPerformanceDataListBuilder setHistoryDataId(final java.lang.String value) {
        this._historyDataId = value;
        return this;
    }
    
     
    public HistoricalPerformanceDataListBuilder setKey(final HistoricalPerformanceDataListKey value) {
        this._key = value;
        return this;
    }
    
     
    public HistoricalPerformanceDataListBuilder setNameBinding(final ObjectIdentifier value) {
        this._nameBinding = value;
        return this;
    }
    
     
    public HistoricalPerformanceDataListBuilder setObjectClass(final ObjectIdentifier value) {
        this._objectClass = value;
        return this;
    }
    
     
    public HistoricalPerformanceDataListBuilder setPerformanceData(final PerformanceData value) {
        this._performanceData = value;
        return this;
    }
    
     
    public HistoricalPerformanceDataListBuilder setPeriodEndTime(final DateAndTime value) {
        this._periodEndTime = value;
        return this;
    }
    
     
    public HistoricalPerformanceDataListBuilder setSuspectIntervalFlag(final java.lang.Boolean value) {
        this._suspectIntervalFlag = value;
        return this;
    }
    
    public HistoricalPerformanceDataListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HistoricalPerformanceDataListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HistoricalPerformanceDataList build() {
        return new HistoricalPerformanceDataListImpl(this);
    }

    private static final class HistoricalPerformanceDataListImpl implements HistoricalPerformanceDataList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList.class;
        }

        private final GranularityPeriodType _granularityPeriod;
        private final java.lang.String _historyDataId;
        private final HistoricalPerformanceDataListKey _key;
        private final ObjectIdentifier _nameBinding;
        private final ObjectIdentifier _objectClass;
        private final PerformanceData _performanceData;
        private final DateAndTime _periodEndTime;
        private final java.lang.Boolean _suspectIntervalFlag;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>> augmentation = Collections.emptyMap();

        private HistoricalPerformanceDataListImpl(HistoricalPerformanceDataListBuilder base) {
            if (base.getKey() == null) {
                this._key = new HistoricalPerformanceDataListKey(
                    base.getHistoryDataId()
                );
                this._historyDataId = base.getHistoryDataId();
            } else {
                this._key = base.getKey();
                this._historyDataId = _key.getHistoryDataId();
            }
            this._granularityPeriod = base.getGranularityPeriod();
            this._nameBinding = base.getNameBinding();
            this._objectClass = base.getObjectClass();
            this._performanceData = base.getPerformanceData();
            this._periodEndTime = base.getPeriodEndTime();
            this._suspectIntervalFlag = base.isSuspectIntervalFlag();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public GranularityPeriodType getGranularityPeriod() {
            return _granularityPeriod;
        }
        
        @Override
        public java.lang.String getHistoryDataId() {
            return _historyDataId;
        }
        
        @Override
        public HistoricalPerformanceDataListKey getKey() {
            return _key;
        }
        
        @Override
        public ObjectIdentifier getNameBinding() {
            return _nameBinding;
        }
        
        @Override
        public ObjectIdentifier getObjectClass() {
            return _objectClass;
        }
        
        @Override
        public PerformanceData getPerformanceData() {
            return _performanceData;
        }
        
        @Override
        public DateAndTime getPeriodEndTime() {
            return _periodEndTime;
        }
        
        @Override
        public java.lang.Boolean isSuspectIntervalFlag() {
            return _suspectIntervalFlag;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_granularityPeriod);
            result = prime * result + Objects.hashCode(_historyDataId);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_nameBinding);
            result = prime * result + Objects.hashCode(_objectClass);
            result = prime * result + Objects.hashCode(_performanceData);
            result = prime * result + Objects.hashCode(_periodEndTime);
            result = prime * result + Objects.hashCode(_suspectIntervalFlag);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList)obj;
            if (!Objects.equals(_granularityPeriod, other.getGranularityPeriod())) {
                return false;
            }
            if (!Objects.equals(_historyDataId, other.getHistoryDataId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_nameBinding, other.getNameBinding())) {
                return false;
            }
            if (!Objects.equals(_objectClass, other.getObjectClass())) {
                return false;
            }
            if (!Objects.equals(_performanceData, other.getPerformanceData())) {
                return false;
            }
            if (!Objects.equals(_periodEndTime, other.getPeriodEndTime())) {
                return false;
            }
            if (!Objects.equals(_suspectIntervalFlag, other.isSuspectIntervalFlag())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HistoricalPerformanceDataListImpl otherImpl = (HistoricalPerformanceDataListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "HistoricalPerformanceDataList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_granularityPeriod != null) {
                builder.append("_granularityPeriod=");
                builder.append(_granularityPeriod);
                builder.append(", ");
            }
            if (_historyDataId != null) {
                builder.append("_historyDataId=");
                builder.append(_historyDataId);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_nameBinding != null) {
                builder.append("_nameBinding=");
                builder.append(_nameBinding);
                builder.append(", ");
            }
            if (_objectClass != null) {
                builder.append("_objectClass=");
                builder.append(_objectClass);
                builder.append(", ");
            }
            if (_performanceData != null) {
                builder.append("_performanceData=");
                builder.append(_performanceData);
                builder.append(", ");
            }
            if (_periodEndTime != null) {
                builder.append("_periodEndTime=");
                builder.append(_periodEndTime);
                builder.append(", ");
            }
            if (_suspectIntervalFlag != null) {
                builder.append("_suspectIntervalFlag=");
                builder.append(_suspectIntervalFlag);
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
