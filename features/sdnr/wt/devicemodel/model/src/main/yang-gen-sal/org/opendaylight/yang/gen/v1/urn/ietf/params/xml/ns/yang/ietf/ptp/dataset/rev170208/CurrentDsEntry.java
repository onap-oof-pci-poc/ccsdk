package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Collection of members of current data set.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-ptp-dataset</b>
 * <pre>
 * grouping current-ds-entry {
 *     leaf steps-removed {
 *         type steps-removed;
 *     }
 *     leaf offset-from-master {
 *         type time-interval-type;
 *     }
 *     leaf mean-path-delay {
 *         type time-interval-type;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-ptp-dataset/current-ds-entry</i>
 *
 */
public interface CurrentDsEntry
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-ptp-dataset",
        "2017-02-08", "current-ds-entry").intern();

    /**
     * The number of communication paths traversedbetween the local clock and the 
     * grandmaster clock.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>stepsRemoved</code>, or <code>null</code> if not present
     */
    java.lang.Integer getStepsRemoved();
    
    /**
     * The current value of the time difference betweena master and a slave clock as 
     * computed by the slave.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimeIntervalType</code> <code>offsetFromMaster</code>, or <code>null</code> if not present
     */
    TimeIntervalType getOffsetFromMaster();
    
    /**
     * The current value of the mean propagation time betweena master and a slave clock
     * as computed by the slave.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.ptp.dataset.rev170208.TimeIntervalType</code> <code>meanPathDelay</code>, or <code>null</code> if not present
     */
    TimeIntervalType getMeanPathDelay();

}

