package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellCdma2000G.Type;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000
 *
 */
public class LteRanNeighborListInUseInterRatCellCdma2000Builder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000> {

    private java.lang.Integer _arfcn;
    private java.lang.Short _bandClass;
    private java.lang.String _cid;
    private LteRanNeighborListInUseInterRatCellCdma2000Key _key;
    private java.lang.Integer _pnOffset;
    private Type _type;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>> augmentation = Collections.emptyMap();

    public LteRanNeighborListInUseInterRatCellCdma2000Builder() {
    }
    public LteRanNeighborListInUseInterRatCellCdma2000Builder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellCdma2000G arg) {
        this._bandClass = arg.getBandClass();
        this._arfcn = arg.getArfcn();
        this._pnOffset = arg.getPnOffset();
        this._type = arg.getType();
        this._cid = arg.getCid();
    }

    public LteRanNeighborListInUseInterRatCellCdma2000Builder(LteRanNeighborListInUseInterRatCellCdma2000 base) {
        if (base.getKey() == null) {
            this._key = new LteRanNeighborListInUseInterRatCellCdma2000Key(
                base.getCid()
            );
            this._cid = base.getCid();
        } else {
            this._key = base.getKey();
            this._cid = _key.getCid();
        }
        this._arfcn = base.getArfcn();
        this._bandClass = base.getBandClass();
        this._pnOffset = base.getPnOffset();
        this._type = base.getType();
        if (base instanceof LteRanNeighborListInUseInterRatCellCdma2000Impl) {
            LteRanNeighborListInUseInterRatCellCdma2000Impl impl = (LteRanNeighborListInUseInterRatCellCdma2000Impl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellCdma2000G</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellCdma2000G) {
            this._bandClass = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellCdma2000G)arg).getBandClass();
            this._arfcn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellCdma2000G)arg).getArfcn();
            this._pnOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellCdma2000G)arg).getPnOffset();
            this._type = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellCdma2000G)arg).getType();
            this._cid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellCdma2000G)arg).getCid();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellCdma2000G] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getArfcn() {
        return _arfcn;
    }
    
    public java.lang.Short getBandClass() {
        return _bandClass;
    }
    
    public java.lang.String getCid() {
        return _cid;
    }
    
    public LteRanNeighborListInUseInterRatCellCdma2000Key getKey() {
        return _key;
    }
    
    public java.lang.Integer getPnOffset() {
        return _pnOffset;
    }
    
    public Type getType() {
        return _type;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkArfcnRange(final int value) {
         if (value >= 0 && value <= 2047) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..2047]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellCdma2000Builder setArfcn(final java.lang.Integer value) {
    if (value != null) {
        checkArfcnRange(value);
    }
        this._arfcn = value;
        return this;
    }
    
     
     private static void checkBandClassRange(final short value) {
         if (value >= (short)0 && value <= (short)17) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..17]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellCdma2000Builder setBandClass(final java.lang.Short value) {
    if (value != null) {
        checkBandClassRange(value);
    }
        this._bandClass = value;
        return this;
    }
    
     
     private static void check_cidLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..16]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellCdma2000Builder setCid(final java.lang.String value) {
    if (value != null) {
        check_cidLength(value);
    }
        this._cid = value;
        return this;
    }
    
     
    public LteRanNeighborListInUseInterRatCellCdma2000Builder setKey(final LteRanNeighborListInUseInterRatCellCdma2000Key value) {
        this._key = value;
        return this;
    }
    
     
     private static void checkPnOffsetRange(final int value) {
         if (value >= 0 && value <= 511) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..511]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellCdma2000Builder setPnOffset(final java.lang.Integer value) {
    if (value != null) {
        checkPnOffsetRange(value);
    }
        this._pnOffset = value;
        return this;
    }
    
     
    public LteRanNeighborListInUseInterRatCellCdma2000Builder setType(final Type value) {
        this._type = value;
        return this;
    }
    
    public LteRanNeighborListInUseInterRatCellCdma2000Builder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanNeighborListInUseInterRatCellCdma2000Builder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanNeighborListInUseInterRatCellCdma2000 build() {
        return new LteRanNeighborListInUseInterRatCellCdma2000Impl(this);
    }

    private static final class LteRanNeighborListInUseInterRatCellCdma2000Impl implements LteRanNeighborListInUseInterRatCellCdma2000 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000.class;
        }

        private final java.lang.Integer _arfcn;
        private final java.lang.Short _bandClass;
        private final java.lang.String _cid;
        private final LteRanNeighborListInUseInterRatCellCdma2000Key _key;
        private final java.lang.Integer _pnOffset;
        private final Type _type;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>> augmentation = Collections.emptyMap();

        private LteRanNeighborListInUseInterRatCellCdma2000Impl(LteRanNeighborListInUseInterRatCellCdma2000Builder base) {
            if (base.getKey() == null) {
                this._key = new LteRanNeighborListInUseInterRatCellCdma2000Key(
                    base.getCid()
                );
                this._cid = base.getCid();
            } else {
                this._key = base.getKey();
                this._cid = _key.getCid();
            }
            this._arfcn = base.getArfcn();
            this._bandClass = base.getBandClass();
            this._pnOffset = base.getPnOffset();
            this._type = base.getType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getArfcn() {
            return _arfcn;
        }
        
        @Override
        public java.lang.Short getBandClass() {
            return _bandClass;
        }
        
        @Override
        public java.lang.String getCid() {
            return _cid;
        }
        
        @Override
        public LteRanNeighborListInUseInterRatCellCdma2000Key getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getPnOffset() {
            return _pnOffset;
        }
        
        @Override
        public Type getType() {
            return _type;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_arfcn);
            result = prime * result + Objects.hashCode(_bandClass);
            result = prime * result + Objects.hashCode(_cid);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_pnOffset);
            result = prime * result + Objects.hashCode(_type);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000 other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000)obj;
            if (!Objects.equals(_arfcn, other.getArfcn())) {
                return false;
            }
            if (!Objects.equals(_bandClass, other.getBandClass())) {
                return false;
            }
            if (!Objects.equals(_cid, other.getCid())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_pnOffset, other.getPnOffset())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanNeighborListInUseInterRatCellCdma2000Impl otherImpl = (LteRanNeighborListInUseInterRatCellCdma2000Impl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellCdma2000>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanNeighborListInUseInterRatCellCdma2000 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_arfcn != null) {
                builder.append("_arfcn=");
                builder.append(_arfcn);
                builder.append(", ");
            }
            if (_bandClass != null) {
                builder.append("_bandClass=");
                builder.append(_bandClass);
                builder.append(", ");
            }
            if (_cid != null) {
                builder.append("_cid=");
                builder.append(_cid);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_pnOffset != null) {
                builder.append("_pnOffset=");
                builder.append(_pnOffset);
                builder.append(", ");
            }
            if (_type != null) {
                builder.append("_type=");
                builder.append(_type);
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
