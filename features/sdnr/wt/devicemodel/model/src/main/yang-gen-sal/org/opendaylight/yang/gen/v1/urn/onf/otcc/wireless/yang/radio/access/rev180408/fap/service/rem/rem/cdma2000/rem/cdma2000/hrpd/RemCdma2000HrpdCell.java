package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000Hrpd;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdCellG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellRf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.REM.CDMA2000.HRPD.Cell.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list rem-cdma2000-hrpd-cell {
 *     key "rem-cdma2000-hrpd-cell-key";
 *     leaf rem-cdma2000-hrpd-cell-key {
 *         type string;
 *     }
 *     container rem-cdma2000-hrpd-cell-rf {
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
 *         uses rem-cdma2000-hrpd-cell-rf-g;
 *     }
 *     container rem-cdma2000-hrpd-cell-control-channel {
 *         leaf color-code {
 *             type int64;
 *         }
 *         leaf sector-id {
 *             type binary;
 *         }
 *         leaf subnet-mask {
 *             type subnet-mask;
 *         }
 *         leaf country-code {
 *             type int64;
 *         }
 *         leaf latitude {
 *             type latitude;
 *         }
 *         leaf longitude {
 *             type longitude;
 *         }
 *         uses rem-cdma2000-hrpd-cell-control-channel-g;
 *     }
 *     uses rem-cdma2000-hrpd-cell-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-cdma2000/rem-cdma2000-hrpd/rem-cdma2000-hrpd-cell</i>
 *
 * <p>To create instances of this class use {@link RemCdma2000HrpdCellBuilder}.
 * @see RemCdma2000HrpdCellBuilder
 * @see RemCdma2000HrpdCellKey
 *
 */
public interface RemCdma2000HrpdCell
    extends
    ChildOf<RemCdma2000Hrpd>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell>,
    RemCdma2000HrpdCellG,
    Identifiable<RemCdma2000HrpdCellKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-hrpd-cell").intern();

    /**
     * Container for object class FAPService.{i}.REM.CDMA2000.HRPD.Cell.{i}.RF.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellRf</code> <code>remCdma2000HrpdCellRf</code>, or <code>null</code> if not present
     */
    RemCdma2000HrpdCellRf getRemCdma2000HrpdCellRf();
    
    /**
     * Container for object class 
     * FAPService.{i}.REM.CDMA2000.HRPD.Cell.{i}.ControlChannel.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.rem.cdma2000.hrpd.cell.RemCdma2000HrpdCellControlChannel</code> <code>remCdma2000HrpdCellControlChannel</code>, or <code>null</code> if not present
     */
    RemCdma2000HrpdCellControlChannel getRemCdma2000HrpdCellControlChannel();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCellKey</code> <code>key</code>, or <code>null</code> if not present
     */
    RemCdma2000HrpdCellKey getKey();

}

