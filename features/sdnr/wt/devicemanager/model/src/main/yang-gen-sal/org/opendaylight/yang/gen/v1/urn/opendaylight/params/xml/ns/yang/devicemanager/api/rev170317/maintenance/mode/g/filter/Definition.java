package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.maintenance.mode.g.filter;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.maintenance.mode.g.Filter;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>devicemanager-api</b>
 * <pre>
 * container definition {
 *     leaf object-id-ref {
 *         type string;
 *     }
 *     leaf problem {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>devicemanager-api/maintenance-mode-g/filter/definition</i>
 *
 * <p>To create instances of this class use {@link DefinitionBuilder}.
 * @see DefinitionBuilder
 *
 */
public interface Definition
    extends
    ChildOf<Filter>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.maintenance.mode.g.filter.Definition>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:devicemanager:api",
        "2017-03-17", "definition").intern();

    /**
     * object id to filter on
     *
     *
     *
     * @return <code>java.lang.String</code> <code>objectIdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getObjectIdRef();
    
    /**
     * name of the problem to filter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>problem</code>, or <code>null</code> if not present
     */
    java.lang.String getProblem();

}

