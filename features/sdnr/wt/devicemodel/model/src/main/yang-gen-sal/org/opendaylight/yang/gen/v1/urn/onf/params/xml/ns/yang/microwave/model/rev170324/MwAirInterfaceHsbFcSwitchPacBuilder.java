package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac
 *
 */
public class MwAirInterfaceHsbFcSwitchPacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac> {

    private SeverityType _airInterfaceHsbConfigurationIsFaultySeverity;
    private SeverityType _airInterfaceHsbIsDownSeverity;
    private SeverityType _airInterfaceHsbIsPartlyDownSeverity;
    private UniversalId _fcswitch;
    private MwAirInterfaceHsbFcSwitchPacKey _key;
    private ProtectionType _protType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>> augmentation = Collections.emptyMap();

    public MwAirInterfaceHsbFcSwitchPacBuilder() {
    }

    public MwAirInterfaceHsbFcSwitchPacBuilder(MwAirInterfaceHsbFcSwitchPac base) {
        if (base.getKey() == null) {
            this._key = new MwAirInterfaceHsbFcSwitchPacKey(
                base.getFcswitch()
            );
            this._fcswitch = base.getFcswitch();
        } else {
            this._key = base.getKey();
            this._fcswitch = _key.getFcswitch();
        }
        this._airInterfaceHsbConfigurationIsFaultySeverity = base.getAirInterfaceHsbConfigurationIsFaultySeverity();
        this._airInterfaceHsbIsDownSeverity = base.getAirInterfaceHsbIsDownSeverity();
        this._airInterfaceHsbIsPartlyDownSeverity = base.getAirInterfaceHsbIsPartlyDownSeverity();
        this._protType = base.getProtType();
        if (base instanceof MwAirInterfaceHsbFcSwitchPacImpl) {
            MwAirInterfaceHsbFcSwitchPacImpl impl = (MwAirInterfaceHsbFcSwitchPacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public SeverityType getAirInterfaceHsbConfigurationIsFaultySeverity() {
        return _airInterfaceHsbConfigurationIsFaultySeverity;
    }
    
    public SeverityType getAirInterfaceHsbIsDownSeverity() {
        return _airInterfaceHsbIsDownSeverity;
    }
    
    public SeverityType getAirInterfaceHsbIsPartlyDownSeverity() {
        return _airInterfaceHsbIsPartlyDownSeverity;
    }
    
    public UniversalId getFcswitch() {
        return _fcswitch;
    }
    
    public MwAirInterfaceHsbFcSwitchPacKey getKey() {
        return _key;
    }
    
    public ProtectionType getProtType() {
        return _protType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MwAirInterfaceHsbFcSwitchPacBuilder setAirInterfaceHsbConfigurationIsFaultySeverity(final SeverityType value) {
        this._airInterfaceHsbConfigurationIsFaultySeverity = value;
        return this;
    }
    
     
    public MwAirInterfaceHsbFcSwitchPacBuilder setAirInterfaceHsbIsDownSeverity(final SeverityType value) {
        this._airInterfaceHsbIsDownSeverity = value;
        return this;
    }
    
     
    public MwAirInterfaceHsbFcSwitchPacBuilder setAirInterfaceHsbIsPartlyDownSeverity(final SeverityType value) {
        this._airInterfaceHsbIsPartlyDownSeverity = value;
        return this;
    }
    
     
    public MwAirInterfaceHsbFcSwitchPacBuilder setFcswitch(final UniversalId value) {
        this._fcswitch = value;
        return this;
    }
    
     
    public MwAirInterfaceHsbFcSwitchPacBuilder setKey(final MwAirInterfaceHsbFcSwitchPacKey value) {
        this._key = value;
        return this;
    }
    
     
    public MwAirInterfaceHsbFcSwitchPacBuilder setProtType(final ProtectionType value) {
        this._protType = value;
        return this;
    }
    
    public MwAirInterfaceHsbFcSwitchPacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MwAirInterfaceHsbFcSwitchPacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MwAirInterfaceHsbFcSwitchPac build() {
        return new MwAirInterfaceHsbFcSwitchPacImpl(this);
    }

    private static final class MwAirInterfaceHsbFcSwitchPacImpl implements MwAirInterfaceHsbFcSwitchPac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac.class;
        }

        private final SeverityType _airInterfaceHsbConfigurationIsFaultySeverity;
        private final SeverityType _airInterfaceHsbIsDownSeverity;
        private final SeverityType _airInterfaceHsbIsPartlyDownSeverity;
        private final UniversalId _fcswitch;
        private final MwAirInterfaceHsbFcSwitchPacKey _key;
        private final ProtectionType _protType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>> augmentation = Collections.emptyMap();

        private MwAirInterfaceHsbFcSwitchPacImpl(MwAirInterfaceHsbFcSwitchPacBuilder base) {
            if (base.getKey() == null) {
                this._key = new MwAirInterfaceHsbFcSwitchPacKey(
                    base.getFcswitch()
                );
                this._fcswitch = base.getFcswitch();
            } else {
                this._key = base.getKey();
                this._fcswitch = _key.getFcswitch();
            }
            this._airInterfaceHsbConfigurationIsFaultySeverity = base.getAirInterfaceHsbConfigurationIsFaultySeverity();
            this._airInterfaceHsbIsDownSeverity = base.getAirInterfaceHsbIsDownSeverity();
            this._airInterfaceHsbIsPartlyDownSeverity = base.getAirInterfaceHsbIsPartlyDownSeverity();
            this._protType = base.getProtType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public SeverityType getAirInterfaceHsbConfigurationIsFaultySeverity() {
            return _airInterfaceHsbConfigurationIsFaultySeverity;
        }
        
        @Override
        public SeverityType getAirInterfaceHsbIsDownSeverity() {
            return _airInterfaceHsbIsDownSeverity;
        }
        
        @Override
        public SeverityType getAirInterfaceHsbIsPartlyDownSeverity() {
            return _airInterfaceHsbIsPartlyDownSeverity;
        }
        
        @Override
        public UniversalId getFcswitch() {
            return _fcswitch;
        }
        
        @Override
        public MwAirInterfaceHsbFcSwitchPacKey getKey() {
            return _key;
        }
        
        @Override
        public ProtectionType getProtType() {
            return _protType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_airInterfaceHsbConfigurationIsFaultySeverity);
            result = prime * result + Objects.hashCode(_airInterfaceHsbIsDownSeverity);
            result = prime * result + Objects.hashCode(_airInterfaceHsbIsPartlyDownSeverity);
            result = prime * result + Objects.hashCode(_fcswitch);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_protType);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac)obj;
            if (!Objects.equals(_airInterfaceHsbConfigurationIsFaultySeverity, other.getAirInterfaceHsbConfigurationIsFaultySeverity())) {
                return false;
            }
            if (!Objects.equals(_airInterfaceHsbIsDownSeverity, other.getAirInterfaceHsbIsDownSeverity())) {
                return false;
            }
            if (!Objects.equals(_airInterfaceHsbIsPartlyDownSeverity, other.getAirInterfaceHsbIsPartlyDownSeverity())) {
                return false;
            }
            if (!Objects.equals(_fcswitch, other.getFcswitch())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_protType, other.getProtType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MwAirInterfaceHsbFcSwitchPacImpl otherImpl = (MwAirInterfaceHsbFcSwitchPacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfaceHsbFcSwitchPac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MwAirInterfaceHsbFcSwitchPac [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_airInterfaceHsbConfigurationIsFaultySeverity != null) {
                builder.append("_airInterfaceHsbConfigurationIsFaultySeverity=");
                builder.append(_airInterfaceHsbConfigurationIsFaultySeverity);
                builder.append(", ");
            }
            if (_airInterfaceHsbIsDownSeverity != null) {
                builder.append("_airInterfaceHsbIsDownSeverity=");
                builder.append(_airInterfaceHsbIsDownSeverity);
                builder.append(", ");
            }
            if (_airInterfaceHsbIsPartlyDownSeverity != null) {
                builder.append("_airInterfaceHsbIsPartlyDownSeverity=");
                builder.append(_airInterfaceHsbIsPartlyDownSeverity);
                builder.append(", ");
            }
            if (_fcswitch != null) {
                builder.append("_fcswitch=");
                builder.append(_fcswitch);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_protType != null) {
                builder.append("_protType=");
                builder.append(_protType);
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
