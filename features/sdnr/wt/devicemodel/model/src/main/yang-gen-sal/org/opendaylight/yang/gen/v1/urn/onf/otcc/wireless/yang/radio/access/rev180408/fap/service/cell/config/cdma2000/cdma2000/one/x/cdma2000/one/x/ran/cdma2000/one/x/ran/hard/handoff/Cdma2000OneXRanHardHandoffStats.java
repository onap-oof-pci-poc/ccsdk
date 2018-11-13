package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffStatsG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.HardHandoff.Stats.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-ran-hard-handoff-stats {
 *     leaf tx-ho-required {
 *         type uint32;
 *     }
 *     leaf rx-ho-command {
 *         type uint32;
 *     }
 *     leaf ho-required-rejected {
 *         type uint32;
 *     }
 *     leaf ho-required-unanswered {
 *         type uint32;
 *     }
 *     leaf tx-uhdm {
 *         type uint32;
 *     }
 *     leaf rx-ns-ack {
 *         type uint32;
 *     }
 *     leaf ho-failure-count {
 *         type uint32;
 *     }
 *     leaf call-drop-count {
 *         type uint32;
 *     }
 *     leaf tx-ho-commence {
 *         type uint32;
 *     }
 *     leaf rx-ho-session-clear {
 *         type uint32;
 *     }
 *     leaf return-on-failure-count {
 *         type uint32;
 *     }
 *     leaf one-pilot-report-count {
 *         type uint32;
 *     }
 *     leaf two-pilot-report-count {
 *         type uint32;
 *     }
 *     leaf three-pilot-report-count {
 *         type uint32;
 *     }
 *     uses cdma2000-one-x-ran-hard-handoff-stats-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran/cdma2000-one-x-ran-hard-handoff/cdma2000-one-x-ran-hard-handoff-stats</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanHardHandoffStatsBuilder}.
 * @see Cdma2000OneXRanHardHandoffStatsBuilder
 *
 */
public interface Cdma2000OneXRanHardHandoffStats
    extends
    ChildOf<Cdma2000OneXRanHardHandoff>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats>,
    Cdma2000OneXRanHardHandoffStatsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-hard-handoff-stats").intern();


}

