package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationConfigurationG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-otn-odu-conditional-packages</b>
 * <pre>
 * container otn-odu-termination-configuration {
 *     leaf odu-type {
 *         type odu-type;
 *     }
 *     leaf odu-rate {
 *         type uint64;
 *     }
 *     leaf odu-rate-tolerance {
 *         type odu-rate-tolerance;
 *     }
 *     uses otn-odu-termination-configuration-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-otn-odu-conditional-packages/otn-odu-termination-pac/otn-odu-termination-configuration</i>
 *
 * <p>To create instances of this class use {@link OtnOduTerminationConfigurationBuilder}.
 * @see OtnOduTerminationConfigurationBuilder
 *
 */
public interface OtnOduTerminationConfiguration
    extends
    ChildOf<OtnOduTerminationPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationConfiguration>,
    OtnOduTerminationConfigurationG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-otn-odu-conditional-packages",
        "2017-10-20", "otn-odu-termination-configuration").intern();


}

