package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ProblemSeverityTypeG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.HolderConfigurationG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Severity of the problem to be configured.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * list problem-type-severity-list {
 *     key "problem-type-name";
 *     leaf problem-type-name {
 *         type string;
 *     }
 *     leaf problem-type-severity {
 *         type severity-type;
 *     }
 *     uses problem-severity-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/holder-configuration-g/problem-type-severity-list</i>
 *
 * <p>To create instances of this class use {@link ProblemTypeSeverityListBuilder}.
 * @see ProblemTypeSeverityListBuilder
 * @see ProblemTypeSeverityListKey
 *
 */
public interface ProblemTypeSeverityList
    extends
    ChildOf<HolderConfigurationG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList>,
    ProblemSeverityTypeG,
    Identifiable<ProblemTypeSeverityListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "problem-type-severity-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ProblemTypeSeverityListKey getKey();

}

