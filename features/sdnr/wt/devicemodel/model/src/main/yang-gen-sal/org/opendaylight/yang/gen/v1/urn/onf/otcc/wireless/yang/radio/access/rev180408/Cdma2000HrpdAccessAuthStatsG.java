package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object is used in obtaining the Access Authentication related stats.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-hrpd-access-auth-stats-g {
 *     leaf an-ppp-authentication-attempts-by-node {
 *         type uint64;
 *     }
 *     leaf a12-requests-sent-from-node {
 *         type uint64;
 *     }
 *     leaf a12-rejects-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-accepts-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-access-challenges-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-retransmits-sent-from-node {
 *         type uint64;
 *     }
 *     leaf a12-timeouts-events-for-node {
 *         type uint64;
 *     }
 *     leaf a12-malformedresponse-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-bad-authenticator-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-unknown-type-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-unknown-pkt-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-unknown-server-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-other-failure-occurences-in-node {
 *         type uint64;
 *     }
 *     leaf a12-by-pass-num-ats-with-unknown-mfr-code-by-node {
 *         type uint64;
 *     }
 *     leaf a12-tx-path-fail-due-to-an-ppp-error-by-node {
 *         type uint64;
 *     }
 *     leaf a12-tx-path-fail-due-to-no-server-available-by-node {
 *         type uint64;
 *     }
 *     leaf a12-tx-path-fail-due-to-internal-error-by-node {
 *         type uint64;
 *     }
 *     leaf a12-tx-path-fail-due-to-no-packet-id-available-by-node {
 *         type uint64;
 *     }
 *     leaf a12-tx-path-fail-due-to-transmit-error-by-node {
 *         type uint64;
 *     }
 *     leaf a12-svr-timeouts-for-node {
 *         type uint64;
 *     }
 *     leaf a12-enh-ta-bypass-lcp-timeout-by-node {
 *         type uint64;
 *     }
 *     leaf a12-enh-ta-bypass-chap-timeout-by-node {
 *         type uint64;
 *     }
 *     leaf a12-enh-ta-bypass-chap-invalid-by-node {
 *         type uint64;
 *     }
 *     leaf a12-enh-ta-bypass-chap-nai-matches-a12-bypass-list-by-node {
 *         type uint64;
 *     }
 *     leaf a12-session-ta-timeout-by-node {
 *         type uint64;
 *     }
 *     leaf access-auth-failed-due-to-session-close-total {
 *         type uint64;
 *     }
 *     leaf access-auth-succeeded {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-hrpd-access-auth-stats-g</i>
 *
 */
public interface Cdma2000HrpdAccessAuthStatsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-access-auth-stats-g").intern();

    /**
     * Number of AnPppAuthentications attempted by the FAP.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>anPppAuthenticationAttemptsByNode</code>, or <code>null</code> if not present
     */
    BigInteger getAnPppAuthenticationAttemptsByNode();
    
    /**
     * Number of A12 Access Requests Sent from the FAP.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12RequestsSentFromNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12RequestsSentFromNode();
    
    /**
     * Number of A12 Access Rejects received from the FAP.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12RejectsReceivedByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12RejectsReceivedByNode();
    
    /**
     * Number of A12 Access Accepts received by the FAP.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12AcceptsReceivedByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12AcceptsReceivedByNode();
    
    /**
     * Number of A12 Access Challenges received by the FAP.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12AccessChallengesReceivedByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12AccessChallengesReceivedByNode();
    
    /**
     * Number of A12 Access Requests retransmitted from the FAP.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12RetransmitsSentFromNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12RetransmitsSentFromNode();
    
    /**
     * Number of A12 Timeout events occurred at the FAP due to unreachability of the 
     * AAA server/ no response from the AAA server.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12TimeoutsEventsForNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12TimeoutsEventsForNode();
    
    /**
     * Number of Malformed A12 Access Response received by the FAP RNC.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12MalformedresponseReceivedByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12MalformedresponseReceivedByNode();
    
    /**
     * Number of A12 Access Response with Bad Authenticator received by the FAP RNC.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12BadAuthenticatorReceivedByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12BadAuthenticatorReceivedByNode();
    
    /**
     * Number of A12 Packet of unknown type received by the FAP RNC.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12UnknownTypeReceivedByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12UnknownTypeReceivedByNode();
    
    /**
     * Number of unknown A12 packets received by the FAP RNC.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12UnknownPktReceivedByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12UnknownPktReceivedByNode();
    
    /**
     * Number of A12 packets received from unknown AAA server by the FAP RNC.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12UnknownServerReceivedByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12UnknownServerReceivedByNode();
    
    /**
     * Number of A12 packets failed due to other failure occurences in the AAA server.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12OtherFailureOccurencesInNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12OtherFailureOccurencesInNode();
    
    /**
     * Number of ATs with UnknowMfrCode detected in the FAP RNC.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12ByPassNumAtsWithUnknownMfrCodeByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12ByPassNumAtsWithUnknownMfrCodeByNode();
    
    /**
     * Number of times sending of A12 packet failed in Tx Path in the FAP RNC due to 
     * "AnPPP Error".
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12TxPathFailDueToAnPppErrorByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12TxPathFailDueToAnPppErrorByNode();
    
    /**
     * Number of times sending of A12 packet failed in Tx Path in the FAP RNC due to 
     * "No Server Available".
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12TxPathFailDueToNoServerAvailableByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12TxPathFailDueToNoServerAvailableByNode();
    
    /**
     * Number of times sending of A12 packet failed in Tx Path in the FAP RNC due to 
     * "internal error".
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12TxPathFailDueToInternalErrorByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12TxPathFailDueToInternalErrorByNode();
    
    /**
     * Number of times sending of A12 packet failed in Tx Path in the FAP RNC due to 
     * "No packet id available".
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12TxPathFailDueToNoPacketIdAvailableByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12TxPathFailDueToNoPacketIdAvailableByNode();
    
    /**
     * Number of times sending of A12 packet failed in Tx Path in the FAP RNC due to 
     * "Transmit Error".
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12TxPathFailDueToTransmitErrorByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12TxPathFailDueToTransmitErrorByNode();
    
    /**
     * Number of A12 server timeouts happened in the FAP RNC.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12SvrTimeoutsForNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12SvrTimeoutsForNode();
    
    /**
     * Number of LCP timeouts happened in the FAP RNC when Enhanced TA A12Bypass mode 
     * is enabled.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12EnhTaBypassLcpTimeoutByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12EnhTaBypassLcpTimeoutByNode();
    
    /**
     * Number of CHAP timeouts happened in the FAP RNC when Enhanced TA A12Bypass mode 
     * is enabled.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12EnhTaBypassChapTimeoutByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12EnhTaBypassChapTimeoutByNode();
    
    /**
     * Number of CHAP Challenge response received from the AT when Enhanced TA 
     * A12Bypass mode is enabled.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12EnhTaBypassChapInvalidByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12EnhTaBypassChapInvalidByNode();
    
    /**
     * Number of times the CHAP NAI received from the AT matches with A12Bypass List in
     * the FAP RNC when Enhanced TA A12Bypass mode is enabled.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12EnhTaBypassChapNaiMatchesA12BypassListByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12EnhTaBypassChapNaiMatchesA12BypassListByNode();
    
    /**
     * Number of times Session timeouts occurred due to TA.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a12SessionTaTimeoutByNode</code>, or <code>null</code> if not present
     */
    BigInteger getA12SessionTaTimeoutByNode();
    
    /**
     * Number of times the Access Authenticaiton failed due to Sesion close.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>accessAuthFailedDueToSessionCloseTotal</code>, or <code>null</code> if not present
     */
    BigInteger getAccessAuthFailedDueToSessionCloseTotal();
    
    /**
     * Number of times the Access Authenticaiton succeeded.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>accessAuthSucceeded</code>, or <code>null</code> if not present
     */
    BigInteger getAccessAuthSucceeded();

}

