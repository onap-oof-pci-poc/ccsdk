package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.show.required.network.element.output.RequiredNetworkElement;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>devicemanager-api</b>
 * <pre>
 * container output {
 *     container required-network-element {
 *         leaf mountpoint-name {
 *             type string;
 *         }
 *         leaf status {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>devicemanager-api/show-required-network-element/output</i>
 *
 * <p>To create instances of this class use {@link ShowRequiredNetworkElementOutputBuilder}.
 * @see ShowRequiredNetworkElementOutputBuilder
 *
 */
public interface ShowRequiredNetworkElementOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.ShowRequiredNetworkElementOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:devicemanager:api",
        "2017-03-17", "output").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.show.required.network.element.output.RequiredNetworkElement</code> <code>requiredNetworkElement</code>, or <code>null</code> if not present
     */
    RequiredNetworkElement getRequiredNetworkElement();

}

