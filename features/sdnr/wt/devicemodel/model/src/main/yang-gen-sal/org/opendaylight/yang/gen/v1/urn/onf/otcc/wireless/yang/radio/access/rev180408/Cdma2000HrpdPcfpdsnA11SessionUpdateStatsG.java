package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

/**
 * This object is used in obtaining the A11 Session Update stats for each PDSN
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-hrpd-pcfpdsn-a11-session-update-stats-g {
 *     leaf pdsn-number-session-update-perf {
 *         type int64;
 *     }
 *     leaf pdsnip-address-session-update-perf {
 *         type ip-address;
 *     }
 *     leaf a11-session-update-received-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-accepted-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-extended-apipdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-for-unknown-psipdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-id-check-fail-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-auth-check-fail-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-reason-unspecified-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-poorly-formed-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-session-params-not-updated-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-qo-s-profile-id-not-supported-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-insufficient-resources-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-handoff-in-progress-pdsn {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-hrpd-pcfpdsn-a11-session-update-stats-g</i>
 *
 */
public interface Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-pcfpdsn-a11-session-update-stats-g").intern();

    /**
     * The PDSN Number
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pdsnNumberSessionUpdatePerf</code>, or <code>null</code> if not present
     */
    java.lang.Long getPdsnNumberSessionUpdatePerf();
    
    /**
     * The IP Address of the PDSN for which the A11 Session Update stats is obtained
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>pdsnipAddressSessionUpdatePerf</code>, or <code>null</code> if not present
     */
    IpAddress getPdsnipAddressSessionUpdatePerf();
    
    /**
     * Number of A11 Session Updates received from a PDSN
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11SessionUpdateReceivedPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11SessionUpdateReceivedPdsn();
    
    /**
     * Number of A11 Session Updates accepted for a PDSN
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11SessionUpdateAcceptedPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11SessionUpdateAcceptedPdsn();
    
    /**
     * Number of A11 Session Updates received from this PDSN that contained extended 
     * API
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11SessionUpdateExtendedApipdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11SessionUpdateExtendedApipdsn();
    
    /**
     * Number of A11 Session Updates received from this PDSN that conatained unknown 
     * PSI
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11SessionUpdateForUnknownPsipdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11SessionUpdateForUnknownPsipdsn();
    
    /**
     * Number of A11 Session Updates received from this PDSN denied due to reason code 
     * "ID Check Failed "
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11SessionUpdateDeniedIdCheckFailPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11SessionUpdateDeniedIdCheckFailPdsn();
    
    /**
     * Number of A11 Session Updates received from this PDSN denied due to reason 
     * code"Auth Check Failed"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11SessionUpdateDeniedAuthCheckFailPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11SessionUpdateDeniedAuthCheckFailPdsn();
    
    /**
     * Number of A11 Session Updates received from this PDSN denied due to reason code 
     * "Unspecified Reason"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11SessionUpdateDeniedReasonUnspecifiedPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11SessionUpdateDeniedReasonUnspecifiedPdsn();
    
    /**
     * Number of A11 Session Updates received from this PDSN denied due to reason code 
     * "Poorly Formed"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11SessionUpdateDeniedPoorlyFormedPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11SessionUpdateDeniedPoorlyFormedPdsn();
    
    /**
     * Number of A11 Session Updates received from this PDSN denied due to reason code 
     * "Parameters Not Updated"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11SessionUpdateDeniedSessionParamsNotUpdatedPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11SessionUpdateDeniedSessionParamsNotUpdatedPdsn();
    
    /**
     * Number of A11 Session Updates received from this PDSN denied due to reason code 
     * "QoS Profile Id Not Updated"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11SessionUpdateDeniedQoSProfileIdNotSupportedPdsn();
    
    /**
     * Number of A11 Session Updates received from this PDSN denied due to reason code 
     * "Insufficient Resources"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11SessionUpdateDeniedInsufficientResourcesPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11SessionUpdateDeniedInsufficientResourcesPdsn();
    
    /**
     * Number of A11 Session Updates received from this PDSN denied due to reason 
     * code"Handoff In Progress"
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>a11SessionUpdateDeniedHandoffInProgressPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getA11SessionUpdateDeniedHandoffInProgressPdsn();

}

