package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The object used for configuring extended channel assignment messages for 1x
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-ran-forward-pwr-ctr-g {
 *     leaf fpcfch-init-setpt {
 *         type fpcfch-init-setpt;
 *     }
 *     leaf fpc-subchan-gain {
 *         type fpc-subchan-gain;
 *     }
 *     leaf rl-gain-adj {
 *         type rl-gain-adj;
 *     }
 *     leaf fpcfchfer {
 *         type uint8;
 *     }
 *     leaf fpcfch-min-setpt {
 *         type fpcfch-min-setpt;
 *     }
 *     leaf fpcfch-max-setpt {
 *         type fpcfch-max-setpt;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-forward-pwr-ctr-g</i>
 *
 */
public interface Cdma2000OneXRanForwardPwrCtrG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-forward-pwr-ctr-g").intern();

    /**
     * Initial Fundamental Channel outer loop Eb/Nt setpoint in {{units}}. For example,
     * 56 corresponds to 7 dB. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>fpcfchInitSetpt</code>, or <code>null</code> if not present
     */
    java.lang.Long getFpcfchInitSetpt();
    
    /**
     * Forward power control subchannel relative to fwd traffic channel in {{units}}. 
     * See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>fpcSubchanGain</code>, or <code>null</code> if not present
     */
    java.lang.Long getFpcSubchanGain();
    
    /**
     * Reverse Traffic Channel power relative to access power in {{units}}. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>rlGainAdj</code>, or <code>null</code> if not present
     */
    java.lang.Long getRlGainAdj();
    
    /**
     * Fundamental Channel target frame error rate. Refer to table 3.7.3.3.2.25-2 of 
     * {{bibref|3GPP2-C.S0005}}
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>fpcfchfer</code>, or <code>null</code> if not present
     */
    java.lang.Short getFpcfchfer();
    
    /**
     * Minimum Fundamental Channel Outer Loop Eb/Nt setpoint in {{units}}. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>fpcfchMinSetpt</code>, or <code>null</code> if not present
     */
    java.lang.Long getFpcfchMinSetpt();
    
    /**
     * Maximum Fundamental Channel Outer Loop Eb/Nt setpoint in {{units}}. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>fpcfchMaxSetpt</code>, or <code>null</code> if not present
     */
    java.lang.Long getFpcfchMaxSetpt();

}

