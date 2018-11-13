package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performance.type.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityPerformanceTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceDiversityHistoricalPerformanceTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container performance-data {
 *     leaf snir-min {
 *         type snir-min;
 *     }
 *     leaf snir-max {
 *         type snir-max;
 *     }
 *     leaf snir-avg {
 *         type snir-avg;
 *     }
 *     uses air-interface-diversity-performance-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-diversity-historical-performance-type-g/performance-data</i>
 *
 * <p>To create instances of this class use {@link PerformanceDataBuilder}.
 * @see PerformanceDataBuilder
 *
 */
public interface PerformanceData
    extends
    ChildOf<AirInterfaceDiversityHistoricalPerformanceTypeG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.diversity.historical.performance.type.g.PerformanceData>,
    AirInterfaceDiversityPerformanceTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "performance-data").intern();


}

