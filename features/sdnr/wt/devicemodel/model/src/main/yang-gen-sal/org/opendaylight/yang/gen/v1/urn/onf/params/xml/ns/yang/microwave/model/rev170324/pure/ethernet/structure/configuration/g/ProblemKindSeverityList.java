package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.configuration.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.StructureProblemSeverityTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.PureEthernetStructureConfigurationG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Severity of the type of problem to be configured.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list problem-kind-severity-list {
 *     key "problem-kind-name";
 *     leaf problem-kind-name {
 *         type problem-kind-name;
 *     }
 *     leaf problem-kind-severity {
 *         type problem-kind-severity;
 *     }
 *     uses structure-problem-severity-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/pure-ethernet-structure-configuration-g/problem-kind-severity-list</i>
 *
 * <p>To create instances of this class use {@link ProblemKindSeverityListBuilder}.
 * @see ProblemKindSeverityListBuilder
 * @see ProblemKindSeverityListKey
 *
 */
public interface ProblemKindSeverityList
    extends
    ChildOf<PureEthernetStructureConfigurationG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.configuration.g.ProblemKindSeverityList>,
    StructureProblemSeverityTypeG,
    Identifiable<ProblemKindSeverityListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "problem-kind-severity-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.pure.ethernet.structure.configuration.g.ProblemKindSeverityListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ProblemKindSeverityListKey getKey();

}

