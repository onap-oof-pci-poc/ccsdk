package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000
 *
 */
public class FapControlCdma2000Builder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000> {

    private FapControlCdma2000Gateway _fapControlCdma2000Gateway;
    private FapControlCdma2000Hrpd _fapControlCdma2000Hrpd;
    private FapControlCdma2000OneX _fapControlCdma2000OneX;
    private FapControlCdma2000Time _fapControlCdma2000Time;
    private java.lang.String _homeDomain;
    private java.lang.String _pmConfig;
    private java.lang.Boolean _remoteIpAccessEnable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>> augmentation = Collections.emptyMap();

    public FapControlCdma2000Builder() {
    }
    public FapControlCdma2000Builder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000G arg) {
        this._homeDomain = arg.getHomeDomain();
        this._remoteIpAccessEnable = arg.isRemoteIpAccessEnable();
        this._pmConfig = arg.getPmConfig();
    }

    public FapControlCdma2000Builder(FapControlCdma2000 base) {
        this._fapControlCdma2000Gateway = base.getFapControlCdma2000Gateway();
        this._fapControlCdma2000Hrpd = base.getFapControlCdma2000Hrpd();
        this._fapControlCdma2000OneX = base.getFapControlCdma2000OneX();
        this._fapControlCdma2000Time = base.getFapControlCdma2000Time();
        this._homeDomain = base.getHomeDomain();
        this._pmConfig = base.getPmConfig();
        this._remoteIpAccessEnable = base.isRemoteIpAccessEnable();
        if (base instanceof FapControlCdma2000Impl) {
            FapControlCdma2000Impl impl = (FapControlCdma2000Impl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000G</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000G) {
            this._homeDomain = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000G)arg).getHomeDomain();
            this._remoteIpAccessEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000G)arg).isRemoteIpAccessEnable();
            this._pmConfig = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000G)arg).getPmConfig();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000G] \n" +
              "but was: " + arg
            );
        }
    }

    public FapControlCdma2000Gateway getFapControlCdma2000Gateway() {
        return _fapControlCdma2000Gateway;
    }
    
    public FapControlCdma2000Hrpd getFapControlCdma2000Hrpd() {
        return _fapControlCdma2000Hrpd;
    }
    
    public FapControlCdma2000OneX getFapControlCdma2000OneX() {
        return _fapControlCdma2000OneX;
    }
    
    public FapControlCdma2000Time getFapControlCdma2000Time() {
        return _fapControlCdma2000Time;
    }
    
    public java.lang.String getHomeDomain() {
        return _homeDomain;
    }
    
    public java.lang.String getPmConfig() {
        return _pmConfig;
    }
    
    public java.lang.Boolean isRemoteIpAccessEnable() {
        return _remoteIpAccessEnable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FapControlCdma2000Builder setFapControlCdma2000Gateway(final FapControlCdma2000Gateway value) {
        this._fapControlCdma2000Gateway = value;
        return this;
    }
    
     
    public FapControlCdma2000Builder setFapControlCdma2000Hrpd(final FapControlCdma2000Hrpd value) {
        this._fapControlCdma2000Hrpd = value;
        return this;
    }
    
     
    public FapControlCdma2000Builder setFapControlCdma2000OneX(final FapControlCdma2000OneX value) {
        this._fapControlCdma2000OneX = value;
        return this;
    }
    
     
    public FapControlCdma2000Builder setFapControlCdma2000Time(final FapControlCdma2000Time value) {
        this._fapControlCdma2000Time = value;
        return this;
    }
    
     
     private static void check_homeDomainLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public FapControlCdma2000Builder setHomeDomain(final java.lang.String value) {
    if (value != null) {
        check_homeDomainLength(value);
    }
        this._homeDomain = value;
        return this;
    }
    
     
     private static void check_pmConfigLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public FapControlCdma2000Builder setPmConfig(final java.lang.String value) {
    if (value != null) {
        check_pmConfigLength(value);
    }
        this._pmConfig = value;
        return this;
    }
    
     
    public FapControlCdma2000Builder setRemoteIpAccessEnable(final java.lang.Boolean value) {
        this._remoteIpAccessEnable = value;
        return this;
    }
    
    public FapControlCdma2000Builder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapControlCdma2000Builder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapControlCdma2000 build() {
        return new FapControlCdma2000Impl(this);
    }

    private static final class FapControlCdma2000Impl implements FapControlCdma2000 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000.class;
        }

        private final FapControlCdma2000Gateway _fapControlCdma2000Gateway;
        private final FapControlCdma2000Hrpd _fapControlCdma2000Hrpd;
        private final FapControlCdma2000OneX _fapControlCdma2000OneX;
        private final FapControlCdma2000Time _fapControlCdma2000Time;
        private final java.lang.String _homeDomain;
        private final java.lang.String _pmConfig;
        private final java.lang.Boolean _remoteIpAccessEnable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>> augmentation = Collections.emptyMap();

        private FapControlCdma2000Impl(FapControlCdma2000Builder base) {
            this._fapControlCdma2000Gateway = base.getFapControlCdma2000Gateway();
            this._fapControlCdma2000Hrpd = base.getFapControlCdma2000Hrpd();
            this._fapControlCdma2000OneX = base.getFapControlCdma2000OneX();
            this._fapControlCdma2000Time = base.getFapControlCdma2000Time();
            this._homeDomain = base.getHomeDomain();
            this._pmConfig = base.getPmConfig();
            this._remoteIpAccessEnable = base.isRemoteIpAccessEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public FapControlCdma2000Gateway getFapControlCdma2000Gateway() {
            return _fapControlCdma2000Gateway;
        }
        
        @Override
        public FapControlCdma2000Hrpd getFapControlCdma2000Hrpd() {
            return _fapControlCdma2000Hrpd;
        }
        
        @Override
        public FapControlCdma2000OneX getFapControlCdma2000OneX() {
            return _fapControlCdma2000OneX;
        }
        
        @Override
        public FapControlCdma2000Time getFapControlCdma2000Time() {
            return _fapControlCdma2000Time;
        }
        
        @Override
        public java.lang.String getHomeDomain() {
            return _homeDomain;
        }
        
        @Override
        public java.lang.String getPmConfig() {
            return _pmConfig;
        }
        
        @Override
        public java.lang.Boolean isRemoteIpAccessEnable() {
            return _remoteIpAccessEnable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_fapControlCdma2000Gateway);
            result = prime * result + Objects.hashCode(_fapControlCdma2000Hrpd);
            result = prime * result + Objects.hashCode(_fapControlCdma2000OneX);
            result = prime * result + Objects.hashCode(_fapControlCdma2000Time);
            result = prime * result + Objects.hashCode(_homeDomain);
            result = prime * result + Objects.hashCode(_pmConfig);
            result = prime * result + Objects.hashCode(_remoteIpAccessEnable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000 other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000)obj;
            if (!Objects.equals(_fapControlCdma2000Gateway, other.getFapControlCdma2000Gateway())) {
                return false;
            }
            if (!Objects.equals(_fapControlCdma2000Hrpd, other.getFapControlCdma2000Hrpd())) {
                return false;
            }
            if (!Objects.equals(_fapControlCdma2000OneX, other.getFapControlCdma2000OneX())) {
                return false;
            }
            if (!Objects.equals(_fapControlCdma2000Time, other.getFapControlCdma2000Time())) {
                return false;
            }
            if (!Objects.equals(_homeDomain, other.getHomeDomain())) {
                return false;
            }
            if (!Objects.equals(_pmConfig, other.getPmConfig())) {
                return false;
            }
            if (!Objects.equals(_remoteIpAccessEnable, other.isRemoteIpAccessEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FapControlCdma2000Impl otherImpl = (FapControlCdma2000Impl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapControlCdma2000 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_fapControlCdma2000Gateway != null) {
                builder.append("_fapControlCdma2000Gateway=");
                builder.append(_fapControlCdma2000Gateway);
                builder.append(", ");
            }
            if (_fapControlCdma2000Hrpd != null) {
                builder.append("_fapControlCdma2000Hrpd=");
                builder.append(_fapControlCdma2000Hrpd);
                builder.append(", ");
            }
            if (_fapControlCdma2000OneX != null) {
                builder.append("_fapControlCdma2000OneX=");
                builder.append(_fapControlCdma2000OneX);
                builder.append(", ");
            }
            if (_fapControlCdma2000Time != null) {
                builder.append("_fapControlCdma2000Time=");
                builder.append(_fapControlCdma2000Time);
                builder.append(", ");
            }
            if (_homeDomain != null) {
                builder.append("_homeDomain=");
                builder.append(_homeDomain);
                builder.append(", ");
            }
            if (_pmConfig != null) {
                builder.append("_pmConfig=");
                builder.append(_pmConfig);
                builder.append(", ");
            }
            if (_remoteIpAccessEnable != null) {
                builder.append("_remoteIpAccessEnable=");
                builder.append(_remoteIpAccessEnable);
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
