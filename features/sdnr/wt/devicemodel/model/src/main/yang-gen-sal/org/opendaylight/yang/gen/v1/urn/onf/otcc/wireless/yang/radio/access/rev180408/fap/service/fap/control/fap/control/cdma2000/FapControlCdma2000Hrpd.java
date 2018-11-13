package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.FapControlCdma2000;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig;

/**
 * Container for object class FAPService.{i}.FAPControl.CDMA2000.HRPD.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control-cdma2000-hrpd {
 *     leaf op-state {
 *         type boolean;
 *     }
 *     leaf admin-state {
 *         type boolean;
 *     }
 *     leaf rf-tx-status {
 *         type boolean;
 *     }
 *     leaf a13-session-transfer-enable {
 *         type boolean;
 *     }
 *     leaf local-ip-access-enable {
 *         type boolean;
 *     }
 *     container fap-control-cdma2000-hrpd-self-config {
 *         leaf rfcnfl-self-config-enable {
 *             type boolean;
 *         }
 *         leaf pilot-pn-self-config-enable {
 *             type boolean;
 *         }
 *         leaf maxfap-tx-power-self-config-enable {
 *             type boolean;
 *         }
 *         leaf max-hrpd-beacon-tx-power-self-config-enable {
 *             type boolean;
 *         }
 *         uses fap-control-cdma2000-hrpd-self-config-g;
 *     }
 *     container fap-control-cdma2000-hrpd-a13 {
 *         leaf color-code-to-uati104-number-of-entries {
 *             type uint64;
 *         }
 *         leaf hrpd-subnet-to-ip-number-of-entries {
 *             type uint64;
 *         }
 *         list fap-control-cdma2000-hrpd-a13-color-code-to-uati104 {
 *             key "color-code" "uati104";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf color-code {
 *                 type uint16;
 *             }
 *             leaf uati104 {
 *                 type binary;
 *             }
 *             uses fap-control-cdma2000-hrpd-a13-color-code-to-uati104-g;
 *         }
 *         list fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip {
 *             key "a13-ip-address";
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf alias {
 *                 type string;
 *             }
 *             leaf hrpd-subnet-length {
 *                 type hrpd-subnet-length;
 *             }
 *             leaf hrpd-subnet {
 *                 type binary;
 *             }
 *             leaf a13-ip-address {
 *                 type ip-address;
 *             }
 *             uses fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip-g;
 *         }
 *         uses fap-control-cdma2000-hrpd-a13-g;
 *     }
 *     uses fap-control-cdma2000-hrpd-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-cdma2000/fap-control-cdma2000-hrpd</i>
 *
 * <p>To create instances of this class use {@link FapControlCdma2000HrpdBuilder}.
 * @see FapControlCdma2000HrpdBuilder
 *
 */
public interface FapControlCdma2000Hrpd
    extends
    ChildOf<FapControlCdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd>,
    FapControlCdma2000HrpdG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-hrpd").intern();

    /**
     * Container for object class FAPService.{i}.FAPControl.CDMA2000.HRPD.SelfConfig.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig</code> <code>fapControlCdma2000HrpdSelfConfig</code>, or <code>null</code> if not present
     */
    FapControlCdma2000HrpdSelfConfig getFapControlCdma2000HrpdSelfConfig();
    
    /**
     * Container for object class FAPService.{i}.FAPControl.CDMA2000.HRPD.A13.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13</code> <code>fapControlCdma2000HrpdA13</code>, or <code>null</code> if not present
     */
    FapControlCdma2000HrpdA13 getFapControlCdma2000HrpdA13();

}

