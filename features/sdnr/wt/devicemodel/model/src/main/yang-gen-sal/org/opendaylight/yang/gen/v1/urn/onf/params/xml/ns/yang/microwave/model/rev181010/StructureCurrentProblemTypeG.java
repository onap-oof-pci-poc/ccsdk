package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping structure-current-problem-type-g {
 *     leaf problem-name {
 *         type problem-name;
 *     }
 *     leaf sequence-number {
 *         type int32;
 *     }
 *     leaf time-stamp {
 *         type time-stamp;
 *     }
 *     leaf problem-severity {
 *         type problem-severity;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>microwave-model/structure-current-problem-type-g</i>
 *
 */
public interface StructureCurrentProblemTypeG
    extends
    DataObject,
    MwCurrentProblemG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2018-10-10", "structure-current-problem-type-g").intern();

    /**
     * Name of the alarm according to Structure::StructureCapability::supportedAlarms
     *
     *
     *
     * @return <code>java.lang.String</code> <code>problemName</code>, or <code>null</code> if not present
     */
    java.lang.String getProblemName();

}

