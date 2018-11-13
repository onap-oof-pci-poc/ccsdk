package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ActualHolder;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.Position;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.SpatialPropertiesOfType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderLocation;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.PhysicalRating;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder;

/**
 * removed
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>core-model</b>
 * <pre>
 * grouping holder-g {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>core-model/holder-g</i>
 *
 */
public interface HolderG
    extends
    DataObject,
    LocalClassG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:core-model",
        "2017-03-20", "holder-g").intern();

    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>connector</code>, or <code>null</code> if not present
     */
    List<UniversalId> getConnector();
    
    /**
     * removed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>occupyingFru</code>, or <code>null</code> if not present
     */
    UniversalId getOccupyingFru();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.SpatialPropertiesOfType</code> <code>spatialPropertiesOfType</code>, or <code>null</code> if not present
     */
    SpatialPropertiesOfType getSpatialPropertiesOfType();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderMonitors</code> <code>holderMonitors</code>, or <code>null</code> if not present
     */
    HolderMonitors getHolderMonitors();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderLocation</code> <code>holderLocation</code>, or <code>null</code> if not present
     */
    HolderLocation getHolderLocation();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.Position</code> <code>position</code>, or <code>null</code> if not present
     */
    Position getPosition();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.HolderStructure</code> <code>holderStructure</code>, or <code>null</code> if not present
     */
    HolderStructure getHolderStructure();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.PhysicalRating</code> <code>physicalRating</code>, or <code>null</code> if not present
     */
    PhysicalRating getPhysicalRating();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedEquipment</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getSupportedEquipment();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ExpectedHolder</code> <code>expectedHolder</code>, or <code>null</code> if not present
     */
    ExpectedHolder getExpectedHolder();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.holder.g.ActualHolder</code> <code>actualHolder</code>, or <code>null</code> if not present
     */
    ActualHolder getActualHolder();

}

