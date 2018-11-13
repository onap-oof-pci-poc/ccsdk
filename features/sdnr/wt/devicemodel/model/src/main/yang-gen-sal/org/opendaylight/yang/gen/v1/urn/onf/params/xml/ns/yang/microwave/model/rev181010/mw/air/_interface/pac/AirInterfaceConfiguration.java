package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwAirInterfacePac;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceConfigurationG;
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
 *     leaf remote-air-interface-name {
 *         type remote-air-interface-name;
 *     }
 *     leaf expected-signal-id {
 *         type int16;
 *     }
 *     leaf transmitted-signal-id {
 *         type int16;
 *     }
 *     leaf radio-signal-id {
 *         type radio-signal-id;
 *         status DEPRECATED;
 *     }
 *     leaf tx-frequency {
 *         type tx-frequency;
 *     }
 *     leaf rx-frequency {
 *         type rx-frequency;
 *     }
 *     leaf transmission-mode-min {
 *         type universal-id;
 *     }
 *     leaf transmission-mode-max {
 *         type universal-id;
 *     }
 *     leaf tx-channel-bandwidth {
 *         type tx-channel-bandwidth;
 *         status DEPRECATED;
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
 *         status DEPRECATED;
 *     }
 *     leaf modulation-max {
 *         type modulation-max;
 *         status DEPRECATED;
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
 *     leaf atpc-tx-power-min {
 *         type atpc-tx-power-min;
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
 *     leaf performance-monitoring-collection-is-on {
 *         type performance-monitoring-collection-is-on;
 *     }
 *     list threshold-cross-alarm-list {
 *         key "g826-value-kind" "granularity-period";
 *         leaf g826-value-kind {
 *             type g826-type;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf alarm-raising-threshold {
 *             type alarm-raising-threshold;
 *         }
 *         leaf alarm-clearing-threshold {
 *             type alarm-clearing-threshold;
 *         }
 *         uses threshold-cross-alarm-type-g;
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
 *             type string;
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
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceConfiguration>,
    AirInterfaceConfigurationG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "air-interface-configuration").intern();


}

