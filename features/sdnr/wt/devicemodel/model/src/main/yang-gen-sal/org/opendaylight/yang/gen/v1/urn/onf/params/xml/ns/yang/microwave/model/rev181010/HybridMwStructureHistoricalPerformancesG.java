package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.hybrid.mw.structure.historical.performances.g.HistoricalPerformanceDataList;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * Aggregated performance information of the structure of a hybrid microwave for a 
 * pre-defined measurement interval.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping hybrid-mw-structure-historical-performances-g {
 *     list historical-performance-data-list {
 *         key "history-data-id";
 *         container performance-data {
 *             leaf time-period {
 *                 type time-period;
 *             }
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
 *             leaf rx-level-min {
 *                 type rx-level-min;
 *             }
 *             leaf rx-level-max {
 *                 type rx-level-max;
 *             }
 *             leaf rx-level-avg {
 *                 type rx-level-avg;
 *             }
 *             uses structure-performance-type-g;
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
 *         uses structure-historical-performance-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/hybrid-mw-structure-historical-performances-g</i>
 *
 */
public interface HybridMwStructureHistoricalPerformancesG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "hybrid-mw-structure-historical-performances-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>historicalPerformanceDataList</code>, or <code>null</code> if not present
     */
    List<HistoricalPerformanceDataList> getHistoricalPerformanceDataList();

}

