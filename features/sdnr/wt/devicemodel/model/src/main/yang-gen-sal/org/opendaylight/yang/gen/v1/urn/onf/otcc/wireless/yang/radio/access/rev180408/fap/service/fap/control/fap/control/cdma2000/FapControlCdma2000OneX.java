package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000OneXG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXSelfConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.FAPControl.CDMA2000.OneX.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control-cdma2000-one-x {
 *     leaf admin-state {
 *         type enumeration;
 *     }
 *     leaf op-state {
 *         type enumeration;
 *     }
 *     leaf rf-tx-status {
 *         type boolean;
 *     }
 *     leaf daylight {
 *         type int64;
 *     }
 *     leaf max-p-rev {
 *         type int64;
 *     }
 *     leaf reregister {
 *         type uint64;
 *     }
 *     leaf emergency-session-period {
 *         type emergency-session-period;
 *     }
 *     leaf location-area-code {
 *         type uint16;
 *     }
 *     leaf msc-id {
 *         type uint64;
 *     }
 *     leaf active-handin-enable {
 *         type boolean;
 *     }
 *     container fap-control-cdma2000-one-x-active-handin-measurement {
 *         leaf active-handin-measurement-enable {
 *             type boolean;
 *         }
 *         leaf active-hand-in-measurement-duration {
 *             type active-hand-in-measurement-duration;
 *         }
 *         leaf measurement-report-threshold {
 *             type measurement-report-threshold;
 *         }
 *         uses fap-control-cdma2000-one-x-active-handin-measurement-g;
 *     }
 *     container fap-control-cdma2000-one-x-self-config {
 *         leaf rfcnfl-self-config-enable {
 *             type boolean;
 *         }
 *         leaf pilot-pn-self-config-enable {
 *             type boolean;
 *         }
 *         leaf maxfap-tx-power-self-config-enable {
 *             type boolean;
 *         }
 *         leaf maxfap-beacon-tx-power-self-config-enable {
 *             type boolean;
 *         }
 *         uses fap-control-cdma2000-one-x-self-config-g;
 *     }
 *     uses fap-control-cdma2000-one-x-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-cdma2000/fap-control-cdma2000-one-x</i>
 *
 * <p>To create instances of this class use {@link FapControlCdma2000OneXBuilder}.
 * @see FapControlCdma2000OneXBuilder
 *
 */
public interface FapControlCdma2000OneX
    extends
    ChildOf<FapControlCdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX>,
    FapControlCdma2000OneXG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-one-x").intern();

    /**
     * Container for object class 
     * FAPService.{i}.FAPControl.CDMA2000.OneX.ActiveHandinMeasurement.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXActiveHandinMeasurement</code> <code>fapControlCdma2000OneXActiveHandinMeasurement</code>, or <code>null</code> if not present
     */
    FapControlCdma2000OneXActiveHandinMeasurement getFapControlCdma2000OneXActiveHandinMeasurement();
    
    /**
     * Container for object class FAPService.{i}.FAPControl.CDMA2000.OneX.SelfConfig.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.one.x.FapControlCdma2000OneXSelfConfig</code> <code>fapControlCdma2000OneXSelfConfig</code>, or <code>null</code> if not present
     */
    FapControlCdma2000OneXSelfConfig getFapControlCdma2000OneXSelfConfig();

}

