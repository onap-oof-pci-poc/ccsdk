package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList
 *
 */
public class SignalOrderingListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList> {

    private SignalOrderingListKey _key;
    private List<java.lang.String> _signalList;
    private java.lang.String _signalOrderingKindName;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>> augmentation = Collections.emptyMap();

    public SignalOrderingListBuilder() {
    }
    public SignalOrderingListBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SignalOrderingTypeG arg) {
        this._signalOrderingKindName = arg.getSignalOrderingKindName();
        this._signalList = arg.getSignalList();
    }

    public SignalOrderingListBuilder(SignalOrderingList base) {
        if (base.getKey() == null) {
            this._key = new SignalOrderingListKey(
                base.getSignalOrderingKindName()
            );
            this._signalOrderingKindName = base.getSignalOrderingKindName();
        } else {
            this._key = base.getKey();
            this._signalOrderingKindName = _key.getSignalOrderingKindName();
        }
        this._signalList = base.getSignalList();
        if (base instanceof SignalOrderingListImpl) {
            SignalOrderingListImpl impl = (SignalOrderingListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>) base;
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

    public SignalOrderingListKey getKey() {
        return _key;
    }
    
    public List<java.lang.String> getSignalList() {
        return _signalList;
    }
    
    public java.lang.String getSignalOrderingKindName() {
        return _signalOrderingKindName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SignalOrderingListBuilder setKey(final SignalOrderingListKey value) {
        this._key = value;
        return this;
    }
    
     
    public SignalOrderingListBuilder setSignalList(final List<java.lang.String> value) {
        this._signalList = value;
        return this;
    }
    
     
    public SignalOrderingListBuilder setSignalOrderingKindName(final java.lang.String value) {
        this._signalOrderingKindName = value;
        return this;
    }
    
    public SignalOrderingListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SignalOrderingListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SignalOrderingList build() {
        return new SignalOrderingListImpl(this);
    }

    private static final class SignalOrderingListImpl implements SignalOrderingList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList.class;
        }

        private final SignalOrderingListKey _key;
        private final List<java.lang.String> _signalList;
        private final java.lang.String _signalOrderingKindName;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>> augmentation = Collections.emptyMap();

        private SignalOrderingListImpl(SignalOrderingListBuilder base) {
            if (base.getKey() == null) {
                this._key = new SignalOrderingListKey(
                    base.getSignalOrderingKindName()
                );
                this._signalOrderingKindName = base.getSignalOrderingKindName();
            } else {
                this._key = base.getKey();
                this._signalOrderingKindName = _key.getSignalOrderingKindName();
            }
            this._signalList = base.getSignalList();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public SignalOrderingListKey getKey() {
            return _key;
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_signalList, other.getSignalList())) {
                return false;
            }
            if (!Objects.equals(_signalOrderingKindName, other.getSignalOrderingKindName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SignalOrderingListImpl otherImpl = (SignalOrderingListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SignalOrderingList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
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
