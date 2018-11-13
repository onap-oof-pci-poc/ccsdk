package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.current.performance.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceDiversityCurrentPerformanceG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceDiversityCurrentPerformanceTypeG;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * At least values of the counters, which are reset every 15 minutes, are to be 
 * provided. If available, the current values of the counters, which are reset 
 * every 24 hour, can be provided, too.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list current-performance-data-list {
 *     key "scanner-id";
 *     container performance-data {
 *         leaf snir-min {
 *             type snir-min;
 *         }
 *         leaf snir-max {
 *             type snir-max;
 *         }
 *         leaf snir-avg {
 *             type snir-avg;
 *         }
 *         uses air-interface-diversity-performance-type-g;
 *     }
 *     leaf timestamp {
 *         type date-and-time;
 *     }
 *     leaf suspect-interval-flag {
 *         type boolean;
 *     }
 *     leaf elapsed-time {
 *         type int64;
 *     }
 *     leaf scanner-id {
 *         type string;
 *     }
 *     leaf granularity-period {
 *         type granularity-period-type;
 *     }
 *     leaf administrative-state {
 *         type administrative-state;
 *     }
 *     leaf object-class {
 *         type object-identifier;
 *     }
 *     leaf name-binding {
 *         type object-identifier;
 *     }
 *     uses air-interface-diversity-current-performance-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-diversity-current-performance-g/current-performance-data-list</i>
 *
 * <p>To create instances of this class use {@link CurrentPerformanceDataListBuilder}.
 * @see CurrentPerformanceDataListBuilder
 * @see CurrentPerformanceDataListKey
 *
 */
public interface CurrentPerformanceDataList
    extends
    ChildOf<AirInterfaceDiversityCurrentPerformanceG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.current.performance.g.CurrentPerformanceDataList>,
    AirInterfaceDiversityCurrentPerformanceTypeG,
    Identifiable<CurrentPerformanceDataListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "current-performance-data-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.current.performance.g.CurrentPerformanceDataListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    CurrentPerformanceDataListKey getKey();

}

