package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping equipment-instance-g {
 *     leaf manufacture-date {
 *         type string;
 *     }
 *     leaf serial-number {
 *         type string;
 *     }
 *     leaf asset-instance-identifier {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/equipment-instance-g</i>
 *
 */
public interface EquipmentInstanceG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "equipment-instance-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.lang.String</code> <code>manufactureDate</code>, or <code>null</code> if not present
     */
    java.lang.String getManufactureDate();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.String</code> <code>serialNumber</code>, or <code>null</code> if not present
     */
    java.lang.String getSerialNumber();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.String</code> <code>assetInstanceIdentifier</code>, or <code>null</code> if not present
     */
    java.lang.String getAssetInstanceIdentifier();

}

