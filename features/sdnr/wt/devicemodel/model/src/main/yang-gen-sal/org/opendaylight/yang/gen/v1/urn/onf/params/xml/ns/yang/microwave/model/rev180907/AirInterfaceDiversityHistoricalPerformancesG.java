package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performances.g.HistoricalPerformanceDataList;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * Aggregated performance information of the air interface diversity configuration 
 * for a pre-defined measurement interval.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-diversity-historical-performances-g {
 *     list historical-performance-data-list {
 *         key "history-data-id";
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
 *         uses air-interface-diversity-historical-performance-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-diversity-historical-performances-g</i>
 *
 */
public interface AirInterfaceDiversityHistoricalPerformancesG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "air-interface-diversity-historical-performances-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>historicalPerformanceDataList</code>, or <code>null</code> if not present
     */
    List<HistoricalPerformanceDataList> getHistoricalPerformanceDataList();

}

