package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.HolderG;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentG;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * list contained-holder {
 *     key "uuid";
 *     leaf-list connector {
 *         type leafref;
 *     }
 *     leaf occupying-fru {
 *         type leafref;
 *     }
 *     container spatial-properties-of-type {
 *         leaf height {
 *             type to-be-defined;
 *         }
 *         leaf width {
 *             type to-be-defined;
 *         }
 *         leaf length {
 *             type to-be-defined;
 *         }
 *         uses spatial-properties-of-type-g;
 *     }
 *     container holder-monitors {
 *         leaf is-active {
 *             type boolean;
 *         }
 *         leaf is-actual-mismatch-with-expected {
 *             type boolean;
 *         }
 *         leaf aggregate-function {
 *             type string;
 *         }
 *         uses holder-monitors-g;
 *     }
 *     container holder-location {
 *         leaf address-name {
 *             type string;
 *         }
 *         list address-element {
 *             key "uuid";
 *             leaf address-element-name {
 *                 type string;
 *             }
 *             container local-id {
 *                 leaf class-of-instance {
 *                     type string;
 *                 }
 *                 container local-id {
 *                     leaf value-name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                     uses name-and-value-g;
 *                 }
 *                 uses local-id-and-class-g;
 *             }
 *             leaf uuid {
 *                 type universal-id;
 *             }
 *             container name {
 *                 leaf class-of-instance {
 *                     type string;
 *                 }
 *                 container name {
 *                     leaf value-name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                     uses name-and-value-g;
 *                 }
 *                 uses name-and-class-g;
 *             }
 *             leaf arbitrary-element {
 *                 type string;
 *             }
 *             uses address-element-g;
 *         }
 *         uses address-g;
 *     }
 *     container position {
 *         leaf relative-position {
 *             type to-be-defined;
 *         }
 *         uses position-g;
 *     }
 *     container holder-structure {
 *         leaf holder-category {
 *             type holder-category;
 *         }
 *         leaf is-captive {
 *             type boolean;
 *         }
 *         leaf is-guided {
 *             type boolean;
 *         }
 *         leaf is-quantized-space {
 *             type boolean;
 *         }
 *         uses holder-structure-g;
 *     }
 *     container physical-rating {
 *         leaf thermal-rating {
 *             type to-be-defined;
 *         }
 *         leaf power-rating {
 *             type to-be-defined;
 *         }
 *         uses physical-rating-g;
 *     }
 *     leaf-list supported-equipment {
 *         type string;
 *     }
 *     container expected-holder {
 *         uses expected-holder-g;
 *     }
 *     container actual-holder {
 *         uses actual-holder-g;
 *     }
 *     list local-id {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     leaf uuid {
 *         type universal-id;
 *     }
 *     list extension {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     leaf operational-state {
 *         type operational-state;
 *     }
 *     leaf administrative-control {
 *         type administrative-control;
 *     }
 *     leaf administrative-state {
 *         type administrative-state;
 *     }
 *     leaf lifecycle-state {
 *         type lifecycle-state;
 *     }
 *     list name {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     list label {
 *         key "value-name";
 *         leaf value-name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-and-value-g;
 *     }
 *     uses holder-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/equipment-g/contained-holder</i>
 *
 * <p>To create instances of this class use {@link ContainedHolderBuilder}.
 * @see ContainedHolderBuilder
 * @see ContainedHolderKey
 *
 */
public interface ContainedHolder
    extends
    ChildOf<EquipmentG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder>,
    HolderG,
    Identifiable<ContainedHolderKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "contained-holder").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolderKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ContainedHolderKey getKey();

}

