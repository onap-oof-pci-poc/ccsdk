package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * list equipment {
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
 *     list contained-holder {
 *         key "uuid";
 *         leaf-list connector {
 *             type leafref;
 *         }
 *         leaf occupying-fru {
 *             type leafref;
 *         }
 *         container spatial-properties-of-type {
 *             leaf height {
 *                 type to-be-defined;
 *             }
 *             leaf width {
 *                 type to-be-defined;
 *             }
 *             leaf length {
 *                 type to-be-defined;
 *             }
 *             uses spatial-properties-of-type-g;
 *         }
 *         container holder-monitors {
 *             leaf is-active {
 *                 type boolean;
 *             }
 *             leaf is-actual-mismatch-with-expected {
 *                 type boolean;
 *             }
 *             leaf aggregate-function {
 *                 type string;
 *             }
 *             uses holder-monitors-g;
 *         }
 *         container holder-location {
 *             leaf address-name {
 *                 type string;
 *             }
 *             list address-element {
 *                 key "uuid";
 *                 leaf address-element-name {
 *                     type string;
 *                 }
 *                 container local-id {
 *                     leaf class-of-instance {
 *                         type string;
 *                     }
 *                     container local-id {
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses local-id-and-class-g;
 *                 }
 *                 leaf uuid {
 *                     type universal-id;
 *                 }
 *                 container name {
 *                     leaf class-of-instance {
 *                         type string;
 *                     }
 *                     container name {
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses name-and-class-g;
 *                 }
 *                 leaf arbitrary-element {
 *                     type string;
 *                 }
 *                 uses address-element-g;
 *             }
 *             uses address-g;
 *         }
 *         container position {
 *             leaf relative-position {
 *                 type to-be-defined;
 *             }
 *             uses position-g;
 *         }
 *         container holder-structure {
 *             leaf holder-category {
 *                 type holder-category;
 *             }
 *             leaf is-captive {
 *                 type boolean;
 *             }
 *             leaf is-guided {
 *                 type boolean;
 *             }
 *             leaf is-quantized-space {
 *                 type boolean;
 *             }
 *             uses holder-structure-g;
 *         }
 *         container physical-rating {
 *             leaf thermal-rating {
 *                 type to-be-defined;
 *             }
 *             leaf power-rating {
 *                 type to-be-defined;
 *             }
 *             uses physical-rating-g;
 *         }
 *         leaf-list supported-equipment {
 *             type string;
 *         }
 *         container expected-holder {
 *             uses expected-holder-g;
 *         }
 *         container actual-holder {
 *             uses actual-holder-g;
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
 *         uses holder-g;
 *     }
 *     list exposed-cable {
 *         key "uuid";
 *         list connector {
 *             key "uuid";
 *             leaf connector {
 *                 type string;
 *             }
 *             list pin {
 *                 key "position";
 *                 leaf position {
 *                     type leafref;
 *                 }
 *                 leaf orientation {
 *                     type connector-and-pin-orientation;
 *                 }
 *                 uses pin-g;
 *             }
 *             leaf orientation {
 *                 type connector-and-pin-orientation;
 *             }
 *             container manufactured-thing {
 *                 container manufacturer-properties {
 *                     leaf manufacturer-identifier {
 *                         type string;
 *                     }
 *                     leaf manufacturer-name {
 *                         type string;
 *                     }
 *                     uses manufacturer-properties-g;
 *                 }
 *                 container equipment-type {
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf model-identifier {
 *                         type string;
 *                     }
 *                     leaf part-type-identifier {
 *                         type string;
 *                     }
 *                     leaf type-name {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     uses equipment-type-g;
 *                 }
 *                 container equipment-instance {
 *                     leaf manufacture-date {
 *                         type string;
 *                     }
 *                     leaf serial-number {
 *                         type string;
 *                     }
 *                     leaf asset-instance-identifier {
 *                         type string;
 *                     }
 *                     uses equipment-instance-g;
 *                 }
 *                 container operator-augmented-equipment-type {
 *                     leaf asset-type-identifier {
 *                         type string;
 *                     }
 *                     uses operator-augmented-equipment-type-g;
 *                 }
 *                 uses manufactured-thing-g;
 *             }
 *             container position {
 *                 leaf relative-position {
 *                     type to-be-defined;
 *                 }
 *                 uses position-g;
 *             }
 *             container mechanical-features {
 *                 uses mechanical-features-g;
 *             }
 *             container pin-layout {
 *                 list position {
 *                     key "relative-position";
 *                     leaf relative-position {
 *                         type to-be-defined;
 *                     }
 *                     uses position-g;
 *                 }
 *                 uses pin-layout-g;
 *             }
 *             leaf connector-type {
 *                 type to-be-defined;
 *             }
 *             list local-id {
 *                 key "value-name";
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             leaf uuid {
 *                 type universal-id;
 *             }
 *             list extension {
 *                 key "value-name";
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             leaf operational-state {
 *                 type operational-state;
 *             }
 *             leaf administrative-control {
 *                 type administrative-control;
 *             }
 *             leaf administrative-state {
 *                 type administrative-state;
 *             }
 *             leaf lifecycle-state {
 *                 type lifecycle-state;
 *             }
 *             list name {
 *                 key "value-name";
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             list label {
 *                 key "value-name";
 *                 leaf value-name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-and-value-g;
 *             }
 *             uses connector-g;
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
 *         container physical-characteristics {
 *             leaf weight-characteristics {
 *                 type to-be-defined;
 *             }
 *             leaf fire-characteristics {
 *                 type to-be-defined;
 *             }
 *             leaf materials {
 *                 type to-be-defined;
 *             }
 *             uses physical-characteristics-g;
 *         }
 *         container mechanical-features {
 *             uses mechanical-features-g;
 *         }
 *         container spatial-properties-of-type {
 *             leaf height {
 *                 type to-be-defined;
 *             }
 *             leaf width {
 *                 type to-be-defined;
 *             }
 *             leaf length {
 *                 type to-be-defined;
 *             }
 *             uses spatial-properties-of-type-g;
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
 *         uses cable-g;
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
 *     container mechanical-features {
 *         uses mechanical-features-g;
 *     }
 *     container physical-properties {
 *         leaf temperature {
 *             type to-be-defined;
 *         }
 *         uses physical-properties-g;
 *     }
 *     container function-enablers {
 *         leaf power-state {
 *             type to-be-defined;
 *         }
 *         uses function-enablers-g;
 *     }
 *     container mechanical-functions {
 *         leaf rotation-speed {
 *             type to-be-defined;
 *         }
 *         uses mechanical-functions-g;
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
 *     container swapability {
 *         leaf is-hot-swappable {
 *             type is-hot-swappable;
 *         }
 *         uses swapability-g;
 *     }
 *     container category {
 *         leaf category {
 *             type equipment-category;
 *         }
 *         uses category-g;
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
 *     leaf is-field-replaceable {
 *         type is-field-replaceable;
 *     }
 *     leaf-list function-block {
 *         type string;
 *     }
 *     container expected-equipment {
 *         uses expected-equipment-g;
 *     }
 *     container actual-equipment {
 *         uses actual-equipment-g;
 *     }
 *     container location {
 *         container equipment-location {
 *             leaf address-name {
 *                 type string;
 *             }
 *             list address-element {
 *                 key "uuid";
 *                 leaf address-element-name {
 *                     type string;
 *                 }
 *                 container local-id {
 *                     leaf class-of-instance {
 *                         type string;
 *                     }
 *                     container local-id {
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses local-id-and-class-g;
 *                 }
 *                 leaf uuid {
 *                     type universal-id;
 *                 }
 *                 container name {
 *                     leaf class-of-instance {
 *                         type string;
 *                     }
 *                     container name {
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses name-and-class-g;
 *                 }
 *                 leaf arbitrary-element {
 *                     type string;
 *                 }
 *                 uses address-element-g;
 *             }
 *             uses address-g;
 *         }
 *         container geographical-location {
 *             leaf address-name {
 *                 type string;
 *             }
 *             list address-element {
 *                 key "uuid";
 *                 leaf address-element-name {
 *                     type string;
 *                 }
 *                 container local-id {
 *                     leaf class-of-instance {
 *                         type string;
 *                     }
 *                     container local-id {
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses local-id-and-class-g;
 *                 }
 *                 leaf uuid {
 *                     type universal-id;
 *                 }
 *                 container name {
 *                     leaf class-of-instance {
 *                         type string;
 *                     }
 *                     container name {
 *                         leaf value-name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                         uses name-and-value-g;
 *                     }
 *                     uses name-and-class-g;
 *                 }
 *                 leaf arbitrary-element {
 *                     type string;
 *                 }
 *                 uses address-element-g;
 *             }
 *             uses address-g;
 *         }
 *         uses location-g;
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
 *     uses equipment-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/equipment</i>
 *
 * <p>To create instances of this class use {@link EquipmentBuilder}.
 * @see EquipmentBuilder
 * @see EquipmentKey
 *
 */
public interface Equipment
    extends
    ChildOf<CoreModelData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.Equipment>,
    EquipmentG,
    Identifiable<EquipmentKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "equipment").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.EquipmentKey</code> <code>key</code>, or <code>null</code> if not present
     */
    EquipmentKey getKey();

}

