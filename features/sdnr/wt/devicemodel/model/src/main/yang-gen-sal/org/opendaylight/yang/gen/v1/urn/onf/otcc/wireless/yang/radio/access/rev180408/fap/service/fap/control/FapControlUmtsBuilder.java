package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsGateway;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.umts.FapControlUmtsSelfConfig;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts
 *
 */
public class FapControlUmtsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts> {

    private FapControlUmtsGateway _fapControlUmtsGateway;
    private FapControlUmtsSelfConfig _fapControlUmtsSelfConfig;
    private java.lang.String _pmConfig;
    private java.lang.Boolean _adminState;
    private java.lang.Boolean _opState;
    private java.lang.Boolean _rfTxStatus;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>> augmentation = Collections.emptyMap();

    public FapControlUmtsBuilder() {
    }
    public FapControlUmtsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsG arg) {
        this._opState = arg.isOpState();
        this._adminState = arg.isAdminState();
        this._rfTxStatus = arg.isRfTxStatus();
        this._pmConfig = arg.getPmConfig();
    }

    public FapControlUmtsBuilder(FapControlUmts base) {
        this._fapControlUmtsGateway = base.getFapControlUmtsGateway();
        this._fapControlUmtsSelfConfig = base.getFapControlUmtsSelfConfig();
        this._pmConfig = base.getPmConfig();
        this._adminState = base.isAdminState();
        this._opState = base.isOpState();
        this._rfTxStatus = base.isRfTxStatus();
        if (base instanceof FapControlUmtsImpl) {
            FapControlUmtsImpl impl = (FapControlUmtsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsG) {
            this._opState = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsG)arg).isOpState();
            this._adminState = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsG)arg).isAdminState();
            this._rfTxStatus = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsG)arg).isRfTxStatus();
            this._pmConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsG)arg).getPmConfig();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlUmtsG] \n" +
              "but was: " + arg
            );
        }
    }

    public FapControlUmtsGateway getFapControlUmtsGateway() {
        return _fapControlUmtsGateway;
    }
    
    public FapControlUmtsSelfConfig getFapControlUmtsSelfConfig() {
        return _fapControlUmtsSelfConfig;
    }
    
    public java.lang.String getPmConfig() {
        return _pmConfig;
    }
    
    public java.lang.Boolean isAdminState() {
        return _adminState;
    }
    
    public java.lang.Boolean isOpState() {
        return _opState;
    }
    
    public java.lang.Boolean isRfTxStatus() {
        return _rfTxStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FapControlUmtsBuilder setFapControlUmtsGateway(final FapControlUmtsGateway value) {
        this._fapControlUmtsGateway = value;
        return this;
    }
    
     
    public FapControlUmtsBuilder setFapControlUmtsSelfConfig(final FapControlUmtsSelfConfig value) {
        this._fapControlUmtsSelfConfig = value;
        return this;
    }
    
     
     private static void check_pmConfigLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public FapControlUmtsBuilder setPmConfig(final java.lang.String value) {
    if (value != null) {
        check_pmConfigLength(value);
    }
        this._pmConfig = value;
        return this;
    }
    
     
    public FapControlUmtsBuilder setAdminState(final java.lang.Boolean value) {
        this._adminState = value;
        return this;
    }
    
     
    public FapControlUmtsBuilder setOpState(final java.lang.Boolean value) {
        this._opState = value;
        return this;
    }
    
     
    public FapControlUmtsBuilder setRfTxStatus(final java.lang.Boolean value) {
        this._rfTxStatus = value;
        return this;
    }
    
    public FapControlUmtsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlUmtsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControlUmts build() {
        return new FapControlUmtsImpl(this);
    }

    private static final class FapControlUmtsImpl implements FapControlUmts {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts.class;
        }

        private final FapControlUmtsGateway _fapControlUmtsGateway;
        private final FapControlUmtsSelfConfig _fapControlUmtsSelfConfig;
        private final java.lang.String _pmConfig;
        private final java.lang.Boolean _adminState;
        private final java.lang.Boolean _opState;
        private final java.lang.Boolean _rfTxStatus;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>> augmentation = Collections.emptyMap();

        private FapControlUmtsImpl(FapControlUmtsBuilder base) {
            this._fapControlUmtsGateway = base.getFapControlUmtsGateway();
            this._fapControlUmtsSelfConfig = base.getFapControlUmtsSelfConfig();
            this._pmConfig = base.getPmConfig();
            this._adminState = base.isAdminState();
            this._opState = base.isOpState();
            this._rfTxStatus = base.isRfTxStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public FapControlUmtsGateway getFapControlUmtsGateway() {
            return _fapControlUmtsGateway;
        }
        
        @Override
        public FapControlUmtsSelfConfig getFapControlUmtsSelfConfig() {
            return _fapControlUmtsSelfConfig;
        }
        
        @Override
        public java.lang.String getPmConfig() {
            return _pmConfig;
        }
        
        @Override
        public java.lang.Boolean isAdminState() {
            return _adminState;
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_fapControlUmtsGateway);
            result = prime * result + Objects.hashCode(_fapControlUmtsSelfConfig);
            result = prime * result + Objects.hashCode(_pmConfig);
            result = prime * result + Objects.hashCode(_adminState);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts)obj;
            if (!Objects.equals(_fapControlUmtsGateway, other.getFapControlUmtsGateway())) {
                return false;
            }
            if (!Objects.equals(_fapControlUmtsSelfConfig, other.getFapControlUmtsSelfConfig())) {
                return false;
            }
            if (!Objects.equals(_pmConfig, other.getPmConfig())) {
                return false;
            }
            if (!Objects.equals(_adminState, other.isAdminState())) {
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
                FapControlUmtsImpl otherImpl = (FapControlUmtsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControlUmts [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_fapControlUmtsGateway != null) {
                builder.append("_fapControlUmtsGateway=");
                builder.append(_fapControlUmtsGateway);
                builder.append(", ");
            }
            if (_fapControlUmtsSelfConfig != null) {
                builder.append("_fapControlUmtsSelfConfig=");
                builder.append(_fapControlUmtsSelfConfig);
                builder.append(", ");
            }
            if (_pmConfig != null) {
                builder.append("_pmConfig=");
                builder.append(_pmConfig);
                builder.append(", ");
            }
            if (_adminState != null) {
                builder.append("_adminState=");
                builder.append(_adminState);
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
