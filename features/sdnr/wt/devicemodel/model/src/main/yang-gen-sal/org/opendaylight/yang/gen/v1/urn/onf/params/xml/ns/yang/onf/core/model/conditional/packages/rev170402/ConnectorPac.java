package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorCapability;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorCurrentProblems;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * list connector-pac {
 *     key "connector";
 *     leaf connector {
 *         type leafref;
 *     }
 *     container connector-capability {
 *         leaf-list supported-alarms {
 *             type string;
 *         }
 *         uses connector-capability-g;
 *     }
 *     container connector-configuration {
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
 *         leaf remote-end-point {
 *             type string;
 *         }
 *         uses connector-configuration-g;
 *     }
 *     container connector-status {
 *         leaf local-end-point {
 *             type string;
 *         }
 *         uses connector-status-g;
 *     }
 *     container connector-current-problems {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
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
 *             uses current-problem-type-g;
 *         }
 *         uses connector-current-problems-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/connector-pac</i>
 *
 * <p>To create instances of this class use {@link ConnectorPacBuilder}.
 * @see ConnectorPacBuilder
 * @see ConnectorPacKey
 *
 */
public interface ConnectorPac
    extends
    ChildOf<OnfCoreModelConditionalPackagesData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac>,
    Identifiable<ConnectorPacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "connector-pac").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>connector</code>, or <code>null</code> if not present
     */
    UniversalId getConnector();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorCapability</code> <code>connectorCapability</code>, or <code>null</code> if not present
     */
    ConnectorCapability getConnectorCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorConfiguration</code> <code>connectorConfiguration</code>, or <code>null</code> if not present
     */
    ConnectorConfiguration getConnectorConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorStatus</code> <code>connectorStatus</code>, or <code>null</code> if not present
     */
    ConnectorStatus getConnectorStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorCurrentProblems</code> <code>connectorCurrentProblems</code>, or <code>null</code> if not present
     */
    ConnectorCurrentProblems getConnectorCurrentProblems();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ConnectorPacKey getKey();

}

