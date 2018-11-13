package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceCapabilityG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container wirebased-interface-capability {
 *     list available-mau-list {
 *         key "mau-id";
 *         leaf mau-id {
 *             type universal-id;
 *         }
 *         leaf mii-kind {
 *             type mii-kind;
 *         }
 *         leaf mdi-kind {
 *             type mdi-kind;
 *         }
 *         leaf required-medium-kind {
 *             type required-medium-kind;
 *         }
 *         leaf-list wavelength-min {
 *             type wavelength-min;
 *         }
 *         leaf-list wavelength-max {
 *             type wavelength-max;
 *         }
 *         leaf wavelength-grid-min {
 *             type wavelength-grid-min;
 *         }
 *         leaf link-length-max {
 *             type link-length-max;
 *         }
 *         leaf vendor-name {
 *             type vendor-name;
 *         }
 *         leaf vendor-oui {
 *             type vendor-oui;
 *         }
 *         leaf part-number {
 *             type part-number;
 *         }
 *         leaf revision-number {
 *             type revision-number;
 *         }
 *         leaf serial-number {
 *             type serial-number;
 *         }
 *         leaf date-code {
 *             type date-code;
 *         }
 *         leaf-list pmd-list {
 *             type pmd-name-type;
 *         }
 *         list signal-ordering-list {
 *             key "signal-ordering-kind-name";
 *             leaf signal-ordering-kind-name {
 *                 type string;
 *             }
 *             leaf-list signal-list {
 *                 type string;
 *             }
 *             uses signal-ordering-type-g;
 *         }
 *         leaf auto-signal-ordering-is-avail {
 *             type auto-signal-ordering-is-avail;
 *         }
 *         leaf short-reach-mode-is-avail {
 *             type short-reach-mode-is-avail;
 *         }
 *         leaf eee-is-avail {
 *             type eee-is-avail;
 *         }
 *         leaf unidirectional-operation-is-avail {
 *             type unidirectional-operation-is-avail;
 *         }
 *         leaf-list supported-alarms {
 *             type string;
 *         }
 *         uses mau-type-g;
 *     }
 *     leaf auto-pmd-negotiation-is-avail {
 *         type auto-pmd-negotiation-is-avail;
 *     }
 *     leaf auto-pmd-negotiation-max-is-avail {
 *         type auto-pmd-negotiation-max-is-avail;
 *     }
 *     leaf-list supported-loop-back-kind-list {
 *         type loop-back-type;
 *     }
 *     leaf maintenance-timer-range {
 *         type maintenance-timer-range;
 *     }
 *     leaf-list supported-alarm-list {
 *         type string;
 *     }
 *     uses wire-interface-capability-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-pac/wirebased-interface-capability</i>
 *
 * <p>To create instances of this class use {@link WirebasedInterfaceCapabilityBuilder}.
 * @see WirebasedInterfaceCapabilityBuilder
 *
 */
public interface WirebasedInterfaceCapability
    extends
    ChildOf<WireInterfacePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCapability>,
    WireInterfaceCapabilityG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "wirebased-interface-capability").intern();


}

