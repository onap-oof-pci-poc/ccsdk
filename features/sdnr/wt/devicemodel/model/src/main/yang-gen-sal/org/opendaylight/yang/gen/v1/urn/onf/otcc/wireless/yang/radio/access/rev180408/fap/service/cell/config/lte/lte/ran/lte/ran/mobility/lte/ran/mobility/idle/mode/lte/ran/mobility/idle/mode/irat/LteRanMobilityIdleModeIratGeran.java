package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranG;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.GERAN.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mobility-idle-mode-irat-geran {
 *     leaf-list t-reselection-geran {
 *         type string;
 *     }
 *     leaf t-reselection-geransf-medium {
 *         type uint8;
 *     }
 *     leaf t-reselection-geransf-high {
 *         type uint8;
 *     }
 *     leaf max-geran-freq-group-entries {
 *         type uint64;
 *     }
 *     leaf geran-freq-group-number-of-entries {
 *         type uint64;
 *     }
 *     list lte-ran-mobility-idle-mode-irat-geran-geran-freq-group {
 *         key "bccharfcn";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf band-indicator {
 *             type enumeration;
 *         }
 *         leaf bccharfcn {
 *             type uint16;
 *         }
 *         leaf-list q-rx-lev-min {
 *             type string;
 *         }
 *         leaf cell-reselection-priority {
 *             type uint8;
 *         }
 *         leaf thresh-x-high {
 *             type thresh-x-high;
 *         }
 *         leaf thresh-x-low {
 *             type thresh-x-low;
 *         }
 *         uses lte-ran-mobility-idle-mode-irat-geran-geran-freq-group-g;
 *     }
 *     uses lte-ran-mobility-idle-mode-irat-geran-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-idle-mode/lte-ran-mobility-idle-mode-irat/lte-ran-mobility-idle-mode-irat-geran</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityIdleModeIratGeranBuilder}.
 * @see LteRanMobilityIdleModeIratGeranBuilder
 *
 */
public interface LteRanMobilityIdleModeIratGeran
    extends
    ChildOf<LteRanMobilityIdleModeIrat>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran>,
    LteRanMobilityIdleModeIratGeranG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-irat-geran").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.GERAN.GERANFreqGroup.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>lteRanMobilityIdleModeIratGeranGeranFreqGroup</code>, or <code>null</code> if not present
     */
    List<LteRanMobilityIdleModeIratGeranGeranFreqGroup> getLteRanMobilityIdleModeIratGeranGeranFreqGroup();

}

