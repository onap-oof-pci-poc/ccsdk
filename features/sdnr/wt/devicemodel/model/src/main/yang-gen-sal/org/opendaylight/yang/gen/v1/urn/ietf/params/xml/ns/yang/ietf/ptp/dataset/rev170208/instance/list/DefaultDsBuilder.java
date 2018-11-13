package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.ClockIdentityType;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208._default.ds.entry.ClockQuality;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs
 *
 */
public class DefaultDsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs> {

    private ClockIdentityType _clockIdentity;
    private ClockQuality _clockQuality;
    private java.lang.Short _domainNumber;
    private java.lang.Integer _numberPorts;
    private java.lang.Short _priority1;
    private java.lang.Short _priority2;
    private java.lang.Boolean _slaveOnly;
    private java.lang.Boolean _twoStepFlag;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>> augmentation = Collections.emptyMap();

    public DefaultDsBuilder() {
    }
    public DefaultDsBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry arg) {
        this._twoStepFlag = arg.isTwoStepFlag();
        this._clockIdentity = arg.getClockIdentity();
        this._numberPorts = arg.getNumberPorts();
        this._clockQuality = arg.getClockQuality();
        this._priority1 = arg.getPriority1();
        this._priority2 = arg.getPriority2();
        this._domainNumber = arg.getDomainNumber();
        this._slaveOnly = arg.isSlaveOnly();
    }

    public DefaultDsBuilder(DefaultDs base) {
        this._clockIdentity = base.getClockIdentity();
        this._clockQuality = base.getClockQuality();
        this._domainNumber = base.getDomainNumber();
        this._numberPorts = base.getNumberPorts();
        this._priority1 = base.getPriority1();
        this._priority2 = base.getPriority2();
        this._slaveOnly = base.isSlaveOnly();
        this._twoStepFlag = base.isTwoStepFlag();
        if (base instanceof DefaultDsImpl) {
            DefaultDsImpl impl = (DefaultDsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry) {
            this._twoStepFlag = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry)arg).isTwoStepFlag();
            this._clockIdentity = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry)arg).getClockIdentity();
            this._numberPorts = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry)arg).getNumberPorts();
            this._clockQuality = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry)arg).getClockQuality();
            this._priority1 = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry)arg).getPriority1();
            this._priority2 = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry)arg).getPriority2();
            this._domainNumber = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry)arg).getDomainNumber();
            this._slaveOnly = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry)arg).isSlaveOnly();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DefaultDsEntry] \n" +
              "but was: " + arg
            );
        }
    }

    public ClockIdentityType getClockIdentity() {
        return _clockIdentity;
    }
    
    public ClockQuality getClockQuality() {
        return _clockQuality;
    }
    
    public java.lang.Short getDomainNumber() {
        return _domainNumber;
    }
    
    public java.lang.Integer getNumberPorts() {
        return _numberPorts;
    }
    
    public java.lang.Short getPriority1() {
        return _priority1;
    }
    
    public java.lang.Short getPriority2() {
        return _priority2;
    }
    
    public java.lang.Boolean isSlaveOnly() {
        return _slaveOnly;
    }
    
    public java.lang.Boolean isTwoStepFlag() {
        return _twoStepFlag;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public DefaultDsBuilder setClockIdentity(final ClockIdentityType value) {
        this._clockIdentity = value;
        return this;
    }
    
     
    public DefaultDsBuilder setClockQuality(final ClockQuality value) {
        this._clockQuality = value;
        return this;
    }
    
     
     private static void checkDomainNumberRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public DefaultDsBuilder setDomainNumber(final java.lang.Short value) {
    if (value != null) {
        checkDomainNumberRange(value);
    }
        this._domainNumber = value;
        return this;
    }
    
     
     private static void checkNumberPortsRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public DefaultDsBuilder setNumberPorts(final java.lang.Integer value) {
    if (value != null) {
        checkNumberPortsRange(value);
    }
        this._numberPorts = value;
        return this;
    }
    
     
     private static void checkPriority1Range(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public DefaultDsBuilder setPriority1(final java.lang.Short value) {
    if (value != null) {
        checkPriority1Range(value);
    }
        this._priority1 = value;
        return this;
    }
    
     
     private static void checkPriority2Range(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public DefaultDsBuilder setPriority2(final java.lang.Short value) {
    if (value != null) {
        checkPriority2Range(value);
    }
        this._priority2 = value;
        return this;
    }
    
     
    public DefaultDsBuilder setSlaveOnly(final java.lang.Boolean value) {
        this._slaveOnly = value;
        return this;
    }
    
     
    public DefaultDsBuilder setTwoStepFlag(final java.lang.Boolean value) {
        this._twoStepFlag = value;
        return this;
    }
    
    public DefaultDsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public DefaultDsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public DefaultDs build() {
        return new DefaultDsImpl(this);
    }

    private static final class DefaultDsImpl implements DefaultDs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs.class;
        }

        private final ClockIdentityType _clockIdentity;
        private final ClockQuality _clockQuality;
        private final java.lang.Short _domainNumber;
        private final java.lang.Integer _numberPorts;
        private final java.lang.Short _priority1;
        private final java.lang.Short _priority2;
        private final java.lang.Boolean _slaveOnly;
        private final java.lang.Boolean _twoStepFlag;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>> augmentation = Collections.emptyMap();

        private DefaultDsImpl(DefaultDsBuilder base) {
            this._clockIdentity = base.getClockIdentity();
            this._clockQuality = base.getClockQuality();
            this._domainNumber = base.getDomainNumber();
            this._numberPorts = base.getNumberPorts();
            this._priority1 = base.getPriority1();
            this._priority2 = base.getPriority2();
            this._slaveOnly = base.isSlaveOnly();
            this._twoStepFlag = base.isTwoStepFlag();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>>singletonMap(e.getKey(), e.getValue());
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
        public ClockQuality getClockQuality() {
            return _clockQuality;
        }
        
        @Override
        public java.lang.Short getDomainNumber() {
            return _domainNumber;
        }
        
        @Override
        public java.lang.Integer getNumberPorts() {
            return _numberPorts;
        }
        
        @Override
        public java.lang.Short getPriority1() {
            return _priority1;
        }
        
        @Override
        public java.lang.Short getPriority2() {
            return _priority2;
        }
        
        @Override
        public java.lang.Boolean isSlaveOnly() {
            return _slaveOnly;
        }
        
        @Override
        public java.lang.Boolean isTwoStepFlag() {
            return _twoStepFlag;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_clockQuality);
            result = prime * result + Objects.hashCode(_domainNumber);
            result = prime * result + Objects.hashCode(_numberPorts);
            result = prime * result + Objects.hashCode(_priority1);
            result = prime * result + Objects.hashCode(_priority2);
            result = prime * result + Objects.hashCode(_slaveOnly);
            result = prime * result + Objects.hashCode(_twoStepFlag);
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
            if (!org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs other = (org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs)obj;
            if (!Objects.equals(_clockIdentity, other.getClockIdentity())) {
                return false;
            }
            if (!Objects.equals(_clockQuality, other.getClockQuality())) {
                return false;
            }
            if (!Objects.equals(_domainNumber, other.getDomainNumber())) {
                return false;
            }
            if (!Objects.equals(_numberPorts, other.getNumberPorts())) {
                return false;
            }
            if (!Objects.equals(_priority1, other.getPriority1())) {
                return false;
            }
            if (!Objects.equals(_priority2, other.getPriority2())) {
                return false;
            }
            if (!Objects.equals(_slaveOnly, other.isSlaveOnly())) {
                return false;
            }
            if (!Objects.equals(_twoStepFlag, other.isTwoStepFlag())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DefaultDsImpl otherImpl = (DefaultDsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.instance.list.DefaultDs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "DefaultDs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_clockIdentity != null) {
                builder.append("_clockIdentity=");
                builder.append(_clockIdentity);
                builder.append(", ");
            }
            if (_clockQuality != null) {
                builder.append("_clockQuality=");
                builder.append(_clockQuality);
                builder.append(", ");
            }
            if (_domainNumber != null) {
                builder.append("_domainNumber=");
                builder.append(_domainNumber);
                builder.append(", ");
            }
            if (_numberPorts != null) {
                builder.append("_numberPorts=");
                builder.append(_numberPorts);
                builder.append(", ");
            }
            if (_priority1 != null) {
                builder.append("_priority1=");
                builder.append(_priority1);
                builder.append(", ");
            }
            if (_priority2 != null) {
                builder.append("_priority2=");
                builder.append(_priority2);
                builder.append(", ");
            }
            if (_slaveOnly != null) {
                builder.append("_slaveOnly=");
                builder.append(_slaveOnly);
                builder.append(", ");
            }
            if (_twoStepFlag != null) {
                builder.append("_twoStepFlag=");
                builder.append(_twoStepFlag);
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
