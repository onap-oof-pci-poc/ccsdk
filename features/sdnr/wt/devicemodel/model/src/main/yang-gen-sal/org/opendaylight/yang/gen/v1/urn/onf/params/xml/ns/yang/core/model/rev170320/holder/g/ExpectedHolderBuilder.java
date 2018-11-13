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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder
 *
 */
public class ExpectedHolderBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder> {


    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>> augmentation = Collections.emptyMap();

    public ExpectedHolderBuilder() {
    }

    public ExpectedHolderBuilder(ExpectedHolder base) {
        if (base instanceof ExpectedHolderImpl) {
            ExpectedHolderImpl impl = (ExpectedHolderImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    
    public ExpectedHolderBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExpectedHolderBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ExpectedHolder build() {
        return new ExpectedHolderImpl(this);
    }

    private static final class ExpectedHolderImpl implements ExpectedHolder {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder.class;
        }


        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>> augmentation = Collections.emptyMap();

        private ExpectedHolderImpl(ExpectedHolderBuilder base) {
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExpectedHolderImpl otherImpl = (ExpectedHolderImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ExpectedHolder [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
