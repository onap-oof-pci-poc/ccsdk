package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.pin.layout.g.Position;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping pin-layout-g {
 *     list position {
 *         key "relative-position";
 *         leaf relative-position {
 *             type to-be-defined;
 *         }
 *         uses position-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/pin-layout-g</i>
 *
 */
public interface PinLayoutG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "pin-layout-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>position</code>, or <code>null</code> if not present
     */
    List<Position> getPosition();

}

