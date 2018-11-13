package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains 1x FAP statistics aggregated over all connections of all 
 * users over all sectors.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-stats-g {
 *     leaf registration-attempts {
 *         type uint32;
 *     }
 *     leaf registration-fails {
 *         type uint32;
 *     }
 *     leaf registrations-blocked {
 *         type uint32;
 *     }
 *     leaf page-attempts {
 *         type uint32;
 *     }
 *     leaf page-fails {
 *         type uint32;
 *     }
 *     leaf voice-call-attempts {
 *         type uint32;
 *     }
 *     leaf voice-call-failures {
 *         type uint32;
 *     }
 *     leaf voice-calls-blocked {
 *         type uint32;
 *     }
 *     leaf voice-calls-dropped {
 *         type uint32;
 *     }
 *     leaf data-call-attempts {
 *         type uint32;
 *     }
 *     leaf data-call-failures {
 *         type uint32;
 *     }
 *     leaf data-calls-blocked {
 *         type uint32;
 *     }
 *     leaf data-calls-dropped {
 *         type uint32;
 *     }
 *     leaf average-voice-call {
 *         type average-voice-call;
 *     }
 *     leaf average-data-call {
 *         type average-data-call;
 *     }
 *     leaf average-session-in-sec {
 *         type average-session-in-sec;
 *     }
 *     leaf total-voice-calls {
 *         type total-voice-calls;
 *     }
 *     leaf total-data-calls {
 *         type uint32;
 *     }
 *     leaf fwd-voice-packet-drop-percentage {
 *         type uint32;
 *     }
 *     leaf rev-voice-packet-drop-percentage {
 *         type uint32;
 *     }
 *     leaf fwd-avg-data-rate {
 *         type uint32;
 *     }
 *     leaf rev-avg-data-rate {
 *         type uint32;
 *     }
 *     leaf bc-index-zero-to-one-transitions {
 *         type uint32;
 *     }
 *     leaf bc-index-one-to-zero-transitions {
 *         type uint32;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-stats-g</i>
 *
 */
public interface Cdma2000OneXStatsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-stats-g").intern();

    /**
     * Total number of registration attempts
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>registrationAttempts</code>, or <code>null</code> if not present
     */
    java.lang.Long getRegistrationAttempts();
    
    /**
     * Total number of registrations failed
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>registrationFails</code>, or <code>null</code> if not present
     */
    java.lang.Long getRegistrationFails();
    
    /**
     * Unauthorized registrations blocked by admission control
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>registrationsBlocked</code>, or <code>null</code> if not present
     */
    java.lang.Long getRegistrationsBlocked();
    
    /**
     * Total number of attemots to page requests received from the core
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pageAttempts</code>, or <code>null</code> if not present
     */
    java.lang.Long getPageAttempts();
    
    /**
     * Total number of page requests rejected or not responded
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pageFails</code>, or <code>null</code> if not present
     */
    java.lang.Long getPageFails();
    
    /**
     * Total number of voice call attempts
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>voiceCallAttempts</code>, or <code>null</code> if not present
     */
    java.lang.Long getVoiceCallAttempts();
    
    /**
     * Total number of voice call attempts which failed for various reasons
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>voiceCallFailures</code>, or <code>null</code> if not present
     */
    java.lang.Long getVoiceCallFailures();
    
    /**
     * Total number of voice calls blocked due to lack of authorization
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>voiceCallsBlocked</code>, or <code>null</code> if not present
     */
    java.lang.Long getVoiceCallsBlocked();
    
    /**
     * Number of voice calls dropped due to various reasons other than a normal call 
     * release
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>voiceCallsDropped</code>, or <code>null</code> if not present
     */
    java.lang.Long getVoiceCallsDropped();
    
    /**
     * Total number of data call attempts
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>dataCallAttempts</code>, or <code>null</code> if not present
     */
    java.lang.Long getDataCallAttempts();
    
    /**
     * Total number of data call attemots failed for various reasons
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>dataCallFailures</code>, or <code>null</code> if not present
     */
    java.lang.Long getDataCallFailures();
    
    /**
     * Total number of data calls failed due to lack of authorization
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>dataCallsBlocked</code>, or <code>null</code> if not present
     */
    java.lang.Long getDataCallsBlocked();
    
    /**
     * Total number of data calls dropped due to reasons other than a normal release.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>dataCallsDropped</code>, or <code>null</code> if not present
     */
    java.lang.Long getDataCallsDropped();
    
    /**
     * Average voice call duration in {{units}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>averageVoiceCall</code>, or <code>null</code> if not present
     */
    java.lang.Long getAverageVoiceCall();
    
    /**
     * Average data call duration in {{units}}
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>averageDataCall</code>, or <code>null</code> if not present
     */
    java.lang.Long getAverageDataCall();
    
    /**
     * Average session duration in {{units}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>averageSessionInSec</code>, or <code>null</code> if not present
     */
    java.lang.Long getAverageSessionInSec();
    
    /**
     * Total number of successful voice calls
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>totalVoiceCalls</code>, or <code>null</code> if not present
     */
    java.lang.Long getTotalVoiceCalls();
    
    /**
     * Total number of successful data calls
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>totalDataCalls</code>, or <code>null</code> if not present
     */
    java.lang.Long getTotalDataCalls();
    
    /**
     * Percentage of voice packets dropped in MAC due to signaling
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>fwdVoicePacketDropPercentage</code>, or <code>null</code> if not present
     */
    java.lang.Long getFwdVoicePacketDropPercentage();
    
    /**
     * Percentage of voice packets received with bad FQI
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>revVoicePacketDropPercentage</code>, or <code>null</code> if not present
     */
    java.lang.Long getRevVoicePacketDropPercentage();
    
    /**
     * Average data rate of the scheduler on the forward link
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>fwdAvgDataRate</code>, or <code>null</code> if not present
     */
    java.lang.Long getFwdAvgDataRate();
    
    /**
     * Average data rate of the scheduler on reverse link
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>revAvgDataRate</code>, or <code>null</code> if not present
     */
    java.lang.Long getRevAvgDataRate();
    
    /**
     * Num of times the bcIndex was changed from 0 to 1 in the Extended System 
     * Parameters Message.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>bcIndexZeroToOneTransitions</code>, or <code>null</code> if not present
     */
    java.lang.Long getBcIndexZeroToOneTransitions();
    
    /**
     * Num of times the bcIndex was changed from 0 to 1 in the Extended System 
     * Parameters Message.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>bcIndexOneToZeroTransitions</code>, or <code>null</code> if not present
     */
    java.lang.Long getBcIndexOneToZeroTransitions();

}

