package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ethernet.container.current.performance.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.EthernetContainerCurrentPerformanceG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ContainerCurrentPerformanceTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list current-performance-data-list {
 *     key "scanner-id";
 *     container performance-data {
 *         leaf tx-ethernet-bytes-max-s {
 *             type tx-ethernet-bytes-max-s;
 *         }
 *         leaf tx-ethernet-bytes-max-m {
 *             type tx-ethernet-bytes-max-m;
 *         }
 *         leaf tx-ethernet-bytes-sum {
 *             type tx-ethernet-bytes-sum;
 *         }
 *         leaf time-period {
 *             type time-period;
 *         }
 *         uses container-performance-type-g;
 *     }
 *     leaf timestamp {
 *         type date-and-time;
 *     }
 *     leaf suspect-interval-flag {
 *         type boolean;
 *     }
 *     leaf elapsed-time {
 *         type int64;
 *     }
 *     leaf scanner-id {
 *         type string;
 *     }
 *     leaf granularity-period {
 *         type granularity-period-type;
 *     }
 *     leaf administrative-state {
 *         type administrative-state;
 *     }
 *     leaf object-class {
 *         type object-identifier;
 *     }
 *     leaf name-binding {
 *         type object-identifier;
 *     }
 *     uses container-current-performance-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/ethernet-container-current-performance-g/current-performance-data-list</i>
 *
 * <p>To create instances of this class use {@link CurrentPerformanceDataListBuilder}.
 * @see CurrentPerformanceDataListBuilder
 * @see CurrentPerformanceDataListKey
 *
 */
public interface CurrentPerformanceDataList
    extends
    ChildOf<EthernetContainerCurrentPerformanceG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ethernet.container.current.performance.g.CurrentPerformanceDataList>,
    ContainerCurrentPerformanceTypeG,
    Identifiable<CurrentPerformanceDataListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "current-performance-data-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ethernet.container.current.performance.g.CurrentPerformanceDataListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    CurrentPerformanceDataListKey getKey();

}

