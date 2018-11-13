package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.transport.real.time.TransportRealTimePerf;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime
 *
 */
public class TransportRealTimeBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime> {

    private BigInteger _bytesReceived;
    private BigInteger _bytesSent;
    private BigInteger _rcvPackets;
    private BigInteger _sentPackets;
    private TransportRealTimePerf _transportRealTimePerf;
    private java.lang.Boolean _rtcpEnable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>> augmentation = Collections.emptyMap();

    public TransportRealTimeBuilder() {
    }
    public TransportRealTimeBuilder(org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimeG arg) {
        this._rtcpEnable = arg.isRtcpEnable();
        this._sentPackets = arg.getSentPackets();
        this._rcvPackets = arg.getRcvPackets();
        this._bytesSent = arg.getBytesSent();
        this._bytesReceived = arg.getBytesReceived();
    }

    public TransportRealTimeBuilder(TransportRealTime base) {
        this._bytesReceived = base.getBytesReceived();
        this._bytesSent = base.getBytesSent();
        this._rcvPackets = base.getRcvPackets();
        this._sentPackets = base.getSentPackets();
        this._transportRealTimePerf = base.getTransportRealTimePerf();
        this._rtcpEnable = base.isRtcpEnable();
        if (base instanceof TransportRealTimeImpl) {
            TransportRealTimeImpl impl = (TransportRealTimeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimeG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimeG) {
            this._rtcpEnable = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimeG)arg).isRtcpEnable();
            this._sentPackets = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimeG)arg).getSentPackets();
            this._rcvPackets = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimeG)arg).getRcvPackets();
            this._bytesSent = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimeG)arg).getBytesSent();
            this._bytesReceived = ((org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimeG)arg).getBytesReceived();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.TransportRealTimeG] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getBytesReceived() {
        return _bytesReceived;
    }
    
    public BigInteger getBytesSent() {
        return _bytesSent;
    }
    
    public BigInteger getRcvPackets() {
        return _rcvPackets;
    }
    
    public BigInteger getSentPackets() {
        return _sentPackets;
    }
    
    public TransportRealTimePerf getTransportRealTimePerf() {
        return _transportRealTimePerf;
    }
    
    public java.lang.Boolean isRtcpEnable() {
        return _rtcpEnable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKBYTESRECEIVEDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKBYTESRECEIVEDRANGE_RANGES = a;
     }
     private static void checkBytesReceivedRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKBYTESRECEIVEDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKBYTESRECEIVEDRANGE_RANGES)));
     }
    
    public TransportRealTimeBuilder setBytesReceived(final BigInteger value) {
    if (value != null) {
        checkBytesReceivedRange(value);
    }
        this._bytesReceived = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKBYTESSENTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKBYTESSENTRANGE_RANGES = a;
     }
     private static void checkBytesSentRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKBYTESSENTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKBYTESSENTRANGE_RANGES)));
     }
    
    public TransportRealTimeBuilder setBytesSent(final BigInteger value) {
    if (value != null) {
        checkBytesSentRange(value);
    }
        this._bytesSent = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKRCVPACKETSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKRCVPACKETSRANGE_RANGES = a;
     }
     private static void checkRcvPacketsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKRCVPACKETSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKRCVPACKETSRANGE_RANGES)));
     }
    
    public TransportRealTimeBuilder setRcvPackets(final BigInteger value) {
    if (value != null) {
        checkRcvPacketsRange(value);
    }
        this._rcvPackets = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSENTPACKETSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSENTPACKETSRANGE_RANGES = a;
     }
     private static void checkSentPacketsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSENTPACKETSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSENTPACKETSRANGE_RANGES)));
     }
    
    public TransportRealTimeBuilder setSentPackets(final BigInteger value) {
    if (value != null) {
        checkSentPacketsRange(value);
    }
        this._sentPackets = value;
        return this;
    }
    
     
    public TransportRealTimeBuilder setTransportRealTimePerf(final TransportRealTimePerf value) {
        this._transportRealTimePerf = value;
        return this;
    }
    
     
    public TransportRealTimeBuilder setRtcpEnable(final java.lang.Boolean value) {
        this._rtcpEnable = value;
        return this;
    }
    
    public TransportRealTimeBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TransportRealTimeBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TransportRealTime build() {
        return new TransportRealTimeImpl(this);
    }

    private static final class TransportRealTimeImpl implements TransportRealTime {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime.class;
        }

        private final BigInteger _bytesReceived;
        private final BigInteger _bytesSent;
        private final BigInteger _rcvPackets;
        private final BigInteger _sentPackets;
        private final TransportRealTimePerf _transportRealTimePerf;
        private final java.lang.Boolean _rtcpEnable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>> augmentation = Collections.emptyMap();

        private TransportRealTimeImpl(TransportRealTimeBuilder base) {
            this._bytesReceived = base.getBytesReceived();
            this._bytesSent = base.getBytesSent();
            this._rcvPackets = base.getRcvPackets();
            this._sentPackets = base.getSentPackets();
            this._transportRealTimePerf = base.getTransportRealTimePerf();
            this._rtcpEnable = base.isRtcpEnable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getBytesReceived() {
            return _bytesReceived;
        }
        
        @Override
        public BigInteger getBytesSent() {
            return _bytesSent;
        }
        
        @Override
        public BigInteger getRcvPackets() {
            return _rcvPackets;
        }
        
        @Override
        public BigInteger getSentPackets() {
            return _sentPackets;
        }
        
        @Override
        public TransportRealTimePerf getTransportRealTimePerf() {
            return _transportRealTimePerf;
        }
        
        @Override
        public java.lang.Boolean isRtcpEnable() {
            return _rtcpEnable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bytesReceived);
            result = prime * result + Objects.hashCode(_bytesSent);
            result = prime * result + Objects.hashCode(_rcvPackets);
            result = prime * result + Objects.hashCode(_sentPackets);
            result = prime * result + Objects.hashCode(_transportRealTimePerf);
            result = prime * result + Objects.hashCode(_rtcpEnable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime)obj;
            if (!Objects.equals(_bytesReceived, other.getBytesReceived())) {
                return false;
            }
            if (!Objects.equals(_bytesSent, other.getBytesSent())) {
                return false;
            }
            if (!Objects.equals(_rcvPackets, other.getRcvPackets())) {
                return false;
            }
            if (!Objects.equals(_sentPackets, other.getSentPackets())) {
                return false;
            }
            if (!Objects.equals(_transportRealTimePerf, other.getTransportRealTimePerf())) {
                return false;
            }
            if (!Objects.equals(_rtcpEnable, other.isRtcpEnable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TransportRealTimeImpl otherImpl = (TransportRealTimeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TransportRealTime [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bytesReceived != null) {
                builder.append("_bytesReceived=");
                builder.append(_bytesReceived);
                builder.append(", ");
            }
            if (_bytesSent != null) {
                builder.append("_bytesSent=");
                builder.append(_bytesSent);
                builder.append(", ");
            }
            if (_rcvPackets != null) {
                builder.append("_rcvPackets=");
                builder.append(_rcvPackets);
                builder.append(", ");
            }
            if (_sentPackets != null) {
                builder.append("_sentPackets=");
                builder.append(_sentPackets);
                builder.append(", ");
            }
            if (_transportRealTimePerf != null) {
                builder.append("_transportRealTimePerf=");
                builder.append(_transportRealTimePerf);
                builder.append(", ");
            }
            if (_rtcpEnable != null) {
                builder.append("_rtcpEnable=");
                builder.append(_rtcpEnable);
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
