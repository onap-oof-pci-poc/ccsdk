package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.LteRanMobilityIdleModeIrat;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraG;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.UTRA.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-mobility-idle-mode-irat-utra {
 *     leaf-list t-reselection-utra {
 *         type string;
 *     }
 *     leaf t-reselection-utrasf-medium {
 *         type uint8;
 *     }
 *     leaf t-reselection-utrasf-high {
 *         type uint8;
 *     }
 *     leaf max-utranfdd-freq-entries {
 *         type uint64;
 *     }
 *     leaf utranfdd-freq-number-of-entries {
 *         type uint64;
 *     }
 *     list lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq {
 *         key "utra-carrier-arfcn";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf utra-carrier-arfcn {
 *             type uint16;
 *         }
 *         leaf-list q-rx-lev-min {
 *             type string;
 *         }
 *         leaf-list q-qual-min {
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
 *         leaf p-max-utra {
 *             type p-max-utra;
 *         }
 *         uses lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq-g;
 *     }
 *     uses lte-ran-mobility-idle-mode-irat-utra-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-idle-mode/lte-ran-mobility-idle-mode-irat/lte-ran-mobility-idle-mode-irat-utra</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityIdleModeIratUtraBuilder}.
 * @see LteRanMobilityIdleModeIratUtraBuilder
 *
 */
public interface LteRanMobilityIdleModeIratUtra
    extends
    ChildOf<LteRanMobilityIdleModeIrat>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra>,
    LteRanMobilityIdleModeIratUtraG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-irat-utra").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.UTRA.UTRANFDDFreq.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>lteRanMobilityIdleModeIratUtraUtranfddFreq</code>, or <code>null</code> if not present
     */
    List<LteRanMobilityIdleModeIratUtraUtranfddFreq> getLteRanMobilityIdleModeIratUtraUtranfddFreq();

}

