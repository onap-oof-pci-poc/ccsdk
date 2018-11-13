package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.RemLteCell;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemLteCellRfG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.REM.LTE.Cell.{i}.RF.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-lte-cell-rf {
 *     leaf eutra-carrier-arfcn {
 *         type uint16;
 *     }
 *     leaf phy-cell-id {
 *         type uint16;
 *     }
 *     leaf rsrp {
 *         type rsrp;
 *     }
 *     leaf rsrq {
 *         type rsrq;
 *     }
 *     leaf rssi {
 *         type rssi;
 *     }
 *     uses rem-lte-cell-rf-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-lte/rem-lte-cell/rem-lte-cell-rf</i>
 *
 * <p>To create instances of this class use {@link RemLteCellRfBuilder}.
 * @see RemLteCellRfBuilder
 *
 */
public interface RemLteCellRf
    extends
    ChildOf<RemLteCell>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.lte.rem.lte.cell.RemLteCellRf>,
    RemLteCellRfG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-lte-cell-rf").intern();


}

