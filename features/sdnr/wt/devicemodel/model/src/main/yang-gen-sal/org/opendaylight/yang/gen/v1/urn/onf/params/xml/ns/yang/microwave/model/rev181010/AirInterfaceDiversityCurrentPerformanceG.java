package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.current.performance.g.CurrentPerformanceDataList;

/**
 * Aggregated performance information of the air interface diversity configuration 
 * at a particular moment.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-diversity-current-performance-g {
 *     list current-performance-data-list {
 *         key "scanner-id";
 *         container performance-data {
 *             leaf snir-min {
 *                 type snir-min;
 *             }
 *             leaf snir-max {
 *                 type snir-max;
 *             }
 *             leaf snir-avg {
 *                 type snir-avg;
 *             }
 *             uses air-interface-diversity-performance-type-g;
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
 *         uses air-interface-diversity-current-performance-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-diversity-current-performance-g</i>
 *
 */
public interface AirInterfaceDiversityCurrentPerformanceG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "air-interface-diversity-current-performance-g").intern();

    /**
     * At least values of the counters, which are reset every 15 minutes, are to be 
     * provided. If available, the current values of the counters, which are reset 
     * every 24 hour, can be provided, too.
     *
     *
     *
     * @return <code>java.util.List</code> <code>currentPerformanceDataList</code>, or <code>null</code> if not present
     */
    List<CurrentPerformanceDataList> getCurrentPerformanceDataList();

}

