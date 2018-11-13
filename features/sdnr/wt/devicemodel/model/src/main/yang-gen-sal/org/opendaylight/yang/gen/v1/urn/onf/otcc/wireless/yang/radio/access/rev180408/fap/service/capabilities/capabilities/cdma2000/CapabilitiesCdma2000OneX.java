package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000OneXG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.one.x.CapabilitiesCdma2000OneXSelfConfig;

/**
 * Container for object class FAPService.{i}.Capabilities.CDMA2000.OneX.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container capabilities-cdma2000-one-x {
 *     leaf band-class-supportedfap {
 *         type string;
 *     }
 *     leaf active-handin-capable {
 *         type boolean;
 *     }
 *     leaf femto-overhead-messages-capable {
 *         type boolean;
 *     }
 *     container capabilities-cdma2000-one-x-self-config {
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
 *         uses capabilities-cdma2000-one-x-self-config-g;
 *     }
 *     uses capabilities-cdma2000-one-x-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/capabilities/capabilities-cdma2000/capabilities-cdma2000-one-x</i>
 *
 * <p>To create instances of this class use {@link CapabilitiesCdma2000OneXBuilder}.
 * @see CapabilitiesCdma2000OneXBuilder
 *
 */
public interface CapabilitiesCdma2000OneX
    extends
    ChildOf<CapabilitiesCdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX>,
    CapabilitiesCdma2000OneXG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-cdma2000-one-x").intern();

    /**
     * Container for object class FAPService.{i}.Capabilities.CDMA2000.OneX.SelfConfig.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.one.x.CapabilitiesCdma2000OneXSelfConfig</code> <code>capabilitiesCdma2000OneXSelfConfig</code>, or <code>null</code> if not present
     */
    CapabilitiesCdma2000OneXSelfConfig getCapabilitiesCdma2000OneXSelfConfig();

}

