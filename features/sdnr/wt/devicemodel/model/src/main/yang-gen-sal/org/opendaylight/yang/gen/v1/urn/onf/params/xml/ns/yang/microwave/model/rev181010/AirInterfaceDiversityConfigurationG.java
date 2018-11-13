package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ProblemKindSeverityList;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.ThresholdCrossAlarmList;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-diversity-configuration-g {
 *     container air-interface-diversity {
 *         leaf diversity-name {
 *             type string;
 *         }
 *         leaf number-of-air-interfaces-max {
 *             type number-of-air-interfaces-max;
 *         }
 *         uses diversity-type-g;
 *     }
 *     leaf-list air-interface-ltp-list {
 *         type leafref;
 *     }
 *     leaf performance-monitoring-collection-is-on {
 *         type performance-monitoring-collection-is-on;
 *     }
 *     list threshold-cross-alarm-list {
 *         key "g826-value-kind" "granularity-period";
 *         leaf g826-value-kind {
 *             type g826-type;
 *         }
 *         leaf granularity-period {
 *             type granularity-period-type;
 *         }
 *         leaf alarm-raising-threshold {
 *             type alarm-raising-threshold;
 *         }
 *         leaf alarm-clearing-threshold {
 *             type alarm-clearing-threshold;
 *         }
 *         uses threshold-cross-alarm-type-g;
 *     }
 *     list problem-kind-severity-list {
 *         key "problem-kind-name";
 *         leaf problem-kind-name {
 *             type string;
 *         }
 *         leaf problem-kind-severity {
 *             type problem-kind-severity;
 *         }
 *         uses air-interface-diversity-problem-severity-type-g;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/air-interface-diversity-configuration-g</i>
 *
 */
public interface AirInterfaceDiversityConfigurationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "air-interface-diversity-configuration-g").intern();

    /**
     * Type of air interface diversity configured at the link.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.air._interface.diversity.configuration.g.AirInterfaceDiversity</code> <code>airInterfaceDiversity</code>, or <code>null</code> if not present
     */
    AirInterfaceDiversity getAirInterfaceDiversity();
    
    /**
     * _multiplicity:2-ThisAirInterfaceDiversity::AirInterfaceDiversityConfiguration::airInterfaceDiversity::diversityType::numberOfAirInterfacesMax
     *
     *
     *
     * @return <code>java.util.List</code> <code>airInterfaceLtpList</code>, or <code>null</code> if not present
     */
    List<UniversalId> getAirInterfaceLtpList();
    
    /**
     * Enables measurement, collection, storage and access to performance data.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>performanceMonitoringCollectionIsOn</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPerformanceMonitoringCollectionIsOn();
    
    /**
     * List of threshold cross alarms to be configured.
     *
     *
     *
     * @return <code>java.util.List</code> <code>thresholdCrossAlarmList</code>, or <code>null</code> if not present
     */
    List<ThresholdCrossAlarmList> getThresholdCrossAlarmList();
    
    /**
     * Severity of the problem to be configured.
     *
     *
     *
     * @return <code>java.util.List</code> <code>problemKindSeverityList</code>, or <code>null</code> if not present
     */
    List<ProblemKindSeverityList> getProblemKindSeverityList();

}

