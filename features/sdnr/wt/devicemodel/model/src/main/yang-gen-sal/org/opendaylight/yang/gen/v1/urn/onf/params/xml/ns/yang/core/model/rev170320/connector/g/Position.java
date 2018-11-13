package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConnectorG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PositionG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container position {
 *     leaf relative-position {
 *         type to-be-defined;
 *     }
 *     uses position-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/connector-g/position</i>
 *
 * <p>To create instances of this class use {@link PositionBuilder}.
 * @see PositionBuilder
 *
 */
public interface Position
    extends
    ChildOf<ConnectorG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.Position>,
    PositionG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "position").intern();


}

