package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchG;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.REM.LTE.Cell.{i}.BCCH.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-lte-cell-bcch {
 *     leaf dl-bandwidth {
 *         type dl-bandwidth;
 *     }
 *     leaf ul-bandwidth {
 *         type ul-bandwidth;
 *     }
 *     leaf rs-tx-power {
 *         type rs-tx-power;
 *     }
 *     leaf tac {
 *         type uint16;
 *     }
 *     leaf cell-id {
 *         type uint32;
 *     }
 *     leaf cell-barred {
 *         type boolean;
 *     }
 *     leaf csg-indication {
 *         type boolean;
 *     }
 *     leaf csg-identity {
 *         type uint32;
 *     }
 *     leaf max-plmn-list-entries {
 *         type uint64;
 *     }
 *     leaf plmn-list-number-of-entries {
 *         type uint64;
 *     }
 *     list rem-lte-cell-bcch-plmn-list {
 *         key "plmnid";
 *         leaf plmnid {
 *             type string;
 *         }
 *         leaf cell-reserved-for-operator-use {
 *             type boolean;
 *         }
 *         uses rem-lte-cell-bcch-plmn-list-g;
 *     }
 *     uses rem-lte-cell-bcch-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-lte/rem-lte-cell/rem-lte-cell-bcch</i>
 *
 * <p>To create instances of this class use {@link RemLteCellBcchBuilder}.
 * @see RemLteCellBcchBuilder
 *
 */
public interface RemLteCellBcch
    extends
    ChildOf<RemLteCell>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch>,
    RemLteCellBcchG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-lte-cell-bcch").intern();

    /**
     * List of object class FAPService.{i}.REM.LTE.Cell.{i}.BCCH.PLMNList.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>remLteCellBcchPlmnList</code>, or <code>null</code> if not present
     */
    List<RemLteCellBcchPlmnList> getRemLteCellBcchPlmnList();

}

