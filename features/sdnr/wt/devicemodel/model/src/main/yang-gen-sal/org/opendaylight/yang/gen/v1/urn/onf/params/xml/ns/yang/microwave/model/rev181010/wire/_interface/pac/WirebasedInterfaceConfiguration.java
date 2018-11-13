package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceConfigurationG;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container wirebased-interface-configuration {
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
 *     uses wire-interface-configuration-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-pac/wirebased-interface-configuration</i>
 *
 * <p>To create instances of this class use {@link WirebasedInterfaceConfigurationBuilder}.
 * @see WirebasedInterfaceConfigurationBuilder
 *
 */
public interface WirebasedInterfaceConfiguration
    extends
    ChildOf<WireInterfacePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceConfiguration>,
    WireInterfaceConfigurationG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "wirebased-interface-configuration").intern();


}

