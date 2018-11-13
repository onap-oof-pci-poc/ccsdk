package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXStatsG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000OneX;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.CDMA2000.OneX.Stats.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-stats {
 *     leaf registration-attempts {
 *         type uint32;
 *     }
 *     leaf registration-fails {
 *         type uint32;
 *     }
 *     leaf registrations-blocked {
 *         type uint32;
 *     }
 *     leaf page-attempts {
 *         type uint32;
 *     }
 *     leaf page-fails {
 *         type uint32;
 *     }
 *     leaf voice-call-attempts {
 *         type uint32;
 *     }
 *     leaf voice-call-failures {
 *         type uint32;
 *     }
 *     leaf voice-calls-blocked {
 *         type uint32;
 *     }
 *     leaf voice-calls-dropped {
 *         type uint32;
 *     }
 *     leaf data-call-attempts {
 *         type uint32;
 *     }
 *     leaf data-call-failures {
 *         type uint32;
 *     }
 *     leaf data-calls-blocked {
 *         type uint32;
 *     }
 *     leaf data-calls-dropped {
 *         type uint32;
 *     }
 *     leaf average-voice-call {
 *         type average-voice-call;
 *     }
 *     leaf average-data-call {
 *         type average-data-call;
 *     }
 *     leaf average-session-in-sec {
 *         type average-session-in-sec;
 *     }
 *     leaf total-voice-calls {
 *         type total-voice-calls;
 *     }
 *     leaf total-data-calls {
 *         type uint32;
 *     }
 *     leaf fwd-voice-packet-drop-percentage {
 *         type uint32;
 *     }
 *     leaf rev-voice-packet-drop-percentage {
 *         type uint32;
 *     }
 *     leaf fwd-avg-data-rate {
 *         type uint32;
 *     }
 *     leaf rev-avg-data-rate {
 *         type uint32;
 *     }
 *     leaf bc-index-zero-to-one-transitions {
 *         type uint32;
 *     }
 *     leaf bc-index-one-to-zero-transitions {
 *         type uint32;
 *     }
 *     uses cdma2000-one-x-stats-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-stats</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXStatsBuilder}.
 * @see Cdma2000OneXStatsBuilder
 *
 */
public interface Cdma2000OneXStats
    extends
    ChildOf<Cdma2000OneX>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXStats>,
    Cdma2000OneXStatsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-stats").intern();


}

