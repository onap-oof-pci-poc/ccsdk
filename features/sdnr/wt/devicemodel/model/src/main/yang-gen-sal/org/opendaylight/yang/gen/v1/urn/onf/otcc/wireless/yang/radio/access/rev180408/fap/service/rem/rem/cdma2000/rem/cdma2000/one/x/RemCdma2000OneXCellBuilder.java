package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell
 *
 */
public class RemCdma2000OneXCellBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell> {

    private RemCdma2000OneXCellKey _key;
    private RemCdma2000OneXCellControlChannel _remCdma2000OneXCellControlChannel;
    private java.lang.String _remCdma2000OneXCellKey;
    private RemCdma2000OneXCellRf _remCdma2000OneXCellRf;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>> augmentation = Collections.emptyMap();

    public RemCdma2000OneXCellBuilder() {
    }
    public RemCdma2000OneXCellBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellG arg) {
        this._remCdma2000OneXCellKey = arg.getRemCdma2000OneXCellKey();
    }

    public RemCdma2000OneXCellBuilder(RemCdma2000OneXCell base) {
        if (base.getKey() == null) {
            this._key = new RemCdma2000OneXCellKey(
                base.getRemCdma2000OneXCellKey()
            );
            this._remCdma2000OneXCellKey = base.getRemCdma2000OneXCellKey();
        } else {
            this._key = base.getKey();
            this._remCdma2000OneXCellKey = _key.getRemCdma2000OneXCellKey();
        }
        this._remCdma2000OneXCellControlChannel = base.getRemCdma2000OneXCellControlChannel();
        this._remCdma2000OneXCellRf = base.getRemCdma2000OneXCellRf();
        if (base instanceof RemCdma2000OneXCellImpl) {
            RemCdma2000OneXCellImpl impl = (RemCdma2000OneXCellImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellG) {
            this._remCdma2000OneXCellKey = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellG)arg).getRemCdma2000OneXCellKey();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellG] \n" +
              "but was: " + arg
            );
        }
    }

    public RemCdma2000OneXCellKey getKey() {
        return _key;
    }
    
    public RemCdma2000OneXCellControlChannel getRemCdma2000OneXCellControlChannel() {
        return _remCdma2000OneXCellControlChannel;
    }
    
    public java.lang.String getRemCdma2000OneXCellKey() {
        return _remCdma2000OneXCellKey;
    }
    
    public RemCdma2000OneXCellRf getRemCdma2000OneXCellRf() {
        return _remCdma2000OneXCellRf;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemCdma2000OneXCellBuilder setKey(final RemCdma2000OneXCellKey value) {
        this._key = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellBuilder setRemCdma2000OneXCellControlChannel(final RemCdma2000OneXCellControlChannel value) {
        this._remCdma2000OneXCellControlChannel = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellBuilder setRemCdma2000OneXCellKey(final java.lang.String value) {
        this._remCdma2000OneXCellKey = value;
        return this;
    }
    
     
    public RemCdma2000OneXCellBuilder setRemCdma2000OneXCellRf(final RemCdma2000OneXCellRf value) {
        this._remCdma2000OneXCellRf = value;
        return this;
    }
    
    public RemCdma2000OneXCellBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemCdma2000OneXCellBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemCdma2000OneXCell build() {
        return new RemCdma2000OneXCellImpl(this);
    }

    private static final class RemCdma2000OneXCellImpl implements RemCdma2000OneXCell {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell.class;
        }

        private final RemCdma2000OneXCellKey _key;
        private final RemCdma2000OneXCellControlChannel _remCdma2000OneXCellControlChannel;
        private final java.lang.String _remCdma2000OneXCellKey;
        private final RemCdma2000OneXCellRf _remCdma2000OneXCellRf;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>> augmentation = Collections.emptyMap();

        private RemCdma2000OneXCellImpl(RemCdma2000OneXCellBuilder base) {
            if (base.getKey() == null) {
                this._key = new RemCdma2000OneXCellKey(
                    base.getRemCdma2000OneXCellKey()
                );
                this._remCdma2000OneXCellKey = base.getRemCdma2000OneXCellKey();
            } else {
                this._key = base.getKey();
                this._remCdma2000OneXCellKey = _key.getRemCdma2000OneXCellKey();
            }
            this._remCdma2000OneXCellControlChannel = base.getRemCdma2000OneXCellControlChannel();
            this._remCdma2000OneXCellRf = base.getRemCdma2000OneXCellRf();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public RemCdma2000OneXCellKey getKey() {
            return _key;
        }
        
        @Override
        public RemCdma2000OneXCellControlChannel getRemCdma2000OneXCellControlChannel() {
            return _remCdma2000OneXCellControlChannel;
        }
        
        @Override
        public java.lang.String getRemCdma2000OneXCellKey() {
            return _remCdma2000OneXCellKey;
        }
        
        @Override
        public RemCdma2000OneXCellRf getRemCdma2000OneXCellRf() {
            return _remCdma2000OneXCellRf;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_remCdma2000OneXCellControlChannel);
            result = prime * result + Objects.hashCode(_remCdma2000OneXCellKey);
            result = prime * result + Objects.hashCode(_remCdma2000OneXCellRf);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_remCdma2000OneXCellControlChannel, other.getRemCdma2000OneXCellControlChannel())) {
                return false;
            }
            if (!Objects.equals(_remCdma2000OneXCellKey, other.getRemCdma2000OneXCellKey())) {
                return false;
            }
            if (!Objects.equals(_remCdma2000OneXCellRf, other.getRemCdma2000OneXCellRf())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemCdma2000OneXCellImpl otherImpl = (RemCdma2000OneXCellImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemCdma2000OneXCell [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_remCdma2000OneXCellControlChannel != null) {
                builder.append("_remCdma2000OneXCellControlChannel=");
                builder.append(_remCdma2000OneXCellControlChannel);
                builder.append(", ");
            }
            if (_remCdma2000OneXCellKey != null) {
                builder.append("_remCdma2000OneXCellKey=");
                builder.append(_remCdma2000OneXCellKey);
                builder.append(", ");
            }
            if (_remCdma2000OneXCellRf != null) {
                builder.append("_remCdma2000OneXCellRf=");
                builder.append(_remCdma2000OneXCellRf);
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
