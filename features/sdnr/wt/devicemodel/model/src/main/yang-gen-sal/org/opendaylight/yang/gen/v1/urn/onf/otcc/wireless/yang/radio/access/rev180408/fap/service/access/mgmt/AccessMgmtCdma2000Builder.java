package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000
 *
 */
public class AccessMgmtCdma2000Builder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000> {

    private java.lang.String _accessControlList;
    private AccessMgmtCdma2000LocalIpAccess _accessMgmtCdma2000LocalIpAccess;
    private List<AccessMgmtCdma2000MemberDetail> _accessMgmtCdma2000MemberDetail;
    private java.lang.Short _accessMode;
    private BigInteger _maxMemberDetailEntries;
    private java.lang.Integer _maxTotalActiveCallsAllowed;
    private BigInteger _memberDetailNumberOfEntries;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>> augmentation = Collections.emptyMap();

    public AccessMgmtCdma2000Builder() {
    }
    public AccessMgmtCdma2000Builder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000G arg) {
        this._accessMode = arg.getAccessMode();
        this._maxTotalActiveCallsAllowed = arg.getMaxTotalActiveCallsAllowed();
        this._accessControlList = arg.getAccessControlList();
        this._maxMemberDetailEntries = arg.getMaxMemberDetailEntries();
        this._memberDetailNumberOfEntries = arg.getMemberDetailNumberOfEntries();
    }

    public AccessMgmtCdma2000Builder(AccessMgmtCdma2000 base) {
        this._accessControlList = base.getAccessControlList();
        this._accessMgmtCdma2000LocalIpAccess = base.getAccessMgmtCdma2000LocalIpAccess();
        this._accessMgmtCdma2000MemberDetail = base.getAccessMgmtCdma2000MemberDetail();
        this._accessMode = base.getAccessMode();
        this._maxMemberDetailEntries = base.getMaxMemberDetailEntries();
        this._maxTotalActiveCallsAllowed = base.getMaxTotalActiveCallsAllowed();
        this._memberDetailNumberOfEntries = base.getMemberDetailNumberOfEntries();
        if (base instanceof AccessMgmtCdma2000Impl) {
            AccessMgmtCdma2000Impl impl = (AccessMgmtCdma2000Impl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000G</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000G) {
            this._accessMode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000G)arg).getAccessMode();
            this._maxTotalActiveCallsAllowed = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000G)arg).getMaxTotalActiveCallsAllowed();
            this._accessControlList = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000G)arg).getAccessControlList();
            this._maxMemberDetailEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000G)arg).getMaxMemberDetailEntries();
            this._memberDetailNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000G)arg).getMemberDetailNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000G] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAccessControlList() {
        return _accessControlList;
    }
    
    public AccessMgmtCdma2000LocalIpAccess getAccessMgmtCdma2000LocalIpAccess() {
        return _accessMgmtCdma2000LocalIpAccess;
    }
    
    public List<AccessMgmtCdma2000MemberDetail> getAccessMgmtCdma2000MemberDetail() {
        return _accessMgmtCdma2000MemberDetail;
    }
    
    public java.lang.Short getAccessMode() {
        return _accessMode;
    }
    
    public BigInteger getMaxMemberDetailEntries() {
        return _maxMemberDetailEntries;
    }
    
    public java.lang.Integer getMaxTotalActiveCallsAllowed() {
        return _maxTotalActiveCallsAllowed;
    }
    
    public BigInteger getMemberDetailNumberOfEntries() {
        return _memberDetailNumberOfEntries;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void check_accessControlListLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 1024) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..1024]].", value));
     }
    
    public AccessMgmtCdma2000Builder setAccessControlList(final java.lang.String value) {
    if (value != null) {
        check_accessControlListLength(value);
    }
        this._accessControlList = value;
        return this;
    }
    
     
    public AccessMgmtCdma2000Builder setAccessMgmtCdma2000LocalIpAccess(final AccessMgmtCdma2000LocalIpAccess value) {
        this._accessMgmtCdma2000LocalIpAccess = value;
        return this;
    }
    
     
    public AccessMgmtCdma2000Builder setAccessMgmtCdma2000MemberDetail(final List<AccessMgmtCdma2000MemberDetail> value) {
        this._accessMgmtCdma2000MemberDetail = value;
        return this;
    }
    
     
     private static void checkAccessModeRange(final short value) {
         if (value >= (short)0 && value <= (short)0) {
             return;
         }
         if (value >= (short)1 && value <= (short)1) {
             return;
         }
         if (value >= (short)3 && value <= (short)3) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..0], [1..1], [3..3]].", value));
     }
    
    public AccessMgmtCdma2000Builder setAccessMode(final java.lang.Short value) {
    if (value != null) {
        checkAccessModeRange(value);
    }
        this._accessMode = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXMEMBERDETAILENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXMEMBERDETAILENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxMemberDetailEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXMEMBERDETAILENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXMEMBERDETAILENTRIESRANGE_RANGES)));
     }
    
    public AccessMgmtCdma2000Builder setMaxMemberDetailEntries(final BigInteger value) {
    if (value != null) {
        checkMaxMemberDetailEntriesRange(value);
    }
        this._maxMemberDetailEntries = value;
        return this;
    }
    
     
     private static void checkMaxTotalActiveCallsAllowedRange(final int value) {
         if (value >= 1 && value <= 1024) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..1024]].", value));
     }
    
    public AccessMgmtCdma2000Builder setMaxTotalActiveCallsAllowed(final java.lang.Integer value) {
    if (value != null) {
        checkMaxTotalActiveCallsAllowedRange(value);
    }
        this._maxTotalActiveCallsAllowed = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMEMBERDETAILNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMEMBERDETAILNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkMemberDetailNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMEMBERDETAILNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMEMBERDETAILNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public AccessMgmtCdma2000Builder setMemberDetailNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkMemberDetailNumberOfEntriesRange(value);
    }
        this._memberDetailNumberOfEntries = value;
        return this;
    }
    
    public AccessMgmtCdma2000Builder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AccessMgmtCdma2000Builder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AccessMgmtCdma2000 build() {
        return new AccessMgmtCdma2000Impl(this);
    }

    private static final class AccessMgmtCdma2000Impl implements AccessMgmtCdma2000 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000.class;
        }

        private final java.lang.String _accessControlList;
        private final AccessMgmtCdma2000LocalIpAccess _accessMgmtCdma2000LocalIpAccess;
        private final List<AccessMgmtCdma2000MemberDetail> _accessMgmtCdma2000MemberDetail;
        private final java.lang.Short _accessMode;
        private final BigInteger _maxMemberDetailEntries;
        private final java.lang.Integer _maxTotalActiveCallsAllowed;
        private final BigInteger _memberDetailNumberOfEntries;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>> augmentation = Collections.emptyMap();

        private AccessMgmtCdma2000Impl(AccessMgmtCdma2000Builder base) {
            this._accessControlList = base.getAccessControlList();
            this._accessMgmtCdma2000LocalIpAccess = base.getAccessMgmtCdma2000LocalIpAccess();
            this._accessMgmtCdma2000MemberDetail = base.getAccessMgmtCdma2000MemberDetail();
            this._accessMode = base.getAccessMode();
            this._maxMemberDetailEntries = base.getMaxMemberDetailEntries();
            this._maxTotalActiveCallsAllowed = base.getMaxTotalActiveCallsAllowed();
            this._memberDetailNumberOfEntries = base.getMemberDetailNumberOfEntries();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getAccessControlList() {
            return _accessControlList;
        }
        
        @Override
        public AccessMgmtCdma2000LocalIpAccess getAccessMgmtCdma2000LocalIpAccess() {
            return _accessMgmtCdma2000LocalIpAccess;
        }
        
        @Override
        public List<AccessMgmtCdma2000MemberDetail> getAccessMgmtCdma2000MemberDetail() {
            return _accessMgmtCdma2000MemberDetail;
        }
        
        @Override
        public java.lang.Short getAccessMode() {
            return _accessMode;
        }
        
        @Override
        public BigInteger getMaxMemberDetailEntries() {
            return _maxMemberDetailEntries;
        }
        
        @Override
        public java.lang.Integer getMaxTotalActiveCallsAllowed() {
            return _maxTotalActiveCallsAllowed;
        }
        
        @Override
        public BigInteger getMemberDetailNumberOfEntries() {
            return _memberDetailNumberOfEntries;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_accessControlList);
            result = prime * result + Objects.hashCode(_accessMgmtCdma2000LocalIpAccess);
            result = prime * result + Objects.hashCode(_accessMgmtCdma2000MemberDetail);
            result = prime * result + Objects.hashCode(_accessMode);
            result = prime * result + Objects.hashCode(_maxMemberDetailEntries);
            result = prime * result + Objects.hashCode(_maxTotalActiveCallsAllowed);
            result = prime * result + Objects.hashCode(_memberDetailNumberOfEntries);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000 other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000)obj;
            if (!Objects.equals(_accessControlList, other.getAccessControlList())) {
                return false;
            }
            if (!Objects.equals(_accessMgmtCdma2000LocalIpAccess, other.getAccessMgmtCdma2000LocalIpAccess())) {
                return false;
            }
            if (!Objects.equals(_accessMgmtCdma2000MemberDetail, other.getAccessMgmtCdma2000MemberDetail())) {
                return false;
            }
            if (!Objects.equals(_accessMode, other.getAccessMode())) {
                return false;
            }
            if (!Objects.equals(_maxMemberDetailEntries, other.getMaxMemberDetailEntries())) {
                return false;
            }
            if (!Objects.equals(_maxTotalActiveCallsAllowed, other.getMaxTotalActiveCallsAllowed())) {
                return false;
            }
            if (!Objects.equals(_memberDetailNumberOfEntries, other.getMemberDetailNumberOfEntries())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AccessMgmtCdma2000Impl otherImpl = (AccessMgmtCdma2000Impl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AccessMgmtCdma2000 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_accessControlList != null) {
                builder.append("_accessControlList=");
                builder.append(_accessControlList);
                builder.append(", ");
            }
            if (_accessMgmtCdma2000LocalIpAccess != null) {
                builder.append("_accessMgmtCdma2000LocalIpAccess=");
                builder.append(_accessMgmtCdma2000LocalIpAccess);
                builder.append(", ");
            }
            if (_accessMgmtCdma2000MemberDetail != null) {
                builder.append("_accessMgmtCdma2000MemberDetail=");
                builder.append(_accessMgmtCdma2000MemberDetail);
                builder.append(", ");
            }
            if (_accessMode != null) {
                builder.append("_accessMode=");
                builder.append(_accessMode);
                builder.append(", ");
            }
            if (_maxMemberDetailEntries != null) {
                builder.append("_maxMemberDetailEntries=");
                builder.append(_maxMemberDetailEntries);
                builder.append(", ");
            }
            if (_maxTotalActiveCallsAllowed != null) {
                builder.append("_maxTotalActiveCallsAllowed=");
                builder.append(_maxTotalActiveCallsAllowed);
                builder.append(", ");
            }
            if (_memberDetailNumberOfEntries != null) {
                builder.append("_memberDetailNumberOfEntries=");
                builder.append(_memberDetailNumberOfEntries);
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
