package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPuschG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.PUSCH.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-phy-pusch {
 *     leaf nsb {
 *         type uint8;
 *     }
 *     leaf hopping-mode {
 *         type enumeration;
 *     }
 *     leaf-list hopping-offset {
 *         type string;
 *     }
 *     leaf enable64-qam {
 *         type boolean;
 *     }
 *     container lte-ran-phy-pusch-ulrs {
 *         leaf group-hopping-enabled {
 *             type boolean;
 *         }
 *         leaf group-assignment-pusch {
 *             type uint8;
 *         }
 *         leaf sequence-hopping-enabled {
 *             type boolean;
 *         }
 *         leaf cyclic-shift {
 *             type uint8;
 *         }
 *         uses lte-ran-phy-pusch-ulrs-g;
 *     }
 *     uses lte-ran-phy-pusch-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-phy/lte-ran-phy-pusch</i>
 *
 * <p>To create instances of this class use {@link LteRanPhyPuschBuilder}.
 * @see LteRanPhyPuschBuilder
 *
 */
public interface LteRanPhyPusch
    extends
    ChildOf<LteRanPhy>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPusch>,
    LteRanPhyPuschG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-pusch").intern();

    /**
     * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.PUSCH.ULRS.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.pusch.LteRanPhyPuschUlrs</code> <code>lteRanPhyPuschUlrs</code>, or <code>null</code> if not present
     */
    LteRanPhyPuschUlrs getLteRanPhyPuschUlrs();

}

