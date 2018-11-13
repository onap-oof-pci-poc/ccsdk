package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG.PlmnType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.cn.UmtsCnPsDomain;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.cn.UmtsCnCsDomain;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn
 *
 */
public class UmtsCnBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn> {

    private java.lang.Integer _broadcastSac;
    private List<java.lang.String> _equivPlmnid;
    private java.lang.Integer _lacInUse;
    private List<java.lang.String> _lacrac;
    private PlmnType _plmnType;
    private java.lang.String _plmnid;
    private java.lang.Short _racInUse;
    private java.lang.Integer _sac;
    private UmtsCnCsDomain _umtsCnCsDomain;
    private UmtsCnPsDomain _umtsCnPsDomain;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>> augmentation = Collections.emptyMap();

    public UmtsCnBuilder() {
    }
    public UmtsCnBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG arg) {
        this._plmnType = arg.getPlmnType();
        this._plmnid = arg.getPlmnid();
        this._equivPlmnid = arg.getEquivPlmnid();
        this._sac = arg.getSac();
        this._broadcastSac = arg.getBroadcastSac();
        this._lacrac = arg.getLacrac();
        this._lacInUse = arg.getLacInUse();
        this._racInUse = arg.getRacInUse();
    }

    public UmtsCnBuilder(UmtsCn base) {
        this._broadcastSac = base.getBroadcastSac();
        this._equivPlmnid = base.getEquivPlmnid();
        this._lacInUse = base.getLacInUse();
        this._lacrac = base.getLacrac();
        this._plmnType = base.getPlmnType();
        this._plmnid = base.getPlmnid();
        this._racInUse = base.getRacInUse();
        this._sac = base.getSac();
        this._umtsCnCsDomain = base.getUmtsCnCsDomain();
        this._umtsCnPsDomain = base.getUmtsCnPsDomain();
        if (base instanceof UmtsCnImpl) {
            UmtsCnImpl impl = (UmtsCnImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG) {
            this._plmnType = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG)arg).getPlmnType();
            this._plmnid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG)arg).getPlmnid();
            this._equivPlmnid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG)arg).getEquivPlmnid();
            this._sac = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG)arg).getSac();
            this._broadcastSac = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG)arg).getBroadcastSac();
            this._lacrac = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG)arg).getLacrac();
            this._lacInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG)arg).getLacInUse();
            this._racInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG)arg).getRacInUse();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsCnG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getBroadcastSac() {
        return _broadcastSac;
    }
    
    public List<java.lang.String> getEquivPlmnid() {
        return _equivPlmnid;
    }
    
    public java.lang.Integer getLacInUse() {
        return _lacInUse;
    }
    
    public List<java.lang.String> getLacrac() {
        return _lacrac;
    }
    
    public PlmnType getPlmnType() {
        return _plmnType;
    }
    
    public java.lang.String getPlmnid() {
        return _plmnid;
    }
    
    public java.lang.Short getRacInUse() {
        return _racInUse;
    }
    
    public java.lang.Integer getSac() {
        return _sac;
    }
    
    public UmtsCnCsDomain getUmtsCnCsDomain() {
        return _umtsCnCsDomain;
    }
    
    public UmtsCnPsDomain getUmtsCnPsDomain() {
        return _umtsCnPsDomain;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkBroadcastSacRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public UmtsCnBuilder setBroadcastSac(final java.lang.Integer value) {
    if (value != null) {
        checkBroadcastSacRange(value);
    }
        this._broadcastSac = value;
        return this;
    }
    
     
    public UmtsCnBuilder setEquivPlmnid(final List<java.lang.String> value) {
        this._equivPlmnid = value;
        return this;
    }
    
     
     private static void checkLacInUseRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public UmtsCnBuilder setLacInUse(final java.lang.Integer value) {
    if (value != null) {
        checkLacInUseRange(value);
    }
        this._lacInUse = value;
        return this;
    }
    
     
    public UmtsCnBuilder setLacrac(final List<java.lang.String> value) {
        this._lacrac = value;
        return this;
    }
    
     
    public UmtsCnBuilder setPlmnType(final PlmnType value) {
        this._plmnType = value;
        return this;
    }
    
     
     private static void check_plmnidLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 6) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..6]].", value));
     }
    
    public UmtsCnBuilder setPlmnid(final java.lang.String value) {
    if (value != null) {
        check_plmnidLength(value);
    }
        this._plmnid = value;
        return this;
    }
    
     
     private static void checkRacInUseRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public UmtsCnBuilder setRacInUse(final java.lang.Short value) {
    if (value != null) {
        checkRacInUseRange(value);
    }
        this._racInUse = value;
        return this;
    }
    
     
     private static void checkSacRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public UmtsCnBuilder setSac(final java.lang.Integer value) {
    if (value != null) {
        checkSacRange(value);
    }
        this._sac = value;
        return this;
    }
    
     
    public UmtsCnBuilder setUmtsCnCsDomain(final UmtsCnCsDomain value) {
        this._umtsCnCsDomain = value;
        return this;
    }
    
     
    public UmtsCnBuilder setUmtsCnPsDomain(final UmtsCnPsDomain value) {
        this._umtsCnPsDomain = value;
        return this;
    }
    
    public UmtsCnBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UmtsCnBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UmtsCn build() {
        return new UmtsCnImpl(this);
    }

    private static final class UmtsCnImpl implements UmtsCn {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn.class;
        }

        private final java.lang.Integer _broadcastSac;
        private final List<java.lang.String> _equivPlmnid;
        private final java.lang.Integer _lacInUse;
        private final List<java.lang.String> _lacrac;
        private final PlmnType _plmnType;
        private final java.lang.String _plmnid;
        private final java.lang.Short _racInUse;
        private final java.lang.Integer _sac;
        private final UmtsCnCsDomain _umtsCnCsDomain;
        private final UmtsCnPsDomain _umtsCnPsDomain;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>> augmentation = Collections.emptyMap();

        private UmtsCnImpl(UmtsCnBuilder base) {
            this._broadcastSac = base.getBroadcastSac();
            this._equivPlmnid = base.getEquivPlmnid();
            this._lacInUse = base.getLacInUse();
            this._lacrac = base.getLacrac();
            this._plmnType = base.getPlmnType();
            this._plmnid = base.getPlmnid();
            this._racInUse = base.getRacInUse();
            this._sac = base.getSac();
            this._umtsCnCsDomain = base.getUmtsCnCsDomain();
            this._umtsCnPsDomain = base.getUmtsCnPsDomain();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getBroadcastSac() {
            return _broadcastSac;
        }
        
        @Override
        public List<java.lang.String> getEquivPlmnid() {
            return _equivPlmnid;
        }
        
        @Override
        public java.lang.Integer getLacInUse() {
            return _lacInUse;
        }
        
        @Override
        public List<java.lang.String> getLacrac() {
            return _lacrac;
        }
        
        @Override
        public PlmnType getPlmnType() {
            return _plmnType;
        }
        
        @Override
        public java.lang.String getPlmnid() {
            return _plmnid;
        }
        
        @Override
        public java.lang.Short getRacInUse() {
            return _racInUse;
        }
        
        @Override
        public java.lang.Integer getSac() {
            return _sac;
        }
        
        @Override
        public UmtsCnCsDomain getUmtsCnCsDomain() {
            return _umtsCnCsDomain;
        }
        
        @Override
        public UmtsCnPsDomain getUmtsCnPsDomain() {
            return _umtsCnPsDomain;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_broadcastSac);
            result = prime * result + Objects.hashCode(_equivPlmnid);
            result = prime * result + Objects.hashCode(_lacInUse);
            result = prime * result + Objects.hashCode(_lacrac);
            result = prime * result + Objects.hashCode(_plmnType);
            result = prime * result + Objects.hashCode(_plmnid);
            result = prime * result + Objects.hashCode(_racInUse);
            result = prime * result + Objects.hashCode(_sac);
            result = prime * result + Objects.hashCode(_umtsCnCsDomain);
            result = prime * result + Objects.hashCode(_umtsCnPsDomain);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn)obj;
            if (!Objects.equals(_broadcastSac, other.getBroadcastSac())) {
                return false;
            }
            if (!Objects.equals(_equivPlmnid, other.getEquivPlmnid())) {
                return false;
            }
            if (!Objects.equals(_lacInUse, other.getLacInUse())) {
                return false;
            }
            if (!Objects.equals(_lacrac, other.getLacrac())) {
                return false;
            }
            if (!Objects.equals(_plmnType, other.getPlmnType())) {
                return false;
            }
            if (!Objects.equals(_plmnid, other.getPlmnid())) {
                return false;
            }
            if (!Objects.equals(_racInUse, other.getRacInUse())) {
                return false;
            }
            if (!Objects.equals(_sac, other.getSac())) {
                return false;
            }
            if (!Objects.equals(_umtsCnCsDomain, other.getUmtsCnCsDomain())) {
                return false;
            }
            if (!Objects.equals(_umtsCnPsDomain, other.getUmtsCnPsDomain())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UmtsCnImpl otherImpl = (UmtsCnImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsCn>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UmtsCn [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_broadcastSac != null) {
                builder.append("_broadcastSac=");
                builder.append(_broadcastSac);
                builder.append(", ");
            }
            if (_equivPlmnid != null) {
                builder.append("_equivPlmnid=");
                builder.append(_equivPlmnid);
                builder.append(", ");
            }
            if (_lacInUse != null) {
                builder.append("_lacInUse=");
                builder.append(_lacInUse);
                builder.append(", ");
            }
            if (_lacrac != null) {
                builder.append("_lacrac=");
                builder.append(_lacrac);
                builder.append(", ");
            }
            if (_plmnType != null) {
                builder.append("_plmnType=");
                builder.append(_plmnType);
                builder.append(", ");
            }
            if (_plmnid != null) {
                builder.append("_plmnid=");
                builder.append(_plmnid);
                builder.append(", ");
            }
            if (_racInUse != null) {
                builder.append("_racInUse=");
                builder.append(_racInUse);
                builder.append(", ");
            }
            if (_sac != null) {
                builder.append("_sac=");
                builder.append(_sac);
                builder.append(", ");
            }
            if (_umtsCnCsDomain != null) {
                builder.append("_umtsCnCsDomain=");
                builder.append(_umtsCnCsDomain);
                builder.append(", ");
            }
            if (_umtsCnPsDomain != null) {
                builder.append("_umtsCnPsDomain=");
                builder.append(_umtsCnPsDomain);
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
