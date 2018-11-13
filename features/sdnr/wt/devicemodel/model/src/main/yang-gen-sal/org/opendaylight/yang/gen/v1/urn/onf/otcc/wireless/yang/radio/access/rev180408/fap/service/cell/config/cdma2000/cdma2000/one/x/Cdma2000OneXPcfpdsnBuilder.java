package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnPcfpdsnStats;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG.IosVersion;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats;
import java.util.Collections;
import java.util.Arrays;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn
 *
 */
public class Cdma2000OneXPcfpdsnBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn> {

    private java.lang.String _alias;
    private Cdma2000OneXPcfpdsnA11RegUpdateStats _cdma2000OneXPcfpdsnA11RegUpdateStats;
    private Cdma2000OneXPcfpdsnPcfpdsnStats _cdma2000OneXPcfpdsnPcfpdsnStats;
    private IosVersion _iosVersion;
    private Cdma2000OneXPcfpdsnKey _key;
    private java.lang.Long _pdsNadminStatus;
    private java.lang.Short _pdsnHealthStatus;
    private java.lang.Long _pdsnNumber;
    private IpAddress _pdsnipAddress;
    private byte[] _securityKey;
    private java.lang.Long _securityParameterIndex;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>> augmentation = Collections.emptyMap();

    public Cdma2000OneXPcfpdsnBuilder() {
    }
    public Cdma2000OneXPcfpdsnBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._pdsnNumber = arg.getPdsnNumber();
        this._securityParameterIndex = arg.getSecurityParameterIndex();
        this._securityKey = arg.getSecurityKey();
        this._iosVersion = arg.getIosVersion();
        this._pdsNadminStatus = arg.getPdsNadminStatus();
        this._pdsnHealthStatus = arg.getPdsnHealthStatus();
        this._pdsnipAddress = arg.getPdsnipAddress();
    }

    public Cdma2000OneXPcfpdsnBuilder(Cdma2000OneXPcfpdsn base) {
        if (base.getKey() == null) {
            this._key = new Cdma2000OneXPcfpdsnKey(
                base.getPdsnNumber(), 
                base.getSecurityKey(), 
                base.getSecurityParameterIndex()
            );
            this._pdsnNumber = base.getPdsnNumber();
            this._securityKey = base.getSecurityKey();
            this._securityParameterIndex = base.getSecurityParameterIndex();
        } else {
            this._key = base.getKey();
            this._pdsnNumber = _key.getPdsnNumber();
            this._securityKey = _key.getSecurityKey();
            this._securityParameterIndex = _key.getSecurityParameterIndex();
        }
        this._alias = base.getAlias();
        this._cdma2000OneXPcfpdsnA11RegUpdateStats = base.getCdma2000OneXPcfpdsnA11RegUpdateStats();
        this._cdma2000OneXPcfpdsnPcfpdsnStats = base.getCdma2000OneXPcfpdsnPcfpdsnStats();
        this._iosVersion = base.getIosVersion();
        this._pdsNadminStatus = base.getPdsNadminStatus();
        this._pdsnHealthStatus = base.getPdsnHealthStatus();
        this._pdsnipAddress = base.getPdsnipAddress();
        this._enable = base.isEnable();
        if (base instanceof Cdma2000OneXPcfpdsnImpl) {
            Cdma2000OneXPcfpdsnImpl impl = (Cdma2000OneXPcfpdsnImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG)arg).getAlias();
            this._pdsnNumber = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG)arg).getPdsnNumber();
            this._securityParameterIndex = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG)arg).getSecurityParameterIndex();
            this._securityKey = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG)arg).getSecurityKey();
            this._iosVersion = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG)arg).getIosVersion();
            this._pdsNadminStatus = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG)arg).getPdsNadminStatus();
            this._pdsnHealthStatus = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG)arg).getPdsnHealthStatus();
            this._pdsnipAddress = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG)arg).getPdsnipAddress();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public Cdma2000OneXPcfpdsnA11RegUpdateStats getCdma2000OneXPcfpdsnA11RegUpdateStats() {
        return _cdma2000OneXPcfpdsnA11RegUpdateStats;
    }
    
    public Cdma2000OneXPcfpdsnPcfpdsnStats getCdma2000OneXPcfpdsnPcfpdsnStats() {
        return _cdma2000OneXPcfpdsnPcfpdsnStats;
    }
    
    public IosVersion getIosVersion() {
        return _iosVersion;
    }
    
    public Cdma2000OneXPcfpdsnKey getKey() {
        return _key;
    }
    
    public java.lang.Long getPdsNadminStatus() {
        return _pdsNadminStatus;
    }
    
    public java.lang.Short getPdsnHealthStatus() {
        return _pdsnHealthStatus;
    }
    
    public java.lang.Long getPdsnNumber() {
        return _pdsnNumber;
    }
    
    public IpAddress getPdsnipAddress() {
        return _pdsnipAddress;
    }
    
    public byte[] getSecurityKey() {
        return _securityKey == null ? null : _securityKey.clone();
    }
    
    public java.lang.Long getSecurityParameterIndex() {
        return _securityParameterIndex;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void check_aliasLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..64]].", value));
     }
    
    public Cdma2000OneXPcfpdsnBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
    public Cdma2000OneXPcfpdsnBuilder setCdma2000OneXPcfpdsnA11RegUpdateStats(final Cdma2000OneXPcfpdsnA11RegUpdateStats value) {
        this._cdma2000OneXPcfpdsnA11RegUpdateStats = value;
        return this;
    }
    
     
    public Cdma2000OneXPcfpdsnBuilder setCdma2000OneXPcfpdsnPcfpdsnStats(final Cdma2000OneXPcfpdsnPcfpdsnStats value) {
        this._cdma2000OneXPcfpdsnPcfpdsnStats = value;
        return this;
    }
    
     
    public Cdma2000OneXPcfpdsnBuilder setIosVersion(final IosVersion value) {
        this._iosVersion = value;
        return this;
    }
    
     
    public Cdma2000OneXPcfpdsnBuilder setKey(final Cdma2000OneXPcfpdsnKey value) {
        this._key = value;
        return this;
    }
    
     
    public Cdma2000OneXPcfpdsnBuilder setPdsNadminStatus(final java.lang.Long value) {
        this._pdsNadminStatus = value;
        return this;
    }
    
     
     private static void checkPdsnHealthStatusRange(final short value) {
         if (value >= (short)0 && value <= (short)1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..1]].", value));
     }
    
    public Cdma2000OneXPcfpdsnBuilder setPdsnHealthStatus(final java.lang.Short value) {
    if (value != null) {
        checkPdsnHealthStatusRange(value);
    }
        this._pdsnHealthStatus = value;
        return this;
    }
    
     
    public Cdma2000OneXPcfpdsnBuilder setPdsnNumber(final java.lang.Long value) {
        this._pdsnNumber = value;
        return this;
    }
    
     
    public Cdma2000OneXPcfpdsnBuilder setPdsnipAddress(final IpAddress value) {
        this._pdsnipAddress = value;
        return this;
    }
    
     
     private static void check_securityKeyLength(final byte[] value) {
         final int length = value.length;
         if (length >= 0 && length <= 16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..16]].", java.util.Arrays.toString(value)));
     }
    
    public Cdma2000OneXPcfpdsnBuilder setSecurityKey(final byte[] value) {
    if (value != null) {
        check_securityKeyLength(value);
    }
        this._securityKey = value;
        return this;
    }
    
     
     private static void checkSecurityParameterIndexRange(final long value) {
         if (value >= 0L && value <= 0L) {
             return;
         }
         if (value >= 256L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..0], [256..4294967295]].", value));
     }
    
    public Cdma2000OneXPcfpdsnBuilder setSecurityParameterIndex(final java.lang.Long value) {
    if (value != null) {
        checkSecurityParameterIndexRange(value);
    }
        this._securityParameterIndex = value;
        return this;
    }
    
     
    public Cdma2000OneXPcfpdsnBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public Cdma2000OneXPcfpdsnBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000OneXPcfpdsnBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000OneXPcfpdsn build() {
        return new Cdma2000OneXPcfpdsnImpl(this);
    }

    private static final class Cdma2000OneXPcfpdsnImpl implements Cdma2000OneXPcfpdsn {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn.class;
        }

        private final java.lang.String _alias;
        private final Cdma2000OneXPcfpdsnA11RegUpdateStats _cdma2000OneXPcfpdsnA11RegUpdateStats;
        private final Cdma2000OneXPcfpdsnPcfpdsnStats _cdma2000OneXPcfpdsnPcfpdsnStats;
        private final IosVersion _iosVersion;
        private final Cdma2000OneXPcfpdsnKey _key;
        private final java.lang.Long _pdsNadminStatus;
        private final java.lang.Short _pdsnHealthStatus;
        private final java.lang.Long _pdsnNumber;
        private final IpAddress _pdsnipAddress;
        private final byte[] _securityKey;
        private final java.lang.Long _securityParameterIndex;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>> augmentation = Collections.emptyMap();

        private Cdma2000OneXPcfpdsnImpl(Cdma2000OneXPcfpdsnBuilder base) {
            if (base.getKey() == null) {
                this._key = new Cdma2000OneXPcfpdsnKey(
                    base.getPdsnNumber(), 
                    base.getSecurityKey(), 
                    base.getSecurityParameterIndex()
                );
                this._pdsnNumber = base.getPdsnNumber();
                this._securityKey = base.getSecurityKey();
                this._securityParameterIndex = base.getSecurityParameterIndex();
            } else {
                this._key = base.getKey();
                this._pdsnNumber = _key.getPdsnNumber();
                this._securityKey = _key.getSecurityKey();
                this._securityParameterIndex = _key.getSecurityParameterIndex();
            }
            this._alias = base.getAlias();
            this._cdma2000OneXPcfpdsnA11RegUpdateStats = base.getCdma2000OneXPcfpdsnA11RegUpdateStats();
            this._cdma2000OneXPcfpdsnPcfpdsnStats = base.getCdma2000OneXPcfpdsnPcfpdsnStats();
            this._iosVersion = base.getIosVersion();
            this._pdsNadminStatus = base.getPdsNadminStatus();
            this._pdsnHealthStatus = base.getPdsnHealthStatus();
            this._pdsnipAddress = base.getPdsnipAddress();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getAlias() {
            return _alias;
        }
        
        @Override
        public Cdma2000OneXPcfpdsnA11RegUpdateStats getCdma2000OneXPcfpdsnA11RegUpdateStats() {
            return _cdma2000OneXPcfpdsnA11RegUpdateStats;
        }
        
        @Override
        public Cdma2000OneXPcfpdsnPcfpdsnStats getCdma2000OneXPcfpdsnPcfpdsnStats() {
            return _cdma2000OneXPcfpdsnPcfpdsnStats;
        }
        
        @Override
        public IosVersion getIosVersion() {
            return _iosVersion;
        }
        
        @Override
        public Cdma2000OneXPcfpdsnKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Long getPdsNadminStatus() {
            return _pdsNadminStatus;
        }
        
        @Override
        public java.lang.Short getPdsnHealthStatus() {
            return _pdsnHealthStatus;
        }
        
        @Override
        public java.lang.Long getPdsnNumber() {
            return _pdsnNumber;
        }
        
        @Override
        public IpAddress getPdsnipAddress() {
            return _pdsnipAddress;
        }
        
        @Override
        public byte[] getSecurityKey() {
            return _securityKey == null ? null : _securityKey.clone();
        }
        
        @Override
        public java.lang.Long getSecurityParameterIndex() {
            return _securityParameterIndex;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_alias);
            result = prime * result + Objects.hashCode(_cdma2000OneXPcfpdsnA11RegUpdateStats);
            result = prime * result + Objects.hashCode(_cdma2000OneXPcfpdsnPcfpdsnStats);
            result = prime * result + Objects.hashCode(_iosVersion);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_pdsNadminStatus);
            result = prime * result + Objects.hashCode(_pdsnHealthStatus);
            result = prime * result + Objects.hashCode(_pdsnNumber);
            result = prime * result + Objects.hashCode(_pdsnipAddress);
            result = prime * result + Arrays.hashCode(_securityKey);
            result = prime * result + Objects.hashCode(_securityParameterIndex);
            result = prime * result + Objects.hashCode(_enable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXPcfpdsnA11RegUpdateStats, other.getCdma2000OneXPcfpdsnA11RegUpdateStats())) {
                return false;
            }
            if (!Objects.equals(_cdma2000OneXPcfpdsnPcfpdsnStats, other.getCdma2000OneXPcfpdsnPcfpdsnStats())) {
                return false;
            }
            if (!Objects.equals(_iosVersion, other.getIosVersion())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_pdsNadminStatus, other.getPdsNadminStatus())) {
                return false;
            }
            if (!Objects.equals(_pdsnHealthStatus, other.getPdsnHealthStatus())) {
                return false;
            }
            if (!Objects.equals(_pdsnNumber, other.getPdsnNumber())) {
                return false;
            }
            if (!Objects.equals(_pdsnipAddress, other.getPdsnipAddress())) {
                return false;
            }
            if (!Arrays.equals(_securityKey, other.getSecurityKey())) {
                return false;
            }
            if (!Objects.equals(_securityParameterIndex, other.getSecurityParameterIndex())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000OneXPcfpdsnImpl otherImpl = (Cdma2000OneXPcfpdsnImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000OneXPcfpdsn [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_cdma2000OneXPcfpdsnA11RegUpdateStats != null) {
                builder.append("_cdma2000OneXPcfpdsnA11RegUpdateStats=");
                builder.append(_cdma2000OneXPcfpdsnA11RegUpdateStats);
                builder.append(", ");
            }
            if (_cdma2000OneXPcfpdsnPcfpdsnStats != null) {
                builder.append("_cdma2000OneXPcfpdsnPcfpdsnStats=");
                builder.append(_cdma2000OneXPcfpdsnPcfpdsnStats);
                builder.append(", ");
            }
            if (_iosVersion != null) {
                builder.append("_iosVersion=");
                builder.append(_iosVersion);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_pdsNadminStatus != null) {
                builder.append("_pdsNadminStatus=");
                builder.append(_pdsNadminStatus);
                builder.append(", ");
            }
            if (_pdsnHealthStatus != null) {
                builder.append("_pdsnHealthStatus=");
                builder.append(_pdsnHealthStatus);
                builder.append(", ");
            }
            if (_pdsnNumber != null) {
                builder.append("_pdsnNumber=");
                builder.append(_pdsnNumber);
                builder.append(", ");
            }
            if (_pdsnipAddress != null) {
                builder.append("_pdsnipAddress=");
                builder.append(_pdsnipAddress);
                builder.append(", ");
            }
            if (_securityKey != null) {
                builder.append("_securityKey=");
                builder.append(Arrays.toString(_securityKey));
                builder.append(", ");
            }
            if (_securityParameterIndex != null) {
                builder.append("_securityParameterIndex=");
                builder.append(_securityParameterIndex);
                builder.append(", ");
            }
            if (_enable != null) {
                builder.append("_enable=");
                builder.append(_enable);
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
