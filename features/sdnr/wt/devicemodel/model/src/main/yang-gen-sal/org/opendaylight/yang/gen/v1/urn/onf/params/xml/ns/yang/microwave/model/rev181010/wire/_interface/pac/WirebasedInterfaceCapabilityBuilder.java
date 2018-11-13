package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.LoopBackType;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.capability.g.AvailableMauList;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability
 *
 */
public class WirebasedInterfaceCapabilityBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability> {

    private List<AvailableMauList> _availableMauList;
    private java.lang.String _maintenanceTimerRange;
    private List<java.lang.String> _supportedAlarmList;
    private List<LoopBackType> _supportedLoopBackKindList;
    private java.lang.Boolean _autoPmdNegotiationIsAvail;
    private java.lang.Boolean _autoPmdNegotiationMaxIsAvail;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>> augmentation = Collections.emptyMap();

    public WirebasedInterfaceCapabilityBuilder() {
    }
    public WirebasedInterfaceCapabilityBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceCapabilityG arg) {
        this._availableMauList = arg.getAvailableMauList();
        this._autoPmdNegotiationIsAvail = arg.isAutoPmdNegotiationIsAvail();
        this._autoPmdNegotiationMaxIsAvail = arg.isAutoPmdNegotiationMaxIsAvail();
        this._supportedLoopBackKindList = arg.getSupportedLoopBackKindList();
        this._maintenanceTimerRange = arg.getMaintenanceTimerRange();
        this._supportedAlarmList = arg.getSupportedAlarmList();
    }

    public WirebasedInterfaceCapabilityBuilder(WirebasedInterfaceCapability base) {
        this._availableMauList = base.getAvailableMauList();
        this._maintenanceTimerRange = base.getMaintenanceTimerRange();
        this._supportedAlarmList = base.getSupportedAlarmList();
        this._supportedLoopBackKindList = base.getSupportedLoopBackKindList();
        this._autoPmdNegotiationIsAvail = base.isAutoPmdNegotiationIsAvail();
        this._autoPmdNegotiationMaxIsAvail = base.isAutoPmdNegotiationMaxIsAvail();
        if (base instanceof WirebasedInterfaceCapabilityImpl) {
            WirebasedInterfaceCapabilityImpl impl = (WirebasedInterfaceCapabilityImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceCapabilityG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceCapabilityG) {
            this._availableMauList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceCapabilityG)arg).getAvailableMauList();
            this._autoPmdNegotiationIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceCapabilityG)arg).isAutoPmdNegotiationIsAvail();
            this._autoPmdNegotiationMaxIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceCapabilityG)arg).isAutoPmdNegotiationMaxIsAvail();
            this._supportedLoopBackKindList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceCapabilityG)arg).getSupportedLoopBackKindList();
            this._maintenanceTimerRange = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceCapabilityG)arg).getMaintenanceTimerRange();
            this._supportedAlarmList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceCapabilityG)arg).getSupportedAlarmList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceCapabilityG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<AvailableMauList> getAvailableMauList() {
        return _availableMauList;
    }
    
    public java.lang.String getMaintenanceTimerRange() {
        return _maintenanceTimerRange;
    }
    
    public List<java.lang.String> getSupportedAlarmList() {
        return _supportedAlarmList;
    }
    
    public List<LoopBackType> getSupportedLoopBackKindList() {
        return _supportedLoopBackKindList;
    }
    
    public java.lang.Boolean isAutoPmdNegotiationIsAvail() {
        return _autoPmdNegotiationIsAvail;
    }
    
    public java.lang.Boolean isAutoPmdNegotiationMaxIsAvail() {
        return _autoPmdNegotiationMaxIsAvail;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public WirebasedInterfaceCapabilityBuilder setAvailableMauList(final List<AvailableMauList> value) {
        this._availableMauList = value;
        return this;
    }
    
     
    public WirebasedInterfaceCapabilityBuilder setMaintenanceTimerRange(final java.lang.String value) {
        this._maintenanceTimerRange = value;
        return this;
    }
    
     
    public WirebasedInterfaceCapabilityBuilder setSupportedAlarmList(final List<java.lang.String> value) {
        this._supportedAlarmList = value;
        return this;
    }
    
     
    public WirebasedInterfaceCapabilityBuilder setSupportedLoopBackKindList(final List<LoopBackType> value) {
        this._supportedLoopBackKindList = value;
        return this;
    }
    
     
    public WirebasedInterfaceCapabilityBuilder setAutoPmdNegotiationIsAvail(final java.lang.Boolean value) {
        this._autoPmdNegotiationIsAvail = value;
        return this;
    }
    
     
    public WirebasedInterfaceCapabilityBuilder setAutoPmdNegotiationMaxIsAvail(final java.lang.Boolean value) {
        this._autoPmdNegotiationMaxIsAvail = value;
        return this;
    }
    
    public WirebasedInterfaceCapabilityBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public WirebasedInterfaceCapabilityBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public WirebasedInterfaceCapability build() {
        return new WirebasedInterfaceCapabilityImpl(this);
    }

    private static final class WirebasedInterfaceCapabilityImpl implements WirebasedInterfaceCapability {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability.class;
        }

        private final List<AvailableMauList> _availableMauList;
        private final java.lang.String _maintenanceTimerRange;
        private final List<java.lang.String> _supportedAlarmList;
        private final List<LoopBackType> _supportedLoopBackKindList;
        private final java.lang.Boolean _autoPmdNegotiationIsAvail;
        private final java.lang.Boolean _autoPmdNegotiationMaxIsAvail;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>> augmentation = Collections.emptyMap();

        private WirebasedInterfaceCapabilityImpl(WirebasedInterfaceCapabilityBuilder base) {
            this._availableMauList = base.getAvailableMauList();
            this._maintenanceTimerRange = base.getMaintenanceTimerRange();
            this._supportedAlarmList = base.getSupportedAlarmList();
            this._supportedLoopBackKindList = base.getSupportedLoopBackKindList();
            this._autoPmdNegotiationIsAvail = base.isAutoPmdNegotiationIsAvail();
            this._autoPmdNegotiationMaxIsAvail = base.isAutoPmdNegotiationMaxIsAvail();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<AvailableMauList> getAvailableMauList() {
            return _availableMauList;
        }
        
        @Override
        public java.lang.String getMaintenanceTimerRange() {
            return _maintenanceTimerRange;
        }
        
        @Override
        public List<java.lang.String> getSupportedAlarmList() {
            return _supportedAlarmList;
        }
        
        @Override
        public List<LoopBackType> getSupportedLoopBackKindList() {
            return _supportedLoopBackKindList;
        }
        
        @Override
        public java.lang.Boolean isAutoPmdNegotiationIsAvail() {
            return _autoPmdNegotiationIsAvail;
        }
        
        @Override
        public java.lang.Boolean isAutoPmdNegotiationMaxIsAvail() {
            return _autoPmdNegotiationMaxIsAvail;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_availableMauList);
            result = prime * result + Objects.hashCode(_maintenanceTimerRange);
            result = prime * result + Objects.hashCode(_supportedAlarmList);
            result = prime * result + Objects.hashCode(_supportedLoopBackKindList);
            result = prime * result + Objects.hashCode(_autoPmdNegotiationIsAvail);
            result = prime * result + Objects.hashCode(_autoPmdNegotiationMaxIsAvail);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability)obj;
            if (!Objects.equals(_availableMauList, other.getAvailableMauList())) {
                return false;
            }
            if (!Objects.equals(_maintenanceTimerRange, other.getMaintenanceTimerRange())) {
                return false;
            }
            if (!Objects.equals(_supportedAlarmList, other.getSupportedAlarmList())) {
                return false;
            }
            if (!Objects.equals(_supportedLoopBackKindList, other.getSupportedLoopBackKindList())) {
                return false;
            }
            if (!Objects.equals(_autoPmdNegotiationIsAvail, other.isAutoPmdNegotiationIsAvail())) {
                return false;
            }
            if (!Objects.equals(_autoPmdNegotiationMaxIsAvail, other.isAutoPmdNegotiationMaxIsAvail())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                WirebasedInterfaceCapabilityImpl otherImpl = (WirebasedInterfaceCapabilityImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>> e : augmentation.entrySet()) {
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
            java.lang.String name = "WirebasedInterfaceCapability [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_availableMauList != null) {
                builder.append("_availableMauList=");
                builder.append(_availableMauList);
                builder.append(", ");
            }
            if (_maintenanceTimerRange != null) {
                builder.append("_maintenanceTimerRange=");
                builder.append(_maintenanceTimerRange);
                builder.append(", ");
            }
            if (_supportedAlarmList != null) {
                builder.append("_supportedAlarmList=");
                builder.append(_supportedAlarmList);
                builder.append(", ");
            }
            if (_supportedLoopBackKindList != null) {
                builder.append("_supportedLoopBackKindList=");
                builder.append(_supportedLoopBackKindList);
                builder.append(", ");
            }
            if (_autoPmdNegotiationIsAvail != null) {
                builder.append("_autoPmdNegotiationIsAvail=");
                builder.append(_autoPmdNegotiationIsAvail);
                builder.append(", ");
            }
            if (_autoPmdNegotiationMaxIsAvail != null) {
                builder.append("_autoPmdNegotiationMaxIsAvail=");
                builder.append(_autoPmdNegotiationMaxIsAvail);
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
