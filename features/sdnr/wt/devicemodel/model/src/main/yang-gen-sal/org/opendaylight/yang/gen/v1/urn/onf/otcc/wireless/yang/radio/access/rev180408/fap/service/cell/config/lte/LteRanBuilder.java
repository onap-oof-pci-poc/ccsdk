package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanMobility;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRlc;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCommon;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanMac;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanS1Ap;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRrcTimers;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanS1U;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan
 *
 */
public class LteRanBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan> {

    private LteRanCellRestriction _lteRanCellRestriction;
    private LteRanCommon _lteRanCommon;
    private LteRanMac _lteRanMac;
    private LteRanMobility _lteRanMobility;
    private LteRanNeighborList _lteRanNeighborList;
    private LteRanNeighborListInUse _lteRanNeighborListInUse;
    private LteRanPhy _lteRanPhy;
    private LteRanRf _lteRanRf;
    private LteRanRlc _lteRanRlc;
    private LteRanRrcTimers _lteRanRrcTimers;
    private LteRanS1Ap _lteRanS1Ap;
    private LteRanS1U _lteRanS1U;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>> augmentation = Collections.emptyMap();

    public LteRanBuilder() {
    }

    public LteRanBuilder(LteRan base) {
        this._lteRanCellRestriction = base.getLteRanCellRestriction();
        this._lteRanCommon = base.getLteRanCommon();
        this._lteRanMac = base.getLteRanMac();
        this._lteRanMobility = base.getLteRanMobility();
        this._lteRanNeighborList = base.getLteRanNeighborList();
        this._lteRanNeighborListInUse = base.getLteRanNeighborListInUse();
        this._lteRanPhy = base.getLteRanPhy();
        this._lteRanRf = base.getLteRanRf();
        this._lteRanRlc = base.getLteRanRlc();
        this._lteRanRrcTimers = base.getLteRanRrcTimers();
        this._lteRanS1Ap = base.getLteRanS1Ap();
        this._lteRanS1U = base.getLteRanS1U();
        if (base instanceof LteRanImpl) {
            LteRanImpl impl = (LteRanImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public LteRanCellRestriction getLteRanCellRestriction() {
        return _lteRanCellRestriction;
    }
    
    public LteRanCommon getLteRanCommon() {
        return _lteRanCommon;
    }
    
    public LteRanMac getLteRanMac() {
        return _lteRanMac;
    }
    
    public LteRanMobility getLteRanMobility() {
        return _lteRanMobility;
    }
    
    public LteRanNeighborList getLteRanNeighborList() {
        return _lteRanNeighborList;
    }
    
    public LteRanNeighborListInUse getLteRanNeighborListInUse() {
        return _lteRanNeighborListInUse;
    }
    
    public LteRanPhy getLteRanPhy() {
        return _lteRanPhy;
    }
    
    public LteRanRf getLteRanRf() {
        return _lteRanRf;
    }
    
    public LteRanRlc getLteRanRlc() {
        return _lteRanRlc;
    }
    
    public LteRanRrcTimers getLteRanRrcTimers() {
        return _lteRanRrcTimers;
    }
    
    public LteRanS1Ap getLteRanS1Ap() {
        return _lteRanS1Ap;
    }
    
    public LteRanS1U getLteRanS1U() {
        return _lteRanS1U;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanBuilder setLteRanCellRestriction(final LteRanCellRestriction value) {
        this._lteRanCellRestriction = value;
        return this;
    }
    
     
    public LteRanBuilder setLteRanCommon(final LteRanCommon value) {
        this._lteRanCommon = value;
        return this;
    }
    
     
    public LteRanBuilder setLteRanMac(final LteRanMac value) {
        this._lteRanMac = value;
        return this;
    }
    
     
    public LteRanBuilder setLteRanMobility(final LteRanMobility value) {
        this._lteRanMobility = value;
        return this;
    }
    
     
    public LteRanBuilder setLteRanNeighborList(final LteRanNeighborList value) {
        this._lteRanNeighborList = value;
        return this;
    }
    
     
    public LteRanBuilder setLteRanNeighborListInUse(final LteRanNeighborListInUse value) {
        this._lteRanNeighborListInUse = value;
        return this;
    }
    
     
    public LteRanBuilder setLteRanPhy(final LteRanPhy value) {
        this._lteRanPhy = value;
        return this;
    }
    
     
    public LteRanBuilder setLteRanRf(final LteRanRf value) {
        this._lteRanRf = value;
        return this;
    }
    
     
    public LteRanBuilder setLteRanRlc(final LteRanRlc value) {
        this._lteRanRlc = value;
        return this;
    }
    
     
    public LteRanBuilder setLteRanRrcTimers(final LteRanRrcTimers value) {
        this._lteRanRrcTimers = value;
        return this;
    }
    
     
    public LteRanBuilder setLteRanS1Ap(final LteRanS1Ap value) {
        this._lteRanS1Ap = value;
        return this;
    }
    
     
    public LteRanBuilder setLteRanS1U(final LteRanS1U value) {
        this._lteRanS1U = value;
        return this;
    }
    
    public LteRanBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRan build() {
        return new LteRanImpl(this);
    }

    private static final class LteRanImpl implements LteRan {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan.class;
        }

        private final LteRanCellRestriction _lteRanCellRestriction;
        private final LteRanCommon _lteRanCommon;
        private final LteRanMac _lteRanMac;
        private final LteRanMobility _lteRanMobility;
        private final LteRanNeighborList _lteRanNeighborList;
        private final LteRanNeighborListInUse _lteRanNeighborListInUse;
        private final LteRanPhy _lteRanPhy;
        private final LteRanRf _lteRanRf;
        private final LteRanRlc _lteRanRlc;
        private final LteRanRrcTimers _lteRanRrcTimers;
        private final LteRanS1Ap _lteRanS1Ap;
        private final LteRanS1U _lteRanS1U;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>> augmentation = Collections.emptyMap();

        private LteRanImpl(LteRanBuilder base) {
            this._lteRanCellRestriction = base.getLteRanCellRestriction();
            this._lteRanCommon = base.getLteRanCommon();
            this._lteRanMac = base.getLteRanMac();
            this._lteRanMobility = base.getLteRanMobility();
            this._lteRanNeighborList = base.getLteRanNeighborList();
            this._lteRanNeighborListInUse = base.getLteRanNeighborListInUse();
            this._lteRanPhy = base.getLteRanPhy();
            this._lteRanRf = base.getLteRanRf();
            this._lteRanRlc = base.getLteRanRlc();
            this._lteRanRrcTimers = base.getLteRanRrcTimers();
            this._lteRanS1Ap = base.getLteRanS1Ap();
            this._lteRanS1U = base.getLteRanS1U();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public LteRanCellRestriction getLteRanCellRestriction() {
            return _lteRanCellRestriction;
        }
        
        @Override
        public LteRanCommon getLteRanCommon() {
            return _lteRanCommon;
        }
        
        @Override
        public LteRanMac getLteRanMac() {
            return _lteRanMac;
        }
        
        @Override
        public LteRanMobility getLteRanMobility() {
            return _lteRanMobility;
        }
        
        @Override
        public LteRanNeighborList getLteRanNeighborList() {
            return _lteRanNeighborList;
        }
        
        @Override
        public LteRanNeighborListInUse getLteRanNeighborListInUse() {
            return _lteRanNeighborListInUse;
        }
        
        @Override
        public LteRanPhy getLteRanPhy() {
            return _lteRanPhy;
        }
        
        @Override
        public LteRanRf getLteRanRf() {
            return _lteRanRf;
        }
        
        @Override
        public LteRanRlc getLteRanRlc() {
            return _lteRanRlc;
        }
        
        @Override
        public LteRanRrcTimers getLteRanRrcTimers() {
            return _lteRanRrcTimers;
        }
        
        @Override
        public LteRanS1Ap getLteRanS1Ap() {
            return _lteRanS1Ap;
        }
        
        @Override
        public LteRanS1U getLteRanS1U() {
            return _lteRanS1U;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_lteRanCellRestriction);
            result = prime * result + Objects.hashCode(_lteRanCommon);
            result = prime * result + Objects.hashCode(_lteRanMac);
            result = prime * result + Objects.hashCode(_lteRanMobility);
            result = prime * result + Objects.hashCode(_lteRanNeighborList);
            result = prime * result + Objects.hashCode(_lteRanNeighborListInUse);
            result = prime * result + Objects.hashCode(_lteRanPhy);
            result = prime * result + Objects.hashCode(_lteRanRf);
            result = prime * result + Objects.hashCode(_lteRanRlc);
            result = prime * result + Objects.hashCode(_lteRanRrcTimers);
            result = prime * result + Objects.hashCode(_lteRanS1Ap);
            result = prime * result + Objects.hashCode(_lteRanS1U);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan)obj;
            if (!Objects.equals(_lteRanCellRestriction, other.getLteRanCellRestriction())) {
                return false;
            }
            if (!Objects.equals(_lteRanCommon, other.getLteRanCommon())) {
                return false;
            }
            if (!Objects.equals(_lteRanMac, other.getLteRanMac())) {
                return false;
            }
            if (!Objects.equals(_lteRanMobility, other.getLteRanMobility())) {
                return false;
            }
            if (!Objects.equals(_lteRanNeighborList, other.getLteRanNeighborList())) {
                return false;
            }
            if (!Objects.equals(_lteRanNeighborListInUse, other.getLteRanNeighborListInUse())) {
                return false;
            }
            if (!Objects.equals(_lteRanPhy, other.getLteRanPhy())) {
                return false;
            }
            if (!Objects.equals(_lteRanRf, other.getLteRanRf())) {
                return false;
            }
            if (!Objects.equals(_lteRanRlc, other.getLteRanRlc())) {
                return false;
            }
            if (!Objects.equals(_lteRanRrcTimers, other.getLteRanRrcTimers())) {
                return false;
            }
            if (!Objects.equals(_lteRanS1Ap, other.getLteRanS1Ap())) {
                return false;
            }
            if (!Objects.equals(_lteRanS1U, other.getLteRanS1U())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanImpl otherImpl = (LteRanImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRan [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_lteRanCellRestriction != null) {
                builder.append("_lteRanCellRestriction=");
                builder.append(_lteRanCellRestriction);
                builder.append(", ");
            }
            if (_lteRanCommon != null) {
                builder.append("_lteRanCommon=");
                builder.append(_lteRanCommon);
                builder.append(", ");
            }
            if (_lteRanMac != null) {
                builder.append("_lteRanMac=");
                builder.append(_lteRanMac);
                builder.append(", ");
            }
            if (_lteRanMobility != null) {
                builder.append("_lteRanMobility=");
                builder.append(_lteRanMobility);
                builder.append(", ");
            }
            if (_lteRanNeighborList != null) {
                builder.append("_lteRanNeighborList=");
                builder.append(_lteRanNeighborList);
                builder.append(", ");
            }
            if (_lteRanNeighborListInUse != null) {
                builder.append("_lteRanNeighborListInUse=");
                builder.append(_lteRanNeighborListInUse);
                builder.append(", ");
            }
            if (_lteRanPhy != null) {
                builder.append("_lteRanPhy=");
                builder.append(_lteRanPhy);
                builder.append(", ");
            }
            if (_lteRanRf != null) {
                builder.append("_lteRanRf=");
                builder.append(_lteRanRf);
                builder.append(", ");
            }
            if (_lteRanRlc != null) {
                builder.append("_lteRanRlc=");
                builder.append(_lteRanRlc);
                builder.append(", ");
            }
            if (_lteRanRrcTimers != null) {
                builder.append("_lteRanRrcTimers=");
                builder.append(_lteRanRrcTimers);
                builder.append(", ");
            }
            if (_lteRanS1Ap != null) {
                builder.append("_lteRanS1Ap=");
                builder.append(_lteRanS1Ap);
                builder.append(", ");
            }
            if (_lteRanS1U != null) {
                builder.append("_lteRanS1U=");
                builder.append(_lteRanS1U);
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
