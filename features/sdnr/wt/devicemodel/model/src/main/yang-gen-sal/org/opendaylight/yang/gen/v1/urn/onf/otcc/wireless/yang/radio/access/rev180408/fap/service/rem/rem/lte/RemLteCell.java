package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemLte;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.REM.LTE.Cell.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list rem-lte-cell {
 *     key "rem-lte-cell-key";
 *     leaf rem-lte-cell-key {
 *         type string;
 *     }
 *     container rem-lte-cell-rf {
 *         leaf eutra-carrier-arfcn {
 *             type uint16;
 *         }
 *         leaf phy-cell-id {
 *             type uint16;
 *         }
 *         leaf rsrp {
 *             type rsrp;
 *         }
 *         leaf rsrq {
 *             type rsrq;
 *         }
 *         leaf rssi {
 *             type rssi;
 *         }
 *         uses rem-lte-cell-rf-g;
 *     }
 *     container rem-lte-cell-bcch {
 *         leaf dl-bandwidth {
 *             type dl-bandwidth;
 *         }
 *         leaf ul-bandwidth {
 *             type ul-bandwidth;
 *         }
 *         leaf rs-tx-power {
 *             type rs-tx-power;
 *         }
 *         leaf tac {
 *             type uint16;
 *         }
 *         leaf cell-id {
 *             type uint32;
 *         }
 *         leaf cell-barred {
 *             type boolean;
 *         }
 *         leaf csg-indication {
 *             type boolean;
 *         }
 *         leaf csg-identity {
 *             type uint32;
 *         }
 *         leaf max-plmn-list-entries {
 *             type uint64;
 *         }
 *         leaf plmn-list-number-of-entries {
 *             type uint64;
 *         }
 *         list rem-lte-cell-bcch-plmn-list {
 *             key "plmnid";
 *             leaf plmnid {
 *                 type string;
 *             }
 *             leaf cell-reserved-for-operator-use {
 *                 type boolean;
 *             }
 *             uses rem-lte-cell-bcch-plmn-list-g;
 *         }
 *         uses rem-lte-cell-bcch-g;
 *     }
 *     uses rem-lte-cell-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-lte/rem-lte-cell</i>
 *
 * <p>To create instances of this class use {@link RemLteCellBuilder}.
 * @see RemLteCellBuilder
 * @see RemLteCellKey
 *
 */
public interface RemLteCell
    extends
    ChildOf<RemLte>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell>,
    RemLteCellG,
    Identifiable<RemLteCellKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-lte-cell").intern();

    /**
     * Container for object class FAPService.{i}.REM.LTE.Cell.{i}.RF.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf</code> <code>remLteCellRf</code>, or <code>null</code> if not present
     */
    RemLteCellRf getRemLteCellRf();
    
    /**
     * Container for object class FAPService.{i}.REM.LTE.Cell.{i}.BCCH.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellBcch</code> <code>remLteCellBcch</code>, or <code>null</code> if not present
     */
    RemLteCellBcch getRemLteCellBcch();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCellKey</code> <code>key</code>, or <code>null</code> if not present
     */
    RemLteCellKey getKey();

}

