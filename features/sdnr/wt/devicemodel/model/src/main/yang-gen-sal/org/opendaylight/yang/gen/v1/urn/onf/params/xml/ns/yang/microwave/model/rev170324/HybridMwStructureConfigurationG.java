package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.hybrid.mw.structure.configuration.g.ProblemKindSeverityList;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.hybrid.mw.structure.configuration.g.StructureType;
import java.util.List;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping hybrid-mw-structure-configuration-g {
 *     container structure-type {
 *         leaf tdm-structure-name {
 *             type tdm-structure-name;
 *         }
 *         leaf tdm-segment-size {
 *             type tdm-segment-size;
 *         }
 *         leaf max-number-of-segments-reservable {
 *             type max-number-of-segments-reservable;
 *         }
 *         uses tdm-structure-type-g;
 *     }
 *     leaf number-of-tdm-segments-to-be-reserved {
 *         type number-of-tdm-segments-to-be-reserved;
 *     }
 *     list problem-kind-severity-list {
 *         key "problem-kind-name";
 *         leaf problem-kind-name {
 *             type problem-kind-name;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *         uses structure-problem-severity-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/hybrid-mw-structure-configuration-g</i>
 *
 */
public interface HybridMwStructureConfigurationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "hybrid-mw-structure-configuration-g").intern();

    /**
     * TDM frame to be applied.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.hybrid.mw.structure.configuration.g.StructureType</code> <code>structureType</code>, or <code>null</code> if not present
     */
    StructureType getStructureType();
    
    /**
     * Allows to configure the number of segments reserved for TDM frames of the type 
     * specified in HybridMwStructure::HybridMwStructureConfiguration::structureType
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>numberOfTdmSegmentsToBeReserved</code>, or <code>null</code> if not present
     */
    java.lang.Short getNumberOfTdmSegmentsToBeReserved();
    
    /**
     * Severity of the type of problem to be configured.
     *
     *
     *
     * @return <code>java.util.List</code> <code>problemKindSeverityList</code>, or <code>null</code> if not present
     */
    List<ProblemKindSeverityList> getProblemKindSeverityList();

}

