package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXActiveHandinMeasurementG;

/**
 * Container for object class 
 * FAPService.{i}.FAPControl.CDMA2000.OneX.ActiveHandinMeasurement.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control-cdma2000-one-x-active-handin-measurement {
 *     leaf active-handin-measurement-enable {
 *         type boolean;
 *     }
 *     leaf active-hand-in-measurement-duration {
 *         type active-hand-in-measurement-duration;
 *     }
 *     leaf measurement-report-threshold {
 *         type measurement-report-threshold;
 *     }
 *     uses fap-control-cdma2000-one-x-active-handin-measurement-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-cdma2000/fap-control-cdma2000-one-x/fap-control-cdma2000-one-x-active-handin-measurement</i>
 *
 * <p>To create instances of this class use {@link FapControlCdma2000OneXActiveHandinMeasurementBuilder}.
 * @see FapControlCdma2000OneXActiveHandinMeasurementBuilder
 *
 */
public interface FapControlCdma2000OneXActiveHandinMeasurement
    extends
    ChildOf<FapControlCdma2000OneX>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement>,
    FapControlCdma2000OneXActiveHandinMeasurementG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-one-x-active-handin-measurement").intern();


}

