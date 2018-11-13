package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx
 *
 */
public class UmtsRanDrxBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx> {

    private java.lang.Short _drxCycleLengthCoefficientCs;
    private java.lang.Short _drxCycleLengthCoefficientPs;
    private java.lang.Short _utrandrxCycleLengthCoefficient;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>> augmentation = Collections.emptyMap();

    public UmtsRanDrxBuilder() {
    }
    public UmtsRanDrxBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanDrxG arg) {
        this._drxCycleLengthCoefficientCs = arg.getDrxCycleLengthCoefficientCs();
        this._drxCycleLengthCoefficientPs = arg.getDrxCycleLengthCoefficientPs();
        this._utrandrxCycleLengthCoefficient = arg.getUtrandrxCycleLengthCoefficient();
    }

    public UmtsRanDrxBuilder(UmtsRanDrx base) {
        this._drxCycleLengthCoefficientCs = base.getDrxCycleLengthCoefficientCs();
        this._drxCycleLengthCoefficientPs = base.getDrxCycleLengthCoefficientPs();
        this._utrandrxCycleLengthCoefficient = base.getUtrandrxCycleLengthCoefficient();
        if (base instanceof UmtsRanDrxImpl) {
            UmtsRanDrxImpl impl = (UmtsRanDrxImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanDrxG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanDrxG) {
            this._drxCycleLengthCoefficientCs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanDrxG)arg).getDrxCycleLengthCoefficientCs();
            this._drxCycleLengthCoefficientPs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanDrxG)arg).getDrxCycleLengthCoefficientPs();
            this._utrandrxCycleLengthCoefficient = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanDrxG)arg).getUtrandrxCycleLengthCoefficient();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanDrxG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getDrxCycleLengthCoefficientCs() {
        return _drxCycleLengthCoefficientCs;
    }
    
    public java.lang.Short getDrxCycleLengthCoefficientPs() {
        return _drxCycleLengthCoefficientPs;
    }
    
    public java.lang.Short getUtrandrxCycleLengthCoefficient() {
        return _utrandrxCycleLengthCoefficient;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkDrxCycleLengthCoefficientCsRange(final short value) {
         if (value >= (short)6 && value <= (short)9) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[6..9]].", value));
     }
    
    public UmtsRanDrxBuilder setDrxCycleLengthCoefficientCs(final java.lang.Short value) {
    if (value != null) {
        checkDrxCycleLengthCoefficientCsRange(value);
    }
        this._drxCycleLengthCoefficientCs = value;
        return this;
    }
    
     
     private static void checkDrxCycleLengthCoefficientPsRange(final short value) {
         if (value >= (short)6 && value <= (short)9) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[6..9]].", value));
     }
    
    public UmtsRanDrxBuilder setDrxCycleLengthCoefficientPs(final java.lang.Short value) {
    if (value != null) {
        checkDrxCycleLengthCoefficientPsRange(value);
    }
        this._drxCycleLengthCoefficientPs = value;
        return this;
    }
    
     
     private static void checkUtrandrxCycleLengthCoefficientRange(final short value) {
         if (value >= (short)3 && value <= (short)9) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[3..9]].", value));
     }
    
    public UmtsRanDrxBuilder setUtrandrxCycleLengthCoefficient(final java.lang.Short value) {
    if (value != null) {
        checkUtrandrxCycleLengthCoefficientRange(value);
    }
        this._utrandrxCycleLengthCoefficient = value;
        return this;
    }
    
    public UmtsRanDrxBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanDrxBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanDrx build() {
        return new UmtsRanDrxImpl(this);
    }

    private static final class UmtsRanDrxImpl implements UmtsRanDrx {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx.class;
        }

        private final java.lang.Short _drxCycleLengthCoefficientCs;
        private final java.lang.Short _drxCycleLengthCoefficientPs;
        private final java.lang.Short _utrandrxCycleLengthCoefficient;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>> augmentation = Collections.emptyMap();

        private UmtsRanDrxImpl(UmtsRanDrxBuilder base) {
            this._drxCycleLengthCoefficientCs = base.getDrxCycleLengthCoefficientCs();
            this._drxCycleLengthCoefficientPs = base.getDrxCycleLengthCoefficientPs();
            this._utrandrxCycleLengthCoefficient = base.getUtrandrxCycleLengthCoefficient();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getDrxCycleLengthCoefficientCs() {
            return _drxCycleLengthCoefficientCs;
        }
        
        @Override
        public java.lang.Short getDrxCycleLengthCoefficientPs() {
            return _drxCycleLengthCoefficientPs;
        }
        
        @Override
        public java.lang.Short getUtrandrxCycleLengthCoefficient() {
            return _utrandrxCycleLengthCoefficient;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_drxCycleLengthCoefficientCs);
            result = prime * result + Objects.hashCode(_drxCycleLengthCoefficientPs);
            result = prime * result + Objects.hashCode(_utrandrxCycleLengthCoefficient);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx)obj;
            if (!Objects.equals(_drxCycleLengthCoefficientCs, other.getDrxCycleLengthCoefficientCs())) {
                return false;
            }
            if (!Objects.equals(_drxCycleLengthCoefficientPs, other.getDrxCycleLengthCoefficientPs())) {
                return false;
            }
            if (!Objects.equals(_utrandrxCycleLengthCoefficient, other.getUtrandrxCycleLengthCoefficient())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanDrxImpl otherImpl = (UmtsRanDrxImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanDrx>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanDrx [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_drxCycleLengthCoefficientCs != null) {
                builder.append("_drxCycleLengthCoefficientCs=");
                builder.append(_drxCycleLengthCoefficientCs);
                builder.append(", ");
            }
            if (_drxCycleLengthCoefficientPs != null) {
                builder.append("_drxCycleLengthCoefficientPs=");
                builder.append(_drxCycleLengthCoefficientPs);
                builder.append(", ");
            }
            if (_utrandrxCycleLengthCoefficient != null) {
                builder.append("_utrandrxCycleLengthCoefficient=");
                builder.append(_utrandrxCycleLengthCoefficient);
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
