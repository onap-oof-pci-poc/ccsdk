package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType
 *
 */
public class ContainerTypeBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType> {

    private java.lang.String _tdmContainerName;
    private java.lang.Integer _tdmContainerSize;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>> augmentation = Collections.emptyMap();

    public ContainerTypeBuilder() {
    }
    public ContainerTypeBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerTypeG arg) {
        this._tdmContainerName = arg.getTdmContainerName();
        this._tdmContainerSize = arg.getTdmContainerSize();
    }

    public ContainerTypeBuilder(ContainerType base) {
        this._tdmContainerName = base.getTdmContainerName();
        this._tdmContainerSize = base.getTdmContainerSize();
        if (base instanceof ContainerTypeImpl) {
            ContainerTypeImpl impl = (ContainerTypeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerTypeG) {
            this._tdmContainerName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerTypeG)arg).getTdmContainerName();
            this._tdmContainerSize = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerTypeG)arg).getTdmContainerSize();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getTdmContainerName() {
        return _tdmContainerName;
    }
    
    public java.lang.Integer getTdmContainerSize() {
        return _tdmContainerSize;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ContainerTypeBuilder setTdmContainerName(final java.lang.String value) {
        this._tdmContainerName = value;
        return this;
    }
    
     
    public ContainerTypeBuilder setTdmContainerSize(final java.lang.Integer value) {
        this._tdmContainerSize = value;
        return this;
    }
    
    public ContainerTypeBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ContainerTypeBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ContainerType build() {
        return new ContainerTypeImpl(this);
    }

    private static final class ContainerTypeImpl implements ContainerType {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType.class;
        }

        private final java.lang.String _tdmContainerName;
        private final java.lang.Integer _tdmContainerSize;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>> augmentation = Collections.emptyMap();

        private ContainerTypeImpl(ContainerTypeBuilder base) {
            this._tdmContainerName = base.getTdmContainerName();
            this._tdmContainerSize = base.getTdmContainerSize();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getTdmContainerName() {
            return _tdmContainerName;
        }
        
        @Override
        public java.lang.Integer getTdmContainerSize() {
            return _tdmContainerSize;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_tdmContainerName);
            result = prime * result + Objects.hashCode(_tdmContainerSize);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType)obj;
            if (!Objects.equals(_tdmContainerName, other.getTdmContainerName())) {
                return false;
            }
            if (!Objects.equals(_tdmContainerSize, other.getTdmContainerSize())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ContainerTypeImpl otherImpl = (ContainerTypeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ContainerType>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ContainerType [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_tdmContainerName != null) {
                builder.append("_tdmContainerName=");
                builder.append(_tdmContainerName);
                builder.append(", ");
            }
            if (_tdmContainerSize != null) {
                builder.append("_tdmContainerSize=");
                builder.append(_tdmContainerSize);
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
