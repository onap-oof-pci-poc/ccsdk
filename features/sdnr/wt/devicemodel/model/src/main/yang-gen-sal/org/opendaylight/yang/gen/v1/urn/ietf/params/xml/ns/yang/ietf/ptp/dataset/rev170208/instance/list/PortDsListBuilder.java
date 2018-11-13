package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DelayMechanismEnumeration;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortStateEnumeration;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimeIntervalType;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.port.ds.entry.PortIdentity;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList
 *
 */
public class PortDsListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList> {

    private java.lang.Short _announceReceiptTimeout;
    private DelayMechanismEnumeration _delayMechanism;
    private PortDsListKey _key;
    private java.lang.Byte _logAnnounceInterval;
    private java.lang.Byte _logMinDelayReqInterval;
    private java.lang.Byte _logMinPdelayReqInterval;
    private java.lang.Byte _logSyncInterval;
    private TimeIntervalType _peerMeanPathDelay;
    private PortIdentity _portIdentity;
    private java.lang.Integer _portNumber;
    private PortStateEnumeration _portState;
    private java.lang.Short _versionNumber;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>> augmentation = Collections.emptyMap();

    public PortDsListBuilder() {
    }
    public PortDsListBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry arg) {
        this._portIdentity = arg.getPortIdentity();
        this._portState = arg.getPortState();
        this._logMinDelayReqInterval = arg.getLogMinDelayReqInterval();
        this._peerMeanPathDelay = arg.getPeerMeanPathDelay();
        this._logAnnounceInterval = arg.getLogAnnounceInterval();
        this._announceReceiptTimeout = arg.getAnnounceReceiptTimeout();
        this._logSyncInterval = arg.getLogSyncInterval();
        this._delayMechanism = arg.getDelayMechanism();
        this._logMinPdelayReqInterval = arg.getLogMinPdelayReqInterval();
        this._versionNumber = arg.getVersionNumber();
    }

    public PortDsListBuilder(PortDsList base) {
        if (base.getKey() == null) {
            this._key = new PortDsListKey(
                base.getPortNumber()
            );
            this._portNumber = base.getPortNumber();
        } else {
            this._key = base.getKey();
            this._portNumber = _key.getPortNumber();
        }
        this._announceReceiptTimeout = base.getAnnounceReceiptTimeout();
        this._delayMechanism = base.getDelayMechanism();
        this._logAnnounceInterval = base.getLogAnnounceInterval();
        this._logMinDelayReqInterval = base.getLogMinDelayReqInterval();
        this._logMinPdelayReqInterval = base.getLogMinPdelayReqInterval();
        this._logSyncInterval = base.getLogSyncInterval();
        this._peerMeanPathDelay = base.getPeerMeanPathDelay();
        this._portIdentity = base.getPortIdentity();
        this._portState = base.getPortState();
        this._versionNumber = base.getVersionNumber();
        if (base instanceof PortDsListImpl) {
            PortDsListImpl impl = (PortDsListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry) {
            this._portIdentity = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry)arg).getPortIdentity();
            this._portState = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry)arg).getPortState();
            this._logMinDelayReqInterval = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry)arg).getLogMinDelayReqInterval();
            this._peerMeanPathDelay = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry)arg).getPeerMeanPathDelay();
            this._logAnnounceInterval = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry)arg).getLogAnnounceInterval();
            this._announceReceiptTimeout = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry)arg).getAnnounceReceiptTimeout();
            this._logSyncInterval = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry)arg).getLogSyncInterval();
            this._delayMechanism = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry)arg).getDelayMechanism();
            this._logMinPdelayReqInterval = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry)arg).getLogMinPdelayReqInterval();
            this._versionNumber = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry)arg).getVersionNumber();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortDsEntry] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getAnnounceReceiptTimeout() {
        return _announceReceiptTimeout;
    }
    
    public DelayMechanismEnumeration getDelayMechanism() {
        return _delayMechanism;
    }
    
    public PortDsListKey getKey() {
        return _key;
    }
    
    public java.lang.Byte getLogAnnounceInterval() {
        return _logAnnounceInterval;
    }
    
    public java.lang.Byte getLogMinDelayReqInterval() {
        return _logMinDelayReqInterval;
    }
    
    public java.lang.Byte getLogMinPdelayReqInterval() {
        return _logMinPdelayReqInterval;
    }
    
    public java.lang.Byte getLogSyncInterval() {
        return _logSyncInterval;
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
    
    public PortStateEnumeration getPortState() {
        return _portState;
    }
    
    public java.lang.Short getVersionNumber() {
        return _versionNumber;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkAnnounceReceiptTimeoutRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public PortDsListBuilder setAnnounceReceiptTimeout(final java.lang.Short value) {
    if (value != null) {
        checkAnnounceReceiptTimeoutRange(value);
    }
        this._announceReceiptTimeout = value;
        return this;
    }
    
     
    public PortDsListBuilder setDelayMechanism(final DelayMechanismEnumeration value) {
        this._delayMechanism = value;
        return this;
    }
    
     
    public PortDsListBuilder setKey(final PortDsListKey value) {
        this._key = value;
        return this;
    }
    
     
    public PortDsListBuilder setLogAnnounceInterval(final java.lang.Byte value) {
        this._logAnnounceInterval = value;
        return this;
    }
    
     
    public PortDsListBuilder setLogMinDelayReqInterval(final java.lang.Byte value) {
        this._logMinDelayReqInterval = value;
        return this;
    }
    
     
    public PortDsListBuilder setLogMinPdelayReqInterval(final java.lang.Byte value) {
        this._logMinPdelayReqInterval = value;
        return this;
    }
    
     
    public PortDsListBuilder setLogSyncInterval(final java.lang.Byte value) {
        this._logSyncInterval = value;
        return this;
    }
    
     
    public PortDsListBuilder setPeerMeanPathDelay(final TimeIntervalType value) {
        this._peerMeanPathDelay = value;
        return this;
    }
    
     
    public PortDsListBuilder setPortIdentity(final PortIdentity value) {
        this._portIdentity = value;
        return this;
    }
    
     
     private static void checkPortNumberRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public PortDsListBuilder setPortNumber(final java.lang.Integer value) {
    if (value != null) {
        checkPortNumberRange(value);
    }
        this._portNumber = value;
        return this;
    }
    
     
    public PortDsListBuilder setPortState(final PortStateEnumeration value) {
        this._portState = value;
        return this;
    }
    
     
     private static void checkVersionNumberRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public PortDsListBuilder setVersionNumber(final java.lang.Short value) {
    if (value != null) {
        checkVersionNumberRange(value);
    }
        this._versionNumber = value;
        return this;
    }
    
    public PortDsListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PortDsListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PortDsList build() {
        return new PortDsListImpl(this);
    }

    private static final class PortDsListImpl implements PortDsList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList.class;
        }

        private final java.lang.Short _announceReceiptTimeout;
        private final DelayMechanismEnumeration _delayMechanism;
        private final PortDsListKey _key;
        private final java.lang.Byte _logAnnounceInterval;
        private final java.lang.Byte _logMinDelayReqInterval;
        private final java.lang.Byte _logMinPdelayReqInterval;
        private final java.lang.Byte _logSyncInterval;
        private final TimeIntervalType _peerMeanPathDelay;
        private final PortIdentity _portIdentity;
        private final java.lang.Integer _portNumber;
        private final PortStateEnumeration _portState;
        private final java.lang.Short _versionNumber;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>> augmentation = Collections.emptyMap();

        private PortDsListImpl(PortDsListBuilder base) {
            if (base.getKey() == null) {
                this._key = new PortDsListKey(
                    base.getPortNumber()
                );
                this._portNumber = base.getPortNumber();
            } else {
                this._key = base.getKey();
                this._portNumber = _key.getPortNumber();
            }
            this._announceReceiptTimeout = base.getAnnounceReceiptTimeout();
            this._delayMechanism = base.getDelayMechanism();
            this._logAnnounceInterval = base.getLogAnnounceInterval();
            this._logMinDelayReqInterval = base.getLogMinDelayReqInterval();
            this._logMinPdelayReqInterval = base.getLogMinPdelayReqInterval();
            this._logSyncInterval = base.getLogSyncInterval();
            this._peerMeanPathDelay = base.getPeerMeanPathDelay();
            this._portIdentity = base.getPortIdentity();
            this._portState = base.getPortState();
            this._versionNumber = base.getVersionNumber();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getAnnounceReceiptTimeout() {
            return _announceReceiptTimeout;
        }
        
        @Override
        public DelayMechanismEnumeration getDelayMechanism() {
            return _delayMechanism;
        }
        
        @Override
        public PortDsListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Byte getLogAnnounceInterval() {
            return _logAnnounceInterval;
        }
        
        @Override
        public java.lang.Byte getLogMinDelayReqInterval() {
            return _logMinDelayReqInterval;
        }
        
        @Override
        public java.lang.Byte getLogMinPdelayReqInterval() {
            return _logMinPdelayReqInterval;
        }
        
        @Override
        public java.lang.Byte getLogSyncInterval() {
            return _logSyncInterval;
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
        public PortStateEnumeration getPortState() {
            return _portState;
        }
        
        @Override
        public java.lang.Short getVersionNumber() {
            return _versionNumber;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_announceReceiptTimeout);
            result = prime * result + Objects.hashCode(_delayMechanism);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_logAnnounceInterval);
            result = prime * result + Objects.hashCode(_logMinDelayReqInterval);
            result = prime * result + Objects.hashCode(_logMinPdelayReqInterval);
            result = prime * result + Objects.hashCode(_logSyncInterval);
            result = prime * result + Objects.hashCode(_peerMeanPathDelay);
            result = prime * result + Objects.hashCode(_portIdentity);
            result = prime * result + Objects.hashCode(_portNumber);
            result = prime * result + Objects.hashCode(_portState);
            result = prime * result + Objects.hashCode(_versionNumber);
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
            if (!org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList other = (org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList)obj;
            if (!Objects.equals(_announceReceiptTimeout, other.getAnnounceReceiptTimeout())) {
                return false;
            }
            if (!Objects.equals(_delayMechanism, other.getDelayMechanism())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_logAnnounceInterval, other.getLogAnnounceInterval())) {
                return false;
            }
            if (!Objects.equals(_logMinDelayReqInterval, other.getLogMinDelayReqInterval())) {
                return false;
            }
            if (!Objects.equals(_logMinPdelayReqInterval, other.getLogMinPdelayReqInterval())) {
                return false;
            }
            if (!Objects.equals(_logSyncInterval, other.getLogSyncInterval())) {
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
            if (!Objects.equals(_portState, other.getPortState())) {
                return false;
            }
            if (!Objects.equals(_versionNumber, other.getVersionNumber())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PortDsListImpl otherImpl = (PortDsListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.PortDsList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PortDsList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_announceReceiptTimeout != null) {
                builder.append("_announceReceiptTimeout=");
                builder.append(_announceReceiptTimeout);
                builder.append(", ");
            }
            if (_delayMechanism != null) {
                builder.append("_delayMechanism=");
                builder.append(_delayMechanism);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_logAnnounceInterval != null) {
                builder.append("_logAnnounceInterval=");
                builder.append(_logAnnounceInterval);
                builder.append(", ");
            }
            if (_logMinDelayReqInterval != null) {
                builder.append("_logMinDelayReqInterval=");
                builder.append(_logMinDelayReqInterval);
                builder.append(", ");
            }
            if (_logMinPdelayReqInterval != null) {
                builder.append("_logMinPdelayReqInterval=");
                builder.append(_logMinPdelayReqInterval);
                builder.append(", ");
            }
            if (_logSyncInterval != null) {
                builder.append("_logSyncInterval=");
                builder.append(_logSyncInterval);
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
            if (_portState != null) {
                builder.append("_portState=");
                builder.append(_portState);
                builder.append(", ");
            }
            if (_versionNumber != null) {
                builder.append("_versionNumber=");
                builder.append(_versionNumber);
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
