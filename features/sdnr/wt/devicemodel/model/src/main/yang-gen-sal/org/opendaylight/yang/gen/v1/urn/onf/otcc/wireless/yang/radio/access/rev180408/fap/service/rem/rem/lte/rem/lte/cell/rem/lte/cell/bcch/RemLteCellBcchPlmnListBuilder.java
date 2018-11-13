package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList
 *
 */
public class RemLteCellBcchPlmnListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList> {

    private RemLteCellBcchPlmnListKey _key;
    private java.lang.String _plmnid;
    private java.lang.Boolean _cellReservedForOperatorUse;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>> augmentation = Collections.emptyMap();

    public RemLteCellBcchPlmnListBuilder() {
    }
    public RemLteCellBcchPlmnListBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchPlmnListG arg) {
        this._plmnid = arg.getPlmnid();
        this._cellReservedForOperatorUse = arg.isCellReservedForOperatorUse();
    }

    public RemLteCellBcchPlmnListBuilder(RemLteCellBcchPlmnList base) {
        if (base.getKey() == null) {
            this._key = new RemLteCellBcchPlmnListKey(
                base.getPlmnid()
            );
            this._plmnid = base.getPlmnid();
        } else {
            this._key = base.getKey();
            this._plmnid = _key.getPlmnid();
        }
        this._cellReservedForOperatorUse = base.isCellReservedForOperatorUse();
        if (base instanceof RemLteCellBcchPlmnListImpl) {
            RemLteCellBcchPlmnListImpl impl = (RemLteCellBcchPlmnListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchPlmnListG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchPlmnListG) {
            this._plmnid = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchPlmnListG)arg).getPlmnid();
            this._cellReservedForOperatorUse = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchPlmnListG)arg).isCellReservedForOperatorUse();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchPlmnListG] \n" +
              "but was: " + arg
            );
        }
    }

    public RemLteCellBcchPlmnListKey getKey() {
        return _key;
    }
    
    public java.lang.String getPlmnid() {
        return _plmnid;
    }
    
    public java.lang.Boolean isCellReservedForOperatorUse() {
        return _cellReservedForOperatorUse;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemLteCellBcchPlmnListBuilder setKey(final RemLteCellBcchPlmnListKey value) {
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
    
    public RemLteCellBcchPlmnListBuilder setPlmnid(final java.lang.String value) {
    if (value != null) {
        check_plmnidLength(value);
    }
        this._plmnid = value;
        return this;
    }
    
     
    public RemLteCellBcchPlmnListBuilder setCellReservedForOperatorUse(final java.lang.Boolean value) {
        this._cellReservedForOperatorUse = value;
        return this;
    }
    
    public RemLteCellBcchPlmnListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemLteCellBcchPlmnListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemLteCellBcchPlmnList build() {
        return new RemLteCellBcchPlmnListImpl(this);
    }

    private static final class RemLteCellBcchPlmnListImpl implements RemLteCellBcchPlmnList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList.class;
        }

        private final RemLteCellBcchPlmnListKey _key;
        private final java.lang.String _plmnid;
        private final java.lang.Boolean _cellReservedForOperatorUse;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>> augmentation = Collections.emptyMap();

        private RemLteCellBcchPlmnListImpl(RemLteCellBcchPlmnListBuilder base) {
            if (base.getKey() == null) {
                this._key = new RemLteCellBcchPlmnListKey(
                    base.getPlmnid()
                );
                this._plmnid = base.getPlmnid();
            } else {
                this._key = base.getKey();
                this._plmnid = _key.getPlmnid();
            }
            this._cellReservedForOperatorUse = base.isCellReservedForOperatorUse();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public RemLteCellBcchPlmnListKey getKey() {
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
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_plmnid);
            result = prime * result + Objects.hashCode(_cellReservedForOperatorUse);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_plmnid, other.getPlmnid())) {
                return false;
            }
            if (!Objects.equals(_cellReservedForOperatorUse, other.isCellReservedForOperatorUse())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemLteCellBcchPlmnListImpl otherImpl = (RemLteCellBcchPlmnListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemLteCellBcchPlmnList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
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
