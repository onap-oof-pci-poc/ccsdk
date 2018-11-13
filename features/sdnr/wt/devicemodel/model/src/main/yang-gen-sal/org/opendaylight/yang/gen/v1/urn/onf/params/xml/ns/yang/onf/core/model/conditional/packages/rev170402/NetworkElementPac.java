package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementConfiguration;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCapability;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * container network-element-pac {
 *     leaf network-element {
 *         type leafref;
 *     }
 *     container network-element-capability {
 *         leaf-list supported-alarms {
 *             type string;
 *         }
 *         uses network-element-capability-g;
 *     }
 *     container network-element-configuration {
 *         list problem-type-severity-list {
 *             key "problem-type-name";
 *             leaf problem-type-name {
 *                 type string;
 *             }
 *             leaf problem-type-severity {
 *                 type severity-type;
 *             }
 *             uses problem-severity-type-g;
 *         }
 *         leaf trigger-refresh {
 *             type boolean;
 *         }
 *         uses network-element-configuration-g;
 *     }
 *     container network-element-status {
 *         leaf refresh-status {
 *             type processing-type;
 *         }
 *         uses network-element-status-g;
 *     }
 *     container network-element-current-problems {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf object-reference {
 *                 type string;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses network-element-current-problem-type-g;
 *         }
 *         uses network-element-current-problems-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/network-element-pac</i>
 *
 * <p>To create instances of this class use {@link NetworkElementPacBuilder}.
 * @see NetworkElementPacBuilder
 *
 */
public interface NetworkElementPac
    extends
    ChildOf<OnfCoreModelConditionalPackagesData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.NetworkElementPac>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "network-element-pac").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>networkElement</code>, or <code>null</code> if not present
     */
    UniversalId getNetworkElement();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCapability</code> <code>networkElementCapability</code>, or <code>null</code> if not present
     */
    NetworkElementCapability getNetworkElementCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementConfiguration</code> <code>networkElementConfiguration</code>, or <code>null</code> if not present
     */
    NetworkElementConfiguration getNetworkElementConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementStatus</code> <code>networkElementStatus</code>, or <code>null</code> if not present
     */
    NetworkElementStatus getNetworkElementStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.network.element.pac.NetworkElementCurrentProblems</code> <code>networkElementCurrentProblems</code>, or <code>null</code> if not present
     */
    NetworkElementCurrentProblems getNetworkElementCurrentProblems();

}

