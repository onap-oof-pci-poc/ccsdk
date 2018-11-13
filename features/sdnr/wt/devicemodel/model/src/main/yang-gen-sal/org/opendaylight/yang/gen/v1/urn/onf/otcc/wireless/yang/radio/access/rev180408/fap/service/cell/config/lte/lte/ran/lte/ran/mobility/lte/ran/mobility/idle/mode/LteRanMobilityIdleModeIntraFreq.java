package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIntraFreqG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IntraFreq.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mobility-idle-mode-intra-freq {
 *     leaf-list q-rx-lev-min-sib1 {
 *         type string;
 *     }
 *     leaf-list q-rx-lev-min-sib3 {
 *         type string;
 *     }
 *     leaf q-rx-lev-min-offset {
 *         type q-rx-lev-min-offset;
 *     }
 *     leaf-list s-intra-search {
 *         type string;
 *     }
 *     leaf-list t-reselection-eutra {
 *         type string;
 *     }
 *     leaf-list s-non-intra-search {
 *         type string;
 *     }
 *     leaf cell-reselection-priority {
 *         type uint8;
 *     }
 *     leaf p-max {
 *         type p-max;
 *     }
 *     leaf thresh-serving-low {
 *         type thresh-serving-low;
 *     }
 *     leaf t-reselection-eutrasf-medium {
 *         type uint8;
 *     }
 *     leaf t-reselection-eutrasf-high {
 *         type uint8;
 *     }
 *     uses lte-ran-mobility-idle-mode-intra-freq-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-idle-mode/lte-ran-mobility-idle-mode-intra-freq</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityIdleModeIntraFreqBuilder}.
 * @see LteRanMobilityIdleModeIntraFreqBuilder
 *
 */
public interface LteRanMobilityIdleModeIntraFreq
    extends
    ChildOf<LteRanMobilityIdleMode>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIntraFreq>,
    LteRanMobilityIdleModeIntraFreqG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-intra-freq").intern();


}

