package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.TdmContainerConfigurationG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.ContainerProblemSeverityTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Severity of the problem to be configured.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list problem-kind-severity-list {
 *     key "problem-kind-name";
 *     leaf problem-kind-name {
 *         type string;
 *     }
 *     leaf problem-kind-severity {
 *         type problem-kind-severity;
 *     }
 *     uses container-problem-severity-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/tdm-container-configuration-g/problem-kind-severity-list</i>
 *
 * <p>To create instances of this class use {@link ProblemKindSeverityListBuilder}.
 * @see ProblemKindSeverityListBuilder
 * @see ProblemKindSeverityListKey
 *
 */
public interface ProblemKindSeverityList
    extends
    ChildOf<TdmContainerConfigurationG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ProblemKindSeverityList>,
    ContainerProblemSeverityTypeG,
    Identifiable<ProblemKindSeverityListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "problem-kind-severity-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.tdm.container.configuration.g.ProblemKindSeverityListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ProblemKindSeverityListKey getKey();

}

