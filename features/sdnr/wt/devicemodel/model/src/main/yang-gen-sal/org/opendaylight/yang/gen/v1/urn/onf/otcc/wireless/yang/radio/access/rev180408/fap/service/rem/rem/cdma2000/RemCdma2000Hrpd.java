package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdCell;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdChannel;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdG;

/**
 * Container for object class FAPService.{i}.REM.CDMA2000.HRPD.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-cdma2000-hrpd {
 *     leaf max-cell-entries {
 *         type uint64;
 *     }
 *     leaf cell-number-of-entries {
 *         type uint64;
 *     }
 *     leaf max-channel-entries {
 *         type uint64;
 *     }
 *     leaf channel-number-of-entries {
 *         type uint64;
 *     }
 *     list rem-cdma2000-hrpd-channel {
 *         key "sniffing-band-class" "sniffing-channel-number";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf sniffing-band-class {
 *             type uint8;
 *         }
 *         leaf sniffing-channel-number {
 *             type uint16;
 *         }
 *         leaf-list pn-list {
 *             type string;
 *         }
 *         uses rem-cdma2000-hrpd-channel-g;
 *     }
 *     list rem-cdma2000-hrpd-cell {
 *         key "rem-cdma2000-hrpd-cell-key";
 *         leaf rem-cdma2000-hrpd-cell-key {
 *             type string;
 *         }
 *         container rem-cdma2000-hrpd-cell-rf {
 *             leaf band {
 *                 type int64;
 *             }
 *             leaf rfcnfl {
 *                 type uint16;
 *             }
 *             leaf io {
 *                 type io;
 *             }
 *             leaf p-ilot-pn {
 *                 type p-ilot-pn;
 *             }
 *             leaf p-ilot-pn-phase {
 *                 type p-ilot-pn-phase;
 *             }
 *             leaf pilot-strength-ecp {
 *                 type pilot-strength-ecp;
 *             }
 *             leaf pilot-strength-ecp-io {
 *                 type pilot-strength-ecp-io;
 *             }
 *             leaf overheads-available {
 *                 type boolean;
 *             }
 *             uses rem-cdma2000-hrpd-cell-rf-g;
 *         }
 *         container rem-cdma2000-hrpd-cell-control-channel {
 *             leaf color-code {
 *                 type int64;
 *             }
 *             leaf sector-id {
 *                 type binary;
 *             }
 *             leaf subnet-mask {
 *                 type subnet-mask;
 *             }
 *             leaf country-code {
 *                 type int64;
 *             }
 *             leaf latitude {
 *                 type latitude;
 *             }
 *             leaf longitude {
 *                 type longitude;
 *             }
 *             uses rem-cdma2000-hrpd-cell-control-channel-g;
 *         }
 *         uses rem-cdma2000-hrpd-cell-g;
 *     }
 *     uses rem-cdma2000-hrpd-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-cdma2000/rem-cdma2000-hrpd</i>
 *
 * <p>To create instances of this class use {@link RemCdma2000HrpdBuilder}.
 * @see RemCdma2000HrpdBuilder
 *
 */
public interface RemCdma2000Hrpd
    extends
    ChildOf<RemCdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000Hrpd>,
    RemCdma2000HrpdG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-hrpd").intern();

    /**
     * List of object class FAPService.{i}.REM.CDMA2000.HRPD.Channel.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>remCdma2000HrpdChannel</code>, or <code>null</code> if not present
     */
    List<RemCdma2000HrpdChannel> getRemCdma2000HrpdChannel();
    
    /**
     * List of object class FAPService.{i}.REM.CDMA2000.HRPD.Cell.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>remCdma2000HrpdCell</code>, or <code>null</code> if not present
     */
    List<RemCdma2000HrpdCell> getRemCdma2000HrpdCell();

}

