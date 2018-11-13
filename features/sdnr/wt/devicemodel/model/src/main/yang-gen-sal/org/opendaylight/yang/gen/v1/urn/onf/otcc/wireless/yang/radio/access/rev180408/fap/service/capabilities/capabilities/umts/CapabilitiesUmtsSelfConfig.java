package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsSelfConfigG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.Capabilities.UMTS.SelfConfig.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container capabilities-umts-self-config {
 *     leaf uarfcn-config {
 *         type boolean;
 *     }
 *     leaf primary-scrambling-code-config {
 *         type boolean;
 *     }
 *     leaf maxfap-tx-power-expanded-config {
 *         type boolean;
 *     }
 *     leaf pcpich-power-config {
 *         type boolean;
 *     }
 *     leaf max-ul-tx-power-config {
 *         type boolean;
 *     }
 *     leaf lacracura-config {
 *         type boolean;
 *     }
 *     leaf neighbor-list-config {
 *         type boolean;
 *     }
 *     leaf cell-re-selection-config {
 *         type boolean;
 *     }
 *     leaf intra-freq-meas-config {
 *         type boolean;
 *     }
 *     leaf inter-freq-meas-config {
 *         type boolean;
 *     }
 *     leaf inter-rat-meas-config {
 *         type boolean;
 *     }
 *     leaf ue-internal-meas-config {
 *         type boolean;
 *     }
 *     leaf noise-rise-limit-config {
 *         type boolean;
 *     }
 *     uses capabilities-umts-self-config-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/capabilities/capabilities-umts/capabilities-umts-self-config</i>
 *
 * <p>To create instances of this class use {@link CapabilitiesUmtsSelfConfigBuilder}.
 * @see CapabilitiesUmtsSelfConfigBuilder
 *
 */
public interface CapabilitiesUmtsSelfConfig
    extends
    ChildOf<CapabilitiesUmts>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig>,
    CapabilitiesUmtsSelfConfigG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-umts-self-config").intern();


}

