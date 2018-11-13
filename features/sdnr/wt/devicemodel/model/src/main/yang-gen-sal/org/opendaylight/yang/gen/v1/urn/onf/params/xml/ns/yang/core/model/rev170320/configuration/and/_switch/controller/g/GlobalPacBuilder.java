package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.global._class.g.LocalId;
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
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperationalState;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac
 *
 */
public class GlobalPacBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac> {

    private AdministrativeControl _administrativeControl;
    private AdministrativeState _administrativeState;
    private List<Extension> _extension;
    private List<Label> _label;
    private LifecycleState _lifecycleState;
    private List<LocalId> _localId;
    private List<Name> _name;
    private OperationalState _operationalState;
    private UniversalId _uuid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>> augmentation = Collections.emptyMap();

    public GlobalPacBuilder() {
    }
    public GlobalPacBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG arg) {
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
    public GlobalPacBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG arg) {
        this._name = arg.getName();
    }
    public GlobalPacBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG arg) {
        this._operationalState = arg.getOperationalState();
        this._administrativeControl = arg.getAdministrativeControl();
        this._administrativeState = arg.getAdministrativeState();
        this._lifecycleState = arg.getLifecycleState();
    }
    public GlobalPacBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG arg) {
        this._extension = arg.getExtension();
    }
    public GlobalPacBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG arg) {
        this._label = arg.getLabel();
    }

    public GlobalPacBuilder(GlobalPac base) {
        this._administrativeControl = base.getAdministrativeControl();
        this._administrativeState = base.getAdministrativeState();
        this._extension = base.getExtension();
        this._label = base.getLabel();
        this._lifecycleState = base.getLifecycleState();
        this._localId = base.getLocalId();
        this._name = base.getName();
        this._operationalState = base.getOperationalState();
        this._uuid = base.getUuid();
        if (base instanceof GlobalPacImpl) {
            GlobalPacImpl impl = (GlobalPacImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>) base;
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG) {
            this._localId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG)arg).getLocalId();
            this._uuid = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG)arg).getUuid();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ExtensionG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.StatePacG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LabelG, org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.GlobalClassG] \n" +
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
    
    public UniversalId getUuid() {
        return _uuid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public GlobalPacBuilder setAdministrativeControl(final AdministrativeControl value) {
        this._administrativeControl = value;
        return this;
    }
    
     
    public GlobalPacBuilder setAdministrativeState(final AdministrativeState value) {
        this._administrativeState = value;
        return this;
    }
    
     
    public GlobalPacBuilder setExtension(final List<Extension> value) {
        this._extension = value;
        return this;
    }
    
     
    public GlobalPacBuilder setLabel(final List<Label> value) {
        this._label = value;
        return this;
    }
    
     
    public GlobalPacBuilder setLifecycleState(final LifecycleState value) {
        this._lifecycleState = value;
        return this;
    }
    
     
    public GlobalPacBuilder setLocalId(final List<LocalId> value) {
        this._localId = value;
        return this;
    }
    
     
    public GlobalPacBuilder setName(final List<Name> value) {
        this._name = value;
        return this;
    }
    
     
    public GlobalPacBuilder setOperationalState(final OperationalState value) {
        this._operationalState = value;
        return this;
    }
    
     
    public GlobalPacBuilder setUuid(final UniversalId value) {
        this._uuid = value;
        return this;
    }
    
    public GlobalPacBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GlobalPacBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GlobalPac build() {
        return new GlobalPacImpl(this);
    }

    private static final class GlobalPacImpl implements GlobalPac {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac.class;
        }

        private final AdministrativeControl _administrativeControl;
        private final AdministrativeState _administrativeState;
        private final List<Extension> _extension;
        private final List<Label> _label;
        private final LifecycleState _lifecycleState;
        private final List<LocalId> _localId;
        private final List<Name> _name;
        private final OperationalState _operationalState;
        private final UniversalId _uuid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>> augmentation = Collections.emptyMap();

        private GlobalPacImpl(GlobalPacBuilder base) {
            this._administrativeControl = base.getAdministrativeControl();
            this._administrativeState = base.getAdministrativeState();
            this._extension = base.getExtension();
            this._label = base.getLabel();
            this._lifecycleState = base.getLifecycleState();
            this._localId = base.getLocalId();
            this._name = base.getName();
            this._operationalState = base.getOperationalState();
            this._uuid = base.getUuid();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>>singletonMap(e.getKey(), e.getValue());
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
        public UniversalId getUuid() {
            return _uuid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_lifecycleState);
            result = prime * result + Objects.hashCode(_localId);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operationalState);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac)obj;
            if (!Objects.equals(_administrativeControl, other.getAdministrativeControl())) {
                return false;
            }
            if (!Objects.equals(_administrativeState, other.getAdministrativeState())) {
                return false;
            }
            if (!Objects.equals(_extension, other.getExtension())) {
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
            if (!Objects.equals(_uuid, other.getUuid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GlobalPacImpl otherImpl = (GlobalPacImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac>> e : augmentation.entrySet()) {
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
            java.lang.String name = "GlobalPac [";
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
