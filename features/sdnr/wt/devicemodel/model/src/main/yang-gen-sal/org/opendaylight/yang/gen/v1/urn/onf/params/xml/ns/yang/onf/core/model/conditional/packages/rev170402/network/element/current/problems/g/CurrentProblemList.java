package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.current.problems.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementCurrentProblemTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementCurrentProblemsG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * list current-problem-list {
 *     key "sequence-number";
 *     leaf problem-name {
 *         type problem-name;
 *     }
 *     leaf object-reference {
 *         type string;
 *     }
 *     leaf sequence-number {
 *         type int32;
 *     }
 *     leaf time-stamp {
 *         type time-stamp;
 *     }
 *     leaf problem-severity {
 *         type problem-severity;
 *     }
 *     uses network-element-current-problem-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/network-element-current-problems-g/current-problem-list</i>
 *
 * <p>To create instances of this class use {@link CurrentProblemListBuilder}.
 * @see CurrentProblemListBuilder
 * @see CurrentProblemListKey
 *
 */
public interface CurrentProblemList
    extends
    ChildOf<NetworkElementCurrentProblemsG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.current.problems.g.CurrentProblemList>,
    NetworkElementCurrentProblemTypeG,
    Identifiable<CurrentProblemListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "current-problem-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.current.problems.g.CurrentProblemListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    CurrentProblemListKey getKey();

}

