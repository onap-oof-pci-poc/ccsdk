package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.lte.AccessMgmtLteLocalIpAccess;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLteG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.AccessMgmt.LTE.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container access-mgmt-lte {
 *     leaf access-mode {
 *         type access-mode;
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
 *     leaf csgid {
 *         type uint32;
 *     }
 *     leaf hnb-name {
 *         type string;
 *     }
 *     container access-mgmt-lte-local-ip-access {
 *         leaf enable {
 *             type enable;
 *         }
 *         uses access-mgmt-lte-local-ip-access-g;
 *     }
 *     uses access-mgmt-lte-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/access-mgmt/access-mgmt-lte</i>
 *
 * <p>To create instances of this class use {@link AccessMgmtLteBuilder}.
 * @see AccessMgmtLteBuilder
 *
 */
public interface AccessMgmtLte
    extends
    ChildOf<AccessMgmt>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte>,
    AccessMgmtLteG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-lte").intern();

    /**
     * Container for object class FAPService.{i}.AccessMgmt.LTE.LocalIPAccess.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.lte.AccessMgmtLteLocalIpAccess</code> <code>accessMgmtLteLocalIpAccess</code>, or <code>null</code> if not present
     */
    AccessMgmtLteLocalIpAccess getAccessMgmtLteLocalIpAccess();

}

