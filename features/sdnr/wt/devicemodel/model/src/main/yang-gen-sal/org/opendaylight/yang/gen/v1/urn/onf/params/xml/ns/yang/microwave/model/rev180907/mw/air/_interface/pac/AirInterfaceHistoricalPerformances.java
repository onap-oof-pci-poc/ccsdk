package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.AirInterfaceHistoricalPerformancesG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwAirInterfacePac;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container air-interface-historical-performances {
 *     list historical-performance-data-list {
 *         key "history-data-id";
 *         container performance-data {
 *             leaf es {
 *                 type es;
 *             }
 *             leaf ses {
 *                 type ses;
 *             }
 *             leaf cses {
 *                 type cses;
 *             }
 *             leaf unavailability {
 *                 type unavailability;
 *             }
 *             leaf tx-level-min {
 *                 type tx-level-min;
 *             }
 *             leaf tx-level-max {
 *                 type tx-level-max;
 *             }
 *             leaf tx-level-avg {
 *                 type tx-level-avg;
 *             }
 *             leaf rx-level-min {
 *                 type rx-level-min;
 *             }
 *             leaf rx-level-max {
 *                 type rx-level-max;
 *             }
 *             leaf rx-level-avg {
 *                 type rx-level-avg;
 *             }
 *             list time-x-states-list {
 *                 key "transmission-mode";
 *                 leaf transmission-mode {
 *                     type leafref;
 *                 }
 *                 leaf time {
 *                     type time;
 *                 }
 *                 uses time-x-states-type-g;
 *             }
 *             leaf time2-states {
 *                 type time2-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time4-states-s {
 *                 type time4-states-s;
 *                 status DEPRECATED;
 *             }
 *             leaf time4-states {
 *                 type time4-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time8-states {
 *                 type time8-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time16-states-s {
 *                 type time16-states-s;
 *                 status DEPRECATED;
 *             }
 *             leaf time16-states {
 *                 type time16-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time32-states {
 *                 type time32-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time64-states {
 *                 type time64-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time128-states {
 *                 type time128-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time256-states {
 *                 type time256-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time512-states {
 *                 type time512-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time512-states-l {
 *                 type time512-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf time1024-states {
 *                 type time1024-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time1024-states-l {
 *                 type time1024-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf time2048-states {
 *                 type time2048-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time2048-states-l {
 *                 type time2048-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf time4096-states {
 *                 type time4096-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time4096-states-l {
 *                 type time4096-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf time8192-states {
 *                 type time8192-states;
 *                 status DEPRECATED;
 *             }
 *             leaf time8192-states-l {
 *                 type time8192-states-l;
 *                 status DEPRECATED;
 *             }
 *             leaf snir-min {
 *                 type snir-min;
 *             }
 *             leaf snir-max {
 *                 type snir-max;
 *             }
 *             leaf snir-avg {
 *                 type snir-avg;
 *             }
 *             leaf xpd-min {
 *                 type xpd-min;
 *             }
 *             leaf xpd-max {
 *                 type xpd-max;
 *             }
 *             leaf xpd-avg {
 *                 type xpd-avg;
 *             }
 *             leaf rf-temp-min {
 *                 type rf-temp-min;
 *             }
 *             leaf rf-temp-max {
 *                 type rf-temp-max;
 *             }
 *             leaf rf-temp-avg {
 *                 type rf-temp-avg;
 *             }
 *             leaf defect-blocks-sum {
 *                 type defect-blocks-sum;
 *             }
 *             leaf time-period {
 *                 type time-period;
 *             }
 *             uses air-interface-performance-type-g;
 *         }
 *         leaf suspect-interval-flag {
 *             type suspect-interval-flag;
 *         }
 *         leaf history-data-id {
 *             type string;
 *         }
 *         leaf period-end-time {
 *             type date-and-time;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf object-class {
 *             type object-identifier;
 *         }
 *         leaf name-binding {
 *             type object-identifier;
 *         }
 *         uses air-interface-historical-performance-type-g;
 *     }
 *     uses air-interface-historical-performances-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-air-interface-pac/air-interface-historical-performances</i>
 *
 * <p>To create instances of this class use {@link AirInterfaceHistoricalPerformancesBuilder}.
 * @see AirInterfaceHistoricalPerformancesBuilder
 *
 */
public interface AirInterfaceHistoricalPerformances
    extends
    ChildOf<MwAirInterfacePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.air._interface.pac.AirInterfaceHistoricalPerformances>,
    AirInterfaceHistoricalPerformancesG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "air-interface-historical-performances").intern();


}

