package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics
 *
 */
public class PhysicalCharacteristicsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics> {

    private ToBeDefined _fireCharacteristics;
    private ToBeDefined _materials;
    private ToBeDefined _weightCharacteristics;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>> augmentation = Collections.emptyMap();

    public PhysicalCharacteristicsBuilder() {
    }
    public PhysicalCharacteristicsBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PhysicalCharacteristicsG arg) {
        this._weightCharacteristics = arg.getWeightCharacteristics();
        this._fireCharacteristics = arg.getFireCharacteristics();
        this._materials = arg.getMaterials();
    }

    public PhysicalCharacteristicsBuilder(PhysicalCharacteristics base) {
        this._fireCharacteristics = base.getFireCharacteristics();
        this._materials = base.getMaterials();
        this._weightCharacteristics = base.getWeightCharacteristics();
        if (base instanceof PhysicalCharacteristicsImpl) {
            PhysicalCharacteristicsImpl impl = (PhysicalCharacteristicsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PhysicalCharacteristicsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PhysicalCharacteristicsG) {
            this._weightCharacteristics = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PhysicalCharacteristicsG)arg).getWeightCharacteristics();
            this._fireCharacteristics = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PhysicalCharacteristicsG)arg).getFireCharacteristics();
            this._materials = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PhysicalCharacteristicsG)arg).getMaterials();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PhysicalCharacteristicsG] \n" +
              "but was: " + arg
            );
        }
    }

    public ToBeDefined getFireCharacteristics() {
        return _fireCharacteristics;
    }
    
    public ToBeDefined getMaterials() {
        return _materials;
    }
    
    public ToBeDefined getWeightCharacteristics() {
        return _weightCharacteristics;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PhysicalCharacteristicsBuilder setFireCharacteristics(final ToBeDefined value) {
        this._fireCharacteristics = value;
        return this;
    }
    
     
    public PhysicalCharacteristicsBuilder setMaterials(final ToBeDefined value) {
        this._materials = value;
        return this;
    }
    
     
    public PhysicalCharacteristicsBuilder setWeightCharacteristics(final ToBeDefined value) {
        this._weightCharacteristics = value;
        return this;
    }
    
    public PhysicalCharacteristicsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PhysicalCharacteristicsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PhysicalCharacteristics build() {
        return new PhysicalCharacteristicsImpl(this);
    }

    private static final class PhysicalCharacteristicsImpl implements PhysicalCharacteristics {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics.class;
        }

        private final ToBeDefined _fireCharacteristics;
        private final ToBeDefined _materials;
        private final ToBeDefined _weightCharacteristics;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>> augmentation = Collections.emptyMap();

        private PhysicalCharacteristicsImpl(PhysicalCharacteristicsBuilder base) {
            this._fireCharacteristics = base.getFireCharacteristics();
            this._materials = base.getMaterials();
            this._weightCharacteristics = base.getWeightCharacteristics();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ToBeDefined getFireCharacteristics() {
            return _fireCharacteristics;
        }
        
        @Override
        public ToBeDefined getMaterials() {
            return _materials;
        }
        
        @Override
        public ToBeDefined getWeightCharacteristics() {
            return _weightCharacteristics;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_fireCharacteristics);
            result = prime * result + Objects.hashCode(_materials);
            result = prime * result + Objects.hashCode(_weightCharacteristics);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics)obj;
            if (!Objects.equals(_fireCharacteristics, other.getFireCharacteristics())) {
                return false;
            }
            if (!Objects.equals(_materials, other.getMaterials())) {
                return false;
            }
            if (!Objects.equals(_weightCharacteristics, other.getWeightCharacteristics())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PhysicalCharacteristicsImpl otherImpl = (PhysicalCharacteristicsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PhysicalCharacteristics [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_fireCharacteristics != null) {
                builder.append("_fireCharacteristics=");
                builder.append(_fireCharacteristics);
                builder.append(", ");
            }
            if (_materials != null) {
                builder.append("_materials=");
                builder.append(_materials);
                builder.append(", ");
            }
            if (_weightCharacteristics != null) {
                builder.append("_weightCharacteristics=");
                builder.append(_weightCharacteristics);
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
