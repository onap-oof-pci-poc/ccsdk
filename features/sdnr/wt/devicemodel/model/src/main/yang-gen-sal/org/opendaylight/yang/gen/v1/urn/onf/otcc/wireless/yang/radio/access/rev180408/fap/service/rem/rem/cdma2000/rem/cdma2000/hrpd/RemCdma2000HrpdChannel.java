package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.RemCdma2000Hrpd;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.RemCdma2000HrpdChannelG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class FAPService.{i}.REM.CDMA2000.HRPD.Channel.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list rem-cdma2000-hrpd-channel {
 *     key "sniffing-band-class" "sniffing-channel-number";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf sniffing-band-class {
 *         type uint8;
 *     }
 *     leaf sniffing-channel-number {
 *         type uint16;
 *     }
 *     leaf-list pn-list {
 *         type string;
 *     }
 *     uses rem-cdma2000-hrpd-channel-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/rem/rem-cdma2000/rem-cdma2000-hrpd/rem-cdma2000-hrpd-channel</i>
 *
 * <p>To create instances of this class use {@link RemCdma2000HrpdChannelBuilder}.
 * @see RemCdma2000HrpdChannelBuilder
 * @see RemCdma2000HrpdChannelKey
 *
 */
public interface RemCdma2000HrpdChannel
    extends
    ChildOf<RemCdma2000Hrpd>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdChannel>,
    RemCdma2000HrpdChannelG,
    Identifiable<RemCdma2000HrpdChannelKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "rem-cdma2000-hrpd-channel").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.rem.rem.cdma2000.rem.cdma2000.hrpd.RemCdma2000HrpdChannelKey</code> <code>key</code>, or <code>null</code> if not present
     */
    RemCdma2000HrpdChannelKey getKey();

}

