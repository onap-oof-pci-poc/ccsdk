package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd
 *
 */
public class AccessMgmtCdma2000LocalIpAccessHrpdBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd> {

    private List<AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter> _accessMgmtCdma2000LocalIpAccessHrpdEgressFilter;
    private BigInteger _egressFilterNumberOfEntries;
    private java.lang.String _filterInUse;
    private java.lang.Short _filterType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>> augmentation = Collections.emptyMap();

    public AccessMgmtCdma2000LocalIpAccessHrpdBuilder() {
    }
    public AccessMgmtCdma2000LocalIpAccessHrpdBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdG arg) {
        this._filterType = arg.getFilterType();
        this._filterInUse = arg.getFilterInUse();
        this._egressFilterNumberOfEntries = arg.getEgressFilterNumberOfEntries();
    }

    public AccessMgmtCdma2000LocalIpAccessHrpdBuilder(AccessMgmtCdma2000LocalIpAccessHrpd base) {
        this._accessMgmtCdma2000LocalIpAccessHrpdEgressFilter = base.getAccessMgmtCdma2000LocalIpAccessHrpdEgressFilter();
        this._egressFilterNumberOfEntries = base.getEgressFilterNumberOfEntries();
        this._filterInUse = base.getFilterInUse();
        this._filterType = base.getFilterType();
        if (base instanceof AccessMgmtCdma2000LocalIpAccessHrpdImpl) {
            AccessMgmtCdma2000LocalIpAccessHrpdImpl impl = (AccessMgmtCdma2000LocalIpAccessHrpdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdG) {
            this._filterType = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdG)arg).getFilterType();
            this._filterInUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdG)arg).getFilterInUse();
            this._egressFilterNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdG)arg).getEgressFilterNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter> getAccessMgmtCdma2000LocalIpAccessHrpdEgressFilter() {
        return _accessMgmtCdma2000LocalIpAccessHrpdEgressFilter;
    }
    
    public BigInteger getEgressFilterNumberOfEntries() {
        return _egressFilterNumberOfEntries;
    }
    
    public java.lang.String getFilterInUse() {
        return _filterInUse;
    }
    
    public java.lang.Short getFilterType() {
        return _filterType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AccessMgmtCdma2000LocalIpAccessHrpdBuilder setAccessMgmtCdma2000LocalIpAccessHrpdEgressFilter(final List<AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter> value) {
        this._accessMgmtCdma2000LocalIpAccessHrpdEgressFilter = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKEGRESSFILTERNUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKEGRESSFILTERNUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkEgressFilterNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKEGRESSFILTERNUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKEGRESSFILTERNUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public AccessMgmtCdma2000LocalIpAccessHrpdBuilder setEgressFilterNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkEgressFilterNumberOfEntriesRange(value);
    }
        this._egressFilterNumberOfEntries = value;
        return this;
    }
    
     
     private static void check_filterInUseLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public AccessMgmtCdma2000LocalIpAccessHrpdBuilder setFilterInUse(final java.lang.String value) {
    if (value != null) {
        check_filterInUseLength(value);
    }
        this._filterInUse = value;
        return this;
    }
    
     
     private static void checkFilterTypeRange(final short value) {
         if (value >= (short)0 && value <= (short)3) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..3]].", value));
     }
    
    public AccessMgmtCdma2000LocalIpAccessHrpdBuilder setFilterType(final java.lang.Short value) {
    if (value != null) {
        checkFilterTypeRange(value);
    }
        this._filterType = value;
        return this;
    }
    
    public AccessMgmtCdma2000LocalIpAccessHrpdBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AccessMgmtCdma2000LocalIpAccessHrpdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AccessMgmtCdma2000LocalIpAccessHrpd build() {
        return new AccessMgmtCdma2000LocalIpAccessHrpdImpl(this);
    }

    private static final class AccessMgmtCdma2000LocalIpAccessHrpdImpl implements AccessMgmtCdma2000LocalIpAccessHrpd {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd.class;
        }

        private final List<AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter> _accessMgmtCdma2000LocalIpAccessHrpdEgressFilter;
        private final BigInteger _egressFilterNumberOfEntries;
        private final java.lang.String _filterInUse;
        private final java.lang.Short _filterType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>> augmentation = Collections.emptyMap();

        private AccessMgmtCdma2000LocalIpAccessHrpdImpl(AccessMgmtCdma2000LocalIpAccessHrpdBuilder base) {
            this._accessMgmtCdma2000LocalIpAccessHrpdEgressFilter = base.getAccessMgmtCdma2000LocalIpAccessHrpdEgressFilter();
            this._egressFilterNumberOfEntries = base.getEgressFilterNumberOfEntries();
            this._filterInUse = base.getFilterInUse();
            this._filterType = base.getFilterType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter> getAccessMgmtCdma2000LocalIpAccessHrpdEgressFilter() {
            return _accessMgmtCdma2000LocalIpAccessHrpdEgressFilter;
        }
        
        @Override
        public BigInteger getEgressFilterNumberOfEntries() {
            return _egressFilterNumberOfEntries;
        }
        
        @Override
        public java.lang.String getFilterInUse() {
            return _filterInUse;
        }
        
        @Override
        public java.lang.Short getFilterType() {
            return _filterType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_accessMgmtCdma2000LocalIpAccessHrpdEgressFilter);
            result = prime * result + Objects.hashCode(_egressFilterNumberOfEntries);
            result = prime * result + Objects.hashCode(_filterInUse);
            result = prime * result + Objects.hashCode(_filterType);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd)obj;
            if (!Objects.equals(_accessMgmtCdma2000LocalIpAccessHrpdEgressFilter, other.getAccessMgmtCdma2000LocalIpAccessHrpdEgressFilter())) {
                return false;
            }
            if (!Objects.equals(_egressFilterNumberOfEntries, other.getEgressFilterNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_filterInUse, other.getFilterInUse())) {
                return false;
            }
            if (!Objects.equals(_filterType, other.getFilterType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AccessMgmtCdma2000LocalIpAccessHrpdImpl otherImpl = (AccessMgmtCdma2000LocalIpAccessHrpdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AccessMgmtCdma2000LocalIpAccessHrpd [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_accessMgmtCdma2000LocalIpAccessHrpdEgressFilter != null) {
                builder.append("_accessMgmtCdma2000LocalIpAccessHrpdEgressFilter=");
                builder.append(_accessMgmtCdma2000LocalIpAccessHrpdEgressFilter);
                builder.append(", ");
            }
            if (_egressFilterNumberOfEntries != null) {
                builder.append("_egressFilterNumberOfEntries=");
                builder.append(_egressFilterNumberOfEntries);
                builder.append(", ");
            }
            if (_filterInUse != null) {
                builder.append("_filterInUse=");
                builder.append(_filterInUse);
                builder.append(", ");
            }
            if (_filterType != null) {
                builder.append("_filterType=");
                builder.append(_filterType);
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
