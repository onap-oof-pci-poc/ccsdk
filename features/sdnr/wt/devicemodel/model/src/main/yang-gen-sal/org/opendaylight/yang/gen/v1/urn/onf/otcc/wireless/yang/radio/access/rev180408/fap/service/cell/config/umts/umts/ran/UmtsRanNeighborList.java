package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.UmtsRanNeighborListInterFreqCell;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.UmtsRanNeighborListInterRatCell;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.UmtsRanNeighborListIntraFreqCell;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.NeighborList.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-neighbor-list {
 *     leaf max-intra-freq-cell-entries {
 *         type uint64;
 *     }
 *     leaf max-inter-freq-cell-entries {
 *         type uint64;
 *     }
 *     leaf intra-freq-cell-number-of-entries {
 *         type uint64;
 *     }
 *     leaf inter-freq-cell-number-of-entries {
 *         type uint64;
 *     }
 *     list umts-ran-neighbor-list-intra-freq-cell {
 *         key "pcpich-scrambling-code";
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
 *         leaf rncid {
 *             type uint16;
 *         }
 *         leaf cid {
 *             type uint16;
 *         }
 *         leaf lac {
 *             type uint16;
 *         }
 *         leaf rac {
 *             type uint8;
 *         }
 *         leaf ura {
 *             type uint16;
 *         }
 *         leaf pcpich-scrambling-code {
 *             type uint16;
 *         }
 *         leaf pcpich-tx-power {
 *             type pcpich-tx-power;
 *         }
 *         leaf collocated-inter-freq-cell {
 *             type uint32;
 *         }
 *         leaf max-tx-power {
 *             type max-tx-power;
 *         }
 *         leaf max-dpc-htx-power {
 *             type max-dpc-htx-power;
 *         }
 *         uses umts-ran-neighbor-list-intra-freq-cell-g;
 *     }
 *     list umts-ran-neighbor-list-inter-freq-cell {
 *         key "pcpich-scrambling-code" "uarfcndl";
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
 *         leaf rncid {
 *             type uint16;
 *         }
 *         leaf cid {
 *             type uint16;
 *         }
 *         leaf lac {
 *             type uint16;
 *         }
 *         leaf rac {
 *             type uint8;
 *         }
 *         leaf ura {
 *             type uint16;
 *         }
 *         leaf uarfcnul {
 *             type uint16;
 *         }
 *         leaf uarfcndl {
 *             type uint16;
 *         }
 *         leaf pcpich-scrambling-code {
 *             type uint16;
 *         }
 *         leaf pcpich-tx-power {
 *             type pcpich-tx-power;
 *         }
 *         uses umts-ran-neighbor-list-inter-freq-cell-g;
 *     }
 *     container umts-ran-neighbor-list-inter-rat-cell {
 *         leaf max-gsm-entries {
 *             type uint64;
 *         }
 *         leaf gsm-number-of-entries {
 *             type uint64;
 *         }
 *         list umts-ran-neighbor-list-inter-rat-cell-gsm {
 *             key "bccharfcn";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf must-include {
 *                 type boolean;
 *             }
 *             leaf plmnid {
 *                 type string;
 *             }
 *             leaf lac {
 *                 type uint16;
 *             }
 *             leaf bsic {
 *                 type uint8;
 *             }
 *             leaf ci {
 *                 type uint16;
 *             }
 *             leaf band-indicator {
 *                 type enumeration;
 *             }
 *             leaf bccharfcn {
 *                 type uint16;
 *             }
 *             uses umts-ran-neighbor-list-inter-rat-cell-gsm-g;
 *         }
 *         uses umts-ran-neighbor-list-inter-rat-cell-g;
 *     }
 *     uses umts-ran-neighbor-list-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-neighbor-list</i>
 *
 * <p>To create instances of this class use {@link UmtsRanNeighborListBuilder}.
 * @see UmtsRanNeighborListBuilder
 *
 */
public interface UmtsRanNeighborList
    extends
    ChildOf<UmtsRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList>,
    UmtsRanNeighborListG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-neighbor-list").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>umtsRanNeighborListIntraFreqCell</code>, or <code>null</code> if not present
     */
    List<UmtsRanNeighborListIntraFreqCell> getUmtsRanNeighborListIntraFreqCell();
    
    /**
     * List of object class 
     * FAPService.{i}.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>umtsRanNeighborListInterFreqCell</code>, or <code>null</code> if not present
     */
    List<UmtsRanNeighborListInterFreqCell> getUmtsRanNeighborListInterFreqCell();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.UMTS.RAN.NeighborList.InterRATCell.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.UmtsRanNeighborListInterRatCell</code> <code>umtsRanNeighborListInterRatCell</code>, or <code>null</code> if not present
     */
    UmtsRanNeighborListInterRatCell getUmtsRanNeighborListInterRatCell();

}

