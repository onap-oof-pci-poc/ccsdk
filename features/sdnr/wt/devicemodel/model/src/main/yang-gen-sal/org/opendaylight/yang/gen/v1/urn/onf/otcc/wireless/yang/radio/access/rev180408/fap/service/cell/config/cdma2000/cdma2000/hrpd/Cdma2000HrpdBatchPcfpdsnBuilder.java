package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG.BatchTableIosVersion;
import java.util.Collections;
import java.util.Arrays;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn
 *
 */
public class Cdma2000HrpdBatchPcfpdsnBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn> {

    private java.lang.String _alias;
    private IpAddress _batchTableEndIpAddress;
    private BatchTableIosVersion _batchTableIosVersion;
    private java.lang.Long _batchTableNumber;
    private java.lang.Long _batchTablePdsnAdminStatus;
    private byte[] _batchTableSecretKey;
    private java.lang.Long _batchTableSecurityParameterIndex;
    private IpAddress _batchTableStartIpAddress;
    private Cdma2000HrpdBatchPcfpdsnKey _key;
    private java.lang.String _pdsnType;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>> augmentation = Collections.emptyMap();

    public Cdma2000HrpdBatchPcfpdsnBuilder() {
    }
    public Cdma2000HrpdBatchPcfpdsnBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._batchTableNumber = arg.getBatchTableNumber();
        this._batchTableStartIpAddress = arg.getBatchTableStartIpAddress();
        this._batchTableEndIpAddress = arg.getBatchTableEndIpAddress();
        this._batchTableSecurityParameterIndex = arg.getBatchTableSecurityParameterIndex();
        this._batchTableSecretKey = arg.getBatchTableSecretKey();
        this._batchTableIosVersion = arg.getBatchTableIosVersion();
        this._batchTablePdsnAdminStatus = arg.getBatchTablePdsnAdminStatus();
        this._pdsnType = arg.getPdsnType();
    }

    public Cdma2000HrpdBatchPcfpdsnBuilder(Cdma2000HrpdBatchPcfpdsn base) {
        if (base.getKey() == null) {
            this._key = new Cdma2000HrpdBatchPcfpdsnKey(
                base.getBatchTableNumber(), 
                base.getBatchTableSecretKey(), 
                base.getBatchTableSecurityParameterIndex()
            );
            this._batchTableNumber = base.getBatchTableNumber();
            this._batchTableSecretKey = base.getBatchTableSecretKey();
            this._batchTableSecurityParameterIndex = base.getBatchTableSecurityParameterIndex();
        } else {
            this._key = base.getKey();
            this._batchTableNumber = _key.getBatchTableNumber();
            this._batchTableSecretKey = _key.getBatchTableSecretKey();
            this._batchTableSecurityParameterIndex = _key.getBatchTableSecurityParameterIndex();
        }
        this._alias = base.getAlias();
        this._batchTableEndIpAddress = base.getBatchTableEndIpAddress();
        this._batchTableIosVersion = base.getBatchTableIosVersion();
        this._batchTablePdsnAdminStatus = base.getBatchTablePdsnAdminStatus();
        this._batchTableStartIpAddress = base.getBatchTableStartIpAddress();
        this._pdsnType = base.getPdsnType();
        this._enable = base.isEnable();
        if (base instanceof Cdma2000HrpdBatchPcfpdsnImpl) {
            Cdma2000HrpdBatchPcfpdsnImpl impl = (Cdma2000HrpdBatchPcfpdsnImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG)arg).getAlias();
            this._batchTableNumber = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG)arg).getBatchTableNumber();
            this._batchTableStartIpAddress = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG)arg).getBatchTableStartIpAddress();
            this._batchTableEndIpAddress = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG)arg).getBatchTableEndIpAddress();
            this._batchTableSecurityParameterIndex = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG)arg).getBatchTableSecurityParameterIndex();
            this._batchTableSecretKey = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG)arg).getBatchTableSecretKey();
            this._batchTableIosVersion = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG)arg).getBatchTableIosVersion();
            this._batchTablePdsnAdminStatus = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG)arg).getBatchTablePdsnAdminStatus();
            this._pdsnType = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG)arg).getPdsnType();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdBatchPcfpdsnG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public IpAddress getBatchTableEndIpAddress() {
        return _batchTableEndIpAddress;
    }
    
    public BatchTableIosVersion getBatchTableIosVersion() {
        return _batchTableIosVersion;
    }
    
    public java.lang.Long getBatchTableNumber() {
        return _batchTableNumber;
    }
    
    public java.lang.Long getBatchTablePdsnAdminStatus() {
        return _batchTablePdsnAdminStatus;
    }
    
    public byte[] getBatchTableSecretKey() {
        return _batchTableSecretKey == null ? null : _batchTableSecretKey.clone();
    }
    
    public java.lang.Long getBatchTableSecurityParameterIndex() {
        return _batchTableSecurityParameterIndex;
    }
    
    public IpAddress getBatchTableStartIpAddress() {
        return _batchTableStartIpAddress;
    }
    
    public Cdma2000HrpdBatchPcfpdsnKey getKey() {
        return _key;
    }
    
    public java.lang.String getPdsnType() {
        return _pdsnType;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public Cdma2000HrpdBatchPcfpdsnBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
    public Cdma2000HrpdBatchPcfpdsnBuilder setBatchTableEndIpAddress(final IpAddress value) {
        this._batchTableEndIpAddress = value;
        return this;
    }
    
     
    public Cdma2000HrpdBatchPcfpdsnBuilder setBatchTableIosVersion(final BatchTableIosVersion value) {
        this._batchTableIosVersion = value;
        return this;
    }
    
     
    public Cdma2000HrpdBatchPcfpdsnBuilder setBatchTableNumber(final java.lang.Long value) {
        this._batchTableNumber = value;
        return this;
    }
    
     
    public Cdma2000HrpdBatchPcfpdsnBuilder setBatchTablePdsnAdminStatus(final java.lang.Long value) {
        this._batchTablePdsnAdminStatus = value;
        return this;
    }
    
     
     private static void check_batchTableSecretKeyLength(final byte[] value) {
         final int length = value.length;
         if (length >= 0 && length <= 16) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..16]].", java.util.Arrays.toString(value)));
     }
    
    public Cdma2000HrpdBatchPcfpdsnBuilder setBatchTableSecretKey(final byte[] value) {
    if (value != null) {
        check_batchTableSecretKeyLength(value);
    }
        this._batchTableSecretKey = value;
        return this;
    }
    
     
     private static void checkBatchTableSecurityParameterIndexRange(final long value) {
         if (value >= 0L && value <= 0L) {
             return;
         }
         if (value >= 256L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..0], [256..4294967295]].", value));
     }
    
    public Cdma2000HrpdBatchPcfpdsnBuilder setBatchTableSecurityParameterIndex(final java.lang.Long value) {
    if (value != null) {
        checkBatchTableSecurityParameterIndexRange(value);
    }
        this._batchTableSecurityParameterIndex = value;
        return this;
    }
    
     
    public Cdma2000HrpdBatchPcfpdsnBuilder setBatchTableStartIpAddress(final IpAddress value) {
        this._batchTableStartIpAddress = value;
        return this;
    }
    
     
    public Cdma2000HrpdBatchPcfpdsnBuilder setKey(final Cdma2000HrpdBatchPcfpdsnKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void check_pdsnTypeLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 32) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..32]].", value));
     }
    
    public Cdma2000HrpdBatchPcfpdsnBuilder setPdsnType(final java.lang.String value) {
    if (value != null) {
        check_pdsnTypeLength(value);
    }
        this._pdsnType = value;
        return this;
    }
    
     
    public Cdma2000HrpdBatchPcfpdsnBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public Cdma2000HrpdBatchPcfpdsnBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public Cdma2000HrpdBatchPcfpdsnBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cdma2000HrpdBatchPcfpdsn build() {
        return new Cdma2000HrpdBatchPcfpdsnImpl(this);
    }

    private static final class Cdma2000HrpdBatchPcfpdsnImpl implements Cdma2000HrpdBatchPcfpdsn {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn.class;
        }

        private final java.lang.String _alias;
        private final IpAddress _batchTableEndIpAddress;
        private final BatchTableIosVersion _batchTableIosVersion;
        private final java.lang.Long _batchTableNumber;
        private final java.lang.Long _batchTablePdsnAdminStatus;
        private final byte[] _batchTableSecretKey;
        private final java.lang.Long _batchTableSecurityParameterIndex;
        private final IpAddress _batchTableStartIpAddress;
        private final Cdma2000HrpdBatchPcfpdsnKey _key;
        private final java.lang.String _pdsnType;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>> augmentation = Collections.emptyMap();

        private Cdma2000HrpdBatchPcfpdsnImpl(Cdma2000HrpdBatchPcfpdsnBuilder base) {
            if (base.getKey() == null) {
                this._key = new Cdma2000HrpdBatchPcfpdsnKey(
                    base.getBatchTableNumber(), 
                    base.getBatchTableSecretKey(), 
                    base.getBatchTableSecurityParameterIndex()
                );
                this._batchTableNumber = base.getBatchTableNumber();
                this._batchTableSecretKey = base.getBatchTableSecretKey();
                this._batchTableSecurityParameterIndex = base.getBatchTableSecurityParameterIndex();
            } else {
                this._key = base.getKey();
                this._batchTableNumber = _key.getBatchTableNumber();
                this._batchTableSecretKey = _key.getBatchTableSecretKey();
                this._batchTableSecurityParameterIndex = _key.getBatchTableSecurityParameterIndex();
            }
            this._alias = base.getAlias();
            this._batchTableEndIpAddress = base.getBatchTableEndIpAddress();
            this._batchTableIosVersion = base.getBatchTableIosVersion();
            this._batchTablePdsnAdminStatus = base.getBatchTablePdsnAdminStatus();
            this._batchTableStartIpAddress = base.getBatchTableStartIpAddress();
            this._pdsnType = base.getPdsnType();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>>singletonMap(e.getKey(), e.getValue());
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
        public IpAddress getBatchTableEndIpAddress() {
            return _batchTableEndIpAddress;
        }
        
        @Override
        public BatchTableIosVersion getBatchTableIosVersion() {
            return _batchTableIosVersion;
        }
        
        @Override
        public java.lang.Long getBatchTableNumber() {
            return _batchTableNumber;
        }
        
        @Override
        public java.lang.Long getBatchTablePdsnAdminStatus() {
            return _batchTablePdsnAdminStatus;
        }
        
        @Override
        public byte[] getBatchTableSecretKey() {
            return _batchTableSecretKey == null ? null : _batchTableSecretKey.clone();
        }
        
        @Override
        public java.lang.Long getBatchTableSecurityParameterIndex() {
            return _batchTableSecurityParameterIndex;
        }
        
        @Override
        public IpAddress getBatchTableStartIpAddress() {
            return _batchTableStartIpAddress;
        }
        
        @Override
        public Cdma2000HrpdBatchPcfpdsnKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getPdsnType() {
            return _pdsnType;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_batchTableEndIpAddress);
            result = prime * result + Objects.hashCode(_batchTableIosVersion);
            result = prime * result + Objects.hashCode(_batchTableNumber);
            result = prime * result + Objects.hashCode(_batchTablePdsnAdminStatus);
            result = prime * result + Arrays.hashCode(_batchTableSecretKey);
            result = prime * result + Objects.hashCode(_batchTableSecurityParameterIndex);
            result = prime * result + Objects.hashCode(_batchTableStartIpAddress);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_pdsnType);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_batchTableEndIpAddress, other.getBatchTableEndIpAddress())) {
                return false;
            }
            if (!Objects.equals(_batchTableIosVersion, other.getBatchTableIosVersion())) {
                return false;
            }
            if (!Objects.equals(_batchTableNumber, other.getBatchTableNumber())) {
                return false;
            }
            if (!Objects.equals(_batchTablePdsnAdminStatus, other.getBatchTablePdsnAdminStatus())) {
                return false;
            }
            if (!Arrays.equals(_batchTableSecretKey, other.getBatchTableSecretKey())) {
                return false;
            }
            if (!Objects.equals(_batchTableSecurityParameterIndex, other.getBatchTableSecurityParameterIndex())) {
                return false;
            }
            if (!Objects.equals(_batchTableStartIpAddress, other.getBatchTableStartIpAddress())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_pdsnType, other.getPdsnType())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Cdma2000HrpdBatchPcfpdsnImpl otherImpl = (Cdma2000HrpdBatchPcfpdsnImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cdma2000HrpdBatchPcfpdsn [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_batchTableEndIpAddress != null) {
                builder.append("_batchTableEndIpAddress=");
                builder.append(_batchTableEndIpAddress);
                builder.append(", ");
            }
            if (_batchTableIosVersion != null) {
                builder.append("_batchTableIosVersion=");
                builder.append(_batchTableIosVersion);
                builder.append(", ");
            }
            if (_batchTableNumber != null) {
                builder.append("_batchTableNumber=");
                builder.append(_batchTableNumber);
                builder.append(", ");
            }
            if (_batchTablePdsnAdminStatus != null) {
                builder.append("_batchTablePdsnAdminStatus=");
                builder.append(_batchTablePdsnAdminStatus);
                builder.append(", ");
            }
            if (_batchTableSecretKey != null) {
                builder.append("_batchTableSecretKey=");
                builder.append(Arrays.toString(_batchTableSecretKey));
                builder.append(", ");
            }
            if (_batchTableSecurityParameterIndex != null) {
                builder.append("_batchTableSecurityParameterIndex=");
                builder.append(_batchTableSecurityParameterIndex);
                builder.append(", ");
            }
            if (_batchTableStartIpAddress != null) {
                builder.append("_batchTableStartIpAddress=");
                builder.append(_batchTableStartIpAddress);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_pdsnType != null) {
                builder.append("_pdsnType=");
                builder.append(_pdsnType);
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
