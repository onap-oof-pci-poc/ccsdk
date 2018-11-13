package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.address.g.AddressElement;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping address-g {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/address-g</i>
 *
 */
public interface AddressG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "address-g").intern();

    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.String</code> <code>addressName</code>, or <code>null</code> if not present
     */
    java.lang.String getAddressName();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.util.List</code> <code>addressElement</code>, or <code>null</code> if not present
     */
    List<AddressElement> getAddressElement();

}

