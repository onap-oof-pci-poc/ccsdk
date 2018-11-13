package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanPhyMbsfnSfConfigListG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.LteRanPhyMbsfn;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.LTE.RAN.PHY.MBSFN.SFConfigList.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list lte-ran-phy-mbsfn-sf-config-list {
 *     key "radio-frame-allocation-period" "radioframe-allocation-offset" "radio-frame-allocation-size";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf sync-stratum-id {
 *         type uint8;
 *     }
 *     leaf radio-frame-allocation-period {
 *         type uint8;
 *     }
 *     leaf radioframe-allocation-offset {
 *         type uint8;
 *     }
 *     leaf radio-frame-allocation-size {
 *         type uint8;
 *     }
 *     leaf-list sub-frame-allocations {
 *         type uint8;
 *     }
 *     uses lte-ran-phy-mbsfn-sf-config-list-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-phy/lte-ran-phy-mbsfn/lte-ran-phy-mbsfn-sf-config-list</i>
 *
 * <p>To create instances of this class use {@link LteRanPhyMbsfnSfConfigListBuilder}.
 * @see LteRanPhyMbsfnSfConfigListBuilder
 * @see LteRanPhyMbsfnSfConfigListKey
 *
 */
public interface LteRanPhyMbsfnSfConfigList
    extends
    ChildOf<LteRanPhyMbsfn>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigList>,
    LteRanPhyMbsfnSfConfigListG,
    Identifiable<LteRanPhyMbsfnSfConfigListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-phy-mbsfn-sf-config-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.phy.lte.ran.phy.mbsfn.LteRanPhyMbsfnSfConfigListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LteRanPhyMbsfnSfConfigListKey getKey();

}

