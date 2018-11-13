package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG.Status;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc
 *
 */
public class TransportSctpAssocBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc> {

    private DateAndTime _discontinuity;
    private BigInteger _inStreams;
    private TransportSctpAssocKey _key;
    private java.lang.Integer _localPort;
    private BigInteger _outStreams;
    private IpAddress _primaryPeerAddress;
    private DateAndTime _startTime;
    private Status _status;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>> augmentation = Collections.emptyMap();

    public TransportSctpAssocBuilder() {
    }
    public TransportSctpAssocBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG arg) {
        this._status = arg.getStatus();
        this._primaryPeerAddress = arg.getPrimaryPeerAddress();
        this._localPort = arg.getLocalPort();
        this._inStreams = arg.getInStreams();
        this._outStreams = arg.getOutStreams();
        this._startTime = arg.getStartTime();
        this._discontinuity = arg.getDiscontinuity();
    }

    public TransportSctpAssocBuilder(TransportSctpAssoc base) {
        if (base.getKey() == null) {
            this._key = new TransportSctpAssocKey(
                base.getLocalPort(), 
                base.getPrimaryPeerAddress()
            );
            this._localPort = base.getLocalPort();
            this._primaryPeerAddress = base.getPrimaryPeerAddress();
        } else {
            this._key = base.getKey();
            this._localPort = _key.getLocalPort();
            this._primaryPeerAddress = _key.getPrimaryPeerAddress();
        }
        this._discontinuity = base.getDiscontinuity();
        this._inStreams = base.getInStreams();
        this._outStreams = base.getOutStreams();
        this._startTime = base.getStartTime();
        this._status = base.getStatus();
        if (base instanceof TransportSctpAssocImpl) {
            TransportSctpAssocImpl impl = (TransportSctpAssocImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG) {
            this._status = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG)arg).getStatus();
            this._primaryPeerAddress = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG)arg).getPrimaryPeerAddress();
            this._localPort = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG)arg).getLocalPort();
            this._inStreams = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG)arg).getInStreams();
            this._outStreams = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG)arg).getOutStreams();
            this._startTime = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG)arg).getStartTime();
            this._discontinuity = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG)arg).getDiscontinuity();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportSctpAssocG] \n" +
              "but was: " + arg
            );
        }
    }

    public DateAndTime getDiscontinuity() {
        return _discontinuity;
    }
    
    public BigInteger getInStreams() {
        return _inStreams;
    }
    
    public TransportSctpAssocKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getLocalPort() {
        return _localPort;
    }
    
    public BigInteger getOutStreams() {
        return _outStreams;
    }
    
    public IpAddress getPrimaryPeerAddress() {
        return _primaryPeerAddress;
    }
    
    public DateAndTime getStartTime() {
        return _startTime;
    }
    
    public Status getStatus() {
        return _status;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TransportSctpAssocBuilder setDiscontinuity(final DateAndTime value) {
        this._discontinuity = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKINSTREAMSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKINSTREAMSRANGE_RANGES = a;
     }
     private static void checkInStreamsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKINSTREAMSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKINSTREAMSRANGE_RANGES)));
     }
    
    public TransportSctpAssocBuilder setInStreams(final BigInteger value) {
    if (value != null) {
        checkInStreamsRange(value);
    }
        this._inStreams = value;
        return this;
    }
    
     
    public TransportSctpAssocBuilder setKey(final TransportSctpAssocKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void checkLocalPortRange(final int value) {
         if (value >= 0 && value <= 63999) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63999]].", value));
     }
    
    public TransportSctpAssocBuilder setLocalPort(final java.lang.Integer value) {
    if (value != null) {
        checkLocalPortRange(value);
    }
        this._localPort = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKOUTSTREAMSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKOUTSTREAMSRANGE_RANGES = a;
     }
     private static void checkOutStreamsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKOUTSTREAMSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKOUTSTREAMSRANGE_RANGES)));
     }
    
    public TransportSctpAssocBuilder setOutStreams(final BigInteger value) {
    if (value != null) {
        checkOutStreamsRange(value);
    }
        this._outStreams = value;
        return this;
    }
    
     
    public TransportSctpAssocBuilder setPrimaryPeerAddress(final IpAddress value) {
        this._primaryPeerAddress = value;
        return this;
    }
    
     
    public TransportSctpAssocBuilder setStartTime(final DateAndTime value) {
        this._startTime = value;
        return this;
    }
    
     
    public TransportSctpAssocBuilder setStatus(final Status value) {
        this._status = value;
        return this;
    }
    
    public TransportSctpAssocBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TransportSctpAssocBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TransportSctpAssoc build() {
        return new TransportSctpAssocImpl(this);
    }

    private static final class TransportSctpAssocImpl implements TransportSctpAssoc {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc.class;
        }

        private final DateAndTime _discontinuity;
        private final BigInteger _inStreams;
        private final TransportSctpAssocKey _key;
        private final java.lang.Integer _localPort;
        private final BigInteger _outStreams;
        private final IpAddress _primaryPeerAddress;
        private final DateAndTime _startTime;
        private final Status _status;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>> augmentation = Collections.emptyMap();

        private TransportSctpAssocImpl(TransportSctpAssocBuilder base) {
            if (base.getKey() == null) {
                this._key = new TransportSctpAssocKey(
                    base.getLocalPort(), 
                    base.getPrimaryPeerAddress()
                );
                this._localPort = base.getLocalPort();
                this._primaryPeerAddress = base.getPrimaryPeerAddress();
            } else {
                this._key = base.getKey();
                this._localPort = _key.getLocalPort();
                this._primaryPeerAddress = _key.getPrimaryPeerAddress();
            }
            this._discontinuity = base.getDiscontinuity();
            this._inStreams = base.getInStreams();
            this._outStreams = base.getOutStreams();
            this._startTime = base.getStartTime();
            this._status = base.getStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public DateAndTime getDiscontinuity() {
            return _discontinuity;
        }
        
        @Override
        public BigInteger getInStreams() {
            return _inStreams;
        }
        
        @Override
        public TransportSctpAssocKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getLocalPort() {
            return _localPort;
        }
        
        @Override
        public BigInteger getOutStreams() {
            return _outStreams;
        }
        
        @Override
        public IpAddress getPrimaryPeerAddress() {
            return _primaryPeerAddress;
        }
        
        @Override
        public DateAndTime getStartTime() {
            return _startTime;
        }
        
        @Override
        public Status getStatus() {
            return _status;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_discontinuity);
            result = prime * result + Objects.hashCode(_inStreams);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_localPort);
            result = prime * result + Objects.hashCode(_outStreams);
            result = prime * result + Objects.hashCode(_primaryPeerAddress);
            result = prime * result + Objects.hashCode(_startTime);
            result = prime * result + Objects.hashCode(_status);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc)obj;
            if (!Objects.equals(_discontinuity, other.getDiscontinuity())) {
                return false;
            }
            if (!Objects.equals(_inStreams, other.getInStreams())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_localPort, other.getLocalPort())) {
                return false;
            }
            if (!Objects.equals(_outStreams, other.getOutStreams())) {
                return false;
            }
            if (!Objects.equals(_primaryPeerAddress, other.getPrimaryPeerAddress())) {
                return false;
            }
            if (!Objects.equals(_startTime, other.getStartTime())) {
                return false;
            }
            if (!Objects.equals(_status, other.getStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TransportSctpAssocImpl otherImpl = (TransportSctpAssocImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.sctp.TransportSctpAssoc>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TransportSctpAssoc [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_discontinuity != null) {
                builder.append("_discontinuity=");
                builder.append(_discontinuity);
                builder.append(", ");
            }
            if (_inStreams != null) {
                builder.append("_inStreams=");
                builder.append(_inStreams);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_localPort != null) {
                builder.append("_localPort=");
                builder.append(_localPort);
                builder.append(", ");
            }
            if (_outStreams != null) {
                builder.append("_outStreams=");
                builder.append(_outStreams);
                builder.append(", ");
            }
            if (_primaryPeerAddress != null) {
                builder.append("_primaryPeerAddress=");
                builder.append(_primaryPeerAddress);
                builder.append(", ");
            }
            if (_startTime != null) {
                builder.append("_startTime=");
                builder.append(_startTime);
                builder.append(", ");
            }
            if (_status != null) {
                builder.append("_status=");
                builder.append(_status);
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
