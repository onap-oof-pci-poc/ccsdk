package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnA11RegUpdateStatsG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.OneX.PCFPDSN.{i}.A11RegUpdateStats.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-pcfpdsn-a11-reg-update-stats {
 *     leaf pdsn-number-reg-update-perf {
 *         type int64;
 *     }
 *     leaf pdsnip-address-reg-update-perf {
 *         type ip-address;
 *     }
 *     leaf a11-reg-update-received-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-id-check-fail-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-auth-check-fail-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-for-unknown-psipdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-unspecified-reason-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-ppp-timeout-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-registration-timeout-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-pdsn-error-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-inter-pcf-handoff-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-inter-pdsn-handoff-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-pdsnoamp-intervention-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-accounting-error-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-user-failed-authentication-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-unknown-cause-code-pdsn {
 *         type uint64;
 *     }
 *     leaf a11-reg-update-without-reason-code-pdsn {
 *         type uint64;
 *     }
 *     uses cdma2000-one-x-pcfpdsn-a11-reg-update-stats-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-pcfpdsn/cdma2000-one-x-pcfpdsn-a11-reg-update-stats</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder}.
 * @see Cdma2000OneXPcfpdsnA11RegUpdateStatsBuilder
 *
 */
public interface Cdma2000OneXPcfpdsnA11RegUpdateStats
    extends
    ChildOf<Cdma2000OneXPcfpdsn>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats>,
    Cdma2000OneXPcfpdsnA11RegUpdateStatsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-pcfpdsn-a11-reg-update-stats").intern();


}

