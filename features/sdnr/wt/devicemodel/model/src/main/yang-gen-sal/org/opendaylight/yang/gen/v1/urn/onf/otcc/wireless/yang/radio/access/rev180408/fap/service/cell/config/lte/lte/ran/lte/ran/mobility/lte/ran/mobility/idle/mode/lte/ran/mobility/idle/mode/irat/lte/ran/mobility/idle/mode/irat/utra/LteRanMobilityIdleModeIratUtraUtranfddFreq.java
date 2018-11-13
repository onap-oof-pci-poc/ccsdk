package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.LteRanMobilityIdleModeIratUtra;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanMobilityIdleModeIratUtraUtranfddFreqG;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.UTRA.UTRANFDDFreq.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq {
 *     key "utra-carrier-arfcn";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf utra-carrier-arfcn {
 *         type uint16;
 *     }
 *     leaf-list q-rx-lev-min {
 *         type string;
 *     }
 *     leaf-list q-qual-min {
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
 *     leaf p-max-utra {
 *         type p-max-utra;
 *     }
 *     uses lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-mobility/lte-ran-mobility-idle-mode/lte-ran-mobility-idle-mode-irat/lte-ran-mobility-idle-mode-irat-utra/lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq</i>
 *
 * <p>To create instances of this class use {@link LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder}.
 * @see LteRanMobilityIdleModeIratUtraUtranfddFreqBuilder
 * @see LteRanMobilityIdleModeIratUtraUtranfddFreqKey
 *
 */
public interface LteRanMobilityIdleModeIratUtraUtranfddFreq
    extends
    ChildOf<LteRanMobilityIdleModeIratUtra>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreq>,
    LteRanMobilityIdleModeIratUtraUtranfddFreqG,
    Identifiable<LteRanMobilityIdleModeIratUtraUtranfddFreqKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.mobility.lte.ran.mobility.idle.mode.lte.ran.mobility.idle.mode.irat.lte.ran.mobility.idle.mode.irat.utra.LteRanMobilityIdleModeIratUtraUtranfddFreqKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LteRanMobilityIdleModeIratUtraUtranfddFreqKey getKey();

}

