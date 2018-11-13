package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId;

/**
 * To be sent when a problem occurs at a MW_AirInterface_Pac, 
 * MW_AirInterfaceDiversity_Pac, MW_Structure_Pac, MW_PureEthernetStructure_Pac, 
 * MW_HybridMwStructure_Pac, MW_Container_Pac, MW_EthernetContainer_Pac or 
 * MW_TdmContainer_Pac.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping problem-notification-g {
 *     leaf counter {
 *         type counter;
 *     }
 *     leaf time-stamp {
 *         type time-stamp;
 *     }
 *     leaf object-id-ref {
 *         type universal-id;
 *     }
 *     leaf problem {
 *         type problem;
 *     }
 *     leaf severity {
 *         type severity;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/problem-notification-g</i>
 *
 */
public interface ProblemNotificationG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "problem-notification-g").intern();

    /**
     * Counts problem notifications
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>counter</code>, or <code>null</code> if not present
     */
    java.lang.Integer getCounter();
    
    /**
     * none
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>timeStamp</code>, or <code>null</code> if not present
     */
    DateAndTime getTimeStamp();
    
    /**
     * ID of the affected MW_AirInterface_Pac, MW_AirInterfaceDiversity_Pac, 
     * MW_Structure_Pac, MW_PureEthernetStructure_Pac, MW_HybridMwStructure_Pac, 
     * MW_Container_Pac, MW_EthernetContainer_Pac or MW_TdmContainer_Pac.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.core.model.rev170320.UniversalId</code> <code>objectIdRef</code>, or <code>null</code> if not present
     */
    UniversalId getObjectIdRef();
    
    /**
     * Name of the problem according to 
     * AirInterface::AirInterfaceCapability::supportedAlarms or 
     * AirInterfaceDiversity::AirInterfaceDiversityCapability::supportedAlarms or 
     * Structure::StructureCapability::supportedAlarms or 
     * PureEthernetStructure::PureEthernetStructureCapability::supportedAlarms or 
     * HybridMwStructure::HybridMwStructureCapability::supportedAlarms or 
     * Container::ContainerCapability::supportedAlarms or 
     * EthernetContainer::EthernetContainerCapability::supportedAlarms or 
     * TdmContainer::TdmContainerCapability::supportedAlarms.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>problem</code>, or <code>null</code> if not present
     */
    java.lang.String getProblem();
    
    /**
     * Severity of the problem according to 
     * AirInterface::AirInterfaceConfiguration::problemSeverityList, 
     * AirInterfaceDiversity::AirInterfaceDiversityConfiguration::problemSeverityList, 
     * Structure::StructureConfiguration::problemSeverityList, 
     * PureEthernetStructure::PureEthernetStructureConfiguration::problemSeverityList, 
     * HybridMwStructure::HybridMwStructureConfiguration::problemSeverityList, 
     * Container::ContainerConfiguration::problemSeverityList, 
     * EthernetContainer::EthernetContainerConfiguration::problemSeverityList or 
     * TdmContainer::TdmContainerConfiguration::problemSeverityList
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.SeverityType</code> <code>severity</code>, or <code>null</code> if not present
     */
    SeverityType getSeverity();

}

