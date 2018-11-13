package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.CableG;
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
 * list exposed-cable {
 *     key "uuid";
 *     list connector {
 *         key "uuid";
 *         leaf connector {
 *             type string;
 *         }
 *         list pin {
 *             key "position";
 *             leaf position {
 *                 type leafref;
 *             }
 *             leaf orientation {
 *                 type connector-and-pin-orientation;
 *             }
 *             uses pin-g;
 *         }
 *         leaf orientation {
 *             type connector-and-pin-orientation;
 *         }
 *         container manufactured-thing {
 *             container manufacturer-properties {
 *                 leaf manufacturer-identifier {
 *                     type string;
 *                 }
 *                 leaf manufacturer-name {
 *                     type string;
 *                 }
 *                 uses manufacturer-properties-g;
 *             }
 *             container equipment-type {
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf model-identifier {
 *                     type string;
 *                 }
 *                 leaf part-type-identifier {
 *                     type string;
 *                 }
 *                 leaf type-name {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 uses equipment-type-g;
 *             }
 *             container equipment-instance {
 *                 leaf manufacture-date {
 *                     type string;
 *                 }
 *                 leaf serial-number {
 *                     type string;
 *                 }
 *                 leaf asset-instance-identifier {
 *                     type string;
 *                 }
 *                 uses equipment-instance-g;
 *             }
 *             container operator-augmented-equipment-type {
 *                 leaf asset-type-identifier {
 *                     type string;
 *                 }
 *                 uses operator-augmented-equipment-type-g;
 *             }
 *             uses manufactured-thing-g;
 *         }
 *         container position {
 *             leaf relative-position {
 *                 type to-be-defined;
 *             }
 *             uses position-g;
 *         }
 *         container mechanical-features {
 *             uses mechanical-features-g;
 *         }
 *         container pin-layout {
 *             list position {
 *                 key "relative-position";
 *                 leaf relative-position {
 *                     type to-be-defined;
 *                 }
 *                 uses position-g;
 *             }
 *             uses pin-layout-g;
 *         }
 *         leaf connector-type {
 *             type to-be-defined;
 *         }
 *         list local-id {
 *             key "value-name";
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         leaf uuid {
 *             type universal-id;
 *         }
 *         list extension {
 *             key "value-name";
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         leaf operational-state {
 *             type operational-state;
 *         }
 *         leaf administrative-control {
 *             type administrative-control;
 *         }
 *         leaf administrative-state {
 *             type administrative-state;
 *         }
 *         leaf lifecycle-state {
 *             type lifecycle-state;
 *         }
 *         list name {
 *             key "value-name";
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         list label {
 *             key "value-name";
 *             leaf value-name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *             uses name-and-value-g;
 *         }
 *         uses connector-g;
 *     }
 *     container manufactured-thing {
 *         container manufacturer-properties {
 *             leaf manufacturer-identifier {
 *                 type string;
 *             }
 *             leaf manufacturer-name {
 *                 type string;
 *             }
 *             uses manufacturer-properties-g;
 *         }
 *         container equipment-type {
 *             leaf description {
 *                 type string;
 *             }
 *             leaf model-identifier {
 *                 type string;
 *             }
 *             leaf part-type-identifier {
 *                 type string;
 *             }
 *             leaf type-name {
 *                 type string;
 *             }
 *             leaf version {
 *                 type string;
 *             }
 *             uses equipment-type-g;
 *         }
 *         container equipment-instance {
 *             leaf manufacture-date {
 *                 type string;
 *             }
 *             leaf serial-number {
 *                 type string;
 *             }
 *             leaf asset-instance-identifier {
 *                 type string;
 *             }
 *             uses equipment-instance-g;
 *         }
 *         container operator-augmented-equipment-type {
 *             leaf asset-type-identifier {
 *                 type string;
 *             }
 *             uses operator-augmented-equipment-type-g;
 *         }
 *         uses manufactured-thing-g;
 *     }
 *     container physical-characteristics {
 *         leaf weight-characteristics {
 *             type to-be-defined;
 *         }
 *         leaf fire-characteristics {
 *             type to-be-defined;
 *         }
 *         leaf materials {
 *             type to-be-defined;
 *         }
 *         uses physical-characteristics-g;
 *     }
 *     container mechanical-features {
 *         uses mechanical-features-g;
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
 *     uses cable-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/equipment-g/exposed-cable</i>
 *
 * <p>To create instances of this class use {@link ExposedCableBuilder}.
 * @see ExposedCableBuilder
 * @see ExposedCableKey
 *
 */
public interface ExposedCable
    extends
    ChildOf<EquipmentG>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ExposedCable>,
    CableG,
    Identifiable<ExposedCableKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "exposed-cable").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ExposedCableKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ExposedCableKey getKey();

}

