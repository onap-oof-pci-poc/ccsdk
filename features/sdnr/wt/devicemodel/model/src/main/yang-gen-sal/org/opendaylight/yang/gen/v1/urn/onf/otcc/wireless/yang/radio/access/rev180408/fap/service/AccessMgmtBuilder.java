package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLegacy;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt
 *
 */
public class AccessMgmtBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt> {

    private AccessMgmtCdma2000 _accessMgmtCdma2000;
    private AccessMgmtLegacy _accessMgmtLegacy;
    private AccessMgmtLte _accessMgmtLte;
    private AccessMgmtUmts _accessMgmtUmts;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>> augmentation = Collections.emptyMap();

    public AccessMgmtBuilder() {
    }

    public AccessMgmtBuilder(AccessMgmt base) {
        this._accessMgmtCdma2000 = base.getAccessMgmtCdma2000();
        this._accessMgmtLegacy = base.getAccessMgmtLegacy();
        this._accessMgmtLte = base.getAccessMgmtLte();
        this._accessMgmtUmts = base.getAccessMgmtUmts();
        if (base instanceof AccessMgmtImpl) {
            AccessMgmtImpl impl = (AccessMgmtImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public AccessMgmtCdma2000 getAccessMgmtCdma2000() {
        return _accessMgmtCdma2000;
    }
    
    public AccessMgmtLegacy getAccessMgmtLegacy() {
        return _accessMgmtLegacy;
    }
    
    public AccessMgmtLte getAccessMgmtLte() {
        return _accessMgmtLte;
    }
    
    public AccessMgmtUmts getAccessMgmtUmts() {
        return _accessMgmtUmts;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AccessMgmtBuilder setAccessMgmtCdma2000(final AccessMgmtCdma2000 value) {
        this._accessMgmtCdma2000 = value;
        return this;
    }
    
     
    public AccessMgmtBuilder setAccessMgmtLegacy(final AccessMgmtLegacy value) {
        this._accessMgmtLegacy = value;
        return this;
    }
    
     
    public AccessMgmtBuilder setAccessMgmtLte(final AccessMgmtLte value) {
        this._accessMgmtLte = value;
        return this;
    }
    
     
    public AccessMgmtBuilder setAccessMgmtUmts(final AccessMgmtUmts value) {
        this._accessMgmtUmts = value;
        return this;
    }
    
    public AccessMgmtBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AccessMgmtBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AccessMgmt build() {
        return new AccessMgmtImpl(this);
    }

    private static final class AccessMgmtImpl implements AccessMgmt {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt.class;
        }

        private final AccessMgmtCdma2000 _accessMgmtCdma2000;
        private final AccessMgmtLegacy _accessMgmtLegacy;
        private final AccessMgmtLte _accessMgmtLte;
        private final AccessMgmtUmts _accessMgmtUmts;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>> augmentation = Collections.emptyMap();

        private AccessMgmtImpl(AccessMgmtBuilder base) {
            this._accessMgmtCdma2000 = base.getAccessMgmtCdma2000();
            this._accessMgmtLegacy = base.getAccessMgmtLegacy();
            this._accessMgmtLte = base.getAccessMgmtLte();
            this._accessMgmtUmts = base.getAccessMgmtUmts();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AccessMgmtCdma2000 getAccessMgmtCdma2000() {
            return _accessMgmtCdma2000;
        }
        
        @Override
        public AccessMgmtLegacy getAccessMgmtLegacy() {
            return _accessMgmtLegacy;
        }
        
        @Override
        public AccessMgmtLte getAccessMgmtLte() {
            return _accessMgmtLte;
        }
        
        @Override
        public AccessMgmtUmts getAccessMgmtUmts() {
            return _accessMgmtUmts;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_accessMgmtCdma2000);
            result = prime * result + Objects.hashCode(_accessMgmtLegacy);
            result = prime * result + Objects.hashCode(_accessMgmtLte);
            result = prime * result + Objects.hashCode(_accessMgmtUmts);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt)obj;
            if (!Objects.equals(_accessMgmtCdma2000, other.getAccessMgmtCdma2000())) {
                return false;
            }
            if (!Objects.equals(_accessMgmtLegacy, other.getAccessMgmtLegacy())) {
                return false;
            }
            if (!Objects.equals(_accessMgmtLte, other.getAccessMgmtLte())) {
                return false;
            }
            if (!Objects.equals(_accessMgmtUmts, other.getAccessMgmtUmts())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AccessMgmtImpl otherImpl = (AccessMgmtImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AccessMgmt [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_accessMgmtCdma2000 != null) {
                builder.append("_accessMgmtCdma2000=");
                builder.append(_accessMgmtCdma2000);
                builder.append(", ");
            }
            if (_accessMgmtLegacy != null) {
                builder.append("_accessMgmtLegacy=");
                builder.append(_accessMgmtLegacy);
                builder.append(", ");
            }
            if (_accessMgmtLte != null) {
                builder.append("_accessMgmtLte=");
                builder.append(_accessMgmtLte);
                builder.append(", ");
            }
            if (_accessMgmtUmts != null) {
                builder.append("_accessMgmtUmts=");
                builder.append(_accessMgmtUmts);
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
