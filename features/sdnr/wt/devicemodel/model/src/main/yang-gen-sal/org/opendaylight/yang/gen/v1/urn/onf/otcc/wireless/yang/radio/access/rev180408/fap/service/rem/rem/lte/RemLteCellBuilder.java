package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell
 *
 */
public class RemLteCellBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell> {

    private RemLteCellKey _key;
    private RemLteCellBcch _remLteCellBcch;
    private java.lang.String _remLteCellKey;
    private RemLteCellRf _remLteCellRf;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>> augmentation = Collections.emptyMap();

    public RemLteCellBuilder() {
    }
    public RemLteCellBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellG arg) {
        this._remLteCellKey = arg.getRemLteCellKey();
    }

    public RemLteCellBuilder(RemLteCell base) {
        if (base.getKey() == null) {
            this._key = new RemLteCellKey(
                base.getRemLteCellKey()
            );
            this._remLteCellKey = base.getRemLteCellKey();
        } else {
            this._key = base.getKey();
            this._remLteCellKey = _key.getRemLteCellKey();
        }
        this._remLteCellBcch = base.getRemLteCellBcch();
        this._remLteCellRf = base.getRemLteCellRf();
        if (base instanceof RemLteCellImpl) {
            RemLteCellImpl impl = (RemLteCellImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellG) {
            this._remLteCellKey = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellG)arg).getRemLteCellKey();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellG] \n" +
              "but was: " + arg
            );
        }
    }

    public RemLteCellKey getKey() {
        return _key;
    }
    
    public RemLteCellBcch getRemLteCellBcch() {
        return _remLteCellBcch;
    }
    
    public java.lang.String getRemLteCellKey() {
        return _remLteCellKey;
    }
    
    public RemLteCellRf getRemLteCellRf() {
        return _remLteCellRf;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemLteCellBuilder setKey(final RemLteCellKey value) {
        this._key = value;
        return this;
    }
    
     
    public RemLteCellBuilder setRemLteCellBcch(final RemLteCellBcch value) {
        this._remLteCellBcch = value;
        return this;
    }
    
     
    public RemLteCellBuilder setRemLteCellKey(final java.lang.String value) {
        this._remLteCellKey = value;
        return this;
    }
    
     
    public RemLteCellBuilder setRemLteCellRf(final RemLteCellRf value) {
        this._remLteCellRf = value;
        return this;
    }
    
    public RemLteCellBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemLteCellBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemLteCell build() {
        return new RemLteCellImpl(this);
    }

    private static final class RemLteCellImpl implements RemLteCell {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell.class;
        }

        private final RemLteCellKey _key;
        private final RemLteCellBcch _remLteCellBcch;
        private final java.lang.String _remLteCellKey;
        private final RemLteCellRf _remLteCellRf;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>> augmentation = Collections.emptyMap();

        private RemLteCellImpl(RemLteCellBuilder base) {
            if (base.getKey() == null) {
                this._key = new RemLteCellKey(
                    base.getRemLteCellKey()
                );
                this._remLteCellKey = base.getRemLteCellKey();
            } else {
                this._key = base.getKey();
                this._remLteCellKey = _key.getRemLteCellKey();
            }
            this._remLteCellBcch = base.getRemLteCellBcch();
            this._remLteCellRf = base.getRemLteCellRf();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public RemLteCellKey getKey() {
            return _key;
        }
        
        @Override
        public RemLteCellBcch getRemLteCellBcch() {
            return _remLteCellBcch;
        }
        
        @Override
        public java.lang.String getRemLteCellKey() {
            return _remLteCellKey;
        }
        
        @Override
        public RemLteCellRf getRemLteCellRf() {
            return _remLteCellRf;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_remLteCellBcch);
            result = prime * result + Objects.hashCode(_remLteCellKey);
            result = prime * result + Objects.hashCode(_remLteCellRf);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_remLteCellBcch, other.getRemLteCellBcch())) {
                return false;
            }
            if (!Objects.equals(_remLteCellKey, other.getRemLteCellKey())) {
                return false;
            }
            if (!Objects.equals(_remLteCellRf, other.getRemLteCellRf())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemLteCellImpl otherImpl = (RemLteCellImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemLteCell [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_remLteCellBcch != null) {
                builder.append("_remLteCellBcch=");
                builder.append(_remLteCellBcch);
                builder.append(", ");
            }
            if (_remLteCellKey != null) {
                builder.append("_remLteCellKey=");
                builder.append(_remLteCellKey);
                builder.append(", ");
            }
            if (_remLteCellRf != null) {
                builder.append("_remLteCellRf=");
                builder.append(_remLteCellRf);
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
