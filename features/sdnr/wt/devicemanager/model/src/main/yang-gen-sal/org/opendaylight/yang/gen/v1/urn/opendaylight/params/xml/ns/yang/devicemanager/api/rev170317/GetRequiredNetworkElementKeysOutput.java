package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>devicemanager-api</b>
 * <pre>
 * container output {
 *     leaf-list mountpoint-names {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>devicemanager-api/get-required-network-element-keys/output</i>
 *
 * <p>To create instances of this class use {@link GetRequiredNetworkElementKeysOutputBuilder}.
 * @see GetRequiredNetworkElementKeysOutputBuilder
 *
 */
public interface GetRequiredNetworkElementKeysOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetRequiredNetworkElementKeysOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:devicemanager:api",
        "2017-03-17", "output").intern();

    /**
     * List of required-network-element keys that are the mountpoint-names
     *
     *
     *
     * @return <code>java.util.List</code> <code>mountpointNames</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getMountpointNames();

}

