package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseInterRatCell;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseInterRatCellGsmG;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.GSM.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list lte-ran-neighbor-list-in-use-inter-rat-cell-gsm {
 *     key "plmnid" "lac" "ci";
 *     leaf plmnid {
 *         type string;
 *     }
 *     leaf lac {
 *         type uint16;
 *     }
 *     leaf bsic {
 *         type uint8;
 *     }
 *     leaf ci {
 *         type uint16;
 *     }
 *     leaf band-indicator {
 *         type enumeration;
 *     }
 *     leaf bccharfcn {
 *         type uint16;
 *     }
 *     uses lte-ran-neighbor-list-in-use-inter-rat-cell-gsm-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-neighbor-list-in-use/lte-ran-neighbor-list-in-use-inter-rat-cell/lte-ran-neighbor-list-in-use-inter-rat-cell-gsm</i>
 *
 * <p>To create instances of this class use {@link LteRanNeighborListInUseInterRatCellGsmBuilder}.
 * @see LteRanNeighborListInUseInterRatCellGsmBuilder
 * @see LteRanNeighborListInUseInterRatCellGsmKey
 *
 */
public interface LteRanNeighborListInUseInterRatCellGsm
    extends
    ChildOf<LteRanNeighborListInUseInterRatCell>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsm>,
    LteRanNeighborListInUseInterRatCellGsmG,
    Identifiable<LteRanNeighborListInUseInterRatCellGsmKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-neighbor-list-in-use-inter-rat-cell-gsm").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.lte.ran.neighbor.list.in.use.inter.rat.cell.LteRanNeighborListInUseInterRatCellGsmKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LteRanNeighborListInUseInterRatCellGsmKey getKey();

}

