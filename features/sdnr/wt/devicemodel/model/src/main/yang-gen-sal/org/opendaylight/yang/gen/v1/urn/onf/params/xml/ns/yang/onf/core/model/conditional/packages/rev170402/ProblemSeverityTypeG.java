package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SeverityType;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * grouping problem-severity-type-g {
 *     leaf problem-type-name {
 *         type string;
 *     }
 *     leaf problem-type-severity {
 *         type severity-type;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>onf-core-model-conditional-packages/problem-severity-type-g</i>
 *
 */
public interface ProblemSeverityTypeG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "problem-severity-type-g").intern();

    /**
     * Name of the alarm according to Capability::supportedAlarms
     *
     *
     *
     * @return <code>java.lang.String</code> <code>problemTypeName</code>, or <code>null</code> if not present
     */
    java.lang.String getProblemTypeName();
    
    /**
     * Severity of this type of alarm.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.SeverityType</code> <code>problemTypeSeverity</code>, or <code>null</code> if not present
     */
    SeverityType getProblemTypeSeverity();

}

