package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellRf;
import java.util.Objects;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell
 *
 */
public class RemCdma2000HrpdCellBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell> {

    private RemCdma2000HrpdCellKey _key;
    private RemCdma2000HrpdCellControlChannel _remCdma2000HrpdCellControlChannel;
    private java.lang.String _remCdma2000HrpdCellKey;
    private RemCdma2000HrpdCellRf _remCdma2000HrpdCellRf;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>> augmentation = Collections.emptyMap();

    public RemCdma2000HrpdCellBuilder() {
    }
    public RemCdma2000HrpdCellBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellG arg) {
        this._remCdma2000HrpdCellKey = arg.getRemCdma2000HrpdCellKey();
    }

    public RemCdma2000HrpdCellBuilder(RemCdma2000HrpdCell base) {
        if (base.getKey() == null) {
            this._key = new RemCdma2000HrpdCellKey(
                base.getRemCdma2000HrpdCellKey()
            );
            this._remCdma2000HrpdCellKey = base.getRemCdma2000HrpdCellKey();
        } else {
            this._key = base.getKey();
            this._remCdma2000HrpdCellKey = _key.getRemCdma2000HrpdCellKey();
        }
        this._remCdma2000HrpdCellControlChannel = base.getRemCdma2000HrpdCellControlChannel();
        this._remCdma2000HrpdCellRf = base.getRemCdma2000HrpdCellRf();
        if (base instanceof RemCdma2000HrpdCellImpl) {
            RemCdma2000HrpdCellImpl impl = (RemCdma2000HrpdCellImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellG) {
            this._remCdma2000HrpdCellKey = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellG)arg).getRemCdma2000HrpdCellKey();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellG] \n" +
              "but was: " + arg
            );
        }
    }

    public RemCdma2000HrpdCellKey getKey() {
        return _key;
    }
    
    public RemCdma2000HrpdCellControlChannel getRemCdma2000HrpdCellControlChannel() {
        return _remCdma2000HrpdCellControlChannel;
    }
    
    public java.lang.String getRemCdma2000HrpdCellKey() {
        return _remCdma2000HrpdCellKey;
    }
    
    public RemCdma2000HrpdCellRf getRemCdma2000HrpdCellRf() {
        return _remCdma2000HrpdCellRf;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemCdma2000HrpdCellBuilder setKey(final RemCdma2000HrpdCellKey value) {
        this._key = value;
        return this;
    }
    
     
    public RemCdma2000HrpdCellBuilder setRemCdma2000HrpdCellControlChannel(final RemCdma2000HrpdCellControlChannel value) {
        this._remCdma2000HrpdCellControlChannel = value;
        return this;
    }
    
     
    public RemCdma2000HrpdCellBuilder setRemCdma2000HrpdCellKey(final java.lang.String value) {
        this._remCdma2000HrpdCellKey = value;
        return this;
    }
    
     
    public RemCdma2000HrpdCellBuilder setRemCdma2000HrpdCellRf(final RemCdma2000HrpdCellRf value) {
        this._remCdma2000HrpdCellRf = value;
        return this;
    }
    
    public RemCdma2000HrpdCellBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemCdma2000HrpdCellBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemCdma2000HrpdCell build() {
        return new RemCdma2000HrpdCellImpl(this);
    }

    private static final class RemCdma2000HrpdCellImpl implements RemCdma2000HrpdCell {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell.class;
        }

        private final RemCdma2000HrpdCellKey _key;
        private final RemCdma2000HrpdCellControlChannel _remCdma2000HrpdCellControlChannel;
        private final java.lang.String _remCdma2000HrpdCellKey;
        private final RemCdma2000HrpdCellRf _remCdma2000HrpdCellRf;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>> augmentation = Collections.emptyMap();

        private RemCdma2000HrpdCellImpl(RemCdma2000HrpdCellBuilder base) {
            if (base.getKey() == null) {
                this._key = new RemCdma2000HrpdCellKey(
                    base.getRemCdma2000HrpdCellKey()
                );
                this._remCdma2000HrpdCellKey = base.getRemCdma2000HrpdCellKey();
            } else {
                this._key = base.getKey();
                this._remCdma2000HrpdCellKey = _key.getRemCdma2000HrpdCellKey();
            }
            this._remCdma2000HrpdCellControlChannel = base.getRemCdma2000HrpdCellControlChannel();
            this._remCdma2000HrpdCellRf = base.getRemCdma2000HrpdCellRf();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public RemCdma2000HrpdCellKey getKey() {
            return _key;
        }
        
        @Override
        public RemCdma2000HrpdCellControlChannel getRemCdma2000HrpdCellControlChannel() {
            return _remCdma2000HrpdCellControlChannel;
        }
        
        @Override
        public java.lang.String getRemCdma2000HrpdCellKey() {
            return _remCdma2000HrpdCellKey;
        }
        
        @Override
        public RemCdma2000HrpdCellRf getRemCdma2000HrpdCellRf() {
            return _remCdma2000HrpdCellRf;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_remCdma2000HrpdCellControlChannel);
            result = prime * result + Objects.hashCode(_remCdma2000HrpdCellKey);
            result = prime * result + Objects.hashCode(_remCdma2000HrpdCellRf);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_remCdma2000HrpdCellControlChannel, other.getRemCdma2000HrpdCellControlChannel())) {
                return false;
            }
            if (!Objects.equals(_remCdma2000HrpdCellKey, other.getRemCdma2000HrpdCellKey())) {
                return false;
            }
            if (!Objects.equals(_remCdma2000HrpdCellRf, other.getRemCdma2000HrpdCellRf())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemCdma2000HrpdCellImpl otherImpl = (RemCdma2000HrpdCellImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemCdma2000HrpdCell [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_remCdma2000HrpdCellControlChannel != null) {
                builder.append("_remCdma2000HrpdCellControlChannel=");
                builder.append(_remCdma2000HrpdCellControlChannel);
                builder.append(", ");
            }
            if (_remCdma2000HrpdCellKey != null) {
                builder.append("_remCdma2000HrpdCellKey=");
                builder.append(_remCdma2000HrpdCellKey);
                builder.append(", ");
            }
            if (_remCdma2000HrpdCellRf != null) {
                builder.append("_remCdma2000HrpdCellRf=");
                builder.append(_remCdma2000HrpdCellRf);
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
