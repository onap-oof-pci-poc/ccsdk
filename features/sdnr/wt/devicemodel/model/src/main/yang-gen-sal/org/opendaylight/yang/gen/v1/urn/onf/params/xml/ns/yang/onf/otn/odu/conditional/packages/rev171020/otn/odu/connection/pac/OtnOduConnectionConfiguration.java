package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionPac;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.OtnOduConnectionConfigurationG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-otn-odu-conditional-packages</b>
 * <pre>
 * container otn-odu-connection-configuration {
 *     leaf-list tributary-slot-list {
 *         type uint64;
 *     }
 *     leaf tributary-port-number {
 *         type uint64;
 *     }
 *     leaf accepted-m-si {
 *         type string;
 *     }
 *     leaf opu-tributary-slot-size {
 *         type odu-slot-size;
 *     }
 *     leaf auto-payload-type {
 *         type boolean;
 *     }
 *     leaf configured-mapping-type {
 *         type mapping-type;
 *     }
 *     leaf configured-client-type {
 *         type string;
 *     }
 *     uses otn-odu-connection-configuration-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-otn-odu-conditional-packages/otn-odu-connection-pac/otn-odu-connection-configuration</i>
 *
 * <p>To create instances of this class use {@link OtnOduConnectionConfigurationBuilder}.
 * @see OtnOduConnectionConfigurationBuilder
 *
 */
public interface OtnOduConnectionConfiguration
    extends
    ChildOf<OtnOduConnectionPac>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.otn.odu.conditional.packages.rev171020.otn.odu.connection.pac.OtnOduConnectionConfiguration>,
    OtnOduConnectionConfigurationG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-otn-odu-conditional-packages",
        "2017-10-20", "otn-odu-connection-configuration").intern();


}

