package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellGsmG.BandIndicator;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm
 *
 */
public class LteRanNeighborListInUseInterRatCellGsmBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm> {

    private BandIndicator _bandIndicator;
    private java.lang.Integer _bccharfcn;
    private java.lang.Short _bsic;
    private java.lang.Integer _ci;
    private LteRanNeighborListInUseInterRatCellGsmKey _key;
    private java.lang.Integer _lac;
    private java.lang.String _plmnid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>> augmentation = Collections.emptyMap();

    public LteRanNeighborListInUseInterRatCellGsmBuilder() {
    }
    public LteRanNeighborListInUseInterRatCellGsmBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellGsmG arg) {
        this._plmnid = arg.getPlmnid();
        this._lac = arg.getLac();
        this._bsic = arg.getBsic();
        this._ci = arg.getCi();
        this._bandIndicator = arg.getBandIndicator();
        this._bccharfcn = arg.getBccharfcn();
    }

    public LteRanNeighborListInUseInterRatCellGsmBuilder(LteRanNeighborListInUseInterRatCellGsm base) {
        if (base.getKey() == null) {
            this._key = new LteRanNeighborListInUseInterRatCellGsmKey(
                base.getCi(), 
                base.getLac(), 
                base.getPlmnid()
            );
            this._ci = base.getCi();
            this._lac = base.getLac();
            this._plmnid = base.getPlmnid();
        } else {
            this._key = base.getKey();
            this._ci = _key.getCi();
            this._lac = _key.getLac();
            this._plmnid = _key.getPlmnid();
        }
        this._bandIndicator = base.getBandIndicator();
        this._bccharfcn = base.getBccharfcn();
        this._bsic = base.getBsic();
        if (base instanceof LteRanNeighborListInUseInterRatCellGsmImpl) {
            LteRanNeighborListInUseInterRatCellGsmImpl impl = (LteRanNeighborListInUseInterRatCellGsmImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellGsmG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellGsmG) {
            this._plmnid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellGsmG)arg).getPlmnid();
            this._lac = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellGsmG)arg).getLac();
            this._bsic = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellGsmG)arg).getBsic();
            this._ci = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellGsmG)arg).getCi();
            this._bandIndicator = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellGsmG)arg).getBandIndicator();
            this._bccharfcn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellGsmG)arg).getBccharfcn();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellGsmG] \n" +
              "but was: " + arg
            );
        }
    }

    public BandIndicator getBandIndicator() {
        return _bandIndicator;
    }
    
    public java.lang.Integer getBccharfcn() {
        return _bccharfcn;
    }
    
    public java.lang.Short getBsic() {
        return _bsic;
    }
    
    public java.lang.Integer getCi() {
        return _ci;
    }
    
    public LteRanNeighborListInUseInterRatCellGsmKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getLac() {
        return _lac;
    }
    
    public java.lang.String getPlmnid() {
        return _plmnid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanNeighborListInUseInterRatCellGsmBuilder setBandIndicator(final BandIndicator value) {
        this._bandIndicator = value;
        return this;
    }
    
     
     private static void checkBccharfcnRange(final int value) {
         if (value >= 0 && value <= 1023) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1023]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellGsmBuilder setBccharfcn(final java.lang.Integer value) {
    if (value != null) {
        checkBccharfcnRange(value);
    }
        this._bccharfcn = value;
        return this;
    }
    
     
     private static void checkBsicRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellGsmBuilder setBsic(final java.lang.Short value) {
    if (value != null) {
        checkBsicRange(value);
    }
        this._bsic = value;
        return this;
    }
    
     
     private static void checkCiRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellGsmBuilder setCi(final java.lang.Integer value) {
    if (value != null) {
        checkCiRange(value);
    }
        this._ci = value;
        return this;
    }
    
     
    public LteRanNeighborListInUseInterRatCellGsmBuilder setKey(final LteRanNeighborListInUseInterRatCellGsmKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void checkLacRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellGsmBuilder setLac(final java.lang.Integer value) {
    if (value != null) {
        checkLacRange(value);
    }
        this._lac = value;
        return this;
    }
    
     
     private static void check_plmnidLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 6) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..6]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellGsmBuilder setPlmnid(final java.lang.String value) {
    if (value != null) {
        check_plmnidLength(value);
    }
        this._plmnid = value;
        return this;
    }
    
    public LteRanNeighborListInUseInterRatCellGsmBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanNeighborListInUseInterRatCellGsmBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanNeighborListInUseInterRatCellGsm build() {
        return new LteRanNeighborListInUseInterRatCellGsmImpl(this);
    }

    private static final class LteRanNeighborListInUseInterRatCellGsmImpl implements LteRanNeighborListInUseInterRatCellGsm {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm.class;
        }

        private final BandIndicator _bandIndicator;
        private final java.lang.Integer _bccharfcn;
        private final java.lang.Short _bsic;
        private final java.lang.Integer _ci;
        private final LteRanNeighborListInUseInterRatCellGsmKey _key;
        private final java.lang.Integer _lac;
        private final java.lang.String _plmnid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>> augmentation = Collections.emptyMap();

        private LteRanNeighborListInUseInterRatCellGsmImpl(LteRanNeighborListInUseInterRatCellGsmBuilder base) {
            if (base.getKey() == null) {
                this._key = new LteRanNeighborListInUseInterRatCellGsmKey(
                    base.getCi(), 
                    base.getLac(), 
                    base.getPlmnid()
                );
                this._ci = base.getCi();
                this._lac = base.getLac();
                this._plmnid = base.getPlmnid();
            } else {
                this._key = base.getKey();
                this._ci = _key.getCi();
                this._lac = _key.getLac();
                this._plmnid = _key.getPlmnid();
            }
            this._bandIndicator = base.getBandIndicator();
            this._bccharfcn = base.getBccharfcn();
            this._bsic = base.getBsic();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BandIndicator getBandIndicator() {
            return _bandIndicator;
        }
        
        @Override
        public java.lang.Integer getBccharfcn() {
            return _bccharfcn;
        }
        
        @Override
        public java.lang.Short getBsic() {
            return _bsic;
        }
        
        @Override
        public java.lang.Integer getCi() {
            return _ci;
        }
        
        @Override
        public LteRanNeighborListInUseInterRatCellGsmKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getLac() {
            return _lac;
        }
        
        @Override
        public java.lang.String getPlmnid() {
            return _plmnid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bandIndicator);
            result = prime * result + Objects.hashCode(_bccharfcn);
            result = prime * result + Objects.hashCode(_bsic);
            result = prime * result + Objects.hashCode(_ci);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_lac);
            result = prime * result + Objects.hashCode(_plmnid);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm)obj;
            if (!Objects.equals(_bandIndicator, other.getBandIndicator())) {
                return false;
            }
            if (!Objects.equals(_bccharfcn, other.getBccharfcn())) {
                return false;
            }
            if (!Objects.equals(_bsic, other.getBsic())) {
                return false;
            }
            if (!Objects.equals(_ci, other.getCi())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_lac, other.getLac())) {
                return false;
            }
            if (!Objects.equals(_plmnid, other.getPlmnid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanNeighborListInUseInterRatCellGsmImpl otherImpl = (LteRanNeighborListInUseInterRatCellGsmImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanNeighborListInUseInterRatCellGsm [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bandIndicator != null) {
                builder.append("_bandIndicator=");
                builder.append(_bandIndicator);
                builder.append(", ");
            }
            if (_bccharfcn != null) {
                builder.append("_bccharfcn=");
                builder.append(_bccharfcn);
                builder.append(", ");
            }
            if (_bsic != null) {
                builder.append("_bsic=");
                builder.append(_bsic);
                builder.append(", ");
            }
            if (_ci != null) {
                builder.append("_ci=");
                builder.append(_ci);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_lac != null) {
                builder.append("_lac=");
                builder.append(_lac);
                builder.append(", ");
            }
            if (_plmnid != null) {
                builder.append("_plmnid=");
                builder.append(_plmnid);
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
