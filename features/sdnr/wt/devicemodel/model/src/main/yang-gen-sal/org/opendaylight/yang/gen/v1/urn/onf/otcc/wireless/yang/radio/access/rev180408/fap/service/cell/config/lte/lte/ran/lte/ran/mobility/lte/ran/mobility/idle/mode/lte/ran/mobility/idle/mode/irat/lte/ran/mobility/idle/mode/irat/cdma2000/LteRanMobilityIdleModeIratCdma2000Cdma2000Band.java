package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratCdma2000Cdma2000BandG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000.CDMA2000Band.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band {
 *     key "band-class";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf band-class {
 *         type band-class;
 *     }
 *     leaf cell-reselection-priority {
 *         type uint8;
 *     }
 *     leaf thresh-x-high {
 *         type thresh-x-high;
 *     }
 *     leaf thresh-x-low {
 *         type thresh-x-low;
 *     }
 *     uses lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-idle-mode/lte-ran-mobility-idle-mode-irat/lte-ran-mobility-idle-mode-irat-cdma2000/lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder}.
 * @see LteRanMobilityIdleModeIratCdma2000Cdma2000BandBuilder
 * @see LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey
 *
 */
public interface LteRanMobilityIdleModeIratCdma2000Cdma2000Band
    extends
    ChildOf<LteRanMobilityIdleModeIratCdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000Band>,
    LteRanMobilityIdleModeIratCdma2000Cdma2000BandG,
    Identifiable<LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.cdma2000.LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LteRanMobilityIdleModeIratCdma2000Cdma2000BandKey getKey();

}

