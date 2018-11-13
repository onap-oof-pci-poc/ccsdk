package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationCurrentPerformanceG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduTerminationPac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-otn-odu-conditional-packages</b>
 * <pre>
 * container otn-odu-termination-current-performance {
 *     uses otn-odu-termination-current-performance-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-otn-odu-conditional-packages/otn-odu-termination-pac/otn-odu-termination-current-performance</i>
 *
 * <p>To create instances of this class use {@link OtnOduTerminationCurrentPerformanceBuilder}.
 * @see OtnOduTerminationCurrentPerformanceBuilder
 *
 */
public interface OtnOduTerminationCurrentPerformance
    extends
    ChildOf<OtnOduTerminationPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.termination.pac.OtnOduTerminationCurrentPerformance>,
    OtnOduTerminationCurrentPerformanceG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-otn-odu-conditional-packages",
        "2017-10-20", "otn-odu-termination-current-performance").intern();


}

