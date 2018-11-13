package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000MacroTimingChannelG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000MacroTiming;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.REM.CDMA2000.MacroTiming.Channel.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list rem-cdma2000-macro-timing-channel {
 *     key "band-class" "channel-number";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf air-interface-type {
 *         type uint8;
 *     }
 *     leaf band-class {
 *         type uint8;
 *     }
 *     leaf channel-number {
 *         type uint64;
 *     }
 *     leaf priority {
 *         type uint64;
 *     }
 *     leaf-list pn-list {
 *         type string;
 *     }
 *     uses rem-cdma2000-macro-timing-channel-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-cdma2000/rem-cdma2000-macro-timing/rem-cdma2000-macro-timing-channel</i>
 *
 * <p>To create instances of this class use {@link RemCdma2000MacroTimingChannelBuilder}.
 * @see RemCdma2000MacroTimingChannelBuilder
 * @see RemCdma2000MacroTimingChannelKey
 *
 */
public interface RemCdma2000MacroTimingChannel
    extends
    ChildOf<RemCdma2000MacroTiming>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannel>,
    RemCdma2000MacroTimingChannelG,
    Identifiable<RemCdma2000MacroTimingChannelKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-macro-timing-channel").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.macro.timing.RemCdma2000MacroTimingChannelKey</code> <code>key</code>, or <code>null</code> if not present
     */
    RemCdma2000MacroTimingChannelKey getKey();

}

