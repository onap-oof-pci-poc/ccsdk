package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SignalOrderingTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MauTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Describes the different (e.g. MDI, MDI-X) ways of ordering the signals on the 
 * physical medium
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list signal-ordering-list {
 *     key "signal-ordering-kind-name";
 *     leaf signal-ordering-kind-name {
 *         type string;
 *     }
 *     leaf-list signal-list {
 *         type string;
 *     }
 *     uses signal-ordering-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mau-type-g/signal-ordering-list</i>
 *
 * <p>To create instances of this class use {@link SignalOrderingListBuilder}.
 * @see SignalOrderingListBuilder
 * @see SignalOrderingListKey
 *
 */
public interface SignalOrderingList
    extends
    ChildOf<MauTypeG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingList>,
    SignalOrderingTypeG,
    Identifiable<SignalOrderingListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "signal-ordering-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mau.type.g.SignalOrderingListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SignalOrderingListKey getKey();

}

