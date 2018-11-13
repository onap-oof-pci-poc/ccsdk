package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellBcchPlmnListG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.REM.LTE.Cell.{i}.BCCH.PLMNList.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list rem-lte-cell-bcch-plmn-list {
 *     key "plmnid";
 *     leaf plmnid {
 *         type string;
 *     }
 *     leaf cell-reserved-for-operator-use {
 *         type boolean;
 *     }
 *     uses rem-lte-cell-bcch-plmn-list-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-lte/rem-lte-cell/rem-lte-cell-bcch/rem-lte-cell-bcch-plmn-list</i>
 *
 * <p>To create instances of this class use {@link RemLteCellBcchPlmnListBuilder}.
 * @see RemLteCellBcchPlmnListBuilder
 * @see RemLteCellBcchPlmnListKey
 *
 */
public interface RemLteCellBcchPlmnList
    extends
    ChildOf<RemLteCellBcch>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnList>,
    RemLteCellBcchPlmnListG,
    Identifiable<RemLteCellBcchPlmnListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-lte-cell-bcch-plmn-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.rem.lte.cell.bcch.RemLteCellBcchPlmnListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    RemLteCellBcchPlmnListKey getKey();

}

