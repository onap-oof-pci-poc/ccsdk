package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfpdsn;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.HRPD.PCFPDSN.{i}.A11SessionUpdateStats.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-hrpd-pcfpdsn-a11-session-update-stats {
 *     leaf pdsn-number-session-update-perf {
 *         type int64;
 *     }
 *     leaf pdsnip-address-session-update-perf {
 *         type ip-address;
 *     }
 *     leaf a11-session-update-received-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-accepted-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-extended-apipdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-for-unknown-psipdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-id-check-fail-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-auth-check-fail-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-reason-unspecified-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-poorly-formed-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-session-params-not-updated-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-qo-s-profile-id-not-supported-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-insufficient-resources-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-session-update-denied-handoff-in-progress-pdsn {
 *         type uint64;
 *     }
 *     uses cdma2000-hrpd-pcfpdsn-a11-session-update-stats-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-hrpd/cdma2000-hrpd-pcfpdsn/cdma2000-hrpd-pcfpdsn-a11-session-update-stats</i>
 *
 * <p>To create instances of this class use {@link Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder}.
 * @see Cdma2000HrpdPcfpdsnA11SessionUpdateStatsBuilder
 *
 */
public interface Cdma2000HrpdPcfpdsnA11SessionUpdateStats
    extends
    ChildOf<Cdma2000HrpdPcfpdsn>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnA11SessionUpdateStats>,
    Cdma2000HrpdPcfpdsnA11SessionUpdateStatsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-pcfpdsn-a11-session-update-stats").intern();


}

