package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityConnMode;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeIratG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.LTE.RAN.Mobility.ConnMode.IRAT.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mobility-conn-mode-irat {
 *     leaf-list qoffsett-utra {
 *         type string;
 *     }
 *     leaf-list filter-coefficient-utra {
 *         type string;
 *     }
 *     leaf meas-quantity-utrafdd {
 *         type enumeration;
 *     }
 *     leaf b1-threshold-utrarscp {
 *         type b1-threshold-utrarscp;
 *     }
 *     leaf b1-threshold-utra-ec-n0 {
 *         type b1-threshold-utra-ec-n0;
 *     }
 *     leaf-list qoffset-geran {
 *         type string;
 *     }
 *     leaf-list filter-coefficient-geran {
 *         type string;
 *     }
 *     leaf b1-threshold-geran {
 *         type b1-threshold-geran;
 *     }
 *     leaf-list qoffset-cdma2000 {
 *         type string;
 *     }
 *     leaf meas-quantity-cdma2000 {
 *         type enumeration;
 *     }
 *     leaf b1-threshold-cdma2000 {
 *         type b1-threshold-cdma2000;
 *     }
 *     leaf b2-threshold2-utrarscp {
 *         type b2-threshold2-utrarscp;
 *     }
 *     leaf b2-threshold2-utra-ec-n0 {
 *         type b2-threshold2-utra-ec-n0;
 *     }
 *     leaf b2-threshold2-geran {
 *         type b2-threshold2-geran;
 *     }
 *     leaf b2-threshold2-cdma2000 {
 *         type b2-threshold2-cdma2000;
 *     }
 *     leaf-list hysteresis {
 *         type string;
 *     }
 *     leaf-list time-to-trigger {
 *         type uint16;
 *     }
 *     leaf max-report-cells {
 *         type uint8;
 *     }
 *     leaf report-interval {
 *         type report-interval;
 *     }
 *     leaf report-amount {
 *         type uint8;
 *     }
 *     uses lte-ran-mobility-conn-mode-irat-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-conn-mode/lte-ran-mobility-conn-mode-irat</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityConnModeIratBuilder}.
 * @see LteRanMobilityConnModeIratBuilder
 *
 */
public interface LteRanMobilityConnModeIrat
    extends
    ChildOf<LteRanMobilityConnMode>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeIrat>,
    LteRanMobilityConnModeIratG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-conn-mode-irat").intern();


}

