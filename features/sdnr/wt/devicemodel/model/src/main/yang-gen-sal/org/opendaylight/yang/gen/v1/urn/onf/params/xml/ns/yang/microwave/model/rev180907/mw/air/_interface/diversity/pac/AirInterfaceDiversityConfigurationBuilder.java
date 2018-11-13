package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.configuration.g.ProblemKindSeverityList;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.configuration.g.ThresholdCrossAlarmList;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.configuration.g.AirInterfaceDiversity;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration
 *
 */
public class AirInterfaceDiversityConfigurationBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration> {

    private AirInterfaceDiversity _airInterfaceDiversity;
    private List<UniversalId> _airInterfaceLtpList;
    private List<ProblemKindSeverityList> _problemKindSeverityList;
    private List<ThresholdCrossAlarmList> _thresholdCrossAlarmList;
    private java.lang.Boolean _performanceMonitoringCollectionIsOn;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>> augmentation = Collections.emptyMap();

    public AirInterfaceDiversityConfigurationBuilder() {
    }
    public AirInterfaceDiversityConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityConfigurationG arg) {
        this._airInterfaceDiversity = arg.getAirInterfaceDiversity();
        this._airInterfaceLtpList = arg.getAirInterfaceLtpList();
        this._performanceMonitoringCollectionIsOn = arg.isPerformanceMonitoringCollectionIsOn();
        this._thresholdCrossAlarmList = arg.getThresholdCrossAlarmList();
        this._problemKindSeverityList = arg.getProblemKindSeverityList();
    }

    public AirInterfaceDiversityConfigurationBuilder(AirInterfaceDiversityConfiguration base) {
        this._airInterfaceDiversity = base.getAirInterfaceDiversity();
        this._airInterfaceLtpList = base.getAirInterfaceLtpList();
        this._problemKindSeverityList = base.getProblemKindSeverityList();
        this._thresholdCrossAlarmList = base.getThresholdCrossAlarmList();
        this._performanceMonitoringCollectionIsOn = base.isPerformanceMonitoringCollectionIsOn();
        if (base instanceof AirInterfaceDiversityConfigurationImpl) {
            AirInterfaceDiversityConfigurationImpl impl = (AirInterfaceDiversityConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityConfigurationG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityConfigurationG) {
            this._airInterfaceDiversity = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityConfigurationG)arg).getAirInterfaceDiversity();
            this._airInterfaceLtpList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityConfigurationG)arg).getAirInterfaceLtpList();
            this._performanceMonitoringCollectionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityConfigurationG)arg).isPerformanceMonitoringCollectionIsOn();
            this._thresholdCrossAlarmList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityConfigurationG)arg).getThresholdCrossAlarmList();
            this._problemKindSeverityList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityConfigurationG)arg).getProblemKindSeverityList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityConfigurationG] \n" +
              "but was: " + arg
            );
        }
    }

    public AirInterfaceDiversity getAirInterfaceDiversity() {
        return _airInterfaceDiversity;
    }
    
    public List<UniversalId> getAirInterfaceLtpList() {
        return _airInterfaceLtpList;
    }
    
    public List<ProblemKindSeverityList> getProblemKindSeverityList() {
        return _problemKindSeverityList;
    }
    
    public List<ThresholdCrossAlarmList> getThresholdCrossAlarmList() {
        return _thresholdCrossAlarmList;
    }
    
    public java.lang.Boolean isPerformanceMonitoringCollectionIsOn() {
        return _performanceMonitoringCollectionIsOn;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AirInterfaceDiversityConfigurationBuilder setAirInterfaceDiversity(final AirInterfaceDiversity value) {
        this._airInterfaceDiversity = value;
        return this;
    }
    
     
    public AirInterfaceDiversityConfigurationBuilder setAirInterfaceLtpList(final List<UniversalId> value) {
        this._airInterfaceLtpList = value;
        return this;
    }
    
     
    public AirInterfaceDiversityConfigurationBuilder setProblemKindSeverityList(final List<ProblemKindSeverityList> value) {
        this._problemKindSeverityList = value;
        return this;
    }
    
     
    public AirInterfaceDiversityConfigurationBuilder setThresholdCrossAlarmList(final List<ThresholdCrossAlarmList> value) {
        this._thresholdCrossAlarmList = value;
        return this;
    }
    
     
    public AirInterfaceDiversityConfigurationBuilder setPerformanceMonitoringCollectionIsOn(final java.lang.Boolean value) {
        this._performanceMonitoringCollectionIsOn = value;
        return this;
    }
    
    public AirInterfaceDiversityConfigurationBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AirInterfaceDiversityConfigurationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AirInterfaceDiversityConfiguration build() {
        return new AirInterfaceDiversityConfigurationImpl(this);
    }

    private static final class AirInterfaceDiversityConfigurationImpl implements AirInterfaceDiversityConfiguration {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration.class;
        }

        private final AirInterfaceDiversity _airInterfaceDiversity;
        private final List<UniversalId> _airInterfaceLtpList;
        private final List<ProblemKindSeverityList> _problemKindSeverityList;
        private final List<ThresholdCrossAlarmList> _thresholdCrossAlarmList;
        private final java.lang.Boolean _performanceMonitoringCollectionIsOn;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>> augmentation = Collections.emptyMap();

        private AirInterfaceDiversityConfigurationImpl(AirInterfaceDiversityConfigurationBuilder base) {
            this._airInterfaceDiversity = base.getAirInterfaceDiversity();
            this._airInterfaceLtpList = base.getAirInterfaceLtpList();
            this._problemKindSeverityList = base.getProblemKindSeverityList();
            this._thresholdCrossAlarmList = base.getThresholdCrossAlarmList();
            this._performanceMonitoringCollectionIsOn = base.isPerformanceMonitoringCollectionIsOn();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AirInterfaceDiversity getAirInterfaceDiversity() {
            return _airInterfaceDiversity;
        }
        
        @Override
        public List<UniversalId> getAirInterfaceLtpList() {
            return _airInterfaceLtpList;
        }
        
        @Override
        public List<ProblemKindSeverityList> getProblemKindSeverityList() {
            return _problemKindSeverityList;
        }
        
        @Override
        public List<ThresholdCrossAlarmList> getThresholdCrossAlarmList() {
            return _thresholdCrossAlarmList;
        }
        
        @Override
        public java.lang.Boolean isPerformanceMonitoringCollectionIsOn() {
            return _performanceMonitoringCollectionIsOn;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_airInterfaceDiversity);
            result = prime * result + Objects.hashCode(_airInterfaceLtpList);
            result = prime * result + Objects.hashCode(_problemKindSeverityList);
            result = prime * result + Objects.hashCode(_thresholdCrossAlarmList);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration)obj;
            if (!Objects.equals(_airInterfaceDiversity, other.getAirInterfaceDiversity())) {
                return false;
            }
            if (!Objects.equals(_airInterfaceLtpList, other.getAirInterfaceLtpList())) {
                return false;
            }
            if (!Objects.equals(_problemKindSeverityList, other.getProblemKindSeverityList())) {
                return false;
            }
            if (!Objects.equals(_thresholdCrossAlarmList, other.getThresholdCrossAlarmList())) {
                return false;
            }
            if (!Objects.equals(_performanceMonitoringCollectionIsOn, other.isPerformanceMonitoringCollectionIsOn())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AirInterfaceDiversityConfigurationImpl otherImpl = (AirInterfaceDiversityConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AirInterfaceDiversityConfiguration [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_airInterfaceDiversity != null) {
                builder.append("_airInterfaceDiversity=");
                builder.append(_airInterfaceDiversity);
                builder.append(", ");
            }
            if (_airInterfaceLtpList != null) {
                builder.append("_airInterfaceLtpList=");
                builder.append(_airInterfaceLtpList);
                builder.append(", ");
            }
            if (_problemKindSeverityList != null) {
                builder.append("_problemKindSeverityList=");
                builder.append(_problemKindSeverityList);
                builder.append(", ");
            }
            if (_thresholdCrossAlarmList != null) {
                builder.append("_thresholdCrossAlarmList=");
                builder.append(_thresholdCrossAlarmList);
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
