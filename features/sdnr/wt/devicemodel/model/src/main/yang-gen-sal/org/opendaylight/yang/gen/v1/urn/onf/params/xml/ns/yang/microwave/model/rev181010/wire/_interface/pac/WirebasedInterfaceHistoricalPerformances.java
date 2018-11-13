package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfacePac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceHistoricalPerformancesG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container wirebased-interface-historical-performances {
 *     list historical-performance-data-list {
 *         key "history-data-id";
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
 *         leaf suspect-interval-flag {
 *             type suspect-interval-flag;
 *         }
 *         leaf history-data-id {
 *             type string;
 *         }
 *         leaf period-end-time {
 *             type date-and-time;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *         uses wire-interface-historical-performance-type-g;
 *     }
 *     uses wire-interface-historical-performances-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-pac/wirebased-interface-historical-performances</i>
 *
 * <p>To create instances of this class use {@link WirebasedInterfaceHistoricalPerformancesBuilder}.
 * @see WirebasedInterfaceHistoricalPerformancesBuilder
 *
 */
public interface WirebasedInterfaceHistoricalPerformances
    extends
    ChildOf<WireInterfacePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.pac.WirebasedInterfaceHistoricalPerformances>,
    WireInterfaceHistoricalPerformancesG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "wirebased-interface-historical-performances").intern();


}

