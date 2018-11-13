package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ActualHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.label.g.Label;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LifecycleState;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.g.Name;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.SpatialPropertiesOfType;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationalState;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.local._class.g.LocalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeControl;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.Position;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeState;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.extension.g.Extension;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderLocation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.PhysicalRating;
import java.util.Objects;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder
 *
 */
public class ContainedHolderBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder> {

    private ActualHolder _actualHolder;
    private AdministrativeControl _administrativeControl;
    private AdministrativeState _administrativeState;
    private List<UniversalId> _connector;
    private ExpectedHolder _expectedHolder;
    private List<Extension> _extension;
    private HolderLocation _holderLocation;
    private HolderMonitors _holderMonitors;
    private HolderStructure _holderStructure;
    private ContainedHolderKey _key;
    private List<Label> _label;
    private LifecycleState _lifecycleState;
    private List<LocalId> _localId;
    private List<Name> _name;
    private UniversalId _occupyingFru;
    private OperationalState _operationalState;
    private PhysicalRating _physicalRating;
    private Position _position;
    private SpatialPropertiesOfType _spatialPropertiesOfType;
    private List<java.lang.String> _supportedEquipment;
    private UniversalId _uuid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>> augmentation = Collections.emptyMap();

    public ContainedHolderBuilder() {
    }
    public ContainedHolderBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG arg) {
        this._connector = arg.getConnector();
        this._occupyingFru = arg.getOccupyingFru();
        this._spatialPropertiesOfType = arg.getSpatialPropertiesOfType();
        this._holderMonitors = arg.getHolderMonitors();
        this._holderLocation = arg.getHolderLocation();
        this._position = arg.getPosition();
        this._holderStructure = arg.getHolderStructure();
        this._physicalRating = arg.getPhysicalRating();
        this._supportedEquipment = arg.getSupportedEquipment();
        this._expectedHolder = arg.getExpectedHolder();
        this._actualHolder = arg.getActualHolder();
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
    public ContainedHolderBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG arg) {
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
    public ContainedHolderBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG arg) {
        this._name = arg.getName();
    }
    public ContainedHolderBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG arg) {
        this._operationalState = arg.getOperationalState();
        this._administrativeControl = arg.getAdministrativeControl();
        this._administrativeState = arg.getAdministrativeState();
        this._lifecycleState = arg.getLifecycleState();
    }
    public ContainedHolderBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG arg) {
        this._extension = arg.getExtension();
    }
    public ContainedHolderBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG arg) {
        this._label = arg.getLabel();
    }

    public ContainedHolderBuilder(ContainedHolder base) {
        if (base.getKey() == null) {
            this._key = new ContainedHolderKey(
                base.getUuid()
            );
            this._uuid = base.getUuid();
        } else {
            this._key = base.getKey();
            this._uuid = _key.getUuid();
        }
        this._actualHolder = base.getActualHolder();
        this._administrativeControl = base.getAdministrativeControl();
        this._administrativeState = base.getAdministrativeState();
        this._connector = base.getConnector();
        this._expectedHolder = base.getExpectedHolder();
        this._extension = base.getExtension();
        this._holderLocation = base.getHolderLocation();
        this._holderMonitors = base.getHolderMonitors();
        this._holderStructure = base.getHolderStructure();
        this._label = base.getLabel();
        this._lifecycleState = base.getLifecycleState();
        this._localId = base.getLocalId();
        this._name = base.getName();
        this._occupyingFru = base.getOccupyingFru();
        this._operationalState = base.getOperationalState();
        this._physicalRating = base.getPhysicalRating();
        this._position = base.getPosition();
        this._spatialPropertiesOfType = base.getSpatialPropertiesOfType();
        this._supportedEquipment = base.getSupportedEquipment();
        if (base instanceof ContainedHolderImpl) {
            ContainedHolderImpl impl = (ContainedHolderImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG) {
            this._connector = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG)arg).getConnector();
            this._occupyingFru = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG)arg).getOccupyingFru();
            this._spatialPropertiesOfType = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG)arg).getSpatialPropertiesOfType();
            this._holderMonitors = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG)arg).getHolderMonitors();
            this._holderLocation = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG)arg).getHolderLocation();
            this._position = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG)arg).getPosition();
            this._holderStructure = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG)arg).getHolderStructure();
            this._physicalRating = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG)arg).getPhysicalRating();
            this._supportedEquipment = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG)arg).getSupportedEquipment();
            this._expectedHolder = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG)arg).getExpectedHolder();
            this._actualHolder = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG)arg).getActualHolder();
            isValidArg = true;
        }
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
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG] \n" +
              "but was: " + arg
            );
        }
    }

    public ActualHolder getActualHolder() {
        return _actualHolder;
    }
    
    public AdministrativeControl getAdministrativeControl() {
        return _administrativeControl;
    }
    
    public AdministrativeState getAdministrativeState() {
        return _administrativeState;
    }
    
    public List<UniversalId> getConnector() {
        return _connector;
    }
    
    public ExpectedHolder getExpectedHolder() {
        return _expectedHolder;
    }
    
    public List<Extension> getExtension() {
        return _extension;
    }
    
    public HolderLocation getHolderLocation() {
        return _holderLocation;
    }
    
    public HolderMonitors getHolderMonitors() {
        return _holderMonitors;
    }
    
    public HolderStructure getHolderStructure() {
        return _holderStructure;
    }
    
    public ContainedHolderKey getKey() {
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
    
    public UniversalId getOccupyingFru() {
        return _occupyingFru;
    }
    
    public OperationalState getOperationalState() {
        return _operationalState;
    }
    
    public PhysicalRating getPhysicalRating() {
        return _physicalRating;
    }
    
    public Position getPosition() {
        return _position;
    }
    
    public SpatialPropertiesOfType getSpatialPropertiesOfType() {
        return _spatialPropertiesOfType;
    }
    
    public List<java.lang.String> getSupportedEquipment() {
        return _supportedEquipment;
    }
    
    public UniversalId getUuid() {
        return _uuid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ContainedHolderBuilder setActualHolder(final ActualHolder value) {
        this._actualHolder = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setAdministrativeControl(final AdministrativeControl value) {
        this._administrativeControl = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setAdministrativeState(final AdministrativeState value) {
        this._administrativeState = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setConnector(final List<UniversalId> value) {
        this._connector = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setExpectedHolder(final ExpectedHolder value) {
        this._expectedHolder = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setExtension(final List<Extension> value) {
        this._extension = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setHolderLocation(final HolderLocation value) {
        this._holderLocation = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setHolderMonitors(final HolderMonitors value) {
        this._holderMonitors = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setHolderStructure(final HolderStructure value) {
        this._holderStructure = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setKey(final ContainedHolderKey value) {
        this._key = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setLabel(final List<Label> value) {
        this._label = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setLifecycleState(final LifecycleState value) {
        this._lifecycleState = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setLocalId(final List<LocalId> value) {
        this._localId = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setName(final List<Name> value) {
        this._name = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setOccupyingFru(final UniversalId value) {
        this._occupyingFru = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setOperationalState(final OperationalState value) {
        this._operationalState = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setPhysicalRating(final PhysicalRating value) {
        this._physicalRating = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setPosition(final Position value) {
        this._position = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setSpatialPropertiesOfType(final SpatialPropertiesOfType value) {
        this._spatialPropertiesOfType = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setSupportedEquipment(final List<java.lang.String> value) {
        this._supportedEquipment = value;
        return this;
    }
    
     
    public ContainedHolderBuilder setUuid(final UniversalId value) {
        this._uuid = value;
        return this;
    }
    
    public ContainedHolderBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ContainedHolderBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ContainedHolder build() {
        return new ContainedHolderImpl(this);
    }

    private static final class ContainedHolderImpl implements ContainedHolder {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder.class;
        }

        private final ActualHolder _actualHolder;
        private final AdministrativeControl _administrativeControl;
        private final AdministrativeState _administrativeState;
        private final List<UniversalId> _connector;
        private final ExpectedHolder _expectedHolder;
        private final List<Extension> _extension;
        private final HolderLocation _holderLocation;
        private final HolderMonitors _holderMonitors;
        private final HolderStructure _holderStructure;
        private final ContainedHolderKey _key;
        private final List<Label> _label;
        private final LifecycleState _lifecycleState;
        private final List<LocalId> _localId;
        private final List<Name> _name;
        private final UniversalId _occupyingFru;
        private final OperationalState _operationalState;
        private final PhysicalRating _physicalRating;
        private final Position _position;
        private final SpatialPropertiesOfType _spatialPropertiesOfType;
        private final List<java.lang.String> _supportedEquipment;
        private final UniversalId _uuid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>> augmentation = Collections.emptyMap();

        private ContainedHolderImpl(ContainedHolderBuilder base) {
            if (base.getKey() == null) {
                this._key = new ContainedHolderKey(
                    base.getUuid()
                );
                this._uuid = base.getUuid();
            } else {
                this._key = base.getKey();
                this._uuid = _key.getUuid();
            }
            this._actualHolder = base.getActualHolder();
            this._administrativeControl = base.getAdministrativeControl();
            this._administrativeState = base.getAdministrativeState();
            this._connector = base.getConnector();
            this._expectedHolder = base.getExpectedHolder();
            this._extension = base.getExtension();
            this._holderLocation = base.getHolderLocation();
            this._holderMonitors = base.getHolderMonitors();
            this._holderStructure = base.getHolderStructure();
            this._label = base.getLabel();
            this._lifecycleState = base.getLifecycleState();
            this._localId = base.getLocalId();
            this._name = base.getName();
            this._occupyingFru = base.getOccupyingFru();
            this._operationalState = base.getOperationalState();
            this._physicalRating = base.getPhysicalRating();
            this._position = base.getPosition();
            this._spatialPropertiesOfType = base.getSpatialPropertiesOfType();
            this._supportedEquipment = base.getSupportedEquipment();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ActualHolder getActualHolder() {
            return _actualHolder;
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
        public List<UniversalId> getConnector() {
            return _connector;
        }
        
        @Override
        public ExpectedHolder getExpectedHolder() {
            return _expectedHolder;
        }
        
        @Override
        public List<Extension> getExtension() {
            return _extension;
        }
        
        @Override
        public HolderLocation getHolderLocation() {
            return _holderLocation;
        }
        
        @Override
        public HolderMonitors getHolderMonitors() {
            return _holderMonitors;
        }
        
        @Override
        public HolderStructure getHolderStructure() {
            return _holderStructure;
        }
        
        @Override
        public ContainedHolderKey getKey() {
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
        public UniversalId getOccupyingFru() {
            return _occupyingFru;
        }
        
        @Override
        public OperationalState getOperationalState() {
            return _operationalState;
        }
        
        @Override
        public PhysicalRating getPhysicalRating() {
            return _physicalRating;
        }
        
        @Override
        public Position getPosition() {
            return _position;
        }
        
        @Override
        public SpatialPropertiesOfType getSpatialPropertiesOfType() {
            return _spatialPropertiesOfType;
        }
        
        @Override
        public List<java.lang.String> getSupportedEquipment() {
            return _supportedEquipment;
        }
        
        @Override
        public UniversalId getUuid() {
            return _uuid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_actualHolder);
            result = prime * result + Objects.hashCode(_administrativeControl);
            result = prime * result + Objects.hashCode(_administrativeState);
            result = prime * result + Objects.hashCode(_connector);
            result = prime * result + Objects.hashCode(_expectedHolder);
            result = prime * result + Objects.hashCode(_extension);
            result = prime * result + Objects.hashCode(_holderLocation);
            result = prime * result + Objects.hashCode(_holderMonitors);
            result = prime * result + Objects.hashCode(_holderStructure);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_lifecycleState);
            result = prime * result + Objects.hashCode(_localId);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_occupyingFru);
            result = prime * result + Objects.hashCode(_operationalState);
            result = prime * result + Objects.hashCode(_physicalRating);
            result = prime * result + Objects.hashCode(_position);
            result = prime * result + Objects.hashCode(_spatialPropertiesOfType);
            result = prime * result + Objects.hashCode(_supportedEquipment);
            result = prime * result + Objects.hashCode(_uuid);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder)obj;
            if (!Objects.equals(_actualHolder, other.getActualHolder())) {
                return false;
            }
            if (!Objects.equals(_administrativeControl, other.getAdministrativeControl())) {
                return false;
            }
            if (!Objects.equals(_administrativeState, other.getAdministrativeState())) {
                return false;
            }
            if (!Objects.equals(_connector, other.getConnector())) {
                return false;
            }
            if (!Objects.equals(_expectedHolder, other.getExpectedHolder())) {
                return false;
            }
            if (!Objects.equals(_extension, other.getExtension())) {
                return false;
            }
            if (!Objects.equals(_holderLocation, other.getHolderLocation())) {
                return false;
            }
            if (!Objects.equals(_holderMonitors, other.getHolderMonitors())) {
                return false;
            }
            if (!Objects.equals(_holderStructure, other.getHolderStructure())) {
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
            if (!Objects.equals(_occupyingFru, other.getOccupyingFru())) {
                return false;
            }
            if (!Objects.equals(_operationalState, other.getOperationalState())) {
                return false;
            }
            if (!Objects.equals(_physicalRating, other.getPhysicalRating())) {
                return false;
            }
            if (!Objects.equals(_position, other.getPosition())) {
                return false;
            }
            if (!Objects.equals(_spatialPropertiesOfType, other.getSpatialPropertiesOfType())) {
                return false;
            }
            if (!Objects.equals(_supportedEquipment, other.getSupportedEquipment())) {
                return false;
            }
            if (!Objects.equals(_uuid, other.getUuid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ContainedHolderImpl otherImpl = (ContainedHolderImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ContainedHolder [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_actualHolder != null) {
                builder.append("_actualHolder=");
                builder.append(_actualHolder);
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
            if (_connector != null) {
                builder.append("_connector=");
                builder.append(_connector);
                builder.append(", ");
            }
            if (_expectedHolder != null) {
                builder.append("_expectedHolder=");
                builder.append(_expectedHolder);
                builder.append(", ");
            }
            if (_extension != null) {
                builder.append("_extension=");
                builder.append(_extension);
                builder.append(", ");
            }
            if (_holderLocation != null) {
                builder.append("_holderLocation=");
                builder.append(_holderLocation);
                builder.append(", ");
            }
            if (_holderMonitors != null) {
                builder.append("_holderMonitors=");
                builder.append(_holderMonitors);
                builder.append(", ");
            }
            if (_holderStructure != null) {
                builder.append("_holderStructure=");
                builder.append(_holderStructure);
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
            if (_occupyingFru != null) {
                builder.append("_occupyingFru=");
                builder.append(_occupyingFru);
                builder.append(", ");
            }
            if (_operationalState != null) {
                builder.append("_operationalState=");
                builder.append(_operationalState);
                builder.append(", ");
            }
            if (_physicalRating != null) {
                builder.append("_physicalRating=");
                builder.append(_physicalRating);
                builder.append(", ");
            }
            if (_position != null) {
                builder.append("_position=");
                builder.append(_position);
                builder.append(", ");
            }
            if (_spatialPropertiesOfType != null) {
                builder.append("_spatialPropertiesOfType=");
                builder.append(_spatialPropertiesOfType);
                builder.append(", ");
            }
            if (_supportedEquipment != null) {
                builder.append("_supportedEquipment=");
                builder.append(_supportedEquipment);
                builder.append(", ");
            }
            if (_uuid != null) {
                builder.append("_uuid=");
                builder.append(_uuid);
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
