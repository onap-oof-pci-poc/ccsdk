package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.LoopBackType;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus
 *
 */
public class AirInterfaceStatusBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus> {

    private java.lang.Byte _codeRateCur;
    private DateAndTime _lastStatusChange;
    private java.lang.String _localEndPointId;
    private LoopBackType _loopBackKindUp;
    private java.lang.Short _modulationCur;
    private java.lang.String _remoteEndPointId;
    private java.lang.Byte _rfTempCur;
    private java.lang.Integer _rxFrequencyCur;
    private java.lang.Byte _rxLevelCur;
    private java.lang.Byte _snirCur;
    private java.lang.Integer _txFrequencyCur;
    private java.lang.Byte _txLevelCur;
    private java.lang.Byte _xpdCur;
    private java.lang.Boolean _alicIsUp;
    private java.lang.Boolean _atpcIsUp;
    private java.lang.Boolean _autoFreqSelectIsUp;
    private java.lang.Boolean _linkIsUp;
    private java.lang.Boolean _mimoIsUp;
    private java.lang.Boolean _radioPowerIsUp;
    private java.lang.Boolean _xpicIsUp;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>> augmentation = Collections.emptyMap();

    public AirInterfaceStatusBuilder() {
    }
    public AirInterfaceStatusBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG arg) {
        this._txFrequencyCur = arg.getTxFrequencyCur();
        this._rxFrequencyCur = arg.getRxFrequencyCur();
        this._txLevelCur = arg.getTxLevelCur();
        this._rxLevelCur = arg.getRxLevelCur();
        this._modulationCur = arg.getModulationCur();
        this._codeRateCur = arg.getCodeRateCur();
        this._snirCur = arg.getSnirCur();
        this._xpdCur = arg.getXpdCur();
        this._rfTempCur = arg.getRfTempCur();
        this._lastStatusChange = arg.getLastStatusChange();
        this._radioPowerIsUp = arg.isRadioPowerIsUp();
        this._linkIsUp = arg.isLinkIsUp();
        this._xpicIsUp = arg.isXpicIsUp();
        this._mimoIsUp = arg.isMimoIsUp();
        this._alicIsUp = arg.isAlicIsUp();
        this._atpcIsUp = arg.isAtpcIsUp();
        this._autoFreqSelectIsUp = arg.isAutoFreqSelectIsUp();
        this._loopBackKindUp = arg.getLoopBackKindUp();
        this._localEndPointId = arg.getLocalEndPointId();
        this._remoteEndPointId = arg.getRemoteEndPointId();
    }

    public AirInterfaceStatusBuilder(AirInterfaceStatus base) {
        this._codeRateCur = base.getCodeRateCur();
        this._lastStatusChange = base.getLastStatusChange();
        this._localEndPointId = base.getLocalEndPointId();
        this._loopBackKindUp = base.getLoopBackKindUp();
        this._modulationCur = base.getModulationCur();
        this._remoteEndPointId = base.getRemoteEndPointId();
        this._rfTempCur = base.getRfTempCur();
        this._rxFrequencyCur = base.getRxFrequencyCur();
        this._rxLevelCur = base.getRxLevelCur();
        this._snirCur = base.getSnirCur();
        this._txFrequencyCur = base.getTxFrequencyCur();
        this._txLevelCur = base.getTxLevelCur();
        this._xpdCur = base.getXpdCur();
        this._alicIsUp = base.isAlicIsUp();
        this._atpcIsUp = base.isAtpcIsUp();
        this._autoFreqSelectIsUp = base.isAutoFreqSelectIsUp();
        this._linkIsUp = base.isLinkIsUp();
        this._mimoIsUp = base.isMimoIsUp();
        this._radioPowerIsUp = base.isRadioPowerIsUp();
        this._xpicIsUp = base.isXpicIsUp();
        if (base instanceof AirInterfaceStatusImpl) {
            AirInterfaceStatusImpl impl = (AirInterfaceStatusImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG) {
            this._txFrequencyCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).getTxFrequencyCur();
            this._rxFrequencyCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).getRxFrequencyCur();
            this._txLevelCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).getTxLevelCur();
            this._rxLevelCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).getRxLevelCur();
            this._modulationCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).getModulationCur();
            this._codeRateCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).getCodeRateCur();
            this._snirCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).getSnirCur();
            this._xpdCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).getXpdCur();
            this._rfTempCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).getRfTempCur();
            this._lastStatusChange = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).getLastStatusChange();
            this._radioPowerIsUp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).isRadioPowerIsUp();
            this._linkIsUp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).isLinkIsUp();
            this._xpicIsUp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).isXpicIsUp();
            this._mimoIsUp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).isMimoIsUp();
            this._alicIsUp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).isAlicIsUp();
            this._atpcIsUp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).isAtpcIsUp();
            this._autoFreqSelectIsUp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).isAutoFreqSelectIsUp();
            this._loopBackKindUp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).getLoopBackKindUp();
            this._localEndPointId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).getLocalEndPointId();
            this._remoteEndPointId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG)arg).getRemoteEndPointId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceStatusG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Byte getCodeRateCur() {
        return _codeRateCur;
    }
    
    public DateAndTime getLastStatusChange() {
        return _lastStatusChange;
    }
    
    public java.lang.String getLocalEndPointId() {
        return _localEndPointId;
    }
    
    public LoopBackType getLoopBackKindUp() {
        return _loopBackKindUp;
    }
    
    public java.lang.Short getModulationCur() {
        return _modulationCur;
    }
    
    public java.lang.String getRemoteEndPointId() {
        return _remoteEndPointId;
    }
    
    public java.lang.Byte getRfTempCur() {
        return _rfTempCur;
    }
    
    public java.lang.Integer getRxFrequencyCur() {
        return _rxFrequencyCur;
    }
    
    public java.lang.Byte getRxLevelCur() {
        return _rxLevelCur;
    }
    
    public java.lang.Byte getSnirCur() {
        return _snirCur;
    }
    
    public java.lang.Integer getTxFrequencyCur() {
        return _txFrequencyCur;
    }
    
    public java.lang.Byte getTxLevelCur() {
        return _txLevelCur;
    }
    
    public java.lang.Byte getXpdCur() {
        return _xpdCur;
    }
    
    public java.lang.Boolean isAlicIsUp() {
        return _alicIsUp;
    }
    
    public java.lang.Boolean isAtpcIsUp() {
        return _atpcIsUp;
    }
    
    public java.lang.Boolean isAutoFreqSelectIsUp() {
        return _autoFreqSelectIsUp;
    }
    
    public java.lang.Boolean isLinkIsUp() {
        return _linkIsUp;
    }
    
    public java.lang.Boolean isMimoIsUp() {
        return _mimoIsUp;
    }
    
    public java.lang.Boolean isRadioPowerIsUp() {
        return _radioPowerIsUp;
    }
    
    public java.lang.Boolean isXpicIsUp() {
        return _xpicIsUp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AirInterfaceStatusBuilder setCodeRateCur(final java.lang.Byte value) {
        this._codeRateCur = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setLastStatusChange(final DateAndTime value) {
        this._lastStatusChange = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setLocalEndPointId(final java.lang.String value) {
        this._localEndPointId = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setLoopBackKindUp(final LoopBackType value) {
        this._loopBackKindUp = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setModulationCur(final java.lang.Short value) {
        this._modulationCur = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setRemoteEndPointId(final java.lang.String value) {
        this._remoteEndPointId = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setRfTempCur(final java.lang.Byte value) {
        this._rfTempCur = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setRxFrequencyCur(final java.lang.Integer value) {
        this._rxFrequencyCur = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setRxLevelCur(final java.lang.Byte value) {
        this._rxLevelCur = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setSnirCur(final java.lang.Byte value) {
        this._snirCur = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setTxFrequencyCur(final java.lang.Integer value) {
        this._txFrequencyCur = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setTxLevelCur(final java.lang.Byte value) {
        this._txLevelCur = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setXpdCur(final java.lang.Byte value) {
        this._xpdCur = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setAlicIsUp(final java.lang.Boolean value) {
        this._alicIsUp = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setAtpcIsUp(final java.lang.Boolean value) {
        this._atpcIsUp = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setAutoFreqSelectIsUp(final java.lang.Boolean value) {
        this._autoFreqSelectIsUp = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setLinkIsUp(final java.lang.Boolean value) {
        this._linkIsUp = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setMimoIsUp(final java.lang.Boolean value) {
        this._mimoIsUp = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setRadioPowerIsUp(final java.lang.Boolean value) {
        this._radioPowerIsUp = value;
        return this;
    }
    
     
    public AirInterfaceStatusBuilder setXpicIsUp(final java.lang.Boolean value) {
        this._xpicIsUp = value;
        return this;
    }
    
    public AirInterfaceStatusBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AirInterfaceStatusBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AirInterfaceStatus build() {
        return new AirInterfaceStatusImpl(this);
    }

    private static final class AirInterfaceStatusImpl implements AirInterfaceStatus {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus.class;
        }

        private final java.lang.Byte _codeRateCur;
        private final DateAndTime _lastStatusChange;
        private final java.lang.String _localEndPointId;
        private final LoopBackType _loopBackKindUp;
        private final java.lang.Short _modulationCur;
        private final java.lang.String _remoteEndPointId;
        private final java.lang.Byte _rfTempCur;
        private final java.lang.Integer _rxFrequencyCur;
        private final java.lang.Byte _rxLevelCur;
        private final java.lang.Byte _snirCur;
        private final java.lang.Integer _txFrequencyCur;
        private final java.lang.Byte _txLevelCur;
        private final java.lang.Byte _xpdCur;
        private final java.lang.Boolean _alicIsUp;
        private final java.lang.Boolean _atpcIsUp;
        private final java.lang.Boolean _autoFreqSelectIsUp;
        private final java.lang.Boolean _linkIsUp;
        private final java.lang.Boolean _mimoIsUp;
        private final java.lang.Boolean _radioPowerIsUp;
        private final java.lang.Boolean _xpicIsUp;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>> augmentation = Collections.emptyMap();

        private AirInterfaceStatusImpl(AirInterfaceStatusBuilder base) {
            this._codeRateCur = base.getCodeRateCur();
            this._lastStatusChange = base.getLastStatusChange();
            this._localEndPointId = base.getLocalEndPointId();
            this._loopBackKindUp = base.getLoopBackKindUp();
            this._modulationCur = base.getModulationCur();
            this._remoteEndPointId = base.getRemoteEndPointId();
            this._rfTempCur = base.getRfTempCur();
            this._rxFrequencyCur = base.getRxFrequencyCur();
            this._rxLevelCur = base.getRxLevelCur();
            this._snirCur = base.getSnirCur();
            this._txFrequencyCur = base.getTxFrequencyCur();
            this._txLevelCur = base.getTxLevelCur();
            this._xpdCur = base.getXpdCur();
            this._alicIsUp = base.isAlicIsUp();
            this._atpcIsUp = base.isAtpcIsUp();
            this._autoFreqSelectIsUp = base.isAutoFreqSelectIsUp();
            this._linkIsUp = base.isLinkIsUp();
            this._mimoIsUp = base.isMimoIsUp();
            this._radioPowerIsUp = base.isRadioPowerIsUp();
            this._xpicIsUp = base.isXpicIsUp();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Byte getCodeRateCur() {
            return _codeRateCur;
        }
        
        @Override
        public DateAndTime getLastStatusChange() {
            return _lastStatusChange;
        }
        
        @Override
        public java.lang.String getLocalEndPointId() {
            return _localEndPointId;
        }
        
        @Override
        public LoopBackType getLoopBackKindUp() {
            return _loopBackKindUp;
        }
        
        @Override
        public java.lang.Short getModulationCur() {
            return _modulationCur;
        }
        
        @Override
        public java.lang.String getRemoteEndPointId() {
            return _remoteEndPointId;
        }
        
        @Override
        public java.lang.Byte getRfTempCur() {
            return _rfTempCur;
        }
        
        @Override
        public java.lang.Integer getRxFrequencyCur() {
            return _rxFrequencyCur;
        }
        
        @Override
        public java.lang.Byte getRxLevelCur() {
            return _rxLevelCur;
        }
        
        @Override
        public java.lang.Byte getSnirCur() {
            return _snirCur;
        }
        
        @Override
        public java.lang.Integer getTxFrequencyCur() {
            return _txFrequencyCur;
        }
        
        @Override
        public java.lang.Byte getTxLevelCur() {
            return _txLevelCur;
        }
        
        @Override
        public java.lang.Byte getXpdCur() {
            return _xpdCur;
        }
        
        @Override
        public java.lang.Boolean isAlicIsUp() {
            return _alicIsUp;
        }
        
        @Override
        public java.lang.Boolean isAtpcIsUp() {
            return _atpcIsUp;
        }
        
        @Override
        public java.lang.Boolean isAutoFreqSelectIsUp() {
            return _autoFreqSelectIsUp;
        }
        
        @Override
        public java.lang.Boolean isLinkIsUp() {
            return _linkIsUp;
        }
        
        @Override
        public java.lang.Boolean isMimoIsUp() {
            return _mimoIsUp;
        }
        
        @Override
        public java.lang.Boolean isRadioPowerIsUp() {
            return _radioPowerIsUp;
        }
        
        @Override
        public java.lang.Boolean isXpicIsUp() {
            return _xpicIsUp;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_codeRateCur);
            result = prime * result + Objects.hashCode(_lastStatusChange);
            result = prime * result + Objects.hashCode(_localEndPointId);
            result = prime * result + Objects.hashCode(_loopBackKindUp);
            result = prime * result + Objects.hashCode(_modulationCur);
            result = prime * result + Objects.hashCode(_remoteEndPointId);
            result = prime * result + Objects.hashCode(_rfTempCur);
            result = prime * result + Objects.hashCode(_rxFrequencyCur);
            result = prime * result + Objects.hashCode(_rxLevelCur);
            result = prime * result + Objects.hashCode(_snirCur);
            result = prime * result + Objects.hashCode(_txFrequencyCur);
            result = prime * result + Objects.hashCode(_txLevelCur);
            result = prime * result + Objects.hashCode(_xpdCur);
            result = prime * result + Objects.hashCode(_alicIsUp);
            result = prime * result + Objects.hashCode(_atpcIsUp);
            result = prime * result + Objects.hashCode(_autoFreqSelectIsUp);
            result = prime * result + Objects.hashCode(_linkIsUp);
            result = prime * result + Objects.hashCode(_mimoIsUp);
            result = prime * result + Objects.hashCode(_radioPowerIsUp);
            result = prime * result + Objects.hashCode(_xpicIsUp);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus)obj;
            if (!Objects.equals(_codeRateCur, other.getCodeRateCur())) {
                return false;
            }
            if (!Objects.equals(_lastStatusChange, other.getLastStatusChange())) {
                return false;
            }
            if (!Objects.equals(_localEndPointId, other.getLocalEndPointId())) {
                return false;
            }
            if (!Objects.equals(_loopBackKindUp, other.getLoopBackKindUp())) {
                return false;
            }
            if (!Objects.equals(_modulationCur, other.getModulationCur())) {
                return false;
            }
            if (!Objects.equals(_remoteEndPointId, other.getRemoteEndPointId())) {
                return false;
            }
            if (!Objects.equals(_rfTempCur, other.getRfTempCur())) {
                return false;
            }
            if (!Objects.equals(_rxFrequencyCur, other.getRxFrequencyCur())) {
                return false;
            }
            if (!Objects.equals(_rxLevelCur, other.getRxLevelCur())) {
                return false;
            }
            if (!Objects.equals(_snirCur, other.getSnirCur())) {
                return false;
            }
            if (!Objects.equals(_txFrequencyCur, other.getTxFrequencyCur())) {
                return false;
            }
            if (!Objects.equals(_txLevelCur, other.getTxLevelCur())) {
                return false;
            }
            if (!Objects.equals(_xpdCur, other.getXpdCur())) {
                return false;
            }
            if (!Objects.equals(_alicIsUp, other.isAlicIsUp())) {
                return false;
            }
            if (!Objects.equals(_atpcIsUp, other.isAtpcIsUp())) {
                return false;
            }
            if (!Objects.equals(_autoFreqSelectIsUp, other.isAutoFreqSelectIsUp())) {
                return false;
            }
            if (!Objects.equals(_linkIsUp, other.isLinkIsUp())) {
                return false;
            }
            if (!Objects.equals(_mimoIsUp, other.isMimoIsUp())) {
                return false;
            }
            if (!Objects.equals(_radioPowerIsUp, other.isRadioPowerIsUp())) {
                return false;
            }
            if (!Objects.equals(_xpicIsUp, other.isXpicIsUp())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AirInterfaceStatusImpl otherImpl = (AirInterfaceStatusImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AirInterfaceStatus [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_codeRateCur != null) {
                builder.append("_codeRateCur=");
                builder.append(_codeRateCur);
                builder.append(", ");
            }
            if (_lastStatusChange != null) {
                builder.append("_lastStatusChange=");
                builder.append(_lastStatusChange);
                builder.append(", ");
            }
            if (_localEndPointId != null) {
                builder.append("_localEndPointId=");
                builder.append(_localEndPointId);
                builder.append(", ");
            }
            if (_loopBackKindUp != null) {
                builder.append("_loopBackKindUp=");
                builder.append(_loopBackKindUp);
                builder.append(", ");
            }
            if (_modulationCur != null) {
                builder.append("_modulationCur=");
                builder.append(_modulationCur);
                builder.append(", ");
            }
            if (_remoteEndPointId != null) {
                builder.append("_remoteEndPointId=");
                builder.append(_remoteEndPointId);
                builder.append(", ");
            }
            if (_rfTempCur != null) {
                builder.append("_rfTempCur=");
                builder.append(_rfTempCur);
                builder.append(", ");
            }
            if (_rxFrequencyCur != null) {
                builder.append("_rxFrequencyCur=");
                builder.append(_rxFrequencyCur);
                builder.append(", ");
            }
            if (_rxLevelCur != null) {
                builder.append("_rxLevelCur=");
                builder.append(_rxLevelCur);
                builder.append(", ");
            }
            if (_snirCur != null) {
                builder.append("_snirCur=");
                builder.append(_snirCur);
                builder.append(", ");
            }
            if (_txFrequencyCur != null) {
                builder.append("_txFrequencyCur=");
                builder.append(_txFrequencyCur);
                builder.append(", ");
            }
            if (_txLevelCur != null) {
                builder.append("_txLevelCur=");
                builder.append(_txLevelCur);
                builder.append(", ");
            }
            if (_xpdCur != null) {
                builder.append("_xpdCur=");
                builder.append(_xpdCur);
                builder.append(", ");
            }
            if (_alicIsUp != null) {
                builder.append("_alicIsUp=");
                builder.append(_alicIsUp);
                builder.append(", ");
            }
            if (_atpcIsUp != null) {
                builder.append("_atpcIsUp=");
                builder.append(_atpcIsUp);
                builder.append(", ");
            }
            if (_autoFreqSelectIsUp != null) {
                builder.append("_autoFreqSelectIsUp=");
                builder.append(_autoFreqSelectIsUp);
                builder.append(", ");
            }
            if (_linkIsUp != null) {
                builder.append("_linkIsUp=");
                builder.append(_linkIsUp);
                builder.append(", ");
            }
            if (_mimoIsUp != null) {
                builder.append("_mimoIsUp=");
                builder.append(_mimoIsUp);
                builder.append(", ");
            }
            if (_radioPowerIsUp != null) {
                builder.append("_radioPowerIsUp=");
                builder.append(_radioPowerIsUp);
                builder.append(", ");
            }
            if (_xpicIsUp != null) {
                builder.append("_xpicIsUp=");
                builder.append(_xpicIsUp);
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
