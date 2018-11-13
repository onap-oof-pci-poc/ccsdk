package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13G;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13ColorCodeToUati104;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp;

/**
 * Container for object class FAPService.{i}.FAPControl.CDMA2000.HRPD.A13.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control-cdma2000-hrpd-a13 {
 *     leaf color-code-to-uati104-number-of-entries {
 *         type uint64;
 *     }
 *     leaf hrpd-subnet-to-ip-number-of-entries {
 *         type uint64;
 *     }
 *     list fap-control-cdma2000-hrpd-a13-color-code-to-uati104 {
 *         key "color-code" "uati104";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf color-code {
 *             type uint16;
 *         }
 *         leaf uati104 {
 *             type binary;
 *         }
 *         uses fap-control-cdma2000-hrpd-a13-color-code-to-uati104-g;
 *     }
 *     list fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip {
 *         key "a13-ip-address";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf hrpd-subnet-length {
 *             type hrpd-subnet-length;
 *         }
 *         leaf hrpd-subnet {
 *             type binary;
 *         }
 *         leaf a13-ip-address {
 *             type ip-address;
 *         }
 *         uses fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip-g;
 *     }
 *     uses fap-control-cdma2000-hrpd-a13-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-cdma2000/fap-control-cdma2000-hrpd/fap-control-cdma2000-hrpd-a13</i>
 *
 * <p>To create instances of this class use {@link FapControlCdma2000HrpdA13Builder}.
 * @see FapControlCdma2000HrpdA13Builder
 *
 */
public interface FapControlCdma2000HrpdA13
    extends
    ChildOf<FapControlCdma2000Hrpd>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13>,
    FapControlCdma2000HrpdA13G
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-hrpd-a13").intern();

    /**
     * List of object class 
     * FAPService.{i}.FAPControl.CDMA2000.HRPD.A13.ColorCodeToUATI104.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>fapControlCdma2000HrpdA13ColorCodeToUati104</code>, or <code>null</code> if not present
     */
    List<FapControlCdma2000HrpdA13ColorCodeToUati104> getFapControlCdma2000HrpdA13ColorCodeToUati104();
    
    /**
     * List of object class 
     * FAPService.{i}.FAPControl.CDMA2000.HRPD.A13.HRPDSubnetToIP.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>fapControlCdma2000HrpdA13HrpdSubnetToIp</code>, or <code>null</code> if not present
     */
    List<FapControlCdma2000HrpdA13HrpdSubnetToIp> getFapControlCdma2000HrpdA13HrpdSubnetToIp();

}

