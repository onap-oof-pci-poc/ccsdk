package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerCapability;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerCurrentPerformance;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerCurrentProblems;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerConfiguration;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerHistoricalPerformances;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerStatus;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * list mw-ethernet-container-pac {
 *     key "layer-protocol";
 *     leaf layer-protocol {
 *         type leafref;
 *     }
 *     container ethernet-container-capability {
 *         leaf bundling-is-avail {
 *             type bundling-is-avail;
 *         }
 *         leaf packet-compression-is-avail {
 *             type packet-compression-is-avail;
 *         }
 *         leaf layer2-compression-is-avail {
 *             type layer2-compression-is-avail;
 *         }
 *         leaf vlan-compression-is-avail {
 *             type vlan-compression-is-avail;
 *         }
 *         leaf q-in-q-compression-is-avail {
 *             type q-in-q-compression-is-avail;
 *         }
 *         leaf mpls-compression-is-avail {
 *             type mpls-compression-is-avail;
 *         }
 *         leaf ipv4-compression-is-avail {
 *             type ipv4-compression-is-avail;
 *         }
 *         leaf ipv6-compression-is-avail {
 *             type ipv6-compression-is-avail;
 *         }
 *         leaf layer4-compression-is-avail {
 *             type layer4-compression-is-avail;
 *         }
 *         leaf encryption-is-avail {
 *             type encryption-is-avail;
 *         }
 *         leaf supported-alarms {
 *             type supported-alarms;
 *         }
 *         uses ethernet-container-capability-g;
 *     }
 *     container ethernet-container-configuration {
 *         leaf container-id {
 *             type container-id;
 *         }
 *         list segments-id-list {
 *             key "structure-id-ref" "segment-id-ref";
 *             leaf structure-id-ref {
 *                 type universal-id;
 *             }
 *             leaf segment-id-ref {
 *                 type int16;
 *             }
 *             uses segment-id-type-g;
 *         }
 *         leaf packet-compression-is-on {
 *             type packet-compression-is-on;
 *         }
 *         leaf layer2-compression-is-on {
 *             type layer2-compression-is-on;
 *         }
 *         leaf vlan-compression-is-on {
 *             type vlan-compression-is-on;
 *         }
 *         leaf q-in-q-compression-is-on {
 *             type q-in-q-compression-is-on;
 *         }
 *         leaf mpls-compression-is-on {
 *             type mpls-compression-is-on;
 *         }
 *         leaf ipv4-compression-is-on {
 *             type ipv4-compression-is-on;
 *         }
 *         leaf ipv6-compression-is-on {
 *             type ipv6-compression-is-on;
 *         }
 *         leaf layer4-compression-is-on {
 *             type layer4-compression-is-on;
 *         }
 *         leaf encryption-is-on {
 *             type encryption-is-on;
 *         }
 *         leaf cryptographic-key {
 *             type cryptographic-key;
 *         }
 *         list problem-kind-severity-list {
 *             key "problem-kind-name";
 *             leaf problem-kind-name {
 *                 type problem-kind-name;
 *             }
 *             leaf problem-kind-severity {
 *                 type problem-kind-severity;
 *             }
 *             uses container-problem-severity-type-g;
 *         }
 *         uses ethernet-container-configuration-g;
 *     }
 *     container ethernet-container-status {
 *         leaf last-status-change {
 *             type last-status-change;
 *         }
 *         uses ethernet-container-status-g;
 *     }
 *     container ethernet-container-current-problems {
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
 *         uses ethernet-container-current-problems-g;
 *     }
 *     container ethernet-container-current-performance {
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
 *         uses ethernet-container-current-performance-g;
 *     }
 *     container ethernet-container-historical-performances {
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
 *         uses ethernet-container-historical-performances-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-ethernet-container-pac</i>
 *
 * <p>To create instances of this class use {@link MwEthernetContainerPacBuilder}.
 * @see MwEthernetContainerPacBuilder
 * @see MwEthernetContainerPacKey
 *
 */
public interface MwEthernetContainerPac
    extends
    ChildOf<MicrowaveModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwEthernetContainerPac>,
    Identifiable<MwEthernetContainerPacKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "mw-ethernet-container-pac").intern();

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
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerCapability</code> <code>ethernetContainerCapability</code>, or <code>null</code> if not present
     */
    EthernetContainerCapability getEthernetContainerCapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerConfiguration</code> <code>ethernetContainerConfiguration</code>, or <code>null</code> if not present
     */
    EthernetContainerConfiguration getEthernetContainerConfiguration();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerStatus</code> <code>ethernetContainerStatus</code>, or <code>null</code> if not present
     */
    EthernetContainerStatus getEthernetContainerStatus();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerCurrentProblems</code> <code>ethernetContainerCurrentProblems</code>, or <code>null</code> if not present
     */
    EthernetContainerCurrentProblems getEthernetContainerCurrentProblems();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerCurrentPerformance</code> <code>ethernetContainerCurrentPerformance</code>, or <code>null</code> if not present
     */
    EthernetContainerCurrentPerformance getEthernetContainerCurrentPerformance();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerHistoricalPerformances</code> <code>ethernetContainerHistoricalPerformances</code>, or <code>null</code> if not present
     */
    EthernetContainerHistoricalPerformances getEthernetContainerHistoricalPerformances();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwEthernetContainerPacKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MwEthernetContainerPacKey getKey();

}

