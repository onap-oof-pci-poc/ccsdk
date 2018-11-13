package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceCapabilityG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container air-interface-capability {
 *     leaf type-of-equipment {
 *         type type-of-equipment;
 *     }
 *     leaf tx-frequency-min {
 *         type tx-frequency-min;
 *     }
 *     leaf tx-frequency-max {
 *         type tx-frequency-max;
 *     }
 *     leaf rx-frequency-min {
 *         type rx-frequency-min;
 *     }
 *     leaf rx-frequency-max {
 *         type rx-frequency-max;
 *     }
 *     leaf adaptive-modulation-is-avail {
 *         type adaptive-modulation-is-avail;
 *     }
 *     leaf mimo-is-avail {
 *         type mimo-is-avail;
 *     }
 *     leaf mimo-channels {
 *         type mimo-channels;
 *     }
 *     leaf alic-is-avail {
 *         type alic-is-avail;
 *     }
 *     leaf atpc-is-avail {
 *         type atpc-is-avail;
 *     }
 *     leaf atpc-range {
 *         type atpc-range;
 *     }
 *     leaf encryption-is-avail {
 *         type encryption-is-avail;
 *     }
 *     leaf-list supported-loop-back-kind-list {
 *         type loop-back-type;
 *     }
 *     leaf maintenance-timer-range {
 *         type maintenance-timer-range;
 *     }
 *     leaf supported-alarms {
 *         type supported-alarms;
 *     }
 *     list supported-channel-plan-list {
 *         key "supported-channel-plan";
 *         leaf supported-channel-plan {
 *             type supported-channel-plan;
 *         }
 *         leaf duplex-distance-is-variable {
 *             type duplex-distance-is-variable;
 *         }
 *         leaf duplex-distance {
 *             type duplex-distance;
 *         }
 *         leaf auto-freq-select-is-avail {
 *             type auto-freq-select-is-avail;
 *         }
 *         list transmission-mode-list {
 *             key "transmission-mode-id";
 *             leaf transmission-mode-id {
 *                 type universal-id;
 *             }
 *             leaf channel-bandwidth {
 *                 type channel-bandwidth;
 *             }
 *             leaf modulation-scheme {
 *                 type modulation-scheme;
 *             }
 *             leaf code-rate {
 *                 type code-rate;
 *             }
 *             leaf tx-power-min {
 *                 type tx-power-min;
 *             }
 *             leaf tx-power-max {
 *                 type tx-power-max;
 *             }
 *             leaf rx-threshold {
 *                 type rx-threshold;
 *             }
 *             leaf am-upshift-level {
 *                 type am-upshift-level;
 *             }
 *             leaf am-downshift-level {
 *                 type am-downshift-level;
 *             }
 *             leaf xpic-is-avail {
 *                 type xpic-is-avail;
 *             }
 *             uses transmission-mode-type-g;
 *         }
 *         uses channel-plan-type-g;
 *     }
 *     uses air-interface-capability-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-air-interface-pac/air-interface-capability</i>
 *
 * <p>To create instances of this class use {@link AirInterfaceCapabilityBuilder}.
 * @see AirInterfaceCapabilityBuilder
 *
 */
public interface AirInterfaceCapability
    extends
    ChildOf<MwAirInterfacePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceCapability>,
    AirInterfaceCapabilityG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "air-interface-capability").intern();


}

