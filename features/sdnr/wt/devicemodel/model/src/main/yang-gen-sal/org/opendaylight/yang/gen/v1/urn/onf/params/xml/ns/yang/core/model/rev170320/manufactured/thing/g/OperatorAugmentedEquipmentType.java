package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturedThingG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.OperatorAugmentedEquipmentTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container operator-augmented-equipment-type {
 *     leaf asset-type-identifier {
 *         type string;
 *     }
 *     uses operator-augmented-equipment-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/manufactured-thing-g/operator-augmented-equipment-type</i>
 *
 * <p>To create instances of this class use {@link OperatorAugmentedEquipmentTypeBuilder}.
 * @see OperatorAugmentedEquipmentTypeBuilder
 *
 */
public interface OperatorAugmentedEquipmentType
    extends
    ChildOf<ManufacturedThingG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.OperatorAugmentedEquipmentType>,
    OperatorAugmentedEquipmentTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "operator-augmented-equipment-type").intern();


}

