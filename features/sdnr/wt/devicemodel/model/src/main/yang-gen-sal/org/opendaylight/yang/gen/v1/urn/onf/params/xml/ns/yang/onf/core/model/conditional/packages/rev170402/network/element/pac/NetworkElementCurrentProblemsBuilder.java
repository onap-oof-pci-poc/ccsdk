package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.current.problems.g.CurrentProblemList;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems
 *
 */
public class NetworkElementCurrentProblemsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems> {

    private List<CurrentProblemList> _currentProblemList;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>> augmentation = Collections.emptyMap();

    public NetworkElementCurrentProblemsBuilder() {
    }
    public NetworkElementCurrentProblemsBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementCurrentProblemsG arg) {
        this._currentProblemList = arg.getCurrentProblemList();
    }

    public NetworkElementCurrentProblemsBuilder(NetworkElementCurrentProblems base) {
        this._currentProblemList = base.getCurrentProblemList();
        if (base instanceof NetworkElementCurrentProblemsImpl) {
            NetworkElementCurrentProblemsImpl impl = (NetworkElementCurrentProblemsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementCurrentProblemsG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementCurrentProblemsG) {
            this._currentProblemList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementCurrentProblemsG)arg).getCurrentProblemList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementCurrentProblemsG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<CurrentProblemList> getCurrentProblemList() {
        return _currentProblemList;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NetworkElementCurrentProblemsBuilder setCurrentProblemList(final List<CurrentProblemList> value) {
        this._currentProblemList = value;
        return this;
    }
    
    public NetworkElementCurrentProblemsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetworkElementCurrentProblemsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NetworkElementCurrentProblems build() {
        return new NetworkElementCurrentProblemsImpl(this);
    }

    private static final class NetworkElementCurrentProblemsImpl implements NetworkElementCurrentProblems {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems.class;
        }

        private final List<CurrentProblemList> _currentProblemList;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>> augmentation = Collections.emptyMap();

        private NetworkElementCurrentProblemsImpl(NetworkElementCurrentProblemsBuilder base) {
            this._currentProblemList = base.getCurrentProblemList();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<CurrentProblemList> getCurrentProblemList() {
            return _currentProblemList;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_currentProblemList);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems)obj;
            if (!Objects.equals(_currentProblemList, other.getCurrentProblemList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkElementCurrentProblemsImpl otherImpl = (NetworkElementCurrentProblemsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NetworkElementCurrentProblems [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_currentProblemList != null) {
                builder.append("_currentProblemList=");
                builder.append(_currentProblemList);
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
