package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.EthernetContainerCapabilityG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwEthernetContainerPac;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container ethernet-container-capability {
 *     leaf bundling-is-avail {
 *         type bundling-is-avail;
 *     }
 *     leaf packet-compression-is-avail {
 *         type packet-compression-is-avail;
 *     }
 *     leaf layer2-compression-is-avail {
 *         type layer2-compression-is-avail;
 *     }
 *     leaf vlan-compression-is-avail {
 *         type vlan-compression-is-avail;
 *     }
 *     leaf q-in-q-compression-is-avail {
 *         type q-in-q-compression-is-avail;
 *     }
 *     leaf mpls-compression-is-avail {
 *         type mpls-compression-is-avail;
 *     }
 *     leaf ipv4-compression-is-avail {
 *         type ipv4-compression-is-avail;
 *     }
 *     leaf ipv6-compression-is-avail {
 *         type ipv6-compression-is-avail;
 *     }
 *     leaf layer4-compression-is-avail {
 *         type layer4-compression-is-avail;
 *     }
 *     leaf encryption-is-avail {
 *         type encryption-is-avail;
 *     }
 *     leaf supported-alarms {
 *         type supported-alarms;
 *     }
 *     uses ethernet-container-capability-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-ethernet-container-pac/ethernet-container-capability</i>
 *
 * <p>To create instances of this class use {@link EthernetContainerCapabilityBuilder}.
 * @see EthernetContainerCapabilityBuilder
 *
 */
public interface EthernetContainerCapability
    extends
    ChildOf<MwEthernetContainerPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerCapability>,
    EthernetContainerCapabilityG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "ethernet-container-capability").intern();


}

