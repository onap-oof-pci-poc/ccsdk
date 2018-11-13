package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.UmtsRanNeighborList;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.UmtsRanNeighborListIntraFreqCellG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list umts-ran-neighbor-list-intra-freq-cell {
 *     key "pcpich-scrambling-code";
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
 *     leaf pcpich-scrambling-code {
 *         type uint16;
 *     }
 *     leaf pcpich-tx-power {
 *         type pcpich-tx-power;
 *     }
 *     leaf collocated-inter-freq-cell {
 *         type uint32;
 *     }
 *     leaf max-tx-power {
 *         type max-tx-power;
 *     }
 *     leaf max-dpc-htx-power {
 *         type max-dpc-htx-power;
 *     }
 *     uses umts-ran-neighbor-list-intra-freq-cell-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/umts/umts-ran/umts-ran-neighbor-list/umts-ran-neighbor-list-intra-freq-cell</i>
 *
 * <p>To create instances of this class use {@link UmtsRanNeighborListIntraFreqCellBuilder}.
 * @see UmtsRanNeighborListIntraFreqCellBuilder
 * @see UmtsRanNeighborListIntraFreqCellKey
 *
 */
public interface UmtsRanNeighborListIntraFreqCell
    extends
    ChildOf<UmtsRanNeighborList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.UmtsRanNeighborListIntraFreqCell>,
    UmtsRanNeighborListIntraFreqCellG,
    Identifiable<UmtsRanNeighborListIntraFreqCellKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "umts-ran-neighbor-list-intra-freq-cell").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.umts.umts.ran.umts.ran.neighbor.list.UmtsRanNeighborListIntraFreqCellKey</code> <code>key</code>, or <code>null</code> if not present
     */
    UmtsRanNeighborListIntraFreqCellKey getKey();

}

