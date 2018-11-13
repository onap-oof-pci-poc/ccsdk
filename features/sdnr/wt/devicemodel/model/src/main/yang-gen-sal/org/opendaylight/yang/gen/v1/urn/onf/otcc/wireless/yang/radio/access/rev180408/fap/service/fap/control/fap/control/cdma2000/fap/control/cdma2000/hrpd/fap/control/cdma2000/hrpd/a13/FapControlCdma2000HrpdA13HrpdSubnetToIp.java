package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdA13HrpdSubnetToIpG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdA13;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of object class 
 * FAPService.{i}.FAPControl.CDMA2000.HRPD.A13.HRPDSubnetToIP.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip {
 *     key "a13-ip-address";
 *     leaf enable {
 *         type boolean;
 *     }
 *     leaf alias {
 *         type string;
 *     }
 *     leaf hrpd-subnet-length {
 *         type hrpd-subnet-length;
 *     }
 *     leaf hrpd-subnet {
 *         type binary;
 *     }
 *     leaf a13-ip-address {
 *         type ip-address;
 *     }
 *     uses fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-cdma2000/fap-control-cdma2000-hrpd/fap-control-cdma2000-hrpd-a13/fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip</i>
 *
 * <p>To create instances of this class use {@link FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder}.
 * @see FapControlCdma2000HrpdA13HrpdSubnetToIpBuilder
 * @see FapControlCdma2000HrpdA13HrpdSubnetToIpKey
 *
 */
public interface FapControlCdma2000HrpdA13HrpdSubnetToIp
    extends
    ChildOf<FapControlCdma2000HrpdA13>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIp>,
    FapControlCdma2000HrpdA13HrpdSubnetToIpG,
    Identifiable<FapControlCdma2000HrpdA13HrpdSubnetToIpKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.fap.control.cdma2000.hrpd.a13.FapControlCdma2000HrpdA13HrpdSubnetToIpKey</code> <code>key</code>, or <code>null</code> if not present
     */
    FapControlCdma2000HrpdA13HrpdSubnetToIpKey getKey();

}

