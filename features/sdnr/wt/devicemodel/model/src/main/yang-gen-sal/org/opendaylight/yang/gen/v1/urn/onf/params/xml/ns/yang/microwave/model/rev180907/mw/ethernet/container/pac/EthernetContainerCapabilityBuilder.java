package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability
 *
 */
public class EthernetContainerCapabilityBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability> {

    private List<java.lang.String> _supportedAlarmList;
    private java.lang.String _supportedAlarms;
    private java.lang.Boolean _bundlingIsAvail;
    private java.lang.Boolean _encryptionIsAvail;
    private java.lang.Boolean _ipv4CompressionIsAvail;
    private java.lang.Boolean _ipv6CompressionIsAvail;
    private java.lang.Boolean _layer2CompressionIsAvail;
    private java.lang.Boolean _layer4CompressionIsAvail;
    private java.lang.Boolean _mplsCompressionIsAvail;
    private java.lang.Boolean _packetCompressionIsAvail;
    private java.lang.Boolean _qInQCompressionIsAvail;
    private java.lang.Boolean _vlanCompressionIsAvail;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>> augmentation = Collections.emptyMap();

    public EthernetContainerCapabilityBuilder() {
    }
    public EthernetContainerCapabilityBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG arg) {
        this._bundlingIsAvail = arg.isBundlingIsAvail();
        this._packetCompressionIsAvail = arg.isPacketCompressionIsAvail();
        this._layer2CompressionIsAvail = arg.isLayer2CompressionIsAvail();
        this._vlanCompressionIsAvail = arg.isVlanCompressionIsAvail();
        this._qInQCompressionIsAvail = arg.isQInQCompressionIsAvail();
        this._mplsCompressionIsAvail = arg.isMplsCompressionIsAvail();
        this._ipv4CompressionIsAvail = arg.isIpv4CompressionIsAvail();
        this._ipv6CompressionIsAvail = arg.isIpv6CompressionIsAvail();
        this._layer4CompressionIsAvail = arg.isLayer4CompressionIsAvail();
        this._encryptionIsAvail = arg.isEncryptionIsAvail();
        this._supportedAlarmList = arg.getSupportedAlarmList();
        this._supportedAlarms = arg.getSupportedAlarms();
    }

    public EthernetContainerCapabilityBuilder(EthernetContainerCapability base) {
        this._supportedAlarmList = base.getSupportedAlarmList();
        this._supportedAlarms = base.getSupportedAlarms();
        this._bundlingIsAvail = base.isBundlingIsAvail();
        this._encryptionIsAvail = base.isEncryptionIsAvail();
        this._ipv4CompressionIsAvail = base.isIpv4CompressionIsAvail();
        this._ipv6CompressionIsAvail = base.isIpv6CompressionIsAvail();
        this._layer2CompressionIsAvail = base.isLayer2CompressionIsAvail();
        this._layer4CompressionIsAvail = base.isLayer4CompressionIsAvail();
        this._mplsCompressionIsAvail = base.isMplsCompressionIsAvail();
        this._packetCompressionIsAvail = base.isPacketCompressionIsAvail();
        this._qInQCompressionIsAvail = base.isQInQCompressionIsAvail();
        this._vlanCompressionIsAvail = base.isVlanCompressionIsAvail();
        if (base instanceof EthernetContainerCapabilityImpl) {
            EthernetContainerCapabilityImpl impl = (EthernetContainerCapabilityImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG) {
            this._bundlingIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG)arg).isBundlingIsAvail();
            this._packetCompressionIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG)arg).isPacketCompressionIsAvail();
            this._layer2CompressionIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG)arg).isLayer2CompressionIsAvail();
            this._vlanCompressionIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG)arg).isVlanCompressionIsAvail();
            this._qInQCompressionIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG)arg).isQInQCompressionIsAvail();
            this._mplsCompressionIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG)arg).isMplsCompressionIsAvail();
            this._ipv4CompressionIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG)arg).isIpv4CompressionIsAvail();
            this._ipv6CompressionIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG)arg).isIpv6CompressionIsAvail();
            this._layer4CompressionIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG)arg).isLayer4CompressionIsAvail();
            this._encryptionIsAvail = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG)arg).isEncryptionIsAvail();
            this._supportedAlarmList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG)arg).getSupportedAlarmList();
            this._supportedAlarms = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG)arg).getSupportedAlarms();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCapabilityG] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.String> getSupportedAlarmList() {
        return _supportedAlarmList;
    }
    
    public java.lang.String getSupportedAlarms() {
        return _supportedAlarms;
    }
    
    public java.lang.Boolean isBundlingIsAvail() {
        return _bundlingIsAvail;
    }
    
    public java.lang.Boolean isEncryptionIsAvail() {
        return _encryptionIsAvail;
    }
    
    public java.lang.Boolean isIpv4CompressionIsAvail() {
        return _ipv4CompressionIsAvail;
    }
    
    public java.lang.Boolean isIpv6CompressionIsAvail() {
        return _ipv6CompressionIsAvail;
    }
    
    public java.lang.Boolean isLayer2CompressionIsAvail() {
        return _layer2CompressionIsAvail;
    }
    
    public java.lang.Boolean isLayer4CompressionIsAvail() {
        return _layer4CompressionIsAvail;
    }
    
    public java.lang.Boolean isMplsCompressionIsAvail() {
        return _mplsCompressionIsAvail;
    }
    
    public java.lang.Boolean isPacketCompressionIsAvail() {
        return _packetCompressionIsAvail;
    }
    
    public java.lang.Boolean isQInQCompressionIsAvail() {
        return _qInQCompressionIsAvail;
    }
    
    public java.lang.Boolean isVlanCompressionIsAvail() {
        return _vlanCompressionIsAvail;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public EthernetContainerCapabilityBuilder setSupportedAlarmList(final List<java.lang.String> value) {
        this._supportedAlarmList = value;
        return this;
    }
    
     
    public EthernetContainerCapabilityBuilder setSupportedAlarms(final java.lang.String value) {
        this._supportedAlarms = value;
        return this;
    }
    
     
    public EthernetContainerCapabilityBuilder setBundlingIsAvail(final java.lang.Boolean value) {
        this._bundlingIsAvail = value;
        return this;
    }
    
     
    public EthernetContainerCapabilityBuilder setEncryptionIsAvail(final java.lang.Boolean value) {
        this._encryptionIsAvail = value;
        return this;
    }
    
     
    public EthernetContainerCapabilityBuilder setIpv4CompressionIsAvail(final java.lang.Boolean value) {
        this._ipv4CompressionIsAvail = value;
        return this;
    }
    
     
    public EthernetContainerCapabilityBuilder setIpv6CompressionIsAvail(final java.lang.Boolean value) {
        this._ipv6CompressionIsAvail = value;
        return this;
    }
    
     
    public EthernetContainerCapabilityBuilder setLayer2CompressionIsAvail(final java.lang.Boolean value) {
        this._layer2CompressionIsAvail = value;
        return this;
    }
    
     
    public EthernetContainerCapabilityBuilder setLayer4CompressionIsAvail(final java.lang.Boolean value) {
        this._layer4CompressionIsAvail = value;
        return this;
    }
    
     
    public EthernetContainerCapabilityBuilder setMplsCompressionIsAvail(final java.lang.Boolean value) {
        this._mplsCompressionIsAvail = value;
        return this;
    }
    
     
    public EthernetContainerCapabilityBuilder setPacketCompressionIsAvail(final java.lang.Boolean value) {
        this._packetCompressionIsAvail = value;
        return this;
    }
    
     
    public EthernetContainerCapabilityBuilder setQInQCompressionIsAvail(final java.lang.Boolean value) {
        this._qInQCompressionIsAvail = value;
        return this;
    }
    
     
    public EthernetContainerCapabilityBuilder setVlanCompressionIsAvail(final java.lang.Boolean value) {
        this._vlanCompressionIsAvail = value;
        return this;
    }
    
    public EthernetContainerCapabilityBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public EthernetContainerCapabilityBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public EthernetContainerCapability build() {
        return new EthernetContainerCapabilityImpl(this);
    }

    private static final class EthernetContainerCapabilityImpl implements EthernetContainerCapability {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability.class;
        }

        private final List<java.lang.String> _supportedAlarmList;
        private final java.lang.String _supportedAlarms;
        private final java.lang.Boolean _bundlingIsAvail;
        private final java.lang.Boolean _encryptionIsAvail;
        private final java.lang.Boolean _ipv4CompressionIsAvail;
        private final java.lang.Boolean _ipv6CompressionIsAvail;
        private final java.lang.Boolean _layer2CompressionIsAvail;
        private final java.lang.Boolean _layer4CompressionIsAvail;
        private final java.lang.Boolean _mplsCompressionIsAvail;
        private final java.lang.Boolean _packetCompressionIsAvail;
        private final java.lang.Boolean _qInQCompressionIsAvail;
        private final java.lang.Boolean _vlanCompressionIsAvail;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>> augmentation = Collections.emptyMap();

        private EthernetContainerCapabilityImpl(EthernetContainerCapabilityBuilder base) {
            this._supportedAlarmList = base.getSupportedAlarmList();
            this._supportedAlarms = base.getSupportedAlarms();
            this._bundlingIsAvail = base.isBundlingIsAvail();
            this._encryptionIsAvail = base.isEncryptionIsAvail();
            this._ipv4CompressionIsAvail = base.isIpv4CompressionIsAvail();
            this._ipv6CompressionIsAvail = base.isIpv6CompressionIsAvail();
            this._layer2CompressionIsAvail = base.isLayer2CompressionIsAvail();
            this._layer4CompressionIsAvail = base.isLayer4CompressionIsAvail();
            this._mplsCompressionIsAvail = base.isMplsCompressionIsAvail();
            this._packetCompressionIsAvail = base.isPacketCompressionIsAvail();
            this._qInQCompressionIsAvail = base.isQInQCompressionIsAvail();
            this._vlanCompressionIsAvail = base.isVlanCompressionIsAvail();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.String> getSupportedAlarmList() {
            return _supportedAlarmList;
        }
        
        @Override
        public java.lang.String getSupportedAlarms() {
            return _supportedAlarms;
        }
        
        @Override
        public java.lang.Boolean isBundlingIsAvail() {
            return _bundlingIsAvail;
        }
        
        @Override
        public java.lang.Boolean isEncryptionIsAvail() {
            return _encryptionIsAvail;
        }
        
        @Override
        public java.lang.Boolean isIpv4CompressionIsAvail() {
            return _ipv4CompressionIsAvail;
        }
        
        @Override
        public java.lang.Boolean isIpv6CompressionIsAvail() {
            return _ipv6CompressionIsAvail;
        }
        
        @Override
        public java.lang.Boolean isLayer2CompressionIsAvail() {
            return _layer2CompressionIsAvail;
        }
        
        @Override
        public java.lang.Boolean isLayer4CompressionIsAvail() {
            return _layer4CompressionIsAvail;
        }
        
        @Override
        public java.lang.Boolean isMplsCompressionIsAvail() {
            return _mplsCompressionIsAvail;
        }
        
        @Override
        public java.lang.Boolean isPacketCompressionIsAvail() {
            return _packetCompressionIsAvail;
        }
        
        @Override
        public java.lang.Boolean isQInQCompressionIsAvail() {
            return _qInQCompressionIsAvail;
        }
        
        @Override
        public java.lang.Boolean isVlanCompressionIsAvail() {
            return _vlanCompressionIsAvail;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_supportedAlarmList);
            result = prime * result + Objects.hashCode(_supportedAlarms);
            result = prime * result + Objects.hashCode(_bundlingIsAvail);
            result = prime * result + Objects.hashCode(_encryptionIsAvail);
            result = prime * result + Objects.hashCode(_ipv4CompressionIsAvail);
            result = prime * result + Objects.hashCode(_ipv6CompressionIsAvail);
            result = prime * result + Objects.hashCode(_layer2CompressionIsAvail);
            result = prime * result + Objects.hashCode(_layer4CompressionIsAvail);
            result = prime * result + Objects.hashCode(_mplsCompressionIsAvail);
            result = prime * result + Objects.hashCode(_packetCompressionIsAvail);
            result = prime * result + Objects.hashCode(_qInQCompressionIsAvail);
            result = prime * result + Objects.hashCode(_vlanCompressionIsAvail);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability)obj;
            if (!Objects.equals(_supportedAlarmList, other.getSupportedAlarmList())) {
                return false;
            }
            if (!Objects.equals(_supportedAlarms, other.getSupportedAlarms())) {
                return false;
            }
            if (!Objects.equals(_bundlingIsAvail, other.isBundlingIsAvail())) {
                return false;
            }
            if (!Objects.equals(_encryptionIsAvail, other.isEncryptionIsAvail())) {
                return false;
            }
            if (!Objects.equals(_ipv4CompressionIsAvail, other.isIpv4CompressionIsAvail())) {
                return false;
            }
            if (!Objects.equals(_ipv6CompressionIsAvail, other.isIpv6CompressionIsAvail())) {
                return false;
            }
            if (!Objects.equals(_layer2CompressionIsAvail, other.isLayer2CompressionIsAvail())) {
                return false;
            }
            if (!Objects.equals(_layer4CompressionIsAvail, other.isLayer4CompressionIsAvail())) {
                return false;
            }
            if (!Objects.equals(_mplsCompressionIsAvail, other.isMplsCompressionIsAvail())) {
                return false;
            }
            if (!Objects.equals(_packetCompressionIsAvail, other.isPacketCompressionIsAvail())) {
                return false;
            }
            if (!Objects.equals(_qInQCompressionIsAvail, other.isQInQCompressionIsAvail())) {
                return false;
            }
            if (!Objects.equals(_vlanCompressionIsAvail, other.isVlanCompressionIsAvail())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EthernetContainerCapabilityImpl otherImpl = (EthernetContainerCapabilityImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.ethernet.container.pac.EthernetContainerCapability>> e : augmentation.entrySet()) {
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
            java.lang.String name = "EthernetContainerCapability [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_supportedAlarmList != null) {
                builder.append("_supportedAlarmList=");
                builder.append(_supportedAlarmList);
                builder.append(", ");
            }
            if (_supportedAlarms != null) {
                builder.append("_supportedAlarms=");
                builder.append(_supportedAlarms);
                builder.append(", ");
            }
            if (_bundlingIsAvail != null) {
                builder.append("_bundlingIsAvail=");
                builder.append(_bundlingIsAvail);
                builder.append(", ");
            }
            if (_encryptionIsAvail != null) {
                builder.append("_encryptionIsAvail=");
                builder.append(_encryptionIsAvail);
                builder.append(", ");
            }
            if (_ipv4CompressionIsAvail != null) {
                builder.append("_ipv4CompressionIsAvail=");
                builder.append(_ipv4CompressionIsAvail);
                builder.append(", ");
            }
            if (_ipv6CompressionIsAvail != null) {
                builder.append("_ipv6CompressionIsAvail=");
                builder.append(_ipv6CompressionIsAvail);
                builder.append(", ");
            }
            if (_layer2CompressionIsAvail != null) {
                builder.append("_layer2CompressionIsAvail=");
                builder.append(_layer2CompressionIsAvail);
                builder.append(", ");
            }
            if (_layer4CompressionIsAvail != null) {
                builder.append("_layer4CompressionIsAvail=");
                builder.append(_layer4CompressionIsAvail);
                builder.append(", ");
            }
            if (_mplsCompressionIsAvail != null) {
                builder.append("_mplsCompressionIsAvail=");
                builder.append(_mplsCompressionIsAvail);
                builder.append(", ");
            }
            if (_packetCompressionIsAvail != null) {
                builder.append("_packetCompressionIsAvail=");
                builder.append(_packetCompressionIsAvail);
                builder.append(", ");
            }
            if (_qInQCompressionIsAvail != null) {
                builder.append("_qInQCompressionIsAvail=");
                builder.append(_qInQCompressionIsAvail);
                builder.append(", ");
            }
            if (_vlanCompressionIsAvail != null) {
                builder.append("_vlanCompressionIsAvail=");
                builder.append(_vlanCompressionIsAvail);
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
