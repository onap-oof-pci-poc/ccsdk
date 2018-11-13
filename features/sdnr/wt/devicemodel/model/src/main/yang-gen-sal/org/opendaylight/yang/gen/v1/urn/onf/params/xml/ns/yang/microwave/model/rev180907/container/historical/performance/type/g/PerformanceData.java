package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.container.historical.performance.type.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ContainerHistoricalPerformanceTypeG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ContainerPerformanceTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container performance-data {
 *     leaf tx-ethernet-bytes-max-s {
 *         type tx-ethernet-bytes-max-s;
 *     }
 *     leaf tx-ethernet-bytes-max-m {
 *         type tx-ethernet-bytes-max-m;
 *     }
 *     leaf tx-ethernet-bytes-sum {
 *         type tx-ethernet-bytes-sum;
 *     }
 *     leaf time-period {
 *         type time-period;
 *     }
 *     uses container-performance-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/container-historical-performance-type-g/performance-data</i>
 *
 * <p>To create instances of this class use {@link PerformanceDataBuilder}.
 * @see PerformanceDataBuilder
 *
 */
public interface PerformanceData
    extends
    ChildOf<ContainerHistoricalPerformanceTypeG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.container.historical.performance.type.g.PerformanceData>,
    ContainerPerformanceTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "performance-data").intern();


}

