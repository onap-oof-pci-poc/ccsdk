package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.channel.plan.type.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.TransmissionModeTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ChannelPlanTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list transmission-mode-list {
 *     key "transmission-mode-id";
 *     leaf transmission-mode-id {
 *         type universal-id;
 *     }
 *     leaf transmission-mode-name {
 *         type transmission-mode-name;
 *     }
 *     leaf channel-bandwidth {
 *         type channel-bandwidth;
 *     }
 *     leaf modulation-scheme {
 *         type modulation-scheme;
 *     }
 *     leaf code-rate {
 *         type code-rate;
 *     }
 *     leaf symbol-rate-reduction-factor {
 *         type symbol-rate-reduction-factor;
 *     }
 *     leaf tx-power-min {
 *         type tx-power-min;
 *     }
 *     leaf tx-power-max {
 *         type tx-power-max;
 *     }
 *     leaf rx-threshold {
 *         type rx-threshold;
 *     }
 *     leaf am-upshift-level {
 *         type am-upshift-level;
 *     }
 *     leaf am-downshift-level {
 *         type am-downshift-level;
 *     }
 *     leaf xpic-is-avail {
 *         type xpic-is-avail;
 *     }
 *     uses transmission-mode-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/channel-plan-type-g/transmission-mode-list</i>
 *
 * <p>To create instances of this class use {@link TransmissionModeListBuilder}.
 * @see TransmissionModeListBuilder
 * @see TransmissionModeListKey
 *
 */
public interface TransmissionModeList
    extends
    ChildOf<ChannelPlanTypeG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.channel.plan.type.g.TransmissionModeList>,
    TransmissionModeTypeG,
    Identifiable<TransmissionModeListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "transmission-mode-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.channel.plan.type.g.TransmissionModeListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    TransmissionModeListKey getKey();

}

