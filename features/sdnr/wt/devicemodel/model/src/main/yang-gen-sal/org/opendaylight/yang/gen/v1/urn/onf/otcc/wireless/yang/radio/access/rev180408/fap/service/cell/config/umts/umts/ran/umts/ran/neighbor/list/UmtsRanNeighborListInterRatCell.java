package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInterRatCellG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.umts.ran.neighbor.list.inter.rat.cell.UmtsRanNeighborListInterRatCellGsm;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.UMTS.RAN.NeighborList.InterRATCell.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-neighbor-list-inter-rat-cell {
 *     leaf max-gsm-entries {
 *         type uint64;
 *     }
 *     leaf gsm-number-of-entries {
 *         type uint64;
 *     }
 *     list umts-ran-neighbor-list-inter-rat-cell-gsm {
 *         key "bccharfcn";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf must-include {
 *             type boolean;
 *         }
 *         leaf plmnid {
 *             type string;
 *         }
 *         leaf lac {
 *             type uint16;
 *         }
 *         leaf bsic {
 *             type uint8;
 *         }
 *         leaf ci {
 *             type uint16;
 *         }
 *         leaf band-indicator {
 *             type enumeration;
 *         }
 *         leaf bccharfcn {
 *             type uint16;
 *         }
 *         uses umts-ran-neighbor-list-inter-rat-cell-gsm-g;
 *     }
 *     uses umts-ran-neighbor-list-inter-rat-cell-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-neighbor-list/umts-ran-neighbor-list-inter-rat-cell</i>
 *
 * <p>To create instances of this class use {@link UmtsRanNeighborListInterRatCellBuilder}.
 * @see UmtsRanNeighborListInterRatCellBuilder
 *
 */
public interface UmtsRanNeighborListInterRatCell
    extends
    ChildOf<UmtsRanNeighborList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.UmtsRanNeighborListInterRatCell>,
    UmtsRanNeighborListInterRatCellG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-neighbor-list-inter-rat-cell").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.UMTS.RAN.NeighborList.InterRATCell.GSM.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>umtsRanNeighborListInterRatCellGsm</code>, or <code>null</code> if not present
     */
    List<UmtsRanNeighborListInterRatCellGsm> getUmtsRanNeighborListInterRatCellGsm();

}

