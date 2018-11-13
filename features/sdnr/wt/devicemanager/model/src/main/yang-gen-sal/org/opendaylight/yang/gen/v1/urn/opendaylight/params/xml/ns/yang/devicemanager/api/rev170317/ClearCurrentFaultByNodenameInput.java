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
 * container input {
 *     leaf-list nodenames {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>devicemanager-api/clear-current-fault-by-nodename/input</i>
 *
 * <p>To create instances of this class use {@link ClearCurrentFaultByNodenameInputBuilder}.
 * @see ClearCurrentFaultByNodenameInputBuilder
 *
 */
public interface ClearCurrentFaultByNodenameInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.devicemanager.api.rev170317.ClearCurrentFaultByNodenameInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:devicemanager:api",
        "2017-03-17", "input").intern();

    /**
     * list of network-elements to clear alarms for nodenames, if list empty then all
     *
     *
     *
     * @return <code>java.util.List</code> <code>nodenames</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getNodenames();

}

