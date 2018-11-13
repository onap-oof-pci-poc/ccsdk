package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl
 *
 */
public class Cdma2000OneXRanPowerControlBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl> {

    private java.lang.Long _oneXPwrThreshEnable;
    private java.lang.Long _oneXpcPwrPeriodEnable;
    private java.lang.Short _oneXpcPwrRepDelay;
    private java.lang.Short _oneXpcPwrRepFrames;
    private java.lang.Short _oneXpcPwrRepThresh;
    private java.lang.Long _oneXpcfchChanAdjGain;
    private java.lang.Long _oneXpcfpcIncl;
    private java.lang.Long _oneXpcfpcfchMaxSetpt;
    private java.lang.Long _oneXpcfpcfchMinSetpt;
    private java.lang.Long _oneXpcrpcIncl;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanPowerControlBuilder() {
    }
    public Cdma2000OneXRanPowerControlBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG arg) {
        this._oneXpcfpcIncl = arg.getOneXpcfpcIncl();
        this._oneXpcfpcfchMinSetpt = arg.getOneXpcfpcfchMinSetpt();
        this._oneXpcfpcfchMaxSetpt = arg.getOneXpcfpcfchMaxSetpt();
        this._oneXpcrpcIncl = arg.getOneXpcrpcIncl();
        this._oneXpcfchChanAdjGain = arg.getOneXpcfchChanAdjGain();
        this._oneXpcPwrRepThresh = arg.getOneXpcPwrRepThresh();
        this._oneXpcPwrRepFrames = arg.getOneXpcPwrRepFrames();
        this._oneXPwrThreshEnable = arg.getOneXPwrThreshEnable();
        this._oneXpcPwrPeriodEnable = arg.getOneXpcPwrPeriodEnable();
        this._oneXpcPwrRepDelay = arg.getOneXpcPwrRepDelay();
    }

    public Cdma2000OneXRanPowerControlBuilder(Cdma2000OneXRanPowerControl base) {
        this._oneXPwrThreshEnable = base.getOneXPwrThreshEnable();
        this._oneXpcPwrPeriodEnable = base.getOneXpcPwrPeriodEnable();
        this._oneXpcPwrRepDelay = base.getOneXpcPwrRepDelay();
        this._oneXpcPwrRepFrames = base.getOneXpcPwrRepFrames();
        this._oneXpcPwrRepThresh = base.getOneXpcPwrRepThresh();
        this._oneXpcfchChanAdjGain = base.getOneXpcfchChanAdjGain();
        this._oneXpcfpcIncl = base.getOneXpcfpcIncl();
        this._oneXpcfpcfchMaxSetpt = base.getOneXpcfpcfchMaxSetpt();
        this._oneXpcfpcfchMinSetpt = base.getOneXpcfpcfchMinSetpt();
        this._oneXpcrpcIncl = base.getOneXpcrpcIncl();
        if (base instanceof Cdma2000OneXRanPowerControlImpl) {
            Cdma2000OneXRanPowerControlImpl impl = (Cdma2000OneXRanPowerControlImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG) {
            this._oneXpcfpcIncl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG)arg).getOneXpcfpcIncl();
            this._oneXpcfpcfchMinSetpt = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG)arg).getOneXpcfpcfchMinSetpt();
            this._oneXpcfpcfchMaxSetpt = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG)arg).getOneXpcfpcfchMaxSetpt();
            this._oneXpcrpcIncl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG)arg).getOneXpcrpcIncl();
            this._oneXpcfchChanAdjGain = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG)arg).getOneXpcfchChanAdjGain();
            this._oneXpcPwrRepThresh = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG)arg).getOneXpcPwrRepThresh();
            this._oneXpcPwrRepFrames = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG)arg).getOneXpcPwrRepFrames();
            this._oneXPwrThreshEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG)arg).getOneXPwrThreshEnable();
            this._oneXpcPwrPeriodEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG)arg).getOneXpcPwrPeriodEnable();
            this._oneXpcPwrRepDelay = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG)arg).getOneXpcPwrRepDelay();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanPowerControlG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getOneXPwrThreshEnable() {
        return _oneXPwrThreshEnable;
    }
    
    public java.lang.Long getOneXpcPwrPeriodEnable() {
        return _oneXpcPwrPeriodEnable;
    }
    
    public java.lang.Short getOneXpcPwrRepDelay() {
        return _oneXpcPwrRepDelay;
    }
    
    public java.lang.Short getOneXpcPwrRepFrames() {
        return _oneXpcPwrRepFrames;
    }
    
    public java.lang.Short getOneXpcPwrRepThresh() {
        return _oneXpcPwrRepThresh;
    }
    
    public java.lang.Long getOneXpcfchChanAdjGain() {
        return _oneXpcfchChanAdjGain;
    }
    
    public java.lang.Long getOneXpcfpcIncl() {
        return _oneXpcfpcIncl;
    }
    
    public java.lang.Long getOneXpcfpcfchMaxSetpt() {
        return _oneXpcfpcfchMaxSetpt;
    }
    
    public java.lang.Long getOneXpcfpcfchMinSetpt() {
        return _oneXpcfpcfchMinSetpt;
    }
    
    public java.lang.Long getOneXpcrpcIncl() {
        return _oneXpcrpcIncl;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public Cdma2000OneXRanPowerControlBuilder setOneXPwrThreshEnable(final java.lang.Long value) {
        this._oneXPwrThreshEnable = value;
        return this;
    }
    
     
    public Cdma2000OneXRanPowerControlBuilder setOneXpcPwrPeriodEnable(final java.lang.Long value) {
        this._oneXpcPwrPeriodEnable = value;
        return this;
    }
    
     
     private static void checkOneXpcPwrRepDelayRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public Cdma2000OneXRanPowerControlBuilder setOneXpcPwrRepDelay(final java.lang.Short value) {
    if (value != null) {
        checkOneXpcPwrRepDelayRange(value);
    }
        this._oneXpcPwrRepDelay = value;
        return this;
    }
    
     
     private static void checkOneXpcPwrRepFramesRange(final short value) {
         if (value >= (short)0 && value <= (short)15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..15]].", value));
     }
    
    public Cdma2000OneXRanPowerControlBuilder setOneXpcPwrRepFrames(final java.lang.Short value) {
    if (value != null) {
        checkOneXpcPwrRepFramesRange(value);
    }
        this._oneXpcPwrRepFrames = value;
        return this;
    }
    
     
     private static void checkOneXpcPwrRepThreshRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public Cdma2000OneXRanPowerControlBuilder setOneXpcPwrRepThresh(final java.lang.Short value) {
    if (value != null) {
        checkOneXpcPwrRepThreshRange(value);
    }
        this._oneXpcPwrRepThresh = value;
        return this;
    }
    
     
    public Cdma2000OneXRanPowerControlBuilder setOneXpcfchChanAdjGain(final java.lang.Long value) {
        this._oneXpcfchChanAdjGain = value;
        return this;
    }
    
     
    public Cdma2000OneXRanPowerControlBuilder setOneXpcfpcIncl(final java.lang.Long value) {
        this._oneXpcfpcIncl = value;
        return this;
    }
    
     
    public Cdma2000OneXRanPowerControlBuilder setOneXpcfpcfchMaxSetpt(final java.lang.Long value) {
        this._oneXpcfpcfchMaxSetpt = value;
        return this;
    }
    
     
    public Cdma2000OneXRanPowerControlBuilder setOneXpcfpcfchMinSetpt(final java.lang.Long value) {
        this._oneXpcfpcfchMinSetpt = value;
        return this;
    }
    
     
    public Cdma2000OneXRanPowerControlBuilder setOneXpcrpcIncl(final java.lang.Long value) {
        this._oneXpcrpcIncl = value;
        return this;
    }
    
    public Cdma2000OneXRanPowerControlBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanPowerControlBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRanPowerControl build() {
        return new Cdma2000OneXRanPowerControlImpl(this);
    }

    private static final class Cdma2000OneXRanPowerControlImpl implements Cdma2000OneXRanPowerControl {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl.class;
        }

        private final java.lang.Long _oneXPwrThreshEnable;
        private final java.lang.Long _oneXpcPwrPeriodEnable;
        private final java.lang.Short _oneXpcPwrRepDelay;
        private final java.lang.Short _oneXpcPwrRepFrames;
        private final java.lang.Short _oneXpcPwrRepThresh;
        private final java.lang.Long _oneXpcfchChanAdjGain;
        private final java.lang.Long _oneXpcfpcIncl;
        private final java.lang.Long _oneXpcfpcfchMaxSetpt;
        private final java.lang.Long _oneXpcfpcfchMinSetpt;
        private final java.lang.Long _oneXpcrpcIncl;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanPowerControlImpl(Cdma2000OneXRanPowerControlBuilder base) {
            this._oneXPwrThreshEnable = base.getOneXPwrThreshEnable();
            this._oneXpcPwrPeriodEnable = base.getOneXpcPwrPeriodEnable();
            this._oneXpcPwrRepDelay = base.getOneXpcPwrRepDelay();
            this._oneXpcPwrRepFrames = base.getOneXpcPwrRepFrames();
            this._oneXpcPwrRepThresh = base.getOneXpcPwrRepThresh();
            this._oneXpcfchChanAdjGain = base.getOneXpcfchChanAdjGain();
            this._oneXpcfpcIncl = base.getOneXpcfpcIncl();
            this._oneXpcfpcfchMaxSetpt = base.getOneXpcfpcfchMaxSetpt();
            this._oneXpcfpcfchMinSetpt = base.getOneXpcfpcfchMinSetpt();
            this._oneXpcrpcIncl = base.getOneXpcrpcIncl();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getOneXPwrThreshEnable() {
            return _oneXPwrThreshEnable;
        }
        
        @Override
        public java.lang.Long getOneXpcPwrPeriodEnable() {
            return _oneXpcPwrPeriodEnable;
        }
        
        @Override
        public java.lang.Short getOneXpcPwrRepDelay() {
            return _oneXpcPwrRepDelay;
        }
        
        @Override
        public java.lang.Short getOneXpcPwrRepFrames() {
            return _oneXpcPwrRepFrames;
        }
        
        @Override
        public java.lang.Short getOneXpcPwrRepThresh() {
            return _oneXpcPwrRepThresh;
        }
        
        @Override
        public java.lang.Long getOneXpcfchChanAdjGain() {
            return _oneXpcfchChanAdjGain;
        }
        
        @Override
        public java.lang.Long getOneXpcfpcIncl() {
            return _oneXpcfpcIncl;
        }
        
        @Override
        public java.lang.Long getOneXpcfpcfchMaxSetpt() {
            return _oneXpcfpcfchMaxSetpt;
        }
        
        @Override
        public java.lang.Long getOneXpcfpcfchMinSetpt() {
            return _oneXpcfpcfchMinSetpt;
        }
        
        @Override
        public java.lang.Long getOneXpcrpcIncl() {
            return _oneXpcrpcIncl;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_oneXPwrThreshEnable);
            result = prime * result + Objects.hashCode(_oneXpcPwrPeriodEnable);
            result = prime * result + Objects.hashCode(_oneXpcPwrRepDelay);
            result = prime * result + Objects.hashCode(_oneXpcPwrRepFrames);
            result = prime * result + Objects.hashCode(_oneXpcPwrRepThresh);
            result = prime * result + Objects.hashCode(_oneXpcfchChanAdjGain);
            result = prime * result + Objects.hashCode(_oneXpcfpcIncl);
            result = prime * result + Objects.hashCode(_oneXpcfpcfchMaxSetpt);
            result = prime * result + Objects.hashCode(_oneXpcfpcfchMinSetpt);
            result = prime * result + Objects.hashCode(_oneXpcrpcIncl);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl)obj;
            if (!Objects.equals(_oneXPwrThreshEnable, other.getOneXPwrThreshEnable())) {
                return false;
            }
            if (!Objects.equals(_oneXpcPwrPeriodEnable, other.getOneXpcPwrPeriodEnable())) {
                return false;
            }
            if (!Objects.equals(_oneXpcPwrRepDelay, other.getOneXpcPwrRepDelay())) {
                return false;
            }
            if (!Objects.equals(_oneXpcPwrRepFrames, other.getOneXpcPwrRepFrames())) {
                return false;
            }
            if (!Objects.equals(_oneXpcPwrRepThresh, other.getOneXpcPwrRepThresh())) {
                return false;
            }
            if (!Objects.equals(_oneXpcfchChanAdjGain, other.getOneXpcfchChanAdjGain())) {
                return false;
            }
            if (!Objects.equals(_oneXpcfpcIncl, other.getOneXpcfpcIncl())) {
                return false;
            }
            if (!Objects.equals(_oneXpcfpcfchMaxSetpt, other.getOneXpcfpcfchMaxSetpt())) {
                return false;
            }
            if (!Objects.equals(_oneXpcfpcfchMinSetpt, other.getOneXpcfpcfchMinSetpt())) {
                return false;
            }
            if (!Objects.equals(_oneXpcrpcIncl, other.getOneXpcrpcIncl())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanPowerControlImpl otherImpl = (Cdma2000OneXRanPowerControlImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanPowerControl>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXRanPowerControl [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_oneXPwrThreshEnable != null) {
                builder.append("_oneXPwrThreshEnable=");
                builder.append(_oneXPwrThreshEnable);
                builder.append(", ");
            }
            if (_oneXpcPwrPeriodEnable != null) {
                builder.append("_oneXpcPwrPeriodEnable=");
                builder.append(_oneXpcPwrPeriodEnable);
                builder.append(", ");
            }
            if (_oneXpcPwrRepDelay != null) {
                builder.append("_oneXpcPwrRepDelay=");
                builder.append(_oneXpcPwrRepDelay);
                builder.append(", ");
            }
            if (_oneXpcPwrRepFrames != null) {
                builder.append("_oneXpcPwrRepFrames=");
                builder.append(_oneXpcPwrRepFrames);
                builder.append(", ");
            }
            if (_oneXpcPwrRepThresh != null) {
                builder.append("_oneXpcPwrRepThresh=");
                builder.append(_oneXpcPwrRepThresh);
                builder.append(", ");
            }
            if (_oneXpcfchChanAdjGain != null) {
                builder.append("_oneXpcfchChanAdjGain=");
                builder.append(_oneXpcfchChanAdjGain);
                builder.append(", ");
            }
            if (_oneXpcfpcIncl != null) {
                builder.append("_oneXpcfpcIncl=");
                builder.append(_oneXpcfpcIncl);
                builder.append(", ");
            }
            if (_oneXpcfpcfchMaxSetpt != null) {
                builder.append("_oneXpcfpcfchMaxSetpt=");
                builder.append(_oneXpcfpcfchMaxSetpt);
                builder.append(", ");
            }
            if (_oneXpcfpcfchMinSetpt != null) {
                builder.append("_oneXpcfpcfchMinSetpt=");
                builder.append(_oneXpcfpcfchMinSetpt);
                builder.append(", ");
            }
            if (_oneXpcrpcIncl != null) {
                builder.append("_oneXpcrpcIncl=");
                builder.append(_oneXpcrpcIncl);
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
