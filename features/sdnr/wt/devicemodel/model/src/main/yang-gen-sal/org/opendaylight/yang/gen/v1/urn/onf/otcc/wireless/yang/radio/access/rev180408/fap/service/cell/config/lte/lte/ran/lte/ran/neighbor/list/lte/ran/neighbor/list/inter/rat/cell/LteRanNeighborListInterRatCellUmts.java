package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.lte.ran.neighbor.list.inter.rat.cell;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInterRatCellUmtsG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.LTE.RAN.NeighborList.InterRATCell.UMTS.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list lte-ran-neighbor-list-inter-rat-cell-umts {
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
 *     leaf rncid {
 *         type uint16;
 *     }
 *     leaf cid {
 *         type uint16;
 *     }
 *     leaf lac {
 *         type uint16;
 *     }
 *     leaf rac {
 *         type uint8;
 *     }
 *     leaf ura {
 *         type uint16;
 *     }
 *     leaf uarfcnul {
 *         type uint16;
 *     }
 *     leaf uarfcndl {
 *         type uint16;
 *     }
 *     leaf pcpich-scrambling-code {
 *         type uint16;
 *     }
 *     leaf pcpich-tx-power {
 *         type pcpich-tx-power;
 *     }
 *     uses lte-ran-neighbor-list-inter-rat-cell-umts-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-neighbor-list/lte-ran-neighbor-list-inter-rat-cell/lte-ran-neighbor-list-inter-rat-cell-umts</i>
 *
 * <p>To create instances of this class use {@link LteRanNeighborListInterRatCellUmtsBuilder}.
 * @see LteRanNeighborListInterRatCellUmtsBuilder
 * @see LteRanNeighborListInterRatCellUmtsKey
 *
 */
public interface LteRanNeighborListInterRatCellUmts
    extends
    ChildOf<LteRanNeighborListInterRatCell>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.lte.ran.neighbor.list.inter.rat.cell.LteRanNeighborListInterRatCellUmts>,
    LteRanNeighborListInterRatCellUmtsG,
    Identifiable<LteRanNeighborListInterRatCellUmtsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-neighbor-list-inter-rat-cell-umts").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.lte.ran.neighbor.list.inter.rat.cell.LteRanNeighborListInterRatCellUmtsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LteRanNeighborListInterRatCellUmtsKey getKey();

}

