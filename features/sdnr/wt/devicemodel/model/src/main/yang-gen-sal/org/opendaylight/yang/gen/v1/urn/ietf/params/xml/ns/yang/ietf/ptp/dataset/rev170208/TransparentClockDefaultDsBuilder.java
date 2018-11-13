package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs
 *
 */
public class TransparentClockDefaultDsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs> {

    private ClockIdentityType _clockIdentity;
    private DelayMechanismEnumeration _delayMechanism;
    private java.lang.Integer _numberPorts;
    private java.lang.Short _primaryDomain;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>> augmentation = Collections.emptyMap();

    public TransparentClockDefaultDsBuilder() {
    }
    public TransparentClockDefaultDsBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDsEntry arg) {
        this._clockIdentity = arg.getClockIdentity();
        this._numberPorts = arg.getNumberPorts();
        this._delayMechanism = arg.getDelayMechanism();
        this._primaryDomain = arg.getPrimaryDomain();
    }

    public TransparentClockDefaultDsBuilder(TransparentClockDefaultDs base) {
        this._clockIdentity = base.getClockIdentity();
        this._delayMechanism = base.getDelayMechanism();
        this._numberPorts = base.getNumberPorts();
        this._primaryDomain = base.getPrimaryDomain();
        if (base instanceof TransparentClockDefaultDsImpl) {
            TransparentClockDefaultDsImpl impl = (TransparentClockDefaultDsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDsEntry</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDsEntry) {
            this._clockIdentity = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDsEntry)arg).getClockIdentity();
            this._numberPorts = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDsEntry)arg).getNumberPorts();
            this._delayMechanism = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDsEntry)arg).getDelayMechanism();
            this._primaryDomain = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDsEntry)arg).getPrimaryDomain();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDsEntry] \n" +
              "but was: " + arg
            );
        }
    }

    public ClockIdentityType getClockIdentity() {
        return _clockIdentity;
    }
    
    public DelayMechanismEnumeration getDelayMechanism() {
        return _delayMechanism;
    }
    
    public java.lang.Integer getNumberPorts() {
        return _numberPorts;
    }
    
    public java.lang.Short getPrimaryDomain() {
        return _primaryDomain;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TransparentClockDefaultDsBuilder setClockIdentity(final ClockIdentityType value) {
        this._clockIdentity = value;
        return this;
    }
    
     
    public TransparentClockDefaultDsBuilder setDelayMechanism(final DelayMechanismEnumeration value) {
        this._delayMechanism = value;
        return this;
    }
    
     
     private static void checkNumberPortsRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public TransparentClockDefaultDsBuilder setNumberPorts(final java.lang.Integer value) {
    if (value != null) {
        checkNumberPortsRange(value);
    }
        this._numberPorts = value;
        return this;
    }
    
     
     private static void checkPrimaryDomainRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public TransparentClockDefaultDsBuilder setPrimaryDomain(final java.lang.Short value) {
    if (value != null) {
        checkPrimaryDomainRange(value);
    }
        this._primaryDomain = value;
        return this;
    }
    
    public TransparentClockDefaultDsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TransparentClockDefaultDsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TransparentClockDefaultDs build() {
        return new TransparentClockDefaultDsImpl(this);
    }

    private static final class TransparentClockDefaultDsImpl implements TransparentClockDefaultDs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs.class;
        }

        private final ClockIdentityType _clockIdentity;
        private final DelayMechanismEnumeration _delayMechanism;
        private final java.lang.Integer _numberPorts;
        private final java.lang.Short _primaryDomain;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>> augmentation = Collections.emptyMap();

        private TransparentClockDefaultDsImpl(TransparentClockDefaultDsBuilder base) {
            this._clockIdentity = base.getClockIdentity();
            this._delayMechanism = base.getDelayMechanism();
            this._numberPorts = base.getNumberPorts();
            this._primaryDomain = base.getPrimaryDomain();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ClockIdentityType getClockIdentity() {
            return _clockIdentity;
        }
        
        @Override
        public DelayMechanismEnumeration getDelayMechanism() {
            return _delayMechanism;
        }
        
        @Override
        public java.lang.Integer getNumberPorts() {
            return _numberPorts;
        }
        
        @Override
        public java.lang.Short getPrimaryDomain() {
            return _primaryDomain;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_clockIdentity);
            result = prime * result + Objects.hashCode(_delayMechanism);
            result = prime * result + Objects.hashCode(_numberPorts);
            result = prime * result + Objects.hashCode(_primaryDomain);
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
            if (!org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs other = (org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs)obj;
            if (!Objects.equals(_clockIdentity, other.getClockIdentity())) {
                return false;
            }
            if (!Objects.equals(_delayMechanism, other.getDelayMechanism())) {
                return false;
            }
            if (!Objects.equals(_numberPorts, other.getNumberPorts())) {
                return false;
            }
            if (!Objects.equals(_primaryDomain, other.getPrimaryDomain())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TransparentClockDefaultDsImpl otherImpl = (TransparentClockDefaultDsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TransparentClockDefaultDs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TransparentClockDefaultDs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_clockIdentity != null) {
                builder.append("_clockIdentity=");
                builder.append(_clockIdentity);
                builder.append(", ");
            }
            if (_delayMechanism != null) {
                builder.append("_delayMechanism=");
                builder.append(_delayMechanism);
                builder.append(", ");
            }
            if (_numberPorts != null) {
                builder.append("_numberPorts=");
                builder.append(_numberPorts);
                builder.append(", ");
            }
            if (_primaryDomain != null) {
                builder.append("_primaryDomain=");
                builder.append(_primaryDomain);
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
