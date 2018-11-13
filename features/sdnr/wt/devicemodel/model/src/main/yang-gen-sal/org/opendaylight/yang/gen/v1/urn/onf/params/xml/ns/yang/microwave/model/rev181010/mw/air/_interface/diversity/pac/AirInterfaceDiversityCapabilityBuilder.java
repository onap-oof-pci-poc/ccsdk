package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.capability.g.AvailableKindsOfDiversity;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability
 *
 */
public class AirInterfaceDiversityCapabilityBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability> {

    private List<AvailableKindsOfDiversity> _availableKindsOfDiversity;
    private List<java.lang.String> _supportedAlarmList;
    private java.lang.String _supportedAlarms;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>> augmentation = Collections.emptyMap();

    public AirInterfaceDiversityCapabilityBuilder() {
    }
    public AirInterfaceDiversityCapabilityBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceDiversityCapabilityG arg) {
        this._availableKindsOfDiversity = arg.getAvailableKindsOfDiversity();
        this._supportedAlarmList = arg.getSupportedAlarmList();
        this._supportedAlarms = arg.getSupportedAlarms();
    }

    public AirInterfaceDiversityCapabilityBuilder(AirInterfaceDiversityCapability base) {
        this._availableKindsOfDiversity = base.getAvailableKindsOfDiversity();
        this._supportedAlarmList = base.getSupportedAlarmList();
        this._supportedAlarms = base.getSupportedAlarms();
        if (base instanceof AirInterfaceDiversityCapabilityImpl) {
            AirInterfaceDiversityCapabilityImpl impl = (AirInterfaceDiversityCapabilityImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceDiversityCapabilityG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceDiversityCapabilityG) {
            this._availableKindsOfDiversity = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceDiversityCapabilityG)arg).getAvailableKindsOfDiversity();
            this._supportedAlarmList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceDiversityCapabilityG)arg).getSupportedAlarmList();
            this._supportedAlarms = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceDiversityCapabilityG)arg).getSupportedAlarms();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceDiversityCapabilityG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<AvailableKindsOfDiversity> getAvailableKindsOfDiversity() {
        return _availableKindsOfDiversity;
    }
    
    public List<java.lang.String> getSupportedAlarmList() {
        return _supportedAlarmList;
    }
    
    public java.lang.String getSupportedAlarms() {
        return _supportedAlarms;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AirInterfaceDiversityCapabilityBuilder setAvailableKindsOfDiversity(final List<AvailableKindsOfDiversity> value) {
        this._availableKindsOfDiversity = value;
        return this;
    }
    
     
    public AirInterfaceDiversityCapabilityBuilder setSupportedAlarmList(final List<java.lang.String> value) {
        this._supportedAlarmList = value;
        return this;
    }
    
     
    public AirInterfaceDiversityCapabilityBuilder setSupportedAlarms(final java.lang.String value) {
        this._supportedAlarms = value;
        return this;
    }
    
    public AirInterfaceDiversityCapabilityBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AirInterfaceDiversityCapabilityBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AirInterfaceDiversityCapability build() {
        return new AirInterfaceDiversityCapabilityImpl(this);
    }

    private static final class AirInterfaceDiversityCapabilityImpl implements AirInterfaceDiversityCapability {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability.class;
        }

        private final List<AvailableKindsOfDiversity> _availableKindsOfDiversity;
        private final List<java.lang.String> _supportedAlarmList;
        private final java.lang.String _supportedAlarms;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>> augmentation = Collections.emptyMap();

        private AirInterfaceDiversityCapabilityImpl(AirInterfaceDiversityCapabilityBuilder base) {
            this._availableKindsOfDiversity = base.getAvailableKindsOfDiversity();
            this._supportedAlarmList = base.getSupportedAlarmList();
            this._supportedAlarms = base.getSupportedAlarms();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<AvailableKindsOfDiversity> getAvailableKindsOfDiversity() {
            return _availableKindsOfDiversity;
        }
        
        @Override
        public List<java.lang.String> getSupportedAlarmList() {
            return _supportedAlarmList;
        }
        
        @Override
        public java.lang.String getSupportedAlarms() {
            return _supportedAlarms;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_availableKindsOfDiversity);
            result = prime * result + Objects.hashCode(_supportedAlarmList);
            result = prime * result + Objects.hashCode(_supportedAlarms);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability)obj;
            if (!Objects.equals(_availableKindsOfDiversity, other.getAvailableKindsOfDiversity())) {
                return false;
            }
            if (!Objects.equals(_supportedAlarmList, other.getSupportedAlarmList())) {
                return false;
            }
            if (!Objects.equals(_supportedAlarms, other.getSupportedAlarms())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AirInterfaceDiversityCapabilityImpl otherImpl = (AirInterfaceDiversityCapabilityImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AirInterfaceDiversityCapability [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_availableKindsOfDiversity != null) {
                builder.append("_availableKindsOfDiversity=");
                builder.append(_availableKindsOfDiversity);
                builder.append(", ");
            }
            if (_supportedAlarmList != null) {
                builder.append("_supportedAlarmList=");
                builder.append(_supportedAlarmList);
                builder.append(", ");
            }
            if (_supportedAlarms != null) {
                builder.append("_supportedAlarms=");
                builder.append(_supportedAlarms);
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
