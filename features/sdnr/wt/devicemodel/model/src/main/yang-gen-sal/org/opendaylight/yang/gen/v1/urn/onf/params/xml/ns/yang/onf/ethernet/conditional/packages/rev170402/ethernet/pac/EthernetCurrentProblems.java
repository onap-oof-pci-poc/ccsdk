package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetPac;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.EthernetCurrentProblemsG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-ethernet-conditional-packages</b>
 * <pre>
 * container ethernet-current-problems {
 *     uses ethernet-current-problems-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-ethernet-conditional-packages/ethernet-pac/ethernet-current-problems</i>
 *
 * <p>To create instances of this class use {@link EthernetCurrentProblemsBuilder}.
 * @see EthernetCurrentProblemsBuilder
 *
 */
public interface EthernetCurrentProblems
    extends
    ChildOf<EthernetPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.ethernet.conditional.packages.rev170402.ethernet.pac.EthernetCurrentProblems>,
    EthernetCurrentProblemsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-ethernet-conditional-packages",
        "2017-04-02", "ethernet-current-problems").intern();


}

