package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseLteCellG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.LTE.RAN.NeighborListInUse.LTECell.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list lte-ran-neighbor-list-in-use-lte-cell {
 *     key "plmnid" "cid";
 *     leaf plmnid {
 *         type string;
 *     }
 *     leaf cid {
 *         type uint32;
 *     }
 *     leaf eutra-carrier-arfcn {
 *         type uint16;
 *     }
 *     leaf phy-cell-id {
 *         type uint16;
 *     }
 *     leaf q-offset {
 *         type int64;
 *     }
 *     leaf cio {
 *         type int64;
 *     }
 *     leaf rs-tx-power {
 *         type rs-tx-power;
 *     }
 *     leaf blacklisted {
 *         type boolean;
 *     }
 *     uses lte-ran-neighbor-list-in-use-lte-cell-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-neighbor-list-in-use/lte-ran-neighbor-list-in-use-lte-cell</i>
 *
 * <p>To create instances of this class use {@link LteRanNeighborListInUseLteCellBuilder}.
 * @see LteRanNeighborListInUseLteCellBuilder
 * @see LteRanNeighborListInUseLteCellKey
 *
 */
public interface LteRanNeighborListInUseLteCell
    extends
    ChildOf<LteRanNeighborListInUse>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell>,
    LteRanNeighborListInUseLteCellG,
    Identifiable<LteRanNeighborListInUseLteCellKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-neighbor-list-in-use-lte-cell").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCellKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LteRanNeighborListInUseLteCellKey getKey();

}

