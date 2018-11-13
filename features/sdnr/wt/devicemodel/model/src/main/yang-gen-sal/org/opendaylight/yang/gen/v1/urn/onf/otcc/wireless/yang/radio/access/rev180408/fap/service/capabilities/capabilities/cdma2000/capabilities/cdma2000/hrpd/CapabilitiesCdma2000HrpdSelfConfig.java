package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdSelfConfigG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd;

/**
 * Container for object class FAPService.{i}.Capabilities.CDMA2000.HRPD.SelfConfig.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container capabilities-cdma2000-hrpd-self-config {
 *     leaf rfcnfl-config {
 *         type boolean;
 *     }
 *     leaf pilot-pn-config {
 *         type boolean;
 *     }
 *     leaf maxfap-tx-power-config {
 *         type boolean;
 *     }
 *     leaf maxfap-beacon-tx-power-config {
 *         type boolean;
 *     }
 *     uses capabilities-cdma2000-hrpd-self-config-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/capabilities/capabilities-cdma2000/capabilities-cdma2000-hrpd/capabilities-cdma2000-hrpd-self-config</i>
 *
 * <p>To create instances of this class use {@link CapabilitiesCdma2000HrpdSelfConfigBuilder}.
 * @see CapabilitiesCdma2000HrpdSelfConfigBuilder
 *
 */
public interface CapabilitiesCdma2000HrpdSelfConfig
    extends
    ChildOf<CapabilitiesCdma2000Hrpd>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig>,
    CapabilitiesCdma2000HrpdSelfConfigG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-cdma2000-hrpd-self-config").intern();


}

