package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000TimeG;

/**
 * Container for object class FAPService.{i}.FAPControl.CDMA2000.Time.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control-cdma2000-time {
 *     leaf local-time-zone {
 *         type string;
 *     }
 *     leaf current-local-time {
 *         type string;
 *     }
 *     leaf leap-seconds {
 *         type leap-seconds;
 *     }
 *     leaf daylight-savings-used {
 *         type boolean;
 *     }
 *     uses fap-control-cdma2000-time-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-cdma2000/fap-control-cdma2000-time</i>
 *
 * <p>To create instances of this class use {@link FapControlCdma2000TimeBuilder}.
 * @see FapControlCdma2000TimeBuilder
 *
 */
public interface FapControlCdma2000Time
    extends
    ChildOf<FapControlCdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time>,
    FapControlCdma2000TimeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-time").intern();


}

