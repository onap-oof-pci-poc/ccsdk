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
 * <i>devicemanager-api/get-maintenance-mode/input</i>
 *
 * <p>To create instances of this class use {@link GetMaintenanceModeInputBuilder}.
 * @see GetMaintenanceModeInputBuilder
 *
 */
public interface GetMaintenanceModeInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:devicemanager:api",
        "2017-03-17", "input").intern();

    /**
     * Mountpoint-name as key of node
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mountpointName</code>, or <code>null</code> if not present
     */
    java.lang.String getMountpointName();

}
