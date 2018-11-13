package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch
 *
 */
public class LteRanMacUlschBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch> {

    private java.lang.Short _maxHarqTx;
    private java.lang.Integer _periodicBsrTimer;
    private java.lang.Integer _retxBsrTimer;
    private java.lang.Boolean _ttiBundling;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>> augmentation = Collections.emptyMap();

    public LteRanMacUlschBuilder() {
    }
    public LteRanMacUlschBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacUlschG arg) {
        this._maxHarqTx = arg.getMaxHarqTx();
        this._periodicBsrTimer = arg.getPeriodicBsrTimer();
        this._retxBsrTimer = arg.getRetxBsrTimer();
        this._ttiBundling = arg.isTtiBundling();
    }

    public LteRanMacUlschBuilder(LteRanMacUlsch base) {
        this._maxHarqTx = base.getMaxHarqTx();
        this._periodicBsrTimer = base.getPeriodicBsrTimer();
        this._retxBsrTimer = base.getRetxBsrTimer();
        this._ttiBundling = base.isTtiBundling();
        if (base instanceof LteRanMacUlschImpl) {
            LteRanMacUlschImpl impl = (LteRanMacUlschImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacUlschG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacUlschG) {
            this._maxHarqTx = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacUlschG)arg).getMaxHarqTx();
            this._periodicBsrTimer = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacUlschG)arg).getPeriodicBsrTimer();
            this._retxBsrTimer = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacUlschG)arg).getRetxBsrTimer();
            this._ttiBundling = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacUlschG)arg).isTtiBundling();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMacUlschG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getMaxHarqTx() {
        return _maxHarqTx;
    }
    
    public java.lang.Integer getPeriodicBsrTimer() {
        return _periodicBsrTimer;
    }
    
    public java.lang.Integer getRetxBsrTimer() {
        return _retxBsrTimer;
    }
    
    public java.lang.Boolean isTtiBundling() {
        return _ttiBundling;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkMaxHarqTxRange(final short value) {
         if (value >= (short)1 && value <= (short)8) {
             return;
         }
         if (value >= (short)10 && value <= (short)10) {
             return;
         }
         if (value >= (short)12 && value <= (short)12) {
             return;
         }
         if (value >= (short)16 && value <= (short)16) {
             return;
         }
         if (value >= (short)20 && value <= (short)20) {
             return;
         }
         if (value >= (short)24 && value <= (short)24) {
             return;
         }
         if (value >= (short)28 && value <= (short)28) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..8], [10..10], [12..12], [16..16], [20..20], [24..24], [28..28]].", value));
     }
    
    public LteRanMacUlschBuilder setMaxHarqTx(final java.lang.Short value) {
    if (value != null) {
        checkMaxHarqTxRange(value);
    }
        this._maxHarqTx = value;
        return this;
    }
    
     
     private static void checkPeriodicBsrTimerRange(final int value) {
         if (value >= 0 && value <= 0) {
             return;
         }
         if (value >= 5 && value <= 5) {
             return;
         }
         if (value >= 10 && value <= 10) {
             return;
         }
         if (value >= 16 && value <= 16) {
             return;
         }
         if (value >= 20 && value <= 20) {
             return;
         }
         if (value >= 32 && value <= 32) {
             return;
         }
         if (value >= 40 && value <= 40) {
             return;
         }
         if (value >= 64 && value <= 64) {
             return;
         }
         if (value >= 80 && value <= 80) {
             return;
         }
         if (value >= 128 && value <= 128) {
             return;
         }
         if (value >= 160 && value <= 160) {
             return;
         }
         if (value >= 320 && value <= 320) {
             return;
         }
         if (value >= 640 && value <= 640) {
             return;
         }
         if (value >= 1280 && value <= 1280) {
             return;
         }
         if (value >= 2560 && value <= 2560) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..0], [5..5], [10..10], [16..16], [20..20], [32..32], [40..40], [64..64], [80..80], [128..128], [160..160], [320..320], [640..640], [1280..1280], [2560..2560]].", value));
     }
    
    public LteRanMacUlschBuilder setPeriodicBsrTimer(final java.lang.Integer value) {
    if (value != null) {
        checkPeriodicBsrTimerRange(value);
    }
        this._periodicBsrTimer = value;
        return this;
    }
    
     
     private static void checkRetxBsrTimerRange(final int value) {
         if (value >= 320 && value <= 320) {
             return;
         }
         if (value >= 640 && value <= 640) {
             return;
         }
         if (value >= 1280 && value <= 1280) {
             return;
         }
         if (value >= 2560 && value <= 2560) {
             return;
         }
         if (value >= 5120 && value <= 5120) {
             return;
         }
         if (value >= 10240 && value <= 10240) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[320..320], [640..640], [1280..1280], [2560..2560], [5120..5120], [10240..10240]].", value));
     }
    
    public LteRanMacUlschBuilder setRetxBsrTimer(final java.lang.Integer value) {
    if (value != null) {
        checkRetxBsrTimerRange(value);
    }
        this._retxBsrTimer = value;
        return this;
    }
    
     
    public LteRanMacUlschBuilder setTtiBundling(final java.lang.Boolean value) {
        this._ttiBundling = value;
        return this;
    }
    
    public LteRanMacUlschBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMacUlschBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMacUlsch build() {
        return new LteRanMacUlschImpl(this);
    }

    private static final class LteRanMacUlschImpl implements LteRanMacUlsch {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch.class;
        }

        private final java.lang.Short _maxHarqTx;
        private final java.lang.Integer _periodicBsrTimer;
        private final java.lang.Integer _retxBsrTimer;
        private final java.lang.Boolean _ttiBundling;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>> augmentation = Collections.emptyMap();

        private LteRanMacUlschImpl(LteRanMacUlschBuilder base) {
            this._maxHarqTx = base.getMaxHarqTx();
            this._periodicBsrTimer = base.getPeriodicBsrTimer();
            this._retxBsrTimer = base.getRetxBsrTimer();
            this._ttiBundling = base.isTtiBundling();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getMaxHarqTx() {
            return _maxHarqTx;
        }
        
        @Override
        public java.lang.Integer getPeriodicBsrTimer() {
            return _periodicBsrTimer;
        }
        
        @Override
        public java.lang.Integer getRetxBsrTimer() {
            return _retxBsrTimer;
        }
        
        @Override
        public java.lang.Boolean isTtiBundling() {
            return _ttiBundling;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_maxHarqTx);
            result = prime * result + Objects.hashCode(_periodicBsrTimer);
            result = prime * result + Objects.hashCode(_retxBsrTimer);
            result = prime * result + Objects.hashCode(_ttiBundling);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch)obj;
            if (!Objects.equals(_maxHarqTx, other.getMaxHarqTx())) {
                return false;
            }
            if (!Objects.equals(_periodicBsrTimer, other.getPeriodicBsrTimer())) {
                return false;
            }
            if (!Objects.equals(_retxBsrTimer, other.getRetxBsrTimer())) {
                return false;
            }
            if (!Objects.equals(_ttiBundling, other.isTtiBundling())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMacUlschImpl otherImpl = (LteRanMacUlschImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mac.LteRanMacUlsch>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMacUlsch [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_maxHarqTx != null) {
                builder.append("_maxHarqTx=");
                builder.append(_maxHarqTx);
                builder.append(", ");
            }
            if (_periodicBsrTimer != null) {
                builder.append("_periodicBsrTimer=");
                builder.append(_periodicBsrTimer);
                builder.append(", ");
            }
            if (_retxBsrTimer != null) {
                builder.append("_retxBsrTimer=");
                builder.append(_retxBsrTimer);
                builder.append(", ");
            }
            if (_ttiBundling != null) {
                builder.append("_ttiBundling=");
                builder.append(_ttiBundling);
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
