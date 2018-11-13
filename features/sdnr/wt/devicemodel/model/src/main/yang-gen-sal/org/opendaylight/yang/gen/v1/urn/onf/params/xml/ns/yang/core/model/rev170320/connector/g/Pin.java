package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PinG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConnectorG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * list pin {
 *     key "position";
 *     leaf position {
 *         type leafref;
 *     }
 *     leaf orientation {
 *         type connector-and-pin-orientation;
 *     }
 *     uses pin-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/connector-g/pin</i>
 *
 * <p>To create instances of this class use {@link PinBuilder}.
 * @see PinBuilder
 * @see PinKey
 *
 */
public interface Pin
    extends
    ChildOf<ConnectorG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.Pin>,
    PinG,
    Identifiable<PinKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "pin").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.PinKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PinKey getKey();

}

