package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail
 *
 */
public class AccessMgmtUmtsMemberDetailBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail> {

    private java.lang.String _alias;
    private java.lang.String _imsi;
    private AccessMgmtUmtsMemberDetailKey _key;
    private DateAndTime _membershipExpires;
    private java.lang.String _msisdn;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>> augmentation = Collections.emptyMap();

    public AccessMgmtUmtsMemberDetailBuilder() {
    }
    public AccessMgmtUmtsMemberDetailBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsMemberDetailG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._imsi = arg.getImsi();
        this._msisdn = arg.getMsisdn();
        this._membershipExpires = arg.getMembershipExpires();
    }

    public AccessMgmtUmtsMemberDetailBuilder(AccessMgmtUmtsMemberDetail base) {
        if (base.getKey() == null) {
            this._key = new AccessMgmtUmtsMemberDetailKey(
                base.getImsi()
            );
            this._imsi = base.getImsi();
        } else {
            this._key = base.getKey();
            this._imsi = _key.getImsi();
        }
        this._alias = base.getAlias();
        this._membershipExpires = base.getMembershipExpires();
        this._msisdn = base.getMsisdn();
        this._enable = base.isEnable();
        if (base instanceof AccessMgmtUmtsMemberDetailImpl) {
            AccessMgmtUmtsMemberDetailImpl impl = (AccessMgmtUmtsMemberDetailImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsMemberDetailG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsMemberDetailG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsMemberDetailG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsMemberDetailG)arg).getAlias();
            this._imsi = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsMemberDetailG)arg).getImsi();
            this._msisdn = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsMemberDetailG)arg).getMsisdn();
            this._membershipExpires = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsMemberDetailG)arg).getMembershipExpires();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsMemberDetailG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public java.lang.String getImsi() {
        return _imsi;
    }
    
    public AccessMgmtUmtsMemberDetailKey getKey() {
        return _key;
    }
    
    public DateAndTime getMembershipExpires() {
        return _membershipExpires;
    }
    
    public java.lang.String getMsisdn() {
        return _msisdn;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public AccessMgmtUmtsMemberDetailBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
     private static void check_imsiLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..15]].", value));
     }
    
    public AccessMgmtUmtsMemberDetailBuilder setImsi(final java.lang.String value) {
    if (value != null) {
        check_imsiLength(value);
    }
        this._imsi = value;
        return this;
    }
    
     
    public AccessMgmtUmtsMemberDetailBuilder setKey(final AccessMgmtUmtsMemberDetailKey value) {
        this._key = value;
        return this;
    }
    
     
    public AccessMgmtUmtsMemberDetailBuilder setMembershipExpires(final DateAndTime value) {
        this._membershipExpires = value;
        return this;
    }
    
     
     private static void check_msisdnLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 15) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..15]].", value));
     }
    
    public AccessMgmtUmtsMemberDetailBuilder setMsisdn(final java.lang.String value) {
    if (value != null) {
        check_msisdnLength(value);
    }
        this._msisdn = value;
        return this;
    }
    
     
    public AccessMgmtUmtsMemberDetailBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public AccessMgmtUmtsMemberDetailBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AccessMgmtUmtsMemberDetailBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AccessMgmtUmtsMemberDetail build() {
        return new AccessMgmtUmtsMemberDetailImpl(this);
    }

    private static final class AccessMgmtUmtsMemberDetailImpl implements AccessMgmtUmtsMemberDetail {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail.class;
        }

        private final java.lang.String _alias;
        private final java.lang.String _imsi;
        private final AccessMgmtUmtsMemberDetailKey _key;
        private final DateAndTime _membershipExpires;
        private final java.lang.String _msisdn;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>> augmentation = Collections.emptyMap();

        private AccessMgmtUmtsMemberDetailImpl(AccessMgmtUmtsMemberDetailBuilder base) {
            if (base.getKey() == null) {
                this._key = new AccessMgmtUmtsMemberDetailKey(
                    base.getImsi()
                );
                this._imsi = base.getImsi();
            } else {
                this._key = base.getKey();
                this._imsi = _key.getImsi();
            }
            this._alias = base.getAlias();
            this._membershipExpires = base.getMembershipExpires();
            this._msisdn = base.getMsisdn();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.String getImsi() {
            return _imsi;
        }
        
        @Override
        public AccessMgmtUmtsMemberDetailKey getKey() {
            return _key;
        }
        
        @Override
        public DateAndTime getMembershipExpires() {
            return _membershipExpires;
        }
        
        @Override
        public java.lang.String getMsisdn() {
            return _msisdn;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_imsi);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_membershipExpires);
            result = prime * result + Objects.hashCode(_msisdn);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
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
            if (!Objects.equals(_msisdn, other.getMsisdn())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AccessMgmtUmtsMemberDetailImpl otherImpl = (AccessMgmtUmtsMemberDetailImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AccessMgmtUmtsMemberDetail [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
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
            if (_msisdn != null) {
                builder.append("_msisdn=");
                builder.append(_msisdn);
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
