package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.Connector;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ExpectedEquipment;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.MechanicalFeatures;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalProperties;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.Category;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ActualEquipment;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalRating;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.FunctionEnablers;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.MechanicalFunctions;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.Swapability;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ContainedHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ExposedCable;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.Location;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping equipment-g {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/equipment-g</i>
 *
 */
public interface EquipmentG
    extends
    DataObject,
    GlobalClassG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "equipment-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>connector</code>, or <code>null</code> if not present
     */
    List<Connector> getConnector();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>containedHolder</code>, or <code>null</code> if not present
     */
    List<ContainedHolder> getContainedHolder();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>exposedCable</code>, or <code>null</code> if not present
     */
    List<ExposedCable> getExposedCable();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ManufacturedThing</code> <code>manufacturedThing</code>, or <code>null</code> if not present
     */
    ManufacturedThing getManufacturedThing();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.SpatialPropertiesOfType</code> <code>spatialPropertiesOfType</code>, or <code>null</code> if not present
     */
    SpatialPropertiesOfType getSpatialPropertiesOfType();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.MechanicalFeatures</code> <code>mechanicalFeatures</code>, or <code>null</code> if not present
     */
    MechanicalFeatures getMechanicalFeatures();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalProperties</code> <code>physicalProperties</code>, or <code>null</code> if not present
     */
    PhysicalProperties getPhysicalProperties();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.FunctionEnablers</code> <code>functionEnablers</code>, or <code>null</code> if not present
     */
    FunctionEnablers getFunctionEnablers();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.MechanicalFunctions</code> <code>mechanicalFunctions</code>, or <code>null</code> if not present
     */
    MechanicalFunctions getMechanicalFunctions();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalCharacteristics</code> <code>physicalCharacteristics</code>, or <code>null</code> if not present
     */
    PhysicalCharacteristics getPhysicalCharacteristics();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.Swapability</code> <code>swapability</code>, or <code>null</code> if not present
     */
    Swapability getSwapability();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.Category</code> <code>category</code>, or <code>null</code> if not present
     */
    Category getCategory();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.PhysicalRating</code> <code>physicalRating</code>, or <code>null</code> if not present
     */
    PhysicalRating getPhysicalRating();
    
    /**
     * removed
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isFieldReplaceable</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsFieldReplaceable();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>functionBlock</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getFunctionBlock();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ExpectedEquipment</code> <code>expectedEquipment</code>, or <code>null</code> if not present
     */
    ExpectedEquipment getExpectedEquipment();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.ActualEquipment</code> <code>actualEquipment</code>, or <code>null</code> if not present
     */
    ActualEquipment getActualEquipment();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.equipment.g.Location</code> <code>location</code>, or <code>null</code> if not present
     */
    Location getLocation();

}

