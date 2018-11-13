package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.EthernetContainerHistoricalPerformancesG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwEthernetContainerPac;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container ethernet-container-historical-performances {
 *     list historical-performance-data-list {
 *         key "history-data-id";
 *         container performance-data {
 *             leaf tx-ethernet-bytes-max-s {
 *                 type tx-ethernet-bytes-max-s;
 *             }
 *             leaf tx-ethernet-bytes-max-m {
 *                 type tx-ethernet-bytes-max-m;
 *             }
 *             leaf tx-ethernet-bytes-sum {
 *                 type tx-ethernet-bytes-sum;
 *             }
 *             leaf time-period {
 *                 type time-period;
 *             }
 *             uses container-performance-type-g;
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
 *         uses container-historical-performance-type-g;
 *     }
 *     uses ethernet-container-historical-performances-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-ethernet-container-pac/ethernet-container-historical-performances</i>
 *
 * <p>To create instances of this class use {@link EthernetContainerHistoricalPerformancesBuilder}.
 * @see EthernetContainerHistoricalPerformancesBuilder
 *
 */
public interface EthernetContainerHistoricalPerformances
    extends
    ChildOf<MwEthernetContainerPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.ethernet.container.pac.EthernetContainerHistoricalPerformances>,
    EthernetContainerHistoricalPerformancesG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "ethernet-container-historical-performances").intern();


}

