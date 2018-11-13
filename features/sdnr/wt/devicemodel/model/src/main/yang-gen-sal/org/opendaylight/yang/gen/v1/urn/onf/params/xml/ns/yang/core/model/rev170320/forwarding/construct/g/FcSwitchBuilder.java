package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ProtectionType;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.label.g.Label;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LifecycleState;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.g.Name;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationalState;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.SwitchStateReason;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.local._class.g.LocalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeControl;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeState;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.SwitchControl;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.extension.g.Extension;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ReversionMode;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PortDirection;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.ControlParameters;
import java.util.Objects;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch
 *
 */
public class FcSwitchBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch> {

    private AdministrativeControl _administrativeControl;
    private AdministrativeState _administrativeState;
    private ControlParameters _controlParameters;
    private List<Extension> _extension;
    private java.lang.Long _holdOffTime;
    private InternalConfigurationAndSwitchControl _internalConfigurationAndSwitchControl;
    private FcSwitchKey _key;
    private List<Label> _label;
    private LifecycleState _lifecycleState;
    private List<LocalId> _localId;
    private List<Name> _name;
    private OperationalState _operationalState;
    private List<java.lang.String> _profileProxy;
    private ProtectionType _protType;
    private ReversionMode _reversionMode;
    private List<UniversalId> _selectedFcPort;
    private SwitchControl _switchControl;
    private SwitchStateReason _switchSelectionReason;
    private PortDirection _switchSelectsPorts;
    private UniversalId _uuid;
    private java.lang.Long _waitToRestoreTime;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>> augmentation = Collections.emptyMap();

    public FcSwitchBuilder() {
    }
    public FcSwitchBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG arg) {
        this._holdOffTime = arg.getHoldOffTime();
        this._protType = arg.getProtType();
        this._reversionMode = arg.getReversionMode();
        this._selectedFcPort = arg.getSelectedFcPort();
        this._profileProxy = arg.getProfileProxy();
        this._internalConfigurationAndSwitchControl = arg.getInternalConfigurationAndSwitchControl();
        this._switchControl = arg.getSwitchControl();
        this._switchSelectsPorts = arg.getSwitchSelectsPorts();
        this._switchSelectionReason = arg.getSwitchSelectionReason();
        this._controlParameters = arg.getControlParameters();
        this._waitToRestoreTime = arg.getWaitToRestoreTime();
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
    public FcSwitchBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG arg) {
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
    public FcSwitchBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG arg) {
        this._name = arg.getName();
    }
    public FcSwitchBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG arg) {
        this._operationalState = arg.getOperationalState();
        this._administrativeControl = arg.getAdministrativeControl();
        this._administrativeState = arg.getAdministrativeState();
        this._lifecycleState = arg.getLifecycleState();
    }
    public FcSwitchBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG arg) {
        this._extension = arg.getExtension();
    }
    public FcSwitchBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG arg) {
        this._label = arg.getLabel();
    }

    public FcSwitchBuilder(FcSwitch base) {
        if (base.getKey() == null) {
            this._key = new FcSwitchKey(
                base.getUuid()
            );
            this._uuid = base.getUuid();
        } else {
            this._key = base.getKey();
            this._uuid = _key.getUuid();
        }
        this._administrativeControl = base.getAdministrativeControl();
        this._administrativeState = base.getAdministrativeState();
        this._controlParameters = base.getControlParameters();
        this._extension = base.getExtension();
        this._holdOffTime = base.getHoldOffTime();
        this._internalConfigurationAndSwitchControl = base.getInternalConfigurationAndSwitchControl();
        this._label = base.getLabel();
        this._lifecycleState = base.getLifecycleState();
        this._localId = base.getLocalId();
        this._name = base.getName();
        this._operationalState = base.getOperationalState();
        this._profileProxy = base.getProfileProxy();
        this._protType = base.getProtType();
        this._reversionMode = base.getReversionMode();
        this._selectedFcPort = base.getSelectedFcPort();
        this._switchControl = base.getSwitchControl();
        this._switchSelectionReason = base.getSwitchSelectionReason();
        this._switchSelectsPorts = base.getSwitchSelectsPorts();
        this._waitToRestoreTime = base.getWaitToRestoreTime();
        if (base instanceof FcSwitchImpl) {
            FcSwitchImpl impl = (FcSwitchImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>) base;
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
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG) {
            this._holdOffTime = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG)arg).getHoldOffTime();
            this._protType = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG)arg).getProtType();
            this._reversionMode = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG)arg).getReversionMode();
            this._selectedFcPort = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG)arg).getSelectedFcPort();
            this._profileProxy = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG)arg).getProfileProxy();
            this._internalConfigurationAndSwitchControl = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG)arg).getInternalConfigurationAndSwitchControl();
            this._switchControl = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG)arg).getSwitchControl();
            this._switchSelectsPorts = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG)arg).getSwitchSelectsPorts();
            this._switchSelectionReason = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG)arg).getSwitchSelectionReason();
            this._controlParameters = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG)arg).getControlParameters();
            this._waitToRestoreTime = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG)arg).getWaitToRestoreTime();
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
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcSwitchG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG] \n" +
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
    
    public ControlParameters getControlParameters() {
        return _controlParameters;
    }
    
    public List<Extension> getExtension() {
        return _extension;
    }
    
    public java.lang.Long getHoldOffTime() {
        return _holdOffTime;
    }
    
    public InternalConfigurationAndSwitchControl getInternalConfigurationAndSwitchControl() {
        return _internalConfigurationAndSwitchControl;
    }
    
    public FcSwitchKey getKey() {
        return _key;
    }
    
    public List<Label> getLabel() {
        return _label;
    }
    
    public LifecycleState getLifecycleState() {
        return _lifecycleState;
    }
    
    public List<LocalId> getLocalId() {
        return _localId;
    }
    
    public List<Name> getName() {
        return _name;
    }
    
    public OperationalState getOperationalState() {
        return _operationalState;
    }
    
    public List<java.lang.String> getProfileProxy() {
        return _profileProxy;
    }
    
    public ProtectionType getProtType() {
        return _protType;
    }
    
    public ReversionMode getReversionMode() {
        return _reversionMode;
    }
    
    public List<UniversalId> getSelectedFcPort() {
        return _selectedFcPort;
    }
    
    public SwitchControl getSwitchControl() {
        return _switchControl;
    }
    
    public SwitchStateReason getSwitchSelectionReason() {
        return _switchSelectionReason;
    }
    
    public PortDirection getSwitchSelectsPorts() {
        return _switchSelectsPorts;
    }
    
    public UniversalId getUuid() {
        return _uuid;
    }
    
    public java.lang.Long getWaitToRestoreTime() {
        return _waitToRestoreTime;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FcSwitchBuilder setAdministrativeControl(final AdministrativeControl value) {
        this._administrativeControl = value;
        return this;
    }
    
     
    public FcSwitchBuilder setAdministrativeState(final AdministrativeState value) {
        this._administrativeState = value;
        return this;
    }
    
     
    public FcSwitchBuilder setControlParameters(final ControlParameters value) {
        this._controlParameters = value;
        return this;
    }
    
     
    public FcSwitchBuilder setExtension(final List<Extension> value) {
        this._extension = value;
        return this;
    }
    
     
    public FcSwitchBuilder setHoldOffTime(final java.lang.Long value) {
        this._holdOffTime = value;
        return this;
    }
    
     
    public FcSwitchBuilder setInternalConfigurationAndSwitchControl(final InternalConfigurationAndSwitchControl value) {
        this._internalConfigurationAndSwitchControl = value;
        return this;
    }
    
     
    public FcSwitchBuilder setKey(final FcSwitchKey value) {
        this._key = value;
        return this;
    }
    
     
    public FcSwitchBuilder setLabel(final List<Label> value) {
        this._label = value;
        return this;
    }
    
     
    public FcSwitchBuilder setLifecycleState(final LifecycleState value) {
        this._lifecycleState = value;
        return this;
    }
    
     
    public FcSwitchBuilder setLocalId(final List<LocalId> value) {
        this._localId = value;
        return this;
    }
    
     
    public FcSwitchBuilder setName(final List<Name> value) {
        this._name = value;
        return this;
    }
    
     
    public FcSwitchBuilder setOperationalState(final OperationalState value) {
        this._operationalState = value;
        return this;
    }
    
     
    public FcSwitchBuilder setProfileProxy(final List<java.lang.String> value) {
        this._profileProxy = value;
        return this;
    }
    
     
    public FcSwitchBuilder setProtType(final ProtectionType value) {
        this._protType = value;
        return this;
    }
    
     
    public FcSwitchBuilder setReversionMode(final ReversionMode value) {
        this._reversionMode = value;
        return this;
    }
    
     
    public FcSwitchBuilder setSelectedFcPort(final List<UniversalId> value) {
        this._selectedFcPort = value;
        return this;
    }
    
     
    public FcSwitchBuilder setSwitchControl(final SwitchControl value) {
        this._switchControl = value;
        return this;
    }
    
     
    public FcSwitchBuilder setSwitchSelectionReason(final SwitchStateReason value) {
        this._switchSelectionReason = value;
        return this;
    }
    
     
    public FcSwitchBuilder setSwitchSelectsPorts(final PortDirection value) {
        this._switchSelectsPorts = value;
        return this;
    }
    
     
    public FcSwitchBuilder setUuid(final UniversalId value) {
        this._uuid = value;
        return this;
    }
    
     
    public FcSwitchBuilder setWaitToRestoreTime(final java.lang.Long value) {
        this._waitToRestoreTime = value;
        return this;
    }
    
    public FcSwitchBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FcSwitchBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FcSwitch build() {
        return new FcSwitchImpl(this);
    }

    private static final class FcSwitchImpl implements FcSwitch {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch.class;
        }

        private final AdministrativeControl _administrativeControl;
        private final AdministrativeState _administrativeState;
        private final ControlParameters _controlParameters;
        private final List<Extension> _extension;
        private final java.lang.Long _holdOffTime;
        private final InternalConfigurationAndSwitchControl _internalConfigurationAndSwitchControl;
        private final FcSwitchKey _key;
        private final List<Label> _label;
        private final LifecycleState _lifecycleState;
        private final List<LocalId> _localId;
        private final List<Name> _name;
        private final OperationalState _operationalState;
        private final List<java.lang.String> _profileProxy;
        private final ProtectionType _protType;
        private final ReversionMode _reversionMode;
        private final List<UniversalId> _selectedFcPort;
        private final SwitchControl _switchControl;
        private final SwitchStateReason _switchSelectionReason;
        private final PortDirection _switchSelectsPorts;
        private final UniversalId _uuid;
        private final java.lang.Long _waitToRestoreTime;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>> augmentation = Collections.emptyMap();

        private FcSwitchImpl(FcSwitchBuilder base) {
            if (base.getKey() == null) {
                this._key = new FcSwitchKey(
                    base.getUuid()
                );
                this._uuid = base.getUuid();
            } else {
                this._key = base.getKey();
                this._uuid = _key.getUuid();
            }
            this._administrativeControl = base.getAdministrativeControl();
            this._administrativeState = base.getAdministrativeState();
            this._controlParameters = base.getControlParameters();
            this._extension = base.getExtension();
            this._holdOffTime = base.getHoldOffTime();
            this._internalConfigurationAndSwitchControl = base.getInternalConfigurationAndSwitchControl();
            this._label = base.getLabel();
            this._lifecycleState = base.getLifecycleState();
            this._localId = base.getLocalId();
            this._name = base.getName();
            this._operationalState = base.getOperationalState();
            this._profileProxy = base.getProfileProxy();
            this._protType = base.getProtType();
            this._reversionMode = base.getReversionMode();
            this._selectedFcPort = base.getSelectedFcPort();
            this._switchControl = base.getSwitchControl();
            this._switchSelectionReason = base.getSwitchSelectionReason();
            this._switchSelectsPorts = base.getSwitchSelectsPorts();
            this._waitToRestoreTime = base.getWaitToRestoreTime();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>>singletonMap(e.getKey(), e.getValue());
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
        public ControlParameters getControlParameters() {
            return _controlParameters;
        }
        
        @Override
        public List<Extension> getExtension() {
            return _extension;
        }
        
        @Override
        public java.lang.Long getHoldOffTime() {
            return _holdOffTime;
        }
        
        @Override
        public InternalConfigurationAndSwitchControl getInternalConfigurationAndSwitchControl() {
            return _internalConfigurationAndSwitchControl;
        }
        
        @Override
        public FcSwitchKey getKey() {
            return _key;
        }
        
        @Override
        public List<Label> getLabel() {
            return _label;
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
        public List<Name> getName() {
            return _name;
        }
        
        @Override
        public OperationalState getOperationalState() {
            return _operationalState;
        }
        
        @Override
        public List<java.lang.String> getProfileProxy() {
            return _profileProxy;
        }
        
        @Override
        public ProtectionType getProtType() {
            return _protType;
        }
        
        @Override
        public ReversionMode getReversionMode() {
            return _reversionMode;
        }
        
        @Override
        public List<UniversalId> getSelectedFcPort() {
            return _selectedFcPort;
        }
        
        @Override
        public SwitchControl getSwitchControl() {
            return _switchControl;
        }
        
        @Override
        public SwitchStateReason getSwitchSelectionReason() {
            return _switchSelectionReason;
        }
        
        @Override
        public PortDirection getSwitchSelectsPorts() {
            return _switchSelectsPorts;
        }
        
        @Override
        public UniversalId getUuid() {
            return _uuid;
        }
        
        @Override
        public java.lang.Long getWaitToRestoreTime() {
            return _waitToRestoreTime;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_controlParameters);
            result = prime * result + Objects.hashCode(_extension);
            result = prime * result + Objects.hashCode(_holdOffTime);
            result = prime * result + Objects.hashCode(_internalConfigurationAndSwitchControl);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_lifecycleState);
            result = prime * result + Objects.hashCode(_localId);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operationalState);
            result = prime * result + Objects.hashCode(_profileProxy);
            result = prime * result + Objects.hashCode(_protType);
            result = prime * result + Objects.hashCode(_reversionMode);
            result = prime * result + Objects.hashCode(_selectedFcPort);
            result = prime * result + Objects.hashCode(_switchControl);
            result = prime * result + Objects.hashCode(_switchSelectionReason);
            result = prime * result + Objects.hashCode(_switchSelectsPorts);
            result = prime * result + Objects.hashCode(_uuid);
            result = prime * result + Objects.hashCode(_waitToRestoreTime);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch)obj;
            if (!Objects.equals(_administrativeControl, other.getAdministrativeControl())) {
                return false;
            }
            if (!Objects.equals(_administrativeState, other.getAdministrativeState())) {
                return false;
            }
            if (!Objects.equals(_controlParameters, other.getControlParameters())) {
                return false;
            }
            if (!Objects.equals(_extension, other.getExtension())) {
                return false;
            }
            if (!Objects.equals(_holdOffTime, other.getHoldOffTime())) {
                return false;
            }
            if (!Objects.equals(_internalConfigurationAndSwitchControl, other.getInternalConfigurationAndSwitchControl())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_lifecycleState, other.getLifecycleState())) {
                return false;
            }
            if (!Objects.equals(_localId, other.getLocalId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_operationalState, other.getOperationalState())) {
                return false;
            }
            if (!Objects.equals(_profileProxy, other.getProfileProxy())) {
                return false;
            }
            if (!Objects.equals(_protType, other.getProtType())) {
                return false;
            }
            if (!Objects.equals(_reversionMode, other.getReversionMode())) {
                return false;
            }
            if (!Objects.equals(_selectedFcPort, other.getSelectedFcPort())) {
                return false;
            }
            if (!Objects.equals(_switchControl, other.getSwitchControl())) {
                return false;
            }
            if (!Objects.equals(_switchSelectionReason, other.getSwitchSelectionReason())) {
                return false;
            }
            if (!Objects.equals(_switchSelectsPorts, other.getSwitchSelectsPorts())) {
                return false;
            }
            if (!Objects.equals(_uuid, other.getUuid())) {
                return false;
            }
            if (!Objects.equals(_waitToRestoreTime, other.getWaitToRestoreTime())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FcSwitchImpl otherImpl = (FcSwitchImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcSwitch>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FcSwitch [";
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
            if (_controlParameters != null) {
                builder.append("_controlParameters=");
                builder.append(_controlParameters);
                builder.append(", ");
            }
            if (_extension != null) {
                builder.append("_extension=");
                builder.append(_extension);
                builder.append(", ");
            }
            if (_holdOffTime != null) {
                builder.append("_holdOffTime=");
                builder.append(_holdOffTime);
                builder.append(", ");
            }
            if (_internalConfigurationAndSwitchControl != null) {
                builder.append("_internalConfigurationAndSwitchControl=");
                builder.append(_internalConfigurationAndSwitchControl);
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
            if (_profileProxy != null) {
                builder.append("_profileProxy=");
                builder.append(_profileProxy);
                builder.append(", ");
            }
            if (_protType != null) {
                builder.append("_protType=");
                builder.append(_protType);
                builder.append(", ");
            }
            if (_reversionMode != null) {
                builder.append("_reversionMode=");
                builder.append(_reversionMode);
                builder.append(", ");
            }
            if (_selectedFcPort != null) {
                builder.append("_selectedFcPort=");
                builder.append(_selectedFcPort);
                builder.append(", ");
            }
            if (_switchControl != null) {
                builder.append("_switchControl=");
                builder.append(_switchControl);
                builder.append(", ");
            }
            if (_switchSelectionReason != null) {
                builder.append("_switchSelectionReason=");
                builder.append(_switchSelectionReason);
                builder.append(", ");
            }
            if (_switchSelectsPorts != null) {
                builder.append("_switchSelectsPorts=");
                builder.append(_switchSelectsPorts);
                builder.append(", ");
            }
            if (_uuid != null) {
                builder.append("_uuid=");
                builder.append(_uuid);
                builder.append(", ");
            }
            if (_waitToRestoreTime != null) {
                builder.append("_waitToRestoreTime=");
                builder.append(_waitToRestoreTime);
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
