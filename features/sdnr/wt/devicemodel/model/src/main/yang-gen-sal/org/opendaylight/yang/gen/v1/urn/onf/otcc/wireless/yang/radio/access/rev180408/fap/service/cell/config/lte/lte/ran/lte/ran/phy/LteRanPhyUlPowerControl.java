package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyUlPowerControlG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.ULPowerControl.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-phy-ul-power-control {
 *     leaf-list p0-nominal-pusch {
 *         type string;
 *     }
 *     leaf-list alpha {
 *         type string;
 *     }
 *     leaf-list p0-nominal-pucch {
 *         type string;
 *     }
 *     leaf delta-fpucch-format1 {
 *         type delta-fpucch-format1;
 *     }
 *     leaf delta-fpucch-format1b {
 *         type delta-fpucch-format1b;
 *     }
 *     leaf delta-fpucch-format2 {
 *         type delta-fpucch-format2;
 *     }
 *     leaf delta-fpucch-format2a {
 *         type delta-fpucch-format2a;
 *     }
 *     leaf delta-fpucch-format2b {
 *         type delta-fpucch-format2b;
 *     }
 *     leaf delta-preamble-msg3 {
 *         type delta-preamble-msg3;
 *     }
 *     uses lte-ran-phy-ul-power-control-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-phy/lte-ran-phy-ul-power-control</i>
 *
 * <p>To create instances of this class use {@link LteRanPhyUlPowerControlBuilder}.
 * @see LteRanPhyUlPowerControlBuilder
 *
 */
public interface LteRanPhyUlPowerControl
    extends
    ChildOf<LteRanPhy>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyUlPowerControl>,
    LteRanPhyUlPowerControlG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-ul-power-control").intern();


}

