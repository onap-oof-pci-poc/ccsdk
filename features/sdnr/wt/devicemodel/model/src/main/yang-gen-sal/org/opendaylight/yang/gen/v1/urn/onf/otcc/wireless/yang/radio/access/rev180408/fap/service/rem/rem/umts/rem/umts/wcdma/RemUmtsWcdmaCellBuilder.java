package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellBcch;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell
 *
 */
public class RemUmtsWcdmaCellBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell> {

    private RemUmtsWcdmaCellKey _key;
    private RemUmtsWcdmaCellBcch _remUmtsWcdmaCellBcch;
    private java.lang.String _remUmtsWcdmaCellKey;
    private RemUmtsWcdmaCellRf _remUmtsWcdmaCellRf;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>> augmentation = Collections.emptyMap();

    public RemUmtsWcdmaCellBuilder() {
    }
    public RemUmtsWcdmaCellBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellG arg) {
        this._remUmtsWcdmaCellKey = arg.getRemUmtsWcdmaCellKey();
    }

    public RemUmtsWcdmaCellBuilder(RemUmtsWcdmaCell base) {
        if (base.getKey() == null) {
            this._key = new RemUmtsWcdmaCellKey(
                base.getRemUmtsWcdmaCellKey()
            );
            this._remUmtsWcdmaCellKey = base.getRemUmtsWcdmaCellKey();
        } else {
            this._key = base.getKey();
            this._remUmtsWcdmaCellKey = _key.getRemUmtsWcdmaCellKey();
        }
        this._remUmtsWcdmaCellBcch = base.getRemUmtsWcdmaCellBcch();
        this._remUmtsWcdmaCellRf = base.getRemUmtsWcdmaCellRf();
        if (base instanceof RemUmtsWcdmaCellImpl) {
            RemUmtsWcdmaCellImpl impl = (RemUmtsWcdmaCellImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellG) {
            this._remUmtsWcdmaCellKey = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellG)arg).getRemUmtsWcdmaCellKey();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellG] \n" +
              "but was: " + arg
            );
        }
    }

    public RemUmtsWcdmaCellKey getKey() {
        return _key;
    }
    
    public RemUmtsWcdmaCellBcch getRemUmtsWcdmaCellBcch() {
        return _remUmtsWcdmaCellBcch;
    }
    
    public java.lang.String getRemUmtsWcdmaCellKey() {
        return _remUmtsWcdmaCellKey;
    }
    
    public RemUmtsWcdmaCellRf getRemUmtsWcdmaCellRf() {
        return _remUmtsWcdmaCellRf;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemUmtsWcdmaCellBuilder setKey(final RemUmtsWcdmaCellKey value) {
        this._key = value;
        return this;
    }
    
     
    public RemUmtsWcdmaCellBuilder setRemUmtsWcdmaCellBcch(final RemUmtsWcdmaCellBcch value) {
        this._remUmtsWcdmaCellBcch = value;
        return this;
    }
    
     
    public RemUmtsWcdmaCellBuilder setRemUmtsWcdmaCellKey(final java.lang.String value) {
        this._remUmtsWcdmaCellKey = value;
        return this;
    }
    
     
    public RemUmtsWcdmaCellBuilder setRemUmtsWcdmaCellRf(final RemUmtsWcdmaCellRf value) {
        this._remUmtsWcdmaCellRf = value;
        return this;
    }
    
    public RemUmtsWcdmaCellBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemUmtsWcdmaCellBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemUmtsWcdmaCell build() {
        return new RemUmtsWcdmaCellImpl(this);
    }

    private static final class RemUmtsWcdmaCellImpl implements RemUmtsWcdmaCell {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell.class;
        }

        private final RemUmtsWcdmaCellKey _key;
        private final RemUmtsWcdmaCellBcch _remUmtsWcdmaCellBcch;
        private final java.lang.String _remUmtsWcdmaCellKey;
        private final RemUmtsWcdmaCellRf _remUmtsWcdmaCellRf;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>> augmentation = Collections.emptyMap();

        private RemUmtsWcdmaCellImpl(RemUmtsWcdmaCellBuilder base) {
            if (base.getKey() == null) {
                this._key = new RemUmtsWcdmaCellKey(
                    base.getRemUmtsWcdmaCellKey()
                );
                this._remUmtsWcdmaCellKey = base.getRemUmtsWcdmaCellKey();
            } else {
                this._key = base.getKey();
                this._remUmtsWcdmaCellKey = _key.getRemUmtsWcdmaCellKey();
            }
            this._remUmtsWcdmaCellBcch = base.getRemUmtsWcdmaCellBcch();
            this._remUmtsWcdmaCellRf = base.getRemUmtsWcdmaCellRf();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public RemUmtsWcdmaCellKey getKey() {
            return _key;
        }
        
        @Override
        public RemUmtsWcdmaCellBcch getRemUmtsWcdmaCellBcch() {
            return _remUmtsWcdmaCellBcch;
        }
        
        @Override
        public java.lang.String getRemUmtsWcdmaCellKey() {
            return _remUmtsWcdmaCellKey;
        }
        
        @Override
        public RemUmtsWcdmaCellRf getRemUmtsWcdmaCellRf() {
            return _remUmtsWcdmaCellRf;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_remUmtsWcdmaCellBcch);
            result = prime * result + Objects.hashCode(_remUmtsWcdmaCellKey);
            result = prime * result + Objects.hashCode(_remUmtsWcdmaCellRf);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_remUmtsWcdmaCellBcch, other.getRemUmtsWcdmaCellBcch())) {
                return false;
            }
            if (!Objects.equals(_remUmtsWcdmaCellKey, other.getRemUmtsWcdmaCellKey())) {
                return false;
            }
            if (!Objects.equals(_remUmtsWcdmaCellRf, other.getRemUmtsWcdmaCellRf())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemUmtsWcdmaCellImpl otherImpl = (RemUmtsWcdmaCellImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemUmtsWcdmaCell [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_remUmtsWcdmaCellBcch != null) {
                builder.append("_remUmtsWcdmaCellBcch=");
                builder.append(_remUmtsWcdmaCellBcch);
                builder.append(", ");
            }
            if (_remUmtsWcdmaCellKey != null) {
                builder.append("_remUmtsWcdmaCellKey=");
                builder.append(_remUmtsWcdmaCellKey);
                builder.append(", ");
            }
            if (_remUmtsWcdmaCellRf != null) {
                builder.append("_remUmtsWcdmaCellRf=");
                builder.append(_remUmtsWcdmaCellRf);
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
