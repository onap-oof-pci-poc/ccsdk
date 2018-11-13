package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach
 *
 */
public class LteRanMacRachBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach> {

    private List<java.lang.Short> _contentionResolutionTimer;
    private List<java.lang.String> _maxHarqMsg3Tx;
    private List<java.lang.Long> _messagePowerOffsetGroupB;
    private List<java.lang.Integer> _messageSizeGroupA;
    private List<java.lang.Short> _numberOfRaPreambles;
    private List<java.lang.Short> _powerRampingStep;
    private List<java.lang.Long> _preambleInitialReceivedTargetPower;
    private List<java.lang.String> _preambleTransMax;
    private List<java.lang.String> _responseWindowSize;
    private List<java.lang.Short> _sizeOfRaGroupA;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>> augmentation = Collections.emptyMap();

    public LteRanMacRachBuilder() {
    }
    public LteRanMacRachBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG arg) {
        this._numberOfRaPreambles = arg.getNumberOfRaPreambles();
        this._sizeOfRaGroupA = arg.getSizeOfRaGroupA();
        this._messageSizeGroupA = arg.getMessageSizeGroupA();
        this._messagePowerOffsetGroupB = arg.getMessagePowerOffsetGroupB();
        this._powerRampingStep = arg.getPowerRampingStep();
        this._preambleInitialReceivedTargetPower = arg.getPreambleInitialReceivedTargetPower();
        this._preambleTransMax = arg.getPreambleTransMax();
        this._responseWindowSize = arg.getResponseWindowSize();
        this._contentionResolutionTimer = arg.getContentionResolutionTimer();
        this._maxHarqMsg3Tx = arg.getMaxHarqMsg3Tx();
    }

    public LteRanMacRachBuilder(LteRanMacRach base) {
        this._contentionResolutionTimer = base.getContentionResolutionTimer();
        this._maxHarqMsg3Tx = base.getMaxHarqMsg3Tx();
        this._messagePowerOffsetGroupB = base.getMessagePowerOffsetGroupB();
        this._messageSizeGroupA = base.getMessageSizeGroupA();
        this._numberOfRaPreambles = base.getNumberOfRaPreambles();
        this._powerRampingStep = base.getPowerRampingStep();
        this._preambleInitialReceivedTargetPower = base.getPreambleInitialReceivedTargetPower();
        this._preambleTransMax = base.getPreambleTransMax();
        this._responseWindowSize = base.getResponseWindowSize();
        this._sizeOfRaGroupA = base.getSizeOfRaGroupA();
        if (base instanceof LteRanMacRachImpl) {
            LteRanMacRachImpl impl = (LteRanMacRachImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG) {
            this._numberOfRaPreambles = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG)arg).getNumberOfRaPreambles();
            this._sizeOfRaGroupA = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG)arg).getSizeOfRaGroupA();
            this._messageSizeGroupA = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG)arg).getMessageSizeGroupA();
            this._messagePowerOffsetGroupB = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG)arg).getMessagePowerOffsetGroupB();
            this._powerRampingStep = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG)arg).getPowerRampingStep();
            this._preambleInitialReceivedTargetPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG)arg).getPreambleInitialReceivedTargetPower();
            this._preambleTransMax = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG)arg).getPreambleTransMax();
            this._responseWindowSize = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG)arg).getResponseWindowSize();
            this._contentionResolutionTimer = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG)arg).getContentionResolutionTimer();
            this._maxHarqMsg3Tx = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG)arg).getMaxHarqMsg3Tx();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacRachG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.Short> getContentionResolutionTimer() {
        return _contentionResolutionTimer;
    }
    
    public List<java.lang.String> getMaxHarqMsg3Tx() {
        return _maxHarqMsg3Tx;
    }
    
    public List<java.lang.Long> getMessagePowerOffsetGroupB() {
        return _messagePowerOffsetGroupB;
    }
    
    public List<java.lang.Integer> getMessageSizeGroupA() {
        return _messageSizeGroupA;
    }
    
    public List<java.lang.Short> getNumberOfRaPreambles() {
        return _numberOfRaPreambles;
    }
    
    public List<java.lang.Short> getPowerRampingStep() {
        return _powerRampingStep;
    }
    
    public List<java.lang.Long> getPreambleInitialReceivedTargetPower() {
        return _preambleInitialReceivedTargetPower;
    }
    
    public List<java.lang.String> getPreambleTransMax() {
        return _preambleTransMax;
    }
    
    public List<java.lang.String> getResponseWindowSize() {
        return _responseWindowSize;
    }
    
    public List<java.lang.Short> getSizeOfRaGroupA() {
        return _sizeOfRaGroupA;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanMacRachBuilder setContentionResolutionTimer(final List<java.lang.Short> value) {
        this._contentionResolutionTimer = value;
        return this;
    }
    
     
    public LteRanMacRachBuilder setMaxHarqMsg3Tx(final List<java.lang.String> value) {
        this._maxHarqMsg3Tx = value;
        return this;
    }
    
     
    public LteRanMacRachBuilder setMessagePowerOffsetGroupB(final List<java.lang.Long> value) {
        this._messagePowerOffsetGroupB = value;
        return this;
    }
    
     
    public LteRanMacRachBuilder setMessageSizeGroupA(final List<java.lang.Integer> value) {
        this._messageSizeGroupA = value;
        return this;
    }
    
     
    public LteRanMacRachBuilder setNumberOfRaPreambles(final List<java.lang.Short> value) {
        this._numberOfRaPreambles = value;
        return this;
    }
    
     
    public LteRanMacRachBuilder setPowerRampingStep(final List<java.lang.Short> value) {
        this._powerRampingStep = value;
        return this;
    }
    
     
    public LteRanMacRachBuilder setPreambleInitialReceivedTargetPower(final List<java.lang.Long> value) {
        this._preambleInitialReceivedTargetPower = value;
        return this;
    }
    
     
    public LteRanMacRachBuilder setPreambleTransMax(final List<java.lang.String> value) {
        this._preambleTransMax = value;
        return this;
    }
    
     
    public LteRanMacRachBuilder setResponseWindowSize(final List<java.lang.String> value) {
        this._responseWindowSize = value;
        return this;
    }
    
     
    public LteRanMacRachBuilder setSizeOfRaGroupA(final List<java.lang.Short> value) {
        this._sizeOfRaGroupA = value;
        return this;
    }
    
    public LteRanMacRachBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMacRachBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMacRach build() {
        return new LteRanMacRachImpl(this);
    }

    private static final class LteRanMacRachImpl implements LteRanMacRach {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach.class;
        }

        private final List<java.lang.Short> _contentionResolutionTimer;
        private final List<java.lang.String> _maxHarqMsg3Tx;
        private final List<java.lang.Long> _messagePowerOffsetGroupB;
        private final List<java.lang.Integer> _messageSizeGroupA;
        private final List<java.lang.Short> _numberOfRaPreambles;
        private final List<java.lang.Short> _powerRampingStep;
        private final List<java.lang.Long> _preambleInitialReceivedTargetPower;
        private final List<java.lang.String> _preambleTransMax;
        private final List<java.lang.String> _responseWindowSize;
        private final List<java.lang.Short> _sizeOfRaGroupA;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>> augmentation = Collections.emptyMap();

        private LteRanMacRachImpl(LteRanMacRachBuilder base) {
            this._contentionResolutionTimer = base.getContentionResolutionTimer();
            this._maxHarqMsg3Tx = base.getMaxHarqMsg3Tx();
            this._messagePowerOffsetGroupB = base.getMessagePowerOffsetGroupB();
            this._messageSizeGroupA = base.getMessageSizeGroupA();
            this._numberOfRaPreambles = base.getNumberOfRaPreambles();
            this._powerRampingStep = base.getPowerRampingStep();
            this._preambleInitialReceivedTargetPower = base.getPreambleInitialReceivedTargetPower();
            this._preambleTransMax = base.getPreambleTransMax();
            this._responseWindowSize = base.getResponseWindowSize();
            this._sizeOfRaGroupA = base.getSizeOfRaGroupA();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.Short> getContentionResolutionTimer() {
            return _contentionResolutionTimer;
        }
        
        @Override
        public List<java.lang.String> getMaxHarqMsg3Tx() {
            return _maxHarqMsg3Tx;
        }
        
        @Override
        public List<java.lang.Long> getMessagePowerOffsetGroupB() {
            return _messagePowerOffsetGroupB;
        }
        
        @Override
        public List<java.lang.Integer> getMessageSizeGroupA() {
            return _messageSizeGroupA;
        }
        
        @Override
        public List<java.lang.Short> getNumberOfRaPreambles() {
            return _numberOfRaPreambles;
        }
        
        @Override
        public List<java.lang.Short> getPowerRampingStep() {
            return _powerRampingStep;
        }
        
        @Override
        public List<java.lang.Long> getPreambleInitialReceivedTargetPower() {
            return _preambleInitialReceivedTargetPower;
        }
        
        @Override
        public List<java.lang.String> getPreambleTransMax() {
            return _preambleTransMax;
        }
        
        @Override
        public List<java.lang.String> getResponseWindowSize() {
            return _responseWindowSize;
        }
        
        @Override
        public List<java.lang.Short> getSizeOfRaGroupA() {
            return _sizeOfRaGroupA;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_contentionResolutionTimer);
            result = prime * result + Objects.hashCode(_maxHarqMsg3Tx);
            result = prime * result + Objects.hashCode(_messagePowerOffsetGroupB);
            result = prime * result + Objects.hashCode(_messageSizeGroupA);
            result = prime * result + Objects.hashCode(_numberOfRaPreambles);
            result = prime * result + Objects.hashCode(_powerRampingStep);
            result = prime * result + Objects.hashCode(_preambleInitialReceivedTargetPower);
            result = prime * result + Objects.hashCode(_preambleTransMax);
            result = prime * result + Objects.hashCode(_responseWindowSize);
            result = prime * result + Objects.hashCode(_sizeOfRaGroupA);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach)obj;
            if (!Objects.equals(_contentionResolutionTimer, other.getContentionResolutionTimer())) {
                return false;
            }
            if (!Objects.equals(_maxHarqMsg3Tx, other.getMaxHarqMsg3Tx())) {
                return false;
            }
            if (!Objects.equals(_messagePowerOffsetGroupB, other.getMessagePowerOffsetGroupB())) {
                return false;
            }
            if (!Objects.equals(_messageSizeGroupA, other.getMessageSizeGroupA())) {
                return false;
            }
            if (!Objects.equals(_numberOfRaPreambles, other.getNumberOfRaPreambles())) {
                return false;
            }
            if (!Objects.equals(_powerRampingStep, other.getPowerRampingStep())) {
                return false;
            }
            if (!Objects.equals(_preambleInitialReceivedTargetPower, other.getPreambleInitialReceivedTargetPower())) {
                return false;
            }
            if (!Objects.equals(_preambleTransMax, other.getPreambleTransMax())) {
                return false;
            }
            if (!Objects.equals(_responseWindowSize, other.getResponseWindowSize())) {
                return false;
            }
            if (!Objects.equals(_sizeOfRaGroupA, other.getSizeOfRaGroupA())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMacRachImpl otherImpl = (LteRanMacRachImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacRach>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMacRach [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_contentionResolutionTimer != null) {
                builder.append("_contentionResolutionTimer=");
                builder.append(_contentionResolutionTimer);
                builder.append(", ");
            }
            if (_maxHarqMsg3Tx != null) {
                builder.append("_maxHarqMsg3Tx=");
                builder.append(_maxHarqMsg3Tx);
                builder.append(", ");
            }
            if (_messagePowerOffsetGroupB != null) {
                builder.append("_messagePowerOffsetGroupB=");
                builder.append(_messagePowerOffsetGroupB);
                builder.append(", ");
            }
            if (_messageSizeGroupA != null) {
                builder.append("_messageSizeGroupA=");
                builder.append(_messageSizeGroupA);
                builder.append(", ");
            }
            if (_numberOfRaPreambles != null) {
                builder.append("_numberOfRaPreambles=");
                builder.append(_numberOfRaPreambles);
                builder.append(", ");
            }
            if (_powerRampingStep != null) {
                builder.append("_powerRampingStep=");
                builder.append(_powerRampingStep);
                builder.append(", ");
            }
            if (_preambleInitialReceivedTargetPower != null) {
                builder.append("_preambleInitialReceivedTargetPower=");
                builder.append(_preambleInitialReceivedTargetPower);
                builder.append(", ");
            }
            if (_preambleTransMax != null) {
                builder.append("_preambleTransMax=");
                builder.append(_preambleTransMax);
                builder.append(", ");
            }
            if (_responseWindowSize != null) {
                builder.append("_responseWindowSize=");
                builder.append(_responseWindowSize);
                builder.append(", ");
            }
            if (_sizeOfRaGroupA != null) {
                builder.append("_sizeOfRaGroupA=");
                builder.append(_sizeOfRaGroupA);
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
