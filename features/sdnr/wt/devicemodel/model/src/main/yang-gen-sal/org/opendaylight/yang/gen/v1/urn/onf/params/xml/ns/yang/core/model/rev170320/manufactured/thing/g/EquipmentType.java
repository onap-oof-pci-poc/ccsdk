package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturedThingG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentTypeG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container equipment-type {
 *     leaf description {
 *         type string;
 *     }
 *     leaf model-identifier {
 *         type string;
 *     }
 *     leaf part-type-identifier {
 *         type string;
 *     }
 *     leaf type-name {
 *         type string;
 *     }
 *     leaf version {
 *         type string;
 *     }
 *     uses equipment-type-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/manufactured-thing-g/equipment-type</i>
 *
 * <p>To create instances of this class use {@link EquipmentTypeBuilder}.
 * @see EquipmentTypeBuilder
 *
 */
public interface EquipmentType
    extends
    ChildOf<ManufacturedThingG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.EquipmentType>,
    EquipmentTypeG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "equipment-type").intern();


}

