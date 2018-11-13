package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.current.problems.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerCurrentProblemsG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ContainerCurrentProblemTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list current-problem-list {
 *     key "sequence-number";
 *     leaf problem-name {
 *         type problem-name;
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
 *     uses container-current-problem-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/tdm-container-current-problems-g/current-problem-list</i>
 *
 * <p>To create instances of this class use {@link CurrentProblemListBuilder}.
 * @see CurrentProblemListBuilder
 * @see CurrentProblemListKey
 *
 */
public interface CurrentProblemList
    extends
    ChildOf<TdmContainerCurrentProblemsG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.current.problems.g.CurrentProblemList>,
    ContainerCurrentProblemTypeG,
    Identifiable<CurrentProblemListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "current-problem-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.current.problems.g.CurrentProblemListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    CurrentProblemListKey getKey();

}

