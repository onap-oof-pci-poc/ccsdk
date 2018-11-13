package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl
 *
 */
public class LteRanPhyUlPowerControlBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl> {

    private List<java.lang.String> _alpha;
    private java.lang.Long _deltaFpucchFormat1;
    private java.lang.Short _deltaFpucchFormat1b;
    private java.lang.Long _deltaFpucchFormat2;
    private java.lang.Long _deltaFpucchFormat2a;
    private java.lang.Long _deltaFpucchFormat2b;
    private java.lang.Long _deltaPreambleMsg3;
    private List<java.lang.String> _p0NominalPucch;
    private List<java.lang.String> _p0NominalPusch;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>> augmentation = Collections.emptyMap();

    public LteRanPhyUlPowerControlBuilder() {
    }
    public LteRanPhyUlPowerControlBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG arg) {
        this._p0NominalPusch = arg.getP0NominalPusch();
        this._alpha = arg.getAlpha();
        this._p0NominalPucch = arg.getP0NominalPucch();
        this._deltaFpucchFormat1 = arg.getDeltaFpucchFormat1();
        this._deltaFpucchFormat1b = arg.getDeltaFpucchFormat1b();
        this._deltaFpucchFormat2 = arg.getDeltaFpucchFormat2();
        this._deltaFpucchFormat2a = arg.getDeltaFpucchFormat2a();
        this._deltaFpucchFormat2b = arg.getDeltaFpucchFormat2b();
        this._deltaPreambleMsg3 = arg.getDeltaPreambleMsg3();
    }

    public LteRanPhyUlPowerControlBuilder(LteRanPhyUlPowerControl base) {
        this._alpha = base.getAlpha();
        this._deltaFpucchFormat1 = base.getDeltaFpucchFormat1();
        this._deltaFpucchFormat1b = base.getDeltaFpucchFormat1b();
        this._deltaFpucchFormat2 = base.getDeltaFpucchFormat2();
        this._deltaFpucchFormat2a = base.getDeltaFpucchFormat2a();
        this._deltaFpucchFormat2b = base.getDeltaFpucchFormat2b();
        this._deltaPreambleMsg3 = base.getDeltaPreambleMsg3();
        this._p0NominalPucch = base.getP0NominalPucch();
        this._p0NominalPusch = base.getP0NominalPusch();
        if (base instanceof LteRanPhyUlPowerControlImpl) {
            LteRanPhyUlPowerControlImpl impl = (LteRanPhyUlPowerControlImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG) {
            this._p0NominalPusch = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG)arg).getP0NominalPusch();
            this._alpha = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG)arg).getAlpha();
            this._p0NominalPucch = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG)arg).getP0NominalPucch();
            this._deltaFpucchFormat1 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG)arg).getDeltaFpucchFormat1();
            this._deltaFpucchFormat1b = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG)arg).getDeltaFpucchFormat1b();
            this._deltaFpucchFormat2 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG)arg).getDeltaFpucchFormat2();
            this._deltaFpucchFormat2a = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG)arg).getDeltaFpucchFormat2a();
            this._deltaFpucchFormat2b = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG)arg).getDeltaFpucchFormat2b();
            this._deltaPreambleMsg3 = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG)arg).getDeltaPreambleMsg3();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.String> getAlpha() {
        return _alpha;
    }
    
    public java.lang.Long getDeltaFpucchFormat1() {
        return _deltaFpucchFormat1;
    }
    
    public java.lang.Short getDeltaFpucchFormat1b() {
        return _deltaFpucchFormat1b;
    }
    
    public java.lang.Long getDeltaFpucchFormat2() {
        return _deltaFpucchFormat2;
    }
    
    public java.lang.Long getDeltaFpucchFormat2a() {
        return _deltaFpucchFormat2a;
    }
    
    public java.lang.Long getDeltaFpucchFormat2b() {
        return _deltaFpucchFormat2b;
    }
    
    public java.lang.Long getDeltaPreambleMsg3() {
        return _deltaPreambleMsg3;
    }
    
    public List<java.lang.String> getP0NominalPucch() {
        return _p0NominalPucch;
    }
    
    public List<java.lang.String> getP0NominalPusch() {
        return _p0NominalPusch;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanPhyUlPowerControlBuilder setAlpha(final List<java.lang.String> value) {
        this._alpha = value;
        return this;
    }
    
     
    public LteRanPhyUlPowerControlBuilder setDeltaFpucchFormat1(final java.lang.Long value) {
        this._deltaFpucchFormat1 = value;
        return this;
    }
    
     
     private static void checkDeltaFpucchFormat1bRange(final short value) {
         if (value >= (short)1 && value <= (short)1) {
             return;
         }
         if (value >= (short)3 && value <= (short)3) {
             return;
         }
         if (value >= (short)5 && value <= (short)5) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..1], [3..3], [5..5]].", value));
     }
    
    public LteRanPhyUlPowerControlBuilder setDeltaFpucchFormat1b(final java.lang.Short value) {
    if (value != null) {
        checkDeltaFpucchFormat1bRange(value);
    }
        this._deltaFpucchFormat1b = value;
        return this;
    }
    
     
    public LteRanPhyUlPowerControlBuilder setDeltaFpucchFormat2(final java.lang.Long value) {
        this._deltaFpucchFormat2 = value;
        return this;
    }
    
     
    public LteRanPhyUlPowerControlBuilder setDeltaFpucchFormat2a(final java.lang.Long value) {
        this._deltaFpucchFormat2a = value;
        return this;
    }
    
     
    public LteRanPhyUlPowerControlBuilder setDeltaFpucchFormat2b(final java.lang.Long value) {
        this._deltaFpucchFormat2b = value;
        return this;
    }
    
     
    public LteRanPhyUlPowerControlBuilder setDeltaPreambleMsg3(final java.lang.Long value) {
        this._deltaPreambleMsg3 = value;
        return this;
    }
    
     
    public LteRanPhyUlPowerControlBuilder setP0NominalPucch(final List<java.lang.String> value) {
        this._p0NominalPucch = value;
        return this;
    }
    
     
    public LteRanPhyUlPowerControlBuilder setP0NominalPusch(final List<java.lang.String> value) {
        this._p0NominalPusch = value;
        return this;
    }
    
    public LteRanPhyUlPowerControlBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanPhyUlPowerControlBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanPhyUlPowerControl build() {
        return new LteRanPhyUlPowerControlImpl(this);
    }

    private static final class LteRanPhyUlPowerControlImpl implements LteRanPhyUlPowerControl {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl.class;
        }

        private final List<java.lang.String> _alpha;
        private final java.lang.Long _deltaFpucchFormat1;
        private final java.lang.Short _deltaFpucchFormat1b;
        private final java.lang.Long _deltaFpucchFormat2;
        private final java.lang.Long _deltaFpucchFormat2a;
        private final java.lang.Long _deltaFpucchFormat2b;
        private final java.lang.Long _deltaPreambleMsg3;
        private final List<java.lang.String> _p0NominalPucch;
        private final List<java.lang.String> _p0NominalPusch;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>> augmentation = Collections.emptyMap();

        private LteRanPhyUlPowerControlImpl(LteRanPhyUlPowerControlBuilder base) {
            this._alpha = base.getAlpha();
            this._deltaFpucchFormat1 = base.getDeltaFpucchFormat1();
            this._deltaFpucchFormat1b = base.getDeltaFpucchFormat1b();
            this._deltaFpucchFormat2 = base.getDeltaFpucchFormat2();
            this._deltaFpucchFormat2a = base.getDeltaFpucchFormat2a();
            this._deltaFpucchFormat2b = base.getDeltaFpucchFormat2b();
            this._deltaPreambleMsg3 = base.getDeltaPreambleMsg3();
            this._p0NominalPucch = base.getP0NominalPucch();
            this._p0NominalPusch = base.getP0NominalPusch();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.String> getAlpha() {
            return _alpha;
        }
        
        @Override
        public java.lang.Long getDeltaFpucchFormat1() {
            return _deltaFpucchFormat1;
        }
        
        @Override
        public java.lang.Short getDeltaFpucchFormat1b() {
            return _deltaFpucchFormat1b;
        }
        
        @Override
        public java.lang.Long getDeltaFpucchFormat2() {
            return _deltaFpucchFormat2;
        }
        
        @Override
        public java.lang.Long getDeltaFpucchFormat2a() {
            return _deltaFpucchFormat2a;
        }
        
        @Override
        public java.lang.Long getDeltaFpucchFormat2b() {
            return _deltaFpucchFormat2b;
        }
        
        @Override
        public java.lang.Long getDeltaPreambleMsg3() {
            return _deltaPreambleMsg3;
        }
        
        @Override
        public List<java.lang.String> getP0NominalPucch() {
            return _p0NominalPucch;
        }
        
        @Override
        public List<java.lang.String> getP0NominalPusch() {
            return _p0NominalPusch;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_alpha);
            result = prime * result + Objects.hashCode(_deltaFpucchFormat1);
            result = prime * result + Objects.hashCode(_deltaFpucchFormat1b);
            result = prime * result + Objects.hashCode(_deltaFpucchFormat2);
            result = prime * result + Objects.hashCode(_deltaFpucchFormat2a);
            result = prime * result + Objects.hashCode(_deltaFpucchFormat2b);
            result = prime * result + Objects.hashCode(_deltaPreambleMsg3);
            result = prime * result + Objects.hashCode(_p0NominalPucch);
            result = prime * result + Objects.hashCode(_p0NominalPusch);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl)obj;
            if (!Objects.equals(_alpha, other.getAlpha())) {
                return false;
            }
            if (!Objects.equals(_deltaFpucchFormat1, other.getDeltaFpucchFormat1())) {
                return false;
            }
            if (!Objects.equals(_deltaFpucchFormat1b, other.getDeltaFpucchFormat1b())) {
                return false;
            }
            if (!Objects.equals(_deltaFpucchFormat2, other.getDeltaFpucchFormat2())) {
                return false;
            }
            if (!Objects.equals(_deltaFpucchFormat2a, other.getDeltaFpucchFormat2a())) {
                return false;
            }
            if (!Objects.equals(_deltaFpucchFormat2b, other.getDeltaFpucchFormat2b())) {
                return false;
            }
            if (!Objects.equals(_deltaPreambleMsg3, other.getDeltaPreambleMsg3())) {
                return false;
            }
            if (!Objects.equals(_p0NominalPucch, other.getP0NominalPucch())) {
                return false;
            }
            if (!Objects.equals(_p0NominalPusch, other.getP0NominalPusch())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanPhyUlPowerControlImpl otherImpl = (LteRanPhyUlPowerControlImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanPhyUlPowerControl [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alpha != null) {
                builder.append("_alpha=");
                builder.append(_alpha);
                builder.append(", ");
            }
            if (_deltaFpucchFormat1 != null) {
                builder.append("_deltaFpucchFormat1=");
                builder.append(_deltaFpucchFormat1);
                builder.append(", ");
            }
            if (_deltaFpucchFormat1b != null) {
                builder.append("_deltaFpucchFormat1b=");
                builder.append(_deltaFpucchFormat1b);
                builder.append(", ");
            }
            if (_deltaFpucchFormat2 != null) {
                builder.append("_deltaFpucchFormat2=");
                builder.append(_deltaFpucchFormat2);
                builder.append(", ");
            }
            if (_deltaFpucchFormat2a != null) {
                builder.append("_deltaFpucchFormat2a=");
                builder.append(_deltaFpucchFormat2a);
                builder.append(", ");
            }
            if (_deltaFpucchFormat2b != null) {
                builder.append("_deltaFpucchFormat2b=");
                builder.append(_deltaFpucchFormat2b);
                builder.append(", ");
            }
            if (_deltaPreambleMsg3 != null) {
                builder.append("_deltaPreambleMsg3=");
                builder.append(_deltaPreambleMsg3);
                builder.append(", ");
            }
            if (_p0NominalPucch != null) {
                builder.append("_p0NominalPucch=");
                builder.append(_p0NominalPucch);
                builder.append(", ");
            }
            if (_p0NominalPusch != null) {
                builder.append("_p0NominalPusch=");
                builder.append(_p0NominalPusch);
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
