package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborListInUse;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListInUseInterFreqCellG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.UMTS.RAN.NeighborListInUse.InterFreqCell.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list umts-ran-neighbor-list-in-use-inter-freq-cell {
 *     key "pcpich-scrambling-code" "uarfcndl";
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
 *     uses umts-ran-neighbor-list-in-use-inter-freq-cell-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-neighbor-list-in-use/umts-ran-neighbor-list-in-use-inter-freq-cell</i>
 *
 * <p>To create instances of this class use {@link UmtsRanNeighborListInUseInterFreqCellBuilder}.
 * @see UmtsRanNeighborListInUseInterFreqCellBuilder
 * @see UmtsRanNeighborListInUseInterFreqCellKey
 *
 */
public interface UmtsRanNeighborListInUseInterFreqCell
    extends
    ChildOf<UmtsRanNeighborListInUse>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterFreqCell>,
    UmtsRanNeighborListInUseInterFreqCellG,
    Identifiable<UmtsRanNeighborListInUseInterFreqCellKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-neighbor-list-in-use-inter-freq-cell").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.in.use.UmtsRanNeighborListInUseInterFreqCellKey</code> <code>key</code>, or <code>null</code> if not present
     */
    UmtsRanNeighborListInUseInterFreqCellKey getKey();

}

