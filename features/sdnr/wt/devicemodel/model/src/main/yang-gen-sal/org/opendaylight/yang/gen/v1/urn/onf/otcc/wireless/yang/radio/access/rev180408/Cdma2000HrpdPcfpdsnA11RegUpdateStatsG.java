package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

/**
 * This object is used in obtaining the A11 Registration Update stats for each 
 * PDSN.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-hrpd-pcfpdsn-a11-reg-update-stats-g {
 *     leaf pdsn-number-reg-update-perf {
 *         type int64;
 *     }
 *     leaf pdsnip-address-reg-update-perf {
 *         type ip-address;
 *     }
 *     leaf a11-reg-update-received-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-id-check-fail-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-auth-check-fail-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-for-unknown-psipdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-unspecified-reason-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-ppp-timeout-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-registration-timeout-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-pdsn-error-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-inter-pcf-handoff-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-inter-pdsn-handoff-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-pdsnoamp-intervention-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-accounting-error-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-user-failed-authentication-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-unknown-cause-code-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-without-reason-code-pdsn {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-hrpd-pcfpdsn-a11-reg-update-stats-g</i>
 *
 */
public interface Cdma2000HrpdPcfpdsnA11RegUpdateStatsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-pcfpdsn-a11-reg-update-stats-g").intern();

    /**
     * The PDSN Number
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pdsnNumberRegUpdatePerf</code>, or <code>null</code> if not present
     */
    java.lang.Long getPdsnNumberRegUpdatePerf();
    
    /**
     * The IP Address of the PDSN for which the A11 Reg Update stats is obtained
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>pdsnipAddressRegUpdatePerf</code>, or <code>null</code> if not present
     */
    IpAddress getPdsnipAddressRegUpdatePerf();
    
    /**
     * Number of A10 Reg-update messages receieved from a PDSN
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdateReceivedPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdateReceivedPdsn();
    
    /**
     * Number of A10 Reg-Update messages receieved from a PDSN that failed ID 
     * validation
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdateIdCheckFailPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdateIdCheckFailPdsn();
    
    /**
     * Number of A10 Reg-Update messages received from a PDSN that failed 
     * Authentication
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdateAuthCheckFailPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdateAuthCheckFailPdsn();
    
    /**
     * Number of A10 Reg-Update messages received from a PDSN with unknown PSI
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdateForUnknownPsipdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdateForUnknownPsipdsn();
    
    /**
     * Number of A10 Reg-Update messages received from a PDSN with unspecified reason 
     * code
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdateUnspecifiedReasonPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdateUnspecifiedReasonPdsn();
    
    /**
     * Number of A10 Reg-Update messages received from a PDSN with reason code "PPP 
     * Timeout"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdatePppTimeoutPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdatePppTimeoutPdsn();
    
    /**
     * Number of A10 Reg-Update messages received from a PDSN with reason code 
     * "Registration Timeout"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdateRegistrationTimeoutPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdateRegistrationTimeoutPdsn();
    
    /**
     * Number of A10 Reg-Update messages received from a PDSN with reason code "PDSN 
     * Error"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdatePdsnErrorPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdatePdsnErrorPdsn();
    
    /**
     * Number of A10 Reg-Update messages received from a PDSN with reason code "Inter 
     * PCF Handoff"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdateInterPcfHandoffPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdateInterPcfHandoffPdsn();
    
    /**
     * Number of A10 Reg-Update messages received from a PDSN with reason code "Inter 
     * PDSN Handoff"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdateInterPdsnHandoffPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdateInterPdsnHandoffPdsn();
    
    /**
     * Number of A10 Reg-Update messages received from a PDSN with reason code "PDSN 
     * OAMP Intervention"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdatePdsnoampInterventionPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdatePdsnoampInterventionPdsn();
    
    /**
     * Number of A10 Reg-Update messages received from a PDSN with reason code 
     * "Accounting Error"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdateAccountingErrorPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdateAccountingErrorPdsn();
    
    /**
     * Number of A10 Reg-Update messages received from a PDSN with reason code "User 
     * Failed Authentication"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdateUserFailedAuthenticationPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdateUserFailedAuthenticationPdsn();
    
    /**
     * Number of A10 Reg-Update messages received from a PDSN with Unknown Cause Code
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdateUnknownCauseCodePdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdateUnknownCauseCodePdsn();
    
    /**
     * Number of A10 Reg-Update messages received from a PDSN with PDSN Code Not 
     * Included
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegUpdateWithoutReasonCodePdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegUpdateWithoutReasonCodePdsn();

}

