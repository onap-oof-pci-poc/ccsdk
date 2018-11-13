package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschUlrsG;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.PUSCH.ULRS.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-phy-pusch-ulrs {
 *     leaf group-hopping-enabled {
 *         type boolean;
 *     }
 *     leaf group-assignment-pusch {
 *         type uint8;
 *     }
 *     leaf sequence-hopping-enabled {
 *         type boolean;
 *     }
 *     leaf cyclic-shift {
 *         type uint8;
 *     }
 *     uses lte-ran-phy-pusch-ulrs-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-phy/lte-ran-phy-pusch/lte-ran-phy-pusch-ulrs</i>
 *
 * <p>To create instances of this class use {@link LteRanPhyPuschUlrsBuilder}.
 * @see LteRanPhyPuschUlrsBuilder
 *
 */
public interface LteRanPhyPuschUlrs
    extends
    ChildOf<LteRanPhyPusch>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs>,
    LteRanPhyPuschUlrsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-pusch-ulrs").intern();


}

