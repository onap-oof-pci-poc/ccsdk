package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetConfigurationG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-ethernet-conditional-packages</b>
 * <pre>
 * container ethernet-configuration {
 *     leaf vlan-id {
 *         type int16;
 *     }
 *     uses ethernet-configuration-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-ethernet-conditional-packages/ethernet-pac/ethernet-configuration</i>
 *
 * <p>To create instances of this class use {@link EthernetConfigurationBuilder}.
 * @see EthernetConfigurationBuilder
 *
 */
public interface EthernetConfiguration
    extends
    ChildOf<EthernetPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetConfiguration>,
    EthernetConfigurationG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-ethernet-conditional-packages",
        "2017-04-02", "ethernet-configuration").intern();


}

