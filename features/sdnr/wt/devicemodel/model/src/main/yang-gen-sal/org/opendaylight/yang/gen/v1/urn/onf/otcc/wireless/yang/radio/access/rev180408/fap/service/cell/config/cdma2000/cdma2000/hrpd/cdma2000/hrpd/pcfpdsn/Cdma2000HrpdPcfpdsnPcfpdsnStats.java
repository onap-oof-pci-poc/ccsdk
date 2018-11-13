package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdPcfpdsnPcfpdsnStatsG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfpdsn;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.HRPD.PCFPDSN.{i}.PCFPDSNStats.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-hrpd-pcfpdsn-pcfpdsn-stats {
 *     leaf a10-setup-attempts-pdsn {
 *         type uint64;
 *     }
 *     leaf a10-setup-successes-pdsn {
 *         type uint64;
 *     }
 *     leaf a10-setup-blocks-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-id-mismatch-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-unknown-pdsnpdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-no-reason-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-admin-prohibit-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-insuff-resources-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-failed-auth-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-malformed-req-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-unsupp-vend-id-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-reverse-tunnel-unavailable-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-reverse-tunnel-tbit-not-set-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-req-denied-unknown-error-code-pdsn {
 *         type uint64;
 *     }
 *     leaf a10-reg-req-for-registration-retransmissions-pdsn {
 *         type uint64;
 *     }
 *     leaf a10-reg-req-for-re-registration-retransmissions-pdsn {
 *         type uint64;
 *     }
 *     leaf a10-reg-req-for-release-retransmissions-pdsn {
 *         type uint64;
 *     }
 *     leaf pdsn-number-pdsn-perf {
 *         type int64;
 *     }
 *     leaf pds-nip-address-pdsn-perf {
 *         type ip-address;
 *     }
 *     uses cdma2000-hrpd-pcfpdsn-pcfpdsn-stats-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-hrpd/cdma2000-hrpd-pcfpdsn/cdma2000-hrpd-pcfpdsn-pcfpdsn-stats</i>
 *
 * <p>To create instances of this class use {@link Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder}.
 * @see Cdma2000HrpdPcfpdsnPcfpdsnStatsBuilder
 *
 */
public interface Cdma2000HrpdPcfpdsnPcfpdsnStats
    extends
    ChildOf<Cdma2000HrpdPcfpdsn>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.cdma2000.hrpd.pcfpdsn.Cdma2000HrpdPcfpdsnPcfpdsnStats>,
    Cdma2000HrpdPcfpdsnPcfpdsnStatsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-pcfpdsn-pcfpdsn-stats").intern();


}

