package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.show.required.network.element.output;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.ShowRequiredNetworkElementOutput;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>devicemanager-api</b>
 * <pre>
 * container required-network-element {
 *     leaf mountpoint-name {
 *         type string;
 *     }
 *     leaf status {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>devicemanager-api/show-required-network-element/output/required-network-element</i>
 *
 * <p>To create instances of this class use {@link RequiredNetworkElementBuilder}.
 * @see RequiredNetworkElementBuilder
 *
 */
public interface RequiredNetworkElement
    extends
    ChildOf<ShowRequiredNetworkElementOutput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.show.required.network.element.output.RequiredNetworkElement>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:devicemanager:api",
        "2017-03-17", "required-network-element").intern();

    /**
     * The name of the mountpoint
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mountpointName</code>, or <code>null</code> if not present
     */
    java.lang.String getMountpointName();
    
    /**
     * Status: pre-provisoning, installed, end-of-life (Later enum)
     *
     *
     *
     * @return <code>java.lang.String</code> <code>status</code>, or <code>null</code> if not present
     */
    java.lang.String getStatus();
    
    /**
     * Device description
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();

}

