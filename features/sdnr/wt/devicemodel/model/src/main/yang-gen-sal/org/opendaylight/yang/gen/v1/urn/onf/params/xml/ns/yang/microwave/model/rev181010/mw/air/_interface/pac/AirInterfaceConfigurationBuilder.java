package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.configuration.g.ProblemKindSeverityList;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.configuration.g.ThresholdCrossAlarmList;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.LoopBackType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.PolarizationType;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration
 *
 */
public class AirInterfaceConfigurationBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration> {

    private java.lang.String _airInterfaceName;
    private java.lang.Short _atpcThreshLower;
    private java.lang.Short _atpcThreshUpper;
    private java.lang.Byte _atpcTxPowerMin;
    private java.lang.Byte _autoFreqSelectRange;
    private java.lang.String _cryptographicKey;
    private java.lang.Short _expectedSignalId;
    private LoopBackType _loopBackKindOn;
    private java.lang.Integer _maintenanceTimer;
    private java.lang.Short _modulationMax;
    private java.lang.Short _modulationMin;
    private PolarizationType _polarization;
    private List<ProblemKindSeverityList> _problemKindSeverityList;
    private java.lang.String _radioSignalId;
    private java.lang.String _remoteAirInterfaceName;
    private java.lang.Integer _rxChannelBandwidth;
    private java.lang.Integer _rxFrequency;
    private List<ThresholdCrossAlarmList> _thresholdCrossAlarmList;
    private UniversalId _transmissionModeMax;
    private UniversalId _transmissionModeMin;
    private java.lang.Short _transmittedSignalId;
    private java.lang.Integer _txChannelBandwidth;
    private java.lang.Integer _txFrequency;
    private java.lang.Byte _txPower;
    private java.lang.Boolean _adaptiveModulationIsOn;
    private java.lang.Boolean _alicIsOn;
    private java.lang.Boolean _atpcIsOn;
    private java.lang.Boolean _autoFreqSelectIsOn;
    private java.lang.Boolean _encryptionIsOn;
    private java.lang.Boolean _mimoIsOn;
    private java.lang.Boolean _modulationIsOn;
    private java.lang.Boolean _performanceMonitoringCollectionIsOn;
    private java.lang.Boolean _powerIsOn;
    private java.lang.Boolean _receiverIsOn;
    private java.lang.Boolean _transmitterIsOn;
    private java.lang.Boolean _xpicIsOn;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>> augmentation = Collections.emptyMap();

    public AirInterfaceConfigurationBuilder() {
    }
    public AirInterfaceConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG arg) {
        this._airInterfaceName = arg.getAirInterfaceName();
        this._remoteAirInterfaceName = arg.getRemoteAirInterfaceName();
        this._expectedSignalId = arg.getExpectedSignalId();
        this._transmittedSignalId = arg.getTransmittedSignalId();
        this._radioSignalId = arg.getRadioSignalId();
        this._txFrequency = arg.getTxFrequency();
        this._rxFrequency = arg.getRxFrequency();
        this._transmissionModeMin = arg.getTransmissionModeMin();
        this._transmissionModeMax = arg.getTransmissionModeMax();
        this._txChannelBandwidth = arg.getTxChannelBandwidth();
        this._rxChannelBandwidth = arg.getRxChannelBandwidth();
        this._polarization = arg.getPolarization();
        this._powerIsOn = arg.isPowerIsOn();
        this._transmitterIsOn = arg.isTransmitterIsOn();
        this._receiverIsOn = arg.isReceiverIsOn();
        this._txPower = arg.getTxPower();
        this._adaptiveModulationIsOn = arg.isAdaptiveModulationIsOn();
        this._modulationMin = arg.getModulationMin();
        this._modulationMax = arg.getModulationMax();
        this._xpicIsOn = arg.isXpicIsOn();
        this._mimoIsOn = arg.isMimoIsOn();
        this._alicIsOn = arg.isAlicIsOn();
        this._atpcIsOn = arg.isAtpcIsOn();
        this._atpcThreshUpper = arg.getAtpcThreshUpper();
        this._atpcThreshLower = arg.getAtpcThreshLower();
        this._atpcTxPowerMin = arg.getAtpcTxPowerMin();
        this._autoFreqSelectIsOn = arg.isAutoFreqSelectIsOn();
        this._autoFreqSelectRange = arg.getAutoFreqSelectRange();
        this._modulationIsOn = arg.isModulationIsOn();
        this._encryptionIsOn = arg.isEncryptionIsOn();
        this._cryptographicKey = arg.getCryptographicKey();
        this._performanceMonitoringCollectionIsOn = arg.isPerformanceMonitoringCollectionIsOn();
        this._thresholdCrossAlarmList = arg.getThresholdCrossAlarmList();
        this._loopBackKindOn = arg.getLoopBackKindOn();
        this._maintenanceTimer = arg.getMaintenanceTimer();
        this._problemKindSeverityList = arg.getProblemKindSeverityList();
    }

    public AirInterfaceConfigurationBuilder(AirInterfaceConfiguration base) {
        this._airInterfaceName = base.getAirInterfaceName();
        this._atpcThreshLower = base.getAtpcThreshLower();
        this._atpcThreshUpper = base.getAtpcThreshUpper();
        this._atpcTxPowerMin = base.getAtpcTxPowerMin();
        this._autoFreqSelectRange = base.getAutoFreqSelectRange();
        this._cryptographicKey = base.getCryptographicKey();
        this._expectedSignalId = base.getExpectedSignalId();
        this._loopBackKindOn = base.getLoopBackKindOn();
        this._maintenanceTimer = base.getMaintenanceTimer();
        this._modulationMax = base.getModulationMax();
        this._modulationMin = base.getModulationMin();
        this._polarization = base.getPolarization();
        this._problemKindSeverityList = base.getProblemKindSeverityList();
        this._radioSignalId = base.getRadioSignalId();
        this._remoteAirInterfaceName = base.getRemoteAirInterfaceName();
        this._rxChannelBandwidth = base.getRxChannelBandwidth();
        this._rxFrequency = base.getRxFrequency();
        this._thresholdCrossAlarmList = base.getThresholdCrossAlarmList();
        this._transmissionModeMax = base.getTransmissionModeMax();
        this._transmissionModeMin = base.getTransmissionModeMin();
        this._transmittedSignalId = base.getTransmittedSignalId();
        this._txChannelBandwidth = base.getTxChannelBandwidth();
        this._txFrequency = base.getTxFrequency();
        this._txPower = base.getTxPower();
        this._adaptiveModulationIsOn = base.isAdaptiveModulationIsOn();
        this._alicIsOn = base.isAlicIsOn();
        this._atpcIsOn = base.isAtpcIsOn();
        this._autoFreqSelectIsOn = base.isAutoFreqSelectIsOn();
        this._encryptionIsOn = base.isEncryptionIsOn();
        this._mimoIsOn = base.isMimoIsOn();
        this._modulationIsOn = base.isModulationIsOn();
        this._performanceMonitoringCollectionIsOn = base.isPerformanceMonitoringCollectionIsOn();
        this._powerIsOn = base.isPowerIsOn();
        this._receiverIsOn = base.isReceiverIsOn();
        this._transmitterIsOn = base.isTransmitterIsOn();
        this._xpicIsOn = base.isXpicIsOn();
        if (base instanceof AirInterfaceConfigurationImpl) {
            AirInterfaceConfigurationImpl impl = (AirInterfaceConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG) {
            this._airInterfaceName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getAirInterfaceName();
            this._remoteAirInterfaceName = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getRemoteAirInterfaceName();
            this._expectedSignalId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getExpectedSignalId();
            this._transmittedSignalId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getTransmittedSignalId();
            this._radioSignalId = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getRadioSignalId();
            this._txFrequency = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getTxFrequency();
            this._rxFrequency = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getRxFrequency();
            this._transmissionModeMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getTransmissionModeMin();
            this._transmissionModeMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getTransmissionModeMax();
            this._txChannelBandwidth = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getTxChannelBandwidth();
            this._rxChannelBandwidth = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getRxChannelBandwidth();
            this._polarization = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getPolarization();
            this._powerIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).isPowerIsOn();
            this._transmitterIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).isTransmitterIsOn();
            this._receiverIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).isReceiverIsOn();
            this._txPower = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getTxPower();
            this._adaptiveModulationIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).isAdaptiveModulationIsOn();
            this._modulationMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getModulationMin();
            this._modulationMax = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getModulationMax();
            this._xpicIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).isXpicIsOn();
            this._mimoIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).isMimoIsOn();
            this._alicIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).isAlicIsOn();
            this._atpcIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).isAtpcIsOn();
            this._atpcThreshUpper = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getAtpcThreshUpper();
            this._atpcThreshLower = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getAtpcThreshLower();
            this._atpcTxPowerMin = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getAtpcTxPowerMin();
            this._autoFreqSelectIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).isAutoFreqSelectIsOn();
            this._autoFreqSelectRange = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getAutoFreqSelectRange();
            this._modulationIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).isModulationIsOn();
            this._encryptionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).isEncryptionIsOn();
            this._cryptographicKey = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getCryptographicKey();
            this._performanceMonitoringCollectionIsOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).isPerformanceMonitoringCollectionIsOn();
            this._thresholdCrossAlarmList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getThresholdCrossAlarmList();
            this._loopBackKindOn = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getLoopBackKindOn();
            this._maintenanceTimer = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getMaintenanceTimer();
            this._problemKindSeverityList = ((org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG)arg).getProblemKindSeverityList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getAirInterfaceName() {
        return _airInterfaceName;
    }
    
    public java.lang.Short getAtpcThreshLower() {
        return _atpcThreshLower;
    }
    
    public java.lang.Short getAtpcThreshUpper() {
        return _atpcThreshUpper;
    }
    
    public java.lang.Byte getAtpcTxPowerMin() {
        return _atpcTxPowerMin;
    }
    
    public java.lang.Byte getAutoFreqSelectRange() {
        return _autoFreqSelectRange;
    }
    
    public java.lang.String getCryptographicKey() {
        return _cryptographicKey;
    }
    
    public java.lang.Short getExpectedSignalId() {
        return _expectedSignalId;
    }
    
    public LoopBackType getLoopBackKindOn() {
        return _loopBackKindOn;
    }
    
    public java.lang.Integer getMaintenanceTimer() {
        return _maintenanceTimer;
    }
    
    public java.lang.Short getModulationMax() {
        return _modulationMax;
    }
    
    public java.lang.Short getModulationMin() {
        return _modulationMin;
    }
    
    public PolarizationType getPolarization() {
        return _polarization;
    }
    
    public List<ProblemKindSeverityList> getProblemKindSeverityList() {
        return _problemKindSeverityList;
    }
    
    public java.lang.String getRadioSignalId() {
        return _radioSignalId;
    }
    
    public java.lang.String getRemoteAirInterfaceName() {
        return _remoteAirInterfaceName;
    }
    
    public java.lang.Integer getRxChannelBandwidth() {
        return _rxChannelBandwidth;
    }
    
    public java.lang.Integer getRxFrequency() {
        return _rxFrequency;
    }
    
    public List<ThresholdCrossAlarmList> getThresholdCrossAlarmList() {
        return _thresholdCrossAlarmList;
    }
    
    public UniversalId getTransmissionModeMax() {
        return _transmissionModeMax;
    }
    
    public UniversalId getTransmissionModeMin() {
        return _transmissionModeMin;
    }
    
    public java.lang.Short getTransmittedSignalId() {
        return _transmittedSignalId;
    }
    
    public java.lang.Integer getTxChannelBandwidth() {
        return _txChannelBandwidth;
    }
    
    public java.lang.Integer getTxFrequency() {
        return _txFrequency;
    }
    
    public java.lang.Byte getTxPower() {
        return _txPower;
    }
    
    public java.lang.Boolean isAdaptiveModulationIsOn() {
        return _adaptiveModulationIsOn;
    }
    
    public java.lang.Boolean isAlicIsOn() {
        return _alicIsOn;
    }
    
    public java.lang.Boolean isAtpcIsOn() {
        return _atpcIsOn;
    }
    
    public java.lang.Boolean isAutoFreqSelectIsOn() {
        return _autoFreqSelectIsOn;
    }
    
    public java.lang.Boolean isEncryptionIsOn() {
        return _encryptionIsOn;
    }
    
    public java.lang.Boolean isMimoIsOn() {
        return _mimoIsOn;
    }
    
    public java.lang.Boolean isModulationIsOn() {
        return _modulationIsOn;
    }
    
    public java.lang.Boolean isPerformanceMonitoringCollectionIsOn() {
        return _performanceMonitoringCollectionIsOn;
    }
    
    public java.lang.Boolean isPowerIsOn() {
        return _powerIsOn;
    }
    
    public java.lang.Boolean isReceiverIsOn() {
        return _receiverIsOn;
    }
    
    public java.lang.Boolean isTransmitterIsOn() {
        return _transmitterIsOn;
    }
    
    public java.lang.Boolean isXpicIsOn() {
        return _xpicIsOn;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AirInterfaceConfigurationBuilder setAirInterfaceName(final java.lang.String value) {
        this._airInterfaceName = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setAtpcThreshLower(final java.lang.Short value) {
        this._atpcThreshLower = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setAtpcThreshUpper(final java.lang.Short value) {
        this._atpcThreshUpper = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setAtpcTxPowerMin(final java.lang.Byte value) {
        this._atpcTxPowerMin = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setAutoFreqSelectRange(final java.lang.Byte value) {
        this._autoFreqSelectRange = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setCryptographicKey(final java.lang.String value) {
        this._cryptographicKey = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setExpectedSignalId(final java.lang.Short value) {
        this._expectedSignalId = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setLoopBackKindOn(final LoopBackType value) {
        this._loopBackKindOn = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setMaintenanceTimer(final java.lang.Integer value) {
        this._maintenanceTimer = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setModulationMax(final java.lang.Short value) {
        this._modulationMax = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setModulationMin(final java.lang.Short value) {
        this._modulationMin = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setPolarization(final PolarizationType value) {
        this._polarization = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setProblemKindSeverityList(final List<ProblemKindSeverityList> value) {
        this._problemKindSeverityList = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setRadioSignalId(final java.lang.String value) {
        this._radioSignalId = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setRemoteAirInterfaceName(final java.lang.String value) {
        this._remoteAirInterfaceName = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setRxChannelBandwidth(final java.lang.Integer value) {
        this._rxChannelBandwidth = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setRxFrequency(final java.lang.Integer value) {
        this._rxFrequency = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setThresholdCrossAlarmList(final List<ThresholdCrossAlarmList> value) {
        this._thresholdCrossAlarmList = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setTransmissionModeMax(final UniversalId value) {
        this._transmissionModeMax = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setTransmissionModeMin(final UniversalId value) {
        this._transmissionModeMin = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setTransmittedSignalId(final java.lang.Short value) {
        this._transmittedSignalId = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setTxChannelBandwidth(final java.lang.Integer value) {
        this._txChannelBandwidth = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setTxFrequency(final java.lang.Integer value) {
        this._txFrequency = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setTxPower(final java.lang.Byte value) {
        this._txPower = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setAdaptiveModulationIsOn(final java.lang.Boolean value) {
        this._adaptiveModulationIsOn = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setAlicIsOn(final java.lang.Boolean value) {
        this._alicIsOn = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setAtpcIsOn(final java.lang.Boolean value) {
        this._atpcIsOn = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setAutoFreqSelectIsOn(final java.lang.Boolean value) {
        this._autoFreqSelectIsOn = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setEncryptionIsOn(final java.lang.Boolean value) {
        this._encryptionIsOn = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setMimoIsOn(final java.lang.Boolean value) {
        this._mimoIsOn = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setModulationIsOn(final java.lang.Boolean value) {
        this._modulationIsOn = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setPerformanceMonitoringCollectionIsOn(final java.lang.Boolean value) {
        this._performanceMonitoringCollectionIsOn = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setPowerIsOn(final java.lang.Boolean value) {
        this._powerIsOn = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setReceiverIsOn(final java.lang.Boolean value) {
        this._receiverIsOn = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setTransmitterIsOn(final java.lang.Boolean value) {
        this._transmitterIsOn = value;
        return this;
    }
    
     
    public AirInterfaceConfigurationBuilder setXpicIsOn(final java.lang.Boolean value) {
        this._xpicIsOn = value;
        return this;
    }
    
    public AirInterfaceConfigurationBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AirInterfaceConfigurationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AirInterfaceConfiguration build() {
        return new AirInterfaceConfigurationImpl(this);
    }

    private static final class AirInterfaceConfigurationImpl implements AirInterfaceConfiguration {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration.class;
        }

        private final java.lang.String _airInterfaceName;
        private final java.lang.Short _atpcThreshLower;
        private final java.lang.Short _atpcThreshUpper;
        private final java.lang.Byte _atpcTxPowerMin;
        private final java.lang.Byte _autoFreqSelectRange;
        private final java.lang.String _cryptographicKey;
        private final java.lang.Short _expectedSignalId;
        private final LoopBackType _loopBackKindOn;
        private final java.lang.Integer _maintenanceTimer;
        private final java.lang.Short _modulationMax;
        private final java.lang.Short _modulationMin;
        private final PolarizationType _polarization;
        private final List<ProblemKindSeverityList> _problemKindSeverityList;
        private final java.lang.String _radioSignalId;
        private final java.lang.String _remoteAirInterfaceName;
        private final java.lang.Integer _rxChannelBandwidth;
        private final java.lang.Integer _rxFrequency;
        private final List<ThresholdCrossAlarmList> _thresholdCrossAlarmList;
        private final UniversalId _transmissionModeMax;
        private final UniversalId _transmissionModeMin;
        private final java.lang.Short _transmittedSignalId;
        private final java.lang.Integer _txChannelBandwidth;
        private final java.lang.Integer _txFrequency;
        private final java.lang.Byte _txPower;
        private final java.lang.Boolean _adaptiveModulationIsOn;
        private final java.lang.Boolean _alicIsOn;
        private final java.lang.Boolean _atpcIsOn;
        private final java.lang.Boolean _autoFreqSelectIsOn;
        private final java.lang.Boolean _encryptionIsOn;
        private final java.lang.Boolean _mimoIsOn;
        private final java.lang.Boolean _modulationIsOn;
        private final java.lang.Boolean _performanceMonitoringCollectionIsOn;
        private final java.lang.Boolean _powerIsOn;
        private final java.lang.Boolean _receiverIsOn;
        private final java.lang.Boolean _transmitterIsOn;
        private final java.lang.Boolean _xpicIsOn;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>> augmentation = Collections.emptyMap();

        private AirInterfaceConfigurationImpl(AirInterfaceConfigurationBuilder base) {
            this._airInterfaceName = base.getAirInterfaceName();
            this._atpcThreshLower = base.getAtpcThreshLower();
            this._atpcThreshUpper = base.getAtpcThreshUpper();
            this._atpcTxPowerMin = base.getAtpcTxPowerMin();
            this._autoFreqSelectRange = base.getAutoFreqSelectRange();
            this._cryptographicKey = base.getCryptographicKey();
            this._expectedSignalId = base.getExpectedSignalId();
            this._loopBackKindOn = base.getLoopBackKindOn();
            this._maintenanceTimer = base.getMaintenanceTimer();
            this._modulationMax = base.getModulationMax();
            this._modulationMin = base.getModulationMin();
            this._polarization = base.getPolarization();
            this._problemKindSeverityList = base.getProblemKindSeverityList();
            this._radioSignalId = base.getRadioSignalId();
            this._remoteAirInterfaceName = base.getRemoteAirInterfaceName();
            this._rxChannelBandwidth = base.getRxChannelBandwidth();
            this._rxFrequency = base.getRxFrequency();
            this._thresholdCrossAlarmList = base.getThresholdCrossAlarmList();
            this._transmissionModeMax = base.getTransmissionModeMax();
            this._transmissionModeMin = base.getTransmissionModeMin();
            this._transmittedSignalId = base.getTransmittedSignalId();
            this._txChannelBandwidth = base.getTxChannelBandwidth();
            this._txFrequency = base.getTxFrequency();
            this._txPower = base.getTxPower();
            this._adaptiveModulationIsOn = base.isAdaptiveModulationIsOn();
            this._alicIsOn = base.isAlicIsOn();
            this._atpcIsOn = base.isAtpcIsOn();
            this._autoFreqSelectIsOn = base.isAutoFreqSelectIsOn();
            this._encryptionIsOn = base.isEncryptionIsOn();
            this._mimoIsOn = base.isMimoIsOn();
            this._modulationIsOn = base.isModulationIsOn();
            this._performanceMonitoringCollectionIsOn = base.isPerformanceMonitoringCollectionIsOn();
            this._powerIsOn = base.isPowerIsOn();
            this._receiverIsOn = base.isReceiverIsOn();
            this._transmitterIsOn = base.isTransmitterIsOn();
            this._xpicIsOn = base.isXpicIsOn();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getAirInterfaceName() {
            return _airInterfaceName;
        }
        
        @Override
        public java.lang.Short getAtpcThreshLower() {
            return _atpcThreshLower;
        }
        
        @Override
        public java.lang.Short getAtpcThreshUpper() {
            return _atpcThreshUpper;
        }
        
        @Override
        public java.lang.Byte getAtpcTxPowerMin() {
            return _atpcTxPowerMin;
        }
        
        @Override
        public java.lang.Byte getAutoFreqSelectRange() {
            return _autoFreqSelectRange;
        }
        
        @Override
        public java.lang.String getCryptographicKey() {
            return _cryptographicKey;
        }
        
        @Override
        public java.lang.Short getExpectedSignalId() {
            return _expectedSignalId;
        }
        
        @Override
        public LoopBackType getLoopBackKindOn() {
            return _loopBackKindOn;
        }
        
        @Override
        public java.lang.Integer getMaintenanceTimer() {
            return _maintenanceTimer;
        }
        
        @Override
        public java.lang.Short getModulationMax() {
            return _modulationMax;
        }
        
        @Override
        public java.lang.Short getModulationMin() {
            return _modulationMin;
        }
        
        @Override
        public PolarizationType getPolarization() {
            return _polarization;
        }
        
        @Override
        public List<ProblemKindSeverityList> getProblemKindSeverityList() {
            return _problemKindSeverityList;
        }
        
        @Override
        public java.lang.String getRadioSignalId() {
            return _radioSignalId;
        }
        
        @Override
        public java.lang.String getRemoteAirInterfaceName() {
            return _remoteAirInterfaceName;
        }
        
        @Override
        public java.lang.Integer getRxChannelBandwidth() {
            return _rxChannelBandwidth;
        }
        
        @Override
        public java.lang.Integer getRxFrequency() {
            return _rxFrequency;
        }
        
        @Override
        public List<ThresholdCrossAlarmList> getThresholdCrossAlarmList() {
            return _thresholdCrossAlarmList;
        }
        
        @Override
        public UniversalId getTransmissionModeMax() {
            return _transmissionModeMax;
        }
        
        @Override
        public UniversalId getTransmissionModeMin() {
            return _transmissionModeMin;
        }
        
        @Override
        public java.lang.Short getTransmittedSignalId() {
            return _transmittedSignalId;
        }
        
        @Override
        public java.lang.Integer getTxChannelBandwidth() {
            return _txChannelBandwidth;
        }
        
        @Override
        public java.lang.Integer getTxFrequency() {
            return _txFrequency;
        }
        
        @Override
        public java.lang.Byte getTxPower() {
            return _txPower;
        }
        
        @Override
        public java.lang.Boolean isAdaptiveModulationIsOn() {
            return _adaptiveModulationIsOn;
        }
        
        @Override
        public java.lang.Boolean isAlicIsOn() {
            return _alicIsOn;
        }
        
        @Override
        public java.lang.Boolean isAtpcIsOn() {
            return _atpcIsOn;
        }
        
        @Override
        public java.lang.Boolean isAutoFreqSelectIsOn() {
            return _autoFreqSelectIsOn;
        }
        
        @Override
        public java.lang.Boolean isEncryptionIsOn() {
            return _encryptionIsOn;
        }
        
        @Override
        public java.lang.Boolean isMimoIsOn() {
            return _mimoIsOn;
        }
        
        @Override
        public java.lang.Boolean isModulationIsOn() {
            return _modulationIsOn;
        }
        
        @Override
        public java.lang.Boolean isPerformanceMonitoringCollectionIsOn() {
            return _performanceMonitoringCollectionIsOn;
        }
        
        @Override
        public java.lang.Boolean isPowerIsOn() {
            return _powerIsOn;
        }
        
        @Override
        public java.lang.Boolean isReceiverIsOn() {
            return _receiverIsOn;
        }
        
        @Override
        public java.lang.Boolean isTransmitterIsOn() {
            return _transmitterIsOn;
        }
        
        @Override
        public java.lang.Boolean isXpicIsOn() {
            return _xpicIsOn;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_airInterfaceName);
            result = prime * result + Objects.hashCode(_atpcThreshLower);
            result = prime * result + Objects.hashCode(_atpcThreshUpper);
            result = prime * result + Objects.hashCode(_atpcTxPowerMin);
            result = prime * result + Objects.hashCode(_autoFreqSelectRange);
            result = prime * result + Objects.hashCode(_cryptographicKey);
            result = prime * result + Objects.hashCode(_expectedSignalId);
            result = prime * result + Objects.hashCode(_loopBackKindOn);
            result = prime * result + Objects.hashCode(_maintenanceTimer);
            result = prime * result + Objects.hashCode(_modulationMax);
            result = prime * result + Objects.hashCode(_modulationMin);
            result = prime * result + Objects.hashCode(_polarization);
            result = prime * result + Objects.hashCode(_problemKindSeverityList);
            result = prime * result + Objects.hashCode(_radioSignalId);
            result = prime * result + Objects.hashCode(_remoteAirInterfaceName);
            result = prime * result + Objects.hashCode(_rxChannelBandwidth);
            result = prime * result + Objects.hashCode(_rxFrequency);
            result = prime * result + Objects.hashCode(_thresholdCrossAlarmList);
            result = prime * result + Objects.hashCode(_transmissionModeMax);
            result = prime * result + Objects.hashCode(_transmissionModeMin);
            result = prime * result + Objects.hashCode(_transmittedSignalId);
            result = prime * result + Objects.hashCode(_txChannelBandwidth);
            result = prime * result + Objects.hashCode(_txFrequency);
            result = prime * result + Objects.hashCode(_txPower);
            result = prime * result + Objects.hashCode(_adaptiveModulationIsOn);
            result = prime * result + Objects.hashCode(_alicIsOn);
            result = prime * result + Objects.hashCode(_atpcIsOn);
            result = prime * result + Objects.hashCode(_autoFreqSelectIsOn);
            result = prime * result + Objects.hashCode(_encryptionIsOn);
            result = prime * result + Objects.hashCode(_mimoIsOn);
            result = prime * result + Objects.hashCode(_modulationIsOn);
            result = prime * result + Objects.hashCode(_performanceMonitoringCollectionIsOn);
            result = prime * result + Objects.hashCode(_powerIsOn);
            result = prime * result + Objects.hashCode(_receiverIsOn);
            result = prime * result + Objects.hashCode(_transmitterIsOn);
            result = prime * result + Objects.hashCode(_xpicIsOn);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration other = (org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration)obj;
            if (!Objects.equals(_airInterfaceName, other.getAirInterfaceName())) {
                return false;
            }
            if (!Objects.equals(_atpcThreshLower, other.getAtpcThreshLower())) {
                return false;
            }
            if (!Objects.equals(_atpcThreshUpper, other.getAtpcThreshUpper())) {
                return false;
            }
            if (!Objects.equals(_atpcTxPowerMin, other.getAtpcTxPowerMin())) {
                return false;
            }
            if (!Objects.equals(_autoFreqSelectRange, other.getAutoFreqSelectRange())) {
                return false;
            }
            if (!Objects.equals(_cryptographicKey, other.getCryptographicKey())) {
                return false;
            }
            if (!Objects.equals(_expectedSignalId, other.getExpectedSignalId())) {
                return false;
            }
            if (!Objects.equals(_loopBackKindOn, other.getLoopBackKindOn())) {
                return false;
            }
            if (!Objects.equals(_maintenanceTimer, other.getMaintenanceTimer())) {
                return false;
            }
            if (!Objects.equals(_modulationMax, other.getModulationMax())) {
                return false;
            }
            if (!Objects.equals(_modulationMin, other.getModulationMin())) {
                return false;
            }
            if (!Objects.equals(_polarization, other.getPolarization())) {
                return false;
            }
            if (!Objects.equals(_problemKindSeverityList, other.getProblemKindSeverityList())) {
                return false;
            }
            if (!Objects.equals(_radioSignalId, other.getRadioSignalId())) {
                return false;
            }
            if (!Objects.equals(_remoteAirInterfaceName, other.getRemoteAirInterfaceName())) {
                return false;
            }
            if (!Objects.equals(_rxChannelBandwidth, other.getRxChannelBandwidth())) {
                return false;
            }
            if (!Objects.equals(_rxFrequency, other.getRxFrequency())) {
                return false;
            }
            if (!Objects.equals(_thresholdCrossAlarmList, other.getThresholdCrossAlarmList())) {
                return false;
            }
            if (!Objects.equals(_transmissionModeMax, other.getTransmissionModeMax())) {
                return false;
            }
            if (!Objects.equals(_transmissionModeMin, other.getTransmissionModeMin())) {
                return false;
            }
            if (!Objects.equals(_transmittedSignalId, other.getTransmittedSignalId())) {
                return false;
            }
            if (!Objects.equals(_txChannelBandwidth, other.getTxChannelBandwidth())) {
                return false;
            }
            if (!Objects.equals(_txFrequency, other.getTxFrequency())) {
                return false;
            }
            if (!Objects.equals(_txPower, other.getTxPower())) {
                return false;
            }
            if (!Objects.equals(_adaptiveModulationIsOn, other.isAdaptiveModulationIsOn())) {
                return false;
            }
            if (!Objects.equals(_alicIsOn, other.isAlicIsOn())) {
                return false;
            }
            if (!Objects.equals(_atpcIsOn, other.isAtpcIsOn())) {
                return false;
            }
            if (!Objects.equals(_autoFreqSelectIsOn, other.isAutoFreqSelectIsOn())) {
                return false;
            }
            if (!Objects.equals(_encryptionIsOn, other.isEncryptionIsOn())) {
                return false;
            }
            if (!Objects.equals(_mimoIsOn, other.isMimoIsOn())) {
                return false;
            }
            if (!Objects.equals(_modulationIsOn, other.isModulationIsOn())) {
                return false;
            }
            if (!Objects.equals(_performanceMonitoringCollectionIsOn, other.isPerformanceMonitoringCollectionIsOn())) {
                return false;
            }
            if (!Objects.equals(_powerIsOn, other.isPowerIsOn())) {
                return false;
            }
            if (!Objects.equals(_receiverIsOn, other.isReceiverIsOn())) {
                return false;
            }
            if (!Objects.equals(_transmitterIsOn, other.isTransmitterIsOn())) {
                return false;
            }
            if (!Objects.equals(_xpicIsOn, other.isXpicIsOn())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AirInterfaceConfigurationImpl otherImpl = (AirInterfaceConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AirInterfaceConfiguration [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_airInterfaceName != null) {
                builder.append("_airInterfaceName=");
                builder.append(_airInterfaceName);
                builder.append(", ");
            }
            if (_atpcThreshLower != null) {
                builder.append("_atpcThreshLower=");
                builder.append(_atpcThreshLower);
                builder.append(", ");
            }
            if (_atpcThreshUpper != null) {
                builder.append("_atpcThreshUpper=");
                builder.append(_atpcThreshUpper);
                builder.append(", ");
            }
            if (_atpcTxPowerMin != null) {
                builder.append("_atpcTxPowerMin=");
                builder.append(_atpcTxPowerMin);
                builder.append(", ");
            }
            if (_autoFreqSelectRange != null) {
                builder.append("_autoFreqSelectRange=");
                builder.append(_autoFreqSelectRange);
                builder.append(", ");
            }
            if (_cryptographicKey != null) {
                builder.append("_cryptographicKey=");
                builder.append(_cryptographicKey);
                builder.append(", ");
            }
            if (_expectedSignalId != null) {
                builder.append("_expectedSignalId=");
                builder.append(_expectedSignalId);
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
            if (_modulationMax != null) {
                builder.append("_modulationMax=");
                builder.append(_modulationMax);
                builder.append(", ");
            }
            if (_modulationMin != null) {
                builder.append("_modulationMin=");
                builder.append(_modulationMin);
                builder.append(", ");
            }
            if (_polarization != null) {
                builder.append("_polarization=");
                builder.append(_polarization);
                builder.append(", ");
            }
            if (_problemKindSeverityList != null) {
                builder.append("_problemKindSeverityList=");
                builder.append(_problemKindSeverityList);
                builder.append(", ");
            }
            if (_radioSignalId != null) {
                builder.append("_radioSignalId=");
                builder.append(_radioSignalId);
                builder.append(", ");
            }
            if (_remoteAirInterfaceName != null) {
                builder.append("_remoteAirInterfaceName=");
                builder.append(_remoteAirInterfaceName);
                builder.append(", ");
            }
            if (_rxChannelBandwidth != null) {
                builder.append("_rxChannelBandwidth=");
                builder.append(_rxChannelBandwidth);
                builder.append(", ");
            }
            if (_rxFrequency != null) {
                builder.append("_rxFrequency=");
                builder.append(_rxFrequency);
                builder.append(", ");
            }
            if (_thresholdCrossAlarmList != null) {
                builder.append("_thresholdCrossAlarmList=");
                builder.append(_thresholdCrossAlarmList);
                builder.append(", ");
            }
            if (_transmissionModeMax != null) {
                builder.append("_transmissionModeMax=");
                builder.append(_transmissionModeMax);
                builder.append(", ");
            }
            if (_transmissionModeMin != null) {
                builder.append("_transmissionModeMin=");
                builder.append(_transmissionModeMin);
                builder.append(", ");
            }
            if (_transmittedSignalId != null) {
                builder.append("_transmittedSignalId=");
                builder.append(_transmittedSignalId);
                builder.append(", ");
            }
            if (_txChannelBandwidth != null) {
                builder.append("_txChannelBandwidth=");
                builder.append(_txChannelBandwidth);
                builder.append(", ");
            }
            if (_txFrequency != null) {
                builder.append("_txFrequency=");
                builder.append(_txFrequency);
                builder.append(", ");
            }
            if (_txPower != null) {
                builder.append("_txPower=");
                builder.append(_txPower);
                builder.append(", ");
            }
            if (_adaptiveModulationIsOn != null) {
                builder.append("_adaptiveModulationIsOn=");
                builder.append(_adaptiveModulationIsOn);
                builder.append(", ");
            }
            if (_alicIsOn != null) {
                builder.append("_alicIsOn=");
                builder.append(_alicIsOn);
                builder.append(", ");
            }
            if (_atpcIsOn != null) {
                builder.append("_atpcIsOn=");
                builder.append(_atpcIsOn);
                builder.append(", ");
            }
            if (_autoFreqSelectIsOn != null) {
                builder.append("_autoFreqSelectIsOn=");
                builder.append(_autoFreqSelectIsOn);
                builder.append(", ");
            }
            if (_encryptionIsOn != null) {
                builder.append("_encryptionIsOn=");
                builder.append(_encryptionIsOn);
                builder.append(", ");
            }
            if (_mimoIsOn != null) {
                builder.append("_mimoIsOn=");
                builder.append(_mimoIsOn);
                builder.append(", ");
            }
            if (_modulationIsOn != null) {
                builder.append("_modulationIsOn=");
                builder.append(_modulationIsOn);
                builder.append(", ");
            }
            if (_performanceMonitoringCollectionIsOn != null) {
                builder.append("_performanceMonitoringCollectionIsOn=");
                builder.append(_performanceMonitoringCollectionIsOn);
                builder.append(", ");
            }
            if (_powerIsOn != null) {
                builder.append("_powerIsOn=");
                builder.append(_powerIsOn);
                builder.append(", ");
            }
            if (_receiverIsOn != null) {
                builder.append("_receiverIsOn=");
                builder.append(_receiverIsOn);
                builder.append(", ");
            }
            if (_transmitterIsOn != null) {
                builder.append("_transmitterIsOn=");
                builder.append(_transmitterIsOn);
                builder.append(", ");
            }
            if (_xpicIsOn != null) {
                builder.append("_xpicIsOn=");
                builder.append(_xpicIsOn);
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
