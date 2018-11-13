package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification
 *
 */
public class AttributeValueChangedNotificationBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification> {

    private java.lang.String _attributeName;
    private java.lang.Integer _counter;
    private java.lang.String _newValue;
    private UniversalId _objectIdRef;
    private DateAndTime _timeStamp;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>> augmentation = Collections.emptyMap();

    public AttributeValueChangedNotificationBuilder() {
    }
    public AttributeValueChangedNotificationBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotificationG arg) {
        this._counter = arg.getCounter();
        this._timeStamp = arg.getTimeStamp();
        this._objectIdRef = arg.getObjectIdRef();
        this._attributeName = arg.getAttributeName();
        this._newValue = arg.getNewValue();
    }

    public AttributeValueChangedNotificationBuilder(AttributeValueChangedNotification base) {
        this._attributeName = base.getAttributeName();
        this._counter = base.getCounter();
        this._newValue = base.getNewValue();
        this._objectIdRef = base.getObjectIdRef();
        this._timeStamp = base.getTimeStamp();
        if (base instanceof AttributeValueChangedNotificationImpl) {
            AttributeValueChangedNotificationImpl impl = (AttributeValueChangedNotificationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotificationG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotificationG) {
            this._counter = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotificationG)arg).getCounter();
            this._timeStamp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotificationG)arg).getTimeStamp();
            this._objectIdRef = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotificationG)arg).getObjectIdRef();
            this._attributeName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotificationG)arg).getAttributeName();
            this._newValue = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotificationG)arg).getNewValue();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotificationG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAttributeName() {
        return _attributeName;
    }
    
    public java.lang.Integer getCounter() {
        return _counter;
    }
    
    public java.lang.String getNewValue() {
        return _newValue;
    }
    
    public UniversalId getObjectIdRef() {
        return _objectIdRef;
    }
    
    public DateAndTime getTimeStamp() {
        return _timeStamp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AttributeValueChangedNotificationBuilder setAttributeName(final java.lang.String value) {
        this._attributeName = value;
        return this;
    }
    
     
    public AttributeValueChangedNotificationBuilder setCounter(final java.lang.Integer value) {
        this._counter = value;
        return this;
    }
    
     
    public AttributeValueChangedNotificationBuilder setNewValue(final java.lang.String value) {
        this._newValue = value;
        return this;
    }
    
     
    public AttributeValueChangedNotificationBuilder setObjectIdRef(final UniversalId value) {
        this._objectIdRef = value;
        return this;
    }
    
     
    public AttributeValueChangedNotificationBuilder setTimeStamp(final DateAndTime value) {
        this._timeStamp = value;
        return this;
    }
    
    public AttributeValueChangedNotificationBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AttributeValueChangedNotificationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AttributeValueChangedNotification build() {
        return new AttributeValueChangedNotificationImpl(this);
    }

    private static final class AttributeValueChangedNotificationImpl implements AttributeValueChangedNotification {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification.class;
        }

        private final java.lang.String _attributeName;
        private final java.lang.Integer _counter;
        private final java.lang.String _newValue;
        private final UniversalId _objectIdRef;
        private final DateAndTime _timeStamp;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>> augmentation = Collections.emptyMap();

        private AttributeValueChangedNotificationImpl(AttributeValueChangedNotificationBuilder base) {
            this._attributeName = base.getAttributeName();
            this._counter = base.getCounter();
            this._newValue = base.getNewValue();
            this._objectIdRef = base.getObjectIdRef();
            this._timeStamp = base.getTimeStamp();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getAttributeName() {
            return _attributeName;
        }
        
        @Override
        public java.lang.Integer getCounter() {
            return _counter;
        }
        
        @Override
        public java.lang.String getNewValue() {
            return _newValue;
        }
        
        @Override
        public UniversalId getObjectIdRef() {
            return _objectIdRef;
        }
        
        @Override
        public DateAndTime getTimeStamp() {
            return _timeStamp;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_attributeName);
            result = prime * result + Objects.hashCode(_counter);
            result = prime * result + Objects.hashCode(_newValue);
            result = prime * result + Objects.hashCode(_objectIdRef);
            result = prime * result + Objects.hashCode(_timeStamp);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification)obj;
            if (!Objects.equals(_attributeName, other.getAttributeName())) {
                return false;
            }
            if (!Objects.equals(_counter, other.getCounter())) {
                return false;
            }
            if (!Objects.equals(_newValue, other.getNewValue())) {
                return false;
            }
            if (!Objects.equals(_objectIdRef, other.getObjectIdRef())) {
                return false;
            }
            if (!Objects.equals(_timeStamp, other.getTimeStamp())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AttributeValueChangedNotificationImpl otherImpl = (AttributeValueChangedNotificationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AttributeValueChangedNotification>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AttributeValueChangedNotification [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_attributeName != null) {
                builder.append("_attributeName=");
                builder.append(_attributeName);
                builder.append(", ");
            }
            if (_counter != null) {
                builder.append("_counter=");
                builder.append(_counter);
                builder.append(", ");
            }
            if (_newValue != null) {
                builder.append("_newValue=");
                builder.append(_newValue);
                builder.append(", ");
            }
            if (_objectIdRef != null) {
                builder.append("_objectIdRef=");
                builder.append(_objectIdRef);
                builder.append(", ");
            }
            if (_timeStamp != null) {
                builder.append("_timeStamp=");
                builder.append(_timeStamp);
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
