package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000G;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.FAPControl.CDMA2000.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control-cdma2000 {
 *     leaf home-domain {
 *         type string;
 *     }
 *     leaf remote-ip-access-enable {
 *         type boolean;
 *     }
 *     leaf pm-config {
 *         type string;
 *     }
 *     container fap-control-cdma2000-time {
 *         leaf local-time-zone {
 *             type string;
 *         }
 *         leaf current-local-time {
 *             type string;
 *         }
 *         leaf leap-seconds {
 *             type leap-seconds;
 *         }
 *         leaf daylight-savings-used {
 *             type boolean;
 *         }
 *         uses fap-control-cdma2000-time-g;
 *     }
 *     container fap-control-cdma2000-one-x {
 *         leaf admin-state {
 *             type enumeration;
 *         }
 *         leaf op-state {
 *             type enumeration;
 *         }
 *         leaf rf-tx-status {
 *             type boolean;
 *         }
 *         leaf daylight {
 *             type int64;
 *         }
 *         leaf max-p-rev {
 *             type int64;
 *         }
 *         leaf reregister {
 *             type uint64;
 *         }
 *         leaf emergency-session-period {
 *             type emergency-session-period;
 *         }
 *         leaf location-area-code {
 *             type uint16;
 *         }
 *         leaf msc-id {
 *             type uint64;
 *         }
 *         leaf active-handin-enable {
 *             type boolean;
 *         }
 *         container fap-control-cdma2000-one-x-active-handin-measurement {
 *             leaf active-handin-measurement-enable {
 *                 type boolean;
 *             }
 *             leaf active-hand-in-measurement-duration {
 *                 type active-hand-in-measurement-duration;
 *             }
 *             leaf measurement-report-threshold {
 *                 type measurement-report-threshold;
 *             }
 *             uses fap-control-cdma2000-one-x-active-handin-measurement-g;
 *         }
 *         container fap-control-cdma2000-one-x-self-config {
 *             leaf rfcnfl-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf pilot-pn-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf maxfap-tx-power-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf maxfap-beacon-tx-power-self-config-enable {
 *                 type boolean;
 *             }
 *             uses fap-control-cdma2000-one-x-self-config-g;
 *         }
 *         uses fap-control-cdma2000-one-x-g;
 *     }
 *     container fap-control-cdma2000-gateway {
 *         leaf sec-gw-server1 {
 *             type string;
 *         }
 *         leaf sec-gw-server2 {
 *             type string;
 *         }
 *         leaf sec-gw-server3 {
 *             type string;
 *         }
 *         leaf sec-gw-switchover-count {
 *             type uint64;
 *         }
 *         uses fap-control-cdma2000-gateway-g;
 *     }
 *     container fap-control-cdma2000-hrpd {
 *         leaf op-state {
 *             type boolean;
 *         }
 *         leaf admin-state {
 *             type boolean;
 *         }
 *         leaf rf-tx-status {
 *             type boolean;
 *         }
 *         leaf a13-session-transfer-enable {
 *             type boolean;
 *         }
 *         leaf local-ip-access-enable {
 *             type boolean;
 *         }
 *         container fap-control-cdma2000-hrpd-self-config {
 *             leaf rfcnfl-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf pilot-pn-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf maxfap-tx-power-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf max-hrpd-beacon-tx-power-self-config-enable {
 *                 type boolean;
 *             }
 *             uses fap-control-cdma2000-hrpd-self-config-g;
 *         }
 *         container fap-control-cdma2000-hrpd-a13 {
 *             leaf color-code-to-uati104-number-of-entries {
 *                 type uint64;
 *             }
 *             leaf hrpd-subnet-to-ip-number-of-entries {
 *                 type uint64;
 *             }
 *             list fap-control-cdma2000-hrpd-a13-color-code-to-uati104 {
 *                 key "color-code" "uati104";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf color-code {
 *                     type uint16;
 *                 }
 *                 leaf uati104 {
 *                     type binary;
 *                 }
 *                 uses fap-control-cdma2000-hrpd-a13-color-code-to-uati104-g;
 *             }
 *             list fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip {
 *                 key "a13-ip-address";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf hrpd-subnet-length {
 *                     type hrpd-subnet-length;
 *                 }
 *                 leaf hrpd-subnet {
 *                     type binary;
 *                 }
 *                 leaf a13-ip-address {
 *                     type ip-address;
 *                 }
 *                 uses fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip-g;
 *             }
 *             uses fap-control-cdma2000-hrpd-a13-g;
 *         }
 *         uses fap-control-cdma2000-hrpd-g;
 *     }
 *     uses fap-control-cdma2000-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-cdma2000</i>
 *
 * <p>To create instances of this class use {@link FapControlCdma2000Builder}.
 * @see FapControlCdma2000Builder
 *
 */
public interface FapControlCdma2000
    extends
    ChildOf<FapControl>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000>,
    FapControlCdma2000G
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000").intern();

    /**
     * Container for object class FAPService.{i}.FAPControl.CDMA2000.Time.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Time</code> <code>fapControlCdma2000Time</code>, or <code>null</code> if not present
     */
    FapControlCdma2000Time getFapControlCdma2000Time();
    
    /**
     * Container for object class FAPService.{i}.FAPControl.CDMA2000.OneX.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000OneX</code> <code>fapControlCdma2000OneX</code>, or <code>null</code> if not present
     */
    FapControlCdma2000OneX getFapControlCdma2000OneX();
    
    /**
     * Container for object class FAPService.{i}.FAPControl.CDMA2000.Gateway.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Gateway</code> <code>fapControlCdma2000Gateway</code>, or <code>null</code> if not present
     */
    FapControlCdma2000Gateway getFapControlCdma2000Gateway();
    
    /**
     * Container for object class FAPService.{i}.FAPControl.CDMA2000.HRPD.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd</code> <code>fapControlCdma2000Hrpd</code>, or <code>null</code> if not present
     */
    FapControlCdma2000Hrpd getFapControlCdma2000Hrpd();

}

