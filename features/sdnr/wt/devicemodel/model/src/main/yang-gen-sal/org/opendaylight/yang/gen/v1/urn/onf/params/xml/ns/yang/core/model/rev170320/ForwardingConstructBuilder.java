package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.global._class.g.LocalId;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.label.g.Label;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.g.Name;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.extension.g.Extension;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct
 *
 */
public class ForwardingConstructBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct> {

    private AdministrativeControl _administrativeControl;
    private AdministrativeState _administrativeState;
    private List<Extension> _extension;
    private List<FcPort> _fcPort;
    private List<java.lang.String> _fcRoute;
    private List<FcSwitch> _fcSwitch;
    private ForwardingDirection _forwardingDirection;
    private ForwardingConstructKey _key;
    private List<Label> _label;
    private LayerProtocolName _layerProtocolName;
    private LifecycleState _lifecycleState;
    private List<LocalId> _localId;
    private List<UniversalId> _lowerLevelFc;
    private List<Name> _name;
    private OperationalState _operationalState;
    private java.lang.Long _servicePriority;
    private List<java.lang.String> _supportedLink;
    private UniversalId _uuid;
    private java.lang.Boolean _isProtectionLockOut;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>> augmentation = Collections.emptyMap();

    public ForwardingConstructBuilder() {
    }
    public ForwardingConstructBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG arg) {
        this._layerProtocolName = arg.getLayerProtocolName();
        this._lowerLevelFc = arg.getLowerLevelFc();
        this._fcRoute = arg.getFcRoute();
        this._fcPort = arg.getFcPort();
        this._fcSwitch = arg.getFcSwitch();
        this._forwardingDirection = arg.getForwardingDirection();
        this._isProtectionLockOut = arg.isIsProtectionLockOut();
        this._servicePriority = arg.getServicePriority();
        this._supportedLink = arg.getSupportedLink();
        this._localId = arg.getLocalId();
        this._uuid = arg.getUuid();
        this._name = arg.getName();
        this._operationalState = arg.getOperationalState();
        this._administrativeControl = arg.getAdministrativeControl();
        this._administrativeState = arg.getAdministrativeState();
        this._lifecycleState = arg.getLifecycleState();
        this._extension = arg.getExtension();
        this._label = arg.getLabel();
    }
    public ForwardingConstructBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG arg) {
        this._localId = arg.getLocalId();
        this._uuid = arg.getUuid();
        this._name = arg.getName();
        this._operationalState = arg.getOperationalState();
        this._administrativeControl = arg.getAdministrativeControl();
        this._administrativeState = arg.getAdministrativeState();
        this._lifecycleState = arg.getLifecycleState();
        this._extension = arg.getExtension();
        this._label = arg.getLabel();
    }
    public ForwardingConstructBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG arg) {
        this._name = arg.getName();
    }
    public ForwardingConstructBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG arg) {
        this._operationalState = arg.getOperationalState();
        this._administrativeControl = arg.getAdministrativeControl();
        this._administrativeState = arg.getAdministrativeState();
        this._lifecycleState = arg.getLifecycleState();
    }
    public ForwardingConstructBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG arg) {
        this._extension = arg.getExtension();
    }
    public ForwardingConstructBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG arg) {
        this._label = arg.getLabel();
    }

    public ForwardingConstructBuilder(ForwardingConstruct base) {
        if (base.getKey() == null) {
            this._key = new ForwardingConstructKey(
                base.getUuid()
            );
            this._uuid = base.getUuid();
        } else {
            this._key = base.getKey();
            this._uuid = _key.getUuid();
        }
        this._administrativeControl = base.getAdministrativeControl();
        this._administrativeState = base.getAdministrativeState();
        this._extension = base.getExtension();
        this._fcPort = base.getFcPort();
        this._fcRoute = base.getFcRoute();
        this._fcSwitch = base.getFcSwitch();
        this._forwardingDirection = base.getForwardingDirection();
        this._label = base.getLabel();
        this._layerProtocolName = base.getLayerProtocolName();
        this._lifecycleState = base.getLifecycleState();
        this._localId = base.getLocalId();
        this._lowerLevelFc = base.getLowerLevelFc();
        this._name = base.getName();
        this._operationalState = base.getOperationalState();
        this._servicePriority = base.getServicePriority();
        this._supportedLink = base.getSupportedLink();
        this._isProtectionLockOut = base.isIsProtectionLockOut();
        if (base instanceof ForwardingConstructImpl) {
            ForwardingConstructImpl impl = (ForwardingConstructImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG)arg).getName();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG) {
            this._extension = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG)arg).getExtension();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG) {
            this._operationalState = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG)arg).getOperationalState();
            this._administrativeControl = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG)arg).getAdministrativeControl();
            this._administrativeState = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG)arg).getAdministrativeState();
            this._lifecycleState = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG)arg).getLifecycleState();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG) {
            this._label = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG)arg).getLabel();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG) {
            this._layerProtocolName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG)arg).getLayerProtocolName();
            this._lowerLevelFc = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG)arg).getLowerLevelFc();
            this._fcRoute = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG)arg).getFcRoute();
            this._fcPort = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG)arg).getFcPort();
            this._fcSwitch = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG)arg).getFcSwitch();
            this._forwardingDirection = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG)arg).getForwardingDirection();
            this._isProtectionLockOut = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG)arg).isIsProtectionLockOut();
            this._servicePriority = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG)arg).getServicePriority();
            this._supportedLink = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG)arg).getSupportedLink();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG) {
            this._localId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG)arg).getLocalId();
            this._uuid = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG)arg).getUuid();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstructG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG] \n" +
              "but was: " + arg
            );
        }
    }

    public AdministrativeControl getAdministrativeControl() {
        return _administrativeControl;
    }
    
    public AdministrativeState getAdministrativeState() {
        return _administrativeState;
    }
    
    public List<Extension> getExtension() {
        return _extension;
    }
    
    public List<FcPort> getFcPort() {
        return _fcPort;
    }
    
    public List<java.lang.String> getFcRoute() {
        return _fcRoute;
    }
    
    public List<FcSwitch> getFcSwitch() {
        return _fcSwitch;
    }
    
    public ForwardingDirection getForwardingDirection() {
        return _forwardingDirection;
    }
    
    public ForwardingConstructKey getKey() {
        return _key;
    }
    
    public List<Label> getLabel() {
        return _label;
    }
    
    public LayerProtocolName getLayerProtocolName() {
        return _layerProtocolName;
    }
    
    public LifecycleState getLifecycleState() {
        return _lifecycleState;
    }
    
    public List<LocalId> getLocalId() {
        return _localId;
    }
    
    public List<UniversalId> getLowerLevelFc() {
        return _lowerLevelFc;
    }
    
    public List<Name> getName() {
        return _name;
    }
    
    public OperationalState getOperationalState() {
        return _operationalState;
    }
    
    public java.lang.Long getServicePriority() {
        return _servicePriority;
    }
    
    public List<java.lang.String> getSupportedLink() {
        return _supportedLink;
    }
    
    public UniversalId getUuid() {
        return _uuid;
    }
    
    public java.lang.Boolean isIsProtectionLockOut() {
        return _isProtectionLockOut;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ForwardingConstructBuilder setAdministrativeControl(final AdministrativeControl value) {
        this._administrativeControl = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setAdministrativeState(final AdministrativeState value) {
        this._administrativeState = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setExtension(final List<Extension> value) {
        this._extension = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setFcPort(final List<FcPort> value) {
        this._fcPort = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setFcRoute(final List<java.lang.String> value) {
        this._fcRoute = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setFcSwitch(final List<FcSwitch> value) {
        this._fcSwitch = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setForwardingDirection(final ForwardingDirection value) {
        this._forwardingDirection = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setKey(final ForwardingConstructKey value) {
        this._key = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setLabel(final List<Label> value) {
        this._label = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setLayerProtocolName(final LayerProtocolName value) {
        this._layerProtocolName = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setLifecycleState(final LifecycleState value) {
        this._lifecycleState = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setLocalId(final List<LocalId> value) {
        this._localId = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setLowerLevelFc(final List<UniversalId> value) {
        this._lowerLevelFc = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setName(final List<Name> value) {
        this._name = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setOperationalState(final OperationalState value) {
        this._operationalState = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setServicePriority(final java.lang.Long value) {
        this._servicePriority = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setSupportedLink(final List<java.lang.String> value) {
        this._supportedLink = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setUuid(final UniversalId value) {
        this._uuid = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setIsProtectionLockOut(final java.lang.Boolean value) {
        this._isProtectionLockOut = value;
        return this;
    }
    
    public ForwardingConstructBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ForwardingConstructBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ForwardingConstruct build() {
        return new ForwardingConstructImpl(this);
    }

    private static final class ForwardingConstructImpl implements ForwardingConstruct {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct.class;
        }

        private final AdministrativeControl _administrativeControl;
        private final AdministrativeState _administrativeState;
        private final List<Extension> _extension;
        private final List<FcPort> _fcPort;
        private final List<java.lang.String> _fcRoute;
        private final List<FcSwitch> _fcSwitch;
        private final ForwardingDirection _forwardingDirection;
        private final ForwardingConstructKey _key;
        private final List<Label> _label;
        private final LayerProtocolName _layerProtocolName;
        private final LifecycleState _lifecycleState;
        private final List<LocalId> _localId;
        private final List<UniversalId> _lowerLevelFc;
        private final List<Name> _name;
        private final OperationalState _operationalState;
        private final java.lang.Long _servicePriority;
        private final List<java.lang.String> _supportedLink;
        private final UniversalId _uuid;
        private final java.lang.Boolean _isProtectionLockOut;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>> augmentation = Collections.emptyMap();

        private ForwardingConstructImpl(ForwardingConstructBuilder base) {
            if (base.getKey() == null) {
                this._key = new ForwardingConstructKey(
                    base.getUuid()
                );
                this._uuid = base.getUuid();
            } else {
                this._key = base.getKey();
                this._uuid = _key.getUuid();
            }
            this._administrativeControl = base.getAdministrativeControl();
            this._administrativeState = base.getAdministrativeState();
            this._extension = base.getExtension();
            this._fcPort = base.getFcPort();
            this._fcRoute = base.getFcRoute();
            this._fcSwitch = base.getFcSwitch();
            this._forwardingDirection = base.getForwardingDirection();
            this._label = base.getLabel();
            this._layerProtocolName = base.getLayerProtocolName();
            this._lifecycleState = base.getLifecycleState();
            this._localId = base.getLocalId();
            this._lowerLevelFc = base.getLowerLevelFc();
            this._name = base.getName();
            this._operationalState = base.getOperationalState();
            this._servicePriority = base.getServicePriority();
            this._supportedLink = base.getSupportedLink();
            this._isProtectionLockOut = base.isIsProtectionLockOut();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AdministrativeControl getAdministrativeControl() {
            return _administrativeControl;
        }
        
        @Override
        public AdministrativeState getAdministrativeState() {
            return _administrativeState;
        }
        
        @Override
        public List<Extension> getExtension() {
            return _extension;
        }
        
        @Override
        public List<FcPort> getFcPort() {
            return _fcPort;
        }
        
        @Override
        public List<java.lang.String> getFcRoute() {
            return _fcRoute;
        }
        
        @Override
        public List<FcSwitch> getFcSwitch() {
            return _fcSwitch;
        }
        
        @Override
        public ForwardingDirection getForwardingDirection() {
            return _forwardingDirection;
        }
        
        @Override
        public ForwardingConstructKey getKey() {
            return _key;
        }
        
        @Override
        public List<Label> getLabel() {
            return _label;
        }
        
        @Override
        public LayerProtocolName getLayerProtocolName() {
            return _layerProtocolName;
        }
        
        @Override
        public LifecycleState getLifecycleState() {
            return _lifecycleState;
        }
        
        @Override
        public List<LocalId> getLocalId() {
            return _localId;
        }
        
        @Override
        public List<UniversalId> getLowerLevelFc() {
            return _lowerLevelFc;
        }
        
        @Override
        public List<Name> getName() {
            return _name;
        }
        
        @Override
        public OperationalState getOperationalState() {
            return _operationalState;
        }
        
        @Override
        public java.lang.Long getServicePriority() {
            return _servicePriority;
        }
        
        @Override
        public List<java.lang.String> getSupportedLink() {
            return _supportedLink;
        }
        
        @Override
        public UniversalId getUuid() {
            return _uuid;
        }
        
        @Override
        public java.lang.Boolean isIsProtectionLockOut() {
            return _isProtectionLockOut;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_administrativeControl);
            result = prime * result + Objects.hashCode(_administrativeState);
            result = prime * result + Objects.hashCode(_extension);
            result = prime * result + Objects.hashCode(_fcPort);
            result = prime * result + Objects.hashCode(_fcRoute);
            result = prime * result + Objects.hashCode(_fcSwitch);
            result = prime * result + Objects.hashCode(_forwardingDirection);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_layerProtocolName);
            result = prime * result + Objects.hashCode(_lifecycleState);
            result = prime * result + Objects.hashCode(_localId);
            result = prime * result + Objects.hashCode(_lowerLevelFc);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operationalState);
            result = prime * result + Objects.hashCode(_servicePriority);
            result = prime * result + Objects.hashCode(_supportedLink);
            result = prime * result + Objects.hashCode(_uuid);
            result = prime * result + Objects.hashCode(_isProtectionLockOut);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct)obj;
            if (!Objects.equals(_administrativeControl, other.getAdministrativeControl())) {
                return false;
            }
            if (!Objects.equals(_administrativeState, other.getAdministrativeState())) {
                return false;
            }
            if (!Objects.equals(_extension, other.getExtension())) {
                return false;
            }
            if (!Objects.equals(_fcPort, other.getFcPort())) {
                return false;
            }
            if (!Objects.equals(_fcRoute, other.getFcRoute())) {
                return false;
            }
            if (!Objects.equals(_fcSwitch, other.getFcSwitch())) {
                return false;
            }
            if (!Objects.equals(_forwardingDirection, other.getForwardingDirection())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_layerProtocolName, other.getLayerProtocolName())) {
                return false;
            }
            if (!Objects.equals(_lifecycleState, other.getLifecycleState())) {
                return false;
            }
            if (!Objects.equals(_localId, other.getLocalId())) {
                return false;
            }
            if (!Objects.equals(_lowerLevelFc, other.getLowerLevelFc())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_operationalState, other.getOperationalState())) {
                return false;
            }
            if (!Objects.equals(_servicePriority, other.getServicePriority())) {
                return false;
            }
            if (!Objects.equals(_supportedLink, other.getSupportedLink())) {
                return false;
            }
            if (!Objects.equals(_uuid, other.getUuid())) {
                return false;
            }
            if (!Objects.equals(_isProtectionLockOut, other.isIsProtectionLockOut())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ForwardingConstructImpl otherImpl = (ForwardingConstructImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ForwardingConstruct>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ForwardingConstruct [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_administrativeControl != null) {
                builder.append("_administrativeControl=");
                builder.append(_administrativeControl);
                builder.append(", ");
            }
            if (_administrativeState != null) {
                builder.append("_administrativeState=");
                builder.append(_administrativeState);
                builder.append(", ");
            }
            if (_extension != null) {
                builder.append("_extension=");
                builder.append(_extension);
                builder.append(", ");
            }
            if (_fcPort != null) {
                builder.append("_fcPort=");
                builder.append(_fcPort);
                builder.append(", ");
            }
            if (_fcRoute != null) {
                builder.append("_fcRoute=");
                builder.append(_fcRoute);
                builder.append(", ");
            }
            if (_fcSwitch != null) {
                builder.append("_fcSwitch=");
                builder.append(_fcSwitch);
                builder.append(", ");
            }
            if (_forwardingDirection != null) {
                builder.append("_forwardingDirection=");
                builder.append(_forwardingDirection);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_label != null) {
                builder.append("_label=");
                builder.append(_label);
                builder.append(", ");
            }
            if (_layerProtocolName != null) {
                builder.append("_layerProtocolName=");
                builder.append(_layerProtocolName);
                builder.append(", ");
            }
            if (_lifecycleState != null) {
                builder.append("_lifecycleState=");
                builder.append(_lifecycleState);
                builder.append(", ");
            }
            if (_localId != null) {
                builder.append("_localId=");
                builder.append(_localId);
                builder.append(", ");
            }
            if (_lowerLevelFc != null) {
                builder.append("_lowerLevelFc=");
                builder.append(_lowerLevelFc);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_operationalState != null) {
                builder.append("_operationalState=");
                builder.append(_operationalState);
                builder.append(", ");
            }
            if (_servicePriority != null) {
                builder.append("_servicePriority=");
                builder.append(_servicePriority);
                builder.append(", ");
            }
            if (_supportedLink != null) {
                builder.append("_supportedLink=");
                builder.append(_supportedLink);
                builder.append(", ");
            }
            if (_uuid != null) {
                builder.append("_uuid=");
                builder.append(_uuid);
                builder.append(", ");
            }
            if (_isProtectionLockOut != null) {
                builder.append("_isProtectionLockOut=");
                builder.append(_isProtectionLockOut);
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
