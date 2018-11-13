package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * grouping connector-status-g {
 *     leaf local-end-point {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/connector-status-g</i>
 *
 */
public interface ConnectorStatusG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "connector-status-g").intern();

    /**
     * A network wide global identifier of the this connector, which can be used to 
     * discover the physical connectivitiy.The value should contain the network element
     * name, because the network element software can assume that the network element 
     * name is unique in the network.The value should be 
     * formated:&amp;lt;connector:uuid&amp;gt;@&amp;lt;network-element-name&amp;gt;Please
     * see also ConnectorConfiguration::remoteEndPoint
     *
     *
     *
     * @return <code>java.lang.String</code> <code>localEndPoint</code>, or <code>null</code> if not present
     */
    java.lang.String getLocalEndPoint();

}

