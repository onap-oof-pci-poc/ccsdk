package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.RemUmtsWcdmaCell;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemUmtsWcdmaCellRfG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.RF.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-umts-wcdma-cell-rf {
 *     leaf uarfcndl {
 *         type uint16;
 *     }
 *     leaf cpichrscp {
 *         type cpichrscp;
 *     }
 *     leaf cpich-ec-no {
 *         type cpich-ec-no;
 *     }
 *     leaf rssi {
 *         type rssi;
 *     }
 *     leaf primary-scrambling-code {
 *         type uint16;
 *     }
 *     uses rem-umts-wcdma-cell-rf-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-umts/rem-umts-wcdma/rem-umts-wcdma-cell/rem-umts-wcdma-cell-rf</i>
 *
 * <p>To create instances of this class use {@link RemUmtsWcdmaCellRfBuilder}.
 * @see RemUmtsWcdmaCellRfBuilder
 *
 */
public interface RemUmtsWcdmaCellRf
    extends
    ChildOf<RemUmtsWcdmaCell>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.umts.rem.umts.wcdma.rem.umts.wcdma.cell.RemUmtsWcdmaCellRf>,
    RemUmtsWcdmaCellRfG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-umts-wcdma-cell-rf").intern();


}

