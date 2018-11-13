package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess
 *
 */
public class AccessMgmtCdma2000LocalIpAccessBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess> {

    private AccessMgmtCdma2000LocalIpAccessHrpd _accessMgmtCdma2000LocalIpAccessHrpd;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>> augmentation = Collections.emptyMap();

    public AccessMgmtCdma2000LocalIpAccessBuilder() {
    }

    public AccessMgmtCdma2000LocalIpAccessBuilder(AccessMgmtCdma2000LocalIpAccess base) {
        this._accessMgmtCdma2000LocalIpAccessHrpd = base.getAccessMgmtCdma2000LocalIpAccessHrpd();
        if (base instanceof AccessMgmtCdma2000LocalIpAccessImpl) {
            AccessMgmtCdma2000LocalIpAccessImpl impl = (AccessMgmtCdma2000LocalIpAccessImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public AccessMgmtCdma2000LocalIpAccessHrpd getAccessMgmtCdma2000LocalIpAccessHrpd() {
        return _accessMgmtCdma2000LocalIpAccessHrpd;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AccessMgmtCdma2000LocalIpAccessBuilder setAccessMgmtCdma2000LocalIpAccessHrpd(final AccessMgmtCdma2000LocalIpAccessHrpd value) {
        this._accessMgmtCdma2000LocalIpAccessHrpd = value;
        return this;
    }
    
    public AccessMgmtCdma2000LocalIpAccessBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AccessMgmtCdma2000LocalIpAccessBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AccessMgmtCdma2000LocalIpAccess build() {
        return new AccessMgmtCdma2000LocalIpAccessImpl(this);
    }

    private static final class AccessMgmtCdma2000LocalIpAccessImpl implements AccessMgmtCdma2000LocalIpAccess {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess.class;
        }

        private final AccessMgmtCdma2000LocalIpAccessHrpd _accessMgmtCdma2000LocalIpAccessHrpd;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>> augmentation = Collections.emptyMap();

        private AccessMgmtCdma2000LocalIpAccessImpl(AccessMgmtCdma2000LocalIpAccessBuilder base) {
            this._accessMgmtCdma2000LocalIpAccessHrpd = base.getAccessMgmtCdma2000LocalIpAccessHrpd();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AccessMgmtCdma2000LocalIpAccessHrpd getAccessMgmtCdma2000LocalIpAccessHrpd() {
            return _accessMgmtCdma2000LocalIpAccessHrpd;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_accessMgmtCdma2000LocalIpAccessHrpd);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess)obj;
            if (!Objects.equals(_accessMgmtCdma2000LocalIpAccessHrpd, other.getAccessMgmtCdma2000LocalIpAccessHrpd())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AccessMgmtCdma2000LocalIpAccessImpl otherImpl = (AccessMgmtCdma2000LocalIpAccessImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AccessMgmtCdma2000LocalIpAccess [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_accessMgmtCdma2000LocalIpAccessHrpd != null) {
                builder.append("_accessMgmtCdma2000LocalIpAccessHrpd=");
                builder.append(_accessMgmtCdma2000LocalIpAccessHrpd);
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
