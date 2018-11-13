package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPdsch;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyAntennaInfo;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyTddFrame;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy
 *
 */
public class LteRanPhyBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy> {

    private LteRanPhyAntennaInfo _lteRanPhyAntennaInfo;
    private LteRanPhyMbsfn _lteRanPhyMbsfn;
    private LteRanPhyPdsch _lteRanPhyPdsch;
    private LteRanPhyPrach _lteRanPhyPrach;
    private LteRanPhyPrs _lteRanPhyPrs;
    private LteRanPhyPucch _lteRanPhyPucch;
    private LteRanPhyPusch _lteRanPhyPusch;
    private LteRanPhySrs _lteRanPhySrs;
    private LteRanPhyTddFrame _lteRanPhyTddFrame;
    private LteRanPhyUlPowerControl _lteRanPhyUlPowerControl;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>> augmentation = Collections.emptyMap();

    public LteRanPhyBuilder() {
    }

    public LteRanPhyBuilder(LteRanPhy base) {
        this._lteRanPhyAntennaInfo = base.getLteRanPhyAntennaInfo();
        this._lteRanPhyMbsfn = base.getLteRanPhyMbsfn();
        this._lteRanPhyPdsch = base.getLteRanPhyPdsch();
        this._lteRanPhyPrach = base.getLteRanPhyPrach();
        this._lteRanPhyPrs = base.getLteRanPhyPrs();
        this._lteRanPhyPucch = base.getLteRanPhyPucch();
        this._lteRanPhyPusch = base.getLteRanPhyPusch();
        this._lteRanPhySrs = base.getLteRanPhySrs();
        this._lteRanPhyTddFrame = base.getLteRanPhyTddFrame();
        this._lteRanPhyUlPowerControl = base.getLteRanPhyUlPowerControl();
        if (base instanceof LteRanPhyImpl) {
            LteRanPhyImpl impl = (LteRanPhyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public LteRanPhyAntennaInfo getLteRanPhyAntennaInfo() {
        return _lteRanPhyAntennaInfo;
    }
    
    public LteRanPhyMbsfn getLteRanPhyMbsfn() {
        return _lteRanPhyMbsfn;
    }
    
    public LteRanPhyPdsch getLteRanPhyPdsch() {
        return _lteRanPhyPdsch;
    }
    
    public LteRanPhyPrach getLteRanPhyPrach() {
        return _lteRanPhyPrach;
    }
    
    public LteRanPhyPrs getLteRanPhyPrs() {
        return _lteRanPhyPrs;
    }
    
    public LteRanPhyPucch getLteRanPhyPucch() {
        return _lteRanPhyPucch;
    }
    
    public LteRanPhyPusch getLteRanPhyPusch() {
        return _lteRanPhyPusch;
    }
    
    public LteRanPhySrs getLteRanPhySrs() {
        return _lteRanPhySrs;
    }
    
    public LteRanPhyTddFrame getLteRanPhyTddFrame() {
        return _lteRanPhyTddFrame;
    }
    
    public LteRanPhyUlPowerControl getLteRanPhyUlPowerControl() {
        return _lteRanPhyUlPowerControl;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanPhyBuilder setLteRanPhyAntennaInfo(final LteRanPhyAntennaInfo value) {
        this._lteRanPhyAntennaInfo = value;
        return this;
    }
    
     
    public LteRanPhyBuilder setLteRanPhyMbsfn(final LteRanPhyMbsfn value) {
        this._lteRanPhyMbsfn = value;
        return this;
    }
    
     
    public LteRanPhyBuilder setLteRanPhyPdsch(final LteRanPhyPdsch value) {
        this._lteRanPhyPdsch = value;
        return this;
    }
    
     
    public LteRanPhyBuilder setLteRanPhyPrach(final LteRanPhyPrach value) {
        this._lteRanPhyPrach = value;
        return this;
    }
    
     
    public LteRanPhyBuilder setLteRanPhyPrs(final LteRanPhyPrs value) {
        this._lteRanPhyPrs = value;
        return this;
    }
    
     
    public LteRanPhyBuilder setLteRanPhyPucch(final LteRanPhyPucch value) {
        this._lteRanPhyPucch = value;
        return this;
    }
    
     
    public LteRanPhyBuilder setLteRanPhyPusch(final LteRanPhyPusch value) {
        this._lteRanPhyPusch = value;
        return this;
    }
    
     
    public LteRanPhyBuilder setLteRanPhySrs(final LteRanPhySrs value) {
        this._lteRanPhySrs = value;
        return this;
    }
    
     
    public LteRanPhyBuilder setLteRanPhyTddFrame(final LteRanPhyTddFrame value) {
        this._lteRanPhyTddFrame = value;
        return this;
    }
    
     
    public LteRanPhyBuilder setLteRanPhyUlPowerControl(final LteRanPhyUlPowerControl value) {
        this._lteRanPhyUlPowerControl = value;
        return this;
    }
    
    public LteRanPhyBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanPhyBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanPhy build() {
        return new LteRanPhyImpl(this);
    }

    private static final class LteRanPhyImpl implements LteRanPhy {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy.class;
        }

        private final LteRanPhyAntennaInfo _lteRanPhyAntennaInfo;
        private final LteRanPhyMbsfn _lteRanPhyMbsfn;
        private final LteRanPhyPdsch _lteRanPhyPdsch;
        private final LteRanPhyPrach _lteRanPhyPrach;
        private final LteRanPhyPrs _lteRanPhyPrs;
        private final LteRanPhyPucch _lteRanPhyPucch;
        private final LteRanPhyPusch _lteRanPhyPusch;
        private final LteRanPhySrs _lteRanPhySrs;
        private final LteRanPhyTddFrame _lteRanPhyTddFrame;
        private final LteRanPhyUlPowerControl _lteRanPhyUlPowerControl;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>> augmentation = Collections.emptyMap();

        private LteRanPhyImpl(LteRanPhyBuilder base) {
            this._lteRanPhyAntennaInfo = base.getLteRanPhyAntennaInfo();
            this._lteRanPhyMbsfn = base.getLteRanPhyMbsfn();
            this._lteRanPhyPdsch = base.getLteRanPhyPdsch();
            this._lteRanPhyPrach = base.getLteRanPhyPrach();
            this._lteRanPhyPrs = base.getLteRanPhyPrs();
            this._lteRanPhyPucch = base.getLteRanPhyPucch();
            this._lteRanPhyPusch = base.getLteRanPhyPusch();
            this._lteRanPhySrs = base.getLteRanPhySrs();
            this._lteRanPhyTddFrame = base.getLteRanPhyTddFrame();
            this._lteRanPhyUlPowerControl = base.getLteRanPhyUlPowerControl();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public LteRanPhyAntennaInfo getLteRanPhyAntennaInfo() {
            return _lteRanPhyAntennaInfo;
        }
        
        @Override
        public LteRanPhyMbsfn getLteRanPhyMbsfn() {
            return _lteRanPhyMbsfn;
        }
        
        @Override
        public LteRanPhyPdsch getLteRanPhyPdsch() {
            return _lteRanPhyPdsch;
        }
        
        @Override
        public LteRanPhyPrach getLteRanPhyPrach() {
            return _lteRanPhyPrach;
        }
        
        @Override
        public LteRanPhyPrs getLteRanPhyPrs() {
            return _lteRanPhyPrs;
        }
        
        @Override
        public LteRanPhyPucch getLteRanPhyPucch() {
            return _lteRanPhyPucch;
        }
        
        @Override
        public LteRanPhyPusch getLteRanPhyPusch() {
            return _lteRanPhyPusch;
        }
        
        @Override
        public LteRanPhySrs getLteRanPhySrs() {
            return _lteRanPhySrs;
        }
        
        @Override
        public LteRanPhyTddFrame getLteRanPhyTddFrame() {
            return _lteRanPhyTddFrame;
        }
        
        @Override
        public LteRanPhyUlPowerControl getLteRanPhyUlPowerControl() {
            return _lteRanPhyUlPowerControl;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_lteRanPhyAntennaInfo);
            result = prime * result + Objects.hashCode(_lteRanPhyMbsfn);
            result = prime * result + Objects.hashCode(_lteRanPhyPdsch);
            result = prime * result + Objects.hashCode(_lteRanPhyPrach);
            result = prime * result + Objects.hashCode(_lteRanPhyPrs);
            result = prime * result + Objects.hashCode(_lteRanPhyPucch);
            result = prime * result + Objects.hashCode(_lteRanPhyPusch);
            result = prime * result + Objects.hashCode(_lteRanPhySrs);
            result = prime * result + Objects.hashCode(_lteRanPhyTddFrame);
            result = prime * result + Objects.hashCode(_lteRanPhyUlPowerControl);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy)obj;
            if (!Objects.equals(_lteRanPhyAntennaInfo, other.getLteRanPhyAntennaInfo())) {
                return false;
            }
            if (!Objects.equals(_lteRanPhyMbsfn, other.getLteRanPhyMbsfn())) {
                return false;
            }
            if (!Objects.equals(_lteRanPhyPdsch, other.getLteRanPhyPdsch())) {
                return false;
            }
            if (!Objects.equals(_lteRanPhyPrach, other.getLteRanPhyPrach())) {
                return false;
            }
            if (!Objects.equals(_lteRanPhyPrs, other.getLteRanPhyPrs())) {
                return false;
            }
            if (!Objects.equals(_lteRanPhyPucch, other.getLteRanPhyPucch())) {
                return false;
            }
            if (!Objects.equals(_lteRanPhyPusch, other.getLteRanPhyPusch())) {
                return false;
            }
            if (!Objects.equals(_lteRanPhySrs, other.getLteRanPhySrs())) {
                return false;
            }
            if (!Objects.equals(_lteRanPhyTddFrame, other.getLteRanPhyTddFrame())) {
                return false;
            }
            if (!Objects.equals(_lteRanPhyUlPowerControl, other.getLteRanPhyUlPowerControl())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanPhyImpl otherImpl = (LteRanPhyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanPhy [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_lteRanPhyAntennaInfo != null) {
                builder.append("_lteRanPhyAntennaInfo=");
                builder.append(_lteRanPhyAntennaInfo);
                builder.append(", ");
            }
            if (_lteRanPhyMbsfn != null) {
                builder.append("_lteRanPhyMbsfn=");
                builder.append(_lteRanPhyMbsfn);
                builder.append(", ");
            }
            if (_lteRanPhyPdsch != null) {
                builder.append("_lteRanPhyPdsch=");
                builder.append(_lteRanPhyPdsch);
                builder.append(", ");
            }
            if (_lteRanPhyPrach != null) {
                builder.append("_lteRanPhyPrach=");
                builder.append(_lteRanPhyPrach);
                builder.append(", ");
            }
            if (_lteRanPhyPrs != null) {
                builder.append("_lteRanPhyPrs=");
                builder.append(_lteRanPhyPrs);
                builder.append(", ");
            }
            if (_lteRanPhyPucch != null) {
                builder.append("_lteRanPhyPucch=");
                builder.append(_lteRanPhyPucch);
                builder.append(", ");
            }
            if (_lteRanPhyPusch != null) {
                builder.append("_lteRanPhyPusch=");
                builder.append(_lteRanPhyPusch);
                builder.append(", ");
            }
            if (_lteRanPhySrs != null) {
                builder.append("_lteRanPhySrs=");
                builder.append(_lteRanPhySrs);
                builder.append(", ");
            }
            if (_lteRanPhyTddFrame != null) {
                builder.append("_lteRanPhyTddFrame=");
                builder.append(_lteRanPhyTddFrame);
                builder.append(", ");
            }
            if (_lteRanPhyUlPowerControl != null) {
                builder.append("_lteRanPhyUlPowerControl=");
                builder.append(_lteRanPhyUlPowerControl);
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
