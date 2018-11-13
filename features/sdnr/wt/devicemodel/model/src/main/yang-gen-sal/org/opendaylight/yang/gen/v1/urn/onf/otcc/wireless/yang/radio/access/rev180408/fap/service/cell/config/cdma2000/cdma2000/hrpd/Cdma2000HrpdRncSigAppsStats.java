package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdRncSigAppsStatsG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.HRPD.RNCSigAppsStats.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-hrpd-rnc-sig-apps-stats {
 *     leaf c-num-page-requests {
 *         type uint64;
 *     }
 *     leaf s-num-page-requests {
 *         type uint64;
 *     }
 *     leaf s-num-connection-setup-attempts {
 *         type uint64;
 *     }
 *     leaf c-num-connection-setup-attempts {
 *         type uint64;
 *     }
 *     leaf s-num-connection-setup-success {
 *         type uint64;
 *     }
 *     leaf c-num-connection-setup-success {
 *         type uint64;
 *     }
 *     leaf s-num-normal-connection-closes {
 *         type uint64;
 *     }
 *     leaf c-num-normal-connection-closes {
 *         type uint64;
 *     }
 *     leaf s-num-total-connection-closes {
 *         type uint64;
 *     }
 *     leaf c-num-total-connection-closes {
 *         type uint64;
 *     }
 *     leaf s-num-rf-related-drops {
 *         type uint64;
 *     }
 *     leaf c-num-rf-related-drops {
 *         type uint64;
 *     }
 *     leaf s-num-page-responses {
 *         type uint64;
 *     }
 *     leaf c-num-page-responses {
 *         type uint64;
 *     }
 *     leaf s-num-rf-related-drops-rtc-lost {
 *         type uint64;
 *     }
 *     leaf c-num-rf-related-drops-rtc-lost {
 *         type uint64;
 *     }
 *     leaf s-num-rf-related-drops-no-ftc {
 *         type uint64;
 *     }
 *     leaf c-num-rf-related-drops-no-ftc {
 *         type uint64;
 *     }
 *     leaf s-num-network-error-drops {
 *         type uint64;
 *     }
 *     leaf c-num-network-error-drops {
 *         type uint64;
 *     }
 *     leaf s-num-network-error-drops-rnc-internal {
 *         type uint64;
 *     }
 *     leaf c-num-network-error-drops-rnc-internal {
 *         type uint64;
 *     }
 *     leaf s-num-network-error-drops-rnc-external {
 *         type uint64;
 *     }
 *     leaf c-num-network-error-drops-rnc-external {
 *         type uint64;
 *     }
 *     leaf s-num-network-error-drops-a10-setup-fail {
 *         type uint64;
 *     }
 *     leaf c-num-network-error-drops-a10-setup-fail {
 *         type uint64;
 *     }
 *     leaf s-num-misc-drops-sector-down {
 *         type uint64;
 *     }
 *     leaf c-num-misc-drops-sector-down {
 *         type uint64;
 *     }
 *     leaf s-num-misc-drops-internal-error {
 *         type uint64;
 *     }
 *     leaf c-num-misc-drops-internal-error {
 *         type uint64;
 *     }
 *     leaf c-num-misc-drops-state-mismatch {
 *         type uint64;
 *     }
 *     leaf s-num-misc-drops-state-mismatch {
 *         type uint64;
 *     }
 *     leaf s-num-misc-drops-due-to-rlp {
 *         type uint64;
 *     }
 *     leaf c-num-misc-drops-due-to-rlp {
 *         type uint64;
 *     }
 *     uses cdma2000-hrpd-rnc-sig-apps-stats-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-hrpd/cdma2000-hrpd-rnc-sig-apps-stats</i>
 *
 * <p>To create instances of this class use {@link Cdma2000HrpdRncSigAppsStatsBuilder}.
 * @see Cdma2000HrpdRncSigAppsStatsBuilder
 *
 */
public interface Cdma2000HrpdRncSigAppsStats
    extends
    ChildOf<Cdma2000Hrpd>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats>,
    Cdma2000HrpdRncSigAppsStatsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-rnc-sig-apps-stats").intern();


}

