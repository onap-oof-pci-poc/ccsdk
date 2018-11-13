package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.ethernet.container.current.performance.g.CurrentPerformanceDataList;

/**
 * Aggregated performance information of the Ethernet container at a particular 
 * moment.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping ethernet-container-current-performance-g {
 *     list current-performance-data-list {
 *         key "scanner-id";
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
 *         uses container-current-performance-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/ethernet-container-current-performance-g</i>
 *
 */
public interface EthernetContainerCurrentPerformanceG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "ethernet-container-current-performance-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>currentPerformanceDataList</code>, or <code>null</code> if not present
     */
    List<CurrentPerformanceDataList> getCurrentPerformanceDataList();

}

