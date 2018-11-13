package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanHardHandoffG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.HardHandoff.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-ran-hard-handoff {
 *     leaf handout-enable {
 *         type boolean;
 *     }
 *     leaf ho-pilot-power-thresh {
 *         type ho-pilot-power-thresh;
 *     }
 *     leaf ho-pilot-duration {
 *         type ho-pilot-duration;
 *     }
 *     container cdma2000-one-x-ran-hard-handoff-stats {
 *         leaf tx-ho-required {
 *             type uint32;
 *         }
 *         leaf rx-ho-command {
 *             type uint32;
 *         }
 *         leaf ho-required-rejected {
 *             type uint32;
 *         }
 *         leaf ho-required-unanswered {
 *             type uint32;
 *         }
 *         leaf tx-uhdm {
 *             type uint32;
 *         }
 *         leaf rx-ns-ack {
 *             type uint32;
 *         }
 *         leaf ho-failure-count {
 *             type uint32;
 *         }
 *         leaf call-drop-count {
 *             type uint32;
 *         }
 *         leaf tx-ho-commence {
 *             type uint32;
 *         }
 *         leaf rx-ho-session-clear {
 *             type uint32;
 *         }
 *         leaf return-on-failure-count {
 *             type uint32;
 *         }
 *         leaf one-pilot-report-count {
 *             type uint32;
 *         }
 *         leaf two-pilot-report-count {
 *             type uint32;
 *         }
 *         leaf three-pilot-report-count {
 *             type uint32;
 *         }
 *         uses cdma2000-one-x-ran-hard-handoff-stats-g;
 *     }
 *     uses cdma2000-one-x-ran-hard-handoff-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran/cdma2000-one-x-ran-hard-handoff</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanHardHandoffBuilder}.
 * @see Cdma2000OneXRanHardHandoffBuilder
 *
 */
public interface Cdma2000OneXRanHardHandoff
    extends
    ChildOf<Cdma2000OneXRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanHardHandoff>,
    Cdma2000OneXRanHardHandoffG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-hard-handoff").intern();

    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.HardHandoff.Stats.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.cdma2000.one.x.ran.hard.handoff.Cdma2000OneXRanHardHandoffStats</code> <code>cdma2000OneXRanHardHandoffStats</code>, or <code>null</code> if not present
     */
    Cdma2000OneXRanHardHandoffStats getCdma2000OneXRanHardHandoffStats();

}

