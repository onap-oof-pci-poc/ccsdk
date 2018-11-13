package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000MemberDetailG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.AccessMgmt.CDMA2000.MemberDetail.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list access-mgmt-cdma2000-member-detail {
 *     key "imsi";
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
 *     uses access-mgmt-cdma2000-member-detail-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/access-mgmt/access-mgmt-cdma2000/access-mgmt-cdma2000-member-detail</i>
 *
 * <p>To create instances of this class use {@link AccessMgmtCdma2000MemberDetailBuilder}.
 * @see AccessMgmtCdma2000MemberDetailBuilder
 * @see AccessMgmtCdma2000MemberDetailKey
 *
 */
public interface AccessMgmtCdma2000MemberDetail
    extends
    ChildOf<AccessMgmtCdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetail>,
    AccessMgmtCdma2000MemberDetailG,
    Identifiable<AccessMgmtCdma2000MemberDetailKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-cdma2000-member-detail").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000MemberDetailKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AccessMgmtCdma2000MemberDetailKey getKey();

}

