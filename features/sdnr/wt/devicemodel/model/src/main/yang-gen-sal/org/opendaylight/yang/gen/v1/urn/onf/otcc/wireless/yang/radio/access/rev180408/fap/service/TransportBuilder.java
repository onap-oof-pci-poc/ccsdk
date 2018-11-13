package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSctp;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSecurity;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportSip;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportPacket;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.transport.TransportRealTime;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport
 *
 */
public class TransportBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport> {

    private TransportPacket _transportPacket;
    private TransportRealTime _transportRealTime;
    private TransportSctp _transportSctp;
    private TransportSecurity _transportSecurity;
    private TransportSip _transportSip;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>> augmentation = Collections.emptyMap();

    public TransportBuilder() {
    }

    public TransportBuilder(Transport base) {
        this._transportPacket = base.getTransportPacket();
        this._transportRealTime = base.getTransportRealTime();
        this._transportSctp = base.getTransportSctp();
        this._transportSecurity = base.getTransportSecurity();
        this._transportSip = base.getTransportSip();
        if (base instanceof TransportImpl) {
            TransportImpl impl = (TransportImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public TransportPacket getTransportPacket() {
        return _transportPacket;
    }
    
    public TransportRealTime getTransportRealTime() {
        return _transportRealTime;
    }
    
    public TransportSctp getTransportSctp() {
        return _transportSctp;
    }
    
    public TransportSecurity getTransportSecurity() {
        return _transportSecurity;
    }
    
    public TransportSip getTransportSip() {
        return _transportSip;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TransportBuilder setTransportPacket(final TransportPacket value) {
        this._transportPacket = value;
        return this;
    }
    
     
    public TransportBuilder setTransportRealTime(final TransportRealTime value) {
        this._transportRealTime = value;
        return this;
    }
    
     
    public TransportBuilder setTransportSctp(final TransportSctp value) {
        this._transportSctp = value;
        return this;
    }
    
     
    public TransportBuilder setTransportSecurity(final TransportSecurity value) {
        this._transportSecurity = value;
        return this;
    }
    
     
    public TransportBuilder setTransportSip(final TransportSip value) {
        this._transportSip = value;
        return this;
    }
    
    public TransportBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TransportBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Transport build() {
        return new TransportImpl(this);
    }

    private static final class TransportImpl implements Transport {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport.class;
        }

        private final TransportPacket _transportPacket;
        private final TransportRealTime _transportRealTime;
        private final TransportSctp _transportSctp;
        private final TransportSecurity _transportSecurity;
        private final TransportSip _transportSip;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>> augmentation = Collections.emptyMap();

        private TransportImpl(TransportBuilder base) {
            this._transportPacket = base.getTransportPacket();
            this._transportRealTime = base.getTransportRealTime();
            this._transportSctp = base.getTransportSctp();
            this._transportSecurity = base.getTransportSecurity();
            this._transportSip = base.getTransportSip();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public TransportPacket getTransportPacket() {
            return _transportPacket;
        }
        
        @Override
        public TransportRealTime getTransportRealTime() {
            return _transportRealTime;
        }
        
        @Override
        public TransportSctp getTransportSctp() {
            return _transportSctp;
        }
        
        @Override
        public TransportSecurity getTransportSecurity() {
            return _transportSecurity;
        }
        
        @Override
        public TransportSip getTransportSip() {
            return _transportSip;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_transportPacket);
            result = prime * result + Objects.hashCode(_transportRealTime);
            result = prime * result + Objects.hashCode(_transportSctp);
            result = prime * result + Objects.hashCode(_transportSecurity);
            result = prime * result + Objects.hashCode(_transportSip);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport other = (org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport)obj;
            if (!Objects.equals(_transportPacket, other.getTransportPacket())) {
                return false;
            }
            if (!Objects.equals(_transportRealTime, other.getTransportRealTime())) {
                return false;
            }
            if (!Objects.equals(_transportSctp, other.getTransportSctp())) {
                return false;
            }
            if (!Objects.equals(_transportSecurity, other.getTransportSecurity())) {
                return false;
            }
            if (!Objects.equals(_transportSip, other.getTransportSip())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TransportImpl otherImpl = (TransportImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Transport [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_transportPacket != null) {
                builder.append("_transportPacket=");
                builder.append(_transportPacket);
                builder.append(", ");
            }
            if (_transportRealTime != null) {
                builder.append("_transportRealTime=");
                builder.append(_transportRealTime);
                builder.append(", ");
            }
            if (_transportSctp != null) {
                builder.append("_transportSctp=");
                builder.append(_transportSctp);
                builder.append(", ");
            }
            if (_transportSecurity != null) {
                builder.append("_transportSecurity=");
                builder.append(_transportSecurity);
                builder.append(", ");
            }
            if (_transportSip != null) {
                builder.append("_transportSip=");
                builder.append(_transportSip);
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
