package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.onf.core.model.conditional.packages.rev170402;
import org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev181010.MwCurrentProblemG;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>onf-core-model-conditional-packages</b>
 * <pre>
 * grouping network-element-current-problem-type-g {
 *     leaf problem-name {
 *         type problem-name;
 *     }
 *     leaf object-reference {
 *         type string;
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
 * <i>onf-core-model-conditional-packages/network-element-current-problem-type-g</i>
 *
 */
public interface NetworkElementCurrentProblemTypeG
    extends
    DataObject,
    MwCurrentProblemG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:onf-core-model-conditional-packages",
        "2017-04-02", "network-element-current-problem-type-g").intern();

    /**
     * Name of the alarm according capability::supportedAlarms.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>problemName</code>, or <code>null</code> if not present
     */
    java.lang.String getProblemName();
    
    /**
     * An explaining string of the related object class. This is necesseary, because 
     * the current problem list of the NetworkElement object class acts as a container 
     * for all alarms, where its object classes are not modeled.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>objectReference</code>, or <code>null</code> if not present
     */
    java.lang.String getObjectReference();

}

