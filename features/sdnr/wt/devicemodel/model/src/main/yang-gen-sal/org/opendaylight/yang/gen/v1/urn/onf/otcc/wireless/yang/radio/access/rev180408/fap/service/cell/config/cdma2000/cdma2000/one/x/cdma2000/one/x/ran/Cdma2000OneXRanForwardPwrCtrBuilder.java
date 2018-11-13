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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr
 *
 */
public class Cdma2000OneXRanForwardPwrCtrBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr> {

    private java.lang.Long _fpcSubchanGain;
    private java.lang.Long _fpcfchInitSetpt;
    private java.lang.Long _fpcfchMaxSetpt;
    private java.lang.Long _fpcfchMinSetpt;
    private java.lang.Short _fpcfchfer;
    private java.lang.Long _rlGainAdj;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>> augmentation = Collections.emptyMap();

    public Cdma2000OneXRanForwardPwrCtrBuilder() {
    }
    public Cdma2000OneXRanForwardPwrCtrBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanForwardPwrCtrG arg) {
        this._fpcfchInitSetpt = arg.getFpcfchInitSetpt();
        this._fpcSubchanGain = arg.getFpcSubchanGain();
        this._rlGainAdj = arg.getRlGainAdj();
        this._fpcfchfer = arg.getFpcfchfer();
        this._fpcfchMinSetpt = arg.getFpcfchMinSetpt();
        this._fpcfchMaxSetpt = arg.getFpcfchMaxSetpt();
    }

    public Cdma2000OneXRanForwardPwrCtrBuilder(Cdma2000OneXRanForwardPwrCtr base) {
        this._fpcSubchanGain = base.getFpcSubchanGain();
        this._fpcfchInitSetpt = base.getFpcfchInitSetpt();
        this._fpcfchMaxSetpt = base.getFpcfchMaxSetpt();
        this._fpcfchMinSetpt = base.getFpcfchMinSetpt();
        this._fpcfchfer = base.getFpcfchfer();
        this._rlGainAdj = base.getRlGainAdj();
        if (base instanceof Cdma2000OneXRanForwardPwrCtrImpl) {
            Cdma2000OneXRanForwardPwrCtrImpl impl = (Cdma2000OneXRanForwardPwrCtrImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanForwardPwrCtrG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanForwardPwrCtrG) {
            this._fpcfchInitSetpt = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanForwardPwrCtrG)arg).getFpcfchInitSetpt();
            this._fpcSubchanGain = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanForwardPwrCtrG)arg).getFpcSubchanGain();
            this._rlGainAdj = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanForwardPwrCtrG)arg).getRlGainAdj();
            this._fpcfchfer = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanForwardPwrCtrG)arg).getFpcfchfer();
            this._fpcfchMinSetpt = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanForwardPwrCtrG)arg).getFpcfchMinSetpt();
            this._fpcfchMaxSetpt = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanForwardPwrCtrG)arg).getFpcfchMaxSetpt();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanForwardPwrCtrG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getFpcSubchanGain() {
        return _fpcSubchanGain;
    }
    
    public java.lang.Long getFpcfchInitSetpt() {
        return _fpcfchInitSetpt;
    }
    
    public java.lang.Long getFpcfchMaxSetpt() {
        return _fpcfchMaxSetpt;
    }
    
    public java.lang.Long getFpcfchMinSetpt() {
        return _fpcfchMinSetpt;
    }
    
    public java.lang.Short getFpcfchfer() {
        return _fpcfchfer;
    }
    
    public java.lang.Long getRlGainAdj() {
        return _rlGainAdj;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public Cdma2000OneXRanForwardPwrCtrBuilder setFpcSubchanGain(final java.lang.Long value) {
        this._fpcSubchanGain = value;
        return this;
    }
    
     
    public Cdma2000OneXRanForwardPwrCtrBuilder setFpcfchInitSetpt(final java.lang.Long value) {
        this._fpcfchInitSetpt = value;
        return this;
    }
    
     
    public Cdma2000OneXRanForwardPwrCtrBuilder setFpcfchMaxSetpt(final java.lang.Long value) {
        this._fpcfchMaxSetpt = value;
        return this;
    }
    
     
    public Cdma2000OneXRanForwardPwrCtrBuilder setFpcfchMinSetpt(final java.lang.Long value) {
        this._fpcfchMinSetpt = value;
        return this;
    }
    
     
     private static void checkFpcfchferRange(final short value) {
         if (value >= (short)0 && value <= (short)31) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..31]].", value));
     }
    
    public Cdma2000OneXRanForwardPwrCtrBuilder setFpcfchfer(final java.lang.Short value) {
    if (value != null) {
        checkFpcfchferRange(value);
    }
        this._fpcfchfer = value;
        return this;
    }
    
     
    public Cdma2000OneXRanForwardPwrCtrBuilder setRlGainAdj(final java.lang.Long value) {
        this._rlGainAdj = value;
        return this;
    }
    
    public Cdma2000OneXRanForwardPwrCtrBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXRanForwardPwrCtrBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXRanForwardPwrCtr build() {
        return new Cdma2000OneXRanForwardPwrCtrImpl(this);
    }

    private static final class Cdma2000OneXRanForwardPwrCtrImpl implements Cdma2000OneXRanForwardPwrCtr {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr.class;
        }

        private final java.lang.Long _fpcSubchanGain;
        private final java.lang.Long _fpcfchInitSetpt;
        private final java.lang.Long _fpcfchMaxSetpt;
        private final java.lang.Long _fpcfchMinSetpt;
        private final java.lang.Short _fpcfchfer;
        private final java.lang.Long _rlGainAdj;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>> augmentation = Collections.emptyMap();

        private Cdma2000OneXRanForwardPwrCtrImpl(Cdma2000OneXRanForwardPwrCtrBuilder base) {
            this._fpcSubchanGain = base.getFpcSubchanGain();
            this._fpcfchInitSetpt = base.getFpcfchInitSetpt();
            this._fpcfchMaxSetpt = base.getFpcfchMaxSetpt();
            this._fpcfchMinSetpt = base.getFpcfchMinSetpt();
            this._fpcfchfer = base.getFpcfchfer();
            this._rlGainAdj = base.getRlGainAdj();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getFpcSubchanGain() {
            return _fpcSubchanGain;
        }
        
        @Override
        public java.lang.Long getFpcfchInitSetpt() {
            return _fpcfchInitSetpt;
        }
        
        @Override
        public java.lang.Long getFpcfchMaxSetpt() {
            return _fpcfchMaxSetpt;
        }
        
        @Override
        public java.lang.Long getFpcfchMinSetpt() {
            return _fpcfchMinSetpt;
        }
        
        @Override
        public java.lang.Short getFpcfchfer() {
            return _fpcfchfer;
        }
        
        @Override
        public java.lang.Long getRlGainAdj() {
            return _rlGainAdj;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_fpcSubchanGain);
            result = prime * result + Objects.hashCode(_fpcfchInitSetpt);
            result = prime * result + Objects.hashCode(_fpcfchMaxSetpt);
            result = prime * result + Objects.hashCode(_fpcfchMinSetpt);
            result = prime * result + Objects.hashCode(_fpcfchfer);
            result = prime * result + Objects.hashCode(_rlGainAdj);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr)obj;
            if (!Objects.equals(_fpcSubchanGain, other.getFpcSubchanGain())) {
                return false;
            }
            if (!Objects.equals(_fpcfchInitSetpt, other.getFpcfchInitSetpt())) {
                return false;
            }
            if (!Objects.equals(_fpcfchMaxSetpt, other.getFpcfchMaxSetpt())) {
                return false;
            }
            if (!Objects.equals(_fpcfchMinSetpt, other.getFpcfchMinSetpt())) {
                return false;
            }
            if (!Objects.equals(_fpcfchfer, other.getFpcfchfer())) {
                return false;
            }
            if (!Objects.equals(_rlGainAdj, other.getRlGainAdj())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXRanForwardPwrCtrImpl otherImpl = (Cdma2000OneXRanForwardPwrCtrImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanForwardPwrCtr>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXRanForwardPwrCtr [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_fpcSubchanGain != null) {
                builder.append("_fpcSubchanGain=");
                builder.append(_fpcSubchanGain);
                builder.append(", ");
            }
            if (_fpcfchInitSetpt != null) {
                builder.append("_fpcfchInitSetpt=");
                builder.append(_fpcfchInitSetpt);
                builder.append(", ");
            }
            if (_fpcfchMaxSetpt != null) {
                builder.append("_fpcfchMaxSetpt=");
                builder.append(_fpcfchMaxSetpt);
                builder.append(", ");
            }
            if (_fpcfchMinSetpt != null) {
                builder.append("_fpcfchMinSetpt=");
                builder.append(_fpcfchMinSetpt);
                builder.append(", ");
            }
            if (_fpcfchfer != null) {
                builder.append("_fpcfchfer=");
                builder.append(_fpcfchfer);
                builder.append(", ");
            }
            if (_rlGainAdj != null) {
                builder.append("_rlGainAdj=");
                builder.append(_rlGainAdj);
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
