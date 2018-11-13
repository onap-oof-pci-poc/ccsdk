package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * none
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>g.874.1-model</b>
 * <pre>
 * grouping q.822-current-data-g {
 *     leaf suspect-interval-flag {
 *         type boolean;
 *     }
 *     leaf elapsed-time {
 *         type int64;
 *     }
 *     leaf scanner-id {
 *         type string;
 *     }
 *     leaf granularity-period {
 *         type granularity-period-type;
 *     }
 *     leaf administrative-state {
 *         type administrative-state;
 *     }
 *     leaf object-class {
 *         type object-identifier;
 *     }
 *     leaf name-binding {
 *         type object-identifier;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>g.874.1-model/q.822-current-data-g</i>
 *
 */
public interface Q822CurrentDataG
    extends
    DataObject,
    X739ScannerG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:g.874.1-model",
        "2017-03-20", "q.822-current-data-g").intern();

    /**
     * This attribute is used to indicate that the performance data for the current 
     * period may not be reliable. Some reasons for this to occur are:- Suspect data 
     * were detected by the actual resource doing data collection.- Transition of the 
     * administrativeState attribute to/from the 'lock' state.- Transition of the 
     * operationalState to/from the 'disabled' state.- Scheduler setting that inhibits 
     * the collection function.- The performance counters were reset during the 
     * interval.- The currentData (or subclass) object instance was created during the 
     * monitoring period.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>suspectIntervalFlag</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isSuspectIntervalFlag();
    
    /**
     * none
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>elapsedTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getElapsedTime();

}

