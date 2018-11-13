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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx
 *
 */
public class LteRanMacDrxBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx> {

    private List<java.lang.String> _drxInactivityTimer;
    private List<java.lang.Short> _drxRetransmissionTimer;
    private List<java.lang.String> _drxShortCycleTimer;
    private List<java.lang.String> _drxStartOffset;
    private List<java.lang.Integer> _longDrxCycle;
    private List<java.lang.String> _onDurationTimer;
    private List<java.lang.Integer> _shortDrxCycle;
    private java.lang.Boolean _drxEnabled;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>> augmentation = Collections.emptyMap();

    public LteRanMacDrxBuilder() {
    }
    public LteRanMacDrxBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacDrxG arg) {
        this._drxEnabled = arg.isDrxEnabled();
        this._onDurationTimer = arg.getOnDurationTimer();
        this._drxInactivityTimer = arg.getDrxInactivityTimer();
        this._drxRetransmissionTimer = arg.getDrxRetransmissionTimer();
        this._longDrxCycle = arg.getLongDrxCycle();
        this._drxStartOffset = arg.getDrxStartOffset();
        this._shortDrxCycle = arg.getShortDrxCycle();
        this._drxShortCycleTimer = arg.getDrxShortCycleTimer();
    }

    public LteRanMacDrxBuilder(LteRanMacDrx base) {
        this._drxInactivityTimer = base.getDrxInactivityTimer();
        this._drxRetransmissionTimer = base.getDrxRetransmissionTimer();
        this._drxShortCycleTimer = base.getDrxShortCycleTimer();
        this._drxStartOffset = base.getDrxStartOffset();
        this._longDrxCycle = base.getLongDrxCycle();
        this._onDurationTimer = base.getOnDurationTimer();
        this._shortDrxCycle = base.getShortDrxCycle();
        this._drxEnabled = base.isDrxEnabled();
        if (base instanceof LteRanMacDrxImpl) {
            LteRanMacDrxImpl impl = (LteRanMacDrxImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacDrxG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacDrxG) {
            this._drxEnabled = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacDrxG)arg).isDrxEnabled();
            this._onDurationTimer = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacDrxG)arg).getOnDurationTimer();
            this._drxInactivityTimer = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacDrxG)arg).getDrxInactivityTimer();
            this._drxRetransmissionTimer = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacDrxG)arg).getDrxRetransmissionTimer();
            this._longDrxCycle = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacDrxG)arg).getLongDrxCycle();
            this._drxStartOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacDrxG)arg).getDrxStartOffset();
            this._shortDrxCycle = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacDrxG)arg).getShortDrxCycle();
            this._drxShortCycleTimer = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacDrxG)arg).getDrxShortCycleTimer();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacDrxG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.String> getDrxInactivityTimer() {
        return _drxInactivityTimer;
    }
    
    public List<java.lang.Short> getDrxRetransmissionTimer() {
        return _drxRetransmissionTimer;
    }
    
    public List<java.lang.String> getDrxShortCycleTimer() {
        return _drxShortCycleTimer;
    }
    
    public List<java.lang.String> getDrxStartOffset() {
        return _drxStartOffset;
    }
    
    public List<java.lang.Integer> getLongDrxCycle() {
        return _longDrxCycle;
    }
    
    public List<java.lang.String> getOnDurationTimer() {
        return _onDurationTimer;
    }
    
    public List<java.lang.Integer> getShortDrxCycle() {
        return _shortDrxCycle;
    }
    
    public java.lang.Boolean isDrxEnabled() {
        return _drxEnabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanMacDrxBuilder setDrxInactivityTimer(final List<java.lang.String> value) {
        this._drxInactivityTimer = value;
        return this;
    }
    
     
    public LteRanMacDrxBuilder setDrxRetransmissionTimer(final List<java.lang.Short> value) {
        this._drxRetransmissionTimer = value;
        return this;
    }
    
     
    public LteRanMacDrxBuilder setDrxShortCycleTimer(final List<java.lang.String> value) {
        this._drxShortCycleTimer = value;
        return this;
    }
    
     
    public LteRanMacDrxBuilder setDrxStartOffset(final List<java.lang.String> value) {
        this._drxStartOffset = value;
        return this;
    }
    
     
    public LteRanMacDrxBuilder setLongDrxCycle(final List<java.lang.Integer> value) {
        this._longDrxCycle = value;
        return this;
    }
    
     
    public LteRanMacDrxBuilder setOnDurationTimer(final List<java.lang.String> value) {
        this._onDurationTimer = value;
        return this;
    }
    
     
    public LteRanMacDrxBuilder setShortDrxCycle(final List<java.lang.Integer> value) {
        this._shortDrxCycle = value;
        return this;
    }
    
     
    public LteRanMacDrxBuilder setDrxEnabled(final java.lang.Boolean value) {
        this._drxEnabled = value;
        return this;
    }
    
    public LteRanMacDrxBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMacDrxBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMacDrx build() {
        return new LteRanMacDrxImpl(this);
    }

    private static final class LteRanMacDrxImpl implements LteRanMacDrx {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx.class;
        }

        private final List<java.lang.String> _drxInactivityTimer;
        private final List<java.lang.Short> _drxRetransmissionTimer;
        private final List<java.lang.String> _drxShortCycleTimer;
        private final List<java.lang.String> _drxStartOffset;
        private final List<java.lang.Integer> _longDrxCycle;
        private final List<java.lang.String> _onDurationTimer;
        private final List<java.lang.Integer> _shortDrxCycle;
        private final java.lang.Boolean _drxEnabled;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>> augmentation = Collections.emptyMap();

        private LteRanMacDrxImpl(LteRanMacDrxBuilder base) {
            this._drxInactivityTimer = base.getDrxInactivityTimer();
            this._drxRetransmissionTimer = base.getDrxRetransmissionTimer();
            this._drxShortCycleTimer = base.getDrxShortCycleTimer();
            this._drxStartOffset = base.getDrxStartOffset();
            this._longDrxCycle = base.getLongDrxCycle();
            this._onDurationTimer = base.getOnDurationTimer();
            this._shortDrxCycle = base.getShortDrxCycle();
            this._drxEnabled = base.isDrxEnabled();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.String> getDrxInactivityTimer() {
            return _drxInactivityTimer;
        }
        
        @Override
        public List<java.lang.Short> getDrxRetransmissionTimer() {
            return _drxRetransmissionTimer;
        }
        
        @Override
        public List<java.lang.String> getDrxShortCycleTimer() {
            return _drxShortCycleTimer;
        }
        
        @Override
        public List<java.lang.String> getDrxStartOffset() {
            return _drxStartOffset;
        }
        
        @Override
        public List<java.lang.Integer> getLongDrxCycle() {
            return _longDrxCycle;
        }
        
        @Override
        public List<java.lang.String> getOnDurationTimer() {
            return _onDurationTimer;
        }
        
        @Override
        public List<java.lang.Integer> getShortDrxCycle() {
            return _shortDrxCycle;
        }
        
        @Override
        public java.lang.Boolean isDrxEnabled() {
            return _drxEnabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_drxInactivityTimer);
            result = prime * result + Objects.hashCode(_drxRetransmissionTimer);
            result = prime * result + Objects.hashCode(_drxShortCycleTimer);
            result = prime * result + Objects.hashCode(_drxStartOffset);
            result = prime * result + Objects.hashCode(_longDrxCycle);
            result = prime * result + Objects.hashCode(_onDurationTimer);
            result = prime * result + Objects.hashCode(_shortDrxCycle);
            result = prime * result + Objects.hashCode(_drxEnabled);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx)obj;
            if (!Objects.equals(_drxInactivityTimer, other.getDrxInactivityTimer())) {
                return false;
            }
            if (!Objects.equals(_drxRetransmissionTimer, other.getDrxRetransmissionTimer())) {
                return false;
            }
            if (!Objects.equals(_drxShortCycleTimer, other.getDrxShortCycleTimer())) {
                return false;
            }
            if (!Objects.equals(_drxStartOffset, other.getDrxStartOffset())) {
                return false;
            }
            if (!Objects.equals(_longDrxCycle, other.getLongDrxCycle())) {
                return false;
            }
            if (!Objects.equals(_onDurationTimer, other.getOnDurationTimer())) {
                return false;
            }
            if (!Objects.equals(_shortDrxCycle, other.getShortDrxCycle())) {
                return false;
            }
            if (!Objects.equals(_drxEnabled, other.isDrxEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMacDrxImpl otherImpl = (LteRanMacDrxImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacDrx>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMacDrx [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_drxInactivityTimer != null) {
                builder.append("_drxInactivityTimer=");
                builder.append(_drxInactivityTimer);
                builder.append(", ");
            }
            if (_drxRetransmissionTimer != null) {
                builder.append("_drxRetransmissionTimer=");
                builder.append(_drxRetransmissionTimer);
                builder.append(", ");
            }
            if (_drxShortCycleTimer != null) {
                builder.append("_drxShortCycleTimer=");
                builder.append(_drxShortCycleTimer);
                builder.append(", ");
            }
            if (_drxStartOffset != null) {
                builder.append("_drxStartOffset=");
                builder.append(_drxStartOffset);
                builder.append(", ");
            }
            if (_longDrxCycle != null) {
                builder.append("_longDrxCycle=");
                builder.append(_longDrxCycle);
                builder.append(", ");
            }
            if (_onDurationTimer != null) {
                builder.append("_onDurationTimer=");
                builder.append(_onDurationTimer);
                builder.append(", ");
            }
            if (_shortDrxCycle != null) {
                builder.append("_shortDrxCycle=");
                builder.append(_shortDrxCycle);
                builder.append(", ");
            }
            if (_drxEnabled != null) {
                builder.append("_drxEnabled=");
                builder.append(_drxEnabled);
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
