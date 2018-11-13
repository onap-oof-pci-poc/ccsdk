package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesUmtsG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.Capabilities.UMTS.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container capabilities-umts {
 *     leaf duplex-mode {
 *         type enumeration;
 *     }
 *     leaf gsm-rx-supported {
 *         type boolean;
 *     }
 *     leaf hsdpa-supported {
 *         type boolean;
 *     }
 *     leaf max-hsdpa-data-rate-supported {
 *         type max-hsdpa-data-rate-supported;
 *     }
 *     leaf hsupa-supported {
 *         type boolean;
 *     }
 *     leaf max-hsupa-data-rate-supported {
 *         type max-hsupa-data-rate-supported;
 *     }
 *     leaf max-hspdsc-hs-supported {
 *         type uint8;
 *     }
 *     leaf max-hsscc-hs-supported {
 *         type uint64;
 *     }
 *     leaf-list fdd-bands-supported {
 *         type string;
 *     }
 *     leaf-list gsm-rx-bands-supported {
 *         type enumeration;
 *     }
 *     container capabilities-umts-self-config {
 *         leaf uarfcn-config {
 *             type boolean;
 *         }
 *         leaf primary-scrambling-code-config {
 *             type boolean;
 *         }
 *         leaf maxfap-tx-power-expanded-config {
 *             type boolean;
 *         }
 *         leaf pcpich-power-config {
 *             type boolean;
 *         }
 *         leaf max-ul-tx-power-config {
 *             type boolean;
 *         }
 *         leaf lacracura-config {
 *             type boolean;
 *         }
 *         leaf neighbor-list-config {
 *             type boolean;
 *         }
 *         leaf cell-re-selection-config {
 *             type boolean;
 *         }
 *         leaf intra-freq-meas-config {
 *             type boolean;
 *         }
 *         leaf inter-freq-meas-config {
 *             type boolean;
 *         }
 *         leaf inter-rat-meas-config {
 *             type boolean;
 *         }
 *         leaf ue-internal-meas-config {
 *             type boolean;
 *         }
 *         leaf noise-rise-limit-config {
 *             type boolean;
 *         }
 *         uses capabilities-umts-self-config-g;
 *     }
 *     uses capabilities-umts-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/capabilities/capabilities-umts</i>
 *
 * <p>To create instances of this class use {@link CapabilitiesUmtsBuilder}.
 * @see CapabilitiesUmtsBuilder
 *
 */
public interface CapabilitiesUmts
    extends
    ChildOf<Capabilities>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts>,
    CapabilitiesUmtsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-umts").intern();

    /**
     * Container for object class FAPService.{i}.Capabilities.UMTS.SelfConfig.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.capabilities.umts.CapabilitiesUmtsSelfConfig</code> <code>capabilitiesUmtsSelfConfig</code>, or <code>null</code> if not present
     */
    CapabilitiesUmtsSelfConfig getCapabilitiesUmtsSelfConfig();

}

