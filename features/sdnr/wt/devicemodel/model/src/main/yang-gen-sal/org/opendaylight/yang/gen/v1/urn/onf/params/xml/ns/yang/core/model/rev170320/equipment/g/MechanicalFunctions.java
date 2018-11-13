package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.MechanicalFunctionsG;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container mechanical-functions {
 *     leaf rotation-speed {
 *         type to-be-defined;
 *     }
 *     uses mechanical-functions-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/equipment-g/mechanical-functions</i>
 *
 * <p>To create instances of this class use {@link MechanicalFunctionsBuilder}.
 * @see MechanicalFunctionsBuilder
 *
 */
public interface MechanicalFunctions
    extends
    ChildOf<EquipmentG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.MechanicalFunctions>,
    MechanicalFunctionsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "mechanical-functions").intern();


}

