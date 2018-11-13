package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschG.HoppingMode;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch
 *
 */
public class LteRanPhyPuschBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch> {

    private HoppingMode _hoppingMode;
    private List<java.lang.String> _hoppingOffset;
    private LteRanPhyPuschUlrs _lteRanPhyPuschUlrs;
    private java.lang.Short _nsb;
    private java.lang.Boolean _enable64Qam;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>> augmentation = Collections.emptyMap();

    public LteRanPhyPuschBuilder() {
    }
    public LteRanPhyPuschBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschG arg) {
        this._nsb = arg.getNsb();
        this._hoppingMode = arg.getHoppingMode();
        this._hoppingOffset = arg.getHoppingOffset();
        this._enable64Qam = arg.isEnable64Qam();
    }

    public LteRanPhyPuschBuilder(LteRanPhyPusch base) {
        this._hoppingMode = base.getHoppingMode();
        this._hoppingOffset = base.getHoppingOffset();
        this._lteRanPhyPuschUlrs = base.getLteRanPhyPuschUlrs();
        this._nsb = base.getNsb();
        this._enable64Qam = base.isEnable64Qam();
        if (base instanceof LteRanPhyPuschImpl) {
            LteRanPhyPuschImpl impl = (LteRanPhyPuschImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschG) {
            this._nsb = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschG)arg).getNsb();
            this._hoppingMode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschG)arg).getHoppingMode();
            this._hoppingOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschG)arg).getHoppingOffset();
            this._enable64Qam = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschG)arg).isEnable64Qam();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschG] \n" +
              "but was: " + arg
            );
        }
    }

    public HoppingMode getHoppingMode() {
        return _hoppingMode;
    }
    
    public List<java.lang.String> getHoppingOffset() {
        return _hoppingOffset;
    }
    
    public LteRanPhyPuschUlrs getLteRanPhyPuschUlrs() {
        return _lteRanPhyPuschUlrs;
    }
    
    public java.lang.Short getNsb() {
        return _nsb;
    }
    
    public java.lang.Boolean isEnable64Qam() {
        return _enable64Qam;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanPhyPuschBuilder setHoppingMode(final HoppingMode value) {
        this._hoppingMode = value;
        return this;
    }
    
     
    public LteRanPhyPuschBuilder setHoppingOffset(final List<java.lang.String> value) {
        this._hoppingOffset = value;
        return this;
    }
    
     
    public LteRanPhyPuschBuilder setLteRanPhyPuschUlrs(final LteRanPhyPuschUlrs value) {
        this._lteRanPhyPuschUlrs = value;
        return this;
    }
    
     
     private static void checkNsbRange(final short value) {
         if (value >= (short)1 && value <= (short)4) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..4]].", value));
     }
    
    public LteRanPhyPuschBuilder setNsb(final java.lang.Short value) {
    if (value != null) {
        checkNsbRange(value);
    }
        this._nsb = value;
        return this;
    }
    
     
    public LteRanPhyPuschBuilder setEnable64Qam(final java.lang.Boolean value) {
        this._enable64Qam = value;
        return this;
    }
    
    public LteRanPhyPuschBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanPhyPuschBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanPhyPusch build() {
        return new LteRanPhyPuschImpl(this);
    }

    private static final class LteRanPhyPuschImpl implements LteRanPhyPusch {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch.class;
        }

        private final HoppingMode _hoppingMode;
        private final List<java.lang.String> _hoppingOffset;
        private final LteRanPhyPuschUlrs _lteRanPhyPuschUlrs;
        private final java.lang.Short _nsb;
        private final java.lang.Boolean _enable64Qam;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>> augmentation = Collections.emptyMap();

        private LteRanPhyPuschImpl(LteRanPhyPuschBuilder base) {
            this._hoppingMode = base.getHoppingMode();
            this._hoppingOffset = base.getHoppingOffset();
            this._lteRanPhyPuschUlrs = base.getLteRanPhyPuschUlrs();
            this._nsb = base.getNsb();
            this._enable64Qam = base.isEnable64Qam();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public HoppingMode getHoppingMode() {
            return _hoppingMode;
        }
        
        @Override
        public List<java.lang.String> getHoppingOffset() {
            return _hoppingOffset;
        }
        
        @Override
        public LteRanPhyPuschUlrs getLteRanPhyPuschUlrs() {
            return _lteRanPhyPuschUlrs;
        }
        
        @Override
        public java.lang.Short getNsb() {
            return _nsb;
        }
        
        @Override
        public java.lang.Boolean isEnable64Qam() {
            return _enable64Qam;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_hoppingMode);
            result = prime * result + Objects.hashCode(_hoppingOffset);
            result = prime * result + Objects.hashCode(_lteRanPhyPuschUlrs);
            result = prime * result + Objects.hashCode(_nsb);
            result = prime * result + Objects.hashCode(_enable64Qam);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch)obj;
            if (!Objects.equals(_hoppingMode, other.getHoppingMode())) {
                return false;
            }
            if (!Objects.equals(_hoppingOffset, other.getHoppingOffset())) {
                return false;
            }
            if (!Objects.equals(_lteRanPhyPuschUlrs, other.getLteRanPhyPuschUlrs())) {
                return false;
            }
            if (!Objects.equals(_nsb, other.getNsb())) {
                return false;
            }
            if (!Objects.equals(_enable64Qam, other.isEnable64Qam())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanPhyPuschImpl otherImpl = (LteRanPhyPuschImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanPhyPusch [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_hoppingMode != null) {
                builder.append("_hoppingMode=");
                builder.append(_hoppingMode);
                builder.append(", ");
            }
            if (_hoppingOffset != null) {
                builder.append("_hoppingOffset=");
                builder.append(_hoppingOffset);
                builder.append(", ");
            }
            if (_lteRanPhyPuschUlrs != null) {
                builder.append("_lteRanPhyPuschUlrs=");
                builder.append(_lteRanPhyPuschUlrs);
                builder.append(", ");
            }
            if (_nsb != null) {
                builder.append("_nsb=");
                builder.append(_nsb);
                builder.append(", ");
            }
            if (_enable64Qam != null) {
                builder.append("_enable64Qam=");
                builder.append(_enable64Qam);
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
