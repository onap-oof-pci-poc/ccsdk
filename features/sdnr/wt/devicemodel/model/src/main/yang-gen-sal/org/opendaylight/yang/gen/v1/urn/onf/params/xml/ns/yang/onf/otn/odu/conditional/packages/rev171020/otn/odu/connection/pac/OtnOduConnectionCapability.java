package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionCapabilityG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-otn-odu-conditional-packages</b>
 * <pre>
 * container otn-odu-connection-capability {
 *     container accepted-payload-type {
 *         leaf named-payload-type {
 *             type odu-named-payload-type;
 *         }
 *         leaf hex-payload-type {
 *             type uint64;
 *         }
 *         uses odu-payload-type-g;
 *     }
 *     uses otn-odu-connection-capability-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-otn-odu-conditional-packages/otn-odu-connection-pac/otn-odu-connection-capability</i>
 *
 * <p>To create instances of this class use {@link OtnOduConnectionCapabilityBuilder}.
 * @see OtnOduConnectionCapabilityBuilder
 *
 */
public interface OtnOduConnectionCapability
    extends
    ChildOf<OtnOduConnectionPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionCapability>,
    OtnOduConnectionCapabilityG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-otn-odu-conditional-packages",
        "2017-10-20", "otn-odu-connection-capability").intern();


}

