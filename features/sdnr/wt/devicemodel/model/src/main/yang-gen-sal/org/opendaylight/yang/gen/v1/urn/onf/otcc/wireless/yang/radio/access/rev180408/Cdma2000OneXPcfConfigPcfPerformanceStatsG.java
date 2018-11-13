package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object is used in obtaining the PCF stats
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-one-x-pcf-config-pcf-performance-stats-g {
 *     leaf a10-setup-failure-no-reason {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-admin-prohibit {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-insuff-resources {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-failed-auth {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-id-mismatch {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-malformed-req {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-unknown-pdsn {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-unsupp-vend-id {
 *         type uint64;
 *     }
 *     leaf total-a10-closed-by-rnc {
 *         type uint64;
 *     }
 *     leaf total-a10-closed-by-pdsn {
 *         type uint64;
 *     }
 *     leaf total-a10-success-pages {
 *         type uint64;
 *     }
 *     leaf total-a10-failed-pages {
 *         type uint64;
 *     }
 *     leaf total-a10-ingress-bytes {
 *         type total-a10-ingress-bytes;
 *     }
 *     leaf total-a10-egress-bytes {
 *         type total-a10-egress-bytes;
 *     }
 *     leaf a10-reg-update-received {
 *         type uint64;
 *     }
 *     leaf total-a10-dropped-pages {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-one-x-pcf-config-pcf-performance-stats-g</i>
 *
 */
public interface Cdma2000OneXPcfConfigPcfPerformanceStatsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-pcf-config-pcf-performance-stats-g").intern();

    /**
     * Number of times the PCF was refused an A10 connection with an unspecified reason
     * (A11 error code : 0x80)
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10SetupFailureNoReason</code>, or <code>null</code> if not present
     */
    BigInteger getA10SetupFailureNoReason();
    
    /**
     * Number of times the PCF was refused an A10 connection with a reason "Admin 
     * Prohibited" (A11 error code : 0x81).
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10SetupFailureAdminProhibit</code>, or <code>null</code> if not present
     */
    BigInteger getA10SetupFailureAdminProhibit();
    
    /**
     * Number of times the PCF was refused an A10 connection with a reason 
     * "Insufficient Resources" (A11 error code: 0x82).
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10SetupFailureInsuffResources</code>, or <code>null</code> if not present
     */
    BigInteger getA10SetupFailureInsuffResources();
    
    /**
     * Number of times the PCF was refused an A10 connection with a reason "Mobile Node
     * Authentication Failure" (A11 error code: 0x83).
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10SetupFailureFailedAuth</code>, or <code>null</code> if not present
     */
    BigInteger getA10SetupFailureFailedAuth();
    
    /**
     * Number of times the PCF was refused an A10 connection with a reason "Id 
     * Mismatch" (A11 error code: 0x85)
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10SetupFailureIdMismatch</code>, or <code>null</code> if not present
     */
    BigInteger getA10SetupFailureIdMismatch();
    
    /**
     * Number of times the PCF was refused an A10 connection with a reason "Malformed 
     * Request" (A11 error code: 0x86)
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10SetupFailureMalformedReq</code>, or <code>null</code> if not present
     */
    BigInteger getA10SetupFailureMalformedReq();
    
    /**
     * Number of times the PCF was refused an A10 connection with a reason "Unknown 
     * PDSN" (A11 error code: 0x88)
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10SetupFailureUnknownPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA10SetupFailureUnknownPdsn();
    
    /**
     * Number of times the PCF was refused an A10 connection with a reason "Unsupported
     * Vendor Id" (A11 error code: 0x89)
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10SetupFailureUnsuppVendId</code>, or <code>null</code> if not present
     */
    BigInteger getA10SetupFailureUnsuppVendId();
    
    /**
     * Number of A10 closed by the FAP RNC.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>totalA10ClosedByRnc</code>, or <code>null</code> if not present
     */
    BigInteger getTotalA10ClosedByRnc();
    
    /**
     * Number of A10 closed by the PDSN.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>totalA10ClosedByPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getTotalA10ClosedByPdsn();
    
    /**
     * Numebr of A10 Pages initiated by PCFsucceeded.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>totalA10SuccessPages</code>, or <code>null</code> if not present
     */
    BigInteger getTotalA10SuccessPages();
    
    /**
     * Numebr of A10 Pages initiated by PCF failed.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>totalA10FailedPages</code>, or <code>null</code> if not present
     */
    BigInteger getTotalA10FailedPages();
    
    /**
     * Number of {{units}} received from the PDSN.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>totalA10IngressBytes</code>, or <code>null</code> if not present
     */
    BigInteger getTotalA10IngressBytes();
    
    /**
     * Number of {{units}} transmitted to the PDSN
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>totalA10EgressBytes</code>, or <code>null</code> if not present
     */
    BigInteger getTotalA10EgressBytes();
    
    /**
     * Number of A10 Registration updates received by the FAP PCF
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a10RegUpdateReceived</code>, or <code>null</code> if not present
     */
    BigInteger getA10RegUpdateReceived();
    
    /**
     * Number of A10 Pages initiated by PCF dropped
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>totalA10DroppedPages</code>, or <code>null</code> if not present
     */
    BigInteger getTotalA10DroppedPages();

}

