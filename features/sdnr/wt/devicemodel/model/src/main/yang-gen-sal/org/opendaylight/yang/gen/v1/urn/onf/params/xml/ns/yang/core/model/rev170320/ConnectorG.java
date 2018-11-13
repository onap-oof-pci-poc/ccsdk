package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.MechanicalFeatures;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.Pin;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.PinLayout;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.Position;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.ManufacturedThing;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping connector-g {
 *     leaf connector {
 *         type string;
 *     }
 *     list pin {
 *         key "position";
 *         leaf position {
 *             type leafref;
 *         }
 *         leaf orientation {
 *             type connector-and-pin-orientation;
 *         }
 *         uses pin-g;
 *     }
 *     leaf orientation {
 *         type connector-and-pin-orientation;
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
 *     container position {
 *         leaf relative-position {
 *             type to-be-defined;
 *         }
 *         uses position-g;
 *     }
 *     container mechanical-features {
 *         uses mechanical-features-g;
 *     }
 *     container pin-layout {
 *         list position {
 *             key "relative-position";
 *             leaf relative-position {
 *                 type to-be-defined;
 *             }
 *             uses position-g;
 *         }
 *         uses pin-layout-g;
 *     }
 *     leaf connector-type {
 *         type to-be-defined;
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/connector-g</i>
 *
 */
public interface ConnectorG
    extends
    DataObject,
    LocalClassG,
    GroupOfPinsG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "connector-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.lang.String</code> <code>connector</code>, or <code>null</code> if not present
     */
    java.lang.String getConnector();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>pin</code>, or <code>null</code> if not present
     */
    List<Pin> getPin();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ConnectorAndPinOrientation</code> <code>orientation</code>, or <code>null</code> if not present
     */
    ConnectorAndPinOrientation getOrientation();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.ManufacturedThing</code> <code>manufacturedThing</code>, or <code>null</code> if not present
     */
    ManufacturedThing getManufacturedThing();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.Position</code> <code>position</code>, or <code>null</code> if not present
     */
    Position getPosition();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.MechanicalFeatures</code> <code>mechanicalFeatures</code>, or <code>null</code> if not present
     */
    MechanicalFeatures getMechanicalFeatures();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.connector.g.PinLayout</code> <code>pinLayout</code>, or <code>null</code> if not present
     */
    PinLayout getPinLayout();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.ToBeDefined</code> <code>connectorType</code>, or <code>null</code> if not present
     */
    ToBeDefined getConnectorType();

}

