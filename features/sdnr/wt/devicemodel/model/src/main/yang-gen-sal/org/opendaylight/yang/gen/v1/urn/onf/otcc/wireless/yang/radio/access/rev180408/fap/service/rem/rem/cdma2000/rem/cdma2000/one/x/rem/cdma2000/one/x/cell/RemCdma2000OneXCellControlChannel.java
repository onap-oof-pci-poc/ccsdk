package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellControlChannelG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class 
 * FAPService.{i}.REM.CDMA2000.OneX.Cell.{i}.ControlChannel.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-cdma2000-one-x-cell-control-channel {
 *     leaf sid {
 *         type int64;
 *     }
 *     leaf nid {
 *         type int64;
 *     }
 *     leaf regzone {
 *         type int64;
 *     }
 *     leaf baselat {
 *         type int64;
 *     }
 *     leaf baselong {
 *         type int64;
 *     }
 *     leaf mcc {
 *         type int64;
 *     }
 *     leaf mncimsi1112 {
 *         type int64;
 *     }
 *     leaf baseid {
 *         type int64;
 *     }
 *     leaf apid {
 *         type string;
 *     }
 *     leaf apidmask {
 *         type int64;
 *     }
 *     leaf apidtext {
 *         type string;
 *     }
 *     uses rem-cdma2000-one-x-cell-control-channel-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-cdma2000/rem-cdma2000-one-x/rem-cdma2000-one-x-cell/rem-cdma2000-one-x-cell-control-channel</i>
 *
 * <p>To create instances of this class use {@link RemCdma2000OneXCellControlChannelBuilder}.
 * @see RemCdma2000OneXCellControlChannelBuilder
 *
 */
public interface RemCdma2000OneXCellControlChannel
    extends
    ChildOf<RemCdma2000OneXCell>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel>,
    RemCdma2000OneXCellControlChannelG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-one-x-cell-control-channel").intern();


}

