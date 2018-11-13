package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000G;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mobility-idle-mode-irat-cdma2000 {
 *     leaf-list search-window-size {
 *         type string;
 *     }
 *     leaf-list t-reselection-cdma2000 {
 *         type string;
 *     }
 *     leaf t-reselection-cdma2000-sf-medium {
 *         type uint8;
 *     }
 *     leaf t-reselection-cdma2000-sf-high {
 *         type uint8;
 *     }
 *     leaf max-cdma2000-band-entries {
 *         type uint64;
 *     }
 *     leaf cdma2000-band-number-of-entries {
 *         type uint64;
 *     }
 *     list lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band {
 *         key "band-class";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf band-class {
 *             type band-class;
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
 *         uses lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band-g;
 *     }
 *     uses lte-ran-mobility-idle-mode-irat-cdma2000-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-idle-mode/lte-ran-mobility-idle-mode-irat/lte-ran-mobility-idle-mode-irat-cdma2000</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityIdleModeIratCdma2000Builder}.
 * @see LteRanMobilityIdleModeIratCdma2000Builder
 *
 */
public interface LteRanMobilityIdleModeIratCdma2000
    extends
    ChildOf<LteRanMobilityIdleModeIrat>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000>,
    LteRanMobilityIdleModeIratCdma2000G
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-irat-cdma2000").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000.CDMA2000Band.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>lteRanMobilityIdleModeIratCdma2000Cdma2000Band</code>, or <code>null</code> if not present
     */
    List<LteRanMobilityIdleModeIratCdma2000Cdma2000Band> getLteRanMobilityIdleModeIratCdma2000Cdma2000Band();

}

