package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.pin.layout.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PinLayoutG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PositionG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * list position {
 *     key "relative-position";
 *     leaf relative-position {
 *         type to-be-defined;
 *     }
 *     uses position-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/pin-layout-g/position</i>
 *
 * <p>To create instances of this class use {@link PositionBuilder}.
 * @see PositionBuilder
 * @see PositionKey
 *
 */
public interface Position
    extends
    ChildOf<PinLayoutG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.pin.layout.g.Position>,
    PositionG,
    Identifiable<PositionKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "position").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.pin.layout.g.PositionKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PositionKey getKey();

}

