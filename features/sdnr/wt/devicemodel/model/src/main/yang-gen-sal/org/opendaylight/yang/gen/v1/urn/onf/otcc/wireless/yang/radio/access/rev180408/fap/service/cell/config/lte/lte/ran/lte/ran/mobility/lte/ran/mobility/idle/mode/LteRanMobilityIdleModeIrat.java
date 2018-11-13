package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mobility-idle-mode-irat {
 *     container lte-ran-mobility-idle-mode-irat-utra {
 *         leaf-list t-reselection-utra {
 *             type string;
 *         }
 *         leaf t-reselection-utrasf-medium {
 *             type uint8;
 *         }
 *         leaf t-reselection-utrasf-high {
 *             type uint8;
 *         }
 *         leaf max-utranfdd-freq-entries {
 *             type uint64;
 *         }
 *         leaf utranfdd-freq-number-of-entries {
 *             type uint64;
 *         }
 *         list lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq {
 *             key "utra-carrier-arfcn";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf utra-carrier-arfcn {
 *                 type uint16;
 *             }
 *             leaf-list q-rx-lev-min {
 *                 type string;
 *             }
 *             leaf-list q-qual-min {
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
 *             leaf p-max-utra {
 *                 type p-max-utra;
 *             }
 *             uses lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq-g;
 *         }
 *         uses lte-ran-mobility-idle-mode-irat-utra-g;
 *     }
 *     container lte-ran-mobility-idle-mode-irat-geran {
 *         leaf-list t-reselection-geran {
 *             type string;
 *         }
 *         leaf t-reselection-geransf-medium {
 *             type uint8;
 *         }
 *         leaf t-reselection-geransf-high {
 *             type uint8;
 *         }
 *         leaf max-geran-freq-group-entries {
 *             type uint64;
 *         }
 *         leaf geran-freq-group-number-of-entries {
 *             type uint64;
 *         }
 *         list lte-ran-mobility-idle-mode-irat-geran-geran-freq-group {
 *             key "bccharfcn";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf band-indicator {
 *                 type enumeration;
 *             }
 *             leaf bccharfcn {
 *                 type uint16;
 *             }
 *             leaf-list q-rx-lev-min {
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
 *             uses lte-ran-mobility-idle-mode-irat-geran-geran-freq-group-g;
 *         }
 *         uses lte-ran-mobility-idle-mode-irat-geran-g;
 *     }
 *     container lte-ran-mobility-idle-mode-irat-cdma2000 {
 *         leaf-list search-window-size {
 *             type string;
 *         }
 *         leaf-list t-reselection-cdma2000 {
 *             type string;
 *         }
 *         leaf t-reselection-cdma2000-sf-medium {
 *             type uint8;
 *         }
 *         leaf t-reselection-cdma2000-sf-high {
 *             type uint8;
 *         }
 *         leaf max-cdma2000-band-entries {
 *             type uint64;
 *         }
 *         leaf cdma2000-band-number-of-entries {
 *             type uint64;
 *         }
 *         list lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band {
 *             key "band-class";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf band-class {
 *                 type band-class;
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
 *             uses lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band-g;
 *         }
 *         uses lte-ran-mobility-idle-mode-irat-cdma2000-g;
 *     }
 *     uses lte-ran-mobility-idle-mode-irat-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-idle-mode/lte-ran-mobility-idle-mode-irat</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityIdleModeIratBuilder}.
 * @see LteRanMobilityIdleModeIratBuilder
 *
 */
public interface LteRanMobilityIdleModeIrat
    extends
    ChildOf<LteRanMobilityIdleMode>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat>,
    LteRanMobilityIdleModeIratG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-irat").intern();

    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.UTRA.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra</code> <code>lteRanMobilityIdleModeIratUtra</code>, or <code>null</code> if not present
     */
    LteRanMobilityIdleModeIratUtra getLteRanMobilityIdleModeIratUtra();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.GERAN.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratGeran</code> <code>lteRanMobilityIdleModeIratGeran</code>, or <code>null</code> if not present
     */
    LteRanMobilityIdleModeIratGeran getLteRanMobilityIdleModeIratGeran();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratCdma2000</code> <code>lteRanMobilityIdleModeIratCdma2000</code>, or <code>null</code> if not present
     */
    LteRanMobilityIdleModeIratCdma2000 getLteRanMobilityIdleModeIratCdma2000();

}

