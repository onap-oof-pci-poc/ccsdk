package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsMemberDetailG;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.AccessMgmt.UMTS.MemberDetail.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list access-mgmt-umts-member-detail {
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
 *     leaf msisdn {
 *         type string;
 *     }
 *     leaf membership-expires {
 *         type date-and-time;
 *     }
 *     uses access-mgmt-umts-member-detail-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/access-mgmt/access-mgmt-umts/access-mgmt-umts-member-detail</i>
 *
 * <p>To create instances of this class use {@link AccessMgmtUmtsMemberDetailBuilder}.
 * @see AccessMgmtUmtsMemberDetailBuilder
 * @see AccessMgmtUmtsMemberDetailKey
 *
 */
public interface AccessMgmtUmtsMemberDetail
    extends
    ChildOf<AccessMgmtUmts>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetail>,
    AccessMgmtUmtsMemberDetailG,
    Identifiable<AccessMgmtUmtsMemberDetailKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-umts-member-detail").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsMemberDetailKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AccessMgmtUmtsMemberDetailKey getKey();

}

