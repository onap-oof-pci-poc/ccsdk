package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>devicemanager-api</b>
 * <pre>
 * container output {
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
 *     uses maintenance-mode-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>devicemanager-api/get-maintenance-mode/output</i>
 *
 * <p>To create instances of this class use {@link GetMaintenanceModeOutputBuilder}.
 * @see GetMaintenanceModeOutputBuilder
 *
 */
public interface GetMaintenanceModeOutput
    extends
    MaintenanceModeG,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.GetMaintenanceModeOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:devicemanager:api",
        "2017-03-17", "output").intern();


}

