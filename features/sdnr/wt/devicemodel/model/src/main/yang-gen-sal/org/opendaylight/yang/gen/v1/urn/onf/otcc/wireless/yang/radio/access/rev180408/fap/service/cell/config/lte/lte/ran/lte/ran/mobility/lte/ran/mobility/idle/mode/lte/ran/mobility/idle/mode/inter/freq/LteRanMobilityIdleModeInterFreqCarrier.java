package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqCarrierG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeInterFreq;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.InterFreq.Carrier.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list lte-ran-mobility-idle-mode-inter-freq-carrier {
 *     key "eutra-carrier-arfcn";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf eutra-carrier-arfcn {
 *         type uint16;
 *     }
 *     leaf-list q-rx-lev-min-sib5 {
 *         type string;
 *     }
 *     leaf-list q-offset-freq {
 *         type string;
 *     }
 *     leaf-list t-reselection-eutra {
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
 *     leaf p-max {
 *         type p-max;
 *     }
 *     leaf t-reselection-eutrasf-medium {
 *         type uint8;
 *     }
 *     leaf t-reselection-eutrasf-high {
 *         type uint8;
 *     }
 *     uses lte-ran-mobility-idle-mode-inter-freq-carrier-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-idle-mode/lte-ran-mobility-idle-mode-inter-freq/lte-ran-mobility-idle-mode-inter-freq-carrier</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityIdleModeInterFreqCarrierBuilder}.
 * @see LteRanMobilityIdleModeInterFreqCarrierBuilder
 * @see LteRanMobilityIdleModeInterFreqCarrierKey
 *
 */
public interface LteRanMobilityIdleModeInterFreqCarrier
    extends
    ChildOf<LteRanMobilityIdleModeInterFreq>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier>,
    LteRanMobilityIdleModeInterFreqCarrierG,
    Identifiable<LteRanMobilityIdleModeInterFreqCarrierKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-inter-freq-carrier").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrierKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LteRanMobilityIdleModeInterFreqCarrierKey getKey();

}

