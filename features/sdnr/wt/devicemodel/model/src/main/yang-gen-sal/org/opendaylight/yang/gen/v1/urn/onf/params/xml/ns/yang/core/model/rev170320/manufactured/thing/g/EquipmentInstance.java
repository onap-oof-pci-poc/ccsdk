package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturedThingG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentInstanceG;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container equipment-instance {
 *     leaf manufacture-date {
 *         type string;
 *     }
 *     leaf serial-number {
 *         type string;
 *     }
 *     leaf asset-instance-identifier {
 *         type string;
 *     }
 *     uses equipment-instance-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/manufactured-thing-g/equipment-instance</i>
 *
 * <p>To create instances of this class use {@link EquipmentInstanceBuilder}.
 * @see EquipmentInstanceBuilder
 *
 */
public interface EquipmentInstance
    extends
    ChildOf<ManufacturedThingG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.manufactured.thing.g.EquipmentInstance>,
    EquipmentInstanceG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "equipment-instance").intern();


}

