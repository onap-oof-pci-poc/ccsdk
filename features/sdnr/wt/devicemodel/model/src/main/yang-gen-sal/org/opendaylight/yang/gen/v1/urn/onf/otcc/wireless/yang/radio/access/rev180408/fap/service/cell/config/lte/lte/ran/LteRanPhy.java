package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPdsch;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyAntennaInfo;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyTddFrame;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-phy {
 *     container lte-ran-phy-antenna-info {
 *         leaf antenna-ports-count {
 *             type uint8;
 *         }
 *         uses lte-ran-phy-antenna-info-g;
 *     }
 *     container lte-ran-phy-pdsch {
 *         leaf-list pb {
 *             type string;
 *         }
 *         leaf-list pa {
 *             type int64;
 *         }
 *         uses lte-ran-phy-pdsch-g;
 *     }
 *     container lte-ran-phy-srs {
 *         leaf srs-enabled {
 *             type boolean;
 *         }
 *         leaf-list srs-bandwidth-config {
 *             type string;
 *         }
 *         leaf srs-max-up-pts {
 *             type boolean;
 *         }
 *         leaf ack-nack-srs-simultaneous-transmission {
 *             type boolean;
 *         }
 *         uses lte-ran-phy-srs-g;
 *     }
 *     container lte-ran-phy-prach {
 *         leaf-list root-sequence-index {
 *             type string;
 *         }
 *         leaf-list configuration-index {
 *             type string;
 *         }
 *         leaf high-speed-flag {
 *             type boolean;
 *         }
 *         leaf-list zero-correlation-zone-config {
 *             type string;
 *         }
 *         leaf-list freq-offset {
 *             type string;
 *         }
 *         uses lte-ran-phy-prach-g;
 *     }
 *     container lte-ran-phy-pucch {
 *         leaf delta-pucch-shift {
 *             type enumeration;
 *         }
 *         leaf-list nrbcqi {
 *             type string;
 *         }
 *         leaf ncsan {
 *             type uint8;
 *         }
 *         leaf-list n1-pucchan {
 *             type string;
 *         }
 *         leaf-list cqipucch-resource-index {
 *             type string;
 *         }
 *         leaf k {
 *             type k;
 *         }
 *         uses lte-ran-phy-pucch-g;
 *     }
 *     container lte-ran-phy-pusch {
 *         leaf nsb {
 *             type uint8;
 *         }
 *         leaf hopping-mode {
 *             type enumeration;
 *         }
 *         leaf-list hopping-offset {
 *             type string;
 *         }
 *         leaf enable64-qam {
 *             type boolean;
 *         }
 *         container lte-ran-phy-pusch-ulrs {
 *             leaf group-hopping-enabled {
 *                 type boolean;
 *             }
 *             leaf group-assignment-pusch {
 *                 type uint8;
 *             }
 *             leaf sequence-hopping-enabled {
 *                 type boolean;
 *             }
 *             leaf cyclic-shift {
 *                 type uint8;
 *             }
 *             uses lte-ran-phy-pusch-ulrs-g;
 *         }
 *         uses lte-ran-phy-pusch-g;
 *     }
 *     container lte-ran-phy-ul-power-control {
 *         leaf-list p0-nominal-pusch {
 *             type string;
 *         }
 *         leaf-list alpha {
 *             type string;
 *         }
 *         leaf-list p0-nominal-pucch {
 *             type string;
 *         }
 *         leaf delta-fpucch-format1 {
 *             type delta-fpucch-format1;
 *         }
 *         leaf delta-fpucch-format1b {
 *             type delta-fpucch-format1b;
 *         }
 *         leaf delta-fpucch-format2 {
 *             type delta-fpucch-format2;
 *         }
 *         leaf delta-fpucch-format2a {
 *             type delta-fpucch-format2a;
 *         }
 *         leaf delta-fpucch-format2b {
 *             type delta-fpucch-format2b;
 *         }
 *         leaf delta-preamble-msg3 {
 *             type delta-preamble-msg3;
 *         }
 *         uses lte-ran-phy-ul-power-control-g;
 *     }
 *     container lte-ran-phy-mbsfn {
 *         leaf neigh-cell-config {
 *             type uint8;
 *         }
 *         leaf max-sf-config-list-entries {
 *             type uint64;
 *         }
 *         leaf sf-config-list-number-of-entries {
 *             type uint64;
 *         }
 *         list lte-ran-phy-mbsfn-sf-config-list {
 *             key "radio-frame-allocation-period" "radioframe-allocation-offset" "radio-frame-allocation-size";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf sync-stratum-id {
 *                 type uint8;
 *             }
 *             leaf radio-frame-allocation-period {
 *                 type uint8;
 *             }
 *             leaf radioframe-allocation-offset {
 *                 type uint8;
 *             }
 *             leaf radio-frame-allocation-size {
 *                 type uint8;
 *             }
 *             leaf-list sub-frame-allocations {
 *                 type uint8;
 *             }
 *             uses lte-ran-phy-mbsfn-sf-config-list-g;
 *         }
 *         uses lte-ran-phy-mbsfn-g;
 *     }
 *     container lte-ran-phy-prs {
 *         leaf num-prs-resource-blocks {
 *             type num-prs-resource-blocks;
 *         }
 *         leaf prs-configuration-index {
 *             type uint16;
 *         }
 *         leaf num-consecutive-prs-subfames {
 *             type uint8;
 *         }
 *         uses lte-ran-phy-prs-g;
 *     }
 *     container lte-ran-phy-tdd-frame {
 *         leaf sub-frame-assignment {
 *             type uint8;
 *         }
 *         leaf special-subframe-patterns {
 *             type uint8;
 *         }
 *         uses lte-ran-phy-tdd-frame-g;
 *     }
 *     uses lte-ran-phy-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-phy</i>
 *
 * <p>To create instances of this class use {@link LteRanPhyBuilder}.
 * @see LteRanPhyBuilder
 *
 */
public interface LteRanPhy
    extends
    ChildOf<LteRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy>,
    LteRanPhyG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy").intern();

    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.AntennaInfo.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyAntennaInfo</code> <code>lteRanPhyAntennaInfo</code>, or <code>null</code> if not present
     */
    LteRanPhyAntennaInfo getLteRanPhyAntennaInfo();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.PDSCH.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPdsch</code> <code>lteRanPhyPdsch</code>, or <code>null</code> if not present
     */
    LteRanPhyPdsch getLteRanPhyPdsch();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.SRS.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhySrs</code> <code>lteRanPhySrs</code>, or <code>null</code> if not present
     */
    LteRanPhySrs getLteRanPhySrs();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.PRACH.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach</code> <code>lteRanPhyPrach</code>, or <code>null</code> if not present
     */
    LteRanPhyPrach getLteRanPhyPrach();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.PUCCH.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch</code> <code>lteRanPhyPucch</code>, or <code>null</code> if not present
     */
    LteRanPhyPucch getLteRanPhyPucch();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.PUSCH.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch</code> <code>lteRanPhyPusch</code>, or <code>null</code> if not present
     */
    LteRanPhyPusch getLteRanPhyPusch();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.ULPowerControl.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl</code> <code>lteRanPhyUlPowerControl</code>, or <code>null</code> if not present
     */
    LteRanPhyUlPowerControl getLteRanPhyUlPowerControl();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.MBSFN.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn</code> <code>lteRanPhyMbsfn</code>, or <code>null</code> if not present
     */
    LteRanPhyMbsfn getLteRanPhyMbsfn();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.PRS.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrs</code> <code>lteRanPhyPrs</code>, or <code>null</code> if not present
     */
    LteRanPhyPrs getLteRanPhyPrs();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.TDDFrame.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyTddFrame</code> <code>lteRanPhyTddFrame</code>, or <code>null</code> if not present
     */
    LteRanPhyTddFrame getLteRanPhyTddFrame();

}

