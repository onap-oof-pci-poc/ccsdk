package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwAirInterfacePac;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.AirInterfaceStatusG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container air-interface-status {
 *     leaf tx-frequency-cur {
 *         type tx-frequency-cur;
 *     }
 *     leaf rx-frequency-cur {
 *         type rx-frequency-cur;
 *     }
 *     leaf tx-level-cur {
 *         type tx-level-cur;
 *     }
 *     leaf rx-level-cur {
 *         type rx-level-cur;
 *     }
 *     leaf transmission-mode-cur {
 *         type leafref;
 *     }
 *     leaf modulation-cur {
 *         type modulation-cur;
 *         status DEPRECATED;
 *     }
 *     leaf code-rate-cur {
 *         type code-rate-cur;
 *         status DEPRECATED;
 *     }
 *     leaf received-signal-id {
 *         type received-signal-id;
 *     }
 *     leaf snir-cur {
 *         type snir-cur;
 *     }
 *     leaf xpd-cur {
 *         type xpd-cur;
 *     }
 *     leaf rf-temp-cur {
 *         type rf-temp-cur;
 *     }
 *     leaf last-status-change {
 *         type last-status-change;
 *     }
 *     leaf radio-power-is-up {
 *         type radio-power-is-up;
 *     }
 *     leaf link-is-up {
 *         type link-is-up;
 *     }
 *     leaf xpic-is-up {
 *         type xpic-is-up;
 *     }
 *     leaf mimo-is-up {
 *         type mimo-is-up;
 *     }
 *     leaf alic-is-up {
 *         type alic-is-up;
 *     }
 *     leaf atpc-is-up {
 *         type atpc-is-up;
 *     }
 *     leaf auto-freq-select-is-up {
 *         type auto-freq-select-is-up;
 *     }
 *     leaf loop-back-kind-up {
 *         type loop-back-kind-up;
 *     }
 *     leaf local-end-point-id {
 *         type local-end-point-id;
 *     }
 *     leaf remote-end-point-id {
 *         type remote-end-point-id;
 *     }
 *     uses air-interface-status-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-air-interface-pac/air-interface-status</i>
 *
 * <p>To create instances of this class use {@link AirInterfaceStatusBuilder}.
 * @see AirInterfaceStatusBuilder
 *
 */
public interface AirInterfaceStatus
    extends
    ChildOf<MwAirInterfacePac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.mw.air._interface.pac.AirInterfaceStatus>,
    AirInterfaceStatusG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "air-interface-status").intern();


}

