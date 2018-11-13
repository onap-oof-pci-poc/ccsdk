package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPrachG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.PRACH.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-phy-prach {
 *     leaf-list root-sequence-index {
 *         type string;
 *     }
 *     leaf-list configuration-index {
 *         type string;
 *     }
 *     leaf high-speed-flag {
 *         type boolean;
 *     }
 *     leaf-list zero-correlation-zone-config {
 *         type string;
 *     }
 *     leaf-list freq-offset {
 *         type string;
 *     }
 *     uses lte-ran-phy-prach-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-phy/lte-ran-phy-prach</i>
 *
 * <p>To create instances of this class use {@link LteRanPhyPrachBuilder}.
 * @see LteRanPhyPrachBuilder
 *
 */
public interface LteRanPhyPrach
    extends
    ChildOf<LteRanPhy>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPrach>,
    LteRanPhyPrachG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-prach").intern();


}

