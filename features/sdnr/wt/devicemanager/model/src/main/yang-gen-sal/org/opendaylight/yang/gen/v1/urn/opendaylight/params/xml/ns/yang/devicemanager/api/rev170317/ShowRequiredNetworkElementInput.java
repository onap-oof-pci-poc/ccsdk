package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>devicemanager-api</b>
 * <pre>
 * container input {
 *     leaf mountpoint-name {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>devicemanager-api/show-required-network-element/input</i>
 *
 * <p>To create instances of this class use {@link ShowRequiredNetworkElementInputBuilder}.
 * @see ShowRequiredNetworkElementInputBuilder
 *
 */
public interface ShowRequiredNetworkElementInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.ShowRequiredNetworkElementInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:devicemanager:api",
        "2017-03-17", "input").intern();

    /**
     * Mountpoint-name as key of the node to be displayed.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mountpointName</code>, or <code>null</code> if not present
     */
    java.lang.String getMountpointName();

}

