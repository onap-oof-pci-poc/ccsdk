package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.LocalId;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping address-element-g {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/address-element-g</i>
 *
 */
public interface AddressElementG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "address-element-g").intern();

    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.String</code> <code>addressElementName</code>, or <code>null</code> if not present
     */
    java.lang.String getAddressElementName();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.LocalId</code> <code>localId</code>, or <code>null</code> if not present
     */
    LocalId getLocalId();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>uuid</code>, or <code>null</code> if not present
     */
    UniversalId getUuid();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.element.g.Name</code> <code>name</code>, or <code>null</code> if not present
     */
    Name getName();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.String</code> <code>arbitraryElement</code>, or <code>null</code> if not present
     */
    java.lang.String getArbitraryElement();

}

