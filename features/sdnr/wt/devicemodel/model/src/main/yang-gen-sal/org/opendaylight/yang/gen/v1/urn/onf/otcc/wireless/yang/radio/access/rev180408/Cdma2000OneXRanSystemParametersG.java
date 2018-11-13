package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The object used for configuring system parameter messages for 1x
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-ran-system-parameters-g {
 *     leaf reg-zone {
 *         type uint16;
 *     }
 *     leaf total-zones {
 *         type uint8;
 *     }
 *     leaf zone-timer {
 *         type uint8;
 *     }
 *     leaf reg-period {
 *         type uint8;
 *     }
 *     leaf srch-win-a {
 *         type uint8;
 *     }
 *     leaf srch-win-n {
 *         type uint8;
 *     }
 *     leaf srch-win-r {
 *         type uint8;
 *     }
 *     leaf nghbr-max-age {
 *         type uint8;
 *     }
 *     leaf pwr-rep-thresh {
 *         type uint8;
 *     }
 *     leaf pwr-rep-frames {
 *         type uint8;
 *     }
 *     leaf pwr-thresh-enable {
 *         type uint8;
 *     }
 *     leaf pwr-period-enable {
 *         type uint8;
 *     }
 *     leaf pwr-rep-delay {
 *         type uint8;
 *     }
 *     leaf rescan {
 *         type uint8;
 *     }
 *     leaf tadd {
 *         type tadd;
 *     }
 *     leaf tdrop {
 *         type tdrop;
 *     }
 *     leaf tcomp {
 *         type tcomp;
 *     }
 *     leaf t-tdrop {
 *         type uint8;
 *     }
 *     leaf in-traffic-tadd {
 *         type in-traffic-tadd;
 *     }
 *     leaf in-traffic-tdrop {
 *         type in-traffic-tdrop;
 *     }
 *     leaf in-traffic-tcomp {
 *         type in-traffic-tcomp;
 *     }
 *     leaf in-traffic-ttdrop {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-system-parameters-g</i>
 *
 */
public interface Cdma2000OneXRanSystemParametersG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-system-parameters-g").intern();

    /**
     * registration zone number (refer to Section 2.6.5.1.5 of 
     * {{bibref|3GPP2-C.S0005}})
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>regZone</code>, or <code>null</code> if not present
     */
    java.lang.Integer getRegZone();
    
    /**
     * Total number of zones the mobile shall retain for zone based registration. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>totalZones</code>, or <code>null</code> if not present
     */
    java.lang.Short getTotalZones();
    
    /**
     * timer value to be used by the mobile in the zone registration timer. Refer to 
     * table 3.7.2.3.2.1-1 of the standard {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>zoneTimer</code>, or <code>null</code> if not present
     */
    java.lang.Short getZoneTimer();
    
    /**
     * Registration period for timer based registration. Registration period is 
     * calculated from the formula 2^(REG_PRD/4) x 0.08 seconds. Thus a value of 59 
     * corresponds to 1853.6 seconds (~ 1/2 hour). See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>regPeriod</code>, or <code>null</code> if not present
     */
    java.lang.Short getRegPeriod();
    
    /**
     * Search window size to be used ny the mobile for active set and candidate set. 
     * Refer to table 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 11 
     * corresponds to 130 chips
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>srchWinA</code>, or <code>null</code> if not present
     */
    java.lang.Short getSrchWinA();
    
    /**
     * Search window size to be used by the mobile for neighbor set. Refer to table 
     * 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 8 corresponds to 60 chips
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>srchWinN</code>, or <code>null</code> if not present
     */
    java.lang.Short getSrchWinN();
    
    /**
     * Search window size to be used by the mobile for remaining set. Refer to table 
     * 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 8 corresponds to 60 chips
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>srchWinR</code>, or <code>null</code> if not present
     */
    java.lang.Short getSrchWinR();
    
    /**
     * neighbor set maximum age beyond which the mobiles are supposed to drop a 
     * neighbor. This is the count of neighbout list updat or extended neighbor list 
     * updates a mobile shall receive before removing a neighbor from the neighbor 
     * list. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>nghbrMaxAge</code>, or <code>null</code> if not present
     */
    java.lang.Short getNghbrMaxAge();
    
    /**
     * Power control reporting threshold. Number of bad frames a mobile should receive 
     * before sending a PMRM message. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pwrRepThresh</code>, or <code>null</code> if not present
     */
    java.lang.Short getPwrRepThresh();
    
    /**
     * Duration (in number of frames) for measuring bad frames - given by equation 
     * 2^(PWR_REP_FRAMES/2) x 5 frames. For example, 6 corresponds to 40 frames. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pwrRepFrames</code>, or <code>null</code> if not present
     */
    java.lang.Short getPwrRepFrames();
    
    /**
     * enable/disable power measurement report message. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pwrThreshEnable</code>, or <code>null</code> if not present
     */
    java.lang.Short getPwrThreshEnable();
    
    /**
     * enable/disable periodic power measurement report message. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pwrPeriodEnable</code>, or <code>null</code> if not present
     */
    java.lang.Short getPwrPeriodEnable();
    
    /**
     * Delay (in unit of four frames) following a PMRM before the mobile restarts 
     * counting bad frames for power control measuremnt. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pwrRepDelay</code>, or <code>null</code> if not present
     */
    java.lang.Short getPwrRepDelay();
    
    /**
     * If {{param}} is set to 1, the mobiles should restart and reinitialize the System
     * Parameters message. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>rescan</code>, or <code>null</code> if not present
     */
    java.lang.Short getRescan();
    
    /**
     * Power threshold (in {{units}}) for transferring a neighbor from neighbor set or 
     * remaining set to active set. For example, a value of 26 corresponds to -13 dB. 
     * See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tadd</code>, or <code>null</code> if not present
     */
    java.lang.Short getTadd();
    
    /**
     * Drop threshold (in {{units}}) to start a handoff timer to drop a neighbor from 
     * active or candidate set. For example, 30 corresponds to -15dB. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tdrop</code>, or <code>null</code> if not present
     */
    java.lang.Short getTdrop();
    
    /**
     * If a pilot in condidate set exceeds the power of a pilot in active set by 
     * threshold, the mobile shall send a power strenght measurement report message. 
     * This threshold is defined in unit of {{units}}. For example, 5 corresponds to a 
     * threshold of 2.5 dB. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tcomp</code>, or <code>null</code> if not present
     */
    java.lang.Short getTcomp();
    
    /**
     * Timer value for which an action is taken by the mobile for a neighbor in 
     * candidate set or in active set. Refer to Table 2.6.6.2.3-1 of the 
     * {{bibref|3GPP2-C.S0005}} for details. For example, 3 corresponds to four seconds
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>tTdrop</code>, or <code>null</code> if not present
     */
    java.lang.Short getTTdrop();
    
    /**
     * T-ADD value (in {{units}}) used for in-traffic system parameter message. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>inTrafficTadd</code>, or <code>null</code> if not present
     */
    java.lang.Short getInTrafficTadd();
    
    /**
     * T-Drop value (in {{units}}) used in in-traffic system parameter message. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>inTrafficTdrop</code>, or <code>null</code> if not present
     */
    java.lang.Short getInTrafficTdrop();
    
    /**
     * T_Comp value (in {{units}}) used for in-traffic system parameter message. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>inTrafficTcomp</code>, or <code>null</code> if not present
     */
    java.lang.Short getInTrafficTcomp();
    
    /**
     * T_Tdrop timer value value used for in-traffic system parameter message. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>inTrafficTtdrop</code>, or <code>null</code> if not present
     */
    java.lang.Short getInTrafficTtdrop();

}

