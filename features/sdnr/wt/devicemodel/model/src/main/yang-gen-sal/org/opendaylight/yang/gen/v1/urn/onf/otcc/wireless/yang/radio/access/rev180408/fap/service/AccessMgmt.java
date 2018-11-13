package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLegacy;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.AccessMgmtG;

/**
 * Container for object class FAPService.{i}.AccessMgmt.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container access-mgmt {
 *     container access-mgmt-umts {
 *         leaf access-mode {
 *             type access-mode;
 *         }
 *         leaf non-csgue-access-decision {
 *             type non-csgue-access-decision;
 *         }
 *         leaf csg-membership-determined-locally {
 *             type csg-membership-determined-locally;
 *         }
 *         leaf max-u-es-served {
 *             type max-u-es-served;
 *         }
 *         leaf max-csg-members {
 *             type max-csg-members;
 *         }
 *         leaf max-non-csg-members {
 *             type max-non-csg-members;
 *         }
 *         leaf max-resource-non-csg-members {
 *             type uint8;
 *         }
 *         leaf hnb-name {
 *             type string;
 *         }
 *         leaf csgid {
 *             type uint32;
 *         }
 *         leaf-list access-control-list {
 *             type string;
 *         }
 *         leaf max-member-detail-entries {
 *             type uint64;
 *         }
 *         leaf member-detail-number-of-entries {
 *             type uint64;
 *         }
 *         list access-mgmt-umts-member-detail {
 *             key "imsi";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf imsi {
 *                 type string;
 *             }
 *             leaf msisdn {
 *                 type string;
 *             }
 *             leaf membership-expires {
 *                 type date-and-time;
 *             }
 *             uses access-mgmt-umts-member-detail-g;
 *         }
 *         container access-mgmt-umts-local-ip-access {
 *             leaf enable {
 *                 type enable;
 *             }
 *             uses access-mgmt-umts-local-ip-access-g;
 *         }
 *         uses access-mgmt-umts-g;
 *     }
 *     container access-mgmt-lte {
 *         leaf access-mode {
 *             type access-mode;
 *         }
 *         leaf max-u-es-served {
 *             type max-u-es-served;
 *         }
 *         leaf max-csg-members {
 *             type max-csg-members;
 *         }
 *         leaf max-non-csg-members {
 *             type max-non-csg-members;
 *         }
 *         leaf max-resource-non-csg-members {
 *             type uint8;
 *         }
 *         leaf csgid {
 *             type uint32;
 *         }
 *         leaf hnb-name {
 *             type string;
 *         }
 *         container access-mgmt-lte-local-ip-access {
 *             leaf enable {
 *                 type enable;
 *             }
 *             uses access-mgmt-lte-local-ip-access-g;
 *         }
 *         uses access-mgmt-lte-g;
 *     }
 *     container access-mgmt-cdma2000 {
 *         leaf access-mode {
 *             type uint8;
 *         }
 *         leaf max-total-active-calls-allowed {
 *             type uint16;
 *         }
 *         leaf access-control-list {
 *             type string;
 *         }
 *         leaf max-member-detail-entries {
 *             type uint64;
 *         }
 *         leaf member-detail-number-of-entries {
 *             type uint64;
 *         }
 *         list access-mgmt-cdma2000-member-detail {
 *             key "imsi";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf imsi {
 *                 type string;
 *             }
 *             leaf hrpd-identifier-type {
 *                 type int64;
 *             }
 *             leaf hrpd-identifier-value {
 *                 type string;
 *             }
 *             leaf membership-expires {
 *                 type date-and-time;
 *             }
 *             uses access-mgmt-cdma2000-member-detail-g;
 *         }
 *         container access-mgmt-cdma2000-local-ip-access {
 *             container access-mgmt-cdma2000-local-ip-access-hrpd {
 *                 leaf filter-type {
 *                     type uint8;
 *                 }
 *                 leaf filter-in-use {
 *                     type string;
 *                 }
 *                 leaf egress-filter-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter {
 *                     key "subnet" "subnet-mask";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf subnet {
 *                         type ipv4-address;
 *                     }
 *                     leaf subnet-mask {
 *                         type uint8;
 *                     }
 *                     uses access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter-g;
 *                 }
 *                 uses access-mgmt-cdma2000-local-ip-access-hrpd-g;
 *             }
 *             uses access-mgmt-cdma2000-local-ip-access-g;
 *         }
 *         uses access-mgmt-cdma2000-g;
 *     }
 *     container access-mgmt-legacy {
 *         container access-mgmt-legacy-local-ip-access {
 *             leaf enable {
 *                 type enable;
 *             }
 *             leaf max-rules-entries {
 *                 type uint64;
 *             }
 *             leaf rule-number-of-entries {
 *                 type uint64;
 *             }
 *             list access-mgmt-legacy-local-ip-access-rule {
 *                 key "dest-ip-address" "dest-subnet-mask" "protocol";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf dest-ip-address {
 *                     type ip-address;
 *                 }
 *                 leaf dest-subnet-mask {
 *                     type ip-address;
 *                 }
 *                 leaf protocol {
 *                     type int64;
 *                 }
 *                 leaf action {
 *                     type enumeration;
 *                 }
 *                 leaf interface {
 *                     type string;
 *                 }
 *                 uses access-mgmt-legacy-local-ip-access-rule-g;
 *             }
 *             uses access-mgmt-legacy-local-ip-access-g;
 *         }
 *         uses access-mgmt-legacy-g;
 *     }
 *     uses access-mgmt-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/access-mgmt</i>
 *
 * <p>To create instances of this class use {@link AccessMgmtBuilder}.
 * @see AccessMgmtBuilder
 *
 */
public interface AccessMgmt
    extends
    ChildOf<FapService>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt>,
    AccessMgmtG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "access-mgmt").intern();

    /**
     * Container for object class FAPService.{i}.AccessMgmt.UMTS.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtUmts</code> <code>accessMgmtUmts</code>, or <code>null</code> if not present
     */
    AccessMgmtUmts getAccessMgmtUmts();
    
    /**
     * Container for object class FAPService.{i}.AccessMgmt.LTE.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLte</code> <code>accessMgmtLte</code>, or <code>null</code> if not present
     */
    AccessMgmtLte getAccessMgmtLte();
    
    /**
     * Container for object class FAPService.{i}.AccessMgmt.CDMA2000.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtCdma2000</code> <code>accessMgmtCdma2000</code>, or <code>null</code> if not present
     */
    AccessMgmtCdma2000 getAccessMgmtCdma2000();
    
    /**
     * Container for object class FAPService.{i}.AccessMgmt.Legacy.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.access.mgmt.AccessMgmtLegacy</code> <code>accessMgmtLegacy</code>, or <code>null</code> if not present
     */
    AccessMgmtLegacy getAccessMgmtLegacy();

}

