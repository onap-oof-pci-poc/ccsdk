package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SignalOrderingTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.WireInterfaceStatusG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Reference on a SignalOrderingType for expressing the currently active way of 
 * ordering the signals on the physical medium. Must contain a value as defined in 
 * TypeDefinitions::SignalOrderingType::signalOrderingKindName
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container signal-ordering-kind-cur {
 *     leaf signal-ordering-kind-name {
 *         type string;
 *     }
 *     leaf-list signal-list {
 *         type string;
 *     }
 *     uses signal-ordering-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/wire-interface-status-g/signal-ordering-kind-cur</i>
 *
 * <p>To create instances of this class use {@link SignalOrderingKindCurBuilder}.
 * @see SignalOrderingKindCurBuilder
 *
 */
public interface SignalOrderingKindCur
    extends
    ChildOf<WireInterfaceStatusG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.wire._interface.status.g.SignalOrderingKindCur>,
    SignalOrderingTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "signal-ordering-kind-cur").intern();


}

