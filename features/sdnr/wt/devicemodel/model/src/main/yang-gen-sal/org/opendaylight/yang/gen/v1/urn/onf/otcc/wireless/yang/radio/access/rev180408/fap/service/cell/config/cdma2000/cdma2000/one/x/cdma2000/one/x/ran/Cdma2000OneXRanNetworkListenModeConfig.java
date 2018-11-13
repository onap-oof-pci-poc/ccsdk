package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.Cdma2000OneXRan;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000OneXRanNetworkListenModeConfigG;

/**
 * Container for object class 
 * FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.NetworkListenModeConfig.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-one-x-ran-network-listen-mode-config {
 *     leaf rfcnfl-margin {
 *         type uint64;
 *     }
 *     leaf fap-coverage-target {
 *         type string;
 *     }
 *     leaf fap-beacon-coverage-target {
 *         type string;
 *     }
 *     leaf max-coverage-edge-pilot-strength {
 *         type max-coverage-edge-pilot-strength;
 *     }
 *     leaf max-allowable-pilot-strength-degradation {
 *         type max-allowable-pilot-strength-degradation;
 *     }
 *     leaf-list rfcnfl-to-protect {
 *         type string;
 *     }
 *     leaf fap-allowed-adj-chan-coverage-hole {
 *         type fap-allowed-adj-chan-coverage-hole;
 *     }
 *     leaf acir {
 *         type acir;
 *     }
 *     uses cdma2000-one-x-ran-network-listen-mode-config-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-one-x/cdma2000-one-x-ran/cdma2000-one-x-ran-network-listen-mode-config</i>
 *
 * <p>To create instances of this class use {@link Cdma2000OneXRanNetworkListenModeConfigBuilder}.
 * @see Cdma2000OneXRanNetworkListenModeConfigBuilder
 *
 */
public interface Cdma2000OneXRanNetworkListenModeConfig
    extends
    ChildOf<Cdma2000OneXRan>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.one.x.cdma2000.one.x.ran.Cdma2000OneXRanNetworkListenModeConfig>,
    Cdma2000OneXRanNetworkListenModeConfigG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-one-x-ran-network-listen-mode-config").intern();


}

