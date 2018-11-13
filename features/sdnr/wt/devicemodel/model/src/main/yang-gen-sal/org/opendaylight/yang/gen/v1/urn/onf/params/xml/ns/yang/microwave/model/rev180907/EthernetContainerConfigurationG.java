package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ethernet.container.configuration.g.ProblemKindSeverityList;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.ethernet.container.configuration.g.SegmentsIdList;
import java.util.List;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping ethernet-container-configuration-g {
 *     leaf container-id {
 *         type container-id;
 *     }
 *     list segments-id-list {
 *         key "structure-id-ref" "segment-id-ref";
 *         leaf structure-id-ref {
 *             type universal-id;
 *         }
 *         leaf segment-id-ref {
 *             type int16;
 *         }
 *         uses segment-id-type-g;
 *     }
 *     leaf packet-compression-is-on {
 *         type packet-compression-is-on;
 *     }
 *     leaf layer2-compression-is-on {
 *         type layer2-compression-is-on;
 *     }
 *     leaf vlan-compression-is-on {
 *         type vlan-compression-is-on;
 *     }
 *     leaf q-in-q-compression-is-on {
 *         type q-in-q-compression-is-on;
 *     }
 *     leaf mpls-compression-is-on {
 *         type mpls-compression-is-on;
 *     }
 *     leaf ipv4-compression-is-on {
 *         type ipv4-compression-is-on;
 *     }
 *     leaf ipv6-compression-is-on {
 *         type ipv6-compression-is-on;
 *     }
 *     leaf layer4-compression-is-on {
 *         type layer4-compression-is-on;
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
 *     list problem-kind-severity-list {
 *         key "problem-kind-name";
 *         leaf problem-kind-name {
 *             type string;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *         uses container-problem-severity-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/ethernet-container-configuration-g</i>
 *
 */
public interface EthernetContainerConfigurationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "ethernet-container-configuration-g").intern();

    /**
     * ContainterID in Netconf must be the same as EthernetPortID in OpenFlow so a 
     * connection can be made between the two items, which separately exist in the 
     * controller.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>containerId</code>, or <code>null</code> if not present
     */
    java.lang.String getContainerId();
    
    /**
     * Lists the segments used for transporting this Ethernet container. In case 
     * EthernetContainer::ContainerCapability::bundlingIsAvail==0, all 
     * TypeDefinitions::segmentIdType::structureId must be identical in the list.
     *
     *
     *
     * @return <code>java.util.List</code> <code>segmentsIdList</code>, or <code>null</code> if not present
     */
    List<SegmentsIdList> getSegmentsIdList();
    
    /**
     * In case packet compression is activated, but no type is activated, it is assumed
     * that the device chooses the optimum.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>packetCompressionIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPacketCompressionIsOn();
    
    /**
     * Packet compression on layer 2 configured at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>layer2CompressionIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLayer2CompressionIsOn();
    
    /**
     * Packet compression on VLAN layer configured at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>vlanCompressionIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isVlanCompressionIsOn();
    
    /**
     * Packet compression on layer of a second VLAN configured at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>qInQCompressionIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isQInQCompressionIsOn();
    
    /**
     * Packet compression on MPLS layer configured at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mplsCompressionIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMplsCompressionIsOn();
    
    /**
     * Packet compression on layer 3 for IPv4 configured at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>ipv4CompressionIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIpv4CompressionIsOn();
    
    /**
     * Packet compression on layer 3 for IPv6 configured at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>ipv6CompressionIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIpv6CompressionIsOn();
    
    /**
     * Packet compression on layer 4 (TCP and UDP header) configured at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>layer4CompressionIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLayer4CompressionIsOn();
    
    /**
     * Activates encryption of the Ethernet payload.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>encryptionIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEncryptionIsOn();
    
    /**
     * Key for transforming plaintext into cipher text data.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cryptographicKey</code>, or <code>null</code> if not present
     */
    java.lang.String getCryptographicKey();
    
    /**
     * Enables measurement, collection, storage and access to performance data.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>performanceMonitoringCollectionIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPerformanceMonitoringCollectionIsOn();
    
    /**
     * Severity of the problem to be configured.
     *
     *
     *
     * @return <code>java.util.List</code> <code>problemKindSeverityList</code>, or <code>null</code> if not present
     */
    List<ProblemKindSeverityList> getProblemKindSeverityList();

}

