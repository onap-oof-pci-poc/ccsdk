package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.LoopBackType;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.capability.g.SupportedChannelPlanList;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability
 *
 */
public class AirInterfaceCapabilityBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability> {

    private java.lang.Byte _atpcRange;
    private java.lang.String _maintenanceTimerRange;
    private java.lang.Byte _mimoChannels;
    private java.lang.Integer _rxFrequencyMax;
    private java.lang.Integer _rxFrequencyMin;
    private List<java.lang.String> _supportedAlarmList;
    private java.lang.String _supportedAlarms;
    private List<SupportedChannelPlanList> _supportedChannelPlanList;
    private List<LoopBackType> _supportedLoopBackKindList;
    private java.lang.Integer _txFrequencyMax;
    private java.lang.Integer _txFrequencyMin;
    private java.lang.String _typeOfEquipment;
    private java.lang.Boolean _adaptiveModulationIsAvail;
    private java.lang.Boolean _alicIsAvail;
    private java.lang.Boolean _atpcIsAvail;
    private java.lang.Boolean _encryptionIsAvail;
    private java.lang.Boolean _mimoIsAvail;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>> augmentation = Collections.emptyMap();

    public AirInterfaceCapabilityBuilder() {
    }
    public AirInterfaceCapabilityBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG arg) {
        this._typeOfEquipment = arg.getTypeOfEquipment();
        this._txFrequencyMin = arg.getTxFrequencyMin();
        this._txFrequencyMax = arg.getTxFrequencyMax();
        this._rxFrequencyMin = arg.getRxFrequencyMin();
        this._rxFrequencyMax = arg.getRxFrequencyMax();
        this._adaptiveModulationIsAvail = arg.isAdaptiveModulationIsAvail();
        this._mimoIsAvail = arg.isMimoIsAvail();
        this._mimoChannels = arg.getMimoChannels();
        this._alicIsAvail = arg.isAlicIsAvail();
        this._atpcIsAvail = arg.isAtpcIsAvail();
        this._atpcRange = arg.getAtpcRange();
        this._encryptionIsAvail = arg.isEncryptionIsAvail();
        this._supportedLoopBackKindList = arg.getSupportedLoopBackKindList();
        this._maintenanceTimerRange = arg.getMaintenanceTimerRange();
        this._supportedAlarmList = arg.getSupportedAlarmList();
        this._supportedAlarms = arg.getSupportedAlarms();
        this._supportedChannelPlanList = arg.getSupportedChannelPlanList();
    }

    public AirInterfaceCapabilityBuilder(AirInterfaceCapability base) {
        this._atpcRange = base.getAtpcRange();
        this._maintenanceTimerRange = base.getMaintenanceTimerRange();
        this._mimoChannels = base.getMimoChannels();
        this._rxFrequencyMax = base.getRxFrequencyMax();
        this._rxFrequencyMin = base.getRxFrequencyMin();
        this._supportedAlarmList = base.getSupportedAlarmList();
        this._supportedAlarms = base.getSupportedAlarms();
        this._supportedChannelPlanList = base.getSupportedChannelPlanList();
        this._supportedLoopBackKindList = base.getSupportedLoopBackKindList();
        this._txFrequencyMax = base.getTxFrequencyMax();
        this._txFrequencyMin = base.getTxFrequencyMin();
        this._typeOfEquipment = base.getTypeOfEquipment();
        this._adaptiveModulationIsAvail = base.isAdaptiveModulationIsAvail();
        this._alicIsAvail = base.isAlicIsAvail();
        this._atpcIsAvail = base.isAtpcIsAvail();
        this._encryptionIsAvail = base.isEncryptionIsAvail();
        this._mimoIsAvail = base.isMimoIsAvail();
        if (base instanceof AirInterfaceCapabilityImpl) {
            AirInterfaceCapabilityImpl impl = (AirInterfaceCapabilityImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG) {
            this._typeOfEquipment = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).getTypeOfEquipment();
            this._txFrequencyMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).getTxFrequencyMin();
            this._txFrequencyMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).getTxFrequencyMax();
            this._rxFrequencyMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).getRxFrequencyMin();
            this._rxFrequencyMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).getRxFrequencyMax();
            this._adaptiveModulationIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).isAdaptiveModulationIsAvail();
            this._mimoIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).isMimoIsAvail();
            this._mimoChannels = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).getMimoChannels();
            this._alicIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).isAlicIsAvail();
            this._atpcIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).isAtpcIsAvail();
            this._atpcRange = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).getAtpcRange();
            this._encryptionIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).isEncryptionIsAvail();
            this._supportedLoopBackKindList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).getSupportedLoopBackKindList();
            this._maintenanceTimerRange = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).getMaintenanceTimerRange();
            this._supportedAlarmList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).getSupportedAlarmList();
            this._supportedAlarms = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).getSupportedAlarms();
            this._supportedChannelPlanList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG)arg).getSupportedChannelPlanList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Byte getAtpcRange() {
        return _atpcRange;
    }
    
    public java.lang.String getMaintenanceTimerRange() {
        return _maintenanceTimerRange;
    }
    
    public java.lang.Byte getMimoChannels() {
        return _mimoChannels;
    }
    
    public java.lang.Integer getRxFrequencyMax() {
        return _rxFrequencyMax;
    }
    
    public java.lang.Integer getRxFrequencyMin() {
        return _rxFrequencyMin;
    }
    
    public List<java.lang.String> getSupportedAlarmList() {
        return _supportedAlarmList;
    }
    
    public java.lang.String getSupportedAlarms() {
        return _supportedAlarms;
    }
    
    public List<SupportedChannelPlanList> getSupportedChannelPlanList() {
        return _supportedChannelPlanList;
    }
    
    public List<LoopBackType> getSupportedLoopBackKindList() {
        return _supportedLoopBackKindList;
    }
    
    public java.lang.Integer getTxFrequencyMax() {
        return _txFrequencyMax;
    }
    
    public java.lang.Integer getTxFrequencyMin() {
        return _txFrequencyMin;
    }
    
    public java.lang.String getTypeOfEquipment() {
        return _typeOfEquipment;
    }
    
    public java.lang.Boolean isAdaptiveModulationIsAvail() {
        return _adaptiveModulationIsAvail;
    }
    
    public java.lang.Boolean isAlicIsAvail() {
        return _alicIsAvail;
    }
    
    public java.lang.Boolean isAtpcIsAvail() {
        return _atpcIsAvail;
    }
    
    public java.lang.Boolean isEncryptionIsAvail() {
        return _encryptionIsAvail;
    }
    
    public java.lang.Boolean isMimoIsAvail() {
        return _mimoIsAvail;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AirInterfaceCapabilityBuilder setAtpcRange(final java.lang.Byte value) {
        this._atpcRange = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setMaintenanceTimerRange(final java.lang.String value) {
        this._maintenanceTimerRange = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setMimoChannels(final java.lang.Byte value) {
        this._mimoChannels = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setRxFrequencyMax(final java.lang.Integer value) {
        this._rxFrequencyMax = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setRxFrequencyMin(final java.lang.Integer value) {
        this._rxFrequencyMin = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setSupportedAlarmList(final List<java.lang.String> value) {
        this._supportedAlarmList = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setSupportedAlarms(final java.lang.String value) {
        this._supportedAlarms = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setSupportedChannelPlanList(final List<SupportedChannelPlanList> value) {
        this._supportedChannelPlanList = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setSupportedLoopBackKindList(final List<LoopBackType> value) {
        this._supportedLoopBackKindList = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setTxFrequencyMax(final java.lang.Integer value) {
        this._txFrequencyMax = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setTxFrequencyMin(final java.lang.Integer value) {
        this._txFrequencyMin = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setTypeOfEquipment(final java.lang.String value) {
        this._typeOfEquipment = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setAdaptiveModulationIsAvail(final java.lang.Boolean value) {
        this._adaptiveModulationIsAvail = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setAlicIsAvail(final java.lang.Boolean value) {
        this._alicIsAvail = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setAtpcIsAvail(final java.lang.Boolean value) {
        this._atpcIsAvail = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setEncryptionIsAvail(final java.lang.Boolean value) {
        this._encryptionIsAvail = value;
        return this;
    }
    
     
    public AirInterfaceCapabilityBuilder setMimoIsAvail(final java.lang.Boolean value) {
        this._mimoIsAvail = value;
        return this;
    }
    
    public AirInterfaceCapabilityBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AirInterfaceCapabilityBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AirInterfaceCapability build() {
        return new AirInterfaceCapabilityImpl(this);
    }

    private static final class AirInterfaceCapabilityImpl implements AirInterfaceCapability {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability.class;
        }

        private final java.lang.Byte _atpcRange;
        private final java.lang.String _maintenanceTimerRange;
        private final java.lang.Byte _mimoChannels;
        private final java.lang.Integer _rxFrequencyMax;
        private final java.lang.Integer _rxFrequencyMin;
        private final List<java.lang.String> _supportedAlarmList;
        private final java.lang.String _supportedAlarms;
        private final List<SupportedChannelPlanList> _supportedChannelPlanList;
        private final List<LoopBackType> _supportedLoopBackKindList;
        private final java.lang.Integer _txFrequencyMax;
        private final java.lang.Integer _txFrequencyMin;
        private final java.lang.String _typeOfEquipment;
        private final java.lang.Boolean _adaptiveModulationIsAvail;
        private final java.lang.Boolean _alicIsAvail;
        private final java.lang.Boolean _atpcIsAvail;
        private final java.lang.Boolean _encryptionIsAvail;
        private final java.lang.Boolean _mimoIsAvail;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>> augmentation = Collections.emptyMap();

        private AirInterfaceCapabilityImpl(AirInterfaceCapabilityBuilder base) {
            this._atpcRange = base.getAtpcRange();
            this._maintenanceTimerRange = base.getMaintenanceTimerRange();
            this._mimoChannels = base.getMimoChannels();
            this._rxFrequencyMax = base.getRxFrequencyMax();
            this._rxFrequencyMin = base.getRxFrequencyMin();
            this._supportedAlarmList = base.getSupportedAlarmList();
            this._supportedAlarms = base.getSupportedAlarms();
            this._supportedChannelPlanList = base.getSupportedChannelPlanList();
            this._supportedLoopBackKindList = base.getSupportedLoopBackKindList();
            this._txFrequencyMax = base.getTxFrequencyMax();
            this._txFrequencyMin = base.getTxFrequencyMin();
            this._typeOfEquipment = base.getTypeOfEquipment();
            this._adaptiveModulationIsAvail = base.isAdaptiveModulationIsAvail();
            this._alicIsAvail = base.isAlicIsAvail();
            this._atpcIsAvail = base.isAtpcIsAvail();
            this._encryptionIsAvail = base.isEncryptionIsAvail();
            this._mimoIsAvail = base.isMimoIsAvail();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Byte getAtpcRange() {
            return _atpcRange;
        }
        
        @Override
        public java.lang.String getMaintenanceTimerRange() {
            return _maintenanceTimerRange;
        }
        
        @Override
        public java.lang.Byte getMimoChannels() {
            return _mimoChannels;
        }
        
        @Override
        public java.lang.Integer getRxFrequencyMax() {
            return _rxFrequencyMax;
        }
        
        @Override
        public java.lang.Integer getRxFrequencyMin() {
            return _rxFrequencyMin;
        }
        
        @Override
        public List<java.lang.String> getSupportedAlarmList() {
            return _supportedAlarmList;
        }
        
        @Override
        public java.lang.String getSupportedAlarms() {
            return _supportedAlarms;
        }
        
        @Override
        public List<SupportedChannelPlanList> getSupportedChannelPlanList() {
            return _supportedChannelPlanList;
        }
        
        @Override
        public List<LoopBackType> getSupportedLoopBackKindList() {
            return _supportedLoopBackKindList;
        }
        
        @Override
        public java.lang.Integer getTxFrequencyMax() {
            return _txFrequencyMax;
        }
        
        @Override
        public java.lang.Integer getTxFrequencyMin() {
            return _txFrequencyMin;
        }
        
        @Override
        public java.lang.String getTypeOfEquipment() {
            return _typeOfEquipment;
        }
        
        @Override
        public java.lang.Boolean isAdaptiveModulationIsAvail() {
            return _adaptiveModulationIsAvail;
        }
        
        @Override
        public java.lang.Boolean isAlicIsAvail() {
            return _alicIsAvail;
        }
        
        @Override
        public java.lang.Boolean isAtpcIsAvail() {
            return _atpcIsAvail;
        }
        
        @Override
        public java.lang.Boolean isEncryptionIsAvail() {
            return _encryptionIsAvail;
        }
        
        @Override
        public java.lang.Boolean isMimoIsAvail() {
            return _mimoIsAvail;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_atpcRange);
            result = prime * result + Objects.hashCode(_maintenanceTimerRange);
            result = prime * result + Objects.hashCode(_mimoChannels);
            result = prime * result + Objects.hashCode(_rxFrequencyMax);
            result = prime * result + Objects.hashCode(_rxFrequencyMin);
            result = prime * result + Objects.hashCode(_supportedAlarmList);
            result = prime * result + Objects.hashCode(_supportedAlarms);
            result = prime * result + Objects.hashCode(_supportedChannelPlanList);
            result = prime * result + Objects.hashCode(_supportedLoopBackKindList);
            result = prime * result + Objects.hashCode(_txFrequencyMax);
            result = prime * result + Objects.hashCode(_txFrequencyMin);
            result = prime * result + Objects.hashCode(_typeOfEquipment);
            result = prime * result + Objects.hashCode(_adaptiveModulationIsAvail);
            result = prime * result + Objects.hashCode(_alicIsAvail);
            result = prime * result + Objects.hashCode(_atpcIsAvail);
            result = prime * result + Objects.hashCode(_encryptionIsAvail);
            result = prime * result + Objects.hashCode(_mimoIsAvail);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability)obj;
            if (!Objects.equals(_atpcRange, other.getAtpcRange())) {
                return false;
            }
            if (!Objects.equals(_maintenanceTimerRange, other.getMaintenanceTimerRange())) {
                return false;
            }
            if (!Objects.equals(_mimoChannels, other.getMimoChannels())) {
                return false;
            }
            if (!Objects.equals(_rxFrequencyMax, other.getRxFrequencyMax())) {
                return false;
            }
            if (!Objects.equals(_rxFrequencyMin, other.getRxFrequencyMin())) {
                return false;
            }
            if (!Objects.equals(_supportedAlarmList, other.getSupportedAlarmList())) {
                return false;
            }
            if (!Objects.equals(_supportedAlarms, other.getSupportedAlarms())) {
                return false;
            }
            if (!Objects.equals(_supportedChannelPlanList, other.getSupportedChannelPlanList())) {
                return false;
            }
            if (!Objects.equals(_supportedLoopBackKindList, other.getSupportedLoopBackKindList())) {
                return false;
            }
            if (!Objects.equals(_txFrequencyMax, other.getTxFrequencyMax())) {
                return false;
            }
            if (!Objects.equals(_txFrequencyMin, other.getTxFrequencyMin())) {
                return false;
            }
            if (!Objects.equals(_typeOfEquipment, other.getTypeOfEquipment())) {
                return false;
            }
            if (!Objects.equals(_adaptiveModulationIsAvail, other.isAdaptiveModulationIsAvail())) {
                return false;
            }
            if (!Objects.equals(_alicIsAvail, other.isAlicIsAvail())) {
                return false;
            }
            if (!Objects.equals(_atpcIsAvail, other.isAtpcIsAvail())) {
                return false;
            }
            if (!Objects.equals(_encryptionIsAvail, other.isEncryptionIsAvail())) {
                return false;
            }
            if (!Objects.equals(_mimoIsAvail, other.isMimoIsAvail())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AirInterfaceCapabilityImpl otherImpl = (AirInterfaceCapabilityImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceCapability>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AirInterfaceCapability [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_atpcRange != null) {
                builder.append("_atpcRange=");
                builder.append(_atpcRange);
                builder.append(", ");
            }
            if (_maintenanceTimerRange != null) {
                builder.append("_maintenanceTimerRange=");
                builder.append(_maintenanceTimerRange);
                builder.append(", ");
            }
            if (_mimoChannels != null) {
                builder.append("_mimoChannels=");
                builder.append(_mimoChannels);
                builder.append(", ");
            }
            if (_rxFrequencyMax != null) {
                builder.append("_rxFrequencyMax=");
                builder.append(_rxFrequencyMax);
                builder.append(", ");
            }
            if (_rxFrequencyMin != null) {
                builder.append("_rxFrequencyMin=");
                builder.append(_rxFrequencyMin);
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
                builder.append(", ");
            }
            if (_supportedChannelPlanList != null) {
                builder.append("_supportedChannelPlanList=");
                builder.append(_supportedChannelPlanList);
                builder.append(", ");
            }
            if (_supportedLoopBackKindList != null) {
                builder.append("_supportedLoopBackKindList=");
                builder.append(_supportedLoopBackKindList);
                builder.append(", ");
            }
            if (_txFrequencyMax != null) {
                builder.append("_txFrequencyMax=");
                builder.append(_txFrequencyMax);
                builder.append(", ");
            }
            if (_txFrequencyMin != null) {
                builder.append("_txFrequencyMin=");
                builder.append(_txFrequencyMin);
                builder.append(", ");
            }
            if (_typeOfEquipment != null) {
                builder.append("_typeOfEquipment=");
                builder.append(_typeOfEquipment);
                builder.append(", ");
            }
            if (_adaptiveModulationIsAvail != null) {
                builder.append("_adaptiveModulationIsAvail=");
                builder.append(_adaptiveModulationIsAvail);
                builder.append(", ");
            }
            if (_alicIsAvail != null) {
                builder.append("_alicIsAvail=");
                builder.append(_alicIsAvail);
                builder.append(", ");
            }
            if (_atpcIsAvail != null) {
                builder.append("_atpcIsAvail=");
                builder.append(_atpcIsAvail);
                builder.append(", ");
            }
            if (_encryptionIsAvail != null) {
                builder.append("_encryptionIsAvail=");
                builder.append(_encryptionIsAvail);
                builder.append(", ");
            }
            if (_mimoIsAvail != null) {
                builder.append("_mimoIsAvail=");
                builder.append(_mimoIsAvail);
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
