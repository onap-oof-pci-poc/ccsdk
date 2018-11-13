package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.configuration.g.ProblemKindSeverityList;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.configuration.g.AirInterfaceDiversity;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping air-interface-diversity-configuration-g {
 *     container air-interface-diversity {
 *         leaf diversity-name {
 *             type diversity-name;
 *         }
 *         leaf number-of-air-interfaces-max {
 *             type number-of-air-interfaces-max;
 *         }
 *         uses diversity-type-g;
 *     }
 *     leaf-list air-interface-ltp-list {
 *         type leafref;
 *     }
 *     list problem-kind-severity-list {
 *         key "problem-kind-name";
 *         leaf problem-kind-name {
 *             type problem-kind-name;
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
        "2017-03-24", "air-interface-diversity-configuration-g").intern();

    /**
     * Type of air interface diversity configured at the link.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.air._interface.diversity.configuration.g.AirInterfaceDiversity</code> <code>airInterfaceDiversity</code>, or <code>null</code> if not present
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
     * Severity of the problem to be configured.
     *
     *
     *
     * @return <code>java.util.List</code> <code>problemKindSeverityList</code>, or <code>null</code> if not present
     */
    List<ProblemKindSeverityList> getProblemKindSeverityList();

}

