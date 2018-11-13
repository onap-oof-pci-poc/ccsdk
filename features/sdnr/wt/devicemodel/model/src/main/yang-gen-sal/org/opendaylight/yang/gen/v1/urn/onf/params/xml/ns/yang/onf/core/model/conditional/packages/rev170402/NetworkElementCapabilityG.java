package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * grouping network-element-capability-g {
 *     leaf-list supported-alarms {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/network-element-capability-g</i>
 *
 */
public interface NetworkElementCapabilityG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "network-element-capability-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedAlarms</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSupportedAlarms();

}

