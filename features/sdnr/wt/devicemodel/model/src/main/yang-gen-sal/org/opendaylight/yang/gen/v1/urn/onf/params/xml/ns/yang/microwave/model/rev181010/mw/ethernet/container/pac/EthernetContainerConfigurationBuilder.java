package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.ProblemKindSeverityList;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ethernet.container.configuration.g.SegmentsIdList;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration
 *
 */
public class EthernetContainerConfigurationBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration> {

    private java.lang.String _containerId;
    private java.lang.String _cryptographicKey;
    private List<ProblemKindSeverityList> _problemKindSeverityList;
    private List<SegmentsIdList> _segmentsIdList;
    private java.lang.Boolean _encryptionIsOn;
    private java.lang.Boolean _ipv4CompressionIsOn;
    private java.lang.Boolean _ipv6CompressionIsOn;
    private java.lang.Boolean _layer2CompressionIsOn;
    private java.lang.Boolean _layer4CompressionIsOn;
    private java.lang.Boolean _mplsCompressionIsOn;
    private java.lang.Boolean _packetCompressionIsOn;
    private java.lang.Boolean _performanceMonitoringCollectionIsOn;
    private java.lang.Boolean _qInQCompressionIsOn;
    private java.lang.Boolean _vlanCompressionIsOn;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>> augmentation = Collections.emptyMap();

    public EthernetContainerConfigurationBuilder() {
    }
    public EthernetContainerConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG arg) {
        this._containerId = arg.getContainerId();
        this._segmentsIdList = arg.getSegmentsIdList();
        this._packetCompressionIsOn = arg.isPacketCompressionIsOn();
        this._layer2CompressionIsOn = arg.isLayer2CompressionIsOn();
        this._vlanCompressionIsOn = arg.isVlanCompressionIsOn();
        this._qInQCompressionIsOn = arg.isQInQCompressionIsOn();
        this._mplsCompressionIsOn = arg.isMplsCompressionIsOn();
        this._ipv4CompressionIsOn = arg.isIpv4CompressionIsOn();
        this._ipv6CompressionIsOn = arg.isIpv6CompressionIsOn();
        this._layer4CompressionIsOn = arg.isLayer4CompressionIsOn();
        this._encryptionIsOn = arg.isEncryptionIsOn();
        this._cryptographicKey = arg.getCryptographicKey();
        this._performanceMonitoringCollectionIsOn = arg.isPerformanceMonitoringCollectionIsOn();
        this._problemKindSeverityList = arg.getProblemKindSeverityList();
    }

    public EthernetContainerConfigurationBuilder(EthernetContainerConfiguration base) {
        this._containerId = base.getContainerId();
        this._cryptographicKey = base.getCryptographicKey();
        this._problemKindSeverityList = base.getProblemKindSeverityList();
        this._segmentsIdList = base.getSegmentsIdList();
        this._encryptionIsOn = base.isEncryptionIsOn();
        this._ipv4CompressionIsOn = base.isIpv4CompressionIsOn();
        this._ipv6CompressionIsOn = base.isIpv6CompressionIsOn();
        this._layer2CompressionIsOn = base.isLayer2CompressionIsOn();
        this._layer4CompressionIsOn = base.isLayer4CompressionIsOn();
        this._mplsCompressionIsOn = base.isMplsCompressionIsOn();
        this._packetCompressionIsOn = base.isPacketCompressionIsOn();
        this._performanceMonitoringCollectionIsOn = base.isPerformanceMonitoringCollectionIsOn();
        this._qInQCompressionIsOn = base.isQInQCompressionIsOn();
        this._vlanCompressionIsOn = base.isVlanCompressionIsOn();
        if (base instanceof EthernetContainerConfigurationImpl) {
            EthernetContainerConfigurationImpl impl = (EthernetContainerConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG) {
            this._containerId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).getContainerId();
            this._segmentsIdList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).getSegmentsIdList();
            this._packetCompressionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).isPacketCompressionIsOn();
            this._layer2CompressionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).isLayer2CompressionIsOn();
            this._vlanCompressionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).isVlanCompressionIsOn();
            this._qInQCompressionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).isQInQCompressionIsOn();
            this._mplsCompressionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).isMplsCompressionIsOn();
            this._ipv4CompressionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).isIpv4CompressionIsOn();
            this._ipv6CompressionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).isIpv6CompressionIsOn();
            this._layer4CompressionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).isLayer4CompressionIsOn();
            this._encryptionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).isEncryptionIsOn();
            this._cryptographicKey = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).getCryptographicKey();
            this._performanceMonitoringCollectionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).isPerformanceMonitoringCollectionIsOn();
            this._problemKindSeverityList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG)arg).getProblemKindSeverityList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerConfigurationG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getContainerId() {
        return _containerId;
    }
    
    public java.lang.String getCryptographicKey() {
        return _cryptographicKey;
    }
    
    public List<ProblemKindSeverityList> getProblemKindSeverityList() {
        return _problemKindSeverityList;
    }
    
    public List<SegmentsIdList> getSegmentsIdList() {
        return _segmentsIdList;
    }
    
    public java.lang.Boolean isEncryptionIsOn() {
        return _encryptionIsOn;
    }
    
    public java.lang.Boolean isIpv4CompressionIsOn() {
        return _ipv4CompressionIsOn;
    }
    
    public java.lang.Boolean isIpv6CompressionIsOn() {
        return _ipv6CompressionIsOn;
    }
    
    public java.lang.Boolean isLayer2CompressionIsOn() {
        return _layer2CompressionIsOn;
    }
    
    public java.lang.Boolean isLayer4CompressionIsOn() {
        return _layer4CompressionIsOn;
    }
    
    public java.lang.Boolean isMplsCompressionIsOn() {
        return _mplsCompressionIsOn;
    }
    
    public java.lang.Boolean isPacketCompressionIsOn() {
        return _packetCompressionIsOn;
    }
    
    public java.lang.Boolean isPerformanceMonitoringCollectionIsOn() {
        return _performanceMonitoringCollectionIsOn;
    }
    
    public java.lang.Boolean isQInQCompressionIsOn() {
        return _qInQCompressionIsOn;
    }
    
    public java.lang.Boolean isVlanCompressionIsOn() {
        return _vlanCompressionIsOn;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public EthernetContainerConfigurationBuilder setContainerId(final java.lang.String value) {
        this._containerId = value;
        return this;
    }
    
     
    public EthernetContainerConfigurationBuilder setCryptographicKey(final java.lang.String value) {
        this._cryptographicKey = value;
        return this;
    }
    
     
    public EthernetContainerConfigurationBuilder setProblemKindSeverityList(final List<ProblemKindSeverityList> value) {
        this._problemKindSeverityList = value;
        return this;
    }
    
     
    public EthernetContainerConfigurationBuilder setSegmentsIdList(final List<SegmentsIdList> value) {
        this._segmentsIdList = value;
        return this;
    }
    
     
    public EthernetContainerConfigurationBuilder setEncryptionIsOn(final java.lang.Boolean value) {
        this._encryptionIsOn = value;
        return this;
    }
    
     
    public EthernetContainerConfigurationBuilder setIpv4CompressionIsOn(final java.lang.Boolean value) {
        this._ipv4CompressionIsOn = value;
        return this;
    }
    
     
    public EthernetContainerConfigurationBuilder setIpv6CompressionIsOn(final java.lang.Boolean value) {
        this._ipv6CompressionIsOn = value;
        return this;
    }
    
     
    public EthernetContainerConfigurationBuilder setLayer2CompressionIsOn(final java.lang.Boolean value) {
        this._layer2CompressionIsOn = value;
        return this;
    }
    
     
    public EthernetContainerConfigurationBuilder setLayer4CompressionIsOn(final java.lang.Boolean value) {
        this._layer4CompressionIsOn = value;
        return this;
    }
    
     
    public EthernetContainerConfigurationBuilder setMplsCompressionIsOn(final java.lang.Boolean value) {
        this._mplsCompressionIsOn = value;
        return this;
    }
    
     
    public EthernetContainerConfigurationBuilder setPacketCompressionIsOn(final java.lang.Boolean value) {
        this._packetCompressionIsOn = value;
        return this;
    }
    
     
    public EthernetContainerConfigurationBuilder setPerformanceMonitoringCollectionIsOn(final java.lang.Boolean value) {
        this._performanceMonitoringCollectionIsOn = value;
        return this;
    }
    
     
    public EthernetContainerConfigurationBuilder setQInQCompressionIsOn(final java.lang.Boolean value) {
        this._qInQCompressionIsOn = value;
        return this;
    }
    
     
    public EthernetContainerConfigurationBuilder setVlanCompressionIsOn(final java.lang.Boolean value) {
        this._vlanCompressionIsOn = value;
        return this;
    }
    
    public EthernetContainerConfigurationBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public EthernetContainerConfigurationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public EthernetContainerConfiguration build() {
        return new EthernetContainerConfigurationImpl(this);
    }

    private static final class EthernetContainerConfigurationImpl implements EthernetContainerConfiguration {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration.class;
        }

        private final java.lang.String _containerId;
        private final java.lang.String _cryptographicKey;
        private final List<ProblemKindSeverityList> _problemKindSeverityList;
        private final List<SegmentsIdList> _segmentsIdList;
        private final java.lang.Boolean _encryptionIsOn;
        private final java.lang.Boolean _ipv4CompressionIsOn;
        private final java.lang.Boolean _ipv6CompressionIsOn;
        private final java.lang.Boolean _layer2CompressionIsOn;
        private final java.lang.Boolean _layer4CompressionIsOn;
        private final java.lang.Boolean _mplsCompressionIsOn;
        private final java.lang.Boolean _packetCompressionIsOn;
        private final java.lang.Boolean _performanceMonitoringCollectionIsOn;
        private final java.lang.Boolean _qInQCompressionIsOn;
        private final java.lang.Boolean _vlanCompressionIsOn;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>> augmentation = Collections.emptyMap();

        private EthernetContainerConfigurationImpl(EthernetContainerConfigurationBuilder base) {
            this._containerId = base.getContainerId();
            this._cryptographicKey = base.getCryptographicKey();
            this._problemKindSeverityList = base.getProblemKindSeverityList();
            this._segmentsIdList = base.getSegmentsIdList();
            this._encryptionIsOn = base.isEncryptionIsOn();
            this._ipv4CompressionIsOn = base.isIpv4CompressionIsOn();
            this._ipv6CompressionIsOn = base.isIpv6CompressionIsOn();
            this._layer2CompressionIsOn = base.isLayer2CompressionIsOn();
            this._layer4CompressionIsOn = base.isLayer4CompressionIsOn();
            this._mplsCompressionIsOn = base.isMplsCompressionIsOn();
            this._packetCompressionIsOn = base.isPacketCompressionIsOn();
            this._performanceMonitoringCollectionIsOn = base.isPerformanceMonitoringCollectionIsOn();
            this._qInQCompressionIsOn = base.isQInQCompressionIsOn();
            this._vlanCompressionIsOn = base.isVlanCompressionIsOn();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getContainerId() {
            return _containerId;
        }
        
        @Override
        public java.lang.String getCryptographicKey() {
            return _cryptographicKey;
        }
        
        @Override
        public List<ProblemKindSeverityList> getProblemKindSeverityList() {
            return _problemKindSeverityList;
        }
        
        @Override
        public List<SegmentsIdList> getSegmentsIdList() {
            return _segmentsIdList;
        }
        
        @Override
        public java.lang.Boolean isEncryptionIsOn() {
            return _encryptionIsOn;
        }
        
        @Override
        public java.lang.Boolean isIpv4CompressionIsOn() {
            return _ipv4CompressionIsOn;
        }
        
        @Override
        public java.lang.Boolean isIpv6CompressionIsOn() {
            return _ipv6CompressionIsOn;
        }
        
        @Override
        public java.lang.Boolean isLayer2CompressionIsOn() {
            return _layer2CompressionIsOn;
        }
        
        @Override
        public java.lang.Boolean isLayer4CompressionIsOn() {
            return _layer4CompressionIsOn;
        }
        
        @Override
        public java.lang.Boolean isMplsCompressionIsOn() {
            return _mplsCompressionIsOn;
        }
        
        @Override
        public java.lang.Boolean isPacketCompressionIsOn() {
            return _packetCompressionIsOn;
        }
        
        @Override
        public java.lang.Boolean isPerformanceMonitoringCollectionIsOn() {
            return _performanceMonitoringCollectionIsOn;
        }
        
        @Override
        public java.lang.Boolean isQInQCompressionIsOn() {
            return _qInQCompressionIsOn;
        }
        
        @Override
        public java.lang.Boolean isVlanCompressionIsOn() {
            return _vlanCompressionIsOn;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_containerId);
            result = prime * result + Objects.hashCode(_cryptographicKey);
            result = prime * result + Objects.hashCode(_problemKindSeverityList);
            result = prime * result + Objects.hashCode(_segmentsIdList);
            result = prime * result + Objects.hashCode(_encryptionIsOn);
            result = prime * result + Objects.hashCode(_ipv4CompressionIsOn);
            result = prime * result + Objects.hashCode(_ipv6CompressionIsOn);
            result = prime * result + Objects.hashCode(_layer2CompressionIsOn);
            result = prime * result + Objects.hashCode(_layer4CompressionIsOn);
            result = prime * result + Objects.hashCode(_mplsCompressionIsOn);
            result = prime * result + Objects.hashCode(_packetCompressionIsOn);
            result = prime * result + Objects.hashCode(_performanceMonitoringCollectionIsOn);
            result = prime * result + Objects.hashCode(_qInQCompressionIsOn);
            result = prime * result + Objects.hashCode(_vlanCompressionIsOn);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration)obj;
            if (!Objects.equals(_containerId, other.getContainerId())) {
                return false;
            }
            if (!Objects.equals(_cryptographicKey, other.getCryptographicKey())) {
                return false;
            }
            if (!Objects.equals(_problemKindSeverityList, other.getProblemKindSeverityList())) {
                return false;
            }
            if (!Objects.equals(_segmentsIdList, other.getSegmentsIdList())) {
                return false;
            }
            if (!Objects.equals(_encryptionIsOn, other.isEncryptionIsOn())) {
                return false;
            }
            if (!Objects.equals(_ipv4CompressionIsOn, other.isIpv4CompressionIsOn())) {
                return false;
            }
            if (!Objects.equals(_ipv6CompressionIsOn, other.isIpv6CompressionIsOn())) {
                return false;
            }
            if (!Objects.equals(_layer2CompressionIsOn, other.isLayer2CompressionIsOn())) {
                return false;
            }
            if (!Objects.equals(_layer4CompressionIsOn, other.isLayer4CompressionIsOn())) {
                return false;
            }
            if (!Objects.equals(_mplsCompressionIsOn, other.isMplsCompressionIsOn())) {
                return false;
            }
            if (!Objects.equals(_packetCompressionIsOn, other.isPacketCompressionIsOn())) {
                return false;
            }
            if (!Objects.equals(_performanceMonitoringCollectionIsOn, other.isPerformanceMonitoringCollectionIsOn())) {
                return false;
            }
            if (!Objects.equals(_qInQCompressionIsOn, other.isQInQCompressionIsOn())) {
                return false;
            }
            if (!Objects.equals(_vlanCompressionIsOn, other.isVlanCompressionIsOn())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EthernetContainerConfigurationImpl otherImpl = (EthernetContainerConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerConfiguration>> e : augmentation.entrySet()) {
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
            java.lang.String name = "EthernetContainerConfiguration [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_containerId != null) {
                builder.append("_containerId=");
                builder.append(_containerId);
                builder.append(", ");
            }
            if (_cryptographicKey != null) {
                builder.append("_cryptographicKey=");
                builder.append(_cryptographicKey);
                builder.append(", ");
            }
            if (_problemKindSeverityList != null) {
                builder.append("_problemKindSeverityList=");
                builder.append(_problemKindSeverityList);
                builder.append(", ");
            }
            if (_segmentsIdList != null) {
                builder.append("_segmentsIdList=");
                builder.append(_segmentsIdList);
                builder.append(", ");
            }
            if (_encryptionIsOn != null) {
                builder.append("_encryptionIsOn=");
                builder.append(_encryptionIsOn);
                builder.append(", ");
            }
            if (_ipv4CompressionIsOn != null) {
                builder.append("_ipv4CompressionIsOn=");
                builder.append(_ipv4CompressionIsOn);
                builder.append(", ");
            }
            if (_ipv6CompressionIsOn != null) {
                builder.append("_ipv6CompressionIsOn=");
                builder.append(_ipv6CompressionIsOn);
                builder.append(", ");
            }
            if (_layer2CompressionIsOn != null) {
                builder.append("_layer2CompressionIsOn=");
                builder.append(_layer2CompressionIsOn);
                builder.append(", ");
            }
            if (_layer4CompressionIsOn != null) {
                builder.append("_layer4CompressionIsOn=");
                builder.append(_layer4CompressionIsOn);
                builder.append(", ");
            }
            if (_mplsCompressionIsOn != null) {
                builder.append("_mplsCompressionIsOn=");
                builder.append(_mplsCompressionIsOn);
                builder.append(", ");
            }
            if (_packetCompressionIsOn != null) {
                builder.append("_packetCompressionIsOn=");
                builder.append(_packetCompressionIsOn);
                builder.append(", ");
            }
            if (_performanceMonitoringCollectionIsOn != null) {
                builder.append("_performanceMonitoringCollectionIsOn=");
                builder.append(_performanceMonitoringCollectionIsOn);
                builder.append(", ");
            }
            if (_qInQCompressionIsOn != null) {
                builder.append("_qInQCompressionIsOn=");
                builder.append(_qInQCompressionIsOn);
                builder.append(", ");
            }
            if (_vlanCompressionIsOn != null) {
                builder.append("_vlanCompressionIsOn=");
                builder.append(_vlanCompressionIsOn);
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
