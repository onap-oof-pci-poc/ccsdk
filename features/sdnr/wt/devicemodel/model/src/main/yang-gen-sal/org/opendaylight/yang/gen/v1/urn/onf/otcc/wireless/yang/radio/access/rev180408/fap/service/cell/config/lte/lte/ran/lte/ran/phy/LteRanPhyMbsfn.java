package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanPhy;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.PHY.MBSFN.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-phy-mbsfn {
 *     leaf neigh-cell-config {
 *         type uint8;
 *     }
 *     leaf max-sf-config-list-entries {
 *         type uint64;
 *     }
 *     leaf sf-config-list-number-of-entries {
 *         type uint64;
 *     }
 *     list lte-ran-phy-mbsfn-sf-config-list {
 *         key "radio-frame-allocation-period" "radioframe-allocation-offset" "radio-frame-allocation-size";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf sync-stratum-id {
 *             type uint8;
 *         }
 *         leaf radio-frame-allocation-period {
 *             type uint8;
 *         }
 *         leaf radioframe-allocation-offset {
 *             type uint8;
 *         }
 *         leaf radio-frame-allocation-size {
 *             type uint8;
 *         }
 *         leaf-list sub-frame-allocations {
 *             type uint8;
 *         }
 *         uses lte-ran-phy-mbsfn-sf-config-list-g;
 *     }
 *     uses lte-ran-phy-mbsfn-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-phy/lte-ran-phy-mbsfn</i>
 *
 * <p>To create instances of this class use {@link LteRanPhyMbsfnBuilder}.
 * @see LteRanPhyMbsfnBuilder
 *
 */
public interface LteRanPhyMbsfn
    extends
    ChildOf<LteRanPhy>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn>,
    LteRanPhyMbsfnG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-mbsfn").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.LTE.RAN.PHY.MBSFN.SFConfigList.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>lteRanPhyMbsfnSfConfigList</code>, or <code>null</code> if not present
     */
    List<LteRanPhyMbsfnSfConfigList> getLteRanPhyMbsfnSfConfigList();

}

