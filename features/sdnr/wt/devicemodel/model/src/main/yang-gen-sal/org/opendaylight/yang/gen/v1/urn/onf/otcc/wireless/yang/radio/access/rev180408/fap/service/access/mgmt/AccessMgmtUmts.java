package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsLocalIpAccess;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.AccessMgmt.UMTS.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container access-mgmt-umts {
 *     leaf access-mode {
 *         type access-mode;
 *     }
 *     leaf non-csgue-access-decision {
 *         type non-csgue-access-decision;
 *     }
 *     leaf csg-membership-determined-locally {
 *         type csg-membership-determined-locally;
 *     }
 *     leaf max-u-es-served {
 *         type max-u-es-served;
 *     }
 *     leaf max-csg-members {
 *         type max-csg-members;
 *     }
 *     leaf max-non-csg-members {
 *         type max-non-csg-members;
 *     }
 *     leaf max-resource-non-csg-members {
 *         type uint8;
 *     }
 *     leaf hnb-name {
 *         type string;
 *     }
 *     leaf csgid {
 *         type uint32;
 *     }
 *     leaf-list access-control-list {
 *         type string;
 *     }
 *     leaf max-member-detail-entries {
 *         type uint64;
 *     }
 *     leaf member-detail-number-of-entries {
 *         type uint64;
 *     }
 *     list access-mgmt-umts-member-detail {
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
 *         leaf msisdn {
 *             type string;
 *         }
 *         leaf membership-expires {
 *             type date-and-time;
 *         }
 *         uses access-mgmt-umts-member-detail-g;
 *     }
 *     container access-mgmt-umts-local-ip-access {
 *         leaf enable {
 *             type enable;
 *         }
 *         uses access-mgmt-umts-local-ip-access-g;
 *     }
 *     uses access-mgmt-umts-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/access-mgmt/access-mgmt-umts</i>
 *
 * <p>To create instances of this class use {@link AccessMgmtUmtsBuilder}.
 * @see AccessMgmtUmtsBuilder
 *
 */
public interface AccessMgmtUmts
    extends
    ChildOf<AccessMgmt>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts>,
    AccessMgmtUmtsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-umts").intern();

    /**
     * List of object class FAPService.{i}.AccessMgmt.UMTS.MemberDetail.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>accessMgmtUmtsMemberDetail</code>, or <code>null</code> if not present
     */
    List<AccessMgmtUmtsMemberDetail> getAccessMgmtUmtsMemberDetail();
    
    /**
     * Container for object class FAPService.{i}.AccessMgmt.UMTS.LocalIPAccess.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsLocalIpAccess</code> <code>accessMgmtUmtsLocalIpAccess</code>, or <code>null</code> if not present
     */
    AccessMgmtUmtsLocalIpAccess getAccessMgmtUmtsLocalIpAccess();

}

