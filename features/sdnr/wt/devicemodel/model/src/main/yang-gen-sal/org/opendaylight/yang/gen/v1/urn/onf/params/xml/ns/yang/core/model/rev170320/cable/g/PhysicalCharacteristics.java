package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.cable.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.CableG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.PhysicalCharacteristicsG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container physical-characteristics {
 *     leaf weight-characteristics {
 *         type to-be-defined;
 *     }
 *     leaf fire-characteristics {
 *         type to-be-defined;
 *     }
 *     leaf materials {
 *         type to-be-defined;
 *     }
 *     uses physical-characteristics-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/cable-g/physical-characteristics</i>
 *
 * <p>To create instances of this class use {@link PhysicalCharacteristicsBuilder}.
 * @see PhysicalCharacteristicsBuilder
 *
 */
public interface PhysicalCharacteristics
    extends
    ChildOf<CableG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.cable.g.PhysicalCharacteristics>,
    PhysicalCharacteristicsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "physical-characteristics").intern();


}

