package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeInterFreq;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode
 *
 */
public class LteRanMobilityIdleModeBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode> {

    private LteRanMobilityIdleModeCommon _lteRanMobilityIdleModeCommon;
    private LteRanMobilityIdleModeInterFreq _lteRanMobilityIdleModeInterFreq;
    private LteRanMobilityIdleModeIntraFreq _lteRanMobilityIdleModeIntraFreq;
    private LteRanMobilityIdleModeIrat _lteRanMobilityIdleModeIrat;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>> augmentation = Collections.emptyMap();

    public LteRanMobilityIdleModeBuilder() {
    }

    public LteRanMobilityIdleModeBuilder(LteRanMobilityIdleMode base) {
        this._lteRanMobilityIdleModeCommon = base.getLteRanMobilityIdleModeCommon();
        this._lteRanMobilityIdleModeInterFreq = base.getLteRanMobilityIdleModeInterFreq();
        this._lteRanMobilityIdleModeIntraFreq = base.getLteRanMobilityIdleModeIntraFreq();
        this._lteRanMobilityIdleModeIrat = base.getLteRanMobilityIdleModeIrat();
        if (base instanceof LteRanMobilityIdleModeImpl) {
            LteRanMobilityIdleModeImpl impl = (LteRanMobilityIdleModeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public LteRanMobilityIdleModeCommon getLteRanMobilityIdleModeCommon() {
        return _lteRanMobilityIdleModeCommon;
    }
    
    public LteRanMobilityIdleModeInterFreq getLteRanMobilityIdleModeInterFreq() {
        return _lteRanMobilityIdleModeInterFreq;
    }
    
    public LteRanMobilityIdleModeIntraFreq getLteRanMobilityIdleModeIntraFreq() {
        return _lteRanMobilityIdleModeIntraFreq;
    }
    
    public LteRanMobilityIdleModeIrat getLteRanMobilityIdleModeIrat() {
        return _lteRanMobilityIdleModeIrat;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanMobilityIdleModeBuilder setLteRanMobilityIdleModeCommon(final LteRanMobilityIdleModeCommon value) {
        this._lteRanMobilityIdleModeCommon = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeBuilder setLteRanMobilityIdleModeInterFreq(final LteRanMobilityIdleModeInterFreq value) {
        this._lteRanMobilityIdleModeInterFreq = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeBuilder setLteRanMobilityIdleModeIntraFreq(final LteRanMobilityIdleModeIntraFreq value) {
        this._lteRanMobilityIdleModeIntraFreq = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeBuilder setLteRanMobilityIdleModeIrat(final LteRanMobilityIdleModeIrat value) {
        this._lteRanMobilityIdleModeIrat = value;
        return this;
    }
    
    public LteRanMobilityIdleModeBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMobilityIdleModeBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMobilityIdleMode build() {
        return new LteRanMobilityIdleModeImpl(this);
    }

    private static final class LteRanMobilityIdleModeImpl implements LteRanMobilityIdleMode {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode.class;
        }

        private final LteRanMobilityIdleModeCommon _lteRanMobilityIdleModeCommon;
        private final LteRanMobilityIdleModeInterFreq _lteRanMobilityIdleModeInterFreq;
        private final LteRanMobilityIdleModeIntraFreq _lteRanMobilityIdleModeIntraFreq;
        private final LteRanMobilityIdleModeIrat _lteRanMobilityIdleModeIrat;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>> augmentation = Collections.emptyMap();

        private LteRanMobilityIdleModeImpl(LteRanMobilityIdleModeBuilder base) {
            this._lteRanMobilityIdleModeCommon = base.getLteRanMobilityIdleModeCommon();
            this._lteRanMobilityIdleModeInterFreq = base.getLteRanMobilityIdleModeInterFreq();
            this._lteRanMobilityIdleModeIntraFreq = base.getLteRanMobilityIdleModeIntraFreq();
            this._lteRanMobilityIdleModeIrat = base.getLteRanMobilityIdleModeIrat();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public LteRanMobilityIdleModeCommon getLteRanMobilityIdleModeCommon() {
            return _lteRanMobilityIdleModeCommon;
        }
        
        @Override
        public LteRanMobilityIdleModeInterFreq getLteRanMobilityIdleModeInterFreq() {
            return _lteRanMobilityIdleModeInterFreq;
        }
        
        @Override
        public LteRanMobilityIdleModeIntraFreq getLteRanMobilityIdleModeIntraFreq() {
            return _lteRanMobilityIdleModeIntraFreq;
        }
        
        @Override
        public LteRanMobilityIdleModeIrat getLteRanMobilityIdleModeIrat() {
            return _lteRanMobilityIdleModeIrat;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_lteRanMobilityIdleModeCommon);
            result = prime * result + Objects.hashCode(_lteRanMobilityIdleModeInterFreq);
            result = prime * result + Objects.hashCode(_lteRanMobilityIdleModeIntraFreq);
            result = prime * result + Objects.hashCode(_lteRanMobilityIdleModeIrat);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode)obj;
            if (!Objects.equals(_lteRanMobilityIdleModeCommon, other.getLteRanMobilityIdleModeCommon())) {
                return false;
            }
            if (!Objects.equals(_lteRanMobilityIdleModeInterFreq, other.getLteRanMobilityIdleModeInterFreq())) {
                return false;
            }
            if (!Objects.equals(_lteRanMobilityIdleModeIntraFreq, other.getLteRanMobilityIdleModeIntraFreq())) {
                return false;
            }
            if (!Objects.equals(_lteRanMobilityIdleModeIrat, other.getLteRanMobilityIdleModeIrat())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMobilityIdleModeImpl otherImpl = (LteRanMobilityIdleModeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMobilityIdleMode [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_lteRanMobilityIdleModeCommon != null) {
                builder.append("_lteRanMobilityIdleModeCommon=");
                builder.append(_lteRanMobilityIdleModeCommon);
                builder.append(", ");
            }
            if (_lteRanMobilityIdleModeInterFreq != null) {
                builder.append("_lteRanMobilityIdleModeInterFreq=");
                builder.append(_lteRanMobilityIdleModeInterFreq);
                builder.append(", ");
            }
            if (_lteRanMobilityIdleModeIntraFreq != null) {
                builder.append("_lteRanMobilityIdleModeIntraFreq=");
                builder.append(_lteRanMobilityIdleModeIntraFreq);
                builder.append(", ");
            }
            if (_lteRanMobilityIdleModeIrat != null) {
                builder.append("_lteRanMobilityIdleModeIrat=");
                builder.append(_lteRanMobilityIdleModeIrat);
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
