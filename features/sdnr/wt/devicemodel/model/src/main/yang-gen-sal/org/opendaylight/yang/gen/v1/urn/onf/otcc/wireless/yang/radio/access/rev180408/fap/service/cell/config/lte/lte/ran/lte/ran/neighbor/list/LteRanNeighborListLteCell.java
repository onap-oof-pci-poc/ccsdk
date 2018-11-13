package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborList;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListLteCellG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.CellConfig.LTE.RAN.NeighborList.LTECell.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list lte-ran-neighbor-list-lte-cell {
 *     key "plmnid" "cid";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf must-include {
 *         type boolean;
 *     }
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
 *     uses lte-ran-neighbor-list-lte-cell-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-neighbor-list/lte-ran-neighbor-list-lte-cell</i>
 *
 * <p>To create instances of this class use {@link LteRanNeighborListLteCellBuilder}.
 * @see LteRanNeighborListLteCellBuilder
 * @see LteRanNeighborListLteCellKey
 *
 */
public interface LteRanNeighborListLteCell
    extends
    ChildOf<LteRanNeighborList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListLteCell>,
    LteRanNeighborListLteCellG,
    Identifiable<LteRanNeighborListLteCellKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-neighbor-list-lte-cell").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListLteCellKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LteRanNeighborListLteCellKey getKey();

}

