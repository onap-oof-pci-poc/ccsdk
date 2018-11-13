package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.lte.ran.neighbor.list.inter.rat.cell;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInterRatCellCdma2000G;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.LteRanNeighborListInterRatCell;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.LTE.RAN.NeighborList.InterRATCell.CDMA2000.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list lte-ran-neighbor-list-inter-rat-cell-cdma2000 {
 *     key "cid";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf must-include {
 *         type boolean;
 *     }
 *     leaf band-class {
 *         type uint8;
 *     }
 *     leaf arfcn {
 *         type uint16;
 *     }
 *     leaf pn-offset {
 *         type uint16;
 *     }
 *     leaf type {
 *         type enumeration;
 *     }
 *     leaf cid {
 *         type string;
 *     }
 *     uses lte-ran-neighbor-list-inter-rat-cell-cdma2000-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-neighbor-list/lte-ran-neighbor-list-inter-rat-cell/lte-ran-neighbor-list-inter-rat-cell-cdma2000</i>
 *
 * <p>To create instances of this class use {@link LteRanNeighborListInterRatCellCdma2000Builder}.
 * @see LteRanNeighborListInterRatCellCdma2000Builder
 * @see LteRanNeighborListInterRatCellCdma2000Key
 *
 */
public interface LteRanNeighborListInterRatCellCdma2000
    extends
    ChildOf<LteRanNeighborListInterRatCell>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.lte.ran.neighbor.list.inter.rat.cell.LteRanNeighborListInterRatCellCdma2000>,
    LteRanNeighborListInterRatCellCdma2000G,
    Identifiable<LteRanNeighborListInterRatCellCdma2000Key>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-neighbor-list-inter-rat-cell-cdma2000").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.lte.ran.neighbor.list.inter.rat.cell.LteRanNeighborListInterRatCellCdma2000Key</code> <code>key</code>, or <code>null</code> if not present
     */
    LteRanNeighborListInterRatCellCdma2000Key getKey();

}

