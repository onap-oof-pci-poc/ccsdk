package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.OperatorAugmentedEquipmentType;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.ManufacturerProperties;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.EquipmentType;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.EquipmentInstance;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping manufactured-thing-g {
 *     container manufacturer-properties {
 *         leaf manufacturer-identifier {
 *             type string;
 *         }
 *         leaf manufacturer-name {
 *             type string;
 *         }
 *         uses manufacturer-properties-g;
 *     }
 *     container equipment-type {
 *         leaf description {
 *             type string;
 *         }
 *         leaf model-identifier {
 *             type string;
 *         }
 *         leaf part-type-identifier {
 *             type string;
 *         }
 *         leaf type-name {
 *             type string;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *         uses equipment-type-g;
 *     }
 *     container equipment-instance {
 *         leaf manufacture-date {
 *             type string;
 *         }
 *         leaf serial-number {
 *             type string;
 *         }
 *         leaf asset-instance-identifier {
 *             type string;
 *         }
 *         uses equipment-instance-g;
 *     }
 *     container operator-augmented-equipment-type {
 *         leaf asset-type-identifier {
 *             type string;
 *         }
 *         uses operator-augmented-equipment-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/manufactured-thing-g</i>
 *
 */
public interface ManufacturedThingG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "manufactured-thing-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.ManufacturerProperties</code> <code>manufacturerProperties</code>, or <code>null</code> if not present
     */
    ManufacturerProperties getManufacturerProperties();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.EquipmentType</code> <code>equipmentType</code>, or <code>null</code> if not present
     */
    EquipmentType getEquipmentType();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.EquipmentInstance</code> <code>equipmentInstance</code>, or <code>null</code> if not present
     */
    EquipmentInstance getEquipmentInstance();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.OperatorAugmentedEquipmentType</code> <code>operatorAugmentedEquipmentType</code>, or <code>null</code> if not present
     */
    OperatorAugmentedEquipmentType getOperatorAugmentedEquipmentType();

}

