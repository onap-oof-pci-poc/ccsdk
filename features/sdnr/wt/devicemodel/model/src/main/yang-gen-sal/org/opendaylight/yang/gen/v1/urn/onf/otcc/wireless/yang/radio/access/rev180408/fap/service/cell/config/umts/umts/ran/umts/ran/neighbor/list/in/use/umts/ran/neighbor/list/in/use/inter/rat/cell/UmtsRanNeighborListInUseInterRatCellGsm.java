package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.umts.ran.neighbor.list.in.use.inter.rat.cell;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseInterRatCellGsmG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.UMTS.RAN.NeighborListInUse.InterRATCell.GSM.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list umts-ran-neighbor-list-in-use-inter-rat-cell-gsm {
 *     key "bccharfcn";
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
 *     uses umts-ran-neighbor-list-in-use-inter-rat-cell-gsm-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-neighbor-list-in-use/umts-ran-neighbor-list-in-use-inter-rat-cell/umts-ran-neighbor-list-in-use-inter-rat-cell-gsm</i>
 *
 * <p>To create instances of this class use {@link UmtsRanNeighborListInUseInterRatCellGsmBuilder}.
 * @see UmtsRanNeighborListInUseInterRatCellGsmBuilder
 * @see UmtsRanNeighborListInUseInterRatCellGsmKey
 *
 */
public interface UmtsRanNeighborListInUseInterRatCellGsm
    extends
    ChildOf<UmtsRanNeighborListInUseInterRatCell>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.umts.ran.neighbor.list.in.use.inter.rat.cell.UmtsRanNeighborListInUseInterRatCellGsm>,
    UmtsRanNeighborListInUseInterRatCellGsmG,
    Identifiable<UmtsRanNeighborListInUseInterRatCellGsmKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-neighbor-list-in-use-inter-rat-cell-gsm").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.umts.ran.neighbor.list.in.use.inter.rat.cell.UmtsRanNeighborListInUseInterRatCellGsmKey</code> <code>key</code>, or <code>null</code> if not present
     */
    UmtsRanNeighborListInUseInterRatCellGsmKey getKey();

}

