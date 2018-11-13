package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG.Action;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule
 *
 */
public class AccessMgmtLegacyLocalIpAccessRuleBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule> {

    private Action _action;
    private java.lang.String _alias;
    private IpAddress _destIpAddress;
    private IpAddress _destSubnetMask;
    private java.lang.String _interface;
    private AccessMgmtLegacyLocalIpAccessRuleKey _key;
    private java.lang.Long _protocol;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>> augmentation = Collections.emptyMap();

    public AccessMgmtLegacyLocalIpAccessRuleBuilder() {
    }
    public AccessMgmtLegacyLocalIpAccessRuleBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._destIpAddress = arg.getDestIpAddress();
        this._destSubnetMask = arg.getDestSubnetMask();
        this._protocol = arg.getProtocol();
        this._action = arg.getAction();
        this._interface = arg.getInterface();
    }

    public AccessMgmtLegacyLocalIpAccessRuleBuilder(AccessMgmtLegacyLocalIpAccessRule base) {
        if (base.getKey() == null) {
            this._key = new AccessMgmtLegacyLocalIpAccessRuleKey(
                base.getDestIpAddress(), 
                base.getDestSubnetMask(), 
                base.getProtocol()
            );
            this._destIpAddress = base.getDestIpAddress();
            this._destSubnetMask = base.getDestSubnetMask();
            this._protocol = base.getProtocol();
        } else {
            this._key = base.getKey();
            this._destIpAddress = _key.getDestIpAddress();
            this._destSubnetMask = _key.getDestSubnetMask();
            this._protocol = _key.getProtocol();
        }
        this._action = base.getAction();
        this._alias = base.getAlias();
        this._interface = base.getInterface();
        this._enable = base.isEnable();
        if (base instanceof AccessMgmtLegacyLocalIpAccessRuleImpl) {
            AccessMgmtLegacyLocalIpAccessRuleImpl impl = (AccessMgmtLegacyLocalIpAccessRuleImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG)arg).getAlias();
            this._destIpAddress = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG)arg).getDestIpAddress();
            this._destSubnetMask = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG)arg).getDestSubnetMask();
            this._protocol = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG)arg).getProtocol();
            this._action = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG)arg).getAction();
            this._interface = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG)arg).getInterface();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG] \n" +
              "but was: " + arg
            );
        }
    }

    public Action getAction() {
        return _action;
    }
    
    public java.lang.String getAlias() {
        return _alias;
    }
    
    public IpAddress getDestIpAddress() {
        return _destIpAddress;
    }
    
    public IpAddress getDestSubnetMask() {
        return _destSubnetMask;
    }
    
    public java.lang.String getInterface() {
        return _interface;
    }
    
    public AccessMgmtLegacyLocalIpAccessRuleKey getKey() {
        return _key;
    }
    
    public java.lang.Long getProtocol() {
        return _protocol;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AccessMgmtLegacyLocalIpAccessRuleBuilder setAction(final Action value) {
        this._action = value;
        return this;
    }
    
     
     private static void check_aliasLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 64) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..64]].", value));
     }
    
    public AccessMgmtLegacyLocalIpAccessRuleBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
    public AccessMgmtLegacyLocalIpAccessRuleBuilder setDestIpAddress(final IpAddress value) {
        this._destIpAddress = value;
        return this;
    }
    
     
    public AccessMgmtLegacyLocalIpAccessRuleBuilder setDestSubnetMask(final IpAddress value) {
        this._destSubnetMask = value;
        return this;
    }
    
     
     private static void check_interfaceLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 256) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..256]].", value));
     }
    
    public AccessMgmtLegacyLocalIpAccessRuleBuilder setInterface(final java.lang.String value) {
    if (value != null) {
        check_interfaceLength(value);
    }
        this._interface = value;
        return this;
    }
    
     
    public AccessMgmtLegacyLocalIpAccessRuleBuilder setKey(final AccessMgmtLegacyLocalIpAccessRuleKey value) {
        this._key = value;
        return this;
    }
    
     
    public AccessMgmtLegacyLocalIpAccessRuleBuilder setProtocol(final java.lang.Long value) {
        this._protocol = value;
        return this;
    }
    
     
    public AccessMgmtLegacyLocalIpAccessRuleBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public AccessMgmtLegacyLocalIpAccessRuleBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AccessMgmtLegacyLocalIpAccessRuleBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AccessMgmtLegacyLocalIpAccessRule build() {
        return new AccessMgmtLegacyLocalIpAccessRuleImpl(this);
    }

    private static final class AccessMgmtLegacyLocalIpAccessRuleImpl implements AccessMgmtLegacyLocalIpAccessRule {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule.class;
        }

        private final Action _action;
        private final java.lang.String _alias;
        private final IpAddress _destIpAddress;
        private final IpAddress _destSubnetMask;
        private final java.lang.String _interface;
        private final AccessMgmtLegacyLocalIpAccessRuleKey _key;
        private final java.lang.Long _protocol;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>> augmentation = Collections.emptyMap();

        private AccessMgmtLegacyLocalIpAccessRuleImpl(AccessMgmtLegacyLocalIpAccessRuleBuilder base) {
            if (base.getKey() == null) {
                this._key = new AccessMgmtLegacyLocalIpAccessRuleKey(
                    base.getDestIpAddress(), 
                    base.getDestSubnetMask(), 
                    base.getProtocol()
                );
                this._destIpAddress = base.getDestIpAddress();
                this._destSubnetMask = base.getDestSubnetMask();
                this._protocol = base.getProtocol();
            } else {
                this._key = base.getKey();
                this._destIpAddress = _key.getDestIpAddress();
                this._destSubnetMask = _key.getDestSubnetMask();
                this._protocol = _key.getProtocol();
            }
            this._action = base.getAction();
            this._alias = base.getAlias();
            this._interface = base.getInterface();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Action getAction() {
            return _action;
        }
        
        @Override
        public java.lang.String getAlias() {
            return _alias;
        }
        
        @Override
        public IpAddress getDestIpAddress() {
            return _destIpAddress;
        }
        
        @Override
        public IpAddress getDestSubnetMask() {
            return _destSubnetMask;
        }
        
        @Override
        public java.lang.String getInterface() {
            return _interface;
        }
        
        @Override
        public AccessMgmtLegacyLocalIpAccessRuleKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Long getProtocol() {
            return _protocol;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_action);
            result = prime * result + Objects.hashCode(_alias);
            result = prime * result + Objects.hashCode(_destIpAddress);
            result = prime * result + Objects.hashCode(_destSubnetMask);
            result = prime * result + Objects.hashCode(_interface);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_protocol);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule)obj;
            if (!Objects.equals(_action, other.getAction())) {
                return false;
            }
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_destIpAddress, other.getDestIpAddress())) {
                return false;
            }
            if (!Objects.equals(_destSubnetMask, other.getDestSubnetMask())) {
                return false;
            }
            if (!Objects.equals(_interface, other.getInterface())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_protocol, other.getProtocol())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AccessMgmtLegacyLocalIpAccessRuleImpl otherImpl = (AccessMgmtLegacyLocalIpAccessRuleImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AccessMgmtLegacyLocalIpAccessRule [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_action != null) {
                builder.append("_action=");
                builder.append(_action);
                builder.append(", ");
            }
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_destIpAddress != null) {
                builder.append("_destIpAddress=");
                builder.append(_destIpAddress);
                builder.append(", ");
            }
            if (_destSubnetMask != null) {
                builder.append("_destSubnetMask=");
                builder.append(_destSubnetMask);
                builder.append(", ");
            }
            if (_interface != null) {
                builder.append("_interface=");
                builder.append(_interface);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_protocol != null) {
                builder.append("_protocol=");
                builder.append(_protocol);
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
