package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs
 *
 */
public class LteRanPhyPuschUlrsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs> {

    private java.lang.Short _cyclicShift;
    private java.lang.Short _groupAssignmentPusch;
    private java.lang.Boolean _groupHoppingEnabled;
    private java.lang.Boolean _sequenceHoppingEnabled;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>> augmentation = Collections.emptyMap();

    public LteRanPhyPuschUlrsBuilder() {
    }
    public LteRanPhyPuschUlrsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschUlrsG arg) {
        this._groupHoppingEnabled = arg.isGroupHoppingEnabled();
        this._groupAssignmentPusch = arg.getGroupAssignmentPusch();
        this._sequenceHoppingEnabled = arg.isSequenceHoppingEnabled();
        this._cyclicShift = arg.getCyclicShift();
    }

    public LteRanPhyPuschUlrsBuilder(LteRanPhyPuschUlrs base) {
        this._cyclicShift = base.getCyclicShift();
        this._groupAssignmentPusch = base.getGroupAssignmentPusch();
        this._groupHoppingEnabled = base.isGroupHoppingEnabled();
        this._sequenceHoppingEnabled = base.isSequenceHoppingEnabled();
        if (base instanceof LteRanPhyPuschUlrsImpl) {
            LteRanPhyPuschUlrsImpl impl = (LteRanPhyPuschUlrsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschUlrsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschUlrsG) {
            this._groupHoppingEnabled = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschUlrsG)arg).isGroupHoppingEnabled();
            this._groupAssignmentPusch = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschUlrsG)arg).getGroupAssignmentPusch();
            this._sequenceHoppingEnabled = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschUlrsG)arg).isSequenceHoppingEnabled();
            this._cyclicShift = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschUlrsG)arg).getCyclicShift();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschUlrsG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getCyclicShift() {
        return _cyclicShift;
    }
    
    public java.lang.Short getGroupAssignmentPusch() {
        return _groupAssignmentPusch;
    }
    
    public java.lang.Boolean isGroupHoppingEnabled() {
        return _groupHoppingEnabled;
    }
    
    public java.lang.Boolean isSequenceHoppingEnabled() {
        return _sequenceHoppingEnabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCyclicShiftRange(final short value) {
         if (value >= (short)0 && value <= (short)7) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..7]].", value));
     }
    
    public LteRanPhyPuschUlrsBuilder setCyclicShift(final java.lang.Short value) {
    if (value != null) {
        checkCyclicShiftRange(value);
    }
        this._cyclicShift = value;
        return this;
    }
    
     
     private static void checkGroupAssignmentPuschRange(final short value) {
         if (value >= (short)0 && value <= (short)29) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..29]].", value));
     }
    
    public LteRanPhyPuschUlrsBuilder setGroupAssignmentPusch(final java.lang.Short value) {
    if (value != null) {
        checkGroupAssignmentPuschRange(value);
    }
        this._groupAssignmentPusch = value;
        return this;
    }
    
     
    public LteRanPhyPuschUlrsBuilder setGroupHoppingEnabled(final java.lang.Boolean value) {
        this._groupHoppingEnabled = value;
        return this;
    }
    
     
    public LteRanPhyPuschUlrsBuilder setSequenceHoppingEnabled(final java.lang.Boolean value) {
        this._sequenceHoppingEnabled = value;
        return this;
    }
    
    public LteRanPhyPuschUlrsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanPhyPuschUlrsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanPhyPuschUlrs build() {
        return new LteRanPhyPuschUlrsImpl(this);
    }

    private static final class LteRanPhyPuschUlrsImpl implements LteRanPhyPuschUlrs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs.class;
        }

        private final java.lang.Short _cyclicShift;
        private final java.lang.Short _groupAssignmentPusch;
        private final java.lang.Boolean _groupHoppingEnabled;
        private final java.lang.Boolean _sequenceHoppingEnabled;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>> augmentation = Collections.emptyMap();

        private LteRanPhyPuschUlrsImpl(LteRanPhyPuschUlrsBuilder base) {
            this._cyclicShift = base.getCyclicShift();
            this._groupAssignmentPusch = base.getGroupAssignmentPusch();
            this._groupHoppingEnabled = base.isGroupHoppingEnabled();
            this._sequenceHoppingEnabled = base.isSequenceHoppingEnabled();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getCyclicShift() {
            return _cyclicShift;
        }
        
        @Override
        public java.lang.Short getGroupAssignmentPusch() {
            return _groupAssignmentPusch;
        }
        
        @Override
        public java.lang.Boolean isGroupHoppingEnabled() {
            return _groupHoppingEnabled;
        }
        
        @Override
        public java.lang.Boolean isSequenceHoppingEnabled() {
            return _sequenceHoppingEnabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cyclicShift);
            result = prime * result + Objects.hashCode(_groupAssignmentPusch);
            result = prime * result + Objects.hashCode(_groupHoppingEnabled);
            result = prime * result + Objects.hashCode(_sequenceHoppingEnabled);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs)obj;
            if (!Objects.equals(_cyclicShift, other.getCyclicShift())) {
                return false;
            }
            if (!Objects.equals(_groupAssignmentPusch, other.getGroupAssignmentPusch())) {
                return false;
            }
            if (!Objects.equals(_groupHoppingEnabled, other.isGroupHoppingEnabled())) {
                return false;
            }
            if (!Objects.equals(_sequenceHoppingEnabled, other.isSequenceHoppingEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanPhyPuschUlrsImpl otherImpl = (LteRanPhyPuschUlrsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanPhyPuschUlrs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cyclicShift != null) {
                builder.append("_cyclicShift=");
                builder.append(_cyclicShift);
                builder.append(", ");
            }
            if (_groupAssignmentPusch != null) {
                builder.append("_groupAssignmentPusch=");
                builder.append(_groupAssignmentPusch);
                builder.append(", ");
            }
            if (_groupHoppingEnabled != null) {
                builder.append("_groupHoppingEnabled=");
                builder.append(_groupHoppingEnabled);
                builder.append(", ");
            }
            if (_sequenceHoppingEnabled != null) {
                builder.append("_sequenceHoppingEnabled=");
                builder.append(_sequenceHoppingEnabled);
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
