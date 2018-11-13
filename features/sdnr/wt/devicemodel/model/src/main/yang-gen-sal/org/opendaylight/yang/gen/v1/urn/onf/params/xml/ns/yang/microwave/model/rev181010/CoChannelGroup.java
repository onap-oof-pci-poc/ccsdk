package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list co-channel-group {
 *     key "co-channel-group-id";
 *     leaf co-channel-group-id {
 *         type universal-id;
 *     }
 *     leaf-list air-interface-list {
 *         type leafref;
 *     }
 *     leaf sort-of-co-channel-group {
 *         type sort-of-co-channel-group;
 *     }
 *     leaf-list logical-termination-point {
 *         type leafref;
 *         status DEPRECATED;
 *     }
 *     uses co-channel-group-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/co-channel-group</i>
 *
 * <p>To create instances of this class use {@link CoChannelGroupBuilder}.
 * @see CoChannelGroupBuilder
 * @see CoChannelGroupKey
 *
 */
public interface CoChannelGroup
    extends
    ChildOf<MicrowaveModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.CoChannelGroup>,
    CoChannelGroupG,
    Identifiable<CoChannelGroupKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "co-channel-group").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.CoChannelGroupKey</code> <code>key</code>, or <code>null</code> if not present
     */
    CoChannelGroupKey getKey();

}

