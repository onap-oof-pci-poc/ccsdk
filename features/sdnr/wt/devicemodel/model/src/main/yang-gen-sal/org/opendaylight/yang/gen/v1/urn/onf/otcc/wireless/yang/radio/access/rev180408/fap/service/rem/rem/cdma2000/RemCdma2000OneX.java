package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXCell;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.one.x.RemCdma2000OneXChannel;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000OneXG;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.REM.CDMA2000.OneX.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-cdma2000-one-x {
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
 *     list rem-cdma2000-one-x-channel {
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
 *         uses rem-cdma2000-one-x-channel-g;
 *     }
 *     list rem-cdma2000-one-x-cell {
 *         key "rem-cdma2000-one-x-cell-key";
 *         leaf rem-cdma2000-one-x-cell-key {
 *             type string;
 *         }
 *         container rem-cdma2000-one-x-cell-rf {
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
 *             uses rem-cdma2000-one-x-cell-rf-g;
 *         }
 *         container rem-cdma2000-one-x-cell-control-channel {
 *             leaf sid {
 *                 type int64;
 *             }
 *             leaf nid {
 *                 type int64;
 *             }
 *             leaf regzone {
 *                 type int64;
 *             }
 *             leaf baselat {
 *                 type int64;
 *             }
 *             leaf baselong {
 *                 type int64;
 *             }
 *             leaf mcc {
 *                 type int64;
 *             }
 *             leaf mncimsi1112 {
 *                 type int64;
 *             }
 *             leaf baseid {
 *                 type int64;
 *             }
 *             leaf apid {
 *                 type string;
 *             }
 *             leaf apidmask {
 *                 type int64;
 *             }
 *             leaf apidtext {
 *                 type string;
 *             }
 *             uses rem-cdma2000-one-x-cell-control-channel-g;
 *         }
 *         uses rem-cdma2000-one-x-cell-g;
 *     }
 *     uses rem-cdma2000-one-x-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-cdma2000/rem-cdma2000-one-x</i>
 *
 * <p>To create instances of this class use {@link RemCdma2000OneXBuilder}.
 * @see RemCdma2000OneXBuilder
 *
 */
public interface RemCdma2000OneX
    extends
    ChildOf<RemCdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000OneX>,
    RemCdma2000OneXG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-one-x").intern();

    /**
     * List of object class FAPService.{i}.REM.CDMA2000.OneX.Channel.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>remCdma2000OneXChannel</code>, or <code>null</code> if not present
     */
    List<RemCdma2000OneXChannel> getRemCdma2000OneXChannel();
    
    /**
     * List of object class FAPService.{i}.REM.CDMA2000.OneX.Cell.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>remCdma2000OneXCell</code>, or <code>null</code> if not present
     */
    List<RemCdma2000OneXCell> getRemCdma2000OneXCell();

}

