package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping operator-augmented-equipment-type-g {
 *     leaf asset-type-identifier {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/operator-augmented-equipment-type-g</i>
 *
 */
public interface OperatorAugmentedEquipmentTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "operator-augmented-equipment-type-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.lang.String</code> <code>assetTypeIdentifier</code>, or <code>null</code> if not present
     */
    java.lang.String getAssetTypeIdentifier();

}

