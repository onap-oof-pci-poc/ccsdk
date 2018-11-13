package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratGeranGeranFreqGroupG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.GERAN.GERANFreqGroup.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list lte-ran-mobility-idle-mode-irat-geran-geran-freq-group {
 *     key "bccharfcn";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf band-indicator {
 *         type enumeration;
 *     }
 *     leaf bccharfcn {
 *         type uint16;
 *     }
 *     leaf-list q-rx-lev-min {
 *         type string;
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
 *     uses lte-ran-mobility-idle-mode-irat-geran-geran-freq-group-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-idle-mode/lte-ran-mobility-idle-mode-irat/lte-ran-mobility-idle-mode-irat-geran/lte-ran-mobility-idle-mode-irat-geran-geran-freq-group</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder}.
 * @see LteRanMobilityIdleModeIratGeranGeranFreqGroupBuilder
 * @see LteRanMobilityIdleModeIratGeranGeranFreqGroupKey
 *
 */
public interface LteRanMobilityIdleModeIratGeranGeranFreqGroup
    extends
    ChildOf<LteRanMobilityIdleModeIratGeran>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroup>,
    LteRanMobilityIdleModeIratGeranGeranFreqGroupG,
    Identifiable<LteRanMobilityIdleModeIratGeranGeranFreqGroupKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-irat-geran-geran-freq-group").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.geran.LteRanMobilityIdleModeIratGeranGeranFreqGroupKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LteRanMobilityIdleModeIratGeranGeranFreqGroupKey getKey();

}

