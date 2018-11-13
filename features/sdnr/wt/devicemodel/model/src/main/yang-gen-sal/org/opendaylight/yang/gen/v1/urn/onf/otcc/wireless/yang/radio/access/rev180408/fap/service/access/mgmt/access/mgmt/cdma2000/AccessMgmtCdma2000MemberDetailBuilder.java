package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail
 *
 */
public class AccessMgmtCdma2000MemberDetailBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail> {

    private java.lang.String _alias;
    private java.lang.Long _hrpdIdentifierType;
    private java.lang.String _hrpdIdentifierValue;
    private java.lang.String _imsi;
    private AccessMgmtCdma2000MemberDetailKey _key;
    private DateAndTime _membershipExpires;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>> augmentation = Collections.emptyMap();

    public AccessMgmtCdma2000MemberDetailBuilder() {
    }
    public AccessMgmtCdma2000MemberDetailBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000MemberDetailG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._imsi = arg.getImsi();
        this._hrpdIdentifierType = arg.getHrpdIdentifierType();
        this._hrpdIdentifierValue = arg.getHrpdIdentifierValue();
        this._membershipExpires = arg.getMembershipExpires();
    }

    public AccessMgmtCdma2000MemberDetailBuilder(AccessMgmtCdma2000MemberDetail base) {
        if (base.getKey() == null) {
            this._key = new AccessMgmtCdma2000MemberDetailKey(
                base.getImsi()
            );
            this._imsi = base.getImsi();
        } else {
            this._key = base.getKey();
            this._imsi = _key.getImsi();
        }
        this._alias = base.getAlias();
        this._hrpdIdentifierType = base.getHrpdIdentifierType();
        this._hrpdIdentifierValue = base.getHrpdIdentifierValue();
        this._membershipExpires = base.getMembershipExpires();
        this._enable = base.isEnable();
        if (base instanceof AccessMgmtCdma2000MemberDetailImpl) {
            AccessMgmtCdma2000MemberDetailImpl impl = (AccessMgmtCdma2000MemberDetailImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000MemberDetailG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000MemberDetailG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000MemberDetailG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000MemberDetailG)arg).getAlias();
            this._imsi = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000MemberDetailG)arg).getImsi();
            this._hrpdIdentifierType = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000MemberDetailG)arg).getHrpdIdentifierType();
            this._hrpdIdentifierValue = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000MemberDetailG)arg).getHrpdIdentifierValue();
            this._membershipExpires = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000MemberDetailG)arg).getMembershipExpires();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000MemberDetailG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public java.lang.Long getHrpdIdentifierType() {
        return _hrpdIdentifierType;
    }
    
    public java.lang.String getHrpdIdentifierValue() {
        return _hrpdIdentifierValue;
    }
    
    public java.lang.String getImsi() {
        return _imsi;
    }
    
    public AccessMgmtCdma2000MemberDetailKey getKey() {
        return _key;
    }
    
    public DateAndTime getMembershipExpires() {
        return _membershipExpires;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public AccessMgmtCdma2000MemberDetailBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
    public AccessMgmtCdma2000MemberDetailBuilder setHrpdIdentifierType(final java.lang.Long value) {
        this._hrpdIdentifierType = value;
        return this;
    }
    
     
     private static void check_hrpdIdentifierValueLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 128) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..128]].", value));
     }
    
    public AccessMgmtCdma2000MemberDetailBuilder setHrpdIdentifierValue(final java.lang.String value) {
    if (value != null) {
        check_hrpdIdentifierValueLength(value);
    }
        this._hrpdIdentifierValue = value;
        return this;
    }
    
     
     private static void check_imsiLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..15]].", value));
     }
    
    public AccessMgmtCdma2000MemberDetailBuilder setImsi(final java.lang.String value) {
    if (value != null) {
        check_imsiLength(value);
    }
        this._imsi = value;
        return this;
    }
    
     
    public AccessMgmtCdma2000MemberDetailBuilder setKey(final AccessMgmtCdma2000MemberDetailKey value) {
        this._key = value;
        return this;
    }
    
     
    public AccessMgmtCdma2000MemberDetailBuilder setMembershipExpires(final DateAndTime value) {
        this._membershipExpires = value;
        return this;
    }
    
     
    public AccessMgmtCdma2000MemberDetailBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public AccessMgmtCdma2000MemberDetailBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AccessMgmtCdma2000MemberDetailBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AccessMgmtCdma2000MemberDetail build() {
        return new AccessMgmtCdma2000MemberDetailImpl(this);
    }

    private static final class AccessMgmtCdma2000MemberDetailImpl implements AccessMgmtCdma2000MemberDetail {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail.class;
        }

        private final java.lang.String _alias;
        private final java.lang.Long _hrpdIdentifierType;
        private final java.lang.String _hrpdIdentifierValue;
        private final java.lang.String _imsi;
        private final AccessMgmtCdma2000MemberDetailKey _key;
        private final DateAndTime _membershipExpires;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>> augmentation = Collections.emptyMap();

        private AccessMgmtCdma2000MemberDetailImpl(AccessMgmtCdma2000MemberDetailBuilder base) {
            if (base.getKey() == null) {
                this._key = new AccessMgmtCdma2000MemberDetailKey(
                    base.getImsi()
                );
                this._imsi = base.getImsi();
            } else {
                this._key = base.getKey();
                this._imsi = _key.getImsi();
            }
            this._alias = base.getAlias();
            this._hrpdIdentifierType = base.getHrpdIdentifierType();
            this._hrpdIdentifierValue = base.getHrpdIdentifierValue();
            this._membershipExpires = base.getMembershipExpires();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.Long getHrpdIdentifierType() {
            return _hrpdIdentifierType;
        }
        
        @Override
        public java.lang.String getHrpdIdentifierValue() {
            return _hrpdIdentifierValue;
        }
        
        @Override
        public java.lang.String getImsi() {
            return _imsi;
        }
        
        @Override
        public AccessMgmtCdma2000MemberDetailKey getKey() {
            return _key;
        }
        
        @Override
        public DateAndTime getMembershipExpires() {
            return _membershipExpires;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_hrpdIdentifierType);
            result = prime * result + Objects.hashCode(_hrpdIdentifierValue);
            result = prime * result + Objects.hashCode(_imsi);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_membershipExpires);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_hrpdIdentifierType, other.getHrpdIdentifierType())) {
                return false;
            }
            if (!Objects.equals(_hrpdIdentifierValue, other.getHrpdIdentifierValue())) {
                return false;
            }
            if (!Objects.equals(_imsi, other.getImsi())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_membershipExpires, other.getMembershipExpires())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AccessMgmtCdma2000MemberDetailImpl otherImpl = (AccessMgmtCdma2000MemberDetailImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AccessMgmtCdma2000MemberDetail [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_hrpdIdentifierType != null) {
                builder.append("_hrpdIdentifierType=");
                builder.append(_hrpdIdentifierType);
                builder.append(", ");
            }
            if (_hrpdIdentifierValue != null) {
                builder.append("_hrpdIdentifierValue=");
                builder.append(_hrpdIdentifierValue);
                builder.append(", ");
            }
            if (_imsi != null) {
                builder.append("_imsi=");
                builder.append(_imsi);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_membershipExpires != null) {
                builder.append("_membershipExpires=");
                builder.append(_membershipExpires);
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
