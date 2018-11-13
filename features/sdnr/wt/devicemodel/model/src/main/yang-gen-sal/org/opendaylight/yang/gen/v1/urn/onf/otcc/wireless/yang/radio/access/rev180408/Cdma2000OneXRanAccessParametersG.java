package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The object used for configuring access parameter messages for 1x. See 
 * {{bibref|3GPP2-C.S0005}}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-ran-access-parameters-g {
 *     leaf nom-pwr {
 *         type int64;
 *     }
 *     leaf init-pwr {
 *         type int64;
 *     }
 *     leaf pwr-step-indb {
 *         type uint8;
 *     }
 *     leaf nom-pwr-ext {
 *         type nom-pwr-ext;
 *     }
 *     leaf apm-auth {
 *         type uint8;
 *     }
 *     leaf apm-rand-update-prd {
 *         type apm-rand-update-prd;
 *     }
 *     leaf initialpwr {
 *         type initialpwr;
 *     }
 *     leaf pwr-step {
 *         type pwr-step;
 *     }
 *     leaf num-step {
 *         type uint8;
 *     }
 *     leaf max-cap-size {
 *         type uint8;
 *     }
 *     leaf preamble-size {
 *         type uint8;
 *     }
 *     leaf psist09 {
 *         type uint8;
 *     }
 *     leaf psist10 {
 *         type uint8;
 *     }
 *     leaf psist11 {
 *         type uint8;
 *     }
 *     leaf psist12 {
 *         type uint8;
 *     }
 *     leaf psist13 {
 *         type uint8;
 *     }
 *     leaf psist14 {
 *         type uint8;
 *     }
 *     leaf psist15 {
 *         type uint8;
 *     }
 *     leaf msg-psist {
 *         type uint8;
 *     }
 *     leaf reg-psist {
 *         type uint8;
 *     }
 *     leaf probe-pn-ran {
 *         type uint8;
 *     }
 *     leaf acc-tmo {
 *         type acc-tmo;
 *     }
 *     leaf probe-bkoff {
 *         type probe-bkoff;
 *     }
 *     leaf bkoff {
 *         type bkoff;
 *     }
 *     leaf max-req-seq {
 *         type uint8;
 *     }
 *     leaf max-rsp-seq {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-ran-access-parameters-g</i>
 *
 */
public interface Cdma2000OneXRanAccessParametersG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-access-parameters-g").intern();

    /**
     * Nominal power correction factor used by the mobile in open loop power 
     * adjustment. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>nomPwr</code>, or <code>null</code> if not present
     */
    java.lang.Long getNomPwr();
    
    /**
     * Initial power offset used by the mobile in open loop power adjustment. See 
     * {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>initPwr</code>, or <code>null</code> if not present
     */
    java.lang.Long getInitPwr();
    
    /**
     * Power step increment in successive access probes. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pwrStepIndb</code>, or <code>null</code> if not present
     */
    java.lang.Short getPwrStepIndb();
    
    /**
     * {{param}} should be zero for BC0 and BC1. For other band classes, {{param}} is 1
     * if Mobile's correction factor is between -24dBm and -9dBm. Otherwise {{param}} 
     * is zero. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>nomPwrExt</code>, or <code>null</code> if not present
     */
    java.lang.Short getNomPwrExt();
    
    /**
     * Enabling/disabling global authentication. See {{bibref|3GPP2-C.S0005}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>apmAuth</code>, or <code>null</code> if not present
     */
    java.lang.Short getApmAuth();
    
    /**
     * The period (in {{units}}) that the BSS updates the RAND value sent via APM. Only
     * 2 second multiples accepted.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>apmRandUpdatePrd</code>, or <code>null</code> if not present
     */
    java.lang.Integer getApmRandUpdatePrd();
    
    /**
     * Initial power offset for access. The base station shall set this field to the 
     * correction factor to be used by mobile stations in the open loop power estimate 
     * for the initial transmission on an Access Channel, expressed as a two's 
     * complement value in units of {{units}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>initialpwr</code>, or <code>null</code> if not present
     */
    java.lang.Short getInitialpwr();
    
    /**
     * Power increment. The base station shall set this field to the value by which 
     * mobile stations are to increase their transmit power between successive access 
     * probes in an access probe sequence, in units of {{units}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pwrStep</code>, or <code>null</code> if not present
     */
    java.lang.Short getPwrStep();
    
    /**
     * Number of access probes. The base station shall set this field to one less than 
     * the maximum number of access probes mobile stations are to transmit in a single 
     * access probe sequence.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>numStep</code>, or <code>null</code> if not present
     */
    java.lang.Short getNumStep();
    
    /**
     * Maximum Access Channel message capsule size. The base station shall set this 
     * field to the value in the range 0 to 7. {{param}} is set to three less than the 
     * maximum number of Access Channel frames in an Access Channel message capsule.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxCapSize</code>, or <code>null</code> if not present
     */
    java.lang.Short getMaxCapSize();
    
    /**
     * Access Channel preamble length. The base station shall set this field to one 
     * less than the number of Access Channel frames that mobile stations are to 
     * transmit in each Access Channel preamble.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>preambleSize</code>, or <code>null</code> if not present
     */
    java.lang.Short getPreambleSize();
    
    /**
     * Persistence value for access probes sent by mobiles with Access Overload calls 
     * values of 0 - 9. A value of 63 indicates such mobiles are not allowed to send 
     * access probes.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>psist09</code>, or <code>null</code> if not present
     */
    java.lang.Short getPsist09();
    
    /**
     * Persistence value for access probes sent by mobiles with Access Overload calls 
     * values of 10 (test Mobile). A value of 7 indicates such mobiles are not allowed 
     * to send access probes.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>psist10</code>, or <code>null</code> if not present
     */
    java.lang.Short getPsist10();
    
    /**
     * Persistence value for access probes sent by mobiles with Access Overload calls 
     * values of 11 (emergency Mobile). A value of 7 indicates such mobiles are not 
     * allowed to send access probes.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>psist11</code>, or <code>null</code> if not present
     */
    java.lang.Short getPsist11();
    
    /**
     * Persistence value for access probes sent by mobiles with Access Overload calls 
     * values of 12. A value of 7 indicates such mobiles are not allowed to send access
     * probes.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>psist12</code>, or <code>null</code> if not present
     */
    java.lang.Short getPsist12();
    
    /**
     * Persistence value for access probes sent by mobiles with Access Overload calls 
     * values of 13. A value of 7 indicates such mobiles are not allowed to send access
     * probes.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>psist13</code>, or <code>null</code> if not present
     */
    java.lang.Short getPsist13();
    
    /**
     * Persistence value for access probes sent by mobiles with Access Overload calls 
     * values of 14. A value of 7 indicates such mobiles are not allowed to send access
     * probes.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>psist14</code>, or <code>null</code> if not present
     */
    java.lang.Short getPsist14();
    
    /**
     * Persistence value for access probes sent by mobiles with Access Overload calls 
     * values of 15. A value of 7 indicates such mobiles are not allowed to send access
     * probes.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>psist15</code>, or <code>null</code> if not present
     */
    java.lang.Short getPsist15();
    
    /**
     * Persistence modifier for access channel attempts transmitting a message.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>msgPsist</code>, or <code>null</code> if not present
     */
    java.lang.Short getMsgPsist();
    
    /**
     * Persistence modifier for registration message transmission.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>regPsist</code>, or <code>null</code> if not present
     */
    java.lang.Short getRegPsist();
    
    /**
     * Time randomization for access channel probes.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>probePnRan</code>, or <code>null</code> if not present
     */
    java.lang.Short getProbePnRan();
    
    /**
     * Access transmission timeout. Two less than the time the mobile has to wait 
     * before determining that the probe is not received by the BSS. It is in 
     * {{units}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>accTmo</code>, or <code>null</code> if not present
     */
    java.lang.Short getAccTmo();
    
    /**
     * One less than maximum number for randomized delay between successive access 
     * probes in {{units}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>probeBkoff</code>, or <code>null</code> if not present
     */
    java.lang.Short getProbeBkoff();
    
    /**
     * One less than maximum number for randomized delay between successive access 
     * sequences in {{units}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>bkoff</code>, or <code>null</code> if not present
     */
    java.lang.Short getBkoff();
    
    /**
     * Maximum number of access probe sequences for an access request.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxReqSeq</code>, or <code>null</code> if not present
     */
    java.lang.Short getMaxReqSeq();
    
    /**
     * Maximum number of access probe sequences for an access response
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxRspSeq</code>, or <code>null</code> if not present
     */
    java.lang.Short getMaxRspSeq();

}

