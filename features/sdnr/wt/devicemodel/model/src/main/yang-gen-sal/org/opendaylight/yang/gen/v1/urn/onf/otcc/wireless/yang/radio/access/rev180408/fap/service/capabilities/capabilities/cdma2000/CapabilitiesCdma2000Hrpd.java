package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000HrpdG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.Capabilities.CDMA2000.HRPD.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container capabilities-cdma2000-hrpd {
 *     leaf a13-session-transfer-capable {
 *         type boolean;
 *     }
 *     leaf a16-session-transfer-capable {
 *         type boolean;
 *     }
 *     leaf local-ip-access-capable {
 *         type boolean;
 *     }
 *     leaf dedicated-hrpd-beacon {
 *         type boolean;
 *     }
 *     container capabilities-cdma2000-hrpd-self-config {
 *         leaf rfcnfl-config {
 *             type boolean;
 *         }
 *         leaf pilot-pn-config {
 *             type boolean;
 *         }
 *         leaf maxfap-tx-power-config {
 *             type boolean;
 *         }
 *         leaf maxfap-beacon-tx-power-config {
 *             type boolean;
 *         }
 *         uses capabilities-cdma2000-hrpd-self-config-g;
 *     }
 *     uses capabilities-cdma2000-hrpd-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/capabilities/capabilities-cdma2000/capabilities-cdma2000-hrpd</i>
 *
 * <p>To create instances of this class use {@link CapabilitiesCdma2000HrpdBuilder}.
 * @see CapabilitiesCdma2000HrpdBuilder
 *
 */
public interface CapabilitiesCdma2000Hrpd
    extends
    ChildOf<CapabilitiesCdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd>,
    CapabilitiesCdma2000HrpdG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-cdma2000-hrpd").intern();

    /**
     * Container for object class FAPService.{i}.Capabilities.CDMA2000.HRPD.SelfConfig.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.hrpd.CapabilitiesCdma2000HrpdSelfConfig</code> <code>capabilitiesCdma2000HrpdSelfConfig</code>, or <code>null</code> if not present
     */
    CapabilitiesCdma2000HrpdSelfConfig getCapabilitiesCdma2000HrpdSelfConfig();

}

