package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell
 *
 */
public class LteRanNeighborListInUseLteCellBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell> {

    private java.lang.Long _cid;
    private java.lang.Long _cio;
    private java.lang.Integer _eutraCarrierArfcn;
    private LteRanNeighborListInUseLteCellKey _key;
    private java.lang.Integer _phyCellId;
    private java.lang.String _plmnid;
    private java.lang.Long _qOffset;
    private java.lang.Long _rsTxPower;
    private java.lang.Boolean _blacklisted;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>> augmentation = Collections.emptyMap();

    public LteRanNeighborListInUseLteCellBuilder() {
    }
    public LteRanNeighborListInUseLteCellBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseLteCellG arg) {
        this._plmnid = arg.getPlmnid();
        this._cid = arg.getCid();
        this._eutraCarrierArfcn = arg.getEutraCarrierArfcn();
        this._phyCellId = arg.getPhyCellId();
        this._qOffset = arg.getQOffset();
        this._cio = arg.getCio();
        this._rsTxPower = arg.getRsTxPower();
        this._blacklisted = arg.isBlacklisted();
    }

    public LteRanNeighborListInUseLteCellBuilder(LteRanNeighborListInUseLteCell base) {
        if (base.getKey() == null) {
            this._key = new LteRanNeighborListInUseLteCellKey(
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
        this._cio = base.getCio();
        this._eutraCarrierArfcn = base.getEutraCarrierArfcn();
        this._phyCellId = base.getPhyCellId();
        this._qOffset = base.getQOffset();
        this._rsTxPower = base.getRsTxPower();
        this._blacklisted = base.isBlacklisted();
        if (base instanceof LteRanNeighborListInUseLteCellImpl) {
            LteRanNeighborListInUseLteCellImpl impl = (LteRanNeighborListInUseLteCellImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseLteCellG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseLteCellG) {
            this._plmnid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseLteCellG)arg).getPlmnid();
            this._cid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseLteCellG)arg).getCid();
            this._eutraCarrierArfcn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseLteCellG)arg).getEutraCarrierArfcn();
            this._phyCellId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseLteCellG)arg).getPhyCellId();
            this._qOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseLteCellG)arg).getQOffset();
            this._cio = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseLteCellG)arg).getCio();
            this._rsTxPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseLteCellG)arg).getRsTxPower();
            this._blacklisted = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseLteCellG)arg).isBlacklisted();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseLteCellG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getCid() {
        return _cid;
    }
    
    public java.lang.Long getCio() {
        return _cio;
    }
    
    public java.lang.Integer getEutraCarrierArfcn() {
        return _eutraCarrierArfcn;
    }
    
    public LteRanNeighborListInUseLteCellKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getPhyCellId() {
        return _phyCellId;
    }
    
    public java.lang.String getPlmnid() {
        return _plmnid;
    }
    
    public java.lang.Long getQOffset() {
        return _qOffset;
    }
    
    public java.lang.Long getRsTxPower() {
        return _rsTxPower;
    }
    
    public java.lang.Boolean isBlacklisted() {
        return _blacklisted;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCidRange(final long value) {
         if (value >= 0L && value <= 268435455L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..268435455]].", value));
     }
    
    public LteRanNeighborListInUseLteCellBuilder setCid(final java.lang.Long value) {
    if (value != null) {
        checkCidRange(value);
    }
        this._cid = value;
        return this;
    }
    
     
    public LteRanNeighborListInUseLteCellBuilder setCio(final java.lang.Long value) {
        this._cio = value;
        return this;
    }
    
     
     private static void checkEutraCarrierArfcnRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public LteRanNeighborListInUseLteCellBuilder setEutraCarrierArfcn(final java.lang.Integer value) {
    if (value != null) {
        checkEutraCarrierArfcnRange(value);
    }
        this._eutraCarrierArfcn = value;
        return this;
    }
    
     
    public LteRanNeighborListInUseLteCellBuilder setKey(final LteRanNeighborListInUseLteCellKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void checkPhyCellIdRange(final int value) {
         if (value >= 0 && value <= 503) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..503]].", value));
     }
    
    public LteRanNeighborListInUseLteCellBuilder setPhyCellId(final java.lang.Integer value) {
    if (value != null) {
        checkPhyCellIdRange(value);
    }
        this._phyCellId = value;
        return this;
    }
    
     
     private static void check_plmnidLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 6) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..6]].", value));
     }
    
    public LteRanNeighborListInUseLteCellBuilder setPlmnid(final java.lang.String value) {
    if (value != null) {
        check_plmnidLength(value);
    }
        this._plmnid = value;
        return this;
    }
    
     
    public LteRanNeighborListInUseLteCellBuilder setQOffset(final java.lang.Long value) {
        this._qOffset = value;
        return this;
    }
    
     
    public LteRanNeighborListInUseLteCellBuilder setRsTxPower(final java.lang.Long value) {
        this._rsTxPower = value;
        return this;
    }
    
     
    public LteRanNeighborListInUseLteCellBuilder setBlacklisted(final java.lang.Boolean value) {
        this._blacklisted = value;
        return this;
    }
    
    public LteRanNeighborListInUseLteCellBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanNeighborListInUseLteCellBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanNeighborListInUseLteCell build() {
        return new LteRanNeighborListInUseLteCellImpl(this);
    }

    private static final class LteRanNeighborListInUseLteCellImpl implements LteRanNeighborListInUseLteCell {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell.class;
        }

        private final java.lang.Long _cid;
        private final java.lang.Long _cio;
        private final java.lang.Integer _eutraCarrierArfcn;
        private final LteRanNeighborListInUseLteCellKey _key;
        private final java.lang.Integer _phyCellId;
        private final java.lang.String _plmnid;
        private final java.lang.Long _qOffset;
        private final java.lang.Long _rsTxPower;
        private final java.lang.Boolean _blacklisted;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>> augmentation = Collections.emptyMap();

        private LteRanNeighborListInUseLteCellImpl(LteRanNeighborListInUseLteCellBuilder base) {
            if (base.getKey() == null) {
                this._key = new LteRanNeighborListInUseLteCellKey(
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
            this._cio = base.getCio();
            this._eutraCarrierArfcn = base.getEutraCarrierArfcn();
            this._phyCellId = base.getPhyCellId();
            this._qOffset = base.getQOffset();
            this._rsTxPower = base.getRsTxPower();
            this._blacklisted = base.isBlacklisted();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getCid() {
            return _cid;
        }
        
        @Override
        public java.lang.Long getCio() {
            return _cio;
        }
        
        @Override
        public java.lang.Integer getEutraCarrierArfcn() {
            return _eutraCarrierArfcn;
        }
        
        @Override
        public LteRanNeighborListInUseLteCellKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getPhyCellId() {
            return _phyCellId;
        }
        
        @Override
        public java.lang.String getPlmnid() {
            return _plmnid;
        }
        
        @Override
        public java.lang.Long getQOffset() {
            return _qOffset;
        }
        
        @Override
        public java.lang.Long getRsTxPower() {
            return _rsTxPower;
        }
        
        @Override
        public java.lang.Boolean isBlacklisted() {
            return _blacklisted;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cio);
            result = prime * result + Objects.hashCode(_eutraCarrierArfcn);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_phyCellId);
            result = prime * result + Objects.hashCode(_plmnid);
            result = prime * result + Objects.hashCode(_qOffset);
            result = prime * result + Objects.hashCode(_rsTxPower);
            result = prime * result + Objects.hashCode(_blacklisted);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell)obj;
            if (!Objects.equals(_cid, other.getCid())) {
                return false;
            }
            if (!Objects.equals(_cio, other.getCio())) {
                return false;
            }
            if (!Objects.equals(_eutraCarrierArfcn, other.getEutraCarrierArfcn())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_phyCellId, other.getPhyCellId())) {
                return false;
            }
            if (!Objects.equals(_plmnid, other.getPlmnid())) {
                return false;
            }
            if (!Objects.equals(_qOffset, other.getQOffset())) {
                return false;
            }
            if (!Objects.equals(_rsTxPower, other.getRsTxPower())) {
                return false;
            }
            if (!Objects.equals(_blacklisted, other.isBlacklisted())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanNeighborListInUseLteCellImpl otherImpl = (LteRanNeighborListInUseLteCellImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanNeighborListInUseLteCell [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cid != null) {
                builder.append("_cid=");
                builder.append(_cid);
                builder.append(", ");
            }
            if (_cio != null) {
                builder.append("_cio=");
                builder.append(_cio);
                builder.append(", ");
            }
            if (_eutraCarrierArfcn != null) {
                builder.append("_eutraCarrierArfcn=");
                builder.append(_eutraCarrierArfcn);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_phyCellId != null) {
                builder.append("_phyCellId=");
                builder.append(_phyCellId);
                builder.append(", ");
            }
            if (_plmnid != null) {
                builder.append("_plmnid=");
                builder.append(_plmnid);
                builder.append(", ");
            }
            if (_qOffset != null) {
                builder.append("_qOffset=");
                builder.append(_qOffset);
                builder.append(", ");
            }
            if (_rsTxPower != null) {
                builder.append("_rsTxPower=");
                builder.append(_rsTxPower);
                builder.append(", ");
            }
            if (_blacklisted != null) {
                builder.append("_blacklisted=");
                builder.append(_blacklisted);
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
