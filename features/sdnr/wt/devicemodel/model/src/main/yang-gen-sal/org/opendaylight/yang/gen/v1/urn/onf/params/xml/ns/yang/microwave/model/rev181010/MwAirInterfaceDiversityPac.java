package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCurrentProblems;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityStatus;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCurrentPerformance;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityHistoricalPerformances;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list mw-air-interface-diversity-pac {
 *     key "layer-protocol";
 *     leaf layer-protocol {
 *         type leafref;
 *     }
 *     container air-interface-diversity-capability {
 *         list available-kinds-of-diversity {
 *             key "diversity-name";
 *             leaf diversity-name {
 *                 type string;
 *             }
 *             leaf number-of-air-interfaces-max {
 *                 type number-of-air-interfaces-max;
 *             }
 *             uses diversity-type-g;
 *         }
 *         leaf-list supported-alarm-list {
 *             type string;
 *         }
 *         leaf supported-alarms {
 *             type supported-alarms;
 *             status DEPRECATED;
 *         }
 *         uses air-interface-diversity-capability-g;
 *     }
 *     container air-interface-diversity-configuration {
 *         container air-interface-diversity {
 *             leaf diversity-name {
 *                 type string;
 *             }
 *             leaf number-of-air-interfaces-max {
 *                 type number-of-air-interfaces-max;
 *             }
 *             uses diversity-type-g;
 *         }
 *         leaf-list air-interface-ltp-list {
 *             type leafref;
 *         }
 *         leaf performance-monitoring-collection-is-on {
 *             type performance-monitoring-collection-is-on;
 *         }
 *         list threshold-cross-alarm-list {
 *             key "g826-value-kind" "granularity-period";
 *             leaf g826-value-kind {
 *                 type g826-type;
 *             }
 *             leaf granularity-period {
 *                 type granularity-period-type;
 *             }
 *             leaf alarm-raising-threshold {
 *                 type alarm-raising-threshold;
 *             }
 *             leaf alarm-clearing-threshold {
 *                 type alarm-clearing-threshold;
 *             }
 *             uses threshold-cross-alarm-type-g;
 *         }
 *         list problem-kind-severity-list {
 *             key "problem-kind-name";
 *             leaf problem-kind-name {
 *                 type string;
 *             }
 *             leaf problem-kind-severity {
 *                 type problem-kind-severity;
 *             }
 *             uses air-interface-diversity-problem-severity-type-g;
 *         }
 *         uses air-interface-diversity-configuration-g;
 *     }
 *     container air-interface-diversity-status {
 *         leaf snir-cur {
 *             type snir-cur;
 *         }
 *         leaf air-interface-diversity-status {
 *             type air-interface-diversity-status;
 *         }
 *         leaf last-status-change {
 *             type last-status-change;
 *         }
 *         uses air-interface-diversity-status-g;
 *     }
 *     container air-interface-diversity-current-problems {
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
 *             uses air-interface-diversity-current-problem-type-g;
 *         }
 *         uses air-interface-diversity-current-problems-g;
 *     }
 *     container air-interface-diversity-current-performance {
 *         list current-performance-data-list {
 *             key "scanner-id";
 *             container performance-data {
 *                 leaf snir-min {
 *                     type snir-min;
 *                 }
 *                 leaf snir-max {
 *                     type snir-max;
 *                 }
 *                 leaf snir-avg {
 *                     type snir-avg;
 *                 }
 *                 uses air-interface-diversity-performance-type-g;
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
 *             uses air-interface-diversity-current-performance-type-g;
 *         }
 *         uses air-interface-diversity-current-performance-g;
 *     }
 *     container air-interface-diversity-historical-performances {
 *         list historical-performance-data-list {
 *             key "history-data-id";
 *             container performance-data {
 *                 leaf snir-min {
 *                     type snir-min;
 *                 }
 *                 leaf snir-max {
 *                     type snir-max;
 *                 }
 *                 leaf snir-avg {
 *                     type snir-avg;
 *                 }
 *                 uses air-interface-diversity-performance-type-g;
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
 *             uses air-interface-diversity-historical-performance-type-g;
 *         }
 *         uses air-interface-diversity-historical-performances-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-air-interface-diversity-pac</i>
 *
 * <p>To create instances of this class use {@link MwAirInterfaceDiversityPacBuilder}.
 * @see MwAirInterfaceDiversityPacBuilder
 * @see MwAirInterfaceDiversityPacKey
 *
 */
public interface MwAirInterfaceDiversityPac
    extends
    ChildOf<MicrowaveModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwAirInterfaceDiversityPac>,
    Identifiable<MwAirInterfaceDiversityPacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "mw-air-interface-diversity-pac").intern();

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
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCapability</code> <code>airInterfaceDiversityCapability</code>, or <code>null</code> if not present
     */
    AirInterfaceDiversityCapability getAirInterfaceDiversityCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityConfiguration</code> <code>airInterfaceDiversityConfiguration</code>, or <code>null</code> if not present
     */
    AirInterfaceDiversityConfiguration getAirInterfaceDiversityConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityStatus</code> <code>airInterfaceDiversityStatus</code>, or <code>null</code> if not present
     */
    AirInterfaceDiversityStatus getAirInterfaceDiversityStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCurrentProblems</code> <code>airInterfaceDiversityCurrentProblems</code>, or <code>null</code> if not present
     */
    AirInterfaceDiversityCurrentProblems getAirInterfaceDiversityCurrentProblems();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityCurrentPerformance</code> <code>airInterfaceDiversityCurrentPerformance</code>, or <code>null</code> if not present
     */
    AirInterfaceDiversityCurrentPerformance getAirInterfaceDiversityCurrentPerformance();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.diversity.pac.AirInterfaceDiversityHistoricalPerformances</code> <code>airInterfaceDiversityHistoricalPerformances</code>, or <code>null</code> if not present
     */
    AirInterfaceDiversityHistoricalPerformances getAirInterfaceDiversityHistoricalPerformances();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwAirInterfaceDiversityPacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MwAirInterfaceDiversityPacKey getKey();

}

