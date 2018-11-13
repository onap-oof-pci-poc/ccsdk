package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object contains parameters related to miscellaneous RRC timers and 
 * constants.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping umts-ran-rrc-timers-g {
 *     leaf t300 {
 *         type t300;
 *     }
 *     leaf t301 {
 *         type t301;
 *     }
 *     leaf t302 {
 *         type t302;
 *     }
 *     leaf t304 {
 *         type t304;
 *     }
 *     leaf t305 {
 *         type t305;
 *     }
 *     leaf t307 {
 *         type t307;
 *     }
 *     leaf t308 {
 *         type t308;
 *     }
 *     leaf t309 {
 *         type t309;
 *     }
 *     leaf t310 {
 *         type t310;
 *     }
 *     leaf t311 {
 *         type t311;
 *     }
 *     leaf t312 {
 *         type t312;
 *     }
 *     leaf t313 {
 *         type t313;
 *     }
 *     leaf t314 {
 *         type t314;
 *     }
 *     leaf t315 {
 *         type t315;
 *     }
 *     leaf t316 {
 *         type t316;
 *     }
 *     leaf t317 {
 *         type t317;
 *     }
 *     leaf n300 {
 *         type n300;
 *     }
 *     leaf n301 {
 *         type n301;
 *     }
 *     leaf n302 {
 *         type n302;
 *     }
 *     leaf n304 {
 *         type n304;
 *     }
 *     leaf n310 {
 *         type n310;
 *     }
 *     leaf n312 {
 *         type n312;
 *     }
 *     leaf n313 {
 *         type n313;
 *     }
 *     leaf n315 {
 *         type n315;
 *     }
 *     leaf wait-time {
 *         type wait-time;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/umts-ran-rrc-timers-g</i>
 *
 */
public interface UmtsRanRrcTimersG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-rrc-timers-g").intern();

    /**
     * Timer measured in {{units}}. Only the following values are considered valid: 
     * :100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, 
     * and 8000 Any value other than those and the CPE MUST reject the request. Defined
     * in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>t300</code>, or <code>null</code> if not present
     */
    java.lang.Integer getT300();
    
    /**
     * Timer measured in {{units}}. Only the following values are considered valid: 
     * :100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, 
     * and 8000 Any value other than those and the CPE MUST reject the request. Defined
     * in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and section 10.3.3.44}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>t301</code>, or <code>null</code> if not present
     */
    java.lang.Integer getT301();
    
    /**
     * Timer measured in {{units}}. Only the following values are considered valid: 
     * :100, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000, 3000, 4000, 6000, 
     * and 8000 Any value other than those and the CPE MUST reject the request. Defined
     * in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 10.3.3.44}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>t302</code>, or <code>null</code> if not present
     */
    java.lang.Integer getT302();
    
    /**
     * Timer measured in {{units}}. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 
     * 13.1 and Section 10.3.3.44}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>t304</code>, or <code>null</code> if not present
     */
    java.lang.Integer getT304();
    
    /**
     * Timer measured in {{units}}. -1 indicates an unbounded timer in which there is 
     * no update. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 
     * 10.3.3.44}}.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>t305</code>, or <code>null</code> if not present
     */
    java.lang.Long getT305();
    
    /**
     * Timer measured in {{units}}. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 
     * 13.1 and Section 10.3.3.44}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>t307</code>, or <code>null</code> if not present
     */
    java.lang.Short getT307();
    
    /**
     * Timer measured in {{units}}. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 
     * 13.1 and Section 10.3.3.44}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>t308</code>, or <code>null</code> if not present
     */
    java.lang.Integer getT308();
    
    /**
     * Timer measured in {{units}}. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 
     * 13.1 and Section 10.3.3.44}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>t309</code>, or <code>null</code> if not present
     */
    java.lang.Short getT309();
    
    /**
     * Timer measured in {{units}}. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 
     * 13.1 and Section 10.3.3.44}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>t310</code>, or <code>null</code> if not present
     */
    java.lang.Integer getT310();
    
    /**
     * Timer measured in {{units}}. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 
     * 13.1 and Section 10.3.3.43}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>t311</code>, or <code>null</code> if not present
     */
    java.lang.Integer getT311();
    
    /**
     * Timer measured in {{units}}. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 
     * 13.1 and Section 10.3.3.44}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>t312</code>, or <code>null</code> if not present
     */
    java.lang.Short getT312();
    
    /**
     * Timer measured in {{units}}. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 
     * 13.1 and Section 10.3.3.43}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>t313</code>, or <code>null</code> if not present
     */
    java.lang.Short getT313();
    
    /**
     * Timer measured in {{units}}. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 
     * 13.1 and Section 10.3.3.43}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>t314</code>, or <code>null</code> if not present
     */
    java.lang.Short getT314();
    
    /**
     * Timer measured in {{units}}. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 
     * 13.1 and Section 10.3.3.43}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>t315</code>, or <code>null</code> if not present
     */
    java.lang.Integer getT315();
    
    /**
     * Timer measured in {{units}}. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 
     * 13.1 and Section 10.3.3.43}}. -1 indicates an unbounded timer in which there is 
     * no update.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>t316</code>, or <code>null</code> if not present
     */
    java.lang.Long getT316();
    
    /**
     * Timer measured in {{units}}. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 
     * 13.1 and Section 10.3.3.43}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>t317</code>, or <code>null</code> if not present
     */
    java.lang.Integer getT317();
    
    /**
     * Counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 
     * 10.3.3.44}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>n300</code>, or <code>null</code> if not present
     */
    java.lang.Short getN300();
    
    /**
     * Counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 
     * 10.3.3.43}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>n301</code>, or <code>null</code> if not present
     */
    java.lang.Short getN301();
    
    /**
     * Counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 
     * 10.3.3.43}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>n302</code>, or <code>null</code> if not present
     */
    java.lang.Short getN302();
    
    /**
     * Counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 
     * 10.3.3.43}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>n304</code>, or <code>null</code> if not present
     */
    java.lang.Short getN304();
    
    /**
     * Counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 
     * 10.3.3.43}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>n310</code>, or <code>null</code> if not present
     */
    java.lang.Short getN310();
    
    /**
     * Counter. Only the following values are considered valid: 1, 2, 4, 10, 20, 50, 
     * 100, 200, 400, 600, 800, and 1000. Any value other than those and the CPE MUST 
     * reject the request. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and 
     * Section 10.3.3.44}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>n312</code>, or <code>null</code> if not present
     */
    java.lang.Integer getN312();
    
    /**
     * Counter. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and Section 
     * 10.3.3.43}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>n313</code>, or <code>null</code> if not present
     */
    java.lang.Short getN313();
    
    /**
     * Counter. Only the following values are considered valid: :1, 2, 4, 10, 20, 50, 
     * 100, 200, 400, 600, 800, and 1000. Any value other than those and the CPE MUST 
     * reject the request. Defined in SIB1 {{bibref|3GPP-TS.25.331|Section 13.1 and 
     * Section 10.3.3.43}}.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>n315</code>, or <code>null</code> if not present
     */
    java.lang.Integer getN315();
    
    /**
     * Time period the UE has to wait before repeating the rejected procedure. This is 
     * an IE used when sending RRC connection reject, redirecting the requesting UE to 
     * another frequency. 0 indicates that repetition is not allowed. 
     * {{bibref|3GPP-TS.25.331|Section 10.3.3.50}}.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>waitTime</code>, or <code>null</code> if not present
     */
    java.lang.Short getWaitTime();

}

