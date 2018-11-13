package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.NameAndClassG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressElementG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container name {
 *     leaf class-of-instance {
 *         type string;
 *     }
 *     container name {
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     uses name-and-class-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/address-element-g/name</i>
 *
 * <p>To create instances of this class use {@link NameBuilder}.
 * @see NameBuilder
 *
 */
public interface Name
    extends
    ChildOf<AddressElementG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name>,
    NameAndClassG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "name").intern();


}

