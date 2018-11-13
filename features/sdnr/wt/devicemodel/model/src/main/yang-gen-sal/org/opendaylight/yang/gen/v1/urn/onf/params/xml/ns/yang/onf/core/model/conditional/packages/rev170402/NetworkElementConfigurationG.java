package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.configuration.g.ProblemTypeSeverityList;
import java.util.List;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * grouping network-element-configuration-g {
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
 *     leaf trigger-refresh {
 *         type boolean;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/network-element-configuration-g</i>
 *
 */
public interface NetworkElementConfigurationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "network-element-configuration-g").intern();

    /**
     * Severity of the problem to be configured.
     *
     *
     *
     * @return <code>java.util.List</code> <code>problemTypeSeverityList</code>, or <code>null</code> if not present
     */
    List<ProblemTypeSeverityList> getProblemTypeSeverityList();
    
    /**
     * A trigger to instruct the netconf server to refresh its internal 
     * database/cache.It is primary used for alarms status, but could be used for 
     * anything else too.It is assumed that the refresh mechanism takes some time.In 
     * order to indicate the process to the controller a refreshStatus attribute is 
     * used.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>triggerRefresh</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isTriggerRefresh();

}

