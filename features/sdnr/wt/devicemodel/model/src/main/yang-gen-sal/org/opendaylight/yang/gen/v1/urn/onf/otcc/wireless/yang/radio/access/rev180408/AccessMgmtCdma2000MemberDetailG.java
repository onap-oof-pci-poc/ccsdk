package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;

/**
 * At most one enabled entry in this table can exist with a given value for IMSI 
 * and HRPDIdentifierValue. The IMSI field may be empty.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * grouping access-mgmt-cdma2000-member-detail-g {
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf imsi {
 *         type string;
 *     }
 *     leaf hrpd-identifier-type {
 *         type int64;
 *     }
 *     leaf hrpd-identifier-value {
 *         type string;
 *     }
 *     leaf membership-expires {
 *         type date-and-time;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/access-mgmt-cdma2000-member-detail-g</i>
 *
 */
public interface AccessMgmtCdma2000MemberDetailG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-cdma2000-member-detail-g").intern();

    /**
     * Enables or disables the {{object}} entry.
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
     * Type of identifier used for the HRPD AT. 0-invalid 1-ESN 2-MEID 3-A12NAI. If 
     * IMSI in this record is valid, then this attribute is set to 0.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>hrpdIdentifierType</code>, or <code>null</code> if not present
     */
    java.lang.Long getHrpdIdentifierType();
    
    /**
     * The value of this attribute depends on {{param|HRPDIdentifierType}}. ESN and 
     * MEID shall be defined as Hex.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>hrpdIdentifierValue</code>, or <code>null</code> if not present
     */
    java.lang.String getHrpdIdentifierValue();
    
    /**
     * The time that the current ACL membership expires.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>membershipExpires</code>, or <code>null</code> if not present
     */
    DateAndTime getMembershipExpires();

}

