package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapServiceG.DeviceType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.CellConfig;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Rem;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService
 *
 */
public class FapServiceBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService> {

    private AccessMgmt _accessMgmt;
    private java.lang.String _alias;
    private Capabilities _capabilities;
    private CellConfig _cellConfig;
    private DeviceType _deviceType;
    private java.lang.String _dnPrefix;
    private FapControl _fapControl;
    private FapServiceKey _key;
    private Rem _rem;
    private Transport _transport;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>> augmentation = Collections.emptyMap();

    public FapServiceBuilder() {
    }
    public FapServiceBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapServiceG arg) {
        this._alias = arg.getAlias();
        this._deviceType = arg.getDeviceType();
        this._dnPrefix = arg.getDnPrefix();
    }

    public FapServiceBuilder(FapService base) {
        if (base.getKey() == null) {
            this._key = new FapServiceKey(
                base.getAlias()
            );
            this._alias = base.getAlias();
        } else {
            this._key = base.getKey();
            this._alias = _key.getAlias();
        }
        this._accessMgmt = base.getAccessMgmt();
        this._capabilities = base.getCapabilities();
        this._cellConfig = base.getCellConfig();
        this._deviceType = base.getDeviceType();
        this._dnPrefix = base.getDnPrefix();
        this._fapControl = base.getFapControl();
        this._rem = base.getRem();
        this._transport = base.getTransport();
        if (base instanceof FapServiceImpl) {
            FapServiceImpl impl = (FapServiceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapServiceG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapServiceG) {
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapServiceG)arg).getAlias();
            this._deviceType = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapServiceG)arg).getDeviceType();
            this._dnPrefix = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapServiceG)arg).getDnPrefix();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapServiceG] \n" +
              "but was: " + arg
            );
        }
    }

    public AccessMgmt getAccessMgmt() {
        return _accessMgmt;
    }
    
    public java.lang.String getAlias() {
        return _alias;
    }
    
    public Capabilities getCapabilities() {
        return _capabilities;
    }
    
    public CellConfig getCellConfig() {
        return _cellConfig;
    }
    
    public DeviceType getDeviceType() {
        return _deviceType;
    }
    
    public java.lang.String getDnPrefix() {
        return _dnPrefix;
    }
    
    public FapControl getFapControl() {
        return _fapControl;
    }
    
    public FapServiceKey getKey() {
        return _key;
    }
    
    public Rem getRem() {
        return _rem;
    }
    
    public Transport getTransport() {
        return _transport;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FapServiceBuilder setAccessMgmt(final AccessMgmt value) {
        this._accessMgmt = value;
        return this;
    }
    
     
     private static void check_aliasLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..64]].", value));
     }
    
    public FapServiceBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
    public FapServiceBuilder setCapabilities(final Capabilities value) {
        this._capabilities = value;
        return this;
    }
    
     
    public FapServiceBuilder setCellConfig(final CellConfig value) {
        this._cellConfig = value;
        return this;
    }
    
     
    public FapServiceBuilder setDeviceType(final DeviceType value) {
        this._deviceType = value;
        return this;
    }
    
     
     private static void check_dnPrefixLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public FapServiceBuilder setDnPrefix(final java.lang.String value) {
    if (value != null) {
        check_dnPrefixLength(value);
    }
        this._dnPrefix = value;
        return this;
    }
    
     
    public FapServiceBuilder setFapControl(final FapControl value) {
        this._fapControl = value;
        return this;
    }
    
     
    public FapServiceBuilder setKey(final FapServiceKey value) {
        this._key = value;
        return this;
    }
    
     
    public FapServiceBuilder setRem(final Rem value) {
        this._rem = value;
        return this;
    }
    
     
    public FapServiceBuilder setTransport(final Transport value) {
        this._transport = value;
        return this;
    }
    
    public FapServiceBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FapServiceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FapService build() {
        return new FapServiceImpl(this);
    }

    private static final class FapServiceImpl implements FapService {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService.class;
        }

        private final AccessMgmt _accessMgmt;
        private final java.lang.String _alias;
        private final Capabilities _capabilities;
        private final CellConfig _cellConfig;
        private final DeviceType _deviceType;
        private final java.lang.String _dnPrefix;
        private final FapControl _fapControl;
        private final FapServiceKey _key;
        private final Rem _rem;
        private final Transport _transport;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>> augmentation = Collections.emptyMap();

        private FapServiceImpl(FapServiceBuilder base) {
            if (base.getKey() == null) {
                this._key = new FapServiceKey(
                    base.getAlias()
                );
                this._alias = base.getAlias();
            } else {
                this._key = base.getKey();
                this._alias = _key.getAlias();
            }
            this._accessMgmt = base.getAccessMgmt();
            this._capabilities = base.getCapabilities();
            this._cellConfig = base.getCellConfig();
            this._deviceType = base.getDeviceType();
            this._dnPrefix = base.getDnPrefix();
            this._fapControl = base.getFapControl();
            this._rem = base.getRem();
            this._transport = base.getTransport();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AccessMgmt getAccessMgmt() {
            return _accessMgmt;
        }
        
        @Override
        public java.lang.String getAlias() {
            return _alias;
        }
        
        @Override
        public Capabilities getCapabilities() {
            return _capabilities;
        }
        
        @Override
        public CellConfig getCellConfig() {
            return _cellConfig;
        }
        
        @Override
        public DeviceType getDeviceType() {
            return _deviceType;
        }
        
        @Override
        public java.lang.String getDnPrefix() {
            return _dnPrefix;
        }
        
        @Override
        public FapControl getFapControl() {
            return _fapControl;
        }
        
        @Override
        public FapServiceKey getKey() {
            return _key;
        }
        
        @Override
        public Rem getRem() {
            return _rem;
        }
        
        @Override
        public Transport getTransport() {
            return _transport;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_accessMgmt);
            result = prime * result + Objects.hashCode(_alias);
            result = prime * result + Objects.hashCode(_capabilities);
            result = prime * result + Objects.hashCode(_cellConfig);
            result = prime * result + Objects.hashCode(_deviceType);
            result = prime * result + Objects.hashCode(_dnPrefix);
            result = prime * result + Objects.hashCode(_fapControl);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_rem);
            result = prime * result + Objects.hashCode(_transport);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService)obj;
            if (!Objects.equals(_accessMgmt, other.getAccessMgmt())) {
                return false;
            }
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_capabilities, other.getCapabilities())) {
                return false;
            }
            if (!Objects.equals(_cellConfig, other.getCellConfig())) {
                return false;
            }
            if (!Objects.equals(_deviceType, other.getDeviceType())) {
                return false;
            }
            if (!Objects.equals(_dnPrefix, other.getDnPrefix())) {
                return false;
            }
            if (!Objects.equals(_fapControl, other.getFapControl())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_rem, other.getRem())) {
                return false;
            }
            if (!Objects.equals(_transport, other.getTransport())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FapServiceImpl otherImpl = (FapServiceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FapService [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_accessMgmt != null) {
                builder.append("_accessMgmt=");
                builder.append(_accessMgmt);
                builder.append(", ");
            }
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_capabilities != null) {
                builder.append("_capabilities=");
                builder.append(_capabilities);
                builder.append(", ");
            }
            if (_cellConfig != null) {
                builder.append("_cellConfig=");
                builder.append(_cellConfig);
                builder.append(", ");
            }
            if (_deviceType != null) {
                builder.append("_deviceType=");
                builder.append(_deviceType);
                builder.append(", ");
            }
            if (_dnPrefix != null) {
                builder.append("_dnPrefix=");
                builder.append(_dnPrefix);
                builder.append(", ");
            }
            if (_fapControl != null) {
                builder.append("_fapControl=");
                builder.append(_fapControl);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_rem != null) {
                builder.append("_rem=");
                builder.append(_rem);
                builder.append(", ");
            }
            if (_transport != null) {
                builder.append("_transport=");
                builder.append(_transport);
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
