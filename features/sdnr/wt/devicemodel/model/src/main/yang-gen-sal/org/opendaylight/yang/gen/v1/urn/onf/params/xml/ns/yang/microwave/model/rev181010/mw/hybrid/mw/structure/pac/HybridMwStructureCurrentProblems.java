package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.hybrid.mw.structure.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwHybridMwStructurePac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.HybridMwStructureCurrentProblemsG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container hybrid-mw-structure-current-problems {
 *     list current-problem-list {
 *         key "sequence-number";
 *         leaf problem-name {
 *             type problem-name;
 *         }
 *         leaf sequence-number {
 *             type int32;
 *         }
 *         leaf time-stamp {
 *             type time-stamp;
 *         }
 *         leaf problem-severity {
 *             type problem-severity;
 *         }
 *         uses structure-current-problem-type-g;
 *     }
 *     uses hybrid-mw-structure-current-problems-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-hybrid-mw-structure-pac/hybrid-mw-structure-current-problems</i>
 *
 * <p>To create instances of this class use {@link HybridMwStructureCurrentProblemsBuilder}.
 * @see HybridMwStructureCurrentProblemsBuilder
 *
 */
public interface HybridMwStructureCurrentProblems
    extends
    ChildOf<MwHybridMwStructurePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.hybrid.mw.structure.pac.HybridMwStructureCurrentProblems>,
    HybridMwStructureCurrentProblemsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "hybrid-mw-structure-current-problems").intern();


}

