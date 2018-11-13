package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity
 *
 */
public class AirInterfaceDiversityBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity> {

    private java.lang.String _diversityName;
    private java.lang.Byte _numberOfAirInterfacesMax;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>> augmentation = Collections.emptyMap();

    public AirInterfaceDiversityBuilder() {
    }
    public AirInterfaceDiversityBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.DiversityTypeG arg) {
        this._diversityName = arg.getDiversityName();
        this._numberOfAirInterfacesMax = arg.getNumberOfAirInterfacesMax();
    }

    public AirInterfaceDiversityBuilder(AirInterfaceDiversity base) {
        this._diversityName = base.getDiversityName();
        this._numberOfAirInterfacesMax = base.getNumberOfAirInterfacesMax();
        if (base instanceof AirInterfaceDiversityImpl) {
            AirInterfaceDiversityImpl impl = (AirInterfaceDiversityImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.DiversityTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.DiversityTypeG) {
            this._diversityName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.DiversityTypeG)arg).getDiversityName();
            this._numberOfAirInterfacesMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.DiversityTypeG)arg).getNumberOfAirInterfacesMax();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.DiversityTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getDiversityName() {
        return _diversityName;
    }
    
    public java.lang.Byte getNumberOfAirInterfacesMax() {
        return _numberOfAirInterfacesMax;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AirInterfaceDiversityBuilder setDiversityName(final java.lang.String value) {
        this._diversityName = value;
        return this;
    }
    
     
    public AirInterfaceDiversityBuilder setNumberOfAirInterfacesMax(final java.lang.Byte value) {
        this._numberOfAirInterfacesMax = value;
        return this;
    }
    
    public AirInterfaceDiversityBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AirInterfaceDiversityBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AirInterfaceDiversity build() {
        return new AirInterfaceDiversityImpl(this);
    }

    private static final class AirInterfaceDiversityImpl implements AirInterfaceDiversity {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity.class;
        }

        private final java.lang.String _diversityName;
        private final java.lang.Byte _numberOfAirInterfacesMax;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>> augmentation = Collections.emptyMap();

        private AirInterfaceDiversityImpl(AirInterfaceDiversityBuilder base) {
            this._diversityName = base.getDiversityName();
            this._numberOfAirInterfacesMax = base.getNumberOfAirInterfacesMax();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDiversityName() {
            return _diversityName;
        }
        
        @Override
        public java.lang.Byte getNumberOfAirInterfacesMax() {
            return _numberOfAirInterfacesMax;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_diversityName);
            result = prime * result + Objects.hashCode(_numberOfAirInterfacesMax);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity)obj;
            if (!Objects.equals(_diversityName, other.getDiversityName())) {
                return false;
            }
            if (!Objects.equals(_numberOfAirInterfacesMax, other.getNumberOfAirInterfacesMax())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AirInterfaceDiversityImpl otherImpl = (AirInterfaceDiversityImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AirInterfaceDiversity [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_diversityName != null) {
                builder.append("_diversityName=");
                builder.append(_diversityName);
                builder.append(", ");
            }
            if (_numberOfAirInterfacesMax != null) {
                builder.append("_numberOfAirInterfacesMax=");
                builder.append(_numberOfAirInterfacesMax);
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
