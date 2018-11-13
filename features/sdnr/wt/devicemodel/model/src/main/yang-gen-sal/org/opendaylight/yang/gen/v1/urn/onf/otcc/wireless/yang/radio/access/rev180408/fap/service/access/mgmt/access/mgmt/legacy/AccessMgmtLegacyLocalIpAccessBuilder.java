package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess
 *
 */
public class AccessMgmtLegacyLocalIpAccessBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess> {

    private List<AccessMgmtLegacyLocalIpAccessRule> _accessMgmtLegacyLocalIpAccessRule;
    private BigInteger _maxRulesEntries;
    private BigInteger _ruleNumberOfEntries;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>> augmentation = Collections.emptyMap();

    public AccessMgmtLegacyLocalIpAccessBuilder() {
    }
    public AccessMgmtLegacyLocalIpAccessBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessG arg) {
        this._enable = arg.isEnable();
        this._maxRulesEntries = arg.getMaxRulesEntries();
        this._ruleNumberOfEntries = arg.getRuleNumberOfEntries();
    }

    public AccessMgmtLegacyLocalIpAccessBuilder(AccessMgmtLegacyLocalIpAccess base) {
        this._accessMgmtLegacyLocalIpAccessRule = base.getAccessMgmtLegacyLocalIpAccessRule();
        this._maxRulesEntries = base.getMaxRulesEntries();
        this._ruleNumberOfEntries = base.getRuleNumberOfEntries();
        this._enable = base.isEnable();
        if (base instanceof AccessMgmtLegacyLocalIpAccessImpl) {
            AccessMgmtLegacyLocalIpAccessImpl impl = (AccessMgmtLegacyLocalIpAccessImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessG)arg).isEnable();
            this._maxRulesEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessG)arg).getMaxRulesEntries();
            this._ruleNumberOfEntries = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessG)arg).getRuleNumberOfEntries();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<AccessMgmtLegacyLocalIpAccessRule> getAccessMgmtLegacyLocalIpAccessRule() {
        return _accessMgmtLegacyLocalIpAccessRule;
    }
    
    public BigInteger getMaxRulesEntries() {
        return _maxRulesEntries;
    }
    
    public BigInteger getRuleNumberOfEntries() {
        return _ruleNumberOfEntries;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AccessMgmtLegacyLocalIpAccessBuilder setAccessMgmtLegacyLocalIpAccessRule(final List<AccessMgmtLegacyLocalIpAccessRule> value) {
        this._accessMgmtLegacyLocalIpAccessRule = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXRULESENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXRULESENTRIESRANGE_RANGES = a;
     }
     private static void checkMaxRulesEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXRULESENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXRULESENTRIESRANGE_RANGES)));
     }
    
    public AccessMgmtLegacyLocalIpAccessBuilder setMaxRulesEntries(final BigInteger value) {
    if (value != null) {
        checkMaxRulesEntriesRange(value);
    }
        this._maxRulesEntries = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRULENUMBEROFENTRIESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRULENUMBEROFENTRIESRANGE_RANGES = a;
     }
     private static void checkRuleNumberOfEntriesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRULENUMBEROFENTRIESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRULENUMBEROFENTRIESRANGE_RANGES)));
     }
    
    public AccessMgmtLegacyLocalIpAccessBuilder setRuleNumberOfEntries(final BigInteger value) {
    if (value != null) {
        checkRuleNumberOfEntriesRange(value);
    }
        this._ruleNumberOfEntries = value;
        return this;
    }
    
     
    public AccessMgmtLegacyLocalIpAccessBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public AccessMgmtLegacyLocalIpAccessBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AccessMgmtLegacyLocalIpAccessBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AccessMgmtLegacyLocalIpAccess build() {
        return new AccessMgmtLegacyLocalIpAccessImpl(this);
    }

    private static final class AccessMgmtLegacyLocalIpAccessImpl implements AccessMgmtLegacyLocalIpAccess {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess.class;
        }

        private final List<AccessMgmtLegacyLocalIpAccessRule> _accessMgmtLegacyLocalIpAccessRule;
        private final BigInteger _maxRulesEntries;
        private final BigInteger _ruleNumberOfEntries;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>> augmentation = Collections.emptyMap();

        private AccessMgmtLegacyLocalIpAccessImpl(AccessMgmtLegacyLocalIpAccessBuilder base) {
            this._accessMgmtLegacyLocalIpAccessRule = base.getAccessMgmtLegacyLocalIpAccessRule();
            this._maxRulesEntries = base.getMaxRulesEntries();
            this._ruleNumberOfEntries = base.getRuleNumberOfEntries();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<AccessMgmtLegacyLocalIpAccessRule> getAccessMgmtLegacyLocalIpAccessRule() {
            return _accessMgmtLegacyLocalIpAccessRule;
        }
        
        @Override
        public BigInteger getMaxRulesEntries() {
            return _maxRulesEntries;
        }
        
        @Override
        public BigInteger getRuleNumberOfEntries() {
            return _ruleNumberOfEntries;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_accessMgmtLegacyLocalIpAccessRule);
            result = prime * result + Objects.hashCode(_maxRulesEntries);
            result = prime * result + Objects.hashCode(_ruleNumberOfEntries);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess)obj;
            if (!Objects.equals(_accessMgmtLegacyLocalIpAccessRule, other.getAccessMgmtLegacyLocalIpAccessRule())) {
                return false;
            }
            if (!Objects.equals(_maxRulesEntries, other.getMaxRulesEntries())) {
                return false;
            }
            if (!Objects.equals(_ruleNumberOfEntries, other.getRuleNumberOfEntries())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AccessMgmtLegacyLocalIpAccessImpl otherImpl = (AccessMgmtLegacyLocalIpAccessImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AccessMgmtLegacyLocalIpAccess [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_accessMgmtLegacyLocalIpAccessRule != null) {
                builder.append("_accessMgmtLegacyLocalIpAccessRule=");
                builder.append(_accessMgmtLegacyLocalIpAccessRule);
                builder.append(", ");
            }
            if (_maxRulesEntries != null) {
                builder.append("_maxRulesEntries=");
                builder.append(_maxRulesEntries);
                builder.append(", ");
            }
            if (_ruleNumberOfEntries != null) {
                builder.append("_ruleNumberOfEntries=");
                builder.append(_ruleNumberOfEntries);
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
