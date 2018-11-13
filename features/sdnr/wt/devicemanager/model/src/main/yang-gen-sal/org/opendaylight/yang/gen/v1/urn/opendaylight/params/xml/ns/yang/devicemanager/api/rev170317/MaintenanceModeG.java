package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.maintenance.mode.g.Filter;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>devicemanager-api</b>
 * <pre>
 * grouping maintenance-mode-g {
 *     leaf mountpoint-name {
 *         type string;
 *     }
 *     leaf node-name {
 *         type string;
 *     }
 *     list filter {
 *         container definition {
 *             leaf object-id-ref {
 *                 type string;
 *             }
 *             leaf problem {
 *                 type string;
 *             }
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf start-date {
 *             type string;
 *         }
 *         leaf end-date {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>devicemanager-api/maintenance-mode-g</i>
 *
 */
public interface MaintenanceModeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:devicemanager:api",
        "2017-03-17", "maintenance-mode-g").intern();

    /**
     * Mountpoint-name as key of node
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mountpointName</code>, or <code>null</code> if not present
     */
    java.lang.String getMountpointName();
    
    /**
     * Node-name as node
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nodeName</code>, or <code>null</code> if not present
     */
    java.lang.String getNodeName();
    
    /**
     * @return <code>java.util.List</code> <code>filter</code>, or <code>null</code> if not present
     */
    List<Filter> getFilter();

}

