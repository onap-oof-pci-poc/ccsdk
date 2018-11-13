package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetStatusG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-ethernet-conditional-packages</b>
 * <pre>
 * container ethernet-status {
 *     uses ethernet-status-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-ethernet-conditional-packages/ethernet-pac/ethernet-status</i>
 *
 * <p>To create instances of this class use {@link EthernetStatusBuilder}.
 * @see EthernetStatusBuilder
 *
 */
public interface EthernetStatus
    extends
    ChildOf<EthernetPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetStatus>,
    EthernetStatusG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-ethernet-conditional-packages",
        "2017-04-02", "ethernet-status").intern();


}

