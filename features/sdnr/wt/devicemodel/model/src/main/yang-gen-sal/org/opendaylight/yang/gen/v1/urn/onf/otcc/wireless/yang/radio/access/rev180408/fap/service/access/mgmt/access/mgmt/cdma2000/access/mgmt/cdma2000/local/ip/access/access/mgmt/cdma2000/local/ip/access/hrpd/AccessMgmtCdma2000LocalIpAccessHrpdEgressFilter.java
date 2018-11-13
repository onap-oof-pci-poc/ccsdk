package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.AccessMgmt.CDMA2000.LocalIPAccess.HRPD.EgressFilter.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter {
 *     key "subnet" "subnet-mask";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf subnet {
 *         type ipv4-address;
 *     }
 *     leaf subnet-mask {
 *         type uint8;
 *     }
 *     uses access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/access-mgmt/access-mgmt-cdma2000/access-mgmt-cdma2000-local-ip-access/access-mgmt-cdma2000-local-ip-access-hrpd/access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter</i>
 *
 * <p>To create instances of this class use {@link AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder}.
 * @see AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterBuilder
 * @see AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey
 *
 */
public interface AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter
    extends
    ChildOf<AccessMgmtCdma2000LocalIpAccessHrpd>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter>,
    AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterG,
    Identifiable<AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AccessMgmtCdma2000LocalIpAccessHrpdEgressFilterKey getKey();

}

