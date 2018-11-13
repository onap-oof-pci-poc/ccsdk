package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.configuration.g.ProblemKindSeverityList;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * Configuration of the radio link.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-configuration-g {
 *     leaf air-interface-name {
 *         type air-interface-name;
 *     }
 *     leaf radio-signal-id {
 *         type radio-signal-id;
 *     }
 *     leaf tx-frequency {
 *         type tx-frequency;
 *     }
 *     leaf rx-frequency {
 *         type rx-frequency;
 *     }
 *     leaf tx-channel-bandwidth {
 *         type tx-channel-bandwidth;
 *     }
 *     leaf rx-channel-bandwidth {
 *         type rx-channel-bandwidth;
 *     }
 *     leaf polarization {
 *         type polarization;
 *     }
 *     leaf power-is-on {
 *         type power-is-on;
 *     }
 *     leaf transmitter-is-on {
 *         type transmitter-is-on;
 *     }
 *     leaf receiver-is-on {
 *         type receiver-is-on;
 *     }
 *     leaf tx-power {
 *         type tx-power;
 *     }
 *     leaf adaptive-modulation-is-on {
 *         type adaptive-modulation-is-on;
 *     }
 *     leaf modulation-min {
 *         type modulation-min;
 *     }
 *     leaf modulation-max {
 *         type modulation-max;
 *     }
 *     leaf xpic-is-on {
 *         type xpic-is-on;
 *     }
 *     leaf mimo-is-on {
 *         type mimo-is-on;
 *     }
 *     leaf alic-is-on {
 *         type alic-is-on;
 *     }
 *     leaf atpc-is-on {
 *         type atpc-is-on;
 *     }
 *     leaf atpc-thresh-upper {
 *         type atpc-thresh-upper;
 *     }
 *     leaf atpc-thresh-lower {
 *         type atpc-thresh-lower;
 *     }
 *     leaf auto-freq-select-is-on {
 *         type auto-freq-select-is-on;
 *     }
 *     leaf auto-freq-select-range {
 *         type auto-freq-select-range;
 *     }
 *     leaf modulation-is-on {
 *         type modulation-is-on;
 *     }
 *     leaf encryption-is-on {
 *         type encryption-is-on;
 *     }
 *     leaf cryptographic-key {
 *         type cryptographic-key;
 *     }
 *     leaf loop-back-kind-on {
 *         type loop-back-kind-on;
 *     }
 *     leaf maintenance-timer {
 *         type maintenance-timer;
 *     }
 *     list problem-kind-severity-list {
 *         key "problem-kind-name";
 *         leaf problem-kind-name {
 *             type problem-kind-name;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *         uses air-interface-problem-severity-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-configuration-g</i>
 *
 */
public interface AirInterfaceConfigurationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "air-interface-configuration-g").intern();

    /**
     * Operator specific microwave link ID (often used for coding area, type of element
     * and sequential number).
     *
     *
     *
     * @return <code>java.lang.String</code> <code>airInterfaceName</code>, or <code>null</code> if not present
     */
    java.lang.String getAirInterfaceName();
    
    /**
     * The radioSignalId is transmitted on the air interface so the remote site of the 
     * link synchronizes on the correct transmitter. The local radio MUST NOT 
     * synchronize on a radio signal with a different radioSignalId. The link ID is 
     * neither an ID necessary to span the model nor an ID referencing external data. 
     * It is just some sort of name of the link transmitted so the correct remote site 
     * can be identified in an interference situation. The value zero might be used to 
     * make the microwave to disable the link ID check.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>radioSignalId</code>, or <code>null</code> if not present
     */
    java.lang.String getRadioSignalId();
    
    /**
     * Center frequency of the transmit channel. The values to be configured have to 
     * exactly match the values listed in the international agreement referenced in 
     * channelPlanID. In case of automated selection of the transmit frequency this 
     * field shall describe the lowest center frequency selectable.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>txFrequency</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTxFrequency();
    
    /**
     * Center frequency of the receive channel.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>rxFrequency</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRxFrequency();
    
    /**
     * Bandwidth of the transmit channel. The value shall be expressed explicitly 
     * (means in kHz) not as a reference to an international agreement. The values 
     * shall be chosen from the following _list: 3.500, 7.000, 14.000, 27.500, 28.000, 
     * 29.000, 29.650, 30.000, 40.000, 50.000, 55.000, 56.000, 59.300, 60.000, 80.000, 
     * 100.000, 112.000, 120.000, 150.000, 200.000, 250.000, 500.000, 750.000, 
     * 1.000.000, 1.250.000, 1.500.000, 1.750.000, 2.000.000;
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>txChannelBandwidth</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTxChannelBandwidth();
    
    /**
     * Bandwidth of the receive channel. The value shall be expressed explicitly (means
     * in kHz) not as a reference to an international agreement. The values shall be 
     * chosen from the following _list: 3.500, 7.000, 14.000, 27.500, 28.000, 29.000, 
     * 29.650, 30.000, 40.000, 50.000, 55.000, 56.000, 59.300, 60.000, 80.000, 100.000,
     * 112.000, 120.000, 150.000, 200.000, 250.000, 500.000, 750.000, 1.000.000, 
     * 1.250.000, 1.500.000, 1.750.000, 2.000.000;
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>rxChannelBandwidth</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRxChannelBandwidth();
    
    /**
     * Allows documenting the polarization of the air interface.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.PolarizationType</code> <code>polarization</code>, or <code>null</code> if not present
     */
    PolarizationType getPolarization();
    
    /**
     * Power ON. Activation of the entire radio in a split mount configuration shall be
     * expressed as a 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>powerIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPowerIsOn();
    
    /**
     * Activation of the transmitter inside the radio shall be expressed as a 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>transmitterIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isTransmitterIsOn();
    
    /**
     * Maintenance Feature. Activation of the receiver inside the radio shall be 
     * expressed as a 'true'. Attribute shall also be used for RX main and RX diversity
     * squelches in case of diversity configurations.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>receiverIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isReceiverIsOn();
    
    /**
     * Transmit power to be configured on the microwave link. Signed Byte is required. 
     * The actually operated transmit power might be lower depending on adaptive 
     * modulation and ATPC.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>txPower</code>, or <code>null</code> if not present
     */
    java.lang.Byte getTxPower();
    
    /**
     * Adaptive Modulation. Activation of adaptive modulation shall be expressed as a 
     * 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>adaptiveModulationIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAdaptiveModulationIsOn();
    
    /**
     * Minimum modulation to be configured (in case adaptive modulation is not used, 
     * this value represents also the fixed modulation). The modulation scheme shall be
     * described by the number of states in the phase diagram (e.g. BPSK-&amp;gt;'2' or
     * 256QAM-&amp;gt;'256'). Allowed values are defined in 
     * TypeDefinitions::transmissionModeType::modulationScheme.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>modulationMin</code>, or <code>null</code> if not present
     */
    java.lang.Short getModulationMin();
    
    /**
     * Maximum modulation to be configured. The value of this field is only relevant, 
     * if Adaptive Modulation has been activated. The modulation scheme shall be 
     * described by the number of states in the phase diagram (e.g. BPSK-&amp;gt;'2' or
     * 256QAM-&amp;gt;'256'). Allowed values are defined in 
     * TypeDefinitions::transmissionModeType::modulationScheme.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>modulationMax</code>, or <code>null</code> if not present
     */
    java.lang.Short getModulationMax();
    
    /**
     * Activation of Cross Polarization Interference Cancelation shall be expressed as 
     * a 'true'. In case XPIC is not available for the current combination of channel 
     * bandwidth and modulation or the hardware in general, this parameter shall always
     * be set to 'false'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>xpicIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isXpicIsOn();
    
    /**
     * Activation of Multiple Input Multiple Output (MIMO) shall be expressed as a 
     * 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mimoIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMimoIsOn();
    
    /**
     * Activation of Adjacent Link Interference Cancelation (ALIC) shall be expressed 
     * as a 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>alicIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAlicIsOn();
    
    /**
     * ATPC. Activation of Automated Transmit Power Control shall be expressed as a 
     * 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>atpcIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAtpcIsOn();
    
    /**
     * If the receive level is higher than the upper threshold value, the transmitter 
     * is notified to decrease transmit power.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>atpcThreshUpper</code>, or <code>null</code> if not present
     */
    java.lang.Short getAtpcThreshUpper();
    
    /**
     * If the receive level is lower than the lower threshold value, the transmitter is
     * notified to increase transmit power.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>atpcThreshLower</code>, or <code>null</code> if not present
     */
    java.lang.Short getAtpcThreshLower();
    
    /**
     * Activation of automatically selecting the transmit frequency in unlicensed bands
     * shall be expressed as a 'true'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>autoFreqSelectIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAutoFreqSelectIsOn();
    
    /**
     * Number of transmit channels (starting at the center frequency defined in 
     * txFrequency and with channel bandwidth according to txChannelBandwidth) that 
     * define the range within the transmit frequency can automatically been chosen. 
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>autoFreqSelectRange</code>, or <code>null</code> if not present
     */
    java.lang.Byte getAutoFreqSelectRange();
    
    /**
     * Maintenance Feature. De-activation of the modulation of the carrier signal for 
     * fault management shall be expressed as a 'false'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>modulationIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isModulationIsOn();
    
    /**
     * Activates encryption of the payload.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>encryptionIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEncryptionIsOn();
    
    /**
     * Key for transforming plaintext into ciphertext data.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cryptographicKey</code>, or <code>null</code> if not present
     */
    java.lang.String getCryptographicKey();
    
    /**
     * Maintenance Feature. The currently configured type of looping back of the air 
     * interface header shall be expressed here. The received header is returned to the
     * remote site.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.LoopBackType</code> <code>loopBackKindOn</code>, or <code>null</code> if not present
     */
    LoopBackType getLoopBackKindOn();
    
    /**
     * Time of existence of any maintenance configuration (e.g. the loop back of 
     * microwave header information). Valid values are defined in 
     * AirInterface::AirInterfaceCapability::maintenanceTimerRange.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>maintenanceTimer</code>, or <code>null</code> if not present
     */
    java.lang.Integer getMaintenanceTimer();
    
    /**
     * Severity of the problem to be configured.
     *
     *
     *
     * @return <code>java.util.List</code> <code>problemKindSeverityList</code>, or <code>null</code> if not present
     */
    List<ProblemKindSeverityList> getProblemKindSeverityList();

}

