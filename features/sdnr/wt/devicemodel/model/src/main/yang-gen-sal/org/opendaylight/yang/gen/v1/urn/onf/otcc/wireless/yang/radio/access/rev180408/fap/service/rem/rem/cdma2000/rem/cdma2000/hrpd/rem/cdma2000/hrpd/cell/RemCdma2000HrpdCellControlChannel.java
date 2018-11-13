package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellControlChannelG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.REM.CDMA2000.HRPD.Cell.{i}.ControlChannel.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-cdma2000-hrpd-cell-control-channel {
 *     leaf color-code {
 *         type int64;
 *     }
 *     leaf sector-id {
 *         type binary;
 *     }
 *     leaf subnet-mask {
 *         type subnet-mask;
 *     }
 *     leaf country-code {
 *         type int64;
 *     }
 *     leaf latitude {
 *         type latitude;
 *     }
 *     leaf longitude {
 *         type longitude;
 *     }
 *     uses rem-cdma2000-hrpd-cell-control-channel-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-cdma2000/rem-cdma2000-hrpd/rem-cdma2000-hrpd-cell/rem-cdma2000-hrpd-cell-control-channel</i>
 *
 * <p>To create instances of this class use {@link RemCdma2000HrpdCellControlChannelBuilder}.
 * @see RemCdma2000HrpdCellControlChannelBuilder
 *
 */
public interface RemCdma2000HrpdCellControlChannel
    extends
    ChildOf<RemCdma2000HrpdCell>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel>,
    RemCdma2000HrpdCellControlChannelG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-hrpd-cell-control-channel").intern();


}

