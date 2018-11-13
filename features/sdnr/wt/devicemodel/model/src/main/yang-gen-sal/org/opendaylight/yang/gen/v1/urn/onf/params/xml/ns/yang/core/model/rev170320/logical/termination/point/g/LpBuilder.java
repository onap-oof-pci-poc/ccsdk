package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.local._class.g.LocalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeControl;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.label.g.Label;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeState;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LifecycleState;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.g.Name;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.extension.g.Extension;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.TerminationState;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.TerminationDirection;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationalState;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.layer.protocol.g.ConfigAndSwitchController;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp
 *
 */
public class LpBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp> {

    private AdministrativeControl _administrativeControl;
    private AdministrativeState _administrativeState;
    private List<ConfigAndSwitchController> _configAndSwitchController;
    private ToBeDefined _configuredClientCapacity;
    private List<Extension> _extension;
    private java.lang.String _fcBlocksSignalToLp;
    private LpKey _key;
    private List<Label> _label;
    private LayerProtocolName _layerProtocolName;
    private LifecycleState _lifecycleState;
    private List<LocalId> _localId;
    private TerminationDirection _lpDirection;
    private List<Name> _name;
    private OperationalState _operationalState;
    private TerminationState _terminationState;
    private UniversalId _uuid;
    private java.lang.Boolean _isProtectionLockOut;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>> augmentation = Collections.emptyMap();

    public LpBuilder() {
    }
    public LpBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolG arg) {
        this._layerProtocolName = arg.getLayerProtocolName();
        this._configuredClientCapacity = arg.getConfiguredClientCapacity();
        this._lpDirection = arg.getLpDirection();
        this._terminationState = arg.getTerminationState();
        this._configAndSwitchController = arg.getConfigAndSwitchController();
        this._isProtectionLockOut = arg.isIsProtectionLockOut();
        this._fcBlocksSignalToLp = arg.getFcBlocksSignalToLp();
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
    public LpBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG arg) {
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
    public LpBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG arg) {
        this._name = arg.getName();
    }
    public LpBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG arg) {
        this._operationalState = arg.getOperationalState();
        this._administrativeControl = arg.getAdministrativeControl();
        this._administrativeState = arg.getAdministrativeState();
        this._lifecycleState = arg.getLifecycleState();
    }
    public LpBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG arg) {
        this._extension = arg.getExtension();
    }
    public LpBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG arg) {
        this._label = arg.getLabel();
    }

    public LpBuilder(Lp base) {
        if (base.getKey() == null) {
            this._key = new LpKey(
                base.getUuid()
            );
            this._uuid = base.getUuid();
        } else {
            this._key = base.getKey();
            this._uuid = _key.getUuid();
        }
        this._administrativeControl = base.getAdministrativeControl();
        this._administrativeState = base.getAdministrativeState();
        this._configAndSwitchController = base.getConfigAndSwitchController();
        this._configuredClientCapacity = base.getConfiguredClientCapacity();
        this._extension = base.getExtension();
        this._fcBlocksSignalToLp = base.getFcBlocksSignalToLp();
        this._label = base.getLabel();
        this._layerProtocolName = base.getLayerProtocolName();
        this._lifecycleState = base.getLifecycleState();
        this._localId = base.getLocalId();
        this._lpDirection = base.getLpDirection();
        this._name = base.getName();
        this._operationalState = base.getOperationalState();
        this._terminationState = base.getTerminationState();
        this._isProtectionLockOut = base.isIsProtectionLockOut();
        if (base instanceof LpImpl) {
            LpImpl impl = (LpImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG) {
            this._localId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG)arg).getLocalId();
            this._uuid = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG)arg).getUuid();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG) {
            this._extension = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG)arg).getExtension();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolG) {
            this._layerProtocolName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolG)arg).getLayerProtocolName();
            this._configuredClientCapacity = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolG)arg).getConfiguredClientCapacity();
            this._lpDirection = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolG)arg).getLpDirection();
            this._terminationState = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolG)arg).getTerminationState();
            this._configAndSwitchController = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolG)arg).getConfigAndSwitchController();
            this._isProtectionLockOut = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolG)arg).isIsProtectionLockOut();
            this._fcBlocksSignalToLp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolG)arg).getFcBlocksSignalToLp();
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
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LayerProtocolG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG] \n" +
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
    
    public List<ConfigAndSwitchController> getConfigAndSwitchController() {
        return _configAndSwitchController;
    }
    
    public ToBeDefined getConfiguredClientCapacity() {
        return _configuredClientCapacity;
    }
    
    public List<Extension> getExtension() {
        return _extension;
    }
    
    public java.lang.String getFcBlocksSignalToLp() {
        return _fcBlocksSignalToLp;
    }
    
    public LpKey getKey() {
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
    
    public TerminationDirection getLpDirection() {
        return _lpDirection;
    }
    
    public List<Name> getName() {
        return _name;
    }
    
    public OperationalState getOperationalState() {
        return _operationalState;
    }
    
    public TerminationState getTerminationState() {
        return _terminationState;
    }
    
    public UniversalId getUuid() {
        return _uuid;
    }
    
    public java.lang.Boolean isIsProtectionLockOut() {
        return _isProtectionLockOut;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LpBuilder setAdministrativeControl(final AdministrativeControl value) {
        this._administrativeControl = value;
        return this;
    }
    
     
    public LpBuilder setAdministrativeState(final AdministrativeState value) {
        this._administrativeState = value;
        return this;
    }
    
     
    public LpBuilder setConfigAndSwitchController(final List<ConfigAndSwitchController> value) {
        this._configAndSwitchController = value;
        return this;
    }
    
     
    public LpBuilder setConfiguredClientCapacity(final ToBeDefined value) {
        this._configuredClientCapacity = value;
        return this;
    }
    
     
    public LpBuilder setExtension(final List<Extension> value) {
        this._extension = value;
        return this;
    }
    
     
    public LpBuilder setFcBlocksSignalToLp(final java.lang.String value) {
        this._fcBlocksSignalToLp = value;
        return this;
    }
    
     
    public LpBuilder setKey(final LpKey value) {
        this._key = value;
        return this;
    }
    
     
    public LpBuilder setLabel(final List<Label> value) {
        this._label = value;
        return this;
    }
    
     
    public LpBuilder setLayerProtocolName(final LayerProtocolName value) {
        this._layerProtocolName = value;
        return this;
    }
    
     
    public LpBuilder setLifecycleState(final LifecycleState value) {
        this._lifecycleState = value;
        return this;
    }
    
     
    public LpBuilder setLocalId(final List<LocalId> value) {
        this._localId = value;
        return this;
    }
    
     
    public LpBuilder setLpDirection(final TerminationDirection value) {
        this._lpDirection = value;
        return this;
    }
    
     
    public LpBuilder setName(final List<Name> value) {
        this._name = value;
        return this;
    }
    
     
    public LpBuilder setOperationalState(final OperationalState value) {
        this._operationalState = value;
        return this;
    }
    
     
    public LpBuilder setTerminationState(final TerminationState value) {
        this._terminationState = value;
        return this;
    }
    
     
    public LpBuilder setUuid(final UniversalId value) {
        this._uuid = value;
        return this;
    }
    
     
    public LpBuilder setIsProtectionLockOut(final java.lang.Boolean value) {
        this._isProtectionLockOut = value;
        return this;
    }
    
    public LpBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LpBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Lp build() {
        return new LpImpl(this);
    }

    private static final class LpImpl implements Lp {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp.class;
        }

        private final AdministrativeControl _administrativeControl;
        private final AdministrativeState _administrativeState;
        private final List<ConfigAndSwitchController> _configAndSwitchController;
        private final ToBeDefined _configuredClientCapacity;
        private final List<Extension> _extension;
        private final java.lang.String _fcBlocksSignalToLp;
        private final LpKey _key;
        private final List<Label> _label;
        private final LayerProtocolName _layerProtocolName;
        private final LifecycleState _lifecycleState;
        private final List<LocalId> _localId;
        private final TerminationDirection _lpDirection;
        private final List<Name> _name;
        private final OperationalState _operationalState;
        private final TerminationState _terminationState;
        private final UniversalId _uuid;
        private final java.lang.Boolean _isProtectionLockOut;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>> augmentation = Collections.emptyMap();

        private LpImpl(LpBuilder base) {
            if (base.getKey() == null) {
                this._key = new LpKey(
                    base.getUuid()
                );
                this._uuid = base.getUuid();
            } else {
                this._key = base.getKey();
                this._uuid = _key.getUuid();
            }
            this._administrativeControl = base.getAdministrativeControl();
            this._administrativeState = base.getAdministrativeState();
            this._configAndSwitchController = base.getConfigAndSwitchController();
            this._configuredClientCapacity = base.getConfiguredClientCapacity();
            this._extension = base.getExtension();
            this._fcBlocksSignalToLp = base.getFcBlocksSignalToLp();
            this._label = base.getLabel();
            this._layerProtocolName = base.getLayerProtocolName();
            this._lifecycleState = base.getLifecycleState();
            this._localId = base.getLocalId();
            this._lpDirection = base.getLpDirection();
            this._name = base.getName();
            this._operationalState = base.getOperationalState();
            this._terminationState = base.getTerminationState();
            this._isProtectionLockOut = base.isIsProtectionLockOut();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>>singletonMap(e.getKey(), e.getValue());
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
        public List<ConfigAndSwitchController> getConfigAndSwitchController() {
            return _configAndSwitchController;
        }
        
        @Override
        public ToBeDefined getConfiguredClientCapacity() {
            return _configuredClientCapacity;
        }
        
        @Override
        public List<Extension> getExtension() {
            return _extension;
        }
        
        @Override
        public java.lang.String getFcBlocksSignalToLp() {
            return _fcBlocksSignalToLp;
        }
        
        @Override
        public LpKey getKey() {
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
        public TerminationDirection getLpDirection() {
            return _lpDirection;
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
        public TerminationState getTerminationState() {
            return _terminationState;
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_configAndSwitchController);
            result = prime * result + Objects.hashCode(_configuredClientCapacity);
            result = prime * result + Objects.hashCode(_extension);
            result = prime * result + Objects.hashCode(_fcBlocksSignalToLp);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_layerProtocolName);
            result = prime * result + Objects.hashCode(_lifecycleState);
            result = prime * result + Objects.hashCode(_localId);
            result = prime * result + Objects.hashCode(_lpDirection);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operationalState);
            result = prime * result + Objects.hashCode(_terminationState);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp)obj;
            if (!Objects.equals(_administrativeControl, other.getAdministrativeControl())) {
                return false;
            }
            if (!Objects.equals(_administrativeState, other.getAdministrativeState())) {
                return false;
            }
            if (!Objects.equals(_configAndSwitchController, other.getConfigAndSwitchController())) {
                return false;
            }
            if (!Objects.equals(_configuredClientCapacity, other.getConfiguredClientCapacity())) {
                return false;
            }
            if (!Objects.equals(_extension, other.getExtension())) {
                return false;
            }
            if (!Objects.equals(_fcBlocksSignalToLp, other.getFcBlocksSignalToLp())) {
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
            if (!Objects.equals(_lpDirection, other.getLpDirection())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_operationalState, other.getOperationalState())) {
                return false;
            }
            if (!Objects.equals(_terminationState, other.getTerminationState())) {
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
                LpImpl otherImpl = (LpImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.logical.termination.point.g.Lp>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Lp [";
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
            if (_configAndSwitchController != null) {
                builder.append("_configAndSwitchController=");
                builder.append(_configAndSwitchController);
                builder.append(", ");
            }
            if (_configuredClientCapacity != null) {
                builder.append("_configuredClientCapacity=");
                builder.append(_configuredClientCapacity);
                builder.append(", ");
            }
            if (_extension != null) {
                builder.append("_extension=");
                builder.append(_extension);
                builder.append(", ");
            }
            if (_fcBlocksSignalToLp != null) {
                builder.append("_fcBlocksSignalToLp=");
                builder.append(_fcBlocksSignalToLp);
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
            if (_lpDirection != null) {
                builder.append("_lpDirection=");
                builder.append(_lpDirection);
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
            if (_terminationState != null) {
                builder.append("_terminationState=");
                builder.append(_terminationState);
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
