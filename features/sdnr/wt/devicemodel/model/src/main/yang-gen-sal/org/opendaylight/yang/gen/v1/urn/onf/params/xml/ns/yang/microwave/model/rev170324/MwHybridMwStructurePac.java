package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureCurrentProblems;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureCurrentPerformance;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureStatus;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureCapability;

/**
 * The HybridMwStructure_Pac and its attached classes MUST be provided on 
 * management interfaces of microwave devices, which are transporting TDM and 
 * Ethernet traffic.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list mw-hybrid-mw-structure-pac {
 *     key "layer-protocol";
 *     leaf layer-protocol {
 *         type leafref;
 *     }
 *     container hybrid-mw-structure-capability {
 *         leaf structure-id {
 *             type universal-id;
 *         }
 *         list supported-tdm-structure-types-list {
 *             key "tdm-structure-name";
 *             leaf tdm-structure-name {
 *                 type tdm-structure-name;
 *             }
 *             leaf tdm-segment-size {
 *                 type tdm-segment-size;
 *             }
 *             leaf max-number-of-segments-reservable {
 *                 type max-number-of-segments-reservable;
 *             }
 *             uses tdm-structure-type-g;
 *         }
 *         leaf supported-alarms {
 *             type supported-alarms;
 *         }
 *         uses hybrid-mw-structure-capability-g;
 *     }
 *     container hybrid-mw-structure-configuration {
 *         container structure-type {
 *             leaf tdm-structure-name {
 *                 type tdm-structure-name;
 *             }
 *             leaf tdm-segment-size {
 *                 type tdm-segment-size;
 *             }
 *             leaf max-number-of-segments-reservable {
 *                 type max-number-of-segments-reservable;
 *             }
 *             uses tdm-structure-type-g;
 *         }
 *         leaf number-of-tdm-segments-to-be-reserved {
 *             type number-of-tdm-segments-to-be-reserved;
 *         }
 *         list problem-kind-severity-list {
 *             key "problem-kind-name";
 *             leaf problem-kind-name {
 *                 type problem-kind-name;
 *             }
 *             leaf problem-kind-severity {
 *                 type problem-kind-severity;
 *             }
 *             uses structure-problem-severity-type-g;
 *         }
 *         uses hybrid-mw-structure-configuration-g;
 *     }
 *     container hybrid-mw-structure-status {
 *         list segment-status-list {
 *             key "segment-status-type-id";
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
 *         uses hybrid-mw-structure-status-g;
 *     }
 *     container hybrid-mw-structure-current-problems {
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
 *         uses hybrid-mw-structure-current-problems-g;
 *     }
 *     container hybrid-mw-structure-current-performance {
 *         list current-performance-data-list {
 *             key "scanner-id";
 *             leaf performance-data {
 *                 type structure-performance-type;
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
 *         uses hybrid-mw-structure-current-performance-g;
 *     }
 *     container hybrid-mw-structure-historical-performances {
 *         list historical-performance-data-list {
 *             key "history-data-id";
 *             leaf performance-data {
 *                 type structure-performance-type;
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
 *         uses hybrid-mw-structure-historical-performances-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-hybrid-mw-structure-pac</i>
 *
 * <p>To create instances of this class use {@link MwHybridMwStructurePacBuilder}.
 * @see MwHybridMwStructurePacBuilder
 * @see MwHybridMwStructurePacKey
 *
 */
public interface MwHybridMwStructurePac
    extends
    ChildOf<MicrowaveModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePac>,
    Identifiable<MwHybridMwStructurePacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "mw-hybrid-mw-structure-pac").intern();

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
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureCapability</code> <code>hybridMwStructureCapability</code>, or <code>null</code> if not present
     */
    HybridMwStructureCapability getHybridMwStructureCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureConfiguration</code> <code>hybridMwStructureConfiguration</code>, or <code>null</code> if not present
     */
    HybridMwStructureConfiguration getHybridMwStructureConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureStatus</code> <code>hybridMwStructureStatus</code>, or <code>null</code> if not present
     */
    HybridMwStructureStatus getHybridMwStructureStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureCurrentProblems</code> <code>hybridMwStructureCurrentProblems</code>, or <code>null</code> if not present
     */
    HybridMwStructureCurrentProblems getHybridMwStructureCurrentProblems();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureCurrentPerformance</code> <code>hybridMwStructureCurrentPerformance</code>, or <code>null</code> if not present
     */
    HybridMwStructureCurrentPerformance getHybridMwStructureCurrentPerformance();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.hybrid.mw.structure.pac.HybridMwStructureHistoricalPerformances</code> <code>hybridMwStructureHistoricalPerformances</code>, or <code>null</code> if not present
     */
    HybridMwStructureHistoricalPerformances getHybridMwStructureHistoricalPerformances();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwHybridMwStructurePacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MwHybridMwStructurePacKey getKey();

}

