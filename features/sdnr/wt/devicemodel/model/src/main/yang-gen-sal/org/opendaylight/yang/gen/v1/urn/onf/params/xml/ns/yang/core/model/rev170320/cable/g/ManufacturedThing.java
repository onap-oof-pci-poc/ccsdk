package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.cable.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ManufacturedThingG;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.CableG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * container manufactured-thing {
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
 *     uses manufactured-thing-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/cable-g/manufactured-thing</i>
 *
 * <p>To create instances of this class use {@link ManufacturedThingBuilder}.
 * @see ManufacturedThingBuilder
 *
 */
public interface ManufacturedThing
    extends
    ChildOf<CableG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.cable.g.ManufacturedThing>,
    ManufacturedThingG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "manufactured-thing").intern();


}

