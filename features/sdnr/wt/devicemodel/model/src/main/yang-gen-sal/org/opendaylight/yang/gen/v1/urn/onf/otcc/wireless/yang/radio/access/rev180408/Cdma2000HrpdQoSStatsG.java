package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object is used in obtaining the QoS Common Performance stats
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-hrpd-qo-s-stats-g {
 *     leaf num-qo-s-subscriber-profile-updates-rcvd {
 *         type uint64;
 *     }
 *     leaf num-pdsnip-flow-updates-msg-rcvd {
 *         type uint64;
 *     }
 *     leaf num-pdsnip-flow-updates-msg-failed {
 *         type uint64;
 *     }
 *     leaf num-qo-s-setup-requests-received {
 *         type uint64;
 *     }
 *     leaf num-qo-s-setup-requests-accepted {
 *         type uint64;
 *     }
 *     leaf num-qo-s-setup-requests-rejected {
 *         type uint64;
 *     }
 *     leaf num-reservation-on-requests-received {
 *         type uint64;
 *     }
 *     leaf num-reservation-on-requests-accepted {
 *         type uint64;
 *     }
 *     leaf num-reservation-on-requests-rejected {
 *         type uint64;
 *     }
 *     leaf num-reservation-on-requests-failed {
 *         type uint64;
 *     }
 *     leaf num-fwd-reservation-on-messages-sent {
 *         type uint64;
 *     }
 *     leaf num-rev-reservation-on-messages-sent {
 *         type uint64;
 *     }
 *     leaf num-reservation-off-requests-received {
 *         type uint64;
 *     }
 *     leaf num-reservation-off-requests-accepted {
 *         type uint64;
 *     }
 *     leaf num-reservation-off-requests-rejected {
 *         type uint64;
 *     }
 *     leaf num-fwd-reservation-off-messages-sent {
 *         type uint64;
 *     }
 *     leaf num-rev-reservation-off-messages-sent {
 *         type uint64;
 *     }
 *     leaf num-qo-s-release-requests-received {
 *         type uint64;
 *     }
 *     leaf num-connection-close-initiated-no-ran-rsr {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-hrpd-qo-s-stats-g</i>
 *
 */
public interface Cdma2000HrpdQoSStatsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-qo-s-stats-g").intern();

    /**
     * Number of subscriber QoS profile updates received from the PDSN.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numQoSSubscriberProfileUpdatesRcvd</code>, or <code>null</code> if not present
     */
    BigInteger getNumQoSSubscriberProfileUpdatesRcvd();
    
    /**
     * Number of PDSN IP flow update messages received from PDSN.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numPdsnipFlowUpdatesMsgRcvd</code>, or <code>null</code> if not present
     */
    BigInteger getNumPdsnipFlowUpdatesMsgRcvd();
    
    /**
     * Number of PDSN IP Flow updates messages that failed per RNC.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numPdsnipFlowUpdatesMsgFailed</code>, or <code>null</code> if not present
     */
    BigInteger getNumPdsnipFlowUpdatesMsgFailed();
    
    /**
     * Number of QoS setup requests received from the AT.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numQoSSetupRequestsReceived</code>, or <code>null</code> if not present
     */
    BigInteger getNumQoSSetupRequestsReceived();
    
    /**
     * Number of QoS setup requests received from the AT that the FAP RNC accepted.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numQoSSetupRequestsAccepted</code>, or <code>null</code> if not present
     */
    BigInteger getNumQoSSetupRequestsAccepted();
    
    /**
     * Number of QoS setup requests from the AT that the FAP RNC rejected.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numQoSSetupRequestsRejected</code>, or <code>null</code> if not present
     */
    BigInteger getNumQoSSetupRequestsRejected();
    
    /**
     * Number of ReservationOnRequest messages received from the AT.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numReservationOnRequestsReceived</code>, or <code>null</code> if not present
     */
    BigInteger getNumReservationOnRequestsReceived();
    
    /**
     * Number of ReservationOnRequest messages received from the AT that the FAP RNC 
     * accepted.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numReservationOnRequestsAccepted</code>, or <code>null</code> if not present
     */
    BigInteger getNumReservationOnRequestsAccepted();
    
    /**
     * Number of ReservationOnRequest message received from the AT that the FAP RNC 
     * rejected.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numReservationOnRequestsRejected</code>, or <code>null</code> if not present
     */
    BigInteger getNumReservationOnRequestsRejected();
    
    /**
     * Number of ReservationOnRequest message received from the AT that the FAP RNC 
     * failed.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numReservationOnRequestsFailed</code>, or <code>null</code> if not present
     */
    BigInteger getNumReservationOnRequestsFailed();
    
    /**
     * Number of times the FAP RNC sent a FwdReservationOn message to the AT to 
     * activate a forward Reservation.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numFwdReservationOnMessagesSent</code>, or <code>null</code> if not present
     */
    BigInteger getNumFwdReservationOnMessagesSent();
    
    /**
     * Number of times the FAP RNC sent a RevReservationOn message to the AT to 
     * activate a reverse Reservation.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numRevReservationOnMessagesSent</code>, or <code>null</code> if not present
     */
    BigInteger getNumRevReservationOnMessagesSent();
    
    /**
     * Number of ReservationOffRequest message is received from the AT.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numReservationOffRequestsReceived</code>, or <code>null</code> if not present
     */
    BigInteger getNumReservationOffRequestsReceived();
    
    /**
     * Number of ReservationOffRequest messages received from the AT that the FAP RNC 
     * accepted.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numReservationOffRequestsAccepted</code>, or <code>null</code> if not present
     */
    BigInteger getNumReservationOffRequestsAccepted();
    
    /**
     * Number of ReservationOffRequest messages received from the AT that the FAP RNC 
     * rejected.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numReservationOffRequestsRejected</code>, or <code>null</code> if not present
     */
    BigInteger getNumReservationOffRequestsRejected();
    
    /**
     * Number of times the FAP RNC sent a FwdReservationOff message to the AT to 
     * deactivate a forward Reservation.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numFwdReservationOffMessagesSent</code>, or <code>null</code> if not present
     */
    BigInteger getNumFwdReservationOffMessagesSent();
    
    /**
     * Number of times the FAP RNC sent a RevReservationOff message to the AT to 
     * deactivate a reverse Reservation.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numRevReservationOffMessagesSent</code>, or <code>null</code> if not present
     */
    BigInteger getNumRevReservationOffMessagesSent();
    
    /**
     * Number of QoS release requests received from the AT.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numQoSReleaseRequestsReceived</code>, or <code>null</code> if not present
     */
    BigInteger getNumQoSReleaseRequestsReceived();
    
    /**
     * Number of times FAP RNC initiated a connection close in response to the 
     * ReservationOnRequest because it did not have the RAN resources to satisfy one or
     * more Reservations included in the request.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>numConnectionCloseInitiatedNoRanRsr</code>, or <code>null</code> if not present
     */
    BigInteger getNumConnectionCloseInitiatedNoRanRsr();

}

