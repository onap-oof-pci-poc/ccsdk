package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.lte.AccessMgmtLteLocalIpAccess;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG.AccessMode;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte
 *
 */
public class AccessMgmtLteBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte> {

    private AccessMgmtLteLocalIpAccess _accessMgmtLteLocalIpAccess;
    private AccessMode _accessMode;
    private java.lang.Long _csgid;
    private java.lang.String _hnbName;
    private java.lang.Long _maxCsgMembers;
    private java.lang.Long _maxNonCsgMembers;
    private java.lang.Short _maxResourceNonCsgMembers;
    private java.lang.Long _maxUEsServed;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>> augmentation = Collections.emptyMap();

    public AccessMgmtLteBuilder() {
    }
    public AccessMgmtLteBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG arg) {
        this._accessMode = arg.getAccessMode();
        this._maxUEsServed = arg.getMaxUEsServed();
        this._maxCsgMembers = arg.getMaxCsgMembers();
        this._maxNonCsgMembers = arg.getMaxNonCsgMembers();
        this._maxResourceNonCsgMembers = arg.getMaxResourceNonCsgMembers();
        this._csgid = arg.getCsgid();
        this._hnbName = arg.getHnbName();
    }

    public AccessMgmtLteBuilder(AccessMgmtLte base) {
        this._accessMgmtLteLocalIpAccess = base.getAccessMgmtLteLocalIpAccess();
        this._accessMode = base.getAccessMode();
        this._csgid = base.getCsgid();
        this._hnbName = base.getHnbName();
        this._maxCsgMembers = base.getMaxCsgMembers();
        this._maxNonCsgMembers = base.getMaxNonCsgMembers();
        this._maxResourceNonCsgMembers = base.getMaxResourceNonCsgMembers();
        this._maxUEsServed = base.getMaxUEsServed();
        if (base instanceof AccessMgmtLteImpl) {
            AccessMgmtLteImpl impl = (AccessMgmtLteImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG) {
            this._accessMode = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG)arg).getAccessMode();
            this._maxUEsServed = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG)arg).getMaxUEsServed();
            this._maxCsgMembers = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG)arg).getMaxCsgMembers();
            this._maxNonCsgMembers = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG)arg).getMaxNonCsgMembers();
            this._maxResourceNonCsgMembers = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG)arg).getMaxResourceNonCsgMembers();
            this._csgid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG)arg).getCsgid();
            this._hnbName = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG)arg).getHnbName();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG] \n" +
              "but was: " + arg
            );
        }
    }

    public AccessMgmtLteLocalIpAccess getAccessMgmtLteLocalIpAccess() {
        return _accessMgmtLteLocalIpAccess;
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
    
    public java.lang.Long getMaxNonCsgMembers() {
        return _maxNonCsgMembers;
    }
    
    public java.lang.Short getMaxResourceNonCsgMembers() {
        return _maxResourceNonCsgMembers;
    }
    
    public java.lang.Long getMaxUEsServed() {
        return _maxUEsServed;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AccessMgmtLteBuilder setAccessMgmtLteLocalIpAccess(final AccessMgmtLteLocalIpAccess value) {
        this._accessMgmtLteLocalIpAccess = value;
        return this;
    }
    
     
    public AccessMgmtLteBuilder setAccessMode(final AccessMode value) {
        this._accessMode = value;
        return this;
    }
    
     
     private static void checkCsgidRange(final long value) {
         if (value >= 0L && value <= 134217727L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..134217727]].", value));
     }
    
    public AccessMgmtLteBuilder setCsgid(final java.lang.Long value) {
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
    
    public AccessMgmtLteBuilder setHnbName(final java.lang.String value) {
    if (value != null) {
        check_hnbNameLength(value);
    }
        this._hnbName = value;
        return this;
    }
    
     
    public AccessMgmtLteBuilder setMaxCsgMembers(final java.lang.Long value) {
        this._maxCsgMembers = value;
        return this;
    }
    
     
    public AccessMgmtLteBuilder setMaxNonCsgMembers(final java.lang.Long value) {
        this._maxNonCsgMembers = value;
        return this;
    }
    
     
     private static void checkMaxResourceNonCsgMembersRange(final short value) {
         if (value >= (short)0 && value <= (short)100) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..100]].", value));
     }
    
    public AccessMgmtLteBuilder setMaxResourceNonCsgMembers(final java.lang.Short value) {
    if (value != null) {
        checkMaxResourceNonCsgMembersRange(value);
    }
        this._maxResourceNonCsgMembers = value;
        return this;
    }
    
     
    public AccessMgmtLteBuilder setMaxUEsServed(final java.lang.Long value) {
        this._maxUEsServed = value;
        return this;
    }
    
    public AccessMgmtLteBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AccessMgmtLteBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AccessMgmtLte build() {
        return new AccessMgmtLteImpl(this);
    }

    private static final class AccessMgmtLteImpl implements AccessMgmtLte {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte.class;
        }

        private final AccessMgmtLteLocalIpAccess _accessMgmtLteLocalIpAccess;
        private final AccessMode _accessMode;
        private final java.lang.Long _csgid;
        private final java.lang.String _hnbName;
        private final java.lang.Long _maxCsgMembers;
        private final java.lang.Long _maxNonCsgMembers;
        private final java.lang.Short _maxResourceNonCsgMembers;
        private final java.lang.Long _maxUEsServed;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>> augmentation = Collections.emptyMap();

        private AccessMgmtLteImpl(AccessMgmtLteBuilder base) {
            this._accessMgmtLteLocalIpAccess = base.getAccessMgmtLteLocalIpAccess();
            this._accessMode = base.getAccessMode();
            this._csgid = base.getCsgid();
            this._hnbName = base.getHnbName();
            this._maxCsgMembers = base.getMaxCsgMembers();
            this._maxNonCsgMembers = base.getMaxNonCsgMembers();
            this._maxResourceNonCsgMembers = base.getMaxResourceNonCsgMembers();
            this._maxUEsServed = base.getMaxUEsServed();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AccessMgmtLteLocalIpAccess getAccessMgmtLteLocalIpAccess() {
            return _accessMgmtLteLocalIpAccess;
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
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_accessMgmtLteLocalIpAccess);
            result = prime * result + Objects.hashCode(_accessMode);
            result = prime * result + Objects.hashCode(_csgid);
            result = prime * result + Objects.hashCode(_hnbName);
            result = prime * result + Objects.hashCode(_maxCsgMembers);
            result = prime * result + Objects.hashCode(_maxNonCsgMembers);
            result = prime * result + Objects.hashCode(_maxResourceNonCsgMembers);
            result = prime * result + Objects.hashCode(_maxUEsServed);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte)obj;
            if (!Objects.equals(_accessMgmtLteLocalIpAccess, other.getAccessMgmtLteLocalIpAccess())) {
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
            if (!Objects.equals(_maxNonCsgMembers, other.getMaxNonCsgMembers())) {
                return false;
            }
            if (!Objects.equals(_maxResourceNonCsgMembers, other.getMaxResourceNonCsgMembers())) {
                return false;
            }
            if (!Objects.equals(_maxUEsServed, other.getMaxUEsServed())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AccessMgmtLteImpl otherImpl = (AccessMgmtLteImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AccessMgmtLte [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_accessMgmtLteLocalIpAccess != null) {
                builder.append("_accessMgmtLteLocalIpAccess=");
                builder.append(_accessMgmtLteLocalIpAccess);
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
