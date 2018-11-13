package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PinLayoutG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConnectorG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container pin-layout {
 *     list position {
 *         key "relative-position";
 *         leaf relative-position {
 *             type to-be-defined;
 *         }
 *         uses position-g;
 *     }
 *     uses pin-layout-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/connector-g/pin-layout</i>
 *
 * <p>To create instances of this class use {@link PinLayoutBuilder}.
 * @see PinLayoutBuilder
 *
 */
public interface PinLayout
    extends
    ChildOf<ConnectorG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.PinLayout>,
    PinLayoutG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "pin-layout").intern();


}

