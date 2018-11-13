package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping ethernet-container-capability-g {
 *     leaf bundling-is-avail {
 *         type bundling-is-avail;
 *     }
 *     leaf packet-compression-is-avail {
 *         type packet-compression-is-avail;
 *     }
 *     leaf layer2-compression-is-avail {
 *         type layer2-compression-is-avail;
 *     }
 *     leaf vlan-compression-is-avail {
 *         type vlan-compression-is-avail;
 *     }
 *     leaf q-in-q-compression-is-avail {
 *         type q-in-q-compression-is-avail;
 *     }
 *     leaf mpls-compression-is-avail {
 *         type mpls-compression-is-avail;
 *     }
 *     leaf ipv4-compression-is-avail {
 *         type ipv4-compression-is-avail;
 *     }
 *     leaf ipv6-compression-is-avail {
 *         type ipv6-compression-is-avail;
 *     }
 *     leaf layer4-compression-is-avail {
 *         type layer4-compression-is-avail;
 *     }
 *     leaf encryption-is-avail {
 *         type encryption-is-avail;
 *     }
 *     leaf supported-alarms {
 *         type supported-alarms;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/ethernet-container-capability-g</i>
 *
 */
public interface EthernetContainerCapabilityG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "ethernet-container-capability-g").intern();

    /**
     * This attribute has to be set on 'true', if the device allows combining resources
     * from several air interfaces for transporting this Ethernet container.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>bundlingIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isBundlingIsAvail();
    
    /**
     * In case packet compression can be activated, but not configured to a certain 
     * type, packetCompressionAvail shall be set on 'true', but none of the compression
     * level specific booleans.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>packetCompressionIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPacketCompressionIsAvail();
    
    /**
     * Packet compression on layer 2 available at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>layer2CompressionIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLayer2CompressionIsAvail();
    
    /**
     * Packet compression on VLAN layer available at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>vlanCompressionIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isVlanCompressionIsAvail();
    
    /**
     * Packet compression on layer of a second VLAN available at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>qInQCompressionIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isQInQCompressionIsAvail();
    
    /**
     * Packet compression on mpls layer available at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mplsCompressionIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMplsCompressionIsAvail();
    
    /**
     * Packet compression on layer 3 for IPv4 available at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>ipv4CompressionIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIpv4CompressionIsAvail();
    
    /**
     * Packet compression on layer 3 for IPv6 available at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>ipv6CompressionIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIpv6CompressionIsAvail();
    
    /**
     * Packet compression on layer 4 (TCP and UDP header) available at the device.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>layer4CompressionIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLayer4CompressionIsAvail();
    
    /**
     * Shall be marked 'true', if Ethernet payload encryption is available.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>encryptionIsAvail</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEncryptionIsAvail();
    
    /**
     * Available alarms to be listed. Mandatory:'framingIsFaulty' and 
     * 'containerIsDown'. Further alarms might be added by the device.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>supportedAlarms</code>, or <code>null</code> if not present
     */
    java.lang.String getSupportedAlarms();

}

