package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd
 *
 */
public class FapControlCdma2000HrpdBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd> {

    private FapControlCdma2000HrpdA13 _fapControlCdma2000HrpdA13;
    private FapControlCdma2000HrpdSelfConfig _fapControlCdma2000HrpdSelfConfig;
    private java.lang.Boolean _a13SessionTransferEnable;
    private java.lang.Boolean _adminState;
    private java.lang.Boolean _localIpAccessEnable;
    private java.lang.Boolean _opState;
    private java.lang.Boolean _rfTxStatus;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>> augmentation = Collections.emptyMap();

    public FapControlCdma2000HrpdBuilder() {
    }
    public FapControlCdma2000HrpdBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdG arg) {
        this._opState = arg.isOpState();
        this._adminState = arg.isAdminState();
        this._rfTxStatus = arg.isRfTxStatus();
        this._a13SessionTransferEnable = arg.isA13SessionTransferEnable();
        this._localIpAccessEnable = arg.isLocalIpAccessEnable();
    }

    public FapControlCdma2000HrpdBuilder(FapControlCdma2000Hrpd base) {
        this._fapControlCdma2000HrpdA13 = base.getFapControlCdma2000HrpdA13();
        this._fapControlCdma2000HrpdSelfConfig = base.getFapControlCdma2000HrpdSelfConfig();
        this._a13SessionTransferEnable = base.isA13SessionTransferEnable();
        this._adminState = base.isAdminState();
        this._localIpAccessEnable = base.isLocalIpAccessEnable();
        this._opState = base.isOpState();
        this._rfTxStatus = base.isRfTxStatus();
        if (base instanceof FapControlCdma2000HrpdImpl) {
            FapControlCdma2000HrpdImpl impl = (FapControlCdma2000HrpdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdG) {
            this._opState = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdG)arg).isOpState();
            this._adminState = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdG)arg).isAdminState();
            this._rfTxStatus = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdG)arg).isRfTxStatus();
            this._a13SessionTransferEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdG)arg).isA13SessionTransferEnable();
            this._localIpAccessEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdG)arg).isLocalIpAccessEnable();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdG] \n" +
              "but was: " + arg
            );
        }
    }

    public FapControlCdma2000HrpdA13 getFapControlCdma2000HrpdA13() {
        return _fapControlCdma2000HrpdA13;
    }
    
    public FapControlCdma2000HrpdSelfConfig getFapControlCdma2000HrpdSelfConfig() {
        return _fapControlCdma2000HrpdSelfConfig;
    }
    
    public java.lang.Boolean isA13SessionTransferEnable() {
        return _a13SessionTransferEnable;
    }
    
    public java.lang.Boolean isAdminState() {
        return _adminState;
    }
    
    public java.lang.Boolean isLocalIpAccessEnable() {
        return _localIpAccessEnable;
    }
    
    public java.lang.Boolean isOpState() {
        return _opState;
    }
    
    public java.lang.Boolean isRfTxStatus() {
        return _rfTxStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FapControlCdma2000HrpdBuilder setFapControlCdma2000HrpdA13(final FapControlCdma2000HrpdA13 value) {
        this._fapControlCdma2000HrpdA13 = value;
        return this;
    }
    
     
    public FapControlCdma2000HrpdBuilder setFapControlCdma2000HrpdSelfConfig(final FapControlCdma2000HrpdSelfConfig value) {
        this._fapControlCdma2000HrpdSelfConfig = value;
        return this;
    }
    
     
    public FapControlCdma2000HrpdBuilder setA13SessionTransferEnable(final java.lang.Boolean value) {
        this._a13SessionTransferEnable = value;
        return this;
    }
    
     
    public FapControlCdma2000HrpdBuilder setAdminState(final java.lang.Boolean value) {
        this._adminState = value;
        return this;
    }
    
     
    public FapControlCdma2000HrpdBuilder setLocalIpAccessEnable(final java.lang.Boolean value) {
        this._localIpAccessEnable = value;
        return this;
    }
    
     
    public FapControlCdma2000HrpdBuilder setOpState(final java.lang.Boolean value) {
        this._opState = value;
        return this;
    }
    
     
    public FapControlCdma2000HrpdBuilder setRfTxStatus(final java.lang.Boolean value) {
        this._rfTxStatus = value;
        return this;
    }
    
    public FapControlCdma2000HrpdBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlCdma2000HrpdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControlCdma2000Hrpd build() {
        return new FapControlCdma2000HrpdImpl(this);
    }

    private static final class FapControlCdma2000HrpdImpl implements FapControlCdma2000Hrpd {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd.class;
        }

        private final FapControlCdma2000HrpdA13 _fapControlCdma2000HrpdA13;
        private final FapControlCdma2000HrpdSelfConfig _fapControlCdma2000HrpdSelfConfig;
        private final java.lang.Boolean _a13SessionTransferEnable;
        private final java.lang.Boolean _adminState;
        private final java.lang.Boolean _localIpAccessEnable;
        private final java.lang.Boolean _opState;
        private final java.lang.Boolean _rfTxStatus;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>> augmentation = Collections.emptyMap();

        private FapControlCdma2000HrpdImpl(FapControlCdma2000HrpdBuilder base) {
            this._fapControlCdma2000HrpdA13 = base.getFapControlCdma2000HrpdA13();
            this._fapControlCdma2000HrpdSelfConfig = base.getFapControlCdma2000HrpdSelfConfig();
            this._a13SessionTransferEnable = base.isA13SessionTransferEnable();
            this._adminState = base.isAdminState();
            this._localIpAccessEnable = base.isLocalIpAccessEnable();
            this._opState = base.isOpState();
            this._rfTxStatus = base.isRfTxStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public FapControlCdma2000HrpdA13 getFapControlCdma2000HrpdA13() {
            return _fapControlCdma2000HrpdA13;
        }
        
        @Override
        public FapControlCdma2000HrpdSelfConfig getFapControlCdma2000HrpdSelfConfig() {
            return _fapControlCdma2000HrpdSelfConfig;
        }
        
        @Override
        public java.lang.Boolean isA13SessionTransferEnable() {
            return _a13SessionTransferEnable;
        }
        
        @Override
        public java.lang.Boolean isAdminState() {
            return _adminState;
        }
        
        @Override
        public java.lang.Boolean isLocalIpAccessEnable() {
            return _localIpAccessEnable;
        }
        
        @Override
        public java.lang.Boolean isOpState() {
            return _opState;
        }
        
        @Override
        public java.lang.Boolean isRfTxStatus() {
            return _rfTxStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_fapControlCdma2000HrpdA13);
            result = prime * result + Objects.hashCode(_fapControlCdma2000HrpdSelfConfig);
            result = prime * result + Objects.hashCode(_a13SessionTransferEnable);
            result = prime * result + Objects.hashCode(_adminState);
            result = prime * result + Objects.hashCode(_localIpAccessEnable);
            result = prime * result + Objects.hashCode(_opState);
            result = prime * result + Objects.hashCode(_rfTxStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd)obj;
            if (!Objects.equals(_fapControlCdma2000HrpdA13, other.getFapControlCdma2000HrpdA13())) {
                return false;
            }
            if (!Objects.equals(_fapControlCdma2000HrpdSelfConfig, other.getFapControlCdma2000HrpdSelfConfig())) {
                return false;
            }
            if (!Objects.equals(_a13SessionTransferEnable, other.isA13SessionTransferEnable())) {
                return false;
            }
            if (!Objects.equals(_adminState, other.isAdminState())) {
                return false;
            }
            if (!Objects.equals(_localIpAccessEnable, other.isLocalIpAccessEnable())) {
                return false;
            }
            if (!Objects.equals(_opState, other.isOpState())) {
                return false;
            }
            if (!Objects.equals(_rfTxStatus, other.isRfTxStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FapControlCdma2000HrpdImpl otherImpl = (FapControlCdma2000HrpdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControlCdma2000Hrpd [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_fapControlCdma2000HrpdA13 != null) {
                builder.append("_fapControlCdma2000HrpdA13=");
                builder.append(_fapControlCdma2000HrpdA13);
                builder.append(", ");
            }
            if (_fapControlCdma2000HrpdSelfConfig != null) {
                builder.append("_fapControlCdma2000HrpdSelfConfig=");
                builder.append(_fapControlCdma2000HrpdSelfConfig);
                builder.append(", ");
            }
            if (_a13SessionTransferEnable != null) {
                builder.append("_a13SessionTransferEnable=");
                builder.append(_a13SessionTransferEnable);
                builder.append(", ");
            }
            if (_adminState != null) {
                builder.append("_adminState=");
                builder.append(_adminState);
                builder.append(", ");
            }
            if (_localIpAccessEnable != null) {
                builder.append("_localIpAccessEnable=");
                builder.append(_localIpAccessEnable);
                builder.append(", ");
            }
            if (_opState != null) {
                builder.append("_opState=");
                builder.append(_opState);
                builder.append(", ");
            }
            if (_rfTxStatus != null) {
                builder.append("_rfTxStatus=");
                builder.append(_rfTxStatus);
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
