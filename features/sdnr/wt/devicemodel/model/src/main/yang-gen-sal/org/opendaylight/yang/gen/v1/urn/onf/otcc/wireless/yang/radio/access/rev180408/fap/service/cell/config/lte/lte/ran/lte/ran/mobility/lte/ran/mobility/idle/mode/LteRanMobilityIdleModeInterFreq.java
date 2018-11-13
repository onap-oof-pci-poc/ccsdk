package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeInterFreqG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.inter.freq.LteRanMobilityIdleModeInterFreqCarrier;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.LteRanMobilityIdleMode;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.InterFreq.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mobility-idle-mode-inter-freq {
 *     leaf max-carrier-entries {
 *         type uint64;
 *     }
 *     leaf carrier-number-of-entries {
 *         type uint64;
 *     }
 *     list lte-ran-mobility-idle-mode-inter-freq-carrier {
 *         key "eutra-carrier-arfcn";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf eutra-carrier-arfcn {
 *             type uint16;
 *         }
 *         leaf-list q-rx-lev-min-sib5 {
 *             type string;
 *         }
 *         leaf-list q-offset-freq {
 *             type string;
 *         }
 *         leaf-list t-reselection-eutra {
 *             type string;
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
 *         leaf p-max {
 *             type p-max;
 *         }
 *         leaf t-reselection-eutrasf-medium {
 *             type uint8;
 *         }
 *         leaf t-reselection-eutrasf-high {
 *             type uint8;
 *         }
 *         uses lte-ran-mobility-idle-mode-inter-freq-carrier-g;
 *     }
 *     uses lte-ran-mobility-idle-mode-inter-freq-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-idle-mode/lte-ran-mobility-idle-mode-inter-freq</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityIdleModeInterFreqBuilder}.
 * @see LteRanMobilityIdleModeInterFreqBuilder
 *
 */
public interface LteRanMobilityIdleModeInterFreq
    extends
    ChildOf<LteRanMobilityIdleMode>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeInterFreq>,
    LteRanMobilityIdleModeInterFreqG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-inter-freq").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.InterFreq.Carrier.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>lteRanMobilityIdleModeInterFreqCarrier</code>, or <code>null</code> if not present
     */
    List<LteRanMobilityIdleModeInterFreqCarrier> getLteRanMobilityIdleModeInterFreqCarrier();

}

