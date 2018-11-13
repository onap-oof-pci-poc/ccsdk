package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * Details on call control stats
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-hrpd-call-control-stats-g {
 *     leaf num-session-setup-attempts {
 *         type uint64;
 *     }
 *     leaf num-session-setup-successful {
 *         type uint64;
 *     }
 *     leaf num-current-sessions-established {
 *         type uint64;
 *     }
 *     leaf num-page-messages-to-at {
 *         type uint64;
 *     }
 *     leaf num-pages-succeeded {
 *         type uint64;
 *     }
 *     leaf num-connections-opened {
 *         type uint64;
 *     }
 *     leaf num-session-setups-failed-to-term-auth {
 *         type uint64;
 *     }
 *     leaf num-forward-rlp-bytes {
 *         type num-forward-rlp-bytes;
 *     }
 *     leaf num-reverse-rlp-bytes {
 *         type num-reverse-rlp-bytes;
 *     }
 *     leaf average-session-setup-time {
 *         type average-session-setup-time;
 *     }
 *     leaf average-page-setup-time {
 *         type uint64;
 *     }
 *     leaf num-conn-setups-aborted {
 *         type uint64;
 *     }
 *     leaf num-forward-pre-rlp-dropped-pkts {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-hrpd-call-control-stats-g</i>
 *
 */
public interface Cdma2000HrpdCallControlStatsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-call-control-stats-g").intern();

    /**
     * This parameter is a counter for the total number of session instances that are 
     * created on a specific FAP when a regular session setup attempt is initiated with
     * an unknown RATI
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numSessionSetupAttempts</code>, or <code>null</code> if not present
     */
    BigInteger getNumSessionSetupAttempts();
    
    /**
     * This parameter is a counter for the total number of successful regular session 
     * setup attempts that are initiated with an unknown RATI
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numSessionSetupSuccessful</code>, or <code>null</code> if not present
     */
    BigInteger getNumSessionSetupSuccessful();
    
    /**
     * This parameter is a counter for the total number of successfully established 
     * HRPD Sessions that exists on a specific picasso
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numCurrentSessionsEstablished</code>, or <code>null</code> if not present
     */
    BigInteger getNumCurrentSessionsEstablished();
    
    /**
     * The number of times a Page Message was sent to the AT to facilitate the setup of
     * a connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numPageMessagesToAt</code>, or <code>null</code> if not present
     */
    BigInteger getNumPageMessagesToAt();
    
    /**
     * The total number of pages succeeded
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numPagesSucceeded</code>, or <code>null</code> if not present
     */
    BigInteger getNumPagesSucceeded();
    
    /**
     * Total HRPD Connections Opened
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numConnectionsOpened</code>, or <code>null</code> if not present
     */
    BigInteger getNumConnectionsOpened();
    
    /**
     * This parameter is a counter for the total number of HRPD session setups that are
     * aborted due to various failure reasons
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numSessionSetupsFailedToTermAuth</code>, or <code>null</code> if not present
     */
    BigInteger getNumSessionSetupsFailedToTermAuth();
    
    /**
     * Number of HRPD packets(bytes) sent from PDSN to AT.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numForwardRlpBytes</code>, or <code>null</code> if not present
     */
    BigInteger getNumForwardRlpBytes();
    
    /**
     * No. of HRPD packets(bytes) sent from AT to PDSN.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numReverseRlpBytes</code>, or <code>null</code> if not present
     */
    BigInteger getNumReverseRlpBytes();
    
    /**
     * This parameter maintains a record of the average session setup time for all 
     * successfully setup sessions on a specific FAP. The average session setup time is
     * in units of {{units}}.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>averageSessionSetupTime</code>, or <code>null</code> if not present
     */
    BigInteger getAverageSessionSetupTime();
    
    /**
     * The average connection setup time in response to a FAP initiated page. The time 
     * is from initiation of Page to the time the connection is declared open
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>averagePageSetupTime</code>, or <code>null</code> if not present
     */
    BigInteger getAveragePageSetupTime();
    
    /**
     * The number of connection setups that were aborted
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numConnSetupsAborted</code>, or <code>null</code> if not present
     */
    BigInteger getNumConnSetupsAborted();
    
    /**
     * Number of packets dropped at Pre-RLP queue due to overflow in forward direction.
     * This counter will also be written to the performance log.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numForwardPreRlpDroppedPkts</code>, or <code>null</code> if not present
     */
    BigInteger getNumForwardPreRlpDroppedPkts();

}

