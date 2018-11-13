package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object class is an abstract class from which the OTN layer-specific 
 * CurrentData object classes are inherited. This object class is a subclass of 
 * Q.822 CurrentData object class, which in turn is a subclass of X.739 Scanner 
 * object class. It inherits the following attributes: scannerId, 
 * granularityPeriod, administrativeState, suspectIntervalFlag, elapsedTime, 
 * observedObjectClass, and observedObjectInstance.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>g.874.1-model</b>
 * <pre>
 * grouping otn-current-data-g {
 *     leaf timestamp {
 *         type date-and-time;
 *     }
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
 * <i>g.874.1-model/otn-current-data-g</i>
 *
 */
public interface OtnCurrentDataG
    extends
    DataObject,
    Q822CurrentDataG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:g.874.1-model",
        "2017-03-20", "otn-current-data-g").intern();

    /**
     * The timestamp associated with when the current data was collected.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320.DateAndTime</code> <code>timestamp</code>, or <code>null</code> if not present
     */
    DateAndTime getTimestamp();

}

