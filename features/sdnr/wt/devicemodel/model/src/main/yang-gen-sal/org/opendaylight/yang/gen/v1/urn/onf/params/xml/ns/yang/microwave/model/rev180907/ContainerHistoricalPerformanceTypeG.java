package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.OtnHistoryDataG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.container.historical.performance.type.g.PerformanceData;

/**
 * Turns performance information into historical performance information by 
 * inheriting from OTN_HistoryData.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping container-historical-performance-type-g {
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
 *     leaf suspect-interval-flag {
 *         type suspect-interval-flag;
 *     }
 *     leaf history-data-id {
 *         type string;
 *     }
 *     leaf period-end-time {
 *         type date-and-time;
 *     }
 *     leaf granularity-period {
 *         type granularity-period-type;
 *     }
 *     leaf object-class {
 *         type object-identifier;
 *     }
 *     leaf name-binding {
 *         type object-identifier;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/container-historical-performance-type-g</i>
 *
 */
public interface ContainerHistoricalPerformanceTypeG
    extends
    DataObject,
    OtnHistoryDataG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "container-historical-performance-type-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.container.historical.performance.type.g.PerformanceData</code> <code>performanceData</code>, or <code>null</code> if not present
     */
    PerformanceData getPerformanceData();

}

