package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.maintenance.mode.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.MaintenanceModeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.maintenance.mode.g.filter.Definition;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>devicemanager-api</b>
 * <pre>
 * list filter {
 *     container definition {
 *         leaf object-id-ref {
 *             type string;
 *         }
 *         leaf problem {
 *             type string;
 *         }
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf start-date {
 *         type string;
 *     }
 *     leaf end-date {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>devicemanager-api/maintenance-mode-g/filter</i>
 *
 * <p>To create instances of this class use {@link FilterBuilder}.
 * @see FilterBuilder
 *
 *
 */
public interface Filter
    extends
    ChildOf<MaintenanceModeG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.maintenance.mode.g.Filter>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:devicemanager:api",
        "2017-03-17", "filter").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.maintenance.mode.g.filter.Definition</code> <code>definition</code>, or <code>null</code> if not present
     */
    Definition getDefinition();
    
    /**
     * Node-name as node
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * begin of maintenance-mode
     *
     *
     *
     * @return <code>java.lang.String</code> <code>startDate</code>, or <code>null</code> if not present
     */
    java.lang.String getStartDate();
    
    /**
     * end of maintenance-mode
     *
     *
     *
     * @return <code>java.lang.String</code> <code>endDate</code>, or <code>null</code> if not present
     */
    java.lang.String getEndDate();

}

