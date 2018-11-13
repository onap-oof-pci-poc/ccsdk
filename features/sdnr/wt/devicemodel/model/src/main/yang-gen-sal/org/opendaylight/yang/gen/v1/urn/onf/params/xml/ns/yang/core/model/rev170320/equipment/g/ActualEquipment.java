package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ActualEquipmentG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container actual-equipment {
 *     uses actual-equipment-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/equipment-g/actual-equipment</i>
 *
 * <p>To create instances of this class use {@link ActualEquipmentBuilder}.
 * @see ActualEquipmentBuilder
 *
 */
public interface ActualEquipment
    extends
    ChildOf<EquipmentG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ActualEquipment>,
    ActualEquipmentG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "actual-equipment").intern();


}

