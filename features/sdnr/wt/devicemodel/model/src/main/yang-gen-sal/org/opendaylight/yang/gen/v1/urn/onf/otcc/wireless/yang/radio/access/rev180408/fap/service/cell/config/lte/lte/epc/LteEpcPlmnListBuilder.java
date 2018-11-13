package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList
 *
 */
public class LteEpcPlmnListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList> {

    private java.lang.String _alias;
    private LteEpcPlmnListKey _key;
    private java.lang.String _plmnid;
    private java.lang.Boolean _cellReservedForOperatorUse;
    private java.lang.Boolean _enable;
    private java.lang.Boolean _isPrimary;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>> augmentation = Collections.emptyMap();

    public LteEpcPlmnListBuilder() {
    }
    public LteEpcPlmnListBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcPlmnListG arg) {
        this._enable = arg.isEnable();
        this._alias = arg.getAlias();
        this._isPrimary = arg.isIsPrimary();
        this._plmnid = arg.getPlmnid();
        this._cellReservedForOperatorUse = arg.isCellReservedForOperatorUse();
    }

    public LteEpcPlmnListBuilder(LteEpcPlmnList base) {
        if (base.getKey() == null) {
            this._key = new LteEpcPlmnListKey(
                base.getPlmnid()
            );
            this._plmnid = base.getPlmnid();
        } else {
            this._key = base.getKey();
            this._plmnid = _key.getPlmnid();
        }
        this._alias = base.getAlias();
        this._cellReservedForOperatorUse = base.isCellReservedForOperatorUse();
        this._enable = base.isEnable();
        this._isPrimary = base.isIsPrimary();
        if (base instanceof LteEpcPlmnListImpl) {
            LteEpcPlmnListImpl impl = (LteEpcPlmnListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcPlmnListG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcPlmnListG) {
            this._enable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcPlmnListG)arg).isEnable();
            this._alias = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcPlmnListG)arg).getAlias();
            this._isPrimary = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcPlmnListG)arg).isIsPrimary();
            this._plmnid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcPlmnListG)arg).getPlmnid();
            this._cellReservedForOperatorUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcPlmnListG)arg).isCellReservedForOperatorUse();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteEpcPlmnListG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAlias() {
        return _alias;
    }
    
    public LteEpcPlmnListKey getKey() {
        return _key;
    }
    
    public java.lang.String getPlmnid() {
        return _plmnid;
    }
    
    public java.lang.Boolean isCellReservedForOperatorUse() {
        return _cellReservedForOperatorUse;
    }
    
    public java.lang.Boolean isEnable() {
        return _enable;
    }
    
    public java.lang.Boolean isIsPrimary() {
        return _isPrimary;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public LteEpcPlmnListBuilder setAlias(final java.lang.String value) {
    if (value != null) {
        check_aliasLength(value);
    }
        this._alias = value;
        return this;
    }
    
     
    public LteEpcPlmnListBuilder setKey(final LteEpcPlmnListKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void check_plmnidLength(final String value) {
         final int length = value.length();
         if (length >= 0 && length <= 6) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0..6]].", value));
     }
    
    public LteEpcPlmnListBuilder setPlmnid(final java.lang.String value) {
    if (value != null) {
        check_plmnidLength(value);
    }
        this._plmnid = value;
        return this;
    }
    
     
    public LteEpcPlmnListBuilder setCellReservedForOperatorUse(final java.lang.Boolean value) {
        this._cellReservedForOperatorUse = value;
        return this;
    }
    
     
    public LteEpcPlmnListBuilder setEnable(final java.lang.Boolean value) {
        this._enable = value;
        return this;
    }
    
     
    public LteEpcPlmnListBuilder setIsPrimary(final java.lang.Boolean value) {
        this._isPrimary = value;
        return this;
    }
    
    public LteEpcPlmnListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LteEpcPlmnListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LteEpcPlmnList build() {
        return new LteEpcPlmnListImpl(this);
    }

    private static final class LteEpcPlmnListImpl implements LteEpcPlmnList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList.class;
        }

        private final java.lang.String _alias;
        private final LteEpcPlmnListKey _key;
        private final java.lang.String _plmnid;
        private final java.lang.Boolean _cellReservedForOperatorUse;
        private final java.lang.Boolean _enable;
        private final java.lang.Boolean _isPrimary;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>> augmentation = Collections.emptyMap();

        private LteEpcPlmnListImpl(LteEpcPlmnListBuilder base) {
            if (base.getKey() == null) {
                this._key = new LteEpcPlmnListKey(
                    base.getPlmnid()
                );
                this._plmnid = base.getPlmnid();
            } else {
                this._key = base.getKey();
                this._plmnid = _key.getPlmnid();
            }
            this._alias = base.getAlias();
            this._cellReservedForOperatorUse = base.isCellReservedForOperatorUse();
            this._enable = base.isEnable();
            this._isPrimary = base.isIsPrimary();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>>singletonMap(e.getKey(), e.getValue());
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
        public LteEpcPlmnListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getPlmnid() {
            return _plmnid;
        }
        
        @Override
        public java.lang.Boolean isCellReservedForOperatorUse() {
            return _cellReservedForOperatorUse;
        }
        
        @Override
        public java.lang.Boolean isEnable() {
            return _enable;
        }
        
        @Override
        public java.lang.Boolean isIsPrimary() {
            return _isPrimary;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_plmnid);
            result = prime * result + Objects.hashCode(_cellReservedForOperatorUse);
            result = prime * result + Objects.hashCode(_enable);
            result = prime * result + Objects.hashCode(_isPrimary);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList)obj;
            if (!Objects.equals(_alias, other.getAlias())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_plmnid, other.getPlmnid())) {
                return false;
            }
            if (!Objects.equals(_cellReservedForOperatorUse, other.isCellReservedForOperatorUse())) {
                return false;
            }
            if (!Objects.equals(_enable, other.isEnable())) {
                return false;
            }
            if (!Objects.equals(_isPrimary, other.isIsPrimary())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LteEpcPlmnListImpl otherImpl = (LteEpcPlmnListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.epc.LteEpcPlmnList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LteEpcPlmnList [";
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
            if (_plmnid != null) {
                builder.append("_plmnid=");
                builder.append(_plmnid);
                builder.append(", ");
            }
            if (_cellReservedForOperatorUse != null) {
                builder.append("_cellReservedForOperatorUse=");
                builder.append(_cellReservedForOperatorUse);
                builder.append(", ");
            }
            if (_enable != null) {
                builder.append("_enable=");
                builder.append(_enable);
                builder.append(", ");
            }
            if (_isPrimary != null) {
                builder.append("_isPrimary=");
                builder.append(_isPrimary);
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
