package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsLocalIpAccess;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG.AccessMode;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG.NonCsgueAccessDecision;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts
 *
 */
public class AccessMgmtUmtsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts> {

    private List<java.lang.String> _accessControlList;
    private AccessMgmtUmtsLocalIpAccess _accessMgmtUmtsLocalIpAccess;
    private List<AccessMgmtUmtsMemberDetail> _accessMgmtUmtsMemberDetail;
    private AccessMode _accessMode;
    private java.lang.Long _csgid;
    private java.lang.String _hnbName;
    private java.lang.Long _maxCsgMembers;
    private BigInteger _maxMemberDetailEntries;
    private java.lang.Long _maxNonCsgMembers;
    private java.lang.Short _maxResourceNonCsgMembers;
    private java.lang.Long _maxUEsServed;
    private BigInteger _memberDetailNumberOfEntries;
    private NonCsgueAccessDecision _nonCsgueAccessDecision;
    private java.lang.Boolean _csgMembershipDeterminedLocally;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>> augmentation = Collections.emptyMap();

    public AccessMgmtUmtsBuilder() {
    }
    public AccessMgmtUmtsBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG arg) {
        this._accessMode = arg.getAccessMode();
        this._nonCsgueAccessDecision = arg.getNonCsgueAccessDecision();
        this._csgMembershipDeterminedLocally = arg.isCsgMembershipDeterminedLocally();
        this._maxUEsServed = arg.getMaxUEsServed();
        this._maxCsgMembers = arg.getMaxCsgMembers();
        this._maxNonCsgMembers = arg.getMaxNonCsgMembers();
        this._maxResourceNonCsgMembers = arg.getMaxResourceNonCsgMembers();
        this._hnbName = arg.getHnbName();
        this._csgid = arg.getCsgid();
        this._accessControlList = arg.getAccessControlList();
        this._maxMemberDetailEntries = arg.getMaxMemberDetailEntries();
        this._memberDetailNumberOfEntries = arg.getMemberDetailNumberOfEntries();
    }

    public AccessMgmtUmtsBuilder(AccessMgmtUmts base) {
        this._accessControlList = base.getAccessControlList();
        this._accessMgmtUmtsLocalIpAccess = base.getAccessMgmtUmtsLocalIpAccess();
        this._accessMgmtUmtsMemberDetail = base.getAccessMgmtUmtsMemberDetail();
        this._accessMode = base.getAccessMode();
        this._csgid = base.getCsgid();
        this._hnbName = base.getHnbName();
        this._maxCsgMembers = base.getMaxCsgMembers();
        this._maxMemberDetailEntries = base.getMaxMemberDetailEntries();
        this._maxNonCsgMembers = base.getMaxNonCsgMembers();
        this._maxResourceNonCsgMembers = base.getMaxResourceNonCsgMembers();
        this._maxUEsServed = base.getMaxUEsServed();
        this._memberDetailNumberOfEntries = base.getMemberDetailNumberOfEntries();
        this._nonCsgueAccessDecision = base.getNonCsgueAccessDecision();
        this._csgMembershipDeterminedLocally = base.isCsgMembershipDeterminedLocally();
        if (base instanceof AccessMgmtUmtsImpl) {
            AccessMgmtUmtsImpl impl = (AccessMgmtUmtsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG) {
            this._accessMode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG)arg).getAccessMode();
            this._nonCsgueAccessDecision = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG)arg).getNonCsgueAccessDecision();
            this._csgMembershipDeterminedLocally = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG)arg).isCsgMembershipDeterminedLocally();
            this._maxUEsServed = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG)arg).getMaxUEsServed();
            this._maxCsgMembers = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG)arg).getMaxCsgMembers();
            this._maxNonCsgMembers = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG)arg).getMaxNonCsgMembers();
            this._maxResourceNonCsgMembers = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG)arg).getMaxResourceNonCsgMembers();
            this._hnbName = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG)arg).getHnbName();
            this._csgid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG)arg).getCsgid();
            this._accessControlList = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG)arg).getAccessControlList();
            this._maxMemberDetailEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG)arg).getMaxMemberDetailEntries();
            this._memberDetailNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG)arg).getMemberDetailNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.String> getAccessControlList() {
        return _accessControlList;
    }
    
    public AccessMgmtUmtsLocalIpAccess getAccessMgmtUmtsLocalIpAccess() {
        return _accessMgmtUmtsLocalIpAccess;
    }
    
    public List<AccessMgmtUmtsMemberDetail> getAccessMgmtUmtsMemberDetail() {
        return _accessMgmtUmtsMemberDetail;
    }
    
    public AccessMode getAccessMode() {
        return _accessMode;
    }
    
    public java.lang.Long getCsgid() {
        return _csgid;
    }
    
    public java.lang.String getHnbName() {
        return _hnbName;
    }
    
    public java.lang.Long getMaxCsgMembers() {
        return _maxCsgMembers;
    }
    
    public BigInteger getMaxMemberDetailEntries() {
        return _maxMemberDetailEntries;
    }
    
    public java.lang.Long getMaxNonCsgMembers() {
        return _maxNonCsgMembers;
    }
    
    public java.lang.Short getMaxResourceNonCsgMembers() {
        return _maxResourceNonCsgMembers;
    }
    
    public java.lang.Long getMaxUEsServed() {
        return _maxUEsServed;
    }
    
    public BigInteger getMemberDetailNumberOfEntries() {
        return _memberDetailNumberOfEntries;
    }
    
    public NonCsgueAccessDecision getNonCsgueAccessDecision() {
        return _nonCsgueAccessDecision;
    }
    
    public java.lang.Boolean isCsgMembershipDeterminedLocally() {
        return _csgMembershipDeterminedLocally;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AccessMgmtUmtsBuilder setAccessControlList(final List<java.lang.String> value) {
        this._accessControlList = value;
        return this;
    }
    
     
    public AccessMgmtUmtsBuilder setAccessMgmtUmtsLocalIpAccess(final AccessMgmtUmtsLocalIpAccess value) {
        this._accessMgmtUmtsLocalIpAccess = value;
        return this;
    }
    
     
    public AccessMgmtUmtsBuilder setAccessMgmtUmtsMemberDetail(final List<AccessMgmtUmtsMemberDetail> value) {
        this._accessMgmtUmtsMemberDetail = value;
        return this;
    }
    
     
    public AccessMgmtUmtsBuilder setAccessMode(final AccessMode value) {
        this._accessMode = value;
        return this;
    }
    
     
     private static void checkCsgidRange(final long value) {
         if (value >= 0L && value <= 134217727L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..134217727]].", value));
     }
    
    public AccessMgmtUmtsBuilder setCsgid(final java.lang.Long value) {
    if (value != null) {
        checkCsgidRange(value);
    }
        this._csgid = value;
        return this;
    }
    
     
     private static void check_hnbNameLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 48) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..48]].", value));
     }
    
    public AccessMgmtUmtsBuilder setHnbName(final java.lang.String value) {
    if (value != null) {
        check_hnbNameLength(value);
    }
        this._hnbName = value;
        return this;
    }
    
     
    public AccessMgmtUmtsBuilder setMaxCsgMembers(final java.lang.Long value) {
        this._maxCsgMembers = value;
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
    
    public AccessMgmtUmtsBuilder setMaxMemberDetailEntries(final BigInteger value) {
    if (value != null) {
        checkMaxMemberDetailEntriesRange(value);
    }
        this._maxMemberDetailEntries = value;
        return this;
    }
    
     
    public AccessMgmtUmtsBuilder setMaxNonCsgMembers(final java.lang.Long value) {
        this._maxNonCsgMembers = value;
        return this;
    }
    
     
     private static void checkMaxResourceNonCsgMembersRange(final short value) {
         if (value >= (short)0 && value <= (short)100) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..100]].", value));
     }
    
    public AccessMgmtUmtsBuilder setMaxResourceNonCsgMembers(final java.lang.Short value) {
    if (value != null) {
        checkMaxResourceNonCsgMembersRange(value);
    }
        this._maxResourceNonCsgMembers = value;
        return this;
    }
    
     
    public AccessMgmtUmtsBuilder setMaxUEsServed(final java.lang.Long value) {
        this._maxUEsServed = value;
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
    
    public AccessMgmtUmtsBuilder setMemberDetailNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkMemberDetailNumberOfEntriesRange(value);
    }
        this._memberDetailNumberOfEntries = value;
        return this;
    }
    
     
    public AccessMgmtUmtsBuilder setNonCsgueAccessDecision(final NonCsgueAccessDecision value) {
        this._nonCsgueAccessDecision = value;
        return this;
    }
    
     
    public AccessMgmtUmtsBuilder setCsgMembershipDeterminedLocally(final java.lang.Boolean value) {
        this._csgMembershipDeterminedLocally = value;
        return this;
    }
    
    public AccessMgmtUmtsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AccessMgmtUmtsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AccessMgmtUmts build() {
        return new AccessMgmtUmtsImpl(this);
    }

    private static final class AccessMgmtUmtsImpl implements AccessMgmtUmts {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts.class;
        }

        private final List<java.lang.String> _accessControlList;
        private final AccessMgmtUmtsLocalIpAccess _accessMgmtUmtsLocalIpAccess;
        private final List<AccessMgmtUmtsMemberDetail> _accessMgmtUmtsMemberDetail;
        private final AccessMode _accessMode;
        private final java.lang.Long _csgid;
        private final java.lang.String _hnbName;
        private final java.lang.Long _maxCsgMembers;
        private final BigInteger _maxMemberDetailEntries;
        private final java.lang.Long _maxNonCsgMembers;
        private final java.lang.Short _maxResourceNonCsgMembers;
        private final java.lang.Long _maxUEsServed;
        private final BigInteger _memberDetailNumberOfEntries;
        private final NonCsgueAccessDecision _nonCsgueAccessDecision;
        private final java.lang.Boolean _csgMembershipDeterminedLocally;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>> augmentation = Collections.emptyMap();

        private AccessMgmtUmtsImpl(AccessMgmtUmtsBuilder base) {
            this._accessControlList = base.getAccessControlList();
            this._accessMgmtUmtsLocalIpAccess = base.getAccessMgmtUmtsLocalIpAccess();
            this._accessMgmtUmtsMemberDetail = base.getAccessMgmtUmtsMemberDetail();
            this._accessMode = base.getAccessMode();
            this._csgid = base.getCsgid();
            this._hnbName = base.getHnbName();
            this._maxCsgMembers = base.getMaxCsgMembers();
            this._maxMemberDetailEntries = base.getMaxMemberDetailEntries();
            this._maxNonCsgMembers = base.getMaxNonCsgMembers();
            this._maxResourceNonCsgMembers = base.getMaxResourceNonCsgMembers();
            this._maxUEsServed = base.getMaxUEsServed();
            this._memberDetailNumberOfEntries = base.getMemberDetailNumberOfEntries();
            this._nonCsgueAccessDecision = base.getNonCsgueAccessDecision();
            this._csgMembershipDeterminedLocally = base.isCsgMembershipDeterminedLocally();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.String> getAccessControlList() {
            return _accessControlList;
        }
        
        @Override
        public AccessMgmtUmtsLocalIpAccess getAccessMgmtUmtsLocalIpAccess() {
            return _accessMgmtUmtsLocalIpAccess;
        }
        
        @Override
        public List<AccessMgmtUmtsMemberDetail> getAccessMgmtUmtsMemberDetail() {
            return _accessMgmtUmtsMemberDetail;
        }
        
        @Override
        public AccessMode getAccessMode() {
            return _accessMode;
        }
        
        @Override
        public java.lang.Long getCsgid() {
            return _csgid;
        }
        
        @Override
        public java.lang.String getHnbName() {
            return _hnbName;
        }
        
        @Override
        public java.lang.Long getMaxCsgMembers() {
            return _maxCsgMembers;
        }
        
        @Override
        public BigInteger getMaxMemberDetailEntries() {
            return _maxMemberDetailEntries;
        }
        
        @Override
        public java.lang.Long getMaxNonCsgMembers() {
            return _maxNonCsgMembers;
        }
        
        @Override
        public java.lang.Short getMaxResourceNonCsgMembers() {
            return _maxResourceNonCsgMembers;
        }
        
        @Override
        public java.lang.Long getMaxUEsServed() {
            return _maxUEsServed;
        }
        
        @Override
        public BigInteger getMemberDetailNumberOfEntries() {
            return _memberDetailNumberOfEntries;
        }
        
        @Override
        public NonCsgueAccessDecision getNonCsgueAccessDecision() {
            return _nonCsgueAccessDecision;
        }
        
        @Override
        public java.lang.Boolean isCsgMembershipDeterminedLocally() {
            return _csgMembershipDeterminedLocally;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_accessMgmtUmtsLocalIpAccess);
            result = prime * result + Objects.hashCode(_accessMgmtUmtsMemberDetail);
            result = prime * result + Objects.hashCode(_accessMode);
            result = prime * result + Objects.hashCode(_csgid);
            result = prime * result + Objects.hashCode(_hnbName);
            result = prime * result + Objects.hashCode(_maxCsgMembers);
            result = prime * result + Objects.hashCode(_maxMemberDetailEntries);
            result = prime * result + Objects.hashCode(_maxNonCsgMembers);
            result = prime * result + Objects.hashCode(_maxResourceNonCsgMembers);
            result = prime * result + Objects.hashCode(_maxUEsServed);
            result = prime * result + Objects.hashCode(_memberDetailNumberOfEntries);
            result = prime * result + Objects.hashCode(_nonCsgueAccessDecision);
            result = prime * result + Objects.hashCode(_csgMembershipDeterminedLocally);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts)obj;
            if (!Objects.equals(_accessControlList, other.getAccessControlList())) {
                return false;
            }
            if (!Objects.equals(_accessMgmtUmtsLocalIpAccess, other.getAccessMgmtUmtsLocalIpAccess())) {
                return false;
            }
            if (!Objects.equals(_accessMgmtUmtsMemberDetail, other.getAccessMgmtUmtsMemberDetail())) {
                return false;
            }
            if (!Objects.equals(_accessMode, other.getAccessMode())) {
                return false;
            }
            if (!Objects.equals(_csgid, other.getCsgid())) {
                return false;
            }
            if (!Objects.equals(_hnbName, other.getHnbName())) {
                return false;
            }
            if (!Objects.equals(_maxCsgMembers, other.getMaxCsgMembers())) {
                return false;
            }
            if (!Objects.equals(_maxMemberDetailEntries, other.getMaxMemberDetailEntries())) {
                return false;
            }
            if (!Objects.equals(_maxNonCsgMembers, other.getMaxNonCsgMembers())) {
                return false;
            }
            if (!Objects.equals(_maxResourceNonCsgMembers, other.getMaxResourceNonCsgMembers())) {
                return false;
            }
            if (!Objects.equals(_maxUEsServed, other.getMaxUEsServed())) {
                return false;
            }
            if (!Objects.equals(_memberDetailNumberOfEntries, other.getMemberDetailNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_nonCsgueAccessDecision, other.getNonCsgueAccessDecision())) {
                return false;
            }
            if (!Objects.equals(_csgMembershipDeterminedLocally, other.isCsgMembershipDeterminedLocally())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AccessMgmtUmtsImpl otherImpl = (AccessMgmtUmtsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AccessMgmtUmts [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_accessControlList != null) {
                builder.append("_accessControlList=");
                builder.append(_accessControlList);
                builder.append(", ");
            }
            if (_accessMgmtUmtsLocalIpAccess != null) {
                builder.append("_accessMgmtUmtsLocalIpAccess=");
                builder.append(_accessMgmtUmtsLocalIpAccess);
                builder.append(", ");
            }
            if (_accessMgmtUmtsMemberDetail != null) {
                builder.append("_accessMgmtUmtsMemberDetail=");
                builder.append(_accessMgmtUmtsMemberDetail);
                builder.append(", ");
            }
            if (_accessMode != null) {
                builder.append("_accessMode=");
                builder.append(_accessMode);
                builder.append(", ");
            }
            if (_csgid != null) {
                builder.append("_csgid=");
                builder.append(_csgid);
                builder.append(", ");
            }
            if (_hnbName != null) {
                builder.append("_hnbName=");
                builder.append(_hnbName);
                builder.append(", ");
            }
            if (_maxCsgMembers != null) {
                builder.append("_maxCsgMembers=");
                builder.append(_maxCsgMembers);
                builder.append(", ");
            }
            if (_maxMemberDetailEntries != null) {
                builder.append("_maxMemberDetailEntries=");
                builder.append(_maxMemberDetailEntries);
                builder.append(", ");
            }
            if (_maxNonCsgMembers != null) {
                builder.append("_maxNonCsgMembers=");
                builder.append(_maxNonCsgMembers);
                builder.append(", ");
            }
            if (_maxResourceNonCsgMembers != null) {
                builder.append("_maxResourceNonCsgMembers=");
                builder.append(_maxResourceNonCsgMembers);
                builder.append(", ");
            }
            if (_maxUEsServed != null) {
                builder.append("_maxUEsServed=");
                builder.append(_maxUEsServed);
                builder.append(", ");
            }
            if (_memberDetailNumberOfEntries != null) {
                builder.append("_memberDetailNumberOfEntries=");
                builder.append(_memberDetailNumberOfEntries);
                builder.append(", ");
            }
            if (_nonCsgueAccessDecision != null) {
                builder.append("_nonCsgueAccessDecision=");
                builder.append(_nonCsgueAccessDecision);
                builder.append(", ");
            }
            if (_csgMembershipDeterminedLocally != null) {
                builder.append("_csgMembershipDeterminedLocally=");
                builder.append(_csgMembershipDeterminedLocally);
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
