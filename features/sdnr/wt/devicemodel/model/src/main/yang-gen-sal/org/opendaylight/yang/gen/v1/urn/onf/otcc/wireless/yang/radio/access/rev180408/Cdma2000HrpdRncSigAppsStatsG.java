package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * Stats for HRPD RNC signaling procedures.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-hrpd-rnc-sig-apps-stats-g {
 *     leaf c-num-page-requests {
 *         type uint64;
 *     }
 *     leaf s-num-page-requests {
 *         type uint64;
 *     }
 *     leaf s-num-connection-setup-attempts {
 *         type uint64;
 *     }
 *     leaf c-num-connection-setup-attempts {
 *         type uint64;
 *     }
 *     leaf s-num-connection-setup-success {
 *         type uint64;
 *     }
 *     leaf c-num-connection-setup-success {
 *         type uint64;
 *     }
 *     leaf s-num-normal-connection-closes {
 *         type uint64;
 *     }
 *     leaf c-num-normal-connection-closes {
 *         type uint64;
 *     }
 *     leaf s-num-total-connection-closes {
 *         type uint64;
 *     }
 *     leaf c-num-total-connection-closes {
 *         type uint64;
 *     }
 *     leaf s-num-rf-related-drops {
 *         type uint64;
 *     }
 *     leaf c-num-rf-related-drops {
 *         type uint64;
 *     }
 *     leaf s-num-page-responses {
 *         type uint64;
 *     }
 *     leaf c-num-page-responses {
 *         type uint64;
 *     }
 *     leaf s-num-rf-related-drops-rtc-lost {
 *         type uint64;
 *     }
 *     leaf c-num-rf-related-drops-rtc-lost {
 *         type uint64;
 *     }
 *     leaf s-num-rf-related-drops-no-ftc {
 *         type uint64;
 *     }
 *     leaf c-num-rf-related-drops-no-ftc {
 *         type uint64;
 *     }
 *     leaf s-num-network-error-drops {
 *         type uint64;
 *     }
 *     leaf c-num-network-error-drops {
 *         type uint64;
 *     }
 *     leaf s-num-network-error-drops-rnc-internal {
 *         type uint64;
 *     }
 *     leaf c-num-network-error-drops-rnc-internal {
 *         type uint64;
 *     }
 *     leaf s-num-network-error-drops-rnc-external {
 *         type uint64;
 *     }
 *     leaf c-num-network-error-drops-rnc-external {
 *         type uint64;
 *     }
 *     leaf s-num-network-error-drops-a10-setup-fail {
 *         type uint64;
 *     }
 *     leaf c-num-network-error-drops-a10-setup-fail {
 *         type uint64;
 *     }
 *     leaf s-num-misc-drops-sector-down {
 *         type uint64;
 *     }
 *     leaf c-num-misc-drops-sector-down {
 *         type uint64;
 *     }
 *     leaf s-num-misc-drops-internal-error {
 *         type uint64;
 *     }
 *     leaf c-num-misc-drops-internal-error {
 *         type uint64;
 *     }
 *     leaf c-num-misc-drops-state-mismatch {
 *         type uint64;
 *     }
 *     leaf s-num-misc-drops-state-mismatch {
 *         type uint64;
 *     }
 *     leaf s-num-misc-drops-due-to-rlp {
 *         type uint64;
 *     }
 *     leaf c-num-misc-drops-due-to-rlp {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-hrpd-rnc-sig-apps-stats-g</i>
 *
 */
public interface Cdma2000HrpdRncSigAppsStatsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-rnc-sig-apps-stats-g").intern();

    /**
     * Number of HRPD Page requests made after data has flowed on the A10 connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumPageRequests</code>, or <code>null</code> if not present
     */
    BigInteger getCNumPageRequests();
    
    /**
     * Number of HRPD Page requests made before data has flowed on the A10 connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumPageRequests</code>, or <code>null</code> if not present
     */
    BigInteger getSNumPageRequests();
    
    /**
     * Number of HRPD Connection setups attempted before data has flowed on the A10 
     * connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumConnectionSetupAttempts</code>, or <code>null</code> if not present
     */
    BigInteger getSNumConnectionSetupAttempts();
    
    /**
     * Number of HRPD Connection setups attempted after data has flowed on the A10 
     * connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumConnectionSetupAttempts</code>, or <code>null</code> if not present
     */
    BigInteger getCNumConnectionSetupAttempts();
    
    /**
     * Number of HRPD Connection setups succeeded before data has flowed on the A10 
     * connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumConnectionSetupSuccess</code>, or <code>null</code> if not present
     */
    BigInteger getSNumConnectionSetupSuccess();
    
    /**
     * Number of HRPD Connection setups succeeded after data has flowed on the A10 
     * connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumConnectionSetupSuccess</code>, or <code>null</code> if not present
     */
    BigInteger getCNumConnectionSetupSuccess();
    
    /**
     * The number of HRPD connections that were closed normally before data has flowed 
     * on the A10 connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumNormalConnectionCloses</code>, or <code>null</code> if not present
     */
    BigInteger getSNumNormalConnectionCloses();
    
    /**
     * The number of HRPD connections that were closed normally after data has flowed 
     * on the A10 connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumNormalConnectionCloses</code>, or <code>null</code> if not present
     */
    BigInteger getCNumNormalConnectionCloses();
    
    /**
     * The total number of HRPD connections closed, normally or abnormally, data has 
     * flowed on the A10 connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumTotalConnectionCloses</code>, or <code>null</code> if not present
     */
    BigInteger getSNumTotalConnectionCloses();
    
    /**
     * The total number of HRPD connections closed, normally or abnormally, after data 
     * has flowed on the A10 connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumTotalConnectionCloses</code>, or <code>null</code> if not present
     */
    BigInteger getCNumTotalConnectionCloses();
    
    /**
     * Number of HRPD connection close because of RTC loss or No FTC before data has 
     * flowed on the A10 connection
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumRfRelatedDrops</code>, or <code>null</code> if not present
     */
    BigInteger getSNumRfRelatedDrops();
    
    /**
     * Number of HRPD connection close because of RTC loss or No FTC after data has 
     * flowed on the A10 connection
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumRfRelatedDrops</code>, or <code>null</code> if not present
     */
    BigInteger getCNumRfRelatedDrops();
    
    /**
     * Total number of successful responses to HRPD page requests that were received 
     * from the AT before the final page timeout and before data has flowed on the A10 
     * connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumPageResponses</code>, or <code>null</code> if not present
     */
    BigInteger getSNumPageResponses();
    
    /**
     * Total number of successful responses to HRPD page requests that were received 
     * from the AT before the final page timeout and after data has flowed on the A10 
     * connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumPageResponses</code>, or <code>null</code> if not present
     */
    BigInteger getCNumPageResponses();
    
    /**
     * This statistic counts the number of times the HRPD connection was dropped before
     * data has flowed on the A10 connection because a Reverse Traffic Channel (RTC) 
     * lost indication was received, and as a result, no reverse link for the 
     * connection were available.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumRfRelatedDropsRtcLost</code>, or <code>null</code> if not present
     */
    BigInteger getSNumRfRelatedDropsRtcLost();
    
    /**
     * This statistic counts the number of times the HRPD connection was dropped after 
     * data has flowed on the A10 connection because a Reverse Traffic Channel (RTC) 
     * lost indication was received, and as a result, no reverse link for the 
     * connection were available.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumRfRelatedDropsRtcLost</code>, or <code>null</code> if not present
     */
    BigInteger getCNumRfRelatedDropsRtcLost();
    
    /**
     * This statistic counts the number of HRPD connections that were dropped before 
     * data has flowed on the A10 connection because of indications that there is no 
     * active Forward Traffic Channel (FTC) available.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumRfRelatedDropsNoFtc</code>, or <code>null</code> if not present
     */
    BigInteger getSNumRfRelatedDropsNoFtc();
    
    /**
     * This statistic counts the number of HRPD connections that were dropped after 
     * data has flowed on the A10 connection because of indications that there is no 
     * active Forward Traffic Channel (FTC) available.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumRfRelatedDropsNoFtc</code>, or <code>null</code> if not present
     */
    BigInteger getCNumRfRelatedDropsNoFtc();
    
    /**
     * This statistic counts the number of HRPD connections that were closed before 
     * data has flowed on the A10 connection because the FAP closed the open A10 
     * connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumNetworkErrorDrops</code>, or <code>null</code> if not present
     */
    BigInteger getSNumNetworkErrorDrops();
    
    /**
     * This statistic counts the number of HRPD connections that were closed after data
     * has flowed on the A10 connection because the FAP closed the open A10 connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumNetworkErrorDrops</code>, or <code>null</code> if not present
     */
    BigInteger getCNumNetworkErrorDrops();
    
    /**
     * This statistic counts the number of open HRPD connections that were closed 
     * before data has flowed on the A10 connection because the FAP closed the A10 
     * connection due to internal failures.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumNetworkErrorDropsRncInternal</code>, or <code>null</code> if not present
     */
    BigInteger getSNumNetworkErrorDropsRncInternal();
    
    /**
     * This statistic counts the number of open HRPD connections that were closed after
     * data has flowed on the A10 connection because the FAP closed the A10 connection 
     * due to internal failures.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumNetworkErrorDropsRncInternal</code>, or <code>null</code> if not present
     */
    BigInteger getCNumNetworkErrorDropsRncInternal();
    
    /**
     * This statistic counts the number of open HRPD connections that were closed 
     * before data has flowed on the A10 connection because the FAP closed the A10 
     * connection due to the PDSN unreachablity.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumNetworkErrorDropsRncExternal</code>, or <code>null</code> if not present
     */
    BigInteger getSNumNetworkErrorDropsRncExternal();
    
    /**
     * This statistic counts the number of open HRPD connections that were closed after
     * data has flowed on the A10 connection because the FAP closed the A10 connection 
     * due to the PDSN unreachablity.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumNetworkErrorDropsRncExternal</code>, or <code>null</code> if not present
     */
    BigInteger getCNumNetworkErrorDropsRncExternal();
    
    /**
     * This statistic counts the number of open HRPD connections that were closed 
     * before data has flowed on the A10 connection because there was failure in the 
     * A10 connection set-up.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumNetworkErrorDropsA10SetupFail</code>, or <code>null</code> if not present
     */
    BigInteger getSNumNetworkErrorDropsA10SetupFail();
    
    /**
     * This statistic counts the number of open HRPD connections that were closed after
     * data has flowed on the A10 connection because there was failure in the A10 
     * connection set-up.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumNetworkErrorDropsA10SetupFail</code>, or <code>null</code> if not present
     */
    BigInteger getCNumNetworkErrorDropsA10SetupFail();
    
    /**
     * This statistic counts the number of HRPD connections that were dropped before 
     * data has flowed on the A10 connection because there is only one pilot available 
     * for the connection and a sector down indication has been received for that 
     * pilot.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumMiscDropsSectorDown</code>, or <code>null</code> if not present
     */
    BigInteger getSNumMiscDropsSectorDown();
    
    /**
     * This statistic counts the number of HRPD connections that were dropped after 
     * data has flowed on the A10 connection because there is only one pilot available 
     * for the connection and a sector down indication has been received for that 
     * pilot.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumMiscDropsSectorDown</code>, or <code>null</code> if not present
     */
    BigInteger getCNumMiscDropsSectorDown();
    
    /**
     * This statistic counts the number of HRPD connections that were dropped before 
     * data has flowed on the A10 connection due to internal software errors.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumMiscDropsInternalError</code>, or <code>null</code> if not present
     */
    BigInteger getSNumMiscDropsInternalError();
    
    /**
     * This statistic counts the number of HRPD connections that were dropped after 
     * data has flowed on the A10 connection due to internal software errors.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumMiscDropsInternalError</code>, or <code>null</code> if not present
     */
    BigInteger getCNumMiscDropsInternalError();
    
    /**
     * This statistic counts the number of HRPD connections that were dropped after 
     * data has flowed on the A10 connection when the FAP finds a state mismatch 
     * between itself andthe AT. Such a mismatch is found when a connection request 
     * message is received from the AT, and the connection is already open as perceived
     * by the FAP.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumMiscDropsStateMismatch</code>, or <code>null</code> if not present
     */
    BigInteger getCNumMiscDropsStateMismatch();
    
    /**
     * This statistic counts the number of connections that were dropped before the 
     * demarcation point when the FAP finds a state mismatch between itself and the AT.
     * Such a mismatch is found when a connection request message is received from the 
     * AT, and the connection is already open as perceived by the FAP.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumMiscDropsStateMismatch</code>, or <code>null</code> if not present
     */
    BigInteger getSNumMiscDropsStateMismatch();
    
    /**
     * This statistic counts the number of times the HRPD connection was dropped before
     * data has flowed on the A10 connection at the request of the Radio Link Protocol.
     * This request is generated when the HDR Fast Path component finds that the reset 
     * acknowledgment timeout has expired for the connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>sNumMiscDropsDueToRlp</code>, or <code>null</code> if not present
     */
    BigInteger getSNumMiscDropsDueToRlp();
    
    /**
     * This statistic counts the number of times the HRPD connection was dropped after 
     * data has flowed on the A10 connection at the request of the Radio Link Protocol.
     * This request is generated when the HDR Fast Path component finds that the reset 
     * acknowledgment timeout has expired for the connection.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cNumMiscDropsDueToRlp</code>, or <code>null</code> if not present
     */
    BigInteger getCNumMiscDropsDueToRlp();

}

