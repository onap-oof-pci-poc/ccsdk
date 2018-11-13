package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorPac;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.ConnectorCapabilityG;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * container connector-capability {
 *     leaf-list supported-alarms {
 *         type string;
 *     }
 *     uses connector-capability-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/connector-pac/connector-capability</i>
 *
 * <p>To create instances of this class use {@link ConnectorCapabilityBuilder}.
 * @see ConnectorCapabilityBuilder
 *
 */
public interface ConnectorCapability
    extends
    ChildOf<ConnectorPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402.connector.pac.ConnectorCapability>,
    ConnectorCapabilityG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "connector-capability").intern();


}

