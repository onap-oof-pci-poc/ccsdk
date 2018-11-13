package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction
 *
 */
public class UmtsRanCellRestrictionBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction> {

    private List<java.lang.Short> _accessClassBarredListCs;
    private List<java.lang.Short> _accessClassBarredListPs;
    private java.lang.Integer _tBarred;
    private java.lang.Boolean _cellBarred;
    private java.lang.Boolean _cellReservedForOperatorUse;
    private java.lang.Boolean _intraFreqCellReselectionIndicator;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>> augmentation = Collections.emptyMap();

    public UmtsRanCellRestrictionBuilder() {
    }
    public UmtsRanCellRestrictionBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellRestrictionG arg) {
        this._cellBarred = arg.isCellBarred();
        this._intraFreqCellReselectionIndicator = arg.isIntraFreqCellReselectionIndicator();
        this._tBarred = arg.getTBarred();
        this._accessClassBarredListCs = arg.getAccessClassBarredListCs();
        this._accessClassBarredListPs = arg.getAccessClassBarredListPs();
        this._cellReservedForOperatorUse = arg.isCellReservedForOperatorUse();
    }

    public UmtsRanCellRestrictionBuilder(UmtsRanCellRestriction base) {
        this._accessClassBarredListCs = base.getAccessClassBarredListCs();
        this._accessClassBarredListPs = base.getAccessClassBarredListPs();
        this._tBarred = base.getTBarred();
        this._cellBarred = base.isCellBarred();
        this._cellReservedForOperatorUse = base.isCellReservedForOperatorUse();
        this._intraFreqCellReselectionIndicator = base.isIntraFreqCellReselectionIndicator();
        if (base instanceof UmtsRanCellRestrictionImpl) {
            UmtsRanCellRestrictionImpl impl = (UmtsRanCellRestrictionImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellRestrictionG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellRestrictionG) {
            this._cellBarred = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellRestrictionG)arg).isCellBarred();
            this._intraFreqCellReselectionIndicator = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellRestrictionG)arg).isIntraFreqCellReselectionIndicator();
            this._tBarred = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellRestrictionG)arg).getTBarred();
            this._accessClassBarredListCs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellRestrictionG)arg).getAccessClassBarredListCs();
            this._accessClassBarredListPs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellRestrictionG)arg).getAccessClassBarredListPs();
            this._cellReservedForOperatorUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellRestrictionG)arg).isCellReservedForOperatorUse();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanCellRestrictionG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.Short> getAccessClassBarredListCs() {
        return _accessClassBarredListCs;
    }
    
    public List<java.lang.Short> getAccessClassBarredListPs() {
        return _accessClassBarredListPs;
    }
    
    public java.lang.Integer getTBarred() {
        return _tBarred;
    }
    
    public java.lang.Boolean isCellBarred() {
        return _cellBarred;
    }
    
    public java.lang.Boolean isCellReservedForOperatorUse() {
        return _cellReservedForOperatorUse;
    }
    
    public java.lang.Boolean isIntraFreqCellReselectionIndicator() {
        return _intraFreqCellReselectionIndicator;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public UmtsRanCellRestrictionBuilder setAccessClassBarredListCs(final List<java.lang.Short> value) {
        this._accessClassBarredListCs = value;
        return this;
    }
    
     
    public UmtsRanCellRestrictionBuilder setAccessClassBarredListPs(final List<java.lang.Short> value) {
        this._accessClassBarredListPs = value;
        return this;
    }
    
     
     private static void checkTBarredRange(final int value) {
         if (value >= 10 && value <= 10) {
             return;
         }
         if (value >= 20 && value <= 20) {
             return;
         }
         if (value >= 40 && value <= 40) {
             return;
         }
         if (value >= 80 && value <= 80) {
             return;
         }
         if (value >= 160 && value <= 160) {
             return;
         }
         if (value >= 320 && value <= 320) {
             return;
         }
         if (value >= 640 && value <= 640) {
             return;
         }
         if (value >= 1280 && value <= 1280) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[10..10], [20..20], [40..40], [80..80], [160..160], [320..320], [640..640], [1280..1280]].", value));
     }
    
    public UmtsRanCellRestrictionBuilder setTBarred(final java.lang.Integer value) {
    if (value != null) {
        checkTBarredRange(value);
    }
        this._tBarred = value;
        return this;
    }
    
     
    public UmtsRanCellRestrictionBuilder setCellBarred(final java.lang.Boolean value) {
        this._cellBarred = value;
        return this;
    }
    
     
    public UmtsRanCellRestrictionBuilder setCellReservedForOperatorUse(final java.lang.Boolean value) {
        this._cellReservedForOperatorUse = value;
        return this;
    }
    
     
    public UmtsRanCellRestrictionBuilder setIntraFreqCellReselectionIndicator(final java.lang.Boolean value) {
        this._intraFreqCellReselectionIndicator = value;
        return this;
    }
    
    public UmtsRanCellRestrictionBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanCellRestrictionBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanCellRestriction build() {
        return new UmtsRanCellRestrictionImpl(this);
    }

    private static final class UmtsRanCellRestrictionImpl implements UmtsRanCellRestriction {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction.class;
        }

        private final List<java.lang.Short> _accessClassBarredListCs;
        private final List<java.lang.Short> _accessClassBarredListPs;
        private final java.lang.Integer _tBarred;
        private final java.lang.Boolean _cellBarred;
        private final java.lang.Boolean _cellReservedForOperatorUse;
        private final java.lang.Boolean _intraFreqCellReselectionIndicator;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>> augmentation = Collections.emptyMap();

        private UmtsRanCellRestrictionImpl(UmtsRanCellRestrictionBuilder base) {
            this._accessClassBarredListCs = base.getAccessClassBarredListCs();
            this._accessClassBarredListPs = base.getAccessClassBarredListPs();
            this._tBarred = base.getTBarred();
            this._cellBarred = base.isCellBarred();
            this._cellReservedForOperatorUse = base.isCellReservedForOperatorUse();
            this._intraFreqCellReselectionIndicator = base.isIntraFreqCellReselectionIndicator();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.Short> getAccessClassBarredListCs() {
            return _accessClassBarredListCs;
        }
        
        @Override
        public List<java.lang.Short> getAccessClassBarredListPs() {
            return _accessClassBarredListPs;
        }
        
        @Override
        public java.lang.Integer getTBarred() {
            return _tBarred;
        }
        
        @Override
        public java.lang.Boolean isCellBarred() {
            return _cellBarred;
        }
        
        @Override
        public java.lang.Boolean isCellReservedForOperatorUse() {
            return _cellReservedForOperatorUse;
        }
        
        @Override
        public java.lang.Boolean isIntraFreqCellReselectionIndicator() {
            return _intraFreqCellReselectionIndicator;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_accessClassBarredListCs);
            result = prime * result + Objects.hashCode(_accessClassBarredListPs);
            result = prime * result + Objects.hashCode(_tBarred);
            result = prime * result + Objects.hashCode(_cellBarred);
            result = prime * result + Objects.hashCode(_cellReservedForOperatorUse);
            result = prime * result + Objects.hashCode(_intraFreqCellReselectionIndicator);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction)obj;
            if (!Objects.equals(_accessClassBarredListCs, other.getAccessClassBarredListCs())) {
                return false;
            }
            if (!Objects.equals(_accessClassBarredListPs, other.getAccessClassBarredListPs())) {
                return false;
            }
            if (!Objects.equals(_tBarred, other.getTBarred())) {
                return false;
            }
            if (!Objects.equals(_cellBarred, other.isCellBarred())) {
                return false;
            }
            if (!Objects.equals(_cellReservedForOperatorUse, other.isCellReservedForOperatorUse())) {
                return false;
            }
            if (!Objects.equals(_intraFreqCellReselectionIndicator, other.isIntraFreqCellReselectionIndicator())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanCellRestrictionImpl otherImpl = (UmtsRanCellRestrictionImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanCellRestriction>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanCellRestriction [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_accessClassBarredListCs != null) {
                builder.append("_accessClassBarredListCs=");
                builder.append(_accessClassBarredListCs);
                builder.append(", ");
            }
            if (_accessClassBarredListPs != null) {
                builder.append("_accessClassBarredListPs=");
                builder.append(_accessClassBarredListPs);
                builder.append(", ");
            }
            if (_tBarred != null) {
                builder.append("_tBarred=");
                builder.append(_tBarred);
                builder.append(", ");
            }
            if (_cellBarred != null) {
                builder.append("_cellBarred=");
                builder.append(_cellBarred);
                builder.append(", ");
            }
            if (_cellReservedForOperatorUse != null) {
                builder.append("_cellReservedForOperatorUse=");
                builder.append(_cellReservedForOperatorUse);
                builder.append(", ");
            }
            if (_intraFreqCellReselectionIndicator != null) {
                builder.append("_intraFreqCellReselectionIndicator=");
                builder.append(_intraFreqCellReselectionIndicator);
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
