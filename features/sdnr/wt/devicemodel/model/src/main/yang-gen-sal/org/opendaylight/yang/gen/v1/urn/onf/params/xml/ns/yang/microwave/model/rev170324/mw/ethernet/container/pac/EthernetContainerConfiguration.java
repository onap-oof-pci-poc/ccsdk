package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.EthernetContainerConfigurationG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.MwEthernetContainerPac;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * container ethernet-container-configuration {
 *     leaf container-id {
 *         type container-id;
 *     }
 *     list segments-id-list {
 *         key "structure-id-ref" "segment-id-ref";
 *         leaf structure-id-ref {
 *             type universal-id;
 *         }
 *         leaf segment-id-ref {
 *             type int16;
 *         }
 *         uses segment-id-type-g;
 *     }
 *     leaf packet-compression-is-on {
 *         type packet-compression-is-on;
 *     }
 *     leaf layer2-compression-is-on {
 *         type layer2-compression-is-on;
 *     }
 *     leaf vlan-compression-is-on {
 *         type vlan-compression-is-on;
 *     }
 *     leaf q-in-q-compression-is-on {
 *         type q-in-q-compression-is-on;
 *     }
 *     leaf mpls-compression-is-on {
 *         type mpls-compression-is-on;
 *     }
 *     leaf ipv4-compression-is-on {
 *         type ipv4-compression-is-on;
 *     }
 *     leaf ipv6-compression-is-on {
 *         type ipv6-compression-is-on;
 *     }
 *     leaf layer4-compression-is-on {
 *         type layer4-compression-is-on;
 *     }
 *     leaf encryption-is-on {
 *         type encryption-is-on;
 *     }
 *     leaf cryptographic-key {
 *         type cryptographic-key;
 *     }
 *     list problem-kind-severity-list {
 *         key "problem-kind-name";
 *         leaf problem-kind-name {
 *             type problem-kind-name;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *         uses container-problem-severity-type-g;
 *     }
 *     uses ethernet-container-configuration-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/mw-ethernet-container-pac/ethernet-container-configuration</i>
 *
 * <p>To create instances of this class use {@link EthernetContainerConfigurationBuilder}.
 * @see EthernetContainerConfigurationBuilder
 *
 */
public interface EthernetContainerConfiguration
    extends
    ChildOf<MwEthernetContainerPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.mw.ethernet.container.pac.EthernetContainerConfiguration>,
    EthernetContainerConfigurationG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "ethernet-container-configuration").intern();


}

