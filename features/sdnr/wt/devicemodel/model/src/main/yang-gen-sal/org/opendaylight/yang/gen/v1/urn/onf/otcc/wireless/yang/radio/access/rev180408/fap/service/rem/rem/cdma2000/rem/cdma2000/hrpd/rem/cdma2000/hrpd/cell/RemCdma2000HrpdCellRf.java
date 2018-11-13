package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellRfG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.REM.CDMA2000.HRPD.Cell.{i}.RF.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-cdma2000-hrpd-cell-rf {
 *     leaf band {
 *         type int64;
 *     }
 *     leaf rfcnfl {
 *         type uint16;
 *     }
 *     leaf io {
 *         type io;
 *     }
 *     leaf p-ilot-pn {
 *         type p-ilot-pn;
 *     }
 *     leaf p-ilot-pn-phase {
 *         type p-ilot-pn-phase;
 *     }
 *     leaf pilot-strength-ecp {
 *         type pilot-strength-ecp;
 *     }
 *     leaf pilot-strength-ecp-io {
 *         type pilot-strength-ecp-io;
 *     }
 *     leaf overheads-available {
 *         type boolean;
 *     }
 *     uses rem-cdma2000-hrpd-cell-rf-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-cdma2000/rem-cdma2000-hrpd/rem-cdma2000-hrpd-cell/rem-cdma2000-hrpd-cell-rf</i>
 *
 * <p>To create instances of this class use {@link RemCdma2000HrpdCellRfBuilder}.
 * @see RemCdma2000HrpdCellRfBuilder
 *
 */
public interface RemCdma2000HrpdCellRf
    extends
    ChildOf<RemCdma2000HrpdCell>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellRf>,
    RemCdma2000HrpdCellRfG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-hrpd-cell-rf").intern();


}

