package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnPcfpdsnStats;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXPcfpdsnG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.CellConfig.CDMA2000.OneX.PCFPDSN.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list cdma2000-one-x-pcfpdsn {
 *     key "pdsn-number" "security-parameter-index" "security-key";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf pdsn-number {
 *         type int64;
 *     }
 *     leaf security-parameter-index {
 *         type uint32;
 *     }
 *     leaf security-key {
 *         type binary;
 *     }
 *     leaf ios-version {
 *         type enumeration;
 *     }
 *     leaf pds-nadmin-status {
 *         type int64;
 *     }
 *     leaf pdsn-health-status {
 *         type uint8;
 *     }
 *     leaf pdsnip-address {
 *         type ip-address;
 *     }
 *     container cdma2000-one-x-pcfpdsn-a11-reg-update-stats {
 *         leaf pdsn-number-reg-update-perf {
 *             type int64;
 *         }
 *         leaf pdsnip-address-reg-update-perf {
 *             type ip-address;
 *         }
 *         leaf a11-reg-update-received-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-id-check-fail-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-auth-check-fail-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-for-unknown-psipdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-unspecified-reason-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-ppp-timeout-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-registration-timeout-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-pdsn-error-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-inter-pcf-handoff-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-inter-pdsn-handoff-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-pdsnoamp-intervention-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-accounting-error-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-user-failed-authentication-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-unknown-cause-code-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-update-without-reason-code-pdsn {
 *             type uint64;
 *         }
 *         uses cdma2000-one-x-pcfpdsn-a11-reg-update-stats-g;
 *     }
 *     container cdma2000-one-x-pcfpdsn-pcfpdsn-stats {
 *         leaf a10-setup-attempts-pdsn {
 *             type uint64;
 *         }
 *         leaf a10-setup-successes-pdsn {
 *             type uint64;
 *         }
 *         leaf a10-setup-blocks-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-req-denied-id-mismatch-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-req-denied-unknown-pdsnpdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-req-denied-no-reason-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-req-denied-admin-prohibit-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-req-denied-insuff-resources-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-req-denied-failed-auth-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-req-denied-malformed-req-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-req-denied-unsupp-vend-id-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-req-denied-reverse-tunnel-unavailable-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-req-denied-reverse-tunnel-tbit-not-set-pdsn {
 *             type uint64;
 *         }
 *         leaf a11-reg-req-denied-unknown-error-code-pdsn {
 *             type uint64;
 *         }
 *         leaf a10-reg-req-for-registration-retransmissions-pdsn {
 *             type uint64;
 *         }
 *         leaf a10-reg-req-for-re-registration-retransmissions-pdsn {
 *             type uint64;
 *         }
 *         leaf a10-reg-req-for-release-retransmissions-pdsn {
 *             type uint64;
 *         }
 *         leaf pdsn-number-pdsn-perf {
 *             type int64;
 *         }
 *         leaf pds-nip-address-pdsn-perf {
 *             type ip-address;
 *         }
 *         uses cdma2000-one-x-pcfpdsn-pcfpdsn-stats-g;
 *     }
 *     uses cdma2000-one-x-pcfpdsn-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-pcfpdsn</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXPcfpdsnBuilder}.
 * @see Cdma2000OneXPcfpdsnBuilder
 * @see Cdma2000OneXPcfpdsnKey
 *
 */
public interface Cdma2000OneXPcfpdsn
    extends
    ChildOf<Cdma2000OneX>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsn>,
    Cdma2000OneXPcfpdsnG,
    Identifiable<Cdma2000OneXPcfpdsnKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-pcfpdsn").intern();

    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.OneX.PCFPDSN.{i}.A11RegUpdateStats.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnA11RegUpdateStats</code> <code>cdma2000OneXPcfpdsnA11RegUpdateStats</code>, or <code>null</code> if not present
     */
    Cdma2000OneXPcfpdsnA11RegUpdateStats getCdma2000OneXPcfpdsnA11RegUpdateStats();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.OneX.PCFPDSN.{i}.PCFPDSNStats.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.pcfpdsn.Cdma2000OneXPcfpdsnPcfpdsnStats</code> <code>cdma2000OneXPcfpdsnPcfpdsnStats</code>, or <code>null</code> if not present
     */
    Cdma2000OneXPcfpdsnPcfpdsnStats getCdma2000OneXPcfpdsnPcfpdsnStats();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXPcfpdsnKey</code> <code>key</code>, or <code>null</code> if not present
     */
    Cdma2000OneXPcfpdsnKey getKey();

}

