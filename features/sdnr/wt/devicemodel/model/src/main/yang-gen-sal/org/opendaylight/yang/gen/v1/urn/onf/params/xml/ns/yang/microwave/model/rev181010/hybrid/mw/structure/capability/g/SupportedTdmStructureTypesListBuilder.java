package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList
 *
 */
public class SupportedTdmStructureTypesListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList> {

    private SupportedTdmStructureTypesListKey _key;
    private java.lang.Byte _maxNumberOfSegmentsReservable;
    private java.lang.Integer _tdmSegmentSize;
    private java.lang.String _tdmStructureName;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>> augmentation = Collections.emptyMap();

    public SupportedTdmStructureTypesListBuilder() {
    }
    public SupportedTdmStructureTypesListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmStructureTypeG arg) {
        this._tdmStructureName = arg.getTdmStructureName();
        this._tdmSegmentSize = arg.getTdmSegmentSize();
        this._maxNumberOfSegmentsReservable = arg.getMaxNumberOfSegmentsReservable();
    }

    public SupportedTdmStructureTypesListBuilder(SupportedTdmStructureTypesList base) {
        if (base.getKey() == null) {
            this._key = new SupportedTdmStructureTypesListKey(
                base.getTdmStructureName()
            );
            this._tdmStructureName = base.getTdmStructureName();
        } else {
            this._key = base.getKey();
            this._tdmStructureName = _key.getTdmStructureName();
        }
        this._maxNumberOfSegmentsReservable = base.getMaxNumberOfSegmentsReservable();
        this._tdmSegmentSize = base.getTdmSegmentSize();
        if (base instanceof SupportedTdmStructureTypesListImpl) {
            SupportedTdmStructureTypesListImpl impl = (SupportedTdmStructureTypesListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmStructureTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmStructureTypeG) {
            this._tdmStructureName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmStructureTypeG)arg).getTdmStructureName();
            this._tdmSegmentSize = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmStructureTypeG)arg).getTdmSegmentSize();
            this._maxNumberOfSegmentsReservable = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmStructureTypeG)arg).getMaxNumberOfSegmentsReservable();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmStructureTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public SupportedTdmStructureTypesListKey getKey() {
        return _key;
    }
    
    public java.lang.Byte getMaxNumberOfSegmentsReservable() {
        return _maxNumberOfSegmentsReservable;
    }
    
    public java.lang.Integer getTdmSegmentSize() {
        return _tdmSegmentSize;
    }
    
    public java.lang.String getTdmStructureName() {
        return _tdmStructureName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SupportedTdmStructureTypesListBuilder setKey(final SupportedTdmStructureTypesListKey value) {
        this._key = value;
        return this;
    }
    
     
    public SupportedTdmStructureTypesListBuilder setMaxNumberOfSegmentsReservable(final java.lang.Byte value) {
        this._maxNumberOfSegmentsReservable = value;
        return this;
    }
    
     
    public SupportedTdmStructureTypesListBuilder setTdmSegmentSize(final java.lang.Integer value) {
        this._tdmSegmentSize = value;
        return this;
    }
    
     
    public SupportedTdmStructureTypesListBuilder setTdmStructureName(final java.lang.String value) {
        this._tdmStructureName = value;
        return this;
    }
    
    public SupportedTdmStructureTypesListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SupportedTdmStructureTypesListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SupportedTdmStructureTypesList build() {
        return new SupportedTdmStructureTypesListImpl(this);
    }

    private static final class SupportedTdmStructureTypesListImpl implements SupportedTdmStructureTypesList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList.class;
        }

        private final SupportedTdmStructureTypesListKey _key;
        private final java.lang.Byte _maxNumberOfSegmentsReservable;
        private final java.lang.Integer _tdmSegmentSize;
        private final java.lang.String _tdmStructureName;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>> augmentation = Collections.emptyMap();

        private SupportedTdmStructureTypesListImpl(SupportedTdmStructureTypesListBuilder base) {
            if (base.getKey() == null) {
                this._key = new SupportedTdmStructureTypesListKey(
                    base.getTdmStructureName()
                );
                this._tdmStructureName = base.getTdmStructureName();
            } else {
                this._key = base.getKey();
                this._tdmStructureName = _key.getTdmStructureName();
            }
            this._maxNumberOfSegmentsReservable = base.getMaxNumberOfSegmentsReservable();
            this._tdmSegmentSize = base.getTdmSegmentSize();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public SupportedTdmStructureTypesListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Byte getMaxNumberOfSegmentsReservable() {
            return _maxNumberOfSegmentsReservable;
        }
        
        @Override
        public java.lang.Integer getTdmSegmentSize() {
            return _tdmSegmentSize;
        }
        
        @Override
        public java.lang.String getTdmStructureName() {
            return _tdmStructureName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_maxNumberOfSegmentsReservable);
            result = prime * result + Objects.hashCode(_tdmSegmentSize);
            result = prime * result + Objects.hashCode(_tdmStructureName);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_maxNumberOfSegmentsReservable, other.getMaxNumberOfSegmentsReservable())) {
                return false;
            }
            if (!Objects.equals(_tdmSegmentSize, other.getTdmSegmentSize())) {
                return false;
            }
            if (!Objects.equals(_tdmStructureName, other.getTdmStructureName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SupportedTdmStructureTypesListImpl otherImpl = (SupportedTdmStructureTypesListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.capability.g.SupportedTdmStructureTypesList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SupportedTdmStructureTypesList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_maxNumberOfSegmentsReservable != null) {
                builder.append("_maxNumberOfSegmentsReservable=");
                builder.append(_maxNumberOfSegmentsReservable);
                builder.append(", ");
            }
            if (_tdmSegmentSize != null) {
                builder.append("_tdmSegmentSize=");
                builder.append(_tdmSegmentSize);
                builder.append(", ");
            }
            if (_tdmStructureName != null) {
                builder.append("_tdmStructureName=");
                builder.append(_tdmStructureName);
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
