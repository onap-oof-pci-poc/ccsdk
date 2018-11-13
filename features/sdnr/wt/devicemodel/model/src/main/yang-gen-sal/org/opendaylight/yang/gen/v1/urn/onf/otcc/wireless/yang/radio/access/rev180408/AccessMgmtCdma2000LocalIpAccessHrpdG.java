package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * Local IP access support as defined in 3GPP2
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping access-mgmt-cdma2000-local-ip-access-hrpd-g {
 *     leaf filter-type {
 *         type uint8;
 *     }
 *     leaf filter-in-use {
 *         type string;
 *     }
 *     leaf egress-filter-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/access-mgmt-cdma2000-local-ip-access-hrpd-g</i>
 *
 */
public interface AccessMgmtCdma2000LocalIpAccessHrpdG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-cdma2000-local-ip-access-hrpd-g").intern();

    /**
     * Value of '0' indicates that the FAP shall allow only IP packets with destination
     * address matching the local IP subnet on Local IP access interface. Value of '1' 
     * indicates that the FAP shall allow any IP packets with destination address 
     * matching either the local IP subnet or the subnets listed in Local IP egress 
     * filter parameter on Local IP access interface. Value of '2' indicates that the 
     * FAP shall allow any IP packets with destination addresses that do not match the 
     * Local IP egress filter parameter on Local IP access interface.Value of '3' 
     * indicates that the FAP shall allow any IP packets on the local IP address 
     * interface.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>filterType</code>, or <code>null</code> if not present
     */
    java.lang.Short getFilterType();
    
    /**
     * This parameter is set to the IPCP Vendor Specific Option which the FAP uses to 
     * send Local IP access packet filter on AN-PPP interface.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>filterInUse</code>, or <code>null</code> if not present
     */
    java.lang.String getFilterInUse();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>egressFilterNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getEgressFilterNumberOfEntries();

}

