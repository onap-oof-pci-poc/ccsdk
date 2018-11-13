package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>microwave-model</b>
 * <pre>
 * grouping mw-current-problem-g {
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
 * <i>microwave-model/mw-current-problem-g</i>
 *
 */
public interface MwCurrentProblemG
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:microwave-model",
        "2017-03-24", "mw-current-problem-g").intern();

    /**
     * Unique sequence number of the current problem object.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>sequenceNumber</code>, or <code>null</code> if not present
     */
    java.lang.Integer getSequenceNumber();
    
    /**
     * Time and date of the problem. 
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime</code> <code>timeStamp</code>, or <code>null</code> if not present
     */
    DateAndTime getTimeStamp();
    
    /**
     * Severity of the alarm.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.microwave.model.rev170324.SeverityType</code> <code>problemSeverity</code>, or <code>null</code> if not present
     */
    SeverityType getProblemSeverity();

}

