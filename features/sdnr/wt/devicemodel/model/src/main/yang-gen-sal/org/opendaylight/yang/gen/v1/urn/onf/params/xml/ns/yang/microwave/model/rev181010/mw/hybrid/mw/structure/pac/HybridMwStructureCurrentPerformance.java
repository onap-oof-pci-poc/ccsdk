package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.hybrid.mw.structure.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwHybridMwStructurePac;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.HybridMwStructureCurrentPerformanceG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container hybrid-mw-structure-current-performance {
 *     list current-performance-data-list {
 *         key "scanner-id";
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
 *         leaf timestamp {
 *             type date-and-time;
 *         }
 *         leaf suspect-interval-flag {
 *             type boolean;
 *         }
 *         leaf elapsed-time {
 *             type int64;
 *         }
 *         leaf scanner-id {
 *             type string;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf administrative-state {
 *             type administrative-state;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *         uses structure-current-performance-type-g;
 *     }
 *     uses hybrid-mw-structure-current-performance-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-hybrid-mw-structure-pac/hybrid-mw-structure-current-performance</i>
 *
 * <p>To create instances of this class use {@link HybridMwStructureCurrentPerformanceBuilder}.
 * @see HybridMwStructureCurrentPerformanceBuilder
 *
 */
public interface HybridMwStructureCurrentPerformance
    extends
    ChildOf<MwHybridMwStructurePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.hybrid.mw.structure.pac.HybridMwStructureCurrentPerformance>,
    HybridMwStructureCurrentPerformanceG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "hybrid-mw-structure-current-performance").intern();


}

