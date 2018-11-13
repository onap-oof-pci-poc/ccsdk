package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerHistoricalPerformances;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerCurrentProblems;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerCurrentPerformance;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerCapability;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerConfiguration;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * The TdmContainer_Pac and its attached classes MUST be provided on management 
 * interfaces of microwave devices, which are transporting TDM traffic.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list mw-tdm-container-pac {
 *     key "layer-protocol";
 *     leaf layer-protocol {
 *         type leafref;
 *     }
 *     container tdm-container-capability {
 *         list supported-tdm-container-types-list {
 *             key "tdm-container-name";
 *             leaf tdm-container-name {
 *                 type string;
 *             }
 *             leaf tdm-container-size {
 *                 type tdm-container-size;
 *             }
 *             uses tdm-container-type-g;
 *         }
 *         leaf-list supported-alarm-list {
 *             type string;
 *         }
 *         leaf supported-alarms {
 *             type supported-alarms;
 *             status DEPRECATED;
 *         }
 *         uses tdm-container-capability-g;
 *     }
 *     container tdm-container-configuration {
 *         leaf container-id {
 *             type container-id;
 *         }
 *         container container-type {
 *             leaf tdm-container-name {
 *                 type string;
 *             }
 *             leaf tdm-container-size {
 *                 type tdm-container-size;
 *             }
 *             uses tdm-container-type-g;
 *         }
 *         container segment-id {
 *             leaf structure-id-ref {
 *                 type universal-id;
 *             }
 *             leaf segment-id-ref {
 *                 type int16;
 *             }
 *             uses segment-id-type-g;
 *         }
 *         leaf performance-monitoring-collection-is-on {
 *             type performance-monitoring-collection-is-on;
 *         }
 *         list problem-kind-severity-list {
 *             key "problem-kind-name";
 *             leaf problem-kind-name {
 *                 type string;
 *             }
 *             leaf problem-kind-severity {
 *                 type problem-kind-severity;
 *             }
 *             uses container-problem-severity-type-g;
 *         }
 *         uses tdm-container-configuration-g;
 *     }
 *     container tdm-container-status {
 *         leaf last-status-change {
 *             type last-status-change;
 *         }
 *         uses tdm-container-status-g;
 *     }
 *     container tdm-container-current-problems {
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
 *             uses container-current-problem-type-g;
 *         }
 *         uses tdm-container-current-problems-g;
 *     }
 *     container tdm-container-current-performance {
 *         list current-performance-data-list {
 *             key "scanner-id";
 *             container performance-data {
 *                 leaf tx-ethernet-bytes-max-s {
 *                     type tx-ethernet-bytes-max-s;
 *                 }
 *                 leaf tx-ethernet-bytes-max-m {
 *                     type tx-ethernet-bytes-max-m;
 *                 }
 *                 leaf tx-ethernet-bytes-sum {
 *                     type tx-ethernet-bytes-sum;
 *                 }
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 uses container-performance-type-g;
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
 *             uses container-current-performance-type-g;
 *         }
 *         uses tdm-container-current-performance-g;
 *     }
 *     container tdm-container-historical-performances {
 *         list historical-performance-data-list {
 *             key "history-data-id";
 *             container performance-data {
 *                 leaf tx-ethernet-bytes-max-s {
 *                     type tx-ethernet-bytes-max-s;
 *                 }
 *                 leaf tx-ethernet-bytes-max-m {
 *                     type tx-ethernet-bytes-max-m;
 *                 }
 *                 leaf tx-ethernet-bytes-sum {
 *                     type tx-ethernet-bytes-sum;
 *                 }
 *                 leaf time-period {
 *                     type time-period;
 *                 }
 *                 uses container-performance-type-g;
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
 *             uses container-historical-performance-type-g;
 *         }
 *         uses tdm-container-historical-performances-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-tdm-container-pac</i>
 *
 * <p>To create instances of this class use {@link MwTdmContainerPacBuilder}.
 * @see MwTdmContainerPacBuilder
 * @see MwTdmContainerPacKey
 *
 */
public interface MwTdmContainerPac
    extends
    ChildOf<MicrowaveModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwTdmContainerPac>,
    Identifiable<MwTdmContainerPacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "mw-tdm-container-pac").intern();

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
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerCapability</code> <code>tdmContainerCapability</code>, or <code>null</code> if not present
     */
    TdmContainerCapability getTdmContainerCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerConfiguration</code> <code>tdmContainerConfiguration</code>, or <code>null</code> if not present
     */
    TdmContainerConfiguration getTdmContainerConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerStatus</code> <code>tdmContainerStatus</code>, or <code>null</code> if not present
     */
    TdmContainerStatus getTdmContainerStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerCurrentProblems</code> <code>tdmContainerCurrentProblems</code>, or <code>null</code> if not present
     */
    TdmContainerCurrentProblems getTdmContainerCurrentProblems();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerCurrentPerformance</code> <code>tdmContainerCurrentPerformance</code>, or <code>null</code> if not present
     */
    TdmContainerCurrentPerformance getTdmContainerCurrentPerformance();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.tdm.container.pac.TdmContainerHistoricalPerformances</code> <code>tdmContainerHistoricalPerformances</code>, or <code>null</code> if not present
     */
    TdmContainerHistoricalPerformances getTdmContainerHistoricalPerformances();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwTdmContainerPacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MwTdmContainerPacKey getKey();

}

