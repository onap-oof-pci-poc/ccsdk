package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLegacy;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.AccessMgmt.Legacy.LocalIPAccess.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container access-mgmt-legacy-local-ip-access {
 *     leaf enable {
 *         type enable;
 *     }
 *     leaf max-rules-entries {
 *         type uint64;
 *     }
 *     leaf rule-number-of-entries {
 *         type uint64;
 *     }
 *     list access-mgmt-legacy-local-ip-access-rule {
 *         key "dest-ip-address" "dest-subnet-mask" "protocol";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf dest-ip-address {
 *             type ip-address;
 *         }
 *         leaf dest-subnet-mask {
 *             type ip-address;
 *         }
 *         leaf protocol {
 *             type int64;
 *         }
 *         leaf action {
 *             type enumeration;
 *         }
 *         leaf interface {
 *             type string;
 *         }
 *         uses access-mgmt-legacy-local-ip-access-rule-g;
 *     }
 *     uses access-mgmt-legacy-local-ip-access-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/access-mgmt/access-mgmt-legacy/access-mgmt-legacy-local-ip-access</i>
 *
 * <p>To create instances of this class use {@link AccessMgmtLegacyLocalIpAccessBuilder}.
 * @see AccessMgmtLegacyLocalIpAccessBuilder
 *
 */
public interface AccessMgmtLegacyLocalIpAccess
    extends
    ChildOf<AccessMgmtLegacy>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess>,
    AccessMgmtLegacyLocalIpAccessG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-legacy-local-ip-access").intern();

    /**
     * List of object class FAPService.{i}.AccessMgmt.Legacy.LocalIPAccess.Rule.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>accessMgmtLegacyLocalIpAccessRule</code>, or <code>null</code> if not present
     */
    List<AccessMgmtLegacyLocalIpAccessRule> getAccessMgmtLegacyLocalIpAccessRule();

}

