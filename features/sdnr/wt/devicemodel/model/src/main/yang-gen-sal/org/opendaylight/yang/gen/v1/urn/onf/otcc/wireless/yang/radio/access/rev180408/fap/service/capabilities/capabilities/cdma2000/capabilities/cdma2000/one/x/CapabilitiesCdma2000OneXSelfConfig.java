package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.one.x;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.CapabilitiesCdma2000OneX;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesCdma2000OneXSelfConfigG;

/**
 * Container for object class FAPService.{i}.Capabilities.CDMA2000.OneX.SelfConfig.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container capabilities-cdma2000-one-x-self-config {
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
 *     uses capabilities-cdma2000-one-x-self-config-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/capabilities/capabilities-cdma2000/capabilities-cdma2000-one-x/capabilities-cdma2000-one-x-self-config</i>
 *
 * <p>To create instances of this class use {@link CapabilitiesCdma2000OneXSelfConfigBuilder}.
 * @see CapabilitiesCdma2000OneXSelfConfigBuilder
 *
 */
public interface CapabilitiesCdma2000OneXSelfConfig
    extends
    ChildOf<CapabilitiesCdma2000OneX>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.cdma2000.capabilities.cdma2000.one.x.CapabilitiesCdma2000OneXSelfConfig>,
    CapabilitiesCdma2000OneXSelfConfigG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-cdma2000-one-x-self-config").intern();


}

