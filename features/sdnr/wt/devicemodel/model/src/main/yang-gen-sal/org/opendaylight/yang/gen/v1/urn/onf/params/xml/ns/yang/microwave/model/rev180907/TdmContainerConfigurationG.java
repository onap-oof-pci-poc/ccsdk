package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.tdm.container.configuration.g.ProblemKindSeverityList;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.tdm.container.configuration.g.SegmentId;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.tdm.container.configuration.g.ContainerType;
import java.util.List;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping tdm-container-configuration-g {
 *     leaf container-id {
 *         type container-id;
 *     }
 *     container container-type {
 *         leaf tdm-container-name {
 *             type string;
 *         }
 *         leaf tdm-container-size {
 *             type tdm-container-size;
 *         }
 *         uses tdm-container-type-g;
 *     }
 *     container segment-id {
 *         leaf structure-id-ref {
 *             type universal-id;
 *         }
 *         leaf segment-id-ref {
 *             type int16;
 *         }
 *         uses segment-id-type-g;
 *     }
 *     leaf performance-monitoring-collection-is-on {
 *         type performance-monitoring-collection-is-on;
 *     }
 *     list problem-kind-severity-list {
 *         key "problem-kind-name";
 *         leaf problem-kind-name {
 *             type string;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *         uses container-problem-severity-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/tdm-container-configuration-g</i>
 *
 */
public interface TdmContainerConfigurationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-09-07", "tdm-container-configuration-g").intern();

    /**
     * ContainterID in Netconf must be the same as TDM Flow ID so a connection can be 
     * made between the two items, which separately exist in the controller.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>containerId</code>, or <code>null</code> if not present
     */
    java.lang.String getContainerId();
    
    /**
     * Type of TDM container.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.tdm.container.configuration.g.ContainerType</code> <code>containerType</code>, or <code>null</code> if not present
     */
    ContainerType getContainerType();
    
    /**
     * Multiplicity = 1; One segment per TDM container; Type of segment must match type
     * of container;
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev180907.tdm.container.configuration.g.SegmentId</code> <code>segmentId</code>, or <code>null</code> if not present
     */
    SegmentId getSegmentId();
    
    /**
     * Enables measurement, collection, storage and access to performance data.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>performanceMonitoringCollectionIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPerformanceMonitoringCollectionIsOn();
    
    /**
     * Severity of the problem to be configured.
     *
     *
     *
     * @return <code>java.util.List</code> <code>problemKindSeverityList</code>, or <code>null</code> if not present
     */
    List<ProblemKindSeverityList> getProblemKindSeverityList();

}

