package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterFreqCell;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.UmtsRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseIntraFreqCell;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseG;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.UMTS.RAN.NeighborListInUse.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container umts-ran-neighbor-list-in-use {
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
 *     list umts-ran-neighbor-list-in-use-intra-freq-cell {
 *         key "pcpich-scrambling-code";
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
 *         uses umts-ran-neighbor-list-in-use-intra-freq-cell-g;
 *     }
 *     list umts-ran-neighbor-list-in-use-inter-freq-cell {
 *         key "pcpich-scrambling-code" "uarfcndl";
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
 *         uses umts-ran-neighbor-list-in-use-inter-freq-cell-g;
 *     }
 *     container umts-ran-neighbor-list-in-use-inter-rat-cell {
 *         leaf max-gsm-entries {
 *             type uint64;
 *         }
 *         leaf gsm-number-of-entries {
 *             type uint64;
 *         }
 *         list umts-ran-neighbor-list-in-use-inter-rat-cell-gsm {
 *             key "bccharfcn";
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
 *             uses umts-ran-neighbor-list-in-use-inter-rat-cell-gsm-g;
 *         }
 *         uses umts-ran-neighbor-list-in-use-inter-rat-cell-g;
 *     }
 *     uses umts-ran-neighbor-list-in-use-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-neighbor-list-in-use</i>
 *
 * <p>To create instances of this class use {@link UmtsRanNeighborListInUseBuilder}.
 * @see UmtsRanNeighborListInUseBuilder
 *
 */
public interface UmtsRanNeighborListInUse
    extends
    ChildOf<UmtsRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse>,
    UmtsRanNeighborListInUseG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-neighbor-list-in-use").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.UMTS.RAN.NeighborListInUse.IntraFreqCell.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>umtsRanNeighborListInUseIntraFreqCell</code>, or <code>null</code> if not present
     */
    List<UmtsRanNeighborListInUseIntraFreqCell> getUmtsRanNeighborListInUseIntraFreqCell();
    
    /**
     * List of object class 
     * FAPService.{i}.CellConfig.UMTS.RAN.NeighborListInUse.InterFreqCell.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>umtsRanNeighborListInUseInterFreqCell</code>, or <code>null</code> if not present
     */
    List<UmtsRanNeighborListInUseInterFreqCell> getUmtsRanNeighborListInUseInterFreqCell();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.UMTS.RAN.NeighborListInUse.InterRATCell.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterRatCell</code> <code>umtsRanNeighborListInUseInterRatCell</code>, or <code>null</code> if not present
     */
    UmtsRanNeighborListInUseInterRatCell getUmtsRanNeighborListInUseInterRatCell();

}

