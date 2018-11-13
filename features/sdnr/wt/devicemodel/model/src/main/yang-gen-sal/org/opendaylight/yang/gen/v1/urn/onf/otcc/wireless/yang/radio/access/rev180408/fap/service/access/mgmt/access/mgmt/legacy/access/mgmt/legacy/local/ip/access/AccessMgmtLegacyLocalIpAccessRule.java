package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtLegacyLocalIpAccessRuleG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.AccessMgmtLegacyLocalIpAccess;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.AccessMgmt.Legacy.LocalIPAccess.Rule.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list access-mgmt-legacy-local-ip-access-rule {
 *     key "dest-ip-address" "dest-subnet-mask" "protocol";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf dest-ip-address {
 *         type ip-address;
 *     }
 *     leaf dest-subnet-mask {
 *         type ip-address;
 *     }
 *     leaf protocol {
 *         type int64;
 *     }
 *     leaf action {
 *         type enumeration;
 *     }
 *     leaf interface {
 *         type string;
 *     }
 *     uses access-mgmt-legacy-local-ip-access-rule-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/access-mgmt/access-mgmt-legacy/access-mgmt-legacy-local-ip-access/access-mgmt-legacy-local-ip-access-rule</i>
 *
 * <p>To create instances of this class use {@link AccessMgmtLegacyLocalIpAccessRuleBuilder}.
 * @see AccessMgmtLegacyLocalIpAccessRuleBuilder
 * @see AccessMgmtLegacyLocalIpAccessRuleKey
 *
 */
public interface AccessMgmtLegacyLocalIpAccessRule
    extends
    ChildOf<AccessMgmtLegacyLocalIpAccess>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRule>,
    AccessMgmtLegacyLocalIpAccessRuleG,
    Identifiable<AccessMgmtLegacyLocalIpAccessRuleKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-legacy-local-ip-access-rule").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.legacy.access.mgmt.legacy.local.ip.access.AccessMgmtLegacyLocalIpAccessRuleKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AccessMgmtLegacyLocalIpAccessRuleKey getKey();

}

