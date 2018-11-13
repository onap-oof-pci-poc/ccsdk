package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas
 *
 */
public class RemLteCarrierMeasBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas> {

    private java.lang.String _alias;
    private java.lang.Long _carrierArfcndl;
    private java.lang.Long _carrierChWidth;
    private java.lang.Long _carrierRssi;
    private RemLteCarrierMeasKey _key;
    private java.lang.Boolean _enable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>> augmentation = Collections.emptyMap();

    public RemLteCarrierMeasBuilder() {
    }
    public RemLteCarrierMeasBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCarrierMeasG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._carrierArfcndl = arg.getCarrierArfcndl();
        this._carrierChWidth = arg.getCarrierChWidth();
        this._carrierRssi = arg.getCarrierRssi();
    }

    public RemLteCarrierMeasBuilder(RemLteCarrierMeas base) {
        if (base.getKey() == null) {
            this._key = new RemLteCarrierMeasKey(
                base.getCarrierArfcndl(), 
                base.getCarrierChWidth()
            );
            this._carrierArfcndl = base.getCarrierArfcndl();
            this._carrierChWidth = base.getCarrierChWidth();
        } else {
            this._key = base.getKey();
            this._carrierArfcndl = _key.getCarrierArfcndl();
            this._carrierChWidth = _key.getCarrierChWidth();
        }
        this._alias = base.getAlias();
        this._carrierRssi = base.getCarrierRssi();
        this._enable = base.isEnable();
        if (base instanceof RemLteCarrierMeasImpl) {
            RemLteCarrierMeasImpl impl = (RemLteCarrierMeasImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCarrierMeasG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCarrierMeasG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCarrierMeasG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCarrierMeasG)arg).getAlias();
            this._carrierArfcndl = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCarrierMeasG)arg).getCarrierArfcndl();
            this._carrierChWidth = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCarrierMeasG)arg).getCarrierChWidth();
            this._carrierRssi = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCarrierMeasG)arg).getCarrierRssi();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCarrierMeasG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public java.lang.Long getCarrierArfcndl() {
        return _carrierArfcndl;
    }
    
    public java.lang.Long getCarrierChWidth() {
        return _carrierChWidth;
    }
    
    public java.lang.Long getCarrierRssi() {
        return _carrierRssi;
    }
    
    public RemLteCarrierMeasKey getKey() {
        return _key;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public RemLteCarrierMeasBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
    public RemLteCarrierMeasBuilder setCarrierArfcndl(final java.lang.Long value) {
        this._carrierArfcndl = value;
        return this;
    }
    
     
    public RemLteCarrierMeasBuilder setCarrierChWidth(final java.lang.Long value) {
        this._carrierChWidth = value;
        return this;
    }
    
     
    public RemLteCarrierMeasBuilder setCarrierRssi(final java.lang.Long value) {
        this._carrierRssi = value;
        return this;
    }
    
     
    public RemLteCarrierMeasBuilder setKey(final RemLteCarrierMeasKey value) {
        this._key = value;
        return this;
    }
    
     
    public RemLteCarrierMeasBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
    public RemLteCarrierMeasBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemLteCarrierMeasBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemLteCarrierMeas build() {
        return new RemLteCarrierMeasImpl(this);
    }

    private static final class RemLteCarrierMeasImpl implements RemLteCarrierMeas {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas.class;
        }

        private final java.lang.String _alias;
        private final java.lang.Long _carrierArfcndl;
        private final java.lang.Long _carrierChWidth;
        private final java.lang.Long _carrierRssi;
        private final RemLteCarrierMeasKey _key;
        private final java.lang.Boolean _enable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>> augmentation = Collections.emptyMap();

        private RemLteCarrierMeasImpl(RemLteCarrierMeasBuilder base) {
            if (base.getKey() == null) {
                this._key = new RemLteCarrierMeasKey(
                    base.getCarrierArfcndl(), 
                    base.getCarrierChWidth()
                );
                this._carrierArfcndl = base.getCarrierArfcndl();
                this._carrierChWidth = base.getCarrierChWidth();
            } else {
                this._key = base.getKey();
                this._carrierArfcndl = _key.getCarrierArfcndl();
                this._carrierChWidth = _key.getCarrierChWidth();
            }
            this._alias = base.getAlias();
            this._carrierRssi = base.getCarrierRssi();
            this._enable = base.isEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.Long getCarrierArfcndl() {
            return _carrierArfcndl;
        }
        
        @Override
        public java.lang.Long getCarrierChWidth() {
            return _carrierChWidth;
        }
        
        @Override
        public java.lang.Long getCarrierRssi() {
            return _carrierRssi;
        }
        
        @Override
        public RemLteCarrierMeasKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_carrierArfcndl);
            result = prime * result + Objects.hashCode(_carrierChWidth);
            result = prime * result + Objects.hashCode(_carrierRssi);
            result = prime * result + Objects.hashCode(_key);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_carrierArfcndl, other.getCarrierArfcndl())) {
                return false;
            }
            if (!Objects.equals(_carrierChWidth, other.getCarrierChWidth())) {
                return false;
            }
            if (!Objects.equals(_carrierRssi, other.getCarrierRssi())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemLteCarrierMeasImpl otherImpl = (RemLteCarrierMeasImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCarrierMeas>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemLteCarrierMeas [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alias != null) {
                builder.append("_alias=");
                builder.append(_alias);
                builder.append(", ");
            }
            if (_carrierArfcndl != null) {
                builder.append("_carrierArfcndl=");
                builder.append(_carrierArfcndl);
                builder.append(", ");
            }
            if (_carrierChWidth != null) {
                builder.append("_carrierChWidth=");
                builder.append(_carrierChWidth);
                builder.append(", ");
            }
            if (_carrierRssi != null) {
                builder.append("_carrierRssi=");
                builder.append(_carrierRssi);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
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
