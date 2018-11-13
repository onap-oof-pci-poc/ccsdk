package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.current.performance.type.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructureCurrentPerformanceTypeG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.StructurePerformanceTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container performance-data {
 *     leaf time-period {
 *         type time-period;
 *     }
 *     leaf es {
 *         type es;
 *     }
 *     leaf ses {
 *         type ses;
 *     }
 *     leaf cses {
 *         type cses;
 *     }
 *     leaf unavailability {
 *         type unavailability;
 *     }
 *     leaf rx-level-min {
 *         type rx-level-min;
 *     }
 *     leaf rx-level-max {
 *         type rx-level-max;
 *     }
 *     leaf rx-level-avg {
 *         type rx-level-avg;
 *     }
 *     uses structure-performance-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/structure-current-performance-type-g/performance-data</i>
 *
 * <p>To create instances of this class use {@link PerformanceDataBuilder}.
 * @see PerformanceDataBuilder
 *
 */
public interface PerformanceData
    extends
    ChildOf<StructureCurrentPerformanceTypeG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.structure.current.performance.type.g.PerformanceData>,
    StructurePerformanceTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "performance-data").intern();


}

