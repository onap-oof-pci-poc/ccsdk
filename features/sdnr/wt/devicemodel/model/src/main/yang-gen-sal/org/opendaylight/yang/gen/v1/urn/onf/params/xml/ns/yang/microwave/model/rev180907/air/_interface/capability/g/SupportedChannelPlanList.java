package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.capability.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceCapabilityG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ChannelPlanTypeG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of channel spacing that are supported by the device.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list supported-channel-plan-list {
 *     key "supported-channel-plan";
 *     leaf supported-channel-plan {
 *         type string;
 *     }
 *     leaf duplex-distance-is-variable {
 *         type duplex-distance-is-variable;
 *     }
 *     leaf-list duplex-distance-list {
 *         type duplex-distance-list;
 *     }
 *     leaf duplex-distance {
 *         type duplex-distance;
 *         status DEPRECATED;
 *     }
 *     leaf auto-freq-select-is-avail {
 *         type auto-freq-select-is-avail;
 *     }
 *     list transmission-mode-list {
 *         key "transmission-mode-id";
 *         leaf transmission-mode-id {
 *             type universal-id;
 *         }
 *         leaf transmission-mode-name {
 *             type transmission-mode-name;
 *         }
 *         leaf channel-bandwidth {
 *             type channel-bandwidth;
 *         }
 *         leaf modulation-scheme {
 *             type modulation-scheme;
 *         }
 *         leaf code-rate {
 *             type code-rate;
 *         }
 *         leaf symbol-rate-reduction-factor {
 *             type symbol-rate-reduction-factor;
 *         }
 *         leaf tx-power-min {
 *             type tx-power-min;
 *         }
 *         leaf tx-power-max {
 *             type tx-power-max;
 *         }
 *         leaf rx-threshold {
 *             type rx-threshold;
 *         }
 *         leaf am-upshift-level {
 *             type am-upshift-level;
 *         }
 *         leaf am-downshift-level {
 *             type am-downshift-level;
 *         }
 *         leaf xpic-is-avail {
 *             type xpic-is-avail;
 *         }
 *         uses transmission-mode-type-g;
 *     }
 *     uses channel-plan-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-capability-g/supported-channel-plan-list</i>
 *
 * <p>To create instances of this class use {@link SupportedChannelPlanListBuilder}.
 * @see SupportedChannelPlanListBuilder
 * @see SupportedChannelPlanListKey
 *
 */
public interface SupportedChannelPlanList
    extends
    ChildOf<AirInterfaceCapabilityG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.capability.g.SupportedChannelPlanList>,
    ChannelPlanTypeG,
    Identifiable<SupportedChannelPlanListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "supported-channel-plan-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.air._interface.capability.g.SupportedChannelPlanListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SupportedChannelPlanListKey getKey();

}

