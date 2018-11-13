package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf
 *
 */
public class RemUmtsWcdmaCellRfBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf> {

    private java.lang.Long _cpichEcNo;
    private java.lang.Long _cpichrscp;
    private java.lang.Integer _primaryScramblingCode;
    private java.lang.Long _rssi;
    private java.lang.Integer _uarfcndl;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>> augmentation = Collections.emptyMap();

    public RemUmtsWcdmaCellRfBuilder() {
    }
    public RemUmtsWcdmaCellRfBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellRfG arg) {
        this._uarfcndl = arg.getUarfcndl();
        this._cpichrscp = arg.getCpichrscp();
        this._cpichEcNo = arg.getCpichEcNo();
        this._rssi = arg.getRssi();
        this._primaryScramblingCode = arg.getPrimaryScramblingCode();
    }

    public RemUmtsWcdmaCellRfBuilder(RemUmtsWcdmaCellRf base) {
        this._cpichEcNo = base.getCpichEcNo();
        this._cpichrscp = base.getCpichrscp();
        this._primaryScramblingCode = base.getPrimaryScramblingCode();
        this._rssi = base.getRssi();
        this._uarfcndl = base.getUarfcndl();
        if (base instanceof RemUmtsWcdmaCellRfImpl) {
            RemUmtsWcdmaCellRfImpl impl = (RemUmtsWcdmaCellRfImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellRfG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellRfG) {
            this._uarfcndl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellRfG)arg).getUarfcndl();
            this._cpichrscp = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellRfG)arg).getCpichrscp();
            this._cpichEcNo = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellRfG)arg).getCpichEcNo();
            this._rssi = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellRfG)arg).getRssi();
            this._primaryScramblingCode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellRfG)arg).getPrimaryScramblingCode();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellRfG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getCpichEcNo() {
        return _cpichEcNo;
    }
    
    public java.lang.Long getCpichrscp() {
        return _cpichrscp;
    }
    
    public java.lang.Integer getPrimaryScramblingCode() {
        return _primaryScramblingCode;
    }
    
    public java.lang.Long getRssi() {
        return _rssi;
    }
    
    public java.lang.Integer getUarfcndl() {
        return _uarfcndl;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemUmtsWcdmaCellRfBuilder setCpichEcNo(final java.lang.Long value) {
        this._cpichEcNo = value;
        return this;
    }
    
     
    public RemUmtsWcdmaCellRfBuilder setCpichrscp(final java.lang.Long value) {
        this._cpichrscp = value;
        return this;
    }
    
     
     private static void checkPrimaryScramblingCodeRange(final int value) {
         if (value >= 0 && value <= 511) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..511]].", value));
     }
    
    public RemUmtsWcdmaCellRfBuilder setPrimaryScramblingCode(final java.lang.Integer value) {
    if (value != null) {
        checkPrimaryScramblingCodeRange(value);
    }
        this._primaryScramblingCode = value;
        return this;
    }
    
     
    public RemUmtsWcdmaCellRfBuilder setRssi(final java.lang.Long value) {
        this._rssi = value;
        return this;
    }
    
     
     private static void checkUarfcndlRange(final int value) {
         if (value >= 0 && value <= 16383) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..16383]].", value));
     }
    
    public RemUmtsWcdmaCellRfBuilder setUarfcndl(final java.lang.Integer value) {
    if (value != null) {
        checkUarfcndlRange(value);
    }
        this._uarfcndl = value;
        return this;
    }
    
    public RemUmtsWcdmaCellRfBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemUmtsWcdmaCellRfBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemUmtsWcdmaCellRf build() {
        return new RemUmtsWcdmaCellRfImpl(this);
    }

    private static final class RemUmtsWcdmaCellRfImpl implements RemUmtsWcdmaCellRf {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf.class;
        }

        private final java.lang.Long _cpichEcNo;
        private final java.lang.Long _cpichrscp;
        private final java.lang.Integer _primaryScramblingCode;
        private final java.lang.Long _rssi;
        private final java.lang.Integer _uarfcndl;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>> augmentation = Collections.emptyMap();

        private RemUmtsWcdmaCellRfImpl(RemUmtsWcdmaCellRfBuilder base) {
            this._cpichEcNo = base.getCpichEcNo();
            this._cpichrscp = base.getCpichrscp();
            this._primaryScramblingCode = base.getPrimaryScramblingCode();
            this._rssi = base.getRssi();
            this._uarfcndl = base.getUarfcndl();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getCpichEcNo() {
            return _cpichEcNo;
        }
        
        @Override
        public java.lang.Long getCpichrscp() {
            return _cpichrscp;
        }
        
        @Override
        public java.lang.Integer getPrimaryScramblingCode() {
            return _primaryScramblingCode;
        }
        
        @Override
        public java.lang.Long getRssi() {
            return _rssi;
        }
        
        @Override
        public java.lang.Integer getUarfcndl() {
            return _uarfcndl;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cpichEcNo);
            result = prime * result + Objects.hashCode(_cpichrscp);
            result = prime * result + Objects.hashCode(_primaryScramblingCode);
            result = prime * result + Objects.hashCode(_rssi);
            result = prime * result + Objects.hashCode(_uarfcndl);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf)obj;
            if (!Objects.equals(_cpichEcNo, other.getCpichEcNo())) {
                return false;
            }
            if (!Objects.equals(_cpichrscp, other.getCpichrscp())) {
                return false;
            }
            if (!Objects.equals(_primaryScramblingCode, other.getPrimaryScramblingCode())) {
                return false;
            }
            if (!Objects.equals(_rssi, other.getRssi())) {
                return false;
            }
            if (!Objects.equals(_uarfcndl, other.getUarfcndl())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemUmtsWcdmaCellRfImpl otherImpl = (RemUmtsWcdmaCellRfImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemUmtsWcdmaCellRf [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cpichEcNo != null) {
                builder.append("_cpichEcNo=");
                builder.append(_cpichEcNo);
                builder.append(", ");
            }
            if (_cpichrscp != null) {
                builder.append("_cpichrscp=");
                builder.append(_cpichrscp);
                builder.append(", ");
            }
            if (_primaryScramblingCode != null) {
                builder.append("_primaryScramblingCode=");
                builder.append(_primaryScramblingCode);
                builder.append(", ");
            }
            if (_rssi != null) {
                builder.append("_rssi=");
                builder.append(_rssi);
                builder.append(", ");
            }
            if (_uarfcndl != null) {
                builder.append("_uarfcndl=");
                builder.append(_uarfcndl);
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
