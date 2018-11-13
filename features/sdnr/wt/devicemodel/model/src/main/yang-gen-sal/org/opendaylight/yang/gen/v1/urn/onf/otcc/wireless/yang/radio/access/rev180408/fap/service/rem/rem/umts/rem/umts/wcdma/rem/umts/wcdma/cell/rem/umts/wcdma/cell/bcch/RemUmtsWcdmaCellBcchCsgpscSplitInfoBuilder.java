package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchCsgpscSplitInfoG.NumberOfPsCs;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo
 *
 */
public class RemUmtsWcdmaCellBcchCsgpscSplitInfoBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo> {

    private NumberOfPsCs _numberOfPsCs;
    private java.lang.Short _pscRange2Offset;
    private java.lang.Short _startPscRange1Coefficient;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>> augmentation = Collections.emptyMap();

    public RemUmtsWcdmaCellBcchCsgpscSplitInfoBuilder() {
    }
    public RemUmtsWcdmaCellBcchCsgpscSplitInfoBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchCsgpscSplitInfoG arg) {
        this._startPscRange1Coefficient = arg.getStartPscRange1Coefficient();
        this._numberOfPsCs = arg.getNumberOfPsCs();
        this._pscRange2Offset = arg.getPscRange2Offset();
    }

    public RemUmtsWcdmaCellBcchCsgpscSplitInfoBuilder(RemUmtsWcdmaCellBcchCsgpscSplitInfo base) {
        this._numberOfPsCs = base.getNumberOfPsCs();
        this._pscRange2Offset = base.getPscRange2Offset();
        this._startPscRange1Coefficient = base.getStartPscRange1Coefficient();
        if (base instanceof RemUmtsWcdmaCellBcchCsgpscSplitInfoImpl) {
            RemUmtsWcdmaCellBcchCsgpscSplitInfoImpl impl = (RemUmtsWcdmaCellBcchCsgpscSplitInfoImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchCsgpscSplitInfoG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchCsgpscSplitInfoG) {
            this._startPscRange1Coefficient = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchCsgpscSplitInfoG)arg).getStartPscRange1Coefficient();
            this._numberOfPsCs = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchCsgpscSplitInfoG)arg).getNumberOfPsCs();
            this._pscRange2Offset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchCsgpscSplitInfoG)arg).getPscRange2Offset();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellBcchCsgpscSplitInfoG] \n" +
              "but was: " + arg
            );
        }
    }

    public NumberOfPsCs getNumberOfPsCs() {
        return _numberOfPsCs;
    }
    
    public java.lang.Short getPscRange2Offset() {
        return _pscRange2Offset;
    }
    
    public java.lang.Short getStartPscRange1Coefficient() {
        return _startPscRange1Coefficient;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemUmtsWcdmaCellBcchCsgpscSplitInfoBuilder setNumberOfPsCs(final NumberOfPsCs value) {
        this._numberOfPsCs = value;
        return this;
    }
    
     
     private static void checkPscRange2OffsetRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public RemUmtsWcdmaCellBcchCsgpscSplitInfoBuilder setPscRange2Offset(final java.lang.Short value) {
    if (value != null) {
        checkPscRange2OffsetRange(value);
    }
        this._pscRange2Offset = value;
        return this;
    }
    
     
     private static void checkStartPscRange1CoefficientRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public RemUmtsWcdmaCellBcchCsgpscSplitInfoBuilder setStartPscRange1Coefficient(final java.lang.Short value) {
    if (value != null) {
        checkStartPscRange1CoefficientRange(value);
    }
        this._startPscRange1Coefficient = value;
        return this;
    }
    
    public RemUmtsWcdmaCellBcchCsgpscSplitInfoBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemUmtsWcdmaCellBcchCsgpscSplitInfoBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemUmtsWcdmaCellBcchCsgpscSplitInfo build() {
        return new RemUmtsWcdmaCellBcchCsgpscSplitInfoImpl(this);
    }

    private static final class RemUmtsWcdmaCellBcchCsgpscSplitInfoImpl implements RemUmtsWcdmaCellBcchCsgpscSplitInfo {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo.class;
        }

        private final NumberOfPsCs _numberOfPsCs;
        private final java.lang.Short _pscRange2Offset;
        private final java.lang.Short _startPscRange1Coefficient;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>> augmentation = Collections.emptyMap();

        private RemUmtsWcdmaCellBcchCsgpscSplitInfoImpl(RemUmtsWcdmaCellBcchCsgpscSplitInfoBuilder base) {
            this._numberOfPsCs = base.getNumberOfPsCs();
            this._pscRange2Offset = base.getPscRange2Offset();
            this._startPscRange1Coefficient = base.getStartPscRange1Coefficient();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NumberOfPsCs getNumberOfPsCs() {
            return _numberOfPsCs;
        }
        
        @Override
        public java.lang.Short getPscRange2Offset() {
            return _pscRange2Offset;
        }
        
        @Override
        public java.lang.Short getStartPscRange1Coefficient() {
            return _startPscRange1Coefficient;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_numberOfPsCs);
            result = prime * result + Objects.hashCode(_pscRange2Offset);
            result = prime * result + Objects.hashCode(_startPscRange1Coefficient);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo)obj;
            if (!Objects.equals(_numberOfPsCs, other.getNumberOfPsCs())) {
                return false;
            }
            if (!Objects.equals(_pscRange2Offset, other.getPscRange2Offset())) {
                return false;
            }
            if (!Objects.equals(_startPscRange1Coefficient, other.getStartPscRange1Coefficient())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemUmtsWcdmaCellBcchCsgpscSplitInfoImpl otherImpl = (RemUmtsWcdmaCellBcchCsgpscSplitInfoImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.rem.umts.wcdma.cell.bcch.RemUmtsWcdmaCellBcchCsgpscSplitInfo>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemUmtsWcdmaCellBcchCsgpscSplitInfo [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_numberOfPsCs != null) {
                builder.append("_numberOfPsCs=");
                builder.append(_numberOfPsCs);
                builder.append(", ");
            }
            if (_pscRange2Offset != null) {
                builder.append("_pscRange2Offset=");
                builder.append(_pscRange2Offset);
                builder.append(", ");
            }
            if (_startPscRange1Coefficient != null) {
                builder.append("_startPscRange1Coefficient=");
                builder.append(_startPscRange1Coefficient);
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
