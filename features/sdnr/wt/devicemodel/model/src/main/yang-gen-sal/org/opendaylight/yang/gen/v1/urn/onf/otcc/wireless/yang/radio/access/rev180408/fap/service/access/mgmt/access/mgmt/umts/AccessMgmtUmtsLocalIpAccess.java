package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtUmtsLocalIpAccessG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.AccessMgmt.UMTS.LocalIPAccess.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container access-mgmt-umts-local-ip-access {
 *     leaf enable {
 *         type enable;
 *     }
 *     uses access-mgmt-umts-local-ip-access-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/access-mgmt/access-mgmt-umts/access-mgmt-umts-local-ip-access</i>
 *
 * <p>To create instances of this class use {@link AccessMgmtUmtsLocalIpAccessBuilder}.
 * @see AccessMgmtUmtsLocalIpAccessBuilder
 *
 */
public interface AccessMgmtUmtsLocalIpAccess
    extends
    ChildOf<AccessMgmtUmts>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.umts.AccessMgmtUmtsLocalIpAccess>,
    AccessMgmtUmtsLocalIpAccessG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-umts-local-ip-access").intern();


}

