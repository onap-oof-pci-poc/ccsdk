package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapControlCdma2000HrpdSelfConfigG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.FapControlCdma2000Hrpd;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.FAPControl.CDMA2000.HRPD.SelfConfig.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container fap-control-cdma2000-hrpd-self-config {
 *     leaf rfcnfl-self-config-enable {
 *         type boolean;
 *     }
 *     leaf pilot-pn-self-config-enable {
 *         type boolean;
 *     }
 *     leaf maxfap-tx-power-self-config-enable {
 *         type boolean;
 *     }
 *     leaf max-hrpd-beacon-tx-power-self-config-enable {
 *         type boolean;
 *     }
 *     uses fap-control-cdma2000-hrpd-self-config-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/fap-control/fap-control-cdma2000/fap-control-cdma2000-hrpd/fap-control-cdma2000-hrpd-self-config</i>
 *
 * <p>To create instances of this class use {@link FapControlCdma2000HrpdSelfConfigBuilder}.
 * @see FapControlCdma2000HrpdSelfConfigBuilder
 *
 */
public interface FapControlCdma2000HrpdSelfConfig
    extends
    ChildOf<FapControlCdma2000Hrpd>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.fap.control.fap.control.cdma2000.fap.control.cdma2000.hrpd.FapControlCdma2000HrpdSelfConfig>,
    FapControlCdma2000HrpdSelfConfigG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-control-cdma2000-hrpd-self-config").intern();


}

