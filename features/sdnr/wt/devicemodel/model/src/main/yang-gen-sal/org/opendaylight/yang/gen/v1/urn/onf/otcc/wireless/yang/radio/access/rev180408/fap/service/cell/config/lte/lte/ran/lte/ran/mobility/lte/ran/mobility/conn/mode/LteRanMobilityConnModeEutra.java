package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityConnModeEutraG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityConnMode;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.LTE.RAN.Mobility.ConnMode.EUTRA.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mobility-conn-mode-eutra {
 *     leaf-list filter-coefficient-rsrp {
 *         type string;
 *     }
 *     leaf-list filter-coefficient-rsrq {
 *         type string;
 *     }
 *     leaf a1-threshold-rsrp {
 *         type uint8;
 *     }
 *     leaf a1-threshold-rsrq {
 *         type uint8;
 *     }
 *     leaf a2-threshold-rsrp {
 *         type uint8;
 *     }
 *     leaf a2-threshold-rsrq {
 *         type uint8;
 *     }
 *     leaf-list a3-offset {
 *         type string;
 *     }
 *     leaf report-on-leave {
 *         type boolean;
 *     }
 *     leaf a4-threshold-rsrp {
 *         type uint8;
 *     }
 *     leaf a4-threshold-rsrq {
 *         type uint8;
 *     }
 *     leaf a5-threshold1-rsrp {
 *         type uint8;
 *     }
 *     leaf a5-threshold1-rsrq {
 *         type uint8;
 *     }
 *     leaf a5-threshold2-rsrp {
 *         type uint8;
 *     }
 *     leaf a5-threshold2-rsrq {
 *         type uint8;
 *     }
 *     leaf-list hysteresis {
 *         type string;
 *     }
 *     leaf-list time-to-trigger {
 *         type uint16;
 *     }
 *     leaf trigger-quantity {
 *         type enumeration;
 *     }
 *     leaf report-quantity {
 *         type enumeration;
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
 *     uses lte-ran-mobility-conn-mode-eutra-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-conn-mode/lte-ran-mobility-conn-mode-eutra</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityConnModeEutraBuilder}.
 * @see LteRanMobilityConnModeEutraBuilder
 *
 */
public interface LteRanMobilityConnModeEutra
    extends
    ChildOf<LteRanMobilityConnMode>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.conn.mode.LteRanMobilityConnModeEutra>,
    LteRanMobilityConnModeEutraG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-conn-mode-eutra").intern();


}

