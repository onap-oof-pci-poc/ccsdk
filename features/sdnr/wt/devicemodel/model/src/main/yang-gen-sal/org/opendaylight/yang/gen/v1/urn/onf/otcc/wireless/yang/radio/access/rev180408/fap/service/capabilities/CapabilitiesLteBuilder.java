package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG.DuplexMode;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG.GsmRxBandsSupported;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte
 *
 */
public class CapabilitiesLteBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte> {

    private List<java.lang.Short> _bandsSupported;
    private List<java.lang.String> _cdma2000RxBandsSupported;
    private DuplexMode _duplexMode;
    private List<GsmRxBandsSupported> _gsmRxBandsSupported;
    private List<java.lang.String> _umtsRxBandsSupported;
    private java.lang.Boolean _cdma2000RxSupported;
    private java.lang.Boolean _gsmRxSupported;
    private java.lang.Boolean _nnsfSupported;
    private java.lang.Boolean _umtsRxSupported;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>> augmentation = Collections.emptyMap();

    public CapabilitiesLteBuilder() {
    }
    public CapabilitiesLteBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG arg) {
        this._duplexMode = arg.getDuplexMode();
        this._bandsSupported = arg.getBandsSupported();
        this._nnsfSupported = arg.isNnsfSupported();
        this._umtsRxSupported = arg.isUmtsRxSupported();
        this._umtsRxBandsSupported = arg.getUmtsRxBandsSupported();
        this._gsmRxSupported = arg.isGsmRxSupported();
        this._gsmRxBandsSupported = arg.getGsmRxBandsSupported();
        this._cdma2000RxSupported = arg.isCdma2000RxSupported();
        this._cdma2000RxBandsSupported = arg.getCdma2000RxBandsSupported();
    }

    public CapabilitiesLteBuilder(CapabilitiesLte base) {
        this._bandsSupported = base.getBandsSupported();
        this._cdma2000RxBandsSupported = base.getCdma2000RxBandsSupported();
        this._duplexMode = base.getDuplexMode();
        this._gsmRxBandsSupported = base.getGsmRxBandsSupported();
        this._umtsRxBandsSupported = base.getUmtsRxBandsSupported();
        this._cdma2000RxSupported = base.isCdma2000RxSupported();
        this._gsmRxSupported = base.isGsmRxSupported();
        this._nnsfSupported = base.isNnsfSupported();
        this._umtsRxSupported = base.isUmtsRxSupported();
        if (base instanceof CapabilitiesLteImpl) {
            CapabilitiesLteImpl impl = (CapabilitiesLteImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG) {
            this._duplexMode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG)arg).getDuplexMode();
            this._bandsSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG)arg).getBandsSupported();
            this._nnsfSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG)arg).isNnsfSupported();
            this._umtsRxSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG)arg).isUmtsRxSupported();
            this._umtsRxBandsSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG)arg).getUmtsRxBandsSupported();
            this._gsmRxSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG)arg).isGsmRxSupported();
            this._gsmRxBandsSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG)arg).getGsmRxBandsSupported();
            this._cdma2000RxSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG)arg).isCdma2000RxSupported();
            this._cdma2000RxBandsSupported = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG)arg).getCdma2000RxBandsSupported();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.Short> getBandsSupported() {
        return _bandsSupported;
    }
    
    public List<java.lang.String> getCdma2000RxBandsSupported() {
        return _cdma2000RxBandsSupported;
    }
    
    public DuplexMode getDuplexMode() {
        return _duplexMode;
    }
    
    public List<GsmRxBandsSupported> getGsmRxBandsSupported() {
        return _gsmRxBandsSupported;
    }
    
    public List<java.lang.String> getUmtsRxBandsSupported() {
        return _umtsRxBandsSupported;
    }
    
    public java.lang.Boolean isCdma2000RxSupported() {
        return _cdma2000RxSupported;
    }
    
    public java.lang.Boolean isGsmRxSupported() {
        return _gsmRxSupported;
    }
    
    public java.lang.Boolean isNnsfSupported() {
        return _nnsfSupported;
    }
    
    public java.lang.Boolean isUmtsRxSupported() {
        return _umtsRxSupported;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CapabilitiesLteBuilder setBandsSupported(final List<java.lang.Short> value) {
        this._bandsSupported = value;
        return this;
    }
    
     
    public CapabilitiesLteBuilder setCdma2000RxBandsSupported(final List<java.lang.String> value) {
        this._cdma2000RxBandsSupported = value;
        return this;
    }
    
     
    public CapabilitiesLteBuilder setDuplexMode(final DuplexMode value) {
        this._duplexMode = value;
        return this;
    }
    
     
    public CapabilitiesLteBuilder setGsmRxBandsSupported(final List<GsmRxBandsSupported> value) {
        this._gsmRxBandsSupported = value;
        return this;
    }
    
     
    public CapabilitiesLteBuilder setUmtsRxBandsSupported(final List<java.lang.String> value) {
        this._umtsRxBandsSupported = value;
        return this;
    }
    
     
    public CapabilitiesLteBuilder setCdma2000RxSupported(final java.lang.Boolean value) {
        this._cdma2000RxSupported = value;
        return this;
    }
    
     
    public CapabilitiesLteBuilder setGsmRxSupported(final java.lang.Boolean value) {
        this._gsmRxSupported = value;
        return this;
    }
    
     
    public CapabilitiesLteBuilder setNnsfSupported(final java.lang.Boolean value) {
        this._nnsfSupported = value;
        return this;
    }
    
     
    public CapabilitiesLteBuilder setUmtsRxSupported(final java.lang.Boolean value) {
        this._umtsRxSupported = value;
        return this;
    }
    
    public CapabilitiesLteBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CapabilitiesLteBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CapabilitiesLte build() {
        return new CapabilitiesLteImpl(this);
    }

    private static final class CapabilitiesLteImpl implements CapabilitiesLte {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte.class;
        }

        private final List<java.lang.Short> _bandsSupported;
        private final List<java.lang.String> _cdma2000RxBandsSupported;
        private final DuplexMode _duplexMode;
        private final List<GsmRxBandsSupported> _gsmRxBandsSupported;
        private final List<java.lang.String> _umtsRxBandsSupported;
        private final java.lang.Boolean _cdma2000RxSupported;
        private final java.lang.Boolean _gsmRxSupported;
        private final java.lang.Boolean _nnsfSupported;
        private final java.lang.Boolean _umtsRxSupported;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>> augmentation = Collections.emptyMap();

        private CapabilitiesLteImpl(CapabilitiesLteBuilder base) {
            this._bandsSupported = base.getBandsSupported();
            this._cdma2000RxBandsSupported = base.getCdma2000RxBandsSupported();
            this._duplexMode = base.getDuplexMode();
            this._gsmRxBandsSupported = base.getGsmRxBandsSupported();
            this._umtsRxBandsSupported = base.getUmtsRxBandsSupported();
            this._cdma2000RxSupported = base.isCdma2000RxSupported();
            this._gsmRxSupported = base.isGsmRxSupported();
            this._nnsfSupported = base.isNnsfSupported();
            this._umtsRxSupported = base.isUmtsRxSupported();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.Short> getBandsSupported() {
            return _bandsSupported;
        }
        
        @Override
        public List<java.lang.String> getCdma2000RxBandsSupported() {
            return _cdma2000RxBandsSupported;
        }
        
        @Override
        public DuplexMode getDuplexMode() {
            return _duplexMode;
        }
        
        @Override
        public List<GsmRxBandsSupported> getGsmRxBandsSupported() {
            return _gsmRxBandsSupported;
        }
        
        @Override
        public List<java.lang.String> getUmtsRxBandsSupported() {
            return _umtsRxBandsSupported;
        }
        
        @Override
        public java.lang.Boolean isCdma2000RxSupported() {
            return _cdma2000RxSupported;
        }
        
        @Override
        public java.lang.Boolean isGsmRxSupported() {
            return _gsmRxSupported;
        }
        
        @Override
        public java.lang.Boolean isNnsfSupported() {
            return _nnsfSupported;
        }
        
        @Override
        public java.lang.Boolean isUmtsRxSupported() {
            return _umtsRxSupported;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bandsSupported);
            result = prime * result + Objects.hashCode(_cdma2000RxBandsSupported);
            result = prime * result + Objects.hashCode(_duplexMode);
            result = prime * result + Objects.hashCode(_gsmRxBandsSupported);
            result = prime * result + Objects.hashCode(_umtsRxBandsSupported);
            result = prime * result + Objects.hashCode(_cdma2000RxSupported);
            result = prime * result + Objects.hashCode(_gsmRxSupported);
            result = prime * result + Objects.hashCode(_nnsfSupported);
            result = prime * result + Objects.hashCode(_umtsRxSupported);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte)obj;
            if (!Objects.equals(_bandsSupported, other.getBandsSupported())) {
                return false;
            }
            if (!Objects.equals(_cdma2000RxBandsSupported, other.getCdma2000RxBandsSupported())) {
                return false;
            }
            if (!Objects.equals(_duplexMode, other.getDuplexMode())) {
                return false;
            }
            if (!Objects.equals(_gsmRxBandsSupported, other.getGsmRxBandsSupported())) {
                return false;
            }
            if (!Objects.equals(_umtsRxBandsSupported, other.getUmtsRxBandsSupported())) {
                return false;
            }
            if (!Objects.equals(_cdma2000RxSupported, other.isCdma2000RxSupported())) {
                return false;
            }
            if (!Objects.equals(_gsmRxSupported, other.isGsmRxSupported())) {
                return false;
            }
            if (!Objects.equals(_nnsfSupported, other.isNnsfSupported())) {
                return false;
            }
            if (!Objects.equals(_umtsRxSupported, other.isUmtsRxSupported())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CapabilitiesLteImpl otherImpl = (CapabilitiesLteImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>> e : augmentation.entrySet()) {
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
            java.lang.String name = "CapabilitiesLte [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bandsSupported != null) {
                builder.append("_bandsSupported=");
                builder.append(_bandsSupported);
                builder.append(", ");
            }
            if (_cdma2000RxBandsSupported != null) {
                builder.append("_cdma2000RxBandsSupported=");
                builder.append(_cdma2000RxBandsSupported);
                builder.append(", ");
            }
            if (_duplexMode != null) {
                builder.append("_duplexMode=");
                builder.append(_duplexMode);
                builder.append(", ");
            }
            if (_gsmRxBandsSupported != null) {
                builder.append("_gsmRxBandsSupported=");
                builder.append(_gsmRxBandsSupported);
                builder.append(", ");
            }
            if (_umtsRxBandsSupported != null) {
                builder.append("_umtsRxBandsSupported=");
                builder.append(_umtsRxBandsSupported);
                builder.append(", ");
            }
            if (_cdma2000RxSupported != null) {
                builder.append("_cdma2000RxSupported=");
                builder.append(_cdma2000RxSupported);
                builder.append(", ");
            }
            if (_gsmRxSupported != null) {
                builder.append("_gsmRxSupported=");
                builder.append(_gsmRxSupported);
                builder.append(", ");
            }
            if (_nnsfSupported != null) {
                builder.append("_nnsfSupported=");
                builder.append(_nnsfSupported);
                builder.append(", ");
            }
            if (_umtsRxSupported != null) {
                builder.append("_umtsRxSupported=");
                builder.append(_umtsRxSupported);
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
