package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.AirInterfaceConfigurationG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container air-interface-configuration {
 *     leaf air-interface-name {
 *         type air-interface-name;
 *     }
 *     leaf radio-signal-id {
 *         type radio-signal-id;
 *     }
 *     leaf tx-frequency {
 *         type tx-frequency;
 *     }
 *     leaf rx-frequency {
 *         type rx-frequency;
 *     }
 *     leaf tx-channel-bandwidth {
 *         type tx-channel-bandwidth;
 *     }
 *     leaf rx-channel-bandwidth {
 *         type rx-channel-bandwidth;
 *     }
 *     leaf polarization {
 *         type polarization;
 *     }
 *     leaf power-is-on {
 *         type power-is-on;
 *     }
 *     leaf transmitter-is-on {
 *         type transmitter-is-on;
 *     }
 *     leaf receiver-is-on {
 *         type receiver-is-on;
 *     }
 *     leaf tx-power {
 *         type tx-power;
 *     }
 *     leaf adaptive-modulation-is-on {
 *         type adaptive-modulation-is-on;
 *     }
 *     leaf modulation-min {
 *         type modulation-min;
 *     }
 *     leaf modulation-max {
 *         type modulation-max;
 *     }
 *     leaf xpic-is-on {
 *         type xpic-is-on;
 *     }
 *     leaf mimo-is-on {
 *         type mimo-is-on;
 *     }
 *     leaf alic-is-on {
 *         type alic-is-on;
 *     }
 *     leaf atpc-is-on {
 *         type atpc-is-on;
 *     }
 *     leaf atpc-thresh-upper {
 *         type atpc-thresh-upper;
 *     }
 *     leaf atpc-thresh-lower {
 *         type atpc-thresh-lower;
 *     }
 *     leaf auto-freq-select-is-on {
 *         type auto-freq-select-is-on;
 *     }
 *     leaf auto-freq-select-range {
 *         type auto-freq-select-range;
 *     }
 *     leaf modulation-is-on {
 *         type modulation-is-on;
 *     }
 *     leaf encryption-is-on {
 *         type encryption-is-on;
 *     }
 *     leaf cryptographic-key {
 *         type cryptographic-key;
 *     }
 *     leaf loop-back-kind-on {
 *         type loop-back-kind-on;
 *     }
 *     leaf maintenance-timer {
 *         type maintenance-timer;
 *     }
 *     list problem-kind-severity-list {
 *         key "problem-kind-name";
 *         leaf problem-kind-name {
 *             type problem-kind-name;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *         uses air-interface-problem-severity-type-g;
 *     }
 *     uses air-interface-configuration-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-air-interface-pac/air-interface-configuration</i>
 *
 * <p>To create instances of this class use {@link AirInterfaceConfigurationBuilder}.
 * @see AirInterfaceConfigurationBuilder
 *
 */
public interface AirInterfaceConfiguration
    extends
    ChildOf<MwAirInterfacePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceConfiguration>,
    AirInterfaceConfigurationG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "air-interface-configuration").intern();


}

