package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressElementG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * list address-element {
 *     key "uuid";
 *     leaf address-element-name {
 *         type string;
 *     }
 *     container local-id {
 *         leaf class-of-instance {
 *             type string;
 *         }
 *         container local-id {
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         uses local-id-and-class-g;
 *     }
 *     leaf uuid {
 *         type universal-id;
 *     }
 *     container name {
 *         leaf class-of-instance {
 *             type string;
 *         }
 *         container name {
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         uses name-and-class-g;
 *     }
 *     leaf arbitrary-element {
 *         type string;
 *     }
 *     uses address-element-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/address-g/address-element</i>
 *
 * <p>To create instances of this class use {@link AddressElementBuilder}.
 * @see AddressElementBuilder
 * @see AddressElementKey
 *
 */
public interface AddressElement
    extends
    ChildOf<AddressG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement>,
    AddressElementG,
    Identifiable<AddressElementKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "address-element").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElementKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AddressElementKey getKey();

}

