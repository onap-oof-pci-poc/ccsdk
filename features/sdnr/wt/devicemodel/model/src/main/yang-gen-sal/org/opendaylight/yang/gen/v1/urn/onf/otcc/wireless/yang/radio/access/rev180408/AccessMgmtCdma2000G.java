package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;

/**
 * This object contains configurable and observable attributes related to CDMA2000 
 * Access and Admission Control of the FAP.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping access-mgmt-cdma2000-g {
 *     leaf access-mode {
 *         type uint8;
 *     }
 *     leaf max-total-active-calls-allowed {
 *         type uint16;
 *     }
 *     leaf access-control-list {
 *         type string;
 *     }
 *     leaf max-member-detail-entries {
 *         type uint64;
 *     }
 *     leaf member-detail-number-of-entries {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/access-mgmt-cdma2000-g</i>
 *
 */
public interface AccessMgmtCdma2000G
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-cdma2000-g").intern();

    /**
     * Defines the access control mode of FAP. Allowed modes are Open, Closed, and 
     * Signaling Association (refer to {{bibref|3GPP2-A.S0024}}). AccessMode 2 (Hybrid)
     * is not applicable to CDMA2000 FAPs. 0- Open,1-Closed, 2-Reserved, 3-Signaling 
     * Association.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>accessMode</code>, or <code>null</code> if not present
     */
    java.lang.Short getAccessMode();
    
    /**
     * Total number of active calls allowed.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>maxTotalActiveCallsAllowed</code>, or <code>null</code> if not present
     */
    java.lang.Integer getMaxTotalActiveCallsAllowed();
    
    /**
     * {{list}} (maximum item length 15). Each entry is an IMSI.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>accessControlList</code>, or <code>null</code> if not present
     */
    java.lang.String getAccessControlList();
    
    /**
     * The maximum number of entries available in the 
     * {{object|.AccessMgmt.CDMA2000.MemberDetail.{i}.}} table.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxMemberDetailEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMaxMemberDetailEntries();
    
    /**
     * {{numentries}}
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memberDetailNumberOfEntries</code>, or <code>null</code> if not present
     */
    BigInteger getMemberDetailNumberOfEntries();

}

