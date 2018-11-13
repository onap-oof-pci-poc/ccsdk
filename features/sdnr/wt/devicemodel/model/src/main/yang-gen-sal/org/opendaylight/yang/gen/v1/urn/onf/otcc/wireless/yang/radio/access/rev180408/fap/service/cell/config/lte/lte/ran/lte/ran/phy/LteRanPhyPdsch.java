package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyPdschG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.PDSCH.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-phy-pdsch {
 *     leaf-list pb {
 *         type string;
 *     }
 *     leaf-list pa {
 *         type int64;
 *     }
 *     uses lte-ran-phy-pdsch-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-phy/lte-ran-phy-pdsch</i>
 *
 * <p>To create instances of this class use {@link LteRanPhyPdschBuilder}.
 * @see LteRanPhyPdschBuilder
 *
 */
public interface LteRanPhyPdsch
    extends
    ChildOf<LteRanPhy>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyPdsch>,
    LteRanPhyPdschG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-pdsch").intern();


}

