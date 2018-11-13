package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.RemCdma2000;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.REM.CDMA2000.MacroTiming.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container rem-cdma2000-macro-timing {
 *     leaf admin-state {
 *         type uint8;
 *     }
 *     leaf tracking-channel-number {
 *         type uint64;
 *     }
 *     leaf tracking-band-class {
 *         type uint8;
 *     }
 *     leaf-list tracking-pn-offset {
 *         type string;
 *     }
 *     leaf timing-source {
 *         type uint8;
 *     }
 *     leaf channel-number-of-entries {
 *         type uint64;
 *     }
 *     list rem-cdma2000-macro-timing-channel {
 *         key "band-class" "channel-number";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf air-interface-type {
 *             type uint8;
 *         }
 *         leaf band-class {
 *             type uint8;
 *         }
 *         leaf channel-number {
 *             type uint64;
 *         }
 *         leaf priority {
 *             type uint64;
 *         }
 *         leaf-list pn-list {
 *             type string;
 *         }
 *         uses rem-cdma2000-macro-timing-channel-g;
 *     }
 *     uses rem-cdma2000-macro-timing-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-cdma2000/rem-cdma2000-macro-timing</i>
 *
 * <p>To create instances of this class use {@link RemCdma2000MacroTimingBuilder}.
 * @see RemCdma2000MacroTimingBuilder
 *
 */
public interface RemCdma2000MacroTiming
    extends
    ChildOf<RemCdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming>,
    RemCdma2000MacroTimingG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-macro-timing").intern();

    /**
     * List of object class FAPService.{i}.REM.CDMA2000.MacroTiming.Channel.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>remCdma2000MacroTimingChannel</code>, or <code>null</code> if not present
     */
    List<RemCdma2000MacroTimingChannel> getRemCdma2000MacroTimingChannel();

}

