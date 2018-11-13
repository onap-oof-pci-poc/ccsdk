package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.current.performance.g.CurrentPerformanceDataList;

/**
 * Aggregated performance information of the air interface at a particular moment.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping wire-interface-current-performance-g {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-current-performance-g</i>
 *
 */
public interface WireInterfaceCurrentPerformanceG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "wire-interface-current-performance-g").intern();

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

