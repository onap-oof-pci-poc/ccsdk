package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.transparent.clock.port.ds.entry.PortIdentity;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList
 *
 */
public class TransparentClockPortDsListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList> {

    private TransparentClockPortDsListKey _key;
    private java.lang.Byte _logMinPdelayReqInterval;
    private TimeIntervalType _peerMeanPathDelay;
    private PortIdentity _portIdentity;
    private java.lang.Integer _portNumber;
    private java.lang.Boolean _faultyFlag;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>> augmentation = Collections.emptyMap();

    public TransparentClockPortDsListBuilder() {
    }
    public TransparentClockPortDsListBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsEntry arg) {
        this._portIdentity = arg.getPortIdentity();
        this._logMinPdelayReqInterval = arg.getLogMinPdelayReqInterval();
        this._faultyFlag = arg.isFaultyFlag();
        this._peerMeanPathDelay = arg.getPeerMeanPathDelay();
    }

    public TransparentClockPortDsListBuilder(TransparentClockPortDsList base) {
        if (base.getKey() == null) {
            this._key = new TransparentClockPortDsListKey(
                base.getPortNumber()
            );
            this._portNumber = base.getPortNumber();
        } else {
            this._key = base.getKey();
            this._portNumber = _key.getPortNumber();
        }
        this._logMinPdelayReqInterval = base.getLogMinPdelayReqInterval();
        this._peerMeanPathDelay = base.getPeerMeanPathDelay();
        this._portIdentity = base.getPortIdentity();
        this._faultyFlag = base.isFaultyFlag();
        if (base instanceof TransparentClockPortDsListImpl) {
            TransparentClockPortDsListImpl impl = (TransparentClockPortDsListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsEntry</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsEntry) {
            this._portIdentity = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsEntry)arg).getPortIdentity();
            this._logMinPdelayReqInterval = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsEntry)arg).getLogMinPdelayReqInterval();
            this._faultyFlag = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsEntry)arg).isFaultyFlag();
            this._peerMeanPathDelay = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsEntry)arg).getPeerMeanPathDelay();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsEntry] \n" +
              "but was: " + arg
            );
        }
    }

    public TransparentClockPortDsListKey getKey() {
        return _key;
    }
    
    public java.lang.Byte getLogMinPdelayReqInterval() {
        return _logMinPdelayReqInterval;
    }
    
    public TimeIntervalType getPeerMeanPathDelay() {
        return _peerMeanPathDelay;
    }
    
    public PortIdentity getPortIdentity() {
        return _portIdentity;
    }
    
    public java.lang.Integer getPortNumber() {
        return _portNumber;
    }
    
    public java.lang.Boolean isFaultyFlag() {
        return _faultyFlag;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TransparentClockPortDsListBuilder setKey(final TransparentClockPortDsListKey value) {
        this._key = value;
        return this;
    }
    
     
    public TransparentClockPortDsListBuilder setLogMinPdelayReqInterval(final java.lang.Byte value) {
        this._logMinPdelayReqInterval = value;
        return this;
    }
    
     
    public TransparentClockPortDsListBuilder setPeerMeanPathDelay(final TimeIntervalType value) {
        this._peerMeanPathDelay = value;
        return this;
    }
    
     
    public TransparentClockPortDsListBuilder setPortIdentity(final PortIdentity value) {
        this._portIdentity = value;
        return this;
    }
    
     
     private static void checkPortNumberRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public TransparentClockPortDsListBuilder setPortNumber(final java.lang.Integer value) {
    if (value != null) {
        checkPortNumberRange(value);
    }
        this._portNumber = value;
        return this;
    }
    
     
    public TransparentClockPortDsListBuilder setFaultyFlag(final java.lang.Boolean value) {
        this._faultyFlag = value;
        return this;
    }
    
    public TransparentClockPortDsListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TransparentClockPortDsListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TransparentClockPortDsList build() {
        return new TransparentClockPortDsListImpl(this);
    }

    private static final class TransparentClockPortDsListImpl implements TransparentClockPortDsList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList.class;
        }

        private final TransparentClockPortDsListKey _key;
        private final java.lang.Byte _logMinPdelayReqInterval;
        private final TimeIntervalType _peerMeanPathDelay;
        private final PortIdentity _portIdentity;
        private final java.lang.Integer _portNumber;
        private final java.lang.Boolean _faultyFlag;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>> augmentation = Collections.emptyMap();

        private TransparentClockPortDsListImpl(TransparentClockPortDsListBuilder base) {
            if (base.getKey() == null) {
                this._key = new TransparentClockPortDsListKey(
                    base.getPortNumber()
                );
                this._portNumber = base.getPortNumber();
            } else {
                this._key = base.getKey();
                this._portNumber = _key.getPortNumber();
            }
            this._logMinPdelayReqInterval = base.getLogMinPdelayReqInterval();
            this._peerMeanPathDelay = base.getPeerMeanPathDelay();
            this._portIdentity = base.getPortIdentity();
            this._faultyFlag = base.isFaultyFlag();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public TransparentClockPortDsListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Byte getLogMinPdelayReqInterval() {
            return _logMinPdelayReqInterval;
        }
        
        @Override
        public TimeIntervalType getPeerMeanPathDelay() {
            return _peerMeanPathDelay;
        }
        
        @Override
        public PortIdentity getPortIdentity() {
            return _portIdentity;
        }
        
        @Override
        public java.lang.Integer getPortNumber() {
            return _portNumber;
        }
        
        @Override
        public java.lang.Boolean isFaultyFlag() {
            return _faultyFlag;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_logMinPdelayReqInterval);
            result = prime * result + Objects.hashCode(_peerMeanPathDelay);
            result = prime * result + Objects.hashCode(_portIdentity);
            result = prime * result + Objects.hashCode(_portNumber);
            result = prime * result + Objects.hashCode(_faultyFlag);
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
            if (!org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList other = (org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_logMinPdelayReqInterval, other.getLogMinPdelayReqInterval())) {
                return false;
            }
            if (!Objects.equals(_peerMeanPathDelay, other.getPeerMeanPathDelay())) {
                return false;
            }
            if (!Objects.equals(_portIdentity, other.getPortIdentity())) {
                return false;
            }
            if (!Objects.equals(_portNumber, other.getPortNumber())) {
                return false;
            }
            if (!Objects.equals(_faultyFlag, other.isFaultyFlag())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TransparentClockPortDsListImpl otherImpl = (TransparentClockPortDsListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockPortDsList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TransparentClockPortDsList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_logMinPdelayReqInterval != null) {
                builder.append("_logMinPdelayReqInterval=");
                builder.append(_logMinPdelayReqInterval);
                builder.append(", ");
            }
            if (_peerMeanPathDelay != null) {
                builder.append("_peerMeanPathDelay=");
                builder.append(_peerMeanPathDelay);
                builder.append(", ");
            }
            if (_portIdentity != null) {
                builder.append("_portIdentity=");
                builder.append(_portIdentity);
                builder.append(", ");
            }
            if (_portNumber != null) {
                builder.append("_portNumber=");
                builder.append(_portNumber);
                builder.append(", ");
            }
            if (_faultyFlag != null) {
                builder.append("_faultyFlag=");
                builder.append(_faultyFlag);
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
