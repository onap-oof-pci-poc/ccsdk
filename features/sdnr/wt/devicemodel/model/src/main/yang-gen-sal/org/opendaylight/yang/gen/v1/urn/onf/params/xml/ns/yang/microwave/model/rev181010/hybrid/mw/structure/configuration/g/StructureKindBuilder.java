package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind
 *
 */
public class StructureKindBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind> {

    private java.lang.Byte _maxNumberOfSegmentsReservable;
    private java.lang.Integer _tdmSegmentSize;
    private java.lang.String _tdmStructureName;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>> augmentation = Collections.emptyMap();

    public StructureKindBuilder() {
    }
    public StructureKindBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmStructureTypeG arg) {
        this._tdmStructureName = arg.getTdmStructureName();
        this._tdmSegmentSize = arg.getTdmSegmentSize();
        this._maxNumberOfSegmentsReservable = arg.getMaxNumberOfSegmentsReservable();
    }

    public StructureKindBuilder(StructureKind base) {
        this._maxNumberOfSegmentsReservable = base.getMaxNumberOfSegmentsReservable();
        this._tdmSegmentSize = base.getTdmSegmentSize();
        this._tdmStructureName = base.getTdmStructureName();
        if (base instanceof StructureKindImpl) {
            StructureKindImpl impl = (StructureKindImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>) base;
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
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public StructureKindBuilder setMaxNumberOfSegmentsReservable(final java.lang.Byte value) {
        this._maxNumberOfSegmentsReservable = value;
        return this;
    }
    
     
    public StructureKindBuilder setTdmSegmentSize(final java.lang.Integer value) {
        this._tdmSegmentSize = value;
        return this;
    }
    
     
    public StructureKindBuilder setTdmStructureName(final java.lang.String value) {
        this._tdmStructureName = value;
        return this;
    }
    
    public StructureKindBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public StructureKindBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public StructureKind build() {
        return new StructureKindImpl(this);
    }

    private static final class StructureKindImpl implements StructureKind {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind.class;
        }

        private final java.lang.Byte _maxNumberOfSegmentsReservable;
        private final java.lang.Integer _tdmSegmentSize;
        private final java.lang.String _tdmStructureName;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>> augmentation = Collections.emptyMap();

        private StructureKindImpl(StructureKindBuilder base) {
            this._maxNumberOfSegmentsReservable = base.getMaxNumberOfSegmentsReservable();
            this._tdmSegmentSize = base.getTdmSegmentSize();
            this._tdmStructureName = base.getTdmStructureName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind)obj;
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
                StructureKindImpl otherImpl = (StructureKindImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.configuration.g.StructureKind>> e : augmentation.entrySet()) {
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
            java.lang.String name = "StructureKind [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
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
