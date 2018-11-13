package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.AddressG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container holder-location {
 *     leaf address-name {
 *         type string;
 *     }
 *     list address-element {
 *         key "uuid";
 *         leaf address-element-name {
 *             type string;
 *         }
 *         container local-id {
 *             leaf class-of-instance {
 *                 type string;
 *             }
 *             container local-id {
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             uses local-id-and-class-g;
 *         }
 *         leaf uuid {
 *             type universal-id;
 *         }
 *         container name {
 *             leaf class-of-instance {
 *                 type string;
 *             }
 *             container name {
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             uses name-and-class-g;
 *         }
 *         leaf arbitrary-element {
 *             type string;
 *         }
 *         uses address-element-g;
 *     }
 *     uses address-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/holder-g/holder-location</i>
 *
 * <p>To create instances of this class use {@link HolderLocationBuilder}.
 * @see HolderLocationBuilder
 *
 */
public interface HolderLocation
    extends
    ChildOf<HolderG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderLocation>,
    AddressG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "holder-location").intern();


}

