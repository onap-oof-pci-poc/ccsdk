package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

/**
 * This object is used in obtaining the PCF PDSN stats for each PDSN
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-hrpd-pcfpdsn-pcfpdsn-stats-g {
 *     leaf a10-setup-attempts-pdsn {
 *         type uint64;
 *     }
 *     leaf a10-setup-successes-pdsn {
 *         type uint64;
 *     }
 *     leaf a10-setup-blocks-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-id-mismatch-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-unknown-pdsnpdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-no-reason-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-admin-prohibit-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-insuff-resources-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-failed-auth-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-malformed-req-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-unsupp-vend-id-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-reverse-tunnel-unavailable-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-reverse-tunnel-tbit-not-set-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-unknown-error-code-pdsn {
 *         type uint64;
 *     }
 *     leaf a10-reg-req-for-registration-retransmissions-pdsn {
 *         type uint64;
 *     }
 *     leaf a10-reg-req-for-re-registration-retransmissions-pdsn {
 *         type uint64;
 *     }
 *     leaf a10-reg-req-for-release-retransmissions-pdsn {
 *         type uint64;
 *     }
 *     leaf pdsn-number-pdsn-perf {
 *         type int64;
 *     }
 *     leaf pds-nip-address-pdsn-perf {
 *         type ip-address;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-hrpd-pcfpdsn-pcfpdsn-stats-g</i>
 *
 */
public interface Cdma2000HrpdPcfpdsnPcfpdsnStatsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-pcfpdsn-pcfpdsn-stats-g").intern();

    /**
     * Number of attempts the PCF made to establish an A10 connection with PDSN. If PCF
     * fails establishing such a connection on this PDSN and goes on to use another 
     * PDSN for that connection, it will be counted as two setup attempts.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10SetupAttemptsPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA10SetupAttemptsPdsn();
    
    /**
     * Number of times PCF succeeded in establishing an A10 connection with this PDSN.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10SetupSuccessesPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA10SetupSuccessesPdsn();
    
    /**
     * Number of times PCF was blocked in establishing an A10 connection with this 
     * PDSN.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10SetupBlocksPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA10SetupBlocksPdsn();
    
    /**
     * Number ofA11 Registration Request denied with a reason "Id Mismatch" (A11 error 
     * code: 0x85) by the PDSN
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegReqDeniedIdMismatchPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegReqDeniedIdMismatchPdsn();
    
    /**
     * Number of A11 Registration Request denied with a reason "Unknown PDSN" (A11 
     * error code: 0x88)by the PDSN.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegReqDeniedUnknownPdsnpdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegReqDeniedUnknownPdsnpdsn();
    
    /**
     * Number of A11 Registration Request denied with no reason code by the PDSN.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegReqDeniedNoReasonPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegReqDeniedNoReasonPdsn();
    
    /**
     * Number of A11 Registration Request denied with a reason "Admin Prohibited" (A11 
     * error code : 0x81) by the PDSN.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegReqDeniedAdminProhibitPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegReqDeniedAdminProhibitPdsn();
    
    /**
     * Number of A11 Registration Request denied with a reason "Insufficient Resources"
     * (A11 error code: 0x82) by the PDSN.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegReqDeniedInsuffResourcesPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegReqDeniedInsuffResourcesPdsn();
    
    /**
     * Number of A11 Registration Request denied with a reason "Mobile Node 
     * Authentication Failure" (A11 error code: 0x83) by the PDSN.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegReqDeniedFailedAuthPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegReqDeniedFailedAuthPdsn();
    
    /**
     * Number of A11 Registration Request denied with a reason "Malformed Request" (A11
     * error code: 0x86) by the PDSN
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegReqDeniedMalformedReqPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegReqDeniedMalformedReqPdsn();
    
    /**
     * Number ofA11 Registration Request denied with a reason "Unsupported Vendor Id" 
     * (A11 error code: 0x8D)by the PDSN
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegReqDeniedUnsuppVendIdPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegReqDeniedUnsuppVendIdPdsn();
    
    /**
     * Number ofA11 Registration Request denied with a reason "Reverse Tunnel 
     * Unavailable" (A11 error code: 0x89)by the PDSN
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegReqDeniedReverseTunnelUnavailablePdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegReqDeniedReverseTunnelUnavailablePdsn();
    
    /**
     * Number ofA11 Registration Request denied with a reason "Reverse Tunnel Tbit Not 
     * Set" (A11 error code: 0x8A)by the PDSN
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegReqDeniedReverseTunnelTbitNotSetPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegReqDeniedReverseTunnelTbitNotSetPdsn();
    
    /**
     * Number of A11 Registration Request denied with an unspecified reason (A11 error 
     * code : 0x80) by the PDSN
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11RegReqDeniedUnknownErrorCodePdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11RegReqDeniedUnknownErrorCodePdsn();
    
    /**
     * Number of A11 Registration Requests retransmitted during A10 setup
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10RegReqForRegistrationRetransmissionsPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA10RegReqForRegistrationRetransmissionsPdsn();
    
    /**
     * Number of A11 Registration Requests retransmitted during A10 reregistration
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10RegReqForReRegistrationRetransmissionsPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA10RegReqForReRegistrationRetransmissionsPdsn();
    
    /**
     * Number of A11 Registration Requests retransmitted during A10 realease
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10RegReqForReleaseRetransmissionsPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA10RegReqForReleaseRetransmissionsPdsn();
    
    /**
     * The PDSN Number
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pdsnNumberPdsnPerf</code>, or <code>null</code> if not present
     */
    java.lang.Long getPdsnNumberPdsnPerf();
    
    /**
     * The IP Address of the PDSN for which the PCF PDSN stats is obtained
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>pdsNipAddressPdsnPerf</code>, or <code>null</code> if not present
     */
    IpAddress getPdsNipAddressPdsnPerf();

}

