package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts
 *
 */
public class LteRanNeighborListInUseInterRatCellUmtsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts> {

    private java.lang.Integer _cid;
    private LteRanNeighborListInUseInterRatCellUmtsKey _key;
    private java.lang.Integer _lac;
    private java.lang.Integer _pcpichScramblingCode;
    private java.lang.Long _pcpichTxPower;
    private java.lang.String _plmnid;
    private java.lang.Short _rac;
    private java.lang.Integer _rncid;
    private java.lang.Integer _uarfcndl;
    private java.lang.Integer _uarfcnul;
    private java.lang.Integer _ura;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>> augmentation = Collections.emptyMap();

    public LteRanNeighborListInUseInterRatCellUmtsBuilder() {
    }
    public LteRanNeighborListInUseInterRatCellUmtsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG arg) {
        this._plmnid = arg.getPlmnid();
        this._rncid = arg.getRncid();
        this._cid = arg.getCid();
        this._lac = arg.getLac();
        this._rac = arg.getRac();
        this._ura = arg.getUra();
        this._uarfcnul = arg.getUarfcnul();
        this._uarfcndl = arg.getUarfcndl();
        this._pcpichScramblingCode = arg.getPcpichScramblingCode();
        this._pcpichTxPower = arg.getPcpichTxPower();
    }

    public LteRanNeighborListInUseInterRatCellUmtsBuilder(LteRanNeighborListInUseInterRatCellUmts base) {
        if (base.getKey() == null) {
            this._key = new LteRanNeighborListInUseInterRatCellUmtsKey(
                base.getCid(), 
                base.getPlmnid()
            );
            this._cid = base.getCid();
            this._plmnid = base.getPlmnid();
        } else {
            this._key = base.getKey();
            this._cid = _key.getCid();
            this._plmnid = _key.getPlmnid();
        }
        this._lac = base.getLac();
        this._pcpichScramblingCode = base.getPcpichScramblingCode();
        this._pcpichTxPower = base.getPcpichTxPower();
        this._rac = base.getRac();
        this._rncid = base.getRncid();
        this._uarfcndl = base.getUarfcndl();
        this._uarfcnul = base.getUarfcnul();
        this._ura = base.getUra();
        if (base instanceof LteRanNeighborListInUseInterRatCellUmtsImpl) {
            LteRanNeighborListInUseInterRatCellUmtsImpl impl = (LteRanNeighborListInUseInterRatCellUmtsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG) {
            this._plmnid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG)arg).getPlmnid();
            this._rncid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG)arg).getRncid();
            this._cid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG)arg).getCid();
            this._lac = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG)arg).getLac();
            this._rac = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG)arg).getRac();
            this._ura = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG)arg).getUra();
            this._uarfcnul = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG)arg).getUarfcnul();
            this._uarfcndl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG)arg).getUarfcndl();
            this._pcpichScramblingCode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG)arg).getPcpichScramblingCode();
            this._pcpichTxPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG)arg).getPcpichTxPower();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellUmtsG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getCid() {
        return _cid;
    }
    
    public LteRanNeighborListInUseInterRatCellUmtsKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getLac() {
        return _lac;
    }
    
    public java.lang.Integer getPcpichScramblingCode() {
        return _pcpichScramblingCode;
    }
    
    public java.lang.Long getPcpichTxPower() {
        return _pcpichTxPower;
    }
    
    public java.lang.String getPlmnid() {
        return _plmnid;
    }
    
    public java.lang.Short getRac() {
        return _rac;
    }
    
    public java.lang.Integer getRncid() {
        return _rncid;
    }
    
    public java.lang.Integer getUarfcndl() {
        return _uarfcndl;
    }
    
    public java.lang.Integer getUarfcnul() {
        return _uarfcnul;
    }
    
    public java.lang.Integer getUra() {
        return _ura;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCidRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellUmtsBuilder setCid(final java.lang.Integer value) {
    if (value != null) {
        checkCidRange(value);
    }
        this._cid = value;
        return this;
    }
    
     
    public LteRanNeighborListInUseInterRatCellUmtsBuilder setKey(final LteRanNeighborListInUseInterRatCellUmtsKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void checkLacRange(final int value) {
         if (value >= 1 && value <= 65533) {
             return;
         }
         if (value >= 65535 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..65533], [65535..65535]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellUmtsBuilder setLac(final java.lang.Integer value) {
    if (value != null) {
        checkLacRange(value);
    }
        this._lac = value;
        return this;
    }
    
     
     private static void checkPcpichScramblingCodeRange(final int value) {
         if (value >= 0 && value <= 511) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..511]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellUmtsBuilder setPcpichScramblingCode(final java.lang.Integer value) {
    if (value != null) {
        checkPcpichScramblingCodeRange(value);
    }
        this._pcpichScramblingCode = value;
        return this;
    }
    
     
    public LteRanNeighborListInUseInterRatCellUmtsBuilder setPcpichTxPower(final java.lang.Long value) {
        this._pcpichTxPower = value;
        return this;
    }
    
     
     private static void check_plmnidLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 6) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..6]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellUmtsBuilder setPlmnid(final java.lang.String value) {
    if (value != null) {
        check_plmnidLength(value);
    }
        this._plmnid = value;
        return this;
    }
    
     
     private static void checkRacRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellUmtsBuilder setRac(final java.lang.Short value) {
    if (value != null) {
        checkRacRange(value);
    }
        this._rac = value;
        return this;
    }
    
     
     private static void checkRncidRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellUmtsBuilder setRncid(final java.lang.Integer value) {
    if (value != null) {
        checkRncidRange(value);
    }
        this._rncid = value;
        return this;
    }
    
     
     private static void checkUarfcndlRange(final int value) {
         if (value >= 0 && value <= 16383) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..16383]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellUmtsBuilder setUarfcndl(final java.lang.Integer value) {
    if (value != null) {
        checkUarfcndlRange(value);
    }
        this._uarfcndl = value;
        return this;
    }
    
     
     private static void checkUarfcnulRange(final int value) {
         if (value >= 0 && value <= 16383) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..16383]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellUmtsBuilder setUarfcnul(final java.lang.Integer value) {
    if (value != null) {
        checkUarfcnulRange(value);
    }
        this._uarfcnul = value;
        return this;
    }
    
     
     private static void checkUraRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public LteRanNeighborListInUseInterRatCellUmtsBuilder setUra(final java.lang.Integer value) {
    if (value != null) {
        checkUraRange(value);
    }
        this._ura = value;
        return this;
    }
    
    public LteRanNeighborListInUseInterRatCellUmtsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanNeighborListInUseInterRatCellUmtsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanNeighborListInUseInterRatCellUmts build() {
        return new LteRanNeighborListInUseInterRatCellUmtsImpl(this);
    }

    private static final class LteRanNeighborListInUseInterRatCellUmtsImpl implements LteRanNeighborListInUseInterRatCellUmts {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts.class;
        }

        private final java.lang.Integer _cid;
        private final LteRanNeighborListInUseInterRatCellUmtsKey _key;
        private final java.lang.Integer _lac;
        private final java.lang.Integer _pcpichScramblingCode;
        private final java.lang.Long _pcpichTxPower;
        private final java.lang.String _plmnid;
        private final java.lang.Short _rac;
        private final java.lang.Integer _rncid;
        private final java.lang.Integer _uarfcndl;
        private final java.lang.Integer _uarfcnul;
        private final java.lang.Integer _ura;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>> augmentation = Collections.emptyMap();

        private LteRanNeighborListInUseInterRatCellUmtsImpl(LteRanNeighborListInUseInterRatCellUmtsBuilder base) {
            if (base.getKey() == null) {
                this._key = new LteRanNeighborListInUseInterRatCellUmtsKey(
                    base.getCid(), 
                    base.getPlmnid()
                );
                this._cid = base.getCid();
                this._plmnid = base.getPlmnid();
            } else {
                this._key = base.getKey();
                this._cid = _key.getCid();
                this._plmnid = _key.getPlmnid();
            }
            this._lac = base.getLac();
            this._pcpichScramblingCode = base.getPcpichScramblingCode();
            this._pcpichTxPower = base.getPcpichTxPower();
            this._rac = base.getRac();
            this._rncid = base.getRncid();
            this._uarfcndl = base.getUarfcndl();
            this._uarfcnul = base.getUarfcnul();
            this._ura = base.getUra();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getCid() {
            return _cid;
        }
        
        @Override
        public LteRanNeighborListInUseInterRatCellUmtsKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getLac() {
            return _lac;
        }
        
        @Override
        public java.lang.Integer getPcpichScramblingCode() {
            return _pcpichScramblingCode;
        }
        
        @Override
        public java.lang.Long getPcpichTxPower() {
            return _pcpichTxPower;
        }
        
        @Override
        public java.lang.String getPlmnid() {
            return _plmnid;
        }
        
        @Override
        public java.lang.Short getRac() {
            return _rac;
        }
        
        @Override
        public java.lang.Integer getRncid() {
            return _rncid;
        }
        
        @Override
        public java.lang.Integer getUarfcndl() {
            return _uarfcndl;
        }
        
        @Override
        public java.lang.Integer getUarfcnul() {
            return _uarfcnul;
        }
        
        @Override
        public java.lang.Integer getUra() {
            return _ura;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cid);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_lac);
            result = prime * result + Objects.hashCode(_pcpichScramblingCode);
            result = prime * result + Objects.hashCode(_pcpichTxPower);
            result = prime * result + Objects.hashCode(_plmnid);
            result = prime * result + Objects.hashCode(_rac);
            result = prime * result + Objects.hashCode(_rncid);
            result = prime * result + Objects.hashCode(_uarfcndl);
            result = prime * result + Objects.hashCode(_uarfcnul);
            result = prime * result + Objects.hashCode(_ura);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts)obj;
            if (!Objects.equals(_cid, other.getCid())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_lac, other.getLac())) {
                return false;
            }
            if (!Objects.equals(_pcpichScramblingCode, other.getPcpichScramblingCode())) {
                return false;
            }
            if (!Objects.equals(_pcpichTxPower, other.getPcpichTxPower())) {
                return false;
            }
            if (!Objects.equals(_plmnid, other.getPlmnid())) {
                return false;
            }
            if (!Objects.equals(_rac, other.getRac())) {
                return false;
            }
            if (!Objects.equals(_rncid, other.getRncid())) {
                return false;
            }
            if (!Objects.equals(_uarfcndl, other.getUarfcndl())) {
                return false;
            }
            if (!Objects.equals(_uarfcnul, other.getUarfcnul())) {
                return false;
            }
            if (!Objects.equals(_ura, other.getUra())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanNeighborListInUseInterRatCellUmtsImpl otherImpl = (LteRanNeighborListInUseInterRatCellUmtsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellUmts>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanNeighborListInUseInterRatCellUmts [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
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
            if (_lac != null) {
                builder.append("_lac=");
                builder.append(_lac);
                builder.append(", ");
            }
            if (_pcpichScramblingCode != null) {
                builder.append("_pcpichScramblingCode=");
                builder.append(_pcpichScramblingCode);
                builder.append(", ");
            }
            if (_pcpichTxPower != null) {
                builder.append("_pcpichTxPower=");
                builder.append(_pcpichTxPower);
                builder.append(", ");
            }
            if (_plmnid != null) {
                builder.append("_plmnid=");
                builder.append(_plmnid);
                builder.append(", ");
            }
            if (_rac != null) {
                builder.append("_rac=");
                builder.append(_rac);
                builder.append(", ");
            }
            if (_rncid != null) {
                builder.append("_rncid=");
                builder.append(_rncid);
                builder.append(", ");
            }
            if (_uarfcndl != null) {
                builder.append("_uarfcndl=");
                builder.append(_uarfcndl);
                builder.append(", ");
            }
            if (_uarfcnul != null) {
                builder.append("_uarfcnul=");
                builder.append(_uarfcnul);
                builder.append(", ");
            }
            if (_ura != null) {
                builder.append("_ura=");
                builder.append(_ura);
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
