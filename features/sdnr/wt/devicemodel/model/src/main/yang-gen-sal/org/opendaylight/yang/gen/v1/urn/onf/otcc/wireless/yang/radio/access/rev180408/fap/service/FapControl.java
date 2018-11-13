package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlLte;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts;

/**
 * Container for object class FAPService.{i}.FAPControl.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control {
 *     leaf-list self-config-events {
 *         type enumeration;
 *     }
 *     leaf enclosure-tampering-detected {
 *         type boolean;
 *     }
 *     container fap-control-umts {
 *         leaf op-state {
 *             type boolean;
 *         }
 *         leaf admin-state {
 *             type boolean;
 *         }
 *         leaf rf-tx-status {
 *             type boolean;
 *         }
 *         leaf pm-config {
 *             type string;
 *         }
 *         container fap-control-umts-self-config {
 *             leaf uarfcn-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf primary-scrambling-code-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf maxfap-tx-power-expanded-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf pcpich-power-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf max-ul-tx-power-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf lacracura-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf neighbor-list-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf cell-re-selection-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf intra-freq-meas-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf inter-freq-meas-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf inter-rat-meas-self-config-enable {
 *                 type boolean;
 *             }
 *             leaf ue-internal-meas-config-enable {
 *                 type boolean;
 *             }
 *             leaf noise-rise-limit-config-enable {
 *                 type boolean;
 *             }
 *             uses fap-control-umts-self-config-g;
 *         }
 *         container fap-control-umts-gateway {
 *             leaf sec-gw-server1 {
 *                 type string;
 *             }
 *             leaf sec-gw-server2 {
 *                 type string;
 *             }
 *             leaf sec-gw-server3 {
 *                 type string;
 *             }
 *             leaf fap-gw-server1 {
 *                 type string;
 *             }
 *             leaf fap-gw-server2 {
 *                 type string;
 *             }
 *             leaf fap-gw-server3 {
 *                 type string;
 *             }
 *             leaf fap-gw-port {
 *                 type uint16;
 *             }
 *             uses fap-control-umts-gateway-g;
 *         }
 *         uses fap-control-umts-g;
 *     }
 *     container fap-control-lte {
 *         leaf op-state {
 *             type boolean;
 *         }
 *         leaf admin-state {
 *             type boolean;
 *         }
 *         leaf rf-tx-status {
 *             type boolean;
 *         }
 *         leaf pm-config {
 *             type string;
 *         }
 *         container fap-control-lte-gateway {
 *             leaf sec-gw-server1 {
 *                 type string;
 *             }
 *             leaf sec-gw-server2 {
 *                 type string;
 *             }
 *             leaf sec-gw-server3 {
 *                 type string;
 *             }
 *             leaf-list s1-sig-link-server-list {
 *                 type string;
 *             }
 *             leaf s1-connection-mode {
 *                 type enumeration;
 *             }
 *             leaf s1-sig-link-port {
 *                 type uint16;
 *             }
 *             uses fap-control-lte-gateway-g;
 *         }
 *         uses fap-control-lte-g;
 *     }
 *     container fap-control-cdma2000 {
 *         leaf home-domain {
 *             type string;
 *         }
 *         leaf remote-ip-access-enable {
 *             type boolean;
 *         }
 *         leaf pm-config {
 *             type string;
 *         }
 *         container fap-control-cdma2000-time {
 *             leaf local-time-zone {
 *                 type string;
 *             }
 *             leaf current-local-time {
 *                 type string;
 *             }
 *             leaf leap-seconds {
 *                 type leap-seconds;
 *             }
 *             leaf daylight-savings-used {
 *                 type boolean;
 *             }
 *             uses fap-control-cdma2000-time-g;
 *         }
 *         container fap-control-cdma2000-one-x {
 *             leaf admin-state {
 *                 type enumeration;
 *             }
 *             leaf op-state {
 *                 type enumeration;
 *             }
 *             leaf rf-tx-status {
 *                 type boolean;
 *             }
 *             leaf daylight {
 *                 type int64;
 *             }
 *             leaf max-p-rev {
 *                 type int64;
 *             }
 *             leaf reregister {
 *                 type uint64;
 *             }
 *             leaf emergency-session-period {
 *                 type emergency-session-period;
 *             }
 *             leaf location-area-code {
 *                 type uint16;
 *             }
 *             leaf msc-id {
 *                 type uint64;
 *             }
 *             leaf active-handin-enable {
 *                 type boolean;
 *             }
 *             container fap-control-cdma2000-one-x-active-handin-measurement {
 *                 leaf active-handin-measurement-enable {
 *                     type boolean;
 *                 }
 *                 leaf active-hand-in-measurement-duration {
 *                     type active-hand-in-measurement-duration;
 *                 }
 *                 leaf measurement-report-threshold {
 *                     type measurement-report-threshold;
 *                 }
 *                 uses fap-control-cdma2000-one-x-active-handin-measurement-g;
 *             }
 *             container fap-control-cdma2000-one-x-self-config {
 *                 leaf rfcnfl-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf pilot-pn-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf maxfap-tx-power-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf maxfap-beacon-tx-power-self-config-enable {
 *                     type boolean;
 *                 }
 *                 uses fap-control-cdma2000-one-x-self-config-g;
 *             }
 *             uses fap-control-cdma2000-one-x-g;
 *         }
 *         container fap-control-cdma2000-gateway {
 *             leaf sec-gw-server1 {
 *                 type string;
 *             }
 *             leaf sec-gw-server2 {
 *                 type string;
 *             }
 *             leaf sec-gw-server3 {
 *                 type string;
 *             }
 *             leaf sec-gw-switchover-count {
 *                 type uint64;
 *             }
 *             uses fap-control-cdma2000-gateway-g;
 *         }
 *         container fap-control-cdma2000-hrpd {
 *             leaf op-state {
 *                 type boolean;
 *             }
 *             leaf admin-state {
 *                 type boolean;
 *             }
 *             leaf rf-tx-status {
 *                 type boolean;
 *             }
 *             leaf a13-session-transfer-enable {
 *                 type boolean;
 *             }
 *             leaf local-ip-access-enable {
 *                 type boolean;
 *             }
 *             container fap-control-cdma2000-hrpd-self-config {
 *                 leaf rfcnfl-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf pilot-pn-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf maxfap-tx-power-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf max-hrpd-beacon-tx-power-self-config-enable {
 *                     type boolean;
 *                 }
 *                 uses fap-control-cdma2000-hrpd-self-config-g;
 *             }
 *             container fap-control-cdma2000-hrpd-a13 {
 *                 leaf color-code-to-uati104-number-of-entries {
 *                     type uint64;
 *                 }
 *                 leaf hrpd-subnet-to-ip-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list fap-control-cdma2000-hrpd-a13-color-code-to-uati104 {
 *                     key "color-code" "uati104";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf color-code {
 *                         type uint16;
 *                     }
 *                     leaf uati104 {
 *                         type binary;
 *                     }
 *                     uses fap-control-cdma2000-hrpd-a13-color-code-to-uati104-g;
 *                 }
 *                 list fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip {
 *                     key "a13-ip-address";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf hrpd-subnet-length {
 *                         type hrpd-subnet-length;
 *                     }
 *                     leaf hrpd-subnet {
 *                         type binary;
 *                     }
 *                     leaf a13-ip-address {
 *                         type ip-address;
 *                     }
 *                     uses fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip-g;
 *                 }
 *                 uses fap-control-cdma2000-hrpd-a13-g;
 *             }
 *             uses fap-control-cdma2000-hrpd-g;
 *         }
 *         uses fap-control-cdma2000-g;
 *     }
 *     uses fap-control-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control</i>
 *
 * <p>To create instances of this class use {@link FapControlBuilder}.
 * @see FapControlBuilder
 *
 */
public interface FapControl
    extends
    ChildOf<FapService>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl>,
    FapControlG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control").intern();

    /**
     * Container for object class FAPService.{i}.FAPControl.UMTS.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlUmts</code> <code>fapControlUmts</code>, or <code>null</code> if not present
     */
    FapControlUmts getFapControlUmts();
    
    /**
     * Container for object class FAPService.{i}.FAPControl.LTE.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlLte</code> <code>fapControlLte</code>, or <code>null</code> if not present
     */
    FapControlLte getFapControlLte();
    
    /**
     * Container for object class FAPService.{i}.FAPControl.CDMA2000.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000</code> <code>fapControlCdma2000</code>, or <code>null</code> if not present
     */
    FapControlCdma2000 getFapControlCdma2000();

}

