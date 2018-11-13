package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.port.ds.entry.PortIdentity;

/**
 * Collection of members of the port data set.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * grouping port-ds-entry {
 *     container port-identity {
 *         leaf clock-identity {
 *             type clock-identity-type;
 *         }
 *         leaf port-number {
 *             type uint16;
 *         }
 *         uses port-identity-grouping;
 *     }
 *     leaf port-state {
 *         type port-state;
 *     }
 *     leaf log-min-delay-req-interval {
 *         type int8;
 *     }
 *     leaf peer-mean-path-delay {
 *         type peer-mean-path-delay;
 *     }
 *     leaf log-announce-interval {
 *         type int8;
 *     }
 *     leaf announce-receipt-timeout {
 *         type uint8;
 *     }
 *     leaf log-sync-interval {
 *         type int8;
 *     }
 *     leaf delay-mechanism {
 *         type delay-mechanism-enumeration;
 *     }
 *     leaf log-min-pdelay-req-interval {
 *         type int8;
 *     }
 *     leaf version-number {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/port-ds-entry</i>
 *
 */
public interface PortDsEntry
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "port-ds-entry").intern();

    /**
     * The portIdentity attribute of the local port.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.port.ds.entry.PortIdentity</code> <code>portIdentity</code>, or <code>null</code> if not present
     */
    PortIdentity getPortIdentity();
    
    /**
     * Current state associated with the port.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.PortStateEnumeration</code> <code>portState</code>, or <code>null</code> if not present
     */
    PortStateEnumeration getPortState();
    
    /**
     * The base-two logarithm of the minDelayReqInterval(the minimum permitted mean 
     * time interval betweensuccessive Delay_Req messages).
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>logMinDelayReqInterval</code>, or <code>null</code> if not present
     */
    java.lang.Byte getLogMinDelayReqInterval();
    
    /**
     * An estimate of the current one-way propagation delayon the link when the 
     * delayMechanism is P2P; otherwise,it is zero.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimeIntervalType</code> <code>peerMeanPathDelay</code>, or <code>null</code> if not present
     */
    TimeIntervalType getPeerMeanPathDelay();
    
    /**
     * The base-two logarithm of the meanannounceInterval (mean time interval 
     * betweensuccessive Announce messages).
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>logAnnounceInterval</code>, or <code>null</code> if not present
     */
    java.lang.Byte getLogAnnounceInterval();
    
    /**
     * The number of announceInterval that have to passwithout receipt of an Announce 
     * message before theoccurrence of the event ANNOUNCE_RECEIPT_TIMEOUT_EXPIRES.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>announceReceiptTimeout</code>, or <code>null</code> if not present
     */
    java.lang.Short getAnnounceReceiptTimeout();
    
    /**
     * The base-two logarithm of the mean SyncIntervalfor multicast messages. The rates
     * for unicasttransmissions are negotiated separately on a per portbasis and are 
     * not constrained by this attribute.
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>logSyncInterval</code>, or <code>null</code> if not present
     */
    java.lang.Byte getLogSyncInterval();
    
    /**
     * The propagation delay measuring option used by theport in computing 
     * meanPathDelay.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.DelayMechanismEnumeration</code> <code>delayMechanism</code>, or <code>null</code> if not present
     */
    DelayMechanismEnumeration getDelayMechanism();
    
    /**
     * The base-two logarithm of theminPdelayReqInterval (minimum permitted mean 
     * timeinterval between successive Pdelay_Req messages).
     *
     *
     *
     * @return <code>java.lang.Byte</code> <code>logMinPdelayReqInterval</code>, or <code>null</code> if not present
     */
    java.lang.Byte getLogMinPdelayReqInterval();
    
    /**
     * The PTP version in use on the port.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>versionNumber</code>, or <code>null</code> if not present
     */
    java.lang.Short getVersionNumber();

}

