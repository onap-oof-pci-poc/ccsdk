package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;

/**
 * Details for CSG and Non-CSG members.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping access-mgmt-umts-member-detail-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf imsi {
 *         type string;
 *     }
 *     leaf msisdn {
 *         type string;
 *     }
 *     leaf membership-expires {
 *         type date-and-time;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/access-mgmt-umts-member-detail-g</i>
 *
 */
public interface AccessMgmtUmtsMemberDetailG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-umts-member-detail-g").intern();

    /**
     * Enables or disables the MemberDetail entry.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnable();
    
    /**
     * {{datatype|expand}}
     *
     *
     *
     * @return <code>java.lang.String</code> <code>alias</code>, or <code>null</code> if not present
     */
    java.lang.String getAlias();
    
    /**
     * International Mobile Subscriber Identity of the UE.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>imsi</code>, or <code>null</code> if not present
     */
    java.lang.String getImsi();
    
    /**
     * Mobile Station International Subscriber Identity Number. Set to {{empty}} if 
     * unknown.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>msisdn</code>, or <code>null</code> if not present
     */
    java.lang.String getMsisdn();
    
    /**
     * Time when the ACL membership expires. An Unknown Time value, as defined in 
     * {{bibref|TR-106a2|Section 3.2}}, indicates that the membership doesn't expire. 
     * Upon expiry the FAP MUST remove the IMSI from the 
     * {{param|.AccessMgmt.UMTS.AccessControlList}}, but the entry in 
     * {{object|.AccessMgmt.UMTS.MemberDetail.{i}.}} remains. {{bibref|3GPP-TS.22.011}}
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>membershipExpires</code>, or <code>null</code> if not present
     */
    DateAndTime getMembershipExpires();

}

