package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.hybrid.mw.structure.current.performance.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.StructureCurrentPerformanceTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.HybridMwStructureCurrentPerformanceG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
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
 *     leaf performance-data {
 *         type structure-performance-type;
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
 *     uses structure-current-performance-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/hybrid-mw-structure-current-performance-g/current-performance-data-list</i>
 *
 * <p>To create instances of this class use {@link CurrentPerformanceDataListBuilder}.
 * @see CurrentPerformanceDataListBuilder
 * @see CurrentPerformanceDataListKey
 *
 */
public interface CurrentPerformanceDataList
    extends
    ChildOf<HybridMwStructureCurrentPerformanceG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.hybrid.mw.structure.current.performance.g.CurrentPerformanceDataList>,
    StructureCurrentPerformanceTypeG,
    Identifiable<CurrentPerformanceDataListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "current-performance-data-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.hybrid.mw.structure.current.performance.g.CurrentPerformanceDataListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    CurrentPerformanceDataListKey getKey();

}

