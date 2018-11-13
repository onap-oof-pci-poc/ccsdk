package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.holder.configuration.g.ProblemTypeSeverityList;
import java.util.List;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * grouping holder-configuration-g {
 *     list problem-type-severity-list {
 *         key "problem-type-name";
 *         leaf problem-type-name {
 *             type string;
 *         }
 *         leaf problem-type-severity {
 *             type severity-type;
 *         }
 *         uses problem-severity-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/holder-configuration-g</i>
 *
 */
public interface HolderConfigurationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "holder-configuration-g").intern();

    /**
     * Severity of the problem to be configured.
     *
     *
     *
     * @return <code>java.util.List</code> <code>problemTypeSeverityList</code>, or <code>null</code> if not present
     */
    List<ProblemTypeSeverityList> getProblemTypeSeverityList();

}

