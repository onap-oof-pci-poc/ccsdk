package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.StructurePerformanceType;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeState;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.DateAndTime;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.GranularityPeriodType;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.ObjectIdentifier;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList
 *
 */
public class CurrentPerformanceDataListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList> {

    private AdministrativeState _administrativeState;
    private java.lang.Long _elapsedTime;
    private GranularityPeriodType _granularityPeriod;
    private CurrentPerformanceDataListKey _key;
    private ObjectIdentifier _nameBinding;
    private ObjectIdentifier _objectClass;
    private StructurePerformanceType _performanceData;
    private java.lang.String _scannerId;
    private DateAndTime _timestamp;
    private java.lang.Boolean _suspectIntervalFlag;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>> augmentation = Collections.emptyMap();

    public CurrentPerformanceDataListBuilder() {
    }
    public CurrentPerformanceDataListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.StructureCurrentPerformanceTypeG arg) {
        this._performanceData = arg.getPerformanceData();
        this._timestamp = arg.getTimestamp();
        this._suspectIntervalFlag = arg.isSuspectIntervalFlag();
        this._elapsedTime = arg.getElapsedTime();
        this._scannerId = arg.getScannerId();
        this._granularityPeriod = arg.getGranularityPeriod();
        this._administrativeState = arg.getAdministrativeState();
        this._objectClass = arg.getObjectClass();
        this._nameBinding = arg.getNameBinding();
    }
    public CurrentPerformanceDataListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnCurrentDataG arg) {
        this._timestamp = arg.getTimestamp();
        this._suspectIntervalFlag = arg.isSuspectIntervalFlag();
        this._elapsedTime = arg.getElapsedTime();
        this._scannerId = arg.getScannerId();
        this._granularityPeriod = arg.getGranularityPeriod();
        this._administrativeState = arg.getAdministrativeState();
        this._objectClass = arg.getObjectClass();
        this._nameBinding = arg.getNameBinding();
    }
    public CurrentPerformanceDataListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.Q822CurrentDataG arg) {
        this._suspectIntervalFlag = arg.isSuspectIntervalFlag();
        this._elapsedTime = arg.getElapsedTime();
        this._scannerId = arg.getScannerId();
        this._granularityPeriod = arg.getGranularityPeriod();
        this._administrativeState = arg.getAdministrativeState();
        this._objectClass = arg.getObjectClass();
        this._nameBinding = arg.getNameBinding();
    }
    public CurrentPerformanceDataListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X739ScannerG arg) {
        this._scannerId = arg.getScannerId();
        this._granularityPeriod = arg.getGranularityPeriod();
        this._administrativeState = arg.getAdministrativeState();
        this._objectClass = arg.getObjectClass();
        this._nameBinding = arg.getNameBinding();
    }
    public CurrentPerformanceDataListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X721TopG arg) {
        this._objectClass = arg.getObjectClass();
        this._nameBinding = arg.getNameBinding();
    }

    public CurrentPerformanceDataListBuilder(CurrentPerformanceDataList base) {
        if (base.getKey() == null) {
            this._key = new CurrentPerformanceDataListKey(
                base.getScannerId()
            );
            this._scannerId = base.getScannerId();
        } else {
            this._key = base.getKey();
            this._scannerId = _key.getScannerId();
        }
        this._administrativeState = base.getAdministrativeState();
        this._elapsedTime = base.getElapsedTime();
        this._granularityPeriod = base.getGranularityPeriod();
        this._nameBinding = base.getNameBinding();
        this._objectClass = base.getObjectClass();
        this._performanceData = base.getPerformanceData();
        this._timestamp = base.getTimestamp();
        this._suspectIntervalFlag = base.isSuspectIntervalFlag();
        if (base instanceof CurrentPerformanceDataListImpl) {
            CurrentPerformanceDataListImpl impl = (CurrentPerformanceDataListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.StructureCurrentPerformanceTypeG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.Q822CurrentDataG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X739ScannerG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X721TopG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnCurrentDataG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.StructureCurrentPerformanceTypeG) {
            this._performanceData = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.StructureCurrentPerformanceTypeG)arg).getPerformanceData();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.Q822CurrentDataG) {
            this._suspectIntervalFlag = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.Q822CurrentDataG)arg).isSuspectIntervalFlag();
            this._elapsedTime = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.Q822CurrentDataG)arg).getElapsedTime();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X739ScannerG) {
            this._scannerId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X739ScannerG)arg).getScannerId();
            this._granularityPeriod = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X739ScannerG)arg).getGranularityPeriod();
            this._administrativeState = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X739ScannerG)arg).getAdministrativeState();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X721TopG) {
            this._objectClass = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X721TopG)arg).getObjectClass();
            this._nameBinding = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X721TopG)arg).getNameBinding();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnCurrentDataG) {
            this._timestamp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnCurrentDataG)arg).getTimestamp();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.StructureCurrentPerformanceTypeG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.Q822CurrentDataG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X739ScannerG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.X721TopG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnCurrentDataG] \n" +
              "but was: " + arg
            );
        }
    }

    public AdministrativeState getAdministrativeState() {
        return _administrativeState;
    }
    
    public java.lang.Long getElapsedTime() {
        return _elapsedTime;
    }
    
    public GranularityPeriodType getGranularityPeriod() {
        return _granularityPeriod;
    }
    
    public CurrentPerformanceDataListKey getKey() {
        return _key;
    }
    
    public ObjectIdentifier getNameBinding() {
        return _nameBinding;
    }
    
    public ObjectIdentifier getObjectClass() {
        return _objectClass;
    }
    
    public StructurePerformanceType getPerformanceData() {
        return _performanceData;
    }
    
    public java.lang.String getScannerId() {
        return _scannerId;
    }
    
    public DateAndTime getTimestamp() {
        return _timestamp;
    }
    
    public java.lang.Boolean isSuspectIntervalFlag() {
        return _suspectIntervalFlag;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CurrentPerformanceDataListBuilder setAdministrativeState(final AdministrativeState value) {
        this._administrativeState = value;
        return this;
    }
    
     
    public CurrentPerformanceDataListBuilder setElapsedTime(final java.lang.Long value) {
        this._elapsedTime = value;
        return this;
    }
    
     
    public CurrentPerformanceDataListBuilder setGranularityPeriod(final GranularityPeriodType value) {
        this._granularityPeriod = value;
        return this;
    }
    
     
    public CurrentPerformanceDataListBuilder setKey(final CurrentPerformanceDataListKey value) {
        this._key = value;
        return this;
    }
    
     
    public CurrentPerformanceDataListBuilder setNameBinding(final ObjectIdentifier value) {
        this._nameBinding = value;
        return this;
    }
    
     
    public CurrentPerformanceDataListBuilder setObjectClass(final ObjectIdentifier value) {
        this._objectClass = value;
        return this;
    }
    
     
    public CurrentPerformanceDataListBuilder setPerformanceData(final StructurePerformanceType value) {
        this._performanceData = value;
        return this;
    }
    
     
    public CurrentPerformanceDataListBuilder setScannerId(final java.lang.String value) {
        this._scannerId = value;
        return this;
    }
    
     
    public CurrentPerformanceDataListBuilder setTimestamp(final DateAndTime value) {
        this._timestamp = value;
        return this;
    }
    
     
    public CurrentPerformanceDataListBuilder setSuspectIntervalFlag(final java.lang.Boolean value) {
        this._suspectIntervalFlag = value;
        return this;
    }
    
    public CurrentPerformanceDataListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CurrentPerformanceDataListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CurrentPerformanceDataList build() {
        return new CurrentPerformanceDataListImpl(this);
    }

    private static final class CurrentPerformanceDataListImpl implements CurrentPerformanceDataList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList.class;
        }

        private final AdministrativeState _administrativeState;
        private final java.lang.Long _elapsedTime;
        private final GranularityPeriodType _granularityPeriod;
        private final CurrentPerformanceDataListKey _key;
        private final ObjectIdentifier _nameBinding;
        private final ObjectIdentifier _objectClass;
        private final StructurePerformanceType _performanceData;
        private final java.lang.String _scannerId;
        private final DateAndTime _timestamp;
        private final java.lang.Boolean _suspectIntervalFlag;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>> augmentation = Collections.emptyMap();

        private CurrentPerformanceDataListImpl(CurrentPerformanceDataListBuilder base) {
            if (base.getKey() == null) {
                this._key = new CurrentPerformanceDataListKey(
                    base.getScannerId()
                );
                this._scannerId = base.getScannerId();
            } else {
                this._key = base.getKey();
                this._scannerId = _key.getScannerId();
            }
            this._administrativeState = base.getAdministrativeState();
            this._elapsedTime = base.getElapsedTime();
            this._granularityPeriod = base.getGranularityPeriod();
            this._nameBinding = base.getNameBinding();
            this._objectClass = base.getObjectClass();
            this._performanceData = base.getPerformanceData();
            this._timestamp = base.getTimestamp();
            this._suspectIntervalFlag = base.isSuspectIntervalFlag();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AdministrativeState getAdministrativeState() {
            return _administrativeState;
        }
        
        @Override
        public java.lang.Long getElapsedTime() {
            return _elapsedTime;
        }
        
        @Override
        public GranularityPeriodType getGranularityPeriod() {
            return _granularityPeriod;
        }
        
        @Override
        public CurrentPerformanceDataListKey getKey() {
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
        public StructurePerformanceType getPerformanceData() {
            return _performanceData;
        }
        
        @Override
        public java.lang.String getScannerId() {
            return _scannerId;
        }
        
        @Override
        public DateAndTime getTimestamp() {
            return _timestamp;
        }
        
        @Override
        public java.lang.Boolean isSuspectIntervalFlag() {
            return _suspectIntervalFlag;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_administrativeState);
            result = prime * result + Objects.hashCode(_elapsedTime);
            result = prime * result + Objects.hashCode(_granularityPeriod);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_nameBinding);
            result = prime * result + Objects.hashCode(_objectClass);
            result = prime * result + Objects.hashCode(_performanceData);
            result = prime * result + Objects.hashCode(_scannerId);
            result = prime * result + Objects.hashCode(_timestamp);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList)obj;
            if (!Objects.equals(_administrativeState, other.getAdministrativeState())) {
                return false;
            }
            if (!Objects.equals(_elapsedTime, other.getElapsedTime())) {
                return false;
            }
            if (!Objects.equals(_granularityPeriod, other.getGranularityPeriod())) {
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
            if (!Objects.equals(_scannerId, other.getScannerId())) {
                return false;
            }
            if (!Objects.equals(_timestamp, other.getTimestamp())) {
                return false;
            }
            if (!Objects.equals(_suspectIntervalFlag, other.isSuspectIntervalFlag())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CurrentPerformanceDataListImpl otherImpl = (CurrentPerformanceDataListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.current.performance.g.CurrentPerformanceDataList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "CurrentPerformanceDataList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_administrativeState != null) {
                builder.append("_administrativeState=");
                builder.append(_administrativeState);
                builder.append(", ");
            }
            if (_elapsedTime != null) {
                builder.append("_elapsedTime=");
                builder.append(_elapsedTime);
                builder.append(", ");
            }
            if (_granularityPeriod != null) {
                builder.append("_granularityPeriod=");
                builder.append(_granularityPeriod);
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
            if (_scannerId != null) {
                builder.append("_scannerId=");
                builder.append(_scannerId);
                builder.append(", ");
            }
            if (_timestamp != null) {
                builder.append("_timestamp=");
                builder.append(_timestamp);
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
