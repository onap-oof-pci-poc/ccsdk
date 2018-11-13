package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceHistoricalPerformances;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCurrentPerformance;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCurrentProblems;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list wire-interface-pac {
 *     key "layer-protocol";
 *     leaf layer-protocol {
 *         type leafref;
 *     }
 *     container wirebased-interface-capability {
 *         list available-mau-list {
 *             key "mau-id";
 *             leaf mau-id {
 *                 type universal-id;
 *             }
 *             leaf mii-kind {
 *                 type mii-kind;
 *             }
 *             leaf mdi-kind {
 *                 type mdi-kind;
 *             }
 *             leaf required-medium-kind {
 *                 type required-medium-kind;
 *             }
 *             leaf-list wavelength-min {
 *                 type wavelength-min;
 *             }
 *             leaf-list wavelength-max {
 *                 type wavelength-max;
 *             }
 *             leaf wavelength-grid-min {
 *                 type wavelength-grid-min;
 *             }
 *             leaf link-length-max {
 *                 type link-length-max;
 *             }
 *             leaf vendor-name {
 *                 type vendor-name;
 *             }
 *             leaf vendor-oui {
 *                 type vendor-oui;
 *             }
 *             leaf part-number {
 *                 type part-number;
 *             }
 *             leaf revision-number {
 *                 type revision-number;
 *             }
 *             leaf serial-number {
 *                 type serial-number;
 *             }
 *             leaf date-code {
 *                 type date-code;
 *             }
 *             leaf-list pmd-list {
 *                 type pmd-name-type;
 *             }
 *             list signal-ordering-list {
 *                 key "signal-ordering-kind-name";
 *                 leaf signal-ordering-kind-name {
 *                     type string;
 *                 }
 *                 leaf-list signal-list {
 *                     type string;
 *                 }
 *                 uses signal-ordering-type-g;
 *             }
 *             leaf auto-signal-ordering-is-avail {
 *                 type auto-signal-ordering-is-avail;
 *             }
 *             leaf short-reach-mode-is-avail {
 *                 type short-reach-mode-is-avail;
 *             }
 *             leaf eee-is-avail {
 *                 type eee-is-avail;
 *             }
 *             leaf unidirectional-operation-is-avail {
 *                 type unidirectional-operation-is-avail;
 *             }
 *             leaf-list supported-alarms {
 *                 type string;
 *             }
 *             uses mau-type-g;
 *         }
 *         leaf auto-pmd-negotiation-is-avail {
 *             type auto-pmd-negotiation-is-avail;
 *         }
 *         leaf auto-pmd-negotiation-max-is-avail {
 *             type auto-pmd-negotiation-max-is-avail;
 *         }
 *         leaf-list supported-loop-back-kind-list {
 *             type loop-back-type;
 *         }
 *         leaf maintenance-timer-range {
 *             type maintenance-timer-range;
 *         }
 *         leaf-list supported-alarm-list {
 *             type string;
 *         }
 *         uses wire-interface-capability-g;
 *     }
 *     container wirebased-interface-configuration {
 *         leaf wire-interface-name {
 *             type wire-interface-name;
 *         }
 *         leaf remote-wire-interface-name {
 *             type remote-wire-interface-name;
 *         }
 *         leaf interface-is-on {
 *             type interface-is-on;
 *         }
 *         leaf-list transceiver-is-on-list {
 *             type boolean;
 *         }
 *         leaf auto-pmd-negotiation-is-on {
 *             type auto-pmd-negotiation-is-on;
 *         }
 *         leaf fixed-pmd {
 *             type fixed-pmd;
 *         }
 *         leaf auto-pmd-negotiation-max {
 *             type auto-pmd-negotiation-max;
 *         }
 *         leaf auto-signal-ordering-is-on {
 *             type auto-signal-ordering-is-on;
 *         }
 *         leaf fixed-signal-ordering {
 *             type universal-id;
 *         }
 *         leaf short-reach-mode-is-on {
 *             type short-reach-mode-is-on;
 *         }
 *         leaf unidirectional-operation-is-on {
 *             type unidirectional-operation-is-on;
 *         }
 *         leaf-list wavelength-list {
 *             type wavelength-list;
 *         }
 *         leaf temperature-high-threshold {
 *             type temperature-high-threshold;
 *         }
 *         leaf temperature-low-threshold {
 *             type temperature-low-threshold;
 *         }
 *         leaf rxlevel-high-threshold {
 *             type rxlevel-high-threshold;
 *         }
 *         leaf rxlevel-low-threshold {
 *             type rxlevel-low-threshold;
 *         }
 *         leaf loop-back-kind-on {
 *             type string;
 *         }
 *         leaf isolation-is-on {
 *             type isolation-is-on;
 *         }
 *         leaf restart-pmd-negotiation-is-on {
 *             type restart-pmd-negotiation-is-on;
 *         }
 *         leaf reset-mau-is-on {
 *             type reset-mau-is-on;
 *         }
 *         leaf maintenance-timer {
 *             type maintenance-timer;
 *         }
 *         list problem-kind-severity-list {
 *             key "problem-kind-name";
 *             leaf problem-kind-name {
 *                 type string;
 *             }
 *             leaf problem-kind-severity {
 *                 type problem-kind-severity;
 *             }
 *             uses wire-interface-problem-severity-type-g;
 *         }
 *         uses wire-interface-configuration-g;
 *     }
 *     container wirebased-interface-status {
 *         leaf interface-is-up {
 *             type interface-is-up;
 *         }
 *         leaf-list receive-signal-is-detected {
 *             type boolean;
 *         }
 *         leaf pmd-is-up {
 *             type pmd-is-up;
 *         }
 *         leaf pmd-cur {
 *             type pmd-cur;
 *         }
 *         container signal-ordering-kind-cur {
 *             leaf signal-ordering-kind-name {
 *                 type string;
 *             }
 *             leaf-list signal-list {
 *                 type string;
 *             }
 *             uses signal-ordering-type-g;
 *         }
 *         leaf eee-is-up {
 *             type eee-is-up;
 *         }
 *         leaf link-is-up {
 *             type link-is-up;
 *         }
 *         leaf link-is-idle {
 *             type link-is-idle;
 *         }
 *         leaf tx-level-cur {
 *             type tx-level-cur;
 *         }
 *         leaf-list rx-level-cur {
 *             type rx-level-cur;
 *         }
 *         leaf temp-cur {
 *             type temp-cur;
 *         }
 *         leaf loop-back-kind-up {
 *             type loop-back-kind-up;
 *         }
 *         uses wire-interface-status-g;
 *     }
 *     container wirebased-interface-current-problems {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses wire-interface-current-problem-type-g;
 *         }
 *         uses wire-interface-current-problems-g;
 *     }
 *     container wirebased-interface-current-performance {
 *         list current-performance-data-list {
 *             key "scanner-id";
 *             container performance-data {
 *                 leaf es {
 *                     type es;
 *                 }
 *                 leaf ses {
 *                     type ses;
 *                 }
 *                 leaf symbol-error-during-carrier {
 *                     type symbol-error-during-carrier;
 *                 }
 *                 leaf low-power-idle-transmitter-ms {
 *                     type low-power-idle-transmitter-ms;
 *                 }
 *                 leaf low-power-idle-receiver-ms {
 *                     type low-power-idle-receiver-ms;
 *                 }
 *                 uses wire-interface-performance-type-g;
 *             }
 *             leaf timestamp {
 *                 type date-and-time;
 *             }
 *             leaf suspect-interval-flag {
 *                 type boolean;
 *             }
 *             leaf elapsed-time {
 *                 type int64;
 *             }
 *             leaf scanner-id {
 *                 type string;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf administrative-state {
 *                 type administrative-state;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses wire-interface-current-performance-type-g;
 *         }
 *         uses wire-interface-current-performance-g;
 *     }
 *     container wirebased-interface-historical-performances {
 *         list historical-performance-data-list {
 *             key "history-data-id";
 *             container performance-data {
 *                 leaf es {
 *                     type es;
 *                 }
 *                 leaf ses {
 *                     type ses;
 *                 }
 *                 leaf symbol-error-during-carrier {
 *                     type symbol-error-during-carrier;
 *                 }
 *                 leaf low-power-idle-transmitter-ms {
 *                     type low-power-idle-transmitter-ms;
 *                 }
 *                 leaf low-power-idle-receiver-ms {
 *                     type low-power-idle-receiver-ms;
 *                 }
 *                 uses wire-interface-performance-type-g;
 *             }
 *             leaf suspect-interval-flag {
 *                 type suspect-interval-flag;
 *             }
 *             leaf history-data-id {
 *                 type string;
 *             }
 *             leaf period-end-time {
 *                 type date-and-time;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses wire-interface-historical-performance-type-g;
 *         }
 *         uses wire-interface-historical-performances-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-pac</i>
 *
 * <p>To create instances of this class use {@link WireInterfacePacBuilder}.
 * @see WireInterfacePacBuilder
 * @see WireInterfacePacKey
 *
 */
public interface WireInterfacePac
    extends
    ChildOf<MicrowaveModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac>,
    Identifiable<WireInterfacePacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "wire-interface-pac").intern();

    /**
     * CoreModel-CoreNetworkModule-ObjectClasses:NetworkElement/_ltpRefList/_lpList/uuid
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>layerProtocol</code>, or <code>null</code> if not present
     */
    UniversalId getLayerProtocol();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability</code> <code>wirebasedInterfaceCapability</code>, or <code>null</code> if not present
     */
    WirebasedInterfaceCapability getWirebasedInterfaceCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration</code> <code>wirebasedInterfaceConfiguration</code>, or <code>null</code> if not present
     */
    WirebasedInterfaceConfiguration getWirebasedInterfaceConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceStatus</code> <code>wirebasedInterfaceStatus</code>, or <code>null</code> if not present
     */
    WirebasedInterfaceStatus getWirebasedInterfaceStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCurrentProblems</code> <code>wirebasedInterfaceCurrentProblems</code>, or <code>null</code> if not present
     */
    WirebasedInterfaceCurrentProblems getWirebasedInterfaceCurrentProblems();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCurrentPerformance</code> <code>wirebasedInterfaceCurrentPerformance</code>, or <code>null</code> if not present
     */
    WirebasedInterfaceCurrentPerformance getWirebasedInterfaceCurrentPerformance();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceHistoricalPerformances</code> <code>wirebasedInterfaceHistoricalPerformances</code>, or <code>null</code> if not present
     */
    WirebasedInterfaceHistoricalPerformances getWirebasedInterfaceHistoricalPerformances();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    WireInterfacePacKey getKey();

}

