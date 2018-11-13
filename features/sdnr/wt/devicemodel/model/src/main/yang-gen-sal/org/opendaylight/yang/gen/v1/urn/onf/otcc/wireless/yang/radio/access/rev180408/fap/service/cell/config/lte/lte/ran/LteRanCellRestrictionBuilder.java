package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction
 *
 */
public class LteRanCellRestrictionBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction> {

    private java.lang.Boolean _barringForEmergency;
    private java.lang.Boolean _cellBarred;
    private java.lang.Boolean _cellReservedForOperatorUse;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>> augmentation = Collections.emptyMap();

    public LteRanCellRestrictionBuilder() {
    }
    public LteRanCellRestrictionBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanCellRestrictionG arg) {
        this._cellBarred = arg.isCellBarred();
        this._cellReservedForOperatorUse = arg.isCellReservedForOperatorUse();
        this._barringForEmergency = arg.isBarringForEmergency();
    }

    public LteRanCellRestrictionBuilder(LteRanCellRestriction base) {
        this._barringForEmergency = base.isBarringForEmergency();
        this._cellBarred = base.isCellBarred();
        this._cellReservedForOperatorUse = base.isCellReservedForOperatorUse();
        if (base instanceof LteRanCellRestrictionImpl) {
            LteRanCellRestrictionImpl impl = (LteRanCellRestrictionImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanCellRestrictionG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanCellRestrictionG) {
            this._cellBarred = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanCellRestrictionG)arg).isCellBarred();
            this._cellReservedForOperatorUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanCellRestrictionG)arg).isCellReservedForOperatorUse();
            this._barringForEmergency = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanCellRestrictionG)arg).isBarringForEmergency();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanCellRestrictionG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Boolean isBarringForEmergency() {
        return _barringForEmergency;
    }
    
    public java.lang.Boolean isCellBarred() {
        return _cellBarred;
    }
    
    public java.lang.Boolean isCellReservedForOperatorUse() {
        return _cellReservedForOperatorUse;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanCellRestrictionBuilder setBarringForEmergency(final java.lang.Boolean value) {
        this._barringForEmergency = value;
        return this;
    }
    
     
    public LteRanCellRestrictionBuilder setCellBarred(final java.lang.Boolean value) {
        this._cellBarred = value;
        return this;
    }
    
     
    public LteRanCellRestrictionBuilder setCellReservedForOperatorUse(final java.lang.Boolean value) {
        this._cellReservedForOperatorUse = value;
        return this;
    }
    
    public LteRanCellRestrictionBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanCellRestrictionBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanCellRestriction build() {
        return new LteRanCellRestrictionImpl(this);
    }

    private static final class LteRanCellRestrictionImpl implements LteRanCellRestriction {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction.class;
        }

        private final java.lang.Boolean _barringForEmergency;
        private final java.lang.Boolean _cellBarred;
        private final java.lang.Boolean _cellReservedForOperatorUse;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>> augmentation = Collections.emptyMap();

        private LteRanCellRestrictionImpl(LteRanCellRestrictionBuilder base) {
            this._barringForEmergency = base.isBarringForEmergency();
            this._cellBarred = base.isCellBarred();
            this._cellReservedForOperatorUse = base.isCellReservedForOperatorUse();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Boolean isBarringForEmergency() {
            return _barringForEmergency;
        }
        
        @Override
        public java.lang.Boolean isCellBarred() {
            return _cellBarred;
        }
        
        @Override
        public java.lang.Boolean isCellReservedForOperatorUse() {
            return _cellReservedForOperatorUse;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_barringForEmergency);
            result = prime * result + Objects.hashCode(_cellBarred);
            result = prime * result + Objects.hashCode(_cellReservedForOperatorUse);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction)obj;
            if (!Objects.equals(_barringForEmergency, other.isBarringForEmergency())) {
                return false;
            }
            if (!Objects.equals(_cellBarred, other.isCellBarred())) {
                return false;
            }
            if (!Objects.equals(_cellReservedForOperatorUse, other.isCellReservedForOperatorUse())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanCellRestrictionImpl otherImpl = (LteRanCellRestrictionImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanCellRestriction>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanCellRestriction [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_barringForEmergency != null) {
                builder.append("_barringForEmergency=");
                builder.append(_barringForEmergency);
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
