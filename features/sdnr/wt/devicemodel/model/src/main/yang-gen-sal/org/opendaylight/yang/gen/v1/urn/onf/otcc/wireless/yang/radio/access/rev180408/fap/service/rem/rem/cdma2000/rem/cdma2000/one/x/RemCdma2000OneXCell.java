package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXCellG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.REM.CDMA2000.OneX.Cell.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list rem-cdma2000-one-x-cell {
 *     key "rem-cdma2000-one-x-cell-key";
 *     leaf rem-cdma2000-one-x-cell-key {
 *         type string;
 *     }
 *     container rem-cdma2000-one-x-cell-rf {
 *         leaf band {
 *             type int64;
 *         }
 *         leaf rfcnfl {
 *             type uint16;
 *         }
 *         leaf io {
 *             type io;
 *         }
 *         leaf p-ilot-pn {
 *             type p-ilot-pn;
 *         }
 *         leaf p-ilot-pn-phase {
 *             type p-ilot-pn-phase;
 *         }
 *         leaf pilot-strength-ecp {
 *             type pilot-strength-ecp;
 *         }
 *         leaf pilot-strength-ecp-io {
 *             type pilot-strength-ecp-io;
 *         }
 *         leaf overheads-available {
 *             type boolean;
 *         }
 *         uses rem-cdma2000-one-x-cell-rf-g;
 *     }
 *     container rem-cdma2000-one-x-cell-control-channel {
 *         leaf sid {
 *             type int64;
 *         }
 *         leaf nid {
 *             type int64;
 *         }
 *         leaf regzone {
 *             type int64;
 *         }
 *         leaf baselat {
 *             type int64;
 *         }
 *         leaf baselong {
 *             type int64;
 *         }
 *         leaf mcc {
 *             type int64;
 *         }
 *         leaf mncimsi1112 {
 *             type int64;
 *         }
 *         leaf baseid {
 *             type int64;
 *         }
 *         leaf apid {
 *             type string;
 *         }
 *         leaf apidmask {
 *             type int64;
 *         }
 *         leaf apidtext {
 *             type string;
 *         }
 *         uses rem-cdma2000-one-x-cell-control-channel-g;
 *     }
 *     uses rem-cdma2000-one-x-cell-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-cdma2000/rem-cdma2000-one-x/rem-cdma2000-one-x-cell</i>
 *
 * <p>To create instances of this class use {@link RemCdma2000OneXCellBuilder}.
 * @see RemCdma2000OneXCellBuilder
 * @see RemCdma2000OneXCellKey
 *
 */
public interface RemCdma2000OneXCell
    extends
    ChildOf<RemCdma2000OneX>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell>,
    RemCdma2000OneXCellG,
    Identifiable<RemCdma2000OneXCellKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-one-x-cell").intern();

    /**
     * Container for object class FAPService.{i}.REM.CDMA2000.OneX.Cell.{i}.RF.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellRf</code> <code>remCdma2000OneXCellRf</code>, or <code>null</code> if not present
     */
    RemCdma2000OneXCellRf getRemCdma2000OneXCellRf();
    
    /**
     * Container for object class 
     * FAPService.{i}.REM.CDMA2000.OneX.Cell.{i}.ControlChannel.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.rem.cdma2000.one.x.cell.RemCdma2000OneXCellControlChannel</code> <code>remCdma2000OneXCellControlChannel</code>, or <code>null</code> if not present
     */
    RemCdma2000OneXCellControlChannel getRemCdma2000OneXCellControlChannel();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCellKey</code> <code>key</code>, or <code>null</code> if not present
     */
    RemCdma2000OneXCellKey getKey();

}

