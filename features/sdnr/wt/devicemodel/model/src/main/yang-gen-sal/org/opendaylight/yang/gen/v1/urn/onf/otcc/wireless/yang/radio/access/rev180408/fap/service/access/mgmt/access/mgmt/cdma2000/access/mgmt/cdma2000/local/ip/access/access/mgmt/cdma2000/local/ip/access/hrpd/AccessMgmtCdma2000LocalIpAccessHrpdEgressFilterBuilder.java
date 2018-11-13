package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Ipv4Address;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter
 *
 */
public class AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter> {

    private java.lang.String _alias;
    private AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey _key;
    private Ipv4Address _subnet;
    private java.lang.Short _subnetMask;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>> augmentation = Collections.emptyMap();

    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder() {
    }
    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._subnet = arg.getSubnet();
        this._subnetMask = arg.getSubnetMask();
    }

    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder(AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter base) {
        if (base.getKey() == null) {
            this._key = new AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey(
                base.getSubnet(), 
                base.getSubnetMask()
            );
            this._subnet = base.getSubnet();
            this._subnetMask = base.getSubnetMask();
        } else {
            this._key = base.getKey();
            this._subnet = _key.getSubnet();
            this._subnetMask = _key.getSubnetMask();
        }
        this._alias = base.getAlias();
        this._enable = base.isEnable();
        if (base instanceof AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterImpl) {
            AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterImpl impl = (AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterG)arg).getAlias();
            this._subnet = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterG)arg).getSubnet();
            this._subnetMask = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterG)arg).getSubnetMask();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey getKey() {
        return _key;
    }
    
    public Ipv4Address getSubnet() {
        return _subnet;
    }
    
    public java.lang.Short getSubnetMask() {
        return _subnetMask;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder setKey(final AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey value) {
        this._key = value;
        return this;
    }
    
     
    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder setSubnet(final Ipv4Address value) {
        this._subnet = value;
        return this;
    }
    
     
     private static void checkSubnetMaskRange(final short value) {
         if (value >= (short)0 && value <= (short)32) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..32]].", value));
     }
    
    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder setSubnetMask(final java.lang.Short value) {
    if (value != null) {
        checkSubnetMaskRange(value);
    }
        this._subnetMask = value;
        return this;
    }
    
     
    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter build() {
        return new AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterImpl(this);
    }

    private static final class AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterImpl implements AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter.class;
        }

        private final java.lang.String _alias;
        private final AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey _key;
        private final Ipv4Address _subnet;
        private final java.lang.Short _subnetMask;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>> augmentation = Collections.emptyMap();

        private AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterImpl(AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder base) {
            if (base.getKey() == null) {
                this._key = new AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey(
                    base.getSubnet(), 
                    base.getSubnetMask()
                );
                this._subnet = base.getSubnet();
                this._subnetMask = base.getSubnetMask();
            } else {
                this._key = base.getKey();
                this._subnet = _key.getSubnet();
                this._subnetMask = _key.getSubnetMask();
            }
            this._alias = base.getAlias();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>>singletonMap(e.getKey(), e.getValue());
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
        public AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey getKey() {
            return _key;
        }
        
        @Override
        public Ipv4Address getSubnet() {
            return _subnet;
        }
        
        @Override
        public java.lang.Short getSubnetMask() {
            return _subnetMask;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_subnet);
            result = prime * result + Objects.hashCode(_subnetMask);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_subnet, other.getSubnet())) {
                return false;
            }
            if (!Objects.equals(_subnetMask, other.getSubnetMask())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterImpl otherImpl = (AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_subnet != null) {
                builder.append("_subnet=");
                builder.append(_subnet);
                builder.append(", ");
            }
            if (_subnetMask != null) {
                builder.append("_subnetMask=");
                builder.append(_subnetMask);
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
