package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtCdma2000LocalIpAccessHrpdG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.AccessMgmtCdma2000LocalIpAccess;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.access.mgmt.cdma2000.local.ip.access.hrpd.AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.AccessMgmt.CDMA2000.LocalIPAccess.HRPD.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container access-mgmt-cdma2000-local-ip-access-hrpd {
 *     leaf filter-type {
 *         type uint8;
 *     }
 *     leaf filter-in-use {
 *         type string;
 *     }
 *     leaf egress-filter-number-of-entries {
 *         type uint64;
 *     }
 *     list access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter {
 *         key "subnet" "subnet-mask";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf subnet {
 *             type ipv4-address;
 *         }
 *         leaf subnet-mask {
 *             type uint8;
 *         }
 *         uses access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter-g;
 *     }
 *     uses access-mgmt-cdma2000-local-ip-access-hrpd-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/access-mgmt/access-mgmt-cdma2000/access-mgmt-cdma2000-local-ip-access/access-mgmt-cdma2000-local-ip-access-hrpd</i>
 *
 * <p>To create instances of this class use {@link AccessMgmtCdma2000LocalIpAccessHrpdBuilder}.
 * @see AccessMgmtCdma2000LocalIpAccessHrpdBuilder
 *
 */
public interface AccessMgmtCdma2000LocalIpAccessHrpd
    extends
    ChildOf<AccessMgmtCdma2000LocalIpAccess>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.access.mgmt.cdma2000.access.mgmt.cdma2000.local.ip.access.AccessMgmtCdma2000LocalIpAccessHrpd>,
    AccessMgmtCdma2000LocalIpAccessHrpdG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt-cdma2000-local-ip-access-hrpd").intern();

    /**
     * List of object class 
     * FAPService.{i}.AccessMgmt.CDMA2000.LocalIPAccess.HRPD.EgressFilter.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>accessMgmtCdma2000LocalIpAccessHrpdEgressFilter</code>, or <code>null</code> if not present
     */
    List<AccessMgmtCdma2000LocalIpAccessHrpdEgressFilter> getAccessMgmtCdma2000LocalIpAccessHrpdEgressFilter();

}

