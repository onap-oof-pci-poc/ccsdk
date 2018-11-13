package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains statistics for all Handouts of the 1x FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-ran-hard-handoff-stats-g {
 *     leaf tx-ho-required {
 *         type uint32;
 *     }
 *     leaf rx-ho-command {
 *         type uint32;
 *     }
 *     leaf ho-required-rejected {
 *         type uint32;
 *     }
 *     leaf ho-required-unanswered {
 *         type uint32;
 *     }
 *     leaf tx-uhdm {
 *         type uint32;
 *     }
 *     leaf rx-ns-ack {
 *         type uint32;
 *     }
 *     leaf ho-failure-count {
 *         type uint32;
 *     }
 *     leaf call-drop-count {
 *         type uint32;
 *     }
 *     leaf tx-ho-commence {
 *         type uint32;
 *     }
 *     leaf rx-ho-session-clear {
 *         type uint32;
 *     }
 *     leaf return-on-failure-count {
 *         type uint32;
 *     }
 *     leaf one-pilot-report-count {
 *         type uint32;
 *     }
 *     leaf two-pilot-report-count {
 *         type uint32;
 *     }
 *     leaf three-pilot-report-count {
 *         type uint32;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-hard-handoff-stats-g</i>
 *
 */
public interface Cdma2000OneXRanHardHandoffStatsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-hard-handoff-stats-g").intern();

    /**
     * Total number of Handout Required messages sent to the MSC
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>txHoRequired</code>, or <code>null</code> if not present
     */
    java.lang.Long getTxHoRequired();
    
    /**
     * Total number of Handout Command messegaes received from the MSC
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>rxHoCommand</code>, or <code>null</code> if not present
     */
    java.lang.Long getRxHoCommand();
    
    /**
     * Total number of HO required requests rejected by the MSC
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>hoRequiredRejected</code>, or <code>null</code> if not present
     */
    java.lang.Long getHoRequiredRejected();
    
    /**
     * Total number of HO required requests for which no response received from the MSC
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>hoRequiredUnanswered</code>, or <code>null</code> if not present
     */
    java.lang.Long getHoRequiredUnanswered();
    
    /**
     * Total number UHDMs sent to mobiles
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>txUhdm</code>, or <code>null</code> if not present
     */
    java.lang.Long getTxUhdm();
    
    /**
     * Total number of MSAcks received from the mobile in response to UHDM
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>rxNsAck</code>, or <code>null</code> if not present
     */
    java.lang.Long getRxNsAck();
    
    /**
     * Total number of Handout attempts declared as failure
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>hoFailureCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getHoFailureCount();
    
    /**
     * Total numer of call drops after a HO attempt. RTC lost without MSack
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>callDropCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getCallDropCount();
    
    /**
     * Number of Handout Commenced messages sent to MSC
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>txHoCommence</code>, or <code>null</code> if not present
     */
    java.lang.Long getTxHoCommence();
    
    /**
     * Number of session clear commands received form the core
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>rxHoSessionClear</code>, or <code>null</code> if not present
     */
    java.lang.Long getRxHoSessionClear();
    
    /**
     * Total number of times a Return On Handoff failure was declared
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>returnOnFailureCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getReturnOnFailureCount();
    
    /**
     * Number of times only one pilot was reported in HO Required message
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>onePilotReportCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getOnePilotReportCount();
    
    /**
     * Number of times only two pilot was reported in HO Required message
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>twoPilotReportCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getTwoPilotReportCount();
    
    /**
     * Number of times only three pilot was reported in HO Required message
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>threePilotReportCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getThreePilotReportCount();

}

