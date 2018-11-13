package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;

/**
 * This object contains parameters relating to SCTP as a transport protocol. SCTP 
 * is defined in {{bibref|RFC4960}} and {{bibref|RFC3873}}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping transport-sctp-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf hb-interval {
 *         type hb-interval;
 *     }
 *     leaf max-association-retransmits {
 *         type max-association-retransmits;
 *     }
 *     leaf max-init-retransmits {
 *         type max-init-retransmits;
 *     }
 *     leaf max-path-retransmits {
 *         type max-path-retransmits;
 *     }
 *     leaf rto-initial {
 *         type rto-initial;
 *     }
 *     leaf rto-max {
 *         type rto-max;
 *     }
 *     leaf rto-min {
 *         type rto-min;
 *     }
 *     leaf val-cookie-life {
 *         type val-cookie-life;
 *     }
 *     leaf out-of-blues {
 *         type uint64;
 *     }
 *     leaf checksum-errors {
 *         type uint64;
 *     }
 *     leaf out-ctrl-chunks {
 *         type uint64;
 *     }
 *     leaf out-order-chunks {
 *         type uint64;
 *     }
 *     leaf out-unorder-chunks {
 *         type uint64;
 *     }
 *     leaf in-ctrl-chunks {
 *         type uint64;
 *     }
 *     leaf in-order-chunks {
 *         type uint64;
 *     }
 *     leaf in-unorder-chunks {
 *         type uint64;
 *     }
 *     leaf frag-usr-msgs {
 *         type uint64;
 *     }
 *     leaf reasm-usr-msgs {
 *         type uint64;
 *     }
 *     leaf out-sctp-packs {
 *         type uint64;
 *     }
 *     leaf in-sctp-packs {
 *         type uint64;
 *     }
 *     leaf discontinuity {
 *         type date-and-time;
 *     }
 *     leaf assoc-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/transport-sctp-g</i>
 *
 */
public interface TransportSctpG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "transport-sctp-g").intern();

    /**
     * Enables or disables the whole SCTP object and allows the setup or release of 
     * SCTP associations and their related streams.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnable();
    
    /**
     * Heartbeat interval in {{units}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>hbInterval</code>, or <code>null</code> if not present
     */
    BigInteger getHbInterval();
    
    /**
     * Maximum number of consecutive retransmissions to a peer before an endpoint 
     * considers that the peer is unreachable and closes the association.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxAssociationRetransmits</code>, or <code>null</code> if not present
     */
    BigInteger getMaxAssociationRetransmits();
    
    /**
     * Number of retransmission per connection-attempt.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxInitRetransmits</code>, or <code>null</code> if not present
     */
    BigInteger getMaxInitRetransmits();
    
    /**
     * Maximum retransmission per destination address.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxPathRetransmits</code>, or <code>null</code> if not present
     */
    BigInteger getMaxPathRetransmits();
    
    /**
     * Initial value for Retransmit timeout in {{units}}. A retransmission time value 
     * of zero means immediate retransmission.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rtoInitial</code>, or <code>null</code> if not present
     */
    BigInteger getRtoInitial();
    
    /**
     * Maximum value for Retransmit timeout in {{units}}. A retransmission time value 
     * of zero means immediate retransmission.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rtoMax</code>, or <code>null</code> if not present
     */
    BigInteger getRtoMax();
    
    /**
     * Minimum value for Retransmit timeout in {{units}}. A retransmission time value 
     * of zero means immediate retransmission. The value of this parameter MUST be 
     * lower than or equal to {{param|RTOMax}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rtoMin</code>, or <code>null</code> if not present
     */
    BigInteger getRtoMin();
    
    /**
     * Valid cookie life in the 4-way start-up handshake procedure in {{units}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>valCookieLife</code>, or <code>null</code> if not present
     */
    BigInteger getValCookieLife();
    
    /**
     * The number of correctly formed SCTP packets, including the proper checksum, but 
     * for which the receiver was unable to identify an appropriate association.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>outOfBlues</code>, or <code>null</code> if not present
     */
    BigInteger getOutOfBlues();
    
    /**
     * The number of SCTP packets received with an invalid checksum.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>checksumErrors</code>, or <code>null</code> if not present
     */
    BigInteger getChecksumErrors();
    
    /**
     * The number of SCTP control chunks sent (retransmissions are not included).
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>outCtrlChunks</code>, or <code>null</code> if not present
     */
    BigInteger getOutCtrlChunks();
    
    /**
     * The number of SCTP ordered data chunks sent (retransmissions are not included).
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>outOrderChunks</code>, or <code>null</code> if not present
     */
    BigInteger getOutOrderChunks();
    
    /**
     * The number of SCTP unordered chunks (data chunks in which the U bit is set to 1)
     * sent (retransmissions are not included).
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>outUnorderChunks</code>, or <code>null</code> if not present
     */
    BigInteger getOutUnorderChunks();
    
    /**
     * The number of SCTP control chunks received (no duplicate chunks included).
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>inCtrlChunks</code>, or <code>null</code> if not present
     */
    BigInteger getInCtrlChunks();
    
    /**
     * The number of SCTP ordered data chunks received (no duplicate chunks included).
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>inOrderChunks</code>, or <code>null</code> if not present
     */
    BigInteger getInOrderChunks();
    
    /**
     * The number of SCTP unordered chunks (data chunks in which the U bit is set to 1)
     * received (no duplicate chunks included).
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>inUnorderChunks</code>, or <code>null</code> if not present
     */
    BigInteger getInUnorderChunks();
    
    /**
     * The number of user messages that have been sent fragmented.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>fragUsrMsgs</code>, or <code>null</code> if not present
     */
    BigInteger getFragUsrMsgs();
    
    /**
     * The number of user messages that have been received fragmented and submitted to 
     * the reassembly process.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>reasmUsrMsgs</code>, or <code>null</code> if not present
     */
    BigInteger getReasmUsrMsgs();
    
    /**
     * The number of SCTP packets sent. Retransmitted DATA chunks are included.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>outSctpPacks</code>, or <code>null</code> if not present
     */
    BigInteger getOutSctpPacks();
    
    /**
     * The number of SCTP packets received. Duplicates are included.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>inSctpPacks</code>, or <code>null</code> if not present
     */
    BigInteger getInSctpPacks();
    
    /**
     * The time of the last discontinuity.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>discontinuity</code>, or <code>null</code> if not present
     */
    DateAndTime getDiscontinuity();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>assocNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getAssocNumberOfEntries();

}

