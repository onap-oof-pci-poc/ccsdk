package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ProtectionType;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ReversionMode;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters
 *
 */
public class ControlParametersBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters> {

    private java.lang.Long _holdOffTime;
    private java.lang.String _networkSchemeSpecification;
    private ProtectionType _protType;
    private ReversionMode _reversionMode;
    private java.lang.Long _waitToRevertTime;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>> augmentation = Collections.emptyMap();

    public ControlParametersBuilder() {
    }
    public ControlParametersBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ControlParametersPacG arg) {
        this._reversionMode = arg.getReversionMode();
        this._waitToRevertTime = arg.getWaitToRevertTime();
        this._protType = arg.getProtType();
        this._holdOffTime = arg.getHoldOffTime();
        this._networkSchemeSpecification = arg.getNetworkSchemeSpecification();
    }

    public ControlParametersBuilder(ControlParameters base) {
        this._holdOffTime = base.getHoldOffTime();
        this._networkSchemeSpecification = base.getNetworkSchemeSpecification();
        this._protType = base.getProtType();
        this._reversionMode = base.getReversionMode();
        this._waitToRevertTime = base.getWaitToRevertTime();
        if (base instanceof ControlParametersImpl) {
            ControlParametersImpl impl = (ControlParametersImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ControlParametersPacG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ControlParametersPacG) {
            this._reversionMode = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ControlParametersPacG)arg).getReversionMode();
            this._waitToRevertTime = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ControlParametersPacG)arg).getWaitToRevertTime();
            this._protType = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ControlParametersPacG)arg).getProtType();
            this._holdOffTime = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ControlParametersPacG)arg).getHoldOffTime();
            this._networkSchemeSpecification = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ControlParametersPacG)arg).getNetworkSchemeSpecification();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ControlParametersPacG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getHoldOffTime() {
        return _holdOffTime;
    }
    
    public java.lang.String getNetworkSchemeSpecification() {
        return _networkSchemeSpecification;
    }
    
    public ProtectionType getProtType() {
        return _protType;
    }
    
    public ReversionMode getReversionMode() {
        return _reversionMode;
    }
    
    public java.lang.Long getWaitToRevertTime() {
        return _waitToRevertTime;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ControlParametersBuilder setHoldOffTime(final java.lang.Long value) {
        this._holdOffTime = value;
        return this;
    }
    
     
    public ControlParametersBuilder setNetworkSchemeSpecification(final java.lang.String value) {
        this._networkSchemeSpecification = value;
        return this;
    }
    
     
    public ControlParametersBuilder setProtType(final ProtectionType value) {
        this._protType = value;
        return this;
    }
    
     
    public ControlParametersBuilder setReversionMode(final ReversionMode value) {
        this._reversionMode = value;
        return this;
    }
    
     
    public ControlParametersBuilder setWaitToRevertTime(final java.lang.Long value) {
        this._waitToRevertTime = value;
        return this;
    }
    
    public ControlParametersBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ControlParametersBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ControlParameters build() {
        return new ControlParametersImpl(this);
    }

    private static final class ControlParametersImpl implements ControlParameters {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters.class;
        }

        private final java.lang.Long _holdOffTime;
        private final java.lang.String _networkSchemeSpecification;
        private final ProtectionType _protType;
        private final ReversionMode _reversionMode;
        private final java.lang.Long _waitToRevertTime;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>> augmentation = Collections.emptyMap();

        private ControlParametersImpl(ControlParametersBuilder base) {
            this._holdOffTime = base.getHoldOffTime();
            this._networkSchemeSpecification = base.getNetworkSchemeSpecification();
            this._protType = base.getProtType();
            this._reversionMode = base.getReversionMode();
            this._waitToRevertTime = base.getWaitToRevertTime();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getHoldOffTime() {
            return _holdOffTime;
        }
        
        @Override
        public java.lang.String getNetworkSchemeSpecification() {
            return _networkSchemeSpecification;
        }
        
        @Override
        public ProtectionType getProtType() {
            return _protType;
        }
        
        @Override
        public ReversionMode getReversionMode() {
            return _reversionMode;
        }
        
        @Override
        public java.lang.Long getWaitToRevertTime() {
            return _waitToRevertTime;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_holdOffTime);
            result = prime * result + Objects.hashCode(_networkSchemeSpecification);
            result = prime * result + Objects.hashCode(_protType);
            result = prime * result + Objects.hashCode(_reversionMode);
            result = prime * result + Objects.hashCode(_waitToRevertTime);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters)obj;
            if (!Objects.equals(_holdOffTime, other.getHoldOffTime())) {
                return false;
            }
            if (!Objects.equals(_networkSchemeSpecification, other.getNetworkSchemeSpecification())) {
                return false;
            }
            if (!Objects.equals(_protType, other.getProtType())) {
                return false;
            }
            if (!Objects.equals(_reversionMode, other.getReversionMode())) {
                return false;
            }
            if (!Objects.equals(_waitToRevertTime, other.getWaitToRevertTime())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ControlParametersImpl otherImpl = (ControlParametersImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ControlParameters [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_holdOffTime != null) {
                builder.append("_holdOffTime=");
                builder.append(_holdOffTime);
                builder.append(", ");
            }
            if (_networkSchemeSpecification != null) {
                builder.append("_networkSchemeSpecification=");
                builder.append(_networkSchemeSpecification);
                builder.append(", ");
            }
            if (_protType != null) {
                builder.append("_protType=");
                builder.append(_protType);
                builder.append(", ");
            }
            if (_reversionMode != null) {
                builder.append("_reversionMode=");
                builder.append(_reversionMode);
                builder.append(", ");
            }
            if (_waitToRevertTime != null) {
                builder.append("_waitToRevertTime=");
                builder.append(_waitToRevertTime);
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
