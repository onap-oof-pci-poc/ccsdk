package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.LoopBackType;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.PmdNameType;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus
 *
 */
public class WirebasedInterfaceStatusBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus> {

    private LoopBackType _loopBackKindUp;
    private PmdNameType _pmdCur;
    private List<java.lang.Boolean> _receiveSignalIsDetected;
    private List<java.lang.Byte> _rxLevelCur;
    private SignalOrderingKindCur _signalOrderingKindCur;
    private java.lang.Byte _tempCur;
    private java.lang.Byte _txLevelCur;
    private java.lang.Boolean _eeeIsUp;
    private java.lang.Boolean _interfaceIsUp;
    private java.lang.Boolean _linkIsIdle;
    private java.lang.Boolean _linkIsUp;
    private java.lang.Boolean _pmdIsUp;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>> augmentation = Collections.emptyMap();

    public WirebasedInterfaceStatusBuilder() {
    }
    public WirebasedInterfaceStatusBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG arg) {
        this._interfaceIsUp = arg.isInterfaceIsUp();
        this._receiveSignalIsDetected = arg.getReceiveSignalIsDetected();
        this._pmdIsUp = arg.isPmdIsUp();
        this._pmdCur = arg.getPmdCur();
        this._signalOrderingKindCur = arg.getSignalOrderingKindCur();
        this._eeeIsUp = arg.isEeeIsUp();
        this._linkIsUp = arg.isLinkIsUp();
        this._linkIsIdle = arg.isLinkIsIdle();
        this._txLevelCur = arg.getTxLevelCur();
        this._rxLevelCur = arg.getRxLevelCur();
        this._tempCur = arg.getTempCur();
        this._loopBackKindUp = arg.getLoopBackKindUp();
    }

    public WirebasedInterfaceStatusBuilder(WirebasedInterfaceStatus base) {
        this._loopBackKindUp = base.getLoopBackKindUp();
        this._pmdCur = base.getPmdCur();
        this._receiveSignalIsDetected = base.getReceiveSignalIsDetected();
        this._rxLevelCur = base.getRxLevelCur();
        this._signalOrderingKindCur = base.getSignalOrderingKindCur();
        this._tempCur = base.getTempCur();
        this._txLevelCur = base.getTxLevelCur();
        this._eeeIsUp = base.isEeeIsUp();
        this._interfaceIsUp = base.isInterfaceIsUp();
        this._linkIsIdle = base.isLinkIsIdle();
        this._linkIsUp = base.isLinkIsUp();
        this._pmdIsUp = base.isPmdIsUp();
        if (base instanceof WirebasedInterfaceStatusImpl) {
            WirebasedInterfaceStatusImpl impl = (WirebasedInterfaceStatusImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG) {
            this._interfaceIsUp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG)arg).isInterfaceIsUp();
            this._receiveSignalIsDetected = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG)arg).getReceiveSignalIsDetected();
            this._pmdIsUp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG)arg).isPmdIsUp();
            this._pmdCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG)arg).getPmdCur();
            this._signalOrderingKindCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG)arg).getSignalOrderingKindCur();
            this._eeeIsUp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG)arg).isEeeIsUp();
            this._linkIsUp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG)arg).isLinkIsUp();
            this._linkIsIdle = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG)arg).isLinkIsIdle();
            this._txLevelCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG)arg).getTxLevelCur();
            this._rxLevelCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG)arg).getRxLevelCur();
            this._tempCur = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG)arg).getTempCur();
            this._loopBackKindUp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG)arg).getLoopBackKindUp();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG] \n" +
              "but was: " + arg
            );
        }
    }

    public LoopBackType getLoopBackKindUp() {
        return _loopBackKindUp;
    }
    
    public PmdNameType getPmdCur() {
        return _pmdCur;
    }
    
    public List<java.lang.Boolean> getReceiveSignalIsDetected() {
        return _receiveSignalIsDetected;
    }
    
    public List<java.lang.Byte> getRxLevelCur() {
        return _rxLevelCur;
    }
    
    public SignalOrderingKindCur getSignalOrderingKindCur() {
        return _signalOrderingKindCur;
    }
    
    public java.lang.Byte getTempCur() {
        return _tempCur;
    }
    
    public java.lang.Byte getTxLevelCur() {
        return _txLevelCur;
    }
    
    public java.lang.Boolean isEeeIsUp() {
        return _eeeIsUp;
    }
    
    public java.lang.Boolean isInterfaceIsUp() {
        return _interfaceIsUp;
    }
    
    public java.lang.Boolean isLinkIsIdle() {
        return _linkIsIdle;
    }
    
    public java.lang.Boolean isLinkIsUp() {
        return _linkIsUp;
    }
    
    public java.lang.Boolean isPmdIsUp() {
        return _pmdIsUp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public WirebasedInterfaceStatusBuilder setLoopBackKindUp(final LoopBackType value) {
        this._loopBackKindUp = value;
        return this;
    }
    
     
    public WirebasedInterfaceStatusBuilder setPmdCur(final PmdNameType value) {
        this._pmdCur = value;
        return this;
    }
    
     
    public WirebasedInterfaceStatusBuilder setReceiveSignalIsDetected(final List<java.lang.Boolean> value) {
        this._receiveSignalIsDetected = value;
        return this;
    }
    
     
    public WirebasedInterfaceStatusBuilder setRxLevelCur(final List<java.lang.Byte> value) {
        this._rxLevelCur = value;
        return this;
    }
    
     
    public WirebasedInterfaceStatusBuilder setSignalOrderingKindCur(final SignalOrderingKindCur value) {
        this._signalOrderingKindCur = value;
        return this;
    }
    
     
    public WirebasedInterfaceStatusBuilder setTempCur(final java.lang.Byte value) {
        this._tempCur = value;
        return this;
    }
    
     
    public WirebasedInterfaceStatusBuilder setTxLevelCur(final java.lang.Byte value) {
        this._txLevelCur = value;
        return this;
    }
    
     
    public WirebasedInterfaceStatusBuilder setEeeIsUp(final java.lang.Boolean value) {
        this._eeeIsUp = value;
        return this;
    }
    
     
    public WirebasedInterfaceStatusBuilder setInterfaceIsUp(final java.lang.Boolean value) {
        this._interfaceIsUp = value;
        return this;
    }
    
     
    public WirebasedInterfaceStatusBuilder setLinkIsIdle(final java.lang.Boolean value) {
        this._linkIsIdle = value;
        return this;
    }
    
     
    public WirebasedInterfaceStatusBuilder setLinkIsUp(final java.lang.Boolean value) {
        this._linkIsUp = value;
        return this;
    }
    
     
    public WirebasedInterfaceStatusBuilder setPmdIsUp(final java.lang.Boolean value) {
        this._pmdIsUp = value;
        return this;
    }
    
    public WirebasedInterfaceStatusBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public WirebasedInterfaceStatusBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public WirebasedInterfaceStatus build() {
        return new WirebasedInterfaceStatusImpl(this);
    }

    private static final class WirebasedInterfaceStatusImpl implements WirebasedInterfaceStatus {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus.class;
        }

        private final LoopBackType _loopBackKindUp;
        private final PmdNameType _pmdCur;
        private final List<java.lang.Boolean> _receiveSignalIsDetected;
        private final List<java.lang.Byte> _rxLevelCur;
        private final SignalOrderingKindCur _signalOrderingKindCur;
        private final java.lang.Byte _tempCur;
        private final java.lang.Byte _txLevelCur;
        private final java.lang.Boolean _eeeIsUp;
        private final java.lang.Boolean _interfaceIsUp;
        private final java.lang.Boolean _linkIsIdle;
        private final java.lang.Boolean _linkIsUp;
        private final java.lang.Boolean _pmdIsUp;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>> augmentation = Collections.emptyMap();

        private WirebasedInterfaceStatusImpl(WirebasedInterfaceStatusBuilder base) {
            this._loopBackKindUp = base.getLoopBackKindUp();
            this._pmdCur = base.getPmdCur();
            this._receiveSignalIsDetected = base.getReceiveSignalIsDetected();
            this._rxLevelCur = base.getRxLevelCur();
            this._signalOrderingKindCur = base.getSignalOrderingKindCur();
            this._tempCur = base.getTempCur();
            this._txLevelCur = base.getTxLevelCur();
            this._eeeIsUp = base.isEeeIsUp();
            this._interfaceIsUp = base.isInterfaceIsUp();
            this._linkIsIdle = base.isLinkIsIdle();
            this._linkIsUp = base.isLinkIsUp();
            this._pmdIsUp = base.isPmdIsUp();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public LoopBackType getLoopBackKindUp() {
            return _loopBackKindUp;
        }
        
        @Override
        public PmdNameType getPmdCur() {
            return _pmdCur;
        }
        
        @Override
        public List<java.lang.Boolean> getReceiveSignalIsDetected() {
            return _receiveSignalIsDetected;
        }
        
        @Override
        public List<java.lang.Byte> getRxLevelCur() {
            return _rxLevelCur;
        }
        
        @Override
        public SignalOrderingKindCur getSignalOrderingKindCur() {
            return _signalOrderingKindCur;
        }
        
        @Override
        public java.lang.Byte getTempCur() {
            return _tempCur;
        }
        
        @Override
        public java.lang.Byte getTxLevelCur() {
            return _txLevelCur;
        }
        
        @Override
        public java.lang.Boolean isEeeIsUp() {
            return _eeeIsUp;
        }
        
        @Override
        public java.lang.Boolean isInterfaceIsUp() {
            return _interfaceIsUp;
        }
        
        @Override
        public java.lang.Boolean isLinkIsIdle() {
            return _linkIsIdle;
        }
        
        @Override
        public java.lang.Boolean isLinkIsUp() {
            return _linkIsUp;
        }
        
        @Override
        public java.lang.Boolean isPmdIsUp() {
            return _pmdIsUp;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_loopBackKindUp);
            result = prime * result + Objects.hashCode(_pmdCur);
            result = prime * result + Objects.hashCode(_receiveSignalIsDetected);
            result = prime * result + Objects.hashCode(_rxLevelCur);
            result = prime * result + Objects.hashCode(_signalOrderingKindCur);
            result = prime * result + Objects.hashCode(_tempCur);
            result = prime * result + Objects.hashCode(_txLevelCur);
            result = prime * result + Objects.hashCode(_eeeIsUp);
            result = prime * result + Objects.hashCode(_interfaceIsUp);
            result = prime * result + Objects.hashCode(_linkIsIdle);
            result = prime * result + Objects.hashCode(_linkIsUp);
            result = prime * result + Objects.hashCode(_pmdIsUp);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus)obj;
            if (!Objects.equals(_loopBackKindUp, other.getLoopBackKindUp())) {
                return false;
            }
            if (!Objects.equals(_pmdCur, other.getPmdCur())) {
                return false;
            }
            if (!Objects.equals(_receiveSignalIsDetected, other.getReceiveSignalIsDetected())) {
                return false;
            }
            if (!Objects.equals(_rxLevelCur, other.getRxLevelCur())) {
                return false;
            }
            if (!Objects.equals(_signalOrderingKindCur, other.getSignalOrderingKindCur())) {
                return false;
            }
            if (!Objects.equals(_tempCur, other.getTempCur())) {
                return false;
            }
            if (!Objects.equals(_txLevelCur, other.getTxLevelCur())) {
                return false;
            }
            if (!Objects.equals(_eeeIsUp, other.isEeeIsUp())) {
                return false;
            }
            if (!Objects.equals(_interfaceIsUp, other.isInterfaceIsUp())) {
                return false;
            }
            if (!Objects.equals(_linkIsIdle, other.isLinkIsIdle())) {
                return false;
            }
            if (!Objects.equals(_linkIsUp, other.isLinkIsUp())) {
                return false;
            }
            if (!Objects.equals(_pmdIsUp, other.isPmdIsUp())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                WirebasedInterfaceStatusImpl otherImpl = (WirebasedInterfaceStatusImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus>> e : augmentation.entrySet()) {
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
            java.lang.String name = "WirebasedInterfaceStatus [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_loopBackKindUp != null) {
                builder.append("_loopBackKindUp=");
                builder.append(_loopBackKindUp);
                builder.append(", ");
            }
            if (_pmdCur != null) {
                builder.append("_pmdCur=");
                builder.append(_pmdCur);
                builder.append(", ");
            }
            if (_receiveSignalIsDetected != null) {
                builder.append("_receiveSignalIsDetected=");
                builder.append(_receiveSignalIsDetected);
                builder.append(", ");
            }
            if (_rxLevelCur != null) {
                builder.append("_rxLevelCur=");
                builder.append(_rxLevelCur);
                builder.append(", ");
            }
            if (_signalOrderingKindCur != null) {
                builder.append("_signalOrderingKindCur=");
                builder.append(_signalOrderingKindCur);
                builder.append(", ");
            }
            if (_tempCur != null) {
                builder.append("_tempCur=");
                builder.append(_tempCur);
                builder.append(", ");
            }
            if (_txLevelCur != null) {
                builder.append("_txLevelCur=");
                builder.append(_txLevelCur);
                builder.append(", ");
            }
            if (_eeeIsUp != null) {
                builder.append("_eeeIsUp=");
                builder.append(_eeeIsUp);
                builder.append(", ");
            }
            if (_interfaceIsUp != null) {
                builder.append("_interfaceIsUp=");
                builder.append(_interfaceIsUp);
                builder.append(", ");
            }
            if (_linkIsIdle != null) {
                builder.append("_linkIsIdle=");
                builder.append(_linkIsIdle);
                builder.append(", ");
            }
            if (_linkIsUp != null) {
                builder.append("_linkIsUp=");
                builder.append(_linkIsUp);
                builder.append(", ");
            }
            if (_pmdIsUp != null) {
                builder.append("_pmdIsUp=");
                builder.append(_pmdIsUp);
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
