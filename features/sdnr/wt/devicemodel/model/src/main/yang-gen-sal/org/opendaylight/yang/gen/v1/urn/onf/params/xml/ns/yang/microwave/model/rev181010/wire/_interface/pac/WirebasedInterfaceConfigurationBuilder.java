package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.configuration.g.ProblemKindSeverityList;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.PmdNameType;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration
 *
 */
public class WirebasedInterfaceConfigurationBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration> {

    private PmdNameType _autoPmdNegotiationMax;
    private PmdNameType _fixedPmd;
    private UniversalId _fixedSignalOrdering;
    private java.lang.String _loopBackKindOn;
    private java.lang.Integer _maintenanceTimer;
    private List<ProblemKindSeverityList> _problemKindSeverityList;
    private java.lang.String _remoteWireInterfaceName;
    private java.lang.Byte _rxlevelHighThreshold;
    private java.lang.Byte _rxlevelLowThreshold;
    private java.lang.Byte _temperatureHighThreshold;
    private java.lang.Byte _temperatureLowThreshold;
    private List<java.lang.Boolean> _transceiverIsOnList;
    private List<java.lang.Integer> _wavelengthList;
    private java.lang.String _wireInterfaceName;
    private java.lang.Boolean _autoPmdNegotiationIsOn;
    private java.lang.Boolean _autoSignalOrderingIsOn;
    private java.lang.Boolean _interfaceIsOn;
    private java.lang.Boolean _isolationIsOn;
    private java.lang.Boolean _resetMauIsOn;
    private java.lang.Boolean _restartPmdNegotiationIsOn;
    private java.lang.Boolean _shortReachModeIsOn;
    private java.lang.Boolean _unidirectionalOperationIsOn;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>> augmentation = Collections.emptyMap();

    public WirebasedInterfaceConfigurationBuilder() {
    }
    public WirebasedInterfaceConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG arg) {
        this._wireInterfaceName = arg.getWireInterfaceName();
        this._remoteWireInterfaceName = arg.getRemoteWireInterfaceName();
        this._interfaceIsOn = arg.isInterfaceIsOn();
        this._transceiverIsOnList = arg.getTransceiverIsOnList();
        this._autoPmdNegotiationIsOn = arg.isAutoPmdNegotiationIsOn();
        this._fixedPmd = arg.getFixedPmd();
        this._autoPmdNegotiationMax = arg.getAutoPmdNegotiationMax();
        this._autoSignalOrderingIsOn = arg.isAutoSignalOrderingIsOn();
        this._fixedSignalOrdering = arg.getFixedSignalOrdering();
        this._shortReachModeIsOn = arg.isShortReachModeIsOn();
        this._unidirectionalOperationIsOn = arg.isUnidirectionalOperationIsOn();
        this._wavelengthList = arg.getWavelengthList();
        this._temperatureHighThreshold = arg.getTemperatureHighThreshold();
        this._temperatureLowThreshold = arg.getTemperatureLowThreshold();
        this._rxlevelHighThreshold = arg.getRxlevelHighThreshold();
        this._rxlevelLowThreshold = arg.getRxlevelLowThreshold();
        this._loopBackKindOn = arg.getLoopBackKindOn();
        this._isolationIsOn = arg.isIsolationIsOn();
        this._restartPmdNegotiationIsOn = arg.isRestartPmdNegotiationIsOn();
        this._resetMauIsOn = arg.isResetMauIsOn();
        this._maintenanceTimer = arg.getMaintenanceTimer();
        this._problemKindSeverityList = arg.getProblemKindSeverityList();
    }

    public WirebasedInterfaceConfigurationBuilder(WirebasedInterfaceConfiguration base) {
        this._autoPmdNegotiationMax = base.getAutoPmdNegotiationMax();
        this._fixedPmd = base.getFixedPmd();
        this._fixedSignalOrdering = base.getFixedSignalOrdering();
        this._loopBackKindOn = base.getLoopBackKindOn();
        this._maintenanceTimer = base.getMaintenanceTimer();
        this._problemKindSeverityList = base.getProblemKindSeverityList();
        this._remoteWireInterfaceName = base.getRemoteWireInterfaceName();
        this._rxlevelHighThreshold = base.getRxlevelHighThreshold();
        this._rxlevelLowThreshold = base.getRxlevelLowThreshold();
        this._temperatureHighThreshold = base.getTemperatureHighThreshold();
        this._temperatureLowThreshold = base.getTemperatureLowThreshold();
        this._transceiverIsOnList = base.getTransceiverIsOnList();
        this._wavelengthList = base.getWavelengthList();
        this._wireInterfaceName = base.getWireInterfaceName();
        this._autoPmdNegotiationIsOn = base.isAutoPmdNegotiationIsOn();
        this._autoSignalOrderingIsOn = base.isAutoSignalOrderingIsOn();
        this._interfaceIsOn = base.isInterfaceIsOn();
        this._isolationIsOn = base.isIsolationIsOn();
        this._resetMauIsOn = base.isResetMauIsOn();
        this._restartPmdNegotiationIsOn = base.isRestartPmdNegotiationIsOn();
        this._shortReachModeIsOn = base.isShortReachModeIsOn();
        this._unidirectionalOperationIsOn = base.isUnidirectionalOperationIsOn();
        if (base instanceof WirebasedInterfaceConfigurationImpl) {
            WirebasedInterfaceConfigurationImpl impl = (WirebasedInterfaceConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG) {
            this._wireInterfaceName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getWireInterfaceName();
            this._remoteWireInterfaceName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getRemoteWireInterfaceName();
            this._interfaceIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).isInterfaceIsOn();
            this._transceiverIsOnList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getTransceiverIsOnList();
            this._autoPmdNegotiationIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).isAutoPmdNegotiationIsOn();
            this._fixedPmd = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getFixedPmd();
            this._autoPmdNegotiationMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getAutoPmdNegotiationMax();
            this._autoSignalOrderingIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).isAutoSignalOrderingIsOn();
            this._fixedSignalOrdering = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getFixedSignalOrdering();
            this._shortReachModeIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).isShortReachModeIsOn();
            this._unidirectionalOperationIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).isUnidirectionalOperationIsOn();
            this._wavelengthList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getWavelengthList();
            this._temperatureHighThreshold = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getTemperatureHighThreshold();
            this._temperatureLowThreshold = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getTemperatureLowThreshold();
            this._rxlevelHighThreshold = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getRxlevelHighThreshold();
            this._rxlevelLowThreshold = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getRxlevelLowThreshold();
            this._loopBackKindOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getLoopBackKindOn();
            this._isolationIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).isIsolationIsOn();
            this._restartPmdNegotiationIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).isRestartPmdNegotiationIsOn();
            this._resetMauIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).isResetMauIsOn();
            this._maintenanceTimer = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getMaintenanceTimer();
            this._problemKindSeverityList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG)arg).getProblemKindSeverityList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG] \n" +
              "but was: " + arg
            );
        }
    }

    public PmdNameType getAutoPmdNegotiationMax() {
        return _autoPmdNegotiationMax;
    }
    
    public PmdNameType getFixedPmd() {
        return _fixedPmd;
    }
    
    public UniversalId getFixedSignalOrdering() {
        return _fixedSignalOrdering;
    }
    
    public java.lang.String getLoopBackKindOn() {
        return _loopBackKindOn;
    }
    
    public java.lang.Integer getMaintenanceTimer() {
        return _maintenanceTimer;
    }
    
    public List<ProblemKindSeverityList> getProblemKindSeverityList() {
        return _problemKindSeverityList;
    }
    
    public java.lang.String getRemoteWireInterfaceName() {
        return _remoteWireInterfaceName;
    }
    
    public java.lang.Byte getRxlevelHighThreshold() {
        return _rxlevelHighThreshold;
    }
    
    public java.lang.Byte getRxlevelLowThreshold() {
        return _rxlevelLowThreshold;
    }
    
    public java.lang.Byte getTemperatureHighThreshold() {
        return _temperatureHighThreshold;
    }
    
    public java.lang.Byte getTemperatureLowThreshold() {
        return _temperatureLowThreshold;
    }
    
    public List<java.lang.Boolean> getTransceiverIsOnList() {
        return _transceiverIsOnList;
    }
    
    public List<java.lang.Integer> getWavelengthList() {
        return _wavelengthList;
    }
    
    public java.lang.String getWireInterfaceName() {
        return _wireInterfaceName;
    }
    
    public java.lang.Boolean isAutoPmdNegotiationIsOn() {
        return _autoPmdNegotiationIsOn;
    }
    
    public java.lang.Boolean isAutoSignalOrderingIsOn() {
        return _autoSignalOrderingIsOn;
    }
    
    public java.lang.Boolean isInterfaceIsOn() {
        return _interfaceIsOn;
    }
    
    public java.lang.Boolean isIsolationIsOn() {
        return _isolationIsOn;
    }
    
    public java.lang.Boolean isResetMauIsOn() {
        return _resetMauIsOn;
    }
    
    public java.lang.Boolean isRestartPmdNegotiationIsOn() {
        return _restartPmdNegotiationIsOn;
    }
    
    public java.lang.Boolean isShortReachModeIsOn() {
        return _shortReachModeIsOn;
    }
    
    public java.lang.Boolean isUnidirectionalOperationIsOn() {
        return _unidirectionalOperationIsOn;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public WirebasedInterfaceConfigurationBuilder setAutoPmdNegotiationMax(final PmdNameType value) {
        this._autoPmdNegotiationMax = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setFixedPmd(final PmdNameType value) {
        this._fixedPmd = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setFixedSignalOrdering(final UniversalId value) {
        this._fixedSignalOrdering = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setLoopBackKindOn(final java.lang.String value) {
        this._loopBackKindOn = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setMaintenanceTimer(final java.lang.Integer value) {
        this._maintenanceTimer = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setProblemKindSeverityList(final List<ProblemKindSeverityList> value) {
        this._problemKindSeverityList = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setRemoteWireInterfaceName(final java.lang.String value) {
        this._remoteWireInterfaceName = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setRxlevelHighThreshold(final java.lang.Byte value) {
        this._rxlevelHighThreshold = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setRxlevelLowThreshold(final java.lang.Byte value) {
        this._rxlevelLowThreshold = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setTemperatureHighThreshold(final java.lang.Byte value) {
        this._temperatureHighThreshold = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setTemperatureLowThreshold(final java.lang.Byte value) {
        this._temperatureLowThreshold = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setTransceiverIsOnList(final List<java.lang.Boolean> value) {
        this._transceiverIsOnList = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setWavelengthList(final List<java.lang.Integer> value) {
        this._wavelengthList = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setWireInterfaceName(final java.lang.String value) {
        this._wireInterfaceName = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setAutoPmdNegotiationIsOn(final java.lang.Boolean value) {
        this._autoPmdNegotiationIsOn = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setAutoSignalOrderingIsOn(final java.lang.Boolean value) {
        this._autoSignalOrderingIsOn = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setInterfaceIsOn(final java.lang.Boolean value) {
        this._interfaceIsOn = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setIsolationIsOn(final java.lang.Boolean value) {
        this._isolationIsOn = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setResetMauIsOn(final java.lang.Boolean value) {
        this._resetMauIsOn = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setRestartPmdNegotiationIsOn(final java.lang.Boolean value) {
        this._restartPmdNegotiationIsOn = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setShortReachModeIsOn(final java.lang.Boolean value) {
        this._shortReachModeIsOn = value;
        return this;
    }
    
     
    public WirebasedInterfaceConfigurationBuilder setUnidirectionalOperationIsOn(final java.lang.Boolean value) {
        this._unidirectionalOperationIsOn = value;
        return this;
    }
    
    public WirebasedInterfaceConfigurationBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public WirebasedInterfaceConfigurationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public WirebasedInterfaceConfiguration build() {
        return new WirebasedInterfaceConfigurationImpl(this);
    }

    private static final class WirebasedInterfaceConfigurationImpl implements WirebasedInterfaceConfiguration {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration.class;
        }

        private final PmdNameType _autoPmdNegotiationMax;
        private final PmdNameType _fixedPmd;
        private final UniversalId _fixedSignalOrdering;
        private final java.lang.String _loopBackKindOn;
        private final java.lang.Integer _maintenanceTimer;
        private final List<ProblemKindSeverityList> _problemKindSeverityList;
        private final java.lang.String _remoteWireInterfaceName;
        private final java.lang.Byte _rxlevelHighThreshold;
        private final java.lang.Byte _rxlevelLowThreshold;
        private final java.lang.Byte _temperatureHighThreshold;
        private final java.lang.Byte _temperatureLowThreshold;
        private final List<java.lang.Boolean> _transceiverIsOnList;
        private final List<java.lang.Integer> _wavelengthList;
        private final java.lang.String _wireInterfaceName;
        private final java.lang.Boolean _autoPmdNegotiationIsOn;
        private final java.lang.Boolean _autoSignalOrderingIsOn;
        private final java.lang.Boolean _interfaceIsOn;
        private final java.lang.Boolean _isolationIsOn;
        private final java.lang.Boolean _resetMauIsOn;
        private final java.lang.Boolean _restartPmdNegotiationIsOn;
        private final java.lang.Boolean _shortReachModeIsOn;
        private final java.lang.Boolean _unidirectionalOperationIsOn;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>> augmentation = Collections.emptyMap();

        private WirebasedInterfaceConfigurationImpl(WirebasedInterfaceConfigurationBuilder base) {
            this._autoPmdNegotiationMax = base.getAutoPmdNegotiationMax();
            this._fixedPmd = base.getFixedPmd();
            this._fixedSignalOrdering = base.getFixedSignalOrdering();
            this._loopBackKindOn = base.getLoopBackKindOn();
            this._maintenanceTimer = base.getMaintenanceTimer();
            this._problemKindSeverityList = base.getProblemKindSeverityList();
            this._remoteWireInterfaceName = base.getRemoteWireInterfaceName();
            this._rxlevelHighThreshold = base.getRxlevelHighThreshold();
            this._rxlevelLowThreshold = base.getRxlevelLowThreshold();
            this._temperatureHighThreshold = base.getTemperatureHighThreshold();
            this._temperatureLowThreshold = base.getTemperatureLowThreshold();
            this._transceiverIsOnList = base.getTransceiverIsOnList();
            this._wavelengthList = base.getWavelengthList();
            this._wireInterfaceName = base.getWireInterfaceName();
            this._autoPmdNegotiationIsOn = base.isAutoPmdNegotiationIsOn();
            this._autoSignalOrderingIsOn = base.isAutoSignalOrderingIsOn();
            this._interfaceIsOn = base.isInterfaceIsOn();
            this._isolationIsOn = base.isIsolationIsOn();
            this._resetMauIsOn = base.isResetMauIsOn();
            this._restartPmdNegotiationIsOn = base.isRestartPmdNegotiationIsOn();
            this._shortReachModeIsOn = base.isShortReachModeIsOn();
            this._unidirectionalOperationIsOn = base.isUnidirectionalOperationIsOn();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public PmdNameType getAutoPmdNegotiationMax() {
            return _autoPmdNegotiationMax;
        }
        
        @Override
        public PmdNameType getFixedPmd() {
            return _fixedPmd;
        }
        
        @Override
        public UniversalId getFixedSignalOrdering() {
            return _fixedSignalOrdering;
        }
        
        @Override
        public java.lang.String getLoopBackKindOn() {
            return _loopBackKindOn;
        }
        
        @Override
        public java.lang.Integer getMaintenanceTimer() {
            return _maintenanceTimer;
        }
        
        @Override
        public List<ProblemKindSeverityList> getProblemKindSeverityList() {
            return _problemKindSeverityList;
        }
        
        @Override
        public java.lang.String getRemoteWireInterfaceName() {
            return _remoteWireInterfaceName;
        }
        
        @Override
        public java.lang.Byte getRxlevelHighThreshold() {
            return _rxlevelHighThreshold;
        }
        
        @Override
        public java.lang.Byte getRxlevelLowThreshold() {
            return _rxlevelLowThreshold;
        }
        
        @Override
        public java.lang.Byte getTemperatureHighThreshold() {
            return _temperatureHighThreshold;
        }
        
        @Override
        public java.lang.Byte getTemperatureLowThreshold() {
            return _temperatureLowThreshold;
        }
        
        @Override
        public List<java.lang.Boolean> getTransceiverIsOnList() {
            return _transceiverIsOnList;
        }
        
        @Override
        public List<java.lang.Integer> getWavelengthList() {
            return _wavelengthList;
        }
        
        @Override
        public java.lang.String getWireInterfaceName() {
            return _wireInterfaceName;
        }
        
        @Override
        public java.lang.Boolean isAutoPmdNegotiationIsOn() {
            return _autoPmdNegotiationIsOn;
        }
        
        @Override
        public java.lang.Boolean isAutoSignalOrderingIsOn() {
            return _autoSignalOrderingIsOn;
        }
        
        @Override
        public java.lang.Boolean isInterfaceIsOn() {
            return _interfaceIsOn;
        }
        
        @Override
        public java.lang.Boolean isIsolationIsOn() {
            return _isolationIsOn;
        }
        
        @Override
        public java.lang.Boolean isResetMauIsOn() {
            return _resetMauIsOn;
        }
        
        @Override
        public java.lang.Boolean isRestartPmdNegotiationIsOn() {
            return _restartPmdNegotiationIsOn;
        }
        
        @Override
        public java.lang.Boolean isShortReachModeIsOn() {
            return _shortReachModeIsOn;
        }
        
        @Override
        public java.lang.Boolean isUnidirectionalOperationIsOn() {
            return _unidirectionalOperationIsOn;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_autoPmdNegotiationMax);
            result = prime * result + Objects.hashCode(_fixedPmd);
            result = prime * result + Objects.hashCode(_fixedSignalOrdering);
            result = prime * result + Objects.hashCode(_loopBackKindOn);
            result = prime * result + Objects.hashCode(_maintenanceTimer);
            result = prime * result + Objects.hashCode(_problemKindSeverityList);
            result = prime * result + Objects.hashCode(_remoteWireInterfaceName);
            result = prime * result + Objects.hashCode(_rxlevelHighThreshold);
            result = prime * result + Objects.hashCode(_rxlevelLowThreshold);
            result = prime * result + Objects.hashCode(_temperatureHighThreshold);
            result = prime * result + Objects.hashCode(_temperatureLowThreshold);
            result = prime * result + Objects.hashCode(_transceiverIsOnList);
            result = prime * result + Objects.hashCode(_wavelengthList);
            result = prime * result + Objects.hashCode(_wireInterfaceName);
            result = prime * result + Objects.hashCode(_autoPmdNegotiationIsOn);
            result = prime * result + Objects.hashCode(_autoSignalOrderingIsOn);
            result = prime * result + Objects.hashCode(_interfaceIsOn);
            result = prime * result + Objects.hashCode(_isolationIsOn);
            result = prime * result + Objects.hashCode(_resetMauIsOn);
            result = prime * result + Objects.hashCode(_restartPmdNegotiationIsOn);
            result = prime * result + Objects.hashCode(_shortReachModeIsOn);
            result = prime * result + Objects.hashCode(_unidirectionalOperationIsOn);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration)obj;
            if (!Objects.equals(_autoPmdNegotiationMax, other.getAutoPmdNegotiationMax())) {
                return false;
            }
            if (!Objects.equals(_fixedPmd, other.getFixedPmd())) {
                return false;
            }
            if (!Objects.equals(_fixedSignalOrdering, other.getFixedSignalOrdering())) {
                return false;
            }
            if (!Objects.equals(_loopBackKindOn, other.getLoopBackKindOn())) {
                return false;
            }
            if (!Objects.equals(_maintenanceTimer, other.getMaintenanceTimer())) {
                return false;
            }
            if (!Objects.equals(_problemKindSeverityList, other.getProblemKindSeverityList())) {
                return false;
            }
            if (!Objects.equals(_remoteWireInterfaceName, other.getRemoteWireInterfaceName())) {
                return false;
            }
            if (!Objects.equals(_rxlevelHighThreshold, other.getRxlevelHighThreshold())) {
                return false;
            }
            if (!Objects.equals(_rxlevelLowThreshold, other.getRxlevelLowThreshold())) {
                return false;
            }
            if (!Objects.equals(_temperatureHighThreshold, other.getTemperatureHighThreshold())) {
                return false;
            }
            if (!Objects.equals(_temperatureLowThreshold, other.getTemperatureLowThreshold())) {
                return false;
            }
            if (!Objects.equals(_transceiverIsOnList, other.getTransceiverIsOnList())) {
                return false;
            }
            if (!Objects.equals(_wavelengthList, other.getWavelengthList())) {
                return false;
            }
            if (!Objects.equals(_wireInterfaceName, other.getWireInterfaceName())) {
                return false;
            }
            if (!Objects.equals(_autoPmdNegotiationIsOn, other.isAutoPmdNegotiationIsOn())) {
                return false;
            }
            if (!Objects.equals(_autoSignalOrderingIsOn, other.isAutoSignalOrderingIsOn())) {
                return false;
            }
            if (!Objects.equals(_interfaceIsOn, other.isInterfaceIsOn())) {
                return false;
            }
            if (!Objects.equals(_isolationIsOn, other.isIsolationIsOn())) {
                return false;
            }
            if (!Objects.equals(_resetMauIsOn, other.isResetMauIsOn())) {
                return false;
            }
            if (!Objects.equals(_restartPmdNegotiationIsOn, other.isRestartPmdNegotiationIsOn())) {
                return false;
            }
            if (!Objects.equals(_shortReachModeIsOn, other.isShortReachModeIsOn())) {
                return false;
            }
            if (!Objects.equals(_unidirectionalOperationIsOn, other.isUnidirectionalOperationIsOn())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                WirebasedInterfaceConfigurationImpl otherImpl = (WirebasedInterfaceConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>> e : augmentation.entrySet()) {
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
            java.lang.String name = "WirebasedInterfaceConfiguration [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_autoPmdNegotiationMax != null) {
                builder.append("_autoPmdNegotiationMax=");
                builder.append(_autoPmdNegotiationMax);
                builder.append(", ");
            }
            if (_fixedPmd != null) {
                builder.append("_fixedPmd=");
                builder.append(_fixedPmd);
                builder.append(", ");
            }
            if (_fixedSignalOrdering != null) {
                builder.append("_fixedSignalOrdering=");
                builder.append(_fixedSignalOrdering);
                builder.append(", ");
            }
            if (_loopBackKindOn != null) {
                builder.append("_loopBackKindOn=");
                builder.append(_loopBackKindOn);
                builder.append(", ");
            }
            if (_maintenanceTimer != null) {
                builder.append("_maintenanceTimer=");
                builder.append(_maintenanceTimer);
                builder.append(", ");
            }
            if (_problemKindSeverityList != null) {
                builder.append("_problemKindSeverityList=");
                builder.append(_problemKindSeverityList);
                builder.append(", ");
            }
            if (_remoteWireInterfaceName != null) {
                builder.append("_remoteWireInterfaceName=");
                builder.append(_remoteWireInterfaceName);
                builder.append(", ");
            }
            if (_rxlevelHighThreshold != null) {
                builder.append("_rxlevelHighThreshold=");
                builder.append(_rxlevelHighThreshold);
                builder.append(", ");
            }
            if (_rxlevelLowThreshold != null) {
                builder.append("_rxlevelLowThreshold=");
                builder.append(_rxlevelLowThreshold);
                builder.append(", ");
            }
            if (_temperatureHighThreshold != null) {
                builder.append("_temperatureHighThreshold=");
                builder.append(_temperatureHighThreshold);
                builder.append(", ");
            }
            if (_temperatureLowThreshold != null) {
                builder.append("_temperatureLowThreshold=");
                builder.append(_temperatureLowThreshold);
                builder.append(", ");
            }
            if (_transceiverIsOnList != null) {
                builder.append("_transceiverIsOnList=");
                builder.append(_transceiverIsOnList);
                builder.append(", ");
            }
            if (_wavelengthList != null) {
                builder.append("_wavelengthList=");
                builder.append(_wavelengthList);
                builder.append(", ");
            }
            if (_wireInterfaceName != null) {
                builder.append("_wireInterfaceName=");
                builder.append(_wireInterfaceName);
                builder.append(", ");
            }
            if (_autoPmdNegotiationIsOn != null) {
                builder.append("_autoPmdNegotiationIsOn=");
                builder.append(_autoPmdNegotiationIsOn);
                builder.append(", ");
            }
            if (_autoSignalOrderingIsOn != null) {
                builder.append("_autoSignalOrderingIsOn=");
                builder.append(_autoSignalOrderingIsOn);
                builder.append(", ");
            }
            if (_interfaceIsOn != null) {
                builder.append("_interfaceIsOn=");
                builder.append(_interfaceIsOn);
                builder.append(", ");
            }
            if (_isolationIsOn != null) {
                builder.append("_isolationIsOn=");
                builder.append(_isolationIsOn);
                builder.append(", ");
            }
            if (_resetMauIsOn != null) {
                builder.append("_resetMauIsOn=");
                builder.append(_resetMauIsOn);
                builder.append(", ");
            }
            if (_restartPmdNegotiationIsOn != null) {
                builder.append("_restartPmdNegotiationIsOn=");
                builder.append(_restartPmdNegotiationIsOn);
                builder.append(", ");
            }
            if (_shortReachModeIsOn != null) {
                builder.append("_shortReachModeIsOn=");
                builder.append(_shortReachModeIsOn);
                builder.append(", ");
            }
            if (_unidirectionalOperationIsOn != null) {
                builder.append("_unidirectionalOperationIsOn=");
                builder.append(_unidirectionalOperationIsOn);
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
