package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.CapabilitiesLteG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for object class FAPService.{i}.Capabilities.LTE.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container capabilities-lte {
 *     leaf duplex-mode {
 *         type enumeration;
 *     }
 *     leaf-list bands-supported {
 *         type uint8;
 *     }
 *     leaf nnsf-supported {
 *         type boolean;
 *     }
 *     leaf umts-rx-supported {
 *         type boolean;
 *     }
 *     leaf-list umts-rx-bands-supported {
 *         type string;
 *     }
 *     leaf gsm-rx-supported {
 *         type boolean;
 *     }
 *     leaf-list gsm-rx-bands-supported {
 *         type enumeration;
 *     }
 *     leaf cdma2000-rx-supported {
 *         type boolean;
 *     }
 *     leaf-list cdma2000-rx-bands-supported {
 *         type string;
 *     }
 *     uses capabilities-lte-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/capabilities/capabilities-lte</i>
 *
 * <p>To create instances of this class use {@link CapabilitiesLteBuilder}.
 * @see CapabilitiesLteBuilder
 *
 */
public interface CapabilitiesLte
    extends
    ChildOf<Capabilities>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.capabilities.CapabilitiesLte>,
    CapabilitiesLteG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "capabilities-lte").intern();


}

