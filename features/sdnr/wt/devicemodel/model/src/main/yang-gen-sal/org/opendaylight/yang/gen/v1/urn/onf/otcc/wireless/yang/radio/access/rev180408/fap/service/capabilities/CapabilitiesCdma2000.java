package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000G;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd;

/**
 * Container for object class FAPService.{i}.Capabilities.CDMA2000.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container capabilities-cdma2000 {
 *     leaf remote-ip-access-capable {
 *         type boolean;
 *     }
 *     leaf-list band-class-supportedfap-beacon {
 *         type string;
 *     }
 *     container capabilities-cdma2000-one-x {
 *         leaf band-class-supportedfap {
 *             type string;
 *         }
 *         leaf active-handin-capable {
 *             type boolean;
 *         }
 *         leaf femto-overhead-messages-capable {
 *             type boolean;
 *         }
 *         container capabilities-cdma2000-one-x-self-config {
 *             leaf rfcnfl-config {
 *                 type boolean;
 *             }
 *             leaf pilot-pn-config {
 *                 type boolean;
 *             }
 *             leaf maxfap-tx-power-config {
 *                 type boolean;
 *             }
 *             leaf maxfap-beacon-tx-power-config {
 *                 type boolean;
 *             }
 *             uses capabilities-cdma2000-one-x-self-config-g;
 *         }
 *         uses capabilities-cdma2000-one-x-g;
 *     }
 *     container capabilities-cdma2000-hrpd {
 *         leaf a13-session-transfer-capable {
 *             type boolean;
 *         }
 *         leaf a16-session-transfer-capable {
 *             type boolean;
 *         }
 *         leaf local-ip-access-capable {
 *             type boolean;
 *         }
 *         leaf dedicated-hrpd-beacon {
 *             type boolean;
 *         }
 *         container capabilities-cdma2000-hrpd-self-config {
 *             leaf rfcnfl-config {
 *                 type boolean;
 *             }
 *             leaf pilot-pn-config {
 *                 type boolean;
 *             }
 *             leaf maxfap-tx-power-config {
 *                 type boolean;
 *             }
 *             leaf maxfap-beacon-tx-power-config {
 *                 type boolean;
 *             }
 *             uses capabilities-cdma2000-hrpd-self-config-g;
 *         }
 *         uses capabilities-cdma2000-hrpd-g;
 *     }
 *     uses capabilities-cdma2000-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/capabilities/capabilities-cdma2000</i>
 *
 * <p>To create instances of this class use {@link CapabilitiesCdma2000Builder}.
 * @see CapabilitiesCdma2000Builder
 *
 */
public interface CapabilitiesCdma2000
    extends
    ChildOf<Capabilities>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000>,
    CapabilitiesCdma2000G
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-cdma2000").intern();

    /**
     * Container for object class FAPService.{i}.Capabilities.CDMA2000.OneX.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX</code> <code>capabilitiesCdma2000OneX</code>, or <code>null</code> if not present
     */
    CapabilitiesCdma2000OneX getCapabilitiesCdma2000OneX();
    
    /**
     * Container for object class FAPService.{i}.Capabilities.CDMA2000.HRPD.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000Hrpd</code> <code>capabilitiesCdma2000Hrpd</code>, or <code>null</code> if not present
     */
    CapabilitiesCdma2000Hrpd getCapabilitiesCdma2000Hrpd();

}

