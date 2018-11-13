package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.current.performance.g.CurrentPerformanceDataList;

/**
 * Aggregated performance information of the air interface at a particular moment.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-current-performance-g {
 *     list current-performance-data-list {
 *         key "scanner-id";
 *         container performance-data {
 *             leaf es {
 *                 type es;
 *             }
 *             leaf ses {
 *                 type ses;
 *             }
 *             leaf cses {
 *                 type cses;
 *             }
 *             leaf unavailability {
 *                 type unavailability;
 *             }
 *             leaf tx-level-min {
 *                 type tx-level-min;
 *             }
 *             leaf tx-level-max {
 *                 type tx-level-max;
 *             }
 *             leaf tx-level-avg {
 *                 type tx-level-avg;
 *             }
 *             leaf rx-level-min {
 *                 type rx-level-min;
 *             }
 *             leaf rx-level-max {
 *                 type rx-level-max;
 *             }
 *             leaf rx-level-avg {
 *                 type rx-level-avg;
 *             }
 *             leaf time2-states {
 *                 type time2-states;
 *             }
 *             leaf time4-states-s {
 *                 type time4-states-s;
 *             }
 *             leaf time4-states {
 *                 type time4-states;
 *             }
 *             leaf time8-states {
 *                 type time8-states;
 *             }
 *             leaf time16-states-s {
 *                 type time16-states-s;
 *             }
 *             leaf time16-states {
 *                 type time16-states;
 *             }
 *             leaf time32-states {
 *                 type time32-states;
 *             }
 *             leaf time64-states {
 *                 type time64-states;
 *             }
 *             leaf time128-states {
 *                 type time128-states;
 *             }
 *             leaf time256-states {
 *                 type time256-states;
 *             }
 *             leaf time512-states {
 *                 type time512-states;
 *             }
 *             leaf time512-states-l {
 *                 type time512-states-l;
 *             }
 *             leaf time1024-states {
 *                 type time1024-states;
 *             }
 *             leaf time1024-states-l {
 *                 type time1024-states-l;
 *             }
 *             leaf time2048-states {
 *                 type time2048-states;
 *             }
 *             leaf time2048-states-l {
 *                 type time2048-states-l;
 *             }
 *             leaf time4096-states {
 *                 type time4096-states;
 *             }
 *             leaf time4096-states-l {
 *                 type time4096-states-l;
 *             }
 *             leaf time8192-states {
 *                 type time8192-states;
 *             }
 *             leaf time8192-states-l {
 *                 type time8192-states-l;
 *             }
 *             leaf snir-min {
 *                 type snir-min;
 *             }
 *             leaf snir-max {
 *                 type snir-max;
 *             }
 *             leaf snir-avg {
 *                 type snir-avg;
 *             }
 *             leaf xpd-min {
 *                 type xpd-min;
 *             }
 *             leaf xpd-max {
 *                 type xpd-max;
 *             }
 *             leaf xpd-avg {
 *                 type xpd-avg;
 *             }
 *             leaf rf-temp-min {
 *                 type rf-temp-min;
 *             }
 *             leaf rf-temp-max {
 *                 type rf-temp-max;
 *             }
 *             leaf rf-temp-avg {
 *                 type rf-temp-avg;
 *             }
 *             leaf defect-blocks-sum {
 *                 type defect-blocks-sum;
 *             }
 *             leaf time-period {
 *                 type time-period;
 *             }
 *             uses air-interface-performance-type-g;
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
 *         uses air-interface-current-performance-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-current-performance-g</i>
 *
 */
public interface AirInterfaceCurrentPerformanceG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "air-interface-current-performance-g").intern();

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

