package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfConfigPcfPerformanceStatsG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.HRPD.PCFConfig.PCFPerformanceStats.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-hrpd-pcf-config-pcf-performance-stats {
 *     leaf a10-setup-failure-no-reason {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-admin-prohibit {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-insuff-resources {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-failed-auth {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-id-mismatch {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-malformed-req {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-unknown-pdsn {
 *         type uint64;
 *     }
 *     leaf a10-setup-failure-unsupp-vend-id {
 *         type uint64;
 *     }
 *     leaf total-a10-closed-by-rnc {
 *         type uint64;
 *     }
 *     leaf total-a10-closed-by-pdsn {
 *         type uint64;
 *     }
 *     leaf total-a10-success-pages {
 *         type uint64;
 *     }
 *     leaf total-a10-failed-pages {
 *         type uint64;
 *     }
 *     leaf total-a10-ingress-bytes {
 *         type total-a10-ingress-bytes;
 *     }
 *     leaf total-a10-egress-bytes {
 *         type total-a10-egress-bytes;
 *     }
 *     leaf a10-reg-update-received {
 *         type uint64;
 *     }
 *     leaf total-a10-dropped-pages {
 *         type uint64;
 *     }
 *     uses cdma2000-hrpd-pcf-config-pcf-performance-stats-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-hrpd/cdma2000-hrpd-pcf-config/cdma2000-hrpd-pcf-config-pcf-performance-stats</i>
 *
 * <p>To create instances of this class use {@link Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder}.
 * @see Cdma2000HrpdPcfConfigPcfPerformanceStatsBuilder
 *
 */
public interface Cdma2000HrpdPcfConfigPcfPerformanceStats
    extends
    ChildOf<Cdma2000HrpdPcfConfig>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcf.config.Cdma2000HrpdPcfConfigPcfPerformanceStats>,
    Cdma2000HrpdPcfConfigPcfPerformanceStatsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-pcf-config-pcf-performance-stats").intern();


}

