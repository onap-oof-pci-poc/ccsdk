package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.LteRan;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseLteCell;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.LteRanNeighborListInUseG;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseInterRatCell;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.CellConfig.LTE.RAN.NeighborListInUse.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container lte-ran-neighbor-list-in-use {
 *     leaf max-lte-cell-entries {
 *         type uint64;
 *     }
 *     leaf lte-cell-number-of-entries {
 *         type uint64;
 *     }
 *     list lte-ran-neighbor-list-in-use-lte-cell {
 *         key "plmnid" "cid";
 *         leaf plmnid {
 *             type string;
 *         }
 *         leaf cid {
 *             type uint32;
 *         }
 *         leaf eutra-carrier-arfcn {
 *             type uint16;
 *         }
 *         leaf phy-cell-id {
 *             type uint16;
 *         }
 *         leaf q-offset {
 *             type int64;
 *         }
 *         leaf cio {
 *             type int64;
 *         }
 *         leaf rs-tx-power {
 *             type rs-tx-power;
 *         }
 *         leaf blacklisted {
 *             type boolean;
 *         }
 *         uses lte-ran-neighbor-list-in-use-lte-cell-g;
 *     }
 *     container lte-ran-neighbor-list-in-use-inter-rat-cell {
 *         leaf max-umts-entries {
 *             type uint64;
 *         }
 *         leaf max-gsm-entries {
 *             type uint64;
 *         }
 *         leaf max-cdma2000-entries {
 *             type uint64;
 *         }
 *         leaf umts-number-of-entries {
 *             type uint64;
 *         }
 *         leaf gsm-number-of-entries {
 *             type uint64;
 *         }
 *         leaf cdma2000-number-of-entries {
 *             type uint64;
 *         }
 *         list lte-ran-neighbor-list-in-use-inter-rat-cell-umts {
 *             key "plmnid" "cid";
 *             leaf plmnid {
 *                 type string;
 *             }
 *             leaf rncid {
 *                 type uint16;
 *             }
 *             leaf cid {
 *                 type uint16;
 *             }
 *             leaf lac {
 *                 type uint16;
 *             }
 *             leaf rac {
 *                 type uint8;
 *             }
 *             leaf ura {
 *                 type uint16;
 *             }
 *             leaf uarfcnul {
 *                 type uint16;
 *             }
 *             leaf uarfcndl {
 *                 type uint16;
 *             }
 *             leaf pcpich-scrambling-code {
 *                 type uint16;
 *             }
 *             leaf pcpich-tx-power {
 *                 type pcpich-tx-power;
 *             }
 *             uses lte-ran-neighbor-list-in-use-inter-rat-cell-umts-g;
 *         }
 *         list lte-ran-neighbor-list-in-use-inter-rat-cell-gsm {
 *             key "plmnid" "lac" "ci";
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
 *             uses lte-ran-neighbor-list-in-use-inter-rat-cell-gsm-g;
 *         }
 *         list lte-ran-neighbor-list-in-use-inter-rat-cell-cdma2000 {
 *             key "cid";
 *             leaf band-class {
 *                 type uint8;
 *             }
 *             leaf arfcn {
 *                 type uint16;
 *             }
 *             leaf pn-offset {
 *                 type uint16;
 *             }
 *             leaf type {
 *                 type enumeration;
 *             }
 *             leaf cid {
 *                 type string;
 *             }
 *             uses lte-ran-neighbor-list-in-use-inter-rat-cell-cdma2000-g;
 *         }
 *         uses lte-ran-neighbor-list-in-use-inter-rat-cell-g;
 *     }
 *     uses lte-ran-neighbor-list-in-use-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/lte/lte-ran/lte-ran-neighbor-list-in-use</i>
 *
 * <p>To create instances of this class use {@link LteRanNeighborListInUseBuilder}.
 * @see LteRanNeighborListInUseBuilder
 *
 */
public interface LteRanNeighborListInUse
    extends
    ChildOf<LteRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.LteRanNeighborListInUse>,
    LteRanNeighborListInUseG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "lte-ran-neighbor-list-in-use").intern();

    /**
     * List of object class 
     * FAPService.{i}.CellConfig.LTE.RAN.NeighborListInUse.LTECell.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>lteRanNeighborListInUseLteCell</code>, or <code>null</code> if not present
     */
    List<LteRanNeighborListInUseLteCell> getLteRanNeighborListInUseLteCell();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.lte.lte.ran.lte.ran.neighbor.list.in.use.LteRanNeighborListInUseInterRatCell</code> <code>lteRanNeighborListInUseInterRatCell</code>, or <code>null</code> if not present
     */
    LteRanNeighborListInUseInterRatCell getLteRanNeighborListInUseInterRatCell();

}

