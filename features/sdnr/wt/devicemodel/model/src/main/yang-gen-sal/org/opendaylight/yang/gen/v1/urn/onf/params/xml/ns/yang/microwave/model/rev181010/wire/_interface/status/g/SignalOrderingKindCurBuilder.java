package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur
 *
 */
public class SignalOrderingKindCurBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur> {

    private List<java.lang.String> _signalList;
    private java.lang.String _signalOrderingKindName;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>> augmentation = Collections.emptyMap();

    public SignalOrderingKindCurBuilder() {
    }
    public SignalOrderingKindCurBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SignalOrderingTypeG arg) {
        this._signalOrderingKindName = arg.getSignalOrderingKindName();
        this._signalList = arg.getSignalList();
    }

    public SignalOrderingKindCurBuilder(SignalOrderingKindCur base) {
        this._signalList = base.getSignalList();
        this._signalOrderingKindName = base.getSignalOrderingKindName();
        if (base instanceof SignalOrderingKindCurImpl) {
            SignalOrderingKindCurImpl impl = (SignalOrderingKindCurImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SignalOrderingTypeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SignalOrderingTypeG) {
            this._signalOrderingKindName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SignalOrderingTypeG)arg).getSignalOrderingKindName();
            this._signalList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SignalOrderingTypeG)arg).getSignalList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SignalOrderingTypeG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.String> getSignalList() {
        return _signalList;
    }
    
    public java.lang.String getSignalOrderingKindName() {
        return _signalOrderingKindName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SignalOrderingKindCurBuilder setSignalList(final List<java.lang.String> value) {
        this._signalList = value;
        return this;
    }
    
     
    public SignalOrderingKindCurBuilder setSignalOrderingKindName(final java.lang.String value) {
        this._signalOrderingKindName = value;
        return this;
    }
    
    public SignalOrderingKindCurBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SignalOrderingKindCurBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SignalOrderingKindCur build() {
        return new SignalOrderingKindCurImpl(this);
    }

    private static final class SignalOrderingKindCurImpl implements SignalOrderingKindCur {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur.class;
        }

        private final List<java.lang.String> _signalList;
        private final java.lang.String _signalOrderingKindName;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>> augmentation = Collections.emptyMap();

        private SignalOrderingKindCurImpl(SignalOrderingKindCurBuilder base) {
            this._signalList = base.getSignalList();
            this._signalOrderingKindName = base.getSignalOrderingKindName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.String> getSignalList() {
            return _signalList;
        }
        
        @Override
        public java.lang.String getSignalOrderingKindName() {
            return _signalOrderingKindName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_signalList);
            result = prime * result + Objects.hashCode(_signalOrderingKindName);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur)obj;
            if (!Objects.equals(_signalList, other.getSignalList())) {
                return false;
            }
            if (!Objects.equals(_signalOrderingKindName, other.getSignalOrderingKindName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SignalOrderingKindCurImpl otherImpl = (SignalOrderingKindCurImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SignalOrderingKindCur [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_signalList != null) {
                builder.append("_signalList=");
                builder.append(_signalList);
                builder.append(", ");
            }
            if (_signalOrderingKindName != null) {
                builder.append("_signalOrderingKindName=");
                builder.append(_signalOrderingKindName);
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
