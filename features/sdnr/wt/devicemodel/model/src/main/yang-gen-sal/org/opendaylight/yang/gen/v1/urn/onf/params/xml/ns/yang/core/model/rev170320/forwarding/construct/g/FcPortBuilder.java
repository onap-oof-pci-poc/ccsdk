package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.local._class.g.LocalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeControl;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.label.g.Label;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AdministrativeState;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LifecycleState;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.name.g.Name;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.extension.g.Extension;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PortRole;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PortDirection;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationalState;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort
 *
 */
public class FcPortBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort> {

    private AdministrativeControl _administrativeControl;
    private AdministrativeState _administrativeState;
    private List<Extension> _extension;
    private PortDirection _fcPortDirection;
    private List<java.lang.String> _fcRouteFeedsFcPortEgress;
    private FcPortKey _key;
    private List<Label> _label;
    private LifecycleState _lifecycleState;
    private List<LocalId> _localId;
    private List<UniversalId> _ltp;
    private List<Name> _name;
    private OperationalState _operationalState;
    private PortRole _role;
    private java.lang.Long _selectionPriority;
    private UniversalId _uuid;
    private java.lang.Boolean _isInternalPort;
    private java.lang.Boolean _isProtectionLockOut;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>> augmentation = Collections.emptyMap();

    public FcPortBuilder() {
    }
    public FcPortBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcPortG arg) {
        this._ltp = arg.getLtp();
        this._role = arg.getRole();
        this._fcPortDirection = arg.getFcPortDirection();
        this._isProtectionLockOut = arg.isIsProtectionLockOut();
        this._selectionPriority = arg.getSelectionPriority();
        this._isInternalPort = arg.isIsInternalPort();
        this._fcRouteFeedsFcPortEgress = arg.getFcRouteFeedsFcPortEgress();
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
    public FcPortBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG arg) {
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
    public FcPortBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG arg) {
        this._name = arg.getName();
    }
    public FcPortBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG arg) {
        this._operationalState = arg.getOperationalState();
        this._administrativeControl = arg.getAdministrativeControl();
        this._administrativeState = arg.getAdministrativeState();
        this._lifecycleState = arg.getLifecycleState();
    }
    public FcPortBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG arg) {
        this._extension = arg.getExtension();
    }
    public FcPortBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG arg) {
        this._label = arg.getLabel();
    }

    public FcPortBuilder(FcPort base) {
        if (base.getKey() == null) {
            this._key = new FcPortKey(
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
        this._fcPortDirection = base.getFcPortDirection();
        this._fcRouteFeedsFcPortEgress = base.getFcRouteFeedsFcPortEgress();
        this._label = base.getLabel();
        this._lifecycleState = base.getLifecycleState();
        this._localId = base.getLocalId();
        this._ltp = base.getLtp();
        this._name = base.getName();
        this._operationalState = base.getOperationalState();
        this._role = base.getRole();
        this._selectionPriority = base.getSelectionPriority();
        this._isInternalPort = base.isIsInternalPort();
        this._isProtectionLockOut = base.isIsProtectionLockOut();
        if (base instanceof FcPortImpl) {
            FcPortImpl impl = (FcPortImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>) base;
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
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcPortG</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcPortG) {
            this._ltp = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcPortG)arg).getLtp();
            this._role = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcPortG)arg).getRole();
            this._fcPortDirection = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcPortG)arg).getFcPortDirection();
            this._isProtectionLockOut = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcPortG)arg).isIsProtectionLockOut();
            this._selectionPriority = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcPortG)arg).getSelectionPriority();
            this._isInternalPort = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcPortG)arg).isIsInternalPort();
            this._fcRouteFeedsFcPortEgress = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcPortG)arg).getFcRouteFeedsFcPortEgress();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalClassG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FcPortG] \n" +
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
    
    public PortDirection getFcPortDirection() {
        return _fcPortDirection;
    }
    
    public List<java.lang.String> getFcRouteFeedsFcPortEgress() {
        return _fcRouteFeedsFcPortEgress;
    }
    
    public FcPortKey getKey() {
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
    
    public List<UniversalId> getLtp() {
        return _ltp;
    }
    
    public List<Name> getName() {
        return _name;
    }
    
    public OperationalState getOperationalState() {
        return _operationalState;
    }
    
    public PortRole getRole() {
        return _role;
    }
    
    public java.lang.Long getSelectionPriority() {
        return _selectionPriority;
    }
    
    public UniversalId getUuid() {
        return _uuid;
    }
    
    public java.lang.Boolean isIsInternalPort() {
        return _isInternalPort;
    }
    
    public java.lang.Boolean isIsProtectionLockOut() {
        return _isProtectionLockOut;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FcPortBuilder setAdministrativeControl(final AdministrativeControl value) {
        this._administrativeControl = value;
        return this;
    }
    
     
    public FcPortBuilder setAdministrativeState(final AdministrativeState value) {
        this._administrativeState = value;
        return this;
    }
    
     
    public FcPortBuilder setExtension(final List<Extension> value) {
        this._extension = value;
        return this;
    }
    
     
    public FcPortBuilder setFcPortDirection(final PortDirection value) {
        this._fcPortDirection = value;
        return this;
    }
    
     
    public FcPortBuilder setFcRouteFeedsFcPortEgress(final List<java.lang.String> value) {
        this._fcRouteFeedsFcPortEgress = value;
        return this;
    }
    
     
    public FcPortBuilder setKey(final FcPortKey value) {
        this._key = value;
        return this;
    }
    
     
    public FcPortBuilder setLabel(final List<Label> value) {
        this._label = value;
        return this;
    }
    
     
    public FcPortBuilder setLifecycleState(final LifecycleState value) {
        this._lifecycleState = value;
        return this;
    }
    
     
    public FcPortBuilder setLocalId(final List<LocalId> value) {
        this._localId = value;
        return this;
    }
    
     
    public FcPortBuilder setLtp(final List<UniversalId> value) {
        this._ltp = value;
        return this;
    }
    
     
    public FcPortBuilder setName(final List<Name> value) {
        this._name = value;
        return this;
    }
    
     
    public FcPortBuilder setOperationalState(final OperationalState value) {
        this._operationalState = value;
        return this;
    }
    
     
    public FcPortBuilder setRole(final PortRole value) {
        this._role = value;
        return this;
    }
    
     
    public FcPortBuilder setSelectionPriority(final java.lang.Long value) {
        this._selectionPriority = value;
        return this;
    }
    
     
    public FcPortBuilder setUuid(final UniversalId value) {
        this._uuid = value;
        return this;
    }
    
     
    public FcPortBuilder setIsInternalPort(final java.lang.Boolean value) {
        this._isInternalPort = value;
        return this;
    }
    
     
    public FcPortBuilder setIsProtectionLockOut(final java.lang.Boolean value) {
        this._isProtectionLockOut = value;
        return this;
    }
    
    public FcPortBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FcPortBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FcPort build() {
        return new FcPortImpl(this);
    }

    private static final class FcPortImpl implements FcPort {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort.class;
        }

        private final AdministrativeControl _administrativeControl;
        private final AdministrativeState _administrativeState;
        private final List<Extension> _extension;
        private final PortDirection _fcPortDirection;
        private final List<java.lang.String> _fcRouteFeedsFcPortEgress;
        private final FcPortKey _key;
        private final List<Label> _label;
        private final LifecycleState _lifecycleState;
        private final List<LocalId> _localId;
        private final List<UniversalId> _ltp;
        private final List<Name> _name;
        private final OperationalState _operationalState;
        private final PortRole _role;
        private final java.lang.Long _selectionPriority;
        private final UniversalId _uuid;
        private final java.lang.Boolean _isInternalPort;
        private final java.lang.Boolean _isProtectionLockOut;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>> augmentation = Collections.emptyMap();

        private FcPortImpl(FcPortBuilder base) {
            if (base.getKey() == null) {
                this._key = new FcPortKey(
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
            this._fcPortDirection = base.getFcPortDirection();
            this._fcRouteFeedsFcPortEgress = base.getFcRouteFeedsFcPortEgress();
            this._label = base.getLabel();
            this._lifecycleState = base.getLifecycleState();
            this._localId = base.getLocalId();
            this._ltp = base.getLtp();
            this._name = base.getName();
            this._operationalState = base.getOperationalState();
            this._role = base.getRole();
            this._selectionPriority = base.getSelectionPriority();
            this._isInternalPort = base.isIsInternalPort();
            this._isProtectionLockOut = base.isIsProtectionLockOut();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>>singletonMap(e.getKey(), e.getValue());
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
        public PortDirection getFcPortDirection() {
            return _fcPortDirection;
        }
        
        @Override
        public List<java.lang.String> getFcRouteFeedsFcPortEgress() {
            return _fcRouteFeedsFcPortEgress;
        }
        
        @Override
        public FcPortKey getKey() {
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
        public List<UniversalId> getLtp() {
            return _ltp;
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
        public PortRole getRole() {
            return _role;
        }
        
        @Override
        public java.lang.Long getSelectionPriority() {
            return _selectionPriority;
        }
        
        @Override
        public UniversalId getUuid() {
            return _uuid;
        }
        
        @Override
        public java.lang.Boolean isIsInternalPort() {
            return _isInternalPort;
        }
        
        @Override
        public java.lang.Boolean isIsProtectionLockOut() {
            return _isProtectionLockOut;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_fcPortDirection);
            result = prime * result + Objects.hashCode(_fcRouteFeedsFcPortEgress);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_lifecycleState);
            result = prime * result + Objects.hashCode(_localId);
            result = prime * result + Objects.hashCode(_ltp);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operationalState);
            result = prime * result + Objects.hashCode(_role);
            result = prime * result + Objects.hashCode(_selectionPriority);
            result = prime * result + Objects.hashCode(_uuid);
            result = prime * result + Objects.hashCode(_isInternalPort);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort)obj;
            if (!Objects.equals(_administrativeControl, other.getAdministrativeControl())) {
                return false;
            }
            if (!Objects.equals(_administrativeState, other.getAdministrativeState())) {
                return false;
            }
            if (!Objects.equals(_extension, other.getExtension())) {
                return false;
            }
            if (!Objects.equals(_fcPortDirection, other.getFcPortDirection())) {
                return false;
            }
            if (!Objects.equals(_fcRouteFeedsFcPortEgress, other.getFcRouteFeedsFcPortEgress())) {
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
            if (!Objects.equals(_ltp, other.getLtp())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_operationalState, other.getOperationalState())) {
                return false;
            }
            if (!Objects.equals(_role, other.getRole())) {
                return false;
            }
            if (!Objects.equals(_selectionPriority, other.getSelectionPriority())) {
                return false;
            }
            if (!Objects.equals(_uuid, other.getUuid())) {
                return false;
            }
            if (!Objects.equals(_isInternalPort, other.isIsInternalPort())) {
                return false;
            }
            if (!Objects.equals(_isProtectionLockOut, other.isIsProtectionLockOut())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FcPortImpl otherImpl = (FcPortImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.forwarding.construct.g.FcPort>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FcPort [";
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
            if (_fcPortDirection != null) {
                builder.append("_fcPortDirection=");
                builder.append(_fcPortDirection);
                builder.append(", ");
            }
            if (_fcRouteFeedsFcPortEgress != null) {
                builder.append("_fcRouteFeedsFcPortEgress=");
                builder.append(_fcRouteFeedsFcPortEgress);
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
            if (_ltp != null) {
                builder.append("_ltp=");
                builder.append(_ltp);
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
            if (_role != null) {
                builder.append("_role=");
                builder.append(_role);
                builder.append(", ");
            }
            if (_selectionPriority != null) {
                builder.append("_selectionPriority=");
                builder.append(_selectionPriority);
                builder.append(", ");
            }
            if (_uuid != null) {
                builder.append("_uuid=");
                builder.append(_uuid);
                builder.append(", ");
            }
            if (_isInternalPort != null) {
                builder.append("_isInternalPort=");
                builder.append(_isInternalPort);
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
