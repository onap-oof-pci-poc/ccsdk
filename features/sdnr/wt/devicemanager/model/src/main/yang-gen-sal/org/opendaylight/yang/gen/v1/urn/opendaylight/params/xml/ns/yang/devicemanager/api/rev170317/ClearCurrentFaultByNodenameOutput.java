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
 *     leaf-list nodenames {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>devicemanager-api/clear-current-fault-by-nodename/output</i>
 *
 * <p>To create instances of this class use {@link ClearCurrentFaultByNodenameOutputBuilder}.
 * @see ClearCurrentFaultByNodenameOutputBuilder
 *
 */
public interface ClearCurrentFaultByNodenameOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.ClearCurrentFaultByNodenameOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:devicemanager:api",
        "2017-03-17", "output").intern();

    /**
     * list of network-elements alarms cleared
     *
     *
     *
     * @return <code>java.util.List</code> <code>nodenames</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getNodenames();

}

