package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceCurrentPerformance;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceCapability;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceCurrentProblems;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceConfiguration;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceHistoricalPerformances;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list mw-air-interface-pac {
 *     key "layer-protocol";
 *     leaf layer-protocol {
 *         type leafref;
 *     }
 *     container air-interface-capability {
 *         leaf type-of-equipment {
 *             type type-of-equipment;
 *         }
 *         leaf tx-frequency-min {
 *             type tx-frequency-min;
 *         }
 *         leaf tx-frequency-max {
 *             type tx-frequency-max;
 *         }
 *         leaf rx-frequency-min {
 *             type rx-frequency-min;
 *         }
 *         leaf rx-frequency-max {
 *             type rx-frequency-max;
 *         }
 *         leaf adaptive-modulation-is-avail {
 *             type adaptive-modulation-is-avail;
 *         }
 *         leaf mimo-is-avail {
 *             type mimo-is-avail;
 *         }
 *         leaf mimo-channels {
 *             type mimo-channels;
 *         }
 *         leaf alic-is-avail {
 *             type alic-is-avail;
 *         }
 *         leaf atpc-is-avail {
 *             type atpc-is-avail;
 *         }
 *         leaf atpc-range {
 *             type atpc-range;
 *         }
 *         leaf encryption-is-avail {
 *             type encryption-is-avail;
 *         }
 *         leaf-list supported-loop-back-kind-list {
 *             type loop-back-type;
 *         }
 *         leaf maintenance-timer-range {
 *             type maintenance-timer-range;
 *         }
 *         leaf supported-alarms {
 *             type supported-alarms;
 *         }
 *         list supported-channel-plan-list {
 *             key "supported-channel-plan";
 *             leaf supported-channel-plan {
 *                 type supported-channel-plan;
 *             }
 *             leaf duplex-distance-is-variable {
 *                 type duplex-distance-is-variable;
 *             }
 *             leaf duplex-distance {
 *                 type duplex-distance;
 *             }
 *             leaf auto-freq-select-is-avail {
 *                 type auto-freq-select-is-avail;
 *             }
 *             list transmission-mode-list {
 *                 key "transmission-mode-id";
 *                 leaf transmission-mode-id {
 *                     type universal-id;
 *                 }
 *                 leaf channel-bandwidth {
 *                     type channel-bandwidth;
 *                 }
 *                 leaf modulation-scheme {
 *                     type modulation-scheme;
 *                 }
 *                 leaf code-rate {
 *                     type code-rate;
 *                 }
 *                 leaf tx-power-min {
 *                     type tx-power-min;
 *                 }
 *                 leaf tx-power-max {
 *                     type tx-power-max;
 *                 }
 *                 leaf rx-threshold {
 *                     type rx-threshold;
 *                 }
 *                 leaf am-upshift-level {
 *                     type am-upshift-level;
 *                 }
 *                 leaf am-downshift-level {
 *                     type am-downshift-level;
 *                 }
 *                 leaf xpic-is-avail {
 *                     type xpic-is-avail;
 *                 }
 *                 uses transmission-mode-type-g;
 *             }
 *             uses channel-plan-type-g;
 *         }
 *         uses air-interface-capability-g;
 *     }
 *     container air-interface-configuration {
 *         leaf air-interface-name {
 *             type air-interface-name;
 *         }
 *         leaf radio-signal-id {
 *             type radio-signal-id;
 *         }
 *         leaf tx-frequency {
 *             type tx-frequency;
 *         }
 *         leaf rx-frequency {
 *             type rx-frequency;
 *         }
 *         leaf tx-channel-bandwidth {
 *             type tx-channel-bandwidth;
 *         }
 *         leaf rx-channel-bandwidth {
 *             type rx-channel-bandwidth;
 *         }
 *         leaf polarization {
 *             type polarization;
 *         }
 *         leaf power-is-on {
 *             type power-is-on;
 *         }
 *         leaf transmitter-is-on {
 *             type transmitter-is-on;
 *         }
 *         leaf receiver-is-on {
 *             type receiver-is-on;
 *         }
 *         leaf tx-power {
 *             type tx-power;
 *         }
 *         leaf adaptive-modulation-is-on {
 *             type adaptive-modulation-is-on;
 *         }
 *         leaf modulation-min {
 *             type modulation-min;
 *         }
 *         leaf modulation-max {
 *             type modulation-max;
 *         }
 *         leaf xpic-is-on {
 *             type xpic-is-on;
 *         }
 *         leaf mimo-is-on {
 *             type mimo-is-on;
 *         }
 *         leaf alic-is-on {
 *             type alic-is-on;
 *         }
 *         leaf atpc-is-on {
 *             type atpc-is-on;
 *         }
 *         leaf atpc-thresh-upper {
 *             type atpc-thresh-upper;
 *         }
 *         leaf atpc-thresh-lower {
 *             type atpc-thresh-lower;
 *         }
 *         leaf auto-freq-select-is-on {
 *             type auto-freq-select-is-on;
 *         }
 *         leaf auto-freq-select-range {
 *             type auto-freq-select-range;
 *         }
 *         leaf modulation-is-on {
 *             type modulation-is-on;
 *         }
 *         leaf encryption-is-on {
 *             type encryption-is-on;
 *         }
 *         leaf cryptographic-key {
 *             type cryptographic-key;
 *         }
 *         leaf loop-back-kind-on {
 *             type loop-back-kind-on;
 *         }
 *         leaf maintenance-timer {
 *             type maintenance-timer;
 *         }
 *         list problem-kind-severity-list {
 *             key "problem-kind-name";
 *             leaf problem-kind-name {
 *                 type problem-kind-name;
 *             }
 *             leaf problem-kind-severity {
 *                 type problem-kind-severity;
 *             }
 *             uses air-interface-problem-severity-type-g;
 *         }
 *         uses air-interface-configuration-g;
 *     }
 *     container air-interface-status {
 *         leaf tx-frequency-cur {
 *             type tx-frequency-cur;
 *         }
 *         leaf rx-frequency-cur {
 *             type rx-frequency-cur;
 *         }
 *         leaf tx-level-cur {
 *             type tx-level-cur;
 *         }
 *         leaf rx-level-cur {
 *             type rx-level-cur;
 *         }
 *         leaf modulation-cur {
 *             type modulation-cur;
 *         }
 *         leaf code-rate-cur {
 *             type code-rate-cur;
 *         }
 *         leaf snir-cur {
 *             type snir-cur;
 *         }
 *         leaf xpd-cur {
 *             type xpd-cur;
 *         }
 *         leaf rf-temp-cur {
 *             type rf-temp-cur;
 *         }
 *         leaf last-status-change {
 *             type last-status-change;
 *         }
 *         leaf radio-power-is-up {
 *             type radio-power-is-up;
 *         }
 *         leaf link-is-up {
 *             type link-is-up;
 *         }
 *         leaf xpic-is-up {
 *             type xpic-is-up;
 *         }
 *         leaf mimo-is-up {
 *             type mimo-is-up;
 *         }
 *         leaf alic-is-up {
 *             type alic-is-up;
 *         }
 *         leaf atpc-is-up {
 *             type atpc-is-up;
 *         }
 *         leaf auto-freq-select-is-up {
 *             type auto-freq-select-is-up;
 *         }
 *         leaf loop-back-kind-up {
 *             type loop-back-kind-up;
 *         }
 *         leaf local-end-point-id {
 *             type local-end-point-id;
 *         }
 *         leaf remote-end-point-id {
 *             type remote-end-point-id;
 *         }
 *         uses air-interface-status-g;
 *     }
 *     container air-interface-current-problems {
 *         list current-problem-list {
 *             key "sequence-number";
 *             leaf problem-name {
 *                 type problem-name;
 *             }
 *             leaf sequence-number {
 *                 type int32;
 *             }
 *             leaf time-stamp {
 *                 type time-stamp;
 *             }
 *             leaf problem-severity {
 *                 type problem-severity;
 *             }
 *             uses air-interface-current-problem-type-g;
 *         }
 *         uses air-interface-current-problems-g;
 *     }
 *     container air-interface-current-performance {
 *         list current-performance-data-list {
 *             key "scanner-id";
 *             container performance-data {
 *                 leaf es {
 *                     type es;
 *                 }
 *                 leaf ses {
 *                     type ses;
 *                 }
 *                 leaf cses {
 *                     type cses;
 *                 }
 *                 leaf unavailability {
 *                     type unavailability;
 *                 }
 *                 leaf tx-level-min {
 *                     type tx-level-min;
 *                 }
 *                 leaf tx-level-max {
 *                     type tx-level-max;
 *                 }
 *                 leaf tx-level-avg {
 *                     type tx-level-avg;
 *                 }
 *                 leaf rx-level-min {
 *                     type rx-level-min;
 *                 }
 *                 leaf rx-level-max {
 *                     type rx-level-max;
 *                 }
 *                 leaf rx-level-avg {
 *                     type rx-level-avg;
 *                 }
 *                 leaf time2-states {
 *                     type time2-states;
 *                 }
 *                 leaf time4-states-s {
 *                     type time4-states-s;
 *                 }
 *                 leaf time4-states {
 *                     type time4-states;
 *                 }
 *                 leaf time8-states {
 *                     type time8-states;
 *                 }
 *                 leaf time16-states-s {
 *                     type time16-states-s;
 *                 }
 *                 leaf time16-states {
 *                     type time16-states;
 *                 }
 *                 leaf time32-states {
 *                     type time32-states;
 *                 }
 *                 leaf time64-states {
 *                     type time64-states;
 *                 }
 *                 leaf time128-states {
 *                     type time128-states;
 *                 }
 *                 leaf time256-states {
 *                     type time256-states;
 *                 }
 *                 leaf time512-states {
 *                     type time512-states;
 *                 }
 *                 leaf time512-states-l {
 *                     type time512-states-l;
 *                 }
 *                 leaf time1024-states {
 *                     type time1024-states;
 *                 }
 *                 leaf time1024-states-l {
 *                     type time1024-states-l;
 *                 }
 *                 leaf time2048-states {
 *                     type time2048-states;
 *                 }
 *                 leaf time2048-states-l {
 *                     type time2048-states-l;
 *                 }
 *                 leaf time4096-states {
 *                     type time4096-states;
 *                 }
 *                 leaf time4096-states-l {
 *                     type time4096-states-l;
 *                 }
 *                 leaf time8192-states {
 *                     type time8192-states;
 *                 }
 *                 leaf time8192-states-l {
 *                     type time8192-states-l;
 *                 }
 *                 leaf snir-min {
 *                     type snir-min;
 *                 }
 *                 leaf snir-max {
 *                     type snir-max;
 *                 }
 *                 leaf snir-avg {
 *                     type snir-avg;
 *                 }
 *                 leaf xpd-min {
 *                     type xpd-min;
 *                 }
 *                 leaf xpd-max {
 *                     type xpd-max;
 *                 }
 *                 leaf xpd-avg {
 *                     type xpd-avg;
 *                 }
 *                 leaf rf-temp-min {
 *                     type rf-temp-min;
 *                 }
 *                 leaf rf-temp-max {
 *                     type rf-temp-max;
 *                 }
 *                 leaf rf-temp-avg {
 *                     type rf-temp-avg;
 *                 }
 *                 leaf defect-blocks-sum {
 *                     type defect-blocks-sum;
 *                 }
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 uses air-interface-performance-type-g;
 *             }
 *             leaf timestamp {
 *                 type date-and-time;
 *             }
 *             leaf suspect-interval-flag {
 *                 type boolean;
 *             }
 *             leaf elapsed-time {
 *                 type int64;
 *             }
 *             leaf scanner-id {
 *                 type string;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf administrative-state {
 *                 type administrative-state;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses air-interface-current-performance-type-g;
 *         }
 *         uses air-interface-current-performance-g;
 *     }
 *     container air-interface-historical-performances {
 *         list historical-performance-data-list {
 *             key "history-data-id";
 *             container performance-data {
 *                 leaf es {
 *                     type es;
 *                 }
 *                 leaf ses {
 *                     type ses;
 *                 }
 *                 leaf cses {
 *                     type cses;
 *                 }
 *                 leaf unavailability {
 *                     type unavailability;
 *                 }
 *                 leaf tx-level-min {
 *                     type tx-level-min;
 *                 }
 *                 leaf tx-level-max {
 *                     type tx-level-max;
 *                 }
 *                 leaf tx-level-avg {
 *                     type tx-level-avg;
 *                 }
 *                 leaf rx-level-min {
 *                     type rx-level-min;
 *                 }
 *                 leaf rx-level-max {
 *                     type rx-level-max;
 *                 }
 *                 leaf rx-level-avg {
 *                     type rx-level-avg;
 *                 }
 *                 leaf time2-states {
 *                     type time2-states;
 *                 }
 *                 leaf time4-states-s {
 *                     type time4-states-s;
 *                 }
 *                 leaf time4-states {
 *                     type time4-states;
 *                 }
 *                 leaf time8-states {
 *                     type time8-states;
 *                 }
 *                 leaf time16-states-s {
 *                     type time16-states-s;
 *                 }
 *                 leaf time16-states {
 *                     type time16-states;
 *                 }
 *                 leaf time32-states {
 *                     type time32-states;
 *                 }
 *                 leaf time64-states {
 *                     type time64-states;
 *                 }
 *                 leaf time128-states {
 *                     type time128-states;
 *                 }
 *                 leaf time256-states {
 *                     type time256-states;
 *                 }
 *                 leaf time512-states {
 *                     type time512-states;
 *                 }
 *                 leaf time512-states-l {
 *                     type time512-states-l;
 *                 }
 *                 leaf time1024-states {
 *                     type time1024-states;
 *                 }
 *                 leaf time1024-states-l {
 *                     type time1024-states-l;
 *                 }
 *                 leaf time2048-states {
 *                     type time2048-states;
 *                 }
 *                 leaf time2048-states-l {
 *                     type time2048-states-l;
 *                 }
 *                 leaf time4096-states {
 *                     type time4096-states;
 *                 }
 *                 leaf time4096-states-l {
 *                     type time4096-states-l;
 *                 }
 *                 leaf time8192-states {
 *                     type time8192-states;
 *                 }
 *                 leaf time8192-states-l {
 *                     type time8192-states-l;
 *                 }
 *                 leaf snir-min {
 *                     type snir-min;
 *                 }
 *                 leaf snir-max {
 *                     type snir-max;
 *                 }
 *                 leaf snir-avg {
 *                     type snir-avg;
 *                 }
 *                 leaf xpd-min {
 *                     type xpd-min;
 *                 }
 *                 leaf xpd-max {
 *                     type xpd-max;
 *                 }
 *                 leaf xpd-avg {
 *                     type xpd-avg;
 *                 }
 *                 leaf rf-temp-min {
 *                     type rf-temp-min;
 *                 }
 *                 leaf rf-temp-max {
 *                     type rf-temp-max;
 *                 }
 *                 leaf rf-temp-avg {
 *                     type rf-temp-avg;
 *                 }
 *                 leaf defect-blocks-sum {
 *                     type defect-blocks-sum;
 *                 }
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 uses air-interface-performance-type-g;
 *             }
 *             leaf suspect-interval-flag {
 *                 type suspect-interval-flag;
 *             }
 *             leaf history-data-id {
 *                 type string;
 *             }
 *             leaf period-end-time {
 *                 type date-and-time;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf object-class {
 *                 type object-identifier;
 *             }
 *             leaf name-binding {
 *                 type object-identifier;
 *             }
 *             uses air-interface-historical-performance-type-g;
 *         }
 *         uses air-interface-historical-performances-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-air-interface-pac</i>
 *
 * <p>To create instances of this class use {@link MwAirInterfacePacBuilder}.
 * @see MwAirInterfacePacBuilder
 * @see MwAirInterfacePacKey
 *
 */
public interface MwAirInterfacePac
    extends
    ChildOf<MicrowaveModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePac>,
    Identifiable<MwAirInterfacePacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "mw-air-interface-pac").intern();

    /**
     * CoreModel-CoreNetworkModule-ObjectClasses:NetworkElement/_ltpRefList/_lpList/uuid
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>layerProtocol</code>, or <code>null</code> if not present
     */
    UniversalId getLayerProtocol();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceCapability</code> <code>airInterfaceCapability</code>, or <code>null</code> if not present
     */
    AirInterfaceCapability getAirInterfaceCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceConfiguration</code> <code>airInterfaceConfiguration</code>, or <code>null</code> if not present
     */
    AirInterfaceConfiguration getAirInterfaceConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceStatus</code> <code>airInterfaceStatus</code>, or <code>null</code> if not present
     */
    AirInterfaceStatus getAirInterfaceStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceCurrentProblems</code> <code>airInterfaceCurrentProblems</code>, or <code>null</code> if not present
     */
    AirInterfaceCurrentProblems getAirInterfaceCurrentProblems();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceCurrentPerformance</code> <code>airInterfaceCurrentPerformance</code>, or <code>null</code> if not present
     */
    AirInterfaceCurrentPerformance getAirInterfaceCurrentPerformance();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.air._interface.pac.AirInterfaceHistoricalPerformances</code> <code>airInterfaceHistoricalPerformances</code>, or <code>null</code> if not present
     */
    AirInterfaceHistoricalPerformances getAirInterfaceHistoricalPerformances();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwAirInterfacePacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MwAirInterfacePacKey getKey();

}

