package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.LocalIdAndClassG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressElementG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container local-id {
 *     leaf class-of-instance {
 *         type string;
 *     }
 *     container local-id {
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     uses local-id-and-class-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/address-element-g/local-id</i>
 *
 * <p>To create instances of this class use {@link LocalIdBuilder}.
 * @see LocalIdBuilder
 *
 */
public interface LocalId
    extends
    ChildOf<AddressElementG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.LocalId>,
    LocalIdAndClassG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "local-id").intern();


}

