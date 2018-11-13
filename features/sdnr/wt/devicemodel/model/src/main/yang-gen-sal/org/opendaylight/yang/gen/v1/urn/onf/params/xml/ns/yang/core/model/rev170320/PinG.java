package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping pin-g {
 *     leaf position {
 *         type leafref;
 *     }
 *     leaf orientation {
 *         type connector-and-pin-orientation;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/pin-g</i>
 *
 */
public interface PinG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "pin-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined</code> <code>position</code>, or <code>null</code> if not present
     */
    ToBeDefined getPosition();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConnectorAndPinOrientation</code> <code>orientation</code>, or <code>null</code> if not present
     */
    ConnectorAndPinOrientation getOrientation();

}

