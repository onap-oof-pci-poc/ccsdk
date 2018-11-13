package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.TimePropertiesDs;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.CurrentDs;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.ParentDs;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList
 *
 */
public class InstanceListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList> {

    private CurrentDs _currentDs;
    private DefaultDs _defaultDs;
    private java.lang.Integer _instanceNumber;
    private InstanceListKey _key;
    private ParentDs _parentDs;
    private List<PortDsList> _portDsList;
    private TimePropertiesDs _timePropertiesDs;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>> augmentation = Collections.emptyMap();

    public InstanceListBuilder() {
    }

    public InstanceListBuilder(InstanceList base) {
        if (base.getKey() == null) {
            this._key = new InstanceListKey(
                base.getInstanceNumber()
            );
            this._instanceNumber = base.getInstanceNumber();
        } else {
            this._key = base.getKey();
            this._instanceNumber = _key.getInstanceNumber();
        }
        this._currentDs = base.getCurrentDs();
        this._defaultDs = base.getDefaultDs();
        this._parentDs = base.getParentDs();
        this._portDsList = base.getPortDsList();
        this._timePropertiesDs = base.getTimePropertiesDs();
        if (base instanceof InstanceListImpl) {
            InstanceListImpl impl = (InstanceListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public CurrentDs getCurrentDs() {
        return _currentDs;
    }
    
    public DefaultDs getDefaultDs() {
        return _defaultDs;
    }
    
    public java.lang.Integer getInstanceNumber() {
        return _instanceNumber;
    }
    
    public InstanceListKey getKey() {
        return _key;
    }
    
    public ParentDs getParentDs() {
        return _parentDs;
    }
    
    public List<PortDsList> getPortDsList() {
        return _portDsList;
    }
    
    public TimePropertiesDs getTimePropertiesDs() {
        return _timePropertiesDs;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InstanceListBuilder setCurrentDs(final CurrentDs value) {
        this._currentDs = value;
        return this;
    }
    
     
    public InstanceListBuilder setDefaultDs(final DefaultDs value) {
        this._defaultDs = value;
        return this;
    }
    
     
     private static void checkInstanceNumberRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public InstanceListBuilder setInstanceNumber(final java.lang.Integer value) {
    if (value != null) {
        checkInstanceNumberRange(value);
    }
        this._instanceNumber = value;
        return this;
    }
    
     
    public InstanceListBuilder setKey(final InstanceListKey value) {
        this._key = value;
        return this;
    }
    
     
    public InstanceListBuilder setParentDs(final ParentDs value) {
        this._parentDs = value;
        return this;
    }
    
     
    public InstanceListBuilder setPortDsList(final List<PortDsList> value) {
        this._portDsList = value;
        return this;
    }
    
     
    public InstanceListBuilder setTimePropertiesDs(final TimePropertiesDs value) {
        this._timePropertiesDs = value;
        return this;
    }
    
    public InstanceListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InstanceListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InstanceList build() {
        return new InstanceListImpl(this);
    }

    private static final class InstanceListImpl implements InstanceList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList.class;
        }

        private final CurrentDs _currentDs;
        private final DefaultDs _defaultDs;
        private final java.lang.Integer _instanceNumber;
        private final InstanceListKey _key;
        private final ParentDs _parentDs;
        private final List<PortDsList> _portDsList;
        private final TimePropertiesDs _timePropertiesDs;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>> augmentation = Collections.emptyMap();

        private InstanceListImpl(InstanceListBuilder base) {
            if (base.getKey() == null) {
                this._key = new InstanceListKey(
                    base.getInstanceNumber()
                );
                this._instanceNumber = base.getInstanceNumber();
            } else {
                this._key = base.getKey();
                this._instanceNumber = _key.getInstanceNumber();
            }
            this._currentDs = base.getCurrentDs();
            this._defaultDs = base.getDefaultDs();
            this._parentDs = base.getParentDs();
            this._portDsList = base.getPortDsList();
            this._timePropertiesDs = base.getTimePropertiesDs();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public CurrentDs getCurrentDs() {
            return _currentDs;
        }
        
        @Override
        public DefaultDs getDefaultDs() {
            return _defaultDs;
        }
        
        @Override
        public java.lang.Integer getInstanceNumber() {
            return _instanceNumber;
        }
        
        @Override
        public InstanceListKey getKey() {
            return _key;
        }
        
        @Override
        public ParentDs getParentDs() {
            return _parentDs;
        }
        
        @Override
        public List<PortDsList> getPortDsList() {
            return _portDsList;
        }
        
        @Override
        public TimePropertiesDs getTimePropertiesDs() {
            return _timePropertiesDs;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_currentDs);
            result = prime * result + Objects.hashCode(_defaultDs);
            result = prime * result + Objects.hashCode(_instanceNumber);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_parentDs);
            result = prime * result + Objects.hashCode(_portDsList);
            result = prime * result + Objects.hashCode(_timePropertiesDs);
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
            if (!org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList other = (org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList)obj;
            if (!Objects.equals(_currentDs, other.getCurrentDs())) {
                return false;
            }
            if (!Objects.equals(_defaultDs, other.getDefaultDs())) {
                return false;
            }
            if (!Objects.equals(_instanceNumber, other.getInstanceNumber())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_parentDs, other.getParentDs())) {
                return false;
            }
            if (!Objects.equals(_portDsList, other.getPortDsList())) {
                return false;
            }
            if (!Objects.equals(_timePropertiesDs, other.getTimePropertiesDs())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InstanceListImpl otherImpl = (InstanceListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.InstanceList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "InstanceList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_currentDs != null) {
                builder.append("_currentDs=");
                builder.append(_currentDs);
                builder.append(", ");
            }
            if (_defaultDs != null) {
                builder.append("_defaultDs=");
                builder.append(_defaultDs);
                builder.append(", ");
            }
            if (_instanceNumber != null) {
                builder.append("_instanceNumber=");
                builder.append(_instanceNumber);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_parentDs != null) {
                builder.append("_parentDs=");
                builder.append(_parentDs);
                builder.append(", ");
            }
            if (_portDsList != null) {
                builder.append("_portDsList=");
                builder.append(_portDsList);
                builder.append(", ");
            }
            if (_timePropertiesDs != null) {
                builder.append("_timePropertiesDs=");
                builder.append(_timePropertiesDs);
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
