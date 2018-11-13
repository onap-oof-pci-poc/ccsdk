package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors
 *
 */
public class HolderMonitorsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors> {

    private java.lang.String _aggregateFunction;
    private java.lang.Boolean _isActive;
    private java.lang.Boolean _isActualMismatchWithExpected;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>> augmentation = Collections.emptyMap();

    public HolderMonitorsBuilder() {
    }
    public HolderMonitorsBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderMonitorsG arg) {
        this._isActive = arg.isIsActive();
        this._isActualMismatchWithExpected = arg.isIsActualMismatchWithExpected();
        this._aggregateFunction = arg.getAggregateFunction();
    }

    public HolderMonitorsBuilder(HolderMonitors base) {
        this._aggregateFunction = base.getAggregateFunction();
        this._isActive = base.isIsActive();
        this._isActualMismatchWithExpected = base.isIsActualMismatchWithExpected();
        if (base instanceof HolderMonitorsImpl) {
            HolderMonitorsImpl impl = (HolderMonitorsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderMonitorsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderMonitorsG) {
            this._isActive = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderMonitorsG)arg).isIsActive();
            this._isActualMismatchWithExpected = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderMonitorsG)arg).isIsActualMismatchWithExpected();
            this._aggregateFunction = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderMonitorsG)arg).getAggregateFunction();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderMonitorsG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAggregateFunction() {
        return _aggregateFunction;
    }
    
    public java.lang.Boolean isIsActive() {
        return _isActive;
    }
    
    public java.lang.Boolean isIsActualMismatchWithExpected() {
        return _isActualMismatchWithExpected;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public HolderMonitorsBuilder setAggregateFunction(final java.lang.String value) {
        this._aggregateFunction = value;
        return this;
    }
    
     
    public HolderMonitorsBuilder setIsActive(final java.lang.Boolean value) {
        this._isActive = value;
        return this;
    }
    
     
    public HolderMonitorsBuilder setIsActualMismatchWithExpected(final java.lang.Boolean value) {
        this._isActualMismatchWithExpected = value;
        return this;
    }
    
    public HolderMonitorsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HolderMonitorsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HolderMonitors build() {
        return new HolderMonitorsImpl(this);
    }

    private static final class HolderMonitorsImpl implements HolderMonitors {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors.class;
        }

        private final java.lang.String _aggregateFunction;
        private final java.lang.Boolean _isActive;
        private final java.lang.Boolean _isActualMismatchWithExpected;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>> augmentation = Collections.emptyMap();

        private HolderMonitorsImpl(HolderMonitorsBuilder base) {
            this._aggregateFunction = base.getAggregateFunction();
            this._isActive = base.isIsActive();
            this._isActualMismatchWithExpected = base.isIsActualMismatchWithExpected();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getAggregateFunction() {
            return _aggregateFunction;
        }
        
        @Override
        public java.lang.Boolean isIsActive() {
            return _isActive;
        }
        
        @Override
        public java.lang.Boolean isIsActualMismatchWithExpected() {
            return _isActualMismatchWithExpected;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_aggregateFunction);
            result = prime * result + Objects.hashCode(_isActive);
            result = prime * result + Objects.hashCode(_isActualMismatchWithExpected);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors)obj;
            if (!Objects.equals(_aggregateFunction, other.getAggregateFunction())) {
                return false;
            }
            if (!Objects.equals(_isActive, other.isIsActive())) {
                return false;
            }
            if (!Objects.equals(_isActualMismatchWithExpected, other.isIsActualMismatchWithExpected())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HolderMonitorsImpl otherImpl = (HolderMonitorsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors>> e : augmentation.entrySet()) {
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
            java.lang.String name = "HolderMonitors [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_aggregateFunction != null) {
                builder.append("_aggregateFunction=");
                builder.append(_aggregateFunction);
                builder.append(", ");
            }
            if (_isActive != null) {
                builder.append("_isActive=");
                builder.append(_isActive);
                builder.append(", ");
            }
            if (_isActualMismatchWithExpected != null) {
                builder.append("_isActualMismatchWithExpected=");
                builder.append(_isActualMismatchWithExpected);
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
