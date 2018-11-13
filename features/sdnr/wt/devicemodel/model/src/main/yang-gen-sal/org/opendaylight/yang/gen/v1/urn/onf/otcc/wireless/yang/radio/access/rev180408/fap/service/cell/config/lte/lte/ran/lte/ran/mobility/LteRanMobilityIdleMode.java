package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanMobility;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeInterFreq;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeG;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mobility-idle-mode {
 *     container lte-ran-mobility-idle-mode-common {
 *         leaf-list qhyst {
 *             type string;
 *         }
 *         leaf q-hyst-sf-medium {
 *             type q-hyst-sf-medium;
 *         }
 *         leaf q-hyst-sf-high {
 *             type q-hyst-sf-high;
 *         }
 *         leaf t-evaluation {
 *             type t-evaluation;
 *         }
 *         leaf t-hyst-normal {
 *             type t-hyst-normal;
 *         }
 *         leaf n-cell-change-medium {
 *             type uint8;
 *         }
 *         leaf n-cell-change-high {
 *             type uint8;
 *         }
 *         uses lte-ran-mobility-idle-mode-common-g;
 *     }
 *     container lte-ran-mobility-idle-mode-intra-freq {
 *         leaf-list q-rx-lev-min-sib1 {
 *             type string;
 *         }
 *         leaf-list q-rx-lev-min-sib3 {
 *             type string;
 *         }
 *         leaf q-rx-lev-min-offset {
 *             type q-rx-lev-min-offset;
 *         }
 *         leaf-list s-intra-search {
 *             type string;
 *         }
 *         leaf-list t-reselection-eutra {
 *             type string;
 *         }
 *         leaf-list s-non-intra-search {
 *             type string;
 *         }
 *         leaf cell-reselection-priority {
 *             type uint8;
 *         }
 *         leaf p-max {
 *             type p-max;
 *         }
 *         leaf thresh-serving-low {
 *             type thresh-serving-low;
 *         }
 *         leaf t-reselection-eutrasf-medium {
 *             type uint8;
 *         }
 *         leaf t-reselection-eutrasf-high {
 *             type uint8;
 *         }
 *         uses lte-ran-mobility-idle-mode-intra-freq-g;
 *     }
 *     container lte-ran-mobility-idle-mode-inter-freq {
 *         leaf max-carrier-entries {
 *             type uint64;
 *         }
 *         leaf carrier-number-of-entries {
 *             type uint64;
 *         }
 *         list lte-ran-mobility-idle-mode-inter-freq-carrier {
 *             key "eutra-carrier-arfcn";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf eutra-carrier-arfcn {
 *                 type uint16;
 *             }
 *             leaf-list q-rx-lev-min-sib5 {
 *                 type string;
 *             }
 *             leaf-list q-offset-freq {
 *                 type string;
 *             }
 *             leaf-list t-reselection-eutra {
 *                 type string;
 *             }
 *             leaf cell-reselection-priority {
 *                 type uint8;
 *             }
 *             leaf thresh-x-high {
 *                 type thresh-x-high;
 *             }
 *             leaf thresh-x-low {
 *                 type thresh-x-low;
 *             }
 *             leaf p-max {
 *                 type p-max;
 *             }
 *             leaf t-reselection-eutrasf-medium {
 *                 type uint8;
 *             }
 *             leaf t-reselection-eutrasf-high {
 *                 type uint8;
 *             }
 *             uses lte-ran-mobility-idle-mode-inter-freq-carrier-g;
 *         }
 *         uses lte-ran-mobility-idle-mode-inter-freq-g;
 *     }
 *     container lte-ran-mobility-idle-mode-irat {
 *         container lte-ran-mobility-idle-mode-irat-utra {
 *             leaf-list t-reselection-utra {
 *                 type string;
 *             }
 *             leaf t-reselection-utrasf-medium {
 *                 type uint8;
 *             }
 *             leaf t-reselection-utrasf-high {
 *                 type uint8;
 *             }
 *             leaf max-utranfdd-freq-entries {
 *                 type uint64;
 *             }
 *             leaf utranfdd-freq-number-of-entries {
 *                 type uint64;
 *             }
 *             list lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq {
 *                 key "utra-carrier-arfcn";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf utra-carrier-arfcn {
 *                     type uint16;
 *                 }
 *                 leaf-list q-rx-lev-min {
 *                     type string;
 *                 }
 *                 leaf-list q-qual-min {
 *                     type string;
 *                 }
 *                 leaf cell-reselection-priority {
 *                     type uint8;
 *                 }
 *                 leaf thresh-x-high {
 *                     type thresh-x-high;
 *                 }
 *                 leaf thresh-x-low {
 *                     type thresh-x-low;
 *                 }
 *                 leaf p-max-utra {
 *                     type p-max-utra;
 *                 }
 *                 uses lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq-g;
 *             }
 *             uses lte-ran-mobility-idle-mode-irat-utra-g;
 *         }
 *         container lte-ran-mobility-idle-mode-irat-geran {
 *             leaf-list t-reselection-geran {
 *                 type string;
 *             }
 *             leaf t-reselection-geransf-medium {
 *                 type uint8;
 *             }
 *             leaf t-reselection-geransf-high {
 *                 type uint8;
 *             }
 *             leaf max-geran-freq-group-entries {
 *                 type uint64;
 *             }
 *             leaf geran-freq-group-number-of-entries {
 *                 type uint64;
 *             }
 *             list lte-ran-mobility-idle-mode-irat-geran-geran-freq-group {
 *                 key "bccharfcn";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf band-indicator {
 *                     type enumeration;
 *                 }
 *                 leaf bccharfcn {
 *                     type uint16;
 *                 }
 *                 leaf-list q-rx-lev-min {
 *                     type string;
 *                 }
 *                 leaf cell-reselection-priority {
 *                     type uint8;
 *                 }
 *                 leaf thresh-x-high {
 *                     type thresh-x-high;
 *                 }
 *                 leaf thresh-x-low {
 *                     type thresh-x-low;
 *                 }
 *                 uses lte-ran-mobility-idle-mode-irat-geran-geran-freq-group-g;
 *             }
 *             uses lte-ran-mobility-idle-mode-irat-geran-g;
 *         }
 *         container lte-ran-mobility-idle-mode-irat-cdma2000 {
 *             leaf-list search-window-size {
 *                 type string;
 *             }
 *             leaf-list t-reselection-cdma2000 {
 *                 type string;
 *             }
 *             leaf t-reselection-cdma2000-sf-medium {
 *                 type uint8;
 *             }
 *             leaf t-reselection-cdma2000-sf-high {
 *                 type uint8;
 *             }
 *             leaf max-cdma2000-band-entries {
 *                 type uint64;
 *             }
 *             leaf cdma2000-band-number-of-entries {
 *                 type uint64;
 *             }
 *             list lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band {
 *                 key "band-class";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf band-class {
 *                     type band-class;
 *                 }
 *                 leaf cell-reselection-priority {
 *                     type uint8;
 *                 }
 *                 leaf thresh-x-high {
 *                     type thresh-x-high;
 *                 }
 *                 leaf thresh-x-low {
 *                     type thresh-x-low;
 *                 }
 *                 uses lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band-g;
 *             }
 *             uses lte-ran-mobility-idle-mode-irat-cdma2000-g;
 *         }
 *         uses lte-ran-mobility-idle-mode-irat-g;
 *     }
 *     uses lte-ran-mobility-idle-mode-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-idle-mode</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityIdleModeBuilder}.
 * @see LteRanMobilityIdleModeBuilder
 *
 */
public interface LteRanMobilityIdleMode
    extends
    ChildOf<LteRanMobility>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode>,
    LteRanMobilityIdleModeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode").intern();

    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.Common.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeCommon</code> <code>lteRanMobilityIdleModeCommon</code>, or <code>null</code> if not present
     */
    LteRanMobilityIdleModeCommon getLteRanMobilityIdleModeCommon();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IntraFreq.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq</code> <code>lteRanMobilityIdleModeIntraFreq</code>, or <code>null</code> if not present
     */
    LteRanMobilityIdleModeIntraFreq getLteRanMobilityIdleModeIntraFreq();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.InterFreq.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeInterFreq</code> <code>lteRanMobilityIdleModeInterFreq</code>, or <code>null</code> if not present
     */
    LteRanMobilityIdleModeInterFreq getLteRanMobilityIdleModeInterFreq();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat</code> <code>lteRanMobilityIdleModeIrat</code>, or <code>null</code> if not present
     */
    LteRanMobilityIdleModeIrat getLteRanMobilityIdleModeIrat();

}

