package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPucchG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.PUCCH.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-phy-pucch {
 *     leaf delta-pucch-shift {
 *         type enumeration;
 *     }
 *     leaf-list nrbcqi {
 *         type string;
 *     }
 *     leaf ncsan {
 *         type uint8;
 *     }
 *     leaf-list n1-pucchan {
 *         type string;
 *     }
 *     leaf-list cqipucch-resource-index {
 *         type string;
 *     }
 *     leaf k {
 *         type k;
 *     }
 *     uses lte-ran-phy-pucch-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-phy/lte-ran-phy-pucch</i>
 *
 * <p>To create instances of this class use {@link LteRanPhyPucchBuilder}.
 * @see LteRanPhyPucchBuilder
 *
 */
public interface LteRanPhyPucch
    extends
    ChildOf<LteRanPhy>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPucch>,
    LteRanPhyPucchG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-pucch").intern();


}

