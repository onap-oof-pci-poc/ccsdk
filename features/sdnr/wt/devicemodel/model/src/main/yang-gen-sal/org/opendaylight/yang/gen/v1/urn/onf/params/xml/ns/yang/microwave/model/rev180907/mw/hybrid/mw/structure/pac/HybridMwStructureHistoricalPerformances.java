package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwHybridMwStructurePac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.HybridMwStructureHistoricalPerformancesG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container hybrid-mw-structure-historical-performances {
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
 *     uses hybrid-mw-structure-historical-performances-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-hybrid-mw-structure-pac/hybrid-mw-structure-historical-performances</i>
 *
 * <p>To create instances of this class use {@link HybridMwStructureHistoricalPerformancesBuilder}.
 * @see HybridMwStructureHistoricalPerformancesBuilder
 *
 */
public interface HybridMwStructureHistoricalPerformances
    extends
    ChildOf<MwHybridMwStructurePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances>,
    HybridMwStructureHistoricalPerformancesG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "hybrid-mw-structure-historical-performances").intern();


}

