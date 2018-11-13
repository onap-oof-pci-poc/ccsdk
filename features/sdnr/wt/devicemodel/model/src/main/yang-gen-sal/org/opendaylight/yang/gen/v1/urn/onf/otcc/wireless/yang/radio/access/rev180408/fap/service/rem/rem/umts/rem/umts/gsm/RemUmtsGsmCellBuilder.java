package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG.BandIndicator;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell
 *
 */
public class RemUmtsGsmCellBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell> {

    private java.lang.Integer _arfcn;
    private BandIndicator _bandIndicator;
    private java.lang.Short _bsic;
    private java.lang.Integer _ci;
    private RemUmtsGsmCellKey _key;
    private java.lang.Integer _lac;
    private java.lang.String _plmnid;
    private java.lang.Short _rac;
    private java.lang.Long _rssi;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>> augmentation = Collections.emptyMap();

    public RemUmtsGsmCellBuilder() {
    }
    public RemUmtsGsmCellBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG arg) {
        this._bandIndicator = arg.getBandIndicator();
        this._arfcn = arg.getArfcn();
        this._bsic = arg.getBsic();
        this._plmnid = arg.getPlmnid();
        this._lac = arg.getLac();
        this._rac = arg.getRac();
        this._ci = arg.getCi();
        this._rssi = arg.getRssi();
    }

    public RemUmtsGsmCellBuilder(RemUmtsGsmCell base) {
        if (base.getKey() == null) {
            this._key = new RemUmtsGsmCellKey(
                base.getArfcn(), 
                base.getBsic()
            );
            this._arfcn = base.getArfcn();
            this._bsic = base.getBsic();
        } else {
            this._key = base.getKey();
            this._arfcn = _key.getArfcn();
            this._bsic = _key.getBsic();
        }
        this._bandIndicator = base.getBandIndicator();
        this._ci = base.getCi();
        this._lac = base.getLac();
        this._plmnid = base.getPlmnid();
        this._rac = base.getRac();
        this._rssi = base.getRssi();
        if (base instanceof RemUmtsGsmCellImpl) {
            RemUmtsGsmCellImpl impl = (RemUmtsGsmCellImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG) {
            this._bandIndicator = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG)arg).getBandIndicator();
            this._arfcn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG)arg).getArfcn();
            this._bsic = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG)arg).getBsic();
            this._plmnid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG)arg).getPlmnid();
            this._lac = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG)arg).getLac();
            this._rac = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG)arg).getRac();
            this._ci = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG)arg).getCi();
            this._rssi = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG)arg).getRssi();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsGsmCellG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getArfcn() {
        return _arfcn;
    }
    
    public BandIndicator getBandIndicator() {
        return _bandIndicator;
    }
    
    public java.lang.Short getBsic() {
        return _bsic;
    }
    
    public java.lang.Integer getCi() {
        return _ci;
    }
    
    public RemUmtsGsmCellKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getLac() {
        return _lac;
    }
    
    public java.lang.String getPlmnid() {
        return _plmnid;
    }
    
    public java.lang.Short getRac() {
        return _rac;
    }
    
    public java.lang.Long getRssi() {
        return _rssi;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkArfcnRange(final int value) {
         if (value >= 0 && value <= 1023) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1023]].", value));
     }
    
    public RemUmtsGsmCellBuilder setArfcn(final java.lang.Integer value) {
    if (value != null) {
        checkArfcnRange(value);
    }
        this._arfcn = value;
        return this;
    }
    
     
    public RemUmtsGsmCellBuilder setBandIndicator(final BandIndicator value) {
        this._bandIndicator = value;
        return this;
    }
    
     
     private static void checkBsicRange(final short value) {
         if (value >= (short)0 && value <= (short)63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
     }
    
    public RemUmtsGsmCellBuilder setBsic(final java.lang.Short value) {
    if (value != null) {
        checkBsicRange(value);
    }
        this._bsic = value;
        return this;
    }
    
     
     private static void checkCiRange(final int value) {
         if (value >= 0 && value <= 63535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63535]].", value));
     }
    
    public RemUmtsGsmCellBuilder setCi(final java.lang.Integer value) {
    if (value != null) {
        checkCiRange(value);
    }
        this._ci = value;
        return this;
    }
    
     
    public RemUmtsGsmCellBuilder setKey(final RemUmtsGsmCellKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void checkLacRange(final int value) {
         if (value >= 1 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..65535]].", value));
     }
    
    public RemUmtsGsmCellBuilder setLac(final java.lang.Integer value) {
    if (value != null) {
        checkLacRange(value);
    }
        this._lac = value;
        return this;
    }
    
     
     private static void check_plmnidLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 6) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..6]].", value));
     }
    
    public RemUmtsGsmCellBuilder setPlmnid(final java.lang.String value) {
    if (value != null) {
        check_plmnidLength(value);
    }
        this._plmnid = value;
        return this;
    }
    
     
     private static void checkRacRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public RemUmtsGsmCellBuilder setRac(final java.lang.Short value) {
    if (value != null) {
        checkRacRange(value);
    }
        this._rac = value;
        return this;
    }
    
     
    public RemUmtsGsmCellBuilder setRssi(final java.lang.Long value) {
        this._rssi = value;
        return this;
    }
    
    public RemUmtsGsmCellBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemUmtsGsmCellBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemUmtsGsmCell build() {
        return new RemUmtsGsmCellImpl(this);
    }

    private static final class RemUmtsGsmCellImpl implements RemUmtsGsmCell {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell.class;
        }

        private final java.lang.Integer _arfcn;
        private final BandIndicator _bandIndicator;
        private final java.lang.Short _bsic;
        private final java.lang.Integer _ci;
        private final RemUmtsGsmCellKey _key;
        private final java.lang.Integer _lac;
        private final java.lang.String _plmnid;
        private final java.lang.Short _rac;
        private final java.lang.Long _rssi;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>> augmentation = Collections.emptyMap();

        private RemUmtsGsmCellImpl(RemUmtsGsmCellBuilder base) {
            if (base.getKey() == null) {
                this._key = new RemUmtsGsmCellKey(
                    base.getArfcn(), 
                    base.getBsic()
                );
                this._arfcn = base.getArfcn();
                this._bsic = base.getBsic();
            } else {
                this._key = base.getKey();
                this._arfcn = _key.getArfcn();
                this._bsic = _key.getBsic();
            }
            this._bandIndicator = base.getBandIndicator();
            this._ci = base.getCi();
            this._lac = base.getLac();
            this._plmnid = base.getPlmnid();
            this._rac = base.getRac();
            this._rssi = base.getRssi();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getArfcn() {
            return _arfcn;
        }
        
        @Override
        public BandIndicator getBandIndicator() {
            return _bandIndicator;
        }
        
        @Override
        public java.lang.Short getBsic() {
            return _bsic;
        }
        
        @Override
        public java.lang.Integer getCi() {
            return _ci;
        }
        
        @Override
        public RemUmtsGsmCellKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getLac() {
            return _lac;
        }
        
        @Override
        public java.lang.String getPlmnid() {
            return _plmnid;
        }
        
        @Override
        public java.lang.Short getRac() {
            return _rac;
        }
        
        @Override
        public java.lang.Long getRssi() {
            return _rssi;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_arfcn);
            result = prime * result + Objects.hashCode(_bandIndicator);
            result = prime * result + Objects.hashCode(_bsic);
            result = prime * result + Objects.hashCode(_ci);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_lac);
            result = prime * result + Objects.hashCode(_plmnid);
            result = prime * result + Objects.hashCode(_rac);
            result = prime * result + Objects.hashCode(_rssi);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell)obj;
            if (!Objects.equals(_arfcn, other.getArfcn())) {
                return false;
            }
            if (!Objects.equals(_bandIndicator, other.getBandIndicator())) {
                return false;
            }
            if (!Objects.equals(_bsic, other.getBsic())) {
                return false;
            }
            if (!Objects.equals(_ci, other.getCi())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_lac, other.getLac())) {
                return false;
            }
            if (!Objects.equals(_plmnid, other.getPlmnid())) {
                return false;
            }
            if (!Objects.equals(_rac, other.getRac())) {
                return false;
            }
            if (!Objects.equals(_rssi, other.getRssi())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemUmtsGsmCellImpl otherImpl = (RemUmtsGsmCellImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.gsm.RemUmtsGsmCell>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemUmtsGsmCell [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_arfcn != null) {
                builder.append("_arfcn=");
                builder.append(_arfcn);
                builder.append(", ");
            }
            if (_bandIndicator != null) {
                builder.append("_bandIndicator=");
                builder.append(_bandIndicator);
                builder.append(", ");
            }
            if (_bsic != null) {
                builder.append("_bsic=");
                builder.append(_bsic);
                builder.append(", ");
            }
            if (_ci != null) {
                builder.append("_ci=");
                builder.append(_ci);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_lac != null) {
                builder.append("_lac=");
                builder.append(_lac);
                builder.append(", ");
            }
            if (_plmnid != null) {
                builder.append("_plmnid=");
                builder.append(_plmnid);
                builder.append(", ");
            }
            if (_rac != null) {
                builder.append("_rac=");
                builder.append(_rac);
                builder.append(", ");
            }
            if (_rssi != null) {
                builder.append("_rssi=");
                builder.append(_rssi);
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
