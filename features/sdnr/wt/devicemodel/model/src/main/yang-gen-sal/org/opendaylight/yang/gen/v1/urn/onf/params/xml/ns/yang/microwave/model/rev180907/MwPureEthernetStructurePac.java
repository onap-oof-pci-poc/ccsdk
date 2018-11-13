package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureCurrentPerformance;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureCurrentProblems;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureCapability;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureConfiguration;

/**
 * The pureEthernetStructure_Pac and its attached classes MUST be provided on 
 * management interfaces of microwave devices, which are transporting Ethernet 
 * traffic only.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list mw-pure-ethernet-structure-pac {
 *     key "layer-protocol";
 *     leaf layer-protocol {
 *         type leafref;
 *     }
 *     container pure-ethernet-structure-capability {
 *         leaf structure-id {
 *             type universal-id;
 *         }
 *         leaf-list supported-alarm-list {
 *             type string;
 *         }
 *         leaf supported-alarms {
 *             type supported-alarms;
 *             status DEPRECATED;
 *         }
 *         uses pure-ethernet-structure-capability-g;
 *     }
 *     container pure-ethernet-structure-configuration {
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
 *             uses structure-problem-severity-type-g;
 *         }
 *         uses pure-ethernet-structure-configuration-g;
 *     }
 *     container pure-ethernet-structure-status {
 *         container segment-status-list {
 *             leaf segment-status-type-id {
 *                 type int16;
 *             }
 *             leaf segment-is-reserved-for-tdm {
 *                 type segment-is-reserved-for-tdm;
 *             }
 *             leaf operational-status {
 *                 type operational-status;
 *             }
 *             leaf obsolete-priority-class {
 *                 type obsolete-priority-class;
 *             }
 *             leaf obsolete-drop-order-rank {
 *                 type obsolete-drop-order-rank;
 *             }
 *             uses segment-status-type-g;
 *         }
 *         leaf last-status-change {
 *             type last-status-change;
 *         }
 *         uses pure-ethernet-structure-status-g;
 *     }
 *     container pure-ethernet-structure-current-problems {
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
 *             uses structure-current-problem-type-g;
 *         }
 *         uses pure-ethernet-structure-current-problems-g;
 *     }
 *     container pure-ethernet-structure-current-performance {
 *         list current-performance-data-list {
 *             key "scanner-id";
 *             container performance-data {
 *                 leaf time-period {
 *                     type time-period;
 *                 }
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
 *                 leaf rx-level-min {
 *                     type rx-level-min;
 *                 }
 *                 leaf rx-level-max {
 *                     type rx-level-max;
 *                 }
 *                 leaf rx-level-avg {
 *                     type rx-level-avg;
 *                 }
 *                 uses structure-performance-type-g;
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
 *             uses structure-current-performance-type-g;
 *         }
 *         uses pure-ethernet-structure-current-performance-g;
 *     }
 *     container pure-ethernet-structure-historical-performances {
 *         list historical-performance-data-list {
 *             key "history-data-id";
 *             container performance-data {
 *                 leaf time-period {
 *                     type time-period;
 *                 }
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
 *                 leaf rx-level-min {
 *                     type rx-level-min;
 *                 }
 *                 leaf rx-level-max {
 *                     type rx-level-max;
 *                 }
 *                 leaf rx-level-avg {
 *                     type rx-level-avg;
 *                 }
 *                 uses structure-performance-type-g;
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
 *             uses structure-historical-performance-type-g;
 *         }
 *         uses pure-ethernet-structure-historical-performances-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-pure-ethernet-structure-pac</i>
 *
 * <p>To create instances of this class use {@link MwPureEthernetStructurePacBuilder}.
 * @see MwPureEthernetStructurePacBuilder
 * @see MwPureEthernetStructurePacKey
 *
 */
public interface MwPureEthernetStructurePac
    extends
    ChildOf<MicrowaveModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePac>,
    Identifiable<MwPureEthernetStructurePacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "mw-pure-ethernet-structure-pac").intern();

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
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureCapability</code> <code>pureEthernetStructureCapability</code>, or <code>null</code> if not present
     */
    PureEthernetStructureCapability getPureEthernetStructureCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureConfiguration</code> <code>pureEthernetStructureConfiguration</code>, or <code>null</code> if not present
     */
    PureEthernetStructureConfiguration getPureEthernetStructureConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureStatus</code> <code>pureEthernetStructureStatus</code>, or <code>null</code> if not present
     */
    PureEthernetStructureStatus getPureEthernetStructureStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureCurrentProblems</code> <code>pureEthernetStructureCurrentProblems</code>, or <code>null</code> if not present
     */
    PureEthernetStructureCurrentProblems getPureEthernetStructureCurrentProblems();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureCurrentPerformance</code> <code>pureEthernetStructureCurrentPerformance</code>, or <code>null</code> if not present
     */
    PureEthernetStructureCurrentPerformance getPureEthernetStructureCurrentPerformance();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.mw.pure.ethernet.structure.pac.PureEthernetStructureHistoricalPerformances</code> <code>pureEthernetStructureHistoricalPerformances</code>, or <code>null</code> if not present
     */
    PureEthernetStructureHistoricalPerformances getPureEthernetStructureHistoricalPerformances();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.MwPureEthernetStructurePacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MwPureEthernetStructurePacKey getKey();

}

