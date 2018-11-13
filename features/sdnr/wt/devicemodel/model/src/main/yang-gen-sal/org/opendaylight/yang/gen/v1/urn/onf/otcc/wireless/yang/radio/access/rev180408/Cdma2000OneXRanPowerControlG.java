package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Configuration Managed Object for OTA power control attribute.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-ran-power-control-g {
 *     leaf one-xpcfpc-incl {
 *         type int64;
 *     }
 *     leaf one-xpcfpcfch-min-setpt {
 *         type one-xpcfpcfch-min-setpt;
 *     }
 *     leaf one-xpcfpcfch-max-setpt {
 *         type one-xpcfpcfch-max-setpt;
 *     }
 *     leaf one-xpcrpc-incl {
 *         type int64;
 *     }
 *     leaf one-xpcfch-chan-adj-gain {
 *         type one-xpcfch-chan-adj-gain;
 *     }
 *     leaf one-xpc-pwr-rep-thresh {
 *         type uint8;
 *     }
 *     leaf one-xpc-pwr-rep-frames {
 *         type uint8;
 *     }
 *     leaf one-x-pwr-thresh-enable {
 *         type int64;
 *     }
 *     leaf one-xpc-pwr-period-enable {
 *         type int64;
 *     }
 *     leaf one-xpc-pwr-rep-delay {
 *         type one-xpc-pwr-rep-delay;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-power-control-g</i>
 *
 */
public interface Cdma2000OneXRanPowerControlG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-power-control-g").intern();

    /**
     * Whether Forward power control information included in Power Control message
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>oneXpcfpcIncl</code>, or <code>null</code> if not present
     */
    java.lang.Long getOneXpcfpcIncl();
    
    /**
     * The value for the minimum Fundamental Channel Outer Loop Eb/Nt setpoint, in 
     * units of {{units}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>oneXpcfpcfchMinSetpt</code>, or <code>null</code> if not present
     */
    java.lang.Long getOneXpcfpcfchMinSetpt();
    
    /**
     * The value for the maximum Fundamental Channel Outer Loop Eb/Nt setpoint, in 
     * units of {{units}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>oneXpcfpcfchMaxSetpt</code>, or <code>null</code> if not present
     */
    java.lang.Long getOneXpcfpcfchMaxSetpt();
    
    /**
     * Whether reverse Power control information included in the Power Control Message.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>oneXpcrpcIncl</code>, or <code>null</code> if not present
     */
    java.lang.Long getOneXpcrpcIncl();
    
    /**
     * Channel adjustment gain (in {{units}}) for Reverse Fundamental Channel.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>oneXpcfchChanAdjGain</code>, or <code>null</code> if not present
     */
    java.lang.Long getOneXpcfchChanAdjGain();
    
    /**
     * The number of bad frames to be received in a measurement period on the channel 
     * which carries the Power Control Subchannel before mobile stations are to 
     * generate a Power easurement Report Message
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>oneXpcPwrRepThresh</code>, or <code>null</code> if not present
     */
    java.lang.Short getOneXpcPwrRepThresh();
    
    /**
     * Power control reporting frame count. Number of frames over which the mobile 
     * station measures frame errors. For example, 7 corresponds to 55 frames. Refer to
     * {{bibref|3GPP2-C.S0005}} for mapping between this value and the actual frame 
     * count.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>oneXpcPwrRepFrames</code>, or <code>null</code> if not present
     */
    java.lang.Short getOneXpcPwrRepFrames();
    
    /**
     * Threshold report mode indicator. If the mobile station is to generate threshold 
     * Power Measurement Report Messages, the base station shall set this field to '1'.
     * If the mobile station is not to generate threshold Power Measurement Report 
     * Messages, the base station shall set this field to '0'.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>oneXPwrThreshEnable</code>, or <code>null</code> if not present
     */
    java.lang.Long getOneXPwrThreshEnable();
    
    /**
     * Periodic report mode indicator. If the mobile station is to generate periodic 
     * Power Measurement Report Messages, the base station shall set this field to '1'.
     * If the mobile station is not to generate periodic Power Measurement Report 
     * Messages, the base station shall set this field to '0'.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>oneXpcPwrPeriodEnable</code>, or <code>null</code> if not present
     */
    java.lang.Long getOneXpcPwrPeriodEnable();
    
    /**
     * Power report delay. The period that the mobile station waits following a Power 
     * Measurement Report Message before restarting frame counting for power control 
     * purposes. The base station shall set this field to the power report delay values
     * in units of {{units}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>oneXpcPwrRepDelay</code>, or <code>null</code> if not present
     */
    java.lang.Short getOneXpcPwrRepDelay();

}

