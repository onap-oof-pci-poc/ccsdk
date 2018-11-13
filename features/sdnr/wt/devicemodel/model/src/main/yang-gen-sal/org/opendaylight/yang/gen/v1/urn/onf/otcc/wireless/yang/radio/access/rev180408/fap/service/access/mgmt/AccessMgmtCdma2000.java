package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000G;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.AccessMgmt.CDMA2000.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container access-mgmt-cdma2000 {
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
 *     list access-mgmt-cdma2000-member-detail {
 *         key "imsi";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf imsi {
 *             type string;
 *         }
 *         leaf hrpd-identifier-type {
 *             type int64;
 *         }
 *         leaf hrpd-identifier-value {
 *             type string;
 *         }
 *         leaf membership-expires {
 *             type date-and-time;
 *         }
 *         uses access-mgmt-cdma2000-member-detail-g;
 *     }
 *     container access-mgmt-cdma2000-local-ip-access {
 *         container access-mgmt-cdma2000-local-ip-access-hrpd {
 *             leaf filter-type {
 *                 type uint8;
 *             }
 *             leaf filter-in-use {
 *                 type string;
 *             }
 *             leaf egress-filter-number-of-entries {
 *                 type uint64;
 *             }
 *             list access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter {
 *                 key "subnet" "subnet-mask";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf subnet {
 *                     type ipv4-address;
 *                 }
 *                 leaf subnet-mask {
 *                     type uint8;
 *                 }
 *                 uses access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter-g;
 *             }
 *             uses access-mgmt-cdma2000-local-ip-access-hrpd-g;
 *         }
 *         uses access-mgmt-cdma2000-local-ip-access-g;
 *     }
 *     uses access-mgmt-cdma2000-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/access-mgmt/access-mgmt-cdma2000</i>
 *
 * <p>To create instances of this class use {@link AccessMgmtCdma2000Builder}.
 * @see AccessMgmtCdma2000Builder
 *
 */
public interface AccessMgmtCdma2000
    extends
    ChildOf<AccessMgmt>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000>,
    AccessMgmtCdma2000G
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-cdma2000").intern();

    /**
     * List of object class FAPService.{i}.AccessMgmt.CDMA2000.MemberDetail.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>accessMgmtCdma2000MemberDetail</code>, or <code>null</code> if not present
     */
    List<AccessMgmtCdma2000MemberDetail> getAccessMgmtCdma2000MemberDetail();
    
    /**
     * Container for object class FAPService.{i}.AccessMgmt.CDMA2000.LocalIPAccess.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess</code> <code>accessMgmtCdma2000LocalIpAccess</code>, or <code>null</code> if not present
     */
    AccessMgmtCdma2000LocalIpAccess getAccessMgmtCdma2000LocalIpAccess();

}

