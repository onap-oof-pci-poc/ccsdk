package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl
 *
 */
public class UmtsRanPowerControlBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl> {

    private java.lang.Long _constantValue;
    private java.lang.Short _mMax;
    private java.lang.Short _nb01Max;
    private java.lang.Short _nb01Min;
    private java.lang.Short _persistenceScaleFactor;
    private java.lang.Short _powerRampStepUp;
    private java.lang.Short _preambleRetransMax;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>> augmentation = Collections.emptyMap();

    public UmtsRanPowerControlBuilder() {
    }
    public UmtsRanPowerControlBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanPowerControlG arg) {
        this._constantValue = arg.getConstantValue();
        this._powerRampStepUp = arg.getPowerRampStepUp();
        this._preambleRetransMax = arg.getPreambleRetransMax();
        this._persistenceScaleFactor = arg.getPersistenceScaleFactor();
        this._mMax = arg.getMMax();
        this._nb01Min = arg.getNb01Min();
        this._nb01Max = arg.getNb01Max();
    }

    public UmtsRanPowerControlBuilder(UmtsRanPowerControl base) {
        this._constantValue = base.getConstantValue();
        this._mMax = base.getMMax();
        this._nb01Max = base.getNb01Max();
        this._nb01Min = base.getNb01Min();
        this._persistenceScaleFactor = base.getPersistenceScaleFactor();
        this._powerRampStepUp = base.getPowerRampStepUp();
        this._preambleRetransMax = base.getPreambleRetransMax();
        if (base instanceof UmtsRanPowerControlImpl) {
            UmtsRanPowerControlImpl impl = (UmtsRanPowerControlImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanPowerControlG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanPowerControlG) {
            this._constantValue = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanPowerControlG)arg).getConstantValue();
            this._powerRampStepUp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanPowerControlG)arg).getPowerRampStepUp();
            this._preambleRetransMax = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanPowerControlG)arg).getPreambleRetransMax();
            this._persistenceScaleFactor = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanPowerControlG)arg).getPersistenceScaleFactor();
            this._mMax = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanPowerControlG)arg).getMMax();
            this._nb01Min = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanPowerControlG)arg).getNb01Min();
            this._nb01Max = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanPowerControlG)arg).getNb01Max();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanPowerControlG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getConstantValue() {
        return _constantValue;
    }
    
    public java.lang.Short getMMax() {
        return _mMax;
    }
    
    public java.lang.Short getNb01Max() {
        return _nb01Max;
    }
    
    public java.lang.Short getNb01Min() {
        return _nb01Min;
    }
    
    public java.lang.Short getPersistenceScaleFactor() {
        return _persistenceScaleFactor;
    }
    
    public java.lang.Short getPowerRampStepUp() {
        return _powerRampStepUp;
    }
    
    public java.lang.Short getPreambleRetransMax() {
        return _preambleRetransMax;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public UmtsRanPowerControlBuilder setConstantValue(final java.lang.Long value) {
        this._constantValue = value;
        return this;
    }
    
     
     private static void checkMMaxRange(final short value) {
         if (value >= (short)1 && value <= (short)32) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..32]].", value));
     }
    
    public UmtsRanPowerControlBuilder setMMax(final java.lang.Short value) {
    if (value != null) {
        checkMMaxRange(value);
    }
        this._mMax = value;
        return this;
    }
    
     
     private static void checkNb01MaxRange(final short value) {
         if (value >= (short)0 && value <= (short)50) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..50]].", value));
     }
    
    public UmtsRanPowerControlBuilder setNb01Max(final java.lang.Short value) {
    if (value != null) {
        checkNb01MaxRange(value);
    }
        this._nb01Max = value;
        return this;
    }
    
     
     private static void checkNb01MinRange(final short value) {
         if (value >= (short)0 && value <= (short)50) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..50]].", value));
     }
    
    public UmtsRanPowerControlBuilder setNb01Min(final java.lang.Short value) {
    if (value != null) {
        checkNb01MinRange(value);
    }
        this._nb01Min = value;
        return this;
    }
    
     
     private static void checkPersistenceScaleFactorRange(final short value) {
         if (value >= (short)2 && value <= (short)9) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[2..9]].", value));
     }
    
    public UmtsRanPowerControlBuilder setPersistenceScaleFactor(final java.lang.Short value) {
    if (value != null) {
        checkPersistenceScaleFactorRange(value);
    }
        this._persistenceScaleFactor = value;
        return this;
    }
    
     
     private static void checkPowerRampStepUpRange(final short value) {
         if (value >= (short)1 && value <= (short)8) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..8]].", value));
     }
    
    public UmtsRanPowerControlBuilder setPowerRampStepUp(final java.lang.Short value) {
    if (value != null) {
        checkPowerRampStepUpRange(value);
    }
        this._powerRampStepUp = value;
        return this;
    }
    
     
     private static void checkPreambleRetransMaxRange(final short value) {
         if (value >= (short)1 && value <= (short)64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..64]].", value));
     }
    
    public UmtsRanPowerControlBuilder setPreambleRetransMax(final java.lang.Short value) {
    if (value != null) {
        checkPreambleRetransMaxRange(value);
    }
        this._preambleRetransMax = value;
        return this;
    }
    
    public UmtsRanPowerControlBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsRanPowerControlBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsRanPowerControl build() {
        return new UmtsRanPowerControlImpl(this);
    }

    private static final class UmtsRanPowerControlImpl implements UmtsRanPowerControl {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl.class;
        }

        private final java.lang.Long _constantValue;
        private final java.lang.Short _mMax;
        private final java.lang.Short _nb01Max;
        private final java.lang.Short _nb01Min;
        private final java.lang.Short _persistenceScaleFactor;
        private final java.lang.Short _powerRampStepUp;
        private final java.lang.Short _preambleRetransMax;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>> augmentation = Collections.emptyMap();

        private UmtsRanPowerControlImpl(UmtsRanPowerControlBuilder base) {
            this._constantValue = base.getConstantValue();
            this._mMax = base.getMMax();
            this._nb01Max = base.getNb01Max();
            this._nb01Min = base.getNb01Min();
            this._persistenceScaleFactor = base.getPersistenceScaleFactor();
            this._powerRampStepUp = base.getPowerRampStepUp();
            this._preambleRetransMax = base.getPreambleRetransMax();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getConstantValue() {
            return _constantValue;
        }
        
        @Override
        public java.lang.Short getMMax() {
            return _mMax;
        }
        
        @Override
        public java.lang.Short getNb01Max() {
            return _nb01Max;
        }
        
        @Override
        public java.lang.Short getNb01Min() {
            return _nb01Min;
        }
        
        @Override
        public java.lang.Short getPersistenceScaleFactor() {
            return _persistenceScaleFactor;
        }
        
        @Override
        public java.lang.Short getPowerRampStepUp() {
            return _powerRampStepUp;
        }
        
        @Override
        public java.lang.Short getPreambleRetransMax() {
            return _preambleRetransMax;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_constantValue);
            result = prime * result + Objects.hashCode(_mMax);
            result = prime * result + Objects.hashCode(_nb01Max);
            result = prime * result + Objects.hashCode(_nb01Min);
            result = prime * result + Objects.hashCode(_persistenceScaleFactor);
            result = prime * result + Objects.hashCode(_powerRampStepUp);
            result = prime * result + Objects.hashCode(_preambleRetransMax);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl)obj;
            if (!Objects.equals(_constantValue, other.getConstantValue())) {
                return false;
            }
            if (!Objects.equals(_mMax, other.getMMax())) {
                return false;
            }
            if (!Objects.equals(_nb01Max, other.getNb01Max())) {
                return false;
            }
            if (!Objects.equals(_nb01Min, other.getNb01Min())) {
                return false;
            }
            if (!Objects.equals(_persistenceScaleFactor, other.getPersistenceScaleFactor())) {
                return false;
            }
            if (!Objects.equals(_powerRampStepUp, other.getPowerRampStepUp())) {
                return false;
            }
            if (!Objects.equals(_preambleRetransMax, other.getPreambleRetransMax())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsRanPowerControlImpl otherImpl = (UmtsRanPowerControlImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanPowerControl>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsRanPowerControl [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_constantValue != null) {
                builder.append("_constantValue=");
                builder.append(_constantValue);
                builder.append(", ");
            }
            if (_mMax != null) {
                builder.append("_mMax=");
                builder.append(_mMax);
                builder.append(", ");
            }
            if (_nb01Max != null) {
                builder.append("_nb01Max=");
                builder.append(_nb01Max);
                builder.append(", ");
            }
            if (_nb01Min != null) {
                builder.append("_nb01Min=");
                builder.append(_nb01Min);
                builder.append(", ");
            }
            if (_persistenceScaleFactor != null) {
                builder.append("_persistenceScaleFactor=");
                builder.append(_persistenceScaleFactor);
                builder.append(", ");
            }
            if (_powerRampStepUp != null) {
                builder.append("_powerRampStepUp=");
                builder.append(_powerRampStepUp);
                builder.append(", ");
            }
            if (_preambleRetransMax != null) {
                builder.append("_preambleRetransMax=");
                builder.append(_preambleRetransMax);
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
