package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.tdm.container.historical.performances.g.HistoricalPerformanceDataList;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * Aggregated performance information of the TDM container for a pre-defined 
 * measurement interval.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping tdm-container-historical-performances-g {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/tdm-container-historical-performances-g</i>
 *
 */
public interface TdmContainerHistoricalPerformancesG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "tdm-container-historical-performances-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>historicalPerformanceDataList</code>, or <code>null</code> if not present
     */
    List<HistoricalPerformanceDataList> getHistoricalPerformanceDataList();

}

