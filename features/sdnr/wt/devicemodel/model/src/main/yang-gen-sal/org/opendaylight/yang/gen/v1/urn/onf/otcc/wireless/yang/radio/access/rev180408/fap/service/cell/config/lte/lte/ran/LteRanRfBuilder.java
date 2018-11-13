package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf
 *
 */
public class LteRanRfBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf> {

    private List<java.lang.Short> _dlBandwidth;
    private List<java.lang.Integer> _earfcndl;
    private List<java.lang.Integer> _earfcnul;
    private java.lang.Short _freqBandIndicator;
    private List<java.lang.String> _pbchPowerOffset;
    private List<java.lang.String> _phyCellId;
    private List<java.lang.String> _pschPowerOffset;
    private List<java.lang.String> _referenceSignalPower;
    private List<java.lang.String> _sschPowerOffset;
    private List<java.lang.Short> _ulBandwidth;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>> augmentation = Collections.emptyMap();

    public LteRanRfBuilder() {
    }
    public LteRanRfBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG arg) {
        this._earfcndl = arg.getEarfcndl();
        this._earfcnul = arg.getEarfcnul();
        this._freqBandIndicator = arg.getFreqBandIndicator();
        this._dlBandwidth = arg.getDlBandwidth();
        this._ulBandwidth = arg.getUlBandwidth();
        this._referenceSignalPower = arg.getReferenceSignalPower();
        this._phyCellId = arg.getPhyCellId();
        this._pschPowerOffset = arg.getPschPowerOffset();
        this._sschPowerOffset = arg.getSschPowerOffset();
        this._pbchPowerOffset = arg.getPbchPowerOffset();
    }

    public LteRanRfBuilder(LteRanRf base) {
        this._dlBandwidth = base.getDlBandwidth();
        this._earfcndl = base.getEarfcndl();
        this._earfcnul = base.getEarfcnul();
        this._freqBandIndicator = base.getFreqBandIndicator();
        this._pbchPowerOffset = base.getPbchPowerOffset();
        this._phyCellId = base.getPhyCellId();
        this._pschPowerOffset = base.getPschPowerOffset();
        this._referenceSignalPower = base.getReferenceSignalPower();
        this._sschPowerOffset = base.getSschPowerOffset();
        this._ulBandwidth = base.getUlBandwidth();
        if (base instanceof LteRanRfImpl) {
            LteRanRfImpl impl = (LteRanRfImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG) {
            this._earfcndl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG)arg).getEarfcndl();
            this._earfcnul = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG)arg).getEarfcnul();
            this._freqBandIndicator = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG)arg).getFreqBandIndicator();
            this._dlBandwidth = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG)arg).getDlBandwidth();
            this._ulBandwidth = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG)arg).getUlBandwidth();
            this._referenceSignalPower = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG)arg).getReferenceSignalPower();
            this._phyCellId = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG)arg).getPhyCellId();
            this._pschPowerOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG)arg).getPschPowerOffset();
            this._sschPowerOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG)arg).getSschPowerOffset();
            this._pbchPowerOffset = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG)arg).getPbchPowerOffset();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanRfG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.Short> getDlBandwidth() {
        return _dlBandwidth;
    }
    
    public List<java.lang.Integer> getEarfcndl() {
        return _earfcndl;
    }
    
    public List<java.lang.Integer> getEarfcnul() {
        return _earfcnul;
    }
    
    public java.lang.Short getFreqBandIndicator() {
        return _freqBandIndicator;
    }
    
    public List<java.lang.String> getPbchPowerOffset() {
        return _pbchPowerOffset;
    }
    
    public List<java.lang.String> getPhyCellId() {
        return _phyCellId;
    }
    
    public List<java.lang.String> getPschPowerOffset() {
        return _pschPowerOffset;
    }
    
    public List<java.lang.String> getReferenceSignalPower() {
        return _referenceSignalPower;
    }
    
    public List<java.lang.String> getSschPowerOffset() {
        return _sschPowerOffset;
    }
    
    public List<java.lang.Short> getUlBandwidth() {
        return _ulBandwidth;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LteRanRfBuilder setDlBandwidth(final List<java.lang.Short> value) {
        this._dlBandwidth = value;
        return this;
    }
    
     
    public LteRanRfBuilder setEarfcndl(final List<java.lang.Integer> value) {
        this._earfcndl = value;
        return this;
    }
    
     
    public LteRanRfBuilder setEarfcnul(final List<java.lang.Integer> value) {
        this._earfcnul = value;
        return this;
    }
    
     
     private static void checkFreqBandIndicatorRange(final short value) {
         if (value >= (short)1 && value <= (short)40) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..40]].", value));
     }
    
    public LteRanRfBuilder setFreqBandIndicator(final java.lang.Short value) {
    if (value != null) {
        checkFreqBandIndicatorRange(value);
    }
        this._freqBandIndicator = value;
        return this;
    }
    
     
    public LteRanRfBuilder setPbchPowerOffset(final List<java.lang.String> value) {
        this._pbchPowerOffset = value;
        return this;
    }
    
     
    public LteRanRfBuilder setPhyCellId(final List<java.lang.String> value) {
        this._phyCellId = value;
        return this;
    }
    
     
    public LteRanRfBuilder setPschPowerOffset(final List<java.lang.String> value) {
        this._pschPowerOffset = value;
        return this;
    }
    
     
    public LteRanRfBuilder setReferenceSignalPower(final List<java.lang.String> value) {
        this._referenceSignalPower = value;
        return this;
    }
    
     
    public LteRanRfBuilder setSschPowerOffset(final List<java.lang.String> value) {
        this._sschPowerOffset = value;
        return this;
    }
    
     
    public LteRanRfBuilder setUlBandwidth(final List<java.lang.Short> value) {
        this._ulBandwidth = value;
        return this;
    }
    
    public LteRanRfBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteRanRfBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteRanRf build() {
        return new LteRanRfImpl(this);
    }

    private static final class LteRanRfImpl implements LteRanRf {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf.class;
        }

        private final List<java.lang.Short> _dlBandwidth;
        private final List<java.lang.Integer> _earfcndl;
        private final List<java.lang.Integer> _earfcnul;
        private final java.lang.Short _freqBandIndicator;
        private final List<java.lang.String> _pbchPowerOffset;
        private final List<java.lang.String> _phyCellId;
        private final List<java.lang.String> _pschPowerOffset;
        private final List<java.lang.String> _referenceSignalPower;
        private final List<java.lang.String> _sschPowerOffset;
        private final List<java.lang.Short> _ulBandwidth;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>> augmentation = Collections.emptyMap();

        private LteRanRfImpl(LteRanRfBuilder base) {
            this._dlBandwidth = base.getDlBandwidth();
            this._earfcndl = base.getEarfcndl();
            this._earfcnul = base.getEarfcnul();
            this._freqBandIndicator = base.getFreqBandIndicator();
            this._pbchPowerOffset = base.getPbchPowerOffset();
            this._phyCellId = base.getPhyCellId();
            this._pschPowerOffset = base.getPschPowerOffset();
            this._referenceSignalPower = base.getReferenceSignalPower();
            this._sschPowerOffset = base.getSschPowerOffset();
            this._ulBandwidth = base.getUlBandwidth();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.Short> getDlBandwidth() {
            return _dlBandwidth;
        }
        
        @Override
        public List<java.lang.Integer> getEarfcndl() {
            return _earfcndl;
        }
        
        @Override
        public List<java.lang.Integer> getEarfcnul() {
            return _earfcnul;
        }
        
        @Override
        public java.lang.Short getFreqBandIndicator() {
            return _freqBandIndicator;
        }
        
        @Override
        public List<java.lang.String> getPbchPowerOffset() {
            return _pbchPowerOffset;
        }
        
        @Override
        public List<java.lang.String> getPhyCellId() {
            return _phyCellId;
        }
        
        @Override
        public List<java.lang.String> getPschPowerOffset() {
            return _pschPowerOffset;
        }
        
        @Override
        public List<java.lang.String> getReferenceSignalPower() {
            return _referenceSignalPower;
        }
        
        @Override
        public List<java.lang.String> getSschPowerOffset() {
            return _sschPowerOffset;
        }
        
        @Override
        public List<java.lang.Short> getUlBandwidth() {
            return _ulBandwidth;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dlBandwidth);
            result = prime * result + Objects.hashCode(_earfcndl);
            result = prime * result + Objects.hashCode(_earfcnul);
            result = prime * result + Objects.hashCode(_freqBandIndicator);
            result = prime * result + Objects.hashCode(_pbchPowerOffset);
            result = prime * result + Objects.hashCode(_phyCellId);
            result = prime * result + Objects.hashCode(_pschPowerOffset);
            result = prime * result + Objects.hashCode(_referenceSignalPower);
            result = prime * result + Objects.hashCode(_sschPowerOffset);
            result = prime * result + Objects.hashCode(_ulBandwidth);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf)obj;
            if (!Objects.equals(_dlBandwidth, other.getDlBandwidth())) {
                return false;
            }
            if (!Objects.equals(_earfcndl, other.getEarfcndl())) {
                return false;
            }
            if (!Objects.equals(_earfcnul, other.getEarfcnul())) {
                return false;
            }
            if (!Objects.equals(_freqBandIndicator, other.getFreqBandIndicator())) {
                return false;
            }
            if (!Objects.equals(_pbchPowerOffset, other.getPbchPowerOffset())) {
                return false;
            }
            if (!Objects.equals(_phyCellId, other.getPhyCellId())) {
                return false;
            }
            if (!Objects.equals(_pschPowerOffset, other.getPschPowerOffset())) {
                return false;
            }
            if (!Objects.equals(_referenceSignalPower, other.getReferenceSignalPower())) {
                return false;
            }
            if (!Objects.equals(_sschPowerOffset, other.getSschPowerOffset())) {
                return false;
            }
            if (!Objects.equals(_ulBandwidth, other.getUlBandwidth())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteRanRfImpl otherImpl = (LteRanRfImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanRf>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteRanRf [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_dlBandwidth != null) {
                builder.append("_dlBandwidth=");
                builder.append(_dlBandwidth);
                builder.append(", ");
            }
            if (_earfcndl != null) {
                builder.append("_earfcndl=");
                builder.append(_earfcndl);
                builder.append(", ");
            }
            if (_earfcnul != null) {
                builder.append("_earfcnul=");
                builder.append(_earfcnul);
                builder.append(", ");
            }
            if (_freqBandIndicator != null) {
                builder.append("_freqBandIndicator=");
                builder.append(_freqBandIndicator);
                builder.append(", ");
            }
            if (_pbchPowerOffset != null) {
                builder.append("_pbchPowerOffset=");
                builder.append(_pbchPowerOffset);
                builder.append(", ");
            }
            if (_phyCellId != null) {
                builder.append("_phyCellId=");
                builder.append(_phyCellId);
                builder.append(", ");
            }
            if (_pschPowerOffset != null) {
                builder.append("_pschPowerOffset=");
                builder.append(_pschPowerOffset);
                builder.append(", ");
            }
            if (_referenceSignalPower != null) {
                builder.append("_referenceSignalPower=");
                builder.append(_referenceSignalPower);
                builder.append(", ");
            }
            if (_sschPowerOffset != null) {
                builder.append("_sschPowerOffset=");
                builder.append(_sschPowerOffset);
                builder.append(", ");
            }
            if (_ulBandwidth != null) {
                builder.append("_ulBandwidth=");
                builder.append(_ulBandwidth);
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
