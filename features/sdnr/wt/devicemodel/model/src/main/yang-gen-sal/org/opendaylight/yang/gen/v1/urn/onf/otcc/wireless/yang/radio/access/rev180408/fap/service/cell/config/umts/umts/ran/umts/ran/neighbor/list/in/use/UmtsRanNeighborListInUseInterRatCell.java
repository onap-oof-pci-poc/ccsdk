package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseInterRatCellG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.umts.ran.neighbor.list.in.use.inter.rat.cell.UmtsRanNeighborListInUseInterRatCellGsm;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.UMTS.RAN.NeighborListInUse.InterRATCell.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-neighbor-list-in-use-inter-rat-cell {
 *     leaf max-gsm-entries {
 *         type uint64;
 *     }
 *     leaf gsm-number-of-entries {
 *         type uint64;
 *     }
 *     list umts-ran-neighbor-list-in-use-inter-rat-cell-gsm {
 *         key "bccharfcn";
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
 *         uses umts-ran-neighbor-list-in-use-inter-rat-cell-gsm-g;
 *     }
 *     uses umts-ran-neighbor-list-in-use-inter-rat-cell-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-neighbor-list-in-use/umts-ran-neighbor-list-in-use-inter-rat-cell</i>
 *
 * <p>To create instances of this class use {@link UmtsRanNeighborListInUseInterRatCellBuilder}.
 * @see UmtsRanNeighborListInUseInterRatCellBuilder
 *
 */
public interface UmtsRanNeighborListInUseInterRatCell
    extends
    ChildOf<UmtsRanNeighborListInUse>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell>,
    UmtsRanNeighborListInUseInterRatCellG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-neighbor-list-in-use-inter-rat-cell").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.UMTS.RAN.NeighborListInUse.InterRATCell.GSM.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>umtsRanNeighborListInUseInterRatCellGsm</code>, or <code>null</code> if not present
     */
    List<UmtsRanNeighborListInUseInterRatCellGsm> getUmtsRanNeighborListInUseInterRatCellGsm();

}

