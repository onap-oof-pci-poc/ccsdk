package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.Connector;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ExpectedEquipment;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.Category;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ActualEquipment;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.label.g.Label;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.g.Name;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.MechanicalFunctions;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.global._class.g.LocalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.MechanicalFeatures;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalProperties;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.extension.g.Extension;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalRating;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.FunctionEnablers;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.Swapability;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ExposedCable;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.Location;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment
 *
 */
public class EquipmentBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment> {

    private ActualEquipment _actualEquipment;
    private AdministrativeControl _administrativeControl;
    private AdministrativeState _administrativeState;
    private Category _category;
    private List<Connector> _connector;
    private List<ContainedHolder> _containedHolder;
    private ExpectedEquipment _expectedEquipment;
    private List<ExposedCable> _exposedCable;
    private List<Extension> _extension;
    private List<java.lang.String> _functionBlock;
    private FunctionEnablers _functionEnablers;
    private EquipmentKey _key;
    private List<Label> _label;
    private LifecycleState _lifecycleState;
    private List<LocalId> _localId;
    private Location _location;
    private ManufacturedThing _manufacturedThing;
    private MechanicalFeatures _mechanicalFeatures;
    private MechanicalFunctions _mechanicalFunctions;
    private List<Name> _name;
    private OperationalState _operationalState;
    private PhysicalCharacteristics _physicalCharacteristics;
    private PhysicalProperties _physicalProperties;
    private PhysicalRating _physicalRating;
    private SpatialPropertiesOfType _spatialPropertiesOfType;
    private Swapability _swapability;
    private UniversalId _uuid;
    private java.lang.Boolean _isFieldReplaceable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>> augmentation = Collections.emptyMap();

    public EquipmentBuilder() {
    }
    public EquipmentBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG arg) {
        this._connector = arg.getConnector();
        this._containedHolder = arg.getContainedHolder();
        this._exposedCable = arg.getExposedCable();
        this._manufacturedThing = arg.getManufacturedThing();
        this._spatialPropertiesOfType = arg.getSpatialPropertiesOfType();
        this._mechanicalFeatures = arg.getMechanicalFeatures();
        this._physicalProperties = arg.getPhysicalProperties();
        this._functionEnablers = arg.getFunctionEnablers();
        this._mechanicalFunctions = arg.getMechanicalFunctions();
        this._physicalCharacteristics = arg.getPhysicalCharacteristics();
        this._swapability = arg.getSwapability();
        this._category = arg.getCategory();
        this._physicalRating = arg.getPhysicalRating();
        this._isFieldReplaceable = arg.isIsFieldReplaceable();
        this._functionBlock = arg.getFunctionBlock();
        this._expectedEquipment = arg.getExpectedEquipment();
        this._actualEquipment = arg.getActualEquipment();
        this._location = arg.getLocation();
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
    public EquipmentBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG arg) {
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
    public EquipmentBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG arg) {
        this._name = arg.getName();
    }
    public EquipmentBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG arg) {
        this._operationalState = arg.getOperationalState();
        this._administrativeControl = arg.getAdministrativeControl();
        this._administrativeState = arg.getAdministrativeState();
        this._lifecycleState = arg.getLifecycleState();
    }
    public EquipmentBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG arg) {
        this._extension = arg.getExtension();
    }
    public EquipmentBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG arg) {
        this._label = arg.getLabel();
    }

    public EquipmentBuilder(Equipment base) {
        if (base.getKey() == null) {
            this._key = new EquipmentKey(
                base.getUuid()
            );
            this._uuid = base.getUuid();
        } else {
            this._key = base.getKey();
            this._uuid = _key.getUuid();
        }
        this._actualEquipment = base.getActualEquipment();
        this._administrativeControl = base.getAdministrativeControl();
        this._administrativeState = base.getAdministrativeState();
        this._category = base.getCategory();
        this._connector = base.getConnector();
        this._containedHolder = base.getContainedHolder();
        this._expectedEquipment = base.getExpectedEquipment();
        this._exposedCable = base.getExposedCable();
        this._extension = base.getExtension();
        this._functionBlock = base.getFunctionBlock();
        this._functionEnablers = base.getFunctionEnablers();
        this._label = base.getLabel();
        this._lifecycleState = base.getLifecycleState();
        this._localId = base.getLocalId();
        this._location = base.getLocation();
        this._manufacturedThing = base.getManufacturedThing();
        this._mechanicalFeatures = base.getMechanicalFeatures();
        this._mechanicalFunctions = base.getMechanicalFunctions();
        this._name = base.getName();
        this._operationalState = base.getOperationalState();
        this._physicalCharacteristics = base.getPhysicalCharacteristics();
        this._physicalProperties = base.getPhysicalProperties();
        this._physicalRating = base.getPhysicalRating();
        this._spatialPropertiesOfType = base.getSpatialPropertiesOfType();
        this._swapability = base.getSwapability();
        this._isFieldReplaceable = base.isIsFieldReplaceable();
        if (base instanceof EquipmentImpl) {
            EquipmentImpl impl = (EquipmentImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>) base;
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
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG) {
            this._connector = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getConnector();
            this._containedHolder = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getContainedHolder();
            this._exposedCable = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getExposedCable();
            this._manufacturedThing = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getManufacturedThing();
            this._spatialPropertiesOfType = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getSpatialPropertiesOfType();
            this._mechanicalFeatures = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getMechanicalFeatures();
            this._physicalProperties = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getPhysicalProperties();
            this._functionEnablers = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getFunctionEnablers();
            this._mechanicalFunctions = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getMechanicalFunctions();
            this._physicalCharacteristics = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getPhysicalCharacteristics();
            this._swapability = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getSwapability();
            this._category = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getCategory();
            this._physicalRating = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getPhysicalRating();
            this._isFieldReplaceable = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).isIsFieldReplaceable();
            this._functionBlock = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getFunctionBlock();
            this._expectedEquipment = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getExpectedEquipment();
            this._actualEquipment = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getActualEquipment();
            this._location = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG)arg).getLocation();
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG) {
            this._localId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG)arg).getLocalId();
            this._uuid = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG)arg).getUuid();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG] \n" +
              "but was: " + arg
            );
        }
    }

    public ActualEquipment getActualEquipment() {
        return _actualEquipment;
    }
    
    public AdministrativeControl getAdministrativeControl() {
        return _administrativeControl;
    }
    
    public AdministrativeState getAdministrativeState() {
        return _administrativeState;
    }
    
    public Category getCategory() {
        return _category;
    }
    
    public List<Connector> getConnector() {
        return _connector;
    }
    
    public List<ContainedHolder> getContainedHolder() {
        return _containedHolder;
    }
    
    public ExpectedEquipment getExpectedEquipment() {
        return _expectedEquipment;
    }
    
    public List<ExposedCable> getExposedCable() {
        return _exposedCable;
    }
    
    public List<Extension> getExtension() {
        return _extension;
    }
    
    public List<java.lang.String> getFunctionBlock() {
        return _functionBlock;
    }
    
    public FunctionEnablers getFunctionEnablers() {
        return _functionEnablers;
    }
    
    public EquipmentKey getKey() {
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
    
    public Location getLocation() {
        return _location;
    }
    
    public ManufacturedThing getManufacturedThing() {
        return _manufacturedThing;
    }
    
    public MechanicalFeatures getMechanicalFeatures() {
        return _mechanicalFeatures;
    }
    
    public MechanicalFunctions getMechanicalFunctions() {
        return _mechanicalFunctions;
    }
    
    public List<Name> getName() {
        return _name;
    }
    
    public OperationalState getOperationalState() {
        return _operationalState;
    }
    
    public PhysicalCharacteristics getPhysicalCharacteristics() {
        return _physicalCharacteristics;
    }
    
    public PhysicalProperties getPhysicalProperties() {
        return _physicalProperties;
    }
    
    public PhysicalRating getPhysicalRating() {
        return _physicalRating;
    }
    
    public SpatialPropertiesOfType getSpatialPropertiesOfType() {
        return _spatialPropertiesOfType;
    }
    
    public Swapability getSwapability() {
        return _swapability;
    }
    
    public UniversalId getUuid() {
        return _uuid;
    }
    
    public java.lang.Boolean isIsFieldReplaceable() {
        return _isFieldReplaceable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public EquipmentBuilder setActualEquipment(final ActualEquipment value) {
        this._actualEquipment = value;
        return this;
    }
    
     
    public EquipmentBuilder setAdministrativeControl(final AdministrativeControl value) {
        this._administrativeControl = value;
        return this;
    }
    
     
    public EquipmentBuilder setAdministrativeState(final AdministrativeState value) {
        this._administrativeState = value;
        return this;
    }
    
     
    public EquipmentBuilder setCategory(final Category value) {
        this._category = value;
        return this;
    }
    
     
    public EquipmentBuilder setConnector(final List<Connector> value) {
        this._connector = value;
        return this;
    }
    
     
    public EquipmentBuilder setContainedHolder(final List<ContainedHolder> value) {
        this._containedHolder = value;
        return this;
    }
    
     
    public EquipmentBuilder setExpectedEquipment(final ExpectedEquipment value) {
        this._expectedEquipment = value;
        return this;
    }
    
     
    public EquipmentBuilder setExposedCable(final List<ExposedCable> value) {
        this._exposedCable = value;
        return this;
    }
    
     
    public EquipmentBuilder setExtension(final List<Extension> value) {
        this._extension = value;
        return this;
    }
    
     
    public EquipmentBuilder setFunctionBlock(final List<java.lang.String> value) {
        this._functionBlock = value;
        return this;
    }
    
     
    public EquipmentBuilder setFunctionEnablers(final FunctionEnablers value) {
        this._functionEnablers = value;
        return this;
    }
    
     
    public EquipmentBuilder setKey(final EquipmentKey value) {
        this._key = value;
        return this;
    }
    
     
    public EquipmentBuilder setLabel(final List<Label> value) {
        this._label = value;
        return this;
    }
    
     
    public EquipmentBuilder setLifecycleState(final LifecycleState value) {
        this._lifecycleState = value;
        return this;
    }
    
     
    public EquipmentBuilder setLocalId(final List<LocalId> value) {
        this._localId = value;
        return this;
    }
    
     
    public EquipmentBuilder setLocation(final Location value) {
        this._location = value;
        return this;
    }
    
     
    public EquipmentBuilder setManufacturedThing(final ManufacturedThing value) {
        this._manufacturedThing = value;
        return this;
    }
    
     
    public EquipmentBuilder setMechanicalFeatures(final MechanicalFeatures value) {
        this._mechanicalFeatures = value;
        return this;
    }
    
     
    public EquipmentBuilder setMechanicalFunctions(final MechanicalFunctions value) {
        this._mechanicalFunctions = value;
        return this;
    }
    
     
    public EquipmentBuilder setName(final List<Name> value) {
        this._name = value;
        return this;
    }
    
     
    public EquipmentBuilder setOperationalState(final OperationalState value) {
        this._operationalState = value;
        return this;
    }
    
     
    public EquipmentBuilder setPhysicalCharacteristics(final PhysicalCharacteristics value) {
        this._physicalCharacteristics = value;
        return this;
    }
    
     
    public EquipmentBuilder setPhysicalProperties(final PhysicalProperties value) {
        this._physicalProperties = value;
        return this;
    }
    
     
    public EquipmentBuilder setPhysicalRating(final PhysicalRating value) {
        this._physicalRating = value;
        return this;
    }
    
     
    public EquipmentBuilder setSpatialPropertiesOfType(final SpatialPropertiesOfType value) {
        this._spatialPropertiesOfType = value;
        return this;
    }
    
     
    public EquipmentBuilder setSwapability(final Swapability value) {
        this._swapability = value;
        return this;
    }
    
     
    public EquipmentBuilder setUuid(final UniversalId value) {
        this._uuid = value;
        return this;
    }
    
     
    public EquipmentBuilder setIsFieldReplaceable(final java.lang.Boolean value) {
        this._isFieldReplaceable = value;
        return this;
    }
    
    public EquipmentBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public EquipmentBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Equipment build() {
        return new EquipmentImpl(this);
    }

    private static final class EquipmentImpl implements Equipment {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment.class;
        }

        private final ActualEquipment _actualEquipment;
        private final AdministrativeControl _administrativeControl;
        private final AdministrativeState _administrativeState;
        private final Category _category;
        private final List<Connector> _connector;
        private final List<ContainedHolder> _containedHolder;
        private final ExpectedEquipment _expectedEquipment;
        private final List<ExposedCable> _exposedCable;
        private final List<Extension> _extension;
        private final List<java.lang.String> _functionBlock;
        private final FunctionEnablers _functionEnablers;
        private final EquipmentKey _key;
        private final List<Label> _label;
        private final LifecycleState _lifecycleState;
        private final List<LocalId> _localId;
        private final Location _location;
        private final ManufacturedThing _manufacturedThing;
        private final MechanicalFeatures _mechanicalFeatures;
        private final MechanicalFunctions _mechanicalFunctions;
        private final List<Name> _name;
        private final OperationalState _operationalState;
        private final PhysicalCharacteristics _physicalCharacteristics;
        private final PhysicalProperties _physicalProperties;
        private final PhysicalRating _physicalRating;
        private final SpatialPropertiesOfType _spatialPropertiesOfType;
        private final Swapability _swapability;
        private final UniversalId _uuid;
        private final java.lang.Boolean _isFieldReplaceable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>> augmentation = Collections.emptyMap();

        private EquipmentImpl(EquipmentBuilder base) {
            if (base.getKey() == null) {
                this._key = new EquipmentKey(
                    base.getUuid()
                );
                this._uuid = base.getUuid();
            } else {
                this._key = base.getKey();
                this._uuid = _key.getUuid();
            }
            this._actualEquipment = base.getActualEquipment();
            this._administrativeControl = base.getAdministrativeControl();
            this._administrativeState = base.getAdministrativeState();
            this._category = base.getCategory();
            this._connector = base.getConnector();
            this._containedHolder = base.getContainedHolder();
            this._expectedEquipment = base.getExpectedEquipment();
            this._exposedCable = base.getExposedCable();
            this._extension = base.getExtension();
            this._functionBlock = base.getFunctionBlock();
            this._functionEnablers = base.getFunctionEnablers();
            this._label = base.getLabel();
            this._lifecycleState = base.getLifecycleState();
            this._localId = base.getLocalId();
            this._location = base.getLocation();
            this._manufacturedThing = base.getManufacturedThing();
            this._mechanicalFeatures = base.getMechanicalFeatures();
            this._mechanicalFunctions = base.getMechanicalFunctions();
            this._name = base.getName();
            this._operationalState = base.getOperationalState();
            this._physicalCharacteristics = base.getPhysicalCharacteristics();
            this._physicalProperties = base.getPhysicalProperties();
            this._physicalRating = base.getPhysicalRating();
            this._spatialPropertiesOfType = base.getSpatialPropertiesOfType();
            this._swapability = base.getSwapability();
            this._isFieldReplaceable = base.isIsFieldReplaceable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ActualEquipment getActualEquipment() {
            return _actualEquipment;
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
        public Category getCategory() {
            return _category;
        }
        
        @Override
        public List<Connector> getConnector() {
            return _connector;
        }
        
        @Override
        public List<ContainedHolder> getContainedHolder() {
            return _containedHolder;
        }
        
        @Override
        public ExpectedEquipment getExpectedEquipment() {
            return _expectedEquipment;
        }
        
        @Override
        public List<ExposedCable> getExposedCable() {
            return _exposedCable;
        }
        
        @Override
        public List<Extension> getExtension() {
            return _extension;
        }
        
        @Override
        public List<java.lang.String> getFunctionBlock() {
            return _functionBlock;
        }
        
        @Override
        public FunctionEnablers getFunctionEnablers() {
            return _functionEnablers;
        }
        
        @Override
        public EquipmentKey getKey() {
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
        public Location getLocation() {
            return _location;
        }
        
        @Override
        public ManufacturedThing getManufacturedThing() {
            return _manufacturedThing;
        }
        
        @Override
        public MechanicalFeatures getMechanicalFeatures() {
            return _mechanicalFeatures;
        }
        
        @Override
        public MechanicalFunctions getMechanicalFunctions() {
            return _mechanicalFunctions;
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
        public PhysicalCharacteristics getPhysicalCharacteristics() {
            return _physicalCharacteristics;
        }
        
        @Override
        public PhysicalProperties getPhysicalProperties() {
            return _physicalProperties;
        }
        
        @Override
        public PhysicalRating getPhysicalRating() {
            return _physicalRating;
        }
        
        @Override
        public SpatialPropertiesOfType getSpatialPropertiesOfType() {
            return _spatialPropertiesOfType;
        }
        
        @Override
        public Swapability getSwapability() {
            return _swapability;
        }
        
        @Override
        public UniversalId getUuid() {
            return _uuid;
        }
        
        @Override
        public java.lang.Boolean isIsFieldReplaceable() {
            return _isFieldReplaceable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_actualEquipment);
            result = prime * result + Objects.hashCode(_administrativeControl);
            result = prime * result + Objects.hashCode(_administrativeState);
            result = prime * result + Objects.hashCode(_category);
            result = prime * result + Objects.hashCode(_connector);
            result = prime * result + Objects.hashCode(_containedHolder);
            result = prime * result + Objects.hashCode(_expectedEquipment);
            result = prime * result + Objects.hashCode(_exposedCable);
            result = prime * result + Objects.hashCode(_extension);
            result = prime * result + Objects.hashCode(_functionBlock);
            result = prime * result + Objects.hashCode(_functionEnablers);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_lifecycleState);
            result = prime * result + Objects.hashCode(_localId);
            result = prime * result + Objects.hashCode(_location);
            result = prime * result + Objects.hashCode(_manufacturedThing);
            result = prime * result + Objects.hashCode(_mechanicalFeatures);
            result = prime * result + Objects.hashCode(_mechanicalFunctions);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operationalState);
            result = prime * result + Objects.hashCode(_physicalCharacteristics);
            result = prime * result + Objects.hashCode(_physicalProperties);
            result = prime * result + Objects.hashCode(_physicalRating);
            result = prime * result + Objects.hashCode(_spatialPropertiesOfType);
            result = prime * result + Objects.hashCode(_swapability);
            result = prime * result + Objects.hashCode(_uuid);
            result = prime * result + Objects.hashCode(_isFieldReplaceable);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment)obj;
            if (!Objects.equals(_actualEquipment, other.getActualEquipment())) {
                return false;
            }
            if (!Objects.equals(_administrativeControl, other.getAdministrativeControl())) {
                return false;
            }
            if (!Objects.equals(_administrativeState, other.getAdministrativeState())) {
                return false;
            }
            if (!Objects.equals(_category, other.getCategory())) {
                return false;
            }
            if (!Objects.equals(_connector, other.getConnector())) {
                return false;
            }
            if (!Objects.equals(_containedHolder, other.getContainedHolder())) {
                return false;
            }
            if (!Objects.equals(_expectedEquipment, other.getExpectedEquipment())) {
                return false;
            }
            if (!Objects.equals(_exposedCable, other.getExposedCable())) {
                return false;
            }
            if (!Objects.equals(_extension, other.getExtension())) {
                return false;
            }
            if (!Objects.equals(_functionBlock, other.getFunctionBlock())) {
                return false;
            }
            if (!Objects.equals(_functionEnablers, other.getFunctionEnablers())) {
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
            if (!Objects.equals(_location, other.getLocation())) {
                return false;
            }
            if (!Objects.equals(_manufacturedThing, other.getManufacturedThing())) {
                return false;
            }
            if (!Objects.equals(_mechanicalFeatures, other.getMechanicalFeatures())) {
                return false;
            }
            if (!Objects.equals(_mechanicalFunctions, other.getMechanicalFunctions())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_operationalState, other.getOperationalState())) {
                return false;
            }
            if (!Objects.equals(_physicalCharacteristics, other.getPhysicalCharacteristics())) {
                return false;
            }
            if (!Objects.equals(_physicalProperties, other.getPhysicalProperties())) {
                return false;
            }
            if (!Objects.equals(_physicalRating, other.getPhysicalRating())) {
                return false;
            }
            if (!Objects.equals(_spatialPropertiesOfType, other.getSpatialPropertiesOfType())) {
                return false;
            }
            if (!Objects.equals(_swapability, other.getSwapability())) {
                return false;
            }
            if (!Objects.equals(_uuid, other.getUuid())) {
                return false;
            }
            if (!Objects.equals(_isFieldReplaceable, other.isIsFieldReplaceable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EquipmentImpl otherImpl = (EquipmentImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Equipment [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_actualEquipment != null) {
                builder.append("_actualEquipment=");
                builder.append(_actualEquipment);
                builder.append(", ");
            }
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
            if (_category != null) {
                builder.append("_category=");
                builder.append(_category);
                builder.append(", ");
            }
            if (_connector != null) {
                builder.append("_connector=");
                builder.append(_connector);
                builder.append(", ");
            }
            if (_containedHolder != null) {
                builder.append("_containedHolder=");
                builder.append(_containedHolder);
                builder.append(", ");
            }
            if (_expectedEquipment != null) {
                builder.append("_expectedEquipment=");
                builder.append(_expectedEquipment);
                builder.append(", ");
            }
            if (_exposedCable != null) {
                builder.append("_exposedCable=");
                builder.append(_exposedCable);
                builder.append(", ");
            }
            if (_extension != null) {
                builder.append("_extension=");
                builder.append(_extension);
                builder.append(", ");
            }
            if (_functionBlock != null) {
                builder.append("_functionBlock=");
                builder.append(_functionBlock);
                builder.append(", ");
            }
            if (_functionEnablers != null) {
                builder.append("_functionEnablers=");
                builder.append(_functionEnablers);
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
            if (_location != null) {
                builder.append("_location=");
                builder.append(_location);
                builder.append(", ");
            }
            if (_manufacturedThing != null) {
                builder.append("_manufacturedThing=");
                builder.append(_manufacturedThing);
                builder.append(", ");
            }
            if (_mechanicalFeatures != null) {
                builder.append("_mechanicalFeatures=");
                builder.append(_mechanicalFeatures);
                builder.append(", ");
            }
            if (_mechanicalFunctions != null) {
                builder.append("_mechanicalFunctions=");
                builder.append(_mechanicalFunctions);
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
            if (_physicalCharacteristics != null) {
                builder.append("_physicalCharacteristics=");
                builder.append(_physicalCharacteristics);
                builder.append(", ");
            }
            if (_physicalProperties != null) {
                builder.append("_physicalProperties=");
                builder.append(_physicalProperties);
                builder.append(", ");
            }
            if (_physicalRating != null) {
                builder.append("_physicalRating=");
                builder.append(_physicalRating);
                builder.append(", ");
            }
            if (_spatialPropertiesOfType != null) {
                builder.append("_spatialPropertiesOfType=");
                builder.append(_spatialPropertiesOfType);
                builder.append(", ");
            }
            if (_swapability != null) {
                builder.append("_swapability=");
                builder.append(_swapability);
                builder.append(", ");
            }
            if (_uuid != null) {
                builder.append("_uuid=");
                builder.append(_uuid);
                builder.append(", ");
            }
            if (_isFieldReplaceable != null) {
                builder.append("_isFieldReplaceable=");
                builder.append(_isFieldReplaceable);
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
