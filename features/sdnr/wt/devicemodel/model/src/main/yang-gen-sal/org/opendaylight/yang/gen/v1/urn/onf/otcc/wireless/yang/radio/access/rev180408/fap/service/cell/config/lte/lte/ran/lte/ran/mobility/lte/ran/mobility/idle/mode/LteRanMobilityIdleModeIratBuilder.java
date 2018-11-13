package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat
 *
 */
public class LteRanMobilityIdleModeIratBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat> {

    private LteRanMobilityIdleModeIratCdma2000 _lteRanMobilityIdleModeIratCdma2000;
    private LteRanMobilityIdleModeIratGeran _lteRanMobilityIdleModeIratGeran;
    private LteRanMobilityIdleModeIratUtra _lteRanMobilityIdleModeIratUtra;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>> augmentation = Collections.emptyMap();

    public LteRanMobilityIdleModeIratBuilder() {
    }

    public LteRanMobilityIdleModeIratBuilder(LteRanMobilityIdleModeIrat base) {
        this._lteRanMobilityIdleModeIratCdma2000 = base.getLteRanMobilityIdleModeIratCdma2000();
        this._lteRanMobilityIdleModeIratGeran = base.getLteRanMobilityIdleModeIratGeran();
        this._lteRanMobilityIdleModeIratUtra = base.getLteRanMobilityIdleModeIratUtra();
        if (base instanceof LteRanMobilityIdleModeIratImpl) {
            LteRanMobilityIdleModeIratImpl impl = (LteRanMobilityIdleModeIratImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public LteRanMobilityIdleModeIratCdma2000 getLteRanMobilityIdleModeIratCdma2000() {
        return _lteRanMobilityIdleModeIratCdma2000;
    }
    
    public LteRanMobilityIdleModeIratGeran getLteRanMobilityIdleModeIratGeran() {
        return _lteRanMobilityIdleModeIratGeran;
    }
    
    public LteRanMobilityIdleModeIratUtra getLteRanMobilityIdleModeIratUtra() {
        return _lteRanMobilityIdleModeIratUtra;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanMobilityIdleModeIratBuilder setLteRanMobilityIdleModeIratCdma2000(final LteRanMobilityIdleModeIratCdma2000 value) {
        this._lteRanMobilityIdleModeIratCdma2000 = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratBuilder setLteRanMobilityIdleModeIratGeran(final LteRanMobilityIdleModeIratGeran value) {
        this._lteRanMobilityIdleModeIratGeran = value;
        return this;
    }
    
     
    public LteRanMobilityIdleModeIratBuilder setLteRanMobilityIdleModeIratUtra(final LteRanMobilityIdleModeIratUtra value) {
        this._lteRanMobilityIdleModeIratUtra = value;
        return this;
    }
    
    public LteRanMobilityIdleModeIratBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanMobilityIdleModeIratBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanMobilityIdleModeIrat build() {
        return new LteRanMobilityIdleModeIratImpl(this);
    }

    private static final class LteRanMobilityIdleModeIratImpl implements LteRanMobilityIdleModeIrat {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat.class;
        }

        private final LteRanMobilityIdleModeIratCdma2000 _lteRanMobilityIdleModeIratCdma2000;
        private final LteRanMobilityIdleModeIratGeran _lteRanMobilityIdleModeIratGeran;
        private final LteRanMobilityIdleModeIratUtra _lteRanMobilityIdleModeIratUtra;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>> augmentation = Collections.emptyMap();

        private LteRanMobilityIdleModeIratImpl(LteRanMobilityIdleModeIratBuilder base) {
            this._lteRanMobilityIdleModeIratCdma2000 = base.getLteRanMobilityIdleModeIratCdma2000();
            this._lteRanMobilityIdleModeIratGeran = base.getLteRanMobilityIdleModeIratGeran();
            this._lteRanMobilityIdleModeIratUtra = base.getLteRanMobilityIdleModeIratUtra();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public LteRanMobilityIdleModeIratCdma2000 getLteRanMobilityIdleModeIratCdma2000() {
            return _lteRanMobilityIdleModeIratCdma2000;
        }
        
        @Override
        public LteRanMobilityIdleModeIratGeran getLteRanMobilityIdleModeIratGeran() {
            return _lteRanMobilityIdleModeIratGeran;
        }
        
        @Override
        public LteRanMobilityIdleModeIratUtra getLteRanMobilityIdleModeIratUtra() {
            return _lteRanMobilityIdleModeIratUtra;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_lteRanMobilityIdleModeIratCdma2000);
            result = prime * result + Objects.hashCode(_lteRanMobilityIdleModeIratGeran);
            result = prime * result + Objects.hashCode(_lteRanMobilityIdleModeIratUtra);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat)obj;
            if (!Objects.equals(_lteRanMobilityIdleModeIratCdma2000, other.getLteRanMobilityIdleModeIratCdma2000())) {
                return false;
            }
            if (!Objects.equals(_lteRanMobilityIdleModeIratGeran, other.getLteRanMobilityIdleModeIratGeran())) {
                return false;
            }
            if (!Objects.equals(_lteRanMobilityIdleModeIratUtra, other.getLteRanMobilityIdleModeIratUtra())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanMobilityIdleModeIratImpl otherImpl = (LteRanMobilityIdleModeIratImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanMobilityIdleModeIrat [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_lteRanMobilityIdleModeIratCdma2000 != null) {
                builder.append("_lteRanMobilityIdleModeIratCdma2000=");
                builder.append(_lteRanMobilityIdleModeIratCdma2000);
                builder.append(", ");
            }
            if (_lteRanMobilityIdleModeIratGeran != null) {
                builder.append("_lteRanMobilityIdleModeIratGeran=");
                builder.append(_lteRanMobilityIdleModeIratGeran);
                builder.append(", ");
            }
            if (_lteRanMobilityIdleModeIratUtra != null) {
                builder.append("_lteRanMobilityIdleModeIratUtra=");
                builder.append(_lteRanMobilityIdleModeIratUtra);
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
