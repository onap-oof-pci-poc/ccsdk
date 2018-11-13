package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.FunctionEnablersG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container function-enablers {
 *     leaf power-state {
 *         type to-be-defined;
 *     }
 *     uses function-enablers-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/equipment-g/function-enablers</i>
 *
 * <p>To create instances of this class use {@link FunctionEnablersBuilder}.
 * @see FunctionEnablersBuilder
 *
 */
public interface FunctionEnablers
    extends
    ChildOf<EquipmentG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.FunctionEnablers>,
    FunctionEnablersG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "function-enablers").intern();


}

