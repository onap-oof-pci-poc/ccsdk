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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification
 *
 */
public class ProblemNotificationBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification> {

    private java.lang.Integer _counter;
    private UniversalId _objectIdRef;
    private java.lang.String _problem;
    private SeverityType _severity;
    private DateAndTime _timeStamp;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>> augmentation = Collections.emptyMap();

    public ProblemNotificationBuilder() {
    }
    public ProblemNotificationBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotificationG arg) {
        this._counter = arg.getCounter();
        this._timeStamp = arg.getTimeStamp();
        this._objectIdRef = arg.getObjectIdRef();
        this._problem = arg.getProblem();
        this._severity = arg.getSeverity();
    }

    public ProblemNotificationBuilder(ProblemNotification base) {
        this._counter = base.getCounter();
        this._objectIdRef = base.getObjectIdRef();
        this._problem = base.getProblem();
        this._severity = base.getSeverity();
        this._timeStamp = base.getTimeStamp();
        if (base instanceof ProblemNotificationImpl) {
            ProblemNotificationImpl impl = (ProblemNotificationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotificationG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotificationG) {
            this._counter = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotificationG)arg).getCounter();
            this._timeStamp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotificationG)arg).getTimeStamp();
            this._objectIdRef = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotificationG)arg).getObjectIdRef();
            this._problem = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotificationG)arg).getProblem();
            this._severity = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotificationG)arg).getSeverity();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotificationG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getCounter() {
        return _counter;
    }
    
    public UniversalId getObjectIdRef() {
        return _objectIdRef;
    }
    
    public java.lang.String getProblem() {
        return _problem;
    }
    
    public SeverityType getSeverity() {
        return _severity;
    }
    
    public DateAndTime getTimeStamp() {
        return _timeStamp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ProblemNotificationBuilder setCounter(final java.lang.Integer value) {
        this._counter = value;
        return this;
    }
    
     
    public ProblemNotificationBuilder setObjectIdRef(final UniversalId value) {
        this._objectIdRef = value;
        return this;
    }
    
     
    public ProblemNotificationBuilder setProblem(final java.lang.String value) {
        this._problem = value;
        return this;
    }
    
     
    public ProblemNotificationBuilder setSeverity(final SeverityType value) {
        this._severity = value;
        return this;
    }
    
     
    public ProblemNotificationBuilder setTimeStamp(final DateAndTime value) {
        this._timeStamp = value;
        return this;
    }
    
    public ProblemNotificationBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ProblemNotificationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ProblemNotification build() {
        return new ProblemNotificationImpl(this);
    }

    private static final class ProblemNotificationImpl implements ProblemNotification {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification.class;
        }

        private final java.lang.Integer _counter;
        private final UniversalId _objectIdRef;
        private final java.lang.String _problem;
        private final SeverityType _severity;
        private final DateAndTime _timeStamp;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>> augmentation = Collections.emptyMap();

        private ProblemNotificationImpl(ProblemNotificationBuilder base) {
            this._counter = base.getCounter();
            this._objectIdRef = base.getObjectIdRef();
            this._problem = base.getProblem();
            this._severity = base.getSeverity();
            this._timeStamp = base.getTimeStamp();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getCounter() {
            return _counter;
        }
        
        @Override
        public UniversalId getObjectIdRef() {
            return _objectIdRef;
        }
        
        @Override
        public java.lang.String getProblem() {
            return _problem;
        }
        
        @Override
        public SeverityType getSeverity() {
            return _severity;
        }
        
        @Override
        public DateAndTime getTimeStamp() {
            return _timeStamp;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_counter);
            result = prime * result + Objects.hashCode(_objectIdRef);
            result = prime * result + Objects.hashCode(_problem);
            result = prime * result + Objects.hashCode(_severity);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification)obj;
            if (!Objects.equals(_counter, other.getCounter())) {
                return false;
            }
            if (!Objects.equals(_objectIdRef, other.getObjectIdRef())) {
                return false;
            }
            if (!Objects.equals(_problem, other.getProblem())) {
                return false;
            }
            if (!Objects.equals(_severity, other.getSeverity())) {
                return false;
            }
            if (!Objects.equals(_timeStamp, other.getTimeStamp())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ProblemNotificationImpl otherImpl = (ProblemNotificationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ProblemNotification>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ProblemNotification [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_counter != null) {
                builder.append("_counter=");
                builder.append(_counter);
                builder.append(", ");
            }
            if (_objectIdRef != null) {
                builder.append("_objectIdRef=");
                builder.append(_objectIdRef);
                builder.append(", ");
            }
            if (_problem != null) {
                builder.append("_problem=");
                builder.append(_problem);
                builder.append(", ");
            }
            if (_severity != null) {
                builder.append("_severity=");
                builder.append(_severity);
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
