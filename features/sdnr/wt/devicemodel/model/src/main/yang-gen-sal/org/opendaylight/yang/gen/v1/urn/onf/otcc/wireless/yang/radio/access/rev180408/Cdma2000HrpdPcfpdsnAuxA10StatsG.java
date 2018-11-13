package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

/**
 * This object is used in obtaining the Auxillary A10 Connection stats for each 
 * PDSN
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping cdma2000-hrpd-pcfpdsn-aux-a10-stats-g {
 *     leaf pdsn-number-aux-a10-perf {
 *         type int64;
 *     }
 *     leaf pdsnip-address-aux-a10-perf {
 *         type ip-address;
 *     }
 *     leaf aux-a10-connections-created-in-first-reg-req-pdsn {
 *         type uint64;
 *     }
 *     leaf aux-a10-connections-created-in-subsequent-reg-req-pdsn {
 *         type uint64;
 *     }
 *     leaf aux-a10-fwd-ip-flows-created-pdsn {
 *         type uint64;
 *     }
 *     leaf aux-a10-rev-ip-flows-created-pdsn {
 *         type uint64;
 *     }
 *     leaf aux-a10-ip-flow-accounting-reg-requests-pdsn {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/cdma2000-hrpd-pcfpdsn-aux-a10-stats-g</i>
 *
 */
public interface Cdma2000HrpdPcfpdsnAuxA10StatsG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-pcfpdsn-aux-a10-stats-g").intern();

    /**
     * The PDSN Number
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pdsnNumberAuxA10Perf</code>, or <code>null</code> if not present
     */
    java.lang.Long getPdsnNumberAuxA10Perf();
    
    /**
     * The IP Address of the PDSN for which the PCF PDSN stats is obtained
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>pdsnipAddressAuxA10Perf</code>, or <code>null</code> if not present
     */
    IpAddress getPdsnipAddressAuxA10Perf();
    
    /**
     * Number of Auxillary A10 Connections Created in the First Registration Request 
     * Message to the PDSN
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>auxA10ConnectionsCreatedInFirstRegReqPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getAuxA10ConnectionsCreatedInFirstRegReqPdsn();
    
    /**
     * Number of Auxillary A10 Connections Created in Subsequent Registration Request 
     * Messages to the PDSN
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>auxA10ConnectionsCreatedInSubsequentRegReqPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getAuxA10ConnectionsCreatedInSubsequentRegReqPdsn();
    
    /**
     * Number of Forward IP Flows created with this PDSN for the Auxillary A10s
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>auxA10FwdIpFlowsCreatedPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getAuxA10FwdIpFlowsCreatedPdsn();
    
    /**
     * Number of Forward IP Flows created with this PDSN for the Auxillary A10s
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>auxA10RevIpFlowsCreatedPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getAuxA10RevIpFlowsCreatedPdsn();
    
    /**
     * Number of IP flow Accounting Reg Requests sent to the PDSN
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>auxA10IpFlowAccountingRegRequestsPdsn</code>, or <code>null</code> if not present
     */
    BigInteger getAuxA10IpFlowAccountingRegRequestsPdsn();

}

