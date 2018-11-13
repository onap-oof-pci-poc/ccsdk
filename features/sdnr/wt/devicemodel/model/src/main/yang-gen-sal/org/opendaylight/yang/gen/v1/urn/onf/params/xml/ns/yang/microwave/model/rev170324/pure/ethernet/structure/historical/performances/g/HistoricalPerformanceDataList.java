package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.historical.performances.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.StructureHistoricalPerformanceTypeG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.PureEthernetStructureHistoricalPerformancesG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list historical-performance-data-list {
 *     key "history-data-id";
 *     leaf performance-data {
 *         type structure-performance-type;
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
 *     uses structure-historical-performance-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/pure-ethernet-structure-historical-performances-g/historical-performance-data-list</i>
 *
 * <p>To create instances of this class use {@link HistoricalPerformanceDataListBuilder}.
 * @see HistoricalPerformanceDataListBuilder
 * @see HistoricalPerformanceDataListKey
 *
 */
public interface HistoricalPerformanceDataList
    extends
    ChildOf<PureEthernetStructureHistoricalPerformancesG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.historical.performances.g.HistoricalPerformanceDataList>,
    StructureHistoricalPerformanceTypeG,
    Identifiable<HistoricalPerformanceDataListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "historical-performance-data-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.historical.performances.g.HistoricalPerformanceDataListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    HistoricalPerformanceDataListKey getKey();

}

