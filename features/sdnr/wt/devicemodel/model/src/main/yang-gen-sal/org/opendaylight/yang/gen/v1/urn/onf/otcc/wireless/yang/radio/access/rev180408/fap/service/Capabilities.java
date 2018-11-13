package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.Capabilities.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container capabilities {
 *     leaf gps-equipped {
 *         type boolean;
 *     }
 *     leaf max-tx-power {
 *         type max-tx-power;
 *     }
 *     leaf-list supported-systems {
 *         type enumeration;
 *     }
 *     leaf beacon {
 *         type boolean;
 *     }
 *     container capabilities-umts {
 *         leaf duplex-mode {
 *             type enumeration;
 *         }
 *         leaf gsm-rx-supported {
 *             type boolean;
 *         }
 *         leaf hsdpa-supported {
 *             type boolean;
 *         }
 *         leaf max-hsdpa-data-rate-supported {
 *             type max-hsdpa-data-rate-supported;
 *         }
 *         leaf hsupa-supported {
 *             type boolean;
 *         }
 *         leaf max-hsupa-data-rate-supported {
 *             type max-hsupa-data-rate-supported;
 *         }
 *         leaf max-hspdsc-hs-supported {
 *             type uint8;
 *         }
 *         leaf max-hsscc-hs-supported {
 *             type uint64;
 *         }
 *         leaf-list fdd-bands-supported {
 *             type string;
 *         }
 *         leaf-list gsm-rx-bands-supported {
 *             type enumeration;
 *         }
 *         container capabilities-umts-self-config {
 *             leaf uarfcn-config {
 *                 type boolean;
 *             }
 *             leaf primary-scrambling-code-config {
 *                 type boolean;
 *             }
 *             leaf maxfap-tx-power-expanded-config {
 *                 type boolean;
 *             }
 *             leaf pcpich-power-config {
 *                 type boolean;
 *             }
 *             leaf max-ul-tx-power-config {
 *                 type boolean;
 *             }
 *             leaf lacracura-config {
 *                 type boolean;
 *             }
 *             leaf neighbor-list-config {
 *                 type boolean;
 *             }
 *             leaf cell-re-selection-config {
 *                 type boolean;
 *             }
 *             leaf intra-freq-meas-config {
 *                 type boolean;
 *             }
 *             leaf inter-freq-meas-config {
 *                 type boolean;
 *             }
 *             leaf inter-rat-meas-config {
 *                 type boolean;
 *             }
 *             leaf ue-internal-meas-config {
 *                 type boolean;
 *             }
 *             leaf noise-rise-limit-config {
 *                 type boolean;
 *             }
 *             uses capabilities-umts-self-config-g;
 *         }
 *         uses capabilities-umts-g;
 *     }
 *     container capabilities-lte {
 *         leaf duplex-mode {
 *             type enumeration;
 *         }
 *         leaf-list bands-supported {
 *             type uint8;
 *         }
 *         leaf nnsf-supported {
 *             type boolean;
 *         }
 *         leaf umts-rx-supported {
 *             type boolean;
 *         }
 *         leaf-list umts-rx-bands-supported {
 *             type string;
 *         }
 *         leaf gsm-rx-supported {
 *             type boolean;
 *         }
 *         leaf-list gsm-rx-bands-supported {
 *             type enumeration;
 *         }
 *         leaf cdma2000-rx-supported {
 *             type boolean;
 *         }
 *         leaf-list cdma2000-rx-bands-supported {
 *             type string;
 *         }
 *         uses capabilities-lte-g;
 *     }
 *     container capabilities-cdma2000 {
 *         leaf remote-ip-access-capable {
 *             type boolean;
 *         }
 *         leaf-list band-class-supportedfap-beacon {
 *             type string;
 *         }
 *         container capabilities-cdma2000-one-x {
 *             leaf band-class-supportedfap {
 *                 type string;
 *             }
 *             leaf active-handin-capable {
 *                 type boolean;
 *             }
 *             leaf femto-overhead-messages-capable {
 *                 type boolean;
 *             }
 *             container capabilities-cdma2000-one-x-self-config {
 *                 leaf rfcnfl-config {
 *                     type boolean;
 *                 }
 *                 leaf pilot-pn-config {
 *                     type boolean;
 *                 }
 *                 leaf maxfap-tx-power-config {
 *                     type boolean;
 *                 }
 *                 leaf maxfap-beacon-tx-power-config {
 *                     type boolean;
 *                 }
 *                 uses capabilities-cdma2000-one-x-self-config-g;
 *             }
 *             uses capabilities-cdma2000-one-x-g;
 *         }
 *         container capabilities-cdma2000-hrpd {
 *             leaf a13-session-transfer-capable {
 *                 type boolean;
 *             }
 *             leaf a16-session-transfer-capable {
 *                 type boolean;
 *             }
 *             leaf local-ip-access-capable {
 *                 type boolean;
 *             }
 *             leaf dedicated-hrpd-beacon {
 *                 type boolean;
 *             }
 *             container capabilities-cdma2000-hrpd-self-config {
 *                 leaf rfcnfl-config {
 *                     type boolean;
 *                 }
 *                 leaf pilot-pn-config {
 *                     type boolean;
 *                 }
 *                 leaf maxfap-tx-power-config {
 *                     type boolean;
 *                 }
 *                 leaf maxfap-beacon-tx-power-config {
 *                     type boolean;
 *                 }
 *                 uses capabilities-cdma2000-hrpd-self-config-g;
 *             }
 *             uses capabilities-cdma2000-hrpd-g;
 *         }
 *         uses capabilities-cdma2000-g;
 *     }
 *     uses capabilities-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/capabilities</i>
 *
 * <p>To create instances of this class use {@link CapabilitiesBuilder}.
 * @see CapabilitiesBuilder
 *
 */
public interface Capabilities
    extends
    ChildOf<FapService>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities>,
    CapabilitiesG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities").intern();

    /**
     * Container for object class FAPService.{i}.Capabilities.UMTS.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesUmts</code> <code>capabilitiesUmts</code>, or <code>null</code> if not present
     */
    CapabilitiesUmts getCapabilitiesUmts();
    
    /**
     * Container for object class FAPService.{i}.Capabilities.LTE.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte</code> <code>capabilitiesLte</code>, or <code>null</code> if not present
     */
    CapabilitiesLte getCapabilitiesLte();
    
    /**
     * Container for object class FAPService.{i}.Capabilities.CDMA2000.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesCdma2000</code> <code>capabilitiesCdma2000</code>, or <code>null</code> if not present
     */
    CapabilitiesCdma2000 getCapabilitiesCdma2000();

}

