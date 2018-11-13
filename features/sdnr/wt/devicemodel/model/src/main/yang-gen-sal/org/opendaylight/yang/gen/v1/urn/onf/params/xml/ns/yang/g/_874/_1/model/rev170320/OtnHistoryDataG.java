package org.opendaylight.yang.gen.v1.urn.onf.params.xml.ns.yang.g._874._1.model.rev170320;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This object class is an abstract class from which the OTN layer-specific 
 * HistoryData object classes are inherited. 
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>g.874.1-model</b>
 * <pre>
 * grouping otn-history-data-g {
 *     leaf suspect-interval-flag {
 *         type suspect-interval-flag;
 *     }
 *     leaf history-data-id {
 *         type string;
 *     }
 *     leaf period-end-time {
 *         type date-and-time;
 *     }
 *     leaf granularity-period {
 *         type granularity-period-type;
 *     }
 *     leaf object-class {
 *         type object-identifier;
 *     }
 *     leaf name-binding {
 *         type object-identifier;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>g.874.1-model/otn-history-data-g</i>
 *
 */
public interface OtnHistoryDataG
    extends
    DataObject,
    Q822HistoryDataG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:params:xml:ns:yang:g.874.1-model",
        "2017-03-20", "otn-history-data-g").intern();

    /**
     * This attribute indicates that the data collected during the interval is suspect.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>suspectIntervalFlag</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isSuspectIntervalFlag();

}

