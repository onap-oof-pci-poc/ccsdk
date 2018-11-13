package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdCallControlStatsG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.HRPD.CallControlStats.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-hrpd-call-control-stats {
 *     leaf num-session-setup-attempts {
 *         type uint64;
 *     }
 *     leaf num-session-setup-successful {
 *         type uint64;
 *     }
 *     leaf num-current-sessions-established {
 *         type uint64;
 *     }
 *     leaf num-page-messages-to-at {
 *         type uint64;
 *     }
 *     leaf num-pages-succeeded {
 *         type uint64;
 *     }
 *     leaf num-connections-opened {
 *         type uint64;
 *     }
 *     leaf num-session-setups-failed-to-term-auth {
 *         type uint64;
 *     }
 *     leaf num-forward-rlp-bytes {
 *         type num-forward-rlp-bytes;
 *     }
 *     leaf num-reverse-rlp-bytes {
 *         type num-reverse-rlp-bytes;
 *     }
 *     leaf average-session-setup-time {
 *         type average-session-setup-time;
 *     }
 *     leaf average-page-setup-time {
 *         type uint64;
 *     }
 *     leaf num-conn-setups-aborted {
 *         type uint64;
 *     }
 *     leaf num-forward-pre-rlp-dropped-pkts {
 *         type uint64;
 *     }
 *     uses cdma2000-hrpd-call-control-stats-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-hrpd/cdma2000-hrpd-call-control-stats</i>
 *
 * <p>To create instances of this class use {@link Cdma2000HrpdCallControlStatsBuilder}.
 * @see Cdma2000HrpdCallControlStatsBuilder
 *
 */
public interface Cdma2000HrpdCallControlStats
    extends
    ChildOf<Cdma2000Hrpd>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats>,
    Cdma2000HrpdCallControlStatsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd-call-control-stats").intern();


}

