package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.configuration.g.ProblemKindSeverityList;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping wire-interface-configuration-g {
 *     leaf wire-interface-name {
 *         type wire-interface-name;
 *     }
 *     leaf remote-wire-interface-name {
 *         type remote-wire-interface-name;
 *     }
 *     leaf interface-is-on {
 *         type interface-is-on;
 *     }
 *     leaf-list transceiver-is-on-list {
 *         type boolean;
 *     }
 *     leaf auto-pmd-negotiation-is-on {
 *         type auto-pmd-negotiation-is-on;
 *     }
 *     leaf fixed-pmd {
 *         type fixed-pmd;
 *     }
 *     leaf auto-pmd-negotiation-max {
 *         type auto-pmd-negotiation-max;
 *     }
 *     leaf auto-signal-ordering-is-on {
 *         type auto-signal-ordering-is-on;
 *     }
 *     leaf fixed-signal-ordering {
 *         type universal-id;
 *     }
 *     leaf short-reach-mode-is-on {
 *         type short-reach-mode-is-on;
 *     }
 *     leaf unidirectional-operation-is-on {
 *         type unidirectional-operation-is-on;
 *     }
 *     leaf-list wavelength-list {
 *         type wavelength-list;
 *     }
 *     leaf temperature-high-threshold {
 *         type temperature-high-threshold;
 *     }
 *     leaf temperature-low-threshold {
 *         type temperature-low-threshold;
 *     }
 *     leaf rxlevel-high-threshold {
 *         type rxlevel-high-threshold;
 *     }
 *     leaf rxlevel-low-threshold {
 *         type rxlevel-low-threshold;
 *     }
 *     leaf loop-back-kind-on {
 *         type string;
 *     }
 *     leaf isolation-is-on {
 *         type isolation-is-on;
 *     }
 *     leaf restart-pmd-negotiation-is-on {
 *         type restart-pmd-negotiation-is-on;
 *     }
 *     leaf reset-mau-is-on {
 *         type reset-mau-is-on;
 *     }
 *     leaf maintenance-timer {
 *         type maintenance-timer;
 *     }
 *     list problem-kind-severity-list {
 *         key "problem-kind-name";
 *         leaf problem-kind-name {
 *             type string;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *         uses wire-interface-problem-severity-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-configuration-g</i>
 *
 */
public interface WireInterfaceConfigurationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "wire-interface-configuration-g").intern();

    /**
     * Text field for the wire interface being named by the operator. Ideally used for 
     * entering unique numbers or names for unambiguously identifying the connection 
     * within the networkParameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>wireInterfaceName</code>, or <code>null</code> if not present
     */
    java.lang.String getWireInterfaceName();
    
    /**
     * Learning from MW IMText field for defining the wire interface this one is 
     * connected with. Ideally used for entering unique numbers or names for 
     * unambiguously identifying the connection within the network
     *
     *
     *
     * @return <code>java.lang.String</code> <code>remoteWireInterfaceName</code>, or <code>null</code> if not present
     */
    java.lang.String getRemoteWireInterfaceName();
    
    /**
     * 1 = Activation of the interface (it gets powered and can be managed even if the 
     * transceiver is not yet transmitting or receiving). In case there is no Medium 
     * Attachment Unit (MAU) (e.g. no SFP in the cage) SETting (interfaceIsOn=1) must 
     * be ignored and GETing must return (interfaceIsOn=0)802.3 according 30.3.2.2.1 
     * acPhyAdminControl
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>interfaceIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isInterfaceIsOn();
    
    /**
     * 802.3 22.?.? and additionally 802.3 45.2.1.8 PMD transmit disable register 
     * (Register 1.9)1 = Activation of the transmitter and receiver (e.g. laser) of the
     * PHY; transceiverIsOnList[0]:total interface; transceiverIsOnList[1..10] 
     * different lanes of a multilane Medium Attachment Unit (MAU)
     *
     *
     *
     * @return <code>java.util.List</code> <code>transceiverIsOnList</code>, or <code>null</code> if not present
     */
    List<java.lang.Boolean> getTransceiverIsOnList();
    
    /**
     * Parameter1 = Auto-negotiation is switched on
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>autoPmdNegotiationIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAutoPmdNegotiationIsOn();
    
    /**
     * If (autoPmdNegotiationIsOn=0) configuration of the concrete kind of Physical 
     * Medium Dependent (PMD). If (autoNegotiationIsOn=1) value of this field becomes 
     * irrelevant
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.PmdNameType</code> <code>fixedPmd</code>, or <code>null</code> if not present
     */
    PmdNameType getFixedPmd();
    
    /**
     * ParameterIf (autoNegotiationIsOn=1) AND (autoNegotiationMauMaxIsAvail=1) 
     * configuration of the maximum speed/Physical Medium Dependent (PMD), which is 
     * automatically chosen by Auto-negotiation
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.PmdNameType</code> <code>autoPmdNegotiationMax</code>, or <code>null</code> if not present
     */
    PmdNameType getAutoPmdNegotiationMax();
    
    /**
     * 1 = e.g. auto-MDI-X is switched on
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>autoSignalOrderingIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAutoSignalOrderingIsOn();
    
    /**
     * If (autoSignalOrderingIsOn=0) configuration of the concrete kind of signal 
     * ordering on the media (e.g. MDI, or MDI-X). If (autoSignalOrderingIsOn=1) value 
     * of this field becomes irrelevant
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>fixedSignalOrdering</code>, or <code>null</code> if not present
     */
    UniversalId getFixedSignalOrdering();
    
    /**
     * Activation of the Short Reach Mode for 10GBASE-T according to 802.3 45.2.1.64
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>shortReachModeIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isShortReachModeIsOn();
    
    /**
     * If (autoNegotiationIsOn=1) OR manualDuplexSelection=0 (=half duplex), this bit 
     * is ignored. When autoNegotiationIsOn=0 AND manualDuplexSelection=1 (=full 
     * duplex): 1 = Enable transmit from media independent interface regardless of 
     * whether the PHY has determined that a valid link has been established, 0 = 
     * Enable transmit from media independent interface only when the PHY has 
     * determined that a valid link has been established802.3Parameter
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>unidirectionalOperationIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isUnidirectionalOperationIsOn();
    
    /**
     * Wavelength of the signal of laser in pico meter; multiplicity=0..3 for 
     * 10GBASE-LX4 according to 802.3 53.5SFF-8690
     *
     *
     *
     * @return <code>java.util.List</code> <code>wavelengthList</code>, or <code>null</code> if not present
     */
    List<java.lang.Integer> getWavelengthList();
    
    /**
     * Threshold for alarming high temperature values.Will move to somewhere in the 
     * Physical Segment of the Core IM
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>temperatureHighThreshold</code>, or <code>null</code> if not present
     */
    java.lang.Byte getTemperatureHighThreshold();
    
    /**
     * Threshold for alarming low temperature values.Will move to somewhere in the 
     * Physical Segment of the Core IM
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>temperatureLowThreshold</code>, or <code>null</code> if not present
     */
    java.lang.Byte getTemperatureLowThreshold();
    
    /**
     * Threshold for alarming high RX levels.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>rxlevelHighThreshold</code>, or <code>null</code> if not present
     */
    java.lang.Byte getRxlevelHighThreshold();
    
    /**
     * Threshold for alarming low RX levels.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>rxlevelLowThreshold</code>, or <code>null</code> if not present
     */
    java.lang.Byte getRxlevelLowThreshold();
    
    /**
     * Parameter802.3 according 22.2.4.1.2 LoopbackMaintenance Feature. The currently 
     * configured type of looping back of the wire interface header shall be expressed 
     * here. The received header is returned to the remote site.Activation of local 
     * loopback mode on physical layer
     *
     *
     *
     * @return <code>java.lang.String</code> <code>loopBackKindOn</code>, or <code>null</code> if not present
     */
    java.lang.String getLoopBackKindOn();
    
    /**
     * 1 = Activation of the separation of the PHY from higher network layers802.3
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isolationIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsolationIsOn();
    
    /**
     * Restarts the auto negotiation process802.3
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>restartPmdNegotiationIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isRestartPmdNegotiationIsOn();
    
    /**
     * 802.3Resets the entire Medium Access Unit (MAU)
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>resetMauIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isResetMauIsOn();
    
    /**
     * Parameter and MW IMTime of existence of any maintenance configuration (e.g. the 
     * loop back). Valid values are defined in 
     * WireInterface::WireInterfaceCapability::maintenanceTimerRange
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

