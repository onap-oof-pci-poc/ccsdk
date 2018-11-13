package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping container-problem-severity-type-g {
 *     leaf problem-kind-name {
 *         type problem-kind-name;
 *     }
 *     leaf problem-kind-severity {
 *         type problem-kind-severity;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/container-problem-severity-type-g</i>
 *
 */
public interface ContainerProblemSeverityTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "container-problem-severity-type-g").intern();

    /**
     * Name of the alarm according to Container::ContainerCapability::supportedAlarms
     *
     *
     *
     * @return <code>java.lang.String</code> <code>problemKindName</code>, or <code>null</code> if not present
     */
    java.lang.String getProblemKindName();
    
    /**
     * Severity of this type of alarm.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.SeverityType</code> <code>problemKindSeverity</code>, or <code>null</code> if not present
     */
    SeverityType getProblemKindSeverity();

}

