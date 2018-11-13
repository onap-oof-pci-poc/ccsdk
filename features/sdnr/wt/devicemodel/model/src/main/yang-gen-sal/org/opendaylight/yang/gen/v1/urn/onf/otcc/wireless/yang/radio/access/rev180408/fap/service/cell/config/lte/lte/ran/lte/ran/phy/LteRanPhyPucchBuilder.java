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
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPucchG.DeltaPucchShift;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch
 *
 */
public class LteRanPhyPucchBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch> {

    private List<java.lang.String> _cqipucchResourceIndex;
    private DeltaPucchShift _deltaPucchShift;
    private java.lang.Short _k;
    private List<java.lang.String> _n1Pucchan;
    private java.lang.Short _ncsan;
    private List<java.lang.String> _nrbcqi;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>> augmentation = Collections.emptyMap();

    public LteRanPhyPucchBuilder() {
    }
    public LteRanPhyPucchBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPucchG arg) {
        this._deltaPucchShift = arg.getDeltaPucchShift();
        this._nrbcqi = arg.getNrbcqi();
        this._ncsan = arg.getNcsan();
        this._n1Pucchan = arg.getN1Pucchan();
        this._cqipucchResourceIndex = arg.getCqipucchResourceIndex();
        this._k = arg.getK();
    }

    public LteRanPhyPucchBuilder(LteRanPhyPucch base) {
        this._cqipucchResourceIndex = base.getCqipucchResourceIndex();
        this._deltaPucchShift = base.getDeltaPucchShift();
        this._k = base.getK();
        this._n1Pucchan = base.getN1Pucchan();
        this._ncsan = base.getNcsan();
        this._nrbcqi = base.getNrbcqi();
        if (base instanceof LteRanPhyPucchImpl) {
            LteRanPhyPucchImpl impl = (LteRanPhyPucchImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPucchG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPucchG) {
            this._deltaPucchShift = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPucchG)arg).getDeltaPucchShift();
            this._nrbcqi = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPucchG)arg).getNrbcqi();
            this._ncsan = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPucchG)arg).getNcsan();
            this._n1Pucchan = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPucchG)arg).getN1Pucchan();
            this._cqipucchResourceIndex = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPucchG)arg).getCqipucchResourceIndex();
            this._k = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPucchG)arg).getK();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPucchG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.String> getCqipucchResourceIndex() {
        return _cqipucchResourceIndex;
    }
    
    public DeltaPucchShift getDeltaPucchShift() {
        return _deltaPucchShift;
    }
    
    public java.lang.Short getK() {
        return _k;
    }
    
    public List<java.lang.String> getN1Pucchan() {
        return _n1Pucchan;
    }
    
    public java.lang.Short getNcsan() {
        return _ncsan;
    }
    
    public List<java.lang.String> getNrbcqi() {
        return _nrbcqi;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanPhyPucchBuilder setCqipucchResourceIndex(final List<java.lang.String> value) {
        this._cqipucchResourceIndex = value;
        return this;
    }
    
     
    public LteRanPhyPucchBuilder setDeltaPucchShift(final DeltaPucchShift value) {
        this._deltaPucchShift = value;
        return this;
    }
    
     
     private static void checkKRange(final short value) {
         if (value >= (short)1 && value <= (short)4) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..4]].", value));
     }
    
    public LteRanPhyPucchBuilder setK(final java.lang.Short value) {
    if (value != null) {
        checkKRange(value);
    }
        this._k = value;
        return this;
    }
    
     
    public LteRanPhyPucchBuilder setN1Pucchan(final List<java.lang.String> value) {
        this._n1Pucchan = value;
        return this;
    }
    
     
     private static void checkNcsanRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public LteRanPhyPucchBuilder setNcsan(final java.lang.Short value) {
    if (value != null) {
        checkNcsanRange(value);
    }
        this._ncsan = value;
        return this;
    }
    
     
    public LteRanPhyPucchBuilder setNrbcqi(final List<java.lang.String> value) {
        this._nrbcqi = value;
        return this;
    }
    
    public LteRanPhyPucchBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanPhyPucchBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanPhyPucch build() {
        return new LteRanPhyPucchImpl(this);
    }

    private static final class LteRanPhyPucchImpl implements LteRanPhyPucch {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch.class;
        }

        private final List<java.lang.String> _cqipucchResourceIndex;
        private final DeltaPucchShift _deltaPucchShift;
        private final java.lang.Short _k;
        private final List<java.lang.String> _n1Pucchan;
        private final java.lang.Short _ncsan;
        private final List<java.lang.String> _nrbcqi;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>> augmentation = Collections.emptyMap();

        private LteRanPhyPucchImpl(LteRanPhyPucchBuilder base) {
            this._cqipucchResourceIndex = base.getCqipucchResourceIndex();
            this._deltaPucchShift = base.getDeltaPucchShift();
            this._k = base.getK();
            this._n1Pucchan = base.getN1Pucchan();
            this._ncsan = base.getNcsan();
            this._nrbcqi = base.getNrbcqi();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.String> getCqipucchResourceIndex() {
            return _cqipucchResourceIndex;
        }
        
        @Override
        public DeltaPucchShift getDeltaPucchShift() {
            return _deltaPucchShift;
        }
        
        @Override
        public java.lang.Short getK() {
            return _k;
        }
        
        @Override
        public List<java.lang.String> getN1Pucchan() {
            return _n1Pucchan;
        }
        
        @Override
        public java.lang.Short getNcsan() {
            return _ncsan;
        }
        
        @Override
        public List<java.lang.String> getNrbcqi() {
            return _nrbcqi;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cqipucchResourceIndex);
            result = prime * result + Objects.hashCode(_deltaPucchShift);
            result = prime * result + Objects.hashCode(_k);
            result = prime * result + Objects.hashCode(_n1Pucchan);
            result = prime * result + Objects.hashCode(_ncsan);
            result = prime * result + Objects.hashCode(_nrbcqi);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch)obj;
            if (!Objects.equals(_cqipucchResourceIndex, other.getCqipucchResourceIndex())) {
                return false;
            }
            if (!Objects.equals(_deltaPucchShift, other.getDeltaPucchShift())) {
                return false;
            }
            if (!Objects.equals(_k, other.getK())) {
                return false;
            }
            if (!Objects.equals(_n1Pucchan, other.getN1Pucchan())) {
                return false;
            }
            if (!Objects.equals(_ncsan, other.getNcsan())) {
                return false;
            }
            if (!Objects.equals(_nrbcqi, other.getNrbcqi())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanPhyPucchImpl otherImpl = (LteRanPhyPucchImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanPhyPucch [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cqipucchResourceIndex != null) {
                builder.append("_cqipucchResourceIndex=");
                builder.append(_cqipucchResourceIndex);
                builder.append(", ");
            }
            if (_deltaPucchShift != null) {
                builder.append("_deltaPucchShift=");
                builder.append(_deltaPucchShift);
                builder.append(", ");
            }
            if (_k != null) {
                builder.append("_k=");
                builder.append(_k);
                builder.append(", ");
            }
            if (_n1Pucchan != null) {
                builder.append("_n1Pucchan=");
                builder.append(_n1Pucchan);
                builder.append(", ");
            }
            if (_ncsan != null) {
                builder.append("_ncsan=");
                builder.append(_ncsan);
                builder.append(", ");
            }
            if (_nrbcqi != null) {
                builder.append("_nrbcqi=");
                builder.append(_nrbcqi);
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
