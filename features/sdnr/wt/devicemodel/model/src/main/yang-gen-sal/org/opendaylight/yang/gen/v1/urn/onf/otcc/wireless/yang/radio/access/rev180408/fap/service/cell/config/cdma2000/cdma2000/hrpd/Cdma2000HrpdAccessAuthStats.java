package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdAccessAuthStatsG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.HRPD.AccessAuthStats.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-hrpd-access-auth-stats {
 *     leaf an-ppp-authentication-attempts-by-node {
 *         type uint64;
 *     }
 *     leaf a12-requests-sent-from-node {
 *         type uint64;
 *     }
 *     leaf a12-rejects-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-accepts-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-access-challenges-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-retransmits-sent-from-node {
 *         type uint64;
 *     }
 *     leaf a12-timeouts-events-for-node {
 *         type uint64;
 *     }
 *     leaf a12-malformedresponse-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-bad-authenticator-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-unknown-type-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-unknown-pkt-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-unknown-server-received-by-node {
 *         type uint64;
 *     }
 *     leaf a12-other-failure-occurences-in-node {
 *         type uint64;
 *     }
 *     leaf a12-by-pass-num-ats-with-unknown-mfr-code-by-node {
 *         type uint64;
 *     }
 *     leaf a12-tx-path-fail-due-to-an-ppp-error-by-node {
 *         type uint64;
 *     }
 *     leaf a12-tx-path-fail-due-to-no-server-available-by-node {
 *         type uint64;
 *     }
 *     leaf a12-tx-path-fail-due-to-internal-error-by-node {
 *         type uint64;
 *     }
 *     leaf a12-tx-path-fail-due-to-no-packet-id-available-by-node {
 *         type uint64;
 *     }
 *     leaf a12-tx-path-fail-due-to-transmit-error-by-node {
 *         type uint64;
 *     }
 *     leaf a12-svr-timeouts-for-node {
 *         type uint64;
 *     }
 *     leaf a12-enh-ta-bypass-lcp-timeout-by-node {
 *         type uint64;
 *     }
 *     leaf a12-enh-ta-bypass-chap-timeout-by-node {
 *         type uint64;
 *     }
 *     leaf a12-enh-ta-bypass-chap-invalid-by-node {
 *         type uint64;
 *     }
 *     leaf a12-enh-ta-bypass-chap-nai-matches-a12-bypass-list-by-node {
 *         type uint64;
 *     }
 *     leaf a12-session-ta-timeout-by-node {
 *         type uint64;
 *     }
 *     leaf access-auth-failed-due-to-session-close-total {
 *         type uint64;
 *     }
 *     leaf access-auth-succeeded {
 *         type uint64;
 *     }
 *     uses cdma2000-hrpd-access-auth-stats-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-hrpd/cdma2000-hrpd-access-auth-stats</i>
 *
 * <p>To create instances of this class use {@link Cdma2000HrpdAccessAuthStatsBuilder}.
 * @see Cdma2000HrpdAccessAuthStatsBuilder
 *
 */
public interface Cdma2000HrpdAccessAuthStats
    extends
    ChildOf<Cdma2000Hrpd>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats>,
    Cdma2000HrpdAccessAuthStatsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-access-auth-stats").intern();


}

