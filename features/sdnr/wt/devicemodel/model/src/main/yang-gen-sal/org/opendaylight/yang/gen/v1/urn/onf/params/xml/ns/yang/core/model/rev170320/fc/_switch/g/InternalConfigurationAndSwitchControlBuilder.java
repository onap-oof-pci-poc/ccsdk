package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.LocalPac;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.ControlParameters;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.configuration.and._switch.controller.g.GlobalPac;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl
 *
 */
public class InternalConfigurationAndSwitchControlBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl> {

    private ControlParameters _controlParameters;
    private List<UniversalId> _fcSwitch;
    private GlobalPac _globalPac;
    private LocalPac _localPac;
    private List<java.lang.String> _profileProxy;
    private List<ToBeDefined> _subordinateController;
    private ToBeDefined _switchRule;
    private java.lang.Boolean _isCoordinatedSwitchingBothEnds;
    private java.lang.Boolean _isFrozen;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>> augmentation = Collections.emptyMap();

    public InternalConfigurationAndSwitchControlBuilder() {
    }
    public InternalConfigurationAndSwitchControlBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG arg) {
        this._switchRule = arg.getSwitchRule();
        this._fcSwitch = arg.getFcSwitch();
        this._controlParameters = arg.getControlParameters();
        this._profileProxy = arg.getProfileProxy();
        this._localPac = arg.getLocalPac();
        this._globalPac = arg.getGlobalPac();
        this._isFrozen = arg.isIsFrozen();
        this._isCoordinatedSwitchingBothEnds = arg.isIsCoordinatedSwitchingBothEnds();
        this._subordinateController = arg.getSubordinateController();
    }

    public InternalConfigurationAndSwitchControlBuilder(InternalConfigurationAndSwitchControl base) {
        this._controlParameters = base.getControlParameters();
        this._fcSwitch = base.getFcSwitch();
        this._globalPac = base.getGlobalPac();
        this._localPac = base.getLocalPac();
        this._profileProxy = base.getProfileProxy();
        this._subordinateController = base.getSubordinateController();
        this._switchRule = base.getSwitchRule();
        this._isCoordinatedSwitchingBothEnds = base.isIsCoordinatedSwitchingBothEnds();
        this._isFrozen = base.isIsFrozen();
        if (base instanceof InternalConfigurationAndSwitchControlImpl) {
            InternalConfigurationAndSwitchControlImpl impl = (InternalConfigurationAndSwitchControlImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG) {
            this._switchRule = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG)arg).getSwitchRule();
            this._fcSwitch = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG)arg).getFcSwitch();
            this._controlParameters = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG)arg).getControlParameters();
            this._profileProxy = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG)arg).getProfileProxy();
            this._localPac = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG)arg).getLocalPac();
            this._globalPac = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG)arg).getGlobalPac();
            this._isFrozen = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG)arg).isIsFrozen();
            this._isCoordinatedSwitchingBothEnds = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG)arg).isIsCoordinatedSwitchingBothEnds();
            this._subordinateController = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG)arg).getSubordinateController();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConfigurationAndSwitchControllerG] \n" +
              "but was: " + arg
            );
        }
    }

    public ControlParameters getControlParameters() {
        return _controlParameters;
    }
    
    public List<UniversalId> getFcSwitch() {
        return _fcSwitch;
    }
    
    public GlobalPac getGlobalPac() {
        return _globalPac;
    }
    
    public LocalPac getLocalPac() {
        return _localPac;
    }
    
    public List<java.lang.String> getProfileProxy() {
        return _profileProxy;
    }
    
    public List<ToBeDefined> getSubordinateController() {
        return _subordinateController;
    }
    
    public ToBeDefined getSwitchRule() {
        return _switchRule;
    }
    
    public java.lang.Boolean isIsCoordinatedSwitchingBothEnds() {
        return _isCoordinatedSwitchingBothEnds;
    }
    
    public java.lang.Boolean isIsFrozen() {
        return _isFrozen;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InternalConfigurationAndSwitchControlBuilder setControlParameters(final ControlParameters value) {
        this._controlParameters = value;
        return this;
    }
    
     
    public InternalConfigurationAndSwitchControlBuilder setFcSwitch(final List<UniversalId> value) {
        this._fcSwitch = value;
        return this;
    }
    
     
    public InternalConfigurationAndSwitchControlBuilder setGlobalPac(final GlobalPac value) {
        this._globalPac = value;
        return this;
    }
    
     
    public InternalConfigurationAndSwitchControlBuilder setLocalPac(final LocalPac value) {
        this._localPac = value;
        return this;
    }
    
     
    public InternalConfigurationAndSwitchControlBuilder setProfileProxy(final List<java.lang.String> value) {
        this._profileProxy = value;
        return this;
    }
    
     
    public InternalConfigurationAndSwitchControlBuilder setSubordinateController(final List<ToBeDefined> value) {
        this._subordinateController = value;
        return this;
    }
    
     
    public InternalConfigurationAndSwitchControlBuilder setSwitchRule(final ToBeDefined value) {
        this._switchRule = value;
        return this;
    }
    
     
    public InternalConfigurationAndSwitchControlBuilder setIsCoordinatedSwitchingBothEnds(final java.lang.Boolean value) {
        this._isCoordinatedSwitchingBothEnds = value;
        return this;
    }
    
     
    public InternalConfigurationAndSwitchControlBuilder setIsFrozen(final java.lang.Boolean value) {
        this._isFrozen = value;
        return this;
    }
    
    public InternalConfigurationAndSwitchControlBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InternalConfigurationAndSwitchControlBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InternalConfigurationAndSwitchControl build() {
        return new InternalConfigurationAndSwitchControlImpl(this);
    }

    private static final class InternalConfigurationAndSwitchControlImpl implements InternalConfigurationAndSwitchControl {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl.class;
        }

        private final ControlParameters _controlParameters;
        private final List<UniversalId> _fcSwitch;
        private final GlobalPac _globalPac;
        private final LocalPac _localPac;
        private final List<java.lang.String> _profileProxy;
        private final List<ToBeDefined> _subordinateController;
        private final ToBeDefined _switchRule;
        private final java.lang.Boolean _isCoordinatedSwitchingBothEnds;
        private final java.lang.Boolean _isFrozen;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>> augmentation = Collections.emptyMap();

        private InternalConfigurationAndSwitchControlImpl(InternalConfigurationAndSwitchControlBuilder base) {
            this._controlParameters = base.getControlParameters();
            this._fcSwitch = base.getFcSwitch();
            this._globalPac = base.getGlobalPac();
            this._localPac = base.getLocalPac();
            this._profileProxy = base.getProfileProxy();
            this._subordinateController = base.getSubordinateController();
            this._switchRule = base.getSwitchRule();
            this._isCoordinatedSwitchingBothEnds = base.isIsCoordinatedSwitchingBothEnds();
            this._isFrozen = base.isIsFrozen();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ControlParameters getControlParameters() {
            return _controlParameters;
        }
        
        @Override
        public List<UniversalId> getFcSwitch() {
            return _fcSwitch;
        }
        
        @Override
        public GlobalPac getGlobalPac() {
            return _globalPac;
        }
        
        @Override
        public LocalPac getLocalPac() {
            return _localPac;
        }
        
        @Override
        public List<java.lang.String> getProfileProxy() {
            return _profileProxy;
        }
        
        @Override
        public List<ToBeDefined> getSubordinateController() {
            return _subordinateController;
        }
        
        @Override
        public ToBeDefined getSwitchRule() {
            return _switchRule;
        }
        
        @Override
        public java.lang.Boolean isIsCoordinatedSwitchingBothEnds() {
            return _isCoordinatedSwitchingBothEnds;
        }
        
        @Override
        public java.lang.Boolean isIsFrozen() {
            return _isFrozen;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_controlParameters);
            result = prime * result + Objects.hashCode(_fcSwitch);
            result = prime * result + Objects.hashCode(_globalPac);
            result = prime * result + Objects.hashCode(_localPac);
            result = prime * result + Objects.hashCode(_profileProxy);
            result = prime * result + Objects.hashCode(_subordinateController);
            result = prime * result + Objects.hashCode(_switchRule);
            result = prime * result + Objects.hashCode(_isCoordinatedSwitchingBothEnds);
            result = prime * result + Objects.hashCode(_isFrozen);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl)obj;
            if (!Objects.equals(_controlParameters, other.getControlParameters())) {
                return false;
            }
            if (!Objects.equals(_fcSwitch, other.getFcSwitch())) {
                return false;
            }
            if (!Objects.equals(_globalPac, other.getGlobalPac())) {
                return false;
            }
            if (!Objects.equals(_localPac, other.getLocalPac())) {
                return false;
            }
            if (!Objects.equals(_profileProxy, other.getProfileProxy())) {
                return false;
            }
            if (!Objects.equals(_subordinateController, other.getSubordinateController())) {
                return false;
            }
            if (!Objects.equals(_switchRule, other.getSwitchRule())) {
                return false;
            }
            if (!Objects.equals(_isCoordinatedSwitchingBothEnds, other.isIsCoordinatedSwitchingBothEnds())) {
                return false;
            }
            if (!Objects.equals(_isFrozen, other.isIsFrozen())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InternalConfigurationAndSwitchControlImpl otherImpl = (InternalConfigurationAndSwitchControlImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.fc._switch.g.InternalConfigurationAndSwitchControl>> e : augmentation.entrySet()) {
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
            java.lang.String name = "InternalConfigurationAndSwitchControl [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_controlParameters != null) {
                builder.append("_controlParameters=");
                builder.append(_controlParameters);
                builder.append(", ");
            }
            if (_fcSwitch != null) {
                builder.append("_fcSwitch=");
                builder.append(_fcSwitch);
                builder.append(", ");
            }
            if (_globalPac != null) {
                builder.append("_globalPac=");
                builder.append(_globalPac);
                builder.append(", ");
            }
            if (_localPac != null) {
                builder.append("_localPac=");
                builder.append(_localPac);
                builder.append(", ");
            }
            if (_profileProxy != null) {
                builder.append("_profileProxy=");
                builder.append(_profileProxy);
                builder.append(", ");
            }
            if (_subordinateController != null) {
                builder.append("_subordinateController=");
                builder.append(_subordinateController);
                builder.append(", ");
            }
            if (_switchRule != null) {
                builder.append("_switchRule=");
                builder.append(_switchRule);
                builder.append(", ");
            }
            if (_isCoordinatedSwitchingBothEnds != null) {
                builder.append("_isCoordinatedSwitchingBothEnds=");
                builder.append(_isCoordinatedSwitchingBothEnds);
                builder.append(", ");
            }
            if (_isFrozen != null) {
                builder.append("_isFrozen=");
                builder.append(_isFrozen);
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
