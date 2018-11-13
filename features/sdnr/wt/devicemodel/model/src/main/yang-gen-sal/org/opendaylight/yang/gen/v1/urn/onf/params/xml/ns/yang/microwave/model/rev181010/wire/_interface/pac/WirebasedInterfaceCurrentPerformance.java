package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceCurrentPerformanceG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container wirebased-interface-current-performance {
 *     list current-performance-data-list {
 *         key "scanner-id";
 *         container performance-data {
 *             leaf es {
 *                 type es;
 *             }
 *             leaf ses {
 *                 type ses;
 *             }
 *             leaf symbol-error-during-carrier {
 *                 type symbol-error-during-carrier;
 *             }
 *             leaf low-power-idle-transmitter-ms {
 *                 type low-power-idle-transmitter-ms;
 *             }
 *             leaf low-power-idle-receiver-ms {
 *                 type low-power-idle-receiver-ms;
 *             }
 *             uses wire-interface-performance-type-g;
 *         }
 *         leaf timestamp {
 *             type date-and-time;
 *         }
 *         leaf suspect-interval-flag {
 *             type boolean;
 *         }
 *         leaf elapsed-time {
 *             type int64;
 *         }
 *         leaf scanner-id {
 *             type string;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf administrative-state {
 *             type administrative-state;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *         uses wire-interface-current-performance-type-g;
 *     }
 *     uses wire-interface-current-performance-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-pac/wirebased-interface-current-performance</i>
 *
 * <p>To create instances of this class use {@link WirebasedInterfaceCurrentPerformanceBuilder}.
 * @see WirebasedInterfaceCurrentPerformanceBuilder
 *
 */
public interface WirebasedInterfaceCurrentPerformance
    extends
    ChildOf<WireInterfacePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceCurrentPerformance>,
    WireInterfaceCurrentPerformanceG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "wirebased-interface-current-performance").intern();


}

